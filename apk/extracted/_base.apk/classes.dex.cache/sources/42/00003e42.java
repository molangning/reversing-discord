package p195k8;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

/* renamed from: k8.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9182l {
    /* renamed from: a */
    private static void m16356a(int i, String str, int i2) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            m16347j(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str);
        }
        GLES20.glAttachShader(i2, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        m16355b();
    }

    /* renamed from: b */
    public static void m16355b() {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                C9197r.m16183c("GlUtil", "glError " + GLU.gluErrorString(glGetError));
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public static int m16354c(String str, String str2) {
        int glCreateProgram = GLES20.glCreateProgram();
        m16355b();
        m16356a(35633, str, glCreateProgram);
        m16356a(35632, str2, glCreateProgram);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            m16347j("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram));
        }
        m16355b();
        return glCreateProgram;
    }

    /* renamed from: d */
    public static int m16353d(String[] strArr, String[] strArr2) {
        return m16354c(TextUtils.join(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, strArr), TextUtils.join(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, strArr2));
    }

    /* renamed from: e */
    public static FloatBuffer m16352e(int i) {
        return ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    /* renamed from: f */
    public static FloatBuffer m16351f(float[] fArr) {
        return (FloatBuffer) m16352e(fArr.length).put(fArr).flip();
    }

    /* renamed from: g */
    public static int m16350g() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        m16355b();
        return iArr[0];
    }

    /* renamed from: h */
    public static boolean m16349h(Context context) {
        String eglQueryString;
        int i = C9191p0.f24171a;
        if (i < 24) {
            return false;
        }
        if (i < 26 && ("samsung".equals(C9191p0.f24173c) || "XT1650".equals(C9191p0.f24174d))) {
            return false;
        }
        if ((i < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) || (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !eglQueryString.contains("EGL_EXT_protected_content")) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m16348i() {
        String eglQueryString;
        if (C9191p0.f24171a < 17 || (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !eglQueryString.contains("EGL_KHR_surfaceless_context")) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private static void m16347j(String str) {
        C9197r.m16183c("GlUtil", str);
    }
}