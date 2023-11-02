package p392w0;

import android.annotation.SuppressLint;
import android.webkit.WebSettings;
import p412x0.C13661d;
import p412x0.C13665g;
import p412x0.EnumC13662e;

/* renamed from: w0.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C13355b {
    /* renamed from: a */
    private static C13661d m2717a(WebSettings webSettings) {
        return C13665g.m1891c().m1886a(webSettings);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public static void m2716b(WebSettings webSettings, int i) {
        EnumC13662e enumC13662e = EnumC13662e.FORCE_DARK;
        if (enumC13662e.m1896f()) {
            webSettings.setForceDark(i);
        } else if (enumC13662e.m1895g()) {
            m2717a(webSettings).m1903a(i);
        } else {
            throw EnumC13662e.m1899c();
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: c */
    public static void m2715c(WebSettings webSettings, int i) {
        if (EnumC13662e.FORCE_DARK_STRATEGY.m1895g()) {
            m2717a(webSettings).m1902b(i);
            return;
        }
        throw EnumC13662e.m1899c();
    }
}