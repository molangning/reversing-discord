package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* renamed from: androidx.appcompat.widget.s1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0570s1 {

    /* renamed from: androidx.appcompat.widget.s1$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0571a {
        /* renamed from: a */
        static void m39701a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static void m39702a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            C0571a.m39701a(view, charSequence);
        } else {
            View$OnLongClickListenerC0593v1.m39616h(view, charSequence);
        }
    }
}