package com.google.android.material.internal;

import android.widget.Checkable;
import com.google.android.material.internal.InterfaceC4897h;

/* renamed from: com.google.android.material.internal.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC4897h<T extends InterfaceC4897h<T>> extends Checkable {

    /* renamed from: com.google.android.material.internal.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4898a<C> {
        /* renamed from: a */
        void mo26974a(C c, boolean z);
    }

    int getId();

    void setInternalOnCheckedChangeListener(InterfaceC4898a<T> interfaceC4898a);
}