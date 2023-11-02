package com.brentvatne.exoplayer;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.google.android.exoplayer2.metadata.Metadata;
import p098f7.C6314a;
import p152i7.AbstractC7428i;
import p152i7.C7435m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.brentvatne.exoplayer.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2780i {

    /* renamed from: c */
    static final String[] f7515c = {"onVideoLoadStart", "onVideoLoad", "onVideoError", "onVideoProgress", "onVideoSeek", "onVideoEnd", "onVideoFullscreenPlayerWillPresent", "onVideoFullscreenPlayerDidPresent", "onVideoFullscreenPlayerWillDismiss", "onVideoFullscreenPlayerDidDismiss", "onPlaybackStalled", "onPlaybackResume", "onReadyForDisplay", "onVideoBuffer", "onVideoIdle", "onTimedMetadata", "onVideoAudioBecomingNoisy", "onAudioFocusChanged", "onPlaybackRateChange", "onVideoBandwidthUpdate"};

    /* renamed from: a */
    private final RCTEventEmitter f7516a;

    /* renamed from: b */
    private int f7517b = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2780i(ReactContext reactContext) {
        this.f7516a = (RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class);
    }

    /* renamed from: q */
    private void m32291q(String str, WritableMap writableMap) {
        RCTEventEmitter rCTEventEmitter = this.f7516a;
        int i = this.f7517b;
        if (writableMap == null) {
            writableMap = Arguments.createMap();
        }
        rCTEventEmitter.receiveEvent(i, str, writableMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m32307a() {
        m32291q("onVideoAudioBecomingNoisy", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m32306b(boolean z) {
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("hasAudioFocus", z);
        m32291q("onAudioFocusChanged", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m32305c(double d, int i, int i2, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("bitrate", d);
        createMap.putInt("width", i2);
        createMap.putInt("height", i);
        createMap.putString("trackId", str);
        m32291q("onVideoBandwidthUpdate", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m32304d(boolean z) {
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("isBuffering", z);
        m32291q("onVideoBuffer", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m32303e() {
        m32291q("onVideoEnd", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m32302f(String str, Exception exc) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("errorString", str);
        createMap.putString("errorException", exc.toString());
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("error", createMap);
        m32291q("onVideoError", createMap2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m32301g() {
        m32291q("onVideoFullscreenPlayerDidDismiss", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m32300h() {
        m32291q("onVideoFullscreenPlayerDidPresent", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m32299i() {
        m32291q("onVideoFullscreenPlayerWillDismiss", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m32298j() {
        m32291q("onVideoFullscreenPlayerWillPresent", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m32297k() {
        m32291q("onVideoIdle", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public void m32296l(double d, double d2, int i, int i2, WritableArray writableArray, WritableArray writableArray2, WritableArray writableArray3, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("duration", d / 1000.0d);
        createMap.putDouble("currentTime", d2 / 1000.0d);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("width", i);
        createMap2.putInt("height", i2);
        if (i > i2) {
            createMap2.putString("orientation", "landscape");
        } else {
            createMap2.putString("orientation", "portrait");
        }
        createMap.putMap("naturalSize", createMap2);
        createMap.putString("trackId", str);
        createMap.putArray("videoTracks", writableArray3);
        createMap.putArray("audioTracks", writableArray);
        createMap.putArray("textTracks", writableArray2);
        createMap.putBoolean("canPlayFastForward", true);
        createMap.putBoolean("canPlaySlowForward", true);
        createMap.putBoolean("canPlaySlowReverse", true);
        createMap.putBoolean("canPlayReverse", true);
        createMap.putBoolean("canPlayFastForward", true);
        createMap.putBoolean("canStepBackward", true);
        createMap.putBoolean("canStepForward", true);
        m32291q("onVideoLoad", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m32295m() {
        m32291q("onVideoLoadStart", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m32294n(float f) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("playbackRate", f);
        m32291q("onPlaybackRateChange", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m32293o(double d, double d2, double d3, double d4) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("currentTime", d / 1000.0d);
        createMap.putDouble("playableDuration", d2 / 1000.0d);
        createMap.putDouble("seekableDuration", d3 / 1000.0d);
        createMap.putDouble("currentPlaybackTime", d4);
        m32291q("onVideoProgress", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m32292p() {
        m32291q("onReadyForDisplay", null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m32290r(long j, long j2) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("currentTime", j / 1000.0d);
        createMap.putDouble("seekTime", j2 / 1000.0d);
        m32291q("onVideoSeek", createMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m32289s(int i) {
        this.f7517b = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m32288t(Metadata metadata) {
        String str;
        WritableArray createArray = Arguments.createArray();
        for (int i = 0; i < metadata.m29247e(); i++) {
            Metadata.InterfaceC4429b m29248d = metadata.m29248d(i);
            if (m29248d instanceof AbstractC7428i) {
                AbstractC7428i abstractC7428i = (AbstractC7428i) m29248d;
                if (abstractC7428i instanceof C7435m) {
                    str = ((C7435m) abstractC7428i).f19973l;
                } else {
                    str = "";
                }
                String str2 = abstractC7428i.f19961j;
                WritableMap createMap = Arguments.createMap();
                createMap.putString("identifier", str2);
                createMap.putString("value", str);
                createArray.pushMap(createMap);
            } else if (m29248d instanceof C6314a) {
                C6314a c6314a = (C6314a) m29248d;
                WritableMap createMap2 = Arguments.createMap();
                createMap2.putString("identifier", c6314a.f17822j);
                createMap2.putString("value", c6314a.f17823k);
                createArray.pushMap(createMap2);
            }
        }
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putArray("metadata", createArray);
        m32291q("onTimedMetadata", createMap3);
    }
}
