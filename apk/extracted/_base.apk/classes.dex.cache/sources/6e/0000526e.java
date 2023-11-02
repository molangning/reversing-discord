package p437y4;

import android.util.SparseArray;
import java.util.LinkedList;

/* renamed from: y4.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13885j<T> {

    /* renamed from: a */
    protected final SparseArray<C13887b<T>> f35721a = new SparseArray<>();

    /* renamed from: b */
    C13887b<T> f35722b;

    /* renamed from: c */
    C13887b<T> f35723c;

    /* renamed from: y4.j$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C13887b<I> {

        /* renamed from: a */
        C13887b<I> f35724a;

        /* renamed from: b */
        int f35725b;

        /* renamed from: c */
        LinkedList<I> f35726c;

        /* renamed from: d */
        C13887b<I> f35727d;

        public String toString() {
            return "LinkedEntry(key: " + this.f35725b + ")";
        }

        private C13887b(C13887b<I> c13887b, int i, LinkedList<I> linkedList, C13887b<I> c13887b2) {
            this.f35724a = c13887b;
            this.f35725b = i;
            this.f35726c = linkedList;
            this.f35727d = c13887b2;
        }
    }

    /* renamed from: b */
    private void m1309b(C13887b<T> c13887b) {
        if (c13887b != null && c13887b.f35726c.isEmpty()) {
            m1307d(c13887b);
            this.f35721a.remove(c13887b.f35725b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    private void m1308c(C13887b<T> c13887b) {
        if (this.f35722b == c13887b) {
            return;
        }
        m1307d(c13887b);
        C13887b c13887b2 = (C13887b<T>) this.f35722b;
        if (c13887b2 == null) {
            this.f35722b = c13887b;
            this.f35723c = c13887b;
            return;
        }
        c13887b.f35727d = c13887b2;
        c13887b2.f35724a = c13887b;
        this.f35722b = c13887b;
    }

    /* renamed from: d */
    private synchronized void m1307d(C13887b<T> c13887b) {
        C13887b c13887b2 = (C13887b<T>) c13887b.f35724a;
        C13887b c13887b3 = (C13887b<T>) c13887b.f35727d;
        if (c13887b2 != null) {
            c13887b2.f35727d = c13887b3;
        }
        if (c13887b3 != null) {
            c13887b3.f35724a = c13887b2;
        }
        c13887b.f35724a = null;
        c13887b.f35727d = null;
        if (c13887b == this.f35722b) {
            this.f35722b = c13887b3;
        }
        if (c13887b == this.f35723c) {
            this.f35723c = c13887b2;
        }
    }

    /* renamed from: a */
    public synchronized T m1310a(int i) {
        C13887b<T> c13887b = this.f35721a.get(i);
        if (c13887b == null) {
            return null;
        }
        T pollFirst = c13887b.f35726c.pollFirst();
        m1308c(c13887b);
        return pollFirst;
    }

    /* renamed from: e */
    public synchronized void m1306e(int i, T t) {
        C13887b<T> c13887b = this.f35721a.get(i);
        if (c13887b == null) {
            c13887b = new C13887b<>(null, i, new LinkedList(), null);
            this.f35721a.put(i, c13887b);
        }
        c13887b.f35726c.addLast(t);
        m1308c(c13887b);
    }

    /* renamed from: f */
    public synchronized T m1305f() {
        C13887b<T> c13887b = this.f35723c;
        if (c13887b == null) {
            return null;
        }
        T pollLast = c13887b.f35726c.pollLast();
        m1309b(c13887b);
        return pollLast;
    }
}