package net.time4j.history;

import com.reactnativecommunity.webview.RNCWebViewManager;
import p235mj.EnumC10476a;

/* renamed from: net.time4j.history.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C10741h implements Comparable<C10741h> {

    /* renamed from: j */
    private final EnumC10744j f28051j;

    /* renamed from: k */
    private final int f28052k;

    /* renamed from: l */
    private final int f28053l;

    /* renamed from: m */
    private final int f28054m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10741h(EnumC10744j enumC10744j, int i, int i2, int i3) {
        this.f28051j = enumC10744j;
        this.f28052k = i;
        this.f28053l = i2;
        this.f28054m = i3;
    }

    /* renamed from: g */
    public static C10741h m10379g(EnumC10744j enumC10744j, int i, int i2, int i3) {
        return m10378h(enumC10744j, i, i2, i3, EnumC10476a.DUAL_DATING, C10761o.f28078d);
    }

    /* renamed from: h */
    public static C10741h m10378h(EnumC10744j enumC10744j, int i, int i2, int i3, EnumC10476a enumC10476a, C10761o c10761o) {
        if (enumC10744j != null) {
            boolean z = true;
            if (i3 >= 1 && i3 <= 31) {
                if (i2 >= 1 && i2 <= 12) {
                    if (enumC10744j == EnumC10744j.BYZANTINE) {
                        if (i < 0 || (i == 0 && i2 < 9)) {
                            throw new IllegalArgumentException("Before creation of the world: " + m10377i(enumC10744j, i, i2, i3));
                        }
                    } else if (i < 1) {
                        throw new IllegalArgumentException("Year of era must be positive: " + m10377i(enumC10744j, i, i2, i3));
                    }
                    if (!enumC10476a.equals(EnumC10476a.DUAL_DATING)) {
                        EnumC10751n m10317f = c10761o.m10317f(enumC10744j, i);
                        if (enumC10476a != EnumC10476a.AFTER_NEW_YEAR) {
                            z = false;
                        }
                        i = m10317f.mo10324c(z, c10761o, enumC10744j, i, i2, i3);
                    }
                    return new C10741h(enumC10744j, i, i2, i3);
                }
                throw new IllegalArgumentException("Month out of range: " + m10377i(enumC10744j, i, i2, i3));
            }
            throw new IllegalArgumentException("Day of month out of range: " + m10377i(enumC10744j, i, i2, i3));
        }
        throw new NullPointerException("Missing historic era.");
    }

    /* renamed from: i */
    private static String m10377i(EnumC10744j enumC10744j, int i, int i2, int i3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(enumC10744j);
        sb2.append('-');
        String valueOf = String.valueOf(i);
        for (int length = 4 - valueOf.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(valueOf);
        sb2.append('-');
        if (i2 < 10) {
            sb2.append('0');
        }
        sb2.append(i2);
        sb2.append('-');
        if (i3 < 10) {
            sb2.append('0');
        }
        sb2.append(i3);
        return sb2.toString();
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C10741h c10741h) {
        int m10367a = this.f28051j.m10367a(this.f28052k);
        int m10367a2 = c10741h.f28051j.m10367a(c10741h.f28052k);
        if (m10367a < m10367a2) {
            return -1;
        }
        if (m10367a > m10367a2) {
            return 1;
        }
        int m10382d = m10382d() - c10741h.m10382d();
        if (m10382d == 0) {
            m10382d = m10384b() - c10741h.m10384b();
        }
        if (m10382d < 0) {
            return -1;
        }
        if (m10382d > 0) {
            return 1;
        }
        return 0;
    }

    /* renamed from: b */
    public int m10384b() {
        return this.f28054m;
    }

    /* renamed from: c */
    public EnumC10744j m10383c() {
        return this.f28051j;
    }

    /* renamed from: d */
    public int m10382d() {
        return this.f28053l;
    }

    /* renamed from: e */
    public int m10381e() {
        return this.f28052k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10741h)) {
            return false;
        }
        C10741h c10741h = (C10741h) obj;
        if (this.f28051j == c10741h.f28051j && this.f28052k == c10741h.f28052k && this.f28053l == c10741h.f28053l && this.f28054m == c10741h.f28054m) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m10380f(C10761o c10761o) {
        return c10761o.m10320c(this);
    }

    public int hashCode() {
        int i = (this.f28052k * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA) + (this.f28053l * 32) + this.f28054m;
        if (this.f28051j != EnumC10744j.AD) {
            return -i;
        }
        return i;
    }

    public String toString() {
        return m10377i(this.f28051j, this.f28052k, this.f28053l, this.f28054m);
    }
}
