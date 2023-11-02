package p202kj;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p162ij.C7666r;
import p162ij.InterfaceC7664p;

/* renamed from: kj.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
class C9520u extends AbstractC9519t<C9520u> {

    /* renamed from: k */
    private Map<InterfaceC7664p<?>, Object> f25267k = null;

    /* renamed from: j */
    private Object f25266j = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p202kj.AbstractC9519t
    /* renamed from: H */
    public <E> E mo14416H() {
        return (E) this.f25266j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p202kj.AbstractC9519t
    /* renamed from: I */
    public void mo14415I(InterfaceC7664p<?> interfaceC7664p, int i) {
        interfaceC7664p.getClass();
        Map map = this.f25267k;
        if (map == null) {
            map = new HashMap();
            this.f25267k = map;
        }
        map.put(interfaceC7664p, Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p202kj.AbstractC9519t
    /* renamed from: J */
    public void mo14414J(InterfaceC7664p<?> interfaceC7664p, Object obj) {
        interfaceC7664p.getClass();
        if (obj == null) {
            Map<InterfaceC7664p<?>, Object> map = this.f25267k;
            if (map != null) {
                map.remove(interfaceC7664p);
                if (this.f25267k.isEmpty()) {
                    this.f25267k = null;
                    return;
                }
                return;
            }
            return;
        }
        Map map2 = this.f25267k;
        if (map2 == null) {
            map2 = new HashMap();
            this.f25267k = map2;
        }
        map2.put(interfaceC7664p, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p202kj.AbstractC9519t
    /* renamed from: K */
    public void mo14413K(Object obj) {
        this.f25266j = obj;
    }

    @Override // p162ij.AbstractC7665q, p162ij.InterfaceC7662o
    /* renamed from: c */
    public int mo10218c(InterfaceC7664p<Integer> interfaceC7664p) {
        interfaceC7664p.getClass();
        Map<InterfaceC7664p<?>, Object> map = this.f25267k;
        if (map != null && map.containsKey(interfaceC7664p)) {
            return interfaceC7664p.getType().cast(map.get(interfaceC7664p)).intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // p162ij.AbstractC7665q, p162ij.InterfaceC7662o
    /* renamed from: i */
    public <V> V mo10212i(InterfaceC7664p<V> interfaceC7664p) {
        interfaceC7664p.getClass();
        Map<InterfaceC7664p<?>, Object> map = this.f25267k;
        if (map != null && map.containsKey(interfaceC7664p)) {
            return interfaceC7664p.getType().cast(map.get(interfaceC7664p));
        }
        throw new C7666r("No value found for: " + interfaceC7664p.name());
    }

    @Override // p162ij.AbstractC7665q, p162ij.InterfaceC7662o
    /* renamed from: q */
    public boolean mo10210q(InterfaceC7664p<?> interfaceC7664p) {
        Map<InterfaceC7664p<?>, Object> map;
        if (interfaceC7664p != null && (map = this.f25267k) != null) {
            return map.containsKey(interfaceC7664p);
        }
        return false;
    }

    @Override // p162ij.AbstractC7665q
    /* renamed from: z */
    public Set<InterfaceC7664p<?>> mo14394z() {
        Map<InterfaceC7664p<?>, Object> map = this.f25267k;
        if (map == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(map.keySet());
    }
}
