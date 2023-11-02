package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import androidx.collection.C0629d;
import androidx.collection.SimpleArrayMap;
import androidx.collection.SparseArrayCompat;
import androidx.core.content.C0946a;
import androidx.core.graphics.drawable.C1013a;
import androidx.vectordrawable.graphics.drawable.C1906c;
import androidx.vectordrawable.graphics.drawable.C1915h;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p090f.C6270a;
import p109g.C6506c;
import p109g.C6507d;
import p236n.C10477a;

/* renamed from: androidx.appcompat.widget.c1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C0492c1 {

    /* renamed from: i */
    private static C0492c1 f1761i;

    /* renamed from: a */
    private WeakHashMap<Context, SparseArrayCompat<ColorStateList>> f1763a;

    /* renamed from: b */
    private SimpleArrayMap<String, InterfaceC0497e> f1764b;

    /* renamed from: c */
    private SparseArrayCompat<String> f1765c;

    /* renamed from: d */
    private final WeakHashMap<Context, C0629d<WeakReference<Drawable.ConstantState>>> f1766d = new WeakHashMap<>(0);

    /* renamed from: e */
    private TypedValue f1767e;

    /* renamed from: f */
    private boolean f1768f;

    /* renamed from: g */
    private InterfaceC0498f f1769g;

    /* renamed from: h */
    private static final PorterDuff.Mode f1760h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j */
    private static final C0495c f1762j = new C0495c(6);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.c1$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0493a implements InterfaceC0497e {
        C0493a() {
        }

        @Override // androidx.appcompat.widget.C0492c1.InterfaceC0497e
        /* renamed from: a */
        public Drawable mo39939a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C6270a.m23118m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c1$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0494b implements InterfaceC0497e {
        C0494b() {
        }

        @Override // androidx.appcompat.widget.C0492c1.InterfaceC0497e
        /* renamed from: a */
        public Drawable mo39939a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1906c.m35078a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c1$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0495c extends C10477a<Integer, PorterDuffColorFilter> {
        public C0495c(int i) {
            super(i);
        }

        /* renamed from: h */
        private static int m39942h(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* renamed from: i */
        PorterDuffColorFilter m39941i(int i, PorterDuff.Mode mode) {
            return m11428c(Integer.valueOf(m39942h(i, mode)));
        }

        /* renamed from: j */
        PorterDuffColorFilter m39940j(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return m11427d(Integer.valueOf(m39942h(i, mode)), porterDuffColorFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.c1$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0496d implements InterfaceC0497e {
        C0496d() {
        }

        @Override // androidx.appcompat.widget.C0492c1.InterfaceC0497e
        /* renamed from: a */
        public Drawable mo39939a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) C0496d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    C6506c.m22552c(drawable, context.getResources(), xmlPullParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                }
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c1$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC0497e {
        /* renamed from: a */
        Drawable mo39939a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: androidx.appcompat.widget.c1$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC0498f {
        /* renamed from: a */
        Drawable mo39831a(C0492c1 c0492c1, Context context, int i);

        /* renamed from: b */
        ColorStateList mo39830b(Context context, int i);

        /* renamed from: c */
        boolean mo39829c(Context context, int i, Drawable drawable);

        /* renamed from: d */
        PorterDuff.Mode mo39828d(int i);

        /* renamed from: e */
        boolean mo39827e(Context context, int i, Drawable drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.c1$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0499g implements InterfaceC0497e {
        C0499g() {
        }

        @Override // androidx.appcompat.widget.C0492c1.InterfaceC0497e
        /* renamed from: a */
        public Drawable mo39939a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1915h.m35051c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    private void m39966a(String str, InterfaceC0497e interfaceC0497e) {
        if (this.f1764b == null) {
            this.f1764b = new SimpleArrayMap<>();
        }
        this.f1764b.put(str, interfaceC0497e);
    }

    /* renamed from: b */
    private synchronized boolean m39965b(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C0629d<WeakReference<Drawable.ConstantState>> c0629d = this.f1766d.get(context);
            if (c0629d == null) {
                c0629d = new C0629d<>();
                this.f1766d.put(context, c0629d);
            }
            c0629d.m39484m(j, new WeakReference<>(constantState));
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m39964c(Context context, int i, ColorStateList colorStateList) {
        if (this.f1763a == null) {
            this.f1763a = new WeakHashMap<>();
        }
        SparseArrayCompat<ColorStateList> sparseArrayCompat = this.f1763a.get(context);
        if (sparseArrayCompat == null) {
            sparseArrayCompat = new SparseArrayCompat<>();
            this.f1763a.put(context, sparseArrayCompat);
        }
        sparseArrayCompat.m39520b(i, colorStateList);
    }

    /* renamed from: d */
    private void m39963d(Context context) {
        if (this.f1768f) {
            return;
        }
        this.f1768f = true;
        Drawable m39957j = m39957j(context, C6507d.f18310a);
        if (m39957j != null && m39950q(m39957j)) {
            return;
        }
        this.f1768f = false;
        throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
    }

    /* renamed from: e */
    private static long m39962e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    /* renamed from: f */
    private Drawable m39961f(Context context, int i) {
        Drawable mo39831a;
        if (this.f1767e == null) {
            this.f1767e = new TypedValue();
        }
        TypedValue typedValue = this.f1767e;
        context.getResources().getValue(i, typedValue, true);
        long m39962e = m39962e(typedValue);
        Drawable m39958i = m39958i(context, m39962e);
        if (m39958i != null) {
            return m39958i;
        }
        InterfaceC0498f interfaceC0498f = this.f1769g;
        if (interfaceC0498f == null) {
            mo39831a = null;
        } else {
            mo39831a = interfaceC0498f.mo39831a(this, context, i);
        }
        if (mo39831a != null) {
            mo39831a.setChangingConfigurations(typedValue.changingConfigurations);
            m39965b(context, m39962e, mo39831a);
        }
        return mo39831a;
    }

    /* renamed from: g */
    private static PorterDuffColorFilter m39960g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList != null && mode != null) {
            return m39955l(colorStateList.getColorForState(iArr, 0), mode);
        }
        return null;
    }

    /* renamed from: h */
    public static synchronized C0492c1 m39959h() {
        C0492c1 c0492c1;
        synchronized (C0492c1.class) {
            if (f1761i == null) {
                C0492c1 c0492c12 = new C0492c1();
                f1761i = c0492c12;
                m39951p(c0492c12);
            }
            c0492c1 = f1761i;
        }
        return c0492c1;
    }

    /* renamed from: i */
    private synchronized Drawable m39958i(Context context, long j) {
        C0629d<WeakReference<Drawable.ConstantState>> c0629d = this.f1766d.get(context);
        if (c0629d == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> m39488g = c0629d.m39488g(j);
        if (m39488g != null) {
            Drawable.ConstantState constantState = m39488g.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            c0629d.m39483n(j);
        }
        return null;
    }

    /* renamed from: l */
    public static synchronized PorterDuffColorFilter m39955l(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter m39941i;
        synchronized (C0492c1.class) {
            C0495c c0495c = f1762j;
            m39941i = c0495c.m39941i(i, mode);
            if (m39941i == null) {
                m39941i = new PorterDuffColorFilter(i, mode);
                c0495c.m39940j(i, mode, m39941i);
            }
        }
        return m39941i;
    }

    /* renamed from: n */
    private ColorStateList m39953n(Context context, int i) {
        SparseArrayCompat<ColorStateList> sparseArrayCompat;
        WeakHashMap<Context, SparseArrayCompat<ColorStateList>> weakHashMap = this.f1763a;
        if (weakHashMap == null || (sparseArrayCompat = weakHashMap.get(context)) == null) {
            return null;
        }
        return sparseArrayCompat.m39516f(i);
    }

    /* renamed from: p */
    private static void m39951p(C0492c1 c0492c1) {
        if (Build.VERSION.SDK_INT < 24) {
            c0492c1.m39966a("vector", new C0499g());
            c0492c1.m39966a("animated-vector", new C0494b());
            c0492c1.m39966a("animated-selector", new C0493a());
            c0492c1.m39966a("drawable", new C0496d());
        }
    }

    /* renamed from: q */
    private static boolean m39950q(Drawable drawable) {
        if (!(drawable instanceof C1915h) && !"android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    private Drawable m39949r(Context context, int i) {
        int next;
        SimpleArrayMap<String, InterfaceC0497e> simpleArrayMap = this.f1764b;
        if (simpleArrayMap == null || simpleArrayMap.isEmpty()) {
            return null;
        }
        SparseArrayCompat<String> sparseArrayCompat = this.f1765c;
        if (sparseArrayCompat != null) {
            String m39516f = sparseArrayCompat.m39516f(i);
            if ("appcompat_skip_skip".equals(m39516f) || (m39516f != null && this.f1764b.get(m39516f) == null)) {
                return null;
            }
        } else {
            this.f1765c = new SparseArrayCompat<>();
        }
        if (this.f1767e == null) {
            this.f1767e = new TypedValue();
        }
        TypedValue typedValue = this.f1767e;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long m39962e = m39962e(typedValue);
        Drawable m39958i = m39958i(context, m39962e);
        if (m39958i != null) {
            return m39958i;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        break;
                    }
                }
                if (next == 2) {
                    String name = xml.getName();
                    this.f1765c.m39520b(i, name);
                    InterfaceC0497e interfaceC0497e = this.f1764b.get(name);
                    if (interfaceC0497e != null) {
                        m39958i = interfaceC0497e.mo39939a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (m39958i != null) {
                        m39958i.setChangingConfigurations(typedValue.changingConfigurations);
                        m39965b(context, m39962e, m39958i);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception e) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e);
            }
        }
        if (m39958i == null) {
            this.f1765c.m39520b(i, "appcompat_skip_skip");
        }
        return m39958i;
    }

    /* renamed from: v */
    private Drawable m39945v(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList m39954m = m39954m(context, i);
        if (m39954m != null) {
            if (C0550p0.m39770a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable m38080r = C1013a.m38080r(drawable);
            C1013a.m38083o(m38080r, m39954m);
            PorterDuff.Mode m39952o = m39952o(i);
            if (m39952o != null) {
                C1013a.m38082p(m38080r, m39952o);
                return m38080r;
            }
            return m38080r;
        }
        InterfaceC0498f interfaceC0498f = this.f1769g;
        if ((interfaceC0498f == null || !interfaceC0498f.mo39827e(context, i, drawable)) && !m39943x(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public static void m39944w(Drawable drawable, C0538l1 c0538l1, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        boolean z;
        int[] state = drawable.getState();
        if (C0550p0.m39770a(drawable)) {
            if (drawable.mutate() == drawable) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
                return;
            }
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = c0538l1.f1891d;
        if (!z2 && !c0538l1.f1890c) {
            drawable.clearColorFilter();
        } else {
            if (z2) {
                colorStateList = c0538l1.f1888a;
            } else {
                colorStateList = null;
            }
            if (c0538l1.f1890c) {
                mode = c0538l1.f1889b;
            } else {
                mode = f1760h;
            }
            drawable.setColorFilter(m39960g(colorStateList, mode, iArr));
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    /* renamed from: j */
    public synchronized Drawable m39957j(Context context, int i) {
        return m39956k(context, i, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public synchronized Drawable m39956k(Context context, int i, boolean z) {
        Drawable m39949r;
        m39963d(context);
        m39949r = m39949r(context, i);
        if (m39949r == null) {
            m39949r = m39961f(context, i);
        }
        if (m39949r == null) {
            m39949r = C0946a.m38399e(context, i);
        }
        if (m39949r != null) {
            m39949r = m39945v(context, i, z, m39949r);
        }
        if (m39949r != null) {
            C0550p0.m39769b(m39949r);
        }
        return m39949r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public synchronized ColorStateList m39954m(Context context, int i) {
        ColorStateList m39953n;
        m39953n = m39953n(context, i);
        if (m39953n == null) {
            InterfaceC0498f interfaceC0498f = this.f1769g;
            if (interfaceC0498f == null) {
                m39953n = null;
            } else {
                m39953n = interfaceC0498f.mo39830b(context, i);
            }
            if (m39953n != null) {
                m39964c(context, i, m39953n);
            }
        }
        return m39953n;
    }

    /* renamed from: o */
    PorterDuff.Mode m39952o(int i) {
        InterfaceC0498f interfaceC0498f = this.f1769g;
        if (interfaceC0498f == null) {
            return null;
        }
        return interfaceC0498f.mo39828d(i);
    }

    /* renamed from: s */
    public synchronized void m39948s(Context context) {
        C0629d<WeakReference<Drawable.ConstantState>> c0629d = this.f1766d.get(context);
        if (c0629d != null) {
            c0629d.m39492c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public synchronized Drawable m39947t(Context context, C0613x1 c0613x1, int i) {
        Drawable m39949r = m39949r(context, i);
        if (m39949r == null) {
            m39949r = c0613x1.m39936a(i);
        }
        if (m39949r != null) {
            return m39945v(context, i, false, m39949r);
        }
        return null;
    }

    /* renamed from: u */
    public synchronized void m39946u(InterfaceC0498f interfaceC0498f) {
        this.f1769g = interfaceC0498f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public boolean m39943x(Context context, int i, Drawable drawable) {
        InterfaceC0498f interfaceC0498f = this.f1769g;
        return interfaceC0498f != null && interfaceC0498f.mo39829c(context, i, drawable);
    }
}
