package p260o7;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.upstream.C4515a;
import com.google.android.exoplayer2.upstream.C4550h;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.List;
import java.util.Map;
import p153i8.C7470v;
import p195k8.C9149a;

/* renamed from: o7.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC11058e implements C4550h.InterfaceC4555e {

    /* renamed from: a */
    public final long f28942a = LoadEventInfo.m29145a();

    /* renamed from: b */
    public final C4515a f28943b;

    /* renamed from: c */
    public final int f28944c;

    /* renamed from: d */
    public final Format f28945d;

    /* renamed from: e */
    public final int f28946e;

    /* renamed from: f */
    public final Object f28947f;

    /* renamed from: g */
    public final long f28948g;

    /* renamed from: h */
    public final long f28949h;

    /* renamed from: i */
    protected final C7470v f28950i;

    public AbstractC11058e(DataSource dataSource, C4515a c4515a, int i, Format format, int i2, Object obj, long j, long j2) {
        this.f28950i = new C7470v(dataSource);
        this.f28943b = (C4515a) C9149a.m16448e(c4515a);
        this.f28944c = i;
        this.f28945d = format;
        this.f28946e = i2;
        this.f28947f = obj;
        this.f28948g = j;
        this.f28949h = j2;
    }

    /* renamed from: b */
    public final long m9246b() {
        return this.f28950i.m20614o();
    }

    /* renamed from: d */
    public final long m9245d() {
        return this.f28949h - this.f28948g;
    }

    /* renamed from: e */
    public final Map<String, List<String>> m9244e() {
        return this.f28950i.m20612q();
    }

    /* renamed from: f */
    public final Uri m9243f() {
        return this.f28950i.m20613p();
    }
}
