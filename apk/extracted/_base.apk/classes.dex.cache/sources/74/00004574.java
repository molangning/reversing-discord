package p254o1;

import p073e1.C6062k;
import p188k1.C9037a;
import p188k1.C9038b;
import p275p1.AbstractC11368c;

/* renamed from: o1.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10955k {

    /* renamed from: f */
    private static final AbstractC11368c.C11369a f28730f = AbstractC11368c.C11369a.m8241a("ef");

    /* renamed from: g */
    private static final AbstractC11368c.C11369a f28731g = AbstractC11368c.C11369a.m8241a("nm", "v");

    /* renamed from: a */
    private C9037a f28732a;

    /* renamed from: b */
    private C9038b f28733b;

    /* renamed from: c */
    private C9038b f28734c;

    /* renamed from: d */
    private C9038b f28735d;

    /* renamed from: e */
    private C9038b f28736e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0052, code lost:
        if (r0.equals("Opacity") == false) goto L16;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m9474a(p275p1.AbstractC11368c r6, p073e1.C6062k r7) {
        /*
            r5 = this;
            r6.mo8220i()
            java.lang.String r0 = ""
        L5:
            boolean r1 = r6.mo8216q()
            if (r1 == 0) goto L90
            p1.c$a r1 = p254o1.C10955k.f28731g
            int r1 = r6.mo8226R(r1)
            if (r1 == 0) goto L8a
            r2 = 1
            if (r1 == r2) goto L1d
            r6.mo8225S()
            r6.mo8224U()
            goto L5
        L1d:
            r0.hashCode()
            int r1 = r0.hashCode()
            r3 = 0
            r4 = -1
            switch(r1) {
                case 353103893: goto L55;
                case 397447147: goto L4c;
                case 1041377119: goto L41;
                case 1379387491: goto L36;
                case 1383710113: goto L2b;
                default: goto L29;
            }
        L29:
            r2 = r4
            goto L5f
        L2b:
            java.lang.String r1 = "Softness"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L34
            goto L29
        L34:
            r2 = 4
            goto L5f
        L36:
            java.lang.String r1 = "Shadow Color"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L3f
            goto L29
        L3f:
            r2 = 3
            goto L5f
        L41:
            java.lang.String r1 = "Direction"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L4a
            goto L29
        L4a:
            r2 = 2
            goto L5f
        L4c:
            java.lang.String r1 = "Opacity"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L5f
            goto L29
        L55:
            java.lang.String r1 = "Distance"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L5e
            goto L29
        L5e:
            r2 = r3
        L5f:
            switch(r2) {
                case 0: goto L82;
                case 1: goto L7b;
                case 2: goto L74;
                case 3: goto L6d;
                case 4: goto L66;
                default: goto L62;
            }
        L62:
            r6.mo8224U()
            goto L5
        L66:
            k1.b r1 = p254o1.C10941d.m9499e(r6, r7)
            r5.f28736e = r1
            goto L5
        L6d:
            k1.a r1 = p254o1.C10941d.m9501c(r6, r7)
            r5.f28732a = r1
            goto L5
        L74:
            k1.b r1 = p254o1.C10941d.m9498f(r6, r7, r3)
            r5.f28734c = r1
            goto L5
        L7b:
            k1.b r1 = p254o1.C10941d.m9498f(r6, r7, r3)
            r5.f28733b = r1
            goto L5
        L82:
            k1.b r1 = p254o1.C10941d.m9499e(r6, r7)
            r5.f28735d = r1
            goto L5
        L8a:
            java.lang.String r0 = r6.mo8234D()
            goto L5
        L90:
            r6.mo8217m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p254o1.C10955k.m9474a(p1.c, e1.k):void");
    }

    /* renamed from: b */
    public C10953j m9473b(AbstractC11368c abstractC11368c, C6062k c6062k) {
        C9038b c9038b;
        C9038b c9038b2;
        C9038b c9038b3;
        C9038b c9038b4;
        while (abstractC11368c.mo8216q()) {
            if (abstractC11368c.mo8226R(f28730f) != 0) {
                abstractC11368c.mo8225S();
                abstractC11368c.mo8224U();
            } else {
                abstractC11368c.mo8221h();
                while (abstractC11368c.mo8216q()) {
                    m9474a(abstractC11368c, c6062k);
                }
                abstractC11368c.mo8219j();
            }
        }
        C9037a c9037a = this.f28732a;
        if (c9037a != null && (c9038b = this.f28733b) != null && (c9038b2 = this.f28734c) != null && (c9038b3 = this.f28735d) != null && (c9038b4 = this.f28736e) != null) {
            return new C10953j(c9037a, c9038b, c9038b2, c9038b3, c9038b4);
        }
        return null;
    }
}