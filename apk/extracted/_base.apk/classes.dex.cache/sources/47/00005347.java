package p459z6;

import com.google.android.exoplayer2.Format;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import p151i6.C7402m;
import p195k8.C9149a;
import p195k8.C9208y;
import p296q6.C11765x;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11746i;
import p296q6.InterfaceC11747j;
import p296q6.InterfaceC11748k;
import p296q6.InterfaceC11766y;

/* renamed from: z6.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C14102a implements InterfaceC11746i {

    /* renamed from: a */
    private final Format f36287a;

    /* renamed from: c */
    private InterfaceC11732b0 f36289c;

    /* renamed from: e */
    private int f36291e;

    /* renamed from: f */
    private long f36292f;

    /* renamed from: g */
    private int f36293g;

    /* renamed from: h */
    private int f36294h;

    /* renamed from: b */
    private final C9208y f36288b = new C9208y(9);

    /* renamed from: d */
    private int f36290d = 0;

    public C14102a(Format format) {
        this.f36287a = format;
    }

    /* renamed from: c */
    private boolean m661c(InterfaceC11747j interfaceC11747j) {
        this.f36288b.m16103L(8);
        if (!interfaceC11747j.mo6968g(this.f36288b.m16094d(), 0, 8, true)) {
            return false;
        }
        if (this.f36288b.m16084n() == 1380139777) {
            this.f36291e = this.f36288b.m16111D();
            return true;
        }
        throw new IOException("Input not RawCC");
    }

    @RequiresNonNull({"trackOutput"})
    /* renamed from: f */
    private void m658f(InterfaceC11747j interfaceC11747j) {
        while (this.f36293g > 0) {
            this.f36288b.m16103L(3);
            interfaceC11747j.readFully(this.f36288b.m16094d(), 0, 3);
            this.f36289c.mo6170a(this.f36288b, 3);
            this.f36294h += 3;
            this.f36293g--;
        }
        int i = this.f36294h;
        if (i > 0) {
            this.f36289c.mo6162f(this.f36292f, 1, i, 0, null);
        }
    }

    /* renamed from: g */
    private boolean m657g(InterfaceC11747j interfaceC11747j) {
        int i = this.f36291e;
        if (i == 0) {
            this.f36288b.m16103L(5);
            if (!interfaceC11747j.mo6968g(this.f36288b.m16094d(), 0, 5, true)) {
                return false;
            }
            this.f36292f = (this.f36288b.m16109F() * 1000) / 45;
        } else if (i == 1) {
            this.f36288b.m16103L(9);
            if (!interfaceC11747j.mo6968g(this.f36288b.m16094d(), 0, 9, true)) {
                return false;
            }
            this.f36292f = this.f36288b.m16075w();
        } else {
            throw new C7402m("Unsupported version number: " + this.f36291e);
        }
        this.f36293g = this.f36288b.m16111D();
        this.f36294h = 0;
        return true;
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: a */
    public void mo663a(long j, long j2) {
        this.f36290d = 0;
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: b */
    public void mo662b(InterfaceC11748k interfaceC11748k) {
        interfaceC11748k.mo3739i(new InterfaceC11766y.C11768b(-9223372036854775807L));
        InterfaceC11732b0 mo3740e = interfaceC11748k.mo3740e(0, 3);
        this.f36289c = mo3740e;
        mo3740e.mo6168c(this.f36287a);
        interfaceC11748k.mo3738s();
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: d */
    public int mo660d(InterfaceC11747j interfaceC11747j, C11765x c11765x) {
        C9149a.m16445h(this.f36289c);
        while (true) {
            int i = this.f36290d;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        m658f(interfaceC11747j);
                        this.f36290d = 1;
                        return 0;
                    }
                    throw new IllegalStateException();
                } else if (m657g(interfaceC11747j)) {
                    this.f36290d = 2;
                } else {
                    this.f36290d = 0;
                    return -1;
                }
            } else if (!m661c(interfaceC11747j)) {
                return -1;
            } else {
                this.f36290d = 1;
            }
        }
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: e */
    public boolean mo659e(InterfaceC11747j interfaceC11747j) {
        this.f36288b.m16103L(8);
        interfaceC11747j.mo6963n(this.f36288b.m16094d(), 0, 8);
        if (this.f36288b.m16084n() != 1380139777) {
            return false;
        }
        return true;
    }

    @Override // p296q6.InterfaceC11746i
    public void release() {
    }
}