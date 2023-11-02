package p401w9;

import java.util.Iterator;
import java.util.Map;

/* renamed from: w9.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13439d extends AbstractC13444f0 {

    /* renamed from: l */
    private final transient AbstractC13442e0 f34676l;

    /* renamed from: m */
    private final transient Object[] f34677m;

    /* renamed from: n */
    private final transient int f34678n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13439d(AbstractC13442e0 abstractC13442e0, Object[] objArr, int i, int i2) {
        this.f34676l = abstractC13442e0;
        this.f34677m = objArr;
        this.f34678n = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p401w9.AbstractC13464y
    /* renamed from: a */
    public final int mo2433a(Object[] objArr, int i) {
        return mo2430h().mo2433a(objArr, 0);
    }

    @Override // p401w9.AbstractC13464y, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f34676l.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p401w9.AbstractC13464y
    /* renamed from: i */
    public final AbstractC13448i mo2429i() {
        return mo2430h().listIterator(0);
    }

    @Override // p401w9.AbstractC13464y, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return mo2430h().listIterator(0);
    }

    @Override // p401w9.AbstractC13444f0
    /* renamed from: p */
    final AbstractC13436b0 mo2483p() {
        return new C13437c(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f34678n;
    }
}
