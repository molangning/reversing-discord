package p129h5;

/* renamed from: h5.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C7018a {

    /* renamed from: a */
    private static InterfaceC7019b f19207a;

    private C7018a() {
    }

    /* renamed from: a */
    public static void m21534a(InterfaceC7019b interfaceC7019b) {
        synchronized (C7018a.class) {
            if (f19207a == null) {
                f19207a = interfaceC7019b;
            } else {
                throw new IllegalStateException("Cannot re-initialize NativeLoader.");
            }
        }
    }

    /* renamed from: b */
    public static void m21533b(InterfaceC7019b interfaceC7019b) {
        if (!m21532c()) {
            m21534a(interfaceC7019b);
        }
    }

    /* renamed from: c */
    public static boolean m21532c() {
        boolean z;
        synchronized (C7018a.class) {
            if (f19207a != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: d */
    public static boolean m21531d(String str) {
        return m21530e(str, 0);
    }

    /* renamed from: e */
    public static boolean m21530e(String str, int i) {
        InterfaceC7019b interfaceC7019b;
        synchronized (C7018a.class) {
            interfaceC7019b = f19207a;
            if (interfaceC7019b == null) {
                throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
            }
        }
        return interfaceC7019b.mo21529a(str, i);
    }
}