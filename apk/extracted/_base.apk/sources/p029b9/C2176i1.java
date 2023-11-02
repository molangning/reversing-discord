package p029b9;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* renamed from: b9.i1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2176i1 {

    /* renamed from: f */
    private static final Uri f6146f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a */
    private final String f6147a;

    /* renamed from: b */
    private final String f6148b;

    /* renamed from: c */
    private final ComponentName f6149c;

    /* renamed from: d */
    private final int f6150d;

    /* renamed from: e */
    private final boolean f6151e;

    public C2176i1(String str, String str2, int i, boolean z) {
        C2198p.m33989f(str);
        this.f6147a = str;
        C2198p.m33989f(str2);
        this.f6148b = str2;
        this.f6149c = null;
        this.f6150d = i;
        this.f6151e = z;
    }

    /* renamed from: a */
    public final int m34030a() {
        return this.f6150d;
    }

    /* renamed from: b */
    public final ComponentName m34029b() {
        return this.f6149c;
    }

    /* renamed from: c */
    public final Intent m34028c(Context context) {
        Bundle bundle;
        String str;
        if (this.f6147a != null) {
            Intent intent = null;
            if (this.f6151e) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", this.f6147a);
                try {
                    bundle = context.getContentResolver().call(f6146f, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                    bundle = null;
                }
                if (bundle != null) {
                    intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                }
                if (intent == null) {
                    String valueOf = String.valueOf(this.f6147a);
                    if (valueOf.length() != 0) {
                        str = "Dynamic lookup for intent failed for action: ".concat(valueOf);
                    } else {
                        str = new String("Dynamic lookup for intent failed for action: ");
                    }
                    Log.w("ConnectionStatusConfig", str);
                }
            }
            if (intent == null) {
                return new Intent(this.f6147a).setPackage(this.f6148b);
            }
            return intent;
        }
        return new Intent().setComponent(this.f6149c);
    }

    /* renamed from: d */
    public final String m34027d() {
        return this.f6148b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2176i1)) {
            return false;
        }
        C2176i1 c2176i1 = (C2176i1) obj;
        if (C2190n.m34004b(this.f6147a, c2176i1.f6147a) && C2190n.m34004b(this.f6148b, c2176i1.f6148b) && C2190n.m34004b(this.f6149c, c2176i1.f6149c) && this.f6150d == c2176i1.f6150d && this.f6151e == c2176i1.f6151e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C2190n.m34003c(this.f6147a, this.f6148b, this.f6149c, Integer.valueOf(this.f6150d), Boolean.valueOf(this.f6151e));
    }

    public final String toString() {
        String str = this.f6147a;
        if (str == null) {
            C2198p.m33985j(this.f6149c);
            return this.f6149c.flattenToString();
        }
        return str;
    }
}
