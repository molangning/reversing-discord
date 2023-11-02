package bd;

import cd.C2502e;
import cd.C2506i;
import com.google.zxing.Result;
import java.util.List;
import java.util.Map;
import lc.C10120b;
import lc.C10123e;
import lc.C10125g;
import p066dd.C5814c;
import p136hc.C7057c;
import p136hc.C7064j;
import p136hc.C7069o;
import p136hc.EnumC7055a;
import p136hc.EnumC7059e;
import p136hc.EnumC7068n;
import p136hc.InterfaceC7066l;

/* renamed from: bd.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2270a implements InterfaceC7066l {

    /* renamed from: b */
    private static final C7069o[] f6385b = new C7069o[0];

    /* renamed from: a */
    private final C2502e f6386a = new C2502e();

    /* renamed from: b */
    private static C10120b m33706b(C10120b c10120b) {
        int[] m12247l = c10120b.m12247l();
        int[] m12251f = c10120b.m12251f();
        if (m12247l != null && m12251f != null) {
            float m33705c = m33705c(m12247l, c10120b);
            int i = m12247l[1];
            int i2 = m12251f[1];
            int i3 = m12247l[0];
            int i4 = m12251f[0];
            if (i3 < i4 && i < i2) {
                int i5 = i2 - i;
                if (i5 != i4 - i3 && (i4 = i3 + i5) >= c10120b.m12246m()) {
                    throw C7064j.m21461a();
                }
                int round = Math.round(((i4 - i3) + 1) / m33705c);
                int round2 = Math.round((i5 + 1) / m33705c);
                if (round > 0 && round2 > 0) {
                    if (round2 == round) {
                        int i6 = (int) (m33705c / 2.0f);
                        int i7 = i + i6;
                        int i8 = i3 + i6;
                        int i9 = (((int) ((round - 1) * m33705c)) + i8) - i4;
                        if (i9 > 0) {
                            if (i9 <= i6) {
                                i8 -= i9;
                            } else {
                                throw C7064j.m21461a();
                            }
                        }
                        int i10 = (((int) ((round2 - 1) * m33705c)) + i7) - i2;
                        if (i10 > 0) {
                            if (i10 <= i6) {
                                i7 -= i10;
                            } else {
                                throw C7064j.m21461a();
                            }
                        }
                        C10120b c10120b2 = new C10120b(round, round2);
                        for (int i11 = 0; i11 < round2; i11++) {
                            int i12 = ((int) (i11 * m33705c)) + i7;
                            for (int i13 = 0; i13 < round; i13++) {
                                if (c10120b.m12252e(((int) (i13 * m33705c)) + i8, i12)) {
                                    c10120b2.m12244p(i13, i11);
                                }
                            }
                        }
                        return c10120b2;
                    }
                    throw C7064j.m21461a();
                }
                throw C7064j.m21461a();
            }
            throw C7064j.m21461a();
        }
        throw C7064j.m21461a();
    }

    /* renamed from: c */
    private static float m33705c(int[] iArr, C10120b c10120b) {
        int m12249j = c10120b.m12249j();
        int m12246m = c10120b.m12246m();
        int i = iArr[0];
        boolean z = true;
        int i2 = iArr[1];
        int i3 = 0;
        while (i < m12246m && i2 < m12249j) {
            if (z != c10120b.m12252e(i, i2)) {
                i3++;
                if (i3 == 5) {
                    break;
                }
                z = !z;
            }
            i++;
            i2++;
        }
        if (i != m12246m && i2 != m12249j) {
            return (i - iArr[0]) / 7.0f;
        }
        throw C7064j.m21461a();
    }

    @Override // p136hc.InterfaceC7066l
    /* renamed from: a */
    public final Result mo1567a(C7057c c7057c, Map<EnumC7059e, ?> map) {
        C7069o[] m12221b;
        C10123e c10123e;
        if (map != null && map.containsKey(EnumC7059e.PURE_BARCODE)) {
            c10123e = this.f6386a.m33120c(m33706b(c7057c.m21478a()), map);
            m12221b = f6385b;
        } else {
            C10125g m24482e = new C5814c(c7057c.m21478a()).m24482e(map);
            C10123e m33120c = this.f6386a.m33120c(m24482e.m12222a(), map);
            m12221b = m24482e.m12221b();
            c10123e = m33120c;
        }
        if (c10123e.m12232d() instanceof C2506i) {
            ((C2506i) c10123e.m12232d()).m33111a(m12221b);
        }
        Result result = new Result(c10123e.m12228h(), c10123e.m12231e(), m12221b, EnumC7055a.QR_CODE);
        List<byte[]> m12235a = c10123e.m12235a();
        if (m12235a != null) {
            result.m26107h(EnumC7068n.BYTE_SEGMENTS, m12235a);
        }
        String m12234b = c10123e.m12234b();
        if (m12234b != null) {
            result.m26107h(EnumC7068n.ERROR_CORRECTION_LEVEL, m12234b);
        }
        if (c10123e.m12227i()) {
            result.m26107h(EnumC7068n.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(c10123e.m12229g()));
            result.m26107h(EnumC7068n.STRUCTURED_APPEND_PARITY, Integer.valueOf(c10123e.m12230f()));
        }
        return result;
    }

    @Override // p136hc.InterfaceC7066l
    public void reset() {
    }
}