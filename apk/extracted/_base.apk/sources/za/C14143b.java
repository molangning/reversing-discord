package za;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* renamed from: za.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C14143b {

    /* renamed from: a */
    public static final boolean f36375a = true;

    /* renamed from: b */
    private static final int[] f36376b = {16842919};

    /* renamed from: c */
    private static final int[] f36377c = {16843623, 16842908};

    /* renamed from: d */
    private static final int[] f36378d = {16842908};

    /* renamed from: e */
    private static final int[] f36379e = {16843623};

    /* renamed from: f */
    private static final int[] f36380f = {16842913, 16842919};

    /* renamed from: g */
    private static final int[] f36381g = {16842913, 16843623, 16842908};

    /* renamed from: h */
    private static final int[] f36382h = {16842913, 16842908};

    /* renamed from: i */
    private static final int[] f36383i = {16842913, 16843623};

    /* renamed from: j */
    private static final int[] f36384j = {16842913};

    /* renamed from: k */
    private static final int[] f36385k = {16842910, 16842919};

    /* renamed from: l */
    static final String f36386l = C14143b.class.getSimpleName();

    private C14143b() {
    }

    /* renamed from: a */
    public static ColorStateList m590a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f36385k, 0)) != 0) {
                Log.w(f36386l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    /* renamed from: b */
    public static boolean m589b(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
