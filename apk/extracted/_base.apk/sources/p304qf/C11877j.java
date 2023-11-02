package p304qf;

import cg.InterfaceC2533a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00060\u0004j\u0002`\u0005B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\u0012\u0010\u000f\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0003H\u0016J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0014\u0010\u0015\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R(\u0010\u001a\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u00170\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, m14357d2 = {"Lqf/j;", "", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "other", "", "equals", "", "hashCode", "", "toString", "isEmpty", "key", "containsKey", "value", "a", "c", "g", "()I", "size", "", "", "e", "()Ljava/util/Set;", "entries", "f", "keys", "", "h", "()Ljava/util/Collection;", "values", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: qf.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11877j implements Map, Serializable, InterfaceC2533a {

    /* renamed from: j */
    public static final C11877j f30872j = new C11877j();

    private C11877j() {
    }

    /* renamed from: a */
    public boolean m6793a(Void value) {
        C9612q.m13917h(value, "value");
        return false;
    }

    @Override // java.util.Map
    /* renamed from: c */
    public Void get(Object obj) {
        return null;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return m6793a((Void) obj);
        }
        return false;
    }

    /* renamed from: e */
    public Set<Map.Entry> m6791e() {
        return C11878k.f30873j;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry> entrySet() {
        return m6791e();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    /* renamed from: f */
    public Set<Object> m6790f() {
        return C11878k.f30873j;
    }

    /* renamed from: g */
    public int m6789g() {
        return 0;
    }

    /* renamed from: h */
    public Collection m6788h() {
        return C11876i.f30871j;
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    /* renamed from: i */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return m6790f();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m6789g();
    }

    public String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m6788h();
    }
}
