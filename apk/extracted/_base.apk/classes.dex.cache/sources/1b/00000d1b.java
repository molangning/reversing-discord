package com.discord.audio;

import com.discord.audio.enums.BluetoothHeadsetAudioState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9609n;
import kotlin.jvm.internal.C9612q;

@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public /* synthetic */ class DiscordAudioManager$bluetoothBroadcastReceiver$2 extends C9609n implements Function1<BluetoothHeadsetAudioState.Update, Unit> {
    public DiscordAudioManager$bluetoothBroadcastReceiver$2(Object obj) {
        super(1, obj, DiscordAudioManager.class, "onHeadsetAudioStateUpdate", "onHeadsetAudioStateUpdate(Lcom/discord/audio/enums/BluetoothHeadsetAudioState$Update;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BluetoothHeadsetAudioState.Update update) {
        invoke2(update);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(BluetoothHeadsetAudioState.Update p0) {
        C9612q.m13917h(p0, "p0");
        ((DiscordAudioManager) this.receiver).onHeadsetAudioStateUpdate(p0);
    }
}