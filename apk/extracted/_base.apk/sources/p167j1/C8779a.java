package p167j1;

import android.annotation.SuppressLint;
import android.graphics.PointF;

/* renamed from: j1.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C8779a {

    /* renamed from: a */
    private final PointF f23022a;

    /* renamed from: b */
    private final PointF f23023b;

    /* renamed from: c */
    private final PointF f23024c;

    public C8779a() {
        this.f23022a = new PointF();
        this.f23023b = new PointF();
        this.f23024c = new PointF();
    }

    /* renamed from: a */
    public PointF m17275a() {
        return this.f23022a;
    }

    /* renamed from: b */
    public PointF m17274b() {
        return this.f23023b;
    }

    /* renamed from: c */
    public PointF m17273c() {
        return this.f23024c;
    }

    /* renamed from: d */
    public void m17272d(float f, float f2) {
        this.f23022a.set(f, f2);
    }

    /* renamed from: e */
    public void m17271e(float f, float f2) {
        this.f23023b.set(f, f2);
    }

    /* renamed from: f */
    public void m17270f(float f, float f2) {
        this.f23024c.set(f, f2);
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f23024c.x), Float.valueOf(this.f23024c.y), Float.valueOf(this.f23022a.x), Float.valueOf(this.f23022a.y), Float.valueOf(this.f23023b.x), Float.valueOf(this.f23023b.y));
    }

    public C8779a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f23022a = pointF;
        this.f23023b = pointF2;
        this.f23024c = pointF3;
    }
}
