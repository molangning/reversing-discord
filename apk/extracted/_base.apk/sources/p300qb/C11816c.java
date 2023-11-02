package p300qb;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: qb.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11816c {

    /* renamed from: a */
    private final String f30806a;

    /* renamed from: b */
    private final Map<Class<?>, Object> f30807b;

    /* renamed from: qb.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11818b {

        /* renamed from: a */
        private final String f30808a;

        /* renamed from: b */
        private Map<Class<?>, Object> f30809b = null;

        C11818b(String str) {
            this.f30808a = str;
        }

        /* renamed from: a */
        public C11816c m6829a() {
            Map unmodifiableMap;
            String str = this.f30808a;
            if (this.f30809b == null) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(this.f30809b));
            }
            return new C11816c(str, unmodifiableMap);
        }

        /* renamed from: b */
        public <T extends Annotation> C11818b m6828b(T t) {
            if (this.f30809b == null) {
                this.f30809b = new HashMap();
            }
            this.f30809b.put(t.annotationType(), t);
            return this;
        }
    }

    /* renamed from: a */
    public static C11818b m6833a(String str) {
        return new C11818b(str);
    }

    /* renamed from: d */
    public static C11816c m6830d(String str) {
        return new C11816c(str, Collections.emptyMap());
    }

    /* renamed from: b */
    public String m6832b() {
        return this.f30806a;
    }

    /* renamed from: c */
    public <T extends Annotation> T m6831c(Class<T> cls) {
        return (T) this.f30807b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11816c)) {
            return false;
        }
        C11816c c11816c = (C11816c) obj;
        if (this.f30806a.equals(c11816c.f30806a) && this.f30807b.equals(c11816c.f30807b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f30806a.hashCode() * 31) + this.f30807b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f30806a + ", properties=" + this.f30807b.values() + "}";
    }

    private C11816c(String str, Map<Class<?>, Object> map) {
        this.f30806a = str;
        this.f30807b = map;
    }
}
