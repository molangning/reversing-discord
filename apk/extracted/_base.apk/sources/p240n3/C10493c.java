package p240n3;

import p416x4.C13686a;

/* renamed from: n3.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10493c extends C13686a {

    /* renamed from: a */
    private String f27380a;

    /* renamed from: b */
    private final InterfaceC10492b f27381b;

    public C10493c(String str, InterfaceC10492b interfaceC10492b) {
        this.f27381b = interfaceC10492b;
        m11397a(str);
    }

    /* renamed from: a */
    public void m11397a(String str) {
        this.f27380a = str;
    }

    @Override // p416x4.C13686a, com.facebook.imagepipeline.producers.InterfaceC3822o0
    public void onUltimateProducerReached(String str, String str2, boolean z) {
        InterfaceC10492b interfaceC10492b = this.f27381b;
        if (interfaceC10492b != null) {
            interfaceC10492b.mo9414a(this.f27380a, C10494d.m11396a(str2), z, str2);
        }
    }
}
