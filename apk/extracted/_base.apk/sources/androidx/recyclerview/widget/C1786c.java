package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1786c {

    /* renamed from: a */
    private static final Comparator<C1790d> f4890a = new C1787a();

    /* renamed from: androidx.recyclerview.widget.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1787a implements Comparator<C1790d> {
        C1787a() {
        }

        @Override // java.util.Comparator
        /* renamed from: b */
        public int compare(C1790d c1790d, C1790d c1790d2) {
            return c1790d.f4893a - c1790d2.f4893a;
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AbstractC1788b {
        public abstract boolean areContentsTheSame(int i, int i2);

        public abstract boolean areItemsTheSame(int i, int i2);

        public Object getChangePayload(int i, int i2) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1789c {

        /* renamed from: a */
        private final int[] f4891a;

        /* renamed from: b */
        private final int f4892b;

        C1789c(int i) {
            int[] iArr = new int[i];
            this.f4891a = iArr;
            this.f4892b = iArr.length / 2;
        }

        /* renamed from: a */
        int[] m35423a() {
            return this.f4891a;
        }

        /* renamed from: b */
        int m35422b(int i) {
            return this.f4891a[i + this.f4892b];
        }

        /* renamed from: c */
        void m35421c(int i, int i2) {
            this.f4891a[i + this.f4892b] = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1790d {

        /* renamed from: a */
        public final int f4893a;

        /* renamed from: b */
        public final int f4894b;

        /* renamed from: c */
        public final int f4895c;

        C1790d(int i, int i2, int i3) {
            this.f4893a = i;
            this.f4894b = i2;
            this.f4895c = i3;
        }

        /* renamed from: a */
        int m35420a() {
            return this.f4893a + this.f4895c;
        }

        /* renamed from: b */
        int m35419b() {
            return this.f4894b + this.f4895c;
        }
    }

    /* renamed from: androidx.recyclerview.widget.c$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1791e {

        /* renamed from: a */
        private final List<C1790d> f4896a;

        /* renamed from: b */
        private final int[] f4897b;

        /* renamed from: c */
        private final int[] f4898c;

        /* renamed from: d */
        private final AbstractC1788b f4899d;

        /* renamed from: e */
        private final int f4900e;

        /* renamed from: f */
        private final int f4901f;

        /* renamed from: g */
        private final boolean f4902g;

        C1791e(AbstractC1788b abstractC1788b, List<C1790d> list, int[] iArr, int[] iArr2, boolean z) {
            this.f4896a = list;
            this.f4897b = iArr;
            this.f4898c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f4899d = abstractC1788b;
            this.f4900e = abstractC1788b.getOldListSize();
            this.f4901f = abstractC1788b.getNewListSize();
            this.f4902g = z;
            m35418a();
            m35414e();
        }

        /* renamed from: a */
        private void m35418a() {
            C1790d c1790d;
            if (this.f4896a.isEmpty()) {
                c1790d = null;
            } else {
                c1790d = this.f4896a.get(0);
            }
            if (c1790d == null || c1790d.f4893a != 0 || c1790d.f4894b != 0) {
                this.f4896a.add(0, new C1790d(0, 0, 0));
            }
            this.f4896a.add(new C1790d(this.f4900e, this.f4901f, 0));
        }

        /* renamed from: d */
        private void m35415d(int i) {
            int i2;
            int size = this.f4896a.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                C1790d c1790d = this.f4896a.get(i4);
                while (i3 < c1790d.f4894b) {
                    if (this.f4898c[i3] == 0 && this.f4899d.areItemsTheSame(i, i3)) {
                        if (this.f4899d.areContentsTheSame(i, i3)) {
                            i2 = 8;
                        } else {
                            i2 = 4;
                        }
                        this.f4897b[i] = (i3 << 4) | i2;
                        this.f4898c[i3] = (i << 4) | i2;
                        return;
                    }
                    i3++;
                }
                i3 = c1790d.m35419b();
            }
        }

        /* renamed from: e */
        private void m35414e() {
            int i;
            for (C1790d c1790d : this.f4896a) {
                for (int i2 = 0; i2 < c1790d.f4895c; i2++) {
                    int i3 = c1790d.f4893a + i2;
                    int i4 = c1790d.f4894b + i2;
                    if (this.f4899d.areContentsTheSame(i3, i4)) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    this.f4897b[i3] = (i4 << 4) | i;
                    this.f4898c[i4] = (i3 << 4) | i;
                }
            }
            if (this.f4902g) {
                m35413f();
            }
        }

        /* renamed from: f */
        private void m35413f() {
            int i = 0;
            for (C1790d c1790d : this.f4896a) {
                while (i < c1790d.f4893a) {
                    if (this.f4897b[i] == 0) {
                        m35415d(i);
                    }
                    i++;
                }
                i = c1790d.m35420a();
            }
        }

        /* renamed from: g */
        private static C1792f m35412g(Collection<C1792f> collection, int i, boolean z) {
            C1792f c1792f;
            Iterator<C1792f> it = collection.iterator();
            while (true) {
                if (it.hasNext()) {
                    c1792f = it.next();
                    if (c1792f.f4903a == i && c1792f.f4905c == z) {
                        it.remove();
                        break;
                    }
                } else {
                    c1792f = null;
                    break;
                }
            }
            while (it.hasNext()) {
                C1792f next = it.next();
                if (z) {
                    next.f4904b--;
                } else {
                    next.f4904b++;
                }
            }
            return c1792f;
        }

        /* renamed from: b */
        public void m35417b(InterfaceC1803h interfaceC1803h) {
            C1785b c1785b;
            int i;
            if (interfaceC1803h instanceof C1785b) {
                c1785b = (C1785b) interfaceC1803h;
            } else {
                c1785b = new C1785b(interfaceC1803h);
            }
            int i2 = this.f4900e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i3 = this.f4900e;
            int i4 = this.f4901f;
            for (int size = this.f4896a.size() - 1; size >= 0; size--) {
                C1790d c1790d = this.f4896a.get(size);
                int m35420a = c1790d.m35420a();
                int m35419b = c1790d.m35419b();
                while (true) {
                    if (i3 <= m35420a) {
                        break;
                    }
                    i3--;
                    int i5 = this.f4897b[i3];
                    if ((i5 & 12) != 0) {
                        int i6 = i5 >> 4;
                        C1792f m35412g = m35412g(arrayDeque, i6, false);
                        if (m35412g != null) {
                            int i7 = (i2 - m35412g.f4904b) - 1;
                            c1785b.mo35378d(i3, i7);
                            if ((i5 & 4) != 0) {
                                c1785b.mo35379c(i7, 1, this.f4899d.getChangePayload(i3, i6));
                            }
                        } else {
                            arrayDeque.add(new C1792f(i3, (i2 - i3) - 1, true));
                        }
                    } else {
                        c1785b.mo35380b(i3, 1);
                        i2--;
                    }
                }
                while (i4 > m35419b) {
                    i4--;
                    int i8 = this.f4898c[i4];
                    if ((i8 & 12) != 0) {
                        int i9 = i8 >> 4;
                        C1792f m35412g2 = m35412g(arrayDeque, i9, true);
                        if (m35412g2 == null) {
                            arrayDeque.add(new C1792f(i4, i2 - i3, false));
                        } else {
                            c1785b.mo35378d((i2 - m35412g2.f4904b) - 1, i3);
                            if ((i8 & 4) != 0) {
                                c1785b.mo35379c(i3, 1, this.f4899d.getChangePayload(i9, i4));
                            }
                        }
                    } else {
                        c1785b.mo35381a(i3, 1);
                        i2++;
                    }
                }
                int i10 = c1790d.f4893a;
                int i11 = c1790d.f4894b;
                for (i = 0; i < c1790d.f4895c; i++) {
                    if ((this.f4897b[i10] & 15) == 2) {
                        c1785b.mo35379c(i10, 1, this.f4899d.getChangePayload(i10, i11));
                    }
                    i10++;
                    i11++;
                }
                i3 = c1790d.f4893a;
                i4 = c1790d.f4894b;
            }
            c1785b.m35429e();
        }

        /* renamed from: c */
        public void m35416c(RecyclerView.Adapter adapter) {
            m35417b(new C1784a(adapter));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.c$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1792f {

        /* renamed from: a */
        int f4903a;

        /* renamed from: b */
        int f4904b;

        /* renamed from: c */
        boolean f4905c;

        C1792f(int i, int i2, boolean z) {
            this.f4903a = i;
            this.f4904b = i2;
            this.f4905c = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1793g {

        /* renamed from: a */
        int f4906a;

        /* renamed from: b */
        int f4907b;

        /* renamed from: c */
        int f4908c;

        /* renamed from: d */
        int f4909d;

        public C1793g() {
        }

        /* renamed from: a */
        int m35411a() {
            return this.f4909d - this.f4908c;
        }

        /* renamed from: b */
        int m35410b() {
            return this.f4907b - this.f4906a;
        }

        public C1793g(int i, int i2, int i3, int i4) {
            this.f4906a = i;
            this.f4907b = i2;
            this.f4908c = i3;
            this.f4909d = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.c$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1794h {

        /* renamed from: a */
        public int f4910a;

        /* renamed from: b */
        public int f4911b;

        /* renamed from: c */
        public int f4912c;

        /* renamed from: d */
        public int f4913d;

        /* renamed from: e */
        public boolean f4914e;

        C1794h() {
        }

        /* renamed from: a */
        int m35409a() {
            return Math.min(this.f4912c - this.f4910a, this.f4913d - this.f4911b);
        }

        /* renamed from: b */
        boolean m35408b() {
            return this.f4913d - this.f4911b != this.f4912c - this.f4910a;
        }

        /* renamed from: c */
        boolean m35407c() {
            return this.f4913d - this.f4911b > this.f4912c - this.f4910a;
        }

        /* renamed from: d */
        C1790d m35406d() {
            if (m35408b()) {
                if (this.f4914e) {
                    return new C1790d(this.f4910a, this.f4911b, m35409a());
                }
                if (m35407c()) {
                    return new C1790d(this.f4910a, this.f4911b + 1, m35409a());
                }
                return new C1790d(this.f4910a + 1, this.f4911b, m35409a());
            }
            int i = this.f4910a;
            return new C1790d(i, this.f4911b, this.f4912c - i);
        }
    }

    /* renamed from: a */
    private static C1794h m35428a(C1793g c1793g, AbstractC1788b abstractC1788b, C1789c c1789c, C1789c c1789c2, int i) {
        boolean z;
        int m35422b;
        int i2;
        int i3;
        int i4;
        if ((c1793g.m35410b() - c1793g.m35411a()) % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        int m35410b = c1793g.m35410b() - c1793g.m35411a();
        int i5 = -i;
        for (int i6 = i5; i6 <= i; i6 += 2) {
            if (i6 != i5 && (i6 == i || c1789c2.m35422b(i6 + 1) >= c1789c2.m35422b(i6 - 1))) {
                m35422b = c1789c2.m35422b(i6 - 1);
                i2 = m35422b - 1;
            } else {
                m35422b = c1789c2.m35422b(i6 + 1);
                i2 = m35422b;
            }
            int i7 = c1793g.f4909d - ((c1793g.f4907b - i2) - i6);
            if (i != 0 && i2 == m35422b) {
                i3 = i7 + 1;
            } else {
                i3 = i7;
            }
            while (i2 > c1793g.f4906a && i7 > c1793g.f4908c && abstractC1788b.areItemsTheSame(i2 - 1, i7 - 1)) {
                i2--;
                i7--;
            }
            c1789c2.m35421c(i6, i2);
            if (z && (i4 = m35410b - i6) >= i5 && i4 <= i && c1789c.m35422b(i4) >= i2) {
                C1794h c1794h = new C1794h();
                c1794h.f4910a = i2;
                c1794h.f4911b = i7;
                c1794h.f4912c = m35422b;
                c1794h.f4913d = i3;
                c1794h.f4914e = true;
                return c1794h;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static C1791e m35427b(AbstractC1788b abstractC1788b, boolean z) {
        C1793g c1793g;
        int oldListSize = abstractC1788b.getOldListSize();
        int newListSize = abstractC1788b.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C1793g(0, oldListSize, 0, newListSize));
        int i = ((((oldListSize + newListSize) + 1) / 2) * 2) + 1;
        C1789c c1789c = new C1789c(i);
        C1789c c1789c2 = new C1789c(i);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C1793g c1793g2 = (C1793g) arrayList2.remove(arrayList2.size() - 1);
            C1794h m35425d = m35425d(c1793g2, abstractC1788b, c1789c, c1789c2);
            if (m35425d != null) {
                if (m35425d.m35409a() > 0) {
                    arrayList.add(m35425d.m35406d());
                }
                if (arrayList3.isEmpty()) {
                    c1793g = new C1793g();
                } else {
                    c1793g = (C1793g) arrayList3.remove(arrayList3.size() - 1);
                }
                c1793g.f4906a = c1793g2.f4906a;
                c1793g.f4908c = c1793g2.f4908c;
                c1793g.f4907b = m35425d.f4910a;
                c1793g.f4909d = m35425d.f4911b;
                arrayList2.add(c1793g);
                c1793g2.f4907b = c1793g2.f4907b;
                c1793g2.f4909d = c1793g2.f4909d;
                c1793g2.f4906a = m35425d.f4912c;
                c1793g2.f4908c = m35425d.f4913d;
                arrayList2.add(c1793g2);
            } else {
                arrayList3.add(c1793g2);
            }
        }
        Collections.sort(arrayList, f4890a);
        return new C1791e(abstractC1788b, arrayList, c1789c.m35423a(), c1789c2.m35423a(), z);
    }

    /* renamed from: c */
    private static C1794h m35426c(C1793g c1793g, AbstractC1788b abstractC1788b, C1789c c1789c, C1789c c1789c2, int i) {
        int m35422b;
        int i2;
        int i3;
        boolean z = true;
        if (Math.abs(c1793g.m35410b() - c1793g.m35411a()) % 2 != 1) {
            z = false;
        }
        int m35410b = c1793g.m35410b() - c1793g.m35411a();
        int i4 = -i;
        for (int i5 = i4; i5 <= i; i5 += 2) {
            if (i5 != i4 && (i5 == i || c1789c.m35422b(i5 + 1) <= c1789c.m35422b(i5 - 1))) {
                m35422b = c1789c.m35422b(i5 - 1);
                i2 = m35422b + 1;
            } else {
                m35422b = c1789c.m35422b(i5 + 1);
                i2 = m35422b;
            }
            int i6 = (c1793g.f4908c + (i2 - c1793g.f4906a)) - i5;
            int i7 = (i != 0 && i2 == m35422b) ? i6 - 1 : i6;
            while (i2 < c1793g.f4907b && i6 < c1793g.f4909d && abstractC1788b.areItemsTheSame(i2, i6)) {
                i2++;
                i6++;
            }
            c1789c.m35421c(i5, i2);
            if (z && (i3 = m35410b - i5) >= i4 + 1 && i3 <= i - 1 && c1789c2.m35422b(i3) <= i2) {
                C1794h c1794h = new C1794h();
                c1794h.f4910a = m35422b;
                c1794h.f4911b = i7;
                c1794h.f4912c = i2;
                c1794h.f4913d = i6;
                c1794h.f4914e = false;
                return c1794h;
            }
        }
        return null;
    }

    /* renamed from: d */
    private static C1794h m35425d(C1793g c1793g, AbstractC1788b abstractC1788b, C1789c c1789c, C1789c c1789c2) {
        if (c1793g.m35410b() >= 1 && c1793g.m35411a() >= 1) {
            int m35410b = ((c1793g.m35410b() + c1793g.m35411a()) + 1) / 2;
            c1789c.m35421c(1, c1793g.f4906a);
            c1789c2.m35421c(1, c1793g.f4907b);
            for (int i = 0; i < m35410b; i++) {
                C1794h m35426c = m35426c(c1793g, abstractC1788b, c1789c, c1789c2, i);
                if (m35426c != null) {
                    return m35426c;
                }
                C1794h m35428a = m35428a(c1793g, abstractC1788b, c1789c, c1789c2, i);
                if (m35428a != null) {
                    return m35428a;
                }
            }
        }
        return null;
    }
}
