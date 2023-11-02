package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.collection.C0624a;
import androidx.core.view.C1365w0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p330s0.C12338a;

/* renamed from: androidx.transition.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1881j {

    /* renamed from: a */
    private static Transition f5184a = new C12338a();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<C0624a<ViewGroup, ArrayList<Transition>>>> f5185b = new ThreadLocal<>();

    /* renamed from: c */
    static ArrayList<ViewGroup> f5186c = new ArrayList<>();

    /* renamed from: androidx.transition.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class ViewTreeObserver$OnPreDrawListenerC1882a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: j */
        Transition f5187j;

        /* renamed from: k */
        ViewGroup f5188k;

        /* renamed from: androidx.transition.j$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class C1883a extends C1880i {

            /* renamed from: a */
            final /* synthetic */ C0624a f5189a;

            C1883a(C0624a c0624a) {
                ViewTreeObserver$OnPreDrawListenerC1882a.this = r1;
                this.f5189a = c0624a;
            }

            @Override // androidx.transition.C1880i, androidx.transition.Transition.InterfaceC1848f
            public void onTransitionEnd(Transition transition) {
                ((ArrayList) this.f5189a.get(ViewTreeObserver$OnPreDrawListenerC1882a.this.f5188k)).remove(transition);
                transition.mo35142S(this);
            }
        }

        ViewTreeObserver$OnPreDrawListenerC1882a(Transition transition, ViewGroup viewGroup) {
            this.f5187j = transition;
            this.f5188k = viewGroup;
        }

        /* renamed from: a */
        private void m35144a() {
            this.f5188k.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f5188k.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            m35144a();
            if (!C1881j.f5186c.remove(this.f5188k)) {
                return true;
            }
            C0624a<ViewGroup, ArrayList<Transition>> m35147b = C1881j.m35147b();
            ArrayList<Transition> arrayList = m35147b.get(this.f5188k);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                m35147b.put(this.f5188k, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f5187j);
            this.f5187j.mo35134b(new C1883a(m35147b));
            this.f5187j.m35215m(this.f5188k, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).mo35140U(this.f5188k);
                }
            }
            this.f5187j.m35222R(this.f5188k);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            m35144a();
            C1881j.f5186c.remove(this.f5188k);
            ArrayList<Transition> arrayList = C1881j.m35147b().get(this.f5188k);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<Transition> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo35140U(this.f5188k);
                }
            }
            this.f5187j.m35214n(true);
        }
    }

    /* renamed from: a */
    public static void m35148a(ViewGroup viewGroup, Transition transition) {
        if (!f5186c.contains(viewGroup) && C1365w0.m37224U(viewGroup)) {
            f5186c.add(viewGroup);
            if (transition == null) {
                transition = f5184a;
            }
            Transition clone = transition.clone();
            m35145d(viewGroup, clone);
            C1879h.m35149c(viewGroup, null);
            m35146c(viewGroup, clone);
        }
    }

    /* renamed from: b */
    static C0624a<ViewGroup, ArrayList<Transition>> m35147b() {
        C0624a<ViewGroup, ArrayList<Transition>> c0624a;
        WeakReference<C0624a<ViewGroup, ArrayList<Transition>>> weakReference = f5185b.get();
        if (weakReference != null && (c0624a = weakReference.get()) != null) {
            return c0624a;
        }
        C0624a<ViewGroup, ArrayList<Transition>> c0624a2 = new C0624a<>();
        f5185b.set(new WeakReference<>(c0624a2));
        return c0624a2;
    }

    /* renamed from: c */
    private static void m35146c(ViewGroup viewGroup, Transition transition) {
        if (transition != null && viewGroup != null) {
            ViewTreeObserver$OnPreDrawListenerC1882a viewTreeObserver$OnPreDrawListenerC1882a = new ViewTreeObserver$OnPreDrawListenerC1882a(transition, viewGroup);
            viewGroup.addOnAttachStateChangeListener(viewTreeObserver$OnPreDrawListenerC1882a);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC1882a);
        }
    }

    /* renamed from: d */
    private static void m35145d(ViewGroup viewGroup, Transition transition) {
        ArrayList<Transition> arrayList = m35147b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<Transition> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo35143Q(viewGroup);
            }
        }
        if (transition != null) {
            transition.m35215m(viewGroup, true);
        }
        C1879h m35150b = C1879h.m35150b(viewGroup);
        if (m35150b != null) {
            m35150b.m35151a();
        }
    }
}