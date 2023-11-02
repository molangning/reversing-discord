package p164j$.util.concurrent;

import java.util.Map;

/* renamed from: j$.util.concurrent.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8397l implements Map.Entry {

    /* renamed from: a */
    final Object f22494a;

    /* renamed from: b */
    Object f22495b;

    /* renamed from: c */
    final ConcurrentHashMap f22496c;

    public C8397l(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
        this.f22494a = obj;
        this.f22495b = obj2;
        this.f22496c = concurrentHashMap;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f22494a) || key.equals(obj2)) && (value == (obj3 = this.f22495b) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f22494a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f22495b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f22494a.hashCode() ^ this.f22495b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        obj.getClass();
        Object obj2 = this.f22495b;
        this.f22495b = obj;
        this.f22496c.put(this.f22494a, obj);
        return obj2;
    }

    public final String toString() {
        return this.f22494a + "=" + this.f22495b;
    }
}