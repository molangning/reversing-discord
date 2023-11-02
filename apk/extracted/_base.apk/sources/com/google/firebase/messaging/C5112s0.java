package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.s0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5112s0 {

    /* renamed from: a */
    private final SharedPreferences f14379a;

    /* renamed from: b */
    private final String f14380b;

    /* renamed from: c */
    private final String f14381c;

    /* renamed from: e */
    private final Executor f14383e;

    /* renamed from: d */
    final ArrayDeque<String> f14382d = new ArrayDeque<>();

    /* renamed from: f */
    private boolean f14384f = false;

    private C5112s0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f14379a = sharedPreferences;
        this.f14380b = str;
        this.f14381c = str2;
        this.f14383e = executor;
    }

    /* renamed from: b */
    private boolean m26187b(boolean z) {
        if (z && !this.f14384f) {
            m26180i();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static C5112s0 m26186c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        C5112s0 c5112s0 = new C5112s0(sharedPreferences, str, str2, executor);
        c5112s0.m26185d();
        return c5112s0;
    }

    /* renamed from: d */
    private void m26185d() {
        synchronized (this.f14382d) {
            this.f14382d.clear();
            String string = this.f14379a.getString(this.f14380b, "");
            if (!TextUtils.isEmpty(string) && string.contains(this.f14381c)) {
                String[] split = string.split(this.f14381c, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f14382d.add(str);
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public void m26181h() {
        synchronized (this.f14382d) {
            this.f14379a.edit().putString(this.f14380b, m26182g()).commit();
        }
    }

    /* renamed from: i */
    private void m26180i() {
        this.f14383e.execute(new Runnable() { // from class: com.google.firebase.messaging.r0
            @Override // java.lang.Runnable
            public final void run() {
                C5112s0.this.m26181h();
            }
        });
    }

    /* renamed from: e */
    public String m26184e() {
        String peek;
        synchronized (this.f14382d) {
            peek = this.f14382d.peek();
        }
        return peek;
    }

    /* renamed from: f */
    public boolean m26183f(Object obj) {
        boolean m26187b;
        synchronized (this.f14382d) {
            m26187b = m26187b(this.f14382d.remove(obj));
        }
        return m26187b;
    }

    /* renamed from: g */
    public String m26182g() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = this.f14382d.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(this.f14381c);
        }
        return sb2.toString();
    }
}
