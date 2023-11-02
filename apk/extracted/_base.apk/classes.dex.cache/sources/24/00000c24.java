package com.brentvatne.exoplayer;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p195k8.C9191p0;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ReactExoplayerViewManager extends ViewGroupManager<C2772g> {
    private static final String PROP_BUFFER_CONFIG = "bufferConfig";
    private static final String PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS = "bufferForPlaybackAfterRebufferMs";
    private static final String PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_MS = "bufferForPlaybackMs";
    private static final String PROP_BUFFER_CONFIG_MAX_BUFFER_MS = "maxBufferMs";
    private static final String PROP_BUFFER_CONFIG_MIN_BUFFER_MS = "minBufferMs";
    private static final String PROP_CONTROLS = "controls";
    private static final String PROP_DISABLE_FOCUS = "disableFocus";
    private static final String PROP_DRM = "drm";
    private static final String PROP_DRM_HEADERS = "headers";
    private static final String PROP_DRM_LICENSESERVER = "licenseServer";
    private static final String PROP_DRM_TYPE = "type";
    private static final String PROP_FULLSCREEN = "fullscreen";
    private static final String PROP_HIDE_SHUTTER_VIEW = "hideShutterView";
    private static final String PROP_MAXIMUM_BIT_RATE = "maxBitRate";
    private static final String PROP_MIN_LOAD_RETRY_COUNT = "minLoadRetryCount";
    private static final String PROP_MUTED = "muted";
    private static final String PROP_PAUSED = "paused";
    private static final String PROP_PLAY_IN_BACKGROUND = "playInBackground";
    private static final String PROP_PREVENTS_DISPLAY_SLEEP_DURING_VIDEO_PLAYBACK = "preventsDisplaySleepDuringVideoPlayback";
    private static final String PROP_PROGRESS_UPDATE_INTERVAL = "progressUpdateInterval";
    private static final String PROP_RATE = "rate";
    private static final String PROP_REPEAT = "repeat";
    private static final String PROP_REPORT_BANDWIDTH = "reportBandwidth";
    private static final String PROP_RESIZE_MODE = "resizeMode";
    private static final String PROP_SEEK = "seek";
    private static final String PROP_SELECTED_AUDIO_TRACK = "selectedAudioTrack";
    private static final String PROP_SELECTED_AUDIO_TRACK_TYPE = "type";
    private static final String PROP_SELECTED_AUDIO_TRACK_VALUE = "value";
    private static final String PROP_SELECTED_TEXT_TRACK = "selectedTextTrack";
    private static final String PROP_SELECTED_TEXT_TRACK_TYPE = "type";
    private static final String PROP_SELECTED_TEXT_TRACK_VALUE = "value";
    private static final String PROP_SELECTED_VIDEO_TRACK = "selectedVideoTrack";
    private static final String PROP_SELECTED_VIDEO_TRACK_TYPE = "type";
    private static final String PROP_SELECTED_VIDEO_TRACK_VALUE = "value";
    private static final String PROP_SRC = "src";
    private static final String PROP_SRC_HEADERS = "requestHeaders";
    private static final String PROP_SRC_TYPE = "type";
    private static final String PROP_SRC_URI = "uri";
    private static final String PROP_TEXT_TRACKS = "textTracks";
    private static final String PROP_USE_TEXTURE_VIEW = "useTextureView";
    private static final String PROP_VOLUME = "volume";
    private static final String REACT_CLASS = "RNVVideo";
    private InterfaceC2771f config;

    public ReactExoplayerViewManager(InterfaceC2771f interfaceC2771f) {
        this.config = interfaceC2771f;
    }

    private int convertToIntDef(String str) {
        if (!TextUtils.isEmpty(str)) {
            return C2779h.m32308a(Integer.parseInt(str));
        }
        return 0;
    }

    private boolean startsWithValidScheme(String str) {
        if (!str.startsWith("http://") && !str.startsWith("https://") && !str.startsWith("content://") && !str.startsWith("file://") && !str.startsWith("asset://")) {
            return false;
        }
        return true;
    }

    public static Map<String, String> toStringMap(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        if (!keySetIterator.hasNextKey()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            hashMap.put(nextKey, readableMap.getString(nextKey));
        }
        return hashMap;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        String[] strArr;
        String str;
        MapBuilder.Builder builder = MapBuilder.builder();
        for (String str2 : C2780i.f7515c) {
            if (ReactFeatureFlags.enableFabricRenderer) {
                str = ViewProps.TOP + str2.substring(0, 1).toUpperCase() + str2.substring(1);
            } else {
                str = str2;
            }
            builder.put(str, MapBuilder.m30470of("registrationName", str2));
        }
        return builder.build();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return MapBuilder.m30467of("ScaleNone", Integer.toString(0), "ScaleAspectFit", Integer.toString(0), "ScaleToFill", Integer.toString(3), "ScaleAspectFill", Integer.toString(4));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = PROP_MIN_LOAD_RETRY_COUNT)
    public void minLoadRetryCount(C2772g c2772g, int i) {
        c2772g.m32397H0(i);
    }

    @ReactProp(name = PROP_BUFFER_CONFIG)
    public void setBufferConfig(C2772g c2772g, ReadableMap readableMap) {
        int i;
        int i2;
        int i3;
        if (readableMap != null) {
            int i4 = 50000;
            if (readableMap.hasKey(PROP_BUFFER_CONFIG_MIN_BUFFER_MS)) {
                i = readableMap.getInt(PROP_BUFFER_CONFIG_MIN_BUFFER_MS);
            } else {
                i = 50000;
            }
            if (readableMap.hasKey(PROP_BUFFER_CONFIG_MAX_BUFFER_MS)) {
                i4 = readableMap.getInt(PROP_BUFFER_CONFIG_MAX_BUFFER_MS);
            }
            if (readableMap.hasKey(PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_MS)) {
                i2 = readableMap.getInt(PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_MS);
            } else {
                i2 = 2500;
            }
            if (readableMap.hasKey(PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS)) {
                i3 = readableMap.getInt(PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS);
            } else {
                i3 = 5000;
            }
            c2772g.m32310y0(i, i4, i2, i3);
        }
    }

    @ReactProp(defaultBoolean = false, name = PROP_CONTROLS)
    public void setControls(C2772g c2772g, boolean z) {
        c2772g.m32309z0(z);
    }

    @ReactProp(name = PROP_DRM)
    public void setDRM(C2772g c2772g, ReadableMap readableMap) {
        String str;
        String str2;
        if (readableMap != null && readableMap.hasKey("type")) {
            ReadableMap readableMap2 = null;
            if (readableMap.hasKey("type")) {
                str = readableMap.getString("type");
            } else {
                str = null;
            }
            if (readableMap.hasKey(PROP_DRM_LICENSESERVER)) {
                str2 = readableMap.getString(PROP_DRM_LICENSESERVER);
            } else {
                str2 = null;
            }
            if (readableMap.hasKey(PROP_DRM_HEADERS)) {
                readableMap2 = readableMap.getMap(PROP_DRM_HEADERS);
            }
            if (str != null && str2 != null && C9191p0.m16275T(str) != null) {
                c2772g.m32405D0(C9191p0.m16275T(str));
                c2772g.m32406C0(str2);
                if (readableMap2 != null) {
                    ArrayList arrayList = new ArrayList();
                    ReadableMapKeySetIterator keySetIterator = readableMap2.keySetIterator();
                    while (keySetIterator.hasNextKey()) {
                        String nextKey = keySetIterator.nextKey();
                        arrayList.add(nextKey);
                        arrayList.add(readableMap2.getString(nextKey));
                    }
                    c2772g.m32408B0((String[]) arrayList.toArray(new String[0]));
                }
                c2772g.m32361Z0(false);
            }
        }
    }

    @ReactProp(defaultBoolean = false, name = PROP_DISABLE_FOCUS)
    public void setDisableFocus(C2772g c2772g, boolean z) {
        c2772g.m32410A0(z);
    }

    @ReactProp(defaultBoolean = false, name = PROP_FULLSCREEN)
    public void setFullscreen(C2772g c2772g, boolean z) {
        c2772g.m32403E0(z);
    }

    @ReactProp(defaultBoolean = false, name = PROP_HIDE_SHUTTER_VIEW)
    public void setHideShutterView(C2772g c2772g, boolean z) {
        c2772g.m32401F0(z);
    }

    @ReactProp(name = PROP_MAXIMUM_BIT_RATE)
    public void setMaxBitRate(C2772g c2772g, int i) {
        c2772g.m32399G0(i);
    }

    @ReactProp(defaultBoolean = false, name = PROP_MUTED)
    public void setMuted(C2772g c2772g, boolean z) {
        c2772g.m32395I0(z);
    }

    @ReactProp(defaultBoolean = false, name = PROP_PAUSED)
    public void setPaused(C2772g c2772g, boolean z) {
        c2772g.m32393J0(z);
    }

    @ReactProp(defaultBoolean = false, name = PROP_PLAY_IN_BACKGROUND)
    public void setPlayInBackground(C2772g c2772g, boolean z) {
        c2772g.m32391K0(z);
    }

    @ReactProp(defaultBoolean = false, name = PROP_PREVENTS_DISPLAY_SLEEP_DURING_VIDEO_PLAYBACK)
    public void setPreventsDisplaySleepDuringVideoPlayback(C2772g c2772g, boolean z) {
        c2772g.m32387M0(z);
    }

    @ReactProp(defaultFloat = 250.0f, name = PROP_PROGRESS_UPDATE_INTERVAL)
    public void setProgressUpdateInterval(C2772g c2772g, float f) {
        c2772g.m32385N0(f);
    }

    @ReactProp(name = PROP_TEXT_TRACKS)
    public void setPropTextTracks(C2772g c2772g, ReadableArray readableArray) {
        c2772g.m32363Y0(readableArray);
    }

    @ReactProp(name = PROP_RATE)
    public void setRate(C2772g c2772g, float f) {
        c2772g.m32383O0(f);
    }

    @ReactProp(defaultBoolean = false, name = PROP_REPEAT)
    public void setRepeat(C2772g c2772g, boolean z) {
        c2772g.m32379Q0(z);
    }

    @ReactProp(defaultBoolean = false, name = PROP_REPORT_BANDWIDTH)
    public void setReportBandwidth(C2772g c2772g, boolean z) {
        c2772g.m32377R0(z);
    }

    @ReactProp(name = "resizeMode")
    public void setResizeMode(C2772g c2772g, String str) {
        c2772g.m32375S0(convertToIntDef(str));
    }

    @ReactProp(name = PROP_SEEK)
    public void setSeek(C2772g c2772g, float f) {
        c2772g.m32312x0(Math.round(f * 1000.0f));
    }

    @ReactProp(name = PROP_SELECTED_AUDIO_TRACK)
    public void setSelectedAudioTrack(C2772g c2772g, ReadableMap readableMap) {
        Dynamic dynamic;
        String str;
        String str2 = null;
        if (readableMap != null) {
            if (readableMap.hasKey("type")) {
                str = readableMap.getString("type");
            } else {
                str = null;
            }
            if (readableMap.hasKey("value")) {
                str2 = readableMap.getDynamic("value");
            }
            dynamic = str2;
            str2 = str;
        } else {
            dynamic = null;
        }
        c2772g.m32373T0(str2, dynamic);
    }

    @ReactProp(name = PROP_SELECTED_TEXT_TRACK)
    public void setSelectedTextTrack(C2772g c2772g, ReadableMap readableMap) {
        Dynamic dynamic;
        String str;
        String str2 = null;
        if (readableMap != null) {
            if (readableMap.hasKey("type")) {
                str = readableMap.getString("type");
            } else {
                str = null;
            }
            if (readableMap.hasKey("value")) {
                str2 = readableMap.getDynamic("value");
            }
            dynamic = str2;
            str2 = str;
        } else {
            dynamic = null;
        }
        c2772g.m32371U0(str2, dynamic);
    }

    @ReactProp(name = PROP_SELECTED_VIDEO_TRACK)
    public void setSelectedVideoTrack(C2772g c2772g, ReadableMap readableMap) {
        Dynamic dynamic;
        String str;
        String str2 = null;
        if (readableMap != null) {
            if (readableMap.hasKey("type")) {
                str = readableMap.getString("type");
            } else {
                str = null;
            }
            if (readableMap.hasKey("value")) {
                str2 = readableMap.getDynamic("value");
            }
            dynamic = str2;
            str2 = str;
        } else {
            dynamic = null;
        }
        c2772g.m32367W0(str2, dynamic);
    }

    @ReactProp(name = PROP_SRC)
    public void setSrc(C2772g c2772g, ReadableMap readableMap) {
        String str;
        String str2;
        Uri buildRawResourceUri;
        Context applicationContext = c2772g.getContext().getApplicationContext();
        Map<String, String> map = null;
        if (readableMap.hasKey(PROP_SRC_URI)) {
            str = readableMap.getString(PROP_SRC_URI);
        } else {
            str = null;
        }
        if (readableMap.hasKey("type")) {
            str2 = readableMap.getString("type");
        } else {
            str2 = null;
        }
        if (readableMap.hasKey(PROP_SRC_HEADERS)) {
            map = toStringMap(readableMap.getMap(PROP_SRC_HEADERS));
        }
        if (TextUtils.isEmpty(str)) {
            c2772g.m32345f0();
        } else if (startsWithValidScheme(str)) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                c2772g.m32365X0(parse, str2, map);
            }
        } else {
            int identifier = applicationContext.getResources().getIdentifier(str, "drawable", applicationContext.getPackageName());
            if (identifier == 0) {
                identifier = applicationContext.getResources().getIdentifier(str, "raw", applicationContext.getPackageName());
            }
            if (identifier > 0 && (buildRawResourceUri = RawResourceDataSource.buildRawResourceUri(identifier)) != null) {
                c2772g.m32381P0(buildRawResourceUri, str2);
            }
        }
    }

    @ReactProp(defaultBoolean = true, name = PROP_USE_TEXTURE_VIEW)
    public void setUseTextureView(C2772g c2772g, boolean z) {
        c2772g.m32361Z0(z);
    }

    @ReactProp(defaultFloat = 1.0f, name = PROP_VOLUME)
    public void setVolume(C2772g c2772g, float f) {
        c2772g.m32358a1(f);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public C2772g createViewInstance(ThemedReactContext themedReactContext) {
        return new C2772g(themedReactContext, this.config);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(C2772g c2772g) {
        c2772g.m32353c0();
    }
}