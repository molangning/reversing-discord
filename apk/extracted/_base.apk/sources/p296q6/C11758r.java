package p296q6;

import p195k8.C9149a;
import p195k8.C9191p0;
import p296q6.C11759s;
import p296q6.InterfaceC11766y;

/* renamed from: q6.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11758r implements InterfaceC11766y {

    /* renamed from: a */
    private final C11759s f30643a;

    /* renamed from: b */
    private final long f30644b;

    public C11758r(C11759s c11759s, long j) {
        this.f30643a = c11759s;
        this.f30644b = j;
    }

    /* renamed from: a */
    private C11769z m6983a(long j, long j2) {
        return new C11769z((j * 1000000) / this.f30643a.f30649e, this.f30644b + j2);
    }

    @Override // p296q6.InterfaceC11766y
    /* renamed from: f */
    public InterfaceC11766y.C11767a mo1210f(long j) {
        long j2;
        C9149a.m16445h(this.f30643a.f30655k);
        C11759s c11759s = this.f30643a;
        C11759s.C11760a c11760a = c11759s.f30655k;
        long[] jArr = c11760a.f30657a;
        long[] jArr2 = c11760a.f30658b;
        int m16245i = C9191p0.m16245i(jArr, c11759s.m6973j(j), true, false);
        long j3 = 0;
        if (m16245i == -1) {
            j2 = 0;
        } else {
            j2 = jArr[m16245i];
        }
        if (m16245i != -1) {
            j3 = jArr2[m16245i];
        }
        C11769z m6983a = m6983a(j2, j3);
        if (m6983a.f30674a != j && m16245i != jArr.length - 1) {
            int i = m16245i + 1;
            return new InterfaceC11766y.C11767a(m6983a, m6983a(jArr[i], jArr2[i]));
        }
        return new InterfaceC11766y.C11767a(m6983a);
    }

    @Override // p296q6.InterfaceC11766y
    /* renamed from: h */
    public boolean mo1209h() {
        return true;
    }

    @Override // p296q6.InterfaceC11766y
    /* renamed from: i */
    public long mo1208i() {
        return this.f30643a.m6976g();
    }
}
