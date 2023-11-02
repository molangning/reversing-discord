package gh;

import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import ph.C11633c;

/* renamed from: gh.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C6779p {
    /* renamed from: a */
    private static final boolean m21913a(InterfaceC6781r interfaceC6781r) {
        Object m14031s0;
        InterfaceC6787x interfaceC6787x;
        C11633c mo2210e;
        m14031s0 = C9553r.m14031s0(interfaceC6781r.mo2168i());
        InterfaceC6763b0 interfaceC6763b0 = (InterfaceC6763b0) m14031s0;
        InterfaceC6773j interfaceC6773j = null;
        if (interfaceC6763b0 != null) {
            interfaceC6787x = interfaceC6763b0.getType();
        } else {
            interfaceC6787x = null;
        }
        if (interfaceC6787x instanceof InterfaceC6773j) {
            interfaceC6773j = (InterfaceC6773j) interfaceC6787x;
        }
        if (interfaceC6773j == null) {
            return false;
        }
        InterfaceC6772i mo2188j = interfaceC6773j.mo2188j();
        if (!(mo2188j instanceof InterfaceC6770g) || (mo2210e = ((InterfaceC6770g) mo2188j).mo2210e()) == null || !C9612q.m13922c(mo2210e.m7458b(), "java.lang.Object")) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0022, code lost:
        if (r0.equals("hashCode") == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0039, code lost:
        if (r0.equals("toString") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        return r3.mo2168i().isEmpty();
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean m21912b(gh.InterfaceC6781r r3) {
        /*
            ph.f r0 = r3.getName()
            java.lang.String r0 = r0.m7426b()
            int r1 = r0.hashCode()
            r2 = -1776922004(0xffffffff9616526c, float:-1.2142911E-25)
            if (r1 == r2) goto L33
            r2 = -1295482945(0xffffffffb2c87fbf, float:-2.3341157E-8)
            if (r1 == r2) goto L25
            r2 = 147696667(0x8cdac1b, float:1.23784505E-33)
            if (r1 == r2) goto L1c
            goto L44
        L1c:
            java.lang.String r1 = "hashCode"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3b
            goto L44
        L25:
            java.lang.String r1 = "equals"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2e
            goto L44
        L2e:
            boolean r3 = m21913a(r3)
            goto L45
        L33:
            java.lang.String r1 = "toString"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L44
        L3b:
            java.util.List r3 = r3.mo2168i()
            boolean r3 = r3.isEmpty()
            goto L45
        L44:
            r3 = 0
        L45:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: gh.C6779p.m21912b(gh.r):boolean");
    }

    /* renamed from: c */
    public static final boolean m21911c(InterfaceC6780q interfaceC6780q) {
        C9612q.m13917h(interfaceC6780q, "<this>");
        if (interfaceC6780q.mo2177O().mo2220J() && (interfaceC6780q instanceof InterfaceC6781r) && m21912b((InterfaceC6781r) interfaceC6780q)) {
            return true;
        }
        return false;
    }
}