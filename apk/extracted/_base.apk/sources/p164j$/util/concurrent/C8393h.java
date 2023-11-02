package p164j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8393h extends C8398m {

    /* renamed from: e */
    final C8398m[] f22490e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8393h(C8398m[] c8398mArr) {
        super(-1, null, null, null);
        this.f22490e = c8398mArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0029, code lost:
        if ((r0 instanceof p164j$.util.concurrent.C8393h) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002b, code lost:
        r0 = ((p164j$.util.concurrent.C8393h) r0).f22490e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0034, code lost:
        return r0.mo17728a(r5, r6);
     */
    @Override // p164j$.util.concurrent.C8398m
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p164j$.util.concurrent.C8398m mo17728a(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            j$.util.concurrent.m[] r0 = r4.f22490e
        L2:
            r1 = 0
            if (r6 == 0) goto L39
            if (r0 == 0) goto L39
            int r2 = r0.length
            if (r2 == 0) goto L39
            int r2 = r2 + (-1)
            r2 = r2 & r5
            j$.util.concurrent.m r0 = p164j$.util.concurrent.ConcurrentHashMap.tabAt(r0, r2)
            if (r0 != 0) goto L14
            goto L39
        L14:
            int r2 = r0.f22497a
            if (r2 != r5) goto L25
            java.lang.Object r3 = r0.f22498b
            if (r3 == r6) goto L24
            if (r3 == 0) goto L25
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L25
        L24:
            return r0
        L25:
            if (r2 >= 0) goto L35
            boolean r1 = r0 instanceof p164j$.util.concurrent.C8393h
            if (r1 == 0) goto L30
            j$.util.concurrent.h r0 = (p164j$.util.concurrent.C8393h) r0
            j$.util.concurrent.m[] r0 = r0.f22490e
            goto L2
        L30:
            j$.util.concurrent.m r5 = r0.mo17728a(r5, r6)
            return r5
        L35:
            j$.util.concurrent.m r0 = r0.f22500d
            if (r0 != 0) goto L14
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p164j$.util.concurrent.C8393h.mo17728a(int, java.lang.Object):j$.util.concurrent.m");
    }
}
