package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0393i;
import androidx.appcompat.view.menu.MenuItemC0395j;
import androidx.appcompat.widget.C0544n1;
import androidx.appcompat.widget.C0550p0;
import androidx.core.view.AbstractC1228b;
import androidx.core.view.C1296m0;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;
import p052d.C5715j;
import p391w.InterfaceMenuC13351a;

/* renamed from: androidx.appcompat.view.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0364f extends MenuInflater {

    /* renamed from: e */
    static final Class<?>[] f1159e;

    /* renamed from: f */
    static final Class<?>[] f1160f;

    /* renamed from: a */
    final Object[] f1161a;

    /* renamed from: b */
    final Object[] f1162b;

    /* renamed from: c */
    Context f1163c;

    /* renamed from: d */
    private Object f1164d;

    /* renamed from: androidx.appcompat.view.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class MenuItem$OnMenuItemClickListenerC0365a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c */
        private static final Class<?>[] f1165c = {MenuItem.class};

        /* renamed from: a */
        private Object f1166a;

        /* renamed from: b */
        private Method f1167b;

        public MenuItem$OnMenuItemClickListenerC0365a(Object obj, String str) {
            this.f1166a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f1167b = cls.getMethod(str, f1165c);
            } catch (Exception e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f1167b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f1167b.invoke(this.f1166a, menuItem)).booleanValue();
                }
                this.f1167b.invoke(this.f1166a, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: androidx.appcompat.view.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0366b {

        /* renamed from: A */
        AbstractC1228b f1168A;

        /* renamed from: B */
        private CharSequence f1169B;

        /* renamed from: C */
        private CharSequence f1170C;

        /* renamed from: D */
        private ColorStateList f1171D = null;

        /* renamed from: E */
        private PorterDuff.Mode f1172E = null;

        /* renamed from: a */
        private Menu f1174a;

        /* renamed from: b */
        private int f1175b;

        /* renamed from: c */
        private int f1176c;

        /* renamed from: d */
        private int f1177d;

        /* renamed from: e */
        private int f1178e;

        /* renamed from: f */
        private boolean f1179f;

        /* renamed from: g */
        private boolean f1180g;

        /* renamed from: h */
        private boolean f1181h;

        /* renamed from: i */
        private int f1182i;

        /* renamed from: j */
        private int f1183j;

        /* renamed from: k */
        private CharSequence f1184k;

        /* renamed from: l */
        private CharSequence f1185l;

        /* renamed from: m */
        private int f1186m;

        /* renamed from: n */
        private char f1187n;

        /* renamed from: o */
        private int f1188o;

        /* renamed from: p */
        private char f1189p;

        /* renamed from: q */
        private int f1190q;

        /* renamed from: r */
        private int f1191r;

        /* renamed from: s */
        private boolean f1192s;

        /* renamed from: t */
        private boolean f1193t;

        /* renamed from: u */
        private boolean f1194u;

        /* renamed from: v */
        private int f1195v;

        /* renamed from: w */
        private int f1196w;

        /* renamed from: x */
        private String f1197x;

        /* renamed from: y */
        private String f1198y;

        /* renamed from: z */
        private String f1199z;

        public C0366b(Menu menu) {
            C0364f.this = r1;
            this.f1174a = menu;
            m40449h();
        }

        /* renamed from: c */
        private char m40454c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        /* renamed from: e */
        private <T> T m40452e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C0364f.this.f1163c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        /* renamed from: i */
        private void m40448i(MenuItem menuItem) {
            boolean z;
            MenuItem enabled = menuItem.setChecked(this.f1192s).setVisible(this.f1193t).setEnabled(this.f1194u);
            boolean z2 = false;
            if (this.f1191r >= 1) {
                z = true;
            } else {
                z = false;
            }
            enabled.setCheckable(z).setTitleCondensed(this.f1185l).setIcon(this.f1186m);
            int i = this.f1195v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f1199z != null) {
                if (!C0364f.this.f1163c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new MenuItem$OnMenuItemClickListenerC0365a(C0364f.this.m40458b(), this.f1199z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f1191r >= 2) {
                if (menuItem instanceof C0393i) {
                    ((C0393i) menuItem).m40325t(true);
                } else if (menuItem instanceof MenuItemC0395j) {
                    ((MenuItemC0395j) menuItem).m40318h(true);
                }
            }
            String str = this.f1197x;
            if (str != null) {
                menuItem.setActionView((View) m40452e(str, C0364f.f1159e, C0364f.this.f1161a));
                z2 = true;
            }
            int i2 = this.f1196w;
            if (i2 > 0) {
                if (!z2) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            AbstractC1228b abstractC1228b = this.f1168A;
            if (abstractC1228b != null) {
                C1296m0.m37396a(menuItem, abstractC1228b);
            }
            C1296m0.m37394c(menuItem, this.f1169B);
            C1296m0.m37390g(menuItem, this.f1170C);
            C1296m0.m37395b(menuItem, this.f1187n, this.f1188o);
            C1296m0.m37391f(menuItem, this.f1189p, this.f1190q);
            PorterDuff.Mode mode = this.f1172E;
            if (mode != null) {
                C1296m0.m37392e(menuItem, mode);
            }
            ColorStateList colorStateList = this.f1171D;
            if (colorStateList != null) {
                C1296m0.m37393d(menuItem, colorStateList);
            }
        }

        /* renamed from: a */
        public void m40456a() {
            this.f1181h = true;
            m40448i(this.f1174a.add(this.f1175b, this.f1182i, this.f1183j, this.f1184k));
        }

        /* renamed from: b */
        public SubMenu m40455b() {
            this.f1181h = true;
            SubMenu addSubMenu = this.f1174a.addSubMenu(this.f1175b, this.f1182i, this.f1183j, this.f1184k);
            m40448i(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: d */
        public boolean m40453d() {
            return this.f1181h;
        }

        /* renamed from: f */
        public void m40451f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0364f.this.f1163c.obtainStyledAttributes(attributeSet, C5715j.f16417o1);
            this.f1175b = obtainStyledAttributes.getResourceId(C5715j.f16427q1, 0);
            this.f1176c = obtainStyledAttributes.getInt(C5715j.f16437s1, 0);
            this.f1177d = obtainStyledAttributes.getInt(C5715j.f16442t1, 0);
            this.f1178e = obtainStyledAttributes.getInt(C5715j.f16447u1, 0);
            this.f1179f = obtainStyledAttributes.getBoolean(C5715j.f16432r1, true);
            this.f1180g = obtainStyledAttributes.getBoolean(C5715j.f16422p1, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: g */
        public void m40450g(AttributeSet attributeSet) {
            boolean z;
            C0544n1 m39781u = C0544n1.m39781u(C0364f.this.f1163c, attributeSet, C5715j.f16452v1);
            this.f1182i = m39781u.m39788n(C5715j.f16467y1, 0);
            this.f1183j = (m39781u.m39791k(C5715j.f16230B1, this.f1176c) & (-65536)) | (m39781u.m39791k(C5715j.f16235C1, this.f1177d) & 65535);
            this.f1184k = m39781u.m39786p(C5715j.f16240D1);
            this.f1185l = m39781u.m39786p(C5715j.f16245E1);
            this.f1186m = m39781u.m39788n(C5715j.f16457w1, 0);
            this.f1187n = m40454c(m39781u.m39787o(C5715j.f16250F1));
            this.f1188o = m39781u.m39791k(C5715j.f16285M1, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
            this.f1189p = m40454c(m39781u.m39787o(C5715j.f16255G1));
            this.f1190q = m39781u.m39791k(C5715j.f16305Q1, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
            int i = C5715j.f16260H1;
            if (m39781u.m39783s(i)) {
                this.f1191r = m39781u.m39801a(i, false) ? 1 : 0;
            } else {
                this.f1191r = this.f1178e;
            }
            this.f1192s = m39781u.m39801a(C5715j.f16472z1, false);
            this.f1193t = m39781u.m39801a(C5715j.f16225A1, this.f1179f);
            this.f1194u = m39781u.m39801a(C5715j.f16462x1, this.f1180g);
            this.f1195v = m39781u.m39791k(C5715j.f16310R1, -1);
            this.f1199z = m39781u.m39787o(C5715j.f16265I1);
            this.f1196w = m39781u.m39788n(C5715j.f16270J1, 0);
            this.f1197x = m39781u.m39787o(C5715j.f16280L1);
            String m39787o = m39781u.m39787o(C5715j.f16275K1);
            this.f1198y = m39787o;
            if (m39787o != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && this.f1196w == 0 && this.f1197x == null) {
                this.f1168A = (AbstractC1228b) m40452e(m39787o, C0364f.f1160f, C0364f.this.f1162b);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f1168A = null;
            }
            this.f1169B = m39781u.m39786p(C5715j.f16290N1);
            this.f1170C = m39781u.m39786p(C5715j.f16315S1);
            int i2 = C5715j.f16300P1;
            if (m39781u.m39783s(i2)) {
                this.f1172E = C0550p0.m39766e(m39781u.m39791k(i2, -1), this.f1172E);
            } else {
                this.f1172E = null;
            }
            int i3 = C5715j.f16295O1;
            if (m39781u.m39783s(i3)) {
                this.f1171D = m39781u.m39799c(i3);
            } else {
                this.f1171D = null;
            }
            m39781u.m39779w();
            this.f1181h = false;
        }

        /* renamed from: h */
        public void m40449h() {
            this.f1175b = 0;
            this.f1176c = 0;
            this.f1177d = 0;
            this.f1178e = 0;
            this.f1179f = true;
            this.f1180g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f1159e = clsArr;
        f1160f = clsArr;
    }

    public C0364f(Context context) {
        super(context);
        this.f1163c = context;
        Object[] objArr = {context};
        this.f1161a = objArr;
        this.f1162b = objArr;
    }

    /* renamed from: a */
    private Object m40459a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            return m40459a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0062, code lost:
        if (r15.equals("group") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0064, code lost:
        r0.m40449h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x006c, code lost:
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0072, code lost:
        if (r0.m40453d() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0074, code lost:
        r15 = r0.f1168A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0076, code lost:
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x007c, code lost:
        if (r15.mo37491a() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x007e, code lost:
        r0.m40455b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0082, code lost:
        r0.m40456a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x008a, code lost:
        if (r15.equals("menu") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x008c, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x008e, code lost:
        if (r7 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0091, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0099, code lost:
        if (r15.equals("group") == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x009b, code lost:
        r0.m40451f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x00a3, code lost:
        if (r15.equals("item") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00a5, code lost:
        r0.m40450g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00ad, code lost:
        if (r15.equals("menu") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00af, code lost:
        m40457c(r13, r14, r0.m40455b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00b7, code lost:
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00b9, code lost:
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00c5, code lost:
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00c6, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x003b, code lost:
        r6 = false;
        r7 = false;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0040, code lost:
        if (r6 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0042, code lost:
        if (r15 == 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0048, code lost:
        if (r15 == 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x004b, code lost:
        if (r15 == 3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x004f, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0053, code lost:
        if (r7 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0059, code lost:
        if (r15.equals(r8) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x005b, code lost:
        r7 = false;
        r8 = null;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m40457c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) {
        /*
            r12 = this;
            androidx.appcompat.view.f$b r0 = new androidx.appcompat.view.f$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r6 = r4
            r7 = r6
            r8 = r5
        L40:
            if (r6 != 0) goto Lc6
            if (r15 == r3) goto Lbe
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L8e
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lb9
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r7 = r4
            r8 = r5
            goto Lb9
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.m40449h()
            goto Lb9
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L86
            boolean r15 = r0.m40453d()
            if (r15 != 0) goto Lb9
            androidx.core.view.b r15 = r0.f1168A
            if (r15 == 0) goto L82
            boolean r15 = r15.mo37491a()
            if (r15 == 0) goto L82
            r0.m40455b()
            goto Lb9
        L82:
            r0.m40456a()
            goto Lb9
        L86:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lb9
            r6 = r3
            goto Lb9
        L8e:
            if (r7 == 0) goto L91
            goto Lb9
        L91:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L9f
            r0.m40451f(r14)
            goto Lb9
        L9f:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La9
            r0.m40450g(r14)
            goto Lb9
        La9:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb7
            android.view.SubMenu r15 = r0.m40455b()
            r12.m40457c(r13, r14, r15)
            goto Lb9
        Lb7:
            r8 = r15
            r7 = r3
        Lb9:
            int r15 = r13.next()
            goto L40
        Lbe:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.C0364f.m40457c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    /* renamed from: b */
    Object m40458b() {
        if (this.f1164d == null) {
            this.f1164d = m40459a(this.f1163c);
        }
        return this.f1164d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof InterfaceMenuC13351a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f1163c.getResources().getLayout(i);
                    m40457c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (IOException e) {
                    throw new InflateException("Error inflating menu XML", e);
                }
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}