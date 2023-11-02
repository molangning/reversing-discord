package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.InterfaceC0407n;
import androidx.core.graphics.drawable.C1013a;
import androidx.core.view.AbstractC1228b;
import androidx.recyclerview.widget.RecyclerView;
import p052d.C5713h;
import p071e.C6029a;
import p391w.InterfaceMenuItemC13352b;

/* renamed from: androidx.appcompat.view.menu.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C0393i implements InterfaceMenuItemC13352b {

    /* renamed from: A */
    private View f1360A;

    /* renamed from: B */
    private AbstractC1228b f1361B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f1362C;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f1364E;

    /* renamed from: a */
    private final int f1365a;

    /* renamed from: b */
    private final int f1366b;

    /* renamed from: c */
    private final int f1367c;

    /* renamed from: d */
    private final int f1368d;

    /* renamed from: e */
    private CharSequence f1369e;

    /* renamed from: f */
    private CharSequence f1370f;

    /* renamed from: g */
    private Intent f1371g;

    /* renamed from: h */
    private char f1372h;

    /* renamed from: j */
    private char f1374j;

    /* renamed from: l */
    private Drawable f1376l;

    /* renamed from: n */
    C0389g f1378n;

    /* renamed from: o */
    private SubMenuC0414r f1379o;

    /* renamed from: p */
    private Runnable f1380p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f1381q;

    /* renamed from: r */
    private CharSequence f1382r;

    /* renamed from: s */
    private CharSequence f1383s;

    /* renamed from: z */
    private int f1390z;

    /* renamed from: i */
    private int f1373i = RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: k */
    private int f1375k = RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: m */
    private int f1377m = 0;

    /* renamed from: t */
    private ColorStateList f1384t = null;

    /* renamed from: u */
    private PorterDuff.Mode f1385u = null;

    /* renamed from: v */
    private boolean f1386v = false;

    /* renamed from: w */
    private boolean f1387w = false;

    /* renamed from: x */
    private boolean f1388x = false;

    /* renamed from: y */
    private int f1389y = 16;

    /* renamed from: D */
    private boolean f1363D = false;

    /* renamed from: androidx.appcompat.view.menu.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C0394a implements AbstractC1228b.InterfaceC1230b {
        C0394a() {
            C0393i.this = r1;
        }

        @Override // androidx.core.view.AbstractC1228b.InterfaceC1230b
        public void onActionProviderVisibilityChanged(boolean z) {
            C0393i c0393i = C0393i.this;
            c0393i.f1378n.m40388J(c0393i);
        }
    }

    public C0393i(C0389g c0389g, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f1378n = c0389g;
        this.f1365a = i2;
        this.f1366b = i;
        this.f1367c = i3;
        this.f1368d = i4;
        this.f1369e = charSequence;
        this.f1390z = i5;
    }

    /* renamed from: d */
    private static void m40341d(StringBuilder sb2, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb2.append(str);
        }
    }

    /* renamed from: e */
    private Drawable m40340e(Drawable drawable) {
        if (drawable != null && this.f1388x && (this.f1386v || this.f1387w)) {
            drawable = C1013a.m38080r(drawable).mutate();
            if (this.f1386v) {
                C1013a.m38083o(drawable, this.f1384t);
            }
            if (this.f1387w) {
                C1013a.m38082p(drawable, this.f1385u);
            }
            this.f1388x = false;
        }
        return drawable;
    }

    /* renamed from: A */
    public boolean m40344A() {
        return this.f1378n.mo40283H() && m40338g() != 0;
    }

    /* renamed from: B */
    public boolean m40343B() {
        return (this.f1390z & 4) == 4;
    }

    @Override // p391w.InterfaceMenuItemC13352b
    /* renamed from: a */
    public AbstractC1228b mo2720a() {
        return this.f1361B;
    }

    @Override // p391w.InterfaceMenuItemC13352b
    /* renamed from: b */
    public InterfaceMenuItemC13352b mo2719b(AbstractC1228b abstractC1228b) {
        AbstractC1228b abstractC1228b2 = this.f1361B;
        if (abstractC1228b2 != null) {
            abstractC1228b2.m37484h();
        }
        this.f1360A = null;
        this.f1361B = abstractC1228b;
        this.f1378n.m40387K(true);
        AbstractC1228b abstractC1228b3 = this.f1361B;
        if (abstractC1228b3 != null) {
            abstractC1228b3.mo37482j(new C0394a());
        }
        return this;
    }

    /* renamed from: c */
    public void m40342c() {
        this.f1378n.m40389I(this);
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f1390z & 8) == 0) {
            return false;
        }
        if (this.f1360A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1362C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionCollapse(this)) {
            return false;
        }
        return this.f1378n.mo40280f(this);
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public boolean expandActionView() {
        if (!m40335j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1362C;
        if (onActionExpandListener != null && !onActionExpandListener.onMenuItemActionExpand(this)) {
            return false;
        }
        return this.f1378n.mo40278k(this);
    }

    /* renamed from: f */
    public int m40339f() {
        return this.f1368d;
    }

    /* renamed from: g */
    public char m40338g() {
        return this.f1378n.mo40284G() ? this.f1374j : this.f1372h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public View getActionView() {
        View view = this.f1360A;
        if (view != null) {
            return view;
        }
        AbstractC1228b abstractC1228b = this.f1361B;
        if (abstractC1228b != null) {
            View mo37488d = abstractC1228b.mo37488d(this);
            this.f1360A = mo37488d;
            return mo37488d;
        }
        return null;
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f1375k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f1374j;
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f1382r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f1366b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f1376l;
        if (drawable != null) {
            return m40340e(drawable);
        }
        if (this.f1377m != 0) {
            Drawable m23853b = C6029a.m23853b(this.f1378n.m40352u(), this.f1377m);
            this.f1377m = 0;
            this.f1376l = m23853b;
            return m40340e(m23853b);
        }
        return null;
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f1384t;
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f1385u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f1371g;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f1365a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1364E;
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f1373i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f1372h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f1367c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f1379o;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f1369e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1370f;
        return charSequence != null ? charSequence : this.f1369e;
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f1383s;
    }

    /* renamed from: h */
    public String m40337h() {
        int i;
        char m40338g = m40338g();
        if (m40338g == 0) {
            return "";
        }
        Resources resources = this.f1378n.m40352u().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f1378n.m40352u()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(C5713h.f16217m));
        }
        if (this.f1378n.mo40284G()) {
            i = this.f1375k;
        } else {
            i = this.f1373i;
        }
        m40341d(sb2, i, 65536, resources.getString(C5713h.f16213i));
        m40341d(sb2, i, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, resources.getString(C5713h.f16209e));
        m40341d(sb2, i, 2, resources.getString(C5713h.f16208d));
        m40341d(sb2, i, 1, resources.getString(C5713h.f16214j));
        m40341d(sb2, i, 4, resources.getString(C5713h.f16216l));
        m40341d(sb2, i, 8, resources.getString(C5713h.f16212h));
        if (m40338g != '\b') {
            if (m40338g != '\n') {
                if (m40338g != ' ') {
                    sb2.append(m40338g);
                } else {
                    sb2.append(resources.getString(C5713h.f16215k));
                }
            } else {
                sb2.append(resources.getString(C5713h.f16211g));
            }
        } else {
            sb2.append(resources.getString(C5713h.f16210f));
        }
        return sb2.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f1379o != null;
    }

    /* renamed from: i */
    public CharSequence m40336i(InterfaceC0407n.InterfaceC0408a interfaceC0408a) {
        if (interfaceC0408a != null && interfaceC0408a.mo27072d()) {
            return getTitleCondensed();
        }
        return getTitle();
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f1363D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f1389y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f1389y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f1389y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC1228b abstractC1228b = this.f1361B;
        if (abstractC1228b != null && abstractC1228b.mo37485g()) {
            if ((this.f1389y & 8) == 0 && this.f1361B.mo37490b()) {
                return true;
            }
            return false;
        } else if ((this.f1389y & 8) == 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: j */
    public boolean m40335j() {
        AbstractC1228b abstractC1228b;
        if ((this.f1390z & 8) == 0) {
            return false;
        }
        if (this.f1360A == null && (abstractC1228b = this.f1361B) != null) {
            this.f1360A = abstractC1228b.mo37488d(this);
        }
        if (this.f1360A == null) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public boolean m40334k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1381q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0389g c0389g = this.f1378n;
        if (c0389g.mo40279h(c0389g, this)) {
            return true;
        }
        Runnable runnable = this.f1380p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1371g != null) {
            try {
                this.f1378n.m40352u().startActivity(this.f1371g);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        AbstractC1228b abstractC1228b = this.f1361B;
        if (abstractC1228b != null && abstractC1228b.mo37487e()) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean m40333l() {
        return (this.f1389y & 32) == 32;
    }

    /* renamed from: m */
    public boolean m40332m() {
        return (this.f1389y & 4) != 0;
    }

    /* renamed from: n */
    public boolean m40331n() {
        return (this.f1390z & 1) == 1;
    }

    /* renamed from: o */
    public boolean m40330o() {
        return (this.f1390z & 2) == 2;
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    /* renamed from: p */
    public InterfaceMenuItemC13352b setActionView(int i) {
        Context m40352u = this.f1378n.m40352u();
        setActionView(LayoutInflater.from(m40352u).inflate(i, (ViewGroup) new LinearLayout(m40352u), false));
        return this;
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    /* renamed from: q */
    public InterfaceMenuItemC13352b setActionView(View view) {
        int i;
        this.f1360A = view;
        this.f1361B = null;
        if (view != null && view.getId() == -1 && (i = this.f1365a) > 0) {
            view.setId(i);
        }
        this.f1378n.m40389I(this);
        return this;
    }

    /* renamed from: r */
    public void m40327r(boolean z) {
        this.f1363D = z;
        this.f1378n.m40387K(false);
    }

    /* renamed from: s */
    public void m40326s(boolean z) {
        int i;
        int i2 = this.f1389y;
        int i3 = i2 & (-3);
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        int i4 = i | i3;
        this.f1389y = i4;
        if (i2 != i4) {
            this.f1378n.m40387K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f1374j == c) {
            return this;
        }
        this.f1374j = Character.toLowerCase(c);
        this.f1378n.m40387K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z) {
        int i = this.f1389y;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.f1389y = i2;
        if (i != i2) {
            this.f1378n.m40387K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z) {
        if ((this.f1389y & 4) != 0) {
            this.f1378n.m40379T(this);
        } else {
            m40326s(z);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f1389y |= 16;
        } else {
            this.f1389y &= -17;
        }
        this.f1378n.m40387K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f1377m = 0;
        this.f1376l = drawable;
        this.f1388x = true;
        this.f1378n.m40387K(false);
        return this;
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1384t = colorStateList;
        this.f1386v = true;
        this.f1388x = true;
        this.f1378n.m40387K(false);
        return this;
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1385u = mode;
        this.f1387w = true;
        this.f1388x = true;
        this.f1378n.m40387K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f1371g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c) {
        if (this.f1372h == c) {
            return this;
        }
        this.f1372h = c;
        this.f1378n.m40387K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1362C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1381q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c, char c2) {
        this.f1372h = c;
        this.f1374j = Character.toLowerCase(c2);
        this.f1378n.m40387K(false);
        return this;
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f1390z = i;
        this.f1378n.m40389I(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f1369e = charSequence;
        this.f1378n.m40387K(false);
        SubMenuC0414r subMenuC0414r = this.f1379o;
        if (subMenuC0414r != null) {
            subMenuC0414r.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1370f = charSequence;
        this.f1378n.m40387K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z) {
        if (m40320y(z)) {
            this.f1378n.m40388J(this);
        }
        return this;
    }

    /* renamed from: t */
    public void m40325t(boolean z) {
        this.f1389y = (z ? 4 : 0) | (this.f1389y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f1369e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: u */
    public void m40324u(boolean z) {
        if (z) {
            this.f1389y |= 32;
        } else {
            this.f1389y &= -33;
        }
    }

    /* renamed from: v */
    public void m40323v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f1364E = contextMenuInfo;
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    /* renamed from: w */
    public InterfaceMenuItemC13352b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: x */
    public void m40321x(SubMenuC0414r subMenuC0414r) {
        this.f1379o = subMenuC0414r;
        subMenuC0414r.setHeaderTitle(getTitle());
    }

    /* renamed from: y */
    public boolean m40320y(boolean z) {
        int i;
        int i2 = this.f1389y;
        int i3 = i2 & (-9);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        int i4 = i | i3;
        this.f1389y = i4;
        if (i2 == i4) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public boolean m40319z() {
        return this.f1378n.m40393A();
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC13352b setContentDescription(CharSequence charSequence) {
        this.f1382r = charSequence;
        this.f1378n.m40387K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC13352b setTooltipText(CharSequence charSequence) {
        this.f1383s = charSequence;
        this.f1378n.m40387K(false);
        return this;
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f1374j == c && this.f1375k == i) {
            return this;
        }
        this.f1374j = Character.toLowerCase(c);
        this.f1375k = KeyEvent.normalizeMetaState(i);
        this.f1378n.m40387K(false);
        return this;
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f1372h == c && this.f1373i == i) {
            return this;
        }
        this.f1372h = c;
        this.f1373i = KeyEvent.normalizeMetaState(i);
        this.f1378n.m40387K(false);
        return this;
    }

    @Override // p391w.InterfaceMenuItemC13352b, android.view.MenuItem
    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1372h = c;
        this.f1373i = KeyEvent.normalizeMetaState(i);
        this.f1374j = Character.toLowerCase(c2);
        this.f1375k = KeyEvent.normalizeMetaState(i2);
        this.f1378n.m40387K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i) {
        this.f1376l = null;
        this.f1377m = i;
        this.f1388x = true;
        this.f1378n.m40387K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i) {
        return setTitle(this.f1378n.m40352u().getString(i));
    }
}