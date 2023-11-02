package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p186k.C9031a;

@Deprecated
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: j */
    private final int f2092j;

    /* renamed from: k */
    private final int f2093k;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2092j = getResources().getDimensionPixelOffset(C9031a.f23692b);
        this.f2093k = getResources().getDimensionPixelOffset(C9031a.f23691a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f2092j * 2), this.f2093k), 1073741824), i2);
    }
}