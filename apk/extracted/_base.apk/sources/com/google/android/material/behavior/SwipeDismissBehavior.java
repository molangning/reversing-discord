package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C1365w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.widget.ViewDragHelper;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.AbstractC0682c<V> {

    /* renamed from: a */
    ViewDragHelper f13066a;

    /* renamed from: b */
    InterfaceC4758c f13067b;

    /* renamed from: c */
    private boolean f13068c;

    /* renamed from: e */
    private boolean f13070e;

    /* renamed from: d */
    private float f13069d = 0.0f;

    /* renamed from: f */
    int f13071f = 2;

    /* renamed from: g */
    float f13072g = 0.5f;

    /* renamed from: h */
    float f13073h = 0.0f;

    /* renamed from: i */
    float f13074i = 0.5f;

    /* renamed from: j */
    private final ViewDragHelper.AbstractC1452c f13075j = new C4756a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4756a extends ViewDragHelper.AbstractC1452c {

        /* renamed from: a */
        private int f13076a;

        /* renamed from: b */
        private int f13077b = -1;

        C4756a() {
        }

        /* renamed from: n */
        private boolean m27823n(View view, float f) {
            boolean z;
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i != 0) {
                if (C1365w0.m37258B(view) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                int i2 = SwipeDismissBehavior.this.f13071f;
                if (i2 == 2) {
                    return true;
                }
                if (i2 == 0) {
                    if (z) {
                        if (f >= 0.0f) {
                            return false;
                        }
                    } else if (i <= 0) {
                        return false;
                    }
                    return true;
                } else if (i2 != 1) {
                    return false;
                } else {
                    if (z) {
                        if (i <= 0) {
                            return false;
                        }
                    } else if (f >= 0.0f) {
                        return false;
                    }
                    return true;
                }
            }
            if (Math.abs(view.getLeft() - this.f13076a) < Math.round(view.getWidth() * SwipeDismissBehavior.this.f13072g)) {
                return false;
            }
            return true;
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC1452c
        /* renamed from: a */
        public int mo27690a(View view, int i, int i2) {
            boolean z;
            int width;
            int width2;
            int width3;
            if (C1365w0.m37258B(view) == 1) {
                z = true;
            } else {
                z = false;
            }
            int i3 = SwipeDismissBehavior.this.f13071f;
            if (i3 == 0) {
                if (z) {
                    width = this.f13076a - view.getWidth();
                    width2 = this.f13076a;
                } else {
                    width = this.f13076a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i3 == 1) {
                if (z) {
                    width = this.f13076a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                } else {
                    width = this.f13076a - view.getWidth();
                    width2 = this.f13076a;
                }
            } else {
                width = this.f13076a - view.getWidth();
                width2 = view.getWidth() + this.f13076a;
            }
            return SwipeDismissBehavior.m27833G(width, i, width2);
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC1452c
        /* renamed from: b */
        public int mo27689b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC1452c
        /* renamed from: d */
        public int mo27825d(View view) {
            return view.getWidth();
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC1452c
        /* renamed from: i */
        public void mo27824i(View view, int i) {
            this.f13077b = i;
            this.f13076a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC1452c
        /* renamed from: j */
        public void mo27687j(int i) {
            InterfaceC4758c interfaceC4758c = SwipeDismissBehavior.this.f13067b;
            if (interfaceC4758c != null) {
                interfaceC4758c.mo26794b(i);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC1452c
        /* renamed from: k */
        public void mo27686k(View view, int i, int i2, int i3, int i4) {
            float width = this.f13076a + (view.getWidth() * SwipeDismissBehavior.this.f13073h);
            float width2 = this.f13076a + (view.getWidth() * SwipeDismissBehavior.this.f13074i);
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m27834F(0.0f, 1.0f - SwipeDismissBehavior.m27831I(width, width2, f), 1.0f));
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC1452c
        /* renamed from: l */
        public void mo27685l(View view, float f, float f2) {
            int i;
            boolean z;
            InterfaceC4758c interfaceC4758c;
            this.f13077b = -1;
            int width = view.getWidth();
            if (m27823n(view, f)) {
                int left = view.getLeft();
                int i2 = this.f13076a;
                if (left < i2) {
                    i = i2 - width;
                } else {
                    i = i2 + width;
                }
                z = true;
            } else {
                i = this.f13076a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f13066a.m36791O(i, view.getTop())) {
                C1365w0.m37201i0(view, new RunnableC4759d(view, z));
            } else if (z && (interfaceC4758c = SwipeDismissBehavior.this.f13067b) != null) {
                interfaceC4758c.mo26795a(view);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.AbstractC1452c
        /* renamed from: m */
        public boolean mo27684m(View view, int i) {
            int i2 = this.f13077b;
            if ((i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo26799E(view)) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4757b implements AccessibilityViewCommand {
        C4757b() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityViewCommand
        /* renamed from: a */
        public boolean mo27682a(View view, AccessibilityViewCommand.AbstractC1186a abstractC1186a) {
            boolean z;
            boolean z2 = false;
            if (!SwipeDismissBehavior.this.mo26799E(view)) {
                return false;
            }
            if (C1365w0.m37258B(view) == 1) {
                z = true;
            } else {
                z = false;
            }
            int i = SwipeDismissBehavior.this.f13071f;
            if ((i == 0 && z) || (i == 1 && !z)) {
                z2 = true;
            }
            int width = view.getWidth();
            if (z2) {
                width = -width;
            }
            C1365w0.m37217a0(view, width);
            view.setAlpha(0.0f);
            InterfaceC4758c interfaceC4758c = SwipeDismissBehavior.this.f13067b;
            if (interfaceC4758c != null) {
                interfaceC4758c.mo26795a(view);
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4758c {
        /* renamed from: a */
        void mo26795a(View view);

        /* renamed from: b */
        void mo26794b(int i);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private class RunnableC4759d implements Runnable {

        /* renamed from: j */
        private final View f13080j;

        /* renamed from: k */
        private final boolean f13081k;

        RunnableC4759d(View view, boolean z) {
            this.f13080j = view;
            this.f13081k = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceC4758c interfaceC4758c;
            ViewDragHelper viewDragHelper = SwipeDismissBehavior.this.f13066a;
            if (viewDragHelper != null && viewDragHelper.m36775m(true)) {
                C1365w0.m37201i0(this.f13080j, this);
            } else if (this.f13081k && (interfaceC4758c = SwipeDismissBehavior.this.f13067b) != null) {
                interfaceC4758c.mo26795a(this.f13080j);
            }
        }
    }

    /* renamed from: F */
    static float m27834F(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: G */
    static int m27833G(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: H */
    private void m27832H(ViewGroup viewGroup) {
        ViewDragHelper m36773o;
        if (this.f13066a == null) {
            if (this.f13070e) {
                m36773o = ViewDragHelper.m36774n(viewGroup, this.f13069d, this.f13075j);
            } else {
                m36773o = ViewDragHelper.m36773o(viewGroup, this.f13075j);
            }
            this.f13066a = m36773o;
        }
    }

    /* renamed from: I */
    static float m27831I(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: N */
    private void m27826N(View view) {
        C1365w0.m37197k0(view, 1048576);
        if (mo26799E(view)) {
            C1365w0.m37193m0(view, AccessibilityNodeInfoCompat.C1178a.f3626y, null, new C4757b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
    /* renamed from: D */
    public boolean mo26457D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper = this.f13066a;
        if (viewDragHelper != null) {
            viewDragHelper.m36800F(motionEvent);
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public boolean mo26799E(View view) {
        return true;
    }

    /* renamed from: J */
    public void m27830J(float f) {
        this.f13074i = m27834F(0.0f, f, 1.0f);
    }

    /* renamed from: K */
    public void m27829K(InterfaceC4758c interfaceC4758c) {
        this.f13067b = interfaceC4758c;
    }

    /* renamed from: L */
    public void m27828L(float f) {
        this.f13073h = m27834F(0.0f, f, 1.0f);
    }

    /* renamed from: M */
    public void m27827M(int i) {
        this.f13071f = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
    /* renamed from: k */
    public boolean mo26796k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f13068c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f13068c = false;
            }
        } else {
            z = coordinatorLayout.m39188v(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f13068c = z;
        }
        if (!z) {
            return false;
        }
        m27832H(coordinatorLayout);
        return this.f13066a.m36790P(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
    /* renamed from: l */
    public boolean mo26481l(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean mo26481l = super.mo26481l(coordinatorLayout, v, i);
        if (C1365w0.m37168z(v) == 0) {
            C1365w0.m37259A0(v, 1);
            m27826N(v);
        }
        return mo26481l;
    }
}
