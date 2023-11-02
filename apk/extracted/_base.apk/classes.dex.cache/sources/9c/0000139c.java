package com.discord.chat.presentation.message.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.transition.C1867c;
import androidx.transition.C1880i;
import androidx.transition.C1881j;
import androidx.transition.Transition;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m14357d2 = {"<anonymous>", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class SpoilerView$onClick$1 extends AbstractC9614s implements Function0<Unit> {
    final /* synthetic */ View $overlayView;
    final /* synthetic */ boolean $showImage;
    final /* synthetic */ SpoilerView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpoilerView$onClick$1(SpoilerView spoilerView, boolean z, View view) {
        super(0);
        this.this$0 = spoilerView;
        this.$showImage = z;
        this.$overlayView = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2() {
        ViewParent parent;
        if (this.this$0.getParent().getParent() instanceof ViewGroup) {
            parent = this.this$0.getParent().getParent();
        } else {
            parent = this.this$0.getParent() instanceof ViewGroup ? this.this$0.getParent() : this.this$0;
        }
        C9612q.m13919f(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) parent;
        C1867c c1867c = new C1867c(this.$showImage ? 2 : 1);
        final boolean z = this.$showImage;
        final SpoilerView spoilerView = this.this$0;
        c1867c.mo35138X(150L);
        c1867c.mo35134b(new C1880i() { // from class: com.discord.chat.presentation.message.view.SpoilerView$onClick$1$transition$1$1
            @Override // androidx.transition.C1880i, androidx.transition.Transition.InterfaceC1848f
            public void onTransitionEnd(Transition transition) {
                Function0 function0;
                Function0 function02;
                C9612q.m13917h(transition, "transition");
                if (z) {
                    function02 = spoilerView.onReveal;
                    function02.invoke();
                    spoilerView.isOverlayVisible = false;
                    return;
                }
                function0 = spoilerView.onHide;
                function0.invoke();
                spoilerView.isOverlayVisible = true;
            }
        });
        C1881j.m35148a(viewGroup, c1867c);
        this.$overlayView.setVisibility(this.$showImage ^ true ? 0 : 8);
    }
}