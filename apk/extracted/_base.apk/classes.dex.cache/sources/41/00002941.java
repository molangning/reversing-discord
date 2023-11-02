package com.google.android.exoplayer2;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.MediaItem;
import p151i6.C7390b;
import p195k8.C9149a;
import p195k8.C9191p0;
import p244n7.C10508a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class Timeline {

    /* renamed from: a */
    public static final Timeline f11370a = new C4377a();

    /* renamed from: com.google.android.exoplayer2.Timeline$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4377a extends Timeline {
        C4377a() {
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: b */
        public int mo11758b(Object obj) {
            return -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: g */
        public C4378b mo11757g(int i, C4378b c4378b, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: i */
        public int mo11756i() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: m */
        public Object mo11755m(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: o */
        public C4379c mo11754o(int i, C4379c c4379c, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        /* renamed from: p */
        public int mo11753p() {
            return 0;
        }
    }

    /* renamed from: com.google.android.exoplayer2.Timeline$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4378b {

        /* renamed from: a */
        public Object f11371a;

        /* renamed from: b */
        public Object f11372b;

        /* renamed from: c */
        public int f11373c;

        /* renamed from: d */
        public long f11374d;

        /* renamed from: e */
        private long f11375e;

        /* renamed from: f */
        private C10508a f11376f = C10508a.f27481g;

        /* renamed from: a */
        public int m29735a(int i) {
            return this.f11376f.f27485d[i].f27488a;
        }

        /* renamed from: b */
        public long m29734b(int i, int i2) {
            C10508a.C10509a c10509a = this.f11376f.f27485d[i];
            if (c10509a.f27488a != -1) {
                return c10509a.f27491d[i2];
            }
            return -9223372036854775807L;
        }

        /* renamed from: c */
        public int m29733c() {
            return this.f11376f.f27483b;
        }

        /* renamed from: d */
        public int m29732d(long j) {
            return this.f11376f.m11337a(j, this.f11374d);
        }

        /* renamed from: e */
        public int m29731e(long j) {
            return this.f11376f.m11336b(j, this.f11374d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C4378b.class.equals(obj.getClass())) {
                return false;
            }
            C4378b c4378b = (C4378b) obj;
            if (C9191p0.m16257c(this.f11371a, c4378b.f11371a) && C9191p0.m16257c(this.f11372b, c4378b.f11372b) && this.f11373c == c4378b.f11373c && this.f11374d == c4378b.f11374d && this.f11375e == c4378b.f11375e && C9191p0.m16257c(this.f11376f, c4378b.f11376f)) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public long m29730f(int i) {
            return this.f11376f.f27484c[i];
        }

        /* renamed from: g */
        public long m29729g() {
            return this.f11376f.f27486e;
        }

        /* renamed from: h */
        public long m29728h() {
            return this.f11374d;
        }

        public int hashCode() {
            int hashCode;
            Object obj = this.f11371a;
            int i = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            int i2 = (217 + hashCode) * 31;
            Object obj2 = this.f11372b;
            if (obj2 != null) {
                i = obj2.hashCode();
            }
            long j = this.f11374d;
            long j2 = this.f11375e;
            return ((((((((i2 + i) * 31) + this.f11373c) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f11376f.hashCode();
        }

        /* renamed from: i */
        public int m29727i(int i) {
            return this.f11376f.f27485d[i].m11334a();
        }

        /* renamed from: j */
        public int m29726j(int i, int i2) {
            return this.f11376f.f27485d[i].m11333b(i2);
        }

        /* renamed from: k */
        public long m29725k() {
            return C7390b.m20791d(this.f11375e);
        }

        /* renamed from: l */
        public long m29724l() {
            return this.f11375e;
        }

        /* renamed from: m */
        public boolean m29723m(int i) {
            return !this.f11376f.f27485d[i].m11332c();
        }

        /* renamed from: n */
        public C4378b m29722n(Object obj, Object obj2, int i, long j, long j2) {
            return m29721o(obj, obj2, i, j, j2, C10508a.f27481g);
        }

        /* renamed from: o */
        public C4378b m29721o(Object obj, Object obj2, int i, long j, long j2, C10508a c10508a) {
            this.f11371a = obj;
            this.f11372b = obj2;
            this.f11373c = i;
            this.f11374d = j;
            this.f11375e = j2;
            this.f11376f = c10508a;
            return this;
        }
    }

    /* renamed from: com.google.android.exoplayer2.Timeline$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4379c {

        /* renamed from: r */
        public static final Object f11377r = new Object();

        /* renamed from: s */
        private static final MediaItem f11378s = new MediaItem.C4365c().m29851d("com.google.android.exoplayer2.Timeline").m29846i(Uri.EMPTY).m29854a();
        @Deprecated

        /* renamed from: b */
        public Object f11380b;

        /* renamed from: d */
        public Object f11382d;

        /* renamed from: e */
        public long f11383e;

        /* renamed from: f */
        public long f11384f;

        /* renamed from: g */
        public long f11385g;

        /* renamed from: h */
        public boolean f11386h;

        /* renamed from: i */
        public boolean f11387i;
        @Deprecated

        /* renamed from: j */
        public boolean f11388j;

        /* renamed from: k */
        public MediaItem.C4368f f11389k;

        /* renamed from: l */
        public boolean f11390l;

        /* renamed from: m */
        public int f11391m;

        /* renamed from: n */
        public int f11392n;

        /* renamed from: o */
        public long f11393o;

        /* renamed from: p */
        public long f11394p;

        /* renamed from: q */
        public long f11395q;

        /* renamed from: a */
        public Object f11379a = f11377r;

        /* renamed from: c */
        public MediaItem f11381c = f11378s;

        /* renamed from: a */
        public long m29720a() {
            return C9191p0.m16263Z(this.f11385g);
        }

        /* renamed from: b */
        public long m29719b() {
            return C7390b.m20791d(this.f11393o);
        }

        /* renamed from: c */
        public long m29718c() {
            return this.f11393o;
        }

        /* renamed from: d */
        public long m29717d() {
            return C7390b.m20791d(this.f11394p);
        }

        /* renamed from: e */
        public long m29716e() {
            return this.f11395q;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C4379c.class.equals(obj.getClass())) {
                return false;
            }
            C4379c c4379c = (C4379c) obj;
            if (C9191p0.m16257c(this.f11379a, c4379c.f11379a) && C9191p0.m16257c(this.f11381c, c4379c.f11381c) && C9191p0.m16257c(this.f11382d, c4379c.f11382d) && C9191p0.m16257c(this.f11389k, c4379c.f11389k) && this.f11383e == c4379c.f11383e && this.f11384f == c4379c.f11384f && this.f11385g == c4379c.f11385g && this.f11386h == c4379c.f11386h && this.f11387i == c4379c.f11387i && this.f11390l == c4379c.f11390l && this.f11393o == c4379c.f11393o && this.f11394p == c4379c.f11394p && this.f11391m == c4379c.f11391m && this.f11392n == c4379c.f11392n && this.f11395q == c4379c.f11395q) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public boolean m29715f() {
            boolean z;
            boolean z2;
            boolean z3 = this.f11388j;
            if (this.f11389k != null) {
                z = true;
            } else {
                z = false;
            }
            if (z3 == z) {
                z2 = true;
            } else {
                z2 = false;
            }
            C9149a.m16447f(z2);
            if (this.f11389k != null) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public C4379c m29714g(Object obj, MediaItem mediaItem, Object obj2, long j, long j2, long j3, boolean z, boolean z2, MediaItem.C4368f c4368f, long j4, long j5, int i, int i2, long j6) {
            MediaItem mediaItem2;
            Object obj3;
            boolean z3;
            MediaItem.C4369g c4369g;
            this.f11379a = obj;
            if (mediaItem != null) {
                mediaItem2 = mediaItem;
            } else {
                mediaItem2 = f11378s;
            }
            this.f11381c = mediaItem2;
            if (mediaItem != null && (c4369g = mediaItem.f11234b) != null) {
                obj3 = c4369g.f11294h;
            } else {
                obj3 = null;
            }
            this.f11380b = obj3;
            this.f11382d = obj2;
            this.f11383e = j;
            this.f11384f = j2;
            this.f11385g = j3;
            this.f11386h = z;
            this.f11387i = z2;
            if (c4368f != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.f11388j = z3;
            this.f11389k = c4368f;
            this.f11393o = j4;
            this.f11394p = j5;
            this.f11391m = i;
            this.f11392n = i2;
            this.f11395q = j6;
            this.f11390l = false;
            return this;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = (((217 + this.f11379a.hashCode()) * 31) + this.f11381c.hashCode()) * 31;
            Object obj = this.f11382d;
            int i = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            int i2 = (hashCode2 + hashCode) * 31;
            MediaItem.C4368f c4368f = this.f11389k;
            if (c4368f != null) {
                i = c4368f.hashCode();
            }
            long j = this.f11383e;
            long j2 = this.f11384f;
            long j3 = this.f11385g;
            long j4 = this.f11393o;
            long j5 = this.f11394p;
            long j6 = this.f11395q;
            return ((((((((((((((((((((((i2 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f11386h ? 1 : 0)) * 31) + (this.f11387i ? 1 : 0)) * 31) + (this.f11390l ? 1 : 0)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f11391m) * 31) + this.f11392n) * 31) + ((int) (j6 ^ (j6 >>> 32)));
        }
    }

    /* renamed from: a */
    public int mo11844a(boolean z) {
        return m29737q() ? -1 : 0;
    }

    /* renamed from: b */
    public abstract int mo11758b(Object obj);

    /* renamed from: c */
    public int mo11843c(boolean z) {
        if (m29737q()) {
            return -1;
        }
        return mo11753p() - 1;
    }

    /* renamed from: d */
    public final int m29742d(int i, C4378b c4378b, C4379c c4379c, int i2, boolean z) {
        int i3 = m29741f(i, c4378b).f11373c;
        if (m29738n(i3, c4379c).f11392n == i) {
            int mo11842e = mo11842e(i3, i2, z);
            if (mo11842e == -1) {
                return -1;
            }
            return m29738n(mo11842e, c4379c).f11391m;
        }
        return i + 1;
    }

    /* renamed from: e */
    public int mo11842e(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == mo11843c(z)) {
                        return mo11844a(z);
                    }
                    return i + 1;
                }
                throw new IllegalStateException();
            }
            return i;
        } else if (i == mo11843c(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Timeline)) {
            return false;
        }
        Timeline timeline = (Timeline) obj;
        if (timeline.mo11753p() != mo11753p() || timeline.mo11756i() != mo11756i()) {
            return false;
        }
        C4379c c4379c = new C4379c();
        C4378b c4378b = new C4378b();
        C4379c c4379c2 = new C4379c();
        C4378b c4378b2 = new C4378b();
        for (int i = 0; i < mo11753p(); i++) {
            if (!m29738n(i, c4379c).equals(timeline.m29738n(i, c4379c2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < mo11756i(); i2++) {
            if (!mo11757g(i2, c4378b, true).equals(timeline.mo11757g(i2, c4378b2, true))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final C4378b m29741f(int i, C4378b c4378b) {
        return mo11757g(i, c4378b, false);
    }

    /* renamed from: g */
    public abstract C4378b mo11757g(int i, C4378b c4378b, boolean z);

    /* renamed from: h */
    public C4378b mo29711h(Object obj, C4378b c4378b) {
        return mo11757g(mo11758b(obj), c4378b, true);
    }

    public int hashCode() {
        C4379c c4379c = new C4379c();
        C4378b c4378b = new C4378b();
        int mo11753p = 217 + mo11753p();
        for (int i = 0; i < mo11753p(); i++) {
            mo11753p = (mo11753p * 31) + m29738n(i, c4379c).hashCode();
        }
        int mo11756i = (mo11753p * 31) + mo11756i();
        for (int i2 = 0; i2 < mo11756i(); i2++) {
            mo11756i = (mo11756i * 31) + mo11757g(i2, c4378b, true).hashCode();
        }
        return mo11756i;
    }

    /* renamed from: i */
    public abstract int mo11756i();

    /* renamed from: j */
    public final Pair<Object, Long> m29740j(C4379c c4379c, C4378b c4378b, int i, long j) {
        return (Pair) C9149a.m16448e(m29739k(c4379c, c4378b, i, j, 0L));
    }

    /* renamed from: k */
    public final Pair<Object, Long> m29739k(C4379c c4379c, C4378b c4378b, int i, long j, long j2) {
        C9149a.m16450c(i, 0, mo11753p());
        mo11754o(i, c4379c, j2);
        if (j == -9223372036854775807L) {
            j = c4379c.m29718c();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = c4379c.f11391m;
        long m29716e = c4379c.m29716e() + j;
        long m29728h = mo11757g(i2, c4378b, true).m29728h();
        while (m29728h != -9223372036854775807L && m29716e >= m29728h && i2 < c4379c.f11392n) {
            m29716e -= m29728h;
            i2++;
            m29728h = mo11757g(i2, c4378b, true).m29728h();
        }
        return Pair.create(C9149a.m16448e(c4378b.f11372b), Long.valueOf(m29716e));
    }

    /* renamed from: l */
    public int mo11841l(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == mo11844a(z)) {
                        return mo11843c(z);
                    }
                    return i - 1;
                }
                throw new IllegalStateException();
            }
            return i;
        } else if (i == mo11844a(z)) {
            return -1;
        } else {
            return i - 1;
        }
    }

    /* renamed from: m */
    public abstract Object mo11755m(int i);

    /* renamed from: n */
    public final C4379c m29738n(int i, C4379c c4379c) {
        return mo11754o(i, c4379c, 0L);
    }

    /* renamed from: o */
    public abstract C4379c mo11754o(int i, C4379c c4379c, long j);

    /* renamed from: p */
    public abstract int mo11753p();

    /* renamed from: q */
    public final boolean m29737q() {
        return mo11753p() == 0;
    }

    /* renamed from: r */
    public final boolean m29736r(int i, C4378b c4378b, C4379c c4379c, int i2, boolean z) {
        return m29742d(i, c4378b, c4379c, i2, z) == -1;
    }
}