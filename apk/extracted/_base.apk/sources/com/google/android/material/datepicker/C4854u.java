package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C4819h;
import java.util.Calendar;
import java.util.Locale;
import p155ia.C7486h;
import p155ia.C7487i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4854u extends RecyclerView.Adapter<C4856b> {

    /* renamed from: a */
    private final C4819h<?> f13530a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.u$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class View$OnClickListenerC4855a implements View.OnClickListener {

        /* renamed from: j */
        final /* synthetic */ int f13531j;

        View$OnClickListenerC4855a(int i) {
            this.f13531j = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C4854u.this.f13530a.m27297x(C4854u.this.f13530a.m27306o().m27348h(C4841l.m27264b(this.f13531j, C4854u.this.f13530a.m27304q().f13504k)));
            C4854u.this.f13530a.m27296y(C4819h.EnumC4830k.DAY);
        }
    }

    /* renamed from: com.google.android.material.datepicker.u$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4856b extends RecyclerView.ViewHolder {

        /* renamed from: j */
        final TextView f13533j;

        C4856b(TextView textView) {
            super(textView);
            this.f13533j = textView;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4854u(C4819h<?> c4819h) {
        this.f13530a = c4819h;
    }

    /* renamed from: b */
    private View.OnClickListener m27213b(int i) {
        return new View$OnClickListenerC4855a(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m27212c(int i) {
        return i - this.f13530a.m27306o().m27343x().f13505l;
    }

    /* renamed from: d */
    int m27211d(int i) {
        return this.f13530a.m27306o().m27343x().f13505l + i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: e */
    public void onBindViewHolder(C4856b c4856b, int i) {
        C4812b c4812b;
        int m27211d = m27211d(i);
        String string = c4856b.f13533j.getContext().getString(C7487i.f20258k);
        c4856b.f13533j.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(m27211d)));
        c4856b.f13533j.setContentDescription(String.format(string, Integer.valueOf(m27211d)));
        C4813c m27305p = this.f13530a.m27305p();
        Calendar m27219i = C4853t.m27219i();
        if (m27219i.get(1) == m27211d) {
            c4812b = m27305p.f13423f;
        } else {
            c4812b = m27305p.f13421d;
        }
        for (Long l : this.f13530a.m27303r().m27331I()) {
            m27219i.setTimeInMillis(l.longValue());
            if (m27219i.get(1) == m27211d) {
                c4812b = m27305p.f13422e;
            }
        }
        c4812b.m27334d(c4856b.f13533j);
        c4856b.f13533j.setOnClickListener(m27213b(m27211d));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f */
    public C4856b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C4856b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C7486h.f20245p, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f13530a.m27306o().m27342y();
    }
}
