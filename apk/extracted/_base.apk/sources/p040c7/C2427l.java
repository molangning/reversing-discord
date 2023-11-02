package p040c7;

import android.media.MediaCodec;
import p228m6.C10270f;

/* renamed from: c7.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2427l extends C10270f {

    /* renamed from: j */
    public final C2428m f6632j;

    /* renamed from: k */
    public final String f6633k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C2427l(java.lang.Throwable r4, p040c7.C2428m r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Decoder failed: "
            r0.append(r1)
            r1 = 0
            if (r5 != 0) goto Lf
            r2 = r1
            goto L11
        Lf:
            java.lang.String r2 = r5.f6634a
        L11:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r4)
            r3.f6632j = r5
            int r5 = p195k8.C9191p0.f24171a
            r0 = 21
            if (r5 < r0) goto L27
            java.lang.String r1 = m33431a(r4)
        L27:
            r3.f6633k = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040c7.C2427l.<init>(java.lang.Throwable, c7.m):void");
    }

    /* renamed from: a */
    private static String m33431a(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
        }
        return null;
    }
}
