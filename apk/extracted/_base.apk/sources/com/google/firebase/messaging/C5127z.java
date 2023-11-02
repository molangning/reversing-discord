package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.discord.nearby.NearbyManager;
import com.google.android.gms.tasks.C4713b;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.AbstractC5055g;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import lb.C10106d;
import p120gc.InterfaceC6727i;
import p134ha.InterfaceC7043a;
import p386vb.InterfaceC13239k;
import p420x8.C13739c;
import p423xb.InterfaceC13776b;
import p444yb.InterfaceC13969d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5127z {

    /* renamed from: a */
    private final C10106d f14427a;

    /* renamed from: b */
    private final C5080e0 f14428b;

    /* renamed from: c */
    private final C13739c f14429c;

    /* renamed from: d */
    private final InterfaceC13776b<InterfaceC6727i> f14430d;

    /* renamed from: e */
    private final InterfaceC13776b<InterfaceC13239k> f14431e;

    /* renamed from: f */
    private final InterfaceC13969d f14432f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5127z(C10106d c10106d, C5080e0 c5080e0, InterfaceC13776b<InterfaceC6727i> interfaceC13776b, InterfaceC13776b<InterfaceC13239k> interfaceC13776b2, InterfaceC13969d interfaceC13969d) {
        this(c10106d, c5080e0, new C13739c(c10106d.m12296j()), interfaceC13776b, interfaceC13776b2, interfaceC13969d);
    }

    /* renamed from: b */
    private static String m26137b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: c */
    private Task<String> m26136c(Task<Bundle> task) {
        return task.mo27976h(new ExecutorC5082f(), new InterfaceC7043a() { // from class: com.google.firebase.messaging.y
            @Override // p134ha.InterfaceC7043a
            /* renamed from: a */
            public final Object mo1573a(Task task2) {
                String m26131h;
                m26131h = C5127z.this.m26131h(task2);
                return m26131h;
            }
        });
    }

    /* renamed from: d */
    private String m26135d() {
        try {
            return m26137b(MessageDigest.getInstance("SHA-1").digest(this.f14427a.m12294l().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: f */
    private String m26133f(Bundle bundle) {
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if (!"RST".equals(string3)) {
                if (string3 != null) {
                    throw new IOException(string3);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            throw new IOException("INSTANCE_ID_RESET");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static boolean m26132g(String str) {
        if (!"SERVICE_NOT_AVAILABLE".equals(str) && !"INTERNAL_SERVER_ERROR".equals(str) && !"InternalServerError".equals(str)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ String m26131h(Task task) {
        return m26133f((Bundle) task.mo27972l(IOException.class));
    }

    /* renamed from: i */
    private void m26130i(String str, String str2, Bundle bundle) {
        InterfaceC13239k.EnumC13240a mo2988b;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f14427a.m12293m().m12270c());
        bundle.putString("gmsv", Integer.toString(this.f14428b.m26277d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f14428b.m26280a());
        bundle.putString("app_ver_name", this.f14428b.m26279b());
        bundle.putString("firebase-app-name-hash", m26135d());
        try {
            String mo26407b = ((AbstractC5055g) C4713b.m28008a(this.f14432f.mo1056a(false))).mo26407b();
            if (!TextUtils.isEmpty(mo26407b)) {
                bundle.putString("Goog-Firebase-Installations-Auth", mo26407b);
            } else {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) C4713b.m28008a(this.f14432f.getId()));
        bundle.putString("cliv", "fcm-23.0.1");
        InterfaceC13239k interfaceC13239k = this.f14431e.get();
        InterfaceC6727i interfaceC6727i = this.f14430d.get();
        if (interfaceC13239k != null && interfaceC6727i != null && (mo2988b = interfaceC13239k.mo2988b("fire-iid")) != InterfaceC13239k.EnumC13240a.NONE) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(mo2988b.m2987a()));
            bundle.putString("Firebase-Client", interfaceC6727i.mo22028a());
        }
    }

    /* renamed from: j */
    private Task<Bundle> m26129j(String str, String str2, Bundle bundle) {
        try {
            m26130i(str, str2, bundle);
            return this.f14429c.m1606a(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return C4713b.m28005d(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public Task<String> m26134e() {
        return m26136c(m26129j(C5080e0.m26278c(this.f14427a), "*", new Bundle()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public Task<?> m26128k(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return m26136c(m26129j(str, "/topics/" + str2, bundle));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public Task<?> m26127l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", NearbyManager.PERMISSION_DENIED);
        return m26136c(m26129j(str, "/topics/" + str2, bundle));
    }

    C5127z(C10106d c10106d, C5080e0 c5080e0, C13739c c13739c, InterfaceC13776b<InterfaceC6727i> interfaceC13776b, InterfaceC13776b<InterfaceC13239k> interfaceC13776b2, InterfaceC13969d interfaceC13969d) {
        this.f14427a = c10106d;
        this.f14428b = c5080e0;
        this.f14429c = c13739c;
        this.f14430d = interfaceC13776b;
        this.f14431e = interfaceC13776b2;
        this.f14432f = interfaceC13969d;
    }
}
