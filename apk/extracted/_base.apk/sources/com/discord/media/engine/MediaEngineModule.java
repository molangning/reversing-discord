package com.discord.media.engine;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import com.discord.media.engine.types.Debug;
import com.discord.media.engine.video.events.ActiveSinksChangeEvent;
import com.discord.media.engine.video.events.DeviceChangedEvent;
import com.discord.media.engine.video.events.FirstFrameCallbackEvent;
import com.discord.media.engine.video.events.NoInputCallbackEvent;
import com.discord.media.engine.video.events.OnBroadcastRequestedEvent;
import com.discord.media.engine.video.events.OnBroadcastThumbnailEvent;
import com.discord.media.engine.video.events.OnVideoCallbackEvent;
import com.discord.media.engine.video.events.OnVoiceEvent;
import com.discord.media.engine.video.events.PingCallbackEvent;
import com.discord.media.engine.video.events.PingTimeoutCallbackEvent;
import com.discord.media.engine.video.events.SpeedTestPingCallbackEvent;
import com.discord.media.engine.video.events.SpeedTestPingTimeoutCallbackEvent;
import com.discord.media.engine.video.events.UserSpeakingEvent;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvents;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.ViewProps;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9545j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p304qf.C11889v;
import pf.C11591x;

@ReactModule(name = MediaEngineModule.NAME)
@Metadata(m14358d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010%\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u0000 \u009b\u00012\u00020\u0001:\u0002\u009b\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0002J\u0010\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0002J/\u0010\u001d\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0007J\u001f\u0010#\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001bH\u0007¢\u0006\u0002\u0010%J\u0017\u0010&\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010'J\u001f\u0010(\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010+J'\u0010,\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u00122\u0006\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010.J\u001f\u0010/\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010+J\u001f\u00100\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u00101\u001a\u000202H\u0007¢\u0006\u0002\u00103J(\u00104\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u001b2\u0006\u00106\u001a\u0002072\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J'\u00108\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001b2\u0006\u00109\u001a\u000207H\u0007¢\u0006\u0002\u0010:J/\u0010;\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020=H\u0007¢\u0006\u0002\u0010?J'\u0010@\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010A\u001a\u00020=H\u0007¢\u0006\u0002\u0010BJ\u001f\u0010C\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010D\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010EJ\u001f\u0010F\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010G\u001a\u00020=H\u0007¢\u0006\u0002\u0010HJ'\u0010I\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010J\u001a\u0002072\u0006\u0010K\u001a\u000207H\u0007¢\u0006\u0002\u0010LJ\u001f\u0010M\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010N\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010EJ\u001f\u0010O\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010P\u001a\u000207H\u0007¢\u0006\u0002\u0010QJ\u001f\u0010R\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010S\u001a\u000207H\u0007¢\u0006\u0002\u0010QJ\u001f\u0010T\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010U\u001a\u00020VH\u0007¢\u0006\u0002\u0010WJ\u001f\u0010X\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010Y\u001a\u000207H\u0007¢\u0006\u0002\u0010QJ\u0010\u0010Z\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0007JF\u0010[\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010\\\u001a\u00020V2$\u0010)\u001a \u0012\u0004\u0012\u00020\u001b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020_0^\u0012\u0004\u0012\u00020\u00170]H\u0002J(\u0010`\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010\\\u001a\u00020V2\u0006\u0010)\u001a\u00020*H\u0007JF\u0010a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010\\\u001a\u00020V2$\u0010)\u001a \u0012\u0004\u0012\u00020\u001b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020_0^\u0012\u0004\u0012\u00020\u00170]H\u0002J(\u0010b\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010\\\u001a\u00020V2\u0006\u0010)\u001a\u00020*H\u0007J(\u0010c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001b2\u0006\u0010\\\u001a\u00020V2\u0006\u0010)\u001a\u00020*H\u0007J\u0010\u0010d\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*H\u0007J\u0010\u0010e\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*H\u0007J\u0010\u0010f\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*H\u0007J\u0016\u0010g\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0006\u0012\u0004\u0018\u00010_0hH\u0016J\u0010\u0010i\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*H\u0007J\b\u0010j\u001a\u00020\u001bH\u0016J\u0010\u0010k\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*H\u0007J\u0010\u0010l\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*H\u0007J\u0010\u0010m\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*H\u0007J\b\u0010n\u001a\u00020\u0017H\u0007J\b\u0010o\u001a\u00020\u0017H\u0016J\u0018\u0010p\u001a\u00020\u00172\u0006\u0010q\u001a\u0002022\u0006\u0010)\u001a\u00020*H\u0007J\u0010\u0010r\u001a\u00020\u00172\u0006\u0010s\u001a\u00020\u0012H\u0007J\u0010\u0010t\u001a\u00020\u00172\u0006\u0010u\u001a\u00020\u001bH\u0007J\u0010\u0010v\u001a\u00020\u00172\u0006\u0010w\u001a\u000207H\u0007J \u0010x\u001a\u00020\u00172\u0006\u0010y\u001a\u00020\u00122\u0006\u0010z\u001a\u00020\u00122\u0006\u0010{\u001a\u00020\u0012H\u0007J\u0010\u0010|\u001a\u00020\u00172\u0006\u0010}\u001a\u000207H\u0007J\u0010\u0010~\u001a\u00020\u00172\u0006\u0010\u007f\u001a\u000207H\u0007J\u0013\u0010\u0080\u0001\u001a\u00020\u00172\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0007J\u0011\u0010\u0083\u0001\u001a\u00020\u00172\u0006\u0010A\u001a\u00020=H\u0007J\u0011\u0010\u0084\u0001\u001a\u00020\u00172\u0006\u0010G\u001a\u00020=H\u0007J\u0013\u0010\u0085\u0001\u001a\u00020\u00172\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0007J\u0011\u0010\u0086\u0001\u001a\u00020\u00172\u0006\u0010A\u001a\u00020=H\u0007J\u0011\u0010\u0087\u0001\u001a\u00020\u00172\u0006\u0010U\u001a\u00020VH\u0007J\u0013\u0010\u0088\u0001\u001a\u00020\u00172\b\u0010\u0081\u0001\u001a\u00030\u0082\u0001H\u0007J\u0011\u0010\u0089\u0001\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0007J \u0010\u008a\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010+J \u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010+J \u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010N\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010EJ \u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010U\u001a\u00020VH\u0007¢\u0006\u0002\u0010WJ)\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010U\u001a\u00020V2\u0006\u0010)\u001a\u00020*H\u0007¢\u0006\u0003\u0010\u008f\u0001J)\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010U\u001a\u00020V2\u0006\u0010)\u001a\u00020*H\u0007¢\u0006\u0003\u0010\u008f\u0001J \u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010)\u001a\u00020*H\u0007¢\u0006\u0002\u0010+J\u0018\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0012H\u0007¢\u0006\u0002\u0010'J\t\u0010\u0093\u0001\u001a\u00020\u0017H\u0007J\u0019\u0010\u0094\u0001\u001a\u00020\u00172\u0006\u0010U\u001a\u00020V2\u0006\u0010)\u001a\u00020*H\u0007J\u0011\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0003\u0010\u0096\u0001J\"\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u00172\u0007\u0010\u0098\u0001\u001a\u00020\u00122\u0007\u0010\u0099\u0001\u001a\u00020\u001bH\u0007¢\u0006\u0002\u0010%J\u0011\u0010\u009a\u0001\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*H\u0007R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u009c\u0001"}, m14357d2 = {"Lcom/discord/media/engine/MediaEngineModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "activityEventListener", "Lcom/facebook/react/bridge/ActivityEventListener;", "mediaEngine", "Lcom/discord/media/engine/MediaEngine;", "getMediaEngine", "()Lcom/discord/media/engine/MediaEngine;", "getReactContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "startNs", "", "streamConnectionId", "", "Ljava/lang/Integer;", "streamPermissions", "Landroid/content/Intent;", "addConnectionCallbacks", "", "connectionId", "addListener", "type", "", "addSpeedTestConnectionCallbacks", "connectionInstanceConfigureConnectionRetries", "baseDelayMs", "maxDelayMs", "maxAttempts", "(IIII)Lkotlin/Unit;", "connectionInstanceDestroy", "connectionInstanceDestroyUser", "userId", "(ILjava/lang/String;)Lkotlin/Unit;", "connectionInstanceFastUdpReconnect", "(I)Lkotlin/Unit;", "connectionInstanceGetEncryptionModes", "callback", "Lcom/facebook/react/bridge/Callback;", "(ILcom/facebook/react/bridge/Callback;)Lkotlin/Unit;", "connectionInstanceGetFilteredStats", "filter", "(IILcom/facebook/react/bridge/Callback;)Lkotlin/Unit;", "connectionInstanceGetStats", "connectionInstanceMergeUsers", "users", "Lcom/facebook/react/bridge/ReadableArray;", "(ILcom/facebook/react/bridge/ReadableArray;)Lkotlin/Unit;", "connectionInstanceSetDesktopSource", "stringId", "useVideoHook", "", "connectionInstanceSetLocalMute", "mute", "(ILjava/lang/String;Z)Lkotlin/Unit;", "connectionInstanceSetLocalPan", ViewProps.LEFT, "", ViewProps.RIGHT, "(ILjava/lang/String;FF)Lkotlin/Unit;", "connectionInstanceSetLocalVolume", "volume", "(ILjava/lang/String;F)Lkotlin/Unit;", "connectionInstanceSetMinimumOutputDelay", "delay", "(II)Lkotlin/Unit;", "connectionInstanceSetNoInputThreshold", "threshold", "(IF)Lkotlin/Unit;", "connectionInstanceSetPTTActive", AppStateModule.APP_STATE_ACTIVE, "priority", "(IZZ)Lkotlin/Unit;", "connectionInstanceSetPingInterval", "pingInterval", "connectionInstanceSetSelfDeafen", "deafened", "(IZ)Lkotlin/Unit;", "connectionInstanceSetSelfMute", "muted", "connectionInstanceSetTransportOptions", "options", "Lcom/facebook/react/bridge/ReadableMap;", "(ILcom/facebook/react/bridge/ReadableMap;)Lkotlin/Unit;", "connectionInstanceSetVideoBroadcast", "broadcasting", "connectionInstanceTriggerOnVideoCallback", "createConnection", "connectionOptions", "Lkotlin/Function2;", "", "", "createOwnStreamConnectionWithOptions", "createSpeedTestConnection", "createSpeedTestConnectionWithOptions", "createVoiceConnectionWithOptions", "getAudioSubsystem", "getCodecCapabilities", "getCodecSurvey", "getConstants", "", "getInputDevices", "getName", "getOutputDevices", "getSupportedVideoCodecs", "getVideoInputDevices", "initializeEngine", "invalidate", "rankRtcRegions", "regionsWithIps", "removeListeners", "count", "setAVAudioSessionMode", "mode", "setAudioInputEnabled", ViewProps.ENABLED, "setBroadcastThumbnailParams", "width", "height", "intervalSeconds", "setEmitVADLevel2", "enable", "setHasFullbandPerformance", "hasFullbandPerformance", "setInputDevice", "deviceIndex", "Lcom/facebook/react/bridge/Dynamic;", "setInputVolume", "setNoInputThreshold", "setOutputDevice", "setOutputVolume", "setTransportOptions", "setVideoInputDevice", "speedTestConnectionInstanceDestroy", "speedTestConnectionInstanceGetEncryptionModes", "speedTestConnectionInstanceGetNetworkOverhead", "speedTestConnectionInstanceSetPingInterval", "speedTestConnectionInstanceSetTransportOptions", "speedTestConnectionInstanceStartSpeedTestReceiver", "(ILcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)Lkotlin/Unit;", "speedTestConnectionInstanceStartSpeedTestSender", "speedTestConnectionInstanceStopSpeedTestReceiver", "speedTestConnectionInstanceStopSpeedTestSender", "startBroadcast", "startLocalAudioRecording", "stopBroadcast", "()Lkotlin/Unit;", "stopBroadcastWithError", "errorCode", "errorMessage", "stopLocalAudioRecording", "Companion", "media_engine_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MediaEngineModule extends ReactContextBaseJavaModule {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "VoiceEngine";
    private static final int START_SCREENSHARE_REQUEST_CODE = 420;
    private static final String TAG = "MediaEngineModule";
    private final ActivityEventListener activityEventListener;
    private final MediaEngine mediaEngine;
    private final ReactApplicationContext reactContext;
    private final ReactEvents reactEvents;
    private final long startNs;
    private Integer streamConnectionId;
    private Intent streamPermissions;

    @Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J9\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\rH\u0082\bJ\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m14357d2 = {"Lcom/discord/media/engine/MediaEngineModule$Companion;", "", "()V", "NAME", "", "START_SCREENSHARE_REQUEST_CODE", "", "TAG", "setDeviceIndex", "", "deviceIndex", "Lcom/facebook/react/bridge/Dynamic;", "setInt", "Lkotlin/Function1;", "setString", "createScreenCaptureIntent", "Landroid/content/Intent;", "Landroid/content/Context;", "media_engine_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class Companion {

        @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ReadableType.values().length];
                try {
                    iArr[ReadableType.Number.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReadableType.String.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Intent createScreenCaptureIntent(Context context) {
            Object systemService = context.getSystemService("media_projection");
            C9612q.m13919f(systemService, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
            Intent createScreenCaptureIntent = ((MediaProjectionManager) systemService).createScreenCaptureIntent();
            C9612q.m13918g(createScreenCaptureIntent, "getSystemService(Context…eateScreenCaptureIntent()");
            return createScreenCaptureIntent;
        }

        private final void setDeviceIndex(Dynamic dynamic, Function1<? super Integer, Unit> function1, Function1<? super String, Unit> function12) {
            int i;
            ReadableType type = dynamic.getType();
            if (type == null) {
                i = -1;
            } else {
                i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            }
            if (i != 1) {
                if (i == 2) {
                    String asString = dynamic.asString();
                    C9612q.m13918g(asString, "deviceIndex.asString()");
                    function12.invoke(asString);
                    return;
                }
                ReadableType type2 = dynamic.getType();
                throw new IllegalArgumentException("Unexpected deviceIndex type: " + type2);
            }
            function1.invoke(Integer.valueOf(dynamic.asInt()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaEngineModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.startNs = System.nanoTime();
        this.mediaEngine = new MediaEngine(reactContext, null, 2, null);
        Debug.INSTANCE.logDebugLoggingConfig();
        this.reactEvents = new ReactEvents(C11591x.m7577a("no-input-callback", C9591f0.m13969b(NoInputCallbackEvent.class)), C11591x.m7577a("on-voice", C9591f0.m13969b(OnVoiceEvent.class)), C11591x.m7577a("device-changed", C9591f0.m13969b(DeviceChangedEvent.class)), C11591x.m7577a("on-broadcast-requested", C9591f0.m13969b(OnBroadcastRequestedEvent.class)), C11591x.m7577a("on-broadcast-thumbnail", C9591f0.m13969b(OnBroadcastThumbnailEvent.class)), C11591x.m7577a("user-speaking", C9591f0.m13969b(UserSpeakingEvent.class)), C11591x.m7577a("ping-callback", C9591f0.m13969b(PingCallbackEvent.class)), C11591x.m7577a("ping-timeout-callback", C9591f0.m13969b(PingTimeoutCallbackEvent.class)), C11591x.m7577a("on-video-callback", C9591f0.m13969b(OnVideoCallbackEvent.class)), C11591x.m7577a("active-sinks-change", C9591f0.m13969b(ActiveSinksChangeEvent.class)), C11591x.m7577a("speed-test-ping-callback", C9591f0.m13969b(SpeedTestPingCallbackEvent.class)), C11591x.m7577a("speed-test-ping-timeout-callback", C9591f0.m13969b(SpeedTestPingTimeoutCallbackEvent.class)), C11591x.m7577a("on-first-frame-callback", C9591f0.m13969b(FirstFrameCallbackEvent.class)));
        this.activityEventListener = new ActivityEventListener() { // from class: com.discord.media.engine.MediaEngineModule$activityEventListener$1
            @Override // com.facebook.react.bridge.ActivityEventListener
            public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
                ReactEvents reactEvents;
                if (i2 == -1 && i == 420 && intent != null) {
                    MediaEngineModule.this.streamPermissions = intent;
                    reactEvents = MediaEngineModule.this.reactEvents;
                    reactEvents.emitModuleEvent(MediaEngineModule.this.getReactContext(), new OnBroadcastRequestedEvent());
                }
            }

            @Override // com.facebook.react.bridge.ActivityEventListener
            public void onNewIntent(Intent intent) {
            }
        };
    }

    private final void addConnectionCallbacks(int i) {
        this.mediaEngine.connectionInstanceSetOnSpeakingCallback$media_engine_release(i, new MediaEngineModule$addConnectionCallbacks$1(this, i));
        this.mediaEngine.connectionInstanceSetOnPingCallback$media_engine_release(i, new MediaEngineModule$addConnectionCallbacks$2(this, i));
        this.mediaEngine.connectionInstanceSetOnPingTimeoutCallback$media_engine_release(i, new MediaEngineModule$addConnectionCallbacks$3(this, i));
        this.mediaEngine.connectionInstanceSetOnFirstFrameCallback$media_engine_release(i, new MediaEngineModule$addConnectionCallbacks$4(this, i));
    }

    private final void addSpeedTestConnectionCallbacks(int i) {
        this.mediaEngine.m31884x6d509b9d(i, new MediaEngineModule$addSpeedTestConnectionCallbacks$1(this, i));
        this.mediaEngine.m31883xa1587fea(i, new MediaEngineModule$addSpeedTestConnectionCallbacks$2(this, i));
    }

    private final void createConnection(int i, String str, ReadableMap readableMap, Function2<? super String, ? super Map<String, ? extends Object>, Unit> function2) {
        this.mediaEngine.createVoiceConnection(i, str, NativeMapExtensionsKt.toJsonString(readableMap), function2);
    }

    private final void createSpeedTestConnection(int i, String str, ReadableMap readableMap, Function2<? super String, ? super Map<String, ? extends Object>, Unit> function2) {
        this.mediaEngine.createSpeedTestConnection(i, str, NativeMapExtensionsKt.toJsonString(readableMap), function2);
    }

    @ReactMethod
    public final void addListener(String type) {
        C9612q.m13917h(type, "type");
    }

    @ReactMethod
    public final Unit connectionInstanceConfigureConnectionRetries(int i, int i2, int i3, int i4) {
        return this.mediaEngine.m31903x39e7e3d4(i, i2, i3, i4);
    }

    @ReactMethod
    public final void connectionInstanceDestroy(int i) {
        this.mediaEngine.connectionInstanceDestroy$media_engine_release(i);
        Integer num = this.streamConnectionId;
        if (num != null && i == num.intValue()) {
            this.streamConnectionId = null;
        }
    }

    @ReactMethod
    public final Unit connectionInstanceDestroyUser(int i, String userId) {
        C9612q.m13917h(userId, "userId");
        return this.mediaEngine.connectionInstanceDestroyUser$media_engine_release(i, userId);
    }

    @ReactMethod
    public final Unit connectionInstanceFastUdpReconnect(int i) {
        return this.mediaEngine.connectionInstanceFastUdpReconnect$media_engine_release(i);
    }

    @ReactMethod
    public final Unit connectionInstanceGetEncryptionModes(int i, Callback callback) {
        C9612q.m13917h(callback, "callback");
        return this.mediaEngine.connectionInstanceGetEncryptionModes$media_engine_release(i, new MediaEngineModule$connectionInstanceGetEncryptionModes$1(callback));
    }

    @ReactMethod
    public final Unit connectionInstanceGetFilteredStats(int i, int i2, Callback callback) {
        C9612q.m13917h(callback, "callback");
        return this.mediaEngine.connectionInstanceGetFilteredStats$media_engine_release(i, i2, new MediaEngineModule$connectionInstanceGetFilteredStats$1(callback));
    }

    @ReactMethod
    public final Unit connectionInstanceGetStats(int i, Callback callback) {
        C9612q.m13917h(callback, "callback");
        return this.mediaEngine.connectionInstanceGetStats$media_engine_release(i, new MediaEngineModule$connectionInstanceGetStats$1(callback));
    }

    @ReactMethod
    public final Unit connectionInstanceMergeUsers(int i, ReadableArray users) {
        C9612q.m13917h(users, "users");
        return this.mediaEngine.connectionInstanceMergeUsers$media_engine_release(i, NativeArrayExtensionsKt.toJsonString(users));
    }

    @ReactMethod
    public final void connectionInstanceSetDesktopSource(int i, String stringId, boolean z, String type) {
        C9612q.m13917h(stringId, "stringId");
        C9612q.m13917h(type, "type");
    }

    @ReactMethod
    public final Unit connectionInstanceSetLocalMute(int i, String userId, boolean z) {
        C9612q.m13917h(userId, "userId");
        return this.mediaEngine.connectionInstanceSetLocalMute$media_engine_release(i, userId, z);
    }

    @ReactMethod
    public final Unit connectionInstanceSetLocalPan(int i, String userId, float f, float f2) {
        C9612q.m13917h(userId, "userId");
        return this.mediaEngine.connectionInstanceSetLocalPan$media_engine_release(i, userId, f, f2);
    }

    @ReactMethod
    public final Unit connectionInstanceSetLocalVolume(int i, String userId, float f) {
        C9612q.m13917h(userId, "userId");
        return this.mediaEngine.connectionInstanceSetLocalVolume$media_engine_release(i, userId, f);
    }

    @ReactMethod
    public final Unit connectionInstanceSetMinimumOutputDelay(int i, int i2) {
        return this.mediaEngine.connectionInstanceSetMinimumOutputDelay$media_engine_release(i, i2);
    }

    @ReactMethod
    public final Unit connectionInstanceSetNoInputThreshold(int i, float f) {
        return this.mediaEngine.connectionInstanceSetNoInputThreshold$media_engine_release(i, f);
    }

    @ReactMethod
    public final Unit connectionInstanceSetPTTActive(int i, boolean z, boolean z2) {
        return this.mediaEngine.connectionInstanceSetPTTActive$media_engine_release(i, z, z2);
    }

    @ReactMethod
    public final Unit connectionInstanceSetPingInterval(int i, int i2) {
        return this.mediaEngine.connectionInstanceSetPingInterval$media_engine_release(i, i2);
    }

    @ReactMethod
    public final Unit connectionInstanceSetSelfDeafen(int i, boolean z) {
        return this.mediaEngine.connectionInstanceSetSelfDeafen$media_engine_release(i, z);
    }

    @ReactMethod
    public final Unit connectionInstanceSetSelfMute(int i, boolean z) {
        return this.mediaEngine.connectionInstanceSetSelfMute$media_engine_release(i, z);
    }

    @ReactMethod
    public final Unit connectionInstanceSetTransportOptions(int i, ReadableMap options) {
        C9612q.m13917h(options, "options");
        return this.mediaEngine.connectionInstanceSetTransportOptions$media_engine_release(i, NativeMapExtensionsKt.toJsonString(options));
    }

    @ReactMethod
    public final Unit connectionInstanceSetVideoBroadcast(int i, boolean z) {
        return this.mediaEngine.connectionInstanceSetVideoBroadcast$media_engine_release(i, z);
    }

    @ReactMethod
    public final void connectionInstanceTriggerOnVideoCallback(int i) {
        this.mediaEngine.connectionInstanceSetOnVideoCallback$media_engine_release(i, new MediaEngineModule$connectionInstanceTriggerOnVideoCallback$1(this, i));
    }

    @ReactMethod
    public final void createOwnStreamConnectionWithOptions(int i, String userId, ReadableMap connectionOptions, Callback callback) {
        C9612q.m13917h(userId, "userId");
        C9612q.m13917h(connectionOptions, "connectionOptions");
        C9612q.m13917h(callback, "callback");
        createConnection(i, userId, connectionOptions, new MediaEngineModule$createOwnStreamConnectionWithOptions$1(callback, this, i));
        this.streamConnectionId = Integer.valueOf(i);
        addConnectionCallbacks(i);
    }

    @ReactMethod
    public final void createSpeedTestConnectionWithOptions(int i, String userId, ReadableMap connectionOptions, Callback callback) {
        C9612q.m13917h(userId, "userId");
        C9612q.m13917h(connectionOptions, "connectionOptions");
        C9612q.m13917h(callback, "callback");
        createSpeedTestConnection(i, userId, connectionOptions, new MediaEngineModule$createSpeedTestConnectionWithOptions$1(callback));
        addSpeedTestConnectionCallbacks(i);
    }

    @ReactMethod
    public final void createVoiceConnectionWithOptions(int i, String userId, ReadableMap connectionOptions, Callback callback) {
        C9612q.m13917h(userId, "userId");
        C9612q.m13917h(connectionOptions, "connectionOptions");
        C9612q.m13917h(callback, "callback");
        createConnection(i, userId, connectionOptions, new MediaEngineModule$createVoiceConnectionWithOptions$1(callback));
        addConnectionCallbacks(i);
    }

    @ReactMethod
    public final void getAudioSubsystem(Callback callback) {
        C9612q.m13917h(callback, "callback");
        this.mediaEngine.getAudioSubsystem$media_engine_release(new MediaEngineModule$getAudioSubsystem$1(callback));
    }

    @ReactMethod
    public final void getCodecCapabilities(Callback callback) {
        C9612q.m13917h(callback, "callback");
        this.mediaEngine.getCodecCapabilities$media_engine_release(new MediaEngineModule$getCodecCapabilities$1(callback));
    }

    @ReactMethod
    public final void getCodecSurvey(Callback callback) {
        C9612q.m13917h(callback, "callback");
        this.mediaEngine.getCodecSurvey$media_engine_release(new MediaEngineModule$getCodecSurvey$1(callback));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        Map m6751k;
        Map m6751k2;
        List m14101l;
        Map<String, Object> m6750l;
        m6751k = C11889v.m6751k(C11591x.m7577a("MAINTAIN_RESOLUTION", 0), C11591x.m7577a("MAINTAIN_FRAMERATE", 1), C11591x.m7577a("BALANCED", 2));
        m6751k2 = C11889v.m6751k(C11591x.m7577a("VOICE", "AVAudioSessionModeVoiceChat"), C11591x.m7577a("VIDEO", "AVAudioSessionModeVideoChat"), C11591x.m7577a("LISTEN", "AVAudioSessionModeSpokenAudio"), C11591x.m7577a("DEFAULT", "AVAudioSessionModeDefault"));
        m14101l = C9545j.m14101l("voice_sound_stop_loop", "voice_relative_sounds", "voice_legacy_subsystem", "voice_experimental_subsystem", "elevated_hook", "soundshare", "soundshare_loopback", "set_audio_device_by_id", "set_video_device_by_id", "loopback", "wumpus_video", "hybrid_video", "experimental_encoders", "experiment_config", "remote_locus_network_control", "screen_previews", "window_previews", "audio_debug_state", "connection_replay", "simulcast_bugfix", "RTC_REGION_RANKING", "video_effects", "direct_video", "electron_video", "mediapipe", "fixed_keyframe_interval", "clips", "speed_test", "first_frame_callback", "remote_user_multi_stream");
        m6750l = C11889v.m6750l(C11591x.m7577a("DegradationPreference", m6751k), C11591x.m7577a("AVAudioSessionMode", m6751k2), C11591x.m7577a("SupportedSecureFramesProtocolVersion", 1), C11591x.m7577a("supportedFeatures", m14101l));
        return m6750l;
    }

    @ReactMethod
    public final void getInputDevices(Callback callback) {
        C9612q.m13917h(callback, "callback");
        this.mediaEngine.getInputDevices$media_engine_release(new MediaEngineModule$getInputDevices$1(callback));
    }

    public final MediaEngine getMediaEngine() {
        return this.mediaEngine;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public final void getOutputDevices(Callback callback) {
        C9612q.m13917h(callback, "callback");
        this.mediaEngine.getOutputDevices$media_engine_release(new MediaEngineModule$getOutputDevices$1(callback));
    }

    public final ReactApplicationContext getReactContext() {
        return this.reactContext;
    }

    @ReactMethod
    public final void getSupportedVideoCodecs(Callback callback) {
        C9612q.m13917h(callback, "callback");
        this.mediaEngine.getSupportedVideoCodecs$media_engine_release(new MediaEngineModule$getSupportedVideoCodecs$1(callback));
    }

    @ReactMethod
    public final void getVideoInputDevices(Callback callback) {
        C9612q.m13917h(callback, "callback");
        this.mediaEngine.getVideoInputDevices$media_engine_release(new MediaEngineModule$getVideoInputDevices$1(callback));
    }

    @ReactMethod
    public final void initializeEngine() {
        this.mediaEngine.setOnNoInputCallback$media_engine_release(new MediaEngineModule$initializeEngine$1(this));
        this.mediaEngine.setOnVoiceCallback$media_engine_release(new MediaEngineModule$initializeEngine$2(this));
        this.mediaEngine.setActiveSinksChangeCallback$media_engine_release(new MediaEngineModule$initializeEngine$3(this));
        this.mediaEngine.setDeviceChangeCallback$media_engine_release(new MediaEngineModule$initializeEngine$4(this));
        this.reactContext.addActivityEventListener(this.activityEventListener);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        this.reactContext.removeActivityEventListener(this.activityEventListener);
        this.mediaEngine.reset();
    }

    @ReactMethod
    public final void rankRtcRegions(ReadableArray regionsWithIps, Callback callback) {
        C9612q.m13917h(regionsWithIps, "regionsWithIps");
        C9612q.m13917h(callback, "callback");
        this.mediaEngine.rankRtcRegions$media_engine_release(NativeArrayExtensionsKt.toJsonString(regionsWithIps), new MediaEngineModule$rankRtcRegions$1(callback));
    }

    @ReactMethod
    public final void removeListeners(int i) {
    }

    @ReactMethod
    public final void setAVAudioSessionMode(String mode) {
        C9612q.m13917h(mode, "mode");
    }

    @ReactMethod
    public final void setAudioInputEnabled(boolean z) {
        this.mediaEngine.setAudioInputEnabled$media_engine_release(z);
    }

    @ReactMethod
    public final void setBroadcastThumbnailParams(int i, int i2, int i3) {
        this.mediaEngine.setBroadcastThumbnailParams$media_engine_release(i, i2, i3, new MediaEngineModule$setBroadcastThumbnailParams$1(this));
    }

    @ReactMethod
    public final void setEmitVADLevel2(boolean z) {
        this.mediaEngine.setEmitVADLevel2$media_engine_release(z);
    }

    @ReactMethod
    public final void setHasFullbandPerformance(boolean z) {
        this.mediaEngine.setHasFullbandPerformance$media_engine_release(z);
    }

    @ReactMethod
    public final void setInputDevice(Dynamic deviceIndex) {
        int i;
        C9612q.m13917h(deviceIndex, "deviceIndex");
        MediaEngine mediaEngine = this.mediaEngine;
        ReadableType type = deviceIndex.getType();
        if (type == null) {
            i = -1;
        } else {
            i = Companion.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                String asString = deviceIndex.asString();
                C9612q.m13918g(asString, "deviceIndex.asString()");
                mediaEngine.setInputDevice$media_engine_release(asString);
                return;
            }
            ReadableType type2 = deviceIndex.getType();
            throw new IllegalArgumentException("Unexpected deviceIndex type: " + type2);
        }
        mediaEngine.setInputDevice$media_engine_release(deviceIndex.asInt());
    }

    @ReactMethod
    public final void setInputVolume(float f) {
        this.mediaEngine.setInputVolume$media_engine_release(f);
    }

    @ReactMethod
    public final void setNoInputThreshold(float f) {
        this.mediaEngine.setNoInputThreshold$media_engine_release(f);
    }

    @ReactMethod
    public final void setOutputDevice(Dynamic deviceIndex) {
        int i;
        C9612q.m13917h(deviceIndex, "deviceIndex");
        MediaEngine mediaEngine = this.mediaEngine;
        ReadableType type = deviceIndex.getType();
        if (type == null) {
            i = -1;
        } else {
            i = Companion.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                String asString = deviceIndex.asString();
                C9612q.m13918g(asString, "deviceIndex.asString()");
                mediaEngine.setOutputDevice$media_engine_release(asString);
                return;
            }
            ReadableType type2 = deviceIndex.getType();
            throw new IllegalArgumentException("Unexpected deviceIndex type: " + type2);
        }
        mediaEngine.setOutputDevice$media_engine_release(deviceIndex.asInt());
    }

    @ReactMethod
    public final void setOutputVolume(float f) {
        this.mediaEngine.setOutputVolume$media_engine_release(f);
    }

    @ReactMethod
    public final void setTransportOptions(ReadableMap options) {
        C9612q.m13917h(options, "options");
        this.mediaEngine.setTransportOptions$media_engine_release(NativeMapExtensionsKt.toJsonString(options));
    }

    @ReactMethod
    public final void setVideoInputDevice(Dynamic deviceIndex) {
        int i;
        C9612q.m13917h(deviceIndex, "deviceIndex");
        MediaEngine mediaEngine = this.mediaEngine;
        ReadableType type = deviceIndex.getType();
        if (type == null) {
            i = -1;
        } else {
            i = Companion.WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                String asString = deviceIndex.asString();
                C9612q.m13918g(asString, "deviceIndex.asString()");
                mediaEngine.setVideoInputDevice$media_engine_release(asString);
                return;
            }
            ReadableType type2 = deviceIndex.getType();
            throw new IllegalArgumentException("Unexpected deviceIndex type: " + type2);
        }
        mediaEngine.setVideoInputDevice$media_engine_release(deviceIndex.asInt());
    }

    @ReactMethod
    public final void speedTestConnectionInstanceDestroy(int i) {
        this.mediaEngine.speedTestConnectionInstanceDestroy$media_engine_release(i);
    }

    @ReactMethod
    public final Unit speedTestConnectionInstanceGetEncryptionModes(int i, Callback callback) {
        C9612q.m13917h(callback, "callback");
        return this.mediaEngine.m31886xbe1ad786(i, new C3245x4986bf9e(callback));
    }

    @ReactMethod
    public final Unit speedTestConnectionInstanceGetNetworkOverhead(int i, Callback callback) {
        C9612q.m13917h(callback, "callback");
        return this.mediaEngine.m31885x85215b11(i, new C3246x456029f3(callback));
    }

    @ReactMethod
    public final Unit speedTestConnectionInstanceSetPingInterval(int i, int i2) {
        return this.mediaEngine.speedTestConnectionInstanceSetPingInterval$media_engine_release(i, i2);
    }

    @ReactMethod
    public final Unit speedTestConnectionInstanceSetTransportOptions(int i, ReadableMap options) {
        C9612q.m13917h(options, "options");
        return this.mediaEngine.m31882x61bcaa9e(i, NativeMapExtensionsKt.toJsonString(options));
    }

    @ReactMethod
    public final Unit speedTestConnectionInstanceStartSpeedTestReceiver(int i, ReadableMap options, Callback callback) {
        C9612q.m13917h(options, "options");
        C9612q.m13917h(callback, "callback");
        return this.mediaEngine.m31881xbe00c5d7(i, NativeMapExtensionsKt.toJsonString(options), new C3247x1ec661ed(callback));
    }

    @ReactMethod
    public final Unit speedTestConnectionInstanceStartSpeedTestSender(int i, ReadableMap options, Callback callback) {
        C9612q.m13917h(options, "options");
        C9612q.m13917h(callback, "callback");
        return this.mediaEngine.m31880xdd2d891(i, NativeMapExtensionsKt.toJsonString(options), new C3248x14b0f3(callback));
    }

    @ReactMethod
    public final Unit speedTestConnectionInstanceStopSpeedTestReceiver(int i, Callback callback) {
        C9612q.m13917h(callback, "callback");
        return this.mediaEngine.m31879x8100080f(i, new C3249xe61d2dd9(callback));
    }

    @ReactMethod
    public final Unit speedTestConnectionInstanceStopSpeedTestSender(int i) {
        return this.mediaEngine.m31878x5dad48c9(i);
    }

    @ReactMethod
    public final void startBroadcast() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.startActivityForResult(Companion.createScreenCaptureIntent(currentActivity), START_SCREENSHARE_REQUEST_CODE);
        }
    }

    @ReactMethod
    public final void startLocalAudioRecording(ReadableMap options, Callback callback) {
        C9612q.m13917h(options, "options");
        C9612q.m13917h(callback, "callback");
        this.mediaEngine.startLocalAudioRecording$media_engine_release(NativeMapExtensionsKt.toJsonString(options), new MediaEngineModule$startLocalAudioRecording$1(callback));
    }

    @ReactMethod
    public final Unit stopBroadcast() {
        Integer num = this.streamConnectionId;
        if (num != null) {
            this.mediaEngine.connectionInstanceStopBroadcast$media_engine_release(num.intValue());
            return Unit.f25302a;
        }
        return null;
    }

    @ReactMethod
    public final Unit stopBroadcastWithError(int i, String errorMessage) {
        C9612q.m13917h(errorMessage, "errorMessage");
        Integer num = this.streamConnectionId;
        if (num != null) {
            this.mediaEngine.connectionInstanceStopBroadcastWithError$media_engine_release(num.intValue(), i, errorMessage);
            return Unit.f25302a;
        }
        return null;
    }

    @ReactMethod
    public final void stopLocalAudioRecording(Callback callback) {
        C9612q.m13917h(callback, "callback");
        this.mediaEngine.stopLocalAudioRecording$media_engine_release(new MediaEngineModule$stopLocalAudioRecording$1(callback));
    }
}
