package p363u6;

import p296q6.C11769z;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11748k;
import p296q6.InterfaceC11766y;

/* renamed from: u6.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12875d implements InterfaceC11748k {

    /* renamed from: j */
    private final long f33513j;

    /* renamed from: k */
    private final InterfaceC11748k f33514k;

    /* renamed from: u6.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C12876a implements InterfaceC11766y {

        /* renamed from: a */
        final /* synthetic */ InterfaceC11766y f33515a;

        C12876a(InterfaceC11766y interfaceC11766y) {
            this.f33515a = interfaceC11766y;
        }

        @Override // p296q6.InterfaceC11766y
        /* renamed from: f */
        public InterfaceC11766y.C11767a mo1210f(long j) {
            InterfaceC11766y.C11767a mo1210f = this.f33515a.mo1210f(j);
            C11769z c11769z = mo1210f.f30669a;
            C11769z c11769z2 = new C11769z(c11769z.f30674a, c11769z.f30675b + C12875d.this.f33513j);
            C11769z c11769z3 = mo1210f.f30670b;
            return new InterfaceC11766y.C11767a(c11769z2, new C11769z(c11769z3.f30674a, c11769z3.f30675b + C12875d.this.f33513j));
        }

        @Override // p296q6.InterfaceC11766y
        /* renamed from: h */
        public boolean mo1209h() {
            return this.f33515a.mo1209h();
        }

        @Override // p296q6.InterfaceC11766y
        /* renamed from: i */
        public long mo1208i() {
            return this.f33515a.mo1208i();
        }
    }

    public C12875d(long j, InterfaceC11748k interfaceC11748k) {
        this.f33513j = j;
        this.f33514k = interfaceC11748k;
    }

    @Override // p296q6.InterfaceC11748k
    /* renamed from: e */
    public InterfaceC11732b0 mo3740e(int i, int i2) {
        return this.f33514k.mo3740e(i, i2);
    }

    @Override // p296q6.InterfaceC11748k
    /* renamed from: i */
    public void mo3739i(InterfaceC11766y interfaceC11766y) {
        this.f33514k.mo3739i(new C12876a(interfaceC11766y));
    }

    @Override // p296q6.InterfaceC11748k
    /* renamed from: s */
    public void mo3738s() {
        this.f33514k.mo3738s();
    }
}
