package p297q7;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import java.util.Collections;
import java.util.List;
import p281p7.InterfaceC11449e;
import p297q7.AbstractC11783j;

/* renamed from: q7.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC11779i {

    /* renamed from: a */
    public final long f30729a;

    /* renamed from: b */
    public final Format f30730b;

    /* renamed from: c */
    public final String f30731c;

    /* renamed from: d */
    public final long f30732d;

    /* renamed from: e */
    public final List<C11774d> f30733e;

    /* renamed from: f */
    private final C11778h f30734f;

    /* renamed from: q7.i$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C11781b extends AbstractC11779i implements InterfaceC11449e {

        /* renamed from: g */
        final AbstractC11783j.AbstractC11784a f30735g;

        public C11781b(long j, Format format, String str, AbstractC11783j.AbstractC11784a abstractC11784a, List<C11774d> list) {
            super(j, format, str, abstractC11784a, list);
            this.f30735g = abstractC11784a;
        }

        @Override // p297q7.AbstractC11779i
        /* renamed from: a */
        public String mo6875a() {
            return null;
        }

        @Override // p297q7.AbstractC11779i
        /* renamed from: b */
        public InterfaceC11449e mo6874b() {
            return this;
        }

        @Override // p281p7.InterfaceC11449e
        /* renamed from: c */
        public long mo6859c(long j) {
            return this.f30735g.m6865j(j);
        }

        @Override // p281p7.InterfaceC11449e
        /* renamed from: d */
        public long mo6858d(long j, long j2) {
            return this.f30735g.m6867h(j, j2);
        }

        @Override // p281p7.InterfaceC11449e
        /* renamed from: e */
        public long mo6857e(long j, long j2) {
            return this.f30735g.m6870d(j, j2);
        }

        @Override // p281p7.InterfaceC11449e
        /* renamed from: f */
        public long mo6856f(long j, long j2) {
            return this.f30735g.m6868f(j, j2);
        }

        @Override // p281p7.InterfaceC11449e
        /* renamed from: g */
        public C11778h mo6855g(long j) {
            return this.f30735g.mo6861k(this, j);
        }

        @Override // p281p7.InterfaceC11449e
        /* renamed from: h */
        public long mo6854h(long j, long j2) {
            return this.f30735g.m6866i(j, j2);
        }

        @Override // p281p7.InterfaceC11449e
        /* renamed from: i */
        public int mo6853i(long j) {
            return this.f30735g.mo6862g(j);
        }

        @Override // p281p7.InterfaceC11449e
        /* renamed from: j */
        public boolean mo6852j() {
            return this.f30735g.mo6864l();
        }

        @Override // p281p7.InterfaceC11449e
        /* renamed from: k */
        public long mo6851k() {
            return this.f30735g.m6869e();
        }

        @Override // p281p7.InterfaceC11449e
        /* renamed from: l */
        public int mo6850l(long j, long j2) {
            return this.f30735g.m6871c(j, j2);
        }

        @Override // p297q7.AbstractC11779i
        /* renamed from: m */
        public C11778h mo6873m() {
            return null;
        }
    }

    /* renamed from: q7.i$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C11782c extends AbstractC11779i {

        /* renamed from: g */
        public final Uri f30736g;

        /* renamed from: h */
        public final long f30737h;

        /* renamed from: i */
        private final String f30738i;

        /* renamed from: j */
        private final C11778h f30739j;

        /* renamed from: k */
        private final C11790l f30740k;

        public C11782c(long j, Format format, String str, AbstractC11783j.C11788e c11788e, List<C11774d> list, String str2, long j2) {
            super(j, format, str, c11788e, list);
            C11790l c11790l;
            this.f30736g = Uri.parse(str);
            C11778h m6860c = c11788e.m6860c();
            this.f30739j = m6860c;
            this.f30738i = str2;
            this.f30737h = j2;
            if (m6860c != null) {
                c11790l = null;
            } else {
                c11790l = new C11790l(new C11778h(null, 0L, j2));
            }
            this.f30740k = c11790l;
        }

        @Override // p297q7.AbstractC11779i
        /* renamed from: a */
        public String mo6875a() {
            return this.f30738i;
        }

        @Override // p297q7.AbstractC11779i
        /* renamed from: b */
        public InterfaceC11449e mo6874b() {
            return this.f30740k;
        }

        @Override // p297q7.AbstractC11779i
        /* renamed from: m */
        public C11778h mo6873m() {
            return this.f30739j;
        }
    }

    /* renamed from: o */
    public static AbstractC11779i m6877o(long j, Format format, String str, AbstractC11783j abstractC11783j, List<C11774d> list) {
        return m6876p(j, format, str, abstractC11783j, list, null);
    }

    /* renamed from: p */
    public static AbstractC11779i m6876p(long j, Format format, String str, AbstractC11783j abstractC11783j, List<C11774d> list, String str2) {
        if (abstractC11783j instanceof AbstractC11783j.C11788e) {
            return new C11782c(j, format, str, (AbstractC11783j.C11788e) abstractC11783j, list, str2, -1L);
        }
        if (abstractC11783j instanceof AbstractC11783j.AbstractC11784a) {
            return new C11781b(j, format, str, (AbstractC11783j.AbstractC11784a) abstractC11783j, list);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    /* renamed from: a */
    public abstract String mo6875a();

    /* renamed from: b */
    public abstract InterfaceC11449e mo6874b();

    /* renamed from: m */
    public abstract C11778h mo6873m();

    /* renamed from: n */
    public C11778h m6878n() {
        return this.f30734f;
    }

    private AbstractC11779i(long j, Format format, String str, AbstractC11783j abstractC11783j, List<C11774d> list) {
        List<C11774d> unmodifiableList;
        this.f30729a = j;
        this.f30730b = format;
        this.f30731c = str;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.f30733e = unmodifiableList;
        this.f30734f = abstractC11783j.mo6863a(this);
        this.f30732d = abstractC11783j.m6872b();
    }
}