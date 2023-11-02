package p008a7;

import android.net.Uri;
import java.util.Map;
import p008a7.InterfaceC0052i0;
import p193k6.C9070c;
import p195k8.C9208y;
import p296q6.C11752n;
import p296q6.C11765x;
import p296q6.InterfaceC11746i;
import p296q6.InterfaceC11747j;
import p296q6.InterfaceC11748k;
import p296q6.InterfaceC11753o;
import p296q6.InterfaceC11766y;

/* renamed from: a7.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0040e implements InterfaceC11746i {

    /* renamed from: d */
    public static final InterfaceC11753o f85d = new InterfaceC11753o() { // from class: a7.d
        @Override // p296q6.InterfaceC11753o
        /* renamed from: a */
        public /* synthetic */ InterfaceC11746i[] mo1203a(Uri uri, Map map) {
            return C11752n.m7006a(this, uri, map);
        }

        @Override // p296q6.InterfaceC11753o
        /* renamed from: b */
        public final InterfaceC11746i[] mo1202b() {
            InterfaceC11746i[] m41351f;
            m41351f = C0040e.m41351f();
            return m41351f;
        }
    };

    /* renamed from: a */
    private final C0043f f86a = new C0043f();

    /* renamed from: b */
    private final C9208y f87b = new C9208y(16384);

    /* renamed from: c */
    private boolean f88c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ InterfaceC11746i[] m41351f() {
        return new InterfaceC11746i[]{new C0040e()};
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: a */
    public void mo663a(long j, long j2) {
        this.f88c = false;
        this.f86a.mo41216c();
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: b */
    public void mo662b(InterfaceC11748k interfaceC11748k) {
        this.f86a.mo41214e(interfaceC11748k, new InterfaceC0052i0.C0056d(0, 1));
        interfaceC11748k.mo3738s();
        interfaceC11748k.mo3739i(new InterfaceC11766y.C11768b(-9223372036854775807L));
    }

    @Override // p296q6.InterfaceC11746i
    /* renamed from: d */
    public int mo660d(InterfaceC11747j interfaceC11747j, C11765x c11765x) {
        int read = interfaceC11747j.read(this.f87b.m16094d(), 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.f87b.m16099P(0);
        this.f87b.m16100O(read);
        if (!this.f88c) {
            this.f86a.mo41213f(0L, 4);
            this.f88c = true;
        }
        this.f86a.mo41218a(this.f87b);
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
            interfaceC11747j.mo6963n(c9208y.m16094d(), 0, 7);
            c9208y.m16099P(0);
            int m16105J = c9208y.m16105J();
            if (m16105J != 44096 && m16105J != 44097) {
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
                int m16765e = C9070c.m16765e(c9208y.m16094d(), m16105J);
                if (m16765e == -1) {
                    return false;
                }
                interfaceC11747j.mo6967i(m16765e - 7);
            }
        }
    }

    @Override // p296q6.InterfaceC11746i
    public void release() {
    }
}
