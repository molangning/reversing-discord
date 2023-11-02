package com.google.android.exoplayer2.upstream.cache;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;
import p174j8.C8868d;
import p174j8.C8871g;
import p174j8.C8872h;
import p195k8.C9149a;
import p195k8.C9197r;

/* renamed from: com.google.android.exoplayer2.upstream.cache.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4531g {

    /* renamed from: a */
    public final int f12340a;

    /* renamed from: b */
    public final String f12341b;

    /* renamed from: c */
    private final TreeSet<C4537i> f12342c;

    /* renamed from: d */
    private final ArrayList<C4532a> f12343d;

    /* renamed from: e */
    private C8872h f12344e;

    /* renamed from: com.google.android.exoplayer2.upstream.cache.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4532a {

        /* renamed from: a */
        public final long f12345a;

        /* renamed from: b */
        public final long f12346b;

        public C4532a(long j, long j2) {
            this.f12345a = j;
            this.f12346b = j2;
        }

        /* renamed from: a */
        public boolean m28684a(long j, long j2) {
            long j3 = this.f12346b;
            if (j3 == -1) {
                if (j >= this.f12345a) {
                    return true;
                }
                return false;
            } else if (j2 == -1) {
                return false;
            } else {
                long j4 = this.f12345a;
                if (j4 <= j && j + j2 <= j4 + j3) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: b */
        public boolean m28683b(long j, long j2) {
            long j3 = this.f12345a;
            if (j3 <= j) {
                long j4 = this.f12346b;
                if (j4 != -1 && j3 + j4 <= j) {
                    return false;
                }
                return true;
            } else if (j2 != -1 && j + j2 <= j3) {
                return false;
            } else {
                return true;
            }
        }
    }

    public C4531g(int i, String str) {
        this(i, str, C8872h.f23253c);
    }

    /* renamed from: a */
    public void m28696a(C4537i c4537i) {
        this.f12342c.add(c4537i);
    }

    /* renamed from: b */
    public boolean m28695b(C8871g c8871g) {
        C8872h c8872h = this.f12344e;
        C8872h m17128e = c8872h.m17128e(c8871g);
        this.f12344e = m17128e;
        return !m17128e.equals(c8872h);
    }

    /* renamed from: c */
    public C8872h m28694c() {
        return this.f12344e;
    }

    /* renamed from: d */
    public C4537i m28693d(long j, long j2) {
        C4537i m28638h = C4537i.m28638h(this.f12341b, j);
        C4537i floor = this.f12342c.floor(m28638h);
        if (floor != null && floor.f23246k + floor.f23247l > j) {
            return floor;
        }
        C4537i ceiling = this.f12342c.ceiling(m28638h);
        if (ceiling != null) {
            long j3 = ceiling.f23246k - j;
            if (j2 == -1) {
                j2 = j3;
            } else {
                j2 = Math.min(j3, j2);
            }
        }
        return C4537i.m28639g(this.f12341b, j, j2);
    }

    /* renamed from: e */
    public TreeSet<C4537i> m28692e() {
        return this.f12342c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4531g.class != obj.getClass()) {
            return false;
        }
        C4531g c4531g = (C4531g) obj;
        if (this.f12340a == c4531g.f12340a && this.f12341b.equals(c4531g.f12341b) && this.f12342c.equals(c4531g.f12342c) && this.f12344e.equals(c4531g.f12344e)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public boolean m28691f() {
        return this.f12342c.isEmpty();
    }

    /* renamed from: g */
    public boolean m28690g(long j, long j2) {
        for (int i = 0; i < this.f12343d.size(); i++) {
            if (this.f12343d.get(i).m28684a(j, j2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public boolean m28689h() {
        return this.f12343d.isEmpty();
    }

    public int hashCode() {
        return (((this.f12340a * 31) + this.f12341b.hashCode()) * 31) + this.f12344e.hashCode();
    }

    /* renamed from: i */
    public boolean m28688i(long j, long j2) {
        for (int i = 0; i < this.f12343d.size(); i++) {
            if (this.f12343d.get(i).m28683b(j, j2)) {
                return false;
            }
        }
        this.f12343d.add(new C4532a(j, j2));
        return true;
    }

    /* renamed from: j */
    public boolean m28687j(C8868d c8868d) {
        if (this.f12342c.remove(c8868d)) {
            File file = c8868d.f23249n;
            if (file != null) {
                file.delete();
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public C4537i m28686k(C4537i c4537i, long j, boolean z) {
        C9149a.m16447f(this.f12342c.remove(c4537i));
        File file = (File) C9149a.m16448e(c4537i.f23249n);
        if (z) {
            File m28637i = C4537i.m28637i((File) C9149a.m16448e(file.getParentFile()), this.f12340a, c4537i.f23246k, j);
            if (file.renameTo(m28637i)) {
                file = m28637i;
            } else {
                C9197r.m16178h("CachedContent", "Failed to rename " + file + " to " + m28637i);
            }
        }
        C4537i m28642d = c4537i.m28642d(file, j);
        this.f12342c.add(m28642d);
        return m28642d;
    }

    /* renamed from: l */
    public void m28685l(long j) {
        for (int i = 0; i < this.f12343d.size(); i++) {
            if (this.f12343d.get(i).f12345a == j) {
                this.f12343d.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public C4531g(int i, String str, C8872h c8872h) {
        this.f12340a = i;
        this.f12341b = str;
        this.f12344e = c8872h;
        this.f12342c = new TreeSet<>();
        this.f12343d = new ArrayList<>();
    }
}