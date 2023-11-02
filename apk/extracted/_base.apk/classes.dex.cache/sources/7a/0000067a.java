package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import p072e0.C6030a;

/* renamed from: androidx.emoji2.text.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1512g {

    /* renamed from: d */
    private static final ThreadLocal<C6030a> f3938d = new ThreadLocal<>();

    /* renamed from: a */
    private final int f3939a;

    /* renamed from: b */
    private final C1525m f3940b;

    /* renamed from: c */
    private volatile int f3941c = 0;

    public C1512g(C1525m c1525m, int i) {
        this.f3940b = c1525m;
        this.f3939a = i;
    }

    /* renamed from: g */
    private C6030a m36619g() {
        ThreadLocal<C6030a> threadLocal = f3938d;
        C6030a c6030a = threadLocal.get();
        if (c6030a == null) {
            c6030a = new C6030a();
            threadLocal.set(c6030a);
        }
        this.f3940b.m36573d().m23839j(c6030a, this.f3939a);
        return c6030a;
    }

    /* renamed from: a */
    public void m36625a(Canvas canvas, float f, float f2, Paint paint) {
        Typeface m36570g = this.f3940b.m36570g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(m36570g);
        canvas.drawText(this.f3940b.m36574c(), this.f3939a * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    /* renamed from: b */
    public int m36624b(int i) {
        return m36619g().m23850h(i);
    }

    /* renamed from: c */
    public int m36623c() {
        return m36619g().m23849i();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* renamed from: d */
    public int m36622d() {
        return this.f3941c;
    }

    /* renamed from: e */
    public short m36621e() {
        return m36619g().m23847k();
    }

    /* renamed from: f */
    public int m36620f() {
        return m36619g().m23846l();
    }

    /* renamed from: h */
    public short m36618h() {
        return m36619g().m23845m();
    }

    /* renamed from: i */
    public short m36617i() {
        return m36619g().m23844n();
    }

    /* renamed from: j */
    public boolean m36616j() {
        return m36619g().m23848j();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    /* renamed from: k */
    public void m36615k(boolean z) {
        this.f3941c = z ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(m36620f()));
        sb2.append(", codepoints:");
        int m36623c = m36623c();
        for (int i = 0; i < m36623c; i++) {
            sb2.append(Integer.toHexString(m36624b(i)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}