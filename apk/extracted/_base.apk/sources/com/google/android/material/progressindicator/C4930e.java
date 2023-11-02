package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.C4908m;
import p155ia.C7480b;
import p155ia.C7482d;
import p155ia.C7489k;
import p443ya.C13957c;

/* renamed from: com.google.android.material.progressindicator.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4930e extends AbstractC4923b {

    /* renamed from: g */
    public int f13833g;

    /* renamed from: h */
    public int f13834h;

    /* renamed from: i */
    public int f13835i;

    public C4930e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7480b.f20104g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.progressindicator.AbstractC4923b
    /* renamed from: e */
    public void mo26883e() {
    }

    public C4930e(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, CircularProgressIndicator.f13788y);
    }

    public C4930e(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C7482d.f20144O);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(C7482d.f20143N);
        TypedArray m26945h = C4908m.m26945h(context, attributeSet, C7489k.f20580l1, i, i2, new int[0]);
        this.f13833g = Math.max(C13957c.m1087c(context, m26945h, C7489k.f20604o1, dimensionPixelSize), this.f13808a * 2);
        this.f13834h = C13957c.m1087c(context, m26945h, C7489k.f20596n1, dimensionPixelSize2);
        this.f13835i = m26945h.getInt(C7489k.f20588m1, 0);
        m26945h.recycle();
        mo26883e();
    }
}
