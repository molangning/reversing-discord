package p312r2;

import com.facebook.common.internal.Supplier;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import p276p2.InterfaceC11373a;
import p292q2.InterfaceC11685a;
import p312r2.InterfaceC12034c;
import p378v2.C13052a;
import p378v2.C13054c;
import p394w2.C13379j;
import p414x2.C13677a;

/* renamed from: r2.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12041e implements InterfaceC12034c {

    /* renamed from: f */
    private static final Class<?> f31091f = C12041e.class;

    /* renamed from: a */
    private final int f31092a;

    /* renamed from: b */
    private final Supplier<File> f31093b;

    /* renamed from: c */
    private final String f31094c;

    /* renamed from: d */
    private final InterfaceC11685a f31095d;

    /* renamed from: e */
    volatile C12042a f31096e = new C12042a(null, null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r2.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C12042a {

        /* renamed from: a */
        public final InterfaceC12034c f31097a;

        /* renamed from: b */
        public final File f31098b;

        C12042a(File file, InterfaceC12034c interfaceC12034c) {
            this.f31097a = interfaceC12034c;
            this.f31098b = file;
        }
    }

    public C12041e(int i, Supplier<File> supplier, String str, InterfaceC11685a interfaceC11685a) {
        this.f31092a = i;
        this.f31095d = interfaceC11685a;
        this.f31093b = supplier;
        this.f31094c = str;
    }

    /* renamed from: j */
    private void m6501j() {
        File file = new File(this.f31093b.get(), this.f31094c);
        m6502i(file);
        this.f31096e = new C12042a(file, new C12024a(file, this.f31092a, this.f31095d));
    }

    /* renamed from: m */
    private boolean m6498m() {
        File file;
        C12042a c12042a = this.f31096e;
        if (c12042a.f31097a != null && (file = c12042a.f31098b) != null && file.exists()) {
            return false;
        }
        return true;
    }

    @Override // p312r2.InterfaceC12034c
    /* renamed from: a */
    public void mo6510a() {
        m6499l().mo6510a();
    }

    @Override // p312r2.InterfaceC12034c
    /* renamed from: b */
    public void mo6509b() {
        try {
            m6499l().mo6509b();
        } catch (IOException e) {
            C13677a.m1857g(f31091f, "purgeUnexpectedResources", e);
        }
    }

    @Override // p312r2.InterfaceC12034c
    /* renamed from: c */
    public boolean mo6508c(String str, Object obj) {
        return m6499l().mo6508c(str, obj);
    }

    @Override // p312r2.InterfaceC12034c
    /* renamed from: d */
    public InterfaceC12034c.InterfaceC12036b mo6507d(String str, Object obj) {
        return m6499l().mo6507d(str, obj);
    }

    @Override // p312r2.InterfaceC12034c
    /* renamed from: e */
    public boolean mo6506e(String str, Object obj) {
        return m6499l().mo6506e(str, obj);
    }

    @Override // p312r2.InterfaceC12034c
    /* renamed from: f */
    public InterfaceC11373a mo6505f(String str, Object obj) {
        return m6499l().mo6505f(str, obj);
    }

    @Override // p312r2.InterfaceC12034c
    /* renamed from: g */
    public Collection<InterfaceC12034c.InterfaceC12035a> mo6504g() {
        return m6499l().mo6504g();
    }

    @Override // p312r2.InterfaceC12034c
    /* renamed from: h */
    public long mo6503h(InterfaceC12034c.InterfaceC12035a interfaceC12035a) {
        return m6499l().mo6503h(interfaceC12035a);
    }

    /* renamed from: i */
    void m6502i(File file) {
        try {
            C13054c.m3381a(file);
            C13677a.m1863a(f31091f, "Created cache directory %s", file.getAbsolutePath());
        } catch (C13054c.C13055a e) {
            this.f31095d.mo7170a(InterfaceC11685a.EnumC11686a.WRITE_CREATE_DIR, f31091f, "createRootDirectoryIfNecessary", e);
            throw e;
        }
    }

    @Override // p312r2.InterfaceC12034c
    public boolean isExternal() {
        try {
            return m6499l().isExternal();
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: k */
    void m6500k() {
        if (this.f31096e.f31097a != null && this.f31096e.f31098b != null) {
            C13052a.m3386b(this.f31096e.f31098b);
        }
    }

    /* renamed from: l */
    synchronized InterfaceC12034c m6499l() {
        if (m6498m()) {
            m6500k();
            m6501j();
        }
        return (InterfaceC12034c) C13379j.m2677g(this.f31096e.f31097a);
    }

    @Override // p312r2.InterfaceC12034c
    public long remove(String str) {
        return m6499l().remove(str);
    }
}
