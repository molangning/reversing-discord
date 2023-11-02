package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ChildHelper {

    /* renamed from: a */
    final InterfaceC1729b f4571a;

    /* renamed from: b */
    final C1728a f4572b = new C1728a();

    /* renamed from: c */
    final List<View> f4573c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.ChildHelper$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1728a {

        /* renamed from: a */
        long f4574a = 0;

        /* renamed from: b */
        C1728a f4575b;

        C1728a() {
        }

        /* renamed from: c */
        private void m35912c() {
            if (this.f4575b == null) {
                this.f4575b = new C1728a();
            }
        }

        /* renamed from: a */
        void m35914a(int i) {
            if (i >= 64) {
                C1728a c1728a = this.f4575b;
                if (c1728a != null) {
                    c1728a.m35914a(i - 64);
                    return;
                }
                return;
            }
            this.f4574a &= ~(1 << i);
        }

        /* renamed from: b */
        int m35913b(int i) {
            C1728a c1728a = this.f4575b;
            if (c1728a == null) {
                if (i >= 64) {
                    return Long.bitCount(this.f4574a);
                }
                return Long.bitCount(this.f4574a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.f4574a & ((1 << i) - 1));
            } else {
                return c1728a.m35913b(i - 64) + Long.bitCount(this.f4574a);
            }
        }

        /* renamed from: d */
        boolean m35911d(int i) {
            if (i >= 64) {
                m35912c();
                return this.f4575b.m35911d(i - 64);
            } else if ((this.f4574a & (1 << i)) != 0) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: e */
        void m35910e(int i, boolean z) {
            boolean z2;
            if (i >= 64) {
                m35912c();
                this.f4575b.m35910e(i - 64, z);
                return;
            }
            long j = this.f4574a;
            if ((Long.MIN_VALUE & j) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            long j2 = (1 << i) - 1;
            this.f4574a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                m35907h(i);
            } else {
                m35914a(i);
            }
            if (z2 || this.f4575b != null) {
                m35912c();
                this.f4575b.m35910e(0, z2);
            }
        }

        /* renamed from: f */
        boolean m35909f(int i) {
            boolean z;
            if (i >= 64) {
                m35912c();
                return this.f4575b.m35909f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f4574a;
            if ((j2 & j) != 0) {
                z = true;
            } else {
                z = false;
            }
            long j3 = j2 & (~j);
            this.f4574a = j3;
            long j4 = j - 1;
            this.f4574a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            C1728a c1728a = this.f4575b;
            if (c1728a != null) {
                if (c1728a.m35911d(0)) {
                    m35907h(63);
                }
                this.f4575b.m35909f(0);
            }
            return z;
        }

        /* renamed from: g */
        void m35908g() {
            this.f4574a = 0L;
            C1728a c1728a = this.f4575b;
            if (c1728a != null) {
                c1728a.m35908g();
            }
        }

        /* renamed from: h */
        void m35907h(int i) {
            if (i >= 64) {
                m35912c();
                this.f4575b.m35907h(i - 64);
                return;
            }
            this.f4574a |= 1 << i;
        }

        public String toString() {
            if (this.f4575b == null) {
                return Long.toBinaryString(this.f4574a);
            }
            return this.f4575b.toString() + "xx" + Long.toBinaryString(this.f4574a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.ChildHelper$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1729b {
        /* renamed from: a */
        void mo35598a(View view);

        /* renamed from: b */
        RecyclerView.ViewHolder mo35597b(View view);

        /* renamed from: c */
        void mo35596c(int i);

        /* renamed from: d */
        void mo35595d(View view, int i);

        /* renamed from: e */
        void mo35594e();

        /* renamed from: f */
        int mo35593f(View view);

        /* renamed from: g */
        void mo35592g(View view);

        View getChildAt(int i);

        int getChildCount();

        /* renamed from: h */
        void mo35591h(int i);

        /* renamed from: i */
        void mo35590i(View view, int i, ViewGroup.LayoutParams layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ChildHelper(InterfaceC1729b interfaceC1729b) {
        this.f4571a = interfaceC1729b;
    }

    /* renamed from: h */
    private int m35927h(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = this.f4571a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            int m35913b = i - (i2 - this.f4572b.m35913b(i2));
            if (m35913b == 0) {
                while (this.f4572b.m35911d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += m35913b;
        }
        return -1;
    }

    /* renamed from: l */
    private void m35923l(View view) {
        this.f4573c.add(view);
        this.f4571a.mo35598a(view);
    }

    /* renamed from: t */
    private boolean m35915t(View view) {
        if (this.f4573c.remove(view)) {
            this.f4571a.mo35592g(view);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m35934a(View view, int i, boolean z) {
        int m35927h;
        if (i < 0) {
            m35927h = this.f4571a.getChildCount();
        } else {
            m35927h = m35927h(i);
        }
        this.f4572b.m35910e(m35927h, z);
        if (z) {
            m35923l(view);
        }
        this.f4571a.mo35595d(view, m35927h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m35933b(View view, boolean z) {
        m35934a(view, -1, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m35932c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int m35927h;
        if (i < 0) {
            m35927h = this.f4571a.getChildCount();
        } else {
            m35927h = m35927h(i);
        }
        this.f4572b.m35910e(m35927h, z);
        if (z) {
            m35923l(view);
        }
        this.f4571a.mo35590i(view, m35927h, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m35931d(int i) {
        int m35927h = m35927h(i);
        this.f4572b.m35909f(m35927h);
        this.f4571a.mo35596c(m35927h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public View m35930e(int i) {
        int size = this.f4573c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f4573c.get(i2);
            RecyclerView.ViewHolder mo35597b = this.f4571a.mo35597b(view);
            if (mo35597b.getLayoutPosition() == i && !mo35597b.isInvalid() && !mo35597b.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public View m35929f(int i) {
        return this.f4571a.getChildAt(m35927h(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m35928g() {
        return this.f4571a.getChildCount() - this.f4573c.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public View m35926i(int i) {
        return this.f4571a.getChildAt(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m35925j() {
        return this.f4571a.getChildCount();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m35924k(View view) {
        int mo35593f = this.f4571a.mo35593f(view);
        if (mo35593f >= 0) {
            this.f4572b.m35907h(mo35593f);
            m35923l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int m35922m(View view) {
        int mo35593f = this.f4571a.mo35593f(view);
        if (mo35593f == -1 || this.f4572b.m35911d(mo35593f)) {
            return -1;
        }
        return mo35593f - this.f4572b.m35913b(mo35593f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean m35921n(View view) {
        return this.f4573c.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m35920o() {
        this.f4572b.m35908g();
        for (int size = this.f4573c.size() - 1; size >= 0; size--) {
            this.f4571a.mo35592g(this.f4573c.get(size));
            this.f4573c.remove(size);
        }
        this.f4571a.mo35594e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m35919p(View view) {
        int mo35593f = this.f4571a.mo35593f(view);
        if (mo35593f < 0) {
            return;
        }
        if (this.f4572b.m35909f(mo35593f)) {
            m35915t(view);
        }
        this.f4571a.mo35591h(mo35593f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m35918q(int i) {
        int m35927h = m35927h(i);
        View childAt = this.f4571a.getChildAt(m35927h);
        if (childAt == null) {
            return;
        }
        if (this.f4572b.m35909f(m35927h)) {
            m35915t(childAt);
        }
        this.f4571a.mo35591h(m35927h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean m35917r(View view) {
        int mo35593f = this.f4571a.mo35593f(view);
        if (mo35593f == -1) {
            m35915t(view);
            return true;
        } else if (this.f4572b.m35911d(mo35593f)) {
            this.f4572b.m35909f(mo35593f);
            m35915t(view);
            this.f4571a.mo35591h(mo35593f);
            return true;
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m35916s(View view) {
        int mo35593f = this.f4571a.mo35593f(view);
        if (mo35593f >= 0) {
            if (this.f4572b.m35911d(mo35593f)) {
                this.f4572b.m35914a(mo35593f);
                m35915t(view);
                return;
            }
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public String toString() {
        return this.f4572b.toString() + ", hidden list:" + this.f4573c.size();
    }
}
