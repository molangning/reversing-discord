package com.th3rdwave.safeareacontext;

import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\n\u0010\r¨\u0006\u0016"}, m14357d2 = {"Lcom/th3rdwave/safeareacontext/Rect;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "F", "c", "()F", "x", "b", "d", "y", "width", "height", "<init>", "(FFFF)V", "react-native-safe-area-context_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class Rect {

    /* renamed from: a */
    private final float f15826a;

    /* renamed from: b */
    private final float f15827b;

    /* renamed from: c */
    private final float f15828c;

    /* renamed from: d */
    private final float f15829d;

    public Rect(float f, float f2, float f3, float f4) {
        this.f15826a = f;
        this.f15827b = f2;
        this.f15828c = f3;
        this.f15829d = f4;
    }

    /* renamed from: a */
    public final float m24789a() {
        return this.f15829d;
    }

    /* renamed from: b */
    public final float m24788b() {
        return this.f15828c;
    }

    /* renamed from: c */
    public final float m24787c() {
        return this.f15826a;
    }

    /* renamed from: d */
    public final float m24786d() {
        return this.f15827b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Rect) {
            Rect rect = (Rect) obj;
            return Float.compare(this.f15826a, rect.f15826a) == 0 && Float.compare(this.f15827b, rect.f15827b) == 0 && Float.compare(this.f15828c, rect.f15828c) == 0 && Float.compare(this.f15829d, rect.f15829d) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.f15826a) * 31) + Float.floatToIntBits(this.f15827b)) * 31) + Float.floatToIntBits(this.f15828c)) * 31) + Float.floatToIntBits(this.f15829d);
    }

    public String toString() {
        return "Rect(x=" + this.f15826a + ", y=" + this.f15827b + ", width=" + this.f15828c + ", height=" + this.f15829d + ')';
    }
}