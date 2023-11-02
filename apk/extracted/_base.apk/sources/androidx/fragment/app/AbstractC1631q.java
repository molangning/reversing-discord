package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.p018os.C1056f;
import androidx.core.view.C1279j2;
import androidx.core.view.C1365w0;
import androidx.core.view.ViewTreeObserver$OnPreDrawListenerC1354u0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SuppressLint({"UnknownNullness"})
/* renamed from: androidx.fragment.app.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC1631q {

    /* renamed from: androidx.fragment.app.q$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC1632a implements Runnable {

        /* renamed from: j */
        final /* synthetic */ int f4332j;

        /* renamed from: k */
        final /* synthetic */ ArrayList f4333k;

        /* renamed from: l */
        final /* synthetic */ ArrayList f4334l;

        /* renamed from: m */
        final /* synthetic */ ArrayList f4335m;

        /* renamed from: n */
        final /* synthetic */ ArrayList f4336n;

        RunnableC1632a(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f4332j = i;
            this.f4333k = arrayList;
            this.f4334l = arrayList2;
            this.f4335m = arrayList3;
            this.f4336n = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.f4332j; i++) {
                C1365w0.m37241J0((View) this.f4333k.get(i), (String) this.f4334l.get(i));
                C1365w0.m37241J0((View) this.f4335m.get(i), (String) this.f4336n.get(i));
            }
        }
    }

    /* renamed from: androidx.fragment.app.q$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC1633b implements Runnable {

        /* renamed from: j */
        final /* synthetic */ ArrayList f4338j;

        /* renamed from: k */
        final /* synthetic */ Map f4339k;

        RunnableC1633b(ArrayList arrayList, Map map) {
            this.f4338j = arrayList;
            this.f4339k = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f4338j.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f4338j.get(i);
                String m37240K = C1365w0.m37240K(view);
                if (m37240K != null) {
                    C1365w0.m37241J0(view, AbstractC1631q.m36179i(this.f4339k, m37240K));
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.q$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC1634c implements Runnable {

        /* renamed from: j */
        final /* synthetic */ ArrayList f4341j;

        /* renamed from: k */
        final /* synthetic */ Map f4342k;

        RunnableC1634c(ArrayList arrayList, Map map) {
            this.f4341j = arrayList;
            this.f4342k = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f4341j.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f4341j.get(i);
                C1365w0.m37241J0(view, (String) this.f4342k.get(C1365w0.m37240K(view)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public static void m36182d(List<View> list, View view) {
        int size = list.size();
        if (m36180h(list, view, size)) {
            return;
        }
        if (C1365w0.m37240K(view) != null) {
            list.add(view);
        }
        for (int i = size; i < list.size(); i++) {
            View view2 = list.get(i);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (!m36180h(list, childAt, size) && C1365w0.m37240K(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private static boolean m36180h(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    static String m36179i(Map<String, String> map, String str) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public static boolean m36176l(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: A */
    public abstract void mo35171A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: B */
    public abstract Object mo35170B(Object obj);

    /* renamed from: a */
    public abstract void mo35168a(Object obj, View view);

    /* renamed from: b */
    public abstract void mo35167b(Object obj, ArrayList<View> arrayList);

    /* renamed from: c */
    public abstract void mo35166c(ViewGroup viewGroup, Object obj);

    /* renamed from: e */
    public abstract boolean mo35165e(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m36181f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (C1279j2.m37427a(viewGroup)) {
                    arrayList.add(viewGroup);
                    return;
                }
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m36181f(arrayList, viewGroup.getChildAt(i));
                }
                return;
            }
            arrayList.add(view);
        }
    }

    /* renamed from: g */
    public abstract Object mo35164g(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m36178j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String m37240K = C1365w0.m37240K(view);
            if (m37240K != null) {
                map.put(m37240K, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m36178j(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public void m36177k(View view, Rect rect) {
        if (!C1365w0.m37225T(view)) {
            return;
        }
        RectF rectF = new RectF();
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getMatrix().mapRect(rectF);
        rectF.offset(view.getLeft(), view.getTop());
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            view2.getMatrix().mapRect(rectF);
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
        int[] iArr = new int[2];
        view.getRootView().getLocationOnScreen(iArr);
        rectF.offset(iArr[0], iArr[1]);
        rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    /* renamed from: m */
    public abstract Object mo35163m(Object obj, Object obj2, Object obj3);

    /* renamed from: n */
    public abstract Object mo35162n(Object obj, Object obj2, Object obj3);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public ArrayList<String> m36175o(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(C1365w0.m37240K(view));
            C1365w0.m37241J0(view, null);
        }
        return arrayList2;
    }

    /* renamed from: p */
    public abstract void mo35161p(Object obj, View view);

    /* renamed from: q */
    public abstract void mo35160q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: r */
    public abstract void mo35159r(Object obj, View view, ArrayList<View> arrayList);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m36174s(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserver$OnPreDrawListenerC1354u0.m37280a(viewGroup, new RunnableC1634c(arrayList, map));
    }

    /* renamed from: t */
    public abstract void mo35158t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: u */
    public abstract void mo35157u(Object obj, Rect rect);

    /* renamed from: v */
    public abstract void mo35156v(Object obj, View view);

    /* renamed from: w */
    public void mo36173w(Fragment fragment, Object obj, C1056f c1056f, Runnable runnable) {
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m36172x(View view, ArrayList<View> arrayList, Map<String, String> map) {
        ViewTreeObserver$OnPreDrawListenerC1354u0.m37280a(view, new RunnableC1633b(arrayList, map));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y */
    public void m36171y(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String m37240K = C1365w0.m37240K(view2);
            arrayList4.add(m37240K);
            if (m37240K != null) {
                C1365w0.m37241J0(view2, null);
                String str = map.get(m37240K);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C1365w0.m37241J0(arrayList2.get(i2), m37240K);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        ViewTreeObserver$OnPreDrawListenerC1354u0.m37280a(view, new RunnableC1632a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* renamed from: z */
    public abstract void mo35155z(Object obj, View view, ArrayList<View> arrayList);
}
