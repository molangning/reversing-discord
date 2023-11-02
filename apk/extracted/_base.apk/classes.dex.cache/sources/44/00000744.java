package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* renamed from: androidx.lifecycle.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1674b {

    /* renamed from: c */
    static C1674b f4493c = new C1674b();

    /* renamed from: a */
    private final Map<Class<?>, C1675a> f4494a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, Boolean> f4495b = new HashMap();

    @Deprecated
    /* renamed from: androidx.lifecycle.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1675a {

        /* renamed from: a */
        final Map<Lifecycle.EnumC1651b, List<C1676b>> f4496a = new HashMap();

        /* renamed from: b */
        final Map<C1676b, Lifecycle.EnumC1651b> f4497b;

        C1675a(Map<C1676b, Lifecycle.EnumC1651b> map) {
            this.f4497b = map;
            for (Map.Entry<C1676b, Lifecycle.EnumC1651b> entry : map.entrySet()) {
                Lifecycle.EnumC1651b value = entry.getValue();
                List<C1676b> list = this.f4496a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f4496a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        /* renamed from: b */
        private static void m36060b(List<C1676b> list, LifecycleOwner lifecycleOwner, Lifecycle.EnumC1651b enumC1651b, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).m36059a(lifecycleOwner, enumC1651b, obj);
                }
            }
        }

        /* renamed from: a */
        public void m36061a(LifecycleOwner lifecycleOwner, Lifecycle.EnumC1651b enumC1651b, Object obj) {
            m36060b(this.f4496a.get(enumC1651b), lifecycleOwner, enumC1651b, obj);
            m36060b(this.f4496a.get(Lifecycle.EnumC1651b.ON_ANY), lifecycleOwner, enumC1651b, obj);
        }
    }

    @Deprecated
    /* renamed from: androidx.lifecycle.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1676b {

        /* renamed from: a */
        final int f4498a;

        /* renamed from: b */
        final Method f4499b;

        C1676b(int i, Method method) {
            this.f4498a = i;
            this.f4499b = method;
            method.setAccessible(true);
        }

        /* renamed from: a */
        void m36059a(LifecycleOwner lifecycleOwner, Lifecycle.EnumC1651b enumC1651b, Object obj) {
            try {
                int i = this.f4498a;
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            this.f4499b.invoke(obj, lifecycleOwner, enumC1651b);
                            return;
                        }
                        return;
                    }
                    this.f4499b.invoke(obj, lifecycleOwner);
                    return;
                }
                this.f4499b.invoke(obj, new Object[0]);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e2) {
                throw new RuntimeException("Failed to call observer method", e2.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1676b)) {
                return false;
            }
            C1676b c1676b = (C1676b) obj;
            if (this.f4498a == c1676b.f4498a && this.f4499b.getName().equals(c1676b.f4499b.getName())) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f4498a * 31) + this.f4499b.getName().hashCode();
        }
    }

    C1674b() {
    }

    /* renamed from: a */
    private C1675a m36066a(Class<?> cls, Method[] methodArr) {
        int i;
        C1675a m36064c;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (m36064c = m36064c(superclass)) != null) {
            hashMap.putAll(m36064c.f4497b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C1676b, Lifecycle.EnumC1651b> entry : m36064c(cls2).f4497b.entrySet()) {
                m36062e(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = m36065b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC1703t interfaceC1703t = (InterfaceC1703t) method.getAnnotation(InterfaceC1703t.class);
            if (interfaceC1703t != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (parameterTypes[0].isAssignableFrom(LifecycleOwner.class)) {
                        i = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i = 0;
                }
                Lifecycle.EnumC1651b value = interfaceC1703t.value();
                if (parameterTypes.length > 1) {
                    if (parameterTypes[1].isAssignableFrom(Lifecycle.EnumC1651b.class)) {
                        if (value == Lifecycle.EnumC1651b.ON_ANY) {
                            i = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m36062e(hashMap, new C1676b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C1675a c1675a = new C1675a(hashMap);
        this.f4494a.put(cls, c1675a);
        this.f4495b.put(cls, Boolean.valueOf(z));
        return c1675a;
    }

    /* renamed from: b */
    private Method[] m36065b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* renamed from: e */
    private void m36062e(Map<C1676b, Lifecycle.EnumC1651b> map, C1676b c1676b, Lifecycle.EnumC1651b enumC1651b, Class<?> cls) {
        Lifecycle.EnumC1651b enumC1651b2 = map.get(c1676b);
        if (enumC1651b2 != null && enumC1651b != enumC1651b2) {
            Method method = c1676b.f4499b;
            throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC1651b2 + ", new value " + enumC1651b);
        } else if (enumC1651b2 == null) {
            map.put(c1676b, enumC1651b);
        }
    }

    /* renamed from: c */
    public C1675a m36064c(Class<?> cls) {
        C1675a c1675a = this.f4494a.get(cls);
        if (c1675a != null) {
            return c1675a;
        }
        return m36066a(cls, null);
    }

    /* renamed from: d */
    public boolean m36063d(Class<?> cls) {
        Boolean bool = this.f4495b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] m36065b = m36065b(cls);
        for (Method method : m36065b) {
            if (((InterfaceC1703t) method.getAnnotation(InterfaceC1703t.class)) != null) {
                m36066a(cls, m36065b);
                return true;
            }
        }
        this.f4495b.put(cls, Boolean.FALSE);
        return false;
    }
}