package p384v8;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: v8.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13157p {

    /* renamed from: d */
    private static C13157p f34174d;

    /* renamed from: a */
    final C13144c f34175a;

    /* renamed from: b */
    GoogleSignInAccount f34176b;

    /* renamed from: c */
    GoogleSignInOptions f34177c;

    private C13157p(Context context) {
        C13144c m3101b = C13144c.m3101b(context);
        this.f34175a = m3101b;
        this.f34176b = m3101b.m3100c();
        this.f34177c = m3101b.m3099d();
    }

    /* renamed from: a */
    public static synchronized C13157p m3084a(Context context) {
        C13157p m3081d;
        synchronized (C13157p.class) {
            m3081d = m3081d(context.getApplicationContext());
        }
        return m3081d;
    }

    /* renamed from: d */
    private static synchronized C13157p m3081d(Context context) {
        synchronized (C13157p.class) {
            C13157p c13157p = f34174d;
            if (c13157p != null) {
                return c13157p;
            }
            C13157p c13157p2 = new C13157p(context);
            f34174d = c13157p2;
            return c13157p2;
        }
    }

    /* renamed from: b */
    public final synchronized void m3083b() {
        this.f34175a.m3102a();
        this.f34176b = null;
        this.f34177c = null;
    }

    /* renamed from: c */
    public final synchronized void m3082c(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        this.f34175a.m3097f(googleSignInAccount, googleSignInOptions);
        this.f34176b = googleSignInAccount;
        this.f34177c = googleSignInOptions;
    }
}