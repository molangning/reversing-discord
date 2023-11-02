package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import p155ia.C7480b;
import p155ia.C7489k;
import p443ya.C13956b;
import p443ya.C13957c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.datepicker.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4813c {

    /* renamed from: a */
    final C4812b f13418a;

    /* renamed from: b */
    final C4812b f13419b;

    /* renamed from: c */
    final C4812b f13420c;

    /* renamed from: d */
    final C4812b f13421d;

    /* renamed from: e */
    final C4812b f13422e;

    /* renamed from: f */
    final C4812b f13423f;

    /* renamed from: g */
    final C4812b f13424g;

    /* renamed from: h */
    final Paint f13425h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4813c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C13956b.m1091d(context, C7480b.f20118u, C4819h.class.getCanonicalName()), C7489k.f20441T2);
        this.f13418a = C4812b.m27337a(context, obtainStyledAttributes.getResourceId(C7489k.f20465W2, 0));
        this.f13424g = C4812b.m27337a(context, obtainStyledAttributes.getResourceId(C7489k.f20449U2, 0));
        this.f13419b = C4812b.m27337a(context, obtainStyledAttributes.getResourceId(C7489k.f20457V2, 0));
        this.f13420c = C4812b.m27337a(context, obtainStyledAttributes.getResourceId(C7489k.f20472X2, 0));
        ColorStateList m1089a = C13957c.m1089a(context, obtainStyledAttributes, C7489k.f20479Y2);
        this.f13421d = C4812b.m27337a(context, obtainStyledAttributes.getResourceId(C7489k.f20494a3, 0));
        this.f13422e = C4812b.m27337a(context, obtainStyledAttributes.getResourceId(C7489k.f20486Z2, 0));
        this.f13423f = C4812b.m27337a(context, obtainStyledAttributes.getResourceId(C7489k.f20502b3, 0));
        Paint paint = new Paint();
        this.f13425h = paint;
        paint.setColor(m1089a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
