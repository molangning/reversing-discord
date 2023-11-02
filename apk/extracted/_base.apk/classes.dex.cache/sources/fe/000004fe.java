package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.Insets;
import androidx.core.util.C1134c;
import androidx.core.util.C1138f;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class WindowInsetsCompat {

    /* renamed from: b */
    public static final WindowInsetsCompat f3540b;

    /* renamed from: a */
    private final C1162l f3541a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: androidx.core.view.WindowInsetsCompat$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1151a {

        /* renamed from: a */
        private static Field f3542a;

        /* renamed from: b */
        private static Field f3543b;

        /* renamed from: c */
        private static Field f3544c;

        /* renamed from: d */
        private static boolean f3545d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f3542a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f3543b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f3544c = declaredField3;
                declaredField3.setAccessible(true);
                f3545d = true;
            } catch (ReflectiveOperationException e) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }

        /* renamed from: a */
        public static WindowInsetsCompat m37720a(View view) {
            if (f3545d && view.isAttachedToWindow()) {
                try {
                    Object obj = f3542a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f3543b.get(obj);
                        Rect rect2 = (Rect) f3544c.get(obj);
                        if (rect != null && rect2 != null) {
                            WindowInsetsCompat m37719a = new C1152b().m37717c(Insets.m38191c(rect)).m37716d(Insets.m38191c(rect2)).m37719a();
                            m37719a.m37725v(m37719a);
                            m37719a.m37743d(view.getRootView());
                            return m37719a;
                        }
                    }
                } catch (IllegalAccessException e) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.WindowInsetsCompat$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1155e extends C1154d {
        C1155e() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1156f
        /* renamed from: c */
        void mo37712c(int i, Insets insets) {
            this.f3553c.setInsets(C1164n.m37674a(i), insets.m38189e());
        }

        C1155e(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1156f {

        /* renamed from: a */
        private final WindowInsetsCompat f3554a;

        /* renamed from: b */
        Insets[] f3555b;

        C1156f() {
            this(new WindowInsetsCompat((WindowInsetsCompat) null));
        }

        /* renamed from: a */
        protected final void m37714a() {
            Insets[] insetsArr = this.f3555b;
            if (insetsArr != null) {
                Insets insets = insetsArr[C1163m.m37679c(1)];
                Insets insets2 = this.f3555b[C1163m.m37679c(2)];
                if (insets2 == null) {
                    insets2 = this.f3554a.m37741f(2);
                }
                if (insets == null) {
                    insets = this.f3554a.m37741f(1);
                }
                mo37708g(Insets.m38193a(insets, insets2));
                Insets insets3 = this.f3555b[C1163m.m37679c(16)];
                if (insets3 != null) {
                    mo37709f(insets3);
                }
                Insets insets4 = this.f3555b[C1163m.m37679c(32)];
                if (insets4 != null) {
                    mo37711d(insets4);
                }
                Insets insets5 = this.f3555b[C1163m.m37679c(64)];
                if (insets5 != null) {
                    mo37707h(insets5);
                }
            }
        }

        /* renamed from: b */
        WindowInsetsCompat mo37713b() {
            throw null;
        }

        /* renamed from: c */
        void mo37712c(int i, Insets insets) {
            if (this.f3555b == null) {
                this.f3555b = new Insets[9];
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.f3555b[C1163m.m37679c(i2)] = insets;
                }
            }
        }

        /* renamed from: d */
        void mo37711d(Insets insets) {
        }

        /* renamed from: e */
        void mo37710e(Insets insets) {
            throw null;
        }

        /* renamed from: f */
        void mo37709f(Insets insets) {
        }

        /* renamed from: g */
        void mo37708g(Insets insets) {
            throw null;
        }

        /* renamed from: h */
        void mo37707h(Insets insets) {
        }

        C1156f(WindowInsetsCompat windowInsetsCompat) {
            this.f3554a = windowInsetsCompat;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.WindowInsetsCompat$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1159i extends C1158h {
        C1159i(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1162l
        /* renamed from: a */
        WindowInsetsCompat mo37701a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f3561c.consumeDisplayCutout();
            return WindowInsetsCompat.m37722y(consumeDisplayCutout);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1157g, androidx.core.view.WindowInsetsCompat.C1162l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1159i)) {
                return false;
            }
            C1159i c1159i = (C1159i) obj;
            if (Objects.equals(this.f3561c, c1159i.f3561c) && Objects.equals(this.f3565g, c1159i.f3565g)) {
                return true;
            }
            return false;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1162l
        /* renamed from: f */
        C1330s mo37696f() {
            DisplayCutout displayCutout;
            displayCutout = this.f3561c.getDisplayCutout();
            return C1330s.m37332e(displayCutout);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1162l
        public int hashCode() {
            return this.f3561c.hashCode();
        }

        C1159i(WindowInsetsCompat windowInsetsCompat, C1159i c1159i) {
            super(windowInsetsCompat, c1159i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.WindowInsetsCompat$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1161k extends C1160j {

        /* renamed from: q */
        static final WindowInsetsCompat f3570q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f3570q = WindowInsetsCompat.m37722y(windowInsets);
        }

        C1161k(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1157g, androidx.core.view.WindowInsetsCompat.C1162l
        /* renamed from: d */
        final void mo37698d(View view) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1157g, androidx.core.view.WindowInsetsCompat.C1162l
        /* renamed from: g */
        public Insets mo37695g(int i) {
            android.graphics.Insets insets;
            insets = this.f3561c.getInsets(C1164n.m37674a(i));
            return Insets.m38190d(insets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1157g, androidx.core.view.WindowInsetsCompat.C1162l
        /* renamed from: h */
        public Insets mo37694h(int i) {
            android.graphics.Insets insetsIgnoringVisibility;
            insetsIgnoringVisibility = this.f3561c.getInsetsIgnoringVisibility(C1164n.m37674a(i));
            return Insets.m38190d(insetsIgnoringVisibility);
        }

        C1161k(WindowInsetsCompat windowInsetsCompat, C1161k c1161k) {
            super(windowInsetsCompat, c1161k);
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$l */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1162l {

        /* renamed from: b */
        static final WindowInsetsCompat f3571b = new C1152b().m37719a().m37746a().m37745b().m37744c();

        /* renamed from: a */
        final WindowInsetsCompat f3572a;

        C1162l(WindowInsetsCompat windowInsetsCompat) {
            this.f3572a = windowInsetsCompat;
        }

        /* renamed from: a */
        WindowInsetsCompat mo37701a() {
            return this.f3572a;
        }

        /* renamed from: b */
        WindowInsetsCompat mo37700b() {
            return this.f3572a;
        }

        /* renamed from: c */
        WindowInsetsCompat mo37699c() {
            return this.f3572a;
        }

        /* renamed from: d */
        void mo37698d(View view) {
        }

        /* renamed from: e */
        void mo37697e(WindowInsetsCompat windowInsetsCompat) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1162l)) {
                return false;
            }
            C1162l c1162l = (C1162l) obj;
            if (mo37686p() == c1162l.mo37686p() && mo37687o() == c1162l.mo37687o() && C1134c.m37835a(mo37690l(), c1162l.mo37690l()) && C1134c.m37835a(mo37692j(), c1162l.mo37692j()) && C1134c.m37835a(mo37696f(), c1162l.mo37696f())) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        C1330s mo37696f() {
            return null;
        }

        /* renamed from: g */
        Insets mo37695g(int i) {
            return Insets.f3339e;
        }

        /* renamed from: h */
        Insets mo37694h(int i) {
            if ((i & 8) == 0) {
                return Insets.f3339e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return C1134c.m37834b(Boolean.valueOf(mo37686p()), Boolean.valueOf(mo37687o()), mo37690l(), mo37692j(), mo37696f());
        }

        /* renamed from: i */
        Insets mo37693i() {
            return mo37690l();
        }

        /* renamed from: j */
        Insets mo37692j() {
            return Insets.f3339e;
        }

        /* renamed from: k */
        Insets mo37691k() {
            return mo37690l();
        }

        /* renamed from: l */
        Insets mo37690l() {
            return Insets.f3339e;
        }

        /* renamed from: m */
        Insets mo37689m() {
            return mo37690l();
        }

        /* renamed from: n */
        WindowInsetsCompat mo37688n(int i, int i2, int i3, int i4) {
            return f3571b;
        }

        /* renamed from: o */
        boolean mo37687o() {
            return false;
        }

        /* renamed from: p */
        boolean mo37686p() {
            return false;
        }

        /* renamed from: q */
        public void mo37685q(Insets[] insetsArr) {
        }

        /* renamed from: r */
        void mo37684r(Insets insets) {
        }

        /* renamed from: s */
        void mo37683s(WindowInsetsCompat windowInsetsCompat) {
        }

        /* renamed from: t */
        public void mo37682t(Insets insets) {
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$m */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1163m {
        /* renamed from: a */
        public static int m37681a() {
            return 128;
        }

        /* renamed from: b */
        public static int m37680b() {
            return 8;
        }

        /* renamed from: c */
        static int m37679c(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 8) {
                            if (i != 16) {
                                if (i != 32) {
                                    if (i != 64) {
                                        if (i != 128) {
                                            if (i == 256) {
                                                return 8;
                                            }
                                            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
                                        }
                                        return 7;
                                    }
                                    return 6;
                                }
                                return 5;
                            }
                            return 4;
                        }
                        return 3;
                    }
                    return 2;
                }
                return 1;
            }
            return 0;
        }

        /* renamed from: d */
        public static int m37678d() {
            return 32;
        }

        /* renamed from: e */
        public static int m37677e() {
            return 2;
        }

        /* renamed from: f */
        public static int m37676f() {
            return 1;
        }

        /* renamed from: g */
        public static int m37675g() {
            return 7;
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$n */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static final class C1164n {
        /* renamed from: a */
        static int m37674a(int i) {
            int statusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 4) {
                                if (i3 != 8) {
                                    if (i3 != 16) {
                                        if (i3 != 32) {
                                            if (i3 != 64) {
                                                if (i3 == 128) {
                                                    statusBars = WindowInsets.Type.displayCutout();
                                                }
                                            } else {
                                                statusBars = WindowInsets.Type.tappableElement();
                                            }
                                        } else {
                                            statusBars = WindowInsets.Type.mandatorySystemGestures();
                                        }
                                    } else {
                                        statusBars = WindowInsets.Type.systemGestures();
                                    }
                                } else {
                                    statusBars = WindowInsets.Type.ime();
                                }
                            } else {
                                statusBars = WindowInsets.Type.captionBar();
                            }
                        } else {
                            statusBars = WindowInsets.Type.navigationBars();
                        }
                    } else {
                        statusBars = WindowInsets.Type.statusBars();
                    }
                    i2 |= statusBars;
                }
            }
            return i2;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f3540b = C1161k.f3570q;
        } else {
            f3540b = C1162l.f3571b;
        }
    }

    private WindowInsetsCompat(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f3541a = new C1161k(this, windowInsets);
        } else if (i >= 29) {
            this.f3541a = new C1160j(this, windowInsets);
        } else if (i >= 28) {
            this.f3541a = new C1159i(this, windowInsets);
        } else {
            this.f3541a = new C1158h(this, windowInsets);
        }
    }

    /* renamed from: q */
    public static Insets m37730q(Insets insets, int i, int i2, int i3, int i4) {
        int max = Math.max(0, insets.f3340a - i);
        int max2 = Math.max(0, insets.f3341b - i2);
        int max3 = Math.max(0, insets.f3342c - i3);
        int max4 = Math.max(0, insets.f3343d - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return insets;
        }
        return Insets.m38192b(max, max2, max3, max4);
    }

    /* renamed from: y */
    public static WindowInsetsCompat m37722y(WindowInsets windowInsets) {
        return m37721z(windowInsets, null);
    }

    /* renamed from: z */
    public static WindowInsetsCompat m37721z(WindowInsets windowInsets, View view) {
        WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat((WindowInsets) C1138f.m37824f(windowInsets));
        if (view != null && C1365w0.m37225T(view)) {
            windowInsetsCompat.m37725v(C1365w0.m37244I(view));
            windowInsetsCompat.m37743d(view.getRootView());
        }
        return windowInsetsCompat;
    }

    @Deprecated
    /* renamed from: a */
    public WindowInsetsCompat m37746a() {
        return this.f3541a.mo37701a();
    }

    @Deprecated
    /* renamed from: b */
    public WindowInsetsCompat m37745b() {
        return this.f3541a.mo37700b();
    }

    @Deprecated
    /* renamed from: c */
    public WindowInsetsCompat m37744c() {
        return this.f3541a.mo37699c();
    }

    /* renamed from: d */
    public void m37743d(View view) {
        this.f3541a.mo37698d(view);
    }

    /* renamed from: e */
    public C1330s m37742e() {
        return this.f3541a.mo37696f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WindowInsetsCompat)) {
            return false;
        }
        return C1134c.m37835a(this.f3541a, ((WindowInsetsCompat) obj).f3541a);
    }

    /* renamed from: f */
    public Insets m37741f(int i) {
        return this.f3541a.mo37695g(i);
    }

    /* renamed from: g */
    public Insets m37740g(int i) {
        return this.f3541a.mo37694h(i);
    }

    @Deprecated
    /* renamed from: h */
    public int m37739h() {
        return this.f3541a.mo37692j().f3343d;
    }

    public int hashCode() {
        C1162l c1162l = this.f3541a;
        if (c1162l == null) {
            return 0;
        }
        return c1162l.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public int m37738i() {
        return this.f3541a.mo37692j().f3341b;
    }

    @Deprecated
    /* renamed from: j */
    public Insets m37737j() {
        return this.f3541a.mo37692j();
    }

    @Deprecated
    /* renamed from: k */
    public Insets m37736k() {
        return this.f3541a.mo37691k();
    }

    @Deprecated
    /* renamed from: l */
    public int m37735l() {
        return this.f3541a.mo37690l().f3343d;
    }

    @Deprecated
    /* renamed from: m */
    public int m37734m() {
        return this.f3541a.mo37690l().f3340a;
    }

    @Deprecated
    /* renamed from: n */
    public int m37733n() {
        return this.f3541a.mo37690l().f3342c;
    }

    @Deprecated
    /* renamed from: o */
    public int m37732o() {
        return this.f3541a.mo37690l().f3341b;
    }

    /* renamed from: p */
    public WindowInsetsCompat m37731p(int i, int i2, int i3, int i4) {
        return this.f3541a.mo37688n(i, i2, i3, i4);
    }

    /* renamed from: r */
    public boolean m37729r() {
        return this.f3541a.mo37687o();
    }

    @Deprecated
    /* renamed from: s */
    public WindowInsetsCompat m37728s(int i, int i2, int i3, int i4) {
        return new C1152b(this).m37716d(Insets.m38192b(i, i2, i3, i4)).m37719a();
    }

    /* renamed from: t */
    void m37727t(Insets[] insetsArr) {
        this.f3541a.mo37685q(insetsArr);
    }

    /* renamed from: u */
    void m37726u(Insets insets) {
        this.f3541a.mo37684r(insets);
    }

    /* renamed from: v */
    public void m37725v(WindowInsetsCompat windowInsetsCompat) {
        this.f3541a.mo37683s(windowInsetsCompat);
    }

    /* renamed from: w */
    void m37724w(Insets insets) {
        this.f3541a.mo37682t(insets);
    }

    /* renamed from: x */
    public WindowInsets m37723x() {
        C1162l c1162l = this.f3541a;
        if (c1162l instanceof C1157g) {
            return ((C1157g) c1162l).f3561c;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.WindowInsetsCompat$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1153c extends C1156f {

        /* renamed from: e */
        private static Field f3547e = null;

        /* renamed from: f */
        private static boolean f3548f = false;

        /* renamed from: g */
        private static Constructor<WindowInsets> f3549g = null;

        /* renamed from: h */
        private static boolean f3550h = false;

        /* renamed from: c */
        private WindowInsets f3551c;

        /* renamed from: d */
        private Insets f3552d;

        C1153c() {
            this.f3551c = m37715i();
        }

        /* renamed from: i */
        private static WindowInsets m37715i() {
            if (!f3548f) {
                try {
                    f3547e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f3548f = true;
            }
            Field field = f3547e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f3550h) {
                try {
                    f3549g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f3550h = true;
            }
            Constructor<WindowInsets> constructor = f3549g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1156f
        /* renamed from: b */
        WindowInsetsCompat mo37713b() {
            m37714a();
            WindowInsetsCompat m37722y = WindowInsetsCompat.m37722y(this.f3551c);
            m37722y.m37727t(this.f3555b);
            m37722y.m37724w(this.f3552d);
            return m37722y;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1156f
        /* renamed from: e */
        void mo37710e(Insets insets) {
            this.f3552d = insets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1156f
        /* renamed from: g */
        void mo37708g(Insets insets) {
            WindowInsets windowInsets = this.f3551c;
            if (windowInsets != null) {
                this.f3551c = windowInsets.replaceSystemWindowInsets(insets.f3340a, insets.f3341b, insets.f3342c, insets.f3343d);
            }
        }

        C1153c(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            this.f3551c = windowInsetsCompat.m37723x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.WindowInsetsCompat$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1154d extends C1156f {

        /* renamed from: c */
        final WindowInsets.Builder f3553c;

        C1154d() {
            this.f3553c = new WindowInsets.Builder();
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1156f
        /* renamed from: b */
        WindowInsetsCompat mo37713b() {
            WindowInsets build;
            m37714a();
            build = this.f3553c.build();
            WindowInsetsCompat m37722y = WindowInsetsCompat.m37722y(build);
            m37722y.m37727t(this.f3555b);
            return m37722y;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1156f
        /* renamed from: d */
        void mo37711d(Insets insets) {
            this.f3553c.setMandatorySystemGestureInsets(insets.m38189e());
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1156f
        /* renamed from: e */
        void mo37710e(Insets insets) {
            this.f3553c.setStableInsets(insets.m38189e());
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1156f
        /* renamed from: f */
        void mo37709f(Insets insets) {
            this.f3553c.setSystemGestureInsets(insets.m38189e());
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1156f
        /* renamed from: g */
        void mo37708g(Insets insets) {
            this.f3553c.setSystemWindowInsets(insets.m38189e());
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1156f
        /* renamed from: h */
        void mo37707h(Insets insets) {
            this.f3553c.setTappableElementInsets(insets.m38189e());
        }

        C1154d(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            WindowInsets.Builder builder;
            WindowInsets m37723x = windowInsetsCompat.m37723x();
            if (m37723x != null) {
                builder = new WindowInsets.Builder(m37723x);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f3553c = builder;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.WindowInsetsCompat$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1158h extends C1157g {

        /* renamed from: m */
        private Insets f3566m;

        C1158h(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.f3566m = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1162l
        /* renamed from: b */
        WindowInsetsCompat mo37700b() {
            return WindowInsetsCompat.m37722y(this.f3561c.consumeStableInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1162l
        /* renamed from: c */
        WindowInsetsCompat mo37699c() {
            return WindowInsetsCompat.m37722y(this.f3561c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1162l
        /* renamed from: j */
        final Insets mo37692j() {
            if (this.f3566m == null) {
                this.f3566m = Insets.m38192b(this.f3561c.getStableInsetLeft(), this.f3561c.getStableInsetTop(), this.f3561c.getStableInsetRight(), this.f3561c.getStableInsetBottom());
            }
            return this.f3566m;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1162l
        /* renamed from: o */
        boolean mo37687o() {
            return this.f3561c.isConsumed();
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1162l
        /* renamed from: t */
        public void mo37682t(Insets insets) {
            this.f3566m = insets;
        }

        C1158h(WindowInsetsCompat windowInsetsCompat, C1158h c1158h) {
            super(windowInsetsCompat, c1158h);
            this.f3566m = null;
            this.f3566m = c1158h.f3566m;
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1157g extends C1162l {

        /* renamed from: h */
        private static boolean f3556h = false;

        /* renamed from: i */
        private static Method f3557i;

        /* renamed from: j */
        private static Class<?> f3558j;

        /* renamed from: k */
        private static Field f3559k;

        /* renamed from: l */
        private static Field f3560l;

        /* renamed from: c */
        final WindowInsets f3561c;

        /* renamed from: d */
        private Insets[] f3562d;

        /* renamed from: e */
        private Insets f3563e;

        /* renamed from: f */
        private WindowInsetsCompat f3564f;

        /* renamed from: g */
        Insets f3565g;

        C1157g(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.f3563e = null;
            this.f3561c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: u */
        private Insets m37706u(int i, boolean z) {
            Insets insets = Insets.f3339e;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    insets = Insets.m38193a(insets, m37705v(i2, z));
                }
            }
            return insets;
        }

        /* renamed from: w */
        private Insets m37704w() {
            WindowInsetsCompat windowInsetsCompat = this.f3564f;
            if (windowInsetsCompat != null) {
                return windowInsetsCompat.m37737j();
            }
            return Insets.f3339e;
        }

        /* renamed from: x */
        private Insets m37703x(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f3556h) {
                    m37702y();
                }
                Method method = f3557i;
                if (method != null && f3558j != null && f3559k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f3559k.get(f3560l.get(invoke));
                        if (rect == null) {
                            return null;
                        }
                        return Insets.m38191c(rect);
                    } catch (ReflectiveOperationException e) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        /* renamed from: y */
        private static void m37702y() {
            try {
                f3557i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f3558j = cls;
                f3559k = cls.getDeclaredField("mVisibleInsets");
                f3560l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f3559k.setAccessible(true);
                f3560l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            f3556h = true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1162l
        /* renamed from: d */
        void mo37698d(View view) {
            Insets m37703x = m37703x(view);
            if (m37703x == null) {
                m37703x = Insets.f3339e;
            }
            mo37684r(m37703x);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1162l
        /* renamed from: e */
        void mo37697e(WindowInsetsCompat windowInsetsCompat) {
            windowInsetsCompat.m37725v(this.f3564f);
            windowInsetsCompat.m37726u(this.f3565g);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1162l
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f3565g, ((C1157g) obj).f3565g);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1162l
        /* renamed from: g */
        public Insets mo37695g(int i) {
            return m37706u(i, false);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1162l
        /* renamed from: h */
        public Insets mo37694h(int i) {
            return m37706u(i, true);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1162l
        /* renamed from: l */
        final Insets mo37690l() {
            if (this.f3563e == null) {
                this.f3563e = Insets.m38192b(this.f3561c.getSystemWindowInsetLeft(), this.f3561c.getSystemWindowInsetTop(), this.f3561c.getSystemWindowInsetRight(), this.f3561c.getSystemWindowInsetBottom());
            }
            return this.f3563e;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1162l
        /* renamed from: n */
        WindowInsetsCompat mo37688n(int i, int i2, int i3, int i4) {
            C1152b c1152b = new C1152b(WindowInsetsCompat.m37722y(this.f3561c));
            c1152b.m37716d(WindowInsetsCompat.m37730q(mo37690l(), i, i2, i3, i4));
            c1152b.m37717c(WindowInsetsCompat.m37730q(mo37692j(), i, i2, i3, i4));
            return c1152b.m37719a();
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1162l
        /* renamed from: p */
        boolean mo37686p() {
            return this.f3561c.isRound();
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1162l
        /* renamed from: q */
        public void mo37685q(Insets[] insetsArr) {
            this.f3562d = insetsArr;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1162l
        /* renamed from: r */
        void mo37684r(Insets insets) {
            this.f3565g = insets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1162l
        /* renamed from: s */
        void mo37683s(WindowInsetsCompat windowInsetsCompat) {
            this.f3564f = windowInsetsCompat;
        }

        /* renamed from: v */
        protected Insets m37705v(int i, boolean z) {
            int i2;
            C1330s mo37696f;
            if (i != 1) {
                Insets insets = null;
                if (i != 2) {
                    if (i != 8) {
                        if (i != 16) {
                            if (i != 32) {
                                if (i != 64) {
                                    if (i != 128) {
                                        return Insets.f3339e;
                                    }
                                    WindowInsetsCompat windowInsetsCompat = this.f3564f;
                                    if (windowInsetsCompat != null) {
                                        mo37696f = windowInsetsCompat.m37742e();
                                    } else {
                                        mo37696f = mo37696f();
                                    }
                                    if (mo37696f != null) {
                                        return Insets.m38192b(mo37696f.m37335b(), mo37696f.m37333d(), mo37696f.m37334c(), mo37696f.m37336a());
                                    }
                                    return Insets.f3339e;
                                }
                                return mo37689m();
                            }
                            return mo37693i();
                        }
                        return mo37691k();
                    }
                    Insets[] insetsArr = this.f3562d;
                    if (insetsArr != null) {
                        insets = insetsArr[C1163m.m37679c(8)];
                    }
                    if (insets != null) {
                        return insets;
                    }
                    Insets mo37690l = mo37690l();
                    Insets m37704w = m37704w();
                    int i3 = mo37690l.f3343d;
                    if (i3 > m37704w.f3343d) {
                        return Insets.m38192b(0, 0, 0, i3);
                    }
                    Insets insets2 = this.f3565g;
                    if (insets2 != null && !insets2.equals(Insets.f3339e) && (i2 = this.f3565g.f3343d) > m37704w.f3343d) {
                        return Insets.m38192b(0, 0, 0, i2);
                    }
                    return Insets.f3339e;
                } else if (z) {
                    Insets m37704w2 = m37704w();
                    Insets mo37692j = mo37692j();
                    return Insets.m38192b(Math.max(m37704w2.f3340a, mo37692j.f3340a), 0, Math.max(m37704w2.f3342c, mo37692j.f3342c), Math.max(m37704w2.f3343d, mo37692j.f3343d));
                } else {
                    Insets mo37690l2 = mo37690l();
                    WindowInsetsCompat windowInsetsCompat2 = this.f3564f;
                    if (windowInsetsCompat2 != null) {
                        insets = windowInsetsCompat2.m37737j();
                    }
                    int i4 = mo37690l2.f3343d;
                    if (insets != null) {
                        i4 = Math.min(i4, insets.f3343d);
                    }
                    return Insets.m38192b(mo37690l2.f3340a, 0, mo37690l2.f3342c, i4);
                }
            } else if (z) {
                return Insets.m38192b(0, Math.max(m37704w().f3341b, mo37690l().f3341b), 0, 0);
            } else {
                return Insets.m38192b(0, mo37690l().f3341b, 0, 0);
            }
        }

        C1157g(WindowInsetsCompat windowInsetsCompat, C1157g c1157g) {
            this(windowInsetsCompat, new WindowInsets(c1157g.f3561c));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.WindowInsetsCompat$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1160j extends C1159i {

        /* renamed from: n */
        private Insets f3567n;

        /* renamed from: o */
        private Insets f3568o;

        /* renamed from: p */
        private Insets f3569p;

        C1160j(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.f3567n = null;
            this.f3568o = null;
            this.f3569p = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1162l
        /* renamed from: i */
        Insets mo37693i() {
            android.graphics.Insets mandatorySystemGestureInsets;
            if (this.f3568o == null) {
                mandatorySystemGestureInsets = this.f3561c.getMandatorySystemGestureInsets();
                this.f3568o = Insets.m38190d(mandatorySystemGestureInsets);
            }
            return this.f3568o;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1162l
        /* renamed from: k */
        Insets mo37691k() {
            android.graphics.Insets systemGestureInsets;
            if (this.f3567n == null) {
                systemGestureInsets = this.f3561c.getSystemGestureInsets();
                this.f3567n = Insets.m38190d(systemGestureInsets);
            }
            return this.f3567n;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1162l
        /* renamed from: m */
        Insets mo37689m() {
            android.graphics.Insets tappableElementInsets;
            if (this.f3569p == null) {
                tappableElementInsets = this.f3561c.getTappableElementInsets();
                this.f3569p = Insets.m38190d(tappableElementInsets);
            }
            return this.f3569p;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1157g, androidx.core.view.WindowInsetsCompat.C1162l
        /* renamed from: n */
        WindowInsetsCompat mo37688n(int i, int i2, int i3, int i4) {
            WindowInsets inset;
            inset = this.f3561c.inset(i, i2, i3, i4);
            return WindowInsetsCompat.m37722y(inset);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C1158h, androidx.core.view.WindowInsetsCompat.C1162l
        /* renamed from: t */
        public void mo37682t(Insets insets) {
        }

        C1160j(WindowInsetsCompat windowInsetsCompat, C1160j c1160j) {
            super(windowInsetsCompat, c1160j);
            this.f3567n = null;
            this.f3568o = null;
            this.f3569p = null;
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1152b {

        /* renamed from: a */
        private final C1156f f3546a;

        public C1152b() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f3546a = new C1155e();
            } else if (i >= 29) {
                this.f3546a = new C1154d();
            } else {
                this.f3546a = new C1153c();
            }
        }

        /* renamed from: a */
        public WindowInsetsCompat m37719a() {
            return this.f3546a.mo37713b();
        }

        /* renamed from: b */
        public C1152b m37718b(int i, Insets insets) {
            this.f3546a.mo37712c(i, insets);
            return this;
        }

        @Deprecated
        /* renamed from: c */
        public C1152b m37717c(Insets insets) {
            this.f3546a.mo37710e(insets);
            return this;
        }

        @Deprecated
        /* renamed from: d */
        public C1152b m37716d(Insets insets) {
            this.f3546a.mo37708g(insets);
            return this;
        }

        public C1152b(WindowInsetsCompat windowInsetsCompat) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f3546a = new C1155e(windowInsetsCompat);
            } else if (i >= 29) {
                this.f3546a = new C1154d(windowInsetsCompat);
            } else {
                this.f3546a = new C1153c(windowInsetsCompat);
            }
        }
    }

    public WindowInsetsCompat(WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat != null) {
            C1162l c1162l = windowInsetsCompat.f3541a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && (c1162l instanceof C1161k)) {
                this.f3541a = new C1161k(this, (C1161k) c1162l);
            } else if (i >= 29 && (c1162l instanceof C1160j)) {
                this.f3541a = new C1160j(this, (C1160j) c1162l);
            } else if (i >= 28 && (c1162l instanceof C1159i)) {
                this.f3541a = new C1159i(this, (C1159i) c1162l);
            } else if (c1162l instanceof C1158h) {
                this.f3541a = new C1158h(this, (C1158h) c1162l);
            } else if (c1162l instanceof C1157g) {
                this.f3541a = new C1157g(this, (C1157g) c1162l);
            } else {
                this.f3541a = new C1162l(this);
            }
            c1162l.mo37697e(this);
            return;
        }
        this.f3541a = new C1162l(this);
    }
}