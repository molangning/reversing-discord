package p164j$.time.format;

import p164j$.time.chrono.C8294h;
import p164j$.time.chrono.InterfaceC8293g;
import p164j$.time.temporal.AbstractC8342j;
import p164j$.time.temporal.EnumC8333a;
import p164j$.time.temporal.InterfaceC8344l;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.time.format.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8311n implements InterfaceC8304g {

    /* renamed from: a */
    private final InterfaceC8344l f22327a;

    /* renamed from: b */
    private final EnumC8320w f22328b;

    /* renamed from: c */
    private final C8299b f22329c;

    /* renamed from: d */
    private volatile C8307j f22330d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8311n(EnumC8333a enumC8333a, EnumC8320w enumC8320w, C8299b c8299b) {
        this.f22327a = enumC8333a;
        this.f22328b = enumC8320w;
        this.f22329c = c8299b;
    }

    @Override // p164j$.time.format.InterfaceC8304g
    /* renamed from: a */
    public final boolean mo17882a(C8315r c8315r, StringBuilder sb2) {
        String m17855a;
        C8294h c8294h;
        Long m17858e = c8315r.m17858e(this.f22327a);
        if (m17858e == null) {
            return false;
        }
        InterfaceC8293g interfaceC8293g = (InterfaceC8293g) c8315r.m17859d().mo17802d(AbstractC8342j.m17812d());
        if (interfaceC8293g == null || interfaceC8293g == (c8294h = C8294h.f22292a)) {
            C8299b c8299b = this.f22329c;
            long longValue = m17858e.longValue();
            EnumC8320w enumC8320w = this.f22328b;
            c8315r.m17860c();
            m17855a = c8299b.f22306a.m17855a(longValue, enumC8320w);
        } else {
            C8299b c8299b2 = this.f22329c;
            InterfaceC8344l interfaceC8344l = this.f22327a;
            long longValue2 = m17858e.longValue();
            EnumC8320w enumC8320w2 = this.f22328b;
            c8315r.m17860c();
            c8299b2.getClass();
            m17855a = (interfaceC8293g == c8294h || !(interfaceC8344l instanceof EnumC8333a)) ? c8299b2.f22306a.m17855a(longValue2, enumC8320w2) : null;
        }
        if (m17855a != null) {
            sb2.append(m17855a);
            return true;
        }
        if (this.f22330d == null) {
            this.f22330d = new C8307j(this.f22327a, 1, 19, EnumC8319v.NORMAL);
        }
        return this.f22330d.mo17882a(c8315r, sb2);
    }

    public final String toString() {
        EnumC8320w enumC8320w = EnumC8320w.FULL;
        InterfaceC8344l interfaceC8344l = this.f22327a;
        EnumC8320w enumC8320w2 = this.f22328b;
        if (enumC8320w2 == enumC8320w) {
            return "Text(" + interfaceC8344l + ")";
        }
        return "Text(" + interfaceC8344l + "," + enumC8320w2 + ")";
    }
}
