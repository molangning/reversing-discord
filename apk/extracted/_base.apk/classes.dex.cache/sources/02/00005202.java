package p424xc;

import ad.C0147a;
import ad.C0148b;
import com.facebook.react.uimanager.ViewDefaults;
import com.google.zxing.Result;
import java.util.ArrayList;
import java.util.Map;
import lc.C10123e;
import p136hc.C7057c;
import p136hc.C7064j;
import p136hc.C7069o;
import p136hc.EnumC7055a;
import p136hc.EnumC7059e;
import p136hc.EnumC7068n;
import p136hc.InterfaceC7066l;
import p445yc.C13983j;

/* renamed from: xc.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13778b implements InterfaceC7066l {
    /* renamed from: b */
    private static Result[] m1566b(C7057c c7057c, Map<EnumC7059e, ?> map, boolean z) {
        ArrayList arrayList = new ArrayList();
        C0148b m41069b = C0147a.m41069b(c7057c, map, z);
        for (C7069o[] c7069oArr : m41069b.m41062b()) {
            C10123e m974i = C13983j.m974i(m41069b.m41063a(), c7069oArr[4], c7069oArr[5], c7069oArr[6], c7069oArr[7], m1563e(c7069oArr), m1565c(c7069oArr));
            Result result = new Result(m974i.m12228h(), m974i.m12231e(), c7069oArr, EnumC7055a.PDF_417);
            result.m26107h(EnumC7068n.ERROR_CORRECTION_LEVEL, m974i.m12234b());
            C13779c c13779c = (C13779c) m974i.m12232d();
            if (c13779c != null) {
                result.m26107h(EnumC7068n.PDF417_EXTRA_METADATA, c13779c);
            }
            arrayList.add(result);
        }
        return (Result[]) arrayList.toArray(new Result[arrayList.size()]);
    }

    /* renamed from: c */
    private static int m1565c(C7069o[] c7069oArr) {
        return Math.max(Math.max(m1564d(c7069oArr[0], c7069oArr[4]), (m1564d(c7069oArr[6], c7069oArr[2]) * 17) / 18), Math.max(m1564d(c7069oArr[1], c7069oArr[5]), (m1564d(c7069oArr[7], c7069oArr[3]) * 17) / 18));
    }

    /* renamed from: d */
    private static int m1564d(C7069o c7069o, C7069o c7069o2) {
        if (c7069o == null || c7069o2 == null) {
            return 0;
        }
        return (int) Math.abs(c7069o.m21455c() - c7069o2.m21455c());
    }

    /* renamed from: e */
    private static int m1563e(C7069o[] c7069oArr) {
        return Math.min(Math.min(m1562f(c7069oArr[0], c7069oArr[4]), (m1562f(c7069oArr[6], c7069oArr[2]) * 17) / 18), Math.min(m1562f(c7069oArr[1], c7069oArr[5]), (m1562f(c7069oArr[7], c7069oArr[3]) * 17) / 18));
    }

    /* renamed from: f */
    private static int m1562f(C7069o c7069o, C7069o c7069o2) {
        return (c7069o == null || c7069o2 == null) ? ViewDefaults.NUMBER_OF_LINES : (int) Math.abs(c7069o.m21455c() - c7069o2.m21455c());
    }

    @Override // p136hc.InterfaceC7066l
    /* renamed from: a */
    public Result mo1567a(C7057c c7057c, Map<EnumC7059e, ?> map) {
        Result result;
        Result[] m1566b = m1566b(c7057c, map, false);
        if (m1566b != null && m1566b.length != 0 && (result = m1566b[0]) != null) {
            return result;
        }
        throw C7064j.m21461a();
    }

    @Override // p136hc.InterfaceC7066l
    public void reset() {
    }
}