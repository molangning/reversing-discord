package tc;

import com.google.zxing.Result;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import lc.C10119a;
import p136hc.AbstractC7067m;
import p136hc.C7064j;
import p136hc.EnumC7055a;
import p136hc.EnumC7059e;

/* renamed from: tc.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12647j extends AbstractC12648k {

    /* renamed from: a */
    private final AbstractC12653p[] f32777a;

    public C12647j(Map<EnumC7059e, ?> map) {
        Collection collection;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(EnumC7059e.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(EnumC7055a.EAN_13)) {
                arrayList.add(new C12642e());
            } else if (collection.contains(EnumC7055a.UPC_A)) {
                arrayList.add(new C12649l());
            }
            if (collection.contains(EnumC7055a.EAN_8)) {
                arrayList.add(new C12643f());
            }
            if (collection.contains(EnumC7055a.UPC_E)) {
                arrayList.add(new C12654q());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C12642e());
            arrayList.add(new C12643f());
            arrayList.add(new C12654q());
        }
        this.f32777a = (AbstractC12653p[]) arrayList.toArray(new AbstractC12653p[arrayList.size()]);
    }

    @Override // tc.AbstractC12648k
    /* renamed from: b */
    public Result mo2954b(int i, C10119a c10119a, Map<EnumC7059e, ?> map) {
        boolean z;
        Collection collection;
        boolean z2;
        int[] m4611o = AbstractC12653p.m4611o(c10119a);
        for (AbstractC12653p abstractC12653p : this.f32777a) {
            try {
                Result mo4614l = abstractC12653p.mo4614l(i, c10119a, m4611o, map);
                if (mo4614l.m26113b() == EnumC7055a.EAN_13 && mo4614l.m26109f().charAt(0) == '0') {
                    z = true;
                } else {
                    z = false;
                }
                if (map == null) {
                    collection = null;
                } else {
                    collection = (Collection) map.get(EnumC7059e.POSSIBLE_FORMATS);
                }
                if (collection != null && !collection.contains(EnumC7055a.UPC_A)) {
                    z2 = false;
                    if (!z && z2) {
                        Result result = new Result(mo4614l.m26109f().substring(1), mo4614l.m26112c(), mo4614l.m26110e(), EnumC7055a.UPC_A);
                        result.m26108g(mo4614l.m26111d());
                        return result;
                    }
                    return mo4614l;
                }
                z2 = true;
                if (!z) {
                }
                return mo4614l;
            } catch (AbstractC7067m unused) {
            }
        }
        throw C7064j.m21461a();
    }

    @Override // tc.AbstractC12648k, p136hc.InterfaceC7066l
    public void reset() {
        for (AbstractC12653p abstractC12653p : this.f32777a) {
            abstractC12653p.reset();
        }
    }
}
