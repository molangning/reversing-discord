package p202kj;

import java.util.HashMap;
import java.util.Map;
import p162ij.InterfaceC7664p;

/* renamed from: kj.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
class C9515q extends HashMap<InterfaceC7664p<?>, Object> {
    private static final long serialVersionUID = 1245025551222311435L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9515q(Map<? extends InterfaceC7664p<?>, ?> map) {
        super(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: b */
    public Object put(InterfaceC7664p<?> interfaceC7664p, Object obj) {
        Object put = super.put(interfaceC7664p, obj);
        if (interfaceC7664p != null && put != null && !put.equals(obj)) {
            throw new C9474a(interfaceC7664p);
        }
        return put;
    }
}
