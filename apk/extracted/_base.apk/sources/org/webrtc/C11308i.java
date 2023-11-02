package org.webrtc;

import android.content.Context;
import android.graphics.Matrix;
import android.view.WindowManager;
import org.webrtc.VideoFrame;

/* renamed from: org.webrtc.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final /* synthetic */ class C11308i {
    /* renamed from: a */
    public static VideoFrame.TextureBuffer m8305a(TextureBufferImpl textureBufferImpl, boolean z, int i) {
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        if (z) {
            matrix.preScale(-1.0f, 1.0f);
        }
        matrix.preRotate(i);
        matrix.preTranslate(-0.5f, -0.5f);
        return textureBufferImpl.applyTransformMatrix(matrix, textureBufferImpl.getWidth(), textureBufferImpl.getHeight());
    }

    /* renamed from: b */
    public static int m8304b(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation != 1) {
            if (rotation != 2) {
                if (rotation != 3) {
                    return 0;
                }
                return 270;
            }
            return 180;
        }
        return 90;
    }
}
