package io.sentry;

import java.io.StringReader;
import java.nio.charset.Charset;

/* renamed from: io.sentry.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8154s implements InterfaceC8000k0 {

    /* renamed from: b */
    private static final Charset f22071b = Charset.forName("UTF-8");

    /* renamed from: a */
    private final InterfaceC8243v0 f22072a;

    public C8154s(InterfaceC8243v0 interfaceC8243v0) {
        this.f22072a = interfaceC8243v0;
    }

    /* renamed from: b */
    private C8030n3 m18382b(byte[] bArr, int i, int i2) {
        return (C8030n3) this.f22072a.mo17982c(new StringReader(new String(bArr, i, i2, f22071b)), C8030n3.class);
    }

    /* renamed from: c */
    private C7909e4 m18381c(byte[] bArr, int i, int i2) {
        return (C7909e4) this.f22072a.mo17982c(new StringReader(new String(bArr, i, i2, f22071b)), C7909e4.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:
        r11 = new io.sentry.C8020m3(r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0086, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0089, code lost:
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e2, code lost:
        throw new java.lang.IllegalArgumentException("Item header at index '" + r2.size() + "' is null or empty.");
     */
    @Override // io.sentry.InterfaceC8000k0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public io.sentry.C8020m3 mo18354a(java.io.InputStream r11) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.C8154s.mo18354a(java.io.InputStream):io.sentry.m3");
    }
}
