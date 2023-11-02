package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.material.datepicker.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4843m extends BaseAdapter {

    /* renamed from: o */
    static final int f13510o = C4853t.m27217k().getMaximum(4);

    /* renamed from: j */
    final C4841l f13511j;

    /* renamed from: k */
    final InterfaceC4814d<?> f13512k;

    /* renamed from: l */
    private Collection<Long> f13513l;

    /* renamed from: m */
    C4813c f13514m;

    /* renamed from: n */
    final C4808a f13515n;

    public C4843m(C4841l c4841l, InterfaceC4814d<?> interfaceC4814d, C4808a c4808a) {
        this.f13511j = c4841l;
        this.f13512k = interfaceC4814d;
        this.f13515n = c4808a;
        this.f13513l = interfaceC4814d.m27331I();
    }

    /* renamed from: e */
    private void m27251e(Context context) {
        if (this.f13514m == null) {
            this.f13514m = new C4813c(context);
        }
    }

    /* renamed from: h */
    private boolean m27248h(long j) {
        Iterator<Long> it = this.f13512k.m27331I().iterator();
        while (it.hasNext()) {
            if (C4853t.m27227a(j) == C4853t.m27227a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private void m27245k(TextView textView, long j) {
        C4812b c4812b;
        if (textView == null) {
            return;
        }
        if (this.f13515n.m27347j().mo27320p(j)) {
            textView.setEnabled(true);
            if (m27248h(j)) {
                c4812b = this.f13514m.f13419b;
            } else if (C4853t.m27219i().getTimeInMillis() == j) {
                c4812b = this.f13514m.f13420c;
            } else {
                c4812b = this.f13514m.f13418a;
            }
        } else {
            textView.setEnabled(false);
            c4812b = this.f13514m.f13424g;
        }
        c4812b.m27334d(textView);
    }

    /* renamed from: l */
    private void m27244l(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (C4841l.m27263d(j).equals(this.f13511j)) {
            m27245k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter2().m27255a(this.f13511j.m27259r(j)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    /* renamed from: a */
    public int m27255a(int i) {
        return m27254b() + (i - 1);
    }

    /* renamed from: b */
    public int m27254b() {
        return this.f13511j.m27261h();
    }

    @Override // android.widget.Adapter
    /* renamed from: c */
    public Long getItem(int i) {
        if (i >= this.f13511j.m27261h() && i <= m27247i()) {
            return Long.valueOf(this.f13511j.m27260k(m27246j(i)));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
    @Override // android.widget.Adapter
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.m27251e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = p155ia.C7486h.f20240k
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.m27254b()
            int r7 = r6 - r7
            if (r7 < 0) goto L75
            com.google.android.material.datepicker.l r8 = r5.f13511j
            int r2 = r8.f13507n
            if (r7 < r2) goto L2d
            goto L75
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.google.android.material.datepicker.l r8 = r5.f13511j
            long r7 = r8.m27260k(r7)
            com.google.android.material.datepicker.l r3 = r5.f13511j
            int r3 = r3.f13505l
            com.google.android.material.datepicker.l r4 = com.google.android.material.datepicker.C4841l.m27262e()
            int r4 = r4.f13505l
            if (r3 != r4) goto L67
            java.lang.String r7 = com.google.android.material.datepicker.C4815e.m27326a(r7)
            r0.setContentDescription(r7)
            goto L6e
        L67:
            java.lang.String r7 = com.google.android.material.datepicker.C4815e.m27323d(r7)
            r0.setContentDescription(r7)
        L6e:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L7d
        L75:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L7d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L84
            return r0
        L84:
            long r6 = r6.longValue()
            r5.m27245k(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C4843m.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* renamed from: f */
    public boolean m27250f(int i) {
        return i % this.f13511j.f13506m == 0;
    }

    /* renamed from: g */
    public boolean m27249g(int i) {
        return (i + 1) % this.f13511j.f13506m == 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f13511j.f13507n + m27254b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.f13511j.f13506m;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    /* renamed from: i */
    public int m27247i() {
        return (this.f13511j.m27261h() + this.f13511j.f13507n) - 1;
    }

    /* renamed from: j */
    int m27246j(int i) {
        return (i - this.f13511j.m27261h()) + 1;
    }

    /* renamed from: m */
    public void m27243m(MaterialCalendarGridView materialCalendarGridView) {
        for (Long l : this.f13513l) {
            m27244l(materialCalendarGridView, l.longValue());
        }
        InterfaceC4814d<?> interfaceC4814d = this.f13512k;
        if (interfaceC4814d != null) {
            for (Long l2 : interfaceC4814d.m27331I()) {
                m27244l(materialCalendarGridView, l2.longValue());
            }
            this.f13513l = this.f13512k.m27331I();
        }
    }

    /* renamed from: n */
    public boolean m27242n(int i) {
        return i >= m27254b() && i <= m27247i();
    }
}