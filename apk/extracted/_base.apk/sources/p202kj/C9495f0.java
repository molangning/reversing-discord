package p202kj;

import java.util.Set;
import net.time4j.base.C10616c;
import p162ij.InterfaceC7633d;
import p162ij.InterfaceC7662o;
import p162ij.InterfaceC7664p;
import p184jj.C8969a;
import p184jj.EnumC8981g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kj.f0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C9495f0 implements InterfaceC9500h<Integer> {

    /* renamed from: j */
    private final InterfaceC7664p<Integer> f25159j;

    /* renamed from: k */
    private final int f25160k;

    /* renamed from: l */
    private final char f25161l;

    /* renamed from: m */
    private final EnumC8981g f25162m;

    /* renamed from: n */
    private final int f25163n;

    /* renamed from: o */
    private final int f25164o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9495f0(InterfaceC7664p<Integer> interfaceC7664p) {
        if (interfaceC7664p.name().startsWith("YEAR")) {
            this.f25159j = interfaceC7664p;
            this.f25160k = 0;
            this.f25161l = '0';
            this.f25162m = EnumC8981g.SMART;
            this.f25163n = 0;
            this.f25164o = 100;
            return;
        }
        throw new IllegalArgumentException("Year element required: " + interfaceC7664p);
    }

    /* renamed from: a */
    private int m14540a(boolean z, InterfaceC7633d interfaceC7633d) {
        int intValue;
        if (z) {
            intValue = this.f25164o;
        } else {
            intValue = ((Integer) interfaceC7633d.mo14441b(C8969a.f23576q, Integer.valueOf(this.f25164o))).intValue();
        }
        if (intValue >= 100) {
            return intValue;
        }
        throw new IllegalArgumentException("Pivot year must not be smaller than 100: " + intValue);
    }

    /* renamed from: b */
    private static int m14539b(int i, int i2) {
        int i3;
        if (i >= i2 % 100) {
            i3 = (i2 / 100) - 1;
        } else {
            i3 = i2 / 100;
        }
        return (i3 * 100) + i;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: c */
    public InterfaceC7664p<Integer> mo14365c() {
        return this.f25159j;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: d */
    public int mo14364d(InterfaceC7662o interfaceC7662o, Appendable appendable, InterfaceC7633d interfaceC7633d, Set<C9496g> set, boolean z) {
        char charValue;
        int i;
        int mo10218c = interfaceC7662o.mo10218c(this.f25159j);
        if (mo10218c < 0) {
            if (mo10218c == Integer.MIN_VALUE) {
                throw new IllegalArgumentException("Format context has no year: " + interfaceC7662o);
            }
            throw new IllegalArgumentException("Negative year cannot be printed as two-digit-year: " + mo10218c);
        }
        if (m14540a(z, interfaceC7633d) != 100) {
            mo10218c = C10616c.m11039c(mo10218c, 100);
        }
        String num = Integer.toString(mo10218c);
        if (z) {
            charValue = this.f25161l;
        } else {
            charValue = ((Character) interfaceC7633d.mo14441b(C8969a.f23572m, '0')).charValue();
        }
        int i2 = 0;
        if (charValue != '0') {
            int i3 = charValue - '0';
            char[] charArray = num.toCharArray();
            for (int i4 = 0; i4 < charArray.length; i4++) {
                charArray[i4] = (char) (charArray[i4] + i3);
            }
            num = new String(charArray);
        }
        if (appendable instanceof CharSequence) {
            i = ((CharSequence) appendable).length();
        } else {
            i = -1;
        }
        if (mo10218c < 10) {
            appendable.append(charValue);
            i2 = 1;
        }
        appendable.append(num);
        int length = i2 + num.length();
        if (i != -1 && length > 0 && set != null) {
            set.add(new C9496g(this.f25159j, i, i + length));
        }
        return length;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2  */
    @Override // p202kj.InterfaceC9500h
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo14363e(java.lang.CharSequence r11, p202kj.C9518s r12, p162ij.InterfaceC7633d r13, p202kj.AbstractC9519t<?> r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p202kj.C9495f0.mo14363e(java.lang.CharSequence, kj.s, ij.d, kj.t, boolean):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9495f0) {
            return this.f25159j.equals(((C9495f0) obj).f25159j);
        }
        return false;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: f */
    public boolean mo14362f() {
        return true;
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: g */
    public InterfaceC9500h<Integer> mo14361g(InterfaceC7664p<Integer> interfaceC7664p) {
        if (this.f25159j == interfaceC7664p) {
            return this;
        }
        return new C9495f0(interfaceC7664p);
    }

    @Override // p202kj.InterfaceC9500h
    /* renamed from: h */
    public InterfaceC9500h<Integer> mo14360h(C9479c<?> c9479c, InterfaceC7633d interfaceC7633d, int i) {
        return new C9495f0(this.f25159j, i, ((Character) interfaceC7633d.mo14441b(C8969a.f23572m, '0')).charValue(), (EnumC8981g) interfaceC7633d.mo14441b(C8969a.f23565f, EnumC8981g.SMART), ((Integer) interfaceC7633d.mo14441b(C8969a.f23578s, 0)).intValue(), ((Integer) interfaceC7633d.mo14441b(C8969a.f23576q, Integer.valueOf(c9479c.m14626q().mo10455g()))).intValue());
    }

    public int hashCode() {
        return this.f25159j.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append(C9495f0.class.getName());
        sb2.append("[element=");
        sb2.append(this.f25159j.name());
        sb2.append(']');
        return sb2.toString();
    }

    private C9495f0(InterfaceC7664p<Integer> interfaceC7664p, int i, char c, EnumC8981g enumC8981g, int i2, int i3) {
        this.f25159j = interfaceC7664p;
        this.f25160k = i;
        this.f25161l = c;
        this.f25162m = enumC8981g;
        this.f25163n = i2;
        this.f25164o = i3;
    }
}
