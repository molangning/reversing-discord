package p293q3;

import android.graphics.drawable.Animatable;
import android.util.Log;
import com.facebook.drawee.controller.ControllerListener;
import java.util.ArrayList;
import java.util.List;

/* renamed from: q3.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C11698c<INFO> implements ControllerListener<INFO> {

    /* renamed from: j */
    private final List<ControllerListener<? super INFO>> f30496j = new ArrayList(2);

    /* renamed from: c */
    private synchronized void m7155c(String str, Throwable th2) {
        Log.e("FdingControllerListener", str, th2);
    }

    /* renamed from: a */
    public synchronized void m7157a(ControllerListener<? super INFO> controllerListener) {
        this.f30496j.add(controllerListener);
    }

    /* renamed from: b */
    public synchronized void m7156b() {
        this.f30496j.clear();
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public synchronized void onFailure(String str, Throwable th2) {
        int size = this.f30496j.size();
        for (int i = 0; i < size; i++) {
            try {
                ControllerListener<? super INFO> controllerListener = this.f30496j.get(i);
                if (controllerListener != null) {
                    controllerListener.onFailure(str, th2);
                }
            } catch (Exception e) {
                m7155c("InternalListener exception in onFailure", e);
            }
        }
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public synchronized void onFinalImageSet(String str, INFO info, Animatable animatable) {
        int size = this.f30496j.size();
        for (int i = 0; i < size; i++) {
            try {
                ControllerListener<? super INFO> controllerListener = this.f30496j.get(i);
                if (controllerListener != null) {
                    controllerListener.onFinalImageSet(str, info, animatable);
                }
            } catch (Exception e) {
                m7155c("InternalListener exception in onFinalImageSet", e);
            }
        }
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onIntermediateImageFailed(String str, Throwable th2) {
        int size = this.f30496j.size();
        for (int i = 0; i < size; i++) {
            try {
                ControllerListener<? super INFO> controllerListener = this.f30496j.get(i);
                if (controllerListener != null) {
                    controllerListener.onIntermediateImageFailed(str, th2);
                }
            } catch (Exception e) {
                m7155c("InternalListener exception in onIntermediateImageFailed", e);
            }
        }
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public void onIntermediateImageSet(String str, INFO info) {
        int size = this.f30496j.size();
        for (int i = 0; i < size; i++) {
            try {
                ControllerListener<? super INFO> controllerListener = this.f30496j.get(i);
                if (controllerListener != null) {
                    controllerListener.onIntermediateImageSet(str, info);
                }
            } catch (Exception e) {
                m7155c("InternalListener exception in onIntermediateImageSet", e);
            }
        }
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public synchronized void onRelease(String str) {
        int size = this.f30496j.size();
        for (int i = 0; i < size; i++) {
            try {
                ControllerListener<? super INFO> controllerListener = this.f30496j.get(i);
                if (controllerListener != null) {
                    controllerListener.onRelease(str);
                }
            } catch (Exception e) {
                m7155c("InternalListener exception in onRelease", e);
            }
        }
    }

    @Override // com.facebook.drawee.controller.ControllerListener
    public synchronized void onSubmit(String str, Object obj) {
        int size = this.f30496j.size();
        for (int i = 0; i < size; i++) {
            try {
                ControllerListener<? super INFO> controllerListener = this.f30496j.get(i);
                if (controllerListener != null) {
                    controllerListener.onSubmit(str, obj);
                }
            } catch (Exception e) {
                m7155c("InternalListener exception in onSubmit", e);
            }
        }
    }
}