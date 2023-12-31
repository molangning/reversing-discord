package com.discord.audio;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import androidx.core.content.C0946a;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.discord.async_init.AsyncInitThreadChecker;
import com.discord.audio.bluetooth.BluetoothBroadcastReceiver;
import com.discord.audio.enums.BluetoothHeadsetAudioState;
import com.discord.audio.enums.BluetoothProfileConnectionState;
import com.discord.audio.enums.ScoAudioState;
import com.discord.audio.enums.WiredHeadsetState;
import com.discord.audio.utils.AudioPermissionsUtilsKt;
import com.discord.logging.Log;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p068dg.C5838c;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 \u0092\u00012\u00020\u0001:\b\u0093\u0001\u0094\u0001\u0092\u0001\u0095\u0001BS\u0012\u0006\u00107\u001a\u000206\u0012\u0018\u0010:\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u000409\u0012\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000409\u0012\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u000409¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0003J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\u0016\u0010\u0018\u001a\u00020\u00042\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002J\b\u0010\u0019\u001a\u00020\u0004H\u0002J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0003J\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0003J\u0012\u0010!\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010 H\u0003J\u0012\u0010$\u001a\u00020\u00042\b\u0010#\u001a\u0004\u0018\u00010\"H\u0003J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0003J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0003J\u000e\u0010,\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\nJ\u0006\u0010-\u001a\u00020\u0004J\u0006\u0010.\u001a\u00020\u0004J\u000e\u0010/\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u00102\u001a\u00020\u00042\b\b\u0001\u00101\u001a\u000200J\u000f\u00105\u001a\u00020\u0004H\u0001¢\u0006\u0004\b3\u00104R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R)\u0010:\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u0004098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R#\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0004098\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=R#\u0010A\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u0004098\u0006¢\u0006\f\n\u0004\bA\u0010;\u001a\u0004\bB\u0010=R\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR \u0010N\u001a\u00020M8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bN\u0010O\u0012\u0004\bR\u00104\u001a\u0004\bP\u0010QR \u0010T\u001a\u00020S8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bT\u0010U\u0012\u0004\bX\u00104\u001a\u0004\bV\u0010WR*\u0010Y\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bY\u0010Z\u0012\u0004\b_\u00104\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R(\u0010a\u001a\u00020`8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\ba\u0010b\u0012\u0004\bg\u00104\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR*\u0010i\u001a\u0004\u0018\u00010h8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bi\u0010j\u0012\u0004\bo\u00104\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u0018\u0010q\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR6\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR*\u0010z\u001a\u00020\n2\u0006\u0010s\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u001c\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R1\u0010\u0083\u0001\u001a\u00020@2\u0006\u0010s\u001a\u00020@8\u0006@BX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001c\u0010\u0089\u0001\u001a\u00020@8\u0006¢\u0006\u0010\n\u0006\b\u0089\u0001\u0010\u0084\u0001\u001a\u0006\b\u008a\u0001\u0010\u0086\u0001R\u0018\u0010\u008b\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010{R\u0018\u0010\u008c\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010GR\u0018\u0010\u008d\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010GR\u0018\u0010\u008e\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010GR\u0018\u0010\u008f\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010G¨\u0006\u0096\u0001"}, m14357d2 = {"Lcom/discord/audio/DiscordAudioManager;", "", "", ViewProps.f10920ON, "", "setCommunicationModeOnInternal", "requestAudioFocus", "releaseAudioFocus", "startObservingVolumeChanges", "stopObservingVolumeChanges", "Lcom/discord/audio/DiscordAudioManager$DeviceTypes;", "device", "isValidOutputDevice", "setMicrophoneMute", "refreshBluetoothHeadset", "hasWiredHeadset", "registerAudioFocusListener", "setSpeakerphoneOn", "activateDevice", "startBluetoothSco", "stopBluetoothSco", "", "Lcom/discord/audio/DiscordAudioManager$AudioDevice;", "devices", "activateDefaultDevice", "updateDeviceActivation", "Lcom/discord/audio/enums/BluetoothProfileConnectionState$Update;", "connectionState", "onHeadsetConnectionStateUpdate", "Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Update;", "audioState", "onHeadsetAudioStateUpdate", "Landroid/bluetooth/BluetoothDevice;", "onActiveDeviceUpdate", "Landroid/bluetooth/BluetoothHeadset;", "bluetoothHeadset", "onHeadsetProxyConnectionUpdate", "Lcom/discord/audio/enums/WiredHeadsetState;", "wiredHeadsetState", "onWiredHeadsetPlug", "Lcom/discord/audio/enums/ScoAudioState$Update;", "scoAudioStateUpdate", "onScoAudioStateUpdate", "deviceType", "setDevice", "makeEarpieceUnavailable", "resetEarpieceAvailability", "setCommunicationModeOn", "", "ratio", "setMediaVolume", "registerHandlers$audio_release", "()V", "registerHandlers", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lkotlin/Function1;", "onAudioDevicesUpdated", "Lkotlin/jvm/functions/Function1;", "getOnAudioDevicesUpdated", "()Lkotlin/jvm/functions/Function1;", "onActiveAudioDeviceChanged", "getOnActiveAudioDeviceChanged", "", "onCurrentMediaVolumeChanged", "getOnCurrentMediaVolumeChanged", "Landroid/media/AudioManager;", "audioManager", "Landroid/media/AudioManager;", "hasEarpiece", "Z", "instanceLock", "Ljava/lang/Object;", "Lcom/discord/async_init/AsyncInitThreadChecker;", "asyncInitThreadChecker", "Lcom/discord/async_init/AsyncInitThreadChecker;", "Lcom/discord/audio/bluetooth/BluetoothBroadcastReceiver;", "bluetoothBroadcastReceiver", "Lcom/discord/audio/bluetooth/BluetoothBroadcastReceiver;", "getBluetoothBroadcastReceiver$audio_release", "()Lcom/discord/audio/bluetooth/BluetoothBroadcastReceiver;", "getBluetoothBroadcastReceiver$audio_release$annotations", "Lcom/discord/audio/AudioManagerBroadcastReceiver;", "audioManagerBroadcastReceiver", "Lcom/discord/audio/AudioManagerBroadcastReceiver;", "getAudioManagerBroadcastReceiver$audio_release", "()Lcom/discord/audio/AudioManagerBroadcastReceiver;", "getAudioManagerBroadcastReceiver$audio_release$annotations", "bluetoothHeadsetProfileProxy", "Landroid/bluetooth/BluetoothHeadset;", "getBluetoothHeadsetProfileProxy$audio_release", "()Landroid/bluetooth/BluetoothHeadset;", "setBluetoothHeadsetProfileProxy$audio_release", "(Landroid/bluetooth/BluetoothHeadset;)V", "getBluetoothHeadsetProfileProxy$audio_release$annotations", "Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;", "bluetoothScoState", "Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;", "getBluetoothScoState$audio_release", "()Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;", "setBluetoothScoState$audio_release", "(Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;)V", "getBluetoothScoState$audio_release$annotations", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "audioFocusListener", "Landroid/media/AudioManager$OnAudioFocusChangeListener;", "getAudioFocusListener$audio_release", "()Landroid/media/AudioManager$OnAudioFocusChangeListener;", "setAudioFocusListener$audio_release", "(Landroid/media/AudioManager$OnAudioFocusChangeListener;)V", "getAudioFocusListener$audio_release$annotations", "Landroid/media/AudioFocusRequest;", "audioFocusRequest", "Landroid/media/AudioFocusRequest;", "value", "audioDevices", "Ljava/util/List;", "getAudioDevices", "()Ljava/util/List;", "setAudioDevices", "(Ljava/util/List;)V", "activeAudioDevice", "Lcom/discord/audio/DiscordAudioManager$DeviceTypes;", "getActiveAudioDevice", "()Lcom/discord/audio/DiscordAudioManager$DeviceTypes;", "setActiveAudioDevice", "(Lcom/discord/audio/DiscordAudioManager$DeviceTypes;)V", "Landroid/database/ContentObserver;", "mediaVolumeObserver", "Landroid/database/ContentObserver;", "currentMediaVolume", "I", "getCurrentMediaVolume", "()I", "setCurrentMediaVolume", "(I)V", "maxMediaVolume", "getMaxMediaVolume", "requestedAudioDevice", "savedIsSpeakerphoneOn", "savedIsMicrophoneMute", "savedIsBluetoothScoOn", "inDiscordRequestedCommunicationMode", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Companion", "AudioDevice", "BluetoothScoState", "DeviceTypes", "audio_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class DiscordAudioManager {
    public static final Companion Companion = new Companion(null);
    private static final List<DeviceTypes> DEFAULT_DEVICE_PRIORITIZATION;
    private static final String TAG = "DiscordAudioManager";
    private DeviceTypes activeAudioDevice;
    private final AsyncInitThreadChecker asyncInitThreadChecker;
    private List<AudioDevice> audioDevices;
    private AudioManager.OnAudioFocusChangeListener audioFocusListener;
    private AudioFocusRequest audioFocusRequest;
    private final AudioManager audioManager;
    private final AudioManagerBroadcastReceiver audioManagerBroadcastReceiver;
    private final BluetoothBroadcastReceiver bluetoothBroadcastReceiver;
    private BluetoothHeadset bluetoothHeadsetProfileProxy;
    private BluetoothScoState bluetoothScoState;
    private final Context context;
    private int currentMediaVolume;
    private final boolean hasEarpiece;
    private boolean inDiscordRequestedCommunicationMode;
    private final Object instanceLock;
    private final int maxMediaVolume;
    private ContentObserver mediaVolumeObserver;
    private final Function1<DeviceTypes, Unit> onActiveAudioDeviceChanged;
    private final Function1<List<AudioDevice>, Unit> onAudioDevicesUpdated;
    private final Function1<Integer, Unit> onCurrentMediaVolumeChanged;
    private DeviceTypes requestedAudioDevice;
    private boolean savedIsBluetoothScoOn;
    private boolean savedIsMicrophoneMute;
    private boolean savedIsSpeakerphoneOn;

    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m14357d2 = {"Lcom/discord/audio/DiscordAudioManager$BluetoothScoState;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "INVALID", "OFF", "ON", "TURNING_ON", "TURNING_OFF", "audio_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public enum BluetoothScoState {
        INVALID(-1),
        OFF(0),
        ON(1),
        TURNING_ON(2),
        TURNING_OFF(3);
        
        private final int value;

        BluetoothScoState(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m14357d2 = {"Lcom/discord/audio/DiscordAudioManager$Companion;", "", "()V", "DEFAULT_DEVICE_PRIORITIZATION", "", "Lcom/discord/audio/DiscordAudioManager$DeviceTypes;", "getDEFAULT_DEVICE_PRIORITIZATION", "()Ljava/util/List;", "TAG", "", "getSupportedDevices", "Lcom/discord/audio/DiscordAudioManager$AudioDevice;", "audio_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<DeviceTypes> getDEFAULT_DEVICE_PRIORITIZATION() {
            return DiscordAudioManager.DEFAULT_DEVICE_PRIORITIZATION;
        }

        public final List<AudioDevice> getSupportedDevices() {
            List<AudioDevice> m14101l;
            m14101l = C9545j.m14101l(new AudioDevice(DeviceTypes.SPEAKERPHONE, false, null, null, 14, null), new AudioDevice(DeviceTypes.WIRED_HEADSET, false, null, null, 14, null), new AudioDevice(DeviceTypes.EARPIECE, false, null, null, 14, null), new AudioDevice(DeviceTypes.BLUETOOTH_HEADSET, false, null, null, 14, null));
            return m14101l;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, m14357d2 = {"Lcom/discord/audio/DiscordAudioManager$DeviceTypes;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "DEFAULT", "INVALID", "SPEAKERPHONE", "WIRED_HEADSET", "EARPIECE", "BLUETOOTH_HEADSET", "audio_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public enum DeviceTypes {
        DEFAULT(-2),
        INVALID(-1),
        SPEAKERPHONE(0),
        WIRED_HEADSET(1),
        EARPIECE(2),
        BLUETOOTH_HEADSET(3);
        
        private final int value;

        DeviceTypes(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[DeviceTypes.values().length];
            try {
                iArr[DeviceTypes.EARPIECE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceTypes.WIRED_HEADSET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeviceTypes.SPEAKERPHONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DeviceTypes.BLUETOOTH_HEADSET.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DeviceTypes.INVALID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DeviceTypes.DEFAULT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BluetoothProfileConnectionState.values().length];
            try {
                iArr2[BluetoothProfileConnectionState.Disconnected.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BluetoothProfileConnectionState.Connected.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[BluetoothProfileConnectionState.Connecting.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[BluetoothProfileConnectionState.Disconnecting.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[BluetoothHeadsetAudioState.values().length];
            try {
                iArr3[BluetoothHeadsetAudioState.Connected.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[BluetoothHeadsetAudioState.Disconnected.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[BluetoothHeadsetAudioState.Connecting.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[BluetoothScoState.values().length];
            try {
                iArr4[BluetoothScoState.ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[BluetoothScoState.TURNING_ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[ScoAudioState.values().length];
            try {
                iArr5[ScoAudioState.Connected.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr5[ScoAudioState.Disconnected.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr5[ScoAudioState.Error.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[ScoAudioState.Connecting.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    static {
        List<DeviceTypes> m14101l;
        m14101l = C9545j.m14101l(DeviceTypes.EARPIECE, DeviceTypes.SPEAKERPHONE, DeviceTypes.BLUETOOTH_HEADSET, DeviceTypes.WIRED_HEADSET);
        DEFAULT_DEVICE_PRIORITIZATION = m14101l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DiscordAudioManager(Context context, Function1<? super List<AudioDevice>, Unit> onAudioDevicesUpdated, Function1<? super DeviceTypes, Unit> onActiveAudioDeviceChanged, Function1<? super Integer, Unit> onCurrentMediaVolumeChanged) {
        AudioDevice copy$default;
        C9612q.m13917h(context, "context");
        C9612q.m13917h(onAudioDevicesUpdated, "onAudioDevicesUpdated");
        C9612q.m13917h(onActiveAudioDeviceChanged, "onActiveAudioDeviceChanged");
        C9612q.m13917h(onCurrentMediaVolumeChanged, "onCurrentMediaVolumeChanged");
        this.context = context;
        this.onAudioDevicesUpdated = onAudioDevicesUpdated;
        this.onActiveAudioDeviceChanged = onActiveAudioDeviceChanged;
        this.onCurrentMediaVolumeChanged = onCurrentMediaVolumeChanged;
        Object m38395i = C0946a.m38395i(context, AudioManager.class);
        C9612q.m13920e(m38395i);
        this.audioManager = (AudioManager) m38395i;
        this.hasEarpiece = context.getPackageManager().hasSystemFeature("android.hardware.telephony");
        this.instanceLock = this;
        this.asyncInitThreadChecker = new AsyncInitThreadChecker(TAG);
        this.bluetoothBroadcastReceiver = new BluetoothBroadcastReceiver(new DiscordAudioManager$bluetoothBroadcastReceiver$1(this), new DiscordAudioManager$bluetoothBroadcastReceiver$2(this), new DiscordAudioManager$bluetoothBroadcastReceiver$3(this), new DiscordAudioManager$bluetoothBroadcastReceiver$4(this));
        this.audioManagerBroadcastReceiver = new AudioManagerBroadcastReceiver(new DiscordAudioManager$audioManagerBroadcastReceiver$1(this), new DiscordAudioManager$audioManagerBroadcastReceiver$2(this));
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.discord.audio.j
            @Override // java.lang.Runnable
            public final void run() {
                DiscordAudioManager._init_$lambda$0(DiscordAudioManager.this);
            }
        });
        this.bluetoothScoState = BluetoothScoState.INVALID;
        List<AudioDevice> supportedDevices = Companion.getSupportedDevices();
        ArrayList arrayList = new ArrayList();
        for (AudioDevice audioDevice : supportedDevices) {
            switch (WhenMappings.$EnumSwitchMapping$0[audioDevice.getType().ordinal()]) {
                case 1:
                    copy$default = AudioDevice.copy$default(audioDevice, null, this.hasEarpiece, null, null, 13, null);
                    break;
                case 2:
                    copy$default = AudioDevice.copy$default(audioDevice, null, hasWiredHeadset(), null, null, 13, null);
                    break;
                case 3:
                    copy$default = AudioDevice.copy$default(audioDevice, null, true, null, null, 13, null);
                    break;
                case 4:
                    copy$default = AudioDevice.copy$default(audioDevice, null, false, null, null, 15, null);
                    break;
                case 5:
                case 6:
                    copy$default = null;
                    break;
                default:
                    throw new C11581q();
            }
            if (copy$default != null) {
                arrayList.add(copy$default);
            }
        }
        this.audioDevices = arrayList;
        this.activeAudioDevice = DeviceTypes.INVALID;
        this.maxMediaVolume = this.audioManager.getStreamMaxVolume(3);
        this.requestedAudioDevice = DeviceTypes.DEFAULT;
    }

    public static final void _init_$lambda$0(DiscordAudioManager this$0) {
        C9612q.m13917h(this$0, "this$0");
        this$0.registerHandlers$audio_release();
    }

    private final void activateDefaultDevice(List<AudioDevice> list) {
        DeviceTypes deviceTypes;
        DeviceTypes deviceTypes2;
        synchronized (this.instanceLock) {
            List<DeviceTypes> list2 = DEFAULT_DEVICE_PRIORITIZATION;
            ListIterator<DeviceTypes> listIterator = list2.listIterator(list2.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    deviceTypes = listIterator.previous();
                    if (list.get(deviceTypes.getValue()).isAvailable()) {
                        break;
                    }
                } else {
                    deviceTypes = null;
                    break;
                }
            }
            deviceTypes2 = deviceTypes;
            if (deviceTypes2 == null) {
                deviceTypes2 = DeviceTypes.SPEAKERPHONE;
            }
        }
        Log log = Log.INSTANCE;
        Log.i$default(log, TAG, "Default device to activate: " + deviceTypes2, (Throwable) null, 4, (Object) null);
        activateDevice(deviceTypes2);
    }

    private final void activateDevice(DeviceTypes deviceTypes) {
        boolean z;
        boolean z2;
        synchronized (this.instanceLock) {
            z = true;
            z2 = !this.inDiscordRequestedCommunicationMode;
        }
        if (z2) {
            Log.w$default(Log.INSTANCE, TAG, "Unable to activate audio output outside Discord-requested communication mode", (Throwable) null, 4, (Object) null);
            return;
        }
        if (deviceTypes == DeviceTypes.BLUETOOTH_HEADSET) {
            startBluetoothSco();
        } else {
            stopBluetoothSco();
        }
        if (deviceTypes != DeviceTypes.SPEAKERPHONE) {
            z = false;
        }
        setSpeakerphoneOn(z);
        synchronized (this.instanceLock) {
            setActiveAudioDevice(deviceTypes);
            Unit unit = Unit.f25302a;
        }
        Log.i$default(Log.INSTANCE, TAG, "Activated device: " + deviceTypes, (Throwable) null, 4, (Object) null);
    }

    public static /* synthetic */ void getAudioFocusListener$audio_release$annotations() {
    }

    public static /* synthetic */ void getAudioManagerBroadcastReceiver$audio_release$annotations() {
    }

    public static /* synthetic */ void getBluetoothBroadcastReceiver$audio_release$annotations() {
    }

    public static /* synthetic */ void getBluetoothHeadsetProfileProxy$audio_release$annotations() {
    }

    public static /* synthetic */ void getBluetoothScoState$audio_release$annotations() {
    }

    private final boolean hasWiredHeadset() {
        return this.audioManager.isWiredHeadsetOn();
    }

    private final boolean isValidOutputDevice(DeviceTypes deviceTypes) {
        switch (WhenMappings.$EnumSwitchMapping$0[deviceTypes.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return true;
            case 5:
            case 6:
                return false;
            default:
                throw new C11581q();
        }
    }

    public final void onActiveDeviceUpdate(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice != null) {
            updateDeviceActivation();
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void onHeadsetAudioStateUpdate(BluetoothHeadsetAudioState.Update update) {
        String str;
        int m14093t;
        AudioDevice copy$default;
        String str2;
        String str3;
        BluetoothHeadsetAudioState current = update.getCurrent();
        if (current == null) {
            current = BluetoothHeadsetAudioState.Disconnected;
        }
        BluetoothDevice device = update.getDevice();
        Log log = Log.INSTANCE;
        if (device != null) {
            str = device.getName();
        } else {
            str = null;
        }
        Log.i$default(log, TAG, "[onHeadsetAudioStateChanged] state: " + current + ", device: " + str, (Throwable) null, 4, (Object) null);
        int i = WhenMappings.$EnumSwitchMapping$2[current.ordinal()];
        if (i != 1) {
            if (i == 2) {
                updateDeviceActivation();
                return;
            }
            return;
        }
        synchronized (this.instanceLock) {
            List<AudioDevice> list = this.audioDevices;
            m14093t = C9546k.m14093t(list, 10);
            ArrayList arrayList = new ArrayList(m14093t);
            for (AudioDevice audioDevice : list) {
                if (WhenMappings.$EnumSwitchMapping$0[audioDevice.getType().ordinal()] == 4) {
                    if (device != null) {
                        str2 = device.getAddress();
                    } else {
                        str2 = null;
                    }
                    if (device != null) {
                        str3 = device.getName();
                    } else {
                        str3 = null;
                    }
                    copy$default = AudioDevice.copy$default(audioDevice, null, true, str2, str3, 1, null);
                } else {
                    copy$default = AudioDevice.copy$default(audioDevice, null, false, null, null, 15, null);
                }
                arrayList.add(copy$default);
            }
            setAudioDevices(arrayList);
            Unit unit = Unit.f25302a;
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void onHeadsetConnectionStateUpdate(BluetoothProfileConnectionState.Update update) {
        String str;
        ArrayList arrayList;
        int m14093t;
        DeviceTypes deviceTypes;
        BluetoothProfileConnectionState current = update.getCurrent();
        if (current == null) {
            current = BluetoothProfileConnectionState.Disconnected;
        }
        BluetoothDevice device = update.getDevice();
        Log log = Log.INSTANCE;
        String str2 = null;
        if (device != null) {
            str = device.getName();
        } else {
            str = null;
        }
        Log.i$default(log, TAG, "[onHeadsetConnectionStateChanged] state: " + current + ", device: " + str, (Throwable) null, 4, (Object) null);
        int i = WhenMappings.$EnumSwitchMapping$1[current.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    Log.i$default(log, TAG, "[onHeadsetConnectionStateChanged] " + current + "...", (Throwable) null, 4, (Object) null);
                    return;
                }
                return;
            }
            synchronized (this.instanceLock) {
                deviceTypes = this.activeAudioDevice;
            }
            if (deviceTypes == DeviceTypes.BLUETOOTH_HEADSET) {
                refreshBluetoothHeadset();
                return;
            } else {
                updateDeviceActivation();
                return;
            }
        }
        synchronized (this.instanceLock) {
            List<AudioDevice> list = this.audioDevices;
            m14093t = C9546k.m14093t(list, 10);
            arrayList = new ArrayList(m14093t);
            for (AudioDevice audioDevice : list) {
                arrayList.add(AudioDevice.copy$default(audioDevice, null, false, null, null, 15, null));
            }
        }
        DeviceTypes deviceTypes2 = DeviceTypes.BLUETOOTH_HEADSET;
        if (((AudioDevice) arrayList.get(deviceTypes2.getValue())).getId() != null) {
            if (device != null) {
                str2 = device.getAddress();
            }
            if (C9612q.m13922c(str2, ((AudioDevice) arrayList.get(deviceTypes2.getValue())).getId())) {
                updateDeviceActivation();
            }
        }
    }

    public final void onHeadsetProxyConnectionUpdate(BluetoothHeadset bluetoothHeadset) {
        this.bluetoothHeadsetProfileProxy = bluetoothHeadset;
    }

    public final void onScoAudioStateUpdate(ScoAudioState.Update update) {
        boolean z;
        int m14093t;
        AudioDevice copy$default;
        Log log = Log.INSTANCE;
        BluetoothScoState bluetoothScoState = this.bluetoothScoState;
        boolean isBluetoothScoOn = this.audioManager.isBluetoothScoOn();
        Log.i$default(log, TAG, "[onScoAudioStateUpdate] scoAudioStateUpdate = " + update + ", bluetoothScoState=" + bluetoothScoState + ", isBluetoothScoOn=" + isBluetoothScoOn, (Throwable) null, 4, (Object) null);
        int i = WhenMappings.$EnumSwitchMapping$4[update.getCurrent().ordinal()];
        if (i != 1) {
            if (i == 2) {
                BluetoothScoState bluetoothScoState2 = this.bluetoothScoState;
                stopBluetoothSco();
                int i2 = WhenMappings.$EnumSwitchMapping$3[bluetoothScoState2.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        int mode = this.audioManager.getMode();
                        Log.i$default(log, TAG, "Unable to turn on SCO. Clearing Bluetooth device. mode: " + mode, (Throwable) null, 4, (Object) null);
                        synchronized (this.instanceLock) {
                            List<AudioDevice> list = this.audioDevices;
                            m14093t = C9546k.m14093t(list, 10);
                            ArrayList arrayList = new ArrayList(m14093t);
                            for (AudioDevice audioDevice : list) {
                                if (WhenMappings.$EnumSwitchMapping$0[audioDevice.getType().ordinal()] == 4) {
                                    copy$default = AudioDevice.copy$default(audioDevice, null, false, null, null, 1, null);
                                } else {
                                    copy$default = AudioDevice.copy$default(audioDevice, null, false, null, null, 15, null);
                                }
                                arrayList.add(copy$default);
                            }
                            setAudioDevices(arrayList);
                            Unit unit = Unit.f25302a;
                        }
                        activateDefaultDevice(this.audioDevices);
                        return;
                    }
                    return;
                }
                synchronized (this.instanceLock) {
                    z = this.inDiscordRequestedCommunicationMode;
                }
                if (z) {
                    Log.i$default(log, TAG, "SCO off detected directly from ON. Refreshing Bluetooth device", (Throwable) null, 4, (Object) null);
                    startBluetoothSco();
                    updateDeviceActivation();
                    return;
                }
                return;
            }
            return;
        }
        startBluetoothSco();
    }

    public final void onWiredHeadsetPlug(WiredHeadsetState wiredHeadsetState) {
        int m14093t;
        AudioDevice copy$default;
        int m14093t2;
        AudioDevice copy$default2;
        Log log = Log.INSTANCE;
        Log.i$default(log, TAG, "[onWiredHeadsetPlug] wiredHeadsetState = " + wiredHeadsetState, (Throwable) null, 4, (Object) null);
        if (C9612q.m13922c(wiredHeadsetState, WiredHeadsetState.Unplugged.INSTANCE)) {
            synchronized (this.instanceLock) {
                List<AudioDevice> list = this.audioDevices;
                m14093t2 = C9546k.m14093t(list, 10);
                ArrayList arrayList = new ArrayList(m14093t2);
                for (AudioDevice audioDevice : list) {
                    int i = WhenMappings.$EnumSwitchMapping$0[audioDevice.getType().ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            copy$default2 = AudioDevice.copy$default(audioDevice, null, false, null, null, 15, null);
                        } else {
                            copy$default2 = AudioDevice.copy$default(audioDevice, null, false, null, null, 13, null);
                        }
                    } else {
                        copy$default2 = AudioDevice.copy$default(audioDevice, null, this.hasEarpiece, null, null, 13, null);
                    }
                    arrayList.add(copy$default2);
                }
                setAudioDevices(arrayList);
                Unit unit = Unit.f25302a;
            }
        } else if (wiredHeadsetState instanceof WiredHeadsetState.PluggedIn) {
            synchronized (this.instanceLock) {
                List<AudioDevice> list2 = this.audioDevices;
                m14093t = C9546k.m14093t(list2, 10);
                ArrayList arrayList2 = new ArrayList(m14093t);
                for (AudioDevice audioDevice2 : list2) {
                    int i2 = WhenMappings.$EnumSwitchMapping$0[audioDevice2.getType().ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            copy$default = AudioDevice.copy$default(audioDevice2, null, false, null, null, 15, null);
                        } else {
                            copy$default = AudioDevice.copy$default(audioDevice2, null, true, null, null, 13, null);
                        }
                    } else {
                        copy$default = AudioDevice.copy$default(audioDevice2, null, false, null, null, 13, null);
                    }
                    arrayList2.add(copy$default);
                }
                setAudioDevices(arrayList2);
                Unit unit2 = Unit.f25302a;
            }
        }
        updateDeviceActivation();
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x00c8, code lost:
        if (r3 != null) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0072 A[SYNTHETIC] */
    @android.annotation.SuppressLint({"MissingPermission"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void refreshBluetoothHeadset() {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.audio.DiscordAudioManager.refreshBluetoothHeadset():void");
    }

    private final void registerAudioFocusListener() {
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: com.discord.audio.i
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                DiscordAudioManager.registerAudioFocusListener$lambda$22(DiscordAudioManager.this, i);
            }
        };
        synchronized (this.instanceLock) {
            this.audioFocusListener = onAudioFocusChangeListener;
            Unit unit = Unit.f25302a;
        }
    }

    public static final void registerAudioFocusListener$lambda$22(DiscordAudioManager this$0, int i) {
        C9612q.m13917h(this$0, "this$0");
        Log log = Log.INSTANCE;
        Log.i$default(log, TAG, "[AudioFocus] new focus: " + i, (Throwable) null, 4, (Object) null);
        if (i != -3 && i != -2) {
            if (i == 1) {
                this$0.setCommunicationModeOnInternal(true);
                this$0.updateDeviceActivation();
                return;
            }
            return;
        }
        this$0.setCommunicationModeOnInternal(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0016, code lost:
        if (r0 == 1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x002c, code lost:
        if (r10.audioManager.abandonAudioFocus(r1) == 1) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x002f, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0030, code lost:
        r3 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void releaseAudioFocus() {
        /*
            r10 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            r2 = 1
            r3 = 0
            if (r0 < r1) goto L1c
            java.lang.Object r0 = r10.instanceLock
            monitor-enter(r0)
            android.media.AudioFocusRequest r1 = r10.audioFocusRequest     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)
            if (r1 == 0) goto L31
            android.media.AudioManager r0 = r10.audioManager
            int r0 = com.discord.audio.C2849c.m32123a(r0, r1)
            if (r0 != r2) goto L2f
            goto L30
        L19:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L1c:
            java.lang.Object r0 = r10.instanceLock
            monitor-enter(r0)
            android.media.AudioManager$OnAudioFocusChangeListener r1 = r10.audioFocusListener     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L25
            monitor-exit(r0)
            return
        L25:
            monitor-exit(r0)
            android.media.AudioManager r0 = r10.audioManager
            int r0 = r0.abandonAudioFocus(r1)
            if (r0 != r2) goto L2f
            goto L30
        L2f:
            r2 = r3
        L30:
            r3 = r2
        L31:
            if (r3 != 0) goto L3f
            com.discord.logging.Log r4 = com.discord.logging.Log.INSTANCE
            java.lang.String r5 = "DiscordAudioManager"
            java.lang.String r6 = "Unable to releaseAudioFocus()"
            r7 = 0
            r8 = 4
            r9 = 0
            com.discord.logging.Log.w$default(r4, r5, r6, r7, r8, r9)
        L3f:
            return
        L40:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.audio.DiscordAudioManager.releaseAudioFocus():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0048, code lost:
        if (r0 == 1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x004a, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0052, code lost:
        if (r9.audioManager.requestAudioFocus(r1, 0, 1) == 1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0055, code lost:
        if (r2 != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0057, code lost:
        com.discord.logging.Log.w$default(com.discord.logging.Log.INSTANCE, com.discord.audio.DiscordAudioManager.TAG, "Unable to requestAudioFocus()", (java.lang.Throwable) null, 4, (java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0063, code lost:
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean requestAudioFocus() {
        /*
            r9 = this;
            java.lang.Object r0 = r9.instanceLock
            monitor-enter(r0)
            android.media.AudioManager$OnAudioFocusChangeListener r1 = r9.audioFocusListener     // Catch: java.lang.Throwable -> L64
            r2 = 0
            if (r1 != 0) goto La
            monitor-exit(r0)
            return r2
        La:
            monitor-exit(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            r4 = 1
            if (r0 < r3) goto L4c
            android.media.AudioFocusRequest$Builder r0 = new android.media.AudioFocusRequest$Builder
            r0.<init>(r4)
            android.media.AudioAttributes$Builder r3 = new android.media.AudioAttributes$Builder
            r3.<init>()
            r5 = 2
            r3.setUsage(r5)
            r3.setContentType(r4)
            com.discord.audio.C2850d.m32122a(r0, r4)
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r6 = android.os.Looper.myLooper()
            kotlin.jvm.internal.C9612q.m13920e(r6)
            r5.<init>(r6)
            com.discord.audio.C2851e.m32121a(r0, r1, r5)
            android.media.AudioAttributes r1 = r3.build()
            com.discord.audio.C2852f.m32120a(r0, r1)
            android.media.AudioFocusRequest r0 = com.discord.audio.C2853g.m32119a(r0)
            r9.audioFocusRequest = r0
            android.media.AudioManager r1 = r9.audioManager
            int r0 = com.discord.audio.C2854h.m32118a(r1, r0)
            if (r0 != r4) goto L55
        L4a:
            r2 = r4
            goto L55
        L4c:
            android.media.AudioManager r0 = r9.audioManager
            int r0 = r0.requestAudioFocus(r1, r2, r4)
            if (r0 != r4) goto L55
            goto L4a
        L55:
            if (r2 != 0) goto L63
            com.discord.logging.Log r3 = com.discord.logging.Log.INSTANCE
            java.lang.String r4 = "DiscordAudioManager"
            java.lang.String r5 = "Unable to requestAudioFocus()"
            r6 = 0
            r7 = 4
            r8 = 0
            com.discord.logging.Log.w$default(r3, r4, r5, r6, r7, r8)
        L63:
            return r2
        L64:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.audio.DiscordAudioManager.requestAudioFocus():boolean");
    }

    private final void setActiveAudioDevice(DeviceTypes deviceTypes) {
        boolean z;
        if (this.activeAudioDevice != deviceTypes) {
            z = true;
        } else {
            z = false;
        }
        this.activeAudioDevice = deviceTypes;
        if (z) {
            this.onActiveAudioDeviceChanged.invoke(deviceTypes);
        }
    }

    private final void setAudioDevices(List<AudioDevice> list) {
        boolean z = !C9612q.m13922c(this.audioDevices, list);
        this.audioDevices = list;
        if (z) {
            this.onAudioDevicesUpdated.invoke(list);
        }
    }

    private final void setCommunicationModeOnInternal(boolean z) {
        int i;
        try {
            AudioManager audioManager = this.audioManager;
            if (z) {
                i = 3;
            } else {
                i = 0;
            }
            audioManager.setMode(i);
        } catch (SecurityException unused) {
        }
        synchronized (this.instanceLock) {
            this.inDiscordRequestedCommunicationMode = z;
            Unit unit = Unit.f25302a;
        }
    }

    public final void setCurrentMediaVolume(int i) {
        boolean z;
        if (this.currentMediaVolume != i) {
            z = true;
        } else {
            z = false;
        }
        this.currentMediaVolume = i;
        if (z) {
            this.onCurrentMediaVolumeChanged.invoke(Integer.valueOf(i));
        }
    }

    private final void setMicrophoneMute(boolean z) {
        if (this.audioManager.isMicrophoneMute() == z) {
            return;
        }
        this.audioManager.setMicrophoneMute(z);
    }

    private final void setSpeakerphoneOn(boolean z) {
        if (this.audioManager.isSpeakerphoneOn() == z) {
            return;
        }
        this.audioManager.setSpeakerphoneOn(z);
    }

    private final synchronized void startBluetoothSco() {
        BluetoothScoState bluetoothScoState;
        if (this.audioManager.isBluetoothScoOn()) {
            this.bluetoothScoState = BluetoothScoState.ON;
        }
        BluetoothScoState bluetoothScoState2 = this.bluetoothScoState;
        if (bluetoothScoState2 != BluetoothScoState.ON && bluetoothScoState2 != (bluetoothScoState = BluetoothScoState.TURNING_ON)) {
            this.bluetoothScoState = bluetoothScoState;
            this.audioManager.startBluetoothSco();
        }
    }

    private final void startObservingVolumeChanges() {
        Handler handler;
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            handler = new Handler(myLooper);
        } else {
            handler = null;
        }
        ContentObserver contentObserver = new ContentObserver(handler) { // from class: com.discord.audio.DiscordAudioManager$startObservingVolumeChanges$volumeObserver$1
            @Override // android.database.ContentObserver
            public void onChange(boolean z) {
                AudioManager audioManager;
                super.onChange(z);
                DiscordAudioManager discordAudioManager = DiscordAudioManager.this;
                audioManager = discordAudioManager.audioManager;
                discordAudioManager.setCurrentMediaVolume(audioManager.getStreamVolume(3));
            }
        };
        this.context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, contentObserver);
        this.mediaVolumeObserver = contentObserver;
    }

    private final synchronized void stopBluetoothSco() {
        if (!this.audioManager.isBluetoothScoOn()) {
            this.bluetoothScoState = BluetoothScoState.OFF;
            return;
        }
        BluetoothScoState bluetoothScoState = this.bluetoothScoState;
        if (bluetoothScoState != BluetoothScoState.ON && bluetoothScoState != BluetoothScoState.TURNING_ON) {
            return;
        }
        this.bluetoothScoState = BluetoothScoState.TURNING_OFF;
        this.audioManager.stopBluetoothSco();
    }

    private final void stopObservingVolumeChanges() {
        ContentObserver contentObserver = this.mediaVolumeObserver;
        if (contentObserver != null) {
            this.context.getContentResolver().unregisterContentObserver(contentObserver);
        }
        this.mediaVolumeObserver = null;
    }

    private final void updateDeviceActivation() {
        DeviceTypes deviceTypes;
        ArrayList arrayList;
        int m14093t;
        synchronized (this.instanceLock) {
            deviceTypes = this.requestedAudioDevice;
        }
        refreshBluetoothHeadset();
        synchronized (this.instanceLock) {
            List<AudioDevice> list = this.audioDevices;
            m14093t = C9546k.m14093t(list, 10);
            arrayList = new ArrayList(m14093t);
            for (AudioDevice audioDevice : list) {
                arrayList.add(AudioDevice.copy$default(audioDevice, null, false, null, null, 15, null));
            }
        }
        if (deviceTypes != DeviceTypes.DEFAULT && arrayList.get(deviceTypes.getValue()).isAvailable()) {
            activateDevice(deviceTypes);
        } else {
            activateDefaultDevice(arrayList);
        }
    }

    public final DeviceTypes getActiveAudioDevice() {
        return this.activeAudioDevice;
    }

    public final List<AudioDevice> getAudioDevices() {
        return this.audioDevices;
    }

    public final AudioManager.OnAudioFocusChangeListener getAudioFocusListener$audio_release() {
        return this.audioFocusListener;
    }

    public final AudioManagerBroadcastReceiver getAudioManagerBroadcastReceiver$audio_release() {
        return this.audioManagerBroadcastReceiver;
    }

    public final BluetoothBroadcastReceiver getBluetoothBroadcastReceiver$audio_release() {
        return this.bluetoothBroadcastReceiver;
    }

    public final BluetoothHeadset getBluetoothHeadsetProfileProxy$audio_release() {
        return this.bluetoothHeadsetProfileProxy;
    }

    public final BluetoothScoState getBluetoothScoState$audio_release() {
        return this.bluetoothScoState;
    }

    public final int getCurrentMediaVolume() {
        return this.currentMediaVolume;
    }

    public final int getMaxMediaVolume() {
        return this.maxMediaVolume;
    }

    public final Function1<DeviceTypes, Unit> getOnActiveAudioDeviceChanged() {
        return this.onActiveAudioDeviceChanged;
    }

    public final Function1<List<AudioDevice>, Unit> getOnAudioDevicesUpdated() {
        return this.onAudioDevicesUpdated;
    }

    public final Function1<Integer, Unit> getOnCurrentMediaVolumeChanged() {
        return this.onCurrentMediaVolumeChanged;
    }

    public final synchronized void makeEarpieceUnavailable() {
        int m14093t;
        AudioDevice copy$default;
        if (!this.audioDevices.get(DeviceTypes.EARPIECE.getValue()).isAvailable()) {
            return;
        }
        List<AudioDevice> list = this.audioDevices;
        m14093t = C9546k.m14093t(list, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (AudioDevice audioDevice : list) {
            if (WhenMappings.$EnumSwitchMapping$0[audioDevice.getType().ordinal()] == 1) {
                copy$default = AudioDevice.copy$default(audioDevice, null, false, null, null, 13, null);
            } else {
                copy$default = AudioDevice.copy$default(audioDevice, null, false, null, null, 15, null);
            }
            arrayList.add(copy$default);
        }
        setAudioDevices(arrayList);
        updateDeviceActivation();
    }

    public final void registerHandlers$audio_release() {
        this.audioManagerBroadcastReceiver.register(this.context);
        this.bluetoothBroadcastReceiver.register(this.context);
        registerAudioFocusListener();
    }

    public final synchronized void resetEarpieceAvailability() {
        int m14093t;
        AudioDevice copy$default;
        if (this.audioDevices.get(DeviceTypes.EARPIECE.getValue()).isAvailable() == this.hasEarpiece) {
            return;
        }
        List<AudioDevice> list = this.audioDevices;
        m14093t = C9546k.m14093t(list, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (AudioDevice audioDevice : list) {
            if (WhenMappings.$EnumSwitchMapping$0[audioDevice.getType().ordinal()] == 1) {
                copy$default = AudioDevice.copy$default(audioDevice, null, this.hasEarpiece, null, null, 13, null);
            } else {
                copy$default = AudioDevice.copy$default(audioDevice, null, false, null, null, 15, null);
            }
            arrayList.add(copy$default);
        }
        setAudioDevices(arrayList);
        updateDeviceActivation();
    }

    public final void setAudioFocusListener$audio_release(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        this.audioFocusListener = onAudioFocusChangeListener;
    }

    public final void setBluetoothHeadsetProfileProxy$audio_release(BluetoothHeadset bluetoothHeadset) {
        this.bluetoothHeadsetProfileProxy = bluetoothHeadset;
    }

    public final void setBluetoothScoState$audio_release(BluetoothScoState bluetoothScoState) {
        C9612q.m13917h(bluetoothScoState, "<set-?>");
        this.bluetoothScoState = bluetoothScoState;
    }

    public final void setCommunicationModeOn(boolean z) {
        this.asyncInitThreadChecker.checkIsOnValidThread();
        if (!AudioPermissionsUtilsKt.hasModifyAudioSettingsPermission(this.context)) {
            Log.w$default(Log.INSTANCE, TAG, "MODIFY_AUDIO_SETTINGS is missing. Client will run with reduced functionality", (Throwable) null, 4, (Object) null);
        } else if (z) {
            startObservingVolumeChanges();
            this.savedIsSpeakerphoneOn = this.audioManager.isSpeakerphoneOn();
            this.savedIsMicrophoneMute = this.audioManager.isMicrophoneMute();
            this.savedIsBluetoothScoOn = this.audioManager.isBluetoothScoOn();
            setCommunicationModeOnInternal(true);
            requestAudioFocus();
            updateDeviceActivation();
        } else {
            stopObservingVolumeChanges();
            activateDevice(DeviceTypes.INVALID);
            synchronized (this.instanceLock) {
                this.requestedAudioDevice = DeviceTypes.DEFAULT;
                Unit unit = Unit.f25302a;
            }
            setCommunicationModeOnInternal(false);
            releaseAudioFocus();
            setMicrophoneMute(this.savedIsMicrophoneMute);
            setSpeakerphoneOn(this.savedIsSpeakerphoneOn);
            if (this.savedIsBluetoothScoOn) {
                startBluetoothSco();
            }
        }
    }

    public final boolean setDevice(DeviceTypes deviceType) {
        ArrayList arrayList;
        int m14093t;
        boolean z;
        C9612q.m13917h(deviceType, "deviceType");
        this.asyncInitThreadChecker.checkIsOnValidThread();
        if (!AudioPermissionsUtilsKt.hasModifyAudioSettingsPermission(this.context)) {
            Log.w$default(Log.INSTANCE, TAG, "Can't setDevice, requires MODIFY_AUDIO_SETTINGS.", (Throwable) null, 4, (Object) null);
            return false;
        }
        Log.i$default(Log.INSTANCE, TAG, "setDevice(deviceType=" + deviceType + ")", (Throwable) null, 4, (Object) null);
        synchronized (this.instanceLock) {
            List<AudioDevice> list = this.audioDevices;
            m14093t = C9546k.m14093t(list, 10);
            arrayList = new ArrayList(m14093t);
            for (AudioDevice audioDevice : list) {
                arrayList.add(AudioDevice.copy$default(audioDevice, null, false, null, null, 15, null));
            }
        }
        DeviceTypes deviceTypes = DeviceTypes.DEFAULT;
        if (deviceType == deviceTypes) {
            synchronized (this.instanceLock) {
                this.requestedAudioDevice = deviceTypes;
                Unit unit = Unit.f25302a;
            }
            activateDefaultDevice(arrayList);
            return true;
        }
        if (isValidOutputDevice(deviceType)) {
            synchronized (this.instanceLock) {
                z = !this.audioDevices.get(deviceType.getValue()).isAvailable();
            }
            if (!z) {
                synchronized (this.instanceLock) {
                    this.requestedAudioDevice = deviceType;
                    Unit unit2 = Unit.f25302a;
                }
                activateDevice(deviceType);
                return true;
            }
        }
        return false;
    }

    public final void setMediaVolume(float f) {
        boolean z;
        int m24388b;
        this.asyncInitThreadChecker.checkIsOnValidThread();
        if (0.0f <= f && f <= 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Log.w$default(Log.INSTANCE, TAG, "Unexpected media volume ratio: " + f, (Throwable) null, 4, (Object) null);
            return;
        }
        try {
            AudioManager audioManager = this.audioManager;
            m24388b = C5838c.m24388b(f * this.maxMediaVolume);
            audioManager.setStreamVolume(3, m24388b, 0);
        } catch (SecurityException e) {
            Log.INSTANCE.m31908w(TAG, "Failed to set stream volume", e);
        }
    }

    @Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m14357d2 = {"Lcom/discord/audio/DiscordAudioManager$AudioDevice;", "", "type", "Lcom/discord/audio/DiscordAudioManager$DeviceTypes;", "isAvailable", "", "id", "", ZeroconfModule.KEY_SERVICE_NAME, "(Lcom/discord/audio/DiscordAudioManager$DeviceTypes;ZLjava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "()Z", "getName", "getType", "()Lcom/discord/audio/DiscordAudioManager$DeviceTypes;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "audio_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class AudioDevice {

        /* renamed from: id */
        private final String f8084id;
        private final boolean isAvailable;
        private final String name;
        private final DeviceTypes type;

        public AudioDevice() {
            this(null, false, null, null, 15, null);
        }

        public AudioDevice(DeviceTypes type, boolean z, String str, String str2) {
            C9612q.m13917h(type, "type");
            this.type = type;
            this.isAvailable = z;
            this.f8084id = str;
            this.name = str2;
        }

        public static /* synthetic */ AudioDevice copy$default(AudioDevice audioDevice, DeviceTypes deviceTypes, boolean z, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                deviceTypes = audioDevice.type;
            }
            if ((i & 2) != 0) {
                z = audioDevice.isAvailable;
            }
            if ((i & 4) != 0) {
                str = audioDevice.f8084id;
            }
            if ((i & 8) != 0) {
                str2 = audioDevice.name;
            }
            return audioDevice.copy(deviceTypes, z, str, str2);
        }

        public final DeviceTypes component1() {
            return this.type;
        }

        public final boolean component2() {
            return this.isAvailable;
        }

        public final String component3() {
            return this.f8084id;
        }

        public final String component4() {
            return this.name;
        }

        public final AudioDevice copy(DeviceTypes type, boolean z, String str, String str2) {
            C9612q.m13917h(type, "type");
            return new AudioDevice(type, z, str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AudioDevice) {
                AudioDevice audioDevice = (AudioDevice) obj;
                return this.type == audioDevice.type && this.isAvailable == audioDevice.isAvailable && C9612q.m13922c(this.f8084id, audioDevice.f8084id) && C9612q.m13922c(this.name, audioDevice.name);
            }
            return false;
        }

        public final String getId() {
            return this.f8084id;
        }

        public final String getName() {
            return this.name;
        }

        public final DeviceTypes getType() {
            return this.type;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            boolean z = this.isAvailable;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode + i) * 31;
            String str = this.f8084id;
            int hashCode2 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final boolean isAvailable() {
            return this.isAvailable;
        }

        public String toString() {
            DeviceTypes deviceTypes = this.type;
            boolean z = this.isAvailable;
            String str = this.f8084id;
            String str2 = this.name;
            return "AudioDevice(type=" + deviceTypes + ", isAvailable=" + z + ", id=" + str + ", name=" + str2 + ")";
        }

        public /* synthetic */ AudioDevice(DeviceTypes deviceTypes, boolean z, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? DeviceTypes.INVALID : deviceTypes, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
        }
    }
}