package p029b9;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: b9.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2190n {

    /* renamed from: b9.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C2191a {

        /* renamed from: a */
        private final List<String> f6181a;

        /* renamed from: b */
        private final Object f6182b;

        /* synthetic */ C2191a(Object obj, C2218w0 c2218w0) {
            C2198p.m33985j(obj);
            this.f6182b = obj;
            this.f6181a = new ArrayList();
        }

        /* renamed from: a */
        public C2191a m34001a(String str, Object obj) {
            List<String> list = this.f6181a;
            C2198p.m33985j(str);
            String valueOf = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(str.length() + 1 + valueOf.length());
            sb2.append(str);
            sb2.append("=");
            sb2.append(valueOf);
            list.add(sb2.toString());
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f6182b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f6181a.size();
            for (int i = 0; i < size; i++) {
                sb2.append(this.f6181a.get(i));
                if (i < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    /* renamed from: a */
    public static boolean m34005a(Bundle bundle, Bundle bundle2) {
        if (bundle != null && bundle2 != null) {
            if (bundle.size() != bundle2.size()) {
                return false;
            }
            Set<String> keySet = bundle.keySet();
            if (!keySet.containsAll(bundle2.keySet())) {
                return false;
            }
            for (String str : keySet) {
                if (!m34004b(bundle.get(str), bundle2.get(str))) {
                    return false;
                }
            }
            return true;
        } else if (bundle == bundle2) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m34004b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* renamed from: c */
    public static int m34003c(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: d */
    public static C2191a m34002d(Object obj) {
        return new C2191a(obj, null);
    }
}