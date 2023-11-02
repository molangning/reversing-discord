package net.time4j.calendar;

import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.Locale;
import java.util.Map;
import p162ij.InterfaceC7631c;
import p162ij.InterfaceC7633d;
import p184jj.C8969a;
import p184jj.C8972b;
import p184jj.EnumC8985j;
import p220lj.C10215b;

/* renamed from: net.time4j.calendar.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10651h implements Comparable<C10651h>, Serializable {

    /* renamed from: j */
    public static final InterfaceC7631c<Character> f27759j = C8969a.m16928e("LEAP_MONTH_INDICATOR", Character.class);

    /* renamed from: k */
    public static final InterfaceC7631c<Boolean> f27760k = C8969a.m16928e("LEAP_MONTH_IS_TRAILING", Boolean.class);

    /* renamed from: l */
    private static final C10651h[] f27761l;
    private static final long serialVersionUID = 7544059597266533279L;
    private final int index;
    private final boolean leap;

    static {
        C10651h[] c10651hArr = new C10651h[24];
        for (int i = 0; i < 12; i++) {
            c10651hArr[i] = new C10651h(i, false);
            c10651hArr[i + 12] = new C10651h(i, true);
        }
        f27761l = c10651hArr;
    }

    private C10651h(int i, boolean z) {
        this.index = i;
        this.leap = z;
    }

    /* renamed from: d */
    public static C10651h m10870d(int i) {
        if (i >= 1 && i <= 12) {
            return f27761l[i - 1];
        }
        throw new IllegalArgumentException("Out of range: " + i);
    }

    private Object readResolve() {
        int i;
        try {
            C10651h[] c10651hArr = f27761l;
            int i2 = this.index;
            if (this.leap) {
                i = 12;
            } else {
                i = 0;
            }
            return c10651hArr[i2 + i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new StreamCorruptedException();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C10651h c10651h) {
        int i = this.index;
        int i2 = c10651h.index;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        if (this.leap) {
            return !c10651h.leap ? 1 : 0;
        }
        if (c10651h.leap) {
            return -1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public String m10872b(Locale locale, EnumC8985j enumC8985j, InterfaceC7633d interfaceC7633d) {
        StringBuilder sb2;
        Map<String, String> m16905m = C8972b.m16915c("generic", locale).m16905m();
        String m12124a = C10215b.m12124a(enumC8985j, ((Character) interfaceC7633d.mo14441b(C8969a.f23572m, Character.valueOf(enumC8985j.mo16873k().charAt(0)))).charValue(), getNumber());
        if (this.leap) {
            boolean booleanValue = ((Boolean) interfaceC7633d.mo14441b(f27760k, Boolean.valueOf("R".equals(m16905m.get("leap-alignment"))))).booleanValue();
            char charValue = ((Character) interfaceC7633d.mo14441b(f27759j, Character.valueOf(m16905m.get("leap-indicator").charAt(0)))).charValue();
            if (booleanValue) {
                sb2 = new StringBuilder();
                sb2.append(m12124a);
                sb2.append(charValue);
            } else {
                sb2 = new StringBuilder();
                sb2.append(charValue);
                sb2.append(m12124a);
            }
            return sb2.toString();
        }
        return m12124a;
    }

    /* renamed from: c */
    public boolean m10871c() {
        return this.leap;
    }

    /* renamed from: e */
    public C10651h m10869e() {
        return f27761l[this.index + 12];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10651h)) {
            return false;
        }
        C10651h c10651h = (C10651h) obj;
        if (this.index == c10651h.index && this.leap == c10651h.leap) {
            return true;
        }
        return false;
    }

    public int getNumber() {
        return this.index + 1;
    }

    public int hashCode() {
        return this.index + (this.leap ? 12 : 0);
    }

    public String toString() {
        String valueOf = String.valueOf(this.index + 1);
        if (this.leap) {
            return "*" + valueOf;
        }
        return valueOf;
    }
}
