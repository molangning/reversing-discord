package p213l8;

import java.util.Collections;
import java.util.List;
import p151i6.C7402m;
import p195k8.C9157d;
import p195k8.C9204w;
import p195k8.C9208y;
import p195k8.C9209z;

/* renamed from: l8.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10072f {

    /* renamed from: a */
    public final List<byte[]> f26197a;

    /* renamed from: b */
    public final int f26198b;

    /* renamed from: c */
    public final String f26199c;

    private C10072f(List<byte[]> list, int i, String str) {
        this.f26197a = list;
        this.f26198b = i;
        this.f26199c = str;
    }

    /* renamed from: a */
    public static C10072f m12408a(C9208y c9208y) {
        List singletonList;
        try {
            c9208y.m16098Q(21);
            int m16111D = c9208y.m16111D() & 3;
            int m16111D2 = c9208y.m16111D();
            int m16093e = c9208y.m16093e();
            int i = 0;
            for (int i2 = 0; i2 < m16111D2; i2++) {
                c9208y.m16098Q(1);
                int m16105J = c9208y.m16105J();
                for (int i3 = 0; i3 < m16105J; i3++) {
                    int m16105J2 = c9208y.m16105J();
                    i += m16105J2 + 4;
                    c9208y.m16098Q(m16105J2);
                }
            }
            c9208y.m16099P(m16093e);
            byte[] bArr = new byte[i];
            int i4 = 0;
            String str = null;
            for (int i5 = 0; i5 < m16111D2; i5++) {
                int m16111D3 = c9208y.m16111D() & 127;
                int m16105J3 = c9208y.m16105J();
                for (int i6 = 0; i6 < m16105J3; i6++) {
                    int m16105J4 = c9208y.m16105J();
                    byte[] bArr2 = C9204w.f24210a;
                    System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
                    int length = i4 + bArr2.length;
                    System.arraycopy(c9208y.m16094d(), c9208y.m16093e(), bArr, length, m16105J4);
                    if (m16111D3 == 33 && i6 == 0) {
                        str = C9157d.m16429c(new C9209z(bArr, length, length + m16105J4));
                    }
                    i4 = length + m16105J4;
                    c9208y.m16098Q(m16105J4);
                }
            }
            if (i == 0) {
                singletonList = null;
            } else {
                singletonList = Collections.singletonList(bArr);
            }
            return new C10072f(singletonList, m16111D + 1, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C7402m("Error parsing HEVC config", e);
        }
    }
}