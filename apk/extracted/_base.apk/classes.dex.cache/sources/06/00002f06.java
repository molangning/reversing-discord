package com.reactnativepagerview;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.C1936f;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0016\u0010&\u001a\u0004\u0018\u00010#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0016\u0010*\u001a\u0004\u0018\u00010'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006/"}, m14357d2 = {"Lcom/reactnativepagerview/a;", "Landroid/widget/FrameLayout;", "", "orientation", "", "delta", "", "a", "Landroid/view/MotionEvent;", "e", "", "b", "onInterceptTouchEvent", "j", "Ljava/lang/Integer;", "getInitialIndex", "()Ljava/lang/Integer;", "setInitialIndex", "(Ljava/lang/Integer;)V", "initialIndex", "k", "Z", "getDidSetInitialIndex", "()Z", "setDidSetInitialIndex", "(Z)V", "didSetInitialIndex", "l", "I", "touchSlop", "m", "F", "initialX", "n", "initialY", "Landroidx/viewpager2/widget/f;", "getParentViewPager", "()Landroidx/viewpager2/widget/f;", "parentViewPager", "Landroid/view/View;", "getChild", "()Landroid/view/View;", "child", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "react-native-pager-view_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.reactnativepagerview.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5484a extends FrameLayout {

    /* renamed from: j */
    private Integer f15445j;

    /* renamed from: k */
    private boolean f15446k;

    /* renamed from: l */
    private int f15447l;

    /* renamed from: m */
    private float f15448m;

    /* renamed from: n */
    private float f15449n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5484a(Context context) {
        super(context);
        C9612q.m13917h(context, "context");
        this.f15447l = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    /* renamed from: a */
    private final boolean m25153a(int i, float f) {
        int i2 = -((int) Math.signum(f));
        if (i != 0) {
            if (i == 1) {
                View child = getChild();
                if (child == null) {
                    return false;
                }
                return child.canScrollVertically(i2);
            }
            throw new IllegalArgumentException();
        }
        View child2 = getChild();
        if (child2 == null) {
            return false;
        }
        return child2.canScrollHorizontally(i2);
    }

    /* renamed from: b */
    private final void m25152b(MotionEvent motionEvent) {
        boolean z;
        float f;
        boolean z2;
        C1936f parentViewPager = getParentViewPager();
        if (parentViewPager != null) {
            int orientation = parentViewPager.getOrientation();
            float f2 = 1.0f;
            if (!m25153a(orientation, -1.0f) && !m25153a(orientation, 1.0f)) {
                return;
            }
            if (motionEvent.getAction() == 0) {
                this.f15448m = motionEvent.getX();
                this.f15449n = motionEvent.getY();
                getParent().requestDisallowInterceptTouchEvent(true);
            } else if (motionEvent.getAction() == 2) {
                float x = motionEvent.getX() - this.f15448m;
                float y = motionEvent.getY() - this.f15449n;
                if (orientation == 0) {
                    z = true;
                } else {
                    z = false;
                }
                float abs = Math.abs(x);
                if (z) {
                    f = 0.5f;
                } else {
                    f = 1.0f;
                }
                float f3 = abs * f;
                float abs2 = Math.abs(y);
                if (!z) {
                    f2 = 0.5f;
                }
                float f4 = abs2 * f2;
                int i = this.f15447l;
                if (f3 > i || f4 > i) {
                    if (f4 > f3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z == z2) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                        return;
                    }
                    if (!z) {
                        x = y;
                    }
                    if (m25153a(orientation, x)) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    } else {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                }
            }
        }
    }

    private final View getChild() {
        if (getChildCount() > 0) {
            return getChildAt(0);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x001b A[LOOP:0: B:27:0x000d->B:32:0x001b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x000c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x000c -> B:27:0x000d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final androidx.viewpager2.widget.C1936f getParentViewPager() {
        /*
            r3 = this;
            android.view.ViewParent r0 = r3.getParent()
            boolean r1 = r0 instanceof android.view.View
            r2 = 0
            if (r1 == 0) goto Lc
            android.view.View r0 = (android.view.View) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L1e
            boolean r1 = r0 instanceof androidx.viewpager2.widget.C1936f
            if (r1 != 0) goto L1e
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto Lc
            android.view.View r0 = (android.view.View) r0
            goto Ld
        L1e:
            boolean r1 = r0 instanceof androidx.viewpager2.widget.C1936f
            if (r1 == 0) goto L25
            r2 = r0
            androidx.viewpager2.widget.f r2 = (androidx.viewpager2.widget.C1936f) r2
        L25:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.reactnativepagerview.C5484a.getParentViewPager():androidx.viewpager2.widget.f");
    }

    public final boolean getDidSetInitialIndex() {
        return this.f15446k;
    }

    public final Integer getInitialIndex() {
        return this.f15445j;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent e) {
        C9612q.m13917h(e, "e");
        m25152b(e);
        return super.onInterceptTouchEvent(e);
    }

    public final void setDidSetInitialIndex(boolean z) {
        this.f15446k = z;
    }

    public final void setInitialIndex(Integer num) {
        this.f15445j = num;
    }
}