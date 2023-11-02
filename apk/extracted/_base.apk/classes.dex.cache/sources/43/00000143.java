package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.C0341t;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.C0613x1;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.C0626b;
import androidx.core.p018os.C1049a;
import androidx.core.p018os.LocaleListCompat;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public abstract class AppCompatDelegate {

    /* renamed from: j */
    static C0341t.ExecutorC0342a f925j = new C0341t.ExecutorC0342a(new C0341t.ExecutorC0343b());

    /* renamed from: k */
    private static int f926k = -100;

    /* renamed from: l */
    private static LocaleListCompat f927l = null;

    /* renamed from: m */
    private static LocaleListCompat f928m = null;

    /* renamed from: n */
    private static Boolean f929n = null;

    /* renamed from: o */
    private static boolean f930o = false;

    /* renamed from: p */
    private static final C0626b<WeakReference<AppCompatDelegate>> f931p = new C0626b<>();

    /* renamed from: q */
    private static final Object f932q = new Object();

    /* renamed from: r */
    private static final Object f933r = new Object();

    /* renamed from: androidx.appcompat.app.AppCompatDelegate$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0285a {
        /* renamed from: a */
        public static LocaleList m40729a(String str) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(str);
            return forLanguageTags;
        }
    }

    /* renamed from: androidx.appcompat.app.AppCompatDelegate$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0286b {
        /* renamed from: a */
        static LocaleList m40728a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        /* renamed from: b */
        public static void m40727b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    /* renamed from: H */
    public static void m40746H(AppCompatDelegate appCompatDelegate) {
        synchronized (f932q) {
            m40745I(appCompatDelegate);
        }
    }

    /* renamed from: I */
    private static void m40745I(AppCompatDelegate appCompatDelegate) {
        synchronized (f932q) {
            Iterator<WeakReference<AppCompatDelegate>> it = f931p.iterator();
            while (it.hasNext()) {
                AppCompatDelegate appCompatDelegate2 = it.next().get();
                if (appCompatDelegate2 == appCompatDelegate || appCompatDelegate2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: K */
    public static void m40744K(boolean z) {
        C0613x1.m39577c(z);
    }

    /* renamed from: O */
    public static void m40743O(int i) {
        if (i != -1 && i != 0 && i != 1 && i != 2 && i != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f926k != i) {
            f926k = i;
            m40739g();
        }
    }

    /* renamed from: U */
    public static void m40742U(final Context context) {
        if (!m40731x(context)) {
            return;
        }
        if (C1049a.m37988c()) {
            if (!f930o) {
                f925j.execute(new Runnable() { // from class: androidx.appcompat.app.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        AppCompatDelegate.m40730y(context);
                    }
                });
                return;
            }
            return;
        }
        synchronized (f933r) {
            LocaleListCompat localeListCompat = f927l;
            if (localeListCompat == null) {
                if (f928m == null) {
                    f928m = LocaleListCompat.m38003c(C0341t.m40543b(context));
                }
                if (f928m.m38000f()) {
                    return;
                }
                f927l = f928m;
            } else if (!localeListCompat.equals(f928m)) {
                LocaleListCompat localeListCompat2 = f927l;
                f928m = localeListCompat2;
                C0341t.m40544a(context, localeListCompat2.m37998h());
            }
        }
    }

    /* renamed from: d */
    public static void m40740d(AppCompatDelegate appCompatDelegate) {
        synchronized (f932q) {
            m40745I(appCompatDelegate);
            f931p.add(new WeakReference<>(appCompatDelegate));
        }
    }

    /* renamed from: g */
    private static void m40739g() {
        synchronized (f932q) {
            Iterator<WeakReference<AppCompatDelegate>> it = f931p.iterator();
            while (it.hasNext()) {
                AppCompatDelegate appCompatDelegate = it.next().get();
                if (appCompatDelegate != null) {
                    appCompatDelegate.mo40641f();
                }
            }
        }
    }

    /* renamed from: j */
    public static AppCompatDelegate m40737j(Activity activity, InterfaceC0297c interfaceC0297c) {
        return new LayoutInflater$Factory2C0300f(activity, interfaceC0297c);
    }

    /* renamed from: k */
    public static AppCompatDelegate m40736k(Dialog dialog, InterfaceC0297c interfaceC0297c) {
        return new LayoutInflater$Factory2C0300f(dialog, interfaceC0297c);
    }

    /* renamed from: m */
    public static LocaleListCompat m40735m() {
        if (C1049a.m37988c()) {
            Object m40733r = m40733r();
            if (m40733r != null) {
                return LocaleListCompat.m37997i(C0286b.m40728a(m40733r));
            }
        } else {
            LocaleListCompat localeListCompat = f927l;
            if (localeListCompat != null) {
                return localeListCompat;
            }
        }
        return LocaleListCompat.m38001e();
    }

    /* renamed from: o */
    public static int m40734o() {
        return f926k;
    }

    /* renamed from: r */
    static Object m40733r() {
        Context mo40626n;
        Iterator<WeakReference<AppCompatDelegate>> it = f931p.iterator();
        while (it.hasNext()) {
            AppCompatDelegate appCompatDelegate = it.next().get();
            if (appCompatDelegate != null && (mo40626n = appCompatDelegate.mo40626n()) != null) {
                return mo40626n.getSystemService("locale");
            }
        }
        return null;
    }

    /* renamed from: t */
    public static LocaleListCompat m40732t() {
        return f927l;
    }

    /* renamed from: x */
    public static boolean m40731x(Context context) {
        if (f929n == null) {
            try {
                Bundle bundle = ServiceC0338r.m40546a(context).metaData;
                if (bundle != null) {
                    f929n = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f929n = Boolean.FALSE;
            }
        }
        return f929n.booleanValue();
    }

    /* renamed from: y */
    public static /* synthetic */ void m40730y(Context context) {
        C0341t.m40542c(context);
        f930o = true;
    }

    /* renamed from: A */
    public abstract void mo40699A(Bundle bundle);

    /* renamed from: B */
    public abstract void mo40697B();

    /* renamed from: C */
    public abstract void mo40695C(Bundle bundle);

    /* renamed from: D */
    public abstract void mo40693D();

    /* renamed from: E */
    public abstract void mo40691E(Bundle bundle);

    /* renamed from: F */
    public abstract void mo40689F();

    /* renamed from: G */
    public abstract void mo40687G();

    /* renamed from: J */
    public abstract boolean mo40683J(int i);

    /* renamed from: L */
    public abstract void mo40680L(int i);

    /* renamed from: M */
    public abstract void mo40678M(View view);

    /* renamed from: N */
    public abstract void mo40676N(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: P */
    public void mo40673P(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    /* renamed from: Q */
    public abstract void mo40671Q(Toolbar toolbar);

    /* renamed from: R */
    public void mo40669R(int i) {
    }

    /* renamed from: S */
    public abstract void mo40667S(CharSequence charSequence);

    /* renamed from: T */
    public abstract ActionMode mo40665T(ActionMode.Callback callback);

    /* renamed from: e */
    public abstract void mo40644e(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: f */
    public abstract boolean mo40641f();

    @Deprecated
    /* renamed from: h */
    public void m40738h(Context context) {
    }

    /* renamed from: i */
    public Context mo40634i(Context context) {
        m40738h(context);
        return context;
    }

    /* renamed from: l */
    public abstract <T extends View> T mo40629l(int i);

    /* renamed from: n */
    public Context mo40626n() {
        return null;
    }

    /* renamed from: p */
    public abstract ActionBarDrawerToggle$Delegate mo40623p();

    /* renamed from: q */
    public int mo40621q() {
        return -100;
    }

    /* renamed from: s */
    public abstract MenuInflater mo40618s();

    /* renamed from: u */
    public abstract ActionBar mo40615u();

    /* renamed from: v */
    public abstract void mo40613v();

    /* renamed from: w */
    public abstract void mo40611w();

    /* renamed from: z */
    public abstract void mo40607z(Configuration configuration);
}