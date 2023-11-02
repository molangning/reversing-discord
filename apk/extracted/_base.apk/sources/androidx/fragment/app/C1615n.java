package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1615n {

    /* renamed from: a */
    private final ArrayList<Fragment> f4270a = new ArrayList<>();

    /* renamed from: b */
    private final HashMap<String, C1612m> f4271b = new HashMap<>();

    /* renamed from: c */
    private C1607j f4272c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m36238a(Fragment fragment) {
        if (!this.f4270a.contains(fragment)) {
            synchronized (this.f4270a) {
                this.f4270a.add(fragment);
            }
            fragment.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m36237b() {
        this.f4271b.values().removeAll(Collections.singleton(null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m36236c(String str) {
        return this.f4271b.get(str) != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m36235d(int i) {
        for (C1612m c1612m : this.f4271b.values()) {
            if (c1612m != null) {
                c1612m.m36241t(i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m36234e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f4271b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C1612m c1612m : this.f4271b.values()) {
                printWriter.print(str);
                if (c1612m != null) {
                    Fragment m36250k = c1612m.m36250k();
                    printWriter.println(m36250k);
                    m36250k.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f4270a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.f4270a.get(i).toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Fragment m36233f(String str) {
        C1612m c1612m = this.f4271b.get(str);
        if (c1612m != null) {
            return c1612m.m36250k();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Fragment m36232g(int i) {
        for (int size = this.f4270a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f4270a.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (C1612m c1612m : this.f4271b.values()) {
            if (c1612m != null) {
                Fragment m36250k = c1612m.m36250k();
                if (m36250k.mFragmentId == i) {
                    return m36250k;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public Fragment m36231h(String str) {
        if (str != null) {
            for (int size = this.f4270a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f4270a.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (C1612m c1612m : this.f4271b.values()) {
                if (c1612m != null) {
                    Fragment m36250k = c1612m.m36250k();
                    if (str.equals(m36250k.mTag)) {
                        return m36250k;
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public Fragment m36230i(String str) {
        Fragment findFragmentByWho;
        for (C1612m c1612m : this.f4271b.values()) {
            if (c1612m != null && (findFragmentByWho = c1612m.m36250k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m36229j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f4270a.indexOf(fragment);
        for (int i = indexOf - 1; i >= 0; i--) {
            Fragment fragment2 = this.f4270a.get(i);
            if (fragment2.mContainer == viewGroup && (view2 = fragment2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f4270a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f4270a.get(indexOf);
            if (fragment3.mContainer == viewGroup && (view = fragment3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public List<C1612m> m36228k() {
        ArrayList arrayList = new ArrayList();
        for (C1612m c1612m : this.f4271b.values()) {
            if (c1612m != null) {
                arrayList.add(c1612m);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public List<Fragment> m36227l() {
        ArrayList arrayList = new ArrayList();
        for (C1612m c1612m : this.f4271b.values()) {
            if (c1612m != null) {
                arrayList.add(c1612m.m36250k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public C1612m m36226m(String str) {
        return this.f4271b.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public List<Fragment> m36225n() {
        ArrayList arrayList;
        if (this.f4270a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f4270a) {
            arrayList = new ArrayList(this.f4270a);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public C1607j m36224o() {
        return this.f4272c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m36223p(C1612m c1612m) {
        Fragment m36250k = c1612m.m36250k();
        if (m36236c(m36250k.mWho)) {
            return;
        }
        this.f4271b.put(m36250k.mWho, c1612m);
        if (m36250k.mRetainInstanceChangedWhileDetached) {
            if (m36250k.mRetainInstance) {
                this.f4272c.m36274f(m36250k);
            } else {
                this.f4272c.m36266n(m36250k);
            }
            m36250k.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.m36479H0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + m36250k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m36222q(C1612m c1612m) {
        Fragment m36250k = c1612m.m36250k();
        if (m36250k.mRetainInstance) {
            this.f4272c.m36266n(m36250k);
        }
        if (this.f4271b.put(m36250k.mWho, null) != null && FragmentManager.m36479H0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + m36250k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m36221r() {
        boolean z;
        Iterator<Fragment> it = this.f4270a.iterator();
        while (it.hasNext()) {
            C1612m c1612m = this.f4271b.get(it.next().mWho);
            if (c1612m != null) {
                c1612m.m36248m();
            }
        }
        for (C1612m c1612m2 : this.f4271b.values()) {
            if (c1612m2 != null) {
                c1612m2.m36248m();
                Fragment m36250k = c1612m2.m36250k();
                if (m36250k.mRemoving && !m36250k.isInBackStack()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    m36222q(c1612m2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m36220s(Fragment fragment) {
        synchronized (this.f4270a) {
            this.f4270a.remove(fragment);
        }
        fragment.mAdded = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m36219t() {
        this.f4271b.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m36218u(List<String> list) {
        this.f4270a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment m36233f = m36233f(str);
                if (m36233f != null) {
                    if (FragmentManager.m36479H0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + m36233f);
                    }
                    m36238a(m36233f);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public ArrayList<C1610l> m36217v() {
        ArrayList<C1610l> arrayList = new ArrayList<>(this.f4271b.size());
        for (C1612m c1612m : this.f4271b.values()) {
            if (c1612m != null) {
                Fragment m36250k = c1612m.m36250k();
                C1610l m36243r = c1612m.m36243r();
                arrayList.add(m36243r);
                if (FragmentManager.m36479H0(2)) {
                    Log.v("FragmentManager", "Saved state of " + m36250k + ": " + m36243r.f4261v);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public ArrayList<String> m36216w() {
        synchronized (this.f4270a) {
            if (this.f4270a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f4270a.size());
            Iterator<Fragment> it = this.f4270a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.mWho);
                if (FragmentManager.m36479H0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.mWho + "): " + next);
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public void m36215x(C1607j c1607j) {
        this.f4272c = c1607j;
    }
}
