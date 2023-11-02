package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class NestedScrollingParentHelper {

    /* renamed from: a */
    private int f3538a;

    /* renamed from: b */
    private int f3539b;

    public NestedScrollingParentHelper(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int m37751a() {
        return this.f3538a | this.f3539b;
    }

    /* renamed from: b */
    public void m37750b(View view, View view2, int i) {
        m37749c(view, view2, i, 0);
    }

    /* renamed from: c */
    public void m37749c(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f3539b = i;
        } else {
            this.f3538a = i;
        }
    }

    /* renamed from: d */
    public void m37748d(View view) {
        m37747e(view, 0);
    }

    /* renamed from: e */
    public void m37747e(View view, int i) {
        if (i == 1) {
            this.f3539b = 0;
        } else {
            this.f3538a = 0;
        }
    }
}