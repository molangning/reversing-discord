package p095f4;

import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import java.util.Map;
import p114g4.InterfaceC6545b;

/* renamed from: f4.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6309a {
    /* renamed from: a */
    public static InterfaceC6545b.C6546a m22999a(Map<String, Object> map, Map<String, Object> map2, Map<String, Object> map3, Rect rect, String str, PointF pointF, Map<String, Object> map4, Object obj, Uri uri) {
        InterfaceC6545b.C6546a c6546a = new InterfaceC6545b.C6546a();
        if (rect != null) {
            c6546a.f18586g = rect.width();
            c6546a.f18587h = rect.height();
        }
        c6546a.f18588i = str;
        if (pointF != null) {
            c6546a.f18589j = pointF.x;
            c6546a.f18590k = pointF.y;
        }
        c6546a.f18584e = obj;
        c6546a.f18585f = uri;
        c6546a.f18582c = map3;
        c6546a.f18583d = map4;
        c6546a.f18581b = map2;
        c6546a.f18580a = map;
        return c6546a;
    }
}