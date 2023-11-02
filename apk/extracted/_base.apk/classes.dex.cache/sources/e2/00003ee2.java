package kg;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u0019J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u000b\u0010\u0019¨\u0006\u001d"}, m14357d2 = {"Lkg/q0;", "", "other", "", "equals", "", "hashCode", "", "toString", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ClassLoader;", "a", "Ljava/lang/ref/WeakReference;", "getRef", "()Ljava/lang/ref/WeakReference;", "ref", "b", "I", "getIdentityHashCode", "()I", "identityHashCode", "c", "Ljava/lang/ClassLoader;", "getTemporaryStrongRef", "()Ljava/lang/ClassLoader;", "(Ljava/lang/ClassLoader;)V", "temporaryStrongRef", "classLoader", "<init>", "kotlin-reflection"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: kg.q0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C9342q0 {

    /* renamed from: a */
    private final WeakReference<ClassLoader> f24452a;

    /* renamed from: b */
    private final int f24453b;

    /* renamed from: c */
    private ClassLoader f24454c;

    public C9342q0(ClassLoader classLoader) {
        C9612q.m13917h(classLoader, "classLoader");
        this.f24452a = new WeakReference<>(classLoader);
        this.f24453b = System.identityHashCode(classLoader);
        this.f24454c = classLoader;
    }

    /* renamed from: a */
    public final void m15821a(ClassLoader classLoader) {
        this.f24454c = classLoader;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C9342q0) && this.f24452a.get() == ((C9342q0) obj).f24452a.get();
    }

    public int hashCode() {
        return this.f24453b;
    }

    public String toString() {
        String obj;
        ClassLoader classLoader = this.f24452a.get();
        return (classLoader == null || (obj = classLoader.toString()) == null) ? "<null>" : obj;
    }
}