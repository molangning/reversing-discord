package p157ic;

import p136hc.InterfaceC7066l;

/* renamed from: ic.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7495b implements InterfaceC7066l {
    /* JADX WARN: Removed duplicated region for block: B:66:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x005e A[LOOP:0: B:82:0x005c->B:83:0x005e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x008f  */
    @Override // p136hc.InterfaceC7066l
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.zxing.Result mo1567a(p136hc.C7057c r11, java.util.Map<p136hc.EnumC7059e, ?> r12) {
        /*
            r10 = this;
            kc.a r0 = new kc.a
            lc.b r11 = r11.m21478a()
            r0.<init>(r11)
            r11 = 0
            r1 = 0
            ic.a r2 = r0.m16056a(r11)     // Catch: p136hc.C7060f -> L25 p136hc.C7064j -> L2b
            hc.o[] r3 = r2.m12221b()     // Catch: p136hc.C7060f -> L25 p136hc.C7064j -> L2b
            jc.a r4 = new jc.a     // Catch: p136hc.C7060f -> L21 p136hc.C7064j -> L23
            r4.<init>()     // Catch: p136hc.C7060f -> L21 p136hc.C7064j -> L23
            lc.e r2 = r4.m17061c(r2)     // Catch: p136hc.C7060f -> L21 p136hc.C7064j -> L23
            r4 = r3
            r3 = r1
            r1 = r2
            r2 = r3
            goto L2f
        L21:
            r2 = move-exception
            goto L27
        L23:
            r2 = move-exception
            goto L2d
        L25:
            r2 = move-exception
            r3 = r1
        L27:
            r4 = r3
            r3 = r2
            r2 = r1
            goto L2f
        L2b:
            r2 = move-exception
            r3 = r1
        L2d:
            r4 = r3
            r3 = r1
        L2f:
            if (r1 != 0) goto L4e
            r1 = 1
            ic.a r0 = r0.m16056a(r1)     // Catch: p136hc.C7060f -> L44 p136hc.C7064j -> L46
            hc.o[] r4 = r0.m12221b()     // Catch: p136hc.C7060f -> L44 p136hc.C7064j -> L46
            jc.a r1 = new jc.a     // Catch: p136hc.C7060f -> L44 p136hc.C7064j -> L46
            r1.<init>()     // Catch: p136hc.C7060f -> L44 p136hc.C7064j -> L46
            lc.e r1 = r1.m17061c(r0)     // Catch: p136hc.C7060f -> L44 p136hc.C7064j -> L46
            goto L4e
        L44:
            r11 = move-exception
            goto L47
        L46:
            r11 = move-exception
        L47:
            if (r2 != 0) goto L4d
            if (r3 == 0) goto L4c
            throw r3
        L4c:
            throw r11
        L4d:
            throw r2
        L4e:
            r6 = r4
            if (r12 == 0) goto L66
            hc.e r0 = p136hc.EnumC7059e.NEED_RESULT_POINT_CALLBACK
            java.lang.Object r12 = r12.get(r0)
            hc.p r12 = (p136hc.InterfaceC7070p) r12
            if (r12 == 0) goto L66
            int r0 = r6.length
        L5c:
            if (r11 >= r0) goto L66
            r2 = r6[r11]
            r12.m21452a(r2)
            int r11 = r11 + 1
            goto L5c
        L66:
            com.google.zxing.Result r11 = new com.google.zxing.Result
            java.lang.String r3 = r1.m12228h()
            byte[] r4 = r1.m12231e()
            int r5 = r1.m12233c()
            hc.a r7 = p136hc.EnumC7055a.AZTEC
            long r8 = java.lang.System.currentTimeMillis()
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.util.List r12 = r1.m12235a()
            if (r12 == 0) goto L89
            hc.n r0 = p136hc.EnumC7068n.BYTE_SEGMENTS
            r11.m26107h(r0, r12)
        L89:
            java.lang.String r12 = r1.m12234b()
            if (r12 == 0) goto L94
            hc.n r0 = p136hc.EnumC7068n.ERROR_CORRECTION_LEVEL
            r11.m26107h(r0, r12)
        L94:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p157ic.C7495b.mo1567a(hc.c, java.util.Map):com.google.zxing.Result");
    }

    @Override // p136hc.InterfaceC7066l
    public void reset() {
    }
}