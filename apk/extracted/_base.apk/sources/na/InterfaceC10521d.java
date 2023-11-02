package na;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import ua.C12941a;

/* renamed from: na.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC10521d {

    /* renamed from: na.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C10523b implements TypeEvaluator<C10526e> {

        /* renamed from: b */
        public static final TypeEvaluator<C10526e> f27497b = new C10523b();

        /* renamed from: a */
        private final C10526e f27498a = new C10526e();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public C10526e evaluate(float f, C10526e c10526e, C10526e c10526e2) {
            this.f27498a.m11321a(C12941a.m3639c(c10526e.f27501a, c10526e2.f27501a, f), C12941a.m3639c(c10526e.f27502b, c10526e2.f27502b, f), C12941a.m3639c(c10526e.f27503c, c10526e2.f27503c, f));
            return this.f27498a;
        }
    }

    /* renamed from: na.d$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C10524c extends Property<InterfaceC10521d, C10526e> {

        /* renamed from: a */
        public static final Property<InterfaceC10521d, C10526e> f27499a = new C10524c("circularReveal");

        private C10524c(String str) {
            super(C10526e.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public C10526e get(InterfaceC10521d interfaceC10521d) {
            return interfaceC10521d.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(InterfaceC10521d interfaceC10521d, C10526e c10526e) {
            interfaceC10521d.setRevealInfo(c10526e);
        }
    }

    /* renamed from: na.d$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C10525d extends Property<InterfaceC10521d, Integer> {

        /* renamed from: a */
        public static final Property<InterfaceC10521d, Integer> f27500a = new C10525d("circularRevealScrimColor");

        private C10525d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Integer get(InterfaceC10521d interfaceC10521d) {
            return Integer.valueOf(interfaceC10521d.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(InterfaceC10521d interfaceC10521d, Integer num) {
            interfaceC10521d.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: na.d$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C10526e {

        /* renamed from: a */
        public float f27501a;

        /* renamed from: b */
        public float f27502b;

        /* renamed from: c */
        public float f27503c;

        private C10526e() {
        }

        /* renamed from: a */
        public void m11321a(float f, float f2, float f3) {
            this.f27501a = f;
            this.f27502b = f2;
            this.f27503c = f3;
        }

        public C10526e(float f, float f2, float f3) {
            this.f27501a = f;
            this.f27502b = f2;
            this.f27503c = f3;
        }
    }

    /* renamed from: a */
    void mo9194a();

    /* renamed from: b */
    void mo9193b();

    int getCircularRevealScrimColor();

    C10526e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C10526e c10526e);
}
