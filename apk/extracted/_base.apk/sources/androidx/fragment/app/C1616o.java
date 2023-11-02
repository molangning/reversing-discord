package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.collection.C0624a;
import androidx.core.app.SharedElementCallback;
import androidx.core.p018os.C1056f;
import androidx.core.view.C1365w0;
import androidx.core.view.ViewTreeObserver$OnPreDrawListenerC1354u0;
import androidx.transition.C1871d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1616o {

    /* renamed from: a */
    private static final int[] f4273a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    static final AbstractC1631q f4274b = new C1625p();

    /* renamed from: c */
    static final AbstractC1631q f4275c = m36188x();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1617a implements Runnable {

        /* renamed from: j */
        final /* synthetic */ InterfaceC1623g f4276j;

        /* renamed from: k */
        final /* synthetic */ Fragment f4277k;

        /* renamed from: l */
        final /* synthetic */ C1056f f4278l;

        RunnableC1617a(InterfaceC1623g interfaceC1623g, Fragment fragment, C1056f c1056f) {
            this.f4276j = interfaceC1623g;
            this.f4277k = fragment;
            this.f4278l = c1056f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4276j.mo36185a(this.f4277k, this.f4278l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1618b implements Runnable {

        /* renamed from: j */
        final /* synthetic */ ArrayList f4279j;

        RunnableC1618b(ArrayList arrayList) {
            this.f4279j = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1616o.m36213B(this.f4279j, 4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1619c implements Runnable {

        /* renamed from: j */
        final /* synthetic */ InterfaceC1623g f4280j;

        /* renamed from: k */
        final /* synthetic */ Fragment f4281k;

        /* renamed from: l */
        final /* synthetic */ C1056f f4282l;

        RunnableC1619c(InterfaceC1623g interfaceC1623g, Fragment fragment, C1056f c1056f) {
            this.f4280j = interfaceC1623g;
            this.f4281k = fragment;
            this.f4282l = c1056f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4280j.mo36185a(this.f4281k, this.f4282l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1620d implements Runnable {

        /* renamed from: j */
        final /* synthetic */ Object f4283j;

        /* renamed from: k */
        final /* synthetic */ AbstractC1631q f4284k;

        /* renamed from: l */
        final /* synthetic */ View f4285l;

        /* renamed from: m */
        final /* synthetic */ Fragment f4286m;

        /* renamed from: n */
        final /* synthetic */ ArrayList f4287n;

        /* renamed from: o */
        final /* synthetic */ ArrayList f4288o;

        /* renamed from: p */
        final /* synthetic */ ArrayList f4289p;

        /* renamed from: q */
        final /* synthetic */ Object f4290q;

        RunnableC1620d(Object obj, AbstractC1631q abstractC1631q, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f4283j = obj;
            this.f4284k = abstractC1631q;
            this.f4285l = view;
            this.f4286m = fragment;
            this.f4287n = arrayList;
            this.f4288o = arrayList2;
            this.f4289p = arrayList3;
            this.f4290q = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f4283j;
            if (obj != null) {
                this.f4284k.mo35161p(obj, this.f4285l);
                this.f4288o.addAll(C1616o.m36201k(this.f4284k, this.f4283j, this.f4286m, this.f4287n, this.f4285l));
            }
            if (this.f4289p != null) {
                if (this.f4290q != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f4285l);
                    this.f4284k.mo35160q(this.f4290q, this.f4289p, arrayList);
                }
                this.f4289p.clear();
                this.f4289p.add(this.f4285l);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1621e implements Runnable {

        /* renamed from: j */
        final /* synthetic */ Fragment f4291j;

        /* renamed from: k */
        final /* synthetic */ Fragment f4292k;

        /* renamed from: l */
        final /* synthetic */ boolean f4293l;

        /* renamed from: m */
        final /* synthetic */ C0624a f4294m;

        /* renamed from: n */
        final /* synthetic */ View f4295n;

        /* renamed from: o */
        final /* synthetic */ AbstractC1631q f4296o;

        /* renamed from: p */
        final /* synthetic */ Rect f4297p;

        RunnableC1621e(Fragment fragment, Fragment fragment2, boolean z, C0624a c0624a, View view, AbstractC1631q abstractC1631q, Rect rect) {
            this.f4291j = fragment;
            this.f4292k = fragment2;
            this.f4293l = z;
            this.f4294m = c0624a;
            this.f4295n = view;
            this.f4296o = abstractC1631q;
            this.f4297p = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1616o.m36206f(this.f4291j, this.f4292k, this.f4293l, this.f4294m, false);
            View view = this.f4295n;
            if (view != null) {
                this.f4296o.m36177k(view, this.f4297p);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1622f implements Runnable {

        /* renamed from: j */
        final /* synthetic */ AbstractC1631q f4298j;

        /* renamed from: k */
        final /* synthetic */ C0624a f4299k;

        /* renamed from: l */
        final /* synthetic */ Object f4300l;

        /* renamed from: m */
        final /* synthetic */ C1624h f4301m;

        /* renamed from: n */
        final /* synthetic */ ArrayList f4302n;

        /* renamed from: o */
        final /* synthetic */ View f4303o;

        /* renamed from: p */
        final /* synthetic */ Fragment f4304p;

        /* renamed from: q */
        final /* synthetic */ Fragment f4305q;

        /* renamed from: r */
        final /* synthetic */ boolean f4306r;

        /* renamed from: s */
        final /* synthetic */ ArrayList f4307s;

        /* renamed from: t */
        final /* synthetic */ Object f4308t;

        /* renamed from: u */
        final /* synthetic */ Rect f4309u;

        RunnableC1622f(AbstractC1631q abstractC1631q, C0624a c0624a, Object obj, C1624h c1624h, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f4298j = abstractC1631q;
            this.f4299k = c0624a;
            this.f4300l = obj;
            this.f4301m = c1624h;
            this.f4302n = arrayList;
            this.f4303o = view;
            this.f4304p = fragment;
            this.f4305q = fragment2;
            this.f4306r = z;
            this.f4307s = arrayList2;
            this.f4308t = obj2;
            this.f4309u = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0624a<String, View> m36204h = C1616o.m36204h(this.f4298j, this.f4299k, this.f4300l, this.f4301m);
            if (m36204h != null) {
                this.f4302n.addAll(m36204h.values());
                this.f4302n.add(this.f4303o);
            }
            C1616o.m36206f(this.f4304p, this.f4305q, this.f4306r, m36204h, false);
            Object obj = this.f4300l;
            if (obj != null) {
                this.f4298j.mo35171A(obj, this.f4307s, this.f4302n);
                View m36192t = C1616o.m36192t(m36204h, this.f4301m, this.f4308t, this.f4306r);
                if (m36192t != null) {
                    this.f4298j.m36177k(m36192t, this.f4309u);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1623g {
        /* renamed from: a */
        void mo36185a(Fragment fragment, C1056f c1056f);

        /* renamed from: b */
        void mo36184b(Fragment fragment, C1056f c1056f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.o$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1624h {

        /* renamed from: a */
        public Fragment f4310a;

        /* renamed from: b */
        public boolean f4311b;

        /* renamed from: c */
        public C1574a f4312c;

        /* renamed from: d */
        public Fragment f4313d;

        /* renamed from: e */
        public boolean f4314e;

        /* renamed from: f */
        public C1574a f4315f;

        C1624h() {
        }
    }

    /* renamed from: A */
    private static void m36214A(AbstractC1631q abstractC1631q, Object obj, Object obj2, C0624a<String, View> c0624a, boolean z, C1574a c1574a) {
        String str;
        ArrayList<String> arrayList = c1574a.f4133p;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z) {
                str = c1574a.f4134q.get(0);
            } else {
                str = c1574a.f4133p.get(0);
            }
            View view = c0624a.get(str);
            abstractC1631q.mo35156v(obj, view);
            if (obj2 != null) {
                abstractC1631q.mo35156v(obj2, view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public static void m36213B(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public static void m36212C(Context context, FragmentContainer fragmentContainer, ArrayList<C1574a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z, InterfaceC1623g interfaceC1623g) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i3 = i; i3 < i2; i3++) {
            C1574a c1574a = arrayList.get(i3);
            if (arrayList2.get(i3).booleanValue()) {
                m36207e(c1574a, sparseArray, z);
            } else {
                m36209c(c1574a, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                int keyAt = sparseArray.keyAt(i4);
                C0624a<String, String> m36208d = m36208d(keyAt, arrayList, arrayList2, i, i2);
                C1624h c1624h = (C1624h) sparseArray.valueAt(i4);
                if (fragmentContainer.mo36506d() && (viewGroup = (ViewGroup) fragmentContainer.mo36507c(keyAt)) != null) {
                    if (z) {
                        m36197o(viewGroup, c1624h, view, m36208d, interfaceC1623g);
                    } else {
                        m36198n(viewGroup, c1624h, view, m36208d, interfaceC1623g);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m36211a(ArrayList<View> arrayList, C0624a<String, View> c0624a, Collection<String> collection) {
        for (int size = c0624a.size() - 1; size >= 0; size--) {
            View m39521n = c0624a.m39521n(size);
            if (collection.contains(C1365w0.m37240K(m39521n))) {
                arrayList.add(m39521n);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0039, code lost:
        if (r0.mAdded != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x006f, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x008b, code lost:
        if (r0.mHidden == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x008d, code lost:
        r9 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00c8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void m36210b(androidx.fragment.app.C1574a r8, androidx.fragment.app.FragmentTransaction.C1573a r9, android.util.SparseArray<androidx.fragment.app.C1616o.C1624h> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1616o.m36210b(androidx.fragment.app.a, androidx.fragment.app.FragmentTransaction$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: c */
    public static void m36209c(C1574a c1574a, SparseArray<C1624h> sparseArray, boolean z) {
        int size = c1574a.f4120c.size();
        for (int i = 0; i < size; i++) {
            m36210b(c1574a, c1574a.f4120c.get(i), sparseArray, false, z);
        }
    }

    /* renamed from: d */
    private static C0624a<String, String> m36208d(int i, ArrayList<C1574a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C0624a<String, String> c0624a = new C0624a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C1574a c1574a = arrayList.get(i4);
            if (c1574a.m36339B(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = c1574a.f4133p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = c1574a.f4133p;
                        arrayList4 = c1574a.f4134q;
                    } else {
                        ArrayList<String> arrayList6 = c1574a.f4133p;
                        arrayList3 = c1574a.f4134q;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = c0624a.remove(str2);
                        if (remove != null) {
                            c0624a.put(str, remove);
                        } else {
                            c0624a.put(str, str2);
                        }
                    }
                }
            }
        }
        return c0624a;
    }

    /* renamed from: e */
    public static void m36207e(C1574a c1574a, SparseArray<C1624h> sparseArray, boolean z) {
        if (!c1574a.f4149t.m36393q0().mo36506d()) {
            return;
        }
        for (int size = c1574a.f4120c.size() - 1; size >= 0; size--) {
            m36210b(c1574a, c1574a.f4120c.get(size), sparseArray, true, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static void m36206f(Fragment fragment, Fragment fragment2, boolean z, C0624a<String, View> c0624a, boolean z2) {
        SharedElementCallback enterTransitionCallback;
        int size;
        if (z) {
            enterTransitionCallback = fragment2.getEnterTransitionCallback();
        } else {
            enterTransitionCallback = fragment.getEnterTransitionCallback();
        }
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (c0624a == null) {
                size = 0;
            } else {
                size = c0624a.size();
            }
            for (int i = 0; i < size; i++) {
                arrayList2.add(c0624a.m39525j(i));
                arrayList.add(c0624a.m39521n(i));
            }
            if (z2) {
                enterTransitionCallback.m38690g(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.m38691f(arrayList2, arrayList, null);
            }
        }
    }

    /* renamed from: g */
    private static boolean m36205g(AbstractC1631q abstractC1631q, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!abstractC1631q.mo35165e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    static C0624a<String, View> m36204h(AbstractC1631q abstractC1631q, C0624a<String, String> c0624a, Object obj, C1624h c1624h) {
        SharedElementCallback enterTransitionCallback;
        ArrayList<String> arrayList;
        String m36195q;
        Fragment fragment = c1624h.f4310a;
        View view = fragment.getView();
        if (!c0624a.isEmpty() && obj != null && view != null) {
            C0624a<String, View> c0624a2 = new C0624a<>();
            abstractC1631q.m36178j(c0624a2, view);
            C1574a c1574a = c1624h.f4312c;
            if (c1624h.f4311b) {
                enterTransitionCallback = fragment.getExitTransitionCallback();
                arrayList = c1574a.f4133p;
            } else {
                enterTransitionCallback = fragment.getEnterTransitionCallback();
                arrayList = c1574a.f4134q;
            }
            if (arrayList != null) {
                c0624a2.m39508p(arrayList);
                c0624a2.m39508p(c0624a.values());
            }
            if (enterTransitionCallback != null) {
                enterTransitionCallback.m38693d(arrayList, c0624a2);
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    String str = arrayList.get(size);
                    View view2 = c0624a2.get(str);
                    if (view2 == null) {
                        String m36195q2 = m36195q(c0624a, str);
                        if (m36195q2 != null) {
                            c0624a.remove(m36195q2);
                        }
                    } else if (!str.equals(C1365w0.m37240K(view2)) && (m36195q = m36195q(c0624a, str)) != null) {
                        c0624a.put(m36195q, C1365w0.m37240K(view2));
                    }
                }
            } else {
                m36187y(c0624a, c0624a2);
            }
            return c0624a2;
        }
        c0624a.clear();
        return null;
    }

    /* renamed from: i */
    private static C0624a<String, View> m36203i(AbstractC1631q abstractC1631q, C0624a<String, String> c0624a, Object obj, C1624h c1624h) {
        SharedElementCallback exitTransitionCallback;
        ArrayList<String> arrayList;
        if (!c0624a.isEmpty() && obj != null) {
            Fragment fragment = c1624h.f4313d;
            C0624a<String, View> c0624a2 = new C0624a<>();
            abstractC1631q.m36178j(c0624a2, fragment.requireView());
            C1574a c1574a = c1624h.f4315f;
            if (c1624h.f4314e) {
                exitTransitionCallback = fragment.getEnterTransitionCallback();
                arrayList = c1574a.f4134q;
            } else {
                exitTransitionCallback = fragment.getExitTransitionCallback();
                arrayList = c1574a.f4133p;
            }
            if (arrayList != null) {
                c0624a2.m39508p(arrayList);
            }
            if (exitTransitionCallback != null) {
                exitTransitionCallback.m38693d(arrayList, c0624a2);
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    String str = arrayList.get(size);
                    View view = c0624a2.get(str);
                    if (view == null) {
                        c0624a.remove(str);
                    } else if (!str.equals(C1365w0.m37240K(view))) {
                        c0624a.put(C1365w0.m37240K(view), c0624a.remove(str));
                    }
                }
            } else {
                c0624a.m39508p(c0624a2.keySet());
            }
            return c0624a2;
        }
        c0624a.clear();
        return null;
    }

    /* renamed from: j */
    private static AbstractC1631q m36202j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        AbstractC1631q abstractC1631q = f4274b;
        if (abstractC1631q != null && m36205g(abstractC1631q, arrayList)) {
            return abstractC1631q;
        }
        AbstractC1631q abstractC1631q2 = f4275c;
        if (abstractC1631q2 != null && m36205g(abstractC1631q2, arrayList)) {
            return abstractC1631q2;
        }
        if (abstractC1631q == null && abstractC1631q2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: k */
    static ArrayList<View> m36201k(AbstractC1631q abstractC1631q, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj != null) {
            ArrayList<View> arrayList2 = new ArrayList<>();
            View view2 = fragment.getView();
            if (view2 != null) {
                abstractC1631q.m36181f(arrayList2, view2);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                arrayList2.add(view);
                abstractC1631q.mo35167b(obj, arrayList2);
                return arrayList2;
            }
            return arrayList2;
        }
        return null;
    }

    /* renamed from: l */
    private static Object m36200l(AbstractC1631q abstractC1631q, ViewGroup viewGroup, View view, C0624a<String, String> c0624a, C1624h c1624h, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object m36191u;
        C0624a<String, String> c0624a2;
        Object obj3;
        Rect rect;
        Fragment fragment = c1624h.f4310a;
        Fragment fragment2 = c1624h.f4313d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = c1624h.f4311b;
        if (c0624a.isEmpty()) {
            c0624a2 = c0624a;
            m36191u = null;
        } else {
            m36191u = m36191u(abstractC1631q, fragment, fragment2, z);
            c0624a2 = c0624a;
        }
        C0624a<String, View> m36203i = m36203i(abstractC1631q, c0624a2, m36191u, c1624h);
        if (c0624a.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(m36203i.values());
            obj3 = m36191u;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m36206f(fragment, fragment2, z, m36203i, true);
        if (obj3 != null) {
            rect = new Rect();
            abstractC1631q.mo35155z(obj3, view, arrayList);
            m36214A(abstractC1631q, obj3, obj2, m36203i, c1624h.f4314e, c1624h.f4315f);
            if (obj != null) {
                abstractC1631q.mo35157u(obj, rect);
            }
        } else {
            rect = null;
        }
        ViewTreeObserver$OnPreDrawListenerC1354u0.m37280a(viewGroup, new RunnableC1622f(abstractC1631q, c0624a, obj3, c1624h, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect));
        return obj3;
    }

    /* renamed from: m */
    private static Object m36199m(AbstractC1631q abstractC1631q, ViewGroup viewGroup, View view, C0624a<String, String> c0624a, C1624h c1624h, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object m36191u;
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = c1624h.f4310a;
        Fragment fragment2 = c1624h.f4313d;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = c1624h.f4311b;
        if (c0624a.isEmpty()) {
            m36191u = null;
        } else {
            m36191u = m36191u(abstractC1631q, fragment, fragment2, z);
        }
        C0624a<String, View> m36203i = m36203i(abstractC1631q, c0624a, m36191u, c1624h);
        C0624a<String, View> m36204h = m36204h(abstractC1631q, c0624a, m36191u, c1624h);
        if (c0624a.isEmpty()) {
            if (m36203i != null) {
                m36203i.clear();
            }
            if (m36204h != null) {
                m36204h.clear();
            }
            obj3 = null;
        } else {
            m36211a(arrayList, m36203i, c0624a.keySet());
            m36211a(arrayList2, m36204h, c0624a.values());
            obj3 = m36191u;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        m36206f(fragment, fragment2, z, m36203i, true);
        if (obj3 != null) {
            arrayList2.add(view);
            abstractC1631q.mo35155z(obj3, view, arrayList);
            m36214A(abstractC1631q, obj3, obj2, m36203i, c1624h.f4314e, c1624h.f4315f);
            Rect rect2 = new Rect();
            View m36192t = m36192t(m36204h, c1624h, obj, z);
            if (m36192t != null) {
                abstractC1631q.mo35157u(obj, rect2);
            }
            rect = rect2;
            view2 = m36192t;
        } else {
            view2 = null;
            rect = null;
        }
        ViewTreeObserver$OnPreDrawListenerC1354u0.m37280a(viewGroup, new RunnableC1621e(fragment, fragment2, z, m36204h, view2, abstractC1631q, rect));
        return obj3;
    }

    /* renamed from: n */
    private static void m36198n(ViewGroup viewGroup, C1624h c1624h, View view, C0624a<String, String> c0624a, InterfaceC1623g interfaceC1623g) {
        Object obj;
        Fragment fragment = c1624h.f4310a;
        Fragment fragment2 = c1624h.f4313d;
        AbstractC1631q m36202j = m36202j(fragment2, fragment);
        if (m36202j == null) {
            return;
        }
        boolean z = c1624h.f4311b;
        boolean z2 = c1624h.f4314e;
        Object m36194r = m36194r(m36202j, fragment, z);
        Object m36193s = m36193s(m36202j, fragment2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object m36200l = m36200l(m36202j, viewGroup, view, c0624a, c1624h, arrayList, arrayList2, m36194r, m36193s);
        if (m36194r == null && m36200l == null) {
            obj = m36193s;
            if (obj == null) {
                return;
            }
        } else {
            obj = m36193s;
        }
        ArrayList<View> m36201k = m36201k(m36202j, obj, fragment2, arrayList, view);
        Object obj2 = (m36201k == null || m36201k.isEmpty()) ? null : null;
        m36202j.mo35168a(m36194r, view);
        Object m36190v = m36190v(m36202j, m36194r, obj2, m36200l, fragment, c1624h.f4311b);
        if (fragment2 != null && m36201k != null && (m36201k.size() > 0 || arrayList.size() > 0)) {
            C1056f c1056f = new C1056f();
            interfaceC1623g.mo36184b(fragment2, c1056f);
            m36202j.mo36173w(fragment2, m36190v, c1056f, new RunnableC1619c(interfaceC1623g, fragment2, c1056f));
        }
        if (m36190v != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            m36202j.mo35158t(m36190v, m36194r, arrayList3, obj2, m36201k, m36200l, arrayList2);
            m36186z(m36202j, viewGroup, fragment, view, arrayList2, m36194r, arrayList3, obj2, m36201k);
            m36202j.m36172x(viewGroup, arrayList2, c0624a);
            m36202j.mo35166c(viewGroup, m36190v);
            m36202j.m36174s(viewGroup, arrayList2, c0624a);
        }
    }

    /* renamed from: o */
    private static void m36197o(ViewGroup viewGroup, C1624h c1624h, View view, C0624a<String, String> c0624a, InterfaceC1623g interfaceC1623g) {
        Object obj;
        Fragment fragment = c1624h.f4310a;
        Fragment fragment2 = c1624h.f4313d;
        AbstractC1631q m36202j = m36202j(fragment2, fragment);
        if (m36202j == null) {
            return;
        }
        boolean z = c1624h.f4311b;
        boolean z2 = c1624h.f4314e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object m36194r = m36194r(m36202j, fragment, z);
        Object m36193s = m36193s(m36202j, fragment2, z2);
        Object m36199m = m36199m(m36202j, viewGroup, view, c0624a, c1624h, arrayList2, arrayList, m36194r, m36193s);
        if (m36194r == null && m36199m == null) {
            obj = m36193s;
            if (obj == null) {
                return;
            }
        } else {
            obj = m36193s;
        }
        ArrayList<View> m36201k = m36201k(m36202j, obj, fragment2, arrayList2, view);
        ArrayList<View> m36201k2 = m36201k(m36202j, m36194r, fragment, arrayList, view);
        m36213B(m36201k2, 4);
        Object m36190v = m36190v(m36202j, m36194r, obj, m36199m, fragment, z);
        if (fragment2 != null && m36201k != null && (m36201k.size() > 0 || arrayList2.size() > 0)) {
            C1056f c1056f = new C1056f();
            interfaceC1623g.mo36184b(fragment2, c1056f);
            m36202j.mo36173w(fragment2, m36190v, c1056f, new RunnableC1617a(interfaceC1623g, fragment2, c1056f));
        }
        if (m36190v != null) {
            m36189w(m36202j, obj, fragment2, m36201k);
            ArrayList<String> m36175o = m36202j.m36175o(arrayList);
            m36202j.mo35158t(m36190v, m36194r, m36201k2, obj, m36201k, m36199m, arrayList);
            m36202j.mo35166c(viewGroup, m36190v);
            m36202j.m36171y(viewGroup, arrayList2, arrayList, m36175o, c0624a);
            m36213B(m36201k2, 0);
            m36202j.mo35171A(m36199m, arrayList2, arrayList);
        }
    }

    /* renamed from: p */
    private static C1624h m36196p(C1624h c1624h, SparseArray<C1624h> sparseArray, int i) {
        if (c1624h == null) {
            C1624h c1624h2 = new C1624h();
            sparseArray.put(i, c1624h2);
            return c1624h2;
        }
        return c1624h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public static String m36195q(C0624a<String, String> c0624a, String str) {
        int size = c0624a.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(c0624a.m39521n(i))) {
                return c0624a.m39525j(i);
            }
        }
        return null;
    }

    /* renamed from: r */
    private static Object m36194r(AbstractC1631q abstractC1631q, Fragment fragment, boolean z) {
        Object enterTransition;
        if (fragment == null) {
            return null;
        }
        if (z) {
            enterTransition = fragment.getReenterTransition();
        } else {
            enterTransition = fragment.getEnterTransition();
        }
        return abstractC1631q.mo35164g(enterTransition);
    }

    /* renamed from: s */
    private static Object m36193s(AbstractC1631q abstractC1631q, Fragment fragment, boolean z) {
        Object exitTransition;
        if (fragment == null) {
            return null;
        }
        if (z) {
            exitTransition = fragment.getReturnTransition();
        } else {
            exitTransition = fragment.getExitTransition();
        }
        return abstractC1631q.mo35164g(exitTransition);
    }

    /* renamed from: t */
    static View m36192t(C0624a<String, View> c0624a, C1624h c1624h, Object obj, boolean z) {
        ArrayList<String> arrayList;
        String str;
        C1574a c1574a = c1624h.f4312c;
        if (obj != null && c0624a != null && (arrayList = c1574a.f4133p) != null && !arrayList.isEmpty()) {
            if (z) {
                str = c1574a.f4133p.get(0);
            } else {
                str = c1574a.f4134q.get(0);
            }
            return c0624a.get(str);
        }
        return null;
    }

    /* renamed from: u */
    private static Object m36191u(AbstractC1631q abstractC1631q, Fragment fragment, Fragment fragment2, boolean z) {
        Object sharedElementEnterTransition;
        if (fragment != null && fragment2 != null) {
            if (z) {
                sharedElementEnterTransition = fragment2.getSharedElementReturnTransition();
            } else {
                sharedElementEnterTransition = fragment.getSharedElementEnterTransition();
            }
            return abstractC1631q.mo35170B(abstractC1631q.mo35164g(sharedElementEnterTransition));
        }
        return null;
    }

    /* renamed from: v */
    private static Object m36190v(AbstractC1631q abstractC1631q, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2;
        if (obj != null && obj2 != null && fragment != null) {
            if (z) {
                z2 = fragment.getAllowReturnTransitionOverlap();
            } else {
                z2 = fragment.getAllowEnterTransitionOverlap();
            }
        } else {
            z2 = true;
        }
        if (z2) {
            return abstractC1631q.mo35162n(obj2, obj, obj3);
        }
        return abstractC1631q.mo35163m(obj2, obj, obj3);
    }

    /* renamed from: w */
    private static void m36189w(AbstractC1631q abstractC1631q, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            abstractC1631q.mo35159r(obj, fragment.getView(), arrayList);
            ViewTreeObserver$OnPreDrawListenerC1354u0.m37280a(fragment.mContainer, new RunnableC1618b(arrayList));
        }
    }

    /* renamed from: x */
    private static AbstractC1631q m36188x() {
        try {
            return (AbstractC1631q) C1871d.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public static void m36187y(C0624a<String, String> c0624a, C0624a<String, View> c0624a2) {
        for (int size = c0624a.size() - 1; size >= 0; size--) {
            if (!c0624a2.containsKey(c0624a.m39521n(size))) {
                c0624a.m39523l(size);
            }
        }
    }

    /* renamed from: z */
    private static void m36186z(AbstractC1631q abstractC1631q, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewTreeObserver$OnPreDrawListenerC1354u0.m37280a(viewGroup, new RunnableC1620d(obj, abstractC1631q, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }
}
