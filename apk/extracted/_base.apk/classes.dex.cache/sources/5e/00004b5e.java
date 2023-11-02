package p317r7;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.C4515a;
import com.google.android.exoplayer2.upstream.DataSource;
import gb.AbstractC6693s;
import gb.C6712x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p099f8.AbstractC6322c;
import p099f8.InterfaceC6337h;
import p153i8.InterfaceC7472x;
import p177jb.C8891c;
import p195k8.C9149a;
import p195k8.C9187n0;
import p195k8.C9191p0;
import p229m7.C10279b;
import p229m7.C10344s0;
import p260o7.AbstractC11054b;
import p260o7.AbstractC11058e;
import p260o7.AbstractC11067k;
import p260o7.AbstractC11069m;
import p260o7.InterfaceC11070n;
import p337s7.C12416g;
import p337s7.InterfaceC12428k;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r7.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12078f {

    /* renamed from: a */
    private final InterfaceC12085h f31255a;

    /* renamed from: b */
    private final DataSource f31256b;

    /* renamed from: c */
    private final DataSource f31257c;

    /* renamed from: d */
    private final C12104t f31258d;

    /* renamed from: e */
    private final Uri[] f31259e;

    /* renamed from: f */
    private final Format[] f31260f;

    /* renamed from: g */
    private final InterfaceC12428k f31261g;

    /* renamed from: h */
    private final C10344s0 f31262h;

    /* renamed from: i */
    private final List<Format> f31263i;

    /* renamed from: k */
    private boolean f31265k;

    /* renamed from: m */
    private IOException f31267m;

    /* renamed from: n */
    private Uri f31268n;

    /* renamed from: o */
    private boolean f31269o;

    /* renamed from: p */
    private InterfaceC6337h f31270p;

    /* renamed from: r */
    private boolean f31272r;

    /* renamed from: j */
    private final C12076e f31264j = new C12076e(4);

    /* renamed from: l */
    private byte[] f31266l = C9191p0.f24176f;

    /* renamed from: q */
    private long f31271q = -9223372036854775807L;

    /* renamed from: r7.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12079a extends AbstractC11067k {

        /* renamed from: l */
        private byte[] f31273l;

        public C12079a(DataSource dataSource, C4515a c4515a, Format format, int i, Object obj, byte[] bArr) {
            super(dataSource, c4515a, 3, format, i, obj, bArr);
        }

        @Override // p260o7.AbstractC11067k
        /* renamed from: g */
        protected void mo6286g(byte[] bArr, int i) {
            this.f31273l = Arrays.copyOf(bArr, i);
        }

        /* renamed from: j */
        public byte[] m6285j() {
            return this.f31273l;
        }
    }

    /* renamed from: r7.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12080b {

        /* renamed from: a */
        public AbstractC11058e f31274a;

        /* renamed from: b */
        public boolean f31275b;

        /* renamed from: c */
        public Uri f31276c;

        public C12080b() {
            m6284a();
        }

        /* renamed from: a */
        public void m6284a() {
            this.f31274a = null;
            this.f31275b = false;
            this.f31276c = null;
        }
    }

    /* renamed from: r7.f$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12081c extends AbstractC11054b {

        /* renamed from: e */
        private final List<C12416g.C12421e> f31277e;

        /* renamed from: f */
        private final long f31278f;

        /* renamed from: g */
        private final String f31279g;

        public C12081c(String str, long j, List<C12416g.C12421e> list) {
            super(0L, list.size() - 1);
            this.f31279g = str;
            this.f31278f = j;
            this.f31277e = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r7.f$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12082d extends AbstractC6322c {

        /* renamed from: g */
        private int f31280g;

        public C12082d(C10344s0 c10344s0, int[] iArr) {
            super(c10344s0, iArr);
            this.f31280g = mo22887n(c10344s0.m11721a(iArr[0]));
        }

        @Override // p099f8.InterfaceC6337h
        /* renamed from: a */
        public int mo6283a() {
            return this.f31280g;
        }

        @Override // p099f8.InterfaceC6337h
        /* renamed from: f */
        public Object mo6282f() {
            return null;
        }

        @Override // p099f8.InterfaceC6337h
        /* renamed from: l */
        public void mo6281l(long j, long j2, long j3, List<? extends AbstractC11069m> list, InterfaceC11070n[] interfaceC11070nArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (!m22978t(this.f31280g, elapsedRealtime)) {
                return;
            }
            for (int i = this.f17852b - 1; i >= 0; i--) {
                if (!m22978t(i, elapsedRealtime)) {
                    this.f31280g = i;
                    return;
                }
            }
            throw new IllegalStateException();
        }

        @Override // p099f8.InterfaceC6337h
        /* renamed from: q */
        public int mo6280q() {
            return 0;
        }
    }

    /* renamed from: r7.f$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12083e {

        /* renamed from: a */
        public final C12416g.C12421e f31281a;

        /* renamed from: b */
        public final long f31282b;

        /* renamed from: c */
        public final int f31283c;

        /* renamed from: d */
        public final boolean f31284d;

        public C12083e(C12416g.C12421e c12421e, long j, int i) {
            boolean z;
            this.f31281a = c12421e;
            this.f31282b = j;
            this.f31283c = i;
            if ((c12421e instanceof C12416g.C12418b) && ((C12416g.C12418b) c12421e).f32289v) {
                z = true;
            } else {
                z = false;
            }
            this.f31284d = z;
        }
    }

    public C12078f(InterfaceC12085h interfaceC12085h, InterfaceC12428k interfaceC12428k, Uri[] uriArr, Format[] formatArr, InterfaceC12084g interfaceC12084g, InterfaceC7472x interfaceC7472x, C12104t c12104t, List<Format> list) {
        this.f31255a = interfaceC12085h;
        this.f31261g = interfaceC12428k;
        this.f31259e = uriArr;
        this.f31260f = formatArr;
        this.f31258d = c12104t;
        this.f31263i = list;
        DataSource mo6279a = interfaceC12084g.mo6279a(1);
        this.f31256b = mo6279a;
        if (interfaceC7472x != null) {
            mo6279a.mo6320f(interfaceC7472x);
        }
        this.f31257c = interfaceC12084g.mo6279a(3);
        this.f31262h = new C10344s0(formatArr);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < uriArr.length; i++) {
            if ((formatArr[i].f11190n & 16384) == 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        this.f31270p = new C12082d(this.f31262h, C8891c.m17070k(arrayList));
    }

    /* renamed from: c */
    private static Uri m6305c(C12416g c12416g, C12416g.C12421e c12421e) {
        String str;
        if (c12421e != null && (str = c12421e.f32301p) != null) {
            return C9187n0.m16314d(c12416g.f32311a, str);
        }
        return null;
    }

    /* renamed from: e */
    private Pair<Long, Integer> m6303e(C12086i c12086i, boolean z, C12416g c12416g, long j, long j2) {
        boolean z2;
        List<C12416g.C12418b> list;
        long j3;
        long j4;
        int i = -1;
        if (c12086i != null && !z) {
            if (c12086i.mo6275h()) {
                if (c12086i.f31302o == -1) {
                    j4 = c12086i.mo9195g();
                } else {
                    j4 = c12086i.f28993j;
                }
                Long valueOf = Long.valueOf(j4);
                int i2 = c12086i.f31302o;
                if (i2 != -1) {
                    i = i2 + 1;
                }
                return new Pair<>(valueOf, Integer.valueOf(i));
            }
            return new Pair<>(Long.valueOf(c12086i.f28993j), Integer.valueOf(c12086i.f31302o));
        }
        long j5 = c12416g.f32286s + j;
        if (c12086i != null && !this.f31269o) {
            j2 = c12086i.f28948g;
        }
        if (!c12416g.f32280m && j2 >= j5) {
            return new Pair<>(Long.valueOf(c12416g.f32276i + c12416g.f32283p.size()), -1);
        }
        long j6 = j2 - j;
        List<C12416g.C12420d> list2 = c12416g.f32283p;
        Long valueOf2 = Long.valueOf(j6);
        int i3 = 0;
        if (this.f31261g.mo5291g() && c12086i != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        int m16251f = C9191p0.m16251f(list2, valueOf2, true, z2);
        long j7 = m16251f + c12416g.f32276i;
        if (m16251f >= 0) {
            C12416g.C12420d c12420d = c12416g.f32283p.get(m16251f);
            if (j6 < c12420d.f32299n + c12420d.f32297l) {
                list = c12420d.f32294v;
            } else {
                list = c12416g.f32284q;
            }
            while (true) {
                if (i3 >= list.size()) {
                    break;
                }
                C12416g.C12418b c12418b = list.get(i3);
                if (j6 < c12418b.f32299n + c12418b.f32297l) {
                    if (c12418b.f32288u) {
                        if (list == c12416g.f32284q) {
                            j3 = 1;
                        } else {
                            j3 = 0;
                        }
                        j7 += j3;
                        i = i3;
                    }
                } else {
                    i3++;
                }
            }
        }
        return new Pair<>(Long.valueOf(j7), Integer.valueOf(i));
    }

    /* renamed from: f */
    private static C12083e m6302f(C12416g c12416g, long j, int i) {
        int i2 = (int) (j - c12416g.f32276i);
        if (i2 == c12416g.f32283p.size()) {
            if (i == -1) {
                i = 0;
            }
            if (i >= c12416g.f32284q.size()) {
                return null;
            }
            return new C12083e(c12416g.f32284q.get(i), j, i);
        }
        C12416g.C12420d c12420d = c12416g.f32283p.get(i2);
        if (i == -1) {
            return new C12083e(c12420d, j, -1);
        }
        if (i < c12420d.f32294v.size()) {
            return new C12083e(c12420d.f32294v.get(i), j, i);
        }
        int i3 = i2 + 1;
        if (i3 < c12416g.f32283p.size()) {
            return new C12083e(c12416g.f32283p.get(i3), j + 1, -1);
        }
        if (c12416g.f32284q.isEmpty()) {
            return null;
        }
        return new C12083e(c12416g.f32284q.get(0), j + 1, 0);
    }

    /* renamed from: h */
    static List<C12416g.C12421e> m6300h(C12416g c12416g, long j, int i) {
        int i2 = (int) (j - c12416g.f32276i);
        if (i2 >= 0 && c12416g.f32283p.size() >= i2) {
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            if (i2 < c12416g.f32283p.size()) {
                if (i != -1) {
                    C12416g.C12420d c12420d = c12416g.f32283p.get(i2);
                    if (i == 0) {
                        arrayList.add(c12420d);
                    } else if (i < c12420d.f32294v.size()) {
                        List<C12416g.C12418b> list = c12420d.f32294v;
                        arrayList.addAll(list.subList(i, list.size()));
                    }
                    i2++;
                }
                List<C12416g.C12420d> list2 = c12416g.f32283p;
                arrayList.addAll(list2.subList(i2, list2.size()));
                i = 0;
            }
            if (c12416g.f32279l != -9223372036854775807L) {
                if (i != -1) {
                    i3 = i;
                }
                if (i3 < c12416g.f32284q.size()) {
                    List<C12416g.C12418b> list3 = c12416g.f32284q;
                    arrayList.addAll(list3.subList(i3, list3.size()));
                }
            }
            return Collections.unmodifiableList(arrayList);
        }
        return AbstractC6693s.m22131x();
    }

    /* renamed from: k */
    private AbstractC11058e m6297k(Uri uri, int i) {
        if (uri == null) {
            return null;
        }
        byte[] m6308c = this.f31264j.m6308c(uri);
        if (m6308c != null) {
            this.f31264j.m6309b(uri, m6308c);
            return null;
        }
        return new C12079a(this.f31257c, new C4515a.C4517b().m28757i(uri).m28764b(1).m28765a(), this.f31260f[i], this.f31270p.mo6280q(), this.f31270p.mo6282f(), this.f31266l);
    }

    /* renamed from: q */
    private long m6291q(long j) {
        long j2 = this.f31271q;
        if (j2 != -9223372036854775807L) {
            return j2 - j;
        }
        return -9223372036854775807L;
    }

    /* renamed from: u */
    private void m6287u(C12416g c12416g) {
        long m5333e;
        if (c12416g.f32280m) {
            m5333e = -9223372036854775807L;
        } else {
            m5333e = c12416g.m5333e() - this.f31261g.mo5296b();
        }
        this.f31271q = m5333e;
    }

    /* renamed from: a */
    public InterfaceC11070n[] m6307a(C12086i c12086i, long j) {
        int m11720b;
        boolean z;
        int i;
        if (c12086i == null) {
            m11720b = -1;
        } else {
            m11720b = this.f31262h.m11720b(c12086i.f28945d);
        }
        int i2 = m11720b;
        int length = this.f31270p.length();
        InterfaceC11070n[] interfaceC11070nArr = new InterfaceC11070n[length];
        boolean z2 = false;
        int i3 = 0;
        while (i3 < length) {
            int mo22890d = this.f31270p.mo22890d(i3);
            Uri uri = this.f31259e[mo22890d];
            if (!this.f31261g.mo5292f(uri)) {
                interfaceC11070nArr[i3] = InterfaceC11070n.f28994a;
                i = i3;
            } else {
                C12416g mo5288l = this.f31261g.mo5288l(uri, z2);
                C9149a.m16448e(mo5288l);
                long mo5296b = mo5288l.f32273f - this.f31261g.mo5296b();
                if (mo22890d != i2) {
                    z = true;
                } else {
                    z = z2;
                }
                i = i3;
                Pair<Long, Integer> m6303e = m6303e(c12086i, z, mo5288l, mo5296b, j);
                interfaceC11070nArr[i] = new C12081c(mo5288l.f32311a, mo5296b, m6300h(mo5288l, ((Long) m6303e.first).longValue(), ((Integer) m6303e.second).intValue()));
            }
            i3 = i + 1;
            z2 = false;
        }
        return interfaceC11070nArr;
    }

    /* renamed from: b */
    public int m6306b(C12086i c12086i) {
        List<C12416g.C12418b> list;
        if (c12086i.f31302o == -1) {
            return 1;
        }
        C12416g c12416g = (C12416g) C9149a.m16448e(this.f31261g.mo5288l(this.f31259e[this.f31262h.m11720b(c12086i.f28945d)], false));
        int i = (int) (c12086i.f28993j - c12416g.f32276i);
        if (i < 0) {
            return 1;
        }
        if (i < c12416g.f32283p.size()) {
            list = c12416g.f32283p.get(i).f32294v;
        } else {
            list = c12416g.f32284q;
        }
        if (c12086i.f31302o >= list.size()) {
            return 2;
        }
        C12416g.C12418b c12418b = list.get(c12086i.f31302o);
        if (c12418b.f32289v) {
            return 0;
        }
        if (C9191p0.m16257c(Uri.parse(C9187n0.m16315c(c12416g.f32311a, c12418b.f32295j)), c12086i.f28943b.f12257a)) {
            return 1;
        }
        return 2;
    }

    /* renamed from: d */
    public void m6304d(long j, long j2, List<C12086i> list, boolean z, C12080b c12080b) {
        C12086i c12086i;
        int m11720b;
        boolean z2;
        long j3;
        Uri uri;
        if (list.isEmpty()) {
            c12086i = null;
        } else {
            c12086i = (C12086i) C6712x.m22059c(list);
        }
        if (c12086i == null) {
            m11720b = -1;
        } else {
            m11720b = this.f31262h.m11720b(c12086i.f28945d);
        }
        long j4 = j2 - j;
        long m6291q = m6291q(j);
        if (c12086i != null && !this.f31269o) {
            long m9245d = c12086i.m9245d();
            j4 = Math.max(0L, j4 - m9245d);
            if (m6291q != -9223372036854775807L) {
                m6291q = Math.max(0L, m6291q - m9245d);
            }
        }
        this.f31270p.mo6281l(j, j4, m6291q, list, m6307a(c12086i, j2));
        int mo22906o = this.f31270p.mo22906o();
        if (m11720b != mo22906o) {
            z2 = true;
        } else {
            z2 = false;
        }
        Uri uri2 = this.f31259e[mo22906o];
        if (!this.f31261g.mo5292f(uri2)) {
            c12080b.f31276c = uri2;
            this.f31272r &= uri2.equals(this.f31268n);
            this.f31268n = uri2;
            return;
        }
        C12416g mo5288l = this.f31261g.mo5288l(uri2, true);
        C9149a.m16448e(mo5288l);
        this.f31269o = mo5288l.f32313c;
        m6287u(mo5288l);
        long mo5296b = mo5288l.f32273f - this.f31261g.mo5296b();
        Pair<Long, Integer> m6303e = m6303e(c12086i, z2, mo5288l, mo5296b, j2);
        long longValue = ((Long) m6303e.first).longValue();
        int intValue = ((Integer) m6303e.second).intValue();
        if (longValue < mo5288l.f32276i && c12086i != null && z2) {
            Uri uri3 = this.f31259e[m11720b];
            C12416g mo5288l2 = this.f31261g.mo5288l(uri3, true);
            C9149a.m16448e(mo5288l2);
            j3 = mo5288l2.f32273f - this.f31261g.mo5296b();
            Pair<Long, Integer> m6303e2 = m6303e(c12086i, false, mo5288l2, j3, j2);
            longValue = ((Long) m6303e2.first).longValue();
            intValue = ((Integer) m6303e2.second).intValue();
            uri = uri3;
            mo5288l = mo5288l2;
        } else {
            j3 = mo5296b;
            uri = uri2;
            m11720b = mo22906o;
        }
        if (longValue < mo5288l.f32276i) {
            this.f31267m = new C10279b();
            return;
        }
        C12083e m6302f = m6302f(mo5288l, longValue, intValue);
        if (m6302f == null) {
            if (!mo5288l.f32280m) {
                c12080b.f31276c = uri;
                this.f31272r &= uri.equals(this.f31268n);
                this.f31268n = uri;
                return;
            } else if (!z && !mo5288l.f32283p.isEmpty()) {
                m6302f = new C12083e((C12416g.C12421e) C6712x.m22059c(mo5288l.f32283p), (mo5288l.f32276i + mo5288l.f32283p.size()) - 1, -1);
            } else {
                c12080b.f31275b = true;
                return;
            }
        }
        this.f31272r = false;
        this.f31268n = null;
        Uri m6305c = m6305c(mo5288l, m6302f.f31281a.f32296k);
        AbstractC11058e m6297k = m6297k(m6305c, m11720b);
        c12080b.f31274a = m6297k;
        if (m6297k != null) {
            return;
        }
        Uri m6305c2 = m6305c(mo5288l, m6302f.f31281a);
        AbstractC11058e m6297k2 = m6297k(m6305c2, m11720b);
        c12080b.f31274a = m6297k2;
        if (m6297k2 != null) {
            return;
        }
        c12080b.f31274a = C12086i.m6273j(this.f31255a, this.f31256b, this.f31260f[m11720b], j3, mo5288l, m6302f, uri, this.f31263i, this.f31270p.mo6280q(), this.f31270p.mo6282f(), this.f31265k, this.f31258d, c12086i, this.f31264j.m6310a(m6305c2), this.f31264j.m6310a(m6305c));
    }

    /* renamed from: g */
    public int m6301g(long j, List<? extends AbstractC11069m> list) {
        if (this.f31267m == null && this.f31270p.length() >= 2) {
            return this.f31270p.mo22907m(j, list);
        }
        return list.size();
    }

    /* renamed from: i */
    public C10344s0 m6299i() {
        return this.f31262h;
    }

    /* renamed from: j */
    public InterfaceC6337h m6298j() {
        return this.f31270p;
    }

    /* renamed from: l */
    public boolean m6296l(AbstractC11058e abstractC11058e, long j) {
        InterfaceC6337h interfaceC6337h = this.f31270p;
        return interfaceC6337h.mo22912b(interfaceC6337h.mo22889h(this.f31262h.m11720b(abstractC11058e.f28945d)), j);
    }

    /* renamed from: m */
    public void m6295m() {
        IOException iOException = this.f31267m;
        if (iOException == null) {
            Uri uri = this.f31268n;
            if (uri != null && this.f31272r) {
                this.f31261g.mo5297a(uri);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: n */
    public void m6294n(AbstractC11058e abstractC11058e) {
        if (abstractC11058e instanceof C12079a) {
            C12079a c12079a = (C12079a) abstractC11058e;
            this.f31266l = c12079a.m9198h();
            this.f31264j.m6309b(c12079a.f28943b.f12257a, (byte[]) C9149a.m16448e(c12079a.m6285j()));
        }
    }

    /* renamed from: o */
    public boolean m6293o(Uri uri, long j) {
        int mo22889h;
        int i = 0;
        while (true) {
            Uri[] uriArr = this.f31259e;
            if (i < uriArr.length) {
                if (uriArr[i].equals(uri)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1 || (mo22889h = this.f31270p.mo22889h(i)) == -1) {
            return true;
        }
        this.f31272r = uri.equals(this.f31268n) | this.f31272r;
        if (j != -9223372036854775807L && !this.f31270p.mo22912b(mo22889h, j)) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public void m6292p() {
        this.f31267m = null;
    }

    /* renamed from: r */
    public void m6290r(boolean z) {
        this.f31265k = z;
    }

    /* renamed from: s */
    public void m6289s(InterfaceC6337h interfaceC6337h) {
        this.f31270p = interfaceC6337h;
    }

    /* renamed from: t */
    public boolean m6288t(long j, AbstractC11058e abstractC11058e, List<? extends AbstractC11069m> list) {
        if (this.f31267m != null) {
            return false;
        }
        return this.f31270p.mo22909j(j, abstractC11058e, list);
    }
}