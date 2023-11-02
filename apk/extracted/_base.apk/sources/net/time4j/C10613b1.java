package net.time4j;

import net.time4j.p249tz.AbstractC10809l;
import net.time4j.p249tz.C10835p;
import net.time4j.p249tz.InterfaceC10808k;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7664p;
import p288pj.EnumC11651f;
import p288pj.InterfaceC11652g;

/* renamed from: net.time4j.b1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10613b1 implements InterfaceC7662o, InterfaceC11652g {

    /* renamed from: j */
    private final C10582a0 f27696j;

    /* renamed from: k */
    private final AbstractC10809l f27697k;

    /* renamed from: l */
    private final transient C10722h0 f27698l;

    private C10613b1(C10582a0 c10582a0, AbstractC10809l abstractC10809l) {
        this.f27697k = abstractC10809l;
        C10835p mo10161B = abstractC10809l.mo10161B(c10582a0);
        if (c10582a0.m11148n0() && (mo10161B.m10027i() != 0 || mo10161B.m10028h() % 60 != 0)) {
            throw new IllegalArgumentException("Leap second can only be represented  with timezone-offset in full minutes: " + mo10161B);
        }
        this.f27696j = c10582a0;
        this.f27698l = C10722h0.m10497Y(c10582a0, mo10161B);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static C10613b1 m11055j(C10582a0 c10582a0, AbstractC10809l abstractC10809l) {
        return new C10613b1(c10582a0, abstractC10809l);
    }

    @Override // net.time4j.base.InterfaceC10620f
    /* renamed from: a */
    public int mo10166a() {
        return this.f27696j.mo10166a();
    }

    /* renamed from: b */
    public C10835p m11057b() {
        return this.f27697k.mo10161B(this.f27696j);
    }

    @Override // p162ij.InterfaceC7662o
    /* renamed from: c */
    public int mo10218c(InterfaceC7664p<Integer> interfaceC7664p) {
        if (this.f27696j.m11148n0() && interfaceC7664p == C10711g0.f27939H) {
            return 60;
        }
        int mo10218c = this.f27698l.mo10218c(interfaceC7664p);
        if (mo10218c == Integer.MIN_VALUE) {
            return this.f27696j.mo10218c(interfaceC7664p);
        }
        return mo10218c;
    }

    @Override // p162ij.InterfaceC7662o
    /* renamed from: d */
    public boolean mo10217d() {
        return true;
    }

    @Override // p288pj.InterfaceC11652g
    /* renamed from: e */
    public long mo7349e(EnumC11651f enumC11651f) {
        return this.f27696j.mo7349e(enumC11651f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10613b1)) {
            return false;
        }
        C10613b1 c10613b1 = (C10613b1) obj;
        if (this.f27696j.equals(c10613b1.f27696j) && this.f27697k.equals(c10613b1.f27697k)) {
            return true;
        }
        return false;
    }

    @Override // p162ij.InterfaceC7662o
    /* renamed from: f */
    public <V> V mo10215f(InterfaceC7664p<V> interfaceC7664p) {
        if (this.f27698l.mo10210q(interfaceC7664p)) {
            return (V) this.f27698l.mo10215f(interfaceC7664p);
        }
        return (V) this.f27696j.mo10215f(interfaceC7664p);
    }

    @Override // p288pj.InterfaceC11652g
    /* renamed from: g */
    public int mo7348g(EnumC11651f enumC11651f) {
        return this.f27696j.mo7348g(enumC11651f);
    }

    /* renamed from: h */
    public boolean m11056h() {
        return this.f27696j.m11148n0();
    }

    public int hashCode() {
        return this.f27696j.hashCode() ^ this.f27697k.hashCode();
    }

    @Override // p162ij.InterfaceC7662o
    /* renamed from: i */
    public <V> V mo10212i(InterfaceC7664p<V> interfaceC7664p) {
        if (this.f27696j.m11148n0() && interfaceC7664p == C10711g0.f27939H) {
            return interfaceC7664p.getType().cast(60);
        }
        if (this.f27698l.mo10210q(interfaceC7664p)) {
            return (V) this.f27698l.mo10212i(interfaceC7664p);
        }
        return (V) this.f27696j.mo10212i(interfaceC7664p);
    }

    @Override // net.time4j.base.InterfaceC10620f
    /* renamed from: k */
    public long mo10164k() {
        return this.f27696j.mo10164k();
    }

    @Override // p162ij.InterfaceC7662o
    /* renamed from: l */
    public <V> V mo10211l(InterfaceC7664p<V> interfaceC7664p) {
        V v;
        if (this.f27698l.mo10210q(interfaceC7664p)) {
            v = (V) this.f27698l.mo10211l(interfaceC7664p);
        } else {
            v = (V) this.f27696j.mo10211l(interfaceC7664p);
        }
        if (interfaceC7664p == C10711g0.f27939H && this.f27698l.mo10482o() >= 1972) {
            C10722h0 c10722h0 = (C10722h0) this.f27698l.mo14419F(interfaceC7664p, v);
            if (!this.f27697k.mo10152K(c10722h0, c10722h0) && c10722h0.m10492c0(this.f27697k).m11144r0(1L, EnumC10781n0.SECONDS).m11148n0()) {
                return interfaceC7664p.getType().cast(60);
            }
        }
        return v;
    }

    @Override // p162ij.InterfaceC7662o
    /* renamed from: q */
    public boolean mo10210q(InterfaceC7664p<?> interfaceC7664p) {
        if (!this.f27698l.mo10210q(interfaceC7664p) && !this.f27696j.mo10210q(interfaceC7664p)) {
            return false;
        }
        return true;
    }

    @Override // p162ij.InterfaceC7662o
    /* renamed from: t */
    public InterfaceC10808k mo10209t() {
        return this.f27697k.mo10125z();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append(this.f27698l.m10496Z());
        sb2.append('T');
        int mo10479s = this.f27698l.mo10479s();
        if (mo10479s < 10) {
            sb2.append('0');
        }
        sb2.append(mo10479s);
        sb2.append(':');
        int mo10483m = this.f27698l.mo10483m();
        if (mo10483m < 10) {
            sb2.append('0');
        }
        sb2.append(mo10483m);
        sb2.append(':');
        if (m11056h()) {
            sb2.append("60");
        } else {
            int mo10487h = this.f27698l.mo10487h();
            if (mo10487h < 10) {
                sb2.append('0');
            }
            sb2.append(mo10487h);
        }
        int mo10495a = this.f27698l.mo10495a();
        if (mo10495a != 0) {
            C10711g0.m10605Q0(sb2, mo10495a);
        }
        sb2.append(m11057b());
        InterfaceC10808k mo10209t = mo10209t();
        if (!(mo10209t instanceof C10835p)) {
            sb2.append('[');
            sb2.append(mo10209t.mo10035a());
            sb2.append(']');
        }
        return sb2.toString();
    }
}
