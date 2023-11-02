package p229m7;

import android.net.Uri;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import p195k8.C9149a;

/* renamed from: m7.p0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10331p0 extends Timeline {

    /* renamed from: n */
    private static final Object f27002n = new Object();

    /* renamed from: o */
    private static final MediaItem f27003o = new MediaItem.C4365c().m29851d("SinglePeriodTimeline").m29846i(Uri.EMPTY).m29854a();

    /* renamed from: b */
    private final long f27004b;

    /* renamed from: c */
    private final long f27005c;

    /* renamed from: d */
    private final long f27006d;

    /* renamed from: e */
    private final long f27007e;

    /* renamed from: f */
    private final long f27008f;

    /* renamed from: g */
    private final long f27009g;

    /* renamed from: h */
    private final long f27010h;

    /* renamed from: i */
    private final boolean f27011i;

    /* renamed from: j */
    private final boolean f27012j;

    /* renamed from: k */
    private final Object f27013k;

    /* renamed from: l */
    private final MediaItem f27014l;

    /* renamed from: m */
    private final MediaItem.C4368f f27015m;

    public C10331p0(long j, boolean z, boolean z2, boolean z3, Object obj, MediaItem mediaItem) {
        this(j, j, 0L, 0L, z, z2, z3, obj, mediaItem);
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: b */
    public int mo11758b(Object obj) {
        return f27002n.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: g */
    public Timeline.C4378b mo11757g(int i, Timeline.C4378b c4378b, boolean z) {
        Object obj;
        C9149a.m16450c(i, 0, 1);
        if (z) {
            obj = f27002n;
        } else {
            obj = null;
        }
        return c4378b.m29722n(null, obj, 0, this.f27007e, -this.f27009g);
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: i */
    public int mo11756i() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: m */
    public Object mo11755m(int i) {
        C9149a.m16450c(i, 0, 1);
        return f27002n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
        if (r1 > r3) goto L7;
     */
    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.Timeline.C4379c mo11754o(int r25, com.google.android.exoplayer2.Timeline.C4379c r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            p195k8.C9149a.m16450c(r3, r1, r2)
            long r1 = r0.f27010h
            boolean r14 = r0.f27012j
            if (r14 == 0) goto L2a
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2a
            long r3 = r0.f27008f
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L23
        L20:
            r16 = r5
            goto L2c
        L23:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2a
            goto L20
        L2a:
            r16 = r1
        L2c:
            java.lang.Object r4 = com.google.android.exoplayer2.Timeline.C4379c.f11377r
            com.google.android.exoplayer2.MediaItem r5 = r0.f27014l
            java.lang.Object r6 = r0.f27013k
            long r7 = r0.f27004b
            long r9 = r0.f27005c
            long r11 = r0.f27006d
            boolean r13 = r0.f27011i
            com.google.android.exoplayer2.MediaItem$f r15 = r0.f27015m
            long r1 = r0.f27008f
            r18 = r1
            r20 = 0
            r21 = 0
            long r1 = r0.f27009g
            r22 = r1
            r3 = r26
            com.google.android.exoplayer2.Timeline$c r1 = r3.m29714g(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p229m7.C10331p0.mo11754o(int, com.google.android.exoplayer2.Timeline$c, long):com.google.android.exoplayer2.Timeline$c");
    }

    @Override // com.google.android.exoplayer2.Timeline
    /* renamed from: p */
    public int mo11753p() {
        return 1;
    }

    public C10331p0(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, Object obj, MediaItem mediaItem) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, obj, mediaItem, z3 ? mediaItem.f11235c : null);
    }

    public C10331p0(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, Object obj, MediaItem mediaItem, MediaItem.C4368f c4368f) {
        this.f27004b = j;
        this.f27005c = j2;
        this.f27006d = j3;
        this.f27007e = j4;
        this.f27008f = j5;
        this.f27009g = j6;
        this.f27010h = j7;
        this.f27011i = z;
        this.f27012j = z2;
        this.f27013k = obj;
        this.f27014l = (MediaItem) C9149a.m16448e(mediaItem);
        this.f27015m = c4368f;
    }
}
