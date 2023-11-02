package td;

import android.opengl.GLES20;
import android.util.Log;

/* renamed from: td.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12661f {

    /* renamed from: a */
    private static final String f32819a = "f";

    /* renamed from: a */
    public static void m4594a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        String str2 = f32819a;
        Log.e(str2, str + ": glError " + glGetError);
        throw new RuntimeException(str + ": glError " + glGetError);
    }

    /* renamed from: b */
    public static int m4593b(int i, int i2) {
        int glCreateProgram = GLES20.glCreateProgram();
        m4594a("glCreateProgram");
        if (glCreateProgram == 0) {
            Log.e(f32819a, "Could not create glProgram");
        }
        GLES20.glAttachShader(glCreateProgram, i);
        m4594a("glAttachShader");
        GLES20.glAttachShader(glCreateProgram, i2);
        m4594a("glAttachShader");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            String str = f32819a;
            Log.e(str, "Could not link glProgram: ");
            Log.e(str, GLES20.glGetProgramInfoLog(glCreateProgram));
            GLES20.glDeleteProgram(glCreateProgram);
            return 0;
        }
        return glCreateProgram;
    }

    /* renamed from: c */
    public static int m4592c(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        m4594a("glCreateShader type=" + i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            String str2 = f32819a;
            Log.e(str2, "Could not compile shader " + i + ":");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" ");
            sb2.append(GLES20.glGetShaderInfoLog(glCreateShader));
            Log.e(str2, sb2.toString());
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }
}
