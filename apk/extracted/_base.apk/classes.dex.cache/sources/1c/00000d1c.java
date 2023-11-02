package com.discord.audio;

import android.bluetooth.BluetoothHeadset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9609n;

@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public /* synthetic */ class DiscordAudioManager$bluetoothBroadcastReceiver$3 extends C9609n implements Function1<BluetoothHeadset, Unit> {
    public DiscordAudioManager$bluetoothBroadcastReceiver$3(Object obj) {
        super(1, obj, DiscordAudioManager.class, "onHeadsetProxyConnectionUpdate", "onHeadsetProxyConnectionUpdate(Landroid/bluetooth/BluetoothHeadset;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BluetoothHeadset bluetoothHeadset) {
        invoke2(bluetoothHeadset);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(BluetoothHeadset bluetoothHeadset) {
        ((DiscordAudioManager) this.receiver).onHeadsetProxyConnectionUpdate(bluetoothHeadset);
    }
}