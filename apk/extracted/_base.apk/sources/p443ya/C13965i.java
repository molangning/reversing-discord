package p443ya;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import com.reactnativecommunity.webview.RNCWebViewManager;
import p411x.C13657a;

/* renamed from: ya.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13965i {
    /* renamed from: a */
    public static Typeface m1058a(Context context, Typeface typeface) {
        return m1057b(context.getResources().getConfiguration(), typeface);
    }

    /* renamed from: b */
    public static Typeface m1057b(Configuration configuration, Typeface typeface) {
        int i;
        int i2;
        int weight;
        int i3;
        Typeface create;
        if (Build.VERSION.SDK_INT >= 31) {
            i = configuration.fontWeightAdjustment;
            if (i != Integer.MAX_VALUE) {
                i2 = configuration.fontWeightAdjustment;
                if (i2 != 0) {
                    weight = typeface.getWeight();
                    i3 = configuration.fontWeightAdjustment;
                    create = Typeface.create(typeface, C13657a.m1915b(weight + i3, 1, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA), typeface.isItalic());
                    return create;
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
