package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C1365w0;
import com.facebook.react.uimanager.ViewProps;
import java.util.Map;
import p330s0.AbstractC12339b;

/* renamed from: androidx.transition.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1854b extends Transition {

    /* renamed from: V */
    private static final String[] f5125V = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: W */
    private static final Property<Drawable, PointF> f5126W = new C1856b(PointF.class, "boundsOrigin");

    /* renamed from: X */
    private static final Property<C1865k, PointF> f5127X = new C1857c(PointF.class, "topLeft");

    /* renamed from: Y */
    private static final Property<C1865k, PointF> f5128Y = new C1858d(PointF.class, "bottomRight");

    /* renamed from: Z */
    private static final Property<View, PointF> f5129Z = new C1859e(PointF.class, "bottomRight");

    /* renamed from: a0 */
    private static final Property<View, PointF> f5130a0 = new C1860f(PointF.class, "topLeft");

    /* renamed from: b0 */
    private static final Property<View, PointF> f5131b0 = new C1861g(PointF.class, ViewProps.POSITION);

    /* renamed from: c0 */
    private static C1878g f5132c0 = new C1878g();

    /* renamed from: S */
    private int[] f5133S = new int[2];

    /* renamed from: T */
    private boolean f5134T = false;

    /* renamed from: U */
    private boolean f5135U = false;

    /* renamed from: androidx.transition.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1855a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f5136a;

        /* renamed from: b */
        final /* synthetic */ BitmapDrawable f5137b;

        /* renamed from: c */
        final /* synthetic */ View f5138c;

        /* renamed from: d */
        final /* synthetic */ float f5139d;

        C1855a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f5136a = viewGroup;
            this.f5137b = bitmapDrawable;
            this.f5138c = view;
            this.f5139d = f;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C1895t.m35100b(this.f5136a).mo35102b(this.f5137b);
            C1895t.m35095g(this.f5138c, this.f5139d);
        }
    }

    /* renamed from: androidx.transition.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1856b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f5141a;

        C1856b(Class cls, String str) {
            super(cls, str);
            this.f5141a = new Rect();
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f5141a);
            Rect rect = this.f5141a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f5141a);
            this.f5141a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f5141a);
        }
    }

    /* renamed from: androidx.transition.b$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1857c extends Property<C1865k, PointF> {
        C1857c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(C1865k c1865k) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C1865k c1865k, PointF pointF) {
            c1865k.m35176c(pointF);
        }
    }

    /* renamed from: androidx.transition.b$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1858d extends Property<C1865k, PointF> {
        C1858d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(C1865k c1865k) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(C1865k c1865k, PointF pointF) {
            c1865k.m35178a(pointF);
        }
    }

    /* renamed from: androidx.transition.b$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1859e extends Property<View, PointF> {
        C1859e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C1895t.m35096f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: androidx.transition.b$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1860f extends Property<View, PointF> {
        C1860f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C1895t.m35096f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: androidx.transition.b$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1861g extends Property<View, PointF> {
        C1861g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C1895t.m35096f(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: androidx.transition.b$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1862h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1865k f5142a;
        private C1865k mViewBounds;

        C1862h(C1865k c1865k) {
            this.f5142a = c1865k;
            this.mViewBounds = c1865k;
        }
    }

    /* renamed from: androidx.transition.b$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1863i extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f5144a;

        /* renamed from: b */
        final /* synthetic */ View f5145b;

        /* renamed from: c */
        final /* synthetic */ Rect f5146c;

        /* renamed from: d */
        final /* synthetic */ int f5147d;

        /* renamed from: e */
        final /* synthetic */ int f5148e;

        /* renamed from: f */
        final /* synthetic */ int f5149f;

        /* renamed from: g */
        final /* synthetic */ int f5150g;

        C1863i(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f5145b = view;
            this.f5146c = rect;
            this.f5147d = i;
            this.f5148e = i2;
            this.f5149f = i3;
            this.f5150g = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5144a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f5144a) {
                C1365w0.m37171x0(this.f5145b, this.f5146c);
                C1895t.m35096f(this.f5145b, this.f5147d, this.f5148e, this.f5149f, this.f5150g);
            }
        }
    }

    /* renamed from: androidx.transition.b$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1864j extends C1880i {

        /* renamed from: a */
        boolean f5152a = false;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f5153b;

        C1864j(ViewGroup viewGroup) {
            this.f5153b = viewGroup;
        }

        @Override // androidx.transition.C1880i, androidx.transition.Transition.InterfaceC1848f
        public void onTransitionCancel(Transition transition) {
            C1892q.m35104c(this.f5153b, false);
            this.f5152a = true;
        }

        @Override // androidx.transition.C1880i, androidx.transition.Transition.InterfaceC1848f
        public void onTransitionEnd(Transition transition) {
            if (!this.f5152a) {
                C1892q.m35104c(this.f5153b, false);
            }
            transition.mo35142S(this);
        }

        @Override // androidx.transition.C1880i, androidx.transition.Transition.InterfaceC1848f
        public void onTransitionPause(Transition transition) {
            C1892q.m35104c(this.f5153b, false);
        }

        @Override // androidx.transition.C1880i, androidx.transition.Transition.InterfaceC1848f
        public void onTransitionResume(Transition transition) {
            C1892q.m35104c(this.f5153b, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.b$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1865k {

        /* renamed from: a */
        private int f5155a;

        /* renamed from: b */
        private int f5156b;

        /* renamed from: c */
        private int f5157c;

        /* renamed from: d */
        private int f5158d;

        /* renamed from: e */
        private View f5159e;

        /* renamed from: f */
        private int f5160f;

        /* renamed from: g */
        private int f5161g;

        C1865k(View view) {
            this.f5159e = view;
        }

        /* renamed from: b */
        private void m35177b() {
            C1895t.m35096f(this.f5159e, this.f5155a, this.f5156b, this.f5157c, this.f5158d);
            this.f5160f = 0;
            this.f5161g = 0;
        }

        /* renamed from: a */
        void m35178a(PointF pointF) {
            this.f5157c = Math.round(pointF.x);
            this.f5158d = Math.round(pointF.y);
            int i = this.f5161g + 1;
            this.f5161g = i;
            if (this.f5160f == i) {
                m35177b();
            }
        }

        /* renamed from: c */
        void m35176c(PointF pointF) {
            this.f5155a = Math.round(pointF.x);
            this.f5156b = Math.round(pointF.y);
            int i = this.f5160f + 1;
            this.f5160f = i;
            if (i == this.f5161g) {
                m35177b();
            }
        }
    }

    /* renamed from: f0 */
    private void m35193f0(C1888m c1888m) {
        View view = c1888m.f5203b;
        if (C1365w0.m37224U(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            c1888m.f5202a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            c1888m.f5202a.put("android:changeBounds:parent", c1888m.f5203b.getParent());
            if (this.f5135U) {
                c1888m.f5203b.getLocationInWindow(this.f5133S);
                c1888m.f5202a.put("android:changeBounds:windowX", Integer.valueOf(this.f5133S[0]));
                c1888m.f5202a.put("android:changeBounds:windowY", Integer.valueOf(this.f5133S[1]));
            }
            if (this.f5134T) {
                c1888m.f5202a.put("android:changeBounds:clip", C1365w0.m37178u(view));
            }
        }
    }

    /* renamed from: g0 */
    private boolean m35192g0(View view, View view2) {
        if (!this.f5135U) {
            return true;
        }
        C1888m m35209w = m35209w(view, true);
        if (m35209w == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == m35209w.f5203b) {
            return true;
        }
        return false;
    }

    @Override // androidx.transition.Transition
    /* renamed from: G */
    public String[] mo35194G() {
        return f5125V;
    }

    @Override // androidx.transition.Transition
    /* renamed from: g */
    public void mo35128g(C1888m c1888m) {
        m35193f0(c1888m);
    }

    @Override // androidx.transition.Transition
    /* renamed from: l */
    public void mo35121l(C1888m c1888m) {
        m35193f0(c1888m);
    }

    @Override // androidx.transition.Transition
    /* renamed from: q */
    public Animator mo35191q(ViewGroup viewGroup, C1888m c1888m, C1888m c1888m2) {
        int i;
        View view;
        ObjectAnimator m35154a;
        int i2;
        Rect rect;
        Rect rect2;
        ObjectAnimator objectAnimator;
        Animator m35109c;
        if (c1888m != null && c1888m2 != null) {
            Map<String, Object> map = c1888m.f5202a;
            Map<String, Object> map2 = c1888m2.f5202a;
            ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
            ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
            if (viewGroup2 != null && viewGroup3 != null) {
                View view2 = c1888m2.f5203b;
                if (m35192g0(viewGroup2, viewGroup3)) {
                    Rect rect3 = (Rect) c1888m.f5202a.get("android:changeBounds:bounds");
                    Rect rect4 = (Rect) c1888m2.f5202a.get("android:changeBounds:bounds");
                    int i3 = rect3.left;
                    int i4 = rect4.left;
                    int i5 = rect3.top;
                    int i6 = rect4.top;
                    int i7 = rect3.right;
                    int i8 = rect4.right;
                    int i9 = rect3.bottom;
                    int i10 = rect4.bottom;
                    int i11 = i7 - i3;
                    int i12 = i9 - i5;
                    int i13 = i8 - i4;
                    int i14 = i10 - i6;
                    Rect rect5 = (Rect) c1888m.f5202a.get("android:changeBounds:clip");
                    Rect rect6 = (Rect) c1888m2.f5202a.get("android:changeBounds:clip");
                    if ((i11 != 0 && i12 != 0) || (i13 != 0 && i14 != 0)) {
                        if (i3 == i4 && i5 == i6) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        if (i7 != i8 || i9 != i10) {
                            i++;
                        }
                    } else {
                        i = 0;
                    }
                    if ((rect5 != null && !rect5.equals(rect6)) || (rect5 == null && rect6 != null)) {
                        i++;
                    }
                    if (i > 0) {
                        if (!this.f5134T) {
                            view = view2;
                            C1895t.m35096f(view, i3, i5, i7, i9);
                            if (i == 2) {
                                if (i11 == i13 && i12 == i14) {
                                    m35109c = C1876e.m35154a(view, f5131b0, m35207y().mo5448a(i3, i5, i4, i6));
                                } else {
                                    C1865k c1865k = new C1865k(view);
                                    ObjectAnimator m35154a2 = C1876e.m35154a(c1865k, f5127X, m35207y().mo5448a(i3, i5, i4, i6));
                                    ObjectAnimator m35154a3 = C1876e.m35154a(c1865k, f5128Y, m35207y().mo5448a(i7, i9, i8, i10));
                                    AnimatorSet animatorSet = new AnimatorSet();
                                    animatorSet.playTogether(m35154a2, m35154a3);
                                    animatorSet.addListener(new C1862h(c1865k));
                                    m35109c = animatorSet;
                                }
                            } else if (i3 == i4 && i5 == i6) {
                                m35109c = C1876e.m35154a(view, f5129Z, m35207y().mo5448a(i7, i9, i8, i10));
                            } else {
                                m35109c = C1876e.m35154a(view, f5130a0, m35207y().mo5448a(i3, i5, i4, i6));
                            }
                        } else {
                            view = view2;
                            C1895t.m35096f(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                            if (i3 == i4 && i5 == i6) {
                                m35154a = null;
                            } else {
                                m35154a = C1876e.m35154a(view, f5131b0, m35207y().mo5448a(i3, i5, i4, i6));
                            }
                            if (rect5 == null) {
                                i2 = 0;
                                rect = new Rect(0, 0, i11, i12);
                            } else {
                                i2 = 0;
                                rect = rect5;
                            }
                            if (rect6 == null) {
                                rect2 = new Rect(i2, i2, i13, i14);
                            } else {
                                rect2 = rect6;
                            }
                            if (!rect.equals(rect2)) {
                                C1365w0.m37171x0(view, rect);
                                C1878g c1878g = f5132c0;
                                Object[] objArr = new Object[2];
                                objArr[i2] = rect;
                                objArr[1] = rect2;
                                ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", c1878g, objArr);
                                ofObject.addListener(new C1863i(view, rect6, i4, i6, i8, i10));
                                objectAnimator = ofObject;
                            } else {
                                objectAnimator = null;
                            }
                            m35109c = C1887l.m35109c(m35154a, objectAnimator);
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            C1892q.m35104c(viewGroup4, true);
                            mo35134b(new C1864j(viewGroup4));
                        }
                        return m35109c;
                    }
                    return null;
                }
                int intValue = ((Integer) c1888m.f5202a.get("android:changeBounds:windowX")).intValue();
                int intValue2 = ((Integer) c1888m.f5202a.get("android:changeBounds:windowY")).intValue();
                int intValue3 = ((Integer) c1888m2.f5202a.get("android:changeBounds:windowX")).intValue();
                int intValue4 = ((Integer) c1888m2.f5202a.get("android:changeBounds:windowY")).intValue();
                if (intValue == intValue3 && intValue2 == intValue4) {
                    return null;
                }
                viewGroup.getLocationInWindow(this.f5133S);
                Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
                view2.draw(new Canvas(createBitmap));
                BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
                float m35099c = C1895t.m35099c(view2);
                C1895t.m35095g(view2, 0.0f);
                C1895t.m35100b(viewGroup).mo35103a(bitmapDrawable);
                AbstractC12339b m35207y = m35207y();
                int[] iArr = this.f5133S;
                int i15 = iArr[0];
                int i16 = iArr[1];
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, C1877f.m35153a(f5126W, m35207y.mo5448a(intValue - i15, intValue2 - i16, intValue3 - i15, intValue4 - i16)));
                ofPropertyValuesHolder.addListener(new C1855a(viewGroup, bitmapDrawable, view2, m35099c));
                return ofPropertyValuesHolder;
            }
            return null;
        }
        return null;
    }
}
