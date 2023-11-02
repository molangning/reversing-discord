package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import p155ia.C7480b;
import p155ia.C7488j;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class CircularProgressIndicator extends AbstractC4918a<C4930e> {

    /* renamed from: y */
    public static final int f13788y = C7488j.f20277n;

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7480b.f20104g);
    }

    /* renamed from: s */
    private void m26926s() {
        setIndeterminateDrawable(C4939j.m26837s(getContext(), (C4930e) this.f13790j));
        setProgressDrawable(C4931f.m26880u(getContext(), (C4930e) this.f13790j));
    }

    public int getIndicatorDirection() {
        return ((C4930e) this.f13790j).f13835i;
    }

    public int getIndicatorInset() {
        return ((C4930e) this.f13790j).f13834h;
    }

    public int getIndicatorSize() {
        return ((C4930e) this.f13790j).f13833g;
    }

    @Override // com.google.android.material.progressindicator.AbstractC4918a
    /* renamed from: r */
    public C4930e mo26917i(Context context, AttributeSet attributeSet) {
        return new C4930e(context, attributeSet);
    }

    public void setIndicatorDirection(int i) {
        ((C4930e) this.f13790j).f13835i = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        S s = this.f13790j;
        if (((C4930e) s).f13834h != i) {
            ((C4930e) s).f13834h = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int max = Math.max(i, getTrackThickness() * 2);
        S s = this.f13790j;
        if (((C4930e) s).f13833g != max) {
            ((C4930e) s).f13833g = max;
            ((C4930e) s).mo26883e();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC4918a
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((C4930e) this.f13790j).mo26883e();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, f13788y);
        m26926s();
    }
}