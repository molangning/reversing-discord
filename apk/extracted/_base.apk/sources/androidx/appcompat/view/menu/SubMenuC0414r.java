package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0389g;

/* renamed from: androidx.appcompat.view.menu.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class SubMenuC0414r extends C0389g implements SubMenu {

    /* renamed from: B */
    private C0389g f1441B;

    /* renamed from: C */
    private C0393i f1442C;

    public SubMenuC0414r(Context context, C0389g c0389g, C0393i c0393i) {
        super(context);
        this.f1441B = c0389g;
        this.f1442C = c0393i;
    }

    @Override // androidx.appcompat.view.menu.C0389g
    /* renamed from: D */
    public C0389g mo40286D() {
        return this.f1441B.mo40286D();
    }

    @Override // androidx.appcompat.view.menu.C0389g
    /* renamed from: F */
    public boolean mo40285F() {
        return this.f1441B.mo40285F();
    }

    @Override // androidx.appcompat.view.menu.C0389g
    /* renamed from: G */
    public boolean mo40284G() {
        return this.f1441B.mo40284G();
    }

    @Override // androidx.appcompat.view.menu.C0389g
    /* renamed from: H */
    public boolean mo40283H() {
        return this.f1441B.mo40283H();
    }

    @Override // androidx.appcompat.view.menu.C0389g
    /* renamed from: R */
    public void mo40282R(C0389g.InterfaceC0390a interfaceC0390a) {
        this.f1441B.mo40282R(interfaceC0390a);
    }

    /* renamed from: e0 */
    public Menu m40281e0() {
        return this.f1441B;
    }

    @Override // androidx.appcompat.view.menu.C0389g
    /* renamed from: f */
    public boolean mo40280f(C0393i c0393i) {
        return this.f1441B.mo40280f(c0393i);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f1442C;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.view.menu.C0389g
    /* renamed from: h */
    public boolean mo40279h(C0389g c0389g, MenuItem menuItem) {
        if (!super.mo40279h(c0389g, menuItem) && !this.f1441B.mo40279h(c0389g, menuItem)) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.C0389g
    /* renamed from: k */
    public boolean mo40278k(C0393i c0393i) {
        return this.f1441B.mo40278k(c0393i);
    }

    @Override // androidx.appcompat.view.menu.C0389g, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f1441B.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.m40377V(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.m40374Y(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.m40373Z(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f1442C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.C0389g, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f1441B.setQwertyMode(z);
    }

    @Override // androidx.appcompat.view.menu.C0389g
    /* renamed from: t */
    public String mo40277t() {
        int i;
        C0393i c0393i = this.f1442C;
        if (c0393i != null) {
            i = c0393i.getItemId();
        } else {
            i = 0;
        }
        if (i == 0) {
            return null;
        }
        return super.mo40277t() + ":" + i;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.m40378U(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.m40375X(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f1442C.setIcon(i);
        return this;
    }
}
