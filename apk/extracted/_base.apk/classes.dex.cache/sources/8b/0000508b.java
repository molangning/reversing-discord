package p397w5;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: w5.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C13403k implements InterfaceC13395e {

    /* renamed from: a */
    private final C13404a f34488a;

    /* renamed from: b */
    private final C13401i f34489b;

    /* renamed from: c */
    private final Map<String, InterfaceC13406m> f34490c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w5.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C13404a {

        /* renamed from: a */
        private final Context f34491a;

        /* renamed from: b */
        private Map<String, String> f34492b = null;

        C13404a(Context context) {
            this.f34491a = context;
        }

        /* renamed from: a */
        private Map<String, String> m2635a(Context context) {
            Bundle m2632d = m2632d(context);
            if (m2632d == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str : m2632d.keySet()) {
                Object obj = m2632d.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String trim = str2.trim();
                        if (!trim.isEmpty()) {
                            hashMap.put(trim, str.substring(8));
                        }
                    }
                }
            }
            return hashMap;
        }

        /* renamed from: c */
        private Map<String, String> m2633c() {
            if (this.f34492b == null) {
                this.f34492b = m2635a(this.f34491a);
            }
            return this.f34492b;
        }

        /* renamed from: d */
        private static Bundle m2632d(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        /* renamed from: b */
        InterfaceC13394d m2634b(String str) {
            String str2 = m2633c().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (InterfaceC13394d) Class.forName(str2).asSubclass(InterfaceC13394d.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str2), e);
                return null;
            } catch (IllegalAccessException e2) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e2);
                return null;
            } catch (InstantiationException e3) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str2), e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str2), e5);
                return null;
            }
        }
    }

    public C13403k(Context context, C13401i c13401i) {
        this(new C13404a(context), c13401i);
    }

    @Override // p397w5.InterfaceC13395e
    /* renamed from: a */
    public synchronized InterfaceC13406m mo2636a(String str) {
        if (this.f34490c.containsKey(str)) {
            return this.f34490c.get(str);
        }
        InterfaceC13394d m2634b = this.f34488a.m2634b(str);
        if (m2634b == null) {
            return null;
        }
        InterfaceC13406m create = m2634b.create(this.f34489b.m2640a(str));
        this.f34490c.put(str, create);
        return create;
    }

    C13403k(C13404a c13404a, C13401i c13401i) {
        this.f34490c = new HashMap();
        this.f34488a = c13404a;
        this.f34489b = c13401i;
    }
}