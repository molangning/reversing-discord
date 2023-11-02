package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.collection.C0624a;
import androidx.collection.C0629d;
import androidx.core.view.C1365w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p330s0.AbstractC12339b;
import p330s0.AbstractC12341d;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class Transition implements Cloneable {

    /* renamed from: P */
    private static final int[] f5064P = {2, 1, 3, 4};

    /* renamed from: Q */
    private static final AbstractC12339b f5065Q = new C1843a();

    /* renamed from: R */
    private static ThreadLocal<C0624a<Animator, C1846d>> f5066R = new ThreadLocal<>();

    /* renamed from: C */
    private ArrayList<C1888m> f5069C;

    /* renamed from: D */
    private ArrayList<C1888m> f5070D;

    /* renamed from: M */
    private AbstractC1847e f5079M;

    /* renamed from: N */
    private C0624a<String, String> f5080N;

    /* renamed from: j */
    private String f5082j = getClass().getName();

    /* renamed from: k */
    private long f5083k = -1;

    /* renamed from: l */
    long f5084l = -1;

    /* renamed from: m */
    private TimeInterpolator f5085m = null;

    /* renamed from: n */
    ArrayList<Integer> f5086n = new ArrayList<>();

    /* renamed from: o */
    ArrayList<View> f5087o = new ArrayList<>();

    /* renamed from: p */
    private ArrayList<String> f5088p = null;

    /* renamed from: q */
    private ArrayList<Class<?>> f5089q = null;

    /* renamed from: r */
    private ArrayList<Integer> f5090r = null;

    /* renamed from: s */
    private ArrayList<View> f5091s = null;

    /* renamed from: t */
    private ArrayList<Class<?>> f5092t = null;

    /* renamed from: u */
    private ArrayList<String> f5093u = null;

    /* renamed from: v */
    private ArrayList<Integer> f5094v = null;

    /* renamed from: w */
    private ArrayList<View> f5095w = null;

    /* renamed from: x */
    private ArrayList<Class<?>> f5096x = null;

    /* renamed from: y */
    private C1889n f5097y = new C1889n();

    /* renamed from: z */
    private C1889n f5098z = new C1889n();

    /* renamed from: A */
    C1884k f5067A = null;

    /* renamed from: B */
    private int[] f5068B = f5064P;

    /* renamed from: E */
    private ViewGroup f5071E = null;

    /* renamed from: F */
    boolean f5072F = false;

    /* renamed from: G */
    ArrayList<Animator> f5073G = new ArrayList<>();

    /* renamed from: H */
    private int f5074H = 0;

    /* renamed from: I */
    private boolean f5075I = false;

    /* renamed from: J */
    private boolean f5076J = false;

    /* renamed from: K */
    private ArrayList<InterfaceC1848f> f5077K = null;

    /* renamed from: L */
    private ArrayList<Animator> f5078L = new ArrayList<>();

    /* renamed from: O */
    private AbstractC12339b f5081O = f5065Q;

    /* renamed from: androidx.transition.Transition$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1843a extends AbstractC12339b {
        C1843a() {
        }

        @Override // p330s0.AbstractC12339b
        /* renamed from: a */
        public Path mo5448a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.transition.Transition$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1844b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0624a f5099a;

        C1844b(C0624a c0624a) {
            this.f5099a = c0624a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5099a.remove(animator);
            Transition.this.f5073G.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Transition.this.f5073G.add(animator);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.transition.Transition$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1845c extends AnimatorListenerAdapter {
        C1845c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Transition.this.m35213s();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.transition.Transition$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1846d {

        /* renamed from: a */
        View f5102a;

        /* renamed from: b */
        String f5103b;

        /* renamed from: c */
        C1888m f5104c;

        /* renamed from: d */
        InterfaceC1870c0 f5105d;

        /* renamed from: e */
        Transition f5106e;

        C1846d(View view, String str, Transition transition, InterfaceC1870c0 interfaceC1870c0, C1888m c1888m) {
            this.f5102a = view;
            this.f5103b = str;
            this.f5104c = c1888m;
            this.f5105d = interfaceC1870c0;
            this.f5106e = transition;
        }
    }

    /* renamed from: androidx.transition.Transition$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AbstractC1847e {
    }

    /* renamed from: androidx.transition.Transition$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1848f {
        void onTransitionCancel(Transition transition);

        void onTransitionEnd(Transition transition);

        void onTransitionPause(Transition transition);

        void onTransitionResume(Transition transition);

        void onTransitionStart(Transition transition);
    }

    /* renamed from: A */
    private static C0624a<Animator, C1846d> m35236A() {
        C0624a<Animator, C1846d> c0624a = f5066R.get();
        if (c0624a == null) {
            C0624a<Animator, C1846d> c0624a2 = new C0624a<>();
            f5066R.set(c0624a2);
            return c0624a2;
        }
        return c0624a;
    }

    /* renamed from: K */
    private static boolean m35228K(C1888m c1888m, C1888m c1888m2, String str) {
        Object obj = c1888m.f5202a.get(str);
        Object obj2 = c1888m2.f5202a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* renamed from: L */
    private void m35227L(C0624a<View, C1888m> c0624a, C0624a<View, C1888m> c0624a2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && m35229J(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && m35229J(view)) {
                C1888m c1888m = c0624a.get(valueAt);
                C1888m c1888m2 = c0624a2.get(view);
                if (c1888m != null && c1888m2 != null) {
                    this.f5069C.add(c1888m);
                    this.f5070D.add(c1888m2);
                    c0624a.remove(valueAt);
                    c0624a2.remove(view);
                }
            }
        }
    }

    /* renamed from: M */
    private void m35226M(C0624a<View, C1888m> c0624a, C0624a<View, C1888m> c0624a2) {
        C1888m remove;
        for (int size = c0624a.size() - 1; size >= 0; size--) {
            View m39525j = c0624a.m39525j(size);
            if (m39525j != null && m35229J(m39525j) && (remove = c0624a2.remove(m39525j)) != null && m35229J(remove.f5203b)) {
                this.f5069C.add(c0624a.m39523l(size));
                this.f5070D.add(remove);
            }
        }
    }

    /* renamed from: N */
    private void m35225N(C0624a<View, C1888m> c0624a, C0624a<View, C1888m> c0624a2, C0629d<View> c0629d, C0629d<View> c0629d2) {
        View m39488g;
        int m39481q = c0629d.m39481q();
        for (int i = 0; i < m39481q; i++) {
            View m39480r = c0629d.m39480r(i);
            if (m39480r != null && m35229J(m39480r) && (m39488g = c0629d2.m39488g(c0629d.m39485l(i))) != null && m35229J(m39488g)) {
                C1888m c1888m = c0624a.get(m39480r);
                C1888m c1888m2 = c0624a2.get(m39488g);
                if (c1888m != null && c1888m2 != null) {
                    this.f5069C.add(c1888m);
                    this.f5070D.add(c1888m2);
                    c0624a.remove(m39480r);
                    c0624a2.remove(m39488g);
                }
            }
        }
    }

    /* renamed from: O */
    private void m35224O(C0624a<View, C1888m> c0624a, C0624a<View, C1888m> c0624a2, C0624a<String, View> c0624a3, C0624a<String, View> c0624a4) {
        View view;
        int size = c0624a3.size();
        for (int i = 0; i < size; i++) {
            View m39521n = c0624a3.m39521n(i);
            if (m39521n != null && m35229J(m39521n) && (view = c0624a4.get(c0624a3.m39525j(i))) != null && m35229J(view)) {
                C1888m c1888m = c0624a.get(m39521n);
                C1888m c1888m2 = c0624a2.get(view);
                if (c1888m != null && c1888m2 != null) {
                    this.f5069C.add(c1888m);
                    this.f5070D.add(c1888m2);
                    c0624a.remove(m39521n);
                    c0624a2.remove(view);
                }
            }
        }
    }

    /* renamed from: P */
    private void m35223P(C1889n c1889n, C1889n c1889n2) {
        C0624a<View, C1888m> c0624a = new C0624a<>(c1889n.f5205a);
        C0624a<View, C1888m> c0624a2 = new C0624a<>(c1889n2.f5205a);
        int i = 0;
        while (true) {
            int[] iArr = this.f5068B;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                m35225N(c0624a, c0624a2, c1889n.f5207c, c1889n2.f5207c);
                            }
                        } else {
                            m35227L(c0624a, c0624a2, c1889n.f5206b, c1889n2.f5206b);
                        }
                    } else {
                        m35224O(c0624a, c0624a2, c1889n.f5208d, c1889n2.f5208d);
                    }
                } else {
                    m35226M(c0624a, c0624a2);
                }
                i++;
            } else {
                m35220d(c0624a, c0624a2);
                return;
            }
        }
    }

    /* renamed from: V */
    private void m35221V(Animator animator, C0624a<Animator, C1846d> c0624a) {
        if (animator != null) {
            animator.addListener(new C1844b(c0624a));
            m35217f(animator);
        }
    }

    /* renamed from: d */
    private void m35220d(C0624a<View, C1888m> c0624a, C0624a<View, C1888m> c0624a2) {
        for (int i = 0; i < c0624a.size(); i++) {
            C1888m m39521n = c0624a.m39521n(i);
            if (m35229J(m39521n.f5203b)) {
                this.f5069C.add(m39521n);
                this.f5070D.add(null);
            }
        }
        for (int i2 = 0; i2 < c0624a2.size(); i2++) {
            C1888m m39521n2 = c0624a2.m39521n(i2);
            if (m35229J(m39521n2.f5203b)) {
                this.f5070D.add(m39521n2);
                this.f5069C.add(null);
            }
        }
    }

    /* renamed from: e */
    private static void m35218e(C1889n c1889n, View view, C1888m c1888m) {
        c1889n.f5205a.put(view, c1888m);
        int id2 = view.getId();
        if (id2 >= 0) {
            if (c1889n.f5206b.indexOfKey(id2) >= 0) {
                c1889n.f5206b.put(id2, null);
            } else {
                c1889n.f5206b.put(id2, view);
            }
        }
        String m37240K = C1365w0.m37240K(view);
        if (m37240K != null) {
            if (c1889n.f5208d.containsKey(m37240K)) {
                c1889n.f5208d.put(m37240K, null);
            } else {
                c1889n.f5208d.put(m37240K, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (c1889n.f5207c.m39486k(itemIdAtPosition) >= 0) {
                    View m39488g = c1889n.f5207c.m39488g(itemIdAtPosition);
                    if (m39488g != null) {
                        C1365w0.m37167z0(m39488g, false);
                        c1889n.f5207c.m39484m(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C1365w0.m37167z0(view, true);
                c1889n.f5207c.m39484m(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: j */
    private void m35216j(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id2 = view.getId();
        ArrayList<Integer> arrayList = this.f5090r;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id2))) {
            return;
        }
        ArrayList<View> arrayList2 = this.f5091s;
        if (arrayList2 != null && arrayList2.contains(view)) {
            return;
        }
        ArrayList<Class<?>> arrayList3 = this.f5092t;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                if (this.f5092t.get(i).isInstance(view)) {
                    return;
                }
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            C1888m c1888m = new C1888m(view);
            if (z) {
                mo35121l(c1888m);
            } else {
                mo35128g(c1888m);
            }
            c1888m.f5204c.add(this);
            mo35123k(c1888m);
            if (z) {
                m35218e(this.f5097y, view, c1888m);
            } else {
                m35218e(this.f5098z, view, c1888m);
            }
        }
        if (view instanceof ViewGroup) {
            ArrayList<Integer> arrayList4 = this.f5094v;
            if (arrayList4 != null && arrayList4.contains(Integer.valueOf(id2))) {
                return;
            }
            ArrayList<View> arrayList5 = this.f5095w;
            if (arrayList5 != null && arrayList5.contains(view)) {
                return;
            }
            ArrayList<Class<?>> arrayList6 = this.f5096x;
            if (arrayList6 != null) {
                int size2 = arrayList6.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if (this.f5096x.get(i2).isInstance(view)) {
                        return;
                    }
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                m35216j(viewGroup.getChildAt(i3), z);
            }
        }
    }

    /* renamed from: B */
    public long m35235B() {
        return this.f5083k;
    }

    /* renamed from: C */
    public List<Integer> m35234C() {
        return this.f5086n;
    }

    /* renamed from: D */
    public List<String> m35233D() {
        return this.f5088p;
    }

    /* renamed from: E */
    public List<Class<?>> m35232E() {
        return this.f5089q;
    }

    /* renamed from: F */
    public List<View> m35231F() {
        return this.f5087o;
    }

    /* renamed from: G */
    public String[] mo35194G() {
        return null;
    }

    /* renamed from: H */
    public C1888m m35230H(View view, boolean z) {
        C1889n c1889n;
        C1884k c1884k = this.f5067A;
        if (c1884k != null) {
            return c1884k.m35230H(view, z);
        }
        if (z) {
            c1889n = this.f5097y;
        } else {
            c1889n = this.f5098z;
        }
        return c1889n.f5205a.get(view);
    }

    /* renamed from: I */
    public boolean mo35202I(C1888m c1888m, C1888m c1888m2) {
        if (c1888m == null || c1888m2 == null) {
            return false;
        }
        String[] mo35194G = mo35194G();
        if (mo35194G != null) {
            for (String str : mo35194G) {
                if (!m35228K(c1888m, c1888m2, str)) {
                }
            }
            return false;
        }
        for (String str2 : c1888m.f5202a.keySet()) {
            if (m35228K(c1888m, c1888m2, str2)) {
            }
        }
        return false;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public boolean m35229J(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id2 = view.getId();
        ArrayList<Integer> arrayList3 = this.f5090r;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id2))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f5091s;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f5092t;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.f5092t.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f5093u != null && C1365w0.m37240K(view) != null && this.f5093u.contains(C1365w0.m37240K(view))) {
            return false;
        }
        if ((this.f5086n.size() == 0 && this.f5087o.size() == 0 && (((arrayList = this.f5089q) == null || arrayList.isEmpty()) && ((arrayList2 = this.f5088p) == null || arrayList2.isEmpty()))) || this.f5086n.contains(Integer.valueOf(id2)) || this.f5087o.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f5088p;
        if (arrayList6 != null && arrayList6.contains(C1365w0.m37240K(view))) {
            return true;
        }
        if (this.f5089q != null) {
            for (int i2 = 0; i2 < this.f5089q.size(); i2++) {
                if (this.f5089q.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: Q */
    public void mo35143Q(View view) {
        if (!this.f5076J) {
            C0624a<Animator, C1846d> m35236A = m35236A();
            int size = m35236A.size();
            InterfaceC1870c0 m35098d = C1895t.m35098d(view);
            for (int i = size - 1; i >= 0; i--) {
                C1846d m39521n = m35236A.m39521n(i);
                if (m39521n.f5102a != null && m35098d.equals(m39521n.f5105d)) {
                    C1849a.m35204b(m35236A.m39525j(i));
                }
            }
            ArrayList<InterfaceC1848f> arrayList = this.f5077K;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f5077K.clone();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((InterfaceC1848f) arrayList2.get(i2)).onTransitionPause(this);
                }
            }
            this.f5075I = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public void m35222R(ViewGroup viewGroup) {
        C1846d c1846d;
        boolean z;
        this.f5069C = new ArrayList<>();
        this.f5070D = new ArrayList<>();
        m35223P(this.f5097y, this.f5098z);
        C0624a<Animator, C1846d> m35236A = m35236A();
        int size = m35236A.size();
        InterfaceC1870c0 m35098d = C1895t.m35098d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator m39525j = m35236A.m39525j(i);
            if (m39525j != null && (c1846d = m35236A.get(m39525j)) != null && c1846d.f5102a != null && m35098d.equals(c1846d.f5105d)) {
                C1888m c1888m = c1846d.f5104c;
                View view = c1846d.f5102a;
                C1888m m35230H = m35230H(view, true);
                C1888m m35209w = m35209w(view, true);
                if (m35230H == null && m35209w == null) {
                    m35209w = this.f5098z.f5205a.get(view);
                }
                if ((m35230H != null || m35209w != null) && c1846d.f5106e.mo35202I(c1888m, m35209w)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (!m39525j.isRunning() && !m39525j.isStarted()) {
                        m35236A.remove(m39525j);
                    } else {
                        m39525j.cancel();
                    }
                }
            }
        }
        mo35113r(viewGroup, this.f5097y, this.f5098z, this.f5069C, this.f5070D);
        mo35139W();
    }

    /* renamed from: S */
    public Transition mo35142S(InterfaceC1848f interfaceC1848f) {
        ArrayList<InterfaceC1848f> arrayList = this.f5077K;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(interfaceC1848f);
        if (this.f5077K.size() == 0) {
            this.f5077K = null;
        }
        return this;
    }

    /* renamed from: T */
    public Transition mo35141T(View view) {
        this.f5087o.remove(view);
        return this;
    }

    /* renamed from: U */
    public void mo35140U(View view) {
        if (this.f5075I) {
            if (!this.f5076J) {
                C0624a<Animator, C1846d> m35236A = m35236A();
                int size = m35236A.size();
                InterfaceC1870c0 m35098d = C1895t.m35098d(view);
                for (int i = size - 1; i >= 0; i--) {
                    C1846d m39521n = m35236A.m39521n(i);
                    if (m39521n.f5102a != null && m35098d.equals(m39521n.f5105d)) {
                        C1849a.m35203c(m35236A.m39525j(i));
                    }
                }
                ArrayList<InterfaceC1848f> arrayList = this.f5077K;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f5077K.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((InterfaceC1848f) arrayList2.get(i2)).onTransitionResume(this);
                    }
                }
            }
            this.f5075I = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: W */
    public void mo35139W() {
        m35219d0();
        C0624a<Animator, C1846d> m35236A = m35236A();
        Iterator<Animator> it = this.f5078L.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (m35236A.containsKey(next)) {
                m35219d0();
                m35221V(next, m35236A);
            }
        }
        this.f5078L.clear();
        m35213s();
    }

    /* renamed from: X */
    public Transition mo35138X(long j) {
        this.f5084l = j;
        return this;
    }

    /* renamed from: Y */
    public void mo35137Y(AbstractC1847e abstractC1847e) {
        this.f5079M = abstractC1847e;
    }

    /* renamed from: Z */
    public Transition mo35136Z(TimeInterpolator timeInterpolator) {
        this.f5085m = timeInterpolator;
        return this;
    }

    /* renamed from: a0 */
    public void mo35135a0(AbstractC12339b abstractC12339b) {
        if (abstractC12339b == null) {
            this.f5081O = f5065Q;
        } else {
            this.f5081O = abstractC12339b;
        }
    }

    /* renamed from: b */
    public Transition mo35134b(InterfaceC1848f interfaceC1848f) {
        if (this.f5077K == null) {
            this.f5077K = new ArrayList<>();
        }
        this.f5077K.add(interfaceC1848f);
        return this;
    }

    /* renamed from: b0 */
    public void mo35133b0(AbstractC12341d abstractC12341d) {
    }

    /* renamed from: c */
    public Transition mo35132c(View view) {
        this.f5087o.add(view);
        return this;
    }

    /* renamed from: c0 */
    public Transition mo35131c0(long j) {
        this.f5083k = j;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void cancel() {
        for (int size = this.f5073G.size() - 1; size >= 0; size--) {
            this.f5073G.get(size).cancel();
        }
        ArrayList<InterfaceC1848f> arrayList = this.f5077K;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f5077K.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((InterfaceC1848f) arrayList2.get(i)).onTransitionCancel(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d0 */
    public void m35219d0() {
        if (this.f5074H == 0) {
            ArrayList<InterfaceC1848f> arrayList = this.f5077K;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f5077K.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC1848f) arrayList2.get(i)).onTransitionStart(this);
                }
            }
            this.f5076J = false;
        }
        this.f5074H++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e0 */
    public String mo35130e0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f5084l != -1) {
            str2 = str2 + "dur(" + this.f5084l + ") ";
        }
        if (this.f5083k != -1) {
            str2 = str2 + "dly(" + this.f5083k + ") ";
        }
        if (this.f5085m != null) {
            str2 = str2 + "interp(" + this.f5085m + ") ";
        }
        if (this.f5086n.size() > 0 || this.f5087o.size() > 0) {
            String str3 = str2 + "tgts(";
            if (this.f5086n.size() > 0) {
                for (int i = 0; i < this.f5086n.size(); i++) {
                    if (i > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f5086n.get(i);
                }
            }
            if (this.f5087o.size() > 0) {
                for (int i2 = 0; i2 < this.f5087o.size(); i2++) {
                    if (i2 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f5087o.get(i2);
                }
            }
            return str3 + ")";
        }
        return str2;
    }

    /* renamed from: f */
    protected void m35217f(Animator animator) {
        if (animator == null) {
            m35213s();
            return;
        }
        if (m35212t() >= 0) {
            animator.setDuration(m35212t());
        }
        if (m35235B() >= 0) {
            animator.setStartDelay(m35235B() + animator.getStartDelay());
        }
        if (m35210v() != null) {
            animator.setInterpolator(m35210v());
        }
        animator.addListener(new C1845c());
        animator.start();
    }

    /* renamed from: g */
    public abstract void mo35128g(C1888m c1888m);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo35123k(C1888m c1888m) {
    }

    /* renamed from: l */
    public abstract void mo35121l(C1888m c1888m);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m35215m(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        C0624a<String, String> c0624a;
        m35214n(z);
        if ((this.f5086n.size() <= 0 && this.f5087o.size() <= 0) || (((arrayList = this.f5088p) != null && !arrayList.isEmpty()) || ((arrayList2 = this.f5089q) != null && !arrayList2.isEmpty()))) {
            m35216j(viewGroup, z);
        } else {
            for (int i = 0; i < this.f5086n.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f5086n.get(i).intValue());
                if (findViewById != null) {
                    C1888m c1888m = new C1888m(findViewById);
                    if (z) {
                        mo35121l(c1888m);
                    } else {
                        mo35128g(c1888m);
                    }
                    c1888m.f5204c.add(this);
                    mo35123k(c1888m);
                    if (z) {
                        m35218e(this.f5097y, findViewById, c1888m);
                    } else {
                        m35218e(this.f5098z, findViewById, c1888m);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f5087o.size(); i2++) {
                View view = this.f5087o.get(i2);
                C1888m c1888m2 = new C1888m(view);
                if (z) {
                    mo35121l(c1888m2);
                } else {
                    mo35128g(c1888m2);
                }
                c1888m2.f5204c.add(this);
                mo35123k(c1888m2);
                if (z) {
                    m35218e(this.f5097y, view, c1888m2);
                } else {
                    m35218e(this.f5098z, view, c1888m2);
                }
            }
        }
        if (!z && (c0624a = this.f5080N) != null) {
            int size = c0624a.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList3.add(this.f5097y.f5208d.remove(this.f5080N.m39525j(i3)));
            }
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) arrayList3.get(i4);
                if (view2 != null) {
                    this.f5097y.f5208d.put(this.f5080N.m39521n(i4), view2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m35214n(boolean z) {
        if (z) {
            this.f5097y.f5205a.clear();
            this.f5097y.f5206b.clear();
            this.f5097y.f5207c.m39492c();
            return;
        }
        this.f5098z.f5205a.clear();
        this.f5098z.f5206b.clear();
        this.f5098z.f5207c.m39492c();
    }

    @Override // 
    /* renamed from: p */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.f5078L = new ArrayList<>();
            transition.f5097y = new C1889n();
            transition.f5098z = new C1889n();
            transition.f5069C = null;
            transition.f5070D = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: q */
    public Animator mo35191q(ViewGroup viewGroup, C1888m c1888m, C1888m c1888m2) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: r */
    public void mo35113r(ViewGroup viewGroup, C1889n c1889n, C1889n c1889n2, ArrayList<C1888m> arrayList, ArrayList<C1888m> arrayList2) {
        boolean z;
        View view;
        Animator animator;
        C1888m c1888m;
        int i;
        Animator animator2;
        C1888m c1888m2;
        C0624a<Animator, C1846d> m35236A = m35236A();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            C1888m c1888m3 = arrayList.get(i2);
            C1888m c1888m4 = arrayList2.get(i2);
            if (c1888m3 != null && !c1888m3.f5204c.contains(this)) {
                c1888m3 = null;
            }
            if (c1888m4 != null && !c1888m4.f5204c.contains(this)) {
                c1888m4 = null;
            }
            if (c1888m3 != null || c1888m4 != null) {
                if (c1888m3 != null && c1888m4 != null && !mo35202I(c1888m3, c1888m4)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    Animator mo35191q = mo35191q(viewGroup, c1888m3, c1888m4);
                    if (mo35191q != null) {
                        if (c1888m4 != null) {
                            View view2 = c1888m4.f5203b;
                            String[] mo35194G = mo35194G();
                            if (mo35194G != null && mo35194G.length > 0) {
                                c1888m2 = new C1888m(view2);
                                C1888m c1888m5 = c1889n2.f5205a.get(view2);
                                if (c1888m5 != null) {
                                    int i3 = 0;
                                    while (i3 < mo35194G.length) {
                                        Map<String, Object> map = c1888m2.f5202a;
                                        Animator animator3 = mo35191q;
                                        String str = mo35194G[i3];
                                        map.put(str, c1888m5.f5202a.get(str));
                                        i3++;
                                        mo35191q = animator3;
                                        mo35194G = mo35194G;
                                    }
                                }
                                Animator animator4 = mo35191q;
                                int size2 = m35236A.size();
                                int i4 = 0;
                                while (true) {
                                    if (i4 < size2) {
                                        C1846d c1846d = m35236A.get(m35236A.m39525j(i4));
                                        if (c1846d.f5104c != null && c1846d.f5102a == view2 && c1846d.f5103b.equals(m35208x()) && c1846d.f5104c.equals(c1888m2)) {
                                            animator2 = null;
                                            break;
                                        }
                                        i4++;
                                    } else {
                                        animator2 = animator4;
                                        break;
                                    }
                                }
                            } else {
                                animator2 = mo35191q;
                                c1888m2 = null;
                            }
                            view = view2;
                            animator = animator2;
                            c1888m = c1888m2;
                        } else {
                            view = c1888m3.f5203b;
                            animator = mo35191q;
                            c1888m = null;
                        }
                        if (animator != null) {
                            i = size;
                            m35236A.put(animator, new C1846d(view, m35208x(), this, C1895t.m35098d(viewGroup), c1888m));
                            this.f5078L.add(animator);
                            i2++;
                            size = i;
                        }
                        i = size;
                        i2++;
                        size = i;
                    }
                    i = size;
                    i2++;
                    size = i;
                }
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator5 = this.f5078L.get(sparseIntArray.keyAt(i5));
                animator5.setStartDelay((sparseIntArray.valueAt(i5) - Long.MAX_VALUE) + animator5.getStartDelay());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: s */
    public void m35213s() {
        int i = this.f5074H - 1;
        this.f5074H = i;
        if (i == 0) {
            ArrayList<InterfaceC1848f> arrayList = this.f5077K;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f5077K.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((InterfaceC1848f) arrayList2.get(i2)).onTransitionEnd(this);
                }
            }
            for (int i3 = 0; i3 < this.f5097y.f5207c.m39481q(); i3++) {
                View m39480r = this.f5097y.f5207c.m39480r(i3);
                if (m39480r != null) {
                    C1365w0.m37167z0(m39480r, false);
                }
            }
            for (int i4 = 0; i4 < this.f5098z.f5207c.m39481q(); i4++) {
                View m39480r2 = this.f5098z.f5207c.m39480r(i4);
                if (m39480r2 != null) {
                    C1365w0.m37167z0(m39480r2, false);
                }
            }
            this.f5076J = true;
        }
    }

    /* renamed from: t */
    public long m35212t() {
        return this.f5084l;
    }

    public String toString() {
        return mo35130e0("");
    }

    /* renamed from: u */
    public AbstractC1847e m35211u() {
        return this.f5079M;
    }

    /* renamed from: v */
    public TimeInterpolator m35210v() {
        return this.f5085m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public C1888m m35209w(View view, boolean z) {
        ArrayList<C1888m> arrayList;
        ArrayList<C1888m> arrayList2;
        C1884k c1884k = this.f5067A;
        if (c1884k != null) {
            return c1884k.m35209w(view, z);
        }
        if (z) {
            arrayList = this.f5069C;
        } else {
            arrayList = this.f5070D;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                C1888m c1888m = arrayList.get(i);
                if (c1888m == null) {
                    return null;
                }
                if (c1888m.f5203b == view) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            return null;
        }
        if (z) {
            arrayList2 = this.f5070D;
        } else {
            arrayList2 = this.f5069C;
        }
        return arrayList2.get(i);
    }

    /* renamed from: x */
    public String m35208x() {
        return this.f5082j;
    }

    /* renamed from: y */
    public AbstractC12339b m35207y() {
        return this.f5081O;
    }

    /* renamed from: z */
    public AbstractC12341d m35206z() {
        return null;
    }
}
