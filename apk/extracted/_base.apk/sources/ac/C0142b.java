package ac;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import lb.C10106d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ac.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C0142b {

    /* renamed from: c */
    private static final String[] f535c = {"*", "FCM", "GCM", ""};

    /* renamed from: a */
    private final SharedPreferences f536a;

    /* renamed from: b */
    private final String f537b;

    public C0142b(C10106d c10106d) {
        this.f536a = c10106d.m12296j().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f537b = m41110b(c10106d);
    }

    /* renamed from: a */
    private String m41111a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    /* renamed from: b */
    private static String m41110b(C10106d c10106d) {
        String m12269d = c10106d.m12293m().m12269d();
        if (m12269d != null) {
            return m12269d;
        }
        String m12270c = c10106d.m12293m().m12270c();
        if (!m12270c.startsWith("1:") && !m12270c.startsWith("2:")) {
            return m12270c;
        }
        String[] split = m12270c.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: c */
    private static String m41109c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: d */
    private String m41108d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private PublicKey m41107e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.w("ContentValues", "Invalid key stored " + e);
            return null;
        }
    }

    /* renamed from: g */
    private String m41105g() {
        String string;
        synchronized (this.f536a) {
            string = this.f536a.getString("|S|id", null);
        }
        return string;
    }

    /* renamed from: h */
    private String m41104h() {
        synchronized (this.f536a) {
            String string = this.f536a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            PublicKey m41107e = m41107e(string);
            if (m41107e == null) {
                return null;
            }
            return m41109c(m41107e);
        }
    }

    /* renamed from: f */
    public String m41106f() {
        synchronized (this.f536a) {
            String m41105g = m41105g();
            if (m41105g != null) {
                return m41105g;
            }
            return m41104h();
        }
    }

    /* renamed from: i */
    public String m41103i() {
        synchronized (this.f536a) {
            for (String str : f535c) {
                String string = this.f536a.getString(m41111a(this.f537b, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith("{")) {
                        string = m41108d(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }
}
