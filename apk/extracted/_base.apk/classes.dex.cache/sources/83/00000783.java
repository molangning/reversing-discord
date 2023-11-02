package androidx.recyclerview.widget;

import androidx.core.util.InterfaceC1137e;
import androidx.core.util.Pools$SimplePool;
import androidx.recyclerview.widget.C1804i;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class AdapterHelper implements C1804i.InterfaceC1805a {

    /* renamed from: a */
    private InterfaceC1137e<C1727b> f4559a;

    /* renamed from: b */
    final ArrayList<C1727b> f4560b;

    /* renamed from: c */
    final ArrayList<C1727b> f4561c;

    /* renamed from: d */
    final InterfaceC1726a f4562d;

    /* renamed from: e */
    Runnable f4563e;

    /* renamed from: f */
    final boolean f4564f;

    /* renamed from: g */
    final C1804i f4565g;

    /* renamed from: h */
    private int f4566h;

    /* renamed from: androidx.recyclerview.widget.AdapterHelper$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1726a {
        /* renamed from: a */
        void mo35589a(int i, int i2);

        /* renamed from: b */
        void mo35588b(C1727b c1727b);

        /* renamed from: c */
        void mo35587c(C1727b c1727b);

        /* renamed from: d */
        void mo35586d(int i, int i2);

        /* renamed from: e */
        void mo35585e(int i, int i2, Object obj);

        /* renamed from: f */
        RecyclerView.ViewHolder mo35584f(int i);

        /* renamed from: g */
        void mo35583g(int i, int i2);

        /* renamed from: h */
        void mo35582h(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.AdapterHelper$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1727b {

        /* renamed from: a */
        int f4567a;

        /* renamed from: b */
        int f4568b;

        /* renamed from: c */
        Object f4569c;

        /* renamed from: d */
        int f4570d;

        C1727b(int i, int i2, int i3, Object obj) {
            this.f4567a = i;
            this.f4568b = i2;
            this.f4570d = i3;
            this.f4569c = obj;
        }

        /* renamed from: a */
        String m35935a() {
            int i = this.f4567a;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1727b)) {
                return false;
            }
            C1727b c1727b = (C1727b) obj;
            int i = this.f4567a;
            if (i != c1727b.f4567a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f4570d - this.f4568b) == 1 && this.f4570d == c1727b.f4568b && this.f4568b == c1727b.f4570d) {
                return true;
            }
            if (this.f4570d != c1727b.f4570d || this.f4568b != c1727b.f4568b) {
                return false;
            }
            Object obj2 = this.f4569c;
            if (obj2 != null) {
                if (!obj2.equals(c1727b.f4569c)) {
                    return false;
                }
            } else if (c1727b.f4569c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f4567a * 31) + this.f4568b) * 31) + this.f4570d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m35935a() + ",s:" + this.f4568b + "c:" + this.f4570d + ",p:" + this.f4569c + "]";
        }
    }

    public AdapterHelper(InterfaceC1726a interfaceC1726a) {
        this(interfaceC1726a, false);
    }

    /* renamed from: c */
    private void m35959c(C1727b c1727b) {
        m35940v(c1727b);
    }

    /* renamed from: d */
    private void m35958d(C1727b c1727b) {
        m35940v(c1727b);
    }

    /* renamed from: f */
    private void m35956f(C1727b c1727b) {
        boolean z;
        char c;
        int i = c1727b.f4568b;
        int i2 = c1727b.f4570d + i;
        char c2 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f4562d.mo35584f(i3) == null && !m35954h(i3)) {
                if (c2 == 1) {
                    m35940v(mo35371a(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            } else {
                if (c2 == 0) {
                    m35951k(mo35371a(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 1;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != c1727b.f4570d) {
            mo35370b(c1727b);
            c1727b = mo35371a(2, i, i4, null);
        }
        if (c2 == 0) {
            m35951k(c1727b);
        } else {
            m35940v(c1727b);
        }
    }

    /* renamed from: g */
    private void m35955g(C1727b c1727b) {
        int i = c1727b.f4568b;
        int i2 = c1727b.f4570d + i;
        int i3 = 0;
        boolean z = true;
        int i4 = i;
        while (i < i2) {
            if (this.f4562d.mo35584f(i) == null && !m35954h(i)) {
                if (z) {
                    m35940v(mo35371a(4, i4, i3, c1727b.f4569c));
                    i4 = i;
                    i3 = 0;
                }
                z = false;
            } else {
                if (!z) {
                    m35951k(mo35371a(4, i4, i3, c1727b.f4569c));
                    i4 = i;
                    i3 = 0;
                }
                z = true;
            }
            i3++;
            i++;
        }
        if (i3 != c1727b.f4570d) {
            Object obj = c1727b.f4569c;
            mo35370b(c1727b);
            c1727b = mo35371a(4, i4, i3, obj);
        }
        if (!z) {
            m35951k(c1727b);
        } else {
            m35940v(c1727b);
        }
    }

    /* renamed from: h */
    private boolean m35954h(int i) {
        int size = this.f4561c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1727b c1727b = this.f4561c.get(i2);
            int i3 = c1727b.f4567a;
            if (i3 == 8) {
                if (m35948n(c1727b.f4570d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c1727b.f4568b;
                int i5 = c1727b.f4570d + i4;
                while (i4 < i5) {
                    if (m35948n(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m35951k(C1727b c1727b) {
        int i;
        boolean z;
        int i2 = c1727b.f4567a;
        if (i2 != 1 && i2 != 8) {
            int m35936z = m35936z(c1727b.f4568b, i2);
            int i3 = c1727b.f4568b;
            int i4 = c1727b.f4567a;
            if (i4 != 2) {
                if (i4 == 4) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + c1727b);
                }
            } else {
                i = 0;
            }
            int i5 = 1;
            for (int i6 = 1; i6 < c1727b.f4570d; i6++) {
                int m35936z2 = m35936z(c1727b.f4568b + (i * i6), c1727b.f4567a);
                int i7 = c1727b.f4567a;
                if (i7 == 2 ? m35936z2 != m35936z : i7 != 4 || m35936z2 != m35936z + 1) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    i5++;
                } else {
                    C1727b mo35371a = mo35371a(i7, m35936z, i5, c1727b.f4569c);
                    m35950l(mo35371a, i3);
                    mo35370b(mo35371a);
                    if (c1727b.f4567a == 4) {
                        i3 += i5;
                    }
                    i5 = 1;
                    m35936z = m35936z2;
                }
            }
            Object obj = c1727b.f4569c;
            mo35370b(c1727b);
            if (i5 > 0) {
                C1727b mo35371a2 = mo35371a(c1727b.f4567a, m35936z, i5, obj);
                m35950l(mo35371a2, i3);
                mo35370b(mo35371a2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    /* renamed from: v */
    private void m35940v(C1727b c1727b) {
        this.f4561c.add(c1727b);
        int i = c1727b.f4567a;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        this.f4562d.mo35589a(c1727b.f4568b, c1727b.f4570d);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + c1727b);
                }
                this.f4562d.mo35585e(c1727b.f4568b, c1727b.f4570d, c1727b.f4569c);
                return;
            }
            this.f4562d.mo35586d(c1727b.f4568b, c1727b.f4570d);
            return;
        }
        this.f4562d.mo35583g(c1727b.f4568b, c1727b.f4570d);
    }

    /* renamed from: z */
    private int m35936z(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.f4561c.size() - 1; size >= 0; size--) {
            C1727b c1727b = this.f4561c.get(size);
            int i5 = c1727b.f4567a;
            if (i5 == 8) {
                int i6 = c1727b.f4568b;
                int i7 = c1727b.f4570d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i >= i4 && i <= i3) {
                    if (i4 == i6) {
                        if (i2 == 1) {
                            c1727b.f4570d = i7 + 1;
                        } else if (i2 == 2) {
                            c1727b.f4570d = i7 - 1;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            c1727b.f4568b = i6 + 1;
                        } else if (i2 == 2) {
                            c1727b.f4568b = i6 - 1;
                        }
                        i--;
                    }
                } else if (i < i6) {
                    if (i2 == 1) {
                        c1727b.f4568b = i6 + 1;
                        c1727b.f4570d = i7 + 1;
                    } else if (i2 == 2) {
                        c1727b.f4568b = i6 - 1;
                        c1727b.f4570d = i7 - 1;
                    }
                }
            } else {
                int i8 = c1727b.f4568b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c1727b.f4570d;
                    } else if (i5 == 2) {
                        i += c1727b.f4570d;
                    }
                } else if (i2 == 1) {
                    c1727b.f4568b = i8 + 1;
                } else if (i2 == 2) {
                    c1727b.f4568b = i8 - 1;
                }
            }
        }
        for (int size2 = this.f4561c.size() - 1; size2 >= 0; size2--) {
            C1727b c1727b2 = this.f4561c.get(size2);
            if (c1727b2.f4567a == 8) {
                int i9 = c1727b2.f4570d;
                if (i9 == c1727b2.f4568b || i9 < 0) {
                    this.f4561c.remove(size2);
                    mo35370b(c1727b2);
                }
            } else if (c1727b2.f4570d <= 0) {
                this.f4561c.remove(size2);
                mo35370b(c1727b2);
            }
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.C1804i.InterfaceC1805a
    /* renamed from: a */
    public C1727b mo35371a(int i, int i2, int i3, Object obj) {
        C1727b acquire = this.f4559a.acquire();
        if (acquire == null) {
            return new C1727b(i, i2, i3, obj);
        }
        acquire.f4567a = i;
        acquire.f4568b = i2;
        acquire.f4570d = i3;
        acquire.f4569c = obj;
        return acquire;
    }

    @Override // androidx.recyclerview.widget.C1804i.InterfaceC1805a
    /* renamed from: b */
    public void mo35370b(C1727b c1727b) {
        if (!this.f4564f) {
            c1727b.f4569c = null;
            this.f4559a.release(c1727b);
        }
    }

    /* renamed from: e */
    public int m35957e(int i) {
        int size = this.f4560b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1727b c1727b = this.f4560b.get(i2);
            int i3 = c1727b.f4567a;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 8) {
                        int i4 = c1727b.f4568b;
                        if (i4 == i) {
                            i = c1727b.f4570d;
                        } else {
                            if (i4 < i) {
                                i--;
                            }
                            if (c1727b.f4570d <= i) {
                                i++;
                            }
                        }
                    }
                } else {
                    int i5 = c1727b.f4568b;
                    if (i5 <= i) {
                        int i6 = c1727b.f4570d;
                        if (i5 + i6 > i) {
                            return -1;
                        }
                        i -= i6;
                    } else {
                        continue;
                    }
                }
            } else if (c1727b.f4568b <= i) {
                i += c1727b.f4570d;
            }
        }
        return i;
    }

    /* renamed from: i */
    public void m35953i() {
        int size = this.f4561c.size();
        for (int i = 0; i < size; i++) {
            this.f4562d.mo35587c(this.f4561c.get(i));
        }
        m35938x(this.f4561c);
        this.f4566h = 0;
    }

    /* renamed from: j */
    public void m35952j() {
        m35953i();
        int size = this.f4560b.size();
        for (int i = 0; i < size; i++) {
            C1727b c1727b = this.f4560b.get(i);
            int i2 = c1727b.f4567a;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 == 8) {
                            this.f4562d.mo35587c(c1727b);
                            this.f4562d.mo35589a(c1727b.f4568b, c1727b.f4570d);
                        }
                    } else {
                        this.f4562d.mo35587c(c1727b);
                        this.f4562d.mo35585e(c1727b.f4568b, c1727b.f4570d, c1727b.f4569c);
                    }
                } else {
                    this.f4562d.mo35587c(c1727b);
                    this.f4562d.mo35582h(c1727b.f4568b, c1727b.f4570d);
                }
            } else {
                this.f4562d.mo35587c(c1727b);
                this.f4562d.mo35583g(c1727b.f4568b, c1727b.f4570d);
            }
            Runnable runnable = this.f4563e;
            if (runnable != null) {
                runnable.run();
            }
        }
        m35938x(this.f4560b);
        this.f4566h = 0;
    }

    /* renamed from: l */
    void m35950l(C1727b c1727b, int i) {
        this.f4562d.mo35588b(c1727b);
        int i2 = c1727b.f4567a;
        if (i2 != 2) {
            if (i2 == 4) {
                this.f4562d.mo35585e(i, c1727b.f4570d, c1727b.f4569c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        this.f4562d.mo35582h(i, c1727b.f4570d);
    }

    /* renamed from: m */
    public int m35949m(int i) {
        return m35948n(i, 0);
    }

    /* renamed from: n */
    int m35948n(int i, int i2) {
        int size = this.f4561c.size();
        while (i2 < size) {
            C1727b c1727b = this.f4561c.get(i2);
            int i3 = c1727b.f4567a;
            if (i3 == 8) {
                int i4 = c1727b.f4568b;
                if (i4 == i) {
                    i = c1727b.f4570d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c1727b.f4570d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c1727b.f4568b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c1727b.f4570d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c1727b.f4570d;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: o */
    public boolean m35947o(int i) {
        return (i & this.f4566h) != 0;
    }

    /* renamed from: p */
    public boolean m35946p() {
        return this.f4560b.size() > 0;
    }

    /* renamed from: q */
    public boolean m35945q() {
        return (this.f4561c.isEmpty() || this.f4560b.isEmpty()) ? false : true;
    }

    /* renamed from: r */
    public boolean m35944r(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f4560b.add(mo35371a(4, i, i2, obj));
        this.f4566h |= 4;
        if (this.f4560b.size() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public boolean m35943s(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f4560b.add(mo35371a(1, i, i2, null));
        this.f4566h |= 1;
        if (this.f4560b.size() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public boolean m35942t(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.f4560b.add(mo35371a(8, i, i2, null));
            this.f4566h |= 8;
            if (this.f4560b.size() != 1) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* renamed from: u */
    public boolean m35941u(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f4560b.add(mo35371a(2, i, i2, null));
        this.f4566h |= 2;
        if (this.f4560b.size() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public void m35939w() {
        this.f4565g.m35376b(this.f4560b);
        int size = this.f4560b.size();
        for (int i = 0; i < size; i++) {
            C1727b c1727b = this.f4560b.get(i);
            int i2 = c1727b.f4567a;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 == 8) {
                            m35958d(c1727b);
                        }
                    } else {
                        m35955g(c1727b);
                    }
                } else {
                    m35956f(c1727b);
                }
            } else {
                m35959c(c1727b);
            }
            Runnable runnable = this.f4563e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f4560b.clear();
    }

    /* renamed from: x */
    void m35938x(List<C1727b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo35370b(list.get(i));
        }
        list.clear();
    }

    /* renamed from: y */
    public void m35937y() {
        m35938x(this.f4560b);
        m35938x(this.f4561c);
        this.f4566h = 0;
    }

    AdapterHelper(InterfaceC1726a interfaceC1726a, boolean z) {
        this.f4559a = new Pools$SimplePool(30);
        this.f4560b = new ArrayList<>();
        this.f4561c = new ArrayList<>();
        this.f4566h = 0;
        this.f4562d = interfaceC1726a;
        this.f4564f = z;
        this.f4565g = new C1804i(this);
    }
}