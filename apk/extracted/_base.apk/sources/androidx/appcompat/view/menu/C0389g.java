package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.C0946a;
import androidx.core.view.AbstractC1228b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p391w.InterfaceMenuC13351a;

/* renamed from: androidx.appcompat.view.menu.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0389g implements InterfaceMenuC13351a {

    /* renamed from: A */
    private static final int[] f1329A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    private final Context f1330a;

    /* renamed from: b */
    private final Resources f1331b;

    /* renamed from: c */
    private boolean f1332c;

    /* renamed from: d */
    private boolean f1333d;

    /* renamed from: e */
    private InterfaceC0390a f1334e;

    /* renamed from: m */
    private ContextMenu.ContextMenuInfo f1342m;

    /* renamed from: n */
    CharSequence f1343n;

    /* renamed from: o */
    Drawable f1344o;

    /* renamed from: p */
    View f1345p;

    /* renamed from: x */
    private C0393i f1353x;

    /* renamed from: z */
    private boolean f1355z;

    /* renamed from: l */
    private int f1341l = 0;

    /* renamed from: q */
    private boolean f1346q = false;

    /* renamed from: r */
    private boolean f1347r = false;

    /* renamed from: s */
    private boolean f1348s = false;

    /* renamed from: t */
    private boolean f1349t = false;

    /* renamed from: u */
    private boolean f1350u = false;

    /* renamed from: v */
    private ArrayList<C0393i> f1351v = new ArrayList<>();

    /* renamed from: w */
    private CopyOnWriteArrayList<WeakReference<InterfaceC0405m>> f1352w = new CopyOnWriteArrayList<>();

    /* renamed from: y */
    private boolean f1354y = false;

    /* renamed from: f */
    private ArrayList<C0393i> f1335f = new ArrayList<>();

    /* renamed from: g */
    private ArrayList<C0393i> f1336g = new ArrayList<>();

    /* renamed from: h */
    private boolean f1337h = true;

    /* renamed from: i */
    private ArrayList<C0393i> f1338i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C0393i> f1339j = new ArrayList<>();

    /* renamed from: k */
    private boolean f1340k = true;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC0390a {
        /* renamed from: a */
        boolean mo40035a(C0389g c0389g, MenuItem menuItem);

        /* renamed from: b */
        void mo40034b(C0389g c0389g);
    }

    /* renamed from: androidx.appcompat.view.menu.g$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC0391b {
        /* renamed from: b */
        boolean mo40234b(C0393i c0393i);
    }

    public C0389g(Context context) {
        this.f1330a = context;
        this.f1331b = context.getResources();
        m40369b0(true);
    }

    /* renamed from: B */
    private static int m40392B(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f1329A;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: N */
    private void m40384N(int i, boolean z) {
        if (i >= 0 && i < this.f1335f.size()) {
            this.f1335f.remove(i);
            if (z) {
                m40387K(true);
            }
        }
    }

    /* renamed from: W */
    private void m40376W(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources m40391C = m40391C();
        if (view != null) {
            this.f1345p = view;
            this.f1343n = null;
            this.f1344o = null;
        } else {
            if (i > 0) {
                this.f1343n = m40391C.getText(i);
            } else if (charSequence != null) {
                this.f1343n = charSequence;
            }
            if (i2 > 0) {
                this.f1344o = C0946a.m38399e(m40352u(), i2);
            } else if (drawable != null) {
                this.f1344o = drawable;
            }
            this.f1345p = null;
        }
        m40387K(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (androidx.core.view.C1262g2.m37446e(android.view.ViewConfiguration.get(r2.f1330a), r2.f1330a) != false) goto L6;
     */
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m40369b0(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.f1331b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.f1330a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f1330a
            boolean r3 = androidx.core.view.C1262g2.m37446e(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.f1333d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0389g.m40369b0(boolean):void");
    }

    /* renamed from: g */
    private C0393i m40363g(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0393i(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: i */
    private void m40362i(boolean z) {
        if (this.f1352w.isEmpty()) {
            return;
        }
        m40365d0();
        Iterator<WeakReference<InterfaceC0405m>> it = this.f1352w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0405m> next = it.next();
            InterfaceC0405m interfaceC0405m = next.get();
            if (interfaceC0405m == null) {
                this.f1352w.remove(next);
            } else {
                interfaceC0405m.mo39990e(z);
            }
        }
        m40367c0();
    }

    /* renamed from: j */
    private boolean m40361j(SubMenuC0414r subMenuC0414r, InterfaceC0405m interfaceC0405m) {
        boolean z = false;
        if (this.f1352w.isEmpty()) {
            return false;
        }
        if (interfaceC0405m != null) {
            z = interfaceC0405m.mo39991d(subMenuC0414r);
        }
        Iterator<WeakReference<InterfaceC0405m>> it = this.f1352w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0405m> next = it.next();
            InterfaceC0405m interfaceC0405m2 = next.get();
            if (interfaceC0405m2 == null) {
                this.f1352w.remove(next);
            } else if (!z) {
                z = interfaceC0405m2.mo39991d(subMenuC0414r);
            }
        }
        return z;
    }

    /* renamed from: n */
    private static int m40358n(ArrayList<C0393i> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).m40339f() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean m40393A() {
        return this.f1349t;
    }

    /* renamed from: C */
    Resources m40391C() {
        return this.f1331b;
    }

    /* renamed from: D */
    public C0389g mo40286D() {
        return this;
    }

    /* renamed from: E */
    public ArrayList<C0393i> m40390E() {
        if (!this.f1337h) {
            return this.f1336g;
        }
        this.f1336g.clear();
        int size = this.f1335f.size();
        for (int i = 0; i < size; i++) {
            C0393i c0393i = this.f1335f.get(i);
            if (c0393i.isVisible()) {
                this.f1336g.add(c0393i);
            }
        }
        this.f1337h = false;
        this.f1340k = true;
        return this.f1336g;
    }

    /* renamed from: F */
    public boolean mo40285F() {
        return this.f1354y;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G */
    public boolean mo40284G() {
        return this.f1332c;
    }

    /* renamed from: H */
    public boolean mo40283H() {
        return this.f1333d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public void m40389I(C0393i c0393i) {
        this.f1340k = true;
        m40387K(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: J */
    public void m40388J(C0393i c0393i) {
        this.f1337h = true;
        m40387K(true);
    }

    /* renamed from: K */
    public void m40387K(boolean z) {
        if (!this.f1346q) {
            if (z) {
                this.f1337h = true;
                this.f1340k = true;
            }
            m40362i(z);
            return;
        }
        this.f1347r = true;
        if (z) {
            this.f1348s = true;
        }
    }

    /* renamed from: L */
    public boolean m40386L(MenuItem menuItem, int i) {
        return m40385M(menuItem, null, i);
    }

    /* renamed from: M */
    public boolean m40385M(MenuItem menuItem, InterfaceC0405m interfaceC0405m, int i) {
        boolean z;
        C0393i c0393i = (C0393i) menuItem;
        if (c0393i == null || !c0393i.isEnabled()) {
            return false;
        }
        boolean m40334k = c0393i.m40334k();
        AbstractC1228b mo2720a = c0393i.mo2720a();
        if (mo2720a != null && mo2720a.mo37491a()) {
            z = true;
        } else {
            z = false;
        }
        if (c0393i.m40335j()) {
            m40334k |= c0393i.expandActionView();
            if (m40334k) {
                m40364e(true);
            }
        } else if (!c0393i.hasSubMenu() && !z) {
            if ((i & 1) == 0) {
                m40364e(true);
            }
        } else {
            if ((i & 4) == 0) {
                m40364e(false);
            }
            if (!c0393i.hasSubMenu()) {
                c0393i.m40321x(new SubMenuC0414r(m40352u(), this, c0393i));
            }
            SubMenuC0414r subMenuC0414r = (SubMenuC0414r) c0393i.getSubMenu();
            if (z) {
                mo2720a.mo37486f(subMenuC0414r);
            }
            m40334k |= m40361j(subMenuC0414r, interfaceC0405m);
            if (!m40334k) {
                m40364e(true);
            }
        }
        return m40334k;
    }

    /* renamed from: O */
    public void m40383O(InterfaceC0405m interfaceC0405m) {
        Iterator<WeakReference<InterfaceC0405m>> it = this.f1352w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0405m> next = it.next();
            InterfaceC0405m interfaceC0405m2 = next.get();
            if (interfaceC0405m2 == null || interfaceC0405m2 == interfaceC0405m) {
                this.f1352w.remove(next);
            }
        }
    }

    /* renamed from: P */
    public void m40382P(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(mo40277t());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0414r) item.getSubMenu()).m40382P(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 > 0 && (findItem = findItem(i2)) != null) {
            findItem.expandActionView();
        }
    }

    /* renamed from: Q */
    public void m40381Q(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC0414r) item.getSubMenu()).m40381Q(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo40277t(), sparseArray);
        }
    }

    /* renamed from: R */
    public void mo40282R(InterfaceC0390a interfaceC0390a) {
        this.f1334e = interfaceC0390a;
    }

    /* renamed from: S */
    public C0389g m40380S(int i) {
        this.f1341l = i;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public void m40379T(MenuItem menuItem) {
        boolean z;
        int groupId = menuItem.getGroupId();
        int size = this.f1335f.size();
        m40365d0();
        for (int i = 0; i < size; i++) {
            C0393i c0393i = this.f1335f.get(i);
            if (c0393i.getGroupId() == groupId && c0393i.m40332m() && c0393i.isCheckable()) {
                if (c0393i == menuItem) {
                    z = true;
                } else {
                    z = false;
                }
                c0393i.m40326s(z);
            }
        }
        m40367c0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: U */
    public C0389g m40378U(int i) {
        m40376W(0, null, i, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: V */
    public C0389g m40377V(Drawable drawable) {
        m40376W(0, null, 0, drawable, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: X */
    public C0389g m40375X(int i) {
        m40376W(i, null, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Y */
    public C0389g m40374Y(CharSequence charSequence) {
        m40376W(0, charSequence, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: Z */
    public C0389g m40373Z(View view) {
        m40376W(0, null, 0, null, view);
        return this;
    }

    /* renamed from: a */
    protected MenuItem m40372a(int i, int i2, int i3, CharSequence charSequence) {
        int m40392B = m40392B(i3);
        C0393i m40363g = m40363g(i, i2, i3, m40392B, charSequence, this.f1341l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f1342m;
        if (contextMenuInfo != null) {
            m40363g.m40323v(contextMenuInfo);
        }
        ArrayList<C0393i> arrayList = this.f1335f;
        arrayList.add(m40358n(arrayList, m40392B), m40363g);
        m40387K(true);
        return m40363g;
    }

    /* renamed from: a0 */
    public void m40371a0(boolean z) {
        this.f1355z = z;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return m40372a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        Intent intent2;
        int i6;
        PackageManager packageManager = this.f1330a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i5 = queryIntentActivityOptions.size();
        } else {
            i5 = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i7 = 0; i7 < i5; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            if (i8 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i8];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent4 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = intent4;
            }
        }
        return i5;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void m40370b(InterfaceC0405m interfaceC0405m) {
        m40368c(interfaceC0405m, this.f1330a);
    }

    /* renamed from: c */
    public void m40368c(InterfaceC0405m interfaceC0405m, Context context) {
        this.f1352w.add(new WeakReference<>(interfaceC0405m));
        interfaceC0405m.mo39988h(context, this);
        this.f1340k = true;
    }

    /* renamed from: c0 */
    public void m40367c0() {
        this.f1346q = false;
        if (this.f1347r) {
            this.f1347r = false;
            m40387K(this.f1348s);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        C0393i c0393i = this.f1353x;
        if (c0393i != null) {
            mo40280f(c0393i);
        }
        this.f1335f.clear();
        m40387K(true);
    }

    public void clearHeader() {
        this.f1344o = null;
        this.f1343n = null;
        this.f1345p = null;
        m40387K(false);
    }

    @Override // android.view.Menu
    public void close() {
        m40364e(true);
    }

    /* renamed from: d */
    public void m40366d() {
        InterfaceC0390a interfaceC0390a = this.f1334e;
        if (interfaceC0390a != null) {
            interfaceC0390a.mo40034b(this);
        }
    }

    /* renamed from: d0 */
    public void m40365d0() {
        if (!this.f1346q) {
            this.f1346q = true;
            this.f1347r = false;
            this.f1348s = false;
        }
    }

    /* renamed from: e */
    public final void m40364e(boolean z) {
        if (this.f1350u) {
            return;
        }
        this.f1350u = true;
        Iterator<WeakReference<InterfaceC0405m>> it = this.f1352w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0405m> next = it.next();
            InterfaceC0405m interfaceC0405m = next.get();
            if (interfaceC0405m == null) {
                this.f1352w.remove(next);
            } else {
                interfaceC0405m.mo39992a(this, z);
            }
        }
        this.f1350u = false;
    }

    /* renamed from: f */
    public boolean mo40280f(C0393i c0393i) {
        boolean z = false;
        if (!this.f1352w.isEmpty() && this.f1353x == c0393i) {
            m40365d0();
            Iterator<WeakReference<InterfaceC0405m>> it = this.f1352w.iterator();
            while (it.hasNext()) {
                WeakReference<InterfaceC0405m> next = it.next();
                InterfaceC0405m interfaceC0405m = next.get();
                if (interfaceC0405m == null) {
                    this.f1352w.remove(next);
                } else {
                    z = interfaceC0405m.mo40028g(this, c0393i);
                    if (z) {
                        break;
                    }
                }
            }
            m40367c0();
            if (z) {
                this.f1353x = null;
            }
        }
        return z;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0393i c0393i = this.f1335f.get(i2);
            if (c0393i.getItemId() == i) {
                return c0393i;
            }
            if (c0393i.hasSubMenu() && (findItem = c0393i.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.f1335f.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo40279h(C0389g c0389g, MenuItem menuItem) {
        InterfaceC0390a interfaceC0390a = this.f1334e;
        return interfaceC0390a != null && interfaceC0390a.mo40035a(c0389g, menuItem);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f1355z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f1335f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return m40356p(i, keyEvent) != null;
    }

    /* renamed from: k */
    public boolean mo40278k(C0393i c0393i) {
        boolean z = false;
        if (this.f1352w.isEmpty()) {
            return false;
        }
        m40365d0();
        Iterator<WeakReference<InterfaceC0405m>> it = this.f1352w.iterator();
        while (it.hasNext()) {
            WeakReference<InterfaceC0405m> next = it.next();
            InterfaceC0405m interfaceC0405m = next.get();
            if (interfaceC0405m == null) {
                this.f1352w.remove(next);
            } else {
                z = interfaceC0405m.mo40029b(this, c0393i);
                if (z) {
                    break;
                }
            }
        }
        m40367c0();
        if (z) {
            this.f1353x = c0393i;
        }
        return z;
    }

    /* renamed from: l */
    public int m40360l(int i) {
        return m40359m(i, 0);
    }

    /* renamed from: m */
    public int m40359m(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f1335f.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* renamed from: o */
    public int m40357o(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f1335f.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: p */
    C0393i m40356p(int i, KeyEvent keyEvent) {
        char numericShortcut;
        ArrayList<C0393i> arrayList = this.f1351v;
        arrayList.clear();
        m40355q(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean mo40284G = mo40284G();
        for (int i2 = 0; i2 < size; i2++) {
            C0393i c0393i = arrayList.get(i2);
            if (mo40284G) {
                numericShortcut = c0393i.getAlphabeticShortcut();
            } else {
                numericShortcut = c0393i.getNumericShortcut();
            }
            char[] cArr = keyData.meta;
            if ((numericShortcut == cArr[0] && (metaState & 2) == 0) || ((numericShortcut == cArr[2] && (metaState & 2) != 0) || (mo40284G && numericShortcut == '\b' && i == 67))) {
                return c0393i;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return m40386L(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        C0393i m40356p = m40356p(i, keyEvent);
        if (m40356p != null) {
            z = m40386L(m40356p, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            m40364e(true);
        }
        return z;
    }

    /* renamed from: q */
    void m40355q(List<C0393i> list, int i, KeyEvent keyEvent) {
        char numericShortcut;
        int numericModifiers;
        boolean z;
        boolean mo40284G = mo40284G();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i != 67) {
            return;
        }
        int size = this.f1335f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0393i c0393i = this.f1335f.get(i2);
            if (c0393i.hasSubMenu()) {
                ((C0389g) c0393i.getSubMenu()).m40355q(list, i, keyEvent);
            }
            if (mo40284G) {
                numericShortcut = c0393i.getAlphabeticShortcut();
            } else {
                numericShortcut = c0393i.getNumericShortcut();
            }
            if (mo40284G) {
                numericModifiers = c0393i.getAlphabeticModifiers();
            } else {
                numericModifiers = c0393i.getNumericModifiers();
            }
            if ((modifiers & 69647) == (numericModifiers & 69647)) {
                z = true;
            } else {
                z = false;
            }
            if (z && numericShortcut != 0) {
                char[] cArr = keyData.meta;
                if ((numericShortcut == cArr[0] || numericShortcut == cArr[2] || (mo40284G && numericShortcut == '\b' && i == 67)) && c0393i.isEnabled()) {
                    list.add(c0393i);
                }
            }
        }
    }

    /* renamed from: r */
    public void m40354r() {
        ArrayList<C0393i> m40390E = m40390E();
        if (!this.f1340k) {
            return;
        }
        Iterator<WeakReference<InterfaceC0405m>> it = this.f1352w.iterator();
        boolean z = false;
        while (it.hasNext()) {
            WeakReference<InterfaceC0405m> next = it.next();
            InterfaceC0405m interfaceC0405m = next.get();
            if (interfaceC0405m == null) {
                this.f1352w.remove(next);
            } else {
                z |= interfaceC0405m.mo39989f();
            }
        }
        if (z) {
            this.f1338i.clear();
            this.f1339j.clear();
            int size = m40390E.size();
            for (int i = 0; i < size; i++) {
                C0393i c0393i = m40390E.get(i);
                if (c0393i.m40333l()) {
                    this.f1338i.add(c0393i);
                } else {
                    this.f1339j.add(c0393i);
                }
            }
        } else {
            this.f1338i.clear();
            this.f1339j.clear();
            this.f1339j.addAll(m40390E());
        }
        this.f1340k = false;
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int m40360l = m40360l(i);
        if (m40360l >= 0) {
            int size = this.f1335f.size() - m40360l;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f1335f.get(m40360l).getGroupId() != i) {
                    break;
                }
                m40384N(m40360l, false);
                i2 = i3;
            }
            m40387K(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        m40384N(m40357o(i), true);
    }

    /* renamed from: s */
    public ArrayList<C0393i> m40353s() {
        m40354r();
        return this.f1338i;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f1335f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0393i c0393i = this.f1335f.get(i2);
            if (c0393i.getGroupId() == i) {
                c0393i.m40325t(z2);
                c0393i.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f1354y = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.f1335f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0393i c0393i = this.f1335f.get(i2);
            if (c0393i.getGroupId() == i) {
                c0393i.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.f1335f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0393i c0393i = this.f1335f.get(i2);
            if (c0393i.getGroupId() == i && c0393i.m40320y(z)) {
                z2 = true;
            }
        }
        if (z2) {
            m40387K(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f1332c = z;
        m40387K(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f1335f.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: t */
    public String mo40277t() {
        return "android:menu:actionviewstates";
    }

    /* renamed from: u */
    public Context m40352u() {
        return this.f1330a;
    }

    /* renamed from: v */
    public C0393i m40351v() {
        return this.f1353x;
    }

    /* renamed from: w */
    public Drawable m40350w() {
        return this.f1344o;
    }

    /* renamed from: x */
    public CharSequence m40349x() {
        return this.f1343n;
    }

    /* renamed from: y */
    public View m40348y() {
        return this.f1345p;
    }

    /* renamed from: z */
    public ArrayList<C0393i> m40347z() {
        m40354r();
        return this.f1339j;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return m40372a(0, 0, 0, this.f1331b.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f1331b.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return m40372a(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0393i c0393i = (C0393i) m40372a(i, i2, i3, charSequence);
        SubMenuC0414r subMenuC0414r = new SubMenuC0414r(this.f1330a, this, c0393i);
        c0393i.m40321x(subMenuC0414r);
        return subMenuC0414r;
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return m40372a(i, i2, i3, this.f1331b.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f1331b.getString(i4));
    }
}
