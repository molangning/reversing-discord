package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.C0336q;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0500d;
import androidx.appcompat.widget.C0503e;
import androidx.appcompat.widget.C0506f;
import androidx.appcompat.widget.C0554q;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.C5004i;
import com.google.android.material.textview.MaterialTextView;
import la.C10102a;
import p422xa.C13774a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class MaterialComponentsViewInflater extends C0336q {
    @Override // androidx.appcompat.app.C0336q
    /* renamed from: c */
    protected C0500d mo26535c(Context context, AttributeSet attributeSet) {
        return new C5004i(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0336q
    /* renamed from: d */
    protected C0503e mo26534d(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0336q
    /* renamed from: e */
    protected C0506f mo26533e(Context context, AttributeSet attributeSet) {
        return new C10102a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0336q
    /* renamed from: k */
    protected C0554q mo26532k(Context context, AttributeSet attributeSet) {
        return new C13774a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0336q
    /* renamed from: o */
    protected AppCompatTextView mo26531o(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}