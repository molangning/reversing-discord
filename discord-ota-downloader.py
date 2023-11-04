#!/bin/python3

from bs4 import BeautifulSoup
import requests
import json
import re
from decimal import Decimal
from urllib.parse import unquote
from hashlib import md5
from os import path
from os import makedirs
from time import sleep

# From discord.client_info.ClientInfo.init
# Does it even matter if we use this ua string??
DISCORD_UA = "Discord-Android/%s;RNA"
GOOGLE_APP_STORE_URL = "https://play.google.com/store/apps/details?id=com.discord"
APPLE_APP_STORE_URL = "https://apps.apple.com/app/discord-chat-talk-hangout/id985746746"
MANIFEST_URL = "https://discord.com/%s/%s/manifest.json"
ASSET_URL = "https://discord.com/assets/%s/%s/%s"

def clean_exit():
    print("Exiting...")
    exit()

# Wrapper function
def requests_with_ua(url, ua=""):
    if len(ua) > 0:
        headers = {
        "User-Agent": ua
        }
    else:
        headers={}
    r = requests.get(url, headers=headers)
    if r.status_code != 200:
        return (r.status_code, "")
    return (200, r.text)

# Another wrapper, it's probably better for me to create a class but meh.
def get_manifest_file(os_type, version):
    return requests_with_ua(MANIFEST_URL%(os_type, version), DISCORD_UA%(version))

def download_file_stream(url,path,headers):
    download_done = False
    # Not stopping until we get all of 'em
    while not download_done:
        
        with requests.get(url, headers=headers, stream=True) as r:
            # print("[+] Downloading %s"%(download_url))
            if r.status_code != 200:
                print("[!] Sleeping for a few seconds as we have hit a %s"%(r.status_code))
                sleep(2.5)
                break
            
            with open(path,'wb') as f:
                for chunk in r.iter_content(chunk_size=8192):
                    f.write(chunk)
            download_done = True

    # Sleep for a while to prevent rate limits
    sleep(0.05)

def download_ota(base_path, manifest, ua, os_type):
    
    print("[+] Checking regular files...")
    manifest_keys = list(manifest.keys())

    if "metadata" not in manifest_keys:
        print("[!] Error, metadata field not in manifest")
        clean_exit()
    metadata = manifest["metadata"]
    
    if "commit" not in manifest["metadata"].keys():
        print("[!] Error, commit not in metadata")
        clean_exit()
    commit = metadata["commit"]
    
    if "hashes" not in manifest_keys:
        print("[!] Error, hashes field not in manifest")
        clean_exit()
    hashes = manifest["hashes"]

    if "patches" not in manifest_keys:
        print("[!] Warning, patches field not in manifest")
        patches={}
    else:
        patches=manifest["patches"]

    for i,v in hashes.items():
        output_path = i
        if output_path.endswith("/"):
            output_path = output_path[:-1]
        
        if os_type == "android":
            if not i.startswith("app/src/main/"):
                print("[!] skipping %s as it does not start with app/src/main/"%(i))
                continue
            output_path = output_path[13:]
        output_path = path.join(base_path,output_path)

        if "/.." in v or "\.." in v:
            print("[!] skipping %s as it may allow directory traversal attacks"%(i))
            continue

        
        output_dir="/".join(output_path.split('/')[:-1])
        if not output_dir:
            output_dir="."
            
        if not path.isdir(output_dir):
            print("[+] Creating directory %s"%(output_dir))
            makedirs(output_dir)

        if path.isfile(output_path):
            if md5(open(output_path,"rb").read()).hexdigest() == v:
                continue
            else:
                print("[!] Hash mismatch: %s"%(output_path))
        else:
            print("[!] Missing file: %s"%(output_path))

        headers = {
            "User-Agent": ua
            }

        download_url = ASSET_URL%(os_type, commit, i)
        download_file_stream(download_url, output_path, headers)

    print("[+] Regular files check done!")
    print("[+] Checking patches...")

    for i,v in patches.items():
        output_path = v
        if output_path.endswith("/"):
            output_path = output_path[:-1]
        
        if os_type == "android":
            if not v.startswith("app/src/main/"):
                print("[!] skipping %s as it does not start with app/src/main/"%(v))
                continue
            output_path = output_path[13:]
        output_path = path.join(base_path,output_path)
        
        if "/.." in v or "\.." in v:
            print("[!] skipping %s as it may allow directory traversal attacks"%(v))
            continue

        
        output_dir="/".join(output_path.split('/')[:-1])
        if not output_dir:
            output_dir="."
            
        if not path.isdir(output_dir):
            print("[!] Creating directory %s"%(output_dir))
            makedirs(output_dir)

        headers = {
            "User-Agent": ua
            }
        
        print("[+] Downloading %s"%(v))
        download_url = ASSET_URL%(os_type, commit, v)
        download_file_stream(download_url, output_path, headers)


