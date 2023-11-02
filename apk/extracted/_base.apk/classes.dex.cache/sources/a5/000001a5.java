package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.C0946a;
import androidx.core.graphics.drawable.C1013a;
import androidx.core.view.AbstractC1228b;
import androidx.recyclerview.widget.RecyclerView;
import p391w.InterfaceMenuItemC13352b;

/* renamed from: androidx.appcompat.view.menu.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0377a implements InterfaceMenuItemC13352b {

    /* renamed from: a */
    private final int f1242a;

    /* renamed from: b */
    private final int f1243b;

    /* renamed from: c */
    private final int f1244c;

    /* renamed from: d */
    private CharSequence f1245d;

    /* renamed from: e */
    private CharSequence f1246e;

    /* renamed from: f */
    private Intent f1247f;

    /* renamed from: g */
    private char f1248g;

    /* renamed from: i */
    private char f1250i;

    /* renamed from: k */
    private Drawable f1252k;

    /* renamed from: l */
    private Context f1253l;

    /* renamed from: m */
    private MenuItem.OnMenuItemClickListener f1254m;

    /* renamed from: n */
    private CharSequence f1255n;

    /* renamed from: o */
    private CharSequence f1256o;

    /* renamed from: h */
    private int f1249h = RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: j */
    private int f1251j = RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: p */
    private ColorStateList f1257p = null;

    /* renamed from: q */
    private PorterDuff.Mode f1258q = null;

    /* renamed from: r */
    private boolean f1259r = false;

    /* renamed from: s */
    private boolean f1260s = false;

    /* renamed from: t */
    private int f1261t = 16;

    public C0377a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f1253l = context;
        this.f1242a = i2;
        this.f1243b = i;
        this.f1244c = i4;
        this.f1245d = charSequence;
    }

    /* renamed from: c */
    private void m40422c() {
        Drawable drawable = this.f1252k;
        if (drawable != null) {
            if (this.f1259r || this.f1260s) {
                Drawable m38080r = C1013a.m38080r(drawable);
                this.f1252k = m38080r;
                Drawable mutate = m38080r.mutate();
                this.f1252k = mutate;
                if (this.f1259r) {
                    C1013a.m38083o(mutate, this.f1257p);
                }
                if (this.f1260s) {
                    C1013a.m38082p(this.f1252k, this.f1258q);
                }
            }
        }
    }

    @Override // p391w.InterfaceMenuItemC13352b
    /* renamed from: a */
    public AbstractC1228b mo2720a() {
        return null;
    }

    @Override // p391w.InterfaceMenuItemC13352b
    /* renamed from: b */
    public InterfaceMenuItemC13352b mo2719b(AbstractC1228b abstractC1228b) {
        throw new UnsupportedOperationException();
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    /* renamed from: d */
    public InterfaceMenuItemC13352b setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    /* renamed from: e */
    public InterfaceMenuItemC13352b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    /* renamed from: f */
    public InterfaceMenuItemC13352b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1251j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1250i;
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1255n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1243b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f1252k;
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1257p;
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1258q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1247f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f1242a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1249h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1248g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1244c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f1245d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1246e;
        return charSequence != null ? charSequence : this.f1245d;
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1256o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1261t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1261t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1261t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f1261t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        this.f1250i = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        this.f1261t = (z ? 1 : 0) | (this.f1261t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        this.f1261t = (z ? 2 : 0) | (this.f1261t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        this.f1261t = (z ? 16 : 0) | (this.f1261t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1252k = drawable;
        m40422c();
        return this;
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1257p = colorStateList;
        this.f1259r = true;
        m40422c();
        return this;
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1258q = mode;
        this.f1260s = true;
        m40422c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1247f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        this.f1248g = c;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1254m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f1248g = c;
        this.f1250i = Character.toLowerCase(c2);
        return this;
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1245d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1246e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        this.f1261t = (this.f1261t & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f1250i = Character.toLowerCase(c);
        this.f1251j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC13352b setContentDescription(CharSequence charSequence) {
        this.f1255n = charSequence;
        return this;
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        this.f1248g = c;
        this.f1249h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        this.f1245d = this.f1253l.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC13352b setTooltipText(CharSequence charSequence) {
        this.f1256o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f1252k = C0946a.m38399e(this.f1253l, i);
        m40422c();
        return this;
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1248g = c;
        this.f1249h = KeyEvent.normalizeMetaState(i);
        this.f1250i = Character.toLowerCase(c2);
        this.f1251j = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}