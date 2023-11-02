package com.discord.audio;

import android.bluetooth.BluetoothDevice;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9609n;

@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public /* synthetic */ class DiscordAudioManager$bluetoothBroadcastReceiver$4 extends C9609n implements Function1<BluetoothDevice, Unit> {
    public DiscordAudioManager$bluetoothBroadcastReceiver$4(Object obj) {
        super(1, obj, DiscordAudioManager.class, "onActiveDeviceUpdate", "onActiveDeviceUpdate(Landroid/bluetooth/BluetoothDevice;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BluetoothDevice bluetoothDevice) {
        invoke2(bluetoothDevice);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(BluetoothDevice bluetoothDevice) {
        ((DiscordAudioManager) this.receiver).onActiveDeviceUpdate(bluetoothDevice);
    }
}