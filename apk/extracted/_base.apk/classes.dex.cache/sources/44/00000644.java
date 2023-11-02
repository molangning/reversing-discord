package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import androidx.dynamicanimation.animation.AbstractC1466b;
import p053d0.AbstractC5716a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class SpringAnimation extends AbstractC1466b<SpringAnimation> {

    /* renamed from: A */
    private C1485c f3840A;

    /* renamed from: B */
    private float f3841B;

    /* renamed from: C */
    private boolean f3842C;

    public <K> SpringAnimation(K k, AbstractC5716a<K> abstractC5716a) {
        super(k, abstractC5716a);
        this.f3840A = null;
        this.f3841B = Float.MAX_VALUE;
        this.f3842C = false;
    }

    /* renamed from: r */
    private void m36744r() {
        C1485c c1485c = this.f3840A;
        if (c1485c != null) {
            double m36689a = c1485c.m36689a();
            if (m36689a <= this.f3875g) {
                if (m36689a >= this.f3876h) {
                    return;
                }
                throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
            }
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
    }

    @Override // androidx.dynamicanimation.animation.AbstractC1466b
    /* renamed from: b */
    public void mo36731b() {
        super.mo36731b();
        float f = this.f3841B;
        if (f != Float.MAX_VALUE) {
            C1485c c1485c = this.f3840A;
            if (c1485c == null) {
                this.f3840A = new C1485c(f);
            } else {
                c1485c.m36685e(f);
            }
            this.f3841B = Float.MAX_VALUE;
        }
    }

    @Override // androidx.dynamicanimation.animation.AbstractC1466b
    /* renamed from: k */
    public void mo36722k() {
        m36744r();
        this.f3840A.m36683g(m36728e());
        super.mo36722k();
    }

    @Override // androidx.dynamicanimation.animation.AbstractC1466b
    /* renamed from: m */
    boolean mo36720m(long j) {
        if (this.f3842C) {
            float f = this.f3841B;
            if (f != Float.MAX_VALUE) {
                this.f3840A.m36685e(f);
                this.f3841B = Float.MAX_VALUE;
            }
            this.f3870b = this.f3840A.m36689a();
            this.f3869a = 0.0f;
            this.f3842C = false;
            return true;
        }
        if (this.f3841B != Float.MAX_VALUE) {
            long j2 = j / 2;
            AbstractC1466b.C1481o m36682h = this.f3840A.m36682h(this.f3870b, this.f3869a, j2);
            this.f3840A.m36685e(this.f3841B);
            this.f3841B = Float.MAX_VALUE;
            AbstractC1466b.C1481o m36682h2 = this.f3840A.m36682h(m36682h.f3881a, m36682h.f3882b, j2);
            this.f3870b = m36682h2.f3881a;
            this.f3869a = m36682h2.f3882b;
        } else {
            AbstractC1466b.C1481o m36682h3 = this.f3840A.m36682h(this.f3870b, this.f3869a, j);
            this.f3870b = m36682h3.f3881a;
            this.f3869a = m36682h3.f3882b;
        }
        float max = Math.max(this.f3870b, this.f3876h);
        this.f3870b = max;
        float min = Math.min(max, this.f3875g);
        this.f3870b = min;
        if (!m36745q(min, this.f3869a)) {
            return false;
        }
        this.f3870b = this.f3840A.m36689a();
        this.f3869a = 0.0f;
        return true;
    }

    /* renamed from: n */
    public void m36748n(float f) {
        if (m36727f()) {
            this.f3841B = f;
            return;
        }
        if (this.f3840A == null) {
            this.f3840A = new C1485c(f);
        }
        this.f3840A.m36685e(f);
        mo36722k();
    }

    /* renamed from: o */
    public boolean m36747o() {
        return this.f3840A.f3884b > 0.0d;
    }

    /* renamed from: p */
    public C1485c m36746p() {
        return this.f3840A;
    }

    /* renamed from: q */
    boolean m36745q(float f, float f2) {
        return this.f3840A.m36687c(f, f2);
    }

    /* renamed from: s */
    public SpringAnimation m36743s(C1485c c1485c) {
        this.f3840A = c1485c;
        return this;
    }

    /* renamed from: t */
    public void m36742t() {
        if (m36747o()) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f3874f) {
                    this.f3842C = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
    }

    public <K> SpringAnimation(K k, AbstractC5716a<K> abstractC5716a, float f) {
        super(k, abstractC5716a);
        this.f3840A = null;
        this.f3841B = Float.MAX_VALUE;
        this.f3842C = false;
        this.f3840A = new C1485c(f);
    }
}