package p254o1;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p167j1.C8779a;
import p206l1.C10021n;
import p275p1.AbstractC11368c;
import p291q1.C11679k;

/* renamed from: o1.h0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10950h0 implements InterfaceC10962n0<C10021n> {

    /* renamed from: a */
    public static final C10950h0 f28719a = new C10950h0();

    /* renamed from: b */
    private static final AbstractC11368c.C11369a f28720b = AbstractC11368c.C11369a.m8241a("c", "v", "i", "o");

    private C10950h0() {
    }

    @Override // p254o1.InterfaceC10962n0
    /* renamed from: b */
    public C10021n mo9459a(AbstractC11368c abstractC11368c, float f) {
        if (abstractC11368c.mo8228I() == AbstractC11368c.EnumC11370b.BEGIN_ARRAY) {
            abstractC11368c.mo8221h();
        }
        abstractC11368c.mo8220i();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (abstractC11368c.mo8216q()) {
            int mo8226R = abstractC11368c.mo8226R(f28720b);
            if (mo8226R != 0) {
                if (mo8226R != 1) {
                    if (mo8226R != 2) {
                        if (mo8226R != 3) {
                            abstractC11368c.mo8225S();
                            abstractC11368c.mo8224U();
                        } else {
                            list3 = C10967s.m9452f(abstractC11368c, f);
                        }
                    } else {
                        list2 = C10967s.m9452f(abstractC11368c, f);
                    }
                } else {
                    list = C10967s.m9452f(abstractC11368c, f);
                }
            } else {
                z = abstractC11368c.mo8215s();
            }
        }
        abstractC11368c.mo8217m();
        if (abstractC11368c.mo8228I() == AbstractC11368c.EnumC11370b.END_ARRAY) {
            abstractC11368c.mo8219j();
        }
        if (list != null && list2 != null && list3 != null) {
            if (list.isEmpty()) {
                return new C10021n(new PointF(), false, Collections.emptyList());
            }
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = list.get(i);
                int i2 = i - 1;
                arrayList.add(new C8779a(C11679k.m7203a(list.get(i2), list3.get(i2)), C11679k.m7203a(pointF2, list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = list.get(0);
                int i3 = size - 1;
                arrayList.add(new C8779a(C11679k.m7203a(list.get(i3), list3.get(i3)), C11679k.m7203a(pointF3, list2.get(0)), pointF3));
            }
            return new C10021n(pointF, z, arrayList);
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}