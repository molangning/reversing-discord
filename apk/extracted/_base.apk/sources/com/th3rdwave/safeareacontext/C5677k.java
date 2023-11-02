package com.th3rdwave.safeareacontext;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0016"}, m14357d2 = {"Lcom/th3rdwave/safeareacontext/k;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/th3rdwave/safeareacontext/j;", "a", "Lcom/th3rdwave/safeareacontext/j;", "d", "()Lcom/th3rdwave/safeareacontext/j;", ViewProps.TOP, "b", "c", ViewProps.RIGHT, ViewProps.BOTTOM, ViewProps.LEFT, "<init>", "(Lcom/th3rdwave/safeareacontext/j;Lcom/th3rdwave/safeareacontext/j;Lcom/th3rdwave/safeareacontext/j;Lcom/th3rdwave/safeareacontext/j;)V", "react-native-safe-area-context_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.th3rdwave.safeareacontext.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5677k {

    /* renamed from: a */
    private final EnumC5676j f15852a;

    /* renamed from: b */
    private final EnumC5676j f15853b;

    /* renamed from: c */
    private final EnumC5676j f15854c;

    /* renamed from: d */
    private final EnumC5676j f15855d;

    public C5677k(EnumC5676j top, EnumC5676j right, EnumC5676j bottom, EnumC5676j left) {
        C9612q.m13917h(top, "top");
        C9612q.m13917h(right, "right");
        C9612q.m13917h(bottom, "bottom");
        C9612q.m13917h(left, "left");
        this.f15852a = top;
        this.f15853b = right;
        this.f15854c = bottom;
        this.f15855d = left;
    }

    /* renamed from: a */
    public final EnumC5676j m24763a() {
        return this.f15854c;
    }

    /* renamed from: b */
    public final EnumC5676j m24762b() {
        return this.f15855d;
    }

    /* renamed from: c */
    public final EnumC5676j m24761c() {
        return this.f15853b;
    }

    /* renamed from: d */
    public final EnumC5676j m24760d() {
        return this.f15852a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5677k) {
            C5677k c5677k = (C5677k) obj;
            return this.f15852a == c5677k.f15852a && this.f15853b == c5677k.f15853b && this.f15854c == c5677k.f15854c && this.f15855d == c5677k.f15855d;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f15852a.hashCode() * 31) + this.f15853b.hashCode()) * 31) + this.f15854c.hashCode()) * 31) + this.f15855d.hashCode();
    }

    public String toString() {
        return "SafeAreaViewEdges(top=" + this.f15852a + ", right=" + this.f15853b + ", bottom=" + this.f15854c + ", left=" + this.f15855d + ')';
    }
}
