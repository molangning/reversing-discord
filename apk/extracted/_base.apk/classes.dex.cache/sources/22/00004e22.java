package p355ti;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.ranges.IntRange;

@Metadata(m14358d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"Lti/b;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "value", "Lkotlin/ranges/IntRange;", "b", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "range", "<init>", "(Ljava/lang/String;Lkotlin/ranges/IntRange;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: ti.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12786b {

    /* renamed from: a */
    private final String f33150a;

    /* renamed from: b */
    private final IntRange f33151b;

    public C12786b(String value, IntRange range) {
        C9612q.m13917h(value, "value");
        C9612q.m13917h(range, "range");
        this.f33150a = value;
        this.f33151b = range;
    }

    /* renamed from: a */
    public final String m3927a() {
        return this.f33150a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C12786b) {
            C12786b c12786b = (C12786b) obj;
            return C9612q.m13922c(this.f33150a, c12786b.f33150a) && C9612q.m13922c(this.f33151b, c12786b.f33151b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f33150a.hashCode() * 31) + this.f33151b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f33150a + ", range=" + this.f33151b + ')';
    }
}