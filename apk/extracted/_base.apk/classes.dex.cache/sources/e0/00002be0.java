package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: com.google.android.material.datepicker.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4839k<S> extends AbstractC4848p<S> {

    /* renamed from: k */
    private int f13499k;

    /* renamed from: l */
    private InterfaceC4814d<S> f13500l;

    /* renamed from: m */
    private C4808a f13501m;

    /* renamed from: com.google.android.material.datepicker.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4840a extends AbstractC4847o<S> {
        C4840a() {
            C4839k.this = r1;
        }

        @Override // com.google.android.material.datepicker.AbstractC4847o
        /* renamed from: a */
        public void mo27235a(S s) {
            Iterator<AbstractC4847o<S>> it = C4839k.this.f13524j.iterator();
            while (it.hasNext()) {
                it.next().mo27235a(s);
            }
        }
    }

    /* renamed from: f */
    public static <T> C4839k<T> m27269f(InterfaceC4814d<T> interfaceC4814d, int i, C4808a c4808a) {
        C4839k<T> c4839k = new C4839k<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("DATE_SELECTOR_KEY", interfaceC4814d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c4808a);
        c4839k.setArguments(bundle);
        return c4839k;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f13499k = bundle.getInt("THEME_RES_ID_KEY");
        this.f13500l = (InterfaceC4814d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f13501m = (C4808a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f13500l.m27333E(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f13499k)), viewGroup, bundle, this.f13501m, new C4840a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f13499k);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f13500l);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f13501m);
    }
}