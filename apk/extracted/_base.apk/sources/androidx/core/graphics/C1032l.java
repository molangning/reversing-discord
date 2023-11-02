package androidx.core.graphics;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.res.C0971e;
import androidx.core.provider.C1090g;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* renamed from: androidx.core.graphics.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1032l extends C1026f {

    /* renamed from: g */
    protected final Class<?> f3375g;

    /* renamed from: h */
    protected final Constructor<?> f3376h;

    /* renamed from: i */
    protected final Method f3377i;

    /* renamed from: j */
    protected final Method f3378j;

    /* renamed from: k */
    protected final Method f3379k;

    /* renamed from: l */
    protected final Method f3380l;

    /* renamed from: m */
    protected final Method f3381m;

    public C1032l() {
        Class<?> cls;
        Constructor<?> constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = m38023v();
            constructor = m38022w(cls);
            method = m38025s(cls);
            method2 = m38024t(cls);
            method3 = m38021x(cls);
            method4 = m38026r(cls);
            method5 = mo38019u(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            cls = null;
            constructor = null;
            method = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f3375g = cls;
        this.f3376h = constructor;
        this.f3377i = method;
        this.f3378j = method2;
        this.f3379k = method3;
        this.f3380l = method4;
        this.f3381m = method5;
    }

    /* renamed from: l */
    private Object m38032l() {
        try {
            return this.f3376h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: m */
    private void m38031m(Object obj) {
        try {
            this.f3380l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: n */
    private boolean m38030n(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f3377i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: o */
    private boolean m38029o(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f3378j.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: p */
    private boolean m38028p(Object obj) {
        try {
            return ((Boolean) this.f3379k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: q */
    private boolean m38027q() {
        if (this.f3377i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (this.f3377i != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.graphics.C1026f, androidx.core.graphics.C1001c0
    /* renamed from: a */
    public Typeface mo38035a(Context context, C0971e.C0974c c0974c, Resources resources, int i) {
        C0971e.C0975d[] m38264a;
        FontVariationAxis[] fromFontVariationSettings;
        if (!m38027q()) {
            return super.mo38035a(context, c0974c, resources, i);
        }
        Object m38032l = m38032l();
        if (m38032l == null) {
            return null;
        }
        for (C0971e.C0975d c0975d : c0974c.m38264a()) {
            String m38263a = c0975d.m38263a();
            int m38261c = c0975d.m38261c();
            int m38259e = c0975d.m38259e();
            boolean m38258f = c0975d.m38258f();
            fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(c0975d.m38260d());
            if (!m38030n(context, m38032l, m38263a, m38261c, m38259e, m38258f ? 1 : 0, fromFontVariationSettings)) {
                m38031m(m38032l);
                return null;
            }
        }
        if (!m38028p(m38032l)) {
            return null;
        }
        return mo38020i(m38032l);
    }

    @Override // androidx.core.graphics.C1026f, androidx.core.graphics.C1001c0
    /* renamed from: b */
    public Typeface mo38034b(Context context, CancellationSignal cancellationSignal, C1090g.C1092b[] c1092bArr, int i) {
        Typeface mo38020i;
        Typeface.Builder weight;
        Typeface.Builder italic;
        Typeface build;
        if (c1092bArr.length < 1) {
            return null;
        }
        if (!m38027q()) {
            C1090g.C1092b mo38167g = mo38167g(c1092bArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo38167g.m37913d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                weight = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(mo38167g.m37912e());
                italic = weight.setItalic(mo38167g.m37911f());
                build = italic.build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> m38140h = C1007d0.m38140h(context, c1092bArr, cancellationSignal);
        Object m38032l = m38032l();
        if (m38032l == null) {
            return null;
        }
        boolean z = false;
        for (C1090g.C1092b c1092b : c1092bArr) {
            ByteBuffer byteBuffer = m38140h.get(c1092b.m37913d());
            if (byteBuffer != null) {
                if (!m38029o(m38032l, byteBuffer, c1092b.m37914c(), c1092b.m37912e(), c1092b.m37911f() ? 1 : 0)) {
                    m38031m(m38032l);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            m38031m(m38032l);
            return null;
        } else if (!m38028p(m38032l) || (mo38020i = mo38020i(m38032l)) == null) {
            return null;
        } else {
            return Typeface.create(mo38020i, i);
        }
    }

    @Override // androidx.core.graphics.C1001c0
    /* renamed from: d */
    public Typeface mo38033d(Context context, Resources resources, int i, String str, int i2) {
        if (!m38027q()) {
            return super.mo38033d(context, resources, i, str, i2);
        }
        Object m38032l = m38032l();
        if (m38032l == null) {
            return null;
        }
        if (!m38030n(context, m38032l, str, 0, -1, -1, null)) {
            m38031m(m38032l);
            return null;
        } else if (!m38028p(m38032l)) {
            return null;
        } else {
            return mo38020i(m38032l);
        }
    }

    /* renamed from: i */
    protected Typeface mo38020i(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f3375g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f3381m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: r */
    protected Method m38026r(Class<?> cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* renamed from: s */
    protected Method m38025s(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: t */
    protected Method m38024t(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    /* renamed from: u */
    protected Method mo38019u(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* renamed from: v */
    protected Class<?> m38023v() {
        return Class.forName("android.graphics.FontFamily");
    }

    /* renamed from: w */
    protected Constructor<?> m38022w(Class<?> cls) {
        return cls.getConstructor(new Class[0]);
    }

    /* renamed from: x */
    protected Method m38021x(Class<?> cls) {
        return cls.getMethod("freeze", new Class[0]);
    }
}
