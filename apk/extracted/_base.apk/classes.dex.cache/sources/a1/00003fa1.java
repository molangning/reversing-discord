package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004B\u0017\u0012\u0006\u0010\u0013\u001a\u00028\u0000\u0012\u0006\u0010\u0016\u001a\u00028\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0013\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0016\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\b¨\u0006\u0019"}, m14357d2 = {"Lkotlin/Pair;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "toString", "a", "()Ljava/lang/Object;", "b", "", "hashCode", "", "other", "", "equals", "j", "Ljava/lang/Object;", "c", "first", "k", "d", "second", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class Pair<A, B> implements Serializable {

    /* renamed from: j */
    private final A f25300j;

    /* renamed from: k */
    private final B f25301k;

    public Pair(A a, B b) {
        this.f25300j = a;
        this.f25301k = b;
    }

    /* renamed from: a */
    public final A m14351a() {
        return this.f25300j;
    }

    /* renamed from: b */
    public final B m14350b() {
        return this.f25301k;
    }

    /* renamed from: c */
    public final A m14349c() {
        return this.f25300j;
    }

    /* renamed from: d */
    public final B m14348d() {
        return this.f25301k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            return C9612q.m13922c(this.f25300j, pair.f25300j) && C9612q.m13922c(this.f25301k, pair.f25301k);
        }
        return false;
    }

    public int hashCode() {
        A a = this.f25300j;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.f25301k;
        return hashCode + (b != null ? b.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f25300j + ", " + this.f25301k + ')';
    }
}