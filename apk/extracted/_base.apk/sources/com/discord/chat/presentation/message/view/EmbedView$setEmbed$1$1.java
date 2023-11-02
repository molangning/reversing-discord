package com.discord.chat.presentation.message.view;

import com.discord.chat.databinding.EmbedViewBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC9614s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m14357d2 = {"<anonymous>", "", "portal", "", "invoke", "(Ljava/lang/Double;)V"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class EmbedView$setEmbed$1$1 extends AbstractC9614s implements Function1<Double, Unit> {
    final /* synthetic */ boolean $isObscure;
    final /* synthetic */ Function2<Double, Integer, Unit> $onMediaClicked;
    final /* synthetic */ EmbedView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EmbedView$setEmbed$1$1(Function2<? super Double, ? super Integer, Unit> function2, boolean z, EmbedView embedView) {
        super(1);
        this.$onMediaClicked = function2;
        this.$isObscure = z;
        this.this$0 = embedView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Double d) {
        invoke2(d);
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Double d) {
        EmbedViewBinding embedViewBinding;
        this.$onMediaClicked.invoke(d, null);
        if (this.$isObscure) {
            embedViewBinding = this.this$0.binding;
            embedViewBinding.spoiler.makeObscureHideButtonHidden();
        }
    }
}
