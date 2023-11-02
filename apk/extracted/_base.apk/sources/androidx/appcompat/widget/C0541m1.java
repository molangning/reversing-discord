package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.m1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
class C0541m1 extends C0502d1 {

    /* renamed from: b */
    private final WeakReference<Context> f1892b;

    public C0541m1(Context context, Resources resources) {
        super(resources);
        this.f1892b = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) {
        Drawable m39936a = m39936a(i);
        Context context = this.f1892b.get();
        if (m39936a != null && context != null) {
            C0492c1.m39959h().m39943x(context, i, m39936a);
        }
        return m39936a;
    }
}
