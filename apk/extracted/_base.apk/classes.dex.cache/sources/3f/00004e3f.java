package p357u0;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: u0.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C12815a {
    /* renamed from: a */
    public static <T extends View> T m3875a(View view, int i) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            T t = (T) viewGroup.getChildAt(i2).findViewById(i);
            if (t != null) {
                return t;
            }
        }
        return null;
    }
}