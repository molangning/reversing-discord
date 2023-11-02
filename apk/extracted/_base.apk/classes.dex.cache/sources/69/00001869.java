package com.discord.image.fresco;

import com.facebook.drawee.span.DraweeSpanStringBuilder;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005"}, m14357d2 = {"setOptionalText", "", "Lcom/facebook/drawee/span/SimpleDraweeSpanTextView;", "builder", "Lcom/facebook/drawee/span/DraweeSpanStringBuilder;", "fresco_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class SimpleDraweeSpanTextViewUtilsKt {
    public static final void setOptionalText(SimpleDraweeSpanTextView simpleDraweeSpanTextView, DraweeSpanStringBuilder draweeSpanStringBuilder) {
        int i;
        C9612q.m13917h(simpleDraweeSpanTextView, "<this>");
        if (draweeSpanStringBuilder != null) {
            simpleDraweeSpanTextView.setDraweeSpanStringBuilder(draweeSpanStringBuilder);
            i = 0;
        } else {
            i = 8;
        }
        simpleDraweeSpanTextView.setVisibility(i);
    }
}