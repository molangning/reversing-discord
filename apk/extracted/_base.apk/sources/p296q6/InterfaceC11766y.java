package p296q6;

import p195k8.C9149a;

/* renamed from: q6.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC11766y {

    /* renamed from: q6.y$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11767a {

        /* renamed from: a */
        public final C11769z f30669a;

        /* renamed from: b */
        public final C11769z f30670b;

        public C11767a(C11769z c11769z) {
            this(c11769z, c11769z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C11767a.class != obj.getClass()) {
                return false;
            }
            C11767a c11767a = (C11767a) obj;
            if (this.f30669a.equals(c11767a.f30669a) && this.f30670b.equals(c11767a.f30670b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f30669a.hashCode() * 31) + this.f30670b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(this.f30669a);
            if (this.f30669a.equals(this.f30670b)) {
                str = "";
            } else {
                str = ", " + this.f30670b;
            }
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }

        public C11767a(C11769z c11769z, C11769z c11769z2) {
            this.f30669a = (C11769z) C9149a.m16448e(c11769z);
            this.f30670b = (C11769z) C9149a.m16448e(c11769z2);
        }
    }

    /* renamed from: q6.y$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C11768b implements InterfaceC11766y {

        /* renamed from: a */
        private final long f30671a;

        /* renamed from: b */
        private final C11767a f30672b;

        public C11768b(long j) {
            this(j, 0L);
        }

        @Override // p296q6.InterfaceC11766y
        /* renamed from: f */
        public C11767a mo1210f(long j) {
            return this.f30672b;
        }

        @Override // p296q6.InterfaceC11766y
        /* renamed from: h */
        public boolean mo1209h() {
            return false;
        }

        @Override // p296q6.InterfaceC11766y
        /* renamed from: i */
        public long mo1208i() {
            return this.f30671a;
        }

        public C11768b(long j, long j2) {
            this.f30671a = j;
            this.f30672b = new C11767a(j2 == 0 ? C11769z.f30673c : new C11769z(0L, j2));
        }
    }

    /* renamed from: f */
    C11767a mo1210f(long j);

    /* renamed from: h */
    boolean mo1209h();

    /* renamed from: i */
    long mo1208i();
}
