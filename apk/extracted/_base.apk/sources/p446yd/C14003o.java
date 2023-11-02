package p446yd;

import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0012\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0004"}, m14357d2 = {"Landroid/graphics/Rect;", "", "zoomFactor", "a", "react-native-vision-camera_release"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: yd.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C14003o {
    /* renamed from: a */
    public static final Rect m936a(Rect rect, float f) {
        int i;
        C9612q.m13917h(rect, "<this>");
        int i2 = rect.bottom;
        int i3 = rect.top;
        int i4 = rect.right;
        float f2 = 2;
        float f3 = ((i4 - i) / f) / f2;
        float f4 = ((i2 - i3) / f) / f2;
        return new Rect((int) (rect.left + f3), (int) (i3 + f4), (int) (i4 - f3), (int) (i2 - f4));
    }
}
