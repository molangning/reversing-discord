# decompiled-discord-apk
This repository is dedicated to the reverse engineering of the discord mobile app for android. You are welcome to use my repository as reference and help. Pull requests regarding readability and documentation are always welcome!


## Targeted APIs
APIs relating to find your friends, basically replicating https://osint.industries/ find discord user by phone number

## Folder structure

The apk files(base.apk,config.XXXXX.apk) are downloaded from third party sources
`extracted` directory contains source code decompiled with jadx-gui
manifest.json was retrieved from discord with the version number of 201.13, if you want to access the files you should replace `app/src/main/...` with `apk/extracted/_base.apk/...`

## Notes and details

### Getting manifest.json

#### iOS

`https://discord.com/ios/202.0/manifest.json`

#### Android

`https://discord.com/android/201.13/manifest.json`

### Downloading OTA files

From downloadOtaFiles in Android version, the uri for the files should https://discord.com/assets/OS_NAME/COMMIT/FILE

#### Android

For this repository, it is https://discord.com/assets/android/24265e61aa4e5090b6b9f9689cb852aa7d744fa7/app/src/main/assets/index.android.bundle.patch
This works too https://discord.com/assets/android/24265e61aa4e5090b6b9f9689cb852aa7d744fa7/app/src/main/res/raw/node_modules_discordapp_tokens_typography_generated_notosans_notosans700bold.ttf
Url according to the generator in the class 
https://discord.com/assets/android/24265e61aa4e5090b6b9f9689cb852aa7d74app%2Fsrc%2Fmain%2Fres%2Fraw%2Fnode_modules_discordapp_tokens_typography_generated_notosans_notosans700bold.ttfd.ttf

## Interesting contents

Manifest.json contains a `patches` field that may sometimes be left blank
For now the latest file can be found here
`apk/extracted/_base.apk/assets/index.android.bundle`
Targeted functionality should be found here, will write a script that gets latest patch

type of file: `Hermes JavaScript bytecode, version 94`
referred as ANDROID_JS_BUNDLE in code

## Interesting strings and functions

### Gets latest manifest.json file from discord

```java

private static final Uri BASE_OTA_URI = new Uri.Builder().scheme("https").authority("discord.com").build();
// Should return https://discord.com
......

private final String getManifestURL() {
    String uri = BASE_OTA_URI.buildUpon().appendPath("android").appendPath(getVersion()).appendPath("manifest.json").build().toString();
    // Should return https://discord.com/android/VERSION/manifest.json
    // Found https://discord.com/android/90.0/manifest.json through searching google
    // https://discord.com/android/201.13/manifest.json works(current app version on google)
    C9612q.m13918g(uri, "BASE_OTA_URI\n           …)\n            .toString()");
    return uri;
}

```

### Android nearby api key. May be useful for spamming

```xml
<meta-data android:name="com.google.android.nearby.messages.API_KEY" android:value="AIzaSyD-4L6bgKMixqBRtrG2UktVXK6IexXlsog"/>
```

### Intent filter for discord domains. Should open urls in discord.

```xml
<intent-filter android:autoVerify="true">
    <action android:name="android.intent.action.VIEW"/>
    <category android:name="android.intent.category.DEFAULT"/>
    <category android:name="android.intent.category.BROWSABLE"/>
    <data android:scheme="https" android:host="*.discord.com" android:pathPattern="/app"/>
    <data android:scheme="https" android:host="discord.com" android:pathPattern="/app"/>
    <data android:scheme="https" android:host="*.discord.com" android:pathPattern="/gifts/.*"/>
    <data android:scheme="https" android:host="discord.com" android:pathPattern="/gifts/.*"/>
    <data android:scheme="https" android:host="*.discord.com" android:pathPattern="/invite/.*"/>
    <data android:scheme="https" android:host="discord.com" android:pathPattern="/invite/.*"/>
    <data android:scheme="https" android:host="*.discord.com" android:pathPattern="/template/.*"/>
    <data android:scheme="https" android:host="discord.com" android:pathPattern="/template/.*"/>
    <data android:scheme="https" android:host="*.discord.com" android:pathPattern="/channels/.*"/>
    <data android:scheme="https" android:host="discord.com" android:pathPattern="/channels/.*"/>
    <data android:scheme="https" android:host="*.discord.com" android:pathPattern="/users/.*"/>
    <data android:scheme="https" android:host="discord.com" android:pathPattern="/users/.*"/>
    <data android:scheme="https" android:host="*.discord.com" android:pathPattern="/feature/.*"/>
    <data android:scheme="https" android:host="discord.com" android:pathPattern="/feature/.*"/>
    <data android:scheme="https" android:host="discord.com" android:pathPattern="/query/.*"/>
    <data android:scheme="https" android:host="*.discord.com" android:pathPattern="/query/.*"/>
    <data android:scheme="https" android:host="discord.com" android:pathPattern="/ra/.*"/>
    <data android:scheme="https" android:host="*.discord.com" android:pathPattern="/events/.*"/>
    <data android:scheme="https" android:host="discord.com" android:pathPattern="/events/.*"/>
    <data android:scheme="https" android:host="discord.com" android:pathPattern="/connections/.*/link"/>
    <data android:scheme="https" android:host="discord.com" android:pathPattern="/__development/link"/>
    <data android:scheme="https" android:host="discord.com" android:pathPattern="/mweb-handoff"/>
    <data android:scheme="https" android:host="discord.com" android:pathPattern="/activate"/>
</intent-filter>
```

## Roadmap
- [x] Decompile base app
- [x] Get OTA updates to the app
- [ ] Decompile OTA updates
- [ ] Profit