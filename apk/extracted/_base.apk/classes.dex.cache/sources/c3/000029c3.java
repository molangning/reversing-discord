package com.google.android.exoplayer2.p049ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.p049ui.DefaultTimeBar;
import com.google.android.exoplayer2.p049ui.InterfaceC4508h;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import p118g8.C6576l;
import p195k8.C9149a;
import p195k8.C9191p0;

/* renamed from: com.google.android.exoplayer2.ui.DefaultTimeBar */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class DefaultTimeBar extends View implements InterfaceC4508h {

    /* renamed from: A */
    private final int f12011A;

    /* renamed from: B */
    private final int f12012B;

    /* renamed from: C */
    private final int f12013C;

    /* renamed from: D */
    private final StringBuilder f12014D;

    /* renamed from: E */
    private final Formatter f12015E;

    /* renamed from: F */
    private final Runnable f12016F;

    /* renamed from: G */
    private final CopyOnWriteArraySet<InterfaceC4508h.InterfaceC4509a> f12017G;

    /* renamed from: H */
    private final Point f12018H;

    /* renamed from: I */
    private final float f12019I;

    /* renamed from: J */
    private int f12020J;

    /* renamed from: K */
    private long f12021K;

    /* renamed from: L */
    private int f12022L;

    /* renamed from: M */
    private Rect f12023M;

    /* renamed from: N */
    private ValueAnimator f12024N;

    /* renamed from: O */
    private float f12025O;

    /* renamed from: P */
    private boolean f12026P;

    /* renamed from: Q */
    private boolean f12027Q;

    /* renamed from: R */
    private long f12028R;

    /* renamed from: S */
    private long f12029S;

    /* renamed from: T */
    private long f12030T;

    /* renamed from: U */
    private long f12031U;

    /* renamed from: V */
    private int f12032V;

    /* renamed from: W */
    private long[] f12033W;

    /* renamed from: a0 */
    private boolean[] f12034a0;

    /* renamed from: j */
    private final Rect f12035j;

    /* renamed from: k */
    private final Rect f12036k;

    /* renamed from: l */
    private final Rect f12037l;

    /* renamed from: m */
    private final Rect f12038m;

    /* renamed from: n */
    private final Paint f12039n;

    /* renamed from: o */
    private final Paint f12040o;

    /* renamed from: p */
    private final Paint f12041p;

    /* renamed from: q */
    private final Paint f12042q;

    /* renamed from: r */
    private final Paint f12043r;

    /* renamed from: s */
    private final Paint f12044s;

    /* renamed from: t */
    private final Drawable f12045t;

    /* renamed from: u */
    private final int f12046u;

    /* renamed from: v */
    private final int f12047v;

    /* renamed from: w */
    private final int f12048w;

    /* renamed from: x */
    private final int f12049x;

    /* renamed from: y */
    private final int f12050y;

    /* renamed from: z */
    private final int f12051z;

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: e */
    private static int m28952e(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    /* renamed from: f */
    private void m28951f(Canvas canvas) {
        int i;
        if (this.f12029S <= 0) {
            return;
        }
        Rect rect = this.f12038m;
        int m16227r = C9191p0.m16227r(rect.right, rect.left, this.f12036k.right);
        int centerY = this.f12038m.centerY();
        Drawable drawable = this.f12045t;
        if (drawable == null) {
            if (!this.f12027Q && !isFocused()) {
                if (isEnabled()) {
                    i = this.f12050y;
                } else {
                    i = this.f12051z;
                }
            } else {
                i = this.f12011A;
            }
            canvas.drawCircle(m16227r, centerY, (int) ((i * this.f12025O) / 2.0f), this.f12044s);
            return;
        }
        int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f12025O)) / 2;
        int intrinsicHeight = ((int) (this.f12045t.getIntrinsicHeight() * this.f12025O)) / 2;
        this.f12045t.setBounds(m16227r - intrinsicWidth, centerY - intrinsicHeight, m16227r + intrinsicWidth, centerY + intrinsicHeight);
        this.f12045t.draw(canvas);
    }

    /* renamed from: g */
    private void m28950g(Canvas canvas) {
        Paint paint;
        int height = this.f12036k.height();
        int centerY = this.f12036k.centerY() - (height / 2);
        int i = height + centerY;
        if (this.f12029S <= 0) {
            Rect rect = this.f12036k;
            canvas.drawRect(rect.left, centerY, rect.right, i, this.f12041p);
            return;
        }
        Rect rect2 = this.f12037l;
        int i2 = rect2.left;
        int i3 = rect2.right;
        int max = Math.max(Math.max(this.f12036k.left, i3), this.f12038m.right);
        int i4 = this.f12036k.right;
        if (max < i4) {
            canvas.drawRect(max, centerY, i4, i, this.f12041p);
        }
        int max2 = Math.max(i2, this.f12038m.right);
        if (i3 > max2) {
            canvas.drawRect(max2, centerY, i3, i, this.f12040o);
        }
        if (this.f12038m.width() > 0) {
            Rect rect3 = this.f12038m;
            canvas.drawRect(rect3.left, centerY, rect3.right, i, this.f12039n);
        }
        if (this.f12032V == 0) {
            return;
        }
        long[] jArr = (long[]) C9149a.m16448e(this.f12033W);
        boolean[] zArr = (boolean[]) C9149a.m16448e(this.f12034a0);
        int i5 = this.f12049x / 2;
        for (int i6 = 0; i6 < this.f12032V; i6++) {
            long m16225s = C9191p0.m16225s(jArr[i6], 0L, this.f12029S);
            Rect rect4 = this.f12036k;
            int min = rect4.left + Math.min(rect4.width() - this.f12049x, Math.max(0, ((int) ((this.f12036k.width() * m16225s) / this.f12029S)) - i5));
            if (zArr[i6]) {
                paint = this.f12043r;
            } else {
                paint = this.f12042q;
            }
            canvas.drawRect(min, centerY, min + this.f12049x, i, paint);
        }
    }

    private long getPositionIncrement() {
        long j = this.f12021K;
        if (j == -9223372036854775807L) {
            long j2 = this.f12029S;
            if (j2 == -9223372036854775807L) {
                return 0L;
            }
            return j2 / this.f12020J;
        }
        return j;
    }

    private String getProgressText() {
        return C9191p0.m16250f0(this.f12014D, this.f12015E, this.f12030T);
    }

    private long getScrubberPosition() {
        if (this.f12036k.width() > 0 && this.f12029S != -9223372036854775807L) {
            return (this.f12038m.width() * this.f12029S) / this.f12036k.width();
        }
        return 0L;
    }

    /* renamed from: h */
    private boolean m28949h(float f, float f2) {
        return this.f12035j.contains((int) f, (int) f2);
    }

    /* renamed from: i */
    public /* synthetic */ void m28948i() {
        m28938s(false);
    }

    /* renamed from: j */
    public /* synthetic */ void m28947j(ValueAnimator valueAnimator) {
        this.f12025O = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate(this.f12035j);
    }

    /* renamed from: k */
    private void m28946k(float f) {
        Rect rect = this.f12038m;
        Rect rect2 = this.f12036k;
        rect.right = C9191p0.m16227r((int) f, rect2.left, rect2.right);
    }

    /* renamed from: l */
    private static int m28945l(float f, int i) {
        return (int) (i / f);
    }

    /* renamed from: m */
    private Point m28944m(MotionEvent motionEvent) {
        this.f12018H.set((int) motionEvent.getX(), (int) motionEvent.getY());
        return this.f12018H;
    }

    /* renamed from: n */
    private boolean m28943n(long j) {
        long j2;
        long j3 = this.f12029S;
        if (j3 <= 0) {
            return false;
        }
        if (this.f12027Q) {
            j2 = this.f12028R;
        } else {
            j2 = this.f12030T;
        }
        long j4 = j2;
        long m16225s = C9191p0.m16225s(j4 + j, 0L, j3);
        if (m16225s == j4) {
            return false;
        }
        if (!this.f12027Q) {
            m28939r(m16225s);
        } else {
            m28935v(m16225s);
        }
        m28937t();
        return true;
    }

    /* renamed from: o */
    private boolean m28942o(Drawable drawable) {
        return C9191p0.f24171a >= 23 && m28941p(drawable, getLayoutDirection());
    }

    /* renamed from: p */
    private static boolean m28941p(Drawable drawable, int i) {
        return C9191p0.f24171a >= 23 && drawable.setLayoutDirection(i);
    }

    /* renamed from: q */
    private void m28940q(int i, int i2) {
        Rect rect = this.f12023M;
        if (rect != null && rect.width() == i && this.f12023M.height() == i2) {
            return;
        }
        Rect rect2 = new Rect(0, 0, i, i2);
        this.f12023M = rect2;
        setSystemGestureExclusionRects(Collections.singletonList(rect2));
    }

    /* renamed from: r */
    private void m28939r(long j) {
        this.f12028R = j;
        this.f12027Q = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<InterfaceC4508h.InterfaceC4509a> it = this.f12017G.iterator();
        while (it.hasNext()) {
            it.next().mo28794c(this, j);
        }
    }

    /* renamed from: s */
    private void m28938s(boolean z) {
        removeCallbacks(this.f12016F);
        this.f12027Q = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<InterfaceC4508h.InterfaceC4509a> it = this.f12017G.iterator();
        while (it.hasNext()) {
            it.next().mo28795b(this, this.f12028R, z);
        }
    }

    /* renamed from: t */
    private void m28937t() {
        long j;
        this.f12037l.set(this.f12036k);
        this.f12038m.set(this.f12036k);
        if (this.f12027Q) {
            j = this.f12028R;
        } else {
            j = this.f12030T;
        }
        if (this.f12029S > 0) {
            Rect rect = this.f12037l;
            Rect rect2 = this.f12036k;
            rect.right = Math.min(rect2.left + ((int) ((this.f12036k.width() * this.f12031U) / this.f12029S)), rect2.right);
            int width = (int) ((this.f12036k.width() * j) / this.f12029S);
            Rect rect3 = this.f12038m;
            Rect rect4 = this.f12036k;
            rect3.right = Math.min(rect4.left + width, rect4.right);
        } else {
            Rect rect5 = this.f12037l;
            int i = this.f12036k.left;
            rect5.right = i;
            this.f12038m.right = i;
        }
        invalidate(this.f12035j);
    }

    /* renamed from: u */
    private void m28936u() {
        Drawable drawable = this.f12045t;
        if (drawable != null && drawable.isStateful() && this.f12045t.setState(getDrawableState())) {
            invalidate();
        }
    }

    /* renamed from: v */
    private void m28935v(long j) {
        if (this.f12028R == j) {
            return;
        }
        this.f12028R = j;
        Iterator<InterfaceC4508h.InterfaceC4509a> it = this.f12017G.iterator();
        while (it.hasNext()) {
            it.next().mo28796a(this, j);
        }
    }

    @Override // com.google.android.exoplayer2.p049ui.InterfaceC4508h
    /* renamed from: a */
    public void mo28798a(InterfaceC4508h.InterfaceC4509a interfaceC4509a) {
        C9149a.m16448e(interfaceC4509a);
        this.f12017G.add(interfaceC4509a);
    }

    @Override // com.google.android.exoplayer2.p049ui.InterfaceC4508h
    /* renamed from: b */
    public void mo28797b(long[] jArr, boolean[] zArr, int i) {
        boolean z;
        if (i != 0 && (jArr == null || zArr == null)) {
            z = false;
        } else {
            z = true;
        }
        C9149a.m16452a(z);
        this.f12032V = i;
        this.f12033W = jArr;
        this.f12034a0 = zArr;
        m28937t();
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        m28936u();
    }

    @Override // com.google.android.exoplayer2.p049ui.InterfaceC4508h
    public long getPreferredUpdateDelay() {
        int m28945l = m28945l(this.f12019I, this.f12036k.width());
        if (m28945l != 0) {
            long j = this.f12029S;
            if (j != 0 && j != -9223372036854775807L) {
                return j / m28945l;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f12045t;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        m28950g(canvas);
        m28951f(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f12027Q && !z) {
            m28938s(false);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f12029S <= 0) {
            return;
        }
        if (C9191p0.f24171a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            return;
        }
        accessibilityNodeInfo.addAction(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
        accessibilityNodeInfo.addAction(8192);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L30
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L27
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L27;
                default: goto L12;
            }
        L12:
            goto L30
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.m28943n(r0)
            if (r0 == 0) goto L30
            java.lang.Runnable r5 = r4.f12016F
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.f12016F
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.f12027Q
            if (r0 == 0) goto L30
            r5 = 0
            r4.m28938s(r5)
            return r3
        L30:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p049ui.DefaultTimeBar.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8 = i3 - i;
        int i9 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i8 - getPaddingRight();
        if (this.f12026P) {
            i5 = 0;
        } else {
            i5 = this.f12012B;
        }
        if (this.f12048w == 1) {
            i6 = (i9 - getPaddingBottom()) - this.f12047v;
            int i10 = this.f12046u;
            i7 = ((i9 - getPaddingBottom()) - i10) - Math.max(i5 - (i10 / 2), 0);
        } else {
            i6 = (i9 - this.f12047v) / 2;
            i7 = (i9 - this.f12046u) / 2;
        }
        this.f12035j.set(paddingLeft, i6, paddingRight, this.f12047v + i6);
        Rect rect = this.f12036k;
        Rect rect2 = this.f12035j;
        rect.set(rect2.left + i5, i7, rect2.right - i5, this.f12046u + i7);
        if (C9191p0.f24171a >= 29) {
            m28940q(i8, i9);
        }
        m28937t();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.f12047v;
        } else if (mode != 1073741824) {
            size = Math.min(this.f12047v, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        m28936u();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f12045t;
        if (drawable != null && m28941p(drawable, i)) {
            invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0025, code lost:
        if (r3 != 3) goto L32;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L76
            long r2 = r7.f12029S
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L10
            goto L76
        L10:
            android.graphics.Point r0 = r7.m28944m(r8)
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            r4 = 1
            if (r3 == 0) goto L5d
            r5 = 3
            if (r3 == r4) goto L4e
            r6 = 2
            if (r3 == r6) goto L28
            if (r3 == r5) goto L4e
            goto L76
        L28:
            boolean r8 = r7.f12027Q
            if (r8 == 0) goto L76
            int r8 = r7.f12013C
            if (r0 >= r8) goto L3a
            int r8 = r7.f12022L
            int r2 = r2 - r8
            int r2 = r2 / r5
            int r8 = r8 + r2
            float r8 = (float) r8
            r7.m28946k(r8)
            goto L40
        L3a:
            r7.f12022L = r2
            float r8 = (float) r2
            r7.m28946k(r8)
        L40:
            long r0 = r7.getScrubberPosition()
            r7.m28935v(r0)
            r7.m28937t()
            r7.invalidate()
            return r4
        L4e:
            boolean r0 = r7.f12027Q
            if (r0 == 0) goto L76
            int r8 = r8.getAction()
            if (r8 != r5) goto L59
            r1 = r4
        L59:
            r7.m28938s(r1)
            return r4
        L5d:
            float r8 = (float) r2
            float r0 = (float) r0
            boolean r0 = r7.m28949h(r8, r0)
            if (r0 == 0) goto L76
            r7.m28946k(r8)
            long r0 = r7.getScrubberPosition()
            r7.m28939r(r0)
            r7.m28937t()
            r7.invalidate()
            return r4
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p049ui.DefaultTimeBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.f12029S <= 0) {
            return false;
        }
        if (i == 8192) {
            if (m28943n(-getPositionIncrement())) {
                m28938s(false);
            }
        } else if (i != 4096) {
            return false;
        } else {
            if (m28943n(getPositionIncrement())) {
                m28938s(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i) {
        this.f12042q.setColor(i);
        invalidate(this.f12035j);
    }

    public void setBufferedColor(int i) {
        this.f12040o.setColor(i);
        invalidate(this.f12035j);
    }

    @Override // com.google.android.exoplayer2.p049ui.InterfaceC4508h
    public void setBufferedPosition(long j) {
        this.f12031U = j;
        m28937t();
    }

    @Override // com.google.android.exoplayer2.p049ui.InterfaceC4508h
    public void setDuration(long j) {
        this.f12029S = j;
        if (this.f12027Q && j == -9223372036854775807L) {
            m28938s(true);
        }
        m28937t();
    }

    @Override // android.view.View, com.google.android.exoplayer2.p049ui.InterfaceC4508h
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f12027Q && !z) {
            m28938s(true);
        }
    }

    public void setKeyCountIncrement(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16452a(z);
        this.f12020J = i;
        this.f12021K = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        C9149a.m16452a(z);
        this.f12020J = -1;
        this.f12021K = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.f12043r.setColor(i);
        invalidate(this.f12035j);
    }

    public void setPlayedColor(int i) {
        this.f12039n.setColor(i);
        invalidate(this.f12035j);
    }

    @Override // com.google.android.exoplayer2.p049ui.InterfaceC4508h
    public void setPosition(long j) {
        this.f12030T = j;
        setContentDescription(getProgressText());
        m28937t();
    }

    public void setScrubberColor(int i) {
        this.f12044s.setColor(i);
        invalidate(this.f12035j);
    }

    public void setUnplayedColor(int i) {
        this.f12041p.setColor(i);
        invalidate(this.f12035j);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        this(context, attributeSet, i, attributeSet2, 0);
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2, int i2) {
        super(context, attributeSet, i);
        this.f12035j = new Rect();
        this.f12036k = new Rect();
        this.f12037l = new Rect();
        this.f12038m = new Rect();
        Paint paint = new Paint();
        this.f12039n = paint;
        Paint paint2 = new Paint();
        this.f12040o = paint2;
        Paint paint3 = new Paint();
        this.f12041p = paint3;
        Paint paint4 = new Paint();
        this.f12042q = paint4;
        Paint paint5 = new Paint();
        this.f12043r = paint5;
        Paint paint6 = new Paint();
        this.f12044s = paint6;
        paint6.setAntiAlias(true);
        this.f12017G = new CopyOnWriteArraySet<>();
        this.f12018H = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.f12019I = f;
        this.f12013C = m28952e(f, -50);
        int m28952e = m28952e(f, 4);
        int m28952e2 = m28952e(f, 26);
        int m28952e3 = m28952e(f, 4);
        int m28952e4 = m28952e(f, 12);
        int m28952e5 = m28952e(f, 0);
        int m28952e6 = m28952e(f, 16);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C6576l.f18695d, i, i2);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(C6576l.f18706o);
                this.f12045t = drawable;
                if (drawable != null) {
                    m28942o(drawable);
                    m28952e2 = Math.max(drawable.getMinimumHeight(), m28952e2);
                }
                this.f12046u = obtainStyledAttributes.getDimensionPixelSize(C6576l.f18699h, m28952e);
                this.f12047v = obtainStyledAttributes.getDimensionPixelSize(C6576l.f18708q, m28952e2);
                this.f12048w = obtainStyledAttributes.getInt(C6576l.f18698g, 0);
                this.f12049x = obtainStyledAttributes.getDimensionPixelSize(C6576l.f18697f, m28952e3);
                this.f12050y = obtainStyledAttributes.getDimensionPixelSize(C6576l.f18707p, m28952e4);
                this.f12051z = obtainStyledAttributes.getDimensionPixelSize(C6576l.f18704m, m28952e5);
                this.f12011A = obtainStyledAttributes.getDimensionPixelSize(C6576l.f18705n, m28952e6);
                int i3 = obtainStyledAttributes.getInt(C6576l.f18702k, -1);
                int i4 = obtainStyledAttributes.getInt(C6576l.f18703l, -1);
                int i5 = obtainStyledAttributes.getInt(C6576l.f18700i, -855638017);
                int i6 = obtainStyledAttributes.getInt(C6576l.f18709r, 872415231);
                int i7 = obtainStyledAttributes.getInt(C6576l.f18696e, -1291845888);
                int i8 = obtainStyledAttributes.getInt(C6576l.f18701j, 872414976);
                paint.setColor(i3);
                paint6.setColor(i4);
                paint2.setColor(i5);
                paint3.setColor(i6);
                paint4.setColor(i7);
                paint5.setColor(i8);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.f12046u = m28952e;
            this.f12047v = m28952e2;
            this.f12048w = 0;
            this.f12049x = m28952e3;
            this.f12050y = m28952e4;
            this.f12051z = m28952e5;
            this.f12011A = m28952e6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f12045t = null;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f12014D = sb2;
        this.f12015E = new Formatter(sb2, Locale.getDefault());
        this.f12016F = new Runnable() { // from class: g8.a
            @Override // java.lang.Runnable
            public final void run() {
                DefaultTimeBar.this.m28948i();
            }
        };
        Drawable drawable2 = this.f12045t;
        if (drawable2 != null) {
            this.f12012B = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f12012B = (Math.max(this.f12051z, Math.max(this.f12050y, this.f12011A)) + 1) / 2;
        }
        this.f12025O = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f12024N = valueAnimator;
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: g8.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                DefaultTimeBar.this.m28947j(valueAnimator2);
            }
        });
        this.f12029S = -9223372036854775807L;
        this.f12021K = -9223372036854775807L;
        this.f12020J = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }
}