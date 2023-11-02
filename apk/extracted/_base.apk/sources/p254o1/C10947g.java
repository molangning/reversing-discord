package p254o1;

import android.graphics.Color;
import p275p1.AbstractC11368c;

/* renamed from: o1.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10947g implements InterfaceC10962n0<Integer> {

    /* renamed from: a */
    public static final C10947g f28716a = new C10947g();

    private C10947g() {
    }

    @Override // p254o1.InterfaceC10962n0
    /* renamed from: b */
    public Integer mo9459a(AbstractC11368c abstractC11368c, float f) {
        boolean z;
        double d;
        if (abstractC11368c.mo8228I() == AbstractC11368c.EnumC11370b.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            abstractC11368c.mo8221h();
        }
        double mo8214t = abstractC11368c.mo8214t();
        double mo8214t2 = abstractC11368c.mo8214t();
        double mo8214t3 = abstractC11368c.mo8214t();
        if (abstractC11368c.mo8228I() == AbstractC11368c.EnumC11370b.NUMBER) {
            d = abstractC11368c.mo8214t();
        } else {
            d = 1.0d;
        }
        if (z) {
            abstractC11368c.mo8219j();
        }
        if (mo8214t <= 1.0d && mo8214t2 <= 1.0d && mo8214t3 <= 1.0d) {
            mo8214t *= 255.0d;
            mo8214t2 *= 255.0d;
            mo8214t3 *= 255.0d;
            if (d <= 1.0d) {
                d *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) d, (int) mo8214t, (int) mo8214t2, (int) mo8214t3));
    }
}
