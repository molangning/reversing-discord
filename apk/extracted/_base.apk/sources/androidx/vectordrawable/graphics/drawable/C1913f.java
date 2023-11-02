package androidx.vectordrawable.graphics.drawable;

import android.animation.TypeEvaluator;

/* renamed from: androidx.vectordrawable.graphics.drawable.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1913f implements TypeEvaluator {

    /* renamed from: a */
    private static final C1913f f5248a = new C1913f();

    /* renamed from: a */
    public static C1913f m35054a() {
        return f5248a;
    }

    @Override // android.animation.TypeEvaluator
    public Object evaluate(float f, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f2 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = pow3 + (f * (((float) Math.pow((intValue2 & 255) / 255.0f, 2.2d)) - pow3));
        return Integer.valueOf((Math.round(((float) Math.pow(pow + ((pow4 - pow) * f), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round((f2 + (((((intValue2 >> 24) & 255) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(((float) Math.pow(pow2 + ((((float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d)) - pow2) * f), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(pow5, 0.45454545454545453d)) * 255.0f));
    }
}
