package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* renamed from: com.google.android.material.datepicker.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
abstract class AbstractC4848p<S> extends Fragment {

    /* renamed from: j */
    protected final LinkedHashSet<AbstractC4847o<S>> f13524j = new LinkedHashSet<>();

    /* renamed from: d */
    public boolean mo27234d(AbstractC4847o<S> abstractC4847o) {
        return this.f13524j.add(abstractC4847o);
    }

    /* renamed from: e */
    public void m27233e() {
        this.f13524j.clear();
    }
}