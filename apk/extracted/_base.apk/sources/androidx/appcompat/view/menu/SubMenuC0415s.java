package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p391w.InterfaceSubMenuC13353c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class SubMenuC0415s extends MenuC0409o implements SubMenu {

    /* renamed from: e */
    private final InterfaceSubMenuC13353c f1443e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SubMenuC0415s(Context context, InterfaceSubMenuC13353c interfaceSubMenuC13353c) {
        super(context, interfaceSubMenuC13353c);
        this.f1443e = interfaceSubMenuC13353c;
    }

    @Override // android.view.SubMenu
    public void clearHeader() {
        this.f1443e.clearHeader();
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return m40414c(this.f1443e.getItem());
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        this.f1443e.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        this.f1443e.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        this.f1443e.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.f1443e.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f1443e.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f1443e.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f1443e.setIcon(drawable);
        return this;
    }
}
