package com.discord.audio;

import com.discord.audio.enums.BluetoothProfileConnectionState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9609n;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public /* synthetic */ class DiscordAudioManager$bluetoothBroadcastReceiver$1 extends C9609n implements Function1<BluetoothProfileConnectionState.Update, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public DiscordAudioManager$bluetoothBroadcastReceiver$1(Object obj) {
        super(1, obj, DiscordAudioManager.class, "onHeadsetConnectionStateUpdate", "onHeadsetConnectionStateUpdate(Lcom/discord/audio/enums/BluetoothProfileConnectionState$Update;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BluetoothProfileConnectionState.Update update) {
        invoke2(update);
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(BluetoothProfileConnectionState.Update p0) {
        C9612q.m13917h(p0, "p0");
        ((DiscordAudioManager) this.receiver).onHeadsetConnectionStateUpdate(p0);
    }
}
