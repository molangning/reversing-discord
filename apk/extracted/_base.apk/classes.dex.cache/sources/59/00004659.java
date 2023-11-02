package p272oj;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.io.Reader;

/* renamed from: oj.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
class C11184g extends Reader {

    /* renamed from: j */
    private final PushbackInputStream f29231j;

    /* renamed from: k */
    private BufferedReader f29232k = null;

    public C11184g(InputStream inputStream) {
        this.f29231j = new PushbackInputStream(inputStream, 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0023, code lost:
        if (r1[2] == (-65)) goto L13;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m9026a() {
        /*
            r6 = this;
            java.io.BufferedReader r0 = r6.f29232k
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 3
            byte[] r1 = new byte[r0]
            java.io.PushbackInputStream r2 = r6.f29231j
            r3 = 0
            int r2 = r2.read(r1, r3, r0)
            if (r2 != r0) goto L26
            r0 = r1[r3]
            r4 = -17
            if (r0 != r4) goto L26
            r0 = 1
            r4 = r1[r0]
            r5 = -69
            if (r4 != r5) goto L26
            r4 = 2
            r4 = r1[r4]
            r5 = -65
            if (r4 != r5) goto L26
            goto L27
        L26:
            r0 = r3
        L27:
            if (r0 != 0) goto L30
            if (r2 <= 0) goto L30
            java.io.PushbackInputStream r0 = r6.f29231j
            r0.unread(r1, r3, r2)
        L30:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.PushbackInputStream r2 = r6.f29231j
            java.lang.String r3 = "UTF-8"
            r1.<init>(r2, r3)
            r0.<init>(r1)
            r6.f29232k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p272oj.C11184g.m9026a():void");
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        BufferedReader bufferedReader = this.f29232k;
        if (bufferedReader == null) {
            this.f29231j.close();
        } else {
            bufferedReader.close();
        }
    }

    /* renamed from: h */
    public String m9025h() {
        m9026a();
        return this.f29232k.readLine();
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) {
        m9026a();
        return this.f29232k.read(cArr, i, i2);
    }

    @Override // java.io.Reader
    public boolean ready() {
        m9026a();
        return this.f29232k.ready();
    }
}