package p439y6;

import android.net.Uri;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p151i6.C7402m;
import p195k8.C9149a;
import p195k8.C9208y;
import p296q6.C11752n;
import p296q6.C11765x;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11746i;
import p296q6.InterfaceC11747j;
import p296q6.InterfaceC11748k;
import p296q6.InterfaceC11753o;

/* renamed from: y6.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13916d implements InterfaceC11746i {

    /* renamed from: d */
    public static final InterfaceC11753o f35809d = new InterfaceC11753o() { // from class: y6.c
        @Override // p296q6.InterfaceC11753o
        /* renamed from: a */
        public /* synthetic */ InterfaceC11746i[] mo1203a(Uri uri, Map map) {
            return C11752n.m7006a(this, uri, map);
        }

        @Override // p296q6.InterfaceC11753o
        /* renamed from: b */
        public final InterfaceC11746i[] mo1202b() {
            InterfaceC11746i[] m1200f;
            m1200f = C13916d.m1200f();
            return m1200f;
        }
    };

    /* renamed from: a */
    private InterfaceC11748k f35810a;

    /* renamed from: b */
    private AbstractC13921i f35811b;

    /* renamed from: c */
    private boolean f35812c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ InterfaceC11746i[] m1200f() {
        return new InterfaceC11746i[]{new C13916d()};
    }

    /* renamed from: g */
    private static C9208y m1199g(C9208y c9208y) {
        c9208y.m16099P(0);
        return c9208y;
    }

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    /* renamed from: h */
    private boolean m1198h(InterfaceC11747j interfaceC11747j) {
        C13918f c13918f = new C13918f();
        if (c13918f.m1190b(interfaceC11747j, true) && (c13918f.f35819b & 2) == 2) {
            int min = Math.min(c13918f.f35826i, 8);
            C9208y c9208y = new C9208y(min);
            interfaceC11747j.mo6963n(c9208y.m16094d(), 0, min);
            if (C13913b.m1205p(m1199g(c9208y))) {
                this.f35811b = new C13913b();
            } else if (C13925j.m1164r(m1199g(c9208y))) {
                this.f35811b = new C13925j();
            } else if (C13920h.m1185o(m1199g(c9208y))) {
                this.f35811b = new C13920h();
            }
            return true;
        }
        return false;
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: a */
    public void mo663a(long j, long j2) {
        AbstractC13921i abstractC13921i = this.f35811b;
        if (abstractC13921i != null) {
            abstractC13921i.m1176m(j, j2);
        }
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: b */
    public void mo662b(InterfaceC11748k interfaceC11748k) {
        this.f35810a = interfaceC11748k;
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: d */
    public int mo660d(InterfaceC11747j interfaceC11747j, C11765x c11765x) {
        C9149a.m16445h(this.f35810a);
        if (this.f35811b == null) {
            if (m1198h(interfaceC11747j)) {
                interfaceC11747j.mo6969e();
            } else {
                throw new C7402m("Failed to determine bitstream type");
            }
        }
        if (!this.f35812c) {
            InterfaceC11732b0 mo3740e = this.f35810a.mo3740e(0, 1);
            this.f35810a.mo3738s();
            this.f35811b.m1181d(this.f35810a, mo3740e);
            this.f35812c = true;
        }
        return this.f35811b.m1180g(interfaceC11747j, c11765x);
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: e */
    public boolean mo659e(InterfaceC11747j interfaceC11747j) {
        try {
            return m1198h(interfaceC11747j);
        } catch (C7402m unused) {
            return false;
        }
    }

    @Override // p296q6.InterfaceC11746i
    public void release() {
    }
}
