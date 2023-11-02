package p394w2;

import java.util.Arrays;

/* renamed from: w2.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13375i {

    /* renamed from: w2.i$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C13377b {

        /* renamed from: a */
        private final String f34457a;

        /* renamed from: b */
        private final C13378a f34458b;

        /* renamed from: c */
        private C13378a f34459c;

        /* renamed from: d */
        private boolean f34460d;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w2.i$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public static final class C13378a {

            /* renamed from: a */
            String f34461a;

            /* renamed from: b */
            Object f34462b;

            /* renamed from: c */
            C13378a f34463c;

            private C13378a() {
            }
        }

        /* renamed from: d */
        private C13378a m2685d() {
            C13378a c13378a = new C13378a();
            this.f34459c.f34463c = c13378a;
            this.f34459c = c13378a;
            return c13378a;
        }

        /* renamed from: e */
        private C13377b m2684e(String str, Object obj) {
            C13378a m2685d = m2685d();
            m2685d.f34462b = obj;
            m2685d.f34461a = (String) C13379j.m2677g(str);
            return this;
        }

        /* renamed from: a */
        public C13377b m2688a(String str, int i) {
            return m2684e(str, String.valueOf(i));
        }

        /* renamed from: b */
        public C13377b m2687b(String str, Object obj) {
            return m2684e(str, obj);
        }

        /* renamed from: c */
        public C13377b m2686c(String str, boolean z) {
            return m2684e(str, String.valueOf(z));
        }

        public String toString() {
            boolean z = this.f34460d;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f34457a);
            sb2.append('{');
            String str = "";
            for (C13378a c13378a = this.f34458b.f34463c; c13378a != null; c13378a = c13378a.f34463c) {
                Object obj = c13378a.f34462b;
                if (!z || obj != null) {
                    sb2.append(str);
                    String str2 = c13378a.f34461a;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    str = ", ";
                }
            }
            sb2.append('}');
            return sb2.toString();
        }

        private C13377b(String str) {
            C13378a c13378a = new C13378a();
            this.f34458b = c13378a;
            this.f34459c = c13378a;
            this.f34460d = false;
            this.f34457a = (String) C13379j.m2677g(str);
        }
    }

    /* renamed from: a */
    public static boolean m2691a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    public static int m2690b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    /* renamed from: c */
    public static C13377b m2689c(Object obj) {
        return new C13377b(obj.getClass().getSimpleName());
    }
}
