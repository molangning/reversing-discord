package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.ProgressBar;
import androidx.core.view.C1365w0;
import androidx.vectordrawable.graphics.drawable.AbstractC1905b;
import com.google.android.material.internal.C4908m;
import com.google.android.material.progressindicator.AbstractC4923b;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.Arrays;
import p064db.C5810a;
import p155ia.C7480b;
import p155ia.C7488j;
import p155ia.C7489k;
import p402wa.C13466a;
import pa.C11487a;

/* renamed from: com.google.android.material.progressindicator.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC4918a<S extends AbstractC4923b> extends ProgressBar {

    /* renamed from: x */
    static final int f13789x = C7488j.f20283t;

    /* renamed from: j */
    S f13790j;

    /* renamed from: k */
    private int f13791k;

    /* renamed from: l */
    private boolean f13792l;

    /* renamed from: m */
    private boolean f13793m;

    /* renamed from: n */
    private final int f13794n;

    /* renamed from: o */
    private final int f13795o;

    /* renamed from: p */
    private long f13796p;

    /* renamed from: q */
    C13466a f13797q;

    /* renamed from: r */
    private boolean f13798r;

    /* renamed from: s */
    private int f13799s;

    /* renamed from: t */
    private final Runnable f13800t;

    /* renamed from: u */
    private final Runnable f13801u;

    /* renamed from: v */
    private final AbstractC1905b f13802v;

    /* renamed from: w */
    private final AbstractC1905b f13803w;

    /* renamed from: com.google.android.material.progressindicator.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class RunnableC4919a implements Runnable {
        RunnableC4919a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4918a.this.m26915k();
        }
    }

    /* renamed from: com.google.android.material.progressindicator.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class RunnableC4920b implements Runnable {
        RunnableC4920b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC4918a.this.m26916j();
            AbstractC4918a.this.f13796p = -1L;
        }
    }

    /* renamed from: com.google.android.material.progressindicator.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4921c extends AbstractC1905b {
        C4921c() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.AbstractC1905b
        /* renamed from: a */
        public void mo26908a(Drawable drawable) {
            AbstractC4918a.this.setIndeterminate(false);
            AbstractC4918a abstractC4918a = AbstractC4918a.this;
            abstractC4918a.m26911o(abstractC4918a.f13791k, AbstractC4918a.this.f13792l);
        }
    }

    /* renamed from: com.google.android.material.progressindicator.a$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4922d extends AbstractC1905b {
        C4922d() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.AbstractC1905b
        /* renamed from: a */
        public void mo26908a(Drawable drawable) {
            super.mo26908a(drawable);
            if (!AbstractC4918a.this.f13798r) {
                AbstractC4918a abstractC4918a = AbstractC4918a.this;
                abstractC4918a.setVisibility(abstractC4918a.f13799s);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4918a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C5810a.m24498c(context, attributeSet, i, f13789x), attributeSet, i);
        this.f13796p = -1L;
        this.f13798r = false;
        this.f13799s = 4;
        this.f13800t = new RunnableC4919a();
        this.f13801u = new RunnableC4920b();
        this.f13802v = new C4921c();
        this.f13803w = new C4922d();
        Context context2 = getContext();
        this.f13790j = mo26917i(context2, attributeSet);
        TypedArray m26945h = C4908m.m26945h(context2, attributeSet, C7489k.f20318E, i, i2, new int[0]);
        this.f13794n = m26945h.getInt(C7489k.f20358J, -1);
        this.f13795o = Math.min(m26945h.getInt(C7489k.f20342H, -1), (int) RNCWebViewManager.COMMAND_CLEAR_FORM_DATA);
        m26945h.recycle();
        this.f13797q = new C13466a();
        this.f13793m = true;
    }

    private AbstractC4937h<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().m26835u();
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().m26879v();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public void m26916j() {
        ((AbstractC4933g) getCurrentDrawable()).mo26840p(false, false, true);
        if (m26913m()) {
            setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m26915k() {
        if (this.f13795o > 0) {
            this.f13796p = SystemClock.uptimeMillis();
        }
        setVisibility(0);
    }

    /* renamed from: m */
    private boolean m26913m() {
        if ((getProgressDrawable() != null && getProgressDrawable().isVisible()) || (getIndeterminateDrawable() != null && getIndeterminateDrawable().isVisible())) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    private void m26912n() {
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().m26836t().mo26849d(this.f13802v);
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().mo26841l(this.f13803w);
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().mo26841l(this.f13803w);
        }
    }

    /* renamed from: p */
    private void m26910p() {
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().mo26838r(this.f13803w);
            getIndeterminateDrawable().m26836t().mo26845h();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().mo26838r(this.f13803w);
        }
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f13790j.f13813f;
    }

    public int[] getIndicatorColor() {
        return this.f13790j.f13810c;
    }

    public int getShowAnimationBehavior() {
        return this.f13790j.f13812e;
    }

    public int getTrackColor() {
        return this.f13790j.f13811d;
    }

    public int getTrackCornerRadius() {
        return this.f13790j.f13809b;
    }

    public int getTrackThickness() {
        return this.f13790j.f13808a;
    }

    /* renamed from: h */
    protected void m26918h(boolean z) {
        if (!this.f13793m) {
            return;
        }
        ((AbstractC4933g) getCurrentDrawable()).mo26840p(m26909q(), false, z);
    }

    /* renamed from: i */
    abstract S mo26917i(Context context, AttributeSet attributeSet);

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    /* renamed from: l */
    boolean m26914l() {
        View view = this;
        while (view.getVisibility() == 0) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                if (getWindowVisibility() != 0) {
                    return false;
                }
                return true;
            } else if (!(parent instanceof View)) {
                return true;
            } else {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: o */
    public void m26911o(int i, boolean z) {
        if (isIndeterminate()) {
            if (getProgressDrawable() != null) {
                this.f13791k = i;
                this.f13792l = z;
                this.f13798r = true;
                if (getIndeterminateDrawable().isVisible() && this.f13797q.m2425a(getContext().getContentResolver()) != 0.0f) {
                    getIndeterminateDrawable().m26836t().mo26847f();
                    return;
                } else {
                    this.f13802v.mo26908a(getIndeterminateDrawable());
                    return;
                }
            }
            return;
        }
        super.setProgress(i);
        if (getProgressDrawable() != null && !z) {
            getProgressDrawable().jumpToCurrentState();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m26912n();
        if (m26909q()) {
            m26915k();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f13801u);
        removeCallbacks(this.f13800t);
        ((AbstractC4933g) getCurrentDrawable()).mo26844h();
        m26910p();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i, int i2) {
        int paddingLeft;
        int paddingTop;
        super.onMeasure(i, i2);
        AbstractC4937h<S> currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate == null) {
            return;
        }
        int mo26855e = currentDrawingDelegate.mo26855e();
        int mo26856d = currentDrawingDelegate.mo26856d();
        if (mo26855e < 0) {
            paddingLeft = getMeasuredWidth();
        } else {
            paddingLeft = mo26855e + getPaddingLeft() + getPaddingRight();
        }
        if (mo26856d < 0) {
            paddingTop = getMeasuredHeight();
        } else {
            paddingTop = mo26856d + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        m26918h(z);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        m26918h(false);
    }

    /* renamed from: q */
    boolean m26909q() {
        if (C1365w0.m37225T(this) && getWindowVisibility() == 0 && m26914l()) {
            return true;
        }
        return false;
    }

    public void setAnimatorDurationScaleProvider(C13466a c13466a) {
        this.f13797q = c13466a;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f13845l = c13466a;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f13845l = c13466a;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f13790j.f13813f = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        if (z == isIndeterminate()) {
            return;
        }
        AbstractC4933g abstractC4933g = (AbstractC4933g) getCurrentDrawable();
        if (abstractC4933g != null) {
            abstractC4933g.mo26844h();
        }
        super.setIndeterminate(z);
        AbstractC4933g abstractC4933g2 = (AbstractC4933g) getCurrentDrawable();
        if (abstractC4933g2 != null) {
            abstractC4933g2.mo26840p(m26909q(), false, false);
        }
        if ((abstractC4933g2 instanceof C4939j) && m26909q()) {
            ((C4939j) abstractC4933g2).m26836t().mo26846g();
        }
        this.f13798r = false;
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else if (drawable instanceof C4939j) {
            ((AbstractC4933g) drawable).mo26844h();
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{C11487a.m8018b(getContext(), C7480b.f20108k, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.f13790j.f13810c = iArr;
            getIndeterminateDrawable().m26836t().mo26850c();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        m26911o(i, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else if (drawable instanceof C4931f) {
            C4931f c4931f = (C4931f) drawable;
            c4931f.mo26844h();
            super.setProgressDrawable(c4931f);
            c4931f.m26875z(getProgress() / getMax());
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.f13790j.f13812e = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        S s = this.f13790j;
        if (s.f13811d != i) {
            s.f13811d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        S s = this.f13790j;
        if (s.f13809b != i) {
            s.f13809b = Math.min(i, s.f13808a / 2);
        }
    }

    public void setTrackThickness(int i) {
        S s = this.f13790j;
        if (s.f13808a != i) {
            s.f13808a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.f13799s = i;
    }

    @Override // android.widget.ProgressBar
    public C4939j<S> getIndeterminateDrawable() {
        return (C4939j) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public C4931f<S> getProgressDrawable() {
        return (C4931f) super.getProgressDrawable();
    }
}
