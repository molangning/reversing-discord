package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.core.graphics.drawable.C1013a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.p0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0550p0 {

    /* renamed from: a */
    private static final int[] f1906a = {16842912};

    /* renamed from: b */
    private static final int[] f1907b = new int[0];

    /* renamed from: c */
    public static final Rect f1908c = new Rect();

    /* renamed from: androidx.appcompat.widget.p0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C0551a {

        /* renamed from: a */
        private static final boolean f1909a;

        /* renamed from: b */
        private static final Method f1910b;

        /* renamed from: c */
        private static final Field f1911c;

        /* renamed from: d */
        private static final Field f1912d;

        /* renamed from: e */
        private static final Field f1913e;

        /* renamed from: f */
        private static final Field f1914f;

        /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L35 java.lang.ClassNotFoundException -> L37 java.lang.NoSuchMethodException -> L39
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L2f java.lang.ClassNotFoundException -> L31 java.lang.NoSuchMethodException -> L33
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2d
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L47
                r8 = r0
                goto L49
            L2d:
                r7 = r1
                goto L47
            L2f:
                r6 = r1
                goto L46
            L31:
                r6 = r1
                goto L46
            L33:
                r6 = r1
                goto L46
            L35:
                r5 = r1
                goto L3d
            L37:
                r5 = r1
                goto L41
            L39:
                r5 = r1
                goto L45
            L3b:
                r4 = r1
                r5 = r4
            L3d:
                r6 = r5
                goto L46
            L3f:
                r4 = r1
                r5 = r4
            L41:
                r6 = r5
                goto L46
            L43:
                r4 = r1
                r5 = r4
            L45:
                r6 = r5
            L46:
                r7 = r6
            L47:
                r3 = r1
                r8 = r2
            L49:
                if (r8 == 0) goto L58
                androidx.appcompat.widget.C0550p0.C0551a.f1910b = r4
                androidx.appcompat.widget.C0550p0.C0551a.f1911c = r5
                androidx.appcompat.widget.C0550p0.C0551a.f1912d = r6
                androidx.appcompat.widget.C0550p0.C0551a.f1913e = r7
                androidx.appcompat.widget.C0550p0.C0551a.f1914f = r3
                androidx.appcompat.widget.C0550p0.C0551a.f1909a = r0
                goto L64
            L58:
                androidx.appcompat.widget.C0550p0.C0551a.f1910b = r1
                androidx.appcompat.widget.C0550p0.C0551a.f1911c = r1
                androidx.appcompat.widget.C0550p0.C0551a.f1912d = r1
                androidx.appcompat.widget.C0550p0.C0551a.f1913e = r1
                androidx.appcompat.widget.C0550p0.C0551a.f1914f = r1
                androidx.appcompat.widget.C0550p0.C0551a.f1909a = r2
            L64:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0550p0.C0551a.<clinit>():void");
        }

        /* renamed from: a */
        static Rect m39765a(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f1909a) {
                try {
                    Object invoke = f1910b.invoke(drawable, new Object[0]);
                    if (invoke != null) {
                        return new Rect(f1911c.getInt(invoke), f1912d.getInt(invoke), f1913e.getInt(invoke), f1914f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return C0550p0.f1908c;
        }
    }

    /* renamed from: androidx.appcompat.widget.p0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C0552b {
        /* renamed from: a */
        static Insets m39764a(Drawable drawable) {
            Insets opticalInsets;
            opticalInsets = drawable.getOpticalInsets();
            return opticalInsets;
        }
    }

    /* renamed from: a */
    public static boolean m39770a(Drawable drawable) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m39769b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            m39768c(drawable);
        }
    }

    /* renamed from: c */
    private static void m39768c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state != null && state.length != 0) {
            drawable.setState(f1907b);
        } else {
            drawable.setState(f1906a);
        }
        drawable.setState(state);
    }

    /* renamed from: d */
    public static Rect m39767d(Drawable drawable) {
        int i;
        int i2;
        int i3;
        int i4;
        if (Build.VERSION.SDK_INT >= 29) {
            Insets m39764a = C0552b.m39764a(drawable);
            i = m39764a.left;
            i2 = m39764a.top;
            i3 = m39764a.right;
            i4 = m39764a.bottom;
            return new Rect(i, i2, i3, i4);
        }
        return C0551a.m39765a(C1013a.m38081q(drawable));
    }

    /* renamed from: e */
    public static PorterDuff.Mode m39766e(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
