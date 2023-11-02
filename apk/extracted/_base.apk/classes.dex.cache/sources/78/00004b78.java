package p317r7;

import android.util.SparseArray;
import p195k8.C9183l0;

/* renamed from: r7.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12104t {

    /* renamed from: a */
    private final SparseArray<C9183l0> f31413a = new SparseArray<>();

    /* renamed from: a */
    public C9183l0 m6151a(int i) {
        C9183l0 c9183l0 = this.f31413a.get(i);
        if (c9183l0 == null) {
            C9183l0 c9183l02 = new C9183l0(Long.MAX_VALUE);
            this.f31413a.put(i, c9183l02);
            return c9183l02;
        }
        return c9183l0;
    }

    /* renamed from: b */
    public void m6150b() {
        this.f31413a.clear();
    }
}