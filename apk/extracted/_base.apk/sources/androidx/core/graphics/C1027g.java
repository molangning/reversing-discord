package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import androidx.core.content.res.C0971e;
import androidx.core.provider.C1090g;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: androidx.core.graphics.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C1027g extends C1001c0 {

    /* renamed from: b */
    private static final Class<?> f3371b;

    /* renamed from: c */
    private static final Constructor<?> f3372c;

    /* renamed from: d */
    private static final Method f3373d;

    /* renamed from: e */
    private static final Method f3374e;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f3372c = constructor;
        f3371b = cls;
        f3373d = method2;
        f3374e = method;
    }

    /* renamed from: h */
    private static boolean m38043h(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f3373d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: i */
    private static Typeface m38042i(Object obj) {
        try {
            Object newInstance = Array.newInstance(f3371b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f3374e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static boolean m38041j() {
        Method method = f3373d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        if (method != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private static Object m38040k() {
        try {
            return f3372c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.C1001c0
    /* renamed from: a */
    public Typeface mo38035a(Context context, C0971e.C0974c c0974c, Resources resources, int i) {
        C0971e.C0975d[] m38264a;
        Object m38040k = m38040k();
        if (m38040k == null) {
            return null;
        }
        for (C0971e.C0975d c0975d : c0974c.m38264a()) {
            ByteBuffer m38146b = C1007d0.m38146b(context, resources, c0975d.m38262b());
            if (m38146b == null || !m38043h(m38040k, m38146b, c0975d.m38261c(), c0975d.m38259e(), c0975d.m38258f())) {
                return null;
            }
        }
        return m38042i(m38040k);
    }

    @Override // androidx.core.graphics.C1001c0
    /* renamed from: b */
    public Typeface mo38034b(Context context, CancellationSignal cancellationSignal, C1090g.C1092b[] c1092bArr, int i) {
        Object m38040k = m38040k();
        if (m38040k == null) {
            return null;
        }
        SimpleArrayMap simpleArrayMap = new SimpleArrayMap();
        for (C1090g.C1092b c1092b : c1092bArr) {
            Uri m37913d = c1092b.m37913d();
            ByteBuffer byteBuffer = (ByteBuffer) simpleArrayMap.get(m37913d);
            if (byteBuffer == null) {
                byteBuffer = C1007d0.m38142f(context, cancellationSignal, m37913d);
                simpleArrayMap.put(m37913d, byteBuffer);
            }
            if (byteBuffer == null || !m38043h(m38040k, byteBuffer, c1092b.m37914c(), c1092b.m37912e(), c1092b.m37911f())) {
                return null;
            }
        }
        Typeface m38042i = m38042i(m38040k);
        if (m38042i == null) {
            return null;
        }
        return Typeface.create(m38042i, i);
    }
}
