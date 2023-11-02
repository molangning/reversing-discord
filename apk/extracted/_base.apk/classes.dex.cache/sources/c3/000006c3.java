package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class FragmentTransaction {

    /* renamed from: a */
    private final C1599e f4118a;

    /* renamed from: b */
    private final ClassLoader f4119b;

    /* renamed from: c */
    ArrayList<C1573a> f4120c;

    /* renamed from: d */
    int f4121d;

    /* renamed from: e */
    int f4122e;

    /* renamed from: f */
    int f4123f;

    /* renamed from: g */
    int f4124g;

    /* renamed from: h */
    int f4125h;

    /* renamed from: i */
    boolean f4126i;

    /* renamed from: j */
    boolean f4127j;

    /* renamed from: k */
    String f4128k;

    /* renamed from: l */
    int f4129l;

    /* renamed from: m */
    CharSequence f4130m;

    /* renamed from: n */
    int f4131n;

    /* renamed from: o */
    CharSequence f4132o;

    /* renamed from: p */
    ArrayList<String> f4133p;

    /* renamed from: q */
    ArrayList<String> f4134q;

    /* renamed from: r */
    boolean f4135r;

    /* renamed from: s */
    ArrayList<Runnable> f4136s;

    /* renamed from: androidx.fragment.app.FragmentTransaction$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1573a {

        /* renamed from: a */
        int f4137a;

        /* renamed from: b */
        Fragment f4138b;

        /* renamed from: c */
        int f4139c;

        /* renamed from: d */
        int f4140d;

        /* renamed from: e */
        int f4141e;

        /* renamed from: f */
        int f4142f;

        /* renamed from: g */
        Lifecycle.State f4143g;

        /* renamed from: h */
        Lifecycle.State f4144h;

        public C1573a() {
        }

        public C1573a(int i, Fragment fragment) {
            this.f4137a = i;
            this.f4138b = fragment;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            this.f4143g = state;
            this.f4144h = state;
        }
    }

    @Deprecated
    public FragmentTransaction() {
        this.f4120c = new ArrayList<>();
        this.f4127j = true;
        this.f4135r = false;
        this.f4118a = null;
        this.f4119b = null;
    }

    /* renamed from: b */
    public FragmentTransaction m36358b(int i, Fragment fragment) {
        mo36327l(i, fragment, null, 1);
        return this;
    }

    /* renamed from: c */
    public FragmentTransaction m36357c(int i, Fragment fragment, String str) {
        mo36327l(i, fragment, str, 1);
        return this;
    }

    /* renamed from: d */
    public FragmentTransaction m36356d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return m36357c(viewGroup.getId(), fragment, str);
    }

    /* renamed from: e */
    public FragmentTransaction m36355e(Fragment fragment, String str) {
        mo36327l(0, fragment, str, 1);
        return this;
    }

    /* renamed from: f */
    public void m36354f(C1573a c1573a) {
        this.f4120c.add(c1573a);
        c1573a.f4139c = this.f4121d;
        c1573a.f4140d = this.f4122e;
        c1573a.f4141e = this.f4123f;
        c1573a.f4142f = this.f4124g;
    }

    /* renamed from: g */
    public abstract int mo36331g();

    /* renamed from: h */
    public abstract int mo36330h();

    /* renamed from: i */
    public abstract void mo36329i();

    /* renamed from: j */
    public abstract void mo36328j();

    /* renamed from: k */
    public FragmentTransaction m36353k() {
        if (!this.f4126i) {
            this.f4127j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* renamed from: l */
    public void mo36327l(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str2 = fragment.mTag;
                if (str2 != null && !str.equals(str2)) {
                    throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
                }
                fragment.mTag = str;
            }
            if (i != 0) {
                if (i != -1) {
                    int i3 = fragment.mFragmentId;
                    if (i3 != 0 && i3 != i) {
                        throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
                    }
                    fragment.mFragmentId = i;
                    fragment.mContainerId = i;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
                }
            }
            m36354f(new C1573a(i2, fragment));
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    /* renamed from: m */
    public FragmentTransaction mo36326m(Fragment fragment) {
        m36354f(new C1573a(3, fragment));
        return this;
    }

    /* renamed from: n */
    public FragmentTransaction m36352n(int i, Fragment fragment) {
        return m36351o(i, fragment, null);
    }

    /* renamed from: o */
    public FragmentTransaction m36351o(int i, Fragment fragment, String str) {
        if (i != 0) {
            mo36327l(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: p */
    public FragmentTransaction m36350p(Runnable runnable) {
        m36353k();
        if (this.f4136s == null) {
            this.f4136s = new ArrayList<>();
        }
        this.f4136s.add(runnable);
        return this;
    }

    /* renamed from: q */
    public FragmentTransaction m36349q(int i, int i2) {
        return m36348r(i, i2, 0, 0);
    }

    /* renamed from: r */
    public FragmentTransaction m36348r(int i, int i2, int i3, int i4) {
        this.f4121d = i;
        this.f4122e = i2;
        this.f4123f = i3;
        this.f4124g = i4;
        return this;
    }

    /* renamed from: s */
    public FragmentTransaction m36347s(boolean z) {
        this.f4135r = z;
        return this;
    }

    public FragmentTransaction(C1599e c1599e, ClassLoader classLoader) {
        this.f4120c = new ArrayList<>();
        this.f4127j = true;
        this.f4135r = false;
        this.f4118a = c1599e;
        this.f4119b = classLoader;
    }
}