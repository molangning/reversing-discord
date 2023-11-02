package com.facebook.imagepipeline.nativecode;

/* renamed from: com.facebook.imagepipeline.nativecode.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C3744j {

    /* renamed from: a */
    private static InterfaceC3743i f10534a = null;

    /* renamed from: b */
    public static boolean f10535b = false;

    static {
        try {
            f10534a = (InterfaceC3743i) WebpTranscoderImpl.class.newInstance();
            f10535b = true;
        } catch (Throwable unused) {
            f10535b = false;
        }
    }

    /* renamed from: a */
    public static InterfaceC3743i m30936a() {
        return f10534a;
    }
}