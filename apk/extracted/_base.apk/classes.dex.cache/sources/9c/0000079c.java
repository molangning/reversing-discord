package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.C1365w0;
import androidx.recyclerview.widget.RecyclerView;
import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.List;
import p222m0.C10227b;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ItemTouchHelper extends RecyclerView.ItemDecoration implements RecyclerView.OnChildAttachStateChangeListener {

    /* renamed from: a */
    final List<View> f4645a;

    /* renamed from: b */
    private final float[] f4646b;

    /* renamed from: c */
    RecyclerView.ViewHolder f4647c;

    /* renamed from: d */
    private float f4648d;

    /* renamed from: e */
    private float f4649e;

    /* renamed from: f */
    float f4650f;

    /* renamed from: g */
    float f4651g;

    /* renamed from: h */
    private float f4652h;

    /* renamed from: i */
    private float f4653i;

    /* renamed from: j */
    int f4654j;

    /* renamed from: k */
    AbstractC1746c f4655k;

    /* renamed from: l */
    private int f4656l;

    /* renamed from: m */
    int f4657m;

    /* renamed from: n */
    List<C1749d> f4658n;

    /* renamed from: o */
    RecyclerView f4659o;

    /* renamed from: p */
    VelocityTracker f4660p;

    /* renamed from: q */
    private RecyclerView.ChildDrawingOrderCallback f4661q;

    /* renamed from: r */
    View f4662r;

    /* renamed from: s */
    int f4663s;

    /* renamed from: t */
    private long f4664t;

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1744a extends C1749d {

        /* renamed from: o */
        final /* synthetic */ int f4665o;

        /* renamed from: p */
        final /* synthetic */ RecyclerView.ViewHolder f4666p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1744a(RecyclerView.ViewHolder viewHolder, int i, int i2, float f, float f2, float f3, float f4, int i3, RecyclerView.ViewHolder viewHolder2) {
            super(viewHolder, i, i2, f, f2, f3, f4);
            ItemTouchHelper.this = r10;
            this.f4665o = i3;
            this.f4666p = viewHolder2;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.C1749d, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f4682l) {
                return;
            }
            if (this.f4665o <= 0) {
                ItemTouchHelper itemTouchHelper = ItemTouchHelper.this;
                itemTouchHelper.f4655k.clearView(itemTouchHelper.f4659o, this.f4666p);
            } else {
                ItemTouchHelper.this.f4645a.add(this.f4666p.itemView);
                this.f4679i = true;
                int i = this.f4665o;
                if (i > 0) {
                    ItemTouchHelper.this.m35861a(this, i);
                }
            }
            ItemTouchHelper itemTouchHelper2 = ItemTouchHelper.this;
            View view = itemTouchHelper2.f4662r;
            View view2 = this.f4666p.itemView;
            if (view == view2) {
                itemTouchHelper2.removeChildDrawingOrderCallbackIfNecessary(view2);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1745b implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C1749d f4668j;

        /* renamed from: k */
        final /* synthetic */ int f4669k;

        RunnableC1745b(C1749d c1749d, int i) {
            ItemTouchHelper.this = r1;
            this.f4668j = c1749d;
            this.f4669k = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = ItemTouchHelper.this.f4659o;
            if (recyclerView != null && recyclerView.isAttachedToWindow()) {
                C1749d c1749d = this.f4668j;
                if (!c1749d.f4682l && c1749d.f4675e.getAbsoluteAdapterPosition() != -1) {
                    RecyclerView.ItemAnimator itemAnimator = ItemTouchHelper.this.f4659o.getItemAnimator();
                    if ((itemAnimator == null || !itemAnimator.isRunning(null)) && !ItemTouchHelper.this.hasRunningRecoverAnim()) {
                        ItemTouchHelper.this.f4655k.onSwiped(this.f4668j.f4675e, this.f4669k);
                    } else {
                        ItemTouchHelper.this.f4659o.post(this);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AbstractC1746c {
        private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
        private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
        static final int RELATIVE_DIR_FLAGS = 3158064;
        private static final Interpolator sDragScrollInterpolator = new animationInterpolatorC1747a();
        private static final Interpolator sDragViewScrollCapInterpolator = new animationInterpolatorC1748b();
        private int mCachedMaxScrollSpeed = -1;

        /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$c$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class animationInterpolatorC1747a implements Interpolator {
            animationInterpolatorC1747a() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$c$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class animationInterpolatorC1748b implements Interpolator {
            animationInterpolatorC1748b() {
            }

            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        public static int convertToRelativeDirection(int i, int i2) {
            int i3;
            int i4 = i & ABS_HORIZONTAL_DIR_FLAGS;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= (-789517) & i6;
                i3 = (i6 & ABS_HORIZONTAL_DIR_FLAGS) << 2;
            }
            return i5 | i3;
        }

        public static ItemTouchUIUtil getDefaultUIUtil() {
            return C1800e.f4951a;
        }

        private int getMaxDragScroll(RecyclerView recyclerView) {
            if (this.mCachedMaxScrollSpeed == -1) {
                this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(C10227b.f26543d);
            }
            return this.mCachedMaxScrollSpeed;
        }

        public static int makeFlag(int i, int i2) {
            return i2 << (i * 8);
        }

        public static int makeMovementFlags(int i, int i2) {
            int makeFlag = makeFlag(0, i2 | i);
            return makeFlag(2, i) | makeFlag(1, i2) | makeFlag;
        }

        public boolean canDropOver(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            return true;
        }

        public RecyclerView.ViewHolder chooseDropTarget(RecyclerView.ViewHolder viewHolder, List<RecyclerView.ViewHolder> list, int i, int i2) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            int width = i + viewHolder.itemView.getWidth();
            int height = i2 + viewHolder.itemView.getHeight();
            int left2 = i - viewHolder.itemView.getLeft();
            int top2 = i2 - viewHolder.itemView.getTop();
            int size = list.size();
            RecyclerView.ViewHolder viewHolder2 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.ViewHolder viewHolder3 = list.get(i4);
                if (left2 > 0 && (right = viewHolder3.itemView.getRight() - width) < 0 && viewHolder3.itemView.getRight() > viewHolder.itemView.getRight() && (abs4 = Math.abs(right)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = abs4;
                }
                if (left2 < 0 && (left = viewHolder3.itemView.getLeft() - i) > 0 && viewHolder3.itemView.getLeft() < viewHolder.itemView.getLeft() && (abs3 = Math.abs(left)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = abs3;
                }
                if (top2 < 0 && (top = viewHolder3.itemView.getTop() - i2) > 0 && viewHolder3.itemView.getTop() < viewHolder.itemView.getTop() && (abs2 = Math.abs(top)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = abs2;
                }
                if (top2 > 0 && (bottom = viewHolder3.itemView.getBottom() - height) < 0 && viewHolder3.itemView.getBottom() > viewHolder.itemView.getBottom() && (abs = Math.abs(bottom)) > i3) {
                    viewHolder2 = viewHolder3;
                    i3 = abs;
                }
            }
            return viewHolder2;
        }

        public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            C1800e.f4951a.mo35388a(viewHolder.itemView);
        }

        public int convertToAbsoluteDirection(int i, int i2) {
            int i3;
            int i4 = i & RELATIVE_DIR_FLAGS;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= (-3158065) & i6;
                i3 = (i6 & RELATIVE_DIR_FLAGS) >> 2;
            }
            return i5 | i3;
        }

        final int getAbsoluteMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return convertToAbsoluteDirection(getMovementFlags(recyclerView, viewHolder), C1365w0.m37258B(recyclerView));
        }

        public long getAnimationDuration(RecyclerView recyclerView, int i, float f, float f2) {
            RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                if (i == 8) {
                    return 200L;
                }
                return 250L;
            } else if (i == 8) {
                return itemAnimator.getMoveDuration();
            } else {
                return itemAnimator.getRemoveDuration();
            }
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        public abstract int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder);

        public float getSwipeEscapeVelocity(float f) {
            return f;
        }

        public float getSwipeThreshold(RecyclerView.ViewHolder viewHolder) {
            return 0.5f;
        }

        public float getSwipeVelocityThreshold(float f) {
            return f;
        }

        boolean hasDragFlag(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return (getAbsoluteMovementFlags(recyclerView, viewHolder) & 16711680) != 0;
        }

        boolean hasSwipeFlag(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            return (getAbsoluteMovementFlags(recyclerView, viewHolder) & 65280) != 0;
        }

        public int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i, int i2, int i3, long j) {
            float f = 1.0f;
            int signum = (int) (((int) Math.signum(i2)) * getMaxDragScroll(recyclerView) * sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)));
            if (j <= DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS) {
                f = ((float) j) / 2000.0f;
            }
            int interpolation = (int) (signum * sDragScrollInterpolator.getInterpolation(f));
            if (interpolation == 0) {
                if (i2 > 0) {
                    return 1;
                }
                return -1;
            }
            return interpolation;
        }

        public boolean isItemViewSwipeEnabled() {
            return true;
        }

        public boolean isLongPressDragEnabled() {
            return true;
        }

        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            C1800e.f4951a.mo35386c(canvas, recyclerView, viewHolder.itemView, f, f2, i, z);
        }

        public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            C1800e.f4951a.mo35385d(canvas, recyclerView, viewHolder.itemView, f, f2, i, z);
        }

        void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List<C1749d> list, int i, float f, float f2) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C1749d c1749d = list.get(i2);
                c1749d.m35856e();
                int save = canvas.save();
                onChildDraw(canvas, recyclerView, c1749d.f4675e, c1749d.f4680j, c1749d.f4681k, c1749d.f4676f, false);
                canvas.restoreToCount(save);
            }
            if (viewHolder != null) {
                int save2 = canvas.save();
                onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
        }

        void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, List<C1749d> list, int i, float f, float f2) {
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                C1749d c1749d = list.get(i2);
                int save = canvas.save();
                onChildDrawOver(canvas, recyclerView, c1749d.f4675e, c1749d.f4680j, c1749d.f4681k, c1749d.f4676f, false);
                canvas.restoreToCount(save);
            }
            if (viewHolder != null) {
                int save2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, viewHolder, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                C1749d c1749d2 = list.get(i3);
                boolean z2 = c1749d2.f4683m;
                if (z2 && !c1749d2.f4679i) {
                    list.remove(i3);
                } else if (!z2) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2);

        public void onMoved(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, int i, RecyclerView.ViewHolder viewHolder2, int i2, int i3, int i4) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof InterfaceC1751e) {
                ((InterfaceC1751e) layoutManager).mo35826d(viewHolder.itemView, viewHolder2.itemView, i3, i4);
                return;
            }
            if (layoutManager.mo28487v()) {
                if (layoutManager.m35725b0(viewHolder2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.m35722e0(viewHolder2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
            if (layoutManager.mo28485w()) {
                if (layoutManager.m35721f0(viewHolder2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.m35727Z(viewHolder2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
        }

        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder != null) {
                C1800e.f4951a.mo35387b(viewHolder.itemView);
            }
        }

        public abstract void onSwiped(RecyclerView.ViewHolder viewHolder, int i);
    }

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1749d implements Animator.AnimatorListener {

        /* renamed from: a */
        final float f4671a;

        /* renamed from: b */
        final float f4672b;

        /* renamed from: c */
        final float f4673c;

        /* renamed from: d */
        final float f4674d;

        /* renamed from: e */
        final RecyclerView.ViewHolder f4675e;

        /* renamed from: f */
        final int f4676f;

        /* renamed from: g */
        final ValueAnimator f4677g;

        /* renamed from: h */
        final int f4678h;

        /* renamed from: i */
        boolean f4679i;

        /* renamed from: j */
        float f4680j;

        /* renamed from: k */
        float f4681k;

        /* renamed from: l */
        boolean f4682l = false;

        /* renamed from: m */
        boolean f4683m = false;

        /* renamed from: n */
        private float f4684n;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$d$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public class C1750a implements ValueAnimator.AnimatorUpdateListener {
            C1750a() {
                C1749d.this = r1;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1749d.this.m35858c(valueAnimator.getAnimatedFraction());
            }
        }

        C1749d(RecyclerView.ViewHolder viewHolder, int i, int i2, float f, float f2, float f3, float f4) {
            this.f4676f = i2;
            this.f4678h = i;
            this.f4675e = viewHolder;
            this.f4671a = f;
            this.f4672b = f2;
            this.f4673c = f3;
            this.f4674d = f4;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f4677g = ofFloat;
            ofFloat.addUpdateListener(new C1750a());
            ofFloat.setTarget(viewHolder.itemView);
            ofFloat.addListener(this);
            m35858c(0.0f);
        }

        /* renamed from: a */
        public void m35860a() {
            this.f4677g.cancel();
        }

        /* renamed from: b */
        public void m35859b(long j) {
            this.f4677g.setDuration(j);
        }

        /* renamed from: c */
        public void m35858c(float f) {
            this.f4684n = f;
        }

        /* renamed from: d */
        public void m35857d() {
            this.f4675e.setIsRecyclable(false);
            this.f4677g.start();
        }

        /* renamed from: e */
        public void m35856e() {
            float f = this.f4671a;
            float f2 = this.f4673c;
            if (f == f2) {
                this.f4680j = this.f4675e.itemView.getTranslationX();
            } else {
                this.f4680j = f + (this.f4684n * (f2 - f));
            }
            float f3 = this.f4672b;
            float f4 = this.f4674d;
            if (f3 == f4) {
                this.f4681k = this.f4675e.itemView.getTranslationY();
            } else {
                this.f4681k = f3 + (this.f4684n * (f4 - f3));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m35858c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f4683m) {
                this.f4675e.setIsRecyclable(true);
            }
            this.f4683m = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1751e {
        /* renamed from: d */
        void mo35826d(View view, View view2, int i, int i2);
    }

    private void addChildDrawingOrderCallback() {
    }

    private int checkHorizontalSwipe(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        if ((i & 12) != 0) {
            int i3 = 8;
            if (this.f4650f > 0.0f) {
                i2 = 8;
            } else {
                i2 = 4;
            }
            VelocityTracker velocityTracker = this.f4660p;
            if (velocityTracker != null && this.f4654j > -1) {
                velocityTracker.computeCurrentVelocity(RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f4655k.getSwipeVelocityThreshold(this.f4649e));
                float xVelocity = this.f4660p.getXVelocity(this.f4654j);
                float yVelocity = this.f4660p.getYVelocity(this.f4654j);
                if (xVelocity <= 0.0f) {
                    i3 = 4;
                }
                float abs = Math.abs(xVelocity);
                if ((i3 & i) != 0 && i2 == i3 && abs >= this.f4655k.getSwipeEscapeVelocity(this.f4648d) && abs > Math.abs(yVelocity)) {
                    return i3;
                }
            }
            float width = this.f4659o.getWidth() * this.f4655k.getSwipeThreshold(viewHolder);
            if ((i & i2) != 0 && Math.abs(this.f4650f) > width) {
                return i2;
            }
            return 0;
        }
        return 0;
    }

    private int checkVerticalSwipe(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        if ((i & 3) != 0) {
            int i3 = 2;
            if (this.f4651g > 0.0f) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            VelocityTracker velocityTracker = this.f4660p;
            if (velocityTracker != null && this.f4654j > -1) {
                velocityTracker.computeCurrentVelocity(RNCWebViewManager.COMMAND_CLEAR_FORM_DATA, this.f4655k.getSwipeVelocityThreshold(this.f4649e));
                float xVelocity = this.f4660p.getXVelocity(this.f4654j);
                float yVelocity = this.f4660p.getYVelocity(this.f4654j);
                if (yVelocity <= 0.0f) {
                    i3 = 1;
                }
                float abs = Math.abs(yVelocity);
                if ((i3 & i) != 0 && i3 == i2 && abs >= this.f4655k.getSwipeEscapeVelocity(this.f4648d) && abs > Math.abs(xVelocity)) {
                    return i3;
                }
            }
            float height = this.f4659o.getHeight() * this.f4655k.getSwipeThreshold(viewHolder);
            if ((i & i2) != 0 && Math.abs(this.f4651g) > height) {
                return i2;
            }
            return 0;
        }
        return 0;
    }

    private void getSelectedDxDy(float[] fArr) {
        if ((this.f4657m & 12) != 0) {
            fArr[0] = (this.f4652h + this.f4650f) - this.f4647c.itemView.getLeft();
        } else {
            fArr[0] = this.f4647c.itemView.getTranslationX();
        }
        if ((this.f4657m & 3) != 0) {
            fArr[1] = (this.f4653i + this.f4651g) - this.f4647c.itemView.getTop();
        } else {
            fArr[1] = this.f4647c.itemView.getTranslationY();
        }
    }

    private void releaseVelocityTracker() {
        VelocityTracker velocityTracker = this.f4660p;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4660p = null;
        }
    }

    private int swipeIfNecessary(RecyclerView.ViewHolder viewHolder) {
        if (this.f4656l == 2) {
            return 0;
        }
        int movementFlags = this.f4655k.getMovementFlags(this.f4659o, viewHolder);
        int convertToAbsoluteDirection = (this.f4655k.convertToAbsoluteDirection(movementFlags, C1365w0.m37258B(this.f4659o)) & 65280) >> 8;
        if (convertToAbsoluteDirection == 0) {
            return 0;
        }
        int i = (movementFlags & 65280) >> 8;
        if (Math.abs(this.f4650f) > Math.abs(this.f4651g)) {
            int checkHorizontalSwipe = checkHorizontalSwipe(viewHolder, convertToAbsoluteDirection);
            if (checkHorizontalSwipe > 0) {
                if ((i & checkHorizontalSwipe) == 0) {
                    return AbstractC1746c.convertToRelativeDirection(checkHorizontalSwipe, C1365w0.m37258B(this.f4659o));
                }
                return checkHorizontalSwipe;
            }
            int checkVerticalSwipe = checkVerticalSwipe(viewHolder, convertToAbsoluteDirection);
            if (checkVerticalSwipe > 0) {
                return checkVerticalSwipe;
            }
        } else {
            int checkVerticalSwipe2 = checkVerticalSwipe(viewHolder, convertToAbsoluteDirection);
            if (checkVerticalSwipe2 > 0) {
                return checkVerticalSwipe2;
            }
            int checkHorizontalSwipe2 = checkHorizontalSwipe(viewHolder, convertToAbsoluteDirection);
            if (checkHorizontalSwipe2 > 0) {
                if ((i & checkHorizontalSwipe2) == 0) {
                    return AbstractC1746c.convertToRelativeDirection(checkHorizontalSwipe2, C1365w0.m37258B(this.f4659o));
                }
                return checkHorizontalSwipe2;
            }
        }
        return 0;
    }

    /* renamed from: a */
    void m35861a(C1749d c1749d, int i) {
        this.f4659o.post(new RunnableC1745b(c1749d, i));
    }

    void endRecoverAnimation(RecyclerView.ViewHolder viewHolder, boolean z) {
        for (int size = this.f4658n.size() - 1; size >= 0; size--) {
            C1749d c1749d = this.f4658n.get(size);
            if (c1749d.f4675e == viewHolder) {
                c1749d.f4682l |= z;
                if (!c1749d.f4683m) {
                    c1749d.m35860a();
                }
                this.f4658n.remove(size);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        rect.setEmpty();
    }

    boolean hasRunningRecoverAnim() {
        int size = this.f4658n.size();
        for (int i = 0; i < size; i++) {
            if (!this.f4658n.get(i).f4683m) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewAttachedToWindow(View view) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewDetachedFromWindow(View view) {
        removeChildDrawingOrderCallbackIfNecessary(view);
        RecyclerView.ViewHolder childViewHolder = this.f4659o.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.ViewHolder viewHolder = this.f4647c;
        if (viewHolder != null && childViewHolder == viewHolder) {
            select(null, 0);
            return;
        }
        endRecoverAnimation(childViewHolder, false);
        if (this.f4645a.remove(childViewHolder.itemView)) {
            this.f4655k.clearView(this.f4659o, childViewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f;
        float f2;
        this.f4663s = -1;
        if (this.f4647c != null) {
            getSelectedDxDy(this.f4646b);
            float[] fArr = this.f4646b;
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.f4655k.onDraw(canvas, recyclerView, this.f4647c, this.f4658n, this.f4656l, f, f2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        float f;
        float f2;
        if (this.f4647c != null) {
            getSelectedDxDy(this.f4646b);
            float[] fArr = this.f4646b;
            float f3 = fArr[0];
            f2 = fArr[1];
            f = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        this.f4655k.onDrawOver(canvas, recyclerView, this.f4647c, this.f4658n, this.f4656l, f, f2);
    }

    void removeChildDrawingOrderCallbackIfNecessary(View view) {
        if (view == this.f4662r) {
            this.f4662r = null;
            if (this.f4661q != null) {
                this.f4659o.setChildDrawingOrderCallback(null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void select(androidx.recyclerview.widget.RecyclerView.ViewHolder r24, int r25) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.ItemTouchHelper.select(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }
}