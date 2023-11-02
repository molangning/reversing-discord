package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.textfield.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC4999f {

    /* renamed from: a */
    TextInputLayout f14074a;

    /* renamed from: b */
    Context f14075b;

    /* renamed from: c */
    CheckableImageButton f14076c;

    /* renamed from: d */
    final int f14077d;

    public AbstractC4999f(TextInputLayout textInputLayout, int i) {
        this.f14074a = textInputLayout;
        this.f14075b = textInputLayout.getContext();
        this.f14076c = textInputLayout.getEndIconView();
        this.f14077d = i;
    }

    /* renamed from: a */
    public abstract void mo26568a();

    /* renamed from: b */
    public boolean mo26625b(int i) {
        return true;
    }

    /* renamed from: c */
    public void mo26624c(boolean z) {
    }

    /* renamed from: d */
    public boolean mo26623d() {
        return false;
    }
}