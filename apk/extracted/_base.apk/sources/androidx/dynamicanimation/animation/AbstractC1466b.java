package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.view.C1365w0;
import androidx.dynamicanimation.animation.AbstractC1466b;
import androidx.dynamicanimation.animation.C1460a;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import p053d0.AbstractC5716a;

/* renamed from: androidx.dynamicanimation.animation.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC1466b<T extends AbstractC1466b<T>> implements C1460a.InterfaceC1462b {

    /* renamed from: m */
    public static final AbstractC1484r f3855m = new C1472f("translationX");

    /* renamed from: n */
    public static final AbstractC1484r f3856n = new C1473g("translationY");

    /* renamed from: o */
    public static final AbstractC1484r f3857o = new C1474h("translationZ");

    /* renamed from: p */
    public static final AbstractC1484r f3858p = new C1475i(ViewProps.SCALE_X);

    /* renamed from: q */
    public static final AbstractC1484r f3859q = new C1476j(ViewProps.SCALE_Y);

    /* renamed from: r */
    public static final AbstractC1484r f3860r = new C1477k(ViewProps.ROTATION);

    /* renamed from: s */
    public static final AbstractC1484r f3861s = new C1478l("rotationX");

    /* renamed from: t */
    public static final AbstractC1484r f3862t = new C1479m("rotationY");

    /* renamed from: u */
    public static final AbstractC1484r f3863u = new C1480n("x");

    /* renamed from: v */
    public static final AbstractC1484r f3864v = new C1467a("y");

    /* renamed from: w */
    public static final AbstractC1484r f3865w = new C1468b("z");

    /* renamed from: x */
    public static final AbstractC1484r f3866x = new C1469c("alpha");

    /* renamed from: y */
    public static final AbstractC1484r f3867y = new C1470d("scrollX");

    /* renamed from: z */
    public static final AbstractC1484r f3868z = new C1471e("scrollY");

    /* renamed from: d */
    final Object f3872d;

    /* renamed from: e */
    final AbstractC5716a f3873e;

    /* renamed from: j */
    private float f3878j;

    /* renamed from: a */
    float f3869a = 0.0f;

    /* renamed from: b */
    float f3870b = Float.MAX_VALUE;

    /* renamed from: c */
    boolean f3871c = false;

    /* renamed from: f */
    boolean f3874f = false;

    /* renamed from: g */
    float f3875g = Float.MAX_VALUE;

    /* renamed from: h */
    float f3876h = -Float.MAX_VALUE;

    /* renamed from: i */
    private long f3877i = 0;

    /* renamed from: k */
    private final ArrayList<InterfaceC1482p> f3879k = new ArrayList<>();

    /* renamed from: l */
    private final ArrayList<InterfaceC1483q> f3880l = new ArrayList<>();

    /* renamed from: androidx.dynamicanimation.animation.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1467a extends AbstractC1484r {
        C1467a(String str) {
            super(str, null);
        }

        @Override // p053d0.AbstractC5716a
        /* renamed from: c */
        public float mo24626a(View view) {
            return view.getY();
        }

        @Override // p053d0.AbstractC5716a
        /* renamed from: d */
        public void mo24625b(View view, float f) {
            view.setY(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1468b extends AbstractC1484r {
        C1468b(String str) {
            super(str, null);
        }

        @Override // p053d0.AbstractC5716a
        /* renamed from: c */
        public float mo24626a(View view) {
            return C1365w0.m37234N(view);
        }

        @Override // p053d0.AbstractC5716a
        /* renamed from: d */
        public void mo24625b(View view, float f) {
            C1365w0.m37233N0(view, f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1469c extends AbstractC1484r {
        C1469c(String str) {
            super(str, null);
        }

        @Override // p053d0.AbstractC5716a
        /* renamed from: c */
        public float mo24626a(View view) {
            return view.getAlpha();
        }

        @Override // p053d0.AbstractC5716a
        /* renamed from: d */
        public void mo24625b(View view, float f) {
            view.setAlpha(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1470d extends AbstractC1484r {
        C1470d(String str) {
            super(str, null);
        }

        @Override // p053d0.AbstractC5716a
        /* renamed from: c */
        public float mo24626a(View view) {
            return view.getScrollX();
        }

        @Override // p053d0.AbstractC5716a
        /* renamed from: d */
        public void mo24625b(View view, float f) {
            view.setScrollX((int) f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1471e extends AbstractC1484r {
        C1471e(String str) {
            super(str, null);
        }

        @Override // p053d0.AbstractC5716a
        /* renamed from: c */
        public float mo24626a(View view) {
            return view.getScrollY();
        }

        @Override // p053d0.AbstractC5716a
        /* renamed from: d */
        public void mo24625b(View view, float f) {
            view.setScrollY((int) f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1472f extends AbstractC1484r {
        C1472f(String str) {
            super(str, null);
        }

        @Override // p053d0.AbstractC5716a
        /* renamed from: c */
        public float mo24626a(View view) {
            return view.getTranslationX();
        }

        @Override // p053d0.AbstractC5716a
        /* renamed from: d */
        public void mo24625b(View view, float f) {
            view.setTranslationX(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1473g extends AbstractC1484r {
        C1473g(String str) {
            super(str, null);
        }

        @Override // p053d0.AbstractC5716a
        /* renamed from: c */
        public float mo24626a(View view) {
            return view.getTranslationY();
        }

        @Override // p053d0.AbstractC5716a
        /* renamed from: d */
        public void mo24625b(View view, float f) {
            view.setTranslationY(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1474h extends AbstractC1484r {
        C1474h(String str) {
            super(str, null);
        }

        @Override // p053d0.AbstractC5716a
        /* renamed from: c */
        public float mo24626a(View view) {
            return C1365w0.m37238L(view);
        }

        @Override // p053d0.AbstractC5716a
        /* renamed from: d */
        public void mo24625b(View view, float f) {
            C1365w0.m37239K0(view, f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1475i extends AbstractC1484r {
        C1475i(String str) {
            super(str, null);
        }

        @Override // p053d0.AbstractC5716a
        /* renamed from: c */
        public float mo24626a(View view) {
            return view.getScaleX();
        }

        @Override // p053d0.AbstractC5716a
        /* renamed from: d */
        public void mo24625b(View view, float f) {
            view.setScaleX(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1476j extends AbstractC1484r {
        C1476j(String str) {
            super(str, null);
        }

        @Override // p053d0.AbstractC5716a
        /* renamed from: c */
        public float mo24626a(View view) {
            return view.getScaleY();
        }

        @Override // p053d0.AbstractC5716a
        /* renamed from: d */
        public void mo24625b(View view, float f) {
            view.setScaleY(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1477k extends AbstractC1484r {
        C1477k(String str) {
            super(str, null);
        }

        @Override // p053d0.AbstractC5716a
        /* renamed from: c */
        public float mo24626a(View view) {
            return view.getRotation();
        }

        @Override // p053d0.AbstractC5716a
        /* renamed from: d */
        public void mo24625b(View view, float f) {
            view.setRotation(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$l */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1478l extends AbstractC1484r {
        C1478l(String str) {
            super(str, null);
        }

        @Override // p053d0.AbstractC5716a
        /* renamed from: c */
        public float mo24626a(View view) {
            return view.getRotationX();
        }

        @Override // p053d0.AbstractC5716a
        /* renamed from: d */
        public void mo24625b(View view, float f) {
            view.setRotationX(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$m */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1479m extends AbstractC1484r {
        C1479m(String str) {
            super(str, null);
        }

        @Override // p053d0.AbstractC5716a
        /* renamed from: c */
        public float mo24626a(View view) {
            return view.getRotationY();
        }

        @Override // p053d0.AbstractC5716a
        /* renamed from: d */
        public void mo24625b(View view, float f) {
            view.setRotationY(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$n */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1480n extends AbstractC1484r {
        C1480n(String str) {
            super(str, null);
        }

        @Override // p053d0.AbstractC5716a
        /* renamed from: c */
        public float mo24626a(View view) {
            return view.getX();
        }

        @Override // p053d0.AbstractC5716a
        /* renamed from: d */
        public void mo24625b(View view, float f) {
            view.setX(f);
        }
    }

    /* renamed from: androidx.dynamicanimation.animation.b$o */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1481o {

        /* renamed from: a */
        float f3881a;

        /* renamed from: b */
        float f3882b;
    }

    /* renamed from: androidx.dynamicanimation.animation.b$p */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1482p {
        /* renamed from: a */
        void m36691a(AbstractC1466b abstractC1466b, boolean z, float f, float f2);
    }

    /* renamed from: androidx.dynamicanimation.animation.b$q */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1483q {
        /* renamed from: a */
        void m36690a(AbstractC1466b abstractC1466b, float f, float f2);
    }

    /* renamed from: androidx.dynamicanimation.animation.b$r */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AbstractC1484r extends AbstractC5716a<View> {
        /* synthetic */ AbstractC1484r(String str, C1472f c1472f) {
            this(str);
        }

        private AbstractC1484r(String str) {
            super(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public <K> AbstractC1466b(K k, AbstractC5716a<K> abstractC5716a) {
        this.f3872d = k;
        this.f3873e = abstractC5716a;
        if (abstractC5716a != f3860r && abstractC5716a != f3861s && abstractC5716a != f3862t) {
            if (abstractC5716a == f3866x) {
                this.f3878j = 0.00390625f;
                return;
            } else if (abstractC5716a != f3858p && abstractC5716a != f3859q) {
                this.f3878j = 1.0f;
                return;
            } else {
                this.f3878j = 0.00390625f;
                return;
            }
        }
        this.f3878j = 0.1f;
    }

    /* renamed from: c */
    private void m36730c(boolean z) {
        this.f3874f = false;
        C1460a.m36738d().m36735g(this);
        this.f3877i = 0L;
        this.f3871c = false;
        for (int i = 0; i < this.f3879k.size(); i++) {
            if (this.f3879k.get(i) != null) {
                this.f3879k.get(i).m36691a(this, z, this.f3870b, this.f3869a);
            }
        }
        m36726g(this.f3879k);
    }

    /* renamed from: d */
    private float m36729d() {
        return this.f3873e.mo24626a(this.f3872d);
    }

    /* renamed from: g */
    private static <T> void m36726g(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* renamed from: l */
    private void m36721l() {
        if (!this.f3874f) {
            this.f3874f = true;
            if (!this.f3871c) {
                this.f3870b = m36729d();
            }
            float f = this.f3870b;
            if (f <= this.f3875g && f >= this.f3876h) {
                C1460a.m36738d().m36741a(this, 0L);
                return;
            }
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
    }

    @Override // androidx.dynamicanimation.animation.C1460a.InterfaceC1462b
    /* renamed from: a */
    public boolean mo36732a(long j) {
        long j2 = this.f3877i;
        if (j2 == 0) {
            this.f3877i = j;
            m36725h(this.f3870b);
            return false;
        }
        this.f3877i = j;
        boolean mo36720m = mo36720m(j - j2);
        float min = Math.min(this.f3870b, this.f3875g);
        this.f3870b = min;
        float max = Math.max(min, this.f3876h);
        this.f3870b = max;
        m36725h(max);
        if (mo36720m) {
            m36730c(false);
        }
        return mo36720m;
    }

    /* renamed from: b */
    public void mo36731b() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.f3874f) {
                m36730c(true);
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be canceled on the main thread");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public float m36728e() {
        return this.f3878j * 0.75f;
    }

    /* renamed from: f */
    public boolean m36727f() {
        return this.f3874f;
    }

    /* renamed from: h */
    void m36725h(float f) {
        this.f3873e.mo24625b(this.f3872d, f);
        for (int i = 0; i < this.f3880l.size(); i++) {
            if (this.f3880l.get(i) != null) {
                this.f3880l.get(i).m36690a(this, this.f3870b, this.f3869a);
            }
        }
        m36726g(this.f3880l);
    }

    /* renamed from: i */
    public T m36724i(float f) {
        this.f3870b = f;
        this.f3871c = true;
        return this;
    }

    /* renamed from: j */
    public T m36723j(float f) {
        this.f3869a = f;
        return this;
    }

    /* renamed from: k */
    public void mo36722k() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (!this.f3874f) {
                m36721l();
                return;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    }

    /* renamed from: m */
    abstract boolean mo36720m(long j);
}
