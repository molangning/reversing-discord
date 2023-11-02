package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.InterfaceC0358b;
import androidx.core.view.AbstractC1228b;
import java.lang.reflect.Method;
import p391w.InterfaceMenuItemC13352b;

/* renamed from: androidx.appcompat.view.menu.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class MenuItemC0395j extends AbstractC0379c implements MenuItem {

    /* renamed from: d */
    private final InterfaceMenuItemC13352b f1392d;

    /* renamed from: e */
    private Method f1393e;

    /* renamed from: androidx.appcompat.view.menu.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private class C0396a extends AbstractC1228b {

        /* renamed from: d */
        final ActionProvider f1394d;

        C0396a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f1394d = actionProvider;
        }

        @Override // androidx.core.view.AbstractC1228b
        /* renamed from: a */
        public boolean mo37491a() {
            return this.f1394d.hasSubMenu();
        }

        @Override // androidx.core.view.AbstractC1228b
        /* renamed from: c */
        public View mo37489c() {
            return this.f1394d.onCreateActionView();
        }

        @Override // androidx.core.view.AbstractC1228b
        /* renamed from: e */
        public boolean mo37487e() {
            return this.f1394d.onPerformDefaultAction();
        }

        @Override // androidx.core.view.AbstractC1228b
        /* renamed from: f */
        public void mo37486f(SubMenu subMenu) {
            this.f1394d.onPrepareSubMenu(MenuItemC0395j.this.m40413d(subMenu));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private class ActionProvider$VisibilityListenerC0397b extends C0396a implements ActionProvider.VisibilityListener {

        /* renamed from: f */
        private AbstractC1228b.InterfaceC1230b f1396f;

        ActionProvider$VisibilityListenerC0397b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // androidx.core.view.AbstractC1228b
        /* renamed from: b */
        public boolean mo37490b() {
            return this.f1394d.isVisible();
        }

        @Override // androidx.core.view.AbstractC1228b
        /* renamed from: d */
        public View mo37488d(MenuItem menuItem) {
            return this.f1394d.onCreateActionView(menuItem);
        }

        @Override // androidx.core.view.AbstractC1228b
        /* renamed from: g */
        public boolean mo37485g() {
            return this.f1394d.overridesItemVisibility();
        }

        @Override // androidx.core.view.AbstractC1228b
        /* renamed from: j */
        public void mo37482j(AbstractC1228b.InterfaceC1230b interfaceC1230b) {
            ActionProvider$VisibilityListenerC0397b actionProvider$VisibilityListenerC0397b;
            this.f1396f = interfaceC1230b;
            ActionProvider actionProvider = this.f1394d;
            if (interfaceC1230b != null) {
                actionProvider$VisibilityListenerC0397b = this;
            } else {
                actionProvider$VisibilityListenerC0397b = null;
            }
            actionProvider.setVisibilityListener(actionProvider$VisibilityListenerC0397b);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z) {
            AbstractC1228b.InterfaceC1230b interfaceC1230b = this.f1396f;
            if (interfaceC1230b != null) {
                interfaceC1230b.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C0398c extends FrameLayout implements InterfaceC0358b {

        /* renamed from: j */
        final CollapsibleActionView f1398j;

        C0398c(View view) {
            super(view.getContext());
            this.f1398j = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        View m40317a() {
            return (View) this.f1398j;
        }

        @Override // androidx.appcompat.view.InterfaceC0358b
        public void onActionViewCollapsed() {
            this.f1398j.onActionViewCollapsed();
        }

        @Override // androidx.appcompat.view.InterfaceC0358b
        public void onActionViewExpanded() {
            this.f1398j.onActionViewExpanded();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private class MenuItem$OnActionExpandListenerC0399d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        private final MenuItem.OnActionExpandListener f1399a;

        MenuItem$OnActionExpandListenerC0399d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f1399a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f1399a.onMenuItemActionCollapse(MenuItemC0395j.this.m40414c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f1399a.onMenuItemActionExpand(MenuItemC0395j.this.m40414c(menuItem));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private class MenuItem$OnMenuItemClickListenerC0400e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private final MenuItem.OnMenuItemClickListener f1401a;

        MenuItem$OnMenuItemClickListenerC0400e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f1401a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f1401a.onMenuItemClick(MenuItemC0395j.this.m40414c(menuItem));
        }
    }

    public MenuItemC0395j(Context context, InterfaceMenuItemC13352b interfaceMenuItemC13352b) {
        super(context);
        if (interfaceMenuItemC13352b != null) {
            this.f1392d = interfaceMenuItemC13352b;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f1392d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f1392d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC1228b mo2720a = this.f1392d.mo2720a();
        if (mo2720a instanceof C0396a) {
            return ((C0396a) mo2720a).f1394d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f1392d.getActionView();
        if (actionView instanceof C0398c) {
            return ((C0398c) actionView).m40317a();
        }
        return actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1392d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1392d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1392d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1392d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f1392d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1392d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1392d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1392d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f1392d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1392d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1392d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1392d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1392d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return m40413d(this.f1392d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f1392d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f1392d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1392d.getTooltipText();
    }

    /* renamed from: h */
    public void m40318h(boolean z) {
        try {
            if (this.f1393e == null) {
                this.f1393e = this.f1392d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f1393e.invoke(this.f1392d, Boolean.valueOf(z));
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1392d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f1392d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f1392d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f1392d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f1392d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f1392d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ActionProvider$VisibilityListenerC0397b actionProvider$VisibilityListenerC0397b = new ActionProvider$VisibilityListenerC0397b(this.f1272a, actionProvider);
        InterfaceMenuItemC13352b interfaceMenuItemC13352b = this.f1392d;
        if (actionProvider == null) {
            actionProvider$VisibilityListenerC0397b = null;
        }
        interfaceMenuItemC13352b.mo2719b(actionProvider$VisibilityListenerC0397b);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0398c(view);
        }
        this.f1392d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f1392d.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f1392d.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f1392d.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f1392d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f1392d.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1392d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1392d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1392d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1392d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f1392d.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        MenuItem$OnActionExpandListenerC0399d menuItem$OnActionExpandListenerC0399d;
        InterfaceMenuItemC13352b interfaceMenuItemC13352b = this.f1392d;
        if (onActionExpandListener != null) {
            menuItem$OnActionExpandListenerC0399d = new MenuItem$OnActionExpandListenerC0399d(onActionExpandListener);
        } else {
            menuItem$OnActionExpandListenerC0399d = null;
        }
        interfaceMenuItemC13352b.setOnActionExpandListener(menuItem$OnActionExpandListenerC0399d);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        MenuItem$OnMenuItemClickListenerC0400e menuItem$OnMenuItemClickListenerC0400e;
        InterfaceMenuItemC13352b interfaceMenuItemC13352b = this.f1392d;
        if (onMenuItemClickListener != null) {
            menuItem$OnMenuItemClickListenerC0400e = new MenuItem$OnMenuItemClickListenerC0400e(onMenuItemClickListener);
        } else {
            menuItem$OnMenuItemClickListenerC0400e = null;
        }
        interfaceMenuItemC13352b.setOnMenuItemClickListener(menuItem$OnMenuItemClickListenerC0400e);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f1392d.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i) {
        this.f1392d.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i) {
        this.f1392d.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1392d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1392d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f1392d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        return this.f1392d.setVisible(z);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f1392d.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f1392d.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f1392d.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1392d.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f1392d.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i) {
        this.f1392d.setActionView(i);
        View actionView = this.f1392d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f1392d.setActionView(new C0398c(actionView));
        }
        return this;
    }
}
