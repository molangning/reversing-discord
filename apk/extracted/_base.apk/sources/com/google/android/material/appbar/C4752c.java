package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.appbar.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4752c<V extends View> extends CoordinatorLayout.AbstractC0682c<V> {

    /* renamed from: a */
    private C4753d f13050a;

    /* renamed from: b */
    private int f13051b;

    /* renamed from: c */
    private int f13052c;

    public C4752c() {
        this.f13051b = 0;
        this.f13052c = 0;
    }

    /* renamed from: E */
    public int mo27854E() {
        C4753d c4753d = this.f13050a;
        if (c4753d != null) {
            return c4753d.m27850b();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F */
    public void mo27853F(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.m39225C(v, i);
    }

    /* renamed from: G */
    public boolean mo27852G(int i) {
        C4753d c4753d = this.f13050a;
        if (c4753d != null) {
            return c4753d.m27847e(i);
        }
        this.f13051b = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0682c
    /* renamed from: l */
    public boolean mo26481l(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo27853F(coordinatorLayout, v, i);
        if (this.f13050a == null) {
            this.f13050a = new C4753d(v);
        }
        this.f13050a.m27849c();
        this.f13050a.m27851a();
        int i2 = this.f13051b;
        if (i2 != 0) {
            this.f13050a.m27847e(i2);
            this.f13051b = 0;
        }
        int i3 = this.f13052c;
        if (i3 != 0) {
            this.f13050a.m27848d(i3);
            this.f13052c = 0;
            return true;
        }
        return true;
    }

    public C4752c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13051b = 0;
        this.f13052c = 0;
    }
}
