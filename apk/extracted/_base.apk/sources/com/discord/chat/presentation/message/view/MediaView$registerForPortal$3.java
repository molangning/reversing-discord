package com.discord.chat.presentation.message.view;

import android.view.View;
import com.discord.media_player.MediaPlayer;
import com.discord.media_player.MediaPlayerManagerModule;
import com.discord.media_player.MediaSource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MediaView$registerForPortal$3 extends AbstractC9614s implements Function1<View, Unit> {
    final /* synthetic */ MediaPlayer $mediaPlayer;
    final /* synthetic */ MediaSource $mediaSource;
    final /* synthetic */ double $portal;
    final /* synthetic */ MediaView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView$registerForPortal$3(MediaView mediaView, MediaPlayer mediaPlayer, double d, MediaSource mediaSource) {
        super(1);
        this.this$0 = mediaView;
        this.$mediaPlayer = mediaPlayer;
        this.$portal = d;
        this.$mediaSource = mediaSource;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(View it) {
        MediaPlayerManagerModule mediaPlayerManagerModule;
        MediaSource mediaSource;
        C9612q.m13917h(it, "it");
        this.this$0.mediaVolumeOn = !this.$mediaPlayer.isMuted();
        mediaPlayerManagerModule = this.this$0.managerModule;
        if (mediaPlayerManagerModule != null) {
            mediaPlayerManagerModule.stopPlayerProgressInterval(this.$portal);
        }
        Double portal = this.$mediaSource.getPortal();
        mediaSource = this.this$0.mediaSource;
        if (C9612q.m13924a(portal, mediaSource != null ? mediaSource.getPortal() : null) && !this.$mediaPlayer.hasEnded() && this.this$0.isAttachedToWindow()) {
            return;
        }
        this.this$0.releasePlayer();
    }
}
