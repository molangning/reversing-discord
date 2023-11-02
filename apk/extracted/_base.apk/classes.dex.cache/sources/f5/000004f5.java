package androidx.core.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class GestureDetectorCompat {

    /* renamed from: a */
    private final InterfaceC1148a f3526a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.GestureDetectorCompat$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1148a {
        /* renamed from: a */
        boolean mo37788a(MotionEvent motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.GestureDetectorCompat$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1149b implements InterfaceC1148a {

        /* renamed from: a */
        private final GestureDetector f3527a;

        C1149b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f3527a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // androidx.core.view.GestureDetectorCompat.InterfaceC1148a
        /* renamed from: a */
        public boolean mo37788a(MotionEvent motionEvent) {
            return this.f3527a.onTouchEvent(motionEvent);
        }
    }

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    /* renamed from: a */
    public boolean m37789a(MotionEvent motionEvent) {
        return this.f3526a.mo37788a(motionEvent);
    }

    public GestureDetectorCompat(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.f3526a = new C1149b(context, onGestureListener, handler);
    }
}