package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import p330s0.C12340c;

/* renamed from: androidx.transition.a0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC1850a0 extends Transition {

    /* renamed from: T */
    private static final String[] f5107T = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: S */
    private int f5108S = 3;

    /* renamed from: androidx.transition.a0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1851a extends C1880i {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f5109a;

        /* renamed from: b */
        final /* synthetic */ View f5110b;

        /* renamed from: c */
        final /* synthetic */ View f5111c;

        C1851a(ViewGroup viewGroup, View view, View view2) {
            AbstractC1850a0.this = r1;
            this.f5109a = viewGroup;
            this.f5110b = view;
            this.f5111c = view2;
        }

        @Override // androidx.transition.C1880i, androidx.transition.Transition.InterfaceC1848f
        public void onTransitionEnd(Transition transition) {
            this.f5111c.setTag(C12340c.f32181a, null);
            C1892q.m35106a(this.f5109a).mo35107d(this.f5110b);
            transition.mo35142S(this);
        }

        @Override // androidx.transition.C1880i, androidx.transition.Transition.InterfaceC1848f
        public void onTransitionPause(Transition transition) {
            C1892q.m35106a(this.f5109a).mo35107d(this.f5110b);
        }

        @Override // androidx.transition.C1880i, androidx.transition.Transition.InterfaceC1848f
        public void onTransitionResume(Transition transition) {
            if (this.f5110b.getParent() == null) {
                C1892q.m35106a(this.f5109a).mo35108c(this.f5110b);
            } else {
                AbstractC1850a0.this.cancel();
            }
        }
    }

    /* renamed from: androidx.transition.a0$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1852b extends AnimatorListenerAdapter implements Transition.InterfaceC1848f {

        /* renamed from: a */
        private final View f5113a;

        /* renamed from: b */
        private final int f5114b;

        /* renamed from: c */
        private final ViewGroup f5115c;

        /* renamed from: d */
        private final boolean f5116d;

        /* renamed from: e */
        private boolean f5117e;

        /* renamed from: f */
        boolean f5118f = false;

        C1852b(View view, int i, boolean z) {
            this.f5113a = view;
            this.f5114b = i;
            this.f5115c = (ViewGroup) view.getParent();
            this.f5116d = z;
            m35195b(true);
        }

        /* renamed from: a */
        private void m35196a() {
            if (!this.f5118f) {
                C1895t.m35094h(this.f5113a, this.f5114b);
                ViewGroup viewGroup = this.f5115c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m35195b(false);
        }

        /* renamed from: b */
        private void m35195b(boolean z) {
            ViewGroup viewGroup;
            if (this.f5116d && this.f5117e != z && (viewGroup = this.f5115c) != null) {
                this.f5117e = z;
                C1892q.m35104c(viewGroup, z);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5118f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m35196a();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (!this.f5118f) {
                C1895t.m35094h(this.f5113a, this.f5114b);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (!this.f5118f) {
                C1895t.m35094h(this.f5113a, 0);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }

        @Override // androidx.transition.Transition.InterfaceC1848f
        public void onTransitionCancel(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC1848f
        public void onTransitionEnd(Transition transition) {
            m35196a();
            transition.mo35142S(this);
        }

        @Override // androidx.transition.Transition.InterfaceC1848f
        public void onTransitionPause(Transition transition) {
            m35195b(false);
        }

        @Override // androidx.transition.Transition.InterfaceC1848f
        public void onTransitionResume(Transition transition) {
            m35195b(true);
        }

        @Override // androidx.transition.Transition.InterfaceC1848f
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.transition.a0$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1853c {

        /* renamed from: a */
        boolean f5119a;

        /* renamed from: b */
        boolean f5120b;

        /* renamed from: c */
        int f5121c;

        /* renamed from: d */
        int f5122d;

        /* renamed from: e */
        ViewGroup f5123e;

        /* renamed from: f */
        ViewGroup f5124f;

        C1853c() {
        }
    }

    /* renamed from: f0 */
    private void m35201f0(C1888m c1888m) {
        c1888m.f5202a.put("android:visibility:visibility", Integer.valueOf(c1888m.f5203b.getVisibility()));
        c1888m.f5202a.put("android:visibility:parent", c1888m.f5203b.getParent());
        int[] iArr = new int[2];
        c1888m.f5203b.getLocationOnScreen(iArr);
        c1888m.f5202a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: g0 */
    private C1853c m35200g0(C1888m c1888m, C1888m c1888m2) {
        C1853c c1853c = new C1853c();
        c1853c.f5119a = false;
        c1853c.f5120b = false;
        if (c1888m != null && c1888m.f5202a.containsKey("android:visibility:visibility")) {
            c1853c.f5121c = ((Integer) c1888m.f5202a.get("android:visibility:visibility")).intValue();
            c1853c.f5123e = (ViewGroup) c1888m.f5202a.get("android:visibility:parent");
        } else {
            c1853c.f5121c = -1;
            c1853c.f5123e = null;
        }
        if (c1888m2 != null && c1888m2.f5202a.containsKey("android:visibility:visibility")) {
            c1853c.f5122d = ((Integer) c1888m2.f5202a.get("android:visibility:visibility")).intValue();
            c1853c.f5124f = (ViewGroup) c1888m2.f5202a.get("android:visibility:parent");
        } else {
            c1853c.f5122d = -1;
            c1853c.f5124f = null;
        }
        if (c1888m != null && c1888m2 != null) {
            int i = c1853c.f5121c;
            int i2 = c1853c.f5122d;
            if (i == i2 && c1853c.f5123e == c1853c.f5124f) {
                return c1853c;
            }
            if (i != i2) {
                if (i == 0) {
                    c1853c.f5120b = false;
                    c1853c.f5119a = true;
                } else if (i2 == 0) {
                    c1853c.f5120b = true;
                    c1853c.f5119a = true;
                }
            } else if (c1853c.f5124f == null) {
                c1853c.f5120b = false;
                c1853c.f5119a = true;
            } else if (c1853c.f5123e == null) {
                c1853c.f5120b = true;
                c1853c.f5119a = true;
            }
        } else if (c1888m == null && c1853c.f5122d == 0) {
            c1853c.f5120b = true;
            c1853c.f5119a = true;
        } else if (c1888m2 == null && c1853c.f5121c == 0) {
            c1853c.f5120b = false;
            c1853c.f5119a = true;
        }
        return c1853c;
    }

    @Override // androidx.transition.Transition
    /* renamed from: G */
    public String[] mo35194G() {
        return f5107T;
    }

    @Override // androidx.transition.Transition
    /* renamed from: I */
    public boolean mo35202I(C1888m c1888m, C1888m c1888m2) {
        if (c1888m == null && c1888m2 == null) {
            return false;
        }
        if (c1888m != null && c1888m2 != null && c1888m2.f5202a.containsKey("android:visibility:visibility") != c1888m.f5202a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C1853c m35200g0 = m35200g0(c1888m, c1888m2);
        if (!m35200g0.f5119a) {
            return false;
        }
        if (m35200g0.f5121c != 0 && m35200g0.f5122d != 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.transition.Transition
    /* renamed from: g */
    public void mo35128g(C1888m c1888m) {
        m35201f0(c1888m);
    }

    /* renamed from: h0 */
    public abstract Animator mo35175h0(ViewGroup viewGroup, View view, C1888m c1888m, C1888m c1888m2);

    /* renamed from: i0 */
    public Animator m35199i0(ViewGroup viewGroup, C1888m c1888m, int i, C1888m c1888m2, int i2) {
        if ((this.f5108S & 1) != 1 || c1888m2 == null) {
            return null;
        }
        if (c1888m == null) {
            View view = (View) c1888m2.f5203b.getParent();
            if (m35200g0(m35209w(view, false), m35230H(view, false)).f5119a) {
                return null;
            }
        }
        return mo35175h0(viewGroup, c1888m2.f5203b, c1888m, c1888m2);
    }

    /* renamed from: j0 */
    public abstract Animator mo35174j0(ViewGroup viewGroup, View view, C1888m c1888m, C1888m c1888m2);

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0089, code lost:
        if (r17.f5072F != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:88:0x004a  */
    /* renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator m35198k0(android.view.ViewGroup r18, androidx.transition.C1888m r19, int r20, androidx.transition.C1888m r21, int r22) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.AbstractC1850a0.m35198k0(android.view.ViewGroup, androidx.transition.m, int, androidx.transition.m, int):android.animation.Animator");
    }

    @Override // androidx.transition.Transition
    /* renamed from: l */
    public void mo35121l(C1888m c1888m) {
        m35201f0(c1888m);
    }

    /* renamed from: l0 */
    public void m35197l0(int i) {
        if ((i & (-4)) == 0) {
            this.f5108S = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // androidx.transition.Transition
    /* renamed from: q */
    public Animator mo35191q(ViewGroup viewGroup, C1888m c1888m, C1888m c1888m2) {
        C1853c m35200g0 = m35200g0(c1888m, c1888m2);
        if (m35200g0.f5119a) {
            if (m35200g0.f5123e != null || m35200g0.f5124f != null) {
                if (m35200g0.f5120b) {
                    return m35199i0(viewGroup, c1888m, m35200g0.f5121c, c1888m2, m35200g0.f5122d);
                }
                return m35198k0(viewGroup, c1888m, m35200g0.f5121c, c1888m2, m35200g0.f5122d);
            }
            return null;
        }
        return null;
    }
}