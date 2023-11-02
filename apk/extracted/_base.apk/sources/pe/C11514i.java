package pe;

import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000b"}, m14357d2 = {"Lpe/i;", "", "Landroid/view/MotionEvent;", "event", "", "averageTouches", "", "a", "b", "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: pe.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11514i {

    /* renamed from: a */
    public static final C11514i f29922a = new C11514i();

    private C11514i() {
    }

    /* renamed from: a */
    public final float m7828a(MotionEvent event, boolean z) {
        int i;
        C9612q.m13917h(event, "event");
        if (event.getActionMasked() == 6) {
            i = event.getActionIndex();
        } else {
            i = -1;
        }
        if (z) {
            int pointerCount = event.getPointerCount();
            float f = 0.0f;
            int i2 = 0;
            for (int i3 = 0; i3 < pointerCount; i3++) {
                if (i3 != i) {
                    f += event.getX(i3);
                    i2++;
                }
            }
            return f / i2;
        }
        int pointerCount2 = event.getPointerCount() - 1;
        if (pointerCount2 == i) {
            pointerCount2--;
        }
        return event.getX(pointerCount2);
    }

    /* renamed from: b */
    public final float m7827b(MotionEvent event, boolean z) {
        int i;
        C9612q.m13917h(event, "event");
        if (event.getActionMasked() == 6) {
            i = event.getActionIndex();
        } else {
            i = -1;
        }
        if (z) {
            int pointerCount = event.getPointerCount();
            float f = 0.0f;
            int i2 = 0;
            for (int i3 = 0; i3 < pointerCount; i3++) {
                if (i3 != i) {
                    f += event.getY(i3);
                    i2++;
                }
            }
            return f / i2;
        }
        int pointerCount2 = event.getPointerCount() - 1;
        if (pointerCount2 == i) {
            pointerCount2--;
        }
        return event.getY(pointerCount2);
    }
}
