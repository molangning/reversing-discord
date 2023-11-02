package p029b9;

import android.content.Context;
import android.util.SparseIntArray;
import p441y8.C13935f;
import p461z8.C14107a;

/* renamed from: b9.h0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2172h0 {

    /* renamed from: a */
    private final SparseIntArray f6142a = new SparseIntArray();

    /* renamed from: b */
    private C13935f f6143b;

    public C2172h0(C13935f c13935f) {
        C2198p.m33985j(c13935f);
        this.f6143b = c13935f;
    }

    /* renamed from: a */
    public final int m34034a(Context context, int i) {
        return this.f6142a.get(i, -1);
    }

    /* renamed from: b */
    public final int m34033b(Context context, C14107a.InterfaceC14116f interfaceC14116f) {
        C2198p.m33985j(context);
        C2198p.m33985j(interfaceC14116f);
        int i = 0;
        if (!interfaceC14116f.mo644e()) {
            return 0;
        }
        int mo638m = interfaceC14116f.mo638m();
        int m34034a = m34034a(context, mo638m);
        if (m34034a == -1) {
            int i2 = 0;
            while (true) {
                if (i2 < this.f6142a.size()) {
                    int keyAt = this.f6142a.keyAt(i2);
                    if (keyAt > mo638m && this.f6142a.get(keyAt) == 0) {
                        break;
                    }
                    i2++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                m34034a = this.f6143b.mo1120f(context, mo638m);
            } else {
                m34034a = i;
            }
            this.f6142a.put(mo638m, m34034a);
        }
        return m34034a;
    }

    /* renamed from: c */
    public final void m34032c() {
        this.f6142a.clear();
    }
}