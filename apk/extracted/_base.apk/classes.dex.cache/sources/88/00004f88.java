package p384v8;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import p029b9.C2198p;

/* renamed from: v8.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13144c {

    /* renamed from: c */
    private static final Lock f34161c = new ReentrantLock();

    /* renamed from: d */
    private static C13144c f34162d;

    /* renamed from: a */
    private final Lock f34163a = new ReentrantLock();

    /* renamed from: b */
    private final SharedPreferences f34164b;

    C13144c(Context context) {
        this.f34164b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* renamed from: b */
    public static C13144c m3101b(Context context) {
        C2198p.m33985j(context);
        Lock lock = f34161c;
        lock.lock();
        try {
            if (f34162d == null) {
                f34162d = new C13144c(context.getApplicationContext());
            }
            C13144c c13144c = f34162d;
            lock.unlock();
            return c13144c;
        } catch (Throwable th2) {
            f34161c.unlock();
            throw th2;
        }
    }

    /* renamed from: i */
    private static final String m3094i(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(":");
        sb2.append(str2);
        return sb2.toString();
    }

    /* renamed from: a */
    public void m3102a() {
        this.f34163a.lock();
        try {
            this.f34164b.edit().clear().apply();
        } finally {
            this.f34163a.unlock();
        }
    }

    /* renamed from: c */
    public GoogleSignInAccount m3100c() {
        String m3096g;
        String m3096g2 = m3096g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(m3096g2) || (m3096g = m3096g(m3094i("googleSignInAccount", m3096g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m28293V(m3096g);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public GoogleSignInOptions m3099d() {
        String m3096g;
        String m3096g2 = m3096g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(m3096g2) || (m3096g = m3096g(m3094i("googleSignInOptions", m3096g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.m28281U(m3096g);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    public String m3098e() {
        return m3096g("refreshToken");
    }

    /* renamed from: f */
    public void m3097f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        C2198p.m33985j(googleSignInAccount);
        C2198p.m33985j(googleSignInOptions);
        m3095h("defaultGoogleSignInAccount", googleSignInAccount.m28292W());
        C2198p.m33985j(googleSignInAccount);
        C2198p.m33985j(googleSignInOptions);
        String m28292W = googleSignInAccount.m28292W();
        m3095h(m3094i("googleSignInAccount", m28292W), googleSignInAccount.m28291X());
        m3095h(m3094i("googleSignInOptions", m28292W), googleSignInOptions.m28277Y());
    }

    /* renamed from: g */
    protected final String m3096g(String str) {
        this.f34163a.lock();
        try {
            return this.f34164b.getString(str, null);
        } finally {
            this.f34163a.unlock();
        }
    }

    /* renamed from: h */
    protected final void m3095h(String str, String str2) {
        this.f34163a.lock();
        try {
            this.f34164b.edit().putString(str, str2).apply();
        } finally {
            this.f34163a.unlock();
        }
    }
}