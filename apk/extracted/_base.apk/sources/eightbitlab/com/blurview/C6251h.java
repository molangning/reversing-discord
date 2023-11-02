package eightbitlab.com.blurview;

/* renamed from: eightbitlab.com.blurview.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6251h {

    /* renamed from: a */
    private final float f17695a;

    /* renamed from: eightbitlab.com.blurview.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static class C6252a {

        /* renamed from: a */
        final int f17696a;

        /* renamed from: b */
        final int f17697b;

        /* renamed from: c */
        final float f17698c;

        C6252a(int i, int i2, float f) {
            this.f17696a = i;
            this.f17697b = i2;
            this.f17698c = f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C6252a c6252a = (C6252a) obj;
            if (this.f17696a == c6252a.f17696a && this.f17697b == c6252a.f17697b && Float.compare(c6252a.f17698c, this.f17698c) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int i2 = ((this.f17696a * 31) + this.f17697b) * 31;
            float f = this.f17698c;
            if (f != 0.0f) {
                i = Float.floatToIntBits(f);
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public String toString() {
            return "Size{width=" + this.f17696a + ", height=" + this.f17697b + ", scaleFactor=" + this.f17698c + '}';
        }
    }

    public C6251h(float f) {
        this.f17695a = f;
    }

    /* renamed from: a */
    private int m23152a(float f) {
        return (int) Math.ceil(f / this.f17695a);
    }

    /* renamed from: c */
    private int m23150c(int i) {
        int i2 = i % 64;
        return i2 == 0 ? i : (i - i2) + 64;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean m23151b(int i, int i2) {
        return m23152a((float) i2) == 0 || m23152a((float) i) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public C6252a m23149d(int i, int i2) {
        float f;
        float f2 = i;
        int m23150c = m23150c(m23152a(f2));
        return new C6252a(m23150c, (int) Math.ceil(i2 / f), f2 / m23150c);
    }
}
