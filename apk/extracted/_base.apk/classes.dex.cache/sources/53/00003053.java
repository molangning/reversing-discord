package com.yalantis.ucrop.view.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0946a;
import java.util.Locale;
import p354te.C12667a;
import re.C12124a;
import re.C12125b;
import re.C12131h;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class AspectRatioTextView extends AppCompatTextView {

    /* renamed from: j */
    private final float f16013j;

    /* renamed from: k */
    private final Rect f16014k;

    /* renamed from: l */
    private Paint f16015l;

    /* renamed from: m */
    private int f16016m;

    /* renamed from: n */
    private float f16017n;

    /* renamed from: o */
    private String f16018o;

    /* renamed from: p */
    private float f16019p;

    /* renamed from: q */
    private float f16020q;

    public AspectRatioTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: e */
    private void m24636e(int i) {
        Paint paint = this.f16015l;
        if (paint != null) {
            paint.setColor(i);
        }
        setTextColor(new ColorStateList(new int[][]{new int[]{16842913}, new int[]{0}}, new int[]{i, C0946a.m38401c(getContext(), C12124a.f31441k)}));
    }

    /* renamed from: g */
    private void m24634g(TypedArray typedArray) {
        setGravity(1);
        this.f16018o = typedArray.getString(C12131h.f31509R);
        this.f16019p = typedArray.getFloat(C12131h.f31510S, 0.0f);
        float f = typedArray.getFloat(C12131h.f31511T, 0.0f);
        this.f16020q = f;
        float f2 = this.f16019p;
        if (f2 != 0.0f && f != 0.0f) {
            this.f16017n = f2 / f;
        } else {
            this.f16017n = 0.0f;
        }
        this.f16016m = getContext().getResources().getDimensionPixelSize(C12125b.f31451h);
        Paint paint = new Paint(1);
        this.f16015l = paint;
        paint.setStyle(Paint.Style.FILL);
        m24633h();
        m24636e(getResources().getColor(C12124a.f31442l));
        typedArray.recycle();
    }

    /* renamed from: h */
    private void m24633h() {
        if (!TextUtils.isEmpty(this.f16018o)) {
            setText(this.f16018o);
        } else {
            setText(String.format(Locale.US, "%d:%d", Integer.valueOf((int) this.f16019p), Integer.valueOf((int) this.f16020q)));
        }
    }

    /* renamed from: i */
    private void m24632i() {
        if (this.f16017n != 0.0f) {
            float f = this.f16019p;
            float f2 = this.f16020q;
            this.f16019p = f2;
            this.f16020q = f;
            this.f16017n = f2 / f;
        }
    }

    /* renamed from: f */
    public float m24635f(boolean z) {
        if (z) {
            m24632i();
            m24633h();
        }
        return this.f16017n;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (isSelected()) {
            canvas.getClipBounds(this.f16014k);
            Rect rect = this.f16014k;
            float f = rect.bottom - (rect.top / 2.0f);
            int i = this.f16016m;
            canvas.drawCircle((rect.right - rect.left) / 2.0f, f - (i * 1.5f), i / 2.0f, this.f16015l);
        }
    }

    public void setActiveColor(int i) {
        m24636e(i);
        invalidate();
    }

    public void setAspectRatio(C12667a c12667a) {
        this.f16018o = c12667a.m4570a();
        this.f16019p = c12667a.m4569b();
        float m4568d = c12667a.m4568d();
        this.f16020q = m4568d;
        float f = this.f16019p;
        if (f != 0.0f && m4568d != 0.0f) {
            this.f16017n = f / m4568d;
        } else {
            this.f16017n = 0.0f;
        }
        m24633h();
    }

    @TargetApi(21)
    public AspectRatioTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16013j = 1.5f;
        this.f16014k = new Rect();
        m24634g(context.obtainStyledAttributes(attributeSet, C12131h.f31508Q));
    }
}