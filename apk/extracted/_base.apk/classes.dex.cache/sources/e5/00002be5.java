package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.C1365w0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C4819h;
import p155ia.C7484f;
import p155ia.C7486h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4844n extends RecyclerView.Adapter<C4846b> {

    /* renamed from: a */
    private final C4808a f13516a;

    /* renamed from: b */
    private final InterfaceC4814d<?> f13517b;

    /* renamed from: c */
    private final C4819h.InterfaceC4831l f13518c;

    /* renamed from: d */
    private final int f13519d;

    /* renamed from: com.google.android.material.datepicker.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4845a implements AdapterView.OnItemClickListener {

        /* renamed from: j */
        final /* synthetic */ MaterialCalendarGridView f13520j;

        C4845a(MaterialCalendarGridView materialCalendarGridView) {
            C4844n.this = r1;
            this.f13520j = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f13520j.getAdapter2().m27242n(i)) {
                C4844n.this.f13518c.mo27293a(this.f13520j.getAdapter2().getItem(i).longValue());
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.n$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4846b extends RecyclerView.ViewHolder {

        /* renamed from: j */
        final TextView f13522j;

        /* renamed from: k */
        final MaterialCalendarGridView f13523k;

        C4846b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C7484f.f20219s);
            this.f13522j = textView;
            C1365w0.m37183r0(textView, true);
            this.f13523k = (MaterialCalendarGridView) linearLayout.findViewById(C7484f.f20215o);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    public C4844n(Context context, InterfaceC4814d<?> interfaceC4814d, C4808a c4808a, C4819h.InterfaceC4831l interfaceC4831l) {
        int i;
        C4841l m27343x = c4808a.m27343x();
        C4841l m27346k = c4808a.m27346k();
        C4841l m27344u = c4808a.m27344u();
        if (m27343x.compareTo(m27344u) <= 0) {
            if (m27344u.compareTo(m27346k) <= 0) {
                int m27302s = C4843m.f13510o * C4819h.m27302s(context);
                if (C4832i.m27276t(context)) {
                    i = C4819h.m27302s(context);
                } else {
                    i = 0;
                }
                this.f13519d = m27302s + i;
                this.f13516a = c4808a;
                this.f13517b = interfaceC4814d;
                this.f13518c = interfaceC4831l;
                setHasStableIds(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    /* renamed from: b */
    public C4841l m27240b(int i) {
        return this.f13516a.m27343x().m27267G(i);
    }

    /* renamed from: c */
    public CharSequence m27239c(int i) {
        return m27240b(i).m27258z();
    }

    /* renamed from: d */
    public int m27238d(C4841l c4841l) {
        return this.f13516a.m27343x().m27266H(c4841l);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: e */
    public void onBindViewHolder(C4846b c4846b, int i) {
        C4841l m27267G = this.f13516a.m27343x().m27267G(i);
        c4846b.f13522j.setText(m27267G.m27258z());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c4846b.f13523k.findViewById(C7484f.f20215o);
        if (materialCalendarGridView.getAdapter2() != null && m27267G.equals(materialCalendarGridView.getAdapter2().f13511j)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter2().m27243m(materialCalendarGridView);
        } else {
            C4843m c4843m = new C4843m(m27267G, this.f13517b, this.f13516a);
            materialCalendarGridView.setNumColumns(m27267G.f13506m);
            materialCalendarGridView.setAdapter((ListAdapter) c4843m);
        }
        materialCalendarGridView.setOnItemClickListener(new C4845a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f */
    public C4846b onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C7486h.f20243n, viewGroup, false);
        if (C4832i.m27276t(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.C1772i(-1, this.f13519d));
            return new C4846b(linearLayout, true);
        }
        return new C4846b(linearLayout, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f13516a.m27345r();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return this.f13516a.m27343x().m27267G(i).m27268A();
    }
}