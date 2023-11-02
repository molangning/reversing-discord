package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.C0389g;
import androidx.appcompat.view.menu.InterfaceC0405m;
import androidx.core.view.C1304n2;

/* renamed from: androidx.appcompat.widget.k0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public interface InterfaceC0534k0 {
    /* renamed from: a */
    boolean mo39754a();

    /* renamed from: b */
    boolean mo39753b();

    /* renamed from: c */
    boolean mo39752c();

    void collapseActionView();

    /* renamed from: d */
    void mo39751d(Menu menu, InterfaceC0405m.InterfaceC0406a interfaceC0406a);

    /* renamed from: e */
    boolean mo39750e();

    /* renamed from: f */
    void mo39749f();

    /* renamed from: g */
    boolean mo39748g();

    Context getContext();

    CharSequence getTitle();

    /* renamed from: h */
    boolean mo39747h();

    /* renamed from: i */
    void mo39746i(int i);

    /* renamed from: j */
    Menu mo39745j();

    /* renamed from: k */
    int mo39744k();

    /* renamed from: l */
    C1304n2 mo39743l(int i, long j);

    /* renamed from: m */
    ViewGroup mo39742m();

    /* renamed from: n */
    void mo39741n(boolean z);

    /* renamed from: o */
    void mo39740o();

    /* renamed from: p */
    void mo39739p(boolean z);

    /* renamed from: q */
    void mo39738q();

    /* renamed from: r */
    void mo39737r(C0514f1 c0514f1);

    /* renamed from: s */
    void mo39736s(int i);

    void setIcon(int i);

    void setIcon(Drawable drawable);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    /* renamed from: t */
    void mo39735t(InterfaceC0405m.InterfaceC0406a interfaceC0406a, C0389g.InterfaceC0390a interfaceC0390a);

    /* renamed from: u */
    int mo39734u();

    /* renamed from: v */
    void mo39733v();

    /* renamed from: w */
    void mo39732w(Drawable drawable);
}