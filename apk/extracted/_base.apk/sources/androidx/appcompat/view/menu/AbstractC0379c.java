package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.collection.SimpleArrayMap;
import p391w.InterfaceMenuItemC13352b;
import p391w.InterfaceSubMenuC13353c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.view.menu.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AbstractC0379c {

    /* renamed from: a */
    final Context f1272a;

    /* renamed from: b */
    private SimpleArrayMap<InterfaceMenuItemC13352b, MenuItem> f1273b;

    /* renamed from: c */
    private SimpleArrayMap<InterfaceSubMenuC13353c, SubMenu> f1274c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC0379c(Context context) {
        this.f1272a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final MenuItem m40414c(MenuItem menuItem) {
        if (menuItem instanceof InterfaceMenuItemC13352b) {
            InterfaceMenuItemC13352b interfaceMenuItemC13352b = (InterfaceMenuItemC13352b) menuItem;
            if (this.f1273b == null) {
                this.f1273b = new SimpleArrayMap<>();
            }
            MenuItem menuItem2 = this.f1273b.get(interfaceMenuItemC13352b);
            if (menuItem2 == null) {
                MenuItemC0395j menuItemC0395j = new MenuItemC0395j(this.f1272a, interfaceMenuItemC13352b);
                this.f1273b.put(interfaceMenuItemC13352b, menuItemC0395j);
                return menuItemC0395j;
            }
            return menuItem2;
        }
        return menuItem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final SubMenu m40413d(SubMenu subMenu) {
        if (subMenu instanceof InterfaceSubMenuC13353c) {
            InterfaceSubMenuC13353c interfaceSubMenuC13353c = (InterfaceSubMenuC13353c) subMenu;
            if (this.f1274c == null) {
                this.f1274c = new SimpleArrayMap<>();
            }
            SubMenu subMenu2 = this.f1274c.get(interfaceSubMenuC13353c);
            if (subMenu2 == null) {
                SubMenuC0415s subMenuC0415s = new SubMenuC0415s(this.f1272a, interfaceSubMenuC13353c);
                this.f1274c.put(interfaceSubMenuC13353c, subMenuC0415s);
                return subMenuC0415s;
            }
            return subMenu2;
        }
        return subMenu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m40412e() {
        SimpleArrayMap<InterfaceMenuItemC13352b, MenuItem> simpleArrayMap = this.f1273b;
        if (simpleArrayMap != null) {
            simpleArrayMap.clear();
        }
        SimpleArrayMap<InterfaceSubMenuC13353c, SubMenu> simpleArrayMap2 = this.f1274c;
        if (simpleArrayMap2 != null) {
            simpleArrayMap2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final void m40411f(int i) {
        if (this.f1273b == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.f1273b.size()) {
            if (this.f1273b.m39525j(i2).getGroupId() == i) {
                this.f1273b.m39523l(i2);
                i2--;
            }
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final void m40410g(int i) {
        if (this.f1273b == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f1273b.size(); i2++) {
            if (this.f1273b.m39525j(i2).getItemId() == i) {
                this.f1273b.m39523l(i2);
                return;
            }
        }
    }
}
