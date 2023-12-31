package com.discord.audio.bluetooth;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0001\u001a\u000e\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¨\u0006\t"}, m14357d2 = {"getActiveHeadset", "Landroid/bluetooth/BluetoothDevice;", "Landroid/bluetooth/BluetoothHeadset;", "getActiveHeadsetFallback", "registerActiveHeadsetReceiver", "", "Landroid/content/Context;", "receiver", "Landroid/content/BroadcastReceiver;", "audio_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class BluetoothHeadsetUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"MissingPermission"})
    public static final BluetoothDevice getActiveHeadset(BluetoothHeadset bluetoothHeadset) {
        C9612q.m13917h(bluetoothHeadset, "<this>");
        List<BluetoothDevice> connectedDevices = bluetoothHeadset.getConnectedDevices();
        BluetoothDevice bluetoothDevice = null;
        if (connectedDevices != null) {
            Iterator<T> it = connectedDevices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (bluetoothHeadset.isAudioConnected((BluetoothDevice) next)) {
                    bluetoothDevice = next;
                    break;
                }
            }
            bluetoothDevice = bluetoothDevice;
        }
        if (bluetoothDevice == null) {
            return getActiveHeadsetFallback(bluetoothHeadset);
        }
        return bluetoothDevice;
    }

    private static final BluetoothDevice getActiveHeadsetFallback(BluetoothHeadset bluetoothHeadset) {
        try {
            Object invoke = BluetoothHeadset.class.getDeclaredMethod("getActiveDevice", new Class[0]).invoke(bluetoothHeadset, new Object[0]);
            if (!(invoke instanceof BluetoothDevice)) {
                return null;
            }
            return (BluetoothDevice) invoke;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final void registerActiveHeadsetReceiver(Context context, BroadcastReceiver receiver) {
        C9612q.m13917h(context, "<this>");
        C9612q.m13917h(receiver, "receiver");
        try {
            String str = null;
            Object obj = BluetoothHeadset.class.getField("ACTION_ACTIVE_DEVICE_CHANGED").get(null);
            if (obj instanceof String) {
                str = (String) obj;
            }
            if (str != null) {
                context.registerReceiver(receiver, new IntentFilter(str));
            }
        } catch (Throwable unused) {
        }
    }
}