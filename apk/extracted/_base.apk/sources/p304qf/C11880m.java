package p304qf;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0004\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0005\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\t\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0006¨\u0006\u0016"}, m14357d2 = {"Lqf/m;", "T", "", "", "a", "b", "()Ljava/lang/Object;", "", "toString", "hashCode", "other", "", "equals", "I", "c", "()I", "index", "Ljava/lang/Object;", "d", "value", "<init>", "(ILjava/lang/Object;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: qf.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11880m<T> {

    /* renamed from: a */
    private final int f30874a;

    /* renamed from: b */
    private final T f30875b;

    public C11880m(int i, T t) {
        this.f30874a = i;
        this.f30875b = t;
    }

    /* renamed from: a */
    public final int m6782a() {
        return this.f30874a;
    }

    /* renamed from: b */
    public final T m6781b() {
        return this.f30875b;
    }

    /* renamed from: c */
    public final int m6780c() {
        return this.f30874a;
    }

    /* renamed from: d */
    public final T m6779d() {
        return this.f30875b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11880m) {
            C11880m c11880m = (C11880m) obj;
            return this.f30874a == c11880m.f30874a && C9612q.m13922c(this.f30875b, c11880m.f30875b);
        }
        return false;
    }

    public int hashCode() {
        int i = this.f30874a * 31;
        T t = this.f30875b;
        return i + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f30874a + ", value=" + this.f30875b + ')';
    }
}
