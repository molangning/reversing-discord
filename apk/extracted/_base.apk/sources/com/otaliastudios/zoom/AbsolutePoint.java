package com.otaliastudios.zoom;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\f\u0012\b\b\u0002\u0010\u0004\u001a\u00020\f¢\u0006\u0004\b\"\u0010#B\u0011\b\u0016\u0012\u0006\u0010$\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010%J\u001c\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000J\u0011\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\u000b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002J!\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\f2\b\b\u0002\u0010\u0004\u001a\u00020\fHÆ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0003\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010\u0004\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001e¨\u0006&"}, m14357d2 = {"Lcom/otaliastudios/zoom/AbsolutePoint;", "", "", "x", "y", "", "h", "p", "g", "absolutePoint", "e", "f", "", "scale", "Lcom/otaliastudios/zoom/ScaledPoint;", "outPoint", "i", "(FLcom/otaliastudios/zoom/ScaledPoint;)Lcom/otaliastudios/zoom/ScaledPoint;", "a", "", "toString", "", "hashCode", "other", "", "equals", "F", "c", "()F", "setX", "(F)V", "b", "d", "setY", "<init>", "(FF)V", "point", "(Lcom/otaliastudios/zoom/AbsolutePoint;)V", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class AbsolutePoint {

    /* renamed from: a */
    private float f15157a;

    /* renamed from: b */
    private float f15158b;

    public AbsolutePoint() {
        this(0.0f, 0.0f, 3, null);
    }

    public AbsolutePoint(float f, float f2) {
        this.f15157a = f;
        this.f15158b = f2;
    }

    /* renamed from: b */
    public static /* synthetic */ AbsolutePoint m25471b(AbsolutePoint absolutePoint, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = absolutePoint.f15157a;
        }
        if ((i & 2) != 0) {
            f2 = absolutePoint.f15158b;
        }
        return absolutePoint.m25472a(f, f2);
    }

    /* renamed from: j */
    public static /* synthetic */ ScaledPoint m25463j(AbsolutePoint absolutePoint, float f, ScaledPoint scaledPoint, int i, Object obj) {
        if ((i & 2) != 0) {
            scaledPoint = new ScaledPoint(0.0f, 0.0f, 3, null);
        }
        return absolutePoint.m25464i(f, scaledPoint);
    }

    /* renamed from: a */
    public final AbsolutePoint m25472a(float f, float f2) {
        return new AbsolutePoint(f, f2);
    }

    /* renamed from: c */
    public final float m25470c() {
        return this.f15157a;
    }

    /* renamed from: d */
    public final float m25469d() {
        return this.f15158b;
    }

    /* renamed from: e */
    public final AbsolutePoint m25468e(AbsolutePoint absolutePoint) {
        C9612q.m13917h(absolutePoint, "absolutePoint");
        return new AbsolutePoint(this.f15157a - absolutePoint.f15157a, this.f15158b - absolutePoint.f15158b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AbsolutePoint) {
            AbsolutePoint absolutePoint = (AbsolutePoint) obj;
            return C9612q.m13922c(Float.valueOf(this.f15157a), Float.valueOf(absolutePoint.f15157a)) && C9612q.m13922c(Float.valueOf(this.f15158b), Float.valueOf(absolutePoint.f15158b));
        }
        return false;
    }

    /* renamed from: f */
    public final AbsolutePoint m25467f(AbsolutePoint absolutePoint) {
        C9612q.m13917h(absolutePoint, "absolutePoint");
        return new AbsolutePoint(this.f15157a + absolutePoint.f15157a, this.f15158b + absolutePoint.f15158b);
    }

    /* renamed from: g */
    public final void m25466g(AbsolutePoint p) {
        C9612q.m13917h(p, "p");
        m25465h(Float.valueOf(p.f15157a), Float.valueOf(p.f15158b));
    }

    /* renamed from: h */
    public final void m25465h(Number x, Number y) {
        C9612q.m13917h(x, "x");
        C9612q.m13917h(y, "y");
        this.f15157a = x.floatValue();
        this.f15158b = y.floatValue();
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f15157a) * 31) + Float.floatToIntBits(this.f15158b);
    }

    /* renamed from: i */
    public final ScaledPoint m25464i(float f, ScaledPoint outPoint) {
        C9612q.m13917h(outPoint, "outPoint");
        outPoint.m25454g(Float.valueOf(this.f15157a * f), Float.valueOf(this.f15158b * f));
        return outPoint;
    }

    public String toString() {
        return "AbsolutePoint(x=" + this.f15157a + ", y=" + this.f15158b + ')';
    }

    public /* synthetic */ AbsolutePoint(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbsolutePoint(AbsolutePoint point) {
        this(point.f15157a, point.f15158b);
        C9612q.m13917h(point, "point");
    }
}
