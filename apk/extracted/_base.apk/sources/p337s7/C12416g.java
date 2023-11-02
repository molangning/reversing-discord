package p337s7;

import android.net.Uri;
import gb.AbstractC6693s;
import gb.AbstractC6701u;
import gb.C6712x;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p212l7.C10059c;
import p259o6.C11028l;

/* renamed from: s7.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12416g extends AbstractC12423h {

    /* renamed from: d */
    public final int f32271d;

    /* renamed from: e */
    public final long f32272e;

    /* renamed from: f */
    public final long f32273f;

    /* renamed from: g */
    public final boolean f32274g;

    /* renamed from: h */
    public final int f32275h;

    /* renamed from: i */
    public final long f32276i;

    /* renamed from: j */
    public final int f32277j;

    /* renamed from: k */
    public final long f32278k;

    /* renamed from: l */
    public final long f32279l;

    /* renamed from: m */
    public final boolean f32280m;

    /* renamed from: n */
    public final boolean f32281n;

    /* renamed from: o */
    public final C11028l f32282o;

    /* renamed from: p */
    public final List<C12420d> f32283p;

    /* renamed from: q */
    public final List<C12418b> f32284q;

    /* renamed from: r */
    public final Map<Uri, C12419c> f32285r;

    /* renamed from: s */
    public final long f32286s;

    /* renamed from: t */
    public final C12422f f32287t;

    /* renamed from: s7.g$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12418b extends C12421e {

        /* renamed from: u */
        public final boolean f32288u;

        /* renamed from: v */
        public final boolean f32289v;

        public C12418b(String str, C12420d c12420d, long j, int i, long j2, C11028l c11028l, String str2, String str3, long j3, long j4, boolean z, boolean z2, boolean z3) {
            super(str, c12420d, j, i, j2, c11028l, str2, str3, j3, j4, z);
            this.f32288u = z2;
            this.f32289v = z3;
        }

        /* renamed from: b */
        public C12418b m5331b(long j, int i) {
            return new C12418b(this.f32295j, this.f32296k, this.f32297l, i, j, this.f32300o, this.f32301p, this.f32302q, this.f32303r, this.f32304s, this.f32305t, this.f32288u, this.f32289v);
        }
    }

    /* renamed from: s7.g$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12419c {

        /* renamed from: a */
        public final Uri f32290a;

        /* renamed from: b */
        public final long f32291b;

        /* renamed from: c */
        public final int f32292c;

        public C12419c(Uri uri, long j, int i) {
            this.f32290a = uri;
            this.f32291b = j;
            this.f32292c = i;
        }
    }

    /* renamed from: s7.g$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C12421e implements Comparable<Long> {

        /* renamed from: j */
        public final String f32295j;

        /* renamed from: k */
        public final C12420d f32296k;

        /* renamed from: l */
        public final long f32297l;

        /* renamed from: m */
        public final int f32298m;

        /* renamed from: n */
        public final long f32299n;

        /* renamed from: o */
        public final C11028l f32300o;

        /* renamed from: p */
        public final String f32301p;

        /* renamed from: q */
        public final String f32302q;

        /* renamed from: r */
        public final long f32303r;

        /* renamed from: s */
        public final long f32304s;

        /* renamed from: t */
        public final boolean f32305t;

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(Long l) {
            if (this.f32299n > l.longValue()) {
                return 1;
            }
            if (this.f32299n < l.longValue()) {
                return -1;
            }
            return 0;
        }

        private C12421e(String str, C12420d c12420d, long j, int i, long j2, C11028l c11028l, String str2, String str3, long j3, long j4, boolean z) {
            this.f32295j = str;
            this.f32296k = c12420d;
            this.f32297l = j;
            this.f32298m = i;
            this.f32299n = j2;
            this.f32300o = c11028l;
            this.f32301p = str2;
            this.f32302q = str3;
            this.f32303r = j3;
            this.f32304s = j4;
            this.f32305t = z;
        }
    }

    /* renamed from: s7.g$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12422f {

        /* renamed from: a */
        public final long f32306a;

        /* renamed from: b */
        public final boolean f32307b;

        /* renamed from: c */
        public final long f32308c;

        /* renamed from: d */
        public final long f32309d;

        /* renamed from: e */
        public final boolean f32310e;

        public C12422f(long j, boolean z, long j2, long j3, boolean z2) {
            this.f32306a = j;
            this.f32307b = z;
            this.f32308c = j2;
            this.f32309d = j3;
            this.f32310e = z2;
        }
    }

    public C12416g(int i, String str, List<String> list, long j, long j2, boolean z, int i2, long j3, int i3, long j4, long j5, boolean z2, boolean z3, boolean z4, C11028l c11028l, List<C12420d> list2, List<C12418b> list3, C12422f c12422f, Map<Uri, C12419c> map) {
        super(str, list, z2);
        long j6;
        this.f32271d = i;
        this.f32273f = j2;
        this.f32274g = z;
        this.f32275h = i2;
        this.f32276i = j3;
        this.f32277j = i3;
        this.f32278k = j4;
        this.f32279l = j5;
        this.f32280m = z3;
        this.f32281n = z4;
        this.f32282o = c11028l;
        this.f32283p = AbstractC6693s.m22134u(list2);
        this.f32284q = AbstractC6693s.m22134u(list3);
        this.f32285r = AbstractC6701u.m22111c(map);
        if (!list3.isEmpty()) {
            C12418b c12418b = (C12418b) C6712x.m22059c(list3);
            this.f32286s = c12418b.f32299n + c12418b.f32297l;
        } else if (!list2.isEmpty()) {
            C12420d c12420d = (C12420d) C6712x.m22059c(list2);
            this.f32286s = c12420d.f32299n + c12420d.f32297l;
        } else {
            this.f32286s = 0L;
        }
        if (j == -9223372036854775807L) {
            j6 = -9223372036854775807L;
        } else {
            j6 = j >= 0 ? j : this.f32286s + j;
        }
        this.f32272e = j6;
        this.f32287t = c12422f;
    }

    @Override // p212l7.InterfaceC10057a
    /* renamed from: b */
    public C12416g mo3731a(List<C10059c> list) {
        return this;
    }

    /* renamed from: c */
    public C12416g m5335c(long j, int i) {
        return new C12416g(this.f32271d, this.f32311a, this.f32312b, this.f32272e, j, true, i, this.f32276i, this.f32277j, this.f32278k, this.f32279l, this.f32313c, this.f32280m, this.f32281n, this.f32282o, this.f32283p, this.f32284q, this.f32287t, this.f32285r);
    }

    /* renamed from: d */
    public C12416g m5334d() {
        if (this.f32280m) {
            return this;
        }
        return new C12416g(this.f32271d, this.f32311a, this.f32312b, this.f32272e, this.f32273f, this.f32274g, this.f32275h, this.f32276i, this.f32277j, this.f32278k, this.f32279l, this.f32313c, true, this.f32281n, this.f32282o, this.f32283p, this.f32284q, this.f32287t, this.f32285r);
    }

    /* renamed from: e */
    public long m5333e() {
        return this.f32273f + this.f32286s;
    }

    /* renamed from: f */
    public boolean m5332f(C12416g c12416g) {
        if (c12416g == null) {
            return true;
        }
        long j = this.f32276i;
        long j2 = c12416g.f32276i;
        if (j > j2) {
            return true;
        }
        if (j < j2) {
            return false;
        }
        int size = this.f32283p.size() - c12416g.f32283p.size();
        if (size != 0) {
            if (size > 0) {
                return true;
            }
            return false;
        }
        int size2 = this.f32284q.size();
        int size3 = c12416g.f32284q.size();
        if (size2 > size3) {
            return true;
        }
        if (size2 == size3 && this.f32280m && !c12416g.f32280m) {
            return true;
        }
        return false;
    }

    /* renamed from: s7.g$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12420d extends C12421e {

        /* renamed from: u */
        public final String f32293u;

        /* renamed from: v */
        public final List<C12418b> f32294v;

        public C12420d(String str, long j, long j2, String str2, String str3) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j, j2, false, AbstractC6693s.m22131x());
        }

        /* renamed from: b */
        public C12420d m5330b(long j, int i) {
            ArrayList arrayList = new ArrayList();
            long j2 = j;
            for (int i2 = 0; i2 < this.f32294v.size(); i2++) {
                C12418b c12418b = this.f32294v.get(i2);
                arrayList.add(c12418b.m5331b(j2, i));
                j2 += c12418b.f32297l;
            }
            return new C12420d(this.f32295j, this.f32296k, this.f32293u, this.f32297l, i, j, this.f32300o, this.f32301p, this.f32302q, this.f32303r, this.f32304s, this.f32305t, arrayList);
        }

        public C12420d(String str, C12420d c12420d, String str2, long j, int i, long j2, C11028l c11028l, String str3, String str4, long j3, long j4, boolean z, List<C12418b> list) {
            super(str, c12420d, j, i, j2, c11028l, str3, str4, j3, j4, z);
            this.f32293u = str2;
            this.f32294v = AbstractC6693s.m22134u(list);
        }
    }
}
