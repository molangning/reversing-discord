package com.google.android.material.appbar;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.internal.C4908m;
import p155ia.C7480b;
import p155ia.C7485g;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.appbar.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4754e {

    /* renamed from: a */
    private static final int[] f13060a = {16843848};

    /* renamed from: a */
    public static void m27846a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* renamed from: b */
    public static void m27845b(View view, float f) {
        int integer = view.getResources().getInteger(C7485g.f20227a);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{16842910, C7480b.f20092G, -C7480b.f20093H}, ObjectAnimator.ofFloat(view, ViewProps.ELEVATION, 0.0f).setDuration(j));
        stateListAnimator.addState(new int[]{16842910}, ObjectAnimator.ofFloat(view, ViewProps.ELEVATION, f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, ViewProps.ELEVATION, 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    /* renamed from: c */
    public static void m27844c(View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray m26945h = C4908m.m26945h(context, attributeSet, f13060a, i, i2, new int[0]);
        try {
            if (m26945h.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, m26945h.getResourceId(0, 0)));
            }
        } finally {
            m26945h.recycle();
        }
    }
}