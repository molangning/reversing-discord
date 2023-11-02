package p311r1;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import p073e1.C6062k;

/* renamed from: r1.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C12020a<T> {

    /* renamed from: a */
    private final C6062k f31015a;

    /* renamed from: b */
    public final T f31016b;

    /* renamed from: c */
    public T f31017c;

    /* renamed from: d */
    public final Interpolator f31018d;

    /* renamed from: e */
    public final Interpolator f31019e;

    /* renamed from: f */
    public final Interpolator f31020f;

    /* renamed from: g */
    public final float f31021g;

    /* renamed from: h */
    public Float f31022h;

    /* renamed from: i */
    private float f31023i;

    /* renamed from: j */
    private float f31024j;

    /* renamed from: k */
    private int f31025k;

    /* renamed from: l */
    private int f31026l;

    /* renamed from: m */
    private float f31027m;

    /* renamed from: n */
    private float f31028n;

    /* renamed from: o */
    public PointF f31029o;

    /* renamed from: p */
    public PointF f31030p;

    public C12020a(C6062k c6062k, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.f31023i = -3987645.8f;
        this.f31024j = -3987645.8f;
        this.f31025k = 784923401;
        this.f31026l = 784923401;
        this.f31027m = Float.MIN_VALUE;
        this.f31028n = Float.MIN_VALUE;
        this.f31029o = null;
        this.f31030p = null;
        this.f31015a = c6062k;
        this.f31016b = t;
        this.f31017c = t2;
        this.f31018d = interpolator;
        this.f31019e = null;
        this.f31020f = null;
        this.f31021g = f;
        this.f31022h = f2;
    }

    /* renamed from: a */
    public boolean m6585a(float f) {
        return f >= m6580f() && f < m6583c();
    }

    /* renamed from: b */
    public C12020a<T> m6584b(T t, T t2) {
        return new C12020a<>(t, t2);
    }

    /* renamed from: c */
    public float m6583c() {
        if (this.f31015a == null) {
            return 1.0f;
        }
        if (this.f31028n == Float.MIN_VALUE) {
            if (this.f31022h == null) {
                this.f31028n = 1.0f;
            } else {
                this.f31028n = m6580f() + ((this.f31022h.floatValue() - this.f31021g) / this.f31015a.m23672e());
            }
        }
        return this.f31028n;
    }

    /* renamed from: d */
    public float m6582d() {
        if (this.f31024j == -3987645.8f) {
            this.f31024j = ((Float) this.f31017c).floatValue();
        }
        return this.f31024j;
    }

    /* renamed from: e */
    public int m6581e() {
        if (this.f31026l == 784923401) {
            this.f31026l = ((Integer) this.f31017c).intValue();
        }
        return this.f31026l;
    }

    /* renamed from: f */
    public float m6580f() {
        C6062k c6062k = this.f31015a;
        if (c6062k == null) {
            return 0.0f;
        }
        if (this.f31027m == Float.MIN_VALUE) {
            this.f31027m = (this.f31021g - c6062k.m23661p()) / this.f31015a.m23672e();
        }
        return this.f31027m;
    }

    /* renamed from: g */
    public float m6579g() {
        if (this.f31023i == -3987645.8f) {
            this.f31023i = ((Float) this.f31016b).floatValue();
        }
        return this.f31023i;
    }

    /* renamed from: h */
    public int m6578h() {
        if (this.f31025k == 784923401) {
            this.f31025k = ((Integer) this.f31016b).intValue();
        }
        return this.f31025k;
    }

    /* renamed from: i */
    public boolean m6577i() {
        return this.f31018d == null && this.f31019e == null && this.f31020f == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f31016b + ", endValue=" + this.f31017c + ", startFrame=" + this.f31021g + ", endFrame=" + this.f31022h + ", interpolator=" + this.f31018d + '}';
    }

    public C12020a(C6062k c6062k, T t, T t2, Interpolator interpolator, Interpolator interpolator2, float f, Float f2) {
        this.f31023i = -3987645.8f;
        this.f31024j = -3987645.8f;
        this.f31025k = 784923401;
        this.f31026l = 784923401;
        this.f31027m = Float.MIN_VALUE;
        this.f31028n = Float.MIN_VALUE;
        this.f31029o = null;
        this.f31030p = null;
        this.f31015a = c6062k;
        this.f31016b = t;
        this.f31017c = t2;
        this.f31018d = null;
        this.f31019e = interpolator;
        this.f31020f = interpolator2;
        this.f31021g = f;
        this.f31022h = f2;
    }

    public C12020a(C6062k c6062k, T t, T t2, Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, float f, Float f2) {
        this.f31023i = -3987645.8f;
        this.f31024j = -3987645.8f;
        this.f31025k = 784923401;
        this.f31026l = 784923401;
        this.f31027m = Float.MIN_VALUE;
        this.f31028n = Float.MIN_VALUE;
        this.f31029o = null;
        this.f31030p = null;
        this.f31015a = c6062k;
        this.f31016b = t;
        this.f31017c = t2;
        this.f31018d = interpolator;
        this.f31019e = interpolator2;
        this.f31020f = interpolator3;
        this.f31021g = f;
        this.f31022h = f2;
    }

    public C12020a(T t) {
        this.f31023i = -3987645.8f;
        this.f31024j = -3987645.8f;
        this.f31025k = 784923401;
        this.f31026l = 784923401;
        this.f31027m = Float.MIN_VALUE;
        this.f31028n = Float.MIN_VALUE;
        this.f31029o = null;
        this.f31030p = null;
        this.f31015a = null;
        this.f31016b = t;
        this.f31017c = t;
        this.f31018d = null;
        this.f31019e = null;
        this.f31020f = null;
        this.f31021g = Float.MIN_VALUE;
        this.f31022h = Float.valueOf(Float.MAX_VALUE);
    }

    private C12020a(T t, T t2) {
        this.f31023i = -3987645.8f;
        this.f31024j = -3987645.8f;
        this.f31025k = 784923401;
        this.f31026l = 784923401;
        this.f31027m = Float.MIN_VALUE;
        this.f31028n = Float.MIN_VALUE;
        this.f31029o = null;
        this.f31030p = null;
        this.f31015a = null;
        this.f31016b = t;
        this.f31017c = t2;
        this.f31018d = null;
        this.f31019e = null;
        this.f31020f = null;
        this.f31021g = Float.MIN_VALUE;
        this.f31022h = Float.valueOf(Float.MAX_VALUE);
    }
}