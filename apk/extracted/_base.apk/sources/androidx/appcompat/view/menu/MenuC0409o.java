package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p391w.InterfaceMenuC13351a;

/* renamed from: androidx.appcompat.view.menu.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class MenuC0409o extends AbstractC0379c implements Menu {

    /* renamed from: d */
    private final InterfaceMenuC13351a f1417d;

    public MenuC0409o(Context context, InterfaceMenuC13351a interfaceMenuC13351a) {
        super(context);
        if (interfaceMenuC13351a != null) {
            this.f1417d = interfaceMenuC13351a;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m40414c(this.f1417d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = this.f1417d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = m40414c(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return m40413d(this.f1417d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        m40412e();
        this.f1417d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f1417d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return m40414c(this.f1417d.findItem(i));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return m40414c(this.f1417d.getItem(i));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f1417d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f1417d.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return this.f1417d.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f1417d.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        m40411f(i);
        this.f1417d.removeGroup(i);
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m40410g(i);
        this.f1417d.removeItem(i);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f1417d.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        this.f1417d.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        this.f1417d.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f1417d.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1417d.size();
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m40414c(this.f1417d.add(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return m40413d(this.f1417d.addSubMenu(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m40414c(this.f1417d.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return m40413d(this.f1417d.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m40414c(this.f1417d.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return m40413d(this.f1417d.addSubMenu(i, i2, i3, i4));
    }
}
