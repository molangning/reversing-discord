package com.discord.chat.presentation.message.view;

import android.view.View;
import com.discord.chat.presentation.message.view.media.ViewAttachedListener;
import com.discord.media_player.MediaSource;
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MediaView$registerForPortal$4 extends AbstractC9614s implements Function1<View, Unit> {
    final /* synthetic */ MediaSource $mediaSource;
    final /* synthetic */ MediaView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView$registerForPortal$4(MediaSource mediaSource, MediaView mediaView) {
        super(1);
        this.$mediaSource = mediaSource;
        this.this$0 = mediaView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(View view) {
        MediaSource mediaSource;
        ViewAttachedListener viewAttachedListener;
        C9612q.m13917h(view, "view");
        Double portal = this.$mediaSource.getPortal();
        mediaSource = this.this$0.mediaSource;
        if (C9612q.m13924a(portal, mediaSource != null ? mediaSource.getPortal() : null)) {
            MediaView.setMediaData$default(this.this$0, null, false, false, false, null, false, null, null, false, false, false, 0, null, null, null, null, null, 131071, null);
            this.this$0.addView(view, 0);
            ViewMeasureExtensionsKt.measureAndLayout(this.this$0);
        }
        MediaView mediaView = this.this$0;
        viewAttachedListener = mediaView.attachStateChangeListener;
        mediaView.addOnAttachStateChangeListener(viewAttachedListener);
    }
}