package p317r7;

import com.google.android.exoplayer2.Format;
import p008a7.C0034b;
import p008a7.C0040e;
import p008a7.C0047h;
import p008a7.C0048h0;
import p195k8.C9149a;
import p195k8.C9183l0;
import p296q6.C11765x;
import p296q6.InterfaceC11746i;
import p296q6.InterfaceC11747j;
import p296q6.InterfaceC11748k;
import p398w6.C13412f;
import p418x6.C13707g;

/* renamed from: r7.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12073b implements InterfaceC12087j {

    /* renamed from: d */
    private static final C11765x f31244d = new C11765x();

    /* renamed from: a */
    final InterfaceC11746i f31245a;

    /* renamed from: b */
    private final Format f31246b;

    /* renamed from: c */
    private final C9183l0 f31247c;

    public C12073b(InterfaceC11746i interfaceC11746i, Format format, C9183l0 c9183l0) {
        this.f31245a = interfaceC11746i;
        this.f31246b = format;
        this.f31247c = c9183l0;
    }

    @Override // p317r7.InterfaceC12087j
    /* renamed from: a */
    public boolean mo6260a(InterfaceC11747j interfaceC11747j) {
        return this.f31245a.mo660d(interfaceC11747j, f31244d) == 0;
    }

    @Override // p317r7.InterfaceC12087j
    /* renamed from: b */
    public void mo6259b(InterfaceC11748k interfaceC11748k) {
        this.f31245a.mo662b(interfaceC11748k);
    }

    @Override // p317r7.InterfaceC12087j
    /* renamed from: c */
    public void mo6258c() {
        this.f31245a.mo663a(0L, 0L);
    }

    @Override // p317r7.InterfaceC12087j
    /* renamed from: d */
    public boolean mo6257d() {
        InterfaceC11746i interfaceC11746i = this.f31245a;
        return (interfaceC11746i instanceof C0048h0) || (interfaceC11746i instanceof C13707g);
    }

    @Override // p317r7.InterfaceC12087j
    /* renamed from: e */
    public boolean mo6256e() {
        InterfaceC11746i interfaceC11746i = this.f31245a;
        return (interfaceC11746i instanceof C0047h) || (interfaceC11746i instanceof C0034b) || (interfaceC11746i instanceof C0040e) || (interfaceC11746i instanceof C13412f);
    }

    @Override // p317r7.InterfaceC12087j
    /* renamed from: f */
    public InterfaceC12087j mo6255f() {
        InterfaceC11746i c13412f;
        C9149a.m16447f(!mo6257d());
        InterfaceC11746i interfaceC11746i = this.f31245a;
        if (interfaceC11746i instanceof C12105u) {
            c13412f = new C12105u(this.f31246b.f11188l, this.f31247c);
        } else if (interfaceC11746i instanceof C0047h) {
            c13412f = new C0047h();
        } else if (interfaceC11746i instanceof C0034b) {
            c13412f = new C0034b();
        } else if (interfaceC11746i instanceof C0040e) {
            c13412f = new C0040e();
        } else if (interfaceC11746i instanceof C13412f) {
            c13412f = new C13412f();
        } else {
            throw new IllegalStateException("Unexpected extractor type for recreation: " + this.f31245a.getClass().getSimpleName());
        }
        return new C12073b(c13412f, this.f31246b, this.f31247c);
    }
}