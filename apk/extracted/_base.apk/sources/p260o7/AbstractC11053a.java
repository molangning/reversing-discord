package p260o7;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.upstream.C4515a;
import com.google.android.exoplayer2.upstream.DataSource;
import p195k8.C9149a;

/* renamed from: o7.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC11053a extends AbstractC11069m {

    /* renamed from: k */
    public final long f28916k;

    /* renamed from: l */
    public final long f28917l;

    /* renamed from: m */
    private C11055c f28918m;

    /* renamed from: n */
    private int[] f28919n;

    public AbstractC11053a(DataSource dataSource, C4515a c4515a, Format format, int i, Object obj, long j, long j2, long j3, long j4, long j5) {
        super(dataSource, c4515a, format, i, obj, j, j2, j5);
        this.f28916k = j3;
        this.f28917l = j4;
    }

    /* renamed from: i */
    public final int m9253i(int i) {
        return ((int[]) C9149a.m16445h(this.f28919n))[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public final C11055c m9252j() {
        return (C11055c) C9149a.m16445h(this.f28918m);
    }

    /* renamed from: k */
    public void m9251k(C11055c c11055c) {
        this.f28918m = c11055c;
        this.f28919n = c11055c.m9249a();
    }
}
