package p008a7;

import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import gb.AbstractC6693s;
import java.util.ArrayList;
import java.util.List;
import p008a7.InterfaceC0052i0;
import p195k8.C9157d;
import p195k8.C9208y;

/* renamed from: a7.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C0057j implements InterfaceC0052i0.InterfaceC0055c {

    /* renamed from: a */
    private final int f189a;

    /* renamed from: b */
    private final List<Format> f190b;

    public C0057j(int i) {
        this(i, AbstractC6693s.m22131x());
    }

    /* renamed from: c */
    private C0039d0 m41283c(InterfaceC0052i0.C0054b c0054b) {
        return new C0039d0(m41281e(c0054b));
    }

    /* renamed from: d */
    private C0060k0 m41282d(InterfaceC0052i0.C0054b c0054b) {
        return new C0060k0(m41281e(c0054b));
    }

    /* renamed from: e */
    private List<Format> m41281e(InterfaceC0052i0.C0054b c0054b) {
        boolean z;
        String str;
        int i;
        List<byte[]> list;
        if (m41280f(32)) {
            return this.f190b;
        }
        C9208y c9208y = new C9208y(c0054b.f183d);
        List<Format> list2 = this.f190b;
        while (c9208y.m16097a() > 0) {
            int m16111D = c9208y.m16111D();
            int m16093e = c9208y.m16093e() + c9208y.m16111D();
            if (m16111D == 134) {
                list2 = new ArrayList<>();
                int m16111D2 = c9208y.m16111D() & 31;
                for (int i2 = 0; i2 < m16111D2; i2++) {
                    String m16114A = c9208y.m16114A(3);
                    int m16111D3 = c9208y.m16111D();
                    boolean z2 = true;
                    if ((m16111D3 & 128) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i = m16111D3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte m16111D4 = (byte) c9208y.m16111D();
                    c9208y.m16098Q(1);
                    if (z) {
                        if ((m16111D4 & 64) == 0) {
                            z2 = false;
                        }
                        list = C9157d.m16430b(z2);
                    } else {
                        list = null;
                    }
                    list2.add(new Format.C4362b().m29883e0(str).m29897V(m16114A).m29913F(i).m29899T(list).m29914E());
                }
            }
            c9208y.m16099P(m16093e);
        }
        return list2;
    }

    /* renamed from: f */
    private boolean m41280f(int i) {
        return (i & this.f189a) != 0;
    }

    @Override // p008a7.InterfaceC0052i0.InterfaceC0055c
    /* renamed from: a */
    public SparseArray<InterfaceC0052i0> mo41285a() {
        return new SparseArray<>();
    }

    @Override // p008a7.InterfaceC0052i0.InterfaceC0055c
    /* renamed from: b */
    public InterfaceC0052i0 mo41284b(int i, InterfaceC0052i0.C0054b c0054b) {
        if (i != 2) {
            if (i != 3 && i != 4) {
                if (i != 21) {
                    if (i != 27) {
                        if (i != 36) {
                            if (i != 89) {
                                if (i != 138) {
                                    if (i != 172) {
                                        if (i != 257) {
                                            if (i != 129) {
                                                if (i != 130) {
                                                    if (i != 134) {
                                                        if (i != 135) {
                                                            switch (i) {
                                                                case 15:
                                                                    if (m41280f(2)) {
                                                                        return null;
                                                                    }
                                                                    return new C0079w(new C0051i(false, c0054b.f181b));
                                                                case 16:
                                                                    return new C0079w(new C0065o(m41282d(c0054b)));
                                                                case 17:
                                                                    if (m41280f(2)) {
                                                                        return null;
                                                                    }
                                                                    return new C0079w(new C0075s(c0054b.f181b));
                                                                default:
                                                                    return null;
                                                            }
                                                        }
                                                    } else if (m41280f(16)) {
                                                        return null;
                                                    } else {
                                                        return new C0037c0(new C0078v("application/x-scte35"));
                                                    }
                                                } else if (!m41280f(64)) {
                                                    return null;
                                                }
                                            }
                                            return new C0079w(new C0036c(c0054b.f181b));
                                        }
                                        return new C0037c0(new C0078v("application/vnd.dvb.ait"));
                                    }
                                    return new C0079w(new C0043f(c0054b.f181b));
                                }
                                return new C0079w(new C0059k(c0054b.f181b));
                            }
                            return new C0079w(new C0061l(c0054b.f182c));
                        }
                        return new C0079w(new C0072q(m41283c(c0054b)));
                    } else if (m41280f(4)) {
                        return null;
                    } else {
                        return new C0079w(new C0068p(m41283c(c0054b), m41280f(1), m41280f(8)));
                    }
                }
                return new C0079w(new C0074r());
            }
            return new C0079w(new C0076t(c0054b.f181b));
        }
        return new C0079w(new C0063n(m41282d(c0054b)));
    }

    public C0057j(int i, List<Format> list) {
        this.f189a = i;
        this.f190b = list;
    }
}