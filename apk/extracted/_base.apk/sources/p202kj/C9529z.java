package p202kj;

import com.facebook.react.uimanager.ViewDefaults;
import java.util.Locale;
import java.util.Set;
import net.time4j.C10582a0;
import net.time4j.C10697f0;
import net.time4j.C10711g0;
import net.time4j.C10722h0;
import net.time4j.p249tz.AbstractC10809l;
import net.time4j.p249tz.InterfaceC10808k;
import net.time4j.p249tz.InterfaceC10834o;
import p162ij.C7672x;
import p162ij.InterfaceC7631c;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7664p;
import p162ij.InterfaceC7675y;
import p184jj.C8969a;
import p184jj.C8972b;
import p184jj.EnumC8979e;
import p184jj.InterfaceC8982h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kj.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C9529z<T> implements InterfaceC9500h<T> {

    /* renamed from: j */
    private final C9479c<T> f25297j;

    /* renamed from: k */
    private final InterfaceC7675y f25298k;

    /* renamed from: l */
    private final InterfaceC7675y f25299l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9529z(InterfaceC7675y interfaceC7675y, InterfaceC7675y interfaceC7675y2) {
        this(null, interfaceC7675y, interfaceC7675y2);
    }

    /* renamed from: a */
    private static <T> C9479c<T> m14366a(C7672x<?> c7672x, InterfaceC7675y interfaceC7675y, InterfaceC7675y interfaceC7675y2, Locale locale, boolean z, AbstractC10809l abstractC10809l) {
        String mo10454i;
        if (c7672x.equals(C10697f0.m10673w0())) {
            mo10454i = C8972b.m16900r((EnumC8979e) interfaceC7675y, locale);
        } else if (c7672x.equals(C10711g0.m10581m0())) {
            mo10454i = C8972b.m16898t((EnumC8979e) interfaceC7675y2, locale);
        } else if (c7672x.equals(C10722h0.m10499W())) {
            mo10454i = C8972b.m16897u((EnumC8979e) interfaceC7675y, (EnumC8979e) interfaceC7675y2, locale);
        } else if (c7672x.equals(C10582a0.m11164X())) {
            mo10454i = C8972b.m16899s((EnumC8979e) interfaceC7675y, (EnumC8979e) interfaceC7675y2, locale);
        } else if (InterfaceC8982h.class.isAssignableFrom(c7672x.m20113p())) {
            mo10454i = c7672x.mo10454i(interfaceC7675y, locale);
        } else {
            throw new UnsupportedOperationException("Localized format patterns not available: " + c7672x);
        }
        if (z && mo10454i.contains("yy") && !mo10454i.contains("yyy")) {
            mo10454i = mo10454i.replace("yy", "yyyy");
        }
        C9479c<T> m14660C = C9479c.m14660C(mo10454i, EnumC9525w.CLDR, locale, c7672x);
        if (abstractC10809l != null) {
            return m14660C.m14642U(abstractC10809l);
        }
        return m14660C;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: c */
    public InterfaceC7664p<T> mo14365c() {
        return null;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: d */
    public int mo14364d(InterfaceC7662o interfaceC7662o, Appendable appendable, InterfaceC7633d interfaceC7633d, Set<C9496g> set, boolean z) {
        boolean z2;
        C9479c<T> c9479c = this.f25297j;
        if (set != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        Set<C9496g> m14653J = c9479c.m14653J(interfaceC7662o, appendable, interfaceC7633d, z2);
        if (set != null) {
            set.addAll(m14653J);
            return ViewDefaults.NUMBER_OF_LINES;
        }
        return ViewDefaults.NUMBER_OF_LINES;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: e */
    public void mo14363e(CharSequence charSequence, C9518s c9518s, InterfaceC7633d interfaceC7633d, AbstractC9519t<?> abstractC9519t, boolean z) {
        C9479c<T> m14366a;
        if (z) {
            m14366a = this.f25297j;
        } else {
            InterfaceC7633d m14628o = this.f25297j.m14628o();
            InterfaceC7631c<InterfaceC10834o> interfaceC7631c = C8969a.f23564e;
            InterfaceC10834o interfaceC10834o = (InterfaceC10834o) interfaceC7633d.mo14441b(interfaceC7631c, m14628o.mo14441b(interfaceC7631c, AbstractC10809l.f28231m));
            InterfaceC7631c<InterfaceC10808k> interfaceC7631c2 = C8969a.f23563d;
            AbstractC10809l abstractC10809l = null;
            InterfaceC10808k interfaceC10808k = (InterfaceC10808k) interfaceC7633d.mo14441b(interfaceC7631c2, m14628o.mo14441b(interfaceC7631c2, null));
            if (interfaceC10808k != null) {
                abstractC10809l = AbstractC10809l.m10149N(interfaceC10808k).mo10146Q(interfaceC10834o);
            }
            m14366a = m14366a(this.f25297j.m14626q(), this.f25298k, this.f25299l, (Locale) interfaceC7633d.mo14441b(C8969a.f23562c, this.f25297j.m14622u()), ((Boolean) interfaceC7633d.mo14441b(C8969a.f23581v, Boolean.FALSE)).booleanValue(), abstractC10809l);
        }
        T mo14469b = m14366a.mo14469b(charSequence, c9518s, interfaceC7633d);
        if (!c9518s.m14427i() && mo14469b != null) {
            abstractC9519t.mo14413K(mo14469b);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9529z) {
            C9529z c9529z = (C9529z) obj;
            if (this.f25298k.equals(c9529z.f25298k) && this.f25299l.equals(c9529z.f25299l)) {
                C9479c<T> c9479c = this.f25297j;
                if (c9479c == null) {
                    if (c9529z.f25297j == null) {
                        return true;
                    }
                    return false;
                }
                return c9479c.equals(c9529z.f25297j);
            }
        }
        return false;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: f */
    public boolean mo14362f() {
        return false;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: g */
    public InterfaceC9500h<T> mo14361g(InterfaceC7664p<T> interfaceC7664p) {
        return this;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: h */
    public InterfaceC9500h<T> mo14360h(C9479c<?> c9479c, InterfaceC7633d interfaceC7633d, int i) {
        InterfaceC10834o interfaceC10834o = (InterfaceC10834o) interfaceC7633d.mo14441b(C8969a.f23564e, AbstractC10809l.f28231m);
        AbstractC10809l abstractC10809l = null;
        InterfaceC10808k interfaceC10808k = (InterfaceC10808k) interfaceC7633d.mo14441b(C8969a.f23563d, null);
        Locale locale = (Locale) interfaceC7633d.mo14441b(C8969a.f23562c, Locale.ROOT);
        C7672x<?> m14626q = c9479c.m14626q();
        InterfaceC7675y interfaceC7675y = this.f25298k;
        InterfaceC7675y interfaceC7675y2 = this.f25299l;
        boolean booleanValue = ((Boolean) interfaceC7633d.mo14441b(C8969a.f23581v, Boolean.FALSE)).booleanValue();
        if (interfaceC10808k != null) {
            abstractC10809l = AbstractC10809l.m10149N(interfaceC10808k).mo10146Q(interfaceC10834o);
        }
        return new C9529z(m14366a(m14626q, interfaceC7675y, interfaceC7675y2, locale, booleanValue, abstractC10809l), this.f25298k, this.f25299l);
    }

    public int hashCode() {
        C9479c<T> c9479c = this.f25297j;
        if (c9479c == null) {
            return 0;
        }
        return c9479c.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(C9529z.class.getName());
        sb2.append("[date-style=");
        sb2.append(this.f25298k);
        sb2.append(",time-style=");
        sb2.append(this.f25299l);
        sb2.append(",delegate=");
        sb2.append(this.f25297j);
        sb2.append(']');
        return sb2.toString();
    }

    private C9529z(C9479c<T> c9479c, InterfaceC7675y interfaceC7675y, InterfaceC7675y interfaceC7675y2) {
        if (interfaceC7675y != null && interfaceC7675y2 != null) {
            this.f25298k = interfaceC7675y;
            this.f25299l = interfaceC7675y2;
            this.f25297j = c9479c;
            return;
        }
        throw new NullPointerException("Missing display style.");
    }
}
