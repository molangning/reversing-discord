package com.budiyev.android.codescanner;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.hardware.Camera;
import android.view.WindowManager;
import com.google.zxing.Result;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import lc.C10128j;
import p136hc.AbstractC7062h;
import p136hc.C7057c;
import p136hc.C7063i;
import p136hc.C7064j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.budiyev.android.codescanner.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C2814n {

    /* renamed from: com.budiyev.android.codescanner.n$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static final class C2816b implements Comparator<Camera.Size> {
        private C2816b() {
        }

        @Override // java.util.Comparator
        /* renamed from: b */
        public int compare(Camera.Size size, Camera.Size size2) {
            return Integer.compare(size2.height * size2.width, size.height * size.width);
        }
    }

    /* renamed from: com.budiyev.android.codescanner.n$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static final class C2817c implements Comparator<int[]> {
        private C2817c() {
        }

        @Override // java.util.Comparator
        /* renamed from: b */
        public int compare(int[] iArr, int[] iArr2) {
            int compare = Integer.compare(iArr2[1], iArr[1]);
            if (compare == 0) {
                return Integer.compare(iArr2[0], iArr[0]);
            }
            return compare;
        }
    }

    /* renamed from: a */
    public static void m32176a(Camera.Parameters parameters, C2807g c2807g, C2812l c2812l) {
        C2809i m32195d = c2807g.m32195d();
        m32175b(parameters, c2812l, c2807g.m32194e(), c2807g.m32193f(), m32195d.m32188a(), m32195d.m32187b(), c2807g.m32196c());
    }

    /* renamed from: b */
    public static void m32175b(Camera.Parameters parameters, C2812l c2812l, C2809i c2809i, C2809i c2809i2, int i, int i2, int i3) {
        int i4;
        boolean m32162o = m32162o(i3);
        if (m32162o) {
            i4 = i2;
        } else {
            i4 = i;
        }
        if (!m32162o) {
            i = i2;
        }
        m32174c(parameters, m32164m(i4, i, c2812l, c2809i, c2809i2), i4, i, i3);
    }

    /* renamed from: c */
    public static void m32174c(Camera.Parameters parameters, C2812l c2812l, int i, int i2, int i3) {
        ArrayList arrayList = new ArrayList(1);
        C2812l m32186a = c2812l.m32177j(-i3, i / 2.0f, i2 / 2.0f).m32186a(0, 0, i, i2);
        arrayList.add(new Camera.Area(new Rect(m32161p(m32186a.m32182e(), i), m32161p(m32186a.m32180g(), i2), m32161p(m32186a.m32181f(), i), m32161p(m32186a.m32184c(), i2)), RNCWebViewManager.COMMAND_CLEAR_FORM_DATA));
        if (parameters.getMaxNumFocusAreas() > 0) {
            parameters.setFocusAreas(arrayList);
        }
        if (parameters.getMaxNumMeteringAreas() > 0) {
            parameters.setMeteringAreas(arrayList);
        }
    }

    /* renamed from: d */
    public static void m32173d(Camera.Parameters parameters) {
        List<String> supportedFocusModes;
        if (!"auto".equals(parameters.getFocusMode()) && (supportedFocusModes = parameters.getSupportedFocusModes()) != null && supportedFocusModes.contains("auto")) {
            parameters.setFocusMode("auto");
        }
    }

    /* renamed from: e */
    public static void m32172e(Camera.Parameters parameters) {
        int i;
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
            Collections.sort(supportedPreviewFpsRange, new C2817c());
            for (int[] iArr : supportedPreviewFpsRange) {
                int i2 = iArr[0];
                if (i2 >= 10000 && (i = iArr[1]) <= 30000) {
                    parameters.setPreviewFpsRange(i2, i);
                    return;
                }
            }
        }
    }

    /* renamed from: f */
    public static void m32171f(Camera.Parameters parameters) {
        List<String> supportedSceneModes;
        if (!"barcode".equals(parameters.getSceneMode()) && (supportedSceneModes = parameters.getSupportedSceneModes()) != null && supportedSceneModes.contains("barcode")) {
            parameters.setSceneMode("barcode");
        }
    }

    /* renamed from: g */
    public static void m32170g(Camera.Parameters parameters) {
        if (parameters.isVideoStabilizationSupported() && !parameters.getVideoStabilization()) {
            parameters.setVideoStabilization(true);
        }
    }

    /* renamed from: h */
    public static Result m32169h(C7063i c7063i, AbstractC7062h abstractC7062h) {
        try {
            return c7063i.m21463c(new C7057c(new C10128j(abstractC7062h)));
        } catch (C7064j unused) {
            return c7063i.m21463c(new C7057c(new C10128j(abstractC7062h.mo21467e())));
        } finally {
            c7063i.reset();
        }
    }

    /* renamed from: i */
    public static void m32168i(Camera.Parameters parameters) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes != null && !supportedFocusModes.isEmpty()) {
            String focusMode = parameters.getFocusMode();
            if (supportedFocusModes.contains("fixed")) {
                if ("fixed".equals(focusMode)) {
                    return;
                }
                parameters.setFocusMode("fixed");
            } else if (supportedFocusModes.contains("auto") && !"auto".equals(focusMode)) {
                parameters.setFocusMode("auto");
            }
        }
    }

    /* renamed from: j */
    public static C2809i m32167j(Camera.Parameters parameters, int i, int i2) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes != null && !supportedPreviewSizes.isEmpty()) {
            Collections.sort(supportedPreviewSizes, new C2816b());
            float f = i / i2;
            for (float f2 = 0.3f; f2 <= 3.0f; f2 += 0.1f) {
                for (Camera.Size size : supportedPreviewSizes) {
                    int i3 = size.width;
                    int i4 = size.height;
                    if (i3 * i4 >= 589824 && Math.abs(f - (i3 / i4)) <= f2) {
                        return new C2809i(i3, i4);
                    }
                }
            }
        }
        Camera.Size previewSize = parameters.getPreviewSize();
        if (previewSize != null) {
            return new C2809i(previewSize.width, previewSize.height);
        }
        throw new C2800c("Unable to configure camera preview size");
    }

    /* renamed from: k */
    public static int m32166k(Context context, Camera.CameraInfo cameraInfo) {
        int i;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            int rotation = windowManager.getDefaultDisplay().getRotation();
            int i2 = 180;
            if (rotation != 0) {
                if (rotation != 1) {
                    if (rotation != 2) {
                        if (rotation != 3) {
                            if (rotation % 90 == 0) {
                                i = (rotation + 360) % 360;
                            } else {
                                throw new C2800c("Invalid display rotation");
                            }
                        } else {
                            i = 270;
                        }
                    } else {
                        i = 180;
                    }
                } else {
                    i = 90;
                }
            } else {
                i = 0;
            }
            if (cameraInfo.facing != 1) {
                i2 = 360;
            }
            return ((i2 + cameraInfo.orientation) - i) % 360;
        }
        throw new C2800c("Unable to access window manager");
    }

    /* renamed from: l */
    public static Drawable m32165l(Context context, int i) {
        return context.getDrawable(i);
    }

    /* renamed from: m */
    public static C2812l m32164m(int i, int i2, C2812l c2812l, C2809i c2809i, C2809i c2809i2) {
        int m32188a = c2809i.m32188a();
        int m32187b = c2809i.m32187b();
        int m32188a2 = (m32188a - c2809i2.m32188a()) / 2;
        int m32187b2 = (m32187b - c2809i2.m32187b()) / 2;
        float f = i / m32188a;
        float f2 = i2 / m32187b;
        return new C2812l(Math.max(Math.round((c2812l.m32182e() + m32188a2) * f), 0), Math.max(Math.round((c2812l.m32180g() + m32187b2) * f2), 0), Math.min(Math.round((c2812l.m32181f() + m32188a2) * f), i), Math.min(Math.round((c2812l.m32184c() + m32187b2) * f2), i2));
    }

    /* renamed from: n */
    public static C2809i m32163n(int i, int i2, int i3, int i4) {
        if (i == i3 && i2 == i4) {
            return new C2809i(i3, i4);
        }
        int i5 = (i * i4) / i2;
        if (i5 < i3) {
            return new C2809i(i3, (i2 * i3) / i);
        }
        return new C2809i(i5, i4);
    }

    /* renamed from: o */
    public static boolean m32162o(int i) {
        return i == 90 || i == 270;
    }

    /* renamed from: p */
    private static int m32161p(int i, int i2) {
        return ((i * 2000) / i2) - 1000;
    }

    /* renamed from: q */
    public static byte[] m32160q(byte[] bArr, int i, int i2, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (i3 == 0 || i3 == 360) {
            return bArr;
        }
        if (i3 % 90 == 0 && i3 >= 0 && i3 <= 270) {
            byte[] bArr2 = new byte[bArr.length];
            int i8 = i * i2;
            if (i3 % 180 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (i3 % 270 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i3 >= 180) {
                z3 = true;
            } else {
                z3 = false;
            }
            for (int i9 = 0; i9 < i2; i9++) {
                for (int i10 = 0; i10 < i; i10++) {
                    int i11 = (i9 * i) + i10;
                    int i12 = ((i9 >> 1) * i) + i8 + (i10 & (-2));
                    int i13 = i12 + 1;
                    if (z) {
                        i4 = i2;
                    } else {
                        i4 = i;
                    }
                    if (z) {
                        i5 = i;
                    } else {
                        i5 = i2;
                    }
                    if (z) {
                        i6 = i9;
                    } else {
                        i6 = i10;
                    }
                    if (z) {
                        i7 = i10;
                    } else {
                        i7 = i9;
                    }
                    if (z2) {
                        i6 = (i4 - i6) - 1;
                    }
                    if (z3) {
                        i7 = (i5 - i7) - 1;
                    }
                    int i14 = i8 + ((i7 >> 1) * i4) + (i6 & (-2));
                    bArr2[(i7 * i4) + i6] = (byte) (bArr[i11] & 255);
                    bArr2[i14] = (byte) (bArr[i12] & 255);
                    bArr2[i14 + 1] = (byte) (bArr[i13] & 255);
                }
            }
            return bArr2;
        }
        throw new IllegalArgumentException("Invalid rotation (valid: 0, 90, 180, 270)");
    }

    /* renamed from: r */
    public static void m32159r(Camera.Parameters parameters, EnumC2798a enumC2798a) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes != null && !supportedFocusModes.isEmpty()) {
            if (enumC2798a == EnumC2798a.CONTINUOUS) {
                if ("continuous-picture".equals(parameters.getFocusMode())) {
                    return;
                }
                if (supportedFocusModes.contains("continuous-picture")) {
                    parameters.setFocusMode("continuous-picture");
                    return;
                }
            }
            if (!"auto".equals(parameters.getFocusMode()) && supportedFocusModes.contains("auto")) {
                parameters.setFocusMode("auto");
            }
        }
    }

    /* renamed from: s */
    public static void m32158s(Camera.Parameters parameters, String str) {
        List<String> supportedFlashModes;
        if (!str.equals(parameters.getFlashMode()) && (supportedFlashModes = parameters.getSupportedFlashModes()) != null && supportedFlashModes.contains(str)) {
            parameters.setFlashMode(str);
        }
    }

    /* renamed from: t */
    public static void m32157t(Camera.Parameters parameters, int i) {
        if (parameters.isZoomSupported() && parameters.getZoom() != i) {
            parameters.setZoom(Math.min(i, parameters.getMaxZoom()));
        }
    }
}
