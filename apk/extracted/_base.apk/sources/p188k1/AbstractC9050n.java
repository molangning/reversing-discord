package p188k1;

import java.util.Arrays;
import java.util.List;
import p311r1.C12020a;

/* renamed from: k1.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
abstract class AbstractC9050n<V, O> implements InterfaceC9049m<V, O> {

    /* renamed from: a */
    final List<C12020a<V>> f23714a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC9050n(List<C12020a<V>> list) {
        this.f23714a = list;
    }

    @Override // p188k1.InterfaceC9049m
    /* renamed from: b */
    public List<C12020a<V>> mo16816b() {
        return this.f23714a;
    }

    @Override // p188k1.InterfaceC9049m
    /* renamed from: g */
    public boolean mo16815g() {
        if (this.f23714a.isEmpty()) {
            return true;
        }
        return this.f23714a.size() == 1 && this.f23714a.get(0).m6577i();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f23714a.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.f23714a.toArray()));
        }
        return sb2.toString();
    }
}
