package p260o7;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.C4515a;
import com.google.android.exoplayer2.upstream.DataSource;
import p195k8.C9149a;

/* renamed from: o7.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC11069m extends AbstractC11058e {

    /* renamed from: j */
    public final long f28993j;

    public AbstractC11069m(DataSource dataSource, C4515a c4515a, Format format, int i, Object obj, long j, long j2, long j3) {
        super(dataSource, c4515a, 1, format, i, obj, j, j2);
        C9149a.m16448e(format);
        this.f28993j = j3;
    }

    /* renamed from: g */
    public long mo9195g() {
        long j = this.f28993j;
        if (j != -1) {
            return 1 + j;
        }
        return -1L;
    }

    /* renamed from: h */
    public abstract boolean mo6275h();
}
