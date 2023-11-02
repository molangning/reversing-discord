package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.core.view.C1365w0;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1795d extends RecyclerView.ItemDecoration implements RecyclerView.OnItemTouchListener {

    /* renamed from: D */
    private static final int[] f4915D = {16842919};

    /* renamed from: E */
    private static final int[] f4916E = new int[0];

    /* renamed from: A */
    int f4917A;

    /* renamed from: B */
    private final Runnable f4918B;

    /* renamed from: C */
    private final RecyclerView.OnScrollListener f4919C;

    /* renamed from: a */
    private final int f4920a;

    /* renamed from: b */
    private final int f4921b;

    /* renamed from: c */
    final StateListDrawable f4922c;

    /* renamed from: d */
    final Drawable f4923d;

    /* renamed from: e */
    private final int f4924e;

    /* renamed from: f */
    private final int f4925f;

    /* renamed from: g */
    private final StateListDrawable f4926g;

    /* renamed from: h */
    private final Drawable f4927h;

    /* renamed from: i */
    private final int f4928i;

    /* renamed from: j */
    private final int f4929j;

    /* renamed from: k */
    int f4930k;

    /* renamed from: l */
    int f4931l;

    /* renamed from: m */
    float f4932m;

    /* renamed from: n */
    int f4933n;

    /* renamed from: o */
    int f4934o;

    /* renamed from: p */
    float f4935p;

    /* renamed from: s */
    private RecyclerView f4938s;

    /* renamed from: z */
    final ValueAnimator f4945z;

    /* renamed from: q */
    private int f4936q = 0;

    /* renamed from: r */
    private int f4937r = 0;

    /* renamed from: t */
    private boolean f4939t = false;

    /* renamed from: u */
    private boolean f4940u = false;

    /* renamed from: v */
    private int f4941v = 0;

    /* renamed from: w */
    private int f4942w = 0;

    /* renamed from: x */
    private final int[] f4943x = new int[2];

    /* renamed from: y */
    private final int[] f4944y = new int[2];

    /* renamed from: androidx.recyclerview.widget.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC1796a implements Runnable {
        RunnableC1796a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1795d.this.m35400f(500);
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1797b extends RecyclerView.OnScrollListener {
        C1797b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            C1795d.this.m35390p(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private class C1798c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f4948a = false;

        C1798c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4948a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f4948a) {
                this.f4948a = false;
            } else if (((Float) C1795d.this.f4945z.getAnimatedValue()).floatValue() == 0.0f) {
                C1795d c1795d = C1795d.this;
                c1795d.f4917A = 0;
                c1795d.m35392n(0);
            } else {
                C1795d c1795d2 = C1795d.this;
                c1795d2.f4917A = 2;
                c1795d2.m35395k();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private class C1799d implements ValueAnimator.AnimatorUpdateListener {
        C1799d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            C1795d.this.f4922c.setAlpha(floatValue);
            C1795d.this.f4923d.setAlpha(floatValue);
            C1795d.this.m35395k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1795d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f4945z = ofFloat;
        this.f4917A = 0;
        this.f4918B = new RunnableC1796a();
        this.f4919C = new C1797b();
        this.f4922c = stateListDrawable;
        this.f4923d = drawable;
        this.f4926g = stateListDrawable2;
        this.f4927h = drawable2;
        this.f4924e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f4925f = Math.max(i, drawable.getIntrinsicWidth());
        this.f4928i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f4929j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f4920a = i2;
        this.f4921b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new C1798c());
        ofFloat.addUpdateListener(new C1799d());
        attachToRecyclerView(recyclerView);
    }

    /* renamed from: a */
    private void m35405a() {
        this.f4938s.removeCallbacks(this.f4918B);
    }

    /* renamed from: b */
    private void m35404b(Canvas canvas) {
        int i = this.f4937r;
        int i2 = this.f4928i;
        int i3 = i - i2;
        int i4 = this.f4934o;
        int i5 = this.f4933n;
        int i6 = i4 - (i5 / 2);
        this.f4926g.setBounds(0, 0, i5, i2);
        this.f4927h.setBounds(0, 0, this.f4936q, this.f4929j);
        canvas.translate(0.0f, i3);
        this.f4927h.draw(canvas);
        canvas.translate(i6, 0.0f);
        this.f4926g.draw(canvas);
        canvas.translate(-i6, -i3);
    }

    /* renamed from: c */
    private void m35403c(Canvas canvas) {
        int i = this.f4936q;
        int i2 = this.f4924e;
        int i3 = i - i2;
        int i4 = this.f4931l;
        int i5 = this.f4930k;
        int i6 = i4 - (i5 / 2);
        this.f4922c.setBounds(0, 0, i2, i5);
        this.f4923d.setBounds(0, 0, this.f4925f, this.f4937r);
        if (m35398h()) {
            this.f4923d.draw(canvas);
            canvas.translate(this.f4924e, i6);
            canvas.scale(-1.0f, 1.0f);
            this.f4922c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            canvas.translate(-this.f4924e, -i6);
            return;
        }
        canvas.translate(i3, 0.0f);
        this.f4923d.draw(canvas);
        canvas.translate(0.0f, i6);
        this.f4922c.draw(canvas);
        canvas.translate(-i3, -i6);
    }

    /* renamed from: d */
    private int[] m35402d() {
        int[] iArr = this.f4944y;
        int i = this.f4921b;
        iArr[0] = i;
        iArr[1] = this.f4936q - i;
        return iArr;
    }

    private void destroyCallbacks() {
        this.f4938s.removeItemDecoration(this);
        this.f4938s.removeOnItemTouchListener(this);
        this.f4938s.removeOnScrollListener(this.f4919C);
        m35405a();
    }

    /* renamed from: e */
    private int[] m35401e() {
        int[] iArr = this.f4943x;
        int i = this.f4921b;
        iArr[0] = i;
        iArr[1] = this.f4937r - i;
        return iArr;
    }

    /* renamed from: g */
    private void m35399g(float f) {
        int[] m35402d = m35402d();
        float max = Math.max(m35402d[0], Math.min(m35402d[1], f));
        if (Math.abs(this.f4934o - max) < 2.0f) {
            return;
        }
        int m35393m = m35393m(this.f4935p, max, m35402d, this.f4938s.computeHorizontalScrollRange(), this.f4938s.computeHorizontalScrollOffset(), this.f4936q);
        if (m35393m != 0) {
            this.f4938s.scrollBy(m35393m, 0);
        }
        this.f4935p = max;
    }

    /* renamed from: h */
    private boolean m35398h() {
        return C1365w0.m37258B(this.f4938s) == 1;
    }

    /* renamed from: l */
    private void m35394l(int i) {
        m35405a();
        this.f4938s.postDelayed(this.f4918B, i);
    }

    /* renamed from: m */
    private int m35393m(float f, float f2, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f2 - f) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    /* renamed from: q */
    private void m35389q(float f) {
        int[] m35401e = m35401e();
        float max = Math.max(m35401e[0], Math.min(m35401e[1], f));
        if (Math.abs(this.f4931l - max) < 2.0f) {
            return;
        }
        int m35393m = m35393m(this.f4932m, max, m35401e, this.f4938s.computeVerticalScrollRange(), this.f4938s.computeVerticalScrollOffset(), this.f4937r);
        if (m35393m != 0) {
            this.f4938s.scrollBy(0, m35393m);
        }
        this.f4932m = max;
    }

    private void setupCallbacks() {
        this.f4938s.addItemDecoration(this);
        this.f4938s.addOnItemTouchListener(this);
        this.f4938s.addOnScrollListener(this.f4919C);
    }

    public void attachToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4938s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            destroyCallbacks();
        }
        this.f4938s = recyclerView;
        if (recyclerView != null) {
            setupCallbacks();
        }
    }

    /* renamed from: f */
    void m35400f(int i) {
        int i2 = this.f4917A;
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
        } else {
            this.f4945z.cancel();
        }
        this.f4917A = 3;
        ValueAnimator valueAnimator = this.f4945z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f4945z.setDuration(i);
        this.f4945z.start();
    }

    /* renamed from: i */
    boolean m35397i(float f, float f2) {
        if (f2 >= this.f4937r - this.f4928i) {
            int i = this.f4934o;
            int i2 = this.f4933n;
            if (f >= i - (i2 / 2) && f <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    boolean m35396j(float f, float f2) {
        if (!m35398h() ? f >= this.f4936q - this.f4924e : f <= this.f4924e) {
            int i = this.f4931l;
            int i2 = this.f4930k;
            if (f2 >= i - (i2 / 2) && f2 <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    void m35395k() {
        this.f4938s.invalidate();
    }

    /* renamed from: n */
    void m35392n(int i) {
        if (i == 2 && this.f4941v != 2) {
            this.f4922c.setState(f4915D);
            m35405a();
        }
        if (i == 0) {
            m35395k();
        } else {
            m35391o();
        }
        if (this.f4941v == 2 && i != 2) {
            this.f4922c.setState(f4916E);
            m35394l(1200);
        } else if (i == 1) {
            m35394l(1500);
        }
        this.f4941v = i;
    }

    /* renamed from: o */
    public void m35391o() {
        int i = this.f4917A;
        if (i != 0) {
            if (i == 3) {
                this.f4945z.cancel();
            } else {
                return;
            }
        }
        this.f4917A = 1;
        ValueAnimator valueAnimator = this.f4945z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f4945z.setDuration(500L);
        this.f4945z.setStartDelay(0L);
        this.f4945z.start();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        if (this.f4936q == this.f4938s.getWidth() && this.f4937r == this.f4938s.getHeight()) {
            if (this.f4917A != 0) {
                if (this.f4939t) {
                    m35403c(canvas);
                }
                if (this.f4940u) {
                    m35404b(canvas);
                    return;
                }
                return;
            }
            return;
        }
        this.f4936q = this.f4938s.getWidth();
        this.f4937r = this.f4938s.getHeight();
        m35392n(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.f4941v;
        if (i == 1) {
            boolean m35396j = m35396j(motionEvent.getX(), motionEvent.getY());
            boolean m35397i = m35397i(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!m35396j && !m35397i) {
                return false;
            }
            if (m35397i) {
                this.f4942w = 1;
                this.f4935p = (int) motionEvent.getX();
            } else if (m35396j) {
                this.f4942w = 2;
                this.f4932m = (int) motionEvent.getY();
            }
            m35392n(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onRequestDisallowInterceptTouchEvent(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnItemTouchListener
    public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f4941v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean m35396j = m35396j(motionEvent.getX(), motionEvent.getY());
            boolean m35397i = m35397i(motionEvent.getX(), motionEvent.getY());
            if (m35396j || m35397i) {
                if (m35397i) {
                    this.f4942w = 1;
                    this.f4935p = (int) motionEvent.getX();
                } else if (m35396j) {
                    this.f4942w = 2;
                    this.f4932m = (int) motionEvent.getY();
                }
                m35392n(2);
            }
        } else if (motionEvent.getAction() == 1 && this.f4941v == 2) {
            this.f4932m = 0.0f;
            this.f4935p = 0.0f;
            m35392n(1);
            this.f4942w = 0;
        } else if (motionEvent.getAction() == 2 && this.f4941v == 2) {
            m35391o();
            if (this.f4942w == 1) {
                m35399g(motionEvent.getX());
            }
            if (this.f4942w == 2) {
                m35389q(motionEvent.getY());
            }
        }
    }

    /* renamed from: p */
    void m35390p(int i, int i2) {
        boolean z;
        boolean z2;
        int computeVerticalScrollRange = this.f4938s.computeVerticalScrollRange();
        int i3 = this.f4937r;
        if (computeVerticalScrollRange - i3 > 0 && i3 >= this.f4920a) {
            z = true;
        } else {
            z = false;
        }
        this.f4939t = z;
        int computeHorizontalScrollRange = this.f4938s.computeHorizontalScrollRange();
        int i4 = this.f4936q;
        if (computeHorizontalScrollRange - i4 > 0 && i4 >= this.f4920a) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f4940u = z2;
        boolean z3 = this.f4939t;
        if (!z3 && !z2) {
            if (this.f4941v != 0) {
                m35392n(0);
                return;
            }
            return;
        }
        if (z3) {
            float f = i3;
            this.f4931l = (int) ((f * (i2 + (f / 2.0f))) / computeVerticalScrollRange);
            this.f4930k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
        }
        if (this.f4940u) {
            float f2 = i4;
            this.f4934o = (int) ((f2 * (i + (f2 / 2.0f))) / computeHorizontalScrollRange);
            this.f4933n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
        }
        int i5 = this.f4941v;
        if (i5 == 0 || i5 == 1) {
            m35392n(1);
        }
    }
}
