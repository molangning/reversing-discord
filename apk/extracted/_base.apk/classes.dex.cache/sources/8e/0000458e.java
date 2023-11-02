package p256o3;

import com.facebook.imagepipeline.request.ImageRequest;
import p056d3.InterfaceC5739b;
import p240n3.C10499i;
import p416x4.C13686a;

/* renamed from: o3.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10981c extends C13686a {

    /* renamed from: a */
    private final InterfaceC5739b f28777a;

    /* renamed from: b */
    private final C10499i f28778b;

    public C10981c(InterfaceC5739b interfaceC5739b, C10499i c10499i) {
        this.f28777a = interfaceC5739b;
        this.f28778b = c10499i;
    }

    @Override // p416x4.C13686a, com.facebook.imagepipeline.listener.RequestListener
    public void onRequestCancellation(String str) {
        this.f28778b.m11364r(this.f28777a.now());
        this.f28778b.m11358x(str);
    }

    @Override // p416x4.C13686a, com.facebook.imagepipeline.listener.RequestListener
    public void onRequestFailure(ImageRequest imageRequest, String str, Throwable th2, boolean z) {
        this.f28778b.m11364r(this.f28777a.now());
        this.f28778b.m11365q(imageRequest);
        this.f28778b.m11358x(str);
        this.f28778b.m11359w(z);
    }

    @Override // p416x4.C13686a, com.facebook.imagepipeline.listener.RequestListener
    public void onRequestStart(ImageRequest imageRequest, Object obj, String str, boolean z) {
        this.f28778b.m11363s(this.f28777a.now());
        this.f28778b.m11365q(imageRequest);
        this.f28778b.m11378d(obj);
        this.f28778b.m11358x(str);
        this.f28778b.m11359w(z);
    }

    @Override // p416x4.C13686a, com.facebook.imagepipeline.listener.RequestListener
    public void onRequestSuccess(ImageRequest imageRequest, String str, boolean z) {
        this.f28778b.m11364r(this.f28777a.now());
        this.f28778b.m11365q(imageRequest);
        this.f28778b.m11358x(str);
        this.f28778b.m11359w(z);
    }
}