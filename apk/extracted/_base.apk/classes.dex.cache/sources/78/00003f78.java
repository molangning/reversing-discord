package p202kj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import net.time4j.base.InterfaceC10620f;
import net.time4j.p249tz.AbstractC10809l;
import net.time4j.p249tz.C10835p;
import net.time4j.p249tz.InterfaceC10808k;
import p162ij.InterfaceC7631c;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7664p;
import p184jj.C8969a;
import p184jj.EnumC8979e;
import p184jj.EnumC8981g;

/* renamed from: kj.e0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C9492e0 implements InterfaceC9500h<InterfaceC10808k> {

    /* renamed from: o */
    static final C9492e0 f25145o = new C9492e0();

    /* renamed from: j */
    private final EnumC8979e f25146j;

    /* renamed from: k */
    private final boolean f25147k;

    /* renamed from: l */
    private final List<String> f25148l;

    /* renamed from: m */
    private final boolean f25149m;

    /* renamed from: n */
    private final EnumC8981g f25150n;

    public C9492e0(EnumC8979e enumC8979e, boolean z, List<String> list) {
        if (enumC8979e != null) {
            if (!list.isEmpty()) {
                ArrayList<String> arrayList = new ArrayList(list);
                for (String str : arrayList) {
                    if (str.trim().isEmpty()) {
                        throw new IllegalArgumentException("Zero offset must not be white-space-only.");
                    }
                }
                this.f25146j = enumC8979e;
                this.f25147k = z;
                this.f25148l = Collections.unmodifiableList(arrayList);
                this.f25149m = true;
                this.f25150n = EnumC8981g.SMART;
                return;
            }
            throw new IllegalArgumentException("Missing zero offsets.");
        }
        throw new NullPointerException("Missing display mode.");
    }

    /* renamed from: a */
    private static C10835p m14546a(InterfaceC7662o interfaceC7662o, InterfaceC7633d interfaceC7633d) {
        InterfaceC7631c<InterfaceC10808k> interfaceC7631c = C8969a.f23563d;
        if (interfaceC7633d.mo14442a(interfaceC7631c)) {
            InterfaceC10808k interfaceC10808k = (InterfaceC10808k) interfaceC7633d.mo14440c(interfaceC7631c);
            if (interfaceC10808k instanceof C10835p) {
                return (C10835p) interfaceC10808k;
            }
            if (interfaceC10808k != null) {
                throw new IllegalArgumentException("Use a timezone offset instead of [" + interfaceC10808k.mo10035a() + "] when formatting [" + interfaceC7662o + "].");
            }
        }
        throw new IllegalArgumentException("Cannot extract timezone offset from format attributes for: " + interfaceC7662o);
    }

    /* renamed from: b */
    private static int m14545b(CharSequence charSequence, int i, EnumC8981g enumC8981g) {
        char charAt;
        int i2 = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            int i4 = i + i3;
            if (i4 >= charSequence.length()) {
                charAt = 0;
            } else {
                charAt = charSequence.charAt(i4);
            }
            if (charAt >= '0' && charAt <= '9') {
                i2 = (i2 * 10) + (charAt - '0');
            } else if (i3 != 0 && !enumC8981g.m16887c()) {
                return ~i2;
            } else {
                return -1000;
            }
        }
        return i2;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: c */
    public InterfaceC7664p<InterfaceC10808k> mo14365c() {
        return EnumC9478b0.TIMEZONE_OFFSET;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: d */
    public int mo14364d(InterfaceC7662o interfaceC7662o, Appendable appendable, InterfaceC7633d interfaceC7633d, Set<C9496g> set, boolean z) {
        int i;
        InterfaceC10808k interfaceC10808k;
        C10835p mo10161B;
        boolean z2;
        char c;
        int i2;
        if (appendable instanceof CharSequence) {
            i = ((CharSequence) appendable).length();
        } else {
            i = -1;
        }
        if (interfaceC7662o.mo10217d()) {
            interfaceC10808k = interfaceC7662o.mo10209t();
        } else {
            interfaceC10808k = null;
        }
        if (interfaceC10808k == null) {
            mo10161B = m14546a(interfaceC7662o, interfaceC7633d);
        } else if (interfaceC10808k instanceof C10835p) {
            mo10161B = (C10835p) interfaceC10808k;
        } else if (interfaceC7662o instanceof InterfaceC10620f) {
            mo10161B = AbstractC10809l.m10149N(interfaceC10808k).mo10161B((InterfaceC10620f) interfaceC7662o);
        } else {
            throw new IllegalArgumentException("Cannot extract timezone offset from: " + interfaceC7662o);
        }
        int m10026k = mo10161B.m10026k();
        int m10027i = mo10161B.m10027i();
        if ((m10026k | m10027i) == 0) {
            String str = this.f25148l.get(0);
            appendable.append(str);
            i2 = str.length();
        } else {
            int i3 = 1;
            if (m10026k >= 0 && m10027i >= 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                c = '-';
            } else {
                c = '+';
            }
            appendable.append(c);
            int abs = Math.abs(m10026k);
            int i4 = abs / 3600;
            int i5 = (abs / 60) % 60;
            int i6 = abs % 60;
            if (i4 < 10) {
                appendable.append('0');
                i3 = 2;
            }
            String valueOf = String.valueOf(i4);
            appendable.append(valueOf);
            int length = i3 + valueOf.length();
            EnumC8979e enumC8979e = this.f25146j;
            EnumC8979e enumC8979e2 = EnumC8979e.SHORT;
            if (enumC8979e != enumC8979e2 || i5 != 0) {
                if (this.f25147k) {
                    appendable.append(':');
                    length++;
                }
                if (i5 < 10) {
                    appendable.append('0');
                    length++;
                }
                String valueOf2 = String.valueOf(i5);
                appendable.append(valueOf2);
                length += valueOf2.length();
                EnumC8979e enumC8979e3 = this.f25146j;
                if (enumC8979e3 != enumC8979e2 && enumC8979e3 != EnumC8979e.MEDIUM && (enumC8979e3 == EnumC8979e.FULL || (i6 | m10027i) != 0)) {
                    if (this.f25147k) {
                        appendable.append(':');
                        length++;
                    }
                    if (i6 < 10) {
                        appendable.append('0');
                        length++;
                    }
                    String valueOf3 = String.valueOf(i6);
                    appendable.append(valueOf3);
                    int length2 = valueOf3.length() + length;
                    if (m10027i != 0) {
                        appendable.append('.');
                        int i7 = length2 + 1;
                        String valueOf4 = String.valueOf(Math.abs(m10027i));
                        int length3 = 9 - valueOf4.length();
                        for (int i8 = 0; i8 < length3; i8++) {
                            appendable.append('0');
                            i7++;
                        }
                        appendable.append(valueOf4);
                        i2 = valueOf4.length() + i7;
                    } else {
                        i2 = length2;
                    }
                }
            }
            i2 = length;
        }
        if (i != -1 && i2 > 0 && set != null) {
            set.add(new C9496g(EnumC9478b0.TIMEZONE_ID, i, i + i2));
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x01a1  */
    @Override // p202kj.InterfaceC9500h
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo14363e(java.lang.CharSequence r17, p202kj.C9518s r18, p162ij.InterfaceC7633d r19, p202kj.AbstractC9519t<?> r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p202kj.C9492e0.mo14363e(java.lang.CharSequence, kj.s, ij.d, kj.t, boolean):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9492e0)) {
            return false;
        }
        C9492e0 c9492e0 = (C9492e0) obj;
        if (this.f25146j == c9492e0.f25146j && this.f25147k == c9492e0.f25147k && this.f25148l.equals(c9492e0.f25148l)) {
            return true;
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
    public InterfaceC9500h<InterfaceC10808k> mo14361g(InterfaceC7664p<InterfaceC10808k> interfaceC7664p) {
        return this;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: h */
    public InterfaceC9500h<InterfaceC10808k> mo14360h(C9479c<?> c9479c, InterfaceC7633d interfaceC7633d, int i) {
        return new C9492e0(this.f25146j, this.f25147k, this.f25148l, ((Boolean) interfaceC7633d.mo14441b(C8969a.f23568i, Boolean.TRUE)).booleanValue(), (EnumC8981g) interfaceC7633d.mo14441b(C8969a.f23565f, EnumC8981g.SMART));
    }

    public int hashCode() {
        return (this.f25146j.hashCode() * 7) + (this.f25148l.hashCode() * 31) + (this.f25147k ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(C9492e0.class.getName());
        sb2.append("[precision=");
        sb2.append(this.f25146j);
        sb2.append(", extended=");
        sb2.append(this.f25147k);
        sb2.append(", zero-offsets=");
        sb2.append(this.f25148l);
        sb2.append(']');
        return sb2.toString();
    }

    private C9492e0() {
        this.f25146j = EnumC8979e.LONG;
        this.f25147k = true;
        this.f25148l = Collections.emptyList();
        this.f25149m = true;
        this.f25150n = EnumC8981g.SMART;
    }

    private C9492e0(EnumC8979e enumC8979e, boolean z, List<String> list, boolean z2, EnumC8981g enumC8981g) {
        this.f25146j = enumC8979e;
        this.f25147k = z;
        this.f25148l = list;
        this.f25149m = z2;
        this.f25150n = enumC8981g;
    }
}