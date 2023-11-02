package p008a7;

import android.net.Uri;
import java.util.Map;
import p008a7.InterfaceC0052i0;
import p193k6.C9066b;
import p195k8.C9208y;
import p296q6.C11752n;
import p296q6.C11765x;
import p296q6.InterfaceC11746i;
import p296q6.InterfaceC11747j;
import p296q6.InterfaceC11748k;
import p296q6.InterfaceC11753o;
import p296q6.InterfaceC11766y;

/* renamed from: a7.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0034b implements InterfaceC11746i {

    /* renamed from: d */
    public static final InterfaceC11753o f61d = new InterfaceC11753o() { // from class: a7.a
        @Override // p296q6.InterfaceC11753o
        /* renamed from: a */
        public /* synthetic */ InterfaceC11746i[] mo1203a(Uri uri, Map map) {
            return C11752n.m7006a(this, uri, map);
        }

        @Override // p296q6.InterfaceC11753o
        /* renamed from: b */
        public final InterfaceC11746i[] mo1202b() {
            InterfaceC11746i[] m41358f;
            m41358f = C0034b.m41358f();
            return m41358f;
        }
    };

    /* renamed from: a */
    private final C0036c f62a = new C0036c();

    /* renamed from: b */
    private final C9208y f63b = new C9208y(2786);

    /* renamed from: c */
    private boolean f64c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ InterfaceC11746i[] m41358f() {
        return new InterfaceC11746i[]{new C0034b()};
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: a */
    public void mo663a(long j, long j2) {
        this.f64c = false;
        this.f62a.mo41216c();
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: b */
    public void mo662b(InterfaceC11748k interfaceC11748k) {
        this.f62a.mo41214e(interfaceC11748k, new InterfaceC0052i0.C0056d(0, 1));
        interfaceC11748k.mo3738s();
        interfaceC11748k.mo3739i(new InterfaceC11766y.C11768b(-9223372036854775807L));
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: d */
    public int mo660d(InterfaceC11747j interfaceC11747j, C11765x c11765x) {
        int read = interfaceC11747j.read(this.f63b.m16094d(), 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.f63b.m16099P(0);
        this.f63b.m16100O(read);
        if (!this.f64c) {
            this.f62a.mo41213f(0L, 4);
            this.f64c = true;
        }
        this.f62a.mo41218a(this.f63b);
        return 0;
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: e */
    public boolean mo659e(InterfaceC11747j interfaceC11747j) {
        C9208y c9208y = new C9208y(10);
        int i = 0;
        while (true) {
            interfaceC11747j.mo6963n(c9208y.m16094d(), 0, 10);
            c9208y.m16099P(0);
            if (c9208y.m16108G() != 4801587) {
                break;
            }
            c9208y.m16098Q(3);
            int m16112C = c9208y.m16112C();
            i += m16112C + 10;
            interfaceC11747j.mo6967i(m16112C);
        }
        interfaceC11747j.mo6969e();
        interfaceC11747j.mo6967i(i);
        int i2 = 0;
        int i3 = i;
        while (true) {
            interfaceC11747j.mo6963n(c9208y.m16094d(), 0, 6);
            c9208y.m16099P(0);
            if (c9208y.m16105J() != 2935) {
                interfaceC11747j.mo6969e();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                interfaceC11747j.mo6967i(i3);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int m16774f = C9066b.m16774f(c9208y.m16094d());
                if (m16774f == -1) {
                    return false;
                }
                interfaceC11747j.mo6967i(m16774f - 6);
            }
        }
    }

    @Override // p296q6.InterfaceC11746i
    public void release() {
    }
}
