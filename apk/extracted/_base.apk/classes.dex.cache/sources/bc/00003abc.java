package p164j$.time;

import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.Serializable;
import p164j$.time.temporal.AbstractC8342j;
import p164j$.time.temporal.C8348p;
import p164j$.time.temporal.C8349q;
import p164j$.time.temporal.EnumC8333a;
import p164j$.time.temporal.EnumC8334b;
import p164j$.time.temporal.InterfaceC8343k;
import p164j$.time.temporal.InterfaceC8344l;
import p164j$.time.temporal.InterfaceC8346n;

/* renamed from: j$.time.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8325k implements InterfaceC8343k, Comparable, Serializable {

    /* renamed from: e */
    public static final C8325k f22362e;

    /* renamed from: f */
    public static final C8325k f22363f;

    /* renamed from: g */
    private static final C8325k[] f22364g = new C8325k[24];

    /* renamed from: a */
    private final byte f22365a;

    /* renamed from: b */
    private final byte f22366b;

    /* renamed from: c */
    private final byte f22367c;

    /* renamed from: d */
    private final int f22368d;

    static {
        int i = 0;
        while (true) {
            C8325k[] c8325kArr = f22364g;
            if (i >= c8325kArr.length) {
                C8325k c8325k = c8325kArr[0];
                C8325k c8325k2 = c8325kArr[12];
                f22362e = c8325k;
                f22363f = new C8325k(23, 59, 59, 999999999);
                return;
            }
            c8325kArr[i] = new C8325k(i, 0, 0, 0);
            i++;
        }
    }

    private C8325k(int i, int i2, int i3, int i4) {
        this.f22365a = (byte) i;
        this.f22366b = (byte) i2;
        this.f22367c = (byte) i3;
        this.f22368d = i4;
    }

    /* renamed from: g */
    private int m17840g(InterfaceC8344l interfaceC8344l) {
        int i = AbstractC8324j.f22360a[((EnumC8333a) interfaceC8344l).ordinal()];
        byte b = this.f22366b;
        int i2 = this.f22368d;
        byte b2 = this.f22365a;
        switch (i) {
            case 1:
                return i2;
            case 2:
                throw new C8348p("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i2 / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
            case 4:
                throw new C8348p("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i2 / 1000000;
            case 6:
                return (int) (m17836k() / 1000000);
            case 7:
                return this.f22367c;
            case 8:
                return m17835l();
            case 9:
                return b;
            case 10:
                return (b2 * 60) + b;
            case 11:
                return b2 % 12;
            case 12:
                int i3 = b2 % 12;
                if (i3 % 12 == 0) {
                    return 12;
                }
                return i3;
            case 13:
                return b2;
            case 14:
                if (b2 == 0) {
                    return 24;
                }
                return b2;
            case 15:
                return b2 / 12;
            default:
                throw new C8348p("Unsupported field: " + interfaceC8344l);
        }
    }

    /* renamed from: j */
    public static C8325k m17837j(long j) {
        EnumC8333a.NANO_OF_DAY.m17823f(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        int i4 = (int) (j3 - (i3 * 1000000000));
        return ((i2 | i3) | i4) == 0 ? f22364g[i] : new C8325k(i, i2, i3, i4);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: a */
    public final C8349q mo17805a(InterfaceC8344l interfaceC8344l) {
        return AbstractC8342j.m17813c(this, interfaceC8344l);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: b */
    public final boolean mo17804b(InterfaceC8344l interfaceC8344l) {
        return interfaceC8344l instanceof EnumC8333a ? interfaceC8344l.isTimeBased() : interfaceC8344l != null && interfaceC8344l.mo17800a(this);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: c */
    public final long mo17803c(InterfaceC8344l interfaceC8344l) {
        return interfaceC8344l instanceof EnumC8333a ? interfaceC8344l == EnumC8333a.NANO_OF_DAY ? m17836k() : interfaceC8344l == EnumC8333a.MICRO_OF_DAY ? m17836k() / 1000 : m17840g(interfaceC8344l) : interfaceC8344l.mo17797d(this);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: d */
    public final Object mo17802d(InterfaceC8346n interfaceC8346n) {
        if (interfaceC8346n == AbstractC8342j.m17812d() || interfaceC8346n == AbstractC8342j.m17806j() || interfaceC8346n == AbstractC8342j.m17807i() || interfaceC8346n == AbstractC8342j.m17809g()) {
            return null;
        }
        if (interfaceC8346n == AbstractC8342j.m17810f()) {
            return this;
        }
        if (interfaceC8346n == AbstractC8342j.m17811e()) {
            return null;
        }
        return interfaceC8346n == AbstractC8342j.m17808h() ? EnumC8334b.NANOS : interfaceC8346n.mo17796a(this);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: e */
    public final int mo17801e(EnumC8333a enumC8333a) {
        return enumC8333a instanceof EnumC8333a ? m17840g(enumC8333a) : AbstractC8342j.m17815a(this, enumC8333a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8325k) {
            C8325k c8325k = (C8325k) obj;
            return this.f22365a == c8325k.f22365a && this.f22366b == c8325k.f22366b && this.f22367c == c8325k.f22367c && this.f22368d == c8325k.f22368d;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: f */
    public final int compareTo(C8325k c8325k) {
        int compare = Integer.compare(this.f22365a, c8325k.f22365a);
        if (compare == 0) {
            int compare2 = Integer.compare(this.f22366b, c8325k.f22366b);
            if (compare2 == 0) {
                int compare3 = Integer.compare(this.f22367c, c8325k.f22367c);
                return compare3 == 0 ? Integer.compare(this.f22368d, c8325k.f22368d) : compare3;
            }
            return compare2;
        }
        return compare;
    }

    /* renamed from: h */
    public final int m17839h() {
        return this.f22368d;
    }

    public final int hashCode() {
        long m17836k = m17836k();
        return (int) (m17836k ^ (m17836k >>> 32));
    }

    /* renamed from: i */
    public final int m17838i() {
        return this.f22367c;
    }

    /* renamed from: k */
    public final long m17836k() {
        return (this.f22367c * 1000000000) + (this.f22366b * 60000000000L) + (this.f22365a * 3600000000000L) + this.f22368d;
    }

    /* renamed from: l */
    public final int m17835l() {
        return (this.f22366b * 60) + (this.f22365a * 3600) + this.f22367c;
    }

    public final String toString() {
        int i;
        StringBuilder sb2 = new StringBuilder(18);
        byte b = this.f22365a;
        sb2.append(b < 10 ? "0" : "");
        sb2.append((int) b);
        byte b2 = this.f22366b;
        sb2.append(b2 < 10 ? ":0" : ":");
        sb2.append((int) b2);
        byte b3 = this.f22367c;
        int i2 = this.f22368d;
        if (b3 > 0 || i2 > 0) {
            sb2.append(b3 >= 10 ? ":" : ":0");
            sb2.append((int) b3);
            if (i2 > 0) {
                sb2.append('.');
                int i3 = 1000000;
                if (i2 % 1000000 == 0) {
                    i = (i2 / 1000000) + RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
                } else {
                    if (i2 % RNCWebViewManager.COMMAND_CLEAR_FORM_DATA == 0) {
                        i2 /= RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
                    } else {
                        i3 = 1000000000;
                    }
                    i = i2 + i3;
                }
                sb2.append(Integer.toString(i).substring(1));
            }
        }
        return sb2.toString();
    }
}