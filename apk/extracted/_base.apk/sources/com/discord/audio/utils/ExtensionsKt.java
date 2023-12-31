package com.discord.audio.utils;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.os.Parcelable;
import androidx.core.content.C0955e;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0003H\u0000¢\u0006\u0002\u0010\u0004\u001a\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u0003H\u0000¢\u0006\u0002\u0010\u0004\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\u0003H\u0000\u001a\u001b\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0000¢\u0006\u0002\u0010\u000b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m14357d2 = {"NOT_SET", "", "getBluetoothAdapterPrevStateExtra", "Landroid/content/Intent;", "(Landroid/content/Intent;)Ljava/lang/Integer;", "getBluetoothAdapterStateExtra", "getBluetoothDeviceExtra", "Landroid/bluetooth/BluetoothDevice;", "getIntExtraOrNull", "key", "", "(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Integer;", "audio_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class ExtensionsKt {
    private static final int NOT_SET = Integer.MIN_VALUE;

    public static final Integer getBluetoothAdapterPrevStateExtra(Intent intent) {
        boolean z;
        C9612q.m13917h(intent, "<this>");
        Integer valueOf = Integer.valueOf(intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", Integer.MIN_VALUE));
        if (valueOf.intValue() == Integer.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return valueOf;
    }

    public static final Integer getBluetoothAdapterStateExtra(Intent intent) {
        boolean z;
        C9612q.m13917h(intent, "<this>");
        Integer valueOf = Integer.valueOf(intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE));
        if (valueOf.intValue() == Integer.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return valueOf;
    }

    public static final BluetoothDevice getBluetoothDeviceExtra(Intent intent) {
        C9612q.m13917h(intent, "<this>");
        return (BluetoothDevice) ((Parcelable) C0955e.m38374b(intent, "android.bluetooth.device.extra.DEVICE", BluetoothDevice.class));
    }

    public static final Integer getIntExtraOrNull(Intent intent, String key) {
        boolean z;
        C9612q.m13917h(intent, "<this>");
        C9612q.m13917h(key, "key");
        Integer valueOf = Integer.valueOf(intent.getIntExtra(key, Integer.MIN_VALUE));
        if (valueOf.intValue() == Integer.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return valueOf;
    }
}
