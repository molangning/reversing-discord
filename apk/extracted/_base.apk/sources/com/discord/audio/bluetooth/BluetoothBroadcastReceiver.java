package com.discord.audio.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.content.C0946a;
import com.discord.audio.enums.BluetoothBroadcastAction;
import com.discord.audio.enums.BluetoothHeadsetAudioState;
import com.discord.audio.enums.BluetoothProfileConnectionState;
import com.discord.audio.utils.ExtensionsKt;
import com.discord.logging.Log;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9560w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"BY\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\u0010\rJ\u001a\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0018H\u0007R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001f\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001f\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, m14357d2 = {"Lcom/discord/audio/bluetooth/BluetoothBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/bluetooth/BluetoothProfile$ServiceListener;", "onHeadsetConnectionStateUpdate", "Lkotlin/Function1;", "Lcom/discord/audio/enums/BluetoothProfileConnectionState$Update;", "", "onHeadsetAudioStateUpdate", "Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Update;", "onHeadsetProxyConnectionUpdate", "Landroid/bluetooth/BluetoothHeadset;", "onActiveDeviceUpdate", "Landroid/bluetooth/BluetoothDevice;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "headsetProxy", "getOnActiveDeviceUpdate", "()Lkotlin/jvm/functions/Function1;", "getOnHeadsetAudioStateUpdate", "getOnHeadsetConnectionStateUpdate", "getOnHeadsetProxyConnectionUpdate", "registered", "", "onReceive", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "onServiceConnected", "profile", "", "proxy", "Landroid/bluetooth/BluetoothProfile;", "onServiceDisconnected", "register", "Companion", "audio_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class BluetoothBroadcastReceiver extends BroadcastReceiver implements BluetoothProfile.ServiceListener {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "BluetoothBroadcasts";
    private static final Set<BluetoothBroadcastAction> actions;
    private BluetoothHeadset headsetProxy;
    private final Function1<BluetoothDevice, Unit> onActiveDeviceUpdate;
    private final Function1<BluetoothHeadsetAudioState.Update, Unit> onHeadsetAudioStateUpdate;
    private final Function1<BluetoothProfileConnectionState.Update, Unit> onHeadsetConnectionStateUpdate;
    private final Function1<BluetoothHeadset, Unit> onHeadsetProxyConnectionUpdate;
    private boolean registered;

    @Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m14357d2 = {"Lcom/discord/audio/bluetooth/BluetoothBroadcastReceiver$Companion;", "", "()V", "TAG", "", "actions", "", "Lcom/discord/audio/enums/BluetoothBroadcastAction;", "audio_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BluetoothBroadcastAction.values().length];
            try {
                iArr[BluetoothBroadcastAction.HeadsetConnectionStateChanged.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BluetoothBroadcastAction.HeadsetAudioStateChanged.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BluetoothBroadcastAction.ActiveDeviceChanged.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Set<BluetoothBroadcastAction> m14002i;
        m14002i = C9560w.m14002i(BluetoothBroadcastAction.HeadsetConnectionStateChanged, BluetoothBroadcastAction.HeadsetAudioStateChanged);
        actions = m14002i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BluetoothBroadcastReceiver(Function1<? super BluetoothProfileConnectionState.Update, Unit> onHeadsetConnectionStateUpdate, Function1<? super BluetoothHeadsetAudioState.Update, Unit> onHeadsetAudioStateUpdate, Function1<? super BluetoothHeadset, Unit> onHeadsetProxyConnectionUpdate, Function1<? super BluetoothDevice, Unit> onActiveDeviceUpdate) {
        C9612q.m13917h(onHeadsetConnectionStateUpdate, "onHeadsetConnectionStateUpdate");
        C9612q.m13917h(onHeadsetAudioStateUpdate, "onHeadsetAudioStateUpdate");
        C9612q.m13917h(onHeadsetProxyConnectionUpdate, "onHeadsetProxyConnectionUpdate");
        C9612q.m13917h(onActiveDeviceUpdate, "onActiveDeviceUpdate");
        this.onHeadsetConnectionStateUpdate = onHeadsetConnectionStateUpdate;
        this.onHeadsetAudioStateUpdate = onHeadsetAudioStateUpdate;
        this.onHeadsetProxyConnectionUpdate = onHeadsetProxyConnectionUpdate;
        this.onActiveDeviceUpdate = onActiveDeviceUpdate;
    }

    public final Function1<BluetoothDevice, Unit> getOnActiveDeviceUpdate() {
        return this.onActiveDeviceUpdate;
    }

    public final Function1<BluetoothHeadsetAudioState.Update, Unit> getOnHeadsetAudioStateUpdate() {
        return this.onHeadsetAudioStateUpdate;
    }

    public final Function1<BluetoothProfileConnectionState.Update, Unit> getOnHeadsetConnectionStateUpdate() {
        return this.onHeadsetConnectionStateUpdate;
    }

    public final Function1<BluetoothHeadset, Unit> getOnHeadsetProxyConnectionUpdate() {
        return this.onHeadsetProxyConnectionUpdate;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        C9612q.m13917h(context, "context");
        if (intent == null) {
            return;
        }
        BluetoothBroadcastAction.Companion companion = BluetoothBroadcastAction.Companion;
        String action = intent.getAction();
        C9612q.m13920e(action);
        BluetoothBroadcastAction from = companion.from(action);
        if (from == null) {
            Log log = Log.INSTANCE;
            String action2 = intent.getAction();
            Log.w$default(log, TAG, "unable to parse BluetoothBroadcastAction for action: " + action2, (Throwable) null, 4, (Object) null);
            return;
        }
        Log log2 = Log.INSTANCE;
        Log.i$default(log2, TAG, "onReceive: action = " + from, (Throwable) null, 4, (Object) null);
        try {
            int i = WhenMappings.$EnumSwitchMapping$0[from.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        Log.w$default(log2, TAG, "unexpected " + from, (Throwable) null, 4, (Object) null);
                    } else {
                        this.onActiveDeviceUpdate.invoke(ExtensionsKt.getBluetoothDeviceExtra(intent));
                    }
                } else {
                    this.onHeadsetAudioStateUpdate.invoke(BluetoothHeadsetAudioState.Companion.getUpdate(intent));
                }
            } else {
                this.onHeadsetConnectionStateUpdate.invoke(BluetoothProfileConnectionState.Companion.getUpdate(intent));
            }
        } catch (Throwable th2) {
            Log log3 = Log.INSTANCE;
            log3.m31908w(TAG, "error handling " + from, th2);
        }
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public void onServiceConnected(int i, BluetoothProfile bluetoothProfile) {
        BluetoothHeadset bluetoothHeadset;
        if (i != 1 || !this.registered) {
            return;
        }
        Log.i$default(Log.INSTANCE, TAG, "BluetoothProfile.ServiceListener.onServiceConnected", (Throwable) null, 4, (Object) null);
        if (bluetoothProfile instanceof BluetoothHeadset) {
            bluetoothHeadset = (BluetoothHeadset) bluetoothProfile;
        } else {
            bluetoothHeadset = null;
        }
        this.headsetProxy = bluetoothHeadset;
        this.onHeadsetProxyConnectionUpdate.invoke(bluetoothHeadset);
    }

    @Override // android.bluetooth.BluetoothProfile.ServiceListener
    public void onServiceDisconnected(int i) {
        if (i != 1 || !this.registered) {
            return;
        }
        Log.i$default(Log.INSTANCE, TAG, "BluetoothProfile.ServiceListener.onServiceDisconnected", (Throwable) null, 4, (Object) null);
        this.headsetProxy = null;
        this.onHeadsetProxyConnectionUpdate.invoke(null);
    }

    public final void register(Context context) {
        boolean z;
        BluetoothAdapter adapter;
        C9612q.m13917h(context, "context");
        if (this.registered) {
            return;
        }
        Log log = Log.INSTANCE;
        Set<BluetoothBroadcastAction> set = actions;
        Log.i$default(log, TAG, "registering for broadcasts with actions: " + set, (Throwable) null, 4, (Object) null);
        IntentFilter intentFilter = new IntentFilter();
        for (BluetoothBroadcastAction bluetoothBroadcastAction : set) {
            intentFilter.addAction(bluetoothBroadcastAction.getAction());
        }
        context.registerReceiver(this, intentFilter);
        BluetoothHeadsetUtilsKt.registerActiveHeadsetReceiver(context, this);
        try {
            BluetoothManager bluetoothManager = (BluetoothManager) C0946a.m38395i(context, BluetoothManager.class);
            if (bluetoothManager != null && (adapter = bluetoothManager.getAdapter()) != null) {
                z = adapter.getProfileProxy(context, this, 1);
            } else {
                z = false;
            }
            if (z) {
                Log.i$default(Log.INSTANCE, TAG, "listening for HeadsetProfile proxy", (Throwable) null, 4, (Object) null);
            } else {
                Log.w$default(Log.INSTANCE, TAG, "listening for HeadsetProfile proxy failed", (Throwable) null, 4, (Object) null);
            }
        } catch (SecurityException e) {
            Log.INSTANCE.m31908w(TAG, "failed to get BluetoothHeadset profile", e);
        }
        this.registered = true;
    }
}
