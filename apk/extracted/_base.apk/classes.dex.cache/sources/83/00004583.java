package p254o1;

import java.util.ArrayList;
import java.util.List;
import p073e1.C6062k;
import p125h1.C6876i;
import p275p1.AbstractC11368c;
import p311r1.C12020a;

/* renamed from: o1.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C10970u {

    /* renamed from: a */
    static AbstractC11368c.C11369a f28758a = AbstractC11368c.C11369a.m8241a("k");

    /* renamed from: a */
    public static <T> List<C12020a<T>> m9442a(AbstractC11368c abstractC11368c, C6062k c6062k, float f, InterfaceC10962n0<T> interfaceC10962n0, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (abstractC11368c.mo8228I() == AbstractC11368c.EnumC11370b.STRING) {
            c6062k.m23676a("Lottie doesn't support expressions.");
            return arrayList;
        }
        abstractC11368c.mo8220i();
        while (abstractC11368c.mo8216q()) {
            if (abstractC11368c.mo8226R(f28758a) != 0) {
                abstractC11368c.mo8224U();
            } else if (abstractC11368c.mo8228I() == AbstractC11368c.EnumC11370b.BEGIN_ARRAY) {
                abstractC11368c.mo8221h();
                if (abstractC11368c.mo8228I() == AbstractC11368c.EnumC11370b.NUMBER) {
                    arrayList.add(C10969t.m9448c(abstractC11368c, c6062k, f, interfaceC10962n0, false, z));
                } else {
                    while (abstractC11368c.mo8216q()) {
                        arrayList.add(C10969t.m9448c(abstractC11368c, c6062k, f, interfaceC10962n0, true, z));
                    }
                }
                abstractC11368c.mo8219j();
            } else {
                arrayList.add(C10969t.m9448c(abstractC11368c, c6062k, f, interfaceC10962n0, false, z));
            }
        }
        abstractC11368c.mo8217m();
        m9441b(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public static <T> void m9441b(List<? extends C12020a<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C12020a<T> c12020a = list.get(i2);
            i2++;
            C12020a<T> c12020a2 = list.get(i2);
            c12020a.f31022h = Float.valueOf(c12020a2.f31021g);
            if (c12020a.f31017c == null && (t = c12020a2.f31016b) != null) {
                c12020a.f31017c = t;
                if (c12020a instanceof C6876i) {
                    ((C6876i) c12020a).m21739j();
                }
            }
        }
        C12020a<T> c12020a3 = list.get(i);
        if ((c12020a3.f31016b == null || c12020a3.f31017c == null) && list.size() > 1) {
            list.remove(c12020a3);
        }
    }
}