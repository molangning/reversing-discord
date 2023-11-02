package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.C0946a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.messaging.t0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C5114t0 {

    /* renamed from: a */
    final SharedPreferences f14388a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.messaging.t0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C5115a {

        /* renamed from: d */
        private static final long f14389d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a */
        final String f14390a;

        /* renamed from: b */
        final String f14391b;

        /* renamed from: c */
        final long f14392c;

        private C5115a(String str, String str2, long j) {
            this.f14390a = str;
            this.f14391b = str2;
            this.f14392c = j;
        }

        /* renamed from: a */
        static String m26173a(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e);
                return null;
            }
        }

        /* renamed from: c */
        static C5115a m26171c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (str.startsWith("{")) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    return new C5115a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
                } catch (JSONException e) {
                    Log.w("FirebaseMessaging", "Failed to parse token: " + e);
                    return null;
                }
            }
            return new C5115a(str, null, 0L);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public boolean m26172b(String str) {
            if (System.currentTimeMillis() <= this.f14392c + f14389d && str.equals(this.f14391b)) {
                return false;
            }
            return true;
        }
    }

    public C5114t0(Context context) {
        this.f14388a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        m26179a(context, "com.google.android.gms.appid-no-backup");
    }

    /* renamed from: a */
    private void m26179a(Context context, String str) {
        File file = new File(C0946a.m38396h(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile() && !m26175e()) {
                Log.i("FirebaseMessaging", "App restored, clearing state");
                m26177c();
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    /* renamed from: b */
    private String m26178b(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    /* renamed from: c */
    public synchronized void m26177c() {
        this.f14388a.edit().clear().commit();
    }

    /* renamed from: d */
    public synchronized C5115a m26176d(String str, String str2) {
        return C5115a.m26171c(this.f14388a.getString(m26178b(str, str2), null));
    }

    /* renamed from: e */
    public synchronized boolean m26175e() {
        return this.f14388a.getAll().isEmpty();
    }

    /* renamed from: f */
    public synchronized void m26174f(String str, String str2, String str3, String str4) {
        String m26173a = C5115a.m26173a(str3, str4, System.currentTimeMillis());
        if (m26173a == null) {
            return;
        }
        SharedPreferences.Editor edit = this.f14388a.edit();
        edit.putString(m26178b(str, str2), m26173a);
        edit.commit();
    }
}
