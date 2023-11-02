package bb;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C4911o;

/* renamed from: bb.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2236h {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C2229d m33882a(int i) {
        if (i != 0) {
            if (i != 1) {
                return m33881b();
            }
            return new C2230e();
        }
        return new C2238j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C2229d m33881b() {
        return new C2238j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C2231f m33880c() {
        return new C2231f();
    }

    /* renamed from: d */
    public static void m33879d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C2232g) {
            ((C2232g) background).m33920X(f);
        }
    }

    /* renamed from: e */
    public static void m33878e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C2232g) {
            m33877f(view, (C2232g) background);
        }
    }

    /* renamed from: f */
    public static void m33877f(View view, C2232g c2232g) {
        if (c2232g.m33927Q()) {
            c2232g.m33915b0(C4911o.m26934d(view));
        }
    }
}
