package androidx.core.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: androidx.core.view.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC1228b {

    /* renamed from: a */
    private final Context f3642a;

    /* renamed from: b */
    private InterfaceC1229a f3643b;

    /* renamed from: c */
    private InterfaceC1230b f3644c;

    /* renamed from: androidx.core.view.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1229a {
    }

    /* renamed from: androidx.core.view.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1230b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public AbstractC1228b(Context context) {
        this.f3642a = context;
    }

    /* renamed from: a */
    public boolean mo37491a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo37490b() {
        return true;
    }

    /* renamed from: c */
    public abstract View mo37489c();

    /* renamed from: d */
    public View mo37488d(MenuItem menuItem) {
        return mo37489c();
    }

    /* renamed from: e */
    public boolean mo37487e() {
        return false;
    }

    /* renamed from: f */
    public void mo37486f(SubMenu subMenu) {
    }

    /* renamed from: g */
    public boolean mo37485g() {
        return false;
    }

    /* renamed from: h */
    public void m37484h() {
        this.f3644c = null;
        this.f3643b = null;
    }

    /* renamed from: i */
    public void m37483i(InterfaceC1229a interfaceC1229a) {
        this.f3643b = interfaceC1229a;
    }

    /* renamed from: j */
    public void mo37482j(InterfaceC1230b interfaceC1230b) {
        if (this.f3644c != null && interfaceC1230b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f3644c = interfaceC1230b;
    }
}