package com.otaliastudios.zoom;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\n\u0012\b\b\u0002\u0010\u0004\u001a\u00020\n¢\u0006\u0004\b \u0010!J\u001c\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H\u0007J\u0011\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\u0002J\u0011\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0086\u0002J!\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\nHÆ\u0001J\t\u0010\u0012\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0003\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u0004\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001c¨\u0006\""}, m14357d2 = {"Lcom/otaliastudios/zoom/ScaledPoint;", "", "", "x", "y", "", "g", "scaledPoint", "e", "f", "", "scale", "Lcom/otaliastudios/zoom/AbsolutePoint;", "outPoint", "j", "(FLcom/otaliastudios/zoom/AbsolutePoint;)Lcom/otaliastudios/zoom/AbsolutePoint;", "a", "", "toString", "", "hashCode", "other", "", "equals", "F", "c", "()F", "h", "(F)V", "b", "d", "i", "<init>", "(FF)V", "library_release"}, m14356k = 1, m14355mv = {1, 5, 1})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ScaledPoint {

    /* renamed from: a */
    private float f15167a;

    /* renamed from: b */
    private float f15168b;

    public ScaledPoint() {
        this(0.0f, 0.0f, 3, null);
    }

    public ScaledPoint(float f, float f2) {
        this.f15167a = f;
        this.f15168b = f2;
    }

    /* renamed from: b */
    public static /* synthetic */ ScaledPoint m25459b(ScaledPoint scaledPoint, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = scaledPoint.f15167a;
        }
        if ((i & 2) != 0) {
            f2 = scaledPoint.f15168b;
        }
        return scaledPoint.m25460a(f, f2);
    }

    /* renamed from: k */
    public static /* synthetic */ AbsolutePoint m25450k(ScaledPoint scaledPoint, float f, AbsolutePoint absolutePoint, int i, Object obj) {
        if ((i & 2) != 0) {
            absolutePoint = new AbsolutePoint(0.0f, 0.0f, 3, null);
        }
        return scaledPoint.m25451j(f, absolutePoint);
    }

    /* renamed from: a */
    public final ScaledPoint m25460a(float f, float f2) {
        return new ScaledPoint(f, f2);
    }

    /* renamed from: c */
    public final float m25458c() {
        return this.f15167a;
    }

    /* renamed from: d */
    public final float m25457d() {
        return this.f15168b;
    }

    /* renamed from: e */
    public final ScaledPoint m25456e(ScaledPoint scaledPoint) {
        C9612q.m13917h(scaledPoint, "scaledPoint");
        return new ScaledPoint(this.f15167a - scaledPoint.f15167a, this.f15168b - scaledPoint.f15168b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ScaledPoint) {
            ScaledPoint scaledPoint = (ScaledPoint) obj;
            return C9612q.m13922c(Float.valueOf(this.f15167a), Float.valueOf(scaledPoint.f15167a)) && C9612q.m13922c(Float.valueOf(this.f15168b), Float.valueOf(scaledPoint.f15168b));
        }
        return false;
    }

    /* renamed from: f */
    public final ScaledPoint m25455f(ScaledPoint scaledPoint) {
        C9612q.m13917h(scaledPoint, "scaledPoint");
        return new ScaledPoint(this.f15167a + scaledPoint.f15167a, this.f15168b + scaledPoint.f15168b);
    }

    /* renamed from: g */
    public final void m25454g(Number x, Number y) {
        C9612q.m13917h(x, "x");
        C9612q.m13917h(y, "y");
        this.f15167a = x.floatValue();
        this.f15168b = y.floatValue();
    }

    /* renamed from: h */
    public final void m25453h(float f) {
        this.f15167a = f;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f15167a) * 31) + Float.floatToIntBits(this.f15168b);
    }

    /* renamed from: i */
    public final void m25452i(float f) {
        this.f15168b = f;
    }

    /* renamed from: j */
    public final AbsolutePoint m25451j(float f, AbsolutePoint outPoint) {
        C9612q.m13917h(outPoint, "outPoint");
        outPoint.m25465h(Float.valueOf(this.f15167a / f), Float.valueOf(this.f15168b / f));
        return outPoint;
    }

    public String toString() {
        return "ScaledPoint(x=" + this.f15167a + ", y=" + this.f15168b + ')';
    }

    public /* synthetic */ ScaledPoint(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2);
    }
}
