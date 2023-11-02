package p293q3;

import android.graphics.drawable.Animatable;
import com.facebook.drawee.controller.ControllerListener;

/* renamed from: q3.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11696a<INFO> implements ControllerListener<INFO> {

    /* renamed from: j */
    private static final ControllerListener<Object> f30495j = new C11696a();

    /* renamed from: a */
    public static <INFO> ControllerListener<INFO> m7158a() {
        return (ControllerListener<INFO>) f30495j;
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onFailure(String str, Throwable th2) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onFinalImageSet(String str, INFO info, Animatable animatable) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onIntermediateImageFailed(String str, Throwable th2) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onIntermediateImageSet(String str, INFO info) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onRelease(String str) {
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onSubmit(String str, Object obj) {
    }
}