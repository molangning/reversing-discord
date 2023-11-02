package p122gk;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import okio.Buffer;
import okio.BufferedSource;
import okio.Source;
import okio.Timeout;

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006#"}, m14357d2 = {"Lgk/r;", "Lokio/Source;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "Lokio/Timeout;", "timeout", "", "close", "j", "Lokio/Buffer;", "buffer", "Lgk/u;", "k", "Lgk/u;", "expectedSegment", "", "l", "I", "expectedPos", "", "m", "Z", "closed", "n", "J", "pos", "Lokio/BufferedSource;", "o", "Lokio/BufferedSource;", "upstream", "<init>", "(Lokio/BufferedSource;)V", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: gk.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C6846r implements Source {

    /* renamed from: j */
    private final Buffer f19061j;

    /* renamed from: k */
    private C6851u f19062k;

    /* renamed from: l */
    private int f19063l;

    /* renamed from: m */
    private boolean f19064m;

    /* renamed from: n */
    private long f19065n;

    /* renamed from: o */
    private final BufferedSource f19066o;

    public C6846r(BufferedSource upstream) {
        int i;
        C9612q.m13917h(upstream, "upstream");
        this.f19066o = upstream;
        Buffer mo8593d = upstream.mo8593d();
        this.f19061j = mo8593d;
        C6851u c6851u = mo8593d.f29470j;
        this.f19062k = c6851u;
        if (c6851u != null) {
            i = c6851u.f19077b;
        } else {
            i = -1;
        }
        this.f19063l = i;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f19064m = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0028, code lost:
        if (r5 == r6.f19077b) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x006f  */
    @Override // okio.Source
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long read(okio.Buffer r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.C9612q.m13917h(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r2 < 0) goto Lf
            r5 = r4
            goto L10
        Lf:
            r5 = r3
        L10:
            if (r5 == 0) goto L87
            boolean r5 = r8.f19064m
            r5 = r5 ^ r4
            if (r5 == 0) goto L7b
            gk.u r5 = r8.f19062k
            if (r5 == 0) goto L2a
            okio.Buffer r6 = r8.f19061j
            gk.u r6 = r6.f29470j
            if (r5 != r6) goto L2b
            int r5 = r8.f19063l
            kotlin.jvm.internal.C9612q.m13920e(r6)
            int r6 = r6.f19077b
            if (r5 != r6) goto L2b
        L2a:
            r3 = r4
        L2b:
            if (r3 == 0) goto L6f
            if (r2 != 0) goto L30
            return r0
        L30:
            okio.BufferedSource r0 = r8.f19066o
            long r1 = r8.f19065n
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.mo8590g(r1)
            if (r0 != 0) goto L40
            r9 = -1
            return r9
        L40:
            gk.u r0 = r8.f19062k
            if (r0 != 0) goto L53
            okio.Buffer r0 = r8.f19061j
            gk.u r0 = r0.f29470j
            if (r0 == 0) goto L53
            r8.f19062k = r0
            kotlin.jvm.internal.C9612q.m13920e(r0)
            int r0 = r0.f19077b
            r8.f19063l = r0
        L53:
            okio.Buffer r0 = r8.f19061j
            long r0 = r0.size()
            long r2 = r8.f19065n
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            okio.Buffer r2 = r8.f19061j
            long r4 = r8.f19065n
            r3 = r9
            r6 = r10
            r2.m8616t(r3, r4, r6)
            long r0 = r8.f19065n
            long r0 = r0 + r10
            r8.f19065n = r0
            return r10
        L6f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L7b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L87:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p122gk.C6846r.read(okio.Buffer, long):long");
    }

    @Override // okio.Source
    public Timeout timeout() {
        return this.f19066o.timeout();
    }
}