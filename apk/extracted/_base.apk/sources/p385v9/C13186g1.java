package p385v9;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: v9.g1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13186g1 {

    /* renamed from: a */
    private final Map f34199a = new WeakHashMap();

    /* renamed from: a */
    public final Object m3050a(Object obj) {
        WeakReference weakReference = (WeakReference) this.f34199a.get(obj);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: b */
    public final void m3049b() {
        this.f34199a.clear();
    }

    /* renamed from: c */
    public final void m3048c(Object obj, Object obj2) {
        this.f34199a.put(obj, new WeakReference(obj2));
    }

    /* renamed from: d */
    public final void m3047d(Object obj) {
        this.f34199a.remove(obj);
    }

    /* renamed from: e */
    public final boolean m3046e(Object obj) {
        return m3050a(obj) != null;
    }
}
