package qa;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: qa.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class View$OnTouchListenerC11813a implements View.OnTouchListener {

    /* renamed from: j */
    private final Dialog f30802j;

    /* renamed from: k */
    private final int f30803k;

    /* renamed from: l */
    private final int f30804l;

    /* renamed from: m */
    private final int f30805m;

    public View$OnTouchListenerC11813a(Dialog dialog, Rect rect) {
        this.f30802j = dialog;
        this.f30803k = rect.left;
        this.f30804l = rect.top;
        this.f30805m = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f30803k + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f30804l + findViewById.getTop();
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f30805m;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f30802j.onTouchEvent(obtain);
    }
}