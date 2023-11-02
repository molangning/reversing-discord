package p006a5;

/* renamed from: a5.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C0025b {

    /* renamed from: a */
    public static final InterfaceC0027b f39a = new C0028c();

    /* renamed from: b */
    private static volatile InterfaceC0029d f40b = null;

    /* renamed from: a5.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC0027b {
    }

    /* renamed from: a5.b$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C0028c implements InterfaceC0027b {
        private C0028c() {
        }
    }

    /* renamed from: a5.b$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC0029d {
        /* renamed from: a */
        void mo41374a(String str);

        /* renamed from: b */
        void mo41373b();

        boolean isTracing();
    }

    private C0025b() {
    }

    /* renamed from: a */
    public static void m41378a(String str) {
        m41376c().mo41374a(str);
    }

    /* renamed from: b */
    public static void m41377b() {
        m41376c().mo41373b();
    }

    /* renamed from: c */
    private static InterfaceC0029d m41376c() {
        if (f40b == null) {
            synchronized (C0025b.class) {
                if (f40b == null) {
                    f40b = new C0024a();
                }
            }
        }
        return f40b;
    }

    /* renamed from: d */
    public static boolean m41375d() {
        return m41376c().isTracing();
    }
}