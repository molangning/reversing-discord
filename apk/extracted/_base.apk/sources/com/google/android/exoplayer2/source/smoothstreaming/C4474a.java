package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.smoothstreaming.InterfaceC4477b;
import com.google.android.exoplayer2.upstream.C4515a;
import com.google.android.exoplayer2.upstream.DataSource;
import java.io.IOException;
import java.util.List;
import p099f8.InterfaceC6337h;
import p151i6.C7410u;
import p153i8.InterfaceC7467t;
import p153i8.InterfaceC7472x;
import p195k8.C9149a;
import p229m7.C10279b;
import p260o7.AbstractC11054b;
import p260o7.AbstractC11058e;
import p260o7.AbstractC11069m;
import p260o7.C11056d;
import p260o7.C11061g;
import p260o7.C11066j;
import p260o7.InterfaceC11059f;
import p260o7.InterfaceC11070n;
import p364u7.C12878a;
import p418x6.C13707g;
import p418x6.C13720o;
import p418x6.C13721p;

/* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4474a implements InterfaceC4477b {

    /* renamed from: a */
    private final InterfaceC7467t f11965a;

    /* renamed from: b */
    private final int f11966b;

    /* renamed from: c */
    private final InterfaceC11059f[] f11967c;

    /* renamed from: d */
    private final DataSource f11968d;

    /* renamed from: e */
    private InterfaceC6337h f11969e;

    /* renamed from: f */
    private C12878a f11970f;

    /* renamed from: g */
    private int f11971g;

    /* renamed from: h */
    private IOException f11972h;

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4475a implements InterfaceC4477b.InterfaceC4478a {

        /* renamed from: a */
        private final DataSource.Factory f11973a;

        public C4475a(DataSource.Factory factory) {
            this.f11973a = factory;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.InterfaceC4477b.InterfaceC4478a
        /* renamed from: a */
        public InterfaceC4477b mo28984a(InterfaceC7467t interfaceC7467t, C12878a c12878a, int i, InterfaceC6337h interfaceC6337h, InterfaceC7472x interfaceC7472x) {
            DataSource createDataSource = this.f11973a.createDataSource();
            if (interfaceC7472x != null) {
                createDataSource.mo6320f(interfaceC7472x);
            }
            return new C4474a(interfaceC7467t, c12878a, i, interfaceC6337h, createDataSource);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.smoothstreaming.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C4476b extends AbstractC11054b {

        /* renamed from: e */
        private final C12878a.C12880b f11974e;

        /* renamed from: f */
        private final int f11975f;

        public C4476b(C12878a.C12880b c12880b, int i, int i2) {
            super(i2, c12880b.f33541k - 1);
            this.f11974e = c12880b;
            this.f11975f = i;
        }
    }

    public C4474a(InterfaceC7467t interfaceC7467t, C12878a c12878a, int i, InterfaceC6337h interfaceC6337h, DataSource dataSource) {
        C13721p[] c13721pArr;
        int i2;
        this.f11965a = interfaceC7467t;
        this.f11970f = c12878a;
        this.f11966b = i;
        this.f11969e = interfaceC6337h;
        this.f11968d = dataSource;
        C12878a.C12880b c12880b = c12878a.f33525f[i];
        this.f11967c = new InterfaceC11059f[interfaceC6337h.length()];
        int i3 = 0;
        while (i3 < this.f11967c.length) {
            int mo22890d = interfaceC6337h.mo22890d(i3);
            Format format = c12880b.f33540j[mo22890d];
            if (format.f11200x != null) {
                c13721pArr = ((C12878a.C12879a) C9149a.m16448e(c12878a.f33524e)).f33530c;
            } else {
                c13721pArr = null;
            }
            int i4 = c12880b.f33531a;
            if (i4 == 2) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            int i5 = i3;
            this.f11967c[i5] = new C11056d(new C13707g(3, null, new C13720o(mo22890d, i4, c12880b.f33533c, -9223372036854775807L, c12878a.f33526g, format, 0, c13721pArr, i2, null, null)), c12880b.f33531a, format);
            i3 = i5 + 1;
        }
    }

    /* renamed from: k */
    private static AbstractC11069m m28988k(Format format, DataSource dataSource, Uri uri, int i, long j, long j2, long j3, int i2, Object obj, InterfaceC11059f interfaceC11059f) {
        return new C11066j(dataSource, new C4515a(uri), format, i2, obj, j, j2, j3, -9223372036854775807L, i, 1, j, interfaceC11059f);
    }

    /* renamed from: l */
    private long m28987l(long j) {
        C12878a c12878a = this.f11970f;
        if (!c12878a.f33523d) {
            return -9223372036854775807L;
        }
        C12878a.C12880b c12880b = c12878a.f33525f[this.f11966b];
        int i = c12880b.f33541k - 1;
        return (c12880b.m3725e(i) + c12880b.m3727c(i)) - j;
    }

    @Override // p260o7.InterfaceC11065i
    /* renamed from: a */
    public void mo9206a() {
        IOException iOException = this.f11972h;
        if (iOException == null) {
            this.f11965a.mo20615a();
            return;
        }
        throw iOException;
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.InterfaceC4477b
    /* renamed from: b */
    public void mo28986b(InterfaceC6337h interfaceC6337h) {
        this.f11969e = interfaceC6337h;
    }

    @Override // p260o7.InterfaceC11065i
    /* renamed from: d */
    public boolean mo9205d(AbstractC11058e abstractC11058e, boolean z, Exception exc, long j) {
        if (z && j != -9223372036854775807L) {
            InterfaceC6337h interfaceC6337h = this.f11969e;
            if (interfaceC6337h.mo22912b(interfaceC6337h.mo22887n(abstractC11058e.f28945d), j)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.smoothstreaming.InterfaceC4477b
    /* renamed from: e */
    public void mo28985e(C12878a c12878a) {
        C12878a.C12880b[] c12880bArr = this.f11970f.f33525f;
        int i = this.f11966b;
        C12878a.C12880b c12880b = c12880bArr[i];
        int i2 = c12880b.f33541k;
        C12878a.C12880b c12880b2 = c12878a.f33525f[i];
        if (i2 != 0 && c12880b2.f33541k != 0) {
            int i3 = i2 - 1;
            long m3725e = c12880b.m3725e(i3) + c12880b.m3727c(i3);
            long m3725e2 = c12880b2.m3725e(0);
            if (m3725e <= m3725e2) {
                this.f11971g += i2;
            } else {
                this.f11971g += c12880b.m3726d(m3725e2);
            }
        } else {
            this.f11971g += i2;
        }
        this.f11970f = c12878a;
    }

    @Override // p260o7.InterfaceC11065i
    /* renamed from: f */
    public void mo9204f(AbstractC11058e abstractC11058e) {
    }

    @Override // p260o7.InterfaceC11065i
    /* renamed from: g */
    public long mo9203g(long j, C7410u c7410u) {
        long j2;
        C12878a.C12880b c12880b = this.f11970f.f33525f[this.f11966b];
        int m3726d = c12880b.m3726d(j);
        long m3725e = c12880b.m3725e(m3726d);
        if (m3725e < j && m3726d < c12880b.f33541k - 1) {
            j2 = c12880b.m3725e(m3726d + 1);
        } else {
            j2 = m3725e;
        }
        return c7410u.m20717a(j, m3725e, j2);
    }

    @Override // p260o7.InterfaceC11065i
    /* renamed from: h */
    public boolean mo9202h(long j, AbstractC11058e abstractC11058e, List<? extends AbstractC11069m> list) {
        if (this.f11972h != null) {
            return false;
        }
        return this.f11969e.mo22909j(j, abstractC11058e, list);
    }

    @Override // p260o7.InterfaceC11065i
    /* renamed from: i */
    public int mo9201i(long j, List<? extends AbstractC11069m> list) {
        if (this.f11972h == null && this.f11969e.length() >= 2) {
            return this.f11969e.mo22907m(j, list);
        }
        return list.size();
    }

    @Override // p260o7.InterfaceC11065i
    /* renamed from: j */
    public final void mo9200j(long j, long j2, List<? extends AbstractC11069m> list, C11061g c11061g) {
        int mo9195g;
        long j3 = j2;
        if (this.f11972h != null) {
            return;
        }
        C12878a c12878a = this.f11970f;
        C12878a.C12880b c12880b = c12878a.f33525f[this.f11966b];
        if (c12880b.f33541k == 0) {
            c11061g.f28952b = !c12878a.f33523d;
            return;
        }
        if (list.isEmpty()) {
            mo9195g = c12880b.m3726d(j3);
        } else {
            mo9195g = (int) (list.get(list.size() - 1).mo9195g() - this.f11971g);
            if (mo9195g < 0) {
                this.f11972h = new C10279b();
                return;
            }
        }
        if (mo9195g >= c12880b.f33541k) {
            c11061g.f28952b = !this.f11970f.f33523d;
            return;
        }
        long j4 = j3 - j;
        long m28987l = m28987l(j);
        int length = this.f11969e.length();
        InterfaceC11070n[] interfaceC11070nArr = new InterfaceC11070n[length];
        for (int i = 0; i < length; i++) {
            interfaceC11070nArr[i] = new C4476b(c12880b, this.f11969e.mo22890d(i), mo9195g);
        }
        this.f11969e.mo6281l(j, j4, m28987l, list, interfaceC11070nArr);
        long m3725e = c12880b.m3725e(mo9195g);
        long m3727c = m3725e + c12880b.m3727c(mo9195g);
        if (!list.isEmpty()) {
            j3 = -9223372036854775807L;
        }
        long j5 = j3;
        int i2 = mo9195g + this.f11971g;
        int mo6283a = this.f11969e.mo6283a();
        InterfaceC11059f interfaceC11059f = this.f11967c[mo6283a];
        c11061g.f28951a = m28988k(this.f11969e.mo22905p(), this.f11968d, c12880b.m3729a(this.f11969e.mo22890d(mo6283a), mo9195g), i2, m3725e, m3727c, j5, this.f11969e.mo6280q(), this.f11969e.mo6282f(), interfaceC11059f);
    }

    @Override // p260o7.InterfaceC11065i
    public void release() {
        for (InterfaceC11059f interfaceC11059f : this.f11967c) {
            interfaceC11059f.release();
        }
    }
}
