package pf;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005B\u001f\u0012\u0006\u0010\u0015\u001a\u00028\u0000\u0012\u0006\u0010\u0018\u001a\u00028\u0001\u0012\u0006\u0010\u001b\u001a\u00028\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0015\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0018\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u001b\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\t¨\u0006\u001e"}, m14357d2 = {"Lpf/w;", "A", "B", "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "toString", "a", "()Ljava/lang/Object;", "b", "c", "", "hashCode", "", "other", "", "equals", "j", "Ljava/lang/Object;", "d", "first", "k", "e", "second", "l", "f", "third", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: pf.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11590w<A, B, C> implements Serializable {

    /* renamed from: j */
    private final A f30101j;

    /* renamed from: k */
    private final B f30102k;

    /* renamed from: l */
    private final C f30103l;

    public C11590w(A a, B b, C c) {
        this.f30101j = a;
        this.f30102k = b;
        this.f30103l = c;
    }

    /* renamed from: a */
    public final A m7583a() {
        return this.f30101j;
    }

    /* renamed from: b */
    public final B m7582b() {
        return this.f30102k;
    }

    /* renamed from: c */
    public final C m7581c() {
        return this.f30103l;
    }

    /* renamed from: d */
    public final A m7580d() {
        return this.f30101j;
    }

    /* renamed from: e */
    public final B m7579e() {
        return this.f30102k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C11590w) {
            C11590w c11590w = (C11590w) obj;
            return C9612q.m13922c(this.f30101j, c11590w.f30101j) && C9612q.m13922c(this.f30102k, c11590w.f30102k) && C9612q.m13922c(this.f30103l, c11590w.f30103l);
        }
        return false;
    }

    /* renamed from: f */
    public final C m7578f() {
        return this.f30103l;
    }

    public int hashCode() {
        A a = this.f30101j;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.f30102k;
        int hashCode2 = (hashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.f30103l;
        return hashCode2 + (c != null ? c.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f30101j + ", " + this.f30102k + ", " + this.f30103l + ')';
    }
}