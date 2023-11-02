package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p018os.C1056f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.fragment.app.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C1625p extends AbstractC1631q {

    /* renamed from: androidx.fragment.app.p$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1626a extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f4316a;

        C1626a(Rect rect) {
            this.f4316a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f4316a;
        }
    }

    /* renamed from: androidx.fragment.app.p$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1627b implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f4318a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f4319b;

        C1627b(View view, ArrayList arrayList) {
            this.f4318a = view;
            this.f4319b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f4318a.setVisibility(8);
            int size = this.f4319b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f4319b.get(i)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* renamed from: androidx.fragment.app.p$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1628c implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f4321a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f4322b;

        /* renamed from: c */
        final /* synthetic */ Object f4323c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f4324d;

        /* renamed from: e */
        final /* synthetic */ Object f4325e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f4326f;

        C1628c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f4321a = obj;
            this.f4322b = arrayList;
            this.f4323c = obj2;
            this.f4324d = arrayList2;
            this.f4325e = obj3;
            this.f4326f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f4321a;
            if (obj != null) {
                C1625p.this.mo35160q(obj, this.f4322b, null);
            }
            Object obj2 = this.f4323c;
            if (obj2 != null) {
                C1625p.this.mo35160q(obj2, this.f4324d, null);
            }
            Object obj3 = this.f4325e;
            if (obj3 != null) {
                C1625p.this.mo35160q(obj3, this.f4326f, null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.p$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1629d implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f4328a;

        C1629d(Runnable runnable) {
            this.f4328a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f4328a.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.p$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1630e extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f4330a;

        C1630e(Rect rect) {
            this.f4330a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f4330a;
            if (rect != null && !rect.isEmpty()) {
                return this.f4330a;
            }
            return null;
        }
    }

    /* renamed from: C */
    private static boolean m36183C(Transition transition) {
        if (AbstractC1631q.m36176l(transition.getTargetIds()) && AbstractC1631q.m36176l(transition.getTargetNames()) && AbstractC1631q.m36176l(transition.getTargetTypes())) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.AbstractC1631q
    /* renamed from: A */
    public void mo35171A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo35160q(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC1631q
    /* renamed from: B */
    public Object mo35170B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC1631q
    /* renamed from: a */
    public void mo35168a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC1631q
    /* renamed from: b */
    public void mo35167b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo35167b(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
        } else if (!m36183C(transition) && AbstractC1631q.m36176l(transition.getTargets())) {
            int size = arrayList.size();
            while (i < size) {
                transition.addTarget(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC1631q
    /* renamed from: c */
    public void mo35166c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.AbstractC1631q
    /* renamed from: e */
    public boolean mo35165e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.AbstractC1631q
    /* renamed from: g */
    public Object mo35164g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.AbstractC1631q
    /* renamed from: m */
    public Object mo35163m(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            if (transition2 != null) {
                transition = transition2;
            } else {
                transition = null;
            }
        }
        if (transition3 != null) {
            TransitionSet transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.addTransition(transition);
            }
            transitionSet.addTransition(transition3);
            return transitionSet;
        }
        return transition;
    }

    @Override // androidx.fragment.app.AbstractC1631q
    /* renamed from: n */
    public Object mo35162n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // androidx.fragment.app.AbstractC1631q
    /* renamed from: p */
    public void mo35161p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC1631q
    /* renamed from: q */
    public void mo35160q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        int size;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo35160q(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m36183C(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                size = 0;
            } else {
                size = arrayList2.size();
            }
            while (i < size) {
                transition.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC1631q
    /* renamed from: r */
    public void mo35159r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C1627b(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC1631q
    /* renamed from: t */
    public void mo35158t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C1628c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC1631q
    /* renamed from: u */
    public void mo35157u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C1630e(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC1631q
    /* renamed from: v */
    public void mo35156v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m36177k(view, rect);
            ((Transition) obj).setEpicenterCallback(new C1626a(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC1631q
    /* renamed from: w */
    public void mo36173w(Fragment fragment, Object obj, C1056f c1056f, Runnable runnable) {
        ((Transition) obj).addListener(new C1629d(runnable));
    }

    @Override // androidx.fragment.app.AbstractC1631q
    /* renamed from: z */
    public void mo35155z(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC1631q.m36182d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo35167b(transitionSet, arrayList);
    }
}
