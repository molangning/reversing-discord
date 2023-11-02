package com.discord.chat.presentation.message.view;

import com.discord.chat.databinding.ObscureOverlayViewBinding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m14357d2 = {"<anonymous>", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ObscureOverlayView$configure$1 extends AbstractC9614s implements Function0<Unit> {
    final /* synthetic */ Function0<Unit> $onHide;
    final /* synthetic */ ObscureOverlayView this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ObscureOverlayView$configure$1(Function0<Unit> function0, ObscureOverlayView obscureOverlayView) {
        super(0);
        this.$onHide = function0;
        this.this$0 = obscureOverlayView;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ObscureOverlayViewBinding obscureOverlayViewBinding;
        this.$onHide.invoke();
        obscureOverlayViewBinding = this.this$0.binding;
        obscureOverlayViewBinding.revealButton.requestFocus();
    }
}
