package com.discord;

import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¨\u0006\u0007"}, m14357d2 = {"setTextSizeSp", "", "Landroid/widget/TextView;", "textSizeSp", "", "sizeSp", "maxScaledSizeSp", "fonts_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class SetTextSizeSpKt {
    public static final void setTextSizeSp(TextView textView, float f) {
        C9612q.m13917h(textView, "<this>");
        textView.setTextSize(2, f);
    }

    public static /* synthetic */ void setTextSizeSp$default(TextView textView, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f2 = Float.MAX_VALUE;
        }
        setTextSizeSp(textView, f, f2);
    }

    public static final void setTextSizeSp(TextView textView, float f, float f2) {
        C9612q.m13917h(textView, "<this>");
        float f3 = textView.getContext().getResources().getConfiguration().fontScale;
        float f4 = f / f3;
        setTextSizeSp(textView, f4 * Math.min(f3, f2 / f4));
    }
}
