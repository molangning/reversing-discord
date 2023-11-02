package p193k6;

import p193k6.InterfaceC9090g;

/* renamed from: k6.m0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C9108m0 extends AbstractC9129v {
    /* JADX WARN: Removed duplicated region for block: B:55:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00af A[LOOP:4: B:69:0x00af->B:70:0x00b1, LOOP_START, PHI: r0 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:54:0x0037, B:70:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p193k6.InterfaceC9090g
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo16488e(java.nio.ByteBuffer r10) {
        /*
            r9 = this;
            int r0 = r10.position()
            int r1 = r10.limit()
            int r2 = r1 - r0
            k6.g$a r3 = r9.f24054b
            int r3 = r3.f23887c
            r4 = 805306368(0x30000000, float:4.656613E-10)
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            r7 = 4
            r8 = 3
            if (r3 == r8) goto L2d
            if (r3 == r7) goto L2a
            if (r3 == r6) goto L2f
            if (r3 == r5) goto L27
            if (r3 != r4) goto L21
            goto L2a
        L21:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L27:
            int r2 = r2 / 3
            goto L2d
        L2a:
            int r2 = r2 / 2
            goto L2f
        L2d:
            int r2 = r2 * 2
        L2f:
            java.nio.ByteBuffer r2 = r9.m16489l(r2)
            k6.g$a r3 = r9.f24054b
            int r3 = r3.f23887c
            if (r3 == r8) goto Laf
            if (r3 == r7) goto L8a
            if (r3 == r6) goto L75
            if (r3 == r5) goto L5e
            if (r3 != r4) goto L58
        L41:
            if (r0 >= r1) goto Lc4
            int r3 = r0 + 2
            byte r3 = r10.get(r3)
            r2.put(r3)
            int r3 = r0 + 3
            byte r3 = r10.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L41
        L58:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L5e:
            if (r0 >= r1) goto Lc4
            int r3 = r0 + 1
            byte r3 = r10.get(r3)
            r2.put(r3)
            int r3 = r0 + 2
            byte r3 = r10.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L5e
        L75:
            if (r0 >= r1) goto Lc4
            int r3 = r0 + 1
            byte r3 = r10.get(r3)
            r2.put(r3)
            byte r3 = r10.get(r0)
            r2.put(r3)
            int r0 = r0 + 2
            goto L75
        L8a:
            if (r0 >= r1) goto Lc4
            float r3 = r10.getFloat(r0)
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 1065353216(0x3f800000, float:1.0)
            float r3 = p195k8.C9191p0.m16229q(r3, r4, r5)
            r4 = 1191181824(0x46fffe00, float:32767.0)
            float r3 = r3 * r4
            int r3 = (int) r3
            short r3 = (short) r3
            r4 = r3 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r2.put(r4)
            int r3 = r3 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 4
            goto L8a
        Laf:
            if (r0 >= r1) goto Lc4
            r3 = 0
            r2.put(r3)
            byte r3 = r10.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + (-128)
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto Laf
        Lc4:
            int r0 = r10.limit()
            r10.position(r0)
            r2.flip()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p193k6.C9108m0.mo16488e(java.nio.ByteBuffer):void");
    }

    @Override // p193k6.AbstractC9129v
    /* renamed from: h */
    public InterfaceC9090g.C9091a mo16487h(InterfaceC9090g.C9091a c9091a) {
        int i = c9091a.f23887c;
        if (i != 3 && i != 2 && i != 268435456 && i != 536870912 && i != 805306368 && i != 4) {
            throw new InterfaceC9090g.C9092b(c9091a);
        }
        if (i != 2) {
            return new InterfaceC9090g.C9091a(c9091a.f23885a, c9091a.f23886b, 2);
        }
        return InterfaceC9090g.C9091a.f23884e;
    }
}