package p229m7;

/* renamed from: m7.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10296g implements InterfaceC10322n0 {

    /* renamed from: j */
    protected final InterfaceC10322n0[] f26827j;

    public C10296g(InterfaceC10322n0[] interfaceC10322n0Arr) {
        this.f26827j = interfaceC10322n0Arr;
    }

    @Override // p229m7.InterfaceC10322n0
    /* renamed from: b */
    public final long mo6201b() {
        long j = Long.MAX_VALUE;
        for (InterfaceC10322n0 interfaceC10322n0 : this.f26827j) {
            long mo6201b = interfaceC10322n0.mo6201b();
            if (mo6201b != Long.MIN_VALUE) {
                j = Math.min(j, mo6201b);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // p229m7.InterfaceC10322n0
    /* renamed from: c */
    public boolean mo6199c() {
        for (InterfaceC10322n0 interfaceC10322n0 : this.f26827j) {
            if (interfaceC10322n0.mo6199c()) {
                return true;
            }
        }
        return false;
    }

    @Override // p229m7.InterfaceC10322n0
    /* renamed from: d */
    public boolean mo6197d(long j) {
        InterfaceC10322n0[] interfaceC10322n0Arr;
        boolean z;
        boolean z2;
        boolean z3 = false;
        do {
            long mo6201b = mo6201b();
            if (mo6201b == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (InterfaceC10322n0 interfaceC10322n0 : this.f26827j) {
                long mo6201b2 = interfaceC10322n0.mo6201b();
                if (mo6201b2 != Long.MIN_VALUE && mo6201b2 <= j) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (mo6201b2 == mo6201b || z2) {
                    z |= interfaceC10322n0.mo6197d(j);
                }
            }
            z3 |= z;
        } while (z);
        return z3;
    }

    @Override // p229m7.InterfaceC10322n0
    /* renamed from: f */
    public final long mo6194f() {
        long j = Long.MAX_VALUE;
        for (InterfaceC10322n0 interfaceC10322n0 : this.f26827j) {
            long mo6194f = interfaceC10322n0.mo6194f();
            if (mo6194f != Long.MIN_VALUE) {
                j = Math.min(j, mo6194f);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // p229m7.InterfaceC10322n0
    /* renamed from: h */
    public final void mo6191h(long j) {
        for (InterfaceC10322n0 interfaceC10322n0 : this.f26827j) {
            interfaceC10322n0.mo6191h(j);
        }
    }
}