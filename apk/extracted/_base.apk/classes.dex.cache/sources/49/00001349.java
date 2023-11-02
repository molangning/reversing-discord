package com.discord.chat.presentation.message.view;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m14357d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class EmbedView$setFields$1$1 extends AbstractC9614s implements Function0<View> {
    final /* synthetic */ LinearLayout $this_apply;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbedView$setFields$1$1(LinearLayout linearLayout) {
        super(0);
        this.$this_apply = linearLayout;
    }

    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        Context context = this.$this_apply.getContext();
        C9612q.m13918g(context, "context");
        return new EmbedFieldView(context, null, 0, 6, null);
    }
}