package androidx.appcompat.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class ActionMode {

    /* renamed from: j */
    private Object f1137j;

    /* renamed from: k */
    private boolean f1138k;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface Callback {
        /* renamed from: a */
        void mo40465a(ActionMode actionMode);

        /* renamed from: b */
        boolean mo40464b(ActionMode actionMode, Menu menu);

        /* renamed from: c */
        boolean mo40463c(ActionMode actionMode, MenuItem menuItem);

        /* renamed from: d */
        boolean mo40462d(ActionMode actionMode, Menu menu);
    }

    /* renamed from: c */
    public abstract void mo40479c();

    /* renamed from: d */
    public abstract View mo40478d();

    /* renamed from: e */
    public abstract Menu mo40477e();

    /* renamed from: f */
    public abstract MenuInflater mo40476f();

    /* renamed from: g */
    public abstract CharSequence mo40475g();

    /* renamed from: h */
    public Object m40497h() {
        return this.f1137j;
    }

    /* renamed from: i */
    public abstract CharSequence mo40474i();

    /* renamed from: j */
    public boolean m40496j() {
        return this.f1138k;
    }

    /* renamed from: k */
    public abstract void mo40473k();

    /* renamed from: l */
    public boolean mo40472l() {
        return false;
    }

    /* renamed from: m */
    public abstract void mo40471m(View view);

    /* renamed from: n */
    public abstract void mo40470n(int i);

    /* renamed from: o */
    public abstract void mo40469o(CharSequence charSequence);

    /* renamed from: p */
    public void m40495p(Object obj) {
        this.f1137j = obj;
    }

    /* renamed from: q */
    public abstract void mo40468q(int i);

    /* renamed from: r */
    public abstract void mo40467r(CharSequence charSequence);

    /* renamed from: s */
    public void mo40466s(boolean z) {
        this.f1138k = z;
    }
}
