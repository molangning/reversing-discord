package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.C4908m;
import p155ia.C7480b;
import p155ia.C7482d;
import p155ia.C7489k;
import p443ya.C13957c;
import pa.C11487a;

/* renamed from: com.google.android.material.progressindicator.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC4923b {

    /* renamed from: a */
    public int f13808a;

    /* renamed from: b */
    public int f13809b;

    /* renamed from: c */
    public int[] f13810c = new int[0];

    /* renamed from: d */
    public int f13811d;

    /* renamed from: e */
    public int f13812e;

    /* renamed from: f */
    public int f13813f;

    public AbstractC4923b(Context context, AttributeSet attributeSet, int i, int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C7482d.f20145P);
        TypedArray m26945h = C4908m.m26945h(context, attributeSet, C7489k.f20318E, i, i2, new int[0]);
        this.f13808a = C13957c.m1087c(context, m26945h, C7489k.f20382M, dimensionPixelSize);
        this.f13809b = Math.min(C13957c.m1087c(context, m26945h, C7489k.f20374L, 0), this.f13808a / 2);
        this.f13812e = m26945h.getInt(C7489k.f20350I, 0);
        this.f13813f = m26945h.getInt(C7489k.f20326F, 0);
        m26905c(context, m26945h);
        m26904d(context, m26945h);
        m26945h.recycle();
    }

    /* renamed from: c */
    private void m26905c(Context context, TypedArray typedArray) {
        int i = C7489k.f20334G;
        if (!typedArray.hasValue(i)) {
            this.f13810c = new int[]{C11487a.m8018b(context, C7480b.f20108k, -1)};
        } else if (typedArray.peekValue(i).type != 1) {
            this.f13810c = new int[]{typedArray.getColor(i, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i, -1));
            this.f13810c = intArray;
            if (intArray.length != 0) {
                return;
            }
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    /* renamed from: d */
    private void m26904d(Context context, TypedArray typedArray) {
        int i = C7489k.f20366K;
        if (typedArray.hasValue(i)) {
            this.f13811d = typedArray.getColor(i, -1);
            return;
        }
        this.f13811d = this.f13810c[0];
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842803});
        float f = obtainStyledAttributes.getFloat(0, 0.2f);
        obtainStyledAttributes.recycle();
        this.f13811d = C11487a.m8019a(this.f13811d, (int) (f * 255.0f));
    }

    /* renamed from: a */
    public boolean m26907a() {
        return this.f13813f != 0;
    }

    /* renamed from: b */
    public boolean m26906b() {
        return this.f13812e != 0;
    }

    /* renamed from: e */
    public abstract void mo26883e();
}