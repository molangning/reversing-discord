package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.TopicOperation;
import java.util.regex.Pattern;
import p029b9.C2190n;

/* renamed from: com.google.firebase.messaging.v0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C5120v0 {

    /* renamed from: d */
    private static final Pattern f14403d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a */
    private final String f14404a;

    /* renamed from: b */
    private final String f14405b;

    /* renamed from: c */
    private final String f14406c;

    private C5120v0(@TopicOperation.TopicOperations String str, String str2) {
        this.f14404a = m26161d(str2, str);
        this.f14405b = str;
        this.f14406c = str + "!" + str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C5120v0 m26164a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new C5120v0(split[0], split[1]);
    }

    /* renamed from: d */
    private static String m26161d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str != null && f14403d.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
    }

    /* renamed from: b */
    public String m26163b() {
        return this.f14405b;
    }

    /* renamed from: c */
    public String m26162c() {
        return this.f14404a;
    }

    /* renamed from: e */
    public String m26160e() {
        return this.f14406c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5120v0)) {
            return false;
        }
        C5120v0 c5120v0 = (C5120v0) obj;
        if (!this.f14404a.equals(c5120v0.f14404a) || !this.f14405b.equals(c5120v0.f14405b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C2190n.m34003c(this.f14405b, this.f14404a);
    }
}
