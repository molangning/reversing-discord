package p073e1;

import androidx.collection.C0626b;
import androidx.core.util.C1136d;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p291q1.C11678j;

/* renamed from: e1.t0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6082t0 {

    /* renamed from: a */
    private boolean f17310a = false;

    /* renamed from: b */
    private final Set<InterfaceC6084b> f17311b = new C0626b();

    /* renamed from: c */
    private final Map<String, C11678j> f17312c = new HashMap();

    /* renamed from: d */
    private final Comparator<C1136d<String, Float>> f17313d = new C6083a();

    /* renamed from: e1.t0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C6083a implements Comparator<C1136d<String, Float>> {
        C6083a() {
        }

        @Override // java.util.Comparator
        /* renamed from: b */
        public int compare(C1136d<String, Float> c1136d, C1136d<String, Float> c1136d2) {
            float floatValue = c1136d.f3509b.floatValue();
            float floatValue2 = c1136d2.f3509b.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            if (floatValue > floatValue2) {
                return -1;
            }
            return 0;
        }
    }

    /* renamed from: e1.t0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC6084b {
        /* renamed from: a */
        void m23590a(float f);
    }

    /* renamed from: a */
    public void m23593a(String str, float f) {
        if (!this.f17310a) {
            return;
        }
        C11678j c11678j = this.f17312c.get(str);
        if (c11678j == null) {
            c11678j = new C11678j();
            this.f17312c.put(str, c11678j);
        }
        c11678j.m7204a(f);
        if (str.equals("__container")) {
            for (InterfaceC6084b interfaceC6084b : this.f17311b) {
                interfaceC6084b.m23590a(f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m23592b(boolean z) {
        this.f17310a = z;
    }
}
