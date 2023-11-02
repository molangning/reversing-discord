package androidx.core.content.res;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.core.content.res.C0980h;
import androidx.core.util.C1134c;
import androidx.core.util.C1138f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: androidx.core.content.res.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C0980h {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f3313a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<C0984d, SparseArray<C0983c>> f3314b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f3315c = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.content.res.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0981a {
        /* renamed from: a */
        static Drawable m38231a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        /* renamed from: b */
        static Drawable m38230b(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    /* renamed from: androidx.core.content.res.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0982b {
        /* renamed from: a */
        static int m38229a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        /* renamed from: b */
        static ColorStateList m38228b(Resources resources, int i, Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    /* renamed from: androidx.core.content.res.h$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0983c {

        /* renamed from: a */
        final ColorStateList f3316a;

        /* renamed from: b */
        final Configuration f3317b;

        /* renamed from: c */
        final int f3318c;

        C0983c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            int hashCode;
            this.f3316a = colorStateList;
            this.f3317b = configuration;
            if (theme == null) {
                hashCode = 0;
            } else {
                hashCode = theme.hashCode();
            }
            this.f3318c = hashCode;
        }
    }

    /* renamed from: androidx.core.content.res.h$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C0984d {

        /* renamed from: a */
        final Resources f3319a;

        /* renamed from: b */
        final Resources.Theme f3320b;

        C0984d(Resources resources, Resources.Theme theme) {
            this.f3319a = resources;
            this.f3320b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0984d.class != obj.getClass()) {
                return false;
            }
            C0984d c0984d = (C0984d) obj;
            if (this.f3319a.equals(c0984d.f3319a) && C1134c.m37835a(this.f3320b, c0984d.f3320b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return C1134c.m37834b(this.f3319a, this.f3320b);
        }
    }

    /* renamed from: androidx.core.content.res.h$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AbstractC0985e {
        /* renamed from: e */
        public static Handler m38223e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        /* renamed from: c */
        public final void m38225c(final int i, Handler handler) {
            m38223e(handler).post(new Runnable() { // from class: androidx.core.content.res.j
                @Override // java.lang.Runnable
                public final void run() {
                    C0980h.AbstractC0985e.this.m38222f(i);
                }
            });
        }

        /* renamed from: d */
        public final void m38224d(final Typeface typeface, Handler handler) {
            m38223e(handler).post(new Runnable() { // from class: androidx.core.content.res.i
                @Override // java.lang.Runnable
                public final void run() {
                    C0980h.AbstractC0985e.this.m38221g(typeface);
                }
            });
        }

        /* renamed from: h */
        public abstract void m38222f(int i);

        /* renamed from: i */
        public abstract void m38221g(Typeface typeface);
    }

    /* renamed from: androidx.core.content.res.h$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C0986f {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.core.content.res.h$f$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static class C0987a {

            /* renamed from: a */
            private static final Object f3321a = new Object();

            /* renamed from: b */
            private static Method f3322b;

            /* renamed from: c */
            private static boolean f3323c;

            @SuppressLint({"BanUncheckedReflection"})
            /* renamed from: a */
            static void m38219a(Resources.Theme theme) {
                synchronized (f3321a) {
                    if (!f3323c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f3322b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                        }
                        f3323c = true;
                    }
                    Method method = f3322b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                            f3322b = null;
                        }
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.core.content.res.h$f$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public static class C0988b {
            /* renamed from: a */
            static void m38218a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m38220a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                C0988b.m38218a(theme);
            } else {
                C0987a.m38219a(theme);
            }
        }
    }

    /* renamed from: a */
    private static void m38246a(C0984d c0984d, int i, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f3315c) {
            WeakHashMap<C0984d, SparseArray<C0983c>> weakHashMap = f3314b;
            SparseArray<C0983c> sparseArray = weakHashMap.get(c0984d);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(c0984d, sparseArray);
            }
            sparseArray.append(i, new C0983c(colorStateList, c0984d.f3319a.getConfiguration(), theme));
        }
    }

    /* renamed from: b */
    private static ColorStateList m38245b(C0984d c0984d, int i) {
        C0983c c0983c;
        Resources.Theme theme;
        synchronized (f3315c) {
            SparseArray<C0983c> sparseArray = f3314b.get(c0984d);
            if (sparseArray != null && sparseArray.size() > 0 && (c0983c = sparseArray.get(i)) != null) {
                if (c0983c.f3317b.equals(c0984d.f3319a.getConfiguration()) && (((theme = c0984d.f3320b) == null && c0983c.f3318c == 0) || (theme != null && c0983c.f3318c == theme.hashCode()))) {
                    return c0983c.f3316a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    /* renamed from: c */
    public static Typeface m38244c(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m38233n(context, i, new TypedValue(), 0, null, null, false, true);
    }

    /* renamed from: d */
    public static int m38243d(Resources resources, int i, Resources.Theme theme) {
        return C0982b.m38229a(resources, i, theme);
    }

    /* renamed from: e */
    public static ColorStateList m38242e(Resources resources, int i, Resources.Theme theme) {
        C0984d c0984d = new C0984d(resources, theme);
        ColorStateList m38245b = m38245b(c0984d, i);
        if (m38245b != null) {
            return m38245b;
        }
        ColorStateList m38235l = m38235l(resources, i, theme);
        if (m38235l != null) {
            m38246a(c0984d, i, m38235l, theme);
            return m38235l;
        }
        return C0982b.m38228b(resources, i, theme);
    }

    /* renamed from: f */
    public static Drawable m38241f(Resources resources, int i, Resources.Theme theme) {
        return C0981a.m38231a(resources, i, theme);
    }

    /* renamed from: g */
    public static Drawable m38240g(Resources resources, int i, int i2, Resources.Theme theme) {
        return C0981a.m38230b(resources, i, i2, theme);
    }

    /* renamed from: h */
    public static Typeface m38239h(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m38233n(context, i, new TypedValue(), 0, null, null, false, false);
    }

    /* renamed from: i */
    public static Typeface m38238i(Context context, int i, TypedValue typedValue, int i2, AbstractC0985e abstractC0985e) {
        if (context.isRestricted()) {
            return null;
        }
        return m38233n(context, i, typedValue, i2, abstractC0985e, null, true, false);
    }

    /* renamed from: j */
    public static void m38237j(Context context, int i, AbstractC0985e abstractC0985e, Handler handler) {
        C1138f.m37824f(abstractC0985e);
        if (context.isRestricted()) {
            abstractC0985e.m38225c(-4, handler);
        } else {
            m38233n(context, i, new TypedValue(), 0, abstractC0985e, handler, false, false);
        }
    }

    /* renamed from: k */
    private static TypedValue m38236k() {
        ThreadLocal<TypedValue> threadLocal = f3313a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    /* renamed from: l */
    private static ColorStateList m38235l(Resources resources, int i, Resources.Theme theme) {
        if (m38234m(resources, i)) {
            return null;
        }
        try {
            return C0969c.m38293a(resources, resources.getXml(i), theme);
        } catch (Exception e) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            return null;
        }
    }

    /* renamed from: m */
    private static boolean m38234m(Resources resources, int i) {
        TypedValue m38236k = m38236k();
        resources.getValue(i, m38236k, true);
        int i2 = m38236k.type;
        if (i2 >= 28 && i2 <= 31) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private static Typeface m38233n(Context context, int i, TypedValue typedValue, int i2, AbstractC0985e abstractC0985e, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface m38232o = m38232o(context, resources, typedValue, i, i2, abstractC0985e, handler, z, z2);
        if (m38232o == null && abstractC0985e == null && !z2) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
        }
        return m38232o;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x00b7  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface m38232o(android.content.Context r17, android.content.res.Resources r18, android.util.TypedValue r19, int r20, int r21, androidx.core.content.res.C0980h.AbstractC0985e r22, android.os.Handler r23, boolean r24, boolean r25) {
        /*
            r0 = r18
            r1 = r19
            r4 = r20
            r11 = r22
            r12 = r23
            java.lang.String r13 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto Lbb
            java.lang.String r14 = r2.toString()
            java.lang.String r2 = "res/"
            boolean r2 = r14.startsWith(r2)
            r15 = -3
            r16 = 0
            if (r2 != 0) goto L25
            if (r11 == 0) goto L24
            r11.m38225c(r15, r12)
        L24:
            return r16
        L25:
            int r2 = r1.assetCookie
            r7 = r21
            android.graphics.Typeface r2 = androidx.core.graphics.C1024e.m38050f(r0, r4, r14, r2, r7)
            if (r2 == 0) goto L35
            if (r11 == 0) goto L34
            r11.m38224d(r2, r12)
        L34:
            return r2
        L35:
            if (r25 == 0) goto L38
            return r16
        L38:
            java.lang.String r2 = r14.toLowerCase()     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            java.lang.String r3 = ".xml"
            boolean r2 = r2.endsWith(r3)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            if (r2 == 0) goto L6f
            android.content.res.XmlResourceParser r2 = r0.getXml(r4)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            androidx.core.content.res.e$b r2 = androidx.core.content.res.C0971e.m38272b(r2, r0)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            if (r2 != 0) goto L59
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r13, r0)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            if (r11 == 0) goto L58
            r11.m38225c(r15, r12)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
        L58:
            return r16
        L59:
            int r6 = r1.assetCookie     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            r1 = r17
            r3 = r18
            r4 = r20
            r5 = r14
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            android.graphics.Typeface r0 = androidx.core.graphics.C1024e.m38053c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            return r0
        L6f:
            int r5 = r1.assetCookie     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            r1 = r17
            r2 = r18
            r3 = r20
            r4 = r14
            r6 = r21
            android.graphics.Typeface r0 = androidx.core.graphics.C1024e.m38052d(r1, r2, r3, r4, r5, r6)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            if (r11 == 0) goto L89
            if (r0 == 0) goto L86
            r11.m38224d(r0, r12)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
            goto L89
        L86:
            r11.m38225c(r15, r12)     // Catch: java.io.IOException -> L8a org.xmlpull.v1.XmlPullParserException -> La0
        L89:
            return r0
        L8a:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
            goto Lb5
        La0:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r13, r1, r0)
        Lb5:
            if (r11 == 0) goto Lba
            r11.m38225c(r15, r12)
        Lba:
            return r16
        Lbb:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r20)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0980h.m38232o(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, androidx.core.content.res.h$e, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}