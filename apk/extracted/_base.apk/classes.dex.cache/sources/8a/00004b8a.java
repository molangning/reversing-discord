package p322rc;

import com.google.zxing.Result;
import java.util.Map;
import lc.C10120b;
import lc.C10123e;
import p136hc.C7057c;
import p136hc.C7064j;
import p136hc.C7069o;
import p136hc.EnumC7055a;
import p136hc.EnumC7059e;
import p136hc.EnumC7068n;
import p136hc.InterfaceC7066l;
import sc.C12453c;

/* renamed from: rc.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12122a implements InterfaceC7066l {

    /* renamed from: b */
    private static final C7069o[] f31429b = new C7069o[0];

    /* renamed from: a */
    private final C12453c f31430a = new C12453c();

    /* renamed from: b */
    private static C10120b m6131b(C10120b c10120b) {
        int[] m12250g = c10120b.m12250g();
        if (m12250g != null) {
            int i = m12250g[0];
            int i2 = m12250g[1];
            int i3 = m12250g[2];
            int i4 = m12250g[3];
            C10120b c10120b2 = new C10120b(30, 33);
            for (int i5 = 0; i5 < 33; i5++) {
                int i6 = (((i5 * i4) + (i4 / 2)) / 33) + i2;
                for (int i7 = 0; i7 < 30; i7++) {
                    if (c10120b.m12252e(((((i7 * i3) + (i3 / 2)) + (((i5 & 1) * i3) / 2)) / 30) + i, i6)) {
                        c10120b2.m12244p(i7, i5);
                    }
                }
            }
            return c10120b2;
        }
        throw C7064j.m21461a();
    }

    @Override // p136hc.InterfaceC7066l
    /* renamed from: a */
    public Result mo1567a(C7057c c7057c, Map<EnumC7059e, ?> map) {
        if (map != null && map.containsKey(EnumC7059e.PURE_BARCODE)) {
            C10123e m5229b = this.f31430a.m5229b(m6131b(c7057c.m21478a()), map);
            Result result = new Result(m5229b.m12228h(), m5229b.m12231e(), f31429b, EnumC7055a.MAXICODE);
            String m12234b = m5229b.m12234b();
            if (m12234b != null) {
                result.m26107h(EnumC7068n.ERROR_CORRECTION_LEVEL, m12234b);
            }
            return result;
        }
        throw C7064j.m21461a();
    }

    @Override // p136hc.InterfaceC7066l
    public void reset() {
    }
}