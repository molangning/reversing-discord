package com.google.android.flexbox;

import android.view.View;
import com.facebook.react.uimanager.ViewDefaults;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.flexbox.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4584c {

    /* renamed from: e */
    int f12521e;

    /* renamed from: f */
    int f12522f;

    /* renamed from: g */
    int f12523g;

    /* renamed from: h */
    int f12524h;

    /* renamed from: i */
    int f12525i;

    /* renamed from: j */
    float f12526j;

    /* renamed from: k */
    float f12527k;

    /* renamed from: l */
    int f12528l;

    /* renamed from: m */
    int f12529m;

    /* renamed from: o */
    int f12531o;

    /* renamed from: p */
    int f12532p;

    /* renamed from: q */
    boolean f12533q;

    /* renamed from: r */
    boolean f12534r;

    /* renamed from: a */
    int f12517a = ViewDefaults.NUMBER_OF_LINES;

    /* renamed from: b */
    int f12518b = ViewDefaults.NUMBER_OF_LINES;

    /* renamed from: c */
    int f12519c = Integer.MIN_VALUE;

    /* renamed from: d */
    int f12520d = Integer.MIN_VALUE;

    /* renamed from: n */
    List<Integer> f12530n = new ArrayList();

    /* renamed from: a */
    public int m28391a() {
        return this.f12523g;
    }

    /* renamed from: b */
    public int m28390b() {
        return this.f12524h;
    }

    /* renamed from: c */
    public int m28389c() {
        return this.f12524h - this.f12525i;
    }

    /* renamed from: d */
    public void m28388d(View view, int i, int i2, int i3, int i4) {
        InterfaceC4583b interfaceC4583b = (InterfaceC4583b) view.getLayoutParams();
        this.f12517a = Math.min(this.f12517a, (view.getLeft() - interfaceC4583b.mo28404D()) - i);
        this.f12518b = Math.min(this.f12518b, (view.getTop() - interfaceC4583b.mo28397l()) - i2);
        this.f12519c = Math.max(this.f12519c, view.getRight() + interfaceC4583b.mo28403K() + i3);
        this.f12520d = Math.max(this.f12520d, view.getBottom() + interfaceC4583b.mo28405C() + i4);
    }
}