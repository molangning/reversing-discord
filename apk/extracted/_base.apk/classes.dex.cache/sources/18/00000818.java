package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p274p0.C11364b;
import p274p0.C11365c;
import p274p0.InterfaceC11363a;
import p310r0.C12013a;

/* renamed from: androidx.startup.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1828a {

    /* renamed from: d */
    private static volatile C1828a f5008d;

    /* renamed from: e */
    private static final Object f5009e = new Object();

    /* renamed from: c */
    final Context f5012c;

    /* renamed from: b */
    final Set<Class<? extends InterfaceC11363a<?>>> f5011b = new HashSet();

    /* renamed from: a */
    final Map<Class<?>, Object> f5010a = new HashMap();

    C1828a(Context context) {
        this.f5012c = context.getApplicationContext();
    }

    /* renamed from: d */
    private <T> T m35287d(Class<? extends InterfaceC11363a<?>> cls, Set<Class<?>> set) {
        T t;
        if (C12013a.m6599h()) {
            try {
                C12013a.m6604c(cls.getSimpleName());
            } finally {
                C12013a.m6601f();
            }
        }
        if (!set.contains(cls)) {
            if (!this.f5010a.containsKey(cls)) {
                set.add(cls);
                InterfaceC11363a<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends InterfaceC11363a<?>>> mo8249a = newInstance.mo8249a();
                if (!mo8249a.isEmpty()) {
                    for (Class<? extends InterfaceC11363a<?>> cls2 : mo8249a) {
                        if (!this.f5010a.containsKey(cls2)) {
                            m35287d(cls2, set);
                        }
                    }
                }
                t = (T) newInstance.mo8248b(this.f5012c);
                set.remove(cls);
                this.f5010a.put(cls, t);
            } else {
                t = (T) this.f5010a.get(cls);
            }
            return t;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
    }

    /* renamed from: e */
    public static C1828a m35286e(Context context) {
        if (f5008d == null) {
            synchronized (f5009e) {
                if (f5008d == null) {
                    f5008d = new C1828a(context);
                }
            }
        }
        return f5008d;
    }

    /* renamed from: a */
    public void m35290a() {
        try {
            try {
                C12013a.m6604c("Startup");
                m35289b(this.f5012c.getPackageManager().getProviderInfo(new ComponentName(this.f5012c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e) {
                throw new C11365c(e);
            }
        } finally {
            C12013a.m6601f();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    void m35289b(Bundle bundle) {
        String string = this.f5012c.getString(C11364b.f29582a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (InterfaceC11363a.class.isAssignableFrom(cls)) {
                            this.f5011b.add(cls);
                        }
                    }
                }
                for (Class<? extends InterfaceC11363a<?>> cls2 : this.f5011b) {
                    m35287d(cls2, hashSet);
                }
            } catch (ClassNotFoundException e) {
                throw new C11365c(e);
            }
        }
    }

    /* renamed from: c */
    <T> T m35288c(Class<? extends InterfaceC11363a<?>> cls) {
        T t;
        synchronized (f5009e) {
            t = (T) this.f5010a.get(cls);
            if (t == null) {
                t = (T) m35287d(cls, new HashSet());
            }
        }
        return t;
    }

    /* renamed from: f */
    public <T> T m35285f(Class<? extends InterfaceC11363a<T>> cls) {
        return (T) m35288c(cls);
    }

    /* renamed from: g */
    public boolean m35284g(Class<? extends InterfaceC11363a<?>> cls) {
        return this.f5011b.contains(cls);
    }
}