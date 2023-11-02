package com.android.billingclient.api;

import android.text.TextUtils;
import p331s1.C12370i0;

/* renamed from: com.android.billingclient.api.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C2752t {

    /* renamed from: a */
    private String f7412a;

    public /* synthetic */ C2752t(C12370i0 c12370i0) {
    }

    /* renamed from: a */
    public final C2752t m32452a(String str) {
        this.f7412a = str;
        return this;
    }

    /* renamed from: b */
    public final C2753u m32451b() {
        if (!TextUtils.isEmpty(this.f7412a)) {
            return new C2753u(this.f7412a, null, null, 0, null);
        }
        throw new IllegalArgumentException("SKU must be set.");
    }
}