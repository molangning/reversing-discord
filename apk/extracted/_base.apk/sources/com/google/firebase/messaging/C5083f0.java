package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.discord.nearby.NearbyManager;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.firebase.messaging.f0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5083f0 {

    /* renamed from: a */
    private final Bundle f14338a;

    public C5083f0(Bundle bundle) {
        if (bundle != null) {
            this.f14338a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    /* renamed from: d */
    private static int m26269d(String str) {
        int parseColor = Color.parseColor(str);
        if (parseColor != -16777216) {
            return parseColor;
        }
        throw new IllegalArgumentException("Transparent color is invalid");
    }

    /* renamed from: s */
    private static boolean m26254s(String str) {
        if (!str.startsWith("google.c.a.") && !str.equals("from")) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public static boolean m26253t(Bundle bundle) {
        if (!NearbyManager.PERMISSION_DENIED.equals(bundle.getString("gcm.n.e")) && !NearbyManager.PERMISSION_DENIED.equals(bundle.getString(m26251v("gcm.n.e")))) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    private static boolean m26252u(String str) {
        if (!str.startsWith("google.c.") && !str.startsWith("gcm.n.") && !str.startsWith("gcm.notification.")) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    private static String m26251v(String str) {
        if (!str.startsWith("gcm.n.")) {
            return str;
        }
        return str.replace("gcm.n.", "gcm.notification.");
    }

    /* renamed from: w */
    private String m26250w(String str) {
        if (!this.f14338a.containsKey(str) && str.startsWith("gcm.n.")) {
            String m26251v = m26251v(str);
            if (this.f14338a.containsKey(m26251v)) {
                return m26251v;
            }
        }
        return str;
    }

    /* renamed from: z */
    private static String m26247z(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    /* renamed from: a */
    public boolean m26272a(String str) {
        String m26257p = m26257p(str);
        if (!NearbyManager.PERMISSION_DENIED.equals(m26257p) && !Boolean.parseBoolean(m26257p)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public Integer m26271b(String str) {
        String m26257p = m26257p(str);
        if (!TextUtils.isEmpty(m26257p)) {
            try {
                return Integer.valueOf(Integer.parseInt(m26257p));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + m26247z(str) + "(" + m26257p + ") into an int");
                return null;
            }
        }
        return null;
    }

    /* renamed from: c */
    public JSONArray m26270c(String str) {
        String m26257p = m26257p(str);
        if (!TextUtils.isEmpty(m26257p)) {
            try {
                return new JSONArray(m26257p);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + m26247z(str) + ": " + m26257p + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int[] m26268e() {
        JSONArray m26270c = m26270c("gcm.n.light_settings");
        if (m26270c == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (m26270c.length() == 3) {
                iArr[0] = m26269d(m26270c.optString(0));
                iArr[1] = m26270c.optInt(1);
                iArr[2] = m26270c.optInt(2);
                return iArr;
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (IllegalArgumentException e) {
            Log.w("NotificationParams", "LightSettings is invalid: " + m26270c + ". " + e.getMessage() + ". Skipping setting LightSettings");
            return null;
        } catch (JSONException unused) {
            Log.w("NotificationParams", "LightSettings is invalid: " + m26270c + ". Skipping setting LightSettings");
            return null;
        }
    }

    /* renamed from: f */
    public Uri m26267f() {
        String m26257p = m26257p("gcm.n.link_android");
        if (TextUtils.isEmpty(m26257p)) {
            m26257p = m26257p("gcm.n.link");
        }
        if (!TextUtils.isEmpty(m26257p)) {
            return Uri.parse(m26257p);
        }
        return null;
    }

    /* renamed from: g */
    public Object[] m26266g(String str) {
        JSONArray m26270c = m26270c(str + "_loc_args");
        if (m26270c == null) {
            return null;
        }
        int length = m26270c.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = m26270c.optString(i);
        }
        return strArr;
    }

    /* renamed from: h */
    public String m26265h(String str) {
        return m26257p(str + "_loc_key");
    }

    /* renamed from: i */
    public String m26264i(Resources resources, String str, String str2) {
        String m26265h = m26265h(str2);
        if (TextUtils.isEmpty(m26265h)) {
            return null;
        }
        int identifier = resources.getIdentifier(m26265h, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", m26247z(str2 + "_loc_key") + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        Object[] m26266g = m26266g(str2);
        if (m26266g == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, m26266g);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + m26247z(str2) + ": " + Arrays.toString(m26266g) + " Default value will be used.", e);
            return null;
        }
    }

    /* renamed from: j */
    public Long m26263j(String str) {
        String m26257p = m26257p(str);
        if (!TextUtils.isEmpty(m26257p)) {
            try {
                return Long.valueOf(Long.parseLong(m26257p));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + m26247z(str) + "(" + m26257p + ") into a long");
                return null;
            }
        }
        return null;
    }

    /* renamed from: k */
    public String m26262k() {
        return m26257p("gcm.n.android_channel_id");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public Integer m26261l() {
        Integer m26271b = m26271b("gcm.n.notification_count");
        if (m26271b == null) {
            return null;
        }
        if (m26271b.intValue() < 0) {
            Log.w("FirebaseMessaging", "notificationCount is invalid: " + m26271b + ". Skipping setting notificationCount.");
            return null;
        }
        return m26271b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public Integer m26260m() {
        Integer m26271b = m26271b("gcm.n.notification_priority");
        if (m26271b == null) {
            return null;
        }
        if (m26271b.intValue() >= -2 && m26271b.intValue() <= 2) {
            return m26271b;
        }
        Log.w("FirebaseMessaging", "notificationPriority is invalid " + m26271b + ". Skipping setting notificationPriority.");
        return null;
    }

    /* renamed from: n */
    public String m26259n(Resources resources, String str, String str2) {
        String m26257p = m26257p(str2);
        if (!TextUtils.isEmpty(m26257p)) {
            return m26257p;
        }
        return m26264i(resources, str, str2);
    }

    /* renamed from: o */
    public String m26258o() {
        String m26257p = m26257p("gcm.n.sound2");
        if (TextUtils.isEmpty(m26257p)) {
            return m26257p("gcm.n.sound");
        }
        return m26257p;
    }

    /* renamed from: p */
    public String m26257p(String str) {
        return this.f14338a.getString(m26250w(str));
    }

    /* renamed from: q */
    public long[] m26256q() {
        JSONArray m26270c = m26270c("gcm.n.vibrate_timings");
        if (m26270c == null) {
            return null;
        }
        try {
            if (m26270c.length() > 1) {
                int length = m26270c.length();
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = m26270c.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + m26270c + ". Skipping setting vibrateTimings.");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public Integer m26255r() {
        Integer m26271b = m26271b("gcm.n.visibility");
        if (m26271b == null) {
            return null;
        }
        if (m26271b.intValue() >= -1 && m26271b.intValue() <= 1) {
            return m26271b;
        }
        Log.w("NotificationParams", "visibility is invalid: " + m26271b + ". Skipping setting visibility.");
        return null;
    }

    /* renamed from: x */
    public Bundle m26249x() {
        Bundle bundle = new Bundle(this.f14338a);
        for (String str : this.f14338a.keySet()) {
            if (!m26254s(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* renamed from: y */
    public Bundle m26248y() {
        Bundle bundle = new Bundle(this.f14338a);
        for (String str : this.f14338a.keySet()) {
            if (m26252u(str)) {
                bundle.remove(str);
            }
        }
        return bundle;
    }
}
