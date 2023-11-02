package androidx.fragment.app;

import androidx.collection.SimpleArrayMap;
import androidx.fragment.app.Fragment;

/* renamed from: androidx.fragment.app.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1599e {

    /* renamed from: a */
    private static final SimpleArrayMap<ClassLoader, SimpleArrayMap<String, Class<?>>> f4226a = new SimpleArrayMap<>();

    /* renamed from: b */
    public static boolean m36293b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m36292c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static Class<?> m36292c(ClassLoader classLoader, String str) {
        SimpleArrayMap<ClassLoader, SimpleArrayMap<String, Class<?>>> simpleArrayMap = f4226a;
        SimpleArrayMap<String, Class<?>> simpleArrayMap2 = simpleArrayMap.get(classLoader);
        if (simpleArrayMap2 == null) {
            simpleArrayMap2 = new SimpleArrayMap<>();
            simpleArrayMap.put(classLoader, simpleArrayMap2);
        }
        Class<?> cls = simpleArrayMap2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            simpleArrayMap2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    /* renamed from: d */
    public static Class<? extends Fragment> m36291d(ClassLoader classLoader, String str) {
        try {
            return m36292c(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.C1551i("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.C1551i("Unable to instantiate fragment " + str + ": make sure class name exists", e2);
        }
    }

    /* renamed from: a */
    public Fragment mo36294a(ClassLoader classLoader, String str) {
        throw null;
    }
}