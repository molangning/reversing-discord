package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.C1936f;
import java.util.Locale;

/* renamed from: androidx.viewpager2.widget.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1934e extends RecyclerView.OnScrollListener {

    /* renamed from: a */
    private C1936f.AbstractC1945i f5342a;

    /* renamed from: b */
    private final C1936f f5343b;

    /* renamed from: c */
    private final RecyclerView f5344c;

    /* renamed from: d */
    private final LinearLayoutManager f5345d;

    /* renamed from: e */
    private int f5346e;

    /* renamed from: f */
    private int f5347f;

    /* renamed from: g */
    private C1935a f5348g;

    /* renamed from: h */
    private int f5349h;

    /* renamed from: i */
    private int f5350i;

    /* renamed from: j */
    private boolean f5351j;

    /* renamed from: k */
    private boolean f5352k;

    /* renamed from: l */
    private boolean f5353l;

    /* renamed from: m */
    private boolean f5354m;

    /* renamed from: androidx.viewpager2.widget.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1935a {

        /* renamed from: a */
        int f5355a;

        /* renamed from: b */
        float f5356b;

        /* renamed from: c */
        int f5357c;

        C1935a() {
        }

        /* renamed from: a */
        void m34943a() {
            this.f5355a = -1;
            this.f5356b = 0.0f;
            this.f5357c = 0;
        }
    }

    public C1934e(C1936f c1936f) {
        this.f5343b = c1936f;
        RecyclerView recyclerView = c1936f.f5371s;
        this.f5344c = recyclerView;
        this.f5345d = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f5348g = new C1935a();
        m34947l();
    }

    /* renamed from: a */
    private void m34958a(int i, float f, int i2) {
        C1936f.AbstractC1945i abstractC1945i = this.f5342a;
        if (abstractC1945i != null) {
            abstractC1945i.mo25155b(i, f, i2);
        }
    }

    /* renamed from: b */
    private void m34957b(int i) {
        C1936f.AbstractC1945i abstractC1945i = this.f5342a;
        if (abstractC1945i != null) {
            abstractC1945i.mo25154c(i);
        }
    }

    /* renamed from: c */
    private void m34956c(int i) {
        if ((this.f5346e == 3 && this.f5347f == 0) || this.f5347f == i) {
            return;
        }
        this.f5347f = i;
        C1936f.AbstractC1945i abstractC1945i = this.f5342a;
        if (abstractC1945i != null) {
            abstractC1945i.mo25156a(i);
        }
    }

    /* renamed from: d */
    private int m34955d() {
        return this.f5345d.m35820i2();
    }

    /* renamed from: i */
    private boolean m34950i() {
        int i = this.f5346e;
        return i == 1 || i == 4;
    }

    /* renamed from: l */
    private void m34947l() {
        this.f5346e = 0;
        this.f5347f = 0;
        this.f5348g.m34943a();
        this.f5349h = -1;
        this.f5350i = -1;
        this.f5351j = false;
        this.f5352k = false;
        this.f5354m = false;
        this.f5353l = false;
    }

    /* renamed from: n */
    private void m34945n(boolean z) {
        int i;
        this.f5354m = z;
        if (z) {
            i = 4;
        } else {
            i = 1;
        }
        this.f5346e = i;
        int i2 = this.f5350i;
        if (i2 != -1) {
            this.f5349h = i2;
            this.f5350i = -1;
        } else if (this.f5349h == -1) {
            this.f5349h = m34955d();
        }
        m34956c(1);
    }

    /* renamed from: o */
    private void m34944o() {
        boolean z;
        int top;
        float f;
        C1935a c1935a = this.f5348g;
        int m35820i2 = this.f5345d.m35820i2();
        c1935a.f5355a = m35820i2;
        if (m35820i2 == -1) {
            c1935a.m34943a();
            return;
        }
        View mo35749N = this.f5345d.mo35749N(m35820i2);
        if (mo35749N == null) {
            c1935a.m34943a();
            return;
        }
        int m35712l0 = this.f5345d.m35712l0(mo35749N);
        int m35700q0 = this.f5345d.m35700q0(mo35749N);
        int m35692t0 = this.f5345d.m35692t0(mo35749N);
        int m35741S = this.f5345d.m35741S(mo35749N);
        ViewGroup.LayoutParams layoutParams = mo35749N.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            m35712l0 += marginLayoutParams.leftMargin;
            m35700q0 += marginLayoutParams.rightMargin;
            m35692t0 += marginLayoutParams.topMargin;
            m35741S += marginLayoutParams.bottomMargin;
        }
        int height = mo35749N.getHeight() + m35692t0 + m35741S;
        int width = mo35749N.getWidth() + m35712l0 + m35700q0;
        if (this.f5345d.m35806w2() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            top = (mo35749N.getLeft() - m35712l0) - this.f5344c.getPaddingLeft();
            if (this.f5343b.m34939d()) {
                top = -top;
            }
            height = width;
        } else {
            top = (mo35749N.getTop() - m35692t0) - this.f5344c.getPaddingTop();
        }
        int i = -top;
        c1935a.f5357c = i;
        if (i < 0) {
            if (new C1929a(this.f5345d).m34965d()) {
                throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
            }
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(c1935a.f5357c)));
        }
        if (height == 0) {
            f = 0.0f;
        } else {
            f = i / height;
        }
        c1935a.f5356b = f;
    }

    /* renamed from: e */
    public double m34954e() {
        m34944o();
        C1935a c1935a = this.f5348g;
        return c1935a.f5355a + c1935a.f5356b;
    }

    /* renamed from: f */
    public int m34953f() {
        return this.f5347f;
    }

    /* renamed from: g */
    public boolean m34952g() {
        return this.f5354m;
    }

    /* renamed from: h */
    public boolean m34951h() {
        return this.f5347f == 0;
    }

    /* renamed from: j */
    public void m34949j() {
        this.f5353l = true;
    }

    /* renamed from: k */
    public void m34948k(int i, boolean z) {
        int i2;
        if (z) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        this.f5346e = i2;
        boolean z2 = false;
        this.f5354m = false;
        if (this.f5350i != i) {
            z2 = true;
        }
        this.f5350i = i;
        m34956c(2);
        if (z2) {
            m34957b(i);
        }
    }

    /* renamed from: m */
    public void m34946m(C1936f.AbstractC1945i abstractC1945i) {
        this.f5342a = abstractC1945i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        boolean z = true;
        if ((this.f5346e != 1 || this.f5347f != 1) && i == 1) {
            m34945n(false);
        } else if (m34950i() && i == 2) {
            if (this.f5352k) {
                m34956c(2);
                this.f5351j = true;
            }
        } else {
            if (m34950i() && i == 0) {
                m34944o();
                if (!this.f5352k) {
                    int i2 = this.f5348g.f5355a;
                    if (i2 != -1) {
                        m34958a(i2, 0.0f, 0);
                    }
                } else {
                    C1935a c1935a = this.f5348g;
                    if (c1935a.f5357c == 0) {
                        int i3 = this.f5349h;
                        int i4 = c1935a.f5355a;
                        if (i3 != i4) {
                            m34957b(i4);
                        }
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    m34956c(0);
                    m34947l();
                }
            }
            if (this.f5346e == 2 && i == 0 && this.f5353l) {
                m34944o();
                C1935a c1935a2 = this.f5348g;
                if (c1935a2.f5357c == 0) {
                    int i5 = this.f5350i;
                    int i6 = c1935a2.f5355a;
                    if (i5 != i6) {
                        if (i6 == -1) {
                            i6 = 0;
                        }
                        m34957b(i6);
                    }
                    m34956c(0);
                    m34947l();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x001d, code lost:
        if (r5 == r3.f5343b.m34939d()) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0039  */
    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onScrolled(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f5352k = r4
            r3.m34944o()
            boolean r0 = r3.f5351j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L3d
            r3.f5351j = r2
            if (r6 > 0) goto L22
            if (r6 != 0) goto L20
            if (r5 >= 0) goto L16
            r5 = r4
            goto L17
        L16:
            r5 = r2
        L17:
            androidx.viewpager2.widget.f r6 = r3.f5343b
            boolean r6 = r6.m34939d()
            if (r5 != r6) goto L20
            goto L22
        L20:
            r5 = r2
            goto L23
        L22:
            r5 = r4
        L23:
            if (r5 == 0) goto L2f
            androidx.viewpager2.widget.e$a r5 = r3.f5348g
            int r6 = r5.f5357c
            if (r6 == 0) goto L2f
            int r5 = r5.f5355a
            int r5 = r5 + r4
            goto L33
        L2f:
            androidx.viewpager2.widget.e$a r5 = r3.f5348g
            int r5 = r5.f5355a
        L33:
            r3.f5350i = r5
            int r6 = r3.f5349h
            if (r6 == r5) goto L4b
            r3.m34957b(r5)
            goto L4b
        L3d:
            int r5 = r3.f5346e
            if (r5 != 0) goto L4b
            androidx.viewpager2.widget.e$a r5 = r3.f5348g
            int r5 = r5.f5355a
            if (r5 != r1) goto L48
            r5 = r2
        L48:
            r3.m34957b(r5)
        L4b:
            androidx.viewpager2.widget.e$a r5 = r3.f5348g
            int r6 = r5.f5355a
            if (r6 != r1) goto L52
            r6 = r2
        L52:
            float r0 = r5.f5356b
            int r5 = r5.f5357c
            r3.m34958a(r6, r0, r5)
            androidx.viewpager2.widget.e$a r5 = r3.f5348g
            int r6 = r5.f5355a
            int r0 = r3.f5350i
            if (r6 == r0) goto L63
            if (r0 != r1) goto L71
        L63:
            int r5 = r5.f5357c
            if (r5 != 0) goto L71
            int r5 = r3.f5347f
            if (r5 == r4) goto L71
            r3.m34956c(r2)
            r3.m34947l()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.C1934e.onScrolled(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}