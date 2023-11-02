package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.collection.C0624a;
import androidx.core.app.SharedElementCallback;
import androidx.core.p018os.C1056f;
import androidx.core.util.C1138f;
import androidx.core.view.C1279j2;
import androidx.core.view.C1365w0;
import androidx.core.view.ViewTreeObserver$OnPreDrawListenerC1354u0;
import androidx.fragment.app.AbstractC1636s;
import androidx.fragment.app.C1592d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.fragment.app.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C1577c extends AbstractC1636s {

    /* renamed from: androidx.fragment.app.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static /* synthetic */ class C1578a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4166a;

        static {
            int[] iArr = new int[AbstractC1636s.C1641e.EnumC1644c.values().length];
            f4166a = iArr;
            try {
                iArr[AbstractC1636s.C1641e.EnumC1644c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4166a[AbstractC1636s.C1641e.EnumC1644c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4166a[AbstractC1636s.C1641e.EnumC1644c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4166a[AbstractC1636s.C1641e.EnumC1644c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: androidx.fragment.app.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC1579b implements Runnable {

        /* renamed from: j */
        final /* synthetic */ List f4167j;

        /* renamed from: k */
        final /* synthetic */ AbstractC1636s.C1641e f4168k;

        RunnableC1579b(List list, AbstractC1636s.C1641e c1641e) {
            this.f4167j = list;
            this.f4168k = c1641e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4167j.contains(this.f4168k)) {
                this.f4167j.remove(this.f4168k);
                C1577c.this.m36315s(this.f4168k);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1580c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f4170a;

        /* renamed from: b */
        final /* synthetic */ View f4171b;

        /* renamed from: c */
        final /* synthetic */ boolean f4172c;

        /* renamed from: d */
        final /* synthetic */ AbstractC1636s.C1641e f4173d;

        /* renamed from: e */
        final /* synthetic */ C1589k f4174e;

        C1580c(ViewGroup viewGroup, View view, boolean z, AbstractC1636s.C1641e c1641e, C1589k c1589k) {
            this.f4170a = viewGroup;
            this.f4171b = view;
            this.f4172c = z;
            this.f4173d = c1641e;
            this.f4174e = c1589k;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4170a.endViewTransition(this.f4171b);
            if (this.f4172c) {
                this.f4173d.m36147e().m36139a(this.f4171b);
            }
            this.f4174e.m36308a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1581d implements C1056f.InterfaceC1058b {

        /* renamed from: a */
        final /* synthetic */ Animator f4176a;

        C1581d(Animator animator) {
            this.f4176a = animator;
        }

        @Override // androidx.core.p018os.C1056f.InterfaceC1058b
        public void onCancel() {
            this.f4176a.end();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$e  reason: invalid class name */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class animationAnimation$AnimationListenerC1582e implements Animation.AnimationListener {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f4178a;

        /* renamed from: b */
        final /* synthetic */ View f4179b;

        /* renamed from: c */
        final /* synthetic */ C1589k f4180c;

        /* renamed from: androidx.fragment.app.c$e$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class RunnableC1583a implements Runnable {
            RunnableC1583a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                animationAnimation$AnimationListenerC1582e animationanimation_animationlistenerc1582e = animationAnimation$AnimationListenerC1582e.this;
                animationanimation_animationlistenerc1582e.f4178a.endViewTransition(animationanimation_animationlistenerc1582e.f4179b);
                animationAnimation$AnimationListenerC1582e.this.f4180c.m36308a();
            }
        }

        animationAnimation$AnimationListenerC1582e(ViewGroup viewGroup, View view, C1589k c1589k) {
            this.f4178a = viewGroup;
            this.f4179b = view;
            this.f4180c = c1589k;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f4178a.post(new RunnableC1583a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1584f implements C1056f.InterfaceC1058b {

        /* renamed from: a */
        final /* synthetic */ View f4183a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f4184b;

        /* renamed from: c */
        final /* synthetic */ C1589k f4185c;

        C1584f(View view, ViewGroup viewGroup, C1589k c1589k) {
            this.f4183a = view;
            this.f4184b = viewGroup;
            this.f4185c = c1589k;
        }

        @Override // androidx.core.p018os.C1056f.InterfaceC1058b
        public void onCancel() {
            this.f4183a.clearAnimation();
            this.f4184b.endViewTransition(this.f4183a);
            this.f4185c.m36308a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1585g implements Runnable {

        /* renamed from: j */
        final /* synthetic */ AbstractC1636s.C1641e f4187j;

        /* renamed from: k */
        final /* synthetic */ AbstractC1636s.C1641e f4188k;

        /* renamed from: l */
        final /* synthetic */ boolean f4189l;

        /* renamed from: m */
        final /* synthetic */ C0624a f4190m;

        RunnableC1585g(AbstractC1636s.C1641e c1641e, AbstractC1636s.C1641e c1641e2, boolean z, C0624a c0624a) {
            this.f4187j = c1641e;
            this.f4188k = c1641e2;
            this.f4189l = z;
            this.f4190m = c0624a;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1616o.m36206f(this.f4187j.m36146f(), this.f4188k.m36146f(), this.f4189l, this.f4190m, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1586h implements Runnable {

        /* renamed from: j */
        final /* synthetic */ AbstractC1631q f4192j;

        /* renamed from: k */
        final /* synthetic */ View f4193k;

        /* renamed from: l */
        final /* synthetic */ Rect f4194l;

        RunnableC1586h(AbstractC1631q abstractC1631q, View view, Rect rect) {
            this.f4192j = abstractC1631q;
            this.f4193k = view;
            this.f4194l = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4192j.m36177k(this.f4193k, this.f4194l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1587i implements Runnable {

        /* renamed from: j */
        final /* synthetic */ ArrayList f4196j;

        RunnableC1587i(ArrayList arrayList) {
            this.f4196j = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1616o.m36213B(this.f4196j, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.c$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1588j implements Runnable {

        /* renamed from: j */
        final /* synthetic */ C1591m f4198j;

        RunnableC1588j(C1591m c1591m) {
            this.f4198j = c1591m;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4198j.m36308a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.c$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1589k extends C1590l {

        /* renamed from: c */
        private boolean f4200c;

        /* renamed from: d */
        private boolean f4201d;

        /* renamed from: e */
        private C1592d.C1597d f4202e;

        C1589k(AbstractC1636s.C1641e c1641e, C1056f c1056f, boolean z) {
            super(c1641e, c1056f);
            this.f4201d = false;
            this.f4200c = z;
        }

        /* renamed from: e */
        C1592d.C1597d m36309e(Context context) {
            boolean z;
            if (this.f4201d) {
                return this.f4202e;
            }
            Fragment m36146f = m36307b().m36146f();
            if (m36307b().m36147e() == AbstractC1636s.C1641e.EnumC1644c.VISIBLE) {
                z = true;
            } else {
                z = false;
            }
            C1592d.C1597d m36296c = C1592d.m36296c(context, m36146f, z, this.f4200c);
            this.f4202e = m36296c;
            this.f4201d = true;
            return m36296c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.c$l */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1590l {

        /* renamed from: a */
        private final AbstractC1636s.C1641e f4203a;

        /* renamed from: b */
        private final C1056f f4204b;

        C1590l(AbstractC1636s.C1641e c1641e, C1056f c1056f) {
            this.f4203a = c1641e;
            this.f4204b = c1056f;
        }

        /* renamed from: a */
        void m36308a() {
            this.f4203a.m36148d(this.f4204b);
        }

        /* renamed from: b */
        AbstractC1636s.C1641e m36307b() {
            return this.f4203a;
        }

        /* renamed from: c */
        C1056f m36306c() {
            return this.f4204b;
        }

        /* renamed from: d */
        boolean m36305d() {
            AbstractC1636s.C1641e.EnumC1644c enumC1644c;
            AbstractC1636s.C1641e.EnumC1644c m36137c = AbstractC1636s.C1641e.EnumC1644c.m36137c(this.f4203a.m36146f().mView);
            AbstractC1636s.C1641e.EnumC1644c m36147e = this.f4203a.m36147e();
            if (m36137c != m36147e && (m36137c == (enumC1644c = AbstractC1636s.C1641e.EnumC1644c.VISIBLE) || m36147e == enumC1644c)) {
                return false;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.fragment.app.c$m */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1591m extends C1590l {

        /* renamed from: c */
        private final Object f4205c;

        /* renamed from: d */
        private final boolean f4206d;

        /* renamed from: e */
        private final Object f4207e;

        C1591m(AbstractC1636s.C1641e c1641e, C1056f c1056f, boolean z, boolean z2) {
            super(c1641e, c1056f);
            Object exitTransition;
            Object enterTransition;
            boolean allowEnterTransitionOverlap;
            if (c1641e.m36147e() == AbstractC1636s.C1641e.EnumC1644c.VISIBLE) {
                if (z) {
                    enterTransition = c1641e.m36146f().getReenterTransition();
                } else {
                    enterTransition = c1641e.m36146f().getEnterTransition();
                }
                this.f4205c = enterTransition;
                if (z) {
                    allowEnterTransitionOverlap = c1641e.m36146f().getAllowReturnTransitionOverlap();
                } else {
                    allowEnterTransitionOverlap = c1641e.m36146f().getAllowEnterTransitionOverlap();
                }
                this.f4206d = allowEnterTransitionOverlap;
            } else {
                if (z) {
                    exitTransition = c1641e.m36146f().getReturnTransition();
                } else {
                    exitTransition = c1641e.m36146f().getExitTransition();
                }
                this.f4205c = exitTransition;
                this.f4206d = true;
            }
            if (z2) {
                if (z) {
                    this.f4207e = c1641e.m36146f().getSharedElementReturnTransition();
                    return;
                } else {
                    this.f4207e = c1641e.m36146f().getSharedElementEnterTransition();
                    return;
                }
            }
            this.f4207e = null;
        }

        /* renamed from: f */
        private AbstractC1631q m36303f(Object obj) {
            if (obj == null) {
                return null;
            }
            AbstractC1631q abstractC1631q = C1616o.f4274b;
            if (abstractC1631q != null && abstractC1631q.mo35165e(obj)) {
                return abstractC1631q;
            }
            AbstractC1631q abstractC1631q2 = C1616o.f4275c;
            if (abstractC1631q2 != null && abstractC1631q2.mo35165e(obj)) {
                return abstractC1631q2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + m36307b().m36146f() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* renamed from: e */
        AbstractC1631q m36304e() {
            AbstractC1631q m36303f = m36303f(this.f4205c);
            AbstractC1631q m36303f2 = m36303f(this.f4207e);
            if (m36303f != null && m36303f2 != null && m36303f != m36303f2) {
                throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + m36307b().m36146f() + " returned Transition " + this.f4205c + " which uses a different Transition  type than its shared element transition " + this.f4207e);
            } else if (m36303f == null) {
                return m36303f2;
            } else {
                return m36303f;
            }
        }

        /* renamed from: g */
        public Object m36302g() {
            return this.f4207e;
        }

        /* renamed from: h */
        Object m36301h() {
            return this.f4205c;
        }

        /* renamed from: i */
        public boolean m36300i() {
            return this.f4207e != null;
        }

        /* renamed from: j */
        boolean m36299j() {
            return this.f4206d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1577c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* renamed from: w */
    private void m36311w(List<C1589k> list, List<AbstractC1636s.C1641e> list2, boolean z, Map<AbstractC1636s.C1641e, Boolean> map) {
        boolean z2;
        ViewGroup m36157m = m36157m();
        Context context = m36157m.getContext();
        ArrayList arrayList = new ArrayList();
        boolean z3 = false;
        for (C1589k c1589k : list) {
            if (c1589k.m36305d()) {
                c1589k.m36308a();
            } else {
                C1592d.C1597d m36309e = c1589k.m36309e(context);
                if (m36309e == null) {
                    c1589k.m36308a();
                } else {
                    Animator animator = m36309e.f4220b;
                    if (animator == null) {
                        arrayList.add(c1589k);
                    } else {
                        AbstractC1636s.C1641e m36307b = c1589k.m36307b();
                        Fragment m36146f = m36307b.m36146f();
                        if (Boolean.TRUE.equals(map.get(m36307b))) {
                            if (FragmentManager.m36479H0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + m36146f + " as this Fragment was involved in a Transition.");
                            }
                            c1589k.m36308a();
                        } else {
                            if (m36307b.m36147e() == AbstractC1636s.C1641e.EnumC1644c.GONE) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                list2.remove(m36307b);
                            }
                            View view = m36146f.mView;
                            m36157m.startViewTransition(view);
                            animator.addListener(new C1580c(m36157m, view, z2, m36307b, c1589k));
                            animator.setTarget(view);
                            animator.start();
                            c1589k.m36306c().m37975c(new C1581d(animator));
                            z3 = true;
                        }
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C1589k c1589k2 = (C1589k) it.next();
            AbstractC1636s.C1641e m36307b2 = c1589k2.m36307b();
            Fragment m36146f2 = m36307b2.m36146f();
            if (z) {
                if (FragmentManager.m36479H0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + m36146f2 + " as Animations cannot run alongside Transitions.");
                }
                c1589k2.m36308a();
            } else if (z3) {
                if (FragmentManager.m36479H0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + m36146f2 + " as Animations cannot run alongside Animators.");
                }
                c1589k2.m36308a();
            } else {
                View view2 = m36146f2.mView;
                Animation animation = (Animation) C1138f.m37824f(((C1592d.C1597d) C1138f.m37824f(c1589k2.m36309e(context))).f4219a);
                if (m36307b2.m36147e() != AbstractC1636s.C1641e.EnumC1644c.REMOVED) {
                    view2.startAnimation(animation);
                    c1589k2.m36308a();
                } else {
                    m36157m.startViewTransition(view2);
                    C1592d.RunnableC1598e runnableC1598e = new C1592d.RunnableC1598e(animation, m36157m, view2);
                    runnableC1598e.setAnimationListener(new animationAnimation$AnimationListenerC1582e(m36157m, view2, c1589k2));
                    view2.startAnimation(runnableC1598e);
                }
                c1589k2.m36306c().m37975c(new C1584f(view2, m36157m, c1589k2));
            }
        }
    }

    /* renamed from: x */
    private Map<AbstractC1636s.C1641e, Boolean> m36310x(List<C1591m> list, List<AbstractC1636s.C1641e> list2, boolean z, AbstractC1636s.C1641e c1641e, AbstractC1636s.C1641e c1641e2) {
        Iterator<C1591m> it;
        View view;
        Object obj;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        AbstractC1636s.C1641e c1641e3;
        AbstractC1636s.C1641e c1641e4;
        View view2;
        Object mo35162n;
        C0624a c0624a;
        ArrayList<View> arrayList3;
        C1577c c1577c;
        AbstractC1636s.C1641e c1641e5;
        ArrayList<View> arrayList4;
        Rect rect;
        AbstractC1631q abstractC1631q;
        AbstractC1636s.C1641e c1641e6;
        View view3;
        SharedElementCallback enterTransitionCallback;
        SharedElementCallback exitTransitionCallback;
        ArrayList<String> arrayList5;
        View view4;
        View view5;
        String m36195q;
        ArrayList<String> arrayList6;
        C1577c c1577c2 = this;
        boolean z2 = z;
        AbstractC1636s.C1641e c1641e7 = c1641e;
        AbstractC1636s.C1641e c1641e8 = c1641e2;
        HashMap hashMap = new HashMap();
        AbstractC1631q abstractC1631q2 = null;
        for (C1591m c1591m : list) {
            if (!c1591m.m36305d()) {
                AbstractC1631q m36304e = c1591m.m36304e();
                if (abstractC1631q2 == null) {
                    abstractC1631q2 = m36304e;
                } else if (m36304e != null && abstractC1631q2 != m36304e) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + c1591m.m36307b().m36146f() + " returned Transition " + c1591m.m36301h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (abstractC1631q2 == null) {
            for (C1591m c1591m2 : list) {
                hashMap.put(c1591m2.m36307b(), Boolean.FALSE);
                c1591m2.m36308a();
            }
            return hashMap;
        }
        View view6 = new View(m36157m().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList7 = new ArrayList<>();
        ArrayList<View> arrayList8 = new ArrayList<>();
        C0624a c0624a2 = new C0624a();
        Object obj3 = null;
        View view7 = null;
        boolean z3 = false;
        for (C1591m c1591m3 : list) {
            if (!c1591m3.m36300i() || c1641e7 == null || c1641e8 == null) {
                c0624a = c0624a2;
                arrayList3 = arrayList8;
                c1577c = c1577c2;
                c1641e5 = c1641e7;
                arrayList4 = arrayList7;
                rect = rect2;
                abstractC1631q = abstractC1631q2;
                c1641e6 = c1641e8;
                view3 = view6;
                view7 = view7;
            } else {
                Object mo35170B = abstractC1631q2.mo35170B(abstractC1631q2.mo35164g(c1591m3.m36302g()));
                ArrayList<String> sharedElementSourceNames = c1641e2.m36146f().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = c1641e.m36146f().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = c1641e.m36146f().getSharedElementTargetNames();
                View view8 = view7;
                int i = 0;
                while (i < sharedElementTargetNames.size()) {
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i));
                    ArrayList<String> arrayList9 = sharedElementTargetNames;
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i));
                    }
                    i++;
                    sharedElementTargetNames = arrayList9;
                }
                ArrayList<String> sharedElementTargetNames2 = c1641e2.m36146f().getSharedElementTargetNames();
                if (!z2) {
                    enterTransitionCallback = c1641e.m36146f().getExitTransitionCallback();
                    exitTransitionCallback = c1641e2.m36146f().getEnterTransitionCallback();
                } else {
                    enterTransitionCallback = c1641e.m36146f().getEnterTransitionCallback();
                    exitTransitionCallback = c1641e2.m36146f().getExitTransitionCallback();
                }
                int i2 = 0;
                for (int size = sharedElementSourceNames.size(); i2 < size; size = size) {
                    c0624a2.put(sharedElementSourceNames.get(i2), sharedElementTargetNames2.get(i2));
                    i2++;
                }
                C0624a c0624a3 = new C0624a();
                c1577c2.m36313u(c0624a3, c1641e.m36146f().mView);
                c0624a3.m39508p(sharedElementSourceNames);
                if (enterTransitionCallback != null) {
                    enterTransitionCallback.m38693d(sharedElementSourceNames, c0624a3);
                    int size2 = sharedElementSourceNames.size() - 1;
                    while (size2 >= 0) {
                        String str = sharedElementSourceNames.get(size2);
                        View view9 = (View) c0624a3.get(str);
                        if (view9 == null) {
                            c0624a2.remove(str);
                            arrayList6 = sharedElementSourceNames;
                        } else {
                            arrayList6 = sharedElementSourceNames;
                            if (!str.equals(C1365w0.m37240K(view9))) {
                                c0624a2.put(C1365w0.m37240K(view9), (String) c0624a2.remove(str));
                            }
                        }
                        size2--;
                        sharedElementSourceNames = arrayList6;
                    }
                    arrayList5 = sharedElementSourceNames;
                } else {
                    arrayList5 = sharedElementSourceNames;
                    c0624a2.m39508p(c0624a3.keySet());
                }
                C0624a c0624a4 = new C0624a();
                c1577c2.m36313u(c0624a4, c1641e2.m36146f().mView);
                c0624a4.m39508p(sharedElementTargetNames2);
                c0624a4.m39508p(c0624a2.values());
                if (exitTransitionCallback != null) {
                    exitTransitionCallback.m38693d(sharedElementTargetNames2, c0624a4);
                    for (int size3 = sharedElementTargetNames2.size() - 1; size3 >= 0; size3--) {
                        String str2 = sharedElementTargetNames2.get(size3);
                        View view10 = (View) c0624a4.get(str2);
                        if (view10 == null) {
                            String m36195q2 = C1616o.m36195q(c0624a2, str2);
                            if (m36195q2 != null) {
                                c0624a2.remove(m36195q2);
                            }
                        } else if (!str2.equals(C1365w0.m37240K(view10)) && (m36195q = C1616o.m36195q(c0624a2, str2)) != null) {
                            c0624a2.put(m36195q, C1365w0.m37240K(view10));
                        }
                    }
                } else {
                    C1616o.m36187y(c0624a2, c0624a4);
                }
                c1577c2.m36312v(c0624a3, c0624a2.keySet());
                c1577c2.m36312v(c0624a4, c0624a2.values());
                if (c0624a2.isEmpty()) {
                    arrayList7.clear();
                    arrayList8.clear();
                    c1641e5 = c1641e;
                    c0624a = c0624a2;
                    arrayList3 = arrayList8;
                    c1577c = c1577c2;
                    arrayList4 = arrayList7;
                    rect = rect2;
                    view3 = view6;
                    abstractC1631q = abstractC1631q2;
                    view7 = view8;
                    obj3 = null;
                    c1641e6 = c1641e2;
                } else {
                    C1616o.m36206f(c1641e2.m36146f(), c1641e.m36146f(), z2, c0624a3, true);
                    ArrayList<String> arrayList10 = arrayList5;
                    HashMap hashMap2 = hashMap;
                    View view11 = view6;
                    c0624a = c0624a2;
                    ArrayList<View> arrayList11 = arrayList8;
                    ViewTreeObserver$OnPreDrawListenerC1354u0.m37280a(m36157m(), new RunnableC1585g(c1641e2, c1641e, z, c0624a4));
                    arrayList7.addAll(c0624a3.values());
                    if (arrayList10.isEmpty()) {
                        view7 = view8;
                    } else {
                        View view12 = (View) c0624a3.get(arrayList10.get(0));
                        abstractC1631q2.mo35156v(mo35170B, view12);
                        view7 = view12;
                    }
                    arrayList3 = arrayList11;
                    arrayList3.addAll(c0624a4.values());
                    if (sharedElementTargetNames2.isEmpty() || (view5 = (View) c0624a4.get(sharedElementTargetNames2.get(0))) == null) {
                        c1577c = this;
                        view4 = view11;
                    } else {
                        c1577c = this;
                        ViewTreeObserver$OnPreDrawListenerC1354u0.m37280a(m36157m(), new RunnableC1586h(abstractC1631q2, view5, rect2));
                        view4 = view11;
                        z3 = true;
                    }
                    abstractC1631q2.mo35155z(mo35170B, view4, arrayList7);
                    arrayList4 = arrayList7;
                    rect = rect2;
                    view3 = view4;
                    abstractC1631q = abstractC1631q2;
                    abstractC1631q2.mo35158t(mo35170B, null, null, null, null, mo35170B, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    c1641e5 = c1641e;
                    hashMap = hashMap2;
                    hashMap.put(c1641e5, bool);
                    c1641e6 = c1641e2;
                    hashMap.put(c1641e6, bool);
                    obj3 = mo35170B;
                }
            }
            z2 = z;
            arrayList7 = arrayList4;
            c1577c2 = c1577c;
            rect2 = rect;
            view6 = view3;
            c1641e8 = c1641e6;
            c0624a2 = c0624a;
            arrayList8 = arrayList3;
            c1641e7 = c1641e5;
            abstractC1631q2 = abstractC1631q;
        }
        View view13 = view7;
        C0624a c0624a5 = c0624a2;
        ArrayList<View> arrayList12 = arrayList8;
        C1577c c1577c3 = c1577c2;
        AbstractC1636s.C1641e c1641e9 = c1641e7;
        ArrayList<View> arrayList13 = arrayList7;
        Rect rect3 = rect2;
        AbstractC1631q abstractC1631q3 = abstractC1631q2;
        AbstractC1636s.C1641e c1641e10 = c1641e8;
        View view14 = view6;
        ArrayList arrayList14 = new ArrayList();
        Iterator<C1591m> it2 = list.iterator();
        Object obj4 = null;
        Object obj5 = null;
        while (it2.hasNext()) {
            C1591m next = it2.next();
            if (next.m36305d()) {
                hashMap.put(next.m36307b(), Boolean.FALSE);
                next.m36308a();
            } else {
                Object mo35164g = abstractC1631q3.mo35164g(next.m36301h());
                AbstractC1636s.C1641e m36307b = next.m36307b();
                boolean z4 = obj3 != null && (m36307b == c1641e9 || m36307b == c1641e10);
                if (mo35164g == null) {
                    if (!z4) {
                        hashMap.put(m36307b, Boolean.FALSE);
                        next.m36308a();
                    }
                    arrayList2 = arrayList12;
                    arrayList = arrayList13;
                    it = it2;
                    view = view14;
                    mo35162n = obj4;
                    c1641e3 = c1641e10;
                    view2 = view13;
                } else {
                    it = it2;
                    ArrayList<View> arrayList15 = new ArrayList<>();
                    Object obj6 = obj4;
                    c1577c3.m36314t(arrayList15, m36307b.m36146f().mView);
                    if (z4) {
                        if (m36307b == c1641e9) {
                            arrayList15.removeAll(arrayList13);
                        } else {
                            arrayList15.removeAll(arrayList12);
                        }
                    }
                    if (arrayList15.isEmpty()) {
                        abstractC1631q3.mo35168a(mo35164g, view14);
                        arrayList2 = arrayList12;
                        arrayList = arrayList13;
                        view = view14;
                        c1641e4 = m36307b;
                        obj2 = obj5;
                        c1641e3 = c1641e10;
                        obj = obj6;
                    } else {
                        abstractC1631q3.mo35167b(mo35164g, arrayList15);
                        view = view14;
                        obj = obj6;
                        arrayList = arrayList13;
                        obj2 = obj5;
                        arrayList2 = arrayList12;
                        c1641e3 = c1641e10;
                        abstractC1631q3.mo35158t(mo35164g, mo35164g, arrayList15, null, null, null, null);
                        if (m36307b.m36147e() == AbstractC1636s.C1641e.EnumC1644c.GONE) {
                            c1641e4 = m36307b;
                            list2.remove(c1641e4);
                            ArrayList<View> arrayList16 = new ArrayList<>(arrayList15);
                            arrayList16.remove(c1641e4.m36146f().mView);
                            abstractC1631q3.mo35159r(mo35164g, c1641e4.m36146f().mView, arrayList16);
                            ViewTreeObserver$OnPreDrawListenerC1354u0.m37280a(m36157m(), new RunnableC1587i(arrayList15));
                        } else {
                            c1641e4 = m36307b;
                        }
                    }
                    if (c1641e4.m36147e() == AbstractC1636s.C1641e.EnumC1644c.VISIBLE) {
                        arrayList14.addAll(arrayList15);
                        if (z3) {
                            abstractC1631q3.mo35157u(mo35164g, rect3);
                        }
                        view2 = view13;
                    } else {
                        view2 = view13;
                        abstractC1631q3.mo35156v(mo35164g, view2);
                    }
                    hashMap.put(c1641e4, Boolean.TRUE);
                    if (next.m36299j()) {
                        obj5 = abstractC1631q3.mo35162n(obj2, mo35164g, null);
                        mo35162n = obj;
                    } else {
                        mo35162n = abstractC1631q3.mo35162n(obj, mo35164g, null);
                        obj5 = obj2;
                    }
                }
                c1641e10 = c1641e3;
                obj4 = mo35162n;
                view13 = view2;
                view14 = view;
                arrayList13 = arrayList;
                arrayList12 = arrayList2;
                it2 = it;
            }
        }
        ArrayList<View> arrayList17 = arrayList12;
        ArrayList<View> arrayList18 = arrayList13;
        AbstractC1636s.C1641e c1641e11 = c1641e10;
        Object mo35163m = abstractC1631q3.mo35163m(obj5, obj4, obj3);
        for (C1591m c1591m4 : list) {
            if (!c1591m4.m36305d()) {
                Object m36301h = c1591m4.m36301h();
                AbstractC1636s.C1641e m36307b2 = c1591m4.m36307b();
                boolean z5 = obj3 != null && (m36307b2 == c1641e9 || m36307b2 == c1641e11);
                if (m36301h != null || z5) {
                    if (!C1365w0.m37224U(m36157m())) {
                        if (FragmentManager.m36479H0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + m36157m() + " has not been laid out. Completing operation " + m36307b2);
                        }
                        c1591m4.m36308a();
                    } else {
                        abstractC1631q3.mo36173w(c1591m4.m36307b().m36146f(), mo35163m, c1591m4.m36306c(), new RunnableC1588j(c1591m4));
                    }
                }
            }
        }
        if (C1365w0.m37224U(m36157m())) {
            C1616o.m36213B(arrayList14, 4);
            ArrayList<String> m36175o = abstractC1631q3.m36175o(arrayList17);
            abstractC1631q3.mo35166c(m36157m(), mo35163m);
            abstractC1631q3.m36171y(m36157m(), arrayList18, arrayList17, m36175o, c0624a5);
            C1616o.m36213B(arrayList14, 0);
            abstractC1631q3.mo35171A(obj3, arrayList18, arrayList17);
            return hashMap;
        }
        return hashMap;
    }

    @Override // androidx.fragment.app.AbstractC1636s
    /* renamed from: f */
    void mo36164f(List<AbstractC1636s.C1641e> list, boolean z) {
        AbstractC1636s.C1641e c1641e = null;
        AbstractC1636s.C1641e c1641e2 = null;
        for (AbstractC1636s.C1641e c1641e3 : list) {
            AbstractC1636s.C1641e.EnumC1644c m36137c = AbstractC1636s.C1641e.EnumC1644c.m36137c(c1641e3.m36146f().mView);
            int i = C1578a.f4166a[c1641e3.m36147e().ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                if (i == 4 && m36137c != AbstractC1636s.C1641e.EnumC1644c.VISIBLE) {
                    c1641e2 = c1641e3;
                }
            } else if (m36137c == AbstractC1636s.C1641e.EnumC1644c.VISIBLE && c1641e == null) {
                c1641e = c1641e3;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<AbstractC1636s.C1641e> arrayList3 = new ArrayList(list);
        for (AbstractC1636s.C1641e c1641e4 : list) {
            C1056f c1056f = new C1056f();
            c1641e4.m36142j(c1056f);
            arrayList.add(new C1589k(c1641e4, c1056f, z));
            C1056f c1056f2 = new C1056f();
            c1641e4.m36142j(c1056f2);
            boolean z2 = false;
            if (z) {
                if (c1641e4 != c1641e) {
                    arrayList2.add(new C1591m(c1641e4, c1056f2, z, z2));
                    c1641e4.m36151a(new RunnableC1579b(arrayList3, c1641e4));
                }
                z2 = true;
                arrayList2.add(new C1591m(c1641e4, c1056f2, z, z2));
                c1641e4.m36151a(new RunnableC1579b(arrayList3, c1641e4));
            } else {
                if (c1641e4 != c1641e2) {
                    arrayList2.add(new C1591m(c1641e4, c1056f2, z, z2));
                    c1641e4.m36151a(new RunnableC1579b(arrayList3, c1641e4));
                }
                z2 = true;
                arrayList2.add(new C1591m(c1641e4, c1056f2, z, z2));
                c1641e4.m36151a(new RunnableC1579b(arrayList3, c1641e4));
            }
        }
        Map<AbstractC1636s.C1641e, Boolean> m36310x = m36310x(arrayList2, arrayList3, z, c1641e, c1641e2);
        m36311w(arrayList, arrayList3, m36310x.containsValue(Boolean.TRUE), m36310x);
        for (AbstractC1636s.C1641e c1641e5 : arrayList3) {
            m36315s(c1641e5);
        }
        arrayList3.clear();
    }

    /* renamed from: s */
    void m36315s(AbstractC1636s.C1641e c1641e) {
        c1641e.m36147e().m36139a(c1641e.m36146f().mView);
    }

    /* renamed from: t */
    void m36314t(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C1279j2.m37427a(viewGroup)) {
                if (!arrayList.contains(view)) {
                    arrayList.add(viewGroup);
                    return;
                }
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m36314t(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* renamed from: u */
    void m36313u(Map<String, View> map, View view) {
        String m37240K = C1365w0.m37240K(view);
        if (m37240K != null) {
            map.put(m37240K, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m36313u(map, childAt);
                }
            }
        }
    }

    /* renamed from: v */
    void m36312v(C0624a<String, View> c0624a, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = c0624a.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(C1365w0.m37240K(it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
