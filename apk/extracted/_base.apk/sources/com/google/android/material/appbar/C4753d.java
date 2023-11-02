package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.C1365w0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.appbar.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4753d {

    /* renamed from: a */
    private final View f13053a;

    /* renamed from: b */
    private int f13054b;

    /* renamed from: c */
    private int f13055c;

    /* renamed from: d */
    private int f13056d;

    /* renamed from: e */
    private int f13057e;

    /* renamed from: f */
    private boolean f13058f = true;

    /* renamed from: g */
    private boolean f13059g = true;

    public C4753d(View view) {
        this.f13053a = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m27851a() {
        View view = this.f13053a;
        C1365w0.m37215b0(view, this.f13056d - (view.getTop() - this.f13054b));
        View view2 = this.f13053a;
        C1365w0.m37217a0(view2, this.f13057e - (view2.getLeft() - this.f13055c));
    }

    /* renamed from: b */
    public int m27850b() {
        return this.f13056d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m27849c() {
        this.f13054b = this.f13053a.getTop();
        this.f13055c = this.f13053a.getLeft();
    }

    /* renamed from: d */
    public boolean m27848d(int i) {
        if (this.f13059g && this.f13057e != i) {
            this.f13057e = i;
            m27851a();
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean m27847e(int i) {
        if (this.f13058f && this.f13056d != i) {
            this.f13056d = i;
            m27851a();
            return true;
        }
        return false;
    }
}
