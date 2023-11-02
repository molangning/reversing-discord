package p254o1;

import android.graphics.PointF;
import p167j1.C8780b;
import p275p1.AbstractC11368c;

/* renamed from: o1.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10951i implements InterfaceC10962n0<C8780b> {

    /* renamed from: a */
    public static final C10951i f28721a = new C10951i();

    /* renamed from: b */
    private static final AbstractC11368c.C11369a f28722b = AbstractC11368c.C11369a.m8241a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    private C10951i() {
    }

    @Override // p254o1.InterfaceC10962n0
    /* renamed from: b */
    public C8780b mo9459a(AbstractC11368c abstractC11368c, float f) {
        C8780b.EnumC8781a enumC8781a = C8780b.EnumC8781a.CENTER;
        abstractC11368c.mo8220i();
        C8780b.EnumC8781a enumC8781a2 = enumC8781a;
        String str = null;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        while (abstractC11368c.mo8216q()) {
            switch (abstractC11368c.mo8226R(f28722b)) {
                case 0:
                    str = abstractC11368c.mo8234D();
                    break;
                case 1:
                    str2 = abstractC11368c.mo8234D();
                    break;
                case 2:
                    f2 = (float) abstractC11368c.mo8214t();
                    break;
                case 3:
                    int mo8212v = abstractC11368c.mo8212v();
                    enumC8781a2 = C8780b.EnumC8781a.CENTER;
                    if (mo8212v <= enumC8781a2.ordinal() && mo8212v >= 0) {
                        enumC8781a2 = C8780b.EnumC8781a.values()[mo8212v];
                        break;
                    }
                    break;
                case 4:
                    i = abstractC11368c.mo8212v();
                    break;
                case 5:
                    f3 = (float) abstractC11368c.mo8214t();
                    break;
                case 6:
                    f4 = (float) abstractC11368c.mo8214t();
                    break;
                case 7:
                    i2 = C10967s.m9454d(abstractC11368c);
                    break;
                case 8:
                    i3 = C10967s.m9454d(abstractC11368c);
                    break;
                case 9:
                    f5 = (float) abstractC11368c.mo8214t();
                    break;
                case 10:
                    z = abstractC11368c.mo8215s();
                    break;
                case 11:
                    abstractC11368c.mo8221h();
                    PointF pointF3 = new PointF(((float) abstractC11368c.mo8214t()) * f, ((float) abstractC11368c.mo8214t()) * f);
                    abstractC11368c.mo8219j();
                    pointF = pointF3;
                    break;
                case 12:
                    abstractC11368c.mo8221h();
                    PointF pointF4 = new PointF(((float) abstractC11368c.mo8214t()) * f, ((float) abstractC11368c.mo8214t()) * f);
                    abstractC11368c.mo8219j();
                    pointF2 = pointF4;
                    break;
                default:
                    abstractC11368c.mo8225S();
                    abstractC11368c.mo8224U();
                    break;
            }
        }
        abstractC11368c.mo8217m();
        return new C8780b(str, str2, f2, enumC8781a2, i, f3, f4, i2, i3, f5, z, pointF, pointF2);
    }
}
