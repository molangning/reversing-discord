package androidx.core.app;

import android.os.Bundle;
import android.os.IBinder;

/* renamed from: androidx.core.app.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C0826i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0827a {
        /* renamed from: a */
        static IBinder m38585a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        /* renamed from: b */
        static void m38584b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    /* renamed from: a */
    public static IBinder m38587a(Bundle bundle, String str) {
        return C0827a.m38585a(bundle, str);
    }

    /* renamed from: b */
    public static void m38586b(Bundle bundle, String str, IBinder iBinder) {
        C0827a.m38584b(bundle, str, iBinder);
    }
}