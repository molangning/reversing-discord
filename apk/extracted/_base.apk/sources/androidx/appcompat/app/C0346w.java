package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* renamed from: androidx.appcompat.app.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C0346w {

    /* renamed from: a */
    private static Field f1104a;

    /* renamed from: b */
    private static boolean f1105b;

    /* renamed from: c */
    private static Class<?> f1106c;

    /* renamed from: d */
    private static boolean f1107d;

    /* renamed from: e */
    private static Field f1108e;

    /* renamed from: f */
    private static boolean f1109f;

    /* renamed from: g */
    private static Field f1110g;

    /* renamed from: h */
    private static boolean f1111h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.w$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0347a {
        /* renamed from: a */
        static void m40528a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m40532a(Resources resources) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return;
        }
        if (i >= 24) {
            m40530c(resources);
        } else {
            m40531b(resources);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m40531b(android.content.res.Resources r4) {
        /*
            boolean r0 = androidx.appcompat.app.C0346w.f1105b
            java.lang.String r1 = "ResourcesFlusher"
            if (r0 != 0) goto L1d
            r0 = 1
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.String r3 = "mDrawableCache"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L15
            androidx.appcompat.app.C0346w.f1104a = r2     // Catch: java.lang.NoSuchFieldException -> L15
            r2.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L15
            goto L1b
        L15:
            r2 = move-exception
            java.lang.String r3 = "Could not retrieve Resources#mDrawableCache field"
            android.util.Log.e(r1, r3, r2)
        L1b:
            androidx.appcompat.app.C0346w.f1105b = r0
        L1d:
            java.lang.reflect.Field r0 = androidx.appcompat.app.C0346w.f1104a
            if (r0 == 0) goto L2c
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.IllegalAccessException -> L26
            goto L2d
        L26:
            r4 = move-exception
            java.lang.String r0 = "Could not retrieve value from Resources#mDrawableCache"
            android.util.Log.e(r1, r0, r4)
        L2c:
            r4 = 0
        L2d:
            if (r4 != 0) goto L30
            return
        L30:
            m40529d(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0346w.m40531b(android.content.res.Resources):void");
    }

    /* renamed from: c */
    private static void m40530c(Resources resources) {
        Object obj;
        if (!f1111h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f1110g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f1111h = true;
        }
        Field field = f1110g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e2) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f1105b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f1104a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e3) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
            }
            f1105b = true;
        }
        Field field2 = f1104a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e4) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
            }
        }
        if (obj2 != null) {
            m40529d(obj2);
        }
    }

    /* renamed from: d */
    private static void m40529d(Object obj) {
        LongSparseArray longSparseArray;
        if (!f1107d) {
            try {
                f1106c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f1107d = true;
        }
        Class<?> cls = f1106c;
        if (cls == null) {
            return;
        }
        if (!f1109f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f1108e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            f1109f = true;
        }
        Field field = f1108e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            C0347a.m40528a(longSparseArray);
        }
    }
}
