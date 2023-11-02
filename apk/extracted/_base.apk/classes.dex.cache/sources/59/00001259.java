package com.discord.chat.presentation.list.messagebundling;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0007"}, m14357d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "<anonymous parameter 1>", "", "height", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class MessageBundleAdapter$delegates$1 extends AbstractC9614s implements Function3<View, Integer, Integer, Unit> {
    final /* synthetic */ MessageBundleAdapter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageBundleAdapter$delegates$1(MessageBundleAdapter messageBundleAdapter) {
        super(3);
        this.this$0 = messageBundleAdapter;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(View view, Integer num, Integer num2) {
        invoke(view, num.intValue(), num2.intValue());
        return Unit.f25302a;
    }

    public final void invoke(View view, int i, int i2) {
        C9612q.m13917h(view, "view");
        this.this$0.handleTruncation(view, i2);
    }
}