package com.google.firebase.installations;

import lb.C10117j;

/* renamed from: com.google.firebase.installations.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5051d extends C10117j {

    /* renamed from: j */
    private final EnumC5052a f14252j;

    /* renamed from: com.google.firebase.installations.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC5052a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public C5051d(EnumC5052a enumC5052a) {
        this.f14252j = enumC5052a;
    }

    public C5051d(String str, EnumC5052a enumC5052a) {
        super(str);
        this.f14252j = enumC5052a;
    }
}
