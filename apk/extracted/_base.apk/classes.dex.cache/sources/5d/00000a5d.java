package p038c5;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;

/* renamed from: c5.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C2397b {
    /* renamed from: a */
    public static boolean m33519a(InterfaceC2396a interfaceC2396a, CloseableReference<Bitmap> closeableReference) {
        if (interfaceC2396a != null && closeableReference != null) {
            Bitmap m31730D = closeableReference.m31730D();
            if (interfaceC2396a.m33521a()) {
                m31730D.setHasAlpha(true);
            }
            interfaceC2396a.m33520b(m31730D);
            return true;
        }
        return false;
    }
}