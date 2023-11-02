package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.DialogC0255f;
import androidx.appcompat.view.ActionMode;
import androidx.core.view.C1352u;
import p052d.C5706a;

/* renamed from: androidx.appcompat.app.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class DialogC0335p extends DialogC0255f implements InterfaceC0297c {

    /* renamed from: l */
    private AppCompatDelegate f1083l;

    /* renamed from: m */
    private final C1352u.InterfaceC1353a f1084m;

    public DialogC0335p(Context context, int i) {
        super(context, m40567e(context, i));
        this.f1084m = new C1352u.InterfaceC1353a() { // from class: androidx.appcompat.app.o
            @Override // androidx.core.view.C1352u.InterfaceC1353a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return DialogC0335p.this.m40566f(keyEvent);
            }
        };
        AppCompatDelegate m40568d = m40568d();
        m40568d.mo40669R(m40567e(context, i));
        m40568d.mo40699A(null);
    }

    /* renamed from: e */
    private static int m40567e(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(C5706a.f16072z, typedValue, true);
            return typedValue.resourceId;
        }
        return i;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m40568d().mo40644e(view, layoutParams);
    }

    /* renamed from: d */
    public AppCompatDelegate m40568d() {
        if (this.f1083l == null) {
            this.f1083l = AppCompatDelegate.m40736k(this, this);
        }
        return this.f1083l;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        m40568d().mo40697B();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C1352u.m37282e(this.f1084m, getWindow().getDecorView(), this, keyEvent);
    }

    /* renamed from: f */
    public boolean m40566f(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) m40568d().mo40629l(i);
    }

    /* renamed from: g */
    public boolean m40565g(int i) {
        return m40568d().mo40683J(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m40568d().mo40611w();
    }

    @Override // androidx.activity.DialogC0255f, android.app.Dialog
    public void onCreate(Bundle bundle) {
        m40568d().mo40613v();
        super.onCreate(bundle);
        m40568d().mo40699A(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.DialogC0255f, android.app.Dialog
    public void onStop() {
        super.onStop();
        m40568d().mo40687G();
    }

    @Override // androidx.appcompat.app.InterfaceC0297c
    public void onSupportActionModeFinished(ActionMode actionMode) {
    }

    @Override // androidx.appcompat.app.InterfaceC0297c
    public void onSupportActionModeStarted(ActionMode actionMode) {
    }

    @Override // androidx.appcompat.app.InterfaceC0297c
    public ActionMode onWindowStartingSupportActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m40568d().mo40680L(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m40568d().mo40667S(charSequence);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m40568d().mo40678M(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m40568d().mo40676N(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        m40568d().mo40667S(getContext().getString(i));
    }
}