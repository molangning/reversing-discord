package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
import p155ia.C7486h;
import p155ia.C7487i;

/* renamed from: com.google.android.material.datepicker.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C4818g extends BaseAdapter {

    /* renamed from: m */
    private static final int f13427m;

    /* renamed from: j */
    private final Calendar f13428j;

    /* renamed from: k */
    private final int f13429k;

    /* renamed from: l */
    private final int f13430l;

    static {
        f13427m = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public C4818g() {
        Calendar m27217k = C4853t.m27217k();
        this.f13428j = m27217k;
        this.f13429k = m27217k.getMaximum(7);
        this.f13430l = m27217k.getFirstDayOfWeek();
    }

    /* renamed from: b */
    private int m27316b(int i) {
        int i2 = i + this.f13430l;
        int i3 = this.f13429k;
        if (i2 > i3) {
            return i2 - i3;
        }
        return i2;
    }

    @Override // android.widget.Adapter
    /* renamed from: a */
    public Integer getItem(int i) {
        if (i >= this.f13429k) {
            return null;
        }
        return Integer.valueOf(m27316b(i));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f13429k;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C7486h.f20241l, viewGroup, false);
        }
        this.f13428j.set(7, m27316b(i));
        textView.setText(this.f13428j.getDisplayName(7, f13427m, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C7487i.f20257j), this.f13428j.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
