package p254o1;

import p275p1.AbstractC11368c;
import p311r1.C12023d;

/* renamed from: o1.g0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10948g0 implements InterfaceC10962n0<C12023d> {

    /* renamed from: a */
    public static final C10948g0 f28717a = new C10948g0();

    private C10948g0() {
    }

    @Override // p254o1.InterfaceC10962n0
    /* renamed from: b */
    public C12023d mo9459a(AbstractC11368c abstractC11368c, float f) {
        boolean z;
        if (abstractC11368c.mo8228I() == AbstractC11368c.EnumC11370b.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            abstractC11368c.mo8221h();
        }
        float mo8214t = (float) abstractC11368c.mo8214t();
        float mo8214t2 = (float) abstractC11368c.mo8214t();
        while (abstractC11368c.mo8216q()) {
            abstractC11368c.mo8224U();
        }
        if (z) {
            abstractC11368c.mo8219j();
        }
        return new C12023d((mo8214t / 100.0f) * f, (mo8214t2 / 100.0f) * f);
    }
}