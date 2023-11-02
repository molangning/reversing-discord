package p021b1;

import android.content.Context;
import java.util.Map;

/* renamed from: b1.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C2078q {

    /* renamed from: a */
    private static volatile Object f5809a;

    private C2078q() {
    }

    /* renamed from: a */
    public static void m34348a(InterfaceC2025c0 interfaceC2025c0) {
        m34346c();
        if (f5809a == null) {
            return;
        }
        try {
            C2109y0.m34189i(f5809a, "disableSigning", null, new Object[0]);
        } catch (Exception e) {
            interfaceC2025c0.mo34445a("Invoking Signer disableSigning() received an error [%s]", e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m34347b(InterfaceC2025c0 interfaceC2025c0) {
        m34346c();
        if (f5809a == null) {
            return;
        }
        try {
            C2109y0.m34189i(f5809a, "enableSigning", null, new Object[0]);
        } catch (Exception e) {
            interfaceC2025c0.mo34445a("Invoking Signer enableSigning() received an error [%s]", e.getMessage());
        }
    }

    /* renamed from: c */
    private static void m34346c() {
        if (f5809a == null) {
            synchronized (C2078q.class) {
                if (f5809a == null) {
                    f5809a = C2109y0.m34196b("com.adjust.sdk.sig.Signer");
                }
            }
        }
    }

    /* renamed from: d */
    public static void m34345d(InterfaceC2025c0 interfaceC2025c0) {
        m34346c();
        if (f5809a == null) {
            return;
        }
        try {
            C2109y0.m34189i(f5809a, "onResume", null, new Object[0]);
        } catch (Exception e) {
            interfaceC2025c0.mo34445a("Invoking Signer onResume() received an error [%s]", e.getMessage());
        }
    }

    /* renamed from: e */
    public static void m34344e(Map<String, String> map, String str, String str2, Context context, InterfaceC2025c0 interfaceC2025c0) {
        m34346c();
        if (f5809a == null) {
            return;
        }
        try {
            C2109y0.m34189i(f5809a, "sign", new Class[]{Context.class, Map.class, String.class, String.class}, context, map, str, str2);
        } catch (Exception e) {
            interfaceC2025c0.mo34445a("Invoking Signer sign() for %s received an error [%s]", str, e.getMessage());
        }
    }
}