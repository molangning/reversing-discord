package p079e7;

import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p060d7.AbstractC5780f;
import p060d7.C5778d;
import p102fb.C6374d;
import p195k8.C9207x;

/* renamed from: e7.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6169b extends AbstractC5780f {
    /* renamed from: c */
    private static Metadata m23409c(C9207x c9207x) {
        c9207x.m16116r(12);
        int m16130d = (c9207x.m16130d() + c9207x.m16126h(12)) - 4;
        c9207x.m16116r(44);
        c9207x.m16115s(c9207x.m16126h(12));
        c9207x.m16116r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (c9207x.m16130d() >= m16130d) {
                break;
            }
            c9207x.m16116r(48);
            int m16126h = c9207x.m16126h(8);
            c9207x.m16116r(4);
            int m16130d2 = c9207x.m16130d() + c9207x.m16126h(12);
            String str2 = null;
            while (c9207x.m16130d() < m16130d2) {
                int m16126h2 = c9207x.m16126h(8);
                int m16126h3 = c9207x.m16126h(8);
                int m16130d3 = c9207x.m16130d() + m16126h3;
                if (m16126h2 == 2) {
                    int m16126h4 = c9207x.m16126h(16);
                    c9207x.m16116r(8);
                    if (m16126h4 != 3) {
                    }
                    while (c9207x.m16130d() < m16130d3) {
                        str = c9207x.m16122l(c9207x.m16126h(8), C6374d.f18021a);
                        int m16126h5 = c9207x.m16126h(8);
                        for (int i = 0; i < m16126h5; i++) {
                            c9207x.m16115s(c9207x.m16126h(8));
                        }
                    }
                } else if (m16126h2 == 21) {
                    str2 = c9207x.m16122l(m16126h3, C6374d.f18021a);
                }
                c9207x.m16118p(m16130d3 * 8);
            }
            c9207x.m16118p(m16130d2 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new C6167a(m16126h, str + str2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    @Override // p060d7.AbstractC5780f
    /* renamed from: b */
    protected Metadata mo16477b(C5778d c5778d, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return m23409c(new C9207x(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
