package org.webrtc;

import javax.microedition.khronos.egl.EGLContext;
import org.webrtc.EglBase;
import org.webrtc.EglBase10;
import org.webrtc.EglBase14;

/* renamed from: org.webrtc.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final /* synthetic */ class C11326o {
    static {
        Object obj = EglBase.lock;
    }

    /* renamed from: a */
    public static EglBase.ConfigBuilder m8292a() {
        return new EglBase.ConfigBuilder();
    }

    /* renamed from: b */
    public static EglBase m8291b() {
        return m8289d(null, EglBase.CONFIG_PLAIN);
    }

    /* renamed from: c */
    public static EglBase m8290c(EglBase.Context context) {
        return m8289d(context, EglBase.CONFIG_PLAIN);
    }

    /* renamed from: d */
    public static EglBase m8289d(EglBase.Context context, int[] iArr) {
        if (context == null) {
            return m8283j(iArr);
        }
        if (context instanceof EglBase14.Context) {
            return m8284i((EglBase14.Context) context, iArr);
        }
        if (context instanceof EglBase10.Context) {
            return m8287f((EglBase10.Context) context, iArr);
        }
        throw new IllegalArgumentException("Unrecognized Context");
    }

    /* renamed from: e */
    public static EglBase10 m8288e(EGLContext eGLContext, int[] iArr) {
        return new EglBase10Impl(eGLContext, iArr);
    }

    /* renamed from: f */
    public static EglBase10 m8287f(EglBase10.Context context, int[] iArr) {
        EGLContext rawContext;
        if (context == null) {
            rawContext = null;
        } else {
            rawContext = context.getRawContext();
        }
        return new EglBase10Impl(rawContext, iArr);
    }

    /* renamed from: g */
    public static EglBase10 m8286g(int[] iArr) {
        return new EglBase10Impl(null, iArr);
    }

    /* renamed from: h */
    public static EglBase14 m8285h(android.opengl.EGLContext eGLContext, int[] iArr) {
        return new EglBase14Impl(eGLContext, iArr);
    }

    /* renamed from: i */
    public static EglBase14 m8284i(EglBase14.Context context, int[] iArr) {
        android.opengl.EGLContext rawContext;
        if (context == null) {
            rawContext = null;
        } else {
            rawContext = context.getRawContext();
        }
        return new EglBase14Impl(rawContext, iArr);
    }

    /* renamed from: j */
    public static EglBase14 m8283j(int[] iArr) {
        return new EglBase14Impl(null, iArr);
    }

    /* renamed from: k */
    public static int m8282k(int[] iArr) {
        for (int i = 0; i < iArr.length - 1; i++) {
            if (iArr[i] == 12352) {
                int i2 = iArr[i + 1];
                if (i2 != 4) {
                    if (i2 != 64) {
                        return 1;
                    }
                    return 3;
                }
                return 2;
            }
        }
        return 1;
    }
}