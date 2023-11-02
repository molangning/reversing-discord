package com.discord.chat.presentation.message.view;

import com.discord.chat.databinding.MediaViewBinding;
import com.discord.chat.presentation.message.utils.SetMediaImagePlaceholderStatesKt;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m14357d2 = {"<anonymous>", "", "Lcom/facebook/drawee/backends/pipeline/PipelineDraweeControllerBuilder;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MediaView$setMediaData$1 extends AbstractC9614s implements Function1<PipelineDraweeControllerBuilder, Unit> {
    final /* synthetic */ MediaView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView$setMediaData$1(MediaView mediaView) {
        super(1);
        this.this$0 = mediaView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PipelineDraweeControllerBuilder pipelineDraweeControllerBuilder) {
        invoke2(pipelineDraweeControllerBuilder);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(PipelineDraweeControllerBuilder setOptionalImageUrl) {
        MediaViewBinding mediaViewBinding;
        C9612q.m13917h(setOptionalImageUrl, "$this$setOptionalImageUrl");
        mediaViewBinding = this.this$0.binding;
        SimpleDraweeView simpleDraweeView = mediaViewBinding.inlineMediaImagePreview;
        C9612q.m13918g(simpleDraweeView, "binding.inlineMediaImagePreview");
        SetMediaImagePlaceholderStatesKt.setMediaImagePlaceholderStates(setOptionalImageUrl, simpleDraweeView);
    }
}