package io.sentry;

import io.sentry.util.C8224k;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: io.sentry.m1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8018m1 {

    /* renamed from: a */
    private final Set<Object> f21706a = new HashSet();

    /* renamed from: b */
    private final int f21707b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8018m1(int i) {
        this.f21707b = i;
    }

    /* renamed from: a */
    private List<Object> m18993a(Collection<?> collection, InterfaceC8040o0 interfaceC8040o0) {
        ArrayList arrayList = new ArrayList();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(m18990d(it.next(), interfaceC8040o0));
        }
        return arrayList;
    }

    /* renamed from: b */
    private List<Object> m18992b(Object[] objArr, InterfaceC8040o0 interfaceC8040o0) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            arrayList.add(m18990d(obj, interfaceC8040o0));
        }
        return arrayList;
    }

    /* renamed from: c */
    private Map<String, Object> m18991c(Map<?, ?> map, InterfaceC8040o0 interfaceC8040o0) {
        HashMap hashMap = new HashMap();
        for (Object obj : map.keySet()) {
            Object obj2 = map.get(obj);
            if (obj2 != null) {
                hashMap.put(obj.toString(), m18990d(obj2, interfaceC8040o0));
            } else {
                hashMap.put(obj.toString(), null);
            }
        }
        return hashMap;
    }

    /* renamed from: d */
    public Object m18990d(Object obj, InterfaceC8040o0 interfaceC8040o0) {
        Object obj2;
        Object obj3 = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return obj.toString();
        }
        if (obj instanceof Number) {
            return obj;
        }
        if (obj instanceof Boolean) {
            return obj;
        }
        if (obj instanceof String) {
            return obj;
        }
        if (obj instanceof Locale) {
            return obj.toString();
        }
        if (obj instanceof AtomicIntegerArray) {
            return C8224k.m18207a((AtomicIntegerArray) obj);
        }
        if (obj instanceof AtomicBoolean) {
            return Boolean.valueOf(((AtomicBoolean) obj).get());
        }
        if (obj instanceof URI) {
            return obj.toString();
        }
        if (obj instanceof InetAddress) {
            return obj.toString();
        }
        if (obj instanceof UUID) {
            return obj.toString();
        }
        if (obj instanceof Currency) {
            return obj.toString();
        }
        if (obj instanceof Calendar) {
            return C8224k.m18205c((Calendar) obj);
        }
        if (obj.getClass().isEnum()) {
            return obj.toString();
        }
        if (this.f21706a.contains(obj)) {
            interfaceC8040o0.mo18135c(EnumC8021m4.INFO, "Cyclic reference detected. Calling toString() on object.", new Object[0]);
            return obj.toString();
        }
        this.f21706a.add(obj);
        try {
            if (this.f21706a.size() > this.f21707b) {
                this.f21706a.remove(obj);
                interfaceC8040o0.mo18135c(EnumC8021m4.INFO, "Max depth exceeded. Calling toString() on object.", new Object[0]);
                return obj.toString();
            }
            try {
            } catch (Exception e) {
                interfaceC8040o0.mo18136b(EnumC8021m4.INFO, "Not serializing object due to throwing sub-path.", e);
            }
            if (obj.getClass().isArray()) {
                obj2 = m18992b((Object[]) obj, interfaceC8040o0);
            } else if (obj instanceof Collection) {
                obj2 = m18993a((Collection) obj, interfaceC8040o0);
            } else if (obj instanceof Map) {
                obj2 = m18991c((Map) obj, interfaceC8040o0);
            } else {
                Map<String, Object> m18989e = m18989e(obj, interfaceC8040o0);
                if (m18989e.isEmpty()) {
                    obj2 = obj.toString();
                } else {
                    obj3 = m18989e;
                    return obj3;
                }
            }
            obj3 = obj2;
            return obj3;
        } finally {
            this.f21706a.remove(obj);
        }
    }

    /* renamed from: e */
    public Map<String, Object> m18989e(Object obj, InterfaceC8040o0 interfaceC8040o0) {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        HashMap hashMap = new HashMap();
        for (Field field : declaredFields) {
            if (!Modifier.isTransient(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                String name = field.getName();
                try {
                    field.setAccessible(true);
                    hashMap.put(name, m18990d(field.get(obj), interfaceC8040o0));
                    field.setAccessible(false);
                } catch (Exception unused) {
                    interfaceC8040o0.mo18135c(EnumC8021m4.INFO, "Cannot access field " + name + ".", new Object[0]);
                }
            }
        }
        return hashMap;
    }
}
