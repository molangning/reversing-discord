package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.util.C1136d;
import java.util.Collection;

/* renamed from: com.google.android.material.datepicker.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC4814d<S> extends Parcelable {
    /* renamed from: E */
    View m27333E(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, C4808a c4808a, AbstractC4847o<S> abstractC4847o);

    /* renamed from: F */
    boolean m27332F();

    /* renamed from: I */
    Collection<Long> m27331I();

    /* renamed from: S */
    void m27330S(long j);

    S getSelection();

    /* renamed from: o */
    int m27329o(Context context);

    /* renamed from: v */
    String m27328v(Context context);

    /* renamed from: w */
    Collection<C1136d<Long, Long>> m27327w();
}