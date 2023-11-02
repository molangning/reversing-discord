package gb;

import java.io.Serializable;

/* renamed from: gb.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C6687r<K, V> extends AbstractC6635e<K, V> implements Serializable {

    /* renamed from: j */
    final K f18888j;

    /* renamed from: k */
    final V f18889k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6687r(K k, V v) {
        this.f18888j = k;
        this.f18889k = v;
    }

    @Override // gb.AbstractC6635e, java.util.Map.Entry
    public final K getKey() {
        return this.f18888j;
    }

    @Override // gb.AbstractC6635e, java.util.Map.Entry
    public final V getValue() {
        return this.f18889k;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
