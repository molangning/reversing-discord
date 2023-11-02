package p254o1;

import android.graphics.PointF;
import p275p1.AbstractC11368c;

/* renamed from: o1.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10938b0 implements InterfaceC10962n0<PointF> {

    /* renamed from: a */
    public static final C10938b0 f28706a = new C10938b0();

    private C10938b0() {
    }

    @Override // p254o1.InterfaceC10962n0
    /* renamed from: b */
    public PointF mo9459a(AbstractC11368c abstractC11368c, float f) {
        AbstractC11368c.EnumC11370b mo8228I = abstractC11368c.mo8228I();
        if (mo8228I == AbstractC11368c.EnumC11370b.BEGIN_ARRAY) {
            return C10967s.m9453e(abstractC11368c, f);
        }
        if (mo8228I == AbstractC11368c.EnumC11370b.BEGIN_OBJECT) {
            return C10967s.m9453e(abstractC11368c, f);
        }
        if (mo8228I == AbstractC11368c.EnumC11370b.NUMBER) {
            PointF pointF = new PointF(((float) abstractC11368c.mo8214t()) * f, ((float) abstractC11368c.mo8214t()) * f);
            while (abstractC11368c.mo8216q()) {
                abstractC11368c.mo8224U();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + mo8228I);
    }
}