package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC1631q;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"RestrictedApi"})
/* renamed from: androidx.transition.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1871d extends AbstractC1631q {

    /* renamed from: androidx.transition.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1872a extends Transition.AbstractC1847e {

        /* renamed from: a */
        final /* synthetic */ Rect f5167a;

        C1872a(Rect rect) {
            C1871d.this = r1;
            this.f5167a = rect;
        }
    }

    /* renamed from: androidx.transition.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1873b implements Transition.InterfaceC1848f {

        /* renamed from: a */
        final /* synthetic */ View f5169a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f5170b;

        C1873b(View view, ArrayList arrayList) {
            C1871d.this = r1;
            this.f5169a = view;
            this.f5170b = arrayList;
        }

        @Override // androidx.transition.Transition.InterfaceC1848f
        public void onTransitionCancel(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC1848f
        public void onTransitionEnd(Transition transition) {
            transition.mo35142S(this);
            this.f5169a.setVisibility(8);
            int size = this.f5170b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f5170b.get(i)).setVisibility(0);
            }
        }

        @Override // androidx.transition.Transition.InterfaceC1848f
        public void onTransitionPause(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC1848f
        public void onTransitionResume(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC1848f
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.transition.d$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1874c extends C1880i {

        /* renamed from: a */
        final /* synthetic */ Object f5172a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f5173b;

        /* renamed from: c */
        final /* synthetic */ Object f5174c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f5175d;

        /* renamed from: e */
        final /* synthetic */ Object f5176e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f5177f;

        C1874c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            C1871d.this = r1;
            this.f5172a = obj;
            this.f5173b = arrayList;
            this.f5174c = obj2;
            this.f5175d = arrayList2;
            this.f5176e = obj3;
            this.f5177f = arrayList3;
        }

        @Override // androidx.transition.C1880i, androidx.transition.Transition.InterfaceC1848f
        public void onTransitionEnd(Transition transition) {
            transition.mo35142S(this);
        }

        @Override // androidx.transition.C1880i, androidx.transition.Transition.InterfaceC1848f
        public void onTransitionStart(Transition transition) {
            Object obj = this.f5172a;
            if (obj != null) {
                C1871d.this.mo35160q(obj, this.f5173b, null);
            }
            Object obj2 = this.f5174c;
            if (obj2 != null) {
                C1871d.this.mo35160q(obj2, this.f5175d, null);
            }
            Object obj3 = this.f5176e;
            if (obj3 != null) {
                C1871d.this.mo35160q(obj3, this.f5177f, null);
            }
        }
    }

    /* renamed from: androidx.transition.d$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1875d extends Transition.AbstractC1847e {

        /* renamed from: a */
        final /* synthetic */ Rect f5179a;

        C1875d(Rect rect) {
            C1871d.this = r1;
            this.f5179a = rect;
        }
    }

    /* renamed from: C */
    private static boolean m35169C(Transition transition) {
        if (AbstractC1631q.m36176l(transition.m35234C()) && AbstractC1631q.m36176l(transition.m35233D()) && AbstractC1631q.m36176l(transition.m35232E())) {
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.AbstractC1631q
    /* renamed from: A */
    public void mo35171A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C1884k c1884k = (C1884k) obj;
        if (c1884k != null) {
            c1884k.m35231F().clear();
            c1884k.m35231F().addAll(arrayList2);
            mo35160q(c1884k, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.AbstractC1631q
    /* renamed from: B */
    public Object mo35170B(Object obj) {
        if (obj == null) {
            return null;
        }
        C1884k c1884k = new C1884k();
        c1884k.m35126h0((Transition) obj);
        return c1884k;
    }

    @Override // androidx.fragment.app.AbstractC1631q
    /* renamed from: a */
    public void mo35168a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).mo35132c(view);
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
        if (transition instanceof C1884k) {
            C1884k c1884k = (C1884k) transition;
            int m35122k0 = c1884k.m35122k0();
            while (i < m35122k0) {
                mo35167b(c1884k.m35124j0(i), arrayList);
                i++;
            }
        } else if (!m35169C(transition) && AbstractC1631q.m36176l(transition.m35231F())) {
            int size = arrayList.size();
            while (i < size) {
                transition.mo35132c(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC1631q
    /* renamed from: c */
    public void mo35166c(ViewGroup viewGroup, Object obj) {
        C1881j.m35148a(viewGroup, (Transition) obj);
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
            transition = new C1884k().m35126h0(transition).m35126h0(transition2).m35115p0(1);
        } else if (transition == null) {
            if (transition2 != null) {
                transition = transition2;
            } else {
                transition = null;
            }
        }
        if (transition3 != null) {
            C1884k c1884k = new C1884k();
            if (transition != null) {
                c1884k.m35126h0(transition);
            }
            c1884k.m35126h0(transition3);
            return c1884k;
        }
        return transition;
    }

    @Override // androidx.fragment.app.AbstractC1631q
    /* renamed from: n */
    public Object mo35162n(Object obj, Object obj2, Object obj3) {
        C1884k c1884k = new C1884k();
        if (obj != null) {
            c1884k.m35126h0((Transition) obj);
        }
        if (obj2 != null) {
            c1884k.m35126h0((Transition) obj2);
        }
        if (obj3 != null) {
            c1884k.m35126h0((Transition) obj3);
        }
        return c1884k;
    }

    @Override // androidx.fragment.app.AbstractC1631q
    /* renamed from: p */
    public void mo35161p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).mo35141T(view);
        }
    }

    @Override // androidx.fragment.app.AbstractC1631q
    /* renamed from: q */
    public void mo35160q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int size;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof C1884k) {
            C1884k c1884k = (C1884k) transition;
            int m35122k0 = c1884k.m35122k0();
            while (i < m35122k0) {
                mo35160q(c1884k.m35124j0(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m35169C(transition)) {
            List<View> m35231F = transition.m35231F();
            if (m35231F.size() == arrayList.size() && m35231F.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i < size) {
                    transition.mo35132c(arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    transition.mo35141T(arrayList.get(size2));
                }
            }
        }
    }

    @Override // androidx.fragment.app.AbstractC1631q
    /* renamed from: r */
    public void mo35159r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).mo35134b(new C1873b(view, arrayList));
    }

    @Override // androidx.fragment.app.AbstractC1631q
    /* renamed from: t */
    public void mo35158t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).mo35134b(new C1874c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.AbstractC1631q
    /* renamed from: u */
    public void mo35157u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).mo35137Y(new C1875d(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC1631q
    /* renamed from: v */
    public void mo35156v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m36177k(view, rect);
            ((Transition) obj).mo35137Y(new C1872a(rect));
        }
    }

    @Override // androidx.fragment.app.AbstractC1631q
    /* renamed from: z */
    public void mo35155z(Object obj, View view, ArrayList<View> arrayList) {
        C1884k c1884k = (C1884k) obj;
        List<View> m35231F = c1884k.m35231F();
        m35231F.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC1631q.m36182d(m35231F, arrayList.get(i));
        }
        m35231F.add(view);
        arrayList.add(view);
        mo35167b(c1884k, arrayList);
    }
}