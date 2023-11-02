package p170j4;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p170j4.C8793c;
import p394w2.C13367a;
import p394w2.C13379j;
import p394w2.C13386n;

/* renamed from: j4.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C8795d {

    /* renamed from: d */
    private static C8795d f23096d;

    /* renamed from: a */
    private int f23097a;

    /* renamed from: b */
    private List<C8793c.InterfaceC8794a> f23098b;

    /* renamed from: c */
    private final C8791a f23099c = new C8791a();

    private C8795d() {
        m17225f();
    }

    /* renamed from: b */
    public static C8793c m17229b(InputStream inputStream) {
        return m17227d().m17230a(inputStream);
    }

    /* renamed from: c */
    public static C8793c m17228c(InputStream inputStream) {
        try {
            return m17229b(inputStream);
        } catch (IOException e) {
            throw C13386n.m2666a(e);
        }
    }

    /* renamed from: d */
    public static synchronized C8795d m17227d() {
        C8795d c8795d;
        synchronized (C8795d.class) {
            if (f23096d == null) {
                f23096d = new C8795d();
            }
            c8795d = f23096d;
        }
        return c8795d;
    }

    /* renamed from: e */
    private static int m17226e(int i, InputStream inputStream, byte[] bArr) {
        boolean z;
        C13379j.m2677g(inputStream);
        C13379j.m2677g(bArr);
        if (bArr.length >= i) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2682b(Boolean.valueOf(z));
        if (inputStream.markSupported()) {
            try {
                inputStream.mark(i);
                return C13367a.m2701b(inputStream, bArr, 0, i);
            } finally {
                inputStream.reset();
            }
        }
        return C13367a.m2701b(inputStream, bArr, 0, i);
    }

    /* renamed from: f */
    private void m17225f() {
        this.f23097a = this.f23099c.mo17231b();
        List<C8793c.InterfaceC8794a> list = this.f23098b;
        if (list != null) {
            for (C8793c.InterfaceC8794a interfaceC8794a : list) {
                this.f23097a = Math.max(this.f23097a, interfaceC8794a.mo17231b());
            }
        }
    }

    /* renamed from: a */
    public C8793c m17230a(InputStream inputStream) {
        C13379j.m2677g(inputStream);
        int i = this.f23097a;
        byte[] bArr = new byte[i];
        int m17226e = m17226e(i, inputStream, bArr);
        C8793c mo17232a = this.f23099c.mo17232a(bArr, m17226e);
        if (mo17232a != null && mo17232a != C8793c.f23093c) {
            return mo17232a;
        }
        List<C8793c.InterfaceC8794a> list = this.f23098b;
        if (list != null) {
            for (C8793c.InterfaceC8794a interfaceC8794a : list) {
                C8793c mo17232a2 = interfaceC8794a.mo17232a(bArr, m17226e);
                if (mo17232a2 != null && mo17232a2 != C8793c.f23093c) {
                    return mo17232a2;
                }
            }
        }
        return C8793c.f23093c;
    }
}
