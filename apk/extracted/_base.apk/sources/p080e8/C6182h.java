package p080e8;

import android.text.TextUtils;
import java.util.ArrayList;
import p151i6.C7402m;
import p195k8.C9208y;
import p383v7.AbstractC13131d;
import p383v7.C13135h;
import p383v7.InterfaceC13133f;

/* renamed from: e8.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6182h extends AbstractC13131d {

    /* renamed from: o */
    private final C9208y f17497o;

    /* renamed from: p */
    private final C6170a f17498p;

    public C6182h() {
        super("WebvttDecoder");
        this.f17497o = new C9208y();
        this.f17498p = new C6170a();
    }

    /* renamed from: B */
    private static int m23330B(C9208y c9208y) {
        int i = -1;
        int i2 = 0;
        while (i == -1) {
            i2 = c9208y.m16093e();
            String m16082p = c9208y.m16082p();
            if (m16082p == null) {
                i = 0;
            } else if ("STYLE".equals(m16082p)) {
                i = 2;
            } else if (m16082p.startsWith("NOTE")) {
                i = 1;
            } else {
                i = 3;
            }
        }
        c9208y.m16099P(i2);
        return i;
    }

    /* renamed from: C */
    private static void m23329C(C9208y c9208y) {
        do {
        } while (!TextUtils.isEmpty(c9208y.m16082p()));
    }

    @Override // p383v7.AbstractC13131d
    /* renamed from: z */
    protected InterfaceC13133f mo1161z(byte[] bArr, int i, boolean z) {
        C6174e m23355n;
        this.f17497o.m16101N(bArr, i);
        ArrayList arrayList = new ArrayList();
        try {
            C6183i.m23324e(this.f17497o);
            do {
            } while (!TextUtils.isEmpty(this.f17497o.m16082p()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int m23330B = m23330B(this.f17497o);
                if (m23330B != 0) {
                    if (m23330B == 1) {
                        m23329C(this.f17497o);
                    } else if (m23330B == 2) {
                        if (arrayList2.isEmpty()) {
                            this.f17497o.m16082p();
                            arrayList.addAll(this.f17498p.m23405d(this.f17497o));
                        } else {
                            throw new C13135h("A style block was found after the first cue.");
                        }
                    } else if (m23330B == 3 && (m23355n = C6175f.m23355n(this.f17497o, arrayList)) != null) {
                        arrayList2.add(m23355n);
                    }
                } else {
                    return new C6185k(arrayList2);
                }
            }
        } catch (C7402m e) {
            throw new C13135h(e);
        }
    }
}
