package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.util.C1138f;
import androidx.core.view.C1365w0;
import bb.C2232g;
import bb.C2239k;
import p155ia.C7489k;
import p443ya.C13957c;

/* renamed from: com.google.android.material.datepicker.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C4812b {

    /* renamed from: a */
    private final Rect f13412a;

    /* renamed from: b */
    private final ColorStateList f13413b;

    /* renamed from: c */
    private final ColorStateList f13414c;

    /* renamed from: d */
    private final ColorStateList f13415d;

    /* renamed from: e */
    private final int f13416e;

    /* renamed from: f */
    private final C2239k f13417f;

    private C4812b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C2239k c2239k, Rect rect) {
        C1138f.m37827c(rect.left);
        C1138f.m37827c(rect.top);
        C1138f.m37827c(rect.right);
        C1138f.m37827c(rect.bottom);
        this.f13412a = rect;
        this.f13413b = colorStateList2;
        this.f13414c = colorStateList;
        this.f13415d = colorStateList3;
        this.f13416e = i;
        this.f13417f = c2239k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C4812b m27337a(Context context, int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        C1138f.m37829a(z, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C7489k.f20510c3);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(C7489k.f20518d3, 0), obtainStyledAttributes.getDimensionPixelOffset(C7489k.f20534f3, 0), obtainStyledAttributes.getDimensionPixelOffset(C7489k.f20526e3, 0), obtainStyledAttributes.getDimensionPixelOffset(C7489k.f20542g3, 0));
        ColorStateList m1089a = C13957c.m1089a(context, obtainStyledAttributes, C7489k.f20550h3);
        ColorStateList m1089a2 = C13957c.m1089a(context, obtainStyledAttributes, C7489k.f20590m3);
        ColorStateList m1089a3 = C13957c.m1089a(context, obtainStyledAttributes, C7489k.f20574k3);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C7489k.f20582l3, 0);
        C2239k m33831m = C2239k.m33873b(context, obtainStyledAttributes.getResourceId(C7489k.f20558i3, 0), obtainStyledAttributes.getResourceId(C7489k.f20566j3, 0)).m33831m();
        obtainStyledAttributes.recycle();
        return new C4812b(m1089a, m1089a2, m1089a3, dimensionPixelSize, m33831m, rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m27336b() {
        return this.f13412a.bottom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m27335c() {
        return this.f13412a.top;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m27334d(TextView textView) {
        C2232g c2232g = new C2232g();
        C2232g c2232g2 = new C2232g();
        c2232g.setShapeAppearanceModel(this.f13417f);
        c2232g2.setShapeAppearanceModel(this.f13417f);
        c2232g.m33919Y(this.f13414c);
        c2232g.m33907f0(this.f13416e, this.f13415d);
        textView.setTextColor(this.f13413b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f13413b.withAlpha(30), c2232g, c2232g2);
        Rect rect = this.f13412a;
        C1365w0.m37177u0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
