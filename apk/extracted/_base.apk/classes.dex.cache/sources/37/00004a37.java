package p297q7;

import com.google.android.exoplayer2.Format;
import java.util.List;
import p195k8.C9191p0;

/* renamed from: q7.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC11783j {

    /* renamed from: a */
    final C11778h f30741a;

    /* renamed from: b */
    final long f30742b;

    /* renamed from: c */
    final long f30743c;

    /* renamed from: q7.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC11784a extends AbstractC11783j {

        /* renamed from: d */
        final long f30744d;

        /* renamed from: e */
        final long f30745e;

        /* renamed from: f */
        final List<C11787d> f30746f;

        /* renamed from: g */
        private final long f30747g;

        /* renamed from: h */
        private final long f30748h;

        /* renamed from: i */
        final long f30749i;

        public AbstractC11784a(C11778h c11778h, long j, long j2, long j3, long j4, List<C11787d> list, long j5, long j6, long j7) {
            super(c11778h, j, j2);
            this.f30744d = j3;
            this.f30745e = j4;
            this.f30746f = list;
            this.f30749i = j5;
            this.f30747g = j6;
            this.f30748h = j7;
        }

        /* renamed from: c */
        public int m6871c(long j, long j2) {
            int mo6862g = mo6862g(j);
            if (mo6862g != -1) {
                return mo6862g;
            }
            return (int) (m6866i((j2 - this.f30748h) + this.f30749i, j) - m6870d(j, j2));
        }

        /* renamed from: d */
        public long m6870d(long j, long j2) {
            if (mo6862g(j) == -1) {
                long j3 = this.f30747g;
                if (j3 != -9223372036854775807L) {
                    return Math.max(m6869e(), m6866i((j2 - this.f30748h) - j3, j));
                }
            }
            return m6869e();
        }

        /* renamed from: e */
        public long m6869e() {
            return this.f30744d;
        }

        /* renamed from: f */
        public long m6868f(long j, long j2) {
            if (this.f30746f != null) {
                return -9223372036854775807L;
            }
            long m6870d = m6870d(j, j2) + m6871c(j, j2);
            return (m6865j(m6870d) + m6867h(m6870d, j)) - this.f30749i;
        }

        /* renamed from: g */
        public abstract int mo6862g(long j);

        /* renamed from: h */
        public final long m6867h(long j, long j2) {
            List<C11787d> list = this.f30746f;
            if (list != null) {
                return (list.get((int) (j - this.f30744d)).f30755b * 1000000) / this.f30742b;
            }
            int mo6862g = mo6862g(j2);
            if (mo6862g != -1 && j == (m6869e() + mo6862g) - 1) {
                return j2 - m6865j(j);
            }
            return (this.f30745e * 1000000) / this.f30742b;
        }

        /* renamed from: i */
        public long m6866i(long j, long j2) {
            long m6869e = m6869e();
            long mo6862g = mo6862g(j2);
            if (mo6862g == 0) {
                return m6869e;
            }
            if (this.f30746f == null) {
                long j3 = this.f30744d + (j / ((this.f30745e * 1000000) / this.f30742b));
                if (j3 >= m6869e) {
                    if (mo6862g == -1) {
                        return j3;
                    }
                    return Math.min(j3, (m6869e + mo6862g) - 1);
                }
                return m6869e;
            }
            long j4 = (mo6862g + m6869e) - 1;
            long j5 = m6869e;
            while (j5 <= j4) {
                long j6 = ((j4 - j5) / 2) + j5;
                int i = (m6865j(j6) > j ? 1 : (m6865j(j6) == j ? 0 : -1));
                if (i < 0) {
                    j5 = j6 + 1;
                } else if (i > 0) {
                    j4 = j6 - 1;
                } else {
                    return j6;
                }
            }
            if (j5 == m6869e) {
                return j5;
            }
            return j4;
        }

        /* renamed from: j */
        public final long m6865j(long j) {
            long j2;
            List<C11787d> list = this.f30746f;
            if (list != null) {
                j2 = list.get((int) (j - this.f30744d)).f30754a - this.f30743c;
            } else {
                j2 = (j - this.f30744d) * this.f30745e;
            }
            return C9191p0.m16296I0(j2, 1000000L, this.f30742b);
        }

        /* renamed from: k */
        public abstract C11778h mo6861k(AbstractC11779i abstractC11779i, long j);

        /* renamed from: l */
        public boolean mo6864l() {
            return this.f30746f != null;
        }
    }

    /* renamed from: q7.j$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11785b extends AbstractC11784a {

        /* renamed from: j */
        final List<C11778h> f30750j;

        public C11785b(C11778h c11778h, long j, long j2, long j3, long j4, List<C11787d> list, long j5, List<C11778h> list2, long j6, long j7) {
            super(c11778h, j, j2, j3, j4, list, j5, j6, j7);
            this.f30750j = list2;
        }

        @Override // p297q7.AbstractC11783j.AbstractC11784a
        /* renamed from: g */
        public int mo6862g(long j) {
            return this.f30750j.size();
        }

        @Override // p297q7.AbstractC11783j.AbstractC11784a
        /* renamed from: k */
        public C11778h mo6861k(AbstractC11779i abstractC11779i, long j) {
            return this.f30750j.get((int) (j - this.f30744d));
        }

        @Override // p297q7.AbstractC11783j.AbstractC11784a
        /* renamed from: l */
        public boolean mo6864l() {
            return true;
        }
    }

    /* renamed from: q7.j$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11786c extends AbstractC11784a {

        /* renamed from: j */
        final C11791m f30751j;

        /* renamed from: k */
        final C11791m f30752k;

        /* renamed from: l */
        final long f30753l;

        public C11786c(C11778h c11778h, long j, long j2, long j3, long j4, long j5, List<C11787d> list, long j6, C11791m c11791m, C11791m c11791m2, long j7, long j8) {
            super(c11778h, j, j2, j3, j5, list, j6, j7, j8);
            this.f30751j = c11791m;
            this.f30752k = c11791m2;
            this.f30753l = j4;
        }

        @Override // p297q7.AbstractC11783j
        /* renamed from: a */
        public C11778h mo6863a(AbstractC11779i abstractC11779i) {
            C11791m c11791m = this.f30751j;
            if (c11791m != null) {
                Format format = abstractC11779i.f30730b;
                return new C11778h(c11791m.m6849a(format.f11186j, 0L, format.f11193q, 0L), 0L, -1L);
            }
            return super.mo6863a(abstractC11779i);
        }

        @Override // p297q7.AbstractC11783j.AbstractC11784a
        /* renamed from: g */
        public int mo6862g(long j) {
            List<C11787d> list = this.f30746f;
            if (list != null) {
                return list.size();
            }
            long j2 = this.f30753l;
            if (j2 != -1) {
                return (int) ((j2 - this.f30744d) + 1);
            }
            if (j != -9223372036854775807L) {
                return (int) C9191p0.m16237m(j, (this.f30745e * 1000000) / this.f30742b);
            }
            return -1;
        }

        @Override // p297q7.AbstractC11783j.AbstractC11784a
        /* renamed from: k */
        public C11778h mo6861k(AbstractC11779i abstractC11779i, long j) {
            long j2;
            List<C11787d> list = this.f30746f;
            if (list != null) {
                j2 = list.get((int) (j - this.f30744d)).f30754a;
            } else {
                j2 = (j - this.f30744d) * this.f30745e;
            }
            long j3 = j2;
            C11791m c11791m = this.f30752k;
            Format format = abstractC11779i.f30730b;
            return new C11778h(c11791m.m6849a(format.f11186j, j, format.f11193q, j3), 0L, -1L);
        }
    }

    /* renamed from: q7.j$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11787d {

        /* renamed from: a */
        final long f30754a;

        /* renamed from: b */
        final long f30755b;

        public C11787d(long j, long j2) {
            this.f30754a = j;
            this.f30755b = j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C11787d.class != obj.getClass()) {
                return false;
            }
            C11787d c11787d = (C11787d) obj;
            if (this.f30754a == c11787d.f30754a && this.f30755b == c11787d.f30755b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f30754a) * 31) + ((int) this.f30755b);
        }
    }

    public AbstractC11783j(C11778h c11778h, long j, long j2) {
        this.f30741a = c11778h;
        this.f30742b = j;
        this.f30743c = j2;
    }

    /* renamed from: a */
    public C11778h mo6863a(AbstractC11779i abstractC11779i) {
        return this.f30741a;
    }

    /* renamed from: b */
    public long m6872b() {
        return C9191p0.m16296I0(this.f30743c, 1000000L, this.f30742b);
    }

    /* renamed from: q7.j$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C11788e extends AbstractC11783j {

        /* renamed from: d */
        final long f30756d;

        /* renamed from: e */
        final long f30757e;

        public C11788e(C11778h c11778h, long j, long j2, long j3, long j4) {
            super(c11778h, j, j2);
            this.f30756d = j3;
            this.f30757e = j4;
        }

        /* renamed from: c */
        public C11778h m6860c() {
            long j = this.f30757e;
            if (j <= 0) {
                return null;
            }
            return new C11778h(null, this.f30756d, j);
        }

        public C11788e() {
            this(null, 1L, 0L, 0L, 0L);
        }
    }
}