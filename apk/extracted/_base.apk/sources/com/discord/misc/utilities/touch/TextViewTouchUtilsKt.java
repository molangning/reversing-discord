package com.discord.misc.utilities.touch;

import android.text.Spannable;
import android.view.MotionEvent;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m14357d2 = {"getSpansUnderMotionEvent", "", "T", "Landroid/widget/TextView;", "event", "Landroid/view/MotionEvent;", "(Landroid/widget/TextView;Landroid/view/MotionEvent;)[Ljava/lang/Object;", "misc_utilities_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class TextViewTouchUtilsKt {
    public static final /* synthetic */ <T> T[] getSpansUnderMotionEvent(TextView textView, MotionEvent event) {
        Spannable spannable;
        C9612q.m13917h(textView, "<this>");
        C9612q.m13917h(event, "event");
        CharSequence text = textView.getText();
        if (text instanceof Spannable) {
            spannable = (Spannable) text;
        } else {
            spannable = null;
        }
        if (spannable == null) {
            C9612q.m13912m(0, "T?");
            return (T[]) new Object[0];
        }
        int x = (((int) event.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
        int lineForVertical = textView.getLayout().getLineForVertical((((int) event.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY());
        float lineRight = textView.getLayout().getLineRight(lineForVertical);
        float lineLeft = textView.getLayout().getLineLeft(lineForVertical);
        float f = x;
        if (f <= lineRight && (x < 0 || f >= lineLeft)) {
            int offsetForHorizontal = textView.getLayout().getOffsetForHorizontal(lineForVertical, f);
            C9612q.m13912m(4, "T");
            T[] tArr = (T[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, Object.class);
            C9612q.m13918g(tArr, "spannableText.getSpans(\n…     T::class.java,\n    )");
            return tArr;
        }
        C9612q.m13912m(0, "T?");
        return (T[]) new Object[0];
    }
}
