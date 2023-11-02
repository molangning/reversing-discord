package com.facebook.imagepipeline.nativecode;

import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import java.io.InputStream;
import java.io.OutputStream;
import p025b5.C2122a;
import p025b5.C2123b;
import p025b5.C2126e;
import p025b5.InterfaceC2124c;
import p170j4.C8792b;
import p170j4.C8793c;
import p380v4.C13065e;
import p394w2.C13368b;
import p394w2.C13379j;
import p394w2.InterfaceC13370d;

@InterfaceC13370d
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class NativeJpegTranscoder implements InterfaceC2124c {

    /* renamed from: a */
    private boolean f10525a;

    /* renamed from: b */
    private int f10526b;

    /* renamed from: c */
    private boolean f10527c;

    public NativeJpegTranscoder(boolean z, int i, boolean z2, boolean z3) {
        this.f10525a = z;
        this.f10526b = i;
        this.f10527c = z2;
        if (z3) {
            C3741g.m30941a();
        }
    }

    /* renamed from: e */
    public static void m30949e(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C3741g.m30941a();
        boolean z5 = false;
        if (i2 >= 1) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2682b(Boolean.valueOf(z));
        if (i2 <= 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13379j.m2682b(Boolean.valueOf(z2));
        if (i3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C13379j.m2682b(Boolean.valueOf(z3));
        if (i3 <= 100) {
            z4 = true;
        } else {
            z4 = false;
        }
        C13379j.m2682b(Boolean.valueOf(z4));
        C13379j.m2682b(Boolean.valueOf(C2126e.m34153j(i)));
        if (i2 != 8 || i != 0) {
            z5 = true;
        }
        C13379j.m2681c(z5, "no transformation requested");
        nativeTranscodeJpeg((InputStream) C13379j.m2677g(inputStream), (OutputStream) C13379j.m2677g(outputStream), i, i2, i3);
    }

    /* renamed from: f */
    public static void m30948f(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C3741g.m30941a();
        boolean z5 = false;
        if (i2 >= 1) {
            z = true;
        } else {
            z = false;
        }
        C13379j.m2682b(Boolean.valueOf(z));
        if (i2 <= 16) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13379j.m2682b(Boolean.valueOf(z2));
        if (i3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C13379j.m2682b(Boolean.valueOf(z3));
        if (i3 <= 100) {
            z4 = true;
        } else {
            z4 = false;
        }
        C13379j.m2682b(Boolean.valueOf(z4));
        C13379j.m2682b(Boolean.valueOf(C2126e.m34154i(i)));
        if (i2 != 8 || i != 1) {
            z5 = true;
        }
        C13379j.m2681c(z5, "no transformation requested");
        nativeTranscodeJpegWithExifOrientation((InputStream) C13379j.m2677g(inputStream), (OutputStream) C13379j.m2677g(outputStream), i, i2, i3);
    }

    @InterfaceC13370d
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);

    @InterfaceC13370d
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);

    @Override // p025b5.InterfaceC2124c
    /* renamed from: a */
    public String mo30953a() {
        return "NativeJpegTranscoder";
    }

    @Override // p025b5.InterfaceC2124c
    /* renamed from: b */
    public boolean mo30952b(C13065e c13065e, RotationOptions rotationOptions, ResizeOptions resizeOptions) {
        if (rotationOptions == null) {
            rotationOptions = RotationOptions.m31189a();
        }
        if (C2126e.m34157f(rotationOptions, resizeOptions, c13065e, this.f10525a) < 8) {
            return true;
        }
        return false;
    }

    @Override // p025b5.InterfaceC2124c
    /* renamed from: c */
    public boolean mo30951c(C8793c c8793c) {
        return c8793c == C8792b.f23081a;
    }

    @Override // p025b5.InterfaceC2124c
    /* renamed from: d */
    public C2123b mo30950d(C13065e c13065e, OutputStream outputStream, RotationOptions rotationOptions, ResizeOptions resizeOptions, C8793c c8793c, Integer num) {
        if (num == null) {
            num = 85;
        }
        if (rotationOptions == null) {
            rotationOptions = RotationOptions.m31189a();
        }
        int m34168b = C2122a.m34168b(rotationOptions, resizeOptions, c13065e, this.f10526b);
        try {
            int m34157f = C2126e.m34157f(rotationOptions, resizeOptions, c13065e, this.f10525a);
            int m34162a = C2126e.m34162a(m34168b);
            if (this.f10527c) {
                m34157f = m34162a;
            }
            InputStream m3354D = c13065e.m3354D();
            if (C2126e.f5989a.contains(Integer.valueOf(c13065e.m3329s()))) {
                m30948f((InputStream) C13379j.m2676h(m3354D, "Cannot transcode from null input stream!"), outputStream, C2126e.m34159d(rotationOptions, c13065e), m34157f, num.intValue());
            } else {
                m30949e((InputStream) C13379j.m2676h(m3354D, "Cannot transcode from null input stream!"), outputStream, C2126e.m34158e(rotationOptions, c13065e), m34157f, num.intValue());
            }
            C13368b.m2699b(m3354D);
            int i = 1;
            if (m34168b != 1) {
                i = 0;
            }
            return new C2123b(i);
        } catch (Throwable th2) {
            C13368b.m2699b(null);
            throw th2;
        }
    }
}