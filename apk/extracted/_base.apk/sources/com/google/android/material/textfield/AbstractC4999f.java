package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: com.google.android.material.textfield.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
abstract class AbstractC4999f {

    /* renamed from: a */
    TextInputLayout f14074a;

    /* renamed from: b */
    Context f14075b;

    /* renamed from: c */
    CheckableImageButton f14076c;

    /* renamed from: d */
    final int f14077d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4999f(TextInputLayout textInputLayout, int i) {
        this.f14074a = textInputLayout;
        this.f14075b = textInputLayout.getContext();
        this.f14076c = textInputLayout.getEndIconView();
        this.f14077d = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo26568a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo26625b(int i) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo26624c(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo26623d() {
        return false;
    }
}
