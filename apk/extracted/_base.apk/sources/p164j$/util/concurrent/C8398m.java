package p164j$.util.concurrent;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public class C8398m implements Map.Entry {

    /* renamed from: a */
    final int f22497a;

    /* renamed from: b */
    final Object f22498b;

    /* renamed from: c */
    volatile Object f22499c;

    /* renamed from: d */
    volatile C8398m f22500d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8398m(int i, Object obj, Object obj2, C8398m c8398m) {
        this.f22497a = i;
        this.f22498b = obj;
        this.f22499c = obj2;
        this.f22500d = c8398m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C8398m mo17728a(int i, Object obj) {
        Object obj2;
        if (obj != null) {
            C8398m c8398m = this;
            do {
                if (c8398m.f22497a == i && ((obj2 = c8398m.f22498b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return c8398m;
                }
                c8398m = c8398m.f22500d;
            } while (c8398m != null);
            return null;
        }
        return null;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f22498b) || key.equals(obj2)) && (value == (obj3 = this.f22499c) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f22498b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f22499c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f22498b.hashCode() ^ this.f22499c.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return this.f22498b + "=" + this.f22499c;
    }
}
