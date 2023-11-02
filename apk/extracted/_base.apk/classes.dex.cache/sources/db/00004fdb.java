package va;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import androidx.core.graphics.C1004d;
import androidx.core.view.animation.C1226a;
import p443ya.C13956b;

/* renamed from: va.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13227a {
    /* renamed from: a */
    private static float m3007a(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    /* renamed from: b */
    private static String m3006b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    /* renamed from: c */
    private static boolean m3005c(String str, String str2) {
        if (str.startsWith(str2 + "(") && str.endsWith(")")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static int m3004d(Context context, int i, int i2) {
        return C13956b.m1092c(context, i, i2);
    }

    /* renamed from: e */
    public static TimeInterpolator m3003e(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            if (typedValue.type == 3) {
                String valueOf = String.valueOf(typedValue.string);
                if (m3005c(valueOf, "cubic-bezier")) {
                    String[] split = m3006b(valueOf, "cubic-bezier").split(",");
                    if (split.length == 4) {
                        return C1226a.m37496a(m3007a(split, 0), m3007a(split, 1), m3007a(split, 2), m3007a(split, 3));
                    }
                    throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
                } else if (m3005c(valueOf, "path")) {
                    return C1226a.m37495b(C1004d.m38158e(m3006b(valueOf, "path")));
                } else {
                    throw new IllegalArgumentException("Invalid motion easing type: " + valueOf);
                }
            }
            throw new IllegalArgumentException("Motion easing theme attribute must be a string");
        }
        return timeInterpolator;
    }
}