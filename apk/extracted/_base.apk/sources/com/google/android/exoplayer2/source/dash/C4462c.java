package com.google.android.exoplayer2.source.dash;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.dash.C4467e;
import com.google.android.exoplayer2.source.dash.InterfaceC4458a;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.InterfaceC4540f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p099f8.InterfaceC6337h;
import p151i6.C7390b;
import p151i6.C7410u;
import p153i8.InterfaceC7467t;
import p153i8.InterfaceC7472x;
import p195k8.C9191p0;
import p195k8.C9200u;
import p229m7.C10279b;
import p260o7.AbstractC11054b;
import p260o7.AbstractC11058e;
import p260o7.AbstractC11069m;
import p260o7.C11056d;
import p260o7.C11061g;
import p260o7.C11066j;
import p260o7.C11068l;
import p260o7.C11072o;
import p260o7.InterfaceC11059f;
import p260o7.InterfaceC11070n;
import p281p7.C11450f;
import p281p7.C11451g;
import p281p7.InterfaceC11449e;
import p296q6.C11736d;
import p296q6.InterfaceC11732b0;
import p296q6.InterfaceC11746i;
import p297q7.AbstractC11779i;
import p297q7.C11770a;
import p297q7.C11771b;
import p297q7.C11778h;
import p382v6.C13119e;
import p418x6.C13707g;
import p459z6.C14102a;

