package p213l8;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;

/* renamed from: l8.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10078j extends GLSurfaceView {

    /* renamed from: j */
    private final C10077i f26263j;

    public C10078j(Context context) {
        this(context, null);
    }

    public InterfaceC10080l getVideoDecoderOutputBufferRenderer() {
        return this.f26263j;
    }

    public C10078j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C10077i c10077i = new C10077i(this);
        this.f26263j = c10077i;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(c10077i);
        setRenderMode(0);
    }
}