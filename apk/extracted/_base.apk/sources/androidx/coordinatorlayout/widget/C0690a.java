package androidx.coordinatorlayout.widget;

import androidx.collection.SimpleArrayMap;
import androidx.core.util.InterfaceC1137e;
import androidx.core.util.Pools$SimplePool;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: androidx.coordinatorlayout.widget.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C0690a<T> {

    /* renamed from: a */
    private final InterfaceC1137e<ArrayList<T>> f2991a = new Pools$SimplePool(10);

    /* renamed from: b */
    private final SimpleArrayMap<T, ArrayList<T>> f2992b = new SimpleArrayMap<>();

    /* renamed from: c */
    private final ArrayList<T> f2993c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f2994d = new HashSet<>();

    /* renamed from: e */
    private void m39143e(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (!hashSet.contains(t)) {
            hashSet.add(t);
            ArrayList<T> arrayList2 = this.f2992b.get(t);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    m39143e(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(t);
            arrayList.add(t);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    /* renamed from: f */
    private ArrayList<T> m39142f() {
        ArrayList<T> acquire = this.f2991a.acquire();
        if (acquire == null) {
            return new ArrayList<>();
        }
        return acquire;
    }

    /* renamed from: k */
    private void m39137k(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f2991a.release(arrayList);
    }

    /* renamed from: a */
    public void m39147a(T t, T t2) {
        if (this.f2992b.containsKey(t) && this.f2992b.containsKey(t2)) {
            ArrayList<T> arrayList = this.f2992b.get(t);
            if (arrayList == null) {
                arrayList = m39142f();
                this.f2992b.put(t, arrayList);
            }
            arrayList.add(t2);
            return;
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    /* renamed from: b */
    public void m39146b(T t) {
        if (!this.f2992b.containsKey(t)) {
            this.f2992b.put(t, null);
        }
    }

    /* renamed from: c */
    public void m39145c() {
        int size = this.f2992b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> m39521n = this.f2992b.m39521n(i);
            if (m39521n != null) {
                m39137k(m39521n);
            }
        }
        this.f2992b.clear();
    }

    /* renamed from: d */
    public boolean m39144d(T t) {
        return this.f2992b.containsKey(t);
    }

    /* renamed from: g */
    public List m39141g(T t) {
        return this.f2992b.get(t);
    }

    /* renamed from: h */
    public List<T> m39140h(T t) {
        int size = this.f2992b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList<T> m39521n = this.f2992b.m39521n(i);
            if (m39521n != null && m39521n.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f2992b.m39525j(i));
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public ArrayList<T> m39139i() {
        this.f2993c.clear();
        this.f2994d.clear();
        int size = this.f2992b.size();
        for (int i = 0; i < size; i++) {
            m39143e(this.f2992b.m39525j(i), this.f2993c, this.f2994d);
        }
        return this.f2993c;
    }

    /* renamed from: j */
    public boolean m39138j(T t) {
        int size = this.f2992b.size();
        for (int i = 0; i < size; i++) {
            ArrayList<T> m39521n = this.f2992b.m39521n(i);
            if (m39521n != null && m39521n.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
