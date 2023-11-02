package com.discord.chat.presentation.list;

import android.animation.Animator;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "it", "Landroid/animation/Animator;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ChatListHighlightItemAtPositionKt$animateBackgroundColor$1 extends AbstractC9614s implements Function1<Animator, Unit> {
    final /* synthetic */ long $delay;
    final /* synthetic */ int $endColor;
    final /* synthetic */ int $startColor;
    final /* synthetic */ View $this_animateBackgroundColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatListHighlightItemAtPositionKt$animateBackgroundColor$1(int i, int i2, long j, View view) {
        super(1);
        this.$endColor = i;
        this.$startColor = i2;
        this.$delay = j;
        this.$this_animateBackgroundColor = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Animator animator) {
        invoke2(animator);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(Animator it) {
        C9612q.m13917h(it, "it");
        ChatListHighlightItemAtPositionKt.animateBackgroundColor$anim$default(this.$delay, this.$this_animateBackgroundColor, this.$endColor, this.$startColor, null, 16, null);
    }
}