package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.C1432j;
import p052d.C5715j;

/* renamed from: androidx.appcompat.widget.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C0545o extends PopupWindow {

    /* renamed from: b */
    private static final boolean f1900b = false;

    /* renamed from: a */
    private boolean f1901a;

    public C0545o(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m39778a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m39778a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0544n1 m39780v = C0544n1.m39780v(context, attributeSet, C5715j.f16339Y1, i, i2);
        int i3 = C5715j.f16348a2;
        if (m39780v.m39783s(i3)) {
            m39777b(m39780v.m39801a(i3, false));
        }
        setBackgroundDrawable(m39780v.m39795g(C5715j.f16343Z1));
        m39780v.m39779w();
    }

    /* renamed from: b */
    private void m39777b(boolean z) {
        if (f1900b) {
            this.f1901a = z;
        } else {
            C1432j.m36888a(this, z);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2) {
        if (f1900b && this.f1901a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i, int i2, int i3, int i4) {
        if (f1900b && this.f1901a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f1900b && this.f1901a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }
}
