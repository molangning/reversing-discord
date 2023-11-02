package p312r2;

import com.facebook.cache.common.CacheKey;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p023b3.C2117a;
import p056d3.C5741d;
import p056d3.InterfaceC5738a;
import p276p2.InterfaceC11373a;
import p292q2.C11690d;
import p292q2.InterfaceC11685a;
import p292q2.InterfaceC11688c;
import p292q2.InterfaceC11695i;
import p312r2.InterfaceC12034c;
import p344t2.InterfaceC12571a;
import p344t2.InterfaceC12572b;
import p394w2.C13379j;
import p414x2.C13677a;

/* renamed from: r2.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12037d implements InterfaceC12045h, InterfaceC12571a {

    /* renamed from: r */
    private static final Class<?> f31064r = C12037d.class;

    /* renamed from: s */
    private static final long f31065s = TimeUnit.HOURS.toMillis(2);

    /* renamed from: t */
    private static final long f31066t = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    private final long f31067a;

    /* renamed from: b */
    private final long f31068b;

    /* renamed from: c */
    private final CountDownLatch f31069c;

    /* renamed from: d */
    private long f31070d;

    /* renamed from: e */
    private final InterfaceC11688c f31071e;

    /* renamed from: f */
    final Set<String> f31072f;

    /* renamed from: g */
    private long f31073g;

    /* renamed from: h */
    private final long f31074h;

    /* renamed from: i */
    private final C2117a f31075i;

    /* renamed from: j */
    private final InterfaceC12034c f31076j;

    /* renamed from: k */
    private final InterfaceC12044g f31077k;

    /* renamed from: l */
    private final InterfaceC11685a f31078l;

    /* renamed from: m */
    private final boolean f31079m;

    /* renamed from: n */
    private final C12039b f31080n;

    /* renamed from: o */
    private final InterfaceC5738a f31081o;

    /* renamed from: p */
    private final Object f31082p = new Object();

    /* renamed from: q */
    private boolean f31083q;

    /* renamed from: r2.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class RunnableC12038a implements Runnable {
        RunnableC12038a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (C12037d.this.f31082p) {
                C12037d.this.m6520p();
            }
            C12037d.this.f31083q = true;
            C12037d.this.f31069c.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r2.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C12039b {

        /* renamed from: a */
        private boolean f31085a = false;

        /* renamed from: b */
        private long f31086b = -1;

        /* renamed from: c */
        private long f31087c = -1;

        C12039b() {
        }

        /* renamed from: a */
        public synchronized long m6516a() {
            return this.f31087c;
        }

        /* renamed from: b */
        public synchronized long m6515b() {
            return this.f31086b;
        }

        /* renamed from: c */
        public synchronized void m6514c(long j, long j2) {
            if (this.f31085a) {
                this.f31086b += j;
                this.f31087c += j2;
            }
        }

        /* renamed from: d */
        public synchronized boolean m6513d() {
            return this.f31085a;
        }

        /* renamed from: e */
        public synchronized void m6512e() {
            this.f31085a = false;
            this.f31087c = -1L;
            this.f31086b = -1L;
        }

        /* renamed from: f */
        public synchronized void m6511f(long j, long j2) {
            this.f31087c = j2;
            this.f31086b = j;
            this.f31085a = true;
        }
    }

    /* renamed from: r2.d$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C12040c {

        /* renamed from: a */
        public final long f31088a;

        /* renamed from: b */
        public final long f31089b;

        /* renamed from: c */
        public final long f31090c;

        public C12040c(long j, long j2, long j3) {
            this.f31088a = j;
            this.f31089b = j2;
            this.f31090c = j3;
        }
    }

    public C12037d(InterfaceC12034c interfaceC12034c, InterfaceC12044g interfaceC12044g, C12040c c12040c, InterfaceC11688c interfaceC11688c, InterfaceC11685a interfaceC11685a, InterfaceC12572b interfaceC12572b, Executor executor, boolean z) {
        this.f31067a = c12040c.f31089b;
        long j = c12040c.f31090c;
        this.f31068b = j;
        this.f31070d = j;
        this.f31075i = C2117a.m34175d();
        this.f31076j = interfaceC12034c;
        this.f31077k = interfaceC12044g;
        this.f31073g = -1L;
        this.f31071e = interfaceC11688c;
        this.f31074h = c12040c.f31088a;
        this.f31078l = interfaceC11685a;
        this.f31080n = new C12039b();
        this.f31081o = C5741d.m24592a();
        this.f31079m = z;
        this.f31072f = new HashSet();
        if (interfaceC12572b != null) {
            interfaceC12572b.mo4781a(this);
        }
        if (z) {
            this.f31069c = new CountDownLatch(1);
            executor.execute(new RunnableC12038a());
            return;
        }
        this.f31069c = new CountDownLatch(0);
    }

    /* renamed from: l */
    private InterfaceC11373a m6524l(InterfaceC12034c.InterfaceC12036b interfaceC12036b, CacheKey cacheKey, String str) {
        InterfaceC11373a mo6531a;
        synchronized (this.f31082p) {
            mo6531a = interfaceC12036b.mo6531a(cacheKey);
            this.f31072f.add(str);
            this.f31080n.m6514c(mo6531a.size(), 1L);
        }
        return mo6531a;
    }

    /* renamed from: m */
    private void m6523m(long j, InterfaceC11688c.EnumC11689a enumC11689a) {
        try {
            Collection<InterfaceC12034c.InterfaceC12035a> m6522n = m6522n(this.f31076j.mo6504g());
            long m6515b = this.f31080n.m6515b();
            long j2 = m6515b - j;
            int i = 0;
            long j3 = 0;
            for (InterfaceC12034c.InterfaceC12035a interfaceC12035a : m6522n) {
                if (j3 > j2) {
                    break;
                }
                long mo6503h = this.f31076j.mo6503h(interfaceC12035a);
                this.f31072f.remove(interfaceC12035a.getId());
                if (mo6503h > 0) {
                    i++;
                    j3 += mo6503h;
                    C12046i m6486e = C12046i.m6490a().m6481j(interfaceC12035a.getId()).m6484g(enumC11689a).m6482i(mo6503h).m6485f(m6515b - j3).m6486e(j);
                    this.f31071e.mo7166c(m6486e);
                    m6486e.m6489b();
                }
            }
            this.f31080n.m6514c(-j3, -i);
            this.f31076j.mo6509b();
        } catch (IOException e) {
            InterfaceC11685a interfaceC11685a = this.f31078l;
            InterfaceC11685a.EnumC11686a enumC11686a = InterfaceC11685a.EnumC11686a.EVICTION;
            Class<?> cls = f31064r;
            interfaceC11685a.mo7170a(enumC11686a, cls, "evictAboveSize: " + e.getMessage(), e);
            throw e;
        }
    }

    /* renamed from: n */
    private Collection<InterfaceC12034c.InterfaceC12035a> m6522n(Collection<InterfaceC12034c.InterfaceC12035a> collection) {
        long now = this.f31081o.now() + f31065s;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (InterfaceC12034c.InterfaceC12035a interfaceC12035a : collection) {
            if (interfaceC12035a.mo6532a() > now) {
                arrayList.add(interfaceC12035a);
            } else {
                arrayList2.add(interfaceC12035a);
            }
        }
        Collections.sort(arrayList2, this.f31077k.get());
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* renamed from: o */
    private void m6521o() {
        synchronized (this.f31082p) {
            boolean m6520p = m6520p();
            m6517s();
            long m6515b = this.f31080n.m6515b();
            if (m6515b > this.f31070d && !m6520p) {
                this.f31080n.m6512e();
                m6520p();
            }
            long j = this.f31070d;
            if (m6515b > j) {
                m6523m((j * 9) / 10, InterfaceC11688c.EnumC11689a.CACHE_FULL);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public boolean m6520p() {
        long now = this.f31081o.now();
        if (this.f31080n.m6513d()) {
            long j = this.f31073g;
            if (j != -1 && now - j <= f31066t) {
                return false;
            }
        }
        return m6519q();
    }

    /* renamed from: q */
    private boolean m6519q() {
        Set<String> set;
        long j;
        long now = this.f31081o.now();
        long j2 = f31065s + now;
        if (this.f31079m && this.f31072f.isEmpty()) {
            set = this.f31072f;
        } else if (this.f31079m) {
            set = new HashSet<>();
        } else {
            set = null;
        }
        try {
            long j3 = 0;
            long j4 = -1;
            int i = 0;
            boolean z = false;
            int i2 = 0;
            int i3 = 0;
            for (InterfaceC12034c.InterfaceC12035a interfaceC12035a : this.f31076j.mo6504g()) {
                i2++;
                j3 += interfaceC12035a.getSize();
                if (interfaceC12035a.mo6532a() > j2) {
                    i3++;
                    i = (int) (i + interfaceC12035a.getSize());
                    j = j2;
                    j4 = Math.max(interfaceC12035a.mo6532a() - now, j4);
                    z = true;
                } else {
                    j = j2;
                    if (this.f31079m) {
                        C13379j.m2677g(set);
                        set.add(interfaceC12035a.getId());
                    }
                }
                j2 = j;
            }
            if (z) {
                this.f31078l.mo7170a(InterfaceC11685a.EnumC11686a.READ_INVALID_ENTRY, f31064r, "Future timestamp found in " + i3 + " files , with a total size of " + i + " bytes, and a maximum time delta of " + j4 + "ms", null);
            }
            long j5 = i2;
            if (this.f31080n.m6516a() != j5 || this.f31080n.m6515b() != j3) {
                if (this.f31079m && this.f31072f != set) {
                    C13379j.m2677g(set);
                    this.f31072f.clear();
                    this.f31072f.addAll(set);
                }
                this.f31080n.m6511f(j3, j5);
            }
            this.f31073g = now;
            return true;
        } catch (IOException e) {
            this.f31078l.mo7170a(InterfaceC11685a.EnumC11686a.GENERIC_IO, f31064r, "calcFileCacheSize: " + e.getMessage(), e);
            return false;
        }
    }

    /* renamed from: r */
    private InterfaceC12034c.InterfaceC12036b m6518r(String str, CacheKey cacheKey) {
        m6521o();
        return this.f31076j.mo6507d(str, cacheKey);
    }

    /* renamed from: s */
    private void m6517s() {
        C2117a.EnumC2118a enumC2118a;
        if (this.f31076j.isExternal()) {
            enumC2118a = C2117a.EnumC2118a.EXTERNAL;
        } else {
            enumC2118a = C2117a.EnumC2118a.INTERNAL;
        }
        if (this.f31075i.m34173f(enumC2118a, this.f31068b - this.f31080n.m6515b())) {
            this.f31070d = this.f31067a;
        } else {
            this.f31070d = this.f31068b;
        }
    }

    @Override // p312r2.InterfaceC12045h
    /* renamed from: a */
    public void mo6497a() {
        synchronized (this.f31082p) {
            try {
                this.f31076j.mo6510a();
                this.f31072f.clear();
                this.f31071e.mo7164e();
            } catch (IOException | NullPointerException e) {
                InterfaceC11685a interfaceC11685a = this.f31078l;
                InterfaceC11685a.EnumC11686a enumC11686a = InterfaceC11685a.EnumC11686a.EVICTION;
                Class<?> cls = f31064r;
                interfaceC11685a.mo7170a(enumC11686a, cls, "clearAll: " + e.getMessage(), e);
            }
            this.f31080n.m6512e();
        }
    }

    @Override // p312r2.InterfaceC12045h
    /* renamed from: b */
    public boolean mo6496b(CacheKey cacheKey) {
        String str;
        IOException e;
        String str2 = null;
        try {
            try {
                synchronized (this.f31082p) {
                    try {
                        List<String> m7173b = C11690d.m7173b(cacheKey);
                        int i = 0;
                        while (i < m7173b.size()) {
                            String str3 = m7173b.get(i);
                            if (this.f31076j.mo6508c(str3, cacheKey)) {
                                this.f31072f.add(str3);
                                return true;
                            }
                            i++;
                            str2 = str3;
                        }
                        return false;
                    } catch (Throwable th2) {
                        str = str2;
                        th = th2;
                        try {
                            throw th;
                        } catch (IOException e2) {
                            e = e2;
                            C12046i m6483h = C12046i.m6490a().m6487d(cacheKey).m6481j(str).m6483h(e);
                            this.f31071e.mo7168a(m6483h);
                            m6483h.m6489b();
                            return false;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e3) {
            str = null;
            e = e3;
        }
    }

    @Override // p312r2.InterfaceC12045h
    /* renamed from: c */
    public InterfaceC11373a mo6495c(CacheKey cacheKey) {
        InterfaceC11373a interfaceC11373a;
        C12046i m6487d = C12046i.m6490a().m6487d(cacheKey);
        try {
            synchronized (this.f31082p) {
                List<String> m7173b = C11690d.m7173b(cacheKey);
                String str = null;
                interfaceC11373a = null;
                for (int i = 0; i < m7173b.size(); i++) {
                    str = m7173b.get(i);
                    m6487d.m6481j(str);
                    interfaceC11373a = this.f31076j.mo6505f(str, cacheKey);
                    if (interfaceC11373a != null) {
                        break;
                    }
                }
                if (interfaceC11373a == null) {
                    this.f31071e.mo7165d(m6487d);
                    this.f31072f.remove(str);
                } else {
                    C13379j.m2677g(str);
                    this.f31071e.mo7162g(m6487d);
                    this.f31072f.add(str);
                }
            }
            return interfaceC11373a;
        } catch (IOException e) {
            this.f31078l.mo7170a(InterfaceC11685a.EnumC11686a.GENERIC_IO, f31064r, "getResource", e);
            m6487d.m6483h(e);
            this.f31071e.mo7168a(m6487d);
            return null;
        } finally {
            m6487d.m6489b();
        }
    }

    @Override // p312r2.InterfaceC12045h
    /* renamed from: d */
    public InterfaceC11373a mo6494d(CacheKey cacheKey, InterfaceC11695i interfaceC11695i) {
        String m7174a;
        C12046i m6487d = C12046i.m6490a().m6487d(cacheKey);
        this.f31071e.mo7163f(m6487d);
        synchronized (this.f31082p) {
            m7174a = C11690d.m7174a(cacheKey);
        }
        m6487d.m6481j(m7174a);
        try {
            try {
                InterfaceC12034c.InterfaceC12036b m6518r = m6518r(m7174a, cacheKey);
                try {
                    m6518r.mo6530b(interfaceC11695i, cacheKey);
                    InterfaceC11373a m6524l = m6524l(m6518r, cacheKey, m7174a);
                    m6487d.m6482i(m6524l.size()).m6485f(this.f31080n.m6515b());
                    this.f31071e.mo7167b(m6487d);
                    return m6524l;
                } finally {
                    if (!m6518r.mo6529c()) {
                        C13677a.m1858f(f31064r, "Failed to delete temp file");
                    }
                }
            } catch (IOException e) {
                m6487d.m6483h(e);
                this.f31071e.mo7161h(m6487d);
                C13677a.m1857g(f31064r, "Failed inserting a file into the cache", e);
                throw e;
            }
        } finally {
            m6487d.m6489b();
        }
    }

    @Override // p312r2.InterfaceC12045h
    /* renamed from: e */
    public boolean mo6493e(CacheKey cacheKey) {
        synchronized (this.f31082p) {
            List<String> m7173b = C11690d.m7173b(cacheKey);
            for (int i = 0; i < m7173b.size(); i++) {
                if (this.f31072f.contains(m7173b.get(i))) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // p312r2.InterfaceC12045h
    /* renamed from: f */
    public void mo6492f(CacheKey cacheKey) {
        synchronized (this.f31082p) {
            try {
                List<String> m7173b = C11690d.m7173b(cacheKey);
                for (int i = 0; i < m7173b.size(); i++) {
                    String str = m7173b.get(i);
                    this.f31076j.remove(str);
                    this.f31072f.remove(str);
                }
            } catch (IOException e) {
                InterfaceC11685a interfaceC11685a = this.f31078l;
                InterfaceC11685a.EnumC11686a enumC11686a = InterfaceC11685a.EnumC11686a.DELETE_FILE;
                Class<?> cls = f31064r;
                interfaceC11685a.mo7170a(enumC11686a, cls, "delete: " + e.getMessage(), e);
            }
        }
    }

    @Override // p312r2.InterfaceC12045h
    /* renamed from: g */
    public boolean mo6491g(CacheKey cacheKey) {
        synchronized (this.f31082p) {
            if (mo6493e(cacheKey)) {
                return true;
            }
            try {
                List<String> m7173b = C11690d.m7173b(cacheKey);
                for (int i = 0; i < m7173b.size(); i++) {
                    String str = m7173b.get(i);
                    if (this.f31076j.mo6506e(str, cacheKey)) {
                        this.f31072f.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }
}
