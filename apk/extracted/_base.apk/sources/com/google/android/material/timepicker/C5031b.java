package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: com.google.android.material.timepicker.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C5031b implements InputFilter {

    /* renamed from: a */
    private int f14178a;

    public C5031b(int i) {
        this.f14178a = i;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            StringBuilder sb2 = new StringBuilder(spanned);
            sb2.replace(i3, i4, charSequence.subSequence(i, i2).toString());
            if (Integer.parseInt(sb2.toString()) <= this.f14178a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