/* renamed from: com.google.android.exoplayer2.source.dash.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4462c implements InterfaceC4458a {

    /* renamed from: a */
    private final InterfaceC7467t f11858a;

    /* renamed from: b */
    private final int[] f11859b;

    /* renamed from: c */
    private final int f11860c;

    /* renamed from: d */
    private final DataSource f11861d;

    /* renamed from: e */
    private final long f11862e;

    /* renamed from: f */
    private final int f11863f;

    /* renamed from: g */
    private final C4467e.C4470c f11864g;

    /* renamed from: h */
    protected final C4464b[] f11865h;

    /* renamed from: i */
    private InterfaceC6337h f11866i;

    /* renamed from: j */
    private C11771b f11867j;

    /* renamed from: k */
    private int f11868k;

    /* renamed from: l */
    private IOException f11869l;

    /* renamed from: m */
    private boolean f11870m;

    /* renamed from: com.google.android.exoplayer2.source.dash.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4463a implements InterfaceC4458a.InterfaceC4459a {

        /* renamed from: a */
        private final DataSource.Factory f11871a;

        /* renamed from: b */
        private final int f11872b;

        public C4463a(DataSource.Factory factory) {
            this(factory, 1);
        }

        @Override // com.google.android.exoplayer2.source.dash.InterfaceC4458a.InterfaceC4459a
        /* renamed from: a */
        public InterfaceC4458a mo29057a(InterfaceC7467t interfaceC7467t, C11771b c11771b, int i, int[] iArr, InterfaceC6337h interfaceC6337h, int i2, long j, boolean z, List<Format> list, C4467e.C4470c c4470c, InterfaceC7472x interfaceC7472x) {
            DataSource createDataSource = this.f11871a.createDataSource();
            if (interfaceC7472x != null) {
                createDataSource.mo6320f(interfaceC7472x);
            }
            return new C4462c(interfaceC7467t, c11771b, i, iArr, interfaceC6337h, i2, createDataSource, j, this.f11872b, z, list, c4470c);
        }

        public C4463a(DataSource.Factory factory, int i) {
            this.f11871a = factory;
            this.f11872b = i;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.c$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    protected static final class C4465c extends AbstractC11054b {

        /* renamed from: e */
        private final C4464b f11878e;

        /* renamed from: f */
        private final long f11879f;

        public C4465c(C4464b c4464b, long j, long j2, long j3) {
            super(j, j2);
            this.f11878e = c4464b;
            this.f11879f = j3;
        }
    }

    public C4462c(InterfaceC7467t interfaceC7467t, C11771b c11771b, int i, int[] iArr, InterfaceC6337h interfaceC6337h, int i2, DataSource dataSource, long j, int i3, boolean z, List<Format> list, C4467e.C4470c c4470c) {
        this.f11858a = interfaceC7467t;
        this.f11867j = c11771b;
        this.f11859b = iArr;
        this.f11866i = interfaceC6337h;
        this.f11860c = i2;
        this.f11861d = dataSource;
        this.f11868k = i;
        this.f11862e = j;
        this.f11863f = i3;
        this.f11864g = c4470c;
        long m6952g = c11771b.m6952g(i);
        ArrayList<AbstractC11779i> m29061m = m29061m();
        this.f11865h = new C4464b[interfaceC6337h.length()];
        for (int i4 = 0; i4 < this.f11865h.length; i4++) {
            this.f11865h[i4] = new C4464b(m6952g, i2, m29061m.get(interfaceC6337h.mo22890d(i4)), z, list, c4470c);
        }
    }

    /* renamed from: k */
    private long m29063k(long j, long j2) {
        if (!this.f11867j.f30685d) {
            return -9223372036854775807L;
        }
        return Math.max(0L, Math.min(m29062l(j), this.f11865h[0].m29048i(this.f11865h[0].m29050g(j))) - j2);
    }

    /* renamed from: l */
    private long m29062l(long j) {
        C11771b c11771b = this.f11867j;
        long j2 = c11771b.f30682a;
        if (j2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j - C7390b.m20792c(j2 + c11771b.m6955d(this.f11868k).f30716b);
    }

    /* renamed from: m */
    private ArrayList<AbstractC11779i> m29061m() {
        List<C11770a> list = this.f11867j.m6955d(this.f11868k).f30717c;
        ArrayList<AbstractC11779i> arrayList = new ArrayList<>();
        for (int i : this.f11859b) {
            arrayList.addAll(list.get(i).f30678c);
        }
        return arrayList;
    }

    /* renamed from: n */
    private long m29060n(C4464b c4464b, AbstractC11069m abstractC11069m, long j, long j2, long j3) {
        if (abstractC11069m != null) {
            return abstractC11069m.mo9195g();
        }
        return C9191p0.m16225s(c4464b.m29047j(j), j2, j3);
    }

    @Override // p260o7.InterfaceC11065i
    /* renamed from: a */
    public void mo9206a() {
        IOException iOException = this.f11869l;
        if (iOException == null) {
            this.f11858a.mo20615a();
            return;
        }
        throw iOException;
    }

    @Override // com.google.android.exoplayer2.source.dash.InterfaceC4458a
    /* renamed from: b */
    public void mo29065b(InterfaceC6337h interfaceC6337h) {
        this.f11866i = interfaceC6337h;
    }

    @Override // com.google.android.exoplayer2.source.dash.InterfaceC4458a
    /* renamed from: c */
    public void mo29064c(C11771b c11771b, int i) {
        try {
            this.f11867j = c11771b;
            this.f11868k = i;
            long m6952g = c11771b.m6952g(i);
            ArrayList<AbstractC11779i> m29061m = m29061m();
            for (int i2 = 0; i2 < this.f11865h.length; i2++) {
                C4464b[] c4464bArr = this.f11865h;
                c4464bArr[i2] = c4464bArr[i2].m29055b(m6952g, m29061m.get(this.f11866i.mo22890d(i2)));
            }
        } catch (C10279b e) {
            this.f11869l = e;
        }
    }

    @Override // p260o7.InterfaceC11065i
    /* renamed from: d */
    public boolean mo9205d(AbstractC11058e abstractC11058e, boolean z, Exception exc, long j) {
        C4464b c4464b;
        int m29049h;
        if (!z) {
            return false;
        }
        C4467e.C4470c c4470c = this.f11864g;
        if (c4470c != null && c4470c.m29018j(abstractC11058e)) {
            return true;
        }
        if (!this.f11867j.f30685d && (abstractC11058e instanceof AbstractC11069m) && (exc instanceof InterfaceC4540f.C4546f) && ((InterfaceC4540f.C4546f) exc).f12375l == 404 && (m29049h = (c4464b = this.f11865h[this.f11866i.mo22887n(abstractC11058e.f28945d)]).m29049h()) != -1 && m29049h != 0) {
            if (((AbstractC11069m) abstractC11058e).mo9195g() > (c4464b.m29051f() + m29049h) - 1) {
                this.f11870m = true;
                return true;
            }
        }
        if (j == -9223372036854775807L) {
            return false;
        }
        InterfaceC6337h interfaceC6337h = this.f11866i;
        if (!interfaceC6337h.mo22912b(interfaceC6337h.mo22887n(abstractC11058e.f28945d), j)) {
            return false;
        }
        return true;
    }

    @Override // p260o7.InterfaceC11065i
    /* renamed from: f */
    public void mo9204f(AbstractC11058e abstractC11058e) {
        C11736d mo9241b;
        if (abstractC11058e instanceof C11068l) {
            int mo22887n = this.f11866i.mo22887n(((C11068l) abstractC11058e).f28945d);
            C4464b c4464b = this.f11865h[mo22887n];
            if (c4464b.f11875c == null && (mo9241b = c4464b.f11873a.mo9241b()) != null) {
                this.f11865h[mo22887n] = c4464b.m29054c(new C11451g(mo9241b, c4464b.f11874b.f30732d));
            }
        }
        C4467e.C4470c c4470c = this.f11864g;
        if (c4470c != null) {
            c4470c.m29019i(abstractC11058e);
        }
    }

    @Override // p260o7.InterfaceC11065i
    /* renamed from: g */
    public long mo9203g(long j, C7410u c7410u) {
        C4464b[] c4464bArr;
        long j2;
        for (C4464b c4464b : this.f11865h) {
            if (c4464b.f11875c != null) {
                long m29047j = c4464b.m29047j(j);
                long m29046k = c4464b.m29046k(m29047j);
                int m29049h = c4464b.m29049h();
                if (m29046k < j && (m29049h == -1 || m29047j < (c4464b.m29051f() + m29049h) - 1)) {
                    j2 = c4464b.m29046k(m29047j + 1);
                } else {
                    j2 = m29046k;
                }
                return c7410u.m20717a(j, m29046k, j2);
            }
        }
        return j;
    }

    @Override // p260o7.InterfaceC11065i
    /* renamed from: h */
    public boolean mo9202h(long j, AbstractC11058e abstractC11058e, List<? extends AbstractC11069m> list) {
        if (this.f11869l != null) {
            return false;
        }
        return this.f11866i.mo22909j(j, abstractC11058e, list);
    }

    @Override // p260o7.InterfaceC11065i
    /* renamed from: i */
    public int mo9201i(long j, List<? extends AbstractC11069m> list) {
        if (this.f11869l == null && this.f11866i.length() >= 2) {
            return this.f11866i.mo22907m(j, list);
        }
        return list.size();
    }

    @Override // p260o7.InterfaceC11065i
    /* renamed from: j */
    public void mo9200j(long j, long j2, List<? extends AbstractC11069m> list, C11061g c11061g) {
        AbstractC11069m abstractC11069m;
        boolean z;
        C11778h c11778h;
        C11778h c11778h2;
        int i;
        int i2;
        InterfaceC11070n[] interfaceC11070nArr;
        boolean z2;
        long j3;
        long j4;
        if (this.f11869l != null) {
            return;
        }
        long j5 = j2 - j;
        long m20792c = C7390b.m20792c(this.f11867j.f30682a) + C7390b.m20792c(this.f11867j.m6955d(this.f11868k).f30716b) + j2;
        C4467e.C4470c c4470c = this.f11864g;
        if (c4470c != null && c4470c.m29020h(m20792c)) {
            return;
        }
        long m20792c2 = C7390b.m20792c(C9191p0.m16263Z(this.f11862e));
        long m29062l = m29062l(m20792c2);
        boolean z3 = true;
        if (list.isEmpty()) {
            abstractC11069m = null;
        } else {
            abstractC11069m = list.get(list.size() - 1);
        }
        int length = this.f11866i.length();
        InterfaceC11070n[] interfaceC11070nArr2 = new InterfaceC11070n[length];
        int i3 = 0;
        while (i3 < length) {
            C4464b c4464b = this.f11865h[i3];
            if (c4464b.f11875c == null) {
                interfaceC11070nArr2[i3] = InterfaceC11070n.f28994a;
                i = i3;
                i2 = length;
                interfaceC11070nArr = interfaceC11070nArr2;
                z2 = z3;
                j3 = j5;
                j4 = m20792c2;
            } else {
                long m29052e = c4464b.m29052e(m20792c2);
                long m29050g = c4464b.m29050g(m20792c2);
                i = i3;
                i2 = length;
                interfaceC11070nArr = interfaceC11070nArr2;
                z2 = z3;
                j3 = j5;
                j4 = m20792c2;
                long m29060n = m29060n(c4464b, abstractC11069m, j2, m29052e, m29050g);
                if (m29060n < m29052e) {
                    interfaceC11070nArr[i] = InterfaceC11070n.f28994a;
                } else {
                    interfaceC11070nArr[i] = new C4465c(c4464b, m29060n, m29050g, m29062l);
                }
            }
            i3 = i + 1;
            m20792c2 = j4;
            z3 = z2;
            interfaceC11070nArr2 = interfaceC11070nArr;
            length = i2;
            j5 = j3;
        }
        boolean z4 = z3;
        long j6 = j5;
        long j7 = m20792c2;
        this.f11866i.mo6281l(j, j6, m29063k(j7, j), list, interfaceC11070nArr2);
        C4464b c4464b2 = this.f11865h[this.f11866i.mo6283a()];
        InterfaceC11059f interfaceC11059f = c4464b2.f11873a;
        if (interfaceC11059f != null) {
            AbstractC11779i abstractC11779i = c4464b2.f11874b;
            if (interfaceC11059f.mo9239d() == null) {
                c11778h = abstractC11779i.m6878n();
            } else {
                c11778h = null;
            }
            if (c4464b2.f11875c == null) {
                c11778h2 = abstractC11779i.mo6873m();
            } else {
                c11778h2 = null;
            }
            if (c11778h != null || c11778h2 != null) {
                c11061g.f28951a = m29059o(c4464b2, this.f11861d, this.f11866i.mo22905p(), this.f11866i.mo6280q(), this.f11866i.mo6282f(), c11778h, c11778h2);
                return;
            }
        }
        long j8 = c4464b2.f11876d;
        long j9 = -9223372036854775807L;
        int i4 = (j8 > (-9223372036854775807L) ? 1 : (j8 == (-9223372036854775807L) ? 0 : -1));
        if (i4 != 0) {
            z = z4;
        } else {
            z = false;
        }
        if (c4464b2.m29049h() == 0) {
            c11061g.f28952b = z;
            return;
        }
        long m29052e2 = c4464b2.m29052e(j7);
        long m29050g2 = c4464b2.m29050g(j7);
        boolean z5 = z;
        long m29060n2 = m29060n(c4464b2, abstractC11069m, j2, m29052e2, m29050g2);
        if (m29060n2 < m29052e2) {
            this.f11869l = new C10279b();
            return;
        }
        int i5 = (m29060n2 > m29050g2 ? 1 : (m29060n2 == m29050g2 ? 0 : -1));
        if (i5 <= 0 && (!this.f11870m || i5 < 0)) {
            if (z5 && c4464b2.m29046k(m29060n2) >= j8) {
                c11061g.f28952b = true;
                return;
            }
            int min = (int) Math.min(this.f11863f, (m29050g2 - m29060n2) + 1);
            if (i4 != 0) {
                while (min > 1 && c4464b2.m29046k((min + m29060n2) - 1) >= j8) {
                    min--;
                }
            }
            int i6 = min;
            if (list.isEmpty()) {
                j9 = j2;
            }
            c11061g.f28951a = m29058p(c4464b2, this.f11861d, this.f11860c, this.f11866i.mo22905p(), this.f11866i.mo6280q(), this.f11866i.mo6282f(), m29060n2, i6, j9, m29062l);
            return;
        }
        c11061g.f28952b = z5;
    }

    /* renamed from: o */
    protected AbstractC11058e m29059o(C4464b c4464b, DataSource dataSource, Format format, int i, Object obj, C11778h c11778h, C11778h c11778h2) {
        AbstractC11779i abstractC11779i = c4464b.f11874b;
        if (c11778h == null || (c11778h2 = c11778h.m6881a(c11778h2, abstractC11779i.f30731c)) != null) {
            c11778h = c11778h2;
        }
        return new C11068l(dataSource, C11450f.m8045a(abstractC11779i, c11778h, 0), format, i, obj, c4464b.f11873a);
    }

    /* renamed from: p */
    protected AbstractC11058e m29058p(C4464b c4464b, DataSource dataSource, int i, Format format, int i2, Object obj, long j, int i3, long j2, long j3) {
        long j4;
        int i4;
        int i5;
        AbstractC11779i abstractC11779i = c4464b.f11874b;
        long m29046k = c4464b.m29046k(j);
        C11778h m29045l = c4464b.m29045l(j);
        String str = abstractC11779i.f30731c;
        if (c4464b.f11873a == null) {
            long m29048i = c4464b.m29048i(j);
            if (c4464b.m29044m(j, j3)) {
                i5 = 0;
            } else {
                i5 = 8;
            }
            return new C11072o(dataSource, C11450f.m8045a(abstractC11779i, m29045l, i5), format, i2, obj, m29046k, m29048i, j, i, format);
        }
        int i6 = 1;
        int i7 = 1;
        while (i6 < i3) {
            C11778h m6881a = m29045l.m6881a(c4464b.m29045l(i6 + j), str);
            if (m6881a == null) {
                break;
            }
            i7++;
            i6++;
            m29045l = m6881a;
        }
        long j5 = (i7 + j) - 1;
        long m29048i2 = c4464b.m29048i(j5);
        long j6 = c4464b.f11876d;
        if (j6 != -9223372036854775807L && j6 <= m29048i2) {
            j4 = j6;
        } else {
            j4 = -9223372036854775807L;
        }
        if (c4464b.m29044m(j5, j3)) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        return new C11066j(dataSource, C11450f.m8045a(abstractC11779i, m29045l, i4), format, i2, obj, m29046k, m29048i2, j2, j4, j, i7, -abstractC11779i.f30732d, c4464b.f11873a);
    }

    @Override // p260o7.InterfaceC11065i
    public void release() {
        for (C4464b c4464b : this.f11865h) {
            InterfaceC11059f interfaceC11059f = c4464b.f11873a;
            if (interfaceC11059f != null) {
                interfaceC11059f.release();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.exoplayer2.source.dash.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4464b {

        /* renamed from: a */
        final InterfaceC11059f f11873a;

        /* renamed from: b */
        public final AbstractC11779i f11874b;

        /* renamed from: c */
        public final InterfaceC11449e f11875c;

        /* renamed from: d */
        private final long f11876d;

        /* renamed from: e */
        private final long f11877e;

        C4464b(long j, int i, AbstractC11779i abstractC11779i, boolean z, List<Format> list, InterfaceC11732b0 interfaceC11732b0) {
            this(j, abstractC11779i, m29053d(i, abstractC11779i, z, list, interfaceC11732b0), 0L, abstractC11779i.mo6874b());
        }

        /* renamed from: d */
        private static InterfaceC11059f m29053d(int i, AbstractC11779i abstractC11779i, boolean z, List<Format> list, InterfaceC11732b0 interfaceC11732b0) {
            int i2;
            InterfaceC11746i c13707g;
            String str = abstractC11779i.f30730b.f11196t;
            if (C9200u.m16152r(str)) {
                if ("application/x-rawcc".equals(str)) {
                    c13707g = new C14102a(abstractC11779i.f30730b);
                } else {
                    return null;
                }
            } else if (C9200u.m16153q(str)) {
                c13707g = new C13119e(1);
            } else {
                if (z) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
                c13707g = new C13707g(i2, null, null, list, interfaceC11732b0);
            }
            return new C11056d(c13707g, i, abstractC11779i.f30730b);
        }

        /* renamed from: b */
        C4464b m29055b(long j, AbstractC11779i abstractC11779i) {
            long mo6854h;
            long j2;
            InterfaceC11449e mo6874b = this.f11874b.mo6874b();
            InterfaceC11449e mo6874b2 = abstractC11779i.mo6874b();
            if (mo6874b == null) {
                return new C4464b(j, abstractC11779i, this.f11873a, this.f11877e, mo6874b);
            }
            if (!mo6874b.mo6852j()) {
                return new C4464b(j, abstractC11779i, this.f11873a, this.f11877e, mo6874b2);
            }
            int mo6853i = mo6874b.mo6853i(j);
            if (mo6853i == 0) {
                return new C4464b(j, abstractC11779i, this.f11873a, this.f11877e, mo6874b2);
            }
            long mo6851k = mo6874b.mo6851k();
            long mo6859c = mo6874b.mo6859c(mo6851k);
            long j3 = (mo6853i + mo6851k) - 1;
            long mo6851k2 = mo6874b2.mo6851k();
            long mo6859c2 = mo6874b2.mo6859c(mo6851k2);
            long j4 = this.f11877e;
            int i = ((mo6874b.mo6859c(j3) + mo6874b.mo6858d(j3, j)) > mo6859c2 ? 1 : ((mo6874b.mo6859c(j3) + mo6874b.mo6858d(j3, j)) == mo6859c2 ? 0 : -1));
            if (i == 0) {
                j2 = j4 + ((j3 + 1) - mo6851k2);
            } else if (i >= 0) {
                if (mo6859c2 < mo6859c) {
                    mo6854h = j4 - (mo6874b2.mo6854h(mo6859c, j) - mo6851k);
                } else {
                    mo6854h = (mo6874b.mo6854h(mo6859c2, j) - mo6851k2) + j4;
                }
                j2 = mo6854h;
            } else {
                throw new C10279b();
            }
            return new C4464b(j, abstractC11779i, this.f11873a, j2, mo6874b2);
        }

        /* renamed from: c */
        C4464b m29054c(InterfaceC11449e interfaceC11449e) {
            return new C4464b(this.f11876d, this.f11874b, this.f11873a, this.f11877e, interfaceC11449e);
        }

        /* renamed from: e */
        public long m29052e(long j) {
            return this.f11875c.mo6857e(this.f11876d, j) + this.f11877e;
        }

        /* renamed from: f */
        public long m29051f() {
            return this.f11875c.mo6851k() + this.f11877e;
        }

        /* renamed from: g */
        public long m29050g(long j) {
            return (m29052e(j) + this.f11875c.mo6850l(this.f11876d, j)) - 1;
        }

        /* renamed from: h */
        public int m29049h() {
            return this.f11875c.mo6853i(this.f11876d);
        }

        /* renamed from: i */
        public long m29048i(long j) {
            return m29046k(j) + this.f11875c.mo6858d(j - this.f11877e, this.f11876d);
        }

        /* renamed from: j */
        public long m29047j(long j) {
            return this.f11875c.mo6854h(j, this.f11876d) + this.f11877e;
        }

        /* renamed from: k */
        public long m29046k(long j) {
            return this.f11875c.mo6859c(j - this.f11877e);
        }

        /* renamed from: l */
        public C11778h m29045l(long j) {
            return this.f11875c.mo6855g(j - this.f11877e);
        }

        /* renamed from: m */
        public boolean m29044m(long j, long j2) {
            return j2 == -9223372036854775807L || m29048i(j) <= j2;
        }

        private C4464b(long j, AbstractC11779i abstractC11779i, InterfaceC11059f interfaceC11059f, long j2, InterfaceC11449e interfaceC11449e) {
            this.f11876d = j;
            this.f11874b = abstractC11779i;
            this.f11877e = j2;
            this.f11873a = interfaceC11059f;
            this.f11875c = interfaceC11449e;
        }
    }
}
