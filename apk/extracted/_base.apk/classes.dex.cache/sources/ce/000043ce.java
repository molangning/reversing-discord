package p247nb;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p423xb.InterfaceC13776b;

/* renamed from: nb.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10540g<T> {

    /* renamed from: a */
    private final T f27532a;

    /* renamed from: b */
    private final InterfaceC10543c<T> f27533b;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nb.g$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C10542b implements InterfaceC10543c<Context> {

        /* renamed from: a */
        private final Class<? extends Service> f27534a;

        /* renamed from: b */
        private Bundle m11281b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f27534a), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", this.f27534a + " has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // p247nb.C10540g.InterfaceC10543c
        /* renamed from: c */
        public List<String> mo11279a(Context context) {
            Bundle m11281b = m11281b(context);
            if (m11281b == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : m11281b.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(m11281b.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private C10542b(Class<? extends Service> cls) {
            this.f27534a = cls;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nb.g$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC10543c<T> {
        /* renamed from: a */
        List<String> mo11279a(T t);
    }

    C10540g(T t, InterfaceC10543c<T> interfaceC10543c) {
        this.f27532a = t;
        this.f27533b = interfaceC10543c;
    }

    /* renamed from: c */
    public static C10540g<Context> m11284c(Context context, Class<? extends Service> cls) {
        return new C10540g<>(context, new C10542b(cls));
    }

    /* renamed from: d */
    public static InterfaceC10545i m11283d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (InterfaceC10545i.class.isAssignableFrom(cls)) {
                return (InterfaceC10545i) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new C10563v(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e) {
            throw new C10563v(String.format("Could not instantiate %s.", str), e);
        } catch (InstantiationException e2) {
            throw new C10563v(String.format("Could not instantiate %s.", str), e2);
        } catch (NoSuchMethodException e3) {
            throw new C10563v(String.format("Could not instantiate %s", str), e3);
        } catch (InvocationTargetException e4) {
            throw new C10563v(String.format("Could not instantiate %s", str), e4);
        }
    }

    /* renamed from: b */
    public List<InterfaceC13776b<InterfaceC10545i>> m11285b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f27533b.mo11279a(this.f27532a)) {
            arrayList.add(new InterfaceC13776b() { // from class: nb.f
                @Override // p423xb.InterfaceC13776b
                public final Object get() {
                    InterfaceC10545i m11283d;
                    m11283d = C10540g.m11283d(str);
                    return m11283d;
                }
            });
        }
        return arrayList;
    }
}