print("[+] Getting most popular User Agents...")

status_code, req_content = requests_with_ua("https://www.useragents.me/api")

if status_code != 200:
    print("[!] useragents.me returned a non 200 status code!")
    print("[!] Expected 200 status code, got %i instead"%(status_code))
    clean_exit()

try:
    UA_dict=json.loads(req_content)
except Exception as e:
    print("[!] Error decoding UA list!")
    clean_exit()

best_user_agent = UA_dict["data"][0]['ua']

# Screw this hack. If it crashes it's def on me
# ik I can return the first one, but idk if it will change
# So this piece of code searches through the entire page

print("[+] Getting discord's version on Google play store")
status_code, req_content = requests_with_ua(GOOGLE_APP_STORE_URL, best_user_agent)

if status_code != 200:
    print("[!] Google play store returned a non 200 status code!")
    print("[!] Expected 200 status code, got %i instead"%(status_code))
    clean_exit()

android_versions = re.findall(r"\"[0-9]*\.[0-9]* - Stable\"", req_content)
LATEST_ANDROID_VERSION = Decimal("0.0")

for i in android_versions:
    version = i[1:-1]
    version = version.replace(" - Stable","")
    version = version.strip() # Just in case something went wonky

    # Check if version is float with regex before we blow ourselves sky high trying to convert it into decimal
    if not re.match("^[0-9]*\.[0-9]*$", version):
        continue
    
    try:
        # We use the decimal library as floating point arithmetic gets quirky 
        version = Decimal(version)
        if version > LATEST_ANDROID_VERSION:
            LATEST_ANDROID_VERSION = version
    except:
        # how did you trigger this bruh
        print("[!] Error in converting version string %s to decimal"%(i))

# Change the type
LATEST_ANDROID_VERSION = str(LATEST_ANDROID_VERSION)

print("[+] Got latest android release: %s"%(LATEST_ANDROID_VERSION))

status_code, req_content = get_manifest_file("android", LATEST_ANDROID_VERSION)

if status_code != 200:
    print("[!] Discord returned a non 200 status code for android manifest.json")
    clean_exit()

try:
    android_manifest = json.loads(req_content)
except Exception as e:
    print("[!] Error decoding Android manifest.json!")
    clean_exit()

print("[+] Starting android ota checks")
download_ota("ota/android", android_manifest, LATEST_ANDROID_VERSION, "android")
print("[+] Finished android ota checks!")

# if "202".isdigit()

print("[+] Getting discord's version on Apple app store")
status_code, req_content = requests_with_ua(APPLE_APP_STORE_URL, best_user_agent)

if status_code != 200:
    print("[!] Apple app store returned a non 200 status code!")
    print("[!] Expected 200 status code, got %i instead"%(status_code))
    clean_exit()

soup = BeautifulSoup(req_content, "html.parser")
version = soup.find("p",{"class":"whats-new__latest__version"}).string

if len(version) == 0:
    print("[!] Version string can't be found")
    print("[!] Don't worry, this is normal. It means Apple changed their dom.")
    print("[!] Submit a issue on github to let me know!")
    clean_exit()

if not version.startswith("Version "):
    print("[!] Got a invalid version string from Apple app store")
    print("[!] Got %s"%(version))
    clean_exit()

version = version[8:]

if version.isdigit():
    version+=".0"

if not re.match("^[0-9]*\.[0-9]*$", version):
    print("[!] Version number is not a decimal!")
    print("[!] Got: %s"%(version))
LATEST_IOS_VERSION = version

print("[+] Got latest iOS release: %s"%(LATEST_IOS_VERSION))

status_code, req_content = get_manifest_file("ios", LATEST_IOS_VERSION)

if status_code != 200:
    print("[!] Discord returned a non 200 status code for ios manifest.json")
    clean_exit()

try:
    ios_manifest = json.loads(req_content)
except Exception as e:
    print("[!] Error decoding ios manifest.json!")
    clean_exit()

print("[+] Starting iOS ota checks")
download_ota("ota/ios", ios_manifest, LATEST_IOS_VERSION, "ios")
print("[+] Finished iOS ota checks!")
