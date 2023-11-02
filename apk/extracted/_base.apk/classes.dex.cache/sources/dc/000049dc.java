package p292q2;

import p292q2.InterfaceC11685a;

/* renamed from: q2.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11692f implements InterfaceC11685a {

    /* renamed from: a */
    private static C11692f f30491a;

    private C11692f() {
    }

    /* renamed from: b */
    public static synchronized C11692f m7169b() {
        C11692f c11692f;
        synchronized (C11692f.class) {
            if (f30491a == null) {
                f30491a = new C11692f();
            }
            c11692f = f30491a;
        }
        return c11692f;
    }

    @Override // p292q2.InterfaceC11685a
    /* renamed from: a */
    public void mo7170a(InterfaceC11685a.EnumC11686a enumC11686a, Class<?> cls, String str, Throwable th2) {
    }
}