package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.menu.C0389g;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.view.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0361d extends ActionMode implements C0389g.InterfaceC0390a {

    /* renamed from: l */
    private Context f1146l;

    /* renamed from: m */
    private ActionBarContextView f1147m;

    /* renamed from: n */
    private ActionMode.Callback f1148n;

    /* renamed from: o */
    private WeakReference<View> f1149o;

    /* renamed from: p */
    private boolean f1150p;

    /* renamed from: q */
    private boolean f1151q;

    /* renamed from: r */
    private C0389g f1152r;

    public C0361d(Context context, ActionBarContextView actionBarContextView, ActionMode.Callback callback, boolean z) {
        this.f1146l = context;
        this.f1147m = actionBarContextView;
        this.f1148n = callback;
        C0389g m40380S = new C0389g(actionBarContextView.getContext()).m40380S(1);
        this.f1152r = m40380S;
        m40380S.mo40282R(this);
        this.f1151q = z;
    }

    @Override // androidx.appcompat.view.menu.C0389g.InterfaceC0390a
    /* renamed from: a */
    public boolean mo40035a(C0389g c0389g, MenuItem menuItem) {
        return this.f1148n.mo40463c(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0389g.InterfaceC0390a
    /* renamed from: b */
    public void mo40034b(C0389g c0389g) {
        mo40473k();
        this.f1147m.m40268l();
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: c */
    public void mo40479c() {
        if (this.f1150p) {
            return;
        }
        this.f1150p = true;
        this.f1148n.mo40465a(this);
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: d */
    public View mo40478d() {
        WeakReference<View> weakReference = this.f1149o;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: e */
    public Menu mo40477e() {
        return this.f1152r;
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: f */
    public MenuInflater mo40476f() {
        return new C0364f(this.f1147m.getContext());
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: g */
    public CharSequence mo40475g() {
        return this.f1147m.getSubtitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: i */
    public CharSequence mo40474i() {
        return this.f1147m.getTitle();
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: k */
    public void mo40473k() {
        this.f1148n.mo40462d(this, this.f1152r);
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: l */
    public boolean mo40472l() {
        return this.f1147m.m40270j();
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: m */
    public void mo40471m(View view) {
        WeakReference<View> weakReference;
        this.f1147m.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference<>(view);
        } else {
            weakReference = null;
        }
        this.f1149o = weakReference;
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: n */
    public void mo40470n(int i) {
        mo40469o(this.f1146l.getString(i));
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: o */
    public void mo40469o(CharSequence charSequence) {
        this.f1147m.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: q */
    public void mo40468q(int i) {
        mo40467r(this.f1146l.getString(i));
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: r */
    public void mo40467r(CharSequence charSequence) {
        this.f1147m.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.ActionMode
    /* renamed from: s */
    public void mo40466s(boolean z) {
        super.mo40466s(z);
        this.f1147m.setTitleOptional(z);
    }
}