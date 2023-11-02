package androidx.recyclerview.widget;

import androidx.collection.C0629d;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.InterfaceC1137e;
import androidx.core.util.Pools$SimplePool;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ViewInfoStore {

    /* renamed from: a */
    final SimpleArrayMap<RecyclerView.ViewHolder, C1783a> f4878a = new SimpleArrayMap<>();

    /* renamed from: b */
    final C0629d<RecyclerView.ViewHolder> f4879b = new C0629d<>();

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface ProcessCallback {
        /* renamed from: a */
        void mo35436a(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        /* renamed from: b */
        void mo35435b(RecyclerView.ViewHolder viewHolder);

        /* renamed from: c */
        void mo35434c(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);

        /* renamed from: d */
        void mo35433d(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo2);
    }

    /* renamed from: androidx.recyclerview.widget.ViewInfoStore$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1783a {

        /* renamed from: d */
        static InterfaceC1137e<C1783a> f4880d = new Pools$SimplePool(20);

        /* renamed from: a */
        int f4881a;

        /* renamed from: b */
        RecyclerView.ItemAnimator.ItemHolderInfo f4882b;

        /* renamed from: c */
        RecyclerView.ItemAnimator.ItemHolderInfo f4883c;

        private C1783a() {
        }

        /* renamed from: a */
        static void m35432a() {
            do {
            } while (f4880d.acquire() != null);
        }

        /* renamed from: b */
        static C1783a m35431b() {
            C1783a acquire = f4880d.acquire();
            if (acquire == null) {
                return new C1783a();
            }
            return acquire;
        }

        /* renamed from: c */
        static void m35430c(C1783a c1783a) {
            c1783a.f4881a = 0;
            c1783a.f4882b = null;
            c1783a.f4883c = null;
            f4880d.release(c1783a);
        }
    }

    /* renamed from: l */
    private RecyclerView.ItemAnimator.ItemHolderInfo m35442l(RecyclerView.ViewHolder viewHolder, int i) {
        C1783a m39521n;
        RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo;
        int m39528g = this.f4878a.m39528g(viewHolder);
        if (m39528g >= 0 && (m39521n = this.f4878a.m39521n(m39528g)) != null) {
            int i2 = m39521n.f4881a;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                m39521n.f4881a = i3;
                if (i == 4) {
                    itemHolderInfo = m39521n.f4882b;
                } else if (i == 8) {
                    itemHolderInfo = m39521n.f4883c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.f4878a.m39523l(m39528g);
                    C1783a.m35430c(m39521n);
                }
                return itemHolderInfo;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m35453a(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        C1783a c1783a = this.f4878a.get(viewHolder);
        if (c1783a == null) {
            c1783a = C1783a.m35431b();
            this.f4878a.put(viewHolder, c1783a);
        }
        c1783a.f4881a |= 2;
        c1783a.f4882b = itemHolderInfo;
    }

    /* renamed from: b */
    public void m35452b(RecyclerView.ViewHolder viewHolder) {
        C1783a c1783a = this.f4878a.get(viewHolder);
        if (c1783a == null) {
            c1783a = C1783a.m35431b();
            this.f4878a.put(viewHolder, c1783a);
        }
        c1783a.f4881a |= 1;
    }

    /* renamed from: c */
    public void m35451c(long j, RecyclerView.ViewHolder viewHolder) {
        this.f4879b.m39484m(j, viewHolder);
    }

    /* renamed from: d */
    public void m35450d(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        C1783a c1783a = this.f4878a.get(viewHolder);
        if (c1783a == null) {
            c1783a = C1783a.m35431b();
            this.f4878a.put(viewHolder, c1783a);
        }
        c1783a.f4883c = itemHolderInfo;
        c1783a.f4881a |= 8;
    }

    /* renamed from: e */
    public void m35449e(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo) {
        C1783a c1783a = this.f4878a.get(viewHolder);
        if (c1783a == null) {
            c1783a = C1783a.m35431b();
            this.f4878a.put(viewHolder, c1783a);
        }
        c1783a.f4882b = itemHolderInfo;
        c1783a.f4881a |= 4;
    }

    /* renamed from: f */
    public void m35448f() {
        this.f4878a.clear();
        this.f4879b.m39492c();
    }

    /* renamed from: g */
    public RecyclerView.ViewHolder m35447g(long j) {
        return this.f4879b.m39488g(j);
    }

    /* renamed from: h */
    public boolean m35446h(RecyclerView.ViewHolder viewHolder) {
        C1783a c1783a = this.f4878a.get(viewHolder);
        if (c1783a != null && (c1783a.f4881a & 1) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean m35445i(RecyclerView.ViewHolder viewHolder) {
        C1783a c1783a = this.f4878a.get(viewHolder);
        if (c1783a != null && (c1783a.f4881a & 4) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public void m35444j() {
        C1783a.m35432a();
    }

    /* renamed from: k */
    public void m35443k(RecyclerView.ViewHolder viewHolder) {
        m35438p(viewHolder);
    }

    /* renamed from: m */
    public RecyclerView.ItemAnimator.ItemHolderInfo m35441m(RecyclerView.ViewHolder viewHolder) {
        return m35442l(viewHolder, 8);
    }

    /* renamed from: n */
    public RecyclerView.ItemAnimator.ItemHolderInfo m35440n(RecyclerView.ViewHolder viewHolder) {
        return m35442l(viewHolder, 4);
    }

    /* renamed from: o */
    public void m35439o(ProcessCallback processCallback) {
        for (int size = this.f4878a.size() - 1; size >= 0; size--) {
            RecyclerView.ViewHolder m39525j = this.f4878a.m39525j(size);
            C1783a m39523l = this.f4878a.m39523l(size);
            int i = m39523l.f4881a;
            if ((i & 3) == 3) {
                processCallback.mo35435b(m39525j);
            } else if ((i & 1) != 0) {
                RecyclerView.ItemAnimator.ItemHolderInfo itemHolderInfo = m39523l.f4882b;
                if (itemHolderInfo == null) {
                    processCallback.mo35435b(m39525j);
                } else {
                    processCallback.mo35434c(m39525j, itemHolderInfo, m39523l.f4883c);
                }
            } else if ((i & 14) == 14) {
                processCallback.mo35436a(m39525j, m39523l.f4882b, m39523l.f4883c);
            } else if ((i & 12) == 12) {
                processCallback.mo35433d(m39525j, m39523l.f4882b, m39523l.f4883c);
            } else if ((i & 4) != 0) {
                processCallback.mo35434c(m39525j, m39523l.f4882b, null);
            } else if ((i & 8) != 0) {
                processCallback.mo35436a(m39525j, m39523l.f4882b, m39523l.f4883c);
            }
            C1783a.m35430c(m39523l);
        }
    }

    /* renamed from: p */
    public void m35438p(RecyclerView.ViewHolder viewHolder) {
        C1783a c1783a = this.f4878a.get(viewHolder);
        if (c1783a == null) {
            return;
        }
        c1783a.f4881a &= -2;
    }

    /* renamed from: q */
    public void m35437q(RecyclerView.ViewHolder viewHolder) {
        int m39481q = this.f4879b.m39481q() - 1;
        while (true) {
            if (m39481q < 0) {
                break;
            } else if (viewHolder == this.f4879b.m39480r(m39481q)) {
                this.f4879b.m39482p(m39481q);
                break;
            } else {
                m39481q--;
            }
        }
        C1783a remove = this.f4878a.remove(viewHolder);
        if (remove != null) {
            C1783a.m35430c(remove);
        }
    }
}