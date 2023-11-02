package p213l8;

import java.util.ArrayList;
import java.util.List;
import p151i6.C7402m;
import p195k8.C9157d;
import p195k8.C9204w;
import p195k8.C9208y;

/* renamed from: l8.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10061a {

    /* renamed from: a */
    public final List<byte[]> f26157a;

    /* renamed from: b */
    public final int f26158b;

    /* renamed from: c */
    public final int f26159c;

    /* renamed from: d */
    public final int f26160d;

    /* renamed from: e */
    public final float f26161e;

    /* renamed from: f */
    public final String f26162f;

    private C10061a(List<byte[]> list, int i, int i2, int i3, float f, String str) {
        this.f26157a = list;
        this.f26158b = i;
        this.f26159c = i2;
        this.f26160d = i3;
        this.f26161e = f;
        this.f26162f = str;
    }

    /* renamed from: a */
    private static byte[] m12470a(C9208y c9208y) {
        int m16105J = c9208y.m16105J();
        int m16093e = c9208y.m16093e();
        c9208y.m16098Q(m16105J);
        return C9157d.m16428d(c9208y.m16094d(), m16093e, m16105J);
    }

    /* renamed from: b */
    public static C10061a m12469b(C9208y c9208y) {
        int i;
        int i2;
        float f;
        String str;
        try {
            c9208y.m16098Q(4);
            int m16111D = (c9208y.m16111D() & 3) + 1;
            if (m16111D != 3) {
                ArrayList arrayList = new ArrayList();
                int m16111D2 = c9208y.m16111D() & 31;
                for (int i3 = 0; i3 < m16111D2; i3++) {
                    arrayList.add(m12470a(c9208y));
                }
                int m16111D3 = c9208y.m16111D();
                for (int i4 = 0; i4 < m16111D3; i4++) {
                    arrayList.add(m12470a(c9208y));
                }
                if (m16111D2 > 0) {
                    C9204w.C9206b m16136i = C9204w.m16136i((byte[]) arrayList.get(0), m16111D, ((byte[]) arrayList.get(0)).length);
                    int i5 = m16136i.f24221e;
                    int i6 = m16136i.f24222f;
                    float f2 = m16136i.f24223g;
                    str = C9157d.m16431a(m16136i.f24217a, m16136i.f24218b, m16136i.f24219c);
                    i = i5;
                    i2 = i6;
                    f = f2;
                } else {
                    i = -1;
                    i2 = -1;
                    f = 1.0f;
                    str = null;
                }
                return new C10061a(arrayList, m16111D, i, i2, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C7402m("Error parsing AVC config", e);
        }
    }
}