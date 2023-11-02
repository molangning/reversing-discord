package p460z7;

import android.text.Spannable;

/* renamed from: z7.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C14105c {
    /* renamed from: a */
    public static void m656a(Spannable spannable, Object obj, int i, int i2, int i3) {
        Object[] spans;
        for (Object obj2 : spannable.getSpans(i, i2, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i && spannable.getSpanEnd(obj2) == i2 && spannable.getSpanFlags(obj2) == i3) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i, i2, i3);
    }
}