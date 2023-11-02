package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1701r {

    /* renamed from: a */
    private static Map<Class<?>, Integer> f4511a = new HashMap();

    /* renamed from: b */
    private static Map<Class<?>, List<Constructor<? extends InterfaceC1684f>>> f4512b = new HashMap();

    /* renamed from: a */
    private static InterfaceC1684f m36031a(Constructor<? extends InterfaceC1684f> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    private static Constructor<? extends InterfaceC1684f> m36030b(Class<?> cls) {
        String str;
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            if (r0 != null) {
                str = r0.getName();
            } else {
                str = "";
            }
            if (!str.isEmpty()) {
                canonicalName = canonicalName.substring(str.length() + 1);
            }
            String m36029c = m36029c(canonicalName);
            if (!str.isEmpty()) {
                m36029c = str + "." + m36029c;
            }
            Constructor declaredConstructor = Class.forName(m36029c).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public static String m36029c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* renamed from: d */
    private static int m36028d(Class<?> cls) {
        Integer num = f4511a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int m36025g = m36025g(cls);
        f4511a.put(cls, Integer.valueOf(m36025g));
        return m36025g;
    }

    /* renamed from: e */
    private static boolean m36027e(Class<?> cls) {
        return cls != null && InterfaceC1698o.class.isAssignableFrom(cls);
    }

    /* renamed from: f */
    public static InterfaceC1695l m36026f(Object obj) {
        boolean z = obj instanceof InterfaceC1695l;
        boolean z2 = obj instanceof InterfaceC1682e;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((InterfaceC1682e) obj, (InterfaceC1695l) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((InterfaceC1682e) obj, null);
        }
        if (z) {
            return (InterfaceC1695l) obj;
        }
        Class<?> cls = obj.getClass();
        if (m36028d(cls) == 2) {
            List<Constructor<? extends InterfaceC1684f>> list = f4512b.get(cls);
            if (list.size() == 1) {
                return new SingleGeneratedAdapterObserver(m36031a(list.get(0), obj));
            }
            InterfaceC1684f[] interfaceC1684fArr = new InterfaceC1684f[list.size()];
            for (int i = 0; i < list.size(); i++) {
                interfaceC1684fArr[i] = m36031a(list.get(i), obj);
            }
            return new CompositeGeneratedAdaptersObserver(interfaceC1684fArr);
        }
        return new ReflectiveGenericLifecycleObserver(obj);
    }

    /* renamed from: g */
    private static int m36025g(Class<?> cls) {
        ArrayList arrayList;
        Class<?>[] interfaces;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends InterfaceC1684f> m36030b = m36030b(cls);
        if (m36030b != null) {
            f4512b.put(cls, Collections.singletonList(m36030b));
            return 2;
        } else if (C1674b.f4493c.m36063d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            if (m36027e(superclass)) {
                if (m36028d(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(f4512b.get(superclass));
            } else {
                arrayList = null;
            }
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (m36027e(cls2)) {
                    if (m36028d(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(f4512b.get(cls2));
                }
            }
            if (arrayList == null) {
                return 1;
            }
            f4512b.put(cls, arrayList);
            return 2;
        }
    }
}