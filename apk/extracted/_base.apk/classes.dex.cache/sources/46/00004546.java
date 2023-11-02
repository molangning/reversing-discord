package ni;

import kotlin.jvm.internal.C9612q;

/* renamed from: ni.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10909a<T> {

    /* renamed from: a */
    private final T f28636a;

    /* renamed from: b */
    private final T f28637b;

    public C10909a(T t, T t2) {
        this.f28636a = t;
        this.f28637b = t2;
    }

    /* renamed from: a */
    public final T m9575a() {
        return this.f28636a;
    }

    /* renamed from: b */
    public final T m9574b() {
        return this.f28637b;
    }

    /* renamed from: c */
    public final T m9573c() {
        return this.f28636a;
    }

    /* renamed from: d */
    public final T m9572d() {
        return this.f28637b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10909a) {
            C10909a c10909a = (C10909a) obj;
            return C9612q.m13922c(this.f28636a, c10909a.f28636a) && C9612q.m13922c(this.f28637b, c10909a.f28637b);
        }
        return false;
    }

    public int hashCode() {
        T t = this.f28636a;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.f28637b;
        return hashCode + (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.f28636a + ", upper=" + this.f28637b + ')';
    }
}