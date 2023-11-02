package androidx.core.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.res.C0971e;
import androidx.core.provider.C1090g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.core.graphics.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1026f extends C1001c0 {

    /* renamed from: b */
    private static Class<?> f3366b = null;

    /* renamed from: c */
    private static Constructor<?> f3367c = null;

    /* renamed from: d */
    private static Method f3368d = null;

    /* renamed from: e */
    private static Method f3369e = null;

    /* renamed from: f */
    private static boolean f3370f = false;

    /* renamed from: h */
    private static boolean m38048h(Object obj, String str, int i, boolean z) {
        m38045k();
        try {
            return ((Boolean) f3368d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: i */
    private static Typeface m38047i(Object obj) {
        m38045k();
        try {
            Object newInstance = Array.newInstance(f3366b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f3369e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: j */
    private File m38046j(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* renamed from: k */
    private static void m38045k() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f3370f) {
            return;
        }
        f3370f = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f3367c = constructor;
        f3366b = cls;
        f3368d = method2;
        f3369e = method;
    }

    /* renamed from: l */
    private static Object m38044l() {
        m38045k();
        try {
            return f3367c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // androidx.core.graphics.C1001c0
    /* renamed from: a */
    public Typeface mo38035a(Context context, C0971e.C0974c c0974c, Resources resources, int i) {
        C0971e.C0975d[] m38264a;
        Object m38044l = m38044l();
        for (C0971e.C0975d c0975d : c0974c.m38264a()) {
            File m38143e = C1007d0.m38143e(context);
            if (m38143e == null) {
                return null;
            }
            try {
                if (!C1007d0.m38145c(m38143e, resources, c0975d.m38262b())) {
                    return null;
                }
                if (!m38048h(m38044l, m38143e.getPath(), c0975d.m38259e(), c0975d.m38258f())) {
                    return null;
                }
                m38143e.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                m38143e.delete();
            }
        }
        return m38047i(m38044l);
    }

    @Override // androidx.core.graphics.C1001c0
    /* renamed from: b */
    public Typeface mo38034b(Context context, CancellationSignal cancellationSignal, C1090g.C1092b[] c1092bArr, int i) {
        if (c1092bArr.length < 1) {
            return null;
        }
        C1090g.C1092b mo38167g = mo38167g(c1092bArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo38167g.m37913d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            File m38046j = m38046j(openFileDescriptor);
            if (m38046j != null && m38046j.canRead()) {
                Typeface createFromFile = Typeface.createFromFile(m38046j);
                openFileDescriptor.close();
                return createFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface m38170c = super.m38170c(context, fileInputStream);
            fileInputStream.close();
            openFileDescriptor.close();
            return m38170c;
        } catch (IOException unused) {
            return null;
        }
    }
}