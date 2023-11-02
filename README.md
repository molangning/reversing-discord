# decompiled-discord-apk

The apk files(base.apk,config.XXXXX.apk) are downloaded from third party sources
`extracted` directory contains source code decompiled with jadx-gui

## Interesting strings and functions

### Gets latest manifest.json file from discord

```java
    private static final Uri BASE_OTA_URI = new Uri.Builder().scheme("https").authority("discord.com").build();
    // Should return https://discord.com
    ......

    private final String getManifestURL() {
        String uri = BASE_OTA_URI.buildUpon().appendPath("android").appendPath(getVersion()).appendPath("manifest.json").build().toString();
        // Should return https://discord.com/android/VERSION/manifest.json
        C9612q.m13918g(uri, "BASE_OTA_URI\n           …)\n            .toString()");
        return uri;
    }

```

## Roadmap
- [x] Decompile base app
- [ ] Get OTA updates to the app
- [ ] Decompile OTA updates
- [ ] Profit