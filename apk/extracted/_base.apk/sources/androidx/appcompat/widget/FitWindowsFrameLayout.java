package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class FitWindowsFrameLayout extends FrameLayout {

    /* renamed from: j */
    private InterfaceC0569s0 f1575j;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        InterfaceC0569s0 interfaceC0569s0 = this.f1575j;
        if (interfaceC0569s0 != null) {
            interfaceC0569s0.m39703a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(InterfaceC0569s0 interfaceC0569s0) {
        this.f1575j = interfaceC0569s0;
    }
}
