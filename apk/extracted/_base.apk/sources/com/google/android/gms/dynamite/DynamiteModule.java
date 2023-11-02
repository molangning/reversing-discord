package com.google.android.gms.dynamite;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import p029b9.C2190n;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class DynamiteModule {

    /* renamed from: g */
    private static final ThreadLocal<Object> f12794g = new ThreadLocal<>();

    /* renamed from: h */
    private static final ThreadLocal<Long> f12795h = new C4658a();

    /* renamed from: i */
    private static final InterfaceC4656a.InterfaceC4657a f12796i = new C4659b();

    /* renamed from: a */
    public static final InterfaceC4656a f12788a = new C4660c();

    /* renamed from: b */
    public static final InterfaceC4656a f12789b = new C4661d();

    /* renamed from: c */
    public static final InterfaceC4656a f12790c = new C4662e();

    /* renamed from: d */
    public static final InterfaceC4656a f12791d = new C4663f();

    /* renamed from: e */
    public static final InterfaceC4656a f12792e = new C4664g();

    /* renamed from: f */
    public static final InterfaceC4656a f12793f = new C4665h();

    /* renamed from: j */
    public static final InterfaceC4656a f12797j = new C4666i();

    @DynamiteApi
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4656a {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public interface InterfaceC4657a {
        }
    }

    /* renamed from: a */
    public static int m28058a(Context context, String str) {
        String str2;
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 61);
            sb2.append("com.google.android.gms.dynamite.descriptors.");
            sb2.append(str);
            sb2.append(".");
            sb2.append("ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb2.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!C2190n.m34004b(declaredField.get(null), str)) {
                String valueOf = String.valueOf(declaredField.get(null));
                StringBuilder sb3 = new StringBuilder(valueOf.length() + 51 + String.valueOf(str).length());
                sb3.append("Module descriptor id '");
                sb3.append(valueOf);
                sb3.append("' didn't match expected id '");
                sb3.append(str);
                sb3.append("'");
                Log.e("DynamiteModule", sb3.toString());
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 45);
            sb4.append("Local module descriptor class for ");
            sb4.append(str);
            sb4.append(" not found.");
            Log.w("DynamiteModule", sb4.toString());
            return 0;
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                str2 = "Failed to load module descriptor class: ".concat(valueOf2);
            } else {
                str2 = new String("Failed to load module descriptor class: ");
            }
            Log.e("DynamiteModule", str2);
            return 0;
        }
    }
}
