package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: androidx.constraintlayout.widget.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0676d extends View {

    /* renamed from: j */
    private int f2618j;

    /* renamed from: k */
    private View f2619k;

    /* renamed from: l */
    private int f2620l;

    /* renamed from: a */
    public void m39231a(ConstraintLayout constraintLayout) {
        if (this.f2619k == null) {
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f2619k.getLayoutParams();
        layoutParams2.f2438n0.m39432A0(0);
        ConstraintWidget.EnumC0650b m39366w = layoutParams.f2438n0.m39366w();
        ConstraintWidget.EnumC0650b enumC0650b = ConstraintWidget.EnumC0650b.FIXED;
        if (m39366w != enumC0650b) {
            layoutParams.f2438n0.m39430B0(layoutParams2.f2438n0.m39415N());
        }
        if (layoutParams.f2438n0.m39418K() != enumC0650b) {
            layoutParams.f2438n0.m39398e0(layoutParams2.f2438n0.m39372t());
        }
        layoutParams2.f2438n0.m39432A0(8);
    }

    /* renamed from: b */
    public void m39230b(ConstraintLayout constraintLayout) {
        if (this.f2618j == -1 && !isInEditMode()) {
            setVisibility(this.f2620l);
        }
        View findViewById = constraintLayout.findViewById(this.f2618j);
        this.f2619k = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.LayoutParams) findViewById.getLayoutParams()).f2414b0 = true;
            this.f2619k.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f2619k;
    }

    public int getEmptyVisibility() {
        return this.f2620l;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f2618j == i) {
            return;
        }
        View view = this.f2619k;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.LayoutParams) this.f2619k.getLayoutParams()).f2414b0 = false;
            this.f2619k = null;
        }
        this.f2618j = i;
        if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
            findViewById.setVisibility(8);
        }
    }

    public void setEmptyVisibility(int i) {
        this.f2620l = i;
    }
}
