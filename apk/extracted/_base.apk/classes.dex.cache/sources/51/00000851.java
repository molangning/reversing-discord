package androidx.transition;

import android.view.ViewGroup;
import p330s0.C12340c;

/* renamed from: androidx.transition.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1879h {

    /* renamed from: a */
    private ViewGroup f5182a;

    /* renamed from: b */
    private Runnable f5183b;

    /* renamed from: b */
    public static C1879h m35150b(ViewGroup viewGroup) {
        return (C1879h) viewGroup.getTag(C12340c.f32182b);
    }

    /* renamed from: c */
    public static void m35149c(ViewGroup viewGroup, C1879h c1879h) {
        viewGroup.setTag(C12340c.f32182b, c1879h);
    }

    /* renamed from: a */
    public void m35151a() {
        Runnable runnable;
        if (m35150b(this.f5182a) == this && (runnable = this.f5183b) != null) {
            runnable.run();
        }
    }
}