package p068dg;

import com.facebook.react.uimanager.ViewDefaults;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0007\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0005H\u0007¨\u0006\u0007"}, m14357d2 = {"", "", "a", "", "c", "", "b", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/math/MathKt")
/* renamed from: dg.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5838c extends C5837b {
    /* renamed from: a */
    public static int m24389a(double d) {
        if (!Double.isNaN(d)) {
            if (d > 2.147483647E9d) {
                return ViewDefaults.NUMBER_OF_LINES;
            }
            if (d < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    /* renamed from: b */
    public static int m24388b(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    /* renamed from: c */
    public static long m24387c(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d);
    }
}
