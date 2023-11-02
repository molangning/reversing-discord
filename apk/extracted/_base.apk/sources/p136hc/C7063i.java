package p136hc;

import bd.C2270a;
import com.google.zxing.Result;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import p157ic.C7495b;
import p265oc.C11080a;
import p322rc.C12122a;
import p424xc.C13778b;
import tc.C12646i;

/* renamed from: hc.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7063i implements InterfaceC7066l {

    /* renamed from: a */
    private Map<EnumC7059e, ?> f19342a;

    /* renamed from: b */
    private InterfaceC7066l[] f19343b;

    /* renamed from: b */
    private Result m21464b(C7057c c7057c) {
        InterfaceC7066l[] interfaceC7066lArr = this.f19343b;
        if (interfaceC7066lArr != null) {
            for (InterfaceC7066l interfaceC7066l : interfaceC7066lArr) {
                try {
                    return interfaceC7066l.mo1567a(c7057c, this.f19342a);
                } catch (AbstractC7067m unused) {
                }
            }
        }
        throw C7064j.m21461a();
    }

    @Override // p136hc.InterfaceC7066l
    /* renamed from: a */
    public Result mo1567a(C7057c c7057c, Map<EnumC7059e, ?> map) {
        m21462d(map);
        return m21464b(c7057c);
    }

    /* renamed from: c */
    public Result m21463c(C7057c c7057c) {
        if (this.f19343b == null) {
            m21462d(null);
        }
        return m21464b(c7057c);
    }

    /* renamed from: d */
    public void m21462d(Map<EnumC7059e, ?> map) {
        boolean z;
        Collection collection;
        this.f19342a = map;
        boolean z2 = true;
        if (map != null && map.containsKey(EnumC7059e.TRY_HARDER)) {
            z = true;
        } else {
            z = false;
        }
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(EnumC7059e.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(EnumC7055a.UPC_A) && !collection.contains(EnumC7055a.UPC_E) && !collection.contains(EnumC7055a.EAN_13) && !collection.contains(EnumC7055a.EAN_8) && !collection.contains(EnumC7055a.CODABAR) && !collection.contains(EnumC7055a.CODE_39) && !collection.contains(EnumC7055a.CODE_93) && !collection.contains(EnumC7055a.CODE_128) && !collection.contains(EnumC7055a.ITF) && !collection.contains(EnumC7055a.RSS_14) && !collection.contains(EnumC7055a.RSS_EXPANDED)) {
                z2 = false;
            }
            if (z2 && !z) {
                arrayList.add(new C12646i(map));
            }
            if (collection.contains(EnumC7055a.QR_CODE)) {
                arrayList.add(new C2270a());
            }
            if (collection.contains(EnumC7055a.DATA_MATRIX)) {
                arrayList.add(new C11080a());
            }
            if (collection.contains(EnumC7055a.AZTEC)) {
                arrayList.add(new C7495b());
            }
            if (collection.contains(EnumC7055a.PDF_417)) {
                arrayList.add(new C13778b());
            }
            if (collection.contains(EnumC7055a.MAXICODE)) {
                arrayList.add(new C12122a());
            }
            if (z2 && z) {
                arrayList.add(new C12646i(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z) {
                arrayList.add(new C12646i(map));
            }
            arrayList.add(new C2270a());
            arrayList.add(new C11080a());
            arrayList.add(new C7495b());
            arrayList.add(new C13778b());
            arrayList.add(new C12122a());
            if (z) {
                arrayList.add(new C12646i(map));
            }
        }
        this.f19343b = (InterfaceC7066l[]) arrayList.toArray(new InterfaceC7066l[arrayList.size()]);
    }

    @Override // p136hc.InterfaceC7066l
    public void reset() {
        InterfaceC7066l[] interfaceC7066lArr = this.f19343b;
        if (interfaceC7066lArr != null) {
            for (InterfaceC7066l interfaceC7066l : interfaceC7066lArr) {
                interfaceC7066l.reset();
            }
        }
    }
}
