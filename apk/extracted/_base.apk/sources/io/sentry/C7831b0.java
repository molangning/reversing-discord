package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7831b0 {

    /* renamed from: f */
    private static final Map<String, Class<?>> f21404f;

    /* renamed from: a */
    private final Map<String, Object> f21405a = new HashMap();

    /* renamed from: b */
    private final List<C7830b> f21406b = new ArrayList();

    /* renamed from: c */
    private C7830b f21407c = null;

    /* renamed from: d */
    private C7830b f21408d = null;

    /* renamed from: e */
    private C7830b f21409e = null;

    static {
        HashMap hashMap = new HashMap();
        f21404f = hashMap;
        hashMap.put("boolean", Boolean.class);
        hashMap.put("char", Character.class);
        hashMap.put("byte", Byte.class);
        hashMap.put("short", Short.class);
        hashMap.put("int", Integer.class);
        hashMap.put("long", Long.class);
        hashMap.put("float", Float.class);
        hashMap.put("double", Double.class);
    }

    /* renamed from: i */
    private boolean m19593i(Object obj, Class<?> cls) {
        Class<?> cls2 = f21404f.get(cls.getCanonicalName());
        if (obj != null && cls.isPrimitive() && cls2 != null && cls2.isInstance(obj)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m19601a(List<C7830b> list) {
        if (list != null) {
            this.f21406b.addAll(list);
        }
    }

    /* renamed from: b */
    public synchronized void m19600b() {
        Iterator<Map.Entry<String, Object>> it = this.f21405a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> next = it.next();
            if (next.getKey() == null || !next.getKey().startsWith("sentry:")) {
                it.remove();
            }
        }
    }

    /* renamed from: c */
    public synchronized Object m19599c(String str) {
        return this.f21405a.get(str);
    }

    /* renamed from: d */
    public synchronized <T> T m19598d(String str, Class<T> cls) {
        T t = (T) this.f21405a.get(str);
        if (cls.isInstance(t)) {
            return t;
        }
        if (m19593i(t, cls)) {
            return t;
        }
        return null;
    }

    /* renamed from: e */
    public List<C7830b> m19597e() {
        return new ArrayList(this.f21406b);
    }

    /* renamed from: f */
    public C7830b m19596f() {
        return this.f21407c;
    }

    /* renamed from: g */
    public C7830b m19595g() {
        return this.f21409e;
    }

    /* renamed from: h */
    public C7830b m19594h() {
        return this.f21408d;
    }

    /* renamed from: j */
    public synchronized void m19592j(String str, Object obj) {
        this.f21405a.put(str, obj);
    }

    /* renamed from: k */
    public void m19591k(C7830b c7830b) {
        this.f21407c = c7830b;
    }

    /* renamed from: l */
    public void m19590l(C7830b c7830b) {
        this.f21409e = c7830b;
    }

    /* renamed from: m */
    public void m19589m(C7830b c7830b) {
        this.f21408d = c7830b;
    }
}
