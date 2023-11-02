package com.discord.media_player;

import com.google.android.exoplayer2.SimpleExoPlayer;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "player", "Lcom/google/android/exoplayer2/SimpleExoPlayer;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
final class MediaPlayerManagerModule$changeProgress$1 extends AbstractC9614s implements Function1<SimpleExoPlayer, Unit> {
    final /* synthetic */ int $seekToSec;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaPlayerManagerModule$changeProgress$1(int i) {
        super(1);
        this.$seekToSec = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(SimpleExoPlayer simpleExoPlayer) {
        invoke2(simpleExoPlayer);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(SimpleExoPlayer player) {
        C9612q.m13917h(player, "player");
        player.m29533c0(TimeUnit.SECONDS.toMillis(this.$seekToSec));
    }
}