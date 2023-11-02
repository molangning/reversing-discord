package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class FitWindowsLinearLayout extends LinearLayout {

    /* renamed from: j */
    private InterfaceC0569s0 f1576j;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        InterfaceC0569s0 interfaceC0569s0 = this.f1576j;
        if (interfaceC0569s0 != null) {
            interfaceC0569s0.m39703a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(InterfaceC0569s0 interfaceC0569s0) {
        this.f1576j = interfaceC0569s0;
    }
}
