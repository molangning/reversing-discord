package com.discord.audio;

import com.discord.audio.enums.ScoAudioState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9609n;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public /* synthetic */ class DiscordAudioManager$audioManagerBroadcastReceiver$2 extends C9609n implements Function1<ScoAudioState.Update, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public DiscordAudioManager$audioManagerBroadcastReceiver$2(Object obj) {
        super(1, obj, DiscordAudioManager.class, "onScoAudioStateUpdate", "onScoAudioStateUpdate(Lcom/discord/audio/enums/ScoAudioState$Update;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ScoAudioState.Update update) {
        invoke2(update);
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ScoAudioState.Update p0) {
        C9612q.m13917h(p0, "p0");
        ((DiscordAudioManager) this.receiver).onScoAudioStateUpdate(p0);
    }
}
