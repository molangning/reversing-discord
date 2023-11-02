package com.discord.chat.presentation.message.view;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "mediaViewAttached", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MediaView$attachStateChangeListener$1 extends AbstractC9614s implements Function1<Boolean, Unit> {
    final /* synthetic */ MediaView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView$attachStateChangeListener$1(MediaView mediaView) {
        super(1);
        this.this$0 = mediaView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f25302a;
    }

    public final void invoke(boolean z) {
        if (z) {
            MediaView.setMediaData$default(this.this$0, null, false, false, false, null, false, null, null, false, false, false, 0, null, null, null, null, null, 131069, null);
        } else {
            MediaView.setMediaData$default(this.this$0, null, true, false, false, null, false, null, null, false, false, false, 0, null, null, null, null, null, 131065, null);
        }
    }
}
