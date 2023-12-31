package com.discord.p047native.engine;

import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import org.webrtc.VideoCapturer;

@Metadata(m14358d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0007GHIJKLMB\u0005¢\u0006\u0002\u0010\u0002J!\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0086 J\u0011\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0086 J\u0006\u0010\u000e\u001a\u00020\u0006J\t\u0010\u000f\u001a\u00020\u0006H\u0086 J\u0011\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0012H\u0086 J\u0019\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0015H\u0086 J\u0011\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0015H\u0086 J\u0011\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\rH\u0086 J\t\u0010\u0019\u001a\u00020\u0006H\u0082 J!\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\rH\u0086 J\u0019\u0010\u001f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001dH\u0086 J!\u0010!\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0086 J\u0019\u0010%\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010&\u001a\u00020#H\u0086 J\u0011\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\bH\u0086 J\u0011\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020#H\u0086 J\u0011\u0010+\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020,H\u0086 J\u0011\u0010-\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020.H\u0086 J\u0011\u0010/\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u000200H\u0086 J\u0011\u00101\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u000202H\u0086 J\u0011\u00103\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u000204H\u0086 J\u0019\u00105\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\u001dH\u0086 J\u0011\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\bH\u0086 J\u0011\u0010:\u001a\u00020\u00062\u0006\u0010;\u001a\u00020\u001dH\u0086 J\u0011\u0010<\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u001dH\u0086 J\u0011\u0010>\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\rH\u0086 J\u0011\u0010@\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u001dH\u0086 J\u0019\u0010B\u001a\u00020\u00062\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u0004H\u0086 J\t\u0010F\u001a\u00020\u0006H\u0086 R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000¨\u0006N"}, m14357d2 = {"Lcom/discord/native/engine/NativeConnection;", "", "()V", "nativeInstance", "", "configureConnectionRetries", "", "baseDelayMs", "", "maxDelayMs", "maxAttempts", "destroyUser", "userId", "", "dispose", "fastUdpReconnect", "getEncryptionModes", "callback", "Lcom/discord/native/engine/NativeConnection$GetEncryptionModesCallback;", "getFilteredStats", "filter", "Lcom/discord/native/engine/NativeConnection$GetStatsCallback;", "getStats", "mergeUsers", "usersJSON", "nativeDestroyInstance", "setDesktopSource", "stringId", "useVideoHook", "", "type", "setLocalMute", "mute", "setLocalPan", ViewProps.LEFT, "", ViewProps.RIGHT, "setLocalVolume", "volume", "setMinimumOutputDelay", "delay", "setNoInputThreshold", "threshold", "setOnFirstFrameCallback", "Lcom/discord/native/engine/NativeConnection$OnFirstFrameCallback;", "setOnPingCallback", "Lcom/discord/native/engine/NativeConnection$OnPingCallback;", "setOnPingTimeoutCallback", "Lcom/discord/native/engine/NativeConnection$OnPingTimeoutCallback;", "setOnSpeakingCallback", "Lcom/discord/native/engine/NativeConnection$OnSpeakingCallback;", "setOnVideoCallback", "Lcom/discord/native/engine/NativeConnection$OnVideoCallback;", "setPTTActive", AppStateModule.APP_STATE_ACTIVE, "priority", "setPingInterval", "pingInterval", "setSelfDeafen", "deafened", "setSelfMute", "muted", "setTransportOptions", "optionsJSON", "setVideoBroadcast", "broadcasting", "startBroadcast", "capturer", "Lorg/webrtc/VideoCapturer;", "soundshareNativeInstance", "stopBroadcast", "GetEncryptionModesCallback", "GetStatsCallback", "OnFirstFrameCallback", "OnPingCallback", "OnPingTimeoutCallback", "OnSpeakingCallback", "OnVideoCallback", "android_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* renamed from: com.discord.native.engine.NativeConnection */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class NativeConnection {
    private final long nativeInstance;

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m14357d2 = {"Lcom/discord/native/engine/NativeConnection$GetEncryptionModesCallback;", "", "onEncryptionModes", "", "modes", "", "", "([Ljava/lang/String;)V", "android_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.discord.native.engine.NativeConnection$GetEncryptionModesCallback */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public interface GetEncryptionModesCallback {
        void onEncryptionModes(String[] strArr);
    }

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/native/engine/NativeConnection$GetStatsCallback;", "", "onStats", "", "stats", "", "android_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.discord.native.engine.NativeConnection$GetStatsCallback */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public interface GetStatsCallback {
        void onStats(String str);
    }

    @Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H&¨\u0006\t"}, m14357d2 = {"Lcom/discord/native/engine/NativeConnection$OnFirstFrameCallback;", "", "onFirstFrame", "", "userId", "", "videoSsrc", "", "streamId", "android_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.discord.native.engine.NativeConnection$OnFirstFrameCallback */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public interface OnFirstFrameCallback {
        void onFirstFrame(String str, long j, String str2);
    }

    @Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&¨\u0006\n"}, m14357d2 = {"Lcom/discord/native/engine/NativeConnection$OnPingCallback;", "", "onPing", "", "ping", "", "server", "", ZeroconfModule.KEY_SERVICE_PORT, "seq", "android_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.discord.native.engine.NativeConnection$OnPingCallback */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public interface OnPingCallback {
        void onPing(int i, String str, int i2, int i3);
    }

    @Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&¨\u0006\n"}, m14357d2 = {"Lcom/discord/native/engine/NativeConnection$OnPingTimeoutCallback;", "", "onPingTimeout", "", "server", "", ZeroconfModule.KEY_SERVICE_PORT, "", "seq", "timeout", "android_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.discord.native.engine.NativeConnection$OnPingTimeoutCallback */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public interface OnPingTimeoutCallback {
        void onPingTimeout(String str, int i, int i2, int i3);
    }

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m14357d2 = {"Lcom/discord/native/engine/NativeConnection$OnSpeakingCallback;", "", "onSpeaking", "", "userId", "", "speakingFlags", "", "android_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.discord.native.engine.NativeConnection$OnSpeakingCallback */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public interface OnSpeakingCallback {
        void onSpeaking(String str, int i);
    }

    @Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&¨\u0006\n"}, m14357d2 = {"Lcom/discord/native/engine/NativeConnection$OnVideoCallback;", "", "onVideo", "", "userId", "", "ssrc", "", "streamId", "videoStreamParametersJson", "android_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.discord.native.engine.NativeConnection$OnVideoCallback */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public interface OnVideoCallback {
        void onVideo(String str, long j, String str2, String str3);
    }

    private final native void nativeDestroyInstance();

    public final native void configureConnectionRetries(int i, int i2, int i3);

    public final native void destroyUser(String str);

    public final void dispose() {
        nativeDestroyInstance();
    }

    public final native void fastUdpReconnect();

    public final native void getEncryptionModes(GetEncryptionModesCallback getEncryptionModesCallback);

    public final native void getFilteredStats(int i, GetStatsCallback getStatsCallback);

    public final native void getStats(GetStatsCallback getStatsCallback);

    public final native void mergeUsers(String str);

    public final native void setDesktopSource(String str, boolean z, String str2);

    public final native void setLocalMute(String str, boolean z);

    public final native void setLocalPan(String str, float f, float f2);

    public final native void setLocalVolume(String str, float f);

    public final native void setMinimumOutputDelay(int i);

    public final native void setNoInputThreshold(float f);

    public final native void setOnFirstFrameCallback(OnFirstFrameCallback onFirstFrameCallback);

    public final native void setOnPingCallback(OnPingCallback onPingCallback);

    public final native void setOnPingTimeoutCallback(OnPingTimeoutCallback onPingTimeoutCallback);

    public final native void setOnSpeakingCallback(OnSpeakingCallback onSpeakingCallback);

    public final native void setOnVideoCallback(OnVideoCallback onVideoCallback);

    public final native void setPTTActive(boolean z, boolean z2);

    public final native void setPingInterval(int i);

    public final native void setSelfDeafen(boolean z);

    public final native void setSelfMute(boolean z);

    public final native void setTransportOptions(String str);

    public final native void setVideoBroadcast(boolean z);

    public final native void startBroadcast(VideoCapturer videoCapturer, long j);

    public final native void stopBroadcast();
}
