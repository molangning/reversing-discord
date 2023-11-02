package p142hi;

import gi.InterfaceC6821n;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import ng.AbstractC10870h;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11947m;
import p327ri.C12258e;
import p429xh.C13801c;

/* renamed from: hi.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC7219b extends AbstractC7253g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7219b(InterfaceC6821n interfaceC6821n) {
        super(interfaceC6821n);
        if (interfaceC6821n == null) {
            m21216v(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0045  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m21216v(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto Lc
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Le:
            r4 = 2
            if (r9 == r2) goto L17
            if (r9 == r1) goto L17
            if (r9 == r0) goto L17
            r5 = r1
            goto L18
        L17:
            r5 = r4
        L18:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L2f
            if (r9 == r4) goto L2a
            if (r9 == r1) goto L2f
            if (r9 == r0) goto L2f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L31
        L2a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L31
        L2f:
            r5[r7] = r6
        L31:
            if (r9 == r2) goto L3f
            if (r9 == r1) goto L3a
            if (r9 == r0) goto L3a
            r5[r2] = r6
            goto L43
        L3a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L43
        L3f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L43:
            if (r9 == r2) goto L54
            if (r9 == r4) goto L50
            if (r9 == r1) goto L54
            if (r9 == r0) goto L54
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L54
        L50:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L54:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L64
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p142hi.AbstractC7219b.m21216v(int):void");
    }

    @Override // p142hi.AbstractC7292m
    /* renamed from: e */
    protected boolean mo4459e(InterfaceC11927h interfaceC11927h) {
        if (interfaceC11927h == null) {
            m21216v(2);
        }
        if ((interfaceC11927h instanceof InterfaceC11914e) && m21055c(mo9167w(), interfaceC11927h)) {
            return true;
        }
        return false;
    }

    @Override // p142hi.AbstractC7253g
    /* renamed from: i */
    protected AbstractC7264g0 mo4457i() {
        if (AbstractC10870h.m9787t0(mo9167w())) {
            return null;
        }
        return mo2790n().m9810i();
    }

    @Override // p142hi.AbstractC7253g
    /* renamed from: j */
    protected Collection<AbstractC7264g0> mo21125j(boolean z) {
        InterfaceC11947m mo4163b = mo9167w().mo4163b();
        if (!(mo4163b instanceof InterfaceC11914e)) {
            List emptyList = Collections.emptyList();
            if (emptyList == null) {
                m21216v(3);
            }
            return emptyList;
        }
        C12258e c12258e = new C12258e();
        InterfaceC11914e interfaceC11914e = (InterfaceC11914e) mo4163b;
        c12258e.add(interfaceC11914e.mo4224p());
        InterfaceC11914e mo4169m0 = interfaceC11914e.mo4169m0();
        if (z && mo4169m0 != null) {
            c12258e.add(mo4169m0.mo4224p());
        }
        return c12258e;
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: n */
    public AbstractC10870h mo2790n() {
        AbstractC10870h m1505j = C13801c.m1505j(mo9167w());
        if (m1505j == null) {
            m21216v(1);
        }
        return m1505j;
    }

    /* renamed from: w */
    public abstract InterfaceC11914e mo9167w();
}
