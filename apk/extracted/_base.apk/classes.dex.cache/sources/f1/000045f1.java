package p265oc;

import com.google.zxing.Result;
import java.util.List;
import java.util.Map;
import lc.C10120b;
import lc.C10123e;
import lc.C10125g;
import p136hc.C7057c;
import p136hc.C7064j;
import p136hc.C7069o;
import p136hc.EnumC7055a;
import p136hc.EnumC7059e;
import p136hc.EnumC7068n;
import p136hc.InterfaceC7066l;
import p285pc.C11494d;
import p301qc.C11823a;

/* renamed from: oc.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11080a implements InterfaceC7066l {

    /* renamed from: b */
    private static final C7069o[] f29032b = new C7069o[0];

    /* renamed from: a */
    private final C11494d f29033a = new C11494d();

    /* renamed from: b */
    private static C10120b m9192b(C10120b c10120b) {
        int[] m12247l = c10120b.m12247l();
        int[] m12251f = c10120b.m12251f();
        if (m12247l != null && m12251f != null) {
            int m9191c = m9191c(m12247l, c10120b);
            int i = m12247l[1];
            int i2 = m12251f[1];
            int i3 = m12247l[0];
            int i4 = ((m12251f[0] - i3) + 1) / m9191c;
            int i5 = ((i2 - i) + 1) / m9191c;
            if (i4 > 0 && i5 > 0) {
                int i6 = m9191c / 2;
                int i7 = i + i6;
                int i8 = i3 + i6;
                C10120b c10120b2 = new C10120b(i4, i5);
                for (int i9 = 0; i9 < i5; i9++) {
                    int i10 = (i9 * m9191c) + i7;
                    for (int i11 = 0; i11 < i4; i11++) {
                        if (c10120b.m12252e((i11 * m9191c) + i8, i10)) {
                            c10120b2.m12244p(i11, i9);
                        }
                    }
                }
                return c10120b2;
            }
            throw C7064j.m21461a();
        }
        throw C7064j.m21461a();
    }

    /* renamed from: c */
    private static int m9191c(int[] iArr, C10120b c10120b) {
        int m12246m = c10120b.m12246m();
        int i = iArr[0];
        int i2 = iArr[1];
        while (i < m12246m && c10120b.m12252e(i, i2)) {
            i++;
        }
        if (i != m12246m) {
            int i3 = i - iArr[0];
            if (i3 != 0) {
                return i3;
            }
            throw C7064j.m21461a();
        }
        throw C7064j.m21461a();
    }

    @Override // p136hc.InterfaceC7066l
    /* renamed from: a */
    public Result mo1567a(C7057c c7057c, Map<EnumC7059e, ?> map) {
        C7069o[] m12221b;
        C10123e c10123e;
        if (map != null && map.containsKey(EnumC7059e.PURE_BARCODE)) {
            c10123e = this.f29033a.m7987b(m9192b(c7057c.m21478a()));
            m12221b = f29032b;
        } else {
            C10125g m6825c = new C11823a(c7057c.m21478a()).m6825c();
            C10123e m7987b = this.f29033a.m7987b(m6825c.m12222a());
            m12221b = m6825c.m12221b();
            c10123e = m7987b;
        }
        Result result = new Result(c10123e.m12228h(), c10123e.m12231e(), m12221b, EnumC7055a.DATA_MATRIX);
        List<byte[]> m12235a = c10123e.m12235a();
        if (m12235a != null) {
            result.m26107h(EnumC7068n.BYTE_SEGMENTS, m12235a);
        }
        String m12234b = c10123e.m12234b();
        if (m12234b != null) {
            result.m26107h(EnumC7068n.ERROR_CORRECTION_LEVEL, m12234b);
        }
        return result;
    }

    @Override // p136hc.InterfaceC7066l
    public void reset() {
    }
}