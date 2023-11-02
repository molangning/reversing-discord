package p333s3;

import android.graphics.drawable.Animatable;
import p293q3.C11696a;

/* renamed from: s3.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12394a extends C11696a {

    /* renamed from: k */
    private long f32195k = -1;

    /* renamed from: l */
    private long f32196l = -1;

    /* renamed from: m */
    private InterfaceC12395b f32197m;

    public C12394a(InterfaceC12395b interfaceC12395b) {
        this.f32197m = interfaceC12395b;
    }

    @Override // p293q3.C11696a, com.facebook.drawee.controller.ControllerListener
    public void onFinalImageSet(String str, Object obj, Animatable animatable) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f32196l = currentTimeMillis;
        InterfaceC12395b interfaceC12395b = this.f32197m;
        if (interfaceC12395b != null) {
            interfaceC12395b.mo5413a(currentTimeMillis - this.f32195k);
        }
    }

    @Override // p293q3.C11696a, com.facebook.drawee.controller.ControllerListener
    public void onSubmit(String str, Object obj) {
        this.f32195k = System.currentTimeMillis();
    }
}