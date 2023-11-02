package p254o1;

import android.graphics.PointF;
import java.util.ArrayList;
import p073e1.C6062k;
import p188k1.C9038b;
import p188k1.C9041e;
import p188k1.C9045i;
import p188k1.InterfaceC9049m;
import p275p1.AbstractC11368c;
import p291q1.C11680l;
import p311r1.C12020a;

/* renamed from: o1.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10935a {

    /* renamed from: a */
    private static final AbstractC11368c.C11369a f28702a = AbstractC11368c.C11369a.m8241a("k", "x", "y");

    /* renamed from: a */
    public static C9041e m9517a(AbstractC11368c abstractC11368c, C6062k c6062k) {
        ArrayList arrayList = new ArrayList();
        if (abstractC11368c.mo8228I() == AbstractC11368c.EnumC11370b.BEGIN_ARRAY) {
            abstractC11368c.mo8221h();
            while (abstractC11368c.mo8216q()) {
                arrayList.add(C10976z.m9430a(abstractC11368c, c6062k));
            }
            abstractC11368c.mo8219j();
            C10970u.m9441b(arrayList);
        } else {
            arrayList.add(new C12020a(C10967s.m9453e(abstractC11368c, C11680l.m7188e())));
        }
        return new C9041e(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static InterfaceC9049m<PointF, PointF> m9516b(AbstractC11368c abstractC11368c, C6062k c6062k) {
        abstractC11368c.mo8220i();
        C9041e c9041e = null;
        C9038b c9038b = null;
        boolean z = false;
        C9038b c9038b2 = null;
        while (abstractC11368c.mo8228I() != AbstractC11368c.EnumC11370b.END_OBJECT) {
            int mo8226R = abstractC11368c.mo8226R(f28702a);
            if (mo8226R != 0) {
                if (mo8226R != 1) {
                    if (mo8226R != 2) {
                        abstractC11368c.mo8225S();
                        abstractC11368c.mo8224U();
                    } else if (abstractC11368c.mo8228I() == AbstractC11368c.EnumC11370b.STRING) {
                        abstractC11368c.mo8224U();
                        z = true;
                    } else {
                        c9038b = C10941d.m9499e(abstractC11368c, c6062k);
                    }
                } else if (abstractC11368c.mo8228I() == AbstractC11368c.EnumC11370b.STRING) {
                    abstractC11368c.mo8224U();
                    z = true;
                } else {
                    c9038b2 = C10941d.m9499e(abstractC11368c, c6062k);
                }
            } else {
                c9041e = m9517a(abstractC11368c, c6062k);
            }
        }
        abstractC11368c.mo8217m();
        if (z) {
            c6062k.m23676a("Lottie doesn't support expressions.");
        }
        if (c9041e != null) {
            return c9041e;
        }
        return new C9045i(c9038b2, c9038b);
    }
}
