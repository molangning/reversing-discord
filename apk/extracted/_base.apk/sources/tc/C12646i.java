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
import p368uc.C12950e;
import vc.C13246d;

/* renamed from: tc.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12646i extends AbstractC12648k {

    /* renamed from: a */
    private final AbstractC12648k[] f32776a;

    public C12646i(Map<EnumC7059e, ?> map) {
        Collection collection;
        boolean z;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(EnumC7059e.POSSIBLE_FORMATS);
        }
        if (map != null && map.get(EnumC7059e.ASSUME_CODE_39_CHECK_DIGIT) != null) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(EnumC7055a.EAN_13) || collection.contains(EnumC7055a.UPC_A) || collection.contains(EnumC7055a.EAN_8) || collection.contains(EnumC7055a.UPC_E)) {
                arrayList.add(new C12647j(map));
            }
            if (collection.contains(EnumC7055a.CODE_39)) {
                arrayList.add(new C12640c(z));
            }
            if (collection.contains(EnumC7055a.CODE_93)) {
                arrayList.add(new C12641d());
            }
            if (collection.contains(EnumC7055a.CODE_128)) {
                arrayList.add(new C12639b());
            }
            if (collection.contains(EnumC7055a.ITF)) {
                arrayList.add(new C12645h());
            }
            if (collection.contains(EnumC7055a.CODABAR)) {
                arrayList.add(new C12638a());
            }
            if (collection.contains(EnumC7055a.RSS_14)) {
                arrayList.add(new C12950e());
            }
            if (collection.contains(EnumC7055a.RSS_EXPANDED)) {
                arrayList.add(new C13246d());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C12647j(map));
            arrayList.add(new C12640c());
            arrayList.add(new C12638a());
            arrayList.add(new C12641d());
            arrayList.add(new C12639b());
            arrayList.add(new C12645h());
            arrayList.add(new C12950e());
            arrayList.add(new C13246d());
        }
        this.f32776a = (AbstractC12648k[]) arrayList.toArray(new AbstractC12648k[arrayList.size()]);
    }

    @Override // tc.AbstractC12648k
    /* renamed from: b */
    public Result mo2954b(int i, C10119a c10119a, Map<EnumC7059e, ?> map) {
        for (AbstractC12648k abstractC12648k : this.f32776a) {
            try {
                return abstractC12648k.mo2954b(i, c10119a, map);
            } catch (AbstractC7067m unused) {
            }
        }
        throw C7064j.m21461a();
    }

    @Override // tc.AbstractC12648k, p136hc.InterfaceC7066l
    public void reset() {
        for (AbstractC12648k abstractC12648k : this.f32776a) {
            abstractC12648k.reset();
        }
    }
}
