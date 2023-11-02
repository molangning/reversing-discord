package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.C0359c;
import androidx.appcompat.view.C0362e;
import androidx.appcompat.view.C0364f;
import androidx.appcompat.view.Window$CallbackC0369h;
import androidx.appcompat.view.menu.C0386e;
import androidx.appcompat.view.menu.C0389g;
import androidx.appcompat.view.menu.InterfaceC0405m;
import androidx.appcompat.view.menu.InterfaceC0407n;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.C0529j;
import androidx.appcompat.widget.C0544n1;
import androidx.appcompat.widget.C0613x1;
import androidx.appcompat.widget.C0616y1;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.InterfaceC0531j0;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.C0857n;
import androidx.core.content.C0946a;
import androidx.core.content.res.C0980h;
import androidx.core.p018os.LocaleListCompat;
import androidx.core.util.C1134c;
import androidx.core.view.C1304n2;
import androidx.core.view.C1316p2;
import androidx.core.view.C1352u;
import androidx.core.view.C1358v;
import androidx.core.view.C1365w0;
import androidx.core.view.InterfaceC1324r0;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.webrtc.MediaStreamTrack;
import org.xmlpull.v1.XmlPullParser;
import p052d.C5706a;
import p052d.C5708c;
import p052d.C5711f;
import p052d.C5712g;
import p052d.C5714i;
import p052d.C5715j;
import p071e.C6029a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.app.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class LayoutInflater$Factory2C0300f extends AppCompatDelegate implements C0389g.InterfaceC0390a, LayoutInflater.Factory2 {

    /* renamed from: s0 */
    private static final SimpleArrayMap<String, Integer> f980s0 = new SimpleArrayMap<>();

    /* renamed from: t0 */
    private static final boolean f981t0 = false;

    /* renamed from: u0 */
    private static final int[] f982u0 = {16842836};

    /* renamed from: v0 */
    private static final boolean f983v0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: w0 */
    private static final boolean f984w0 = true;

    /* renamed from: A */
    private InterfaceC0531j0 f985A;

    /* renamed from: B */
    private C0309h f986B;

    /* renamed from: C */
    private C0325v f987C;

    /* renamed from: D */
    ActionMode f988D;

    /* renamed from: E */
    ActionBarContextView f989E;

    /* renamed from: F */
    PopupWindow f990F;

    /* renamed from: G */
    Runnable f991G;

    /* renamed from: H */
    C1304n2 f992H;

    /* renamed from: I */
    private boolean f993I;

    /* renamed from: J */
    private boolean f994J;

    /* renamed from: K */
    ViewGroup f995K;

    /* renamed from: L */
    private TextView f996L;

    /* renamed from: M */
    private View f997M;

    /* renamed from: N */
    private boolean f998N;

    /* renamed from: O */
    private boolean f999O;

    /* renamed from: P */
    boolean f1000P;

    /* renamed from: Q */
    boolean f1001Q;

    /* renamed from: R */
    boolean f1002R;

    /* renamed from: S */
    boolean f1003S;

    /* renamed from: T */
    boolean f1004T;

    /* renamed from: U */
    private boolean f1005U;

    /* renamed from: V */
    private C0324u[] f1006V;

    /* renamed from: W */
    private C0324u f1007W;

    /* renamed from: X */
    private boolean f1008X;

    /* renamed from: Y */
    private boolean f1009Y;

    /* renamed from: Z */
    private boolean f1010Z;

    /* renamed from: a0 */
    boolean f1011a0;

    /* renamed from: b0 */
    private Configuration f1012b0;

    /* renamed from: c0 */
    private int f1013c0;

    /* renamed from: d0 */
    private int f1014d0;

    /* renamed from: e0 */
    private int f1015e0;

    /* renamed from: f0 */
    private boolean f1016f0;

    /* renamed from: g0 */
    private AbstractC0319q f1017g0;

    /* renamed from: h0 */
    private AbstractC0319q f1018h0;

    /* renamed from: i0 */
    boolean f1019i0;

    /* renamed from: j0 */
    int f1020j0;

    /* renamed from: k0 */
    private final Runnable f1021k0;

    /* renamed from: l0 */
    private boolean f1022l0;

    /* renamed from: m0 */
    private Rect f1023m0;

    /* renamed from: n0 */
    private Rect f1024n0;

    /* renamed from: o0 */
    private C0336q f1025o0;

    /* renamed from: p0 */
    private C0344u f1026p0;

    /* renamed from: q0 */
    private OnBackInvokedDispatcher f1027q0;

    /* renamed from: r0 */
    private OnBackInvokedCallback f1028r0;

    /* renamed from: s */
    final Object f1029s;

    /* renamed from: t */
    final Context f1030t;

    /* renamed from: u */
    Window f1031u;

    /* renamed from: v */
    private C0317o f1032v;

    /* renamed from: w */
    final InterfaceC0297c f1033w;

    /* renamed from: x */
    ActionBar f1034x;

    /* renamed from: y */
    MenuInflater f1035y;

    /* renamed from: z */
    private CharSequence f1036z;

    /* renamed from: androidx.appcompat.app.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC0301a implements Runnable {
        RunnableC0301a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflater$Factory2C0300f layoutInflater$Factory2C0300f = LayoutInflater$Factory2C0300f.this;
            if ((layoutInflater$Factory2C0300f.f1020j0 & 1) != 0) {
                layoutInflater$Factory2C0300f.m40628l0(0);
            }
            LayoutInflater$Factory2C0300f layoutInflater$Factory2C0300f2 = LayoutInflater$Factory2C0300f.this;
            if ((layoutInflater$Factory2C0300f2.f1020j0 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                layoutInflater$Factory2C0300f2.m40628l0(108);
            }
            LayoutInflater$Factory2C0300f layoutInflater$Factory2C0300f3 = LayoutInflater$Factory2C0300f.this;
            layoutInflater$Factory2C0300f3.f1019i0 = false;
            layoutInflater$Factory2C0300f3.f1020j0 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0302b implements InterfaceC1324r0 {
        C0302b() {
        }

        @Override // androidx.core.view.InterfaceC1324r0
        /* renamed from: a */
        public WindowInsetsCompat mo24794a(View view, WindowInsetsCompat windowInsetsCompat) {
            int m37732o = windowInsetsCompat.m37732o();
            int m40635h1 = LayoutInflater$Factory2C0300f.this.m40635h1(windowInsetsCompat, null);
            if (m37732o != m40635h1) {
                windowInsetsCompat = windowInsetsCompat.m37728s(windowInsetsCompat.m37734m(), m40635h1, windowInsetsCompat.m37733n(), windowInsetsCompat.m37735l());
            }
            return C1365w0.m37213c0(view, windowInsetsCompat);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0303c implements ContentFrameLayout.InterfaceC0438a {
        C0303c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0438a
        /* renamed from: a */
        public void mo40133a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.InterfaceC0438a
        public void onDetachedFromWindow() {
            LayoutInflater$Factory2C0300f.this.m40631j0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC0304d implements Runnable {

        /* renamed from: androidx.appcompat.app.f$d$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class C0305a extends C1316p2 {
            C0305a() {
            }

            @Override // androidx.core.view.InterfaceC1311o2
            /* renamed from: b */
            public void mo37354b(View view) {
                LayoutInflater$Factory2C0300f.this.f989E.setAlpha(1.0f);
                LayoutInflater$Factory2C0300f.this.f992H.m37364h(null);
                LayoutInflater$Factory2C0300f.this.f992H = null;
            }

            @Override // androidx.core.view.C1316p2, androidx.core.view.InterfaceC1311o2
            /* renamed from: c */
            public void mo37349c(View view) {
                LayoutInflater$Factory2C0300f.this.f989E.setVisibility(0);
            }
        }

        RunnableC0304d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflater$Factory2C0300f layoutInflater$Factory2C0300f = LayoutInflater$Factory2C0300f.this;
            layoutInflater$Factory2C0300f.f990F.showAtLocation(layoutInflater$Factory2C0300f.f989E, 55, 0, 0);
            LayoutInflater$Factory2C0300f.this.m40627m0();
            if (LayoutInflater$Factory2C0300f.this.m40657X0()) {
                LayoutInflater$Factory2C0300f.this.f989E.setAlpha(0.0f);
                LayoutInflater$Factory2C0300f layoutInflater$Factory2C0300f2 = LayoutInflater$Factory2C0300f.this;
                layoutInflater$Factory2C0300f2.f992H = C1365w0.m37210e(layoutInflater$Factory2C0300f2.f989E).m37370b(1.0f);
                LayoutInflater$Factory2C0300f.this.f992H.m37364h(new C0305a());
                return;
            }
            LayoutInflater$Factory2C0300f.this.f989E.setAlpha(1.0f);
            LayoutInflater$Factory2C0300f.this.f989E.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0306e extends C1316p2 {
        C0306e() {
        }

        @Override // androidx.core.view.InterfaceC1311o2
        /* renamed from: b */
        public void mo37354b(View view) {
            LayoutInflater$Factory2C0300f.this.f989E.setAlpha(1.0f);
            LayoutInflater$Factory2C0300f.this.f992H.m37364h(null);
            LayoutInflater$Factory2C0300f.this.f992H = null;
        }

        @Override // androidx.core.view.C1316p2, androidx.core.view.InterfaceC1311o2
        /* renamed from: c */
        public void mo37349c(View view) {
            LayoutInflater$Factory2C0300f.this.f989E.setVisibility(0);
            if (LayoutInflater$Factory2C0300f.this.f989E.getParent() instanceof View) {
                C1365w0.m37191n0((View) LayoutInflater$Factory2C0300f.this.f989E.getParent());
            }
        }
    }

    /* renamed from: androidx.appcompat.app.f$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private class C0307f implements ActionBarDrawerToggle$Delegate {
        C0307f() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC0308g {
        /* renamed from: a */
        boolean mo40506a(int i);

        View onCreatePanelView(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.f$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public final class C0309h implements InterfaceC0405m.InterfaceC0406a {
        C0309h() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0405m.InterfaceC0406a
        /* renamed from: a */
        public void mo39969a(C0389g c0389g, boolean z) {
            LayoutInflater$Factory2C0300f.this.m40648c0(c0389g);
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0405m.InterfaceC0406a
        /* renamed from: b */
        public boolean mo39968b(C0389g c0389g) {
            Window.Callback m40608y0 = LayoutInflater$Factory2C0300f.this.m40608y0();
            if (m40608y0 != null) {
                m40608y0.onMenuOpened(108, c0389g);
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0310i implements ActionMode.Callback {

        /* renamed from: a */
        private ActionMode.Callback f1045a;

        /* renamed from: androidx.appcompat.app.f$i$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class C0311a extends C1316p2 {
            C0311a() {
            }

            @Override // androidx.core.view.InterfaceC1311o2
            /* renamed from: b */
            public void mo37354b(View view) {
                LayoutInflater$Factory2C0300f.this.f989E.setVisibility(8);
                LayoutInflater$Factory2C0300f layoutInflater$Factory2C0300f = LayoutInflater$Factory2C0300f.this;
                PopupWindow popupWindow = layoutInflater$Factory2C0300f.f990F;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflater$Factory2C0300f.f989E.getParent() instanceof View) {
                    C1365w0.m37191n0((View) LayoutInflater$Factory2C0300f.this.f989E.getParent());
                }
                LayoutInflater$Factory2C0300f.this.f989E.m40269k();
                LayoutInflater$Factory2C0300f.this.f992H.m37364h(null);
                LayoutInflater$Factory2C0300f layoutInflater$Factory2C0300f2 = LayoutInflater$Factory2C0300f.this;
                layoutInflater$Factory2C0300f2.f992H = null;
                C1365w0.m37191n0(layoutInflater$Factory2C0300f2.f995K);
            }
        }

        public C0310i(ActionMode.Callback callback) {
            this.f1045a = callback;
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        /* renamed from: a */
        public void mo40465a(ActionMode actionMode) {
            this.f1045a.mo40465a(actionMode);
            LayoutInflater$Factory2C0300f layoutInflater$Factory2C0300f = LayoutInflater$Factory2C0300f.this;
            if (layoutInflater$Factory2C0300f.f990F != null) {
                layoutInflater$Factory2C0300f.f1031u.getDecorView().removeCallbacks(LayoutInflater$Factory2C0300f.this.f991G);
            }
            LayoutInflater$Factory2C0300f layoutInflater$Factory2C0300f2 = LayoutInflater$Factory2C0300f.this;
            if (layoutInflater$Factory2C0300f2.f989E != null) {
                layoutInflater$Factory2C0300f2.m40627m0();
                LayoutInflater$Factory2C0300f layoutInflater$Factory2C0300f3 = LayoutInflater$Factory2C0300f.this;
                layoutInflater$Factory2C0300f3.f992H = C1365w0.m37210e(layoutInflater$Factory2C0300f3.f989E).m37370b(0.0f);
                LayoutInflater$Factory2C0300f.this.f992H.m37364h(new C0311a());
            }
            LayoutInflater$Factory2C0300f layoutInflater$Factory2C0300f4 = LayoutInflater$Factory2C0300f.this;
            InterfaceC0297c interfaceC0297c = layoutInflater$Factory2C0300f4.f1033w;
            if (interfaceC0297c != null) {
                interfaceC0297c.onSupportActionModeFinished(layoutInflater$Factory2C0300f4.f988D);
            }
            LayoutInflater$Factory2C0300f layoutInflater$Factory2C0300f5 = LayoutInflater$Factory2C0300f.this;
            layoutInflater$Factory2C0300f5.f988D = null;
            C1365w0.m37191n0(layoutInflater$Factory2C0300f5.f995K);
            LayoutInflater$Factory2C0300f.this.m40639f1();
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        /* renamed from: b */
        public boolean mo40464b(ActionMode actionMode, Menu menu) {
            return this.f1045a.mo40464b(actionMode, menu);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        /* renamed from: c */
        public boolean mo40463c(ActionMode actionMode, MenuItem menuItem) {
            return this.f1045a.mo40463c(actionMode, menuItem);
        }

        @Override // androidx.appcompat.view.ActionMode.Callback
        /* renamed from: d */
        public boolean mo40462d(ActionMode actionMode, Menu menu) {
            C1365w0.m37191n0(LayoutInflater$Factory2C0300f.this.f995K);
            return this.f1045a.mo40462d(actionMode, menu);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0312j {
        /* renamed from: a */
        static Context m40605a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        /* renamed from: b */
        static void m40604b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }

        /* renamed from: c */
        static void m40603c(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        /* renamed from: d */
        static void m40602d(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0313k {
        /* renamed from: a */
        static boolean m40601a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        /* renamed from: b */
        static String m40600b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$l */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0314l {
        /* renamed from: a */
        static void m40599a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales;
            LocaleList locales2;
            boolean equals;
            locales = configuration.getLocales();
            locales2 = configuration2.getLocales();
            equals = locales.equals(locales2);
            if (!equals) {
                configuration3.setLocales(locales2);
                configuration3.locale = configuration2.locale;
            }
        }

        /* renamed from: b */
        static LocaleListCompat m40598b(Configuration configuration) {
            LocaleList locales;
            String languageTags;
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            return LocaleListCompat.m38003c(languageTags);
        }

        /* renamed from: c */
        public static void m40597c(LocaleListCompat localeListCompat) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(localeListCompat.m37998h());
            LocaleList.setDefault(forLanguageTags);
        }

        /* renamed from: d */
        static void m40596d(Configuration configuration, LocaleListCompat localeListCompat) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(localeListCompat.m37998h());
            configuration.setLocales(forLanguageTags);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$m */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0315m {
        /* renamed from: a */
        static void m40595a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            i = configuration.colorMode;
            int i9 = i & 3;
            i2 = configuration2.colorMode;
            if (i9 != (i2 & 3)) {
                i7 = configuration3.colorMode;
                i8 = configuration2.colorMode;
                configuration3.colorMode = i7 | (i8 & 3);
            }
            i3 = configuration.colorMode;
            int i10 = i3 & 12;
            i4 = configuration2.colorMode;
            if (i10 != (i4 & 12)) {
                i5 = configuration3.colorMode;
                i6 = configuration2.colorMode;
                configuration3.colorMode = i5 | (i6 & 12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$n */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0316n {
        /* renamed from: a */
        static OnBackInvokedDispatcher m40594a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        /* renamed from: b */
        static OnBackInvokedCallback m40593b(Object obj, final LayoutInflater$Factory2C0300f layoutInflater$Factory2C0300f) {
            Objects.requireNonNull(layoutInflater$Factory2C0300f);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.n
                public final void onBackInvoked() {
                    LayoutInflater$Factory2C0300f.this.m40686G0();
                }
            };
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        /* renamed from: c */
        static void m40592c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$o */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0317o extends Window$CallbackC0369h {

        /* renamed from: k */
        private InterfaceC0308g f1048k;

        /* renamed from: l */
        private boolean f1049l;

        /* renamed from: m */
        private boolean f1050m;

        /* renamed from: n */
        private boolean f1051n;

        C0317o(Window.Callback callback) {
            super(callback);
        }

        /* renamed from: b */
        public boolean m40591b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f1050m = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f1050m = false;
            }
        }

        /* renamed from: c */
        public void m40590c(Window.Callback callback) {
            try {
                this.f1049l = true;
                callback.onContentChanged();
            } finally {
                this.f1049l = false;
            }
        }

        /* renamed from: d */
        public void m40589d(Window.Callback callback, int i, Menu menu) {
            try {
                this.f1051n = true;
                callback.onPanelClosed(i, menu);
            } finally {
                this.f1051n = false;
            }
        }

        @Override // androidx.appcompat.view.Window$CallbackC0369h, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f1050m) {
                return m40438a().dispatchKeyEvent(keyEvent);
            }
            if (!LayoutInflater$Factory2C0300f.this.m40630k0(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.view.Window$CallbackC0369h, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            if (!super.dispatchKeyShortcutEvent(keyEvent) && !LayoutInflater$Factory2C0300f.this.m40682J0(keyEvent.getKeyCode(), keyEvent)) {
                return false;
            }
            return true;
        }

        /* renamed from: e */
        void m40588e(InterfaceC0308g interfaceC0308g) {
            this.f1048k = interfaceC0308g;
        }

        /* renamed from: f */
        final android.view.ActionMode m40587f(ActionMode.Callback callback) {
            C0362e.C0363a c0363a = new C0362e.C0363a(LayoutInflater$Factory2C0300f.this.f1030t, callback);
            androidx.appcompat.view.ActionMode mo40665T = LayoutInflater$Factory2C0300f.this.mo40665T(c0363a);
            if (mo40665T != null) {
                return c0363a.m40461e(mo40665T);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f1049l) {
                m40438a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.Window$CallbackC0369h, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i == 0 && !(menu instanceof C0389g)) {
                return false;
            }
            return super.onCreatePanelMenu(i, menu);
        }

        @Override // androidx.appcompat.view.Window$CallbackC0369h, android.view.Window.Callback
        public View onCreatePanelView(int i) {
            View onCreatePanelView;
            InterfaceC0308g interfaceC0308g = this.f1048k;
            if (interfaceC0308g != null && (onCreatePanelView = interfaceC0308g.onCreatePanelView(i)) != null) {
                return onCreatePanelView;
            }
            return super.onCreatePanelView(i);
        }

        @Override // androidx.appcompat.view.Window$CallbackC0369h, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            LayoutInflater$Factory2C0300f.this.m40677M0(i);
            return true;
        }

        @Override // androidx.appcompat.view.Window$CallbackC0369h, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            if (this.f1051n) {
                m40438a().onPanelClosed(i, menu);
                return;
            }
            super.onPanelClosed(i, menu);
            LayoutInflater$Factory2C0300f.this.m40675N0(i);
        }

        @Override // androidx.appcompat.view.Window$CallbackC0369h, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0389g c0389g;
            if (menu instanceof C0389g) {
                c0389g = (C0389g) menu;
            } else {
                c0389g = null;
            }
            if (i == 0 && c0389g == null) {
                return false;
            }
            boolean z = true;
            if (c0389g != null) {
                c0389g.m40371a0(true);
            }
            InterfaceC0308g interfaceC0308g = this.f1048k;
            if (interfaceC0308g == null || !interfaceC0308g.mo40506a(i)) {
                z = false;
            }
            if (!z) {
                z = super.onPreparePanel(i, view, menu);
            }
            if (c0389g != null) {
                c0389g.m40371a0(false);
            }
            return z;
        }

        @Override // androidx.appcompat.view.Window$CallbackC0369h, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0389g c0389g;
            C0324u m40610w0 = LayoutInflater$Factory2C0300f.this.m40610w0(0, true);
            if (m40610w0 != null && (c0389g = m40610w0.f1070j) != null) {
                super.onProvideKeyboardShortcuts(list, c0389g, i);
            } else {
                super.onProvideKeyboardShortcuts(list, menu, i);
            }
        }

        @Override // android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // androidx.appcompat.view.Window$CallbackC0369h, android.view.Window.Callback
        public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (LayoutInflater$Factory2C0300f.this.m40690E0() && i == 0) {
                return m40587f(callback);
            }
            return super.onWindowStartingActionMode(callback, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.f$p */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0318p extends AbstractC0319q {

        /* renamed from: c */
        private final PowerManager f1053c;

        C0318p(Context context) {
            super();
            this.f1053c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0300f.AbstractC0319q
        /* renamed from: b */
        IntentFilter mo40584b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0300f.AbstractC0319q
        /* renamed from: c */
        public int mo40583c() {
            return C0313k.m40601a(this.f1053c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0300f.AbstractC0319q
        /* renamed from: d */
        public void mo40582d() {
            LayoutInflater$Factory2C0300f.this.mo40641f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.f$q */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public abstract class AbstractC0319q {

        /* renamed from: a */
        private BroadcastReceiver f1055a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.f$q$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        public class C0320a extends BroadcastReceiver {
            C0320a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                AbstractC0319q.this.mo40582d();
            }
        }

        AbstractC0319q() {
        }

        /* renamed from: a */
        void m40586a() {
            BroadcastReceiver broadcastReceiver = this.f1055a;
            if (broadcastReceiver != null) {
                try {
                    LayoutInflater$Factory2C0300f.this.f1030t.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f1055a = null;
            }
        }

        /* renamed from: b */
        abstract IntentFilter mo40584b();

        /* renamed from: c */
        abstract int mo40583c();

        /* renamed from: d */
        abstract void mo40582d();

        /* renamed from: e */
        void m40585e() {
            m40586a();
            IntentFilter mo40584b = mo40584b();
            if (mo40584b != null && mo40584b.countActions() != 0) {
                if (this.f1055a == null) {
                    this.f1055a = new C0320a();
                }
                LayoutInflater$Factory2C0300f.this.f1030t.registerReceiver(this.f1055a, mo40584b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.f$r */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0321r extends AbstractC0319q {

        /* renamed from: c */
        private final C0355z f1058c;

        C0321r(C0355z c0355z) {
            super();
            this.f1058c = c0355z;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0300f.AbstractC0319q
        /* renamed from: b */
        IntentFilter mo40584b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0300f.AbstractC0319q
        /* renamed from: c */
        public int mo40583c() {
            return this.f1058c.m40500d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.LayoutInflater$Factory2C0300f.AbstractC0319q
        /* renamed from: d */
        public void mo40582d() {
            LayoutInflater$Factory2C0300f.this.mo40641f();
        }
    }

    /* renamed from: androidx.appcompat.app.f$s */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static class C0322s {
        /* renamed from: a */
        static void m40581a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.f$t */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0323t extends ContentFrameLayout {
        public C0323t(Context context) {
            super(context);
        }

        /* renamed from: b */
        private boolean m40580b(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (!LayoutInflater$Factory2C0300f.this.m40630k0(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && m40580b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                LayoutInflater$Factory2C0300f.this.m40643e0(0);
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(C6029a.m23853b(getContext(), i));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.appcompat.app.f$u */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C0324u {

        /* renamed from: a */
        int f1061a;

        /* renamed from: b */
        int f1062b;

        /* renamed from: c */
        int f1063c;

        /* renamed from: d */
        int f1064d;

        /* renamed from: e */
        int f1065e;

        /* renamed from: f */
        int f1066f;

        /* renamed from: g */
        ViewGroup f1067g;

        /* renamed from: h */
        View f1068h;

        /* renamed from: i */
        View f1069i;

        /* renamed from: j */
        C0389g f1070j;

        /* renamed from: k */
        C0386e f1071k;

        /* renamed from: l */
        Context f1072l;

        /* renamed from: m */
        boolean f1073m;

        /* renamed from: n */
        boolean f1074n;

        /* renamed from: o */
        boolean f1075o;

        /* renamed from: p */
        public boolean f1076p;

        /* renamed from: q */
        boolean f1077q = false;

        /* renamed from: r */
        boolean f1078r;

        /* renamed from: s */
        Bundle f1079s;

        C0324u(int i) {
            this.f1061a = i;
        }

        /* renamed from: a */
        InterfaceC0407n m40579a(InterfaceC0405m.InterfaceC0406a interfaceC0406a) {
            if (this.f1070j == null) {
                return null;
            }
            if (this.f1071k == null) {
                C0386e c0386e = new C0386e(this.f1072l, C5712g.f16194j);
                this.f1071k = c0386e;
                c0386e.mo40296c(interfaceC0406a);
                this.f1070j.m40370b(this.f1071k);
            }
            return this.f1071k.m40400j(this.f1067g);
        }

        /* renamed from: b */
        public boolean m40578b() {
            if (this.f1068h == null) {
                return false;
            }
            if (this.f1069i == null && this.f1071k.m40401i().getCount() <= 0) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        void m40577c(C0389g c0389g) {
            C0386e c0386e;
            C0389g c0389g2 = this.f1070j;
            if (c0389g == c0389g2) {
                return;
            }
            if (c0389g2 != null) {
                c0389g2.m40383O(this.f1071k);
            }
            this.f1070j = c0389g;
            if (c0389g != null && (c0386e = this.f1071k) != null) {
                c0389g.m40370b(c0386e);
            }
        }

        /* renamed from: d */
        void m40576d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(C5706a.f16047a, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                newTheme.applyStyle(i, true);
            }
            newTheme.resolveAttribute(C5706a.f16037F, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 != 0) {
                newTheme.applyStyle(i2, true);
            } else {
                newTheme.applyStyle(C5714i.f16220b, true);
            }
            C0359c c0359c = new C0359c(context, 0);
            c0359c.getTheme().setTo(newTheme);
            this.f1072l = c0359c;
            TypedArray obtainStyledAttributes = c0359c.obtainStyledAttributes(C5715j.f16466y0);
            this.f1062b = obtainStyledAttributes.getResourceId(C5715j.f16229B0, 0);
            this.f1066f = obtainStyledAttributes.getResourceId(C5715j.f16224A0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.f$v */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public final class C0325v implements InterfaceC0405m.InterfaceC0406a {
        C0325v() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0405m.InterfaceC0406a
        /* renamed from: a */
        public void mo39969a(C0389g c0389g, boolean z) {
            boolean z2;
            C0389g mo40286D = c0389g.mo40286D();
            if (mo40286D != c0389g) {
                z2 = true;
            } else {
                z2 = false;
            }
            LayoutInflater$Factory2C0300f layoutInflater$Factory2C0300f = LayoutInflater$Factory2C0300f.this;
            if (z2) {
                c0389g = mo40286D;
            }
            C0324u m40622p0 = layoutInflater$Factory2C0300f.m40622p0(c0389g);
            if (m40622p0 != null) {
                if (z2) {
                    LayoutInflater$Factory2C0300f.this.m40650b0(m40622p0.f1061a, m40622p0, mo40286D);
                    LayoutInflater$Factory2C0300f.this.m40640f0(m40622p0, true);
                    return;
                }
                LayoutInflater$Factory2C0300f.this.m40640f0(m40622p0, z);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC0405m.InterfaceC0406a
        /* renamed from: b */
        public boolean mo39968b(C0389g c0389g) {
            Window.Callback m40608y0;
            if (c0389g == c0389g.mo40286D()) {
                LayoutInflater$Factory2C0300f layoutInflater$Factory2C0300f = LayoutInflater$Factory2C0300f.this;
                if (layoutInflater$Factory2C0300f.f1000P && (m40608y0 = layoutInflater$Factory2C0300f.m40608y0()) != null && !LayoutInflater$Factory2C0300f.this.f1011a0) {
                    m40608y0.onMenuOpened(108, c0389g);
                    return true;
                }
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater$Factory2C0300f(Activity activity, InterfaceC0297c interfaceC0297c) {
        this(activity, null, interfaceC0297c, activity);
    }

    /* renamed from: A0 */
    private boolean m40698A0(C0324u c0324u) {
        View view = c0324u.f1069i;
        if (view != null) {
            c0324u.f1068h = view;
            return true;
        } else if (c0324u.f1070j == null) {
            return false;
        } else {
            if (this.f987C == null) {
                this.f987C = new C0325v();
            }
            View view2 = (View) c0324u.m40579a(this.f987C);
            c0324u.f1068h = view2;
            if (view2 != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: B0 */
    private boolean m40696B0(C0324u c0324u) {
        c0324u.m40576d(m40619r0());
        c0324u.f1067g = new C0323t(c0324u.f1072l);
        c0324u.f1063c = 81;
        return true;
    }

    /* renamed from: C0 */
    private boolean m40694C0(C0324u c0324u) {
        Resources.Theme theme;
        Context context = this.f1030t;
        int i = c0324u.f1061a;
        if ((i == 0 || i == 108) && this.f985A != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(C5706a.f16052f, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(C5706a.f16053g, typedValue, true);
            } else {
                theme2.resolveAttribute(C5706a.f16053g, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                C0359c c0359c = new C0359c(context, 0);
                c0359c.getTheme().setTo(theme);
                context = c0359c;
            }
        }
        C0389g c0389g = new C0389g(context);
        c0389g.mo40282R(this);
        c0324u.m40577c(c0389g);
        return true;
    }

    /* renamed from: D0 */
    private void m40692D0(int i) {
        this.f1020j0 = (1 << i) | this.f1020j0;
        if (!this.f1019i0) {
            C1365w0.m37201i0(this.f1031u.getDecorView(), this.f1021k0);
            this.f1019i0 = true;
        }
    }

    /* renamed from: I0 */
    private boolean m40684I0(int i, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() == 0) {
            C0324u m40610w0 = m40610w0(i, true);
            if (!m40610w0.f1075o) {
                return m40666S0(m40610w0, keyEvent);
            }
            return false;
        }
        return false;
    }

    /* renamed from: L0 */
    private boolean m40679L0(int i, KeyEvent keyEvent) {
        boolean z;
        InterfaceC0531j0 interfaceC0531j0;
        if (this.f988D != null) {
            return false;
        }
        boolean z2 = true;
        C0324u m40610w0 = m40610w0(i, true);
        if (i == 0 && (interfaceC0531j0 = this.f985A) != null && interfaceC0531j0.mo39818a() && !ViewConfiguration.get(this.f1030t).hasPermanentMenuKey()) {
            if (!this.f985A.mo39814e()) {
                if (!this.f1011a0 && m40666S0(m40610w0, keyEvent)) {
                    z2 = this.f985A.mo39816c();
                }
                z2 = false;
            } else {
                z2 = this.f985A.mo39817b();
            }
        } else {
            boolean z3 = m40610w0.f1075o;
            if (!z3 && !m40610w0.f1074n) {
                if (m40610w0.f1073m) {
                    if (m40610w0.f1078r) {
                        m40610w0.f1073m = false;
                        z = m40666S0(m40610w0, keyEvent);
                    } else {
                        z = true;
                    }
                    if (z) {
                        m40672P0(m40610w0, keyEvent);
                    }
                }
                z2 = false;
            } else {
                m40640f0(m40610w0, true);
                z2 = z3;
            }
        }
        if (z2) {
            AudioManager audioManager = (AudioManager) this.f1030t.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* renamed from: P0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m40672P0(androidx.appcompat.app.LayoutInflater$Factory2C0300f.C0324u r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0300f.m40672P0(androidx.appcompat.app.f$u, android.view.KeyEvent):void");
    }

    /* renamed from: R0 */
    private boolean m40668R0(C0324u c0324u, int i, KeyEvent keyEvent, int i2) {
        C0389g c0389g;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0324u.f1073m || m40666S0(c0324u, keyEvent)) && (c0389g = c0324u.f1070j) != null) {
            z = c0389g.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.f985A == null) {
            m40640f0(c0324u, true);
        }
        return z;
    }

    /* renamed from: S0 */
    private boolean m40666S0(C0324u c0324u, KeyEvent keyEvent) {
        boolean z;
        InterfaceC0531j0 interfaceC0531j0;
        int i;
        boolean z2;
        InterfaceC0531j0 interfaceC0531j02;
        InterfaceC0531j0 interfaceC0531j03;
        if (this.f1011a0) {
            return false;
        }
        if (c0324u.f1073m) {
            return true;
        }
        C0324u c0324u2 = this.f1007W;
        if (c0324u2 != null && c0324u2 != c0324u) {
            m40640f0(c0324u2, false);
        }
        Window.Callback m40608y0 = m40608y0();
        if (m40608y0 != null) {
            c0324u.f1069i = m40608y0.onCreatePanelView(c0324u.f1061a);
        }
        int i2 = c0324u.f1061a;
        if (i2 != 0 && i2 != 108) {
            z = false;
        } else {
            z = true;
        }
        if (z && (interfaceC0531j03 = this.f985A) != null) {
            interfaceC0531j03.mo39813f();
        }
        if (c0324u.f1069i == null && (!z || !(m40670Q0() instanceof C0348x))) {
            C0389g c0389g = c0324u.f1070j;
            if (c0389g == null || c0324u.f1078r) {
                if (c0389g == null && (!m40694C0(c0324u) || c0324u.f1070j == null)) {
                    return false;
                }
                if (z && this.f985A != null) {
                    if (this.f986B == null) {
                        this.f986B = new C0309h();
                    }
                    this.f985A.mo39815d(c0324u.f1070j, this.f986B);
                }
                c0324u.f1070j.m40365d0();
                if (!m40608y0.onCreatePanelMenu(c0324u.f1061a, c0324u.f1070j)) {
                    c0324u.m40577c(null);
                    if (z && (interfaceC0531j0 = this.f985A) != null) {
                        interfaceC0531j0.mo39815d(null, this.f986B);
                    }
                    return false;
                }
                c0324u.f1078r = false;
            }
            c0324u.f1070j.m40365d0();
            Bundle bundle = c0324u.f1079s;
            if (bundle != null) {
                c0324u.f1070j.m40382P(bundle);
                c0324u.f1079s = null;
            }
            if (!m40608y0.onPreparePanel(0, c0324u.f1069i, c0324u.f1070j)) {
                if (z && (interfaceC0531j02 = this.f985A) != null) {
                    interfaceC0531j02.mo39815d(null, this.f986B);
                }
                c0324u.f1070j.m40367c0();
                return false;
            }
            if (keyEvent != null) {
                i = keyEvent.getDeviceId();
            } else {
                i = -1;
            }
            if (KeyCharacterMap.load(i).getKeyboardType() != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            c0324u.f1076p = z2;
            c0324u.f1070j.setQwertyMode(z2);
            c0324u.f1070j.m40367c0();
        }
        c0324u.f1073m = true;
        c0324u.f1074n = false;
        this.f1007W = c0324u;
        return true;
    }

    /* renamed from: T0 */
    private void m40664T0(boolean z) {
        InterfaceC0531j0 interfaceC0531j0 = this.f985A;
        if (interfaceC0531j0 != null && interfaceC0531j0.mo39818a() && (!ViewConfiguration.get(this.f1030t).hasPermanentMenuKey() || this.f985A.mo39812g())) {
            Window.Callback m40608y0 = m40608y0();
            if (this.f985A.mo39814e() && z) {
                this.f985A.mo39817b();
                if (!this.f1011a0) {
                    m40608y0.onPanelClosed(108, m40610w0(0, true).f1070j);
                    return;
                }
                return;
            } else if (m40608y0 != null && !this.f1011a0) {
                if (this.f1019i0 && (this.f1020j0 & 1) != 0) {
                    this.f1031u.getDecorView().removeCallbacks(this.f1021k0);
                    this.f1021k0.run();
                }
                C0324u m40610w0 = m40610w0(0, true);
                C0389g c0389g = m40610w0.f1070j;
                if (c0389g != null && !m40610w0.f1078r && m40608y0.onPreparePanel(0, m40610w0.f1069i, c0389g)) {
                    m40608y0.onMenuOpened(108, m40610w0.f1070j);
                    this.f985A.mo39816c();
                    return;
                }
                return;
            } else {
                return;
            }
        }
        C0324u m40610w02 = m40610w0(0, true);
        m40610w02.f1077q = true;
        m40640f0(m40610w02, false);
        m40672P0(m40610w02, null);
    }

    /* renamed from: U0 */
    private int m40663U0(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return 109;
        } else {
            return i;
        }
    }

    /* renamed from: V */
    private boolean m40662V(boolean z) {
        return m40660W(z, true);
    }

    /* renamed from: W */
    private boolean m40660W(boolean z, boolean z2) {
        LocaleListCompat localeListCompat;
        if (this.f1011a0) {
            return false;
        }
        int m40652a0 = m40652a0();
        int m40688F0 = m40688F0(this.f1030t, m40652a0);
        if (Build.VERSION.SDK_INT < 33) {
            localeListCompat = m40654Z(this.f1030t);
        } else {
            localeListCompat = null;
        }
        if (!z2 && localeListCompat != null) {
            localeListCompat = m40612v0(this.f1030t.getResources().getConfiguration());
        }
        boolean m40642e1 = m40642e1(m40688F0, localeListCompat, z);
        if (m40652a0 == 0) {
            m40614u0(this.f1030t).m40585e();
        } else {
            AbstractC0319q abstractC0319q = this.f1017g0;
            if (abstractC0319q != null) {
                abstractC0319q.m40586a();
            }
        }
        if (m40652a0 == 3) {
            m40616t0(this.f1030t).m40585e();
        } else {
            AbstractC0319q abstractC0319q2 = this.f1018h0;
            if (abstractC0319q2 != null) {
                abstractC0319q2.m40586a();
            }
        }
        return m40642e1;
    }

    /* renamed from: X */
    private void m40658X() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f995K.findViewById(16908290);
        View decorView = this.f1031u.getDecorView();
        contentFrameLayout.m40134a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f1030t.obtainStyledAttributes(C5715j.f16466y0);
        obtainStyledAttributes.getValue(C5715j.f16274K0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(C5715j.f16279L0, contentFrameLayout.getMinWidthMinor());
        int i = C5715j.f16264I0;
        if (obtainStyledAttributes.hasValue(i)) {
            obtainStyledAttributes.getValue(i, contentFrameLayout.getFixedWidthMajor());
        }
        int i2 = C5715j.f16269J0;
        if (obtainStyledAttributes.hasValue(i2)) {
            obtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMinor());
        }
        int i3 = C5715j.f16254G0;
        if (obtainStyledAttributes.hasValue(i3)) {
            obtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedHeightMajor());
        }
        int i4 = C5715j.f16259H0;
        if (obtainStyledAttributes.hasValue(i4)) {
            obtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    /* renamed from: Y */
    private void m40656Y(Window window) {
        if (this.f1031u == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C0317o)) {
                C0317o c0317o = new C0317o(callback);
                this.f1032v = c0317o;
                window.setCallback(c0317o);
                C0544n1 m39781u = C0544n1.m39781u(this.f1030t, null, f982u0);
                Drawable m39794h = m39781u.m39794h(0);
                if (m39794h != null) {
                    window.setBackgroundDrawable(m39794h);
                }
                m39781u.m39779w();
                this.f1031u = window;
                if (Build.VERSION.SDK_INT >= 33 && this.f1027q0 == null) {
                    mo40673P(null);
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    /* renamed from: Y0 */
    private boolean m40655Y0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f1031u.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || C1365w0.m37225T((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    /* renamed from: a0 */
    private int m40652a0() {
        int i = this.f1013c0;
        return i != -100 ? i : AppCompatDelegate.m40734o();
    }

    /* renamed from: b1 */
    private void m40649b1() {
        if (!this.f994J) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    /* renamed from: c1 */
    private ActivityC0294b m40647c1() {
        for (Context context = this.f1030t; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof ActivityC0294b) {
                return (ActivityC0294b) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* renamed from: d0 */
    private void m40646d0() {
        AbstractC0319q abstractC0319q = this.f1017g0;
        if (abstractC0319q != null) {
            abstractC0319q.m40586a();
        }
        AbstractC0319q abstractC0319q2 = this.f1018h0;
        if (abstractC0319q2 != null) {
            abstractC0319q2.m40586a();
        }
    }

    /* renamed from: d1 */
    private void m40645d1(Configuration configuration) {
        Activity activity = (Activity) this.f1029s;
        if (activity instanceof LifecycleOwner) {
            if (((LifecycleOwner) activity).getLifecycle().mo36124b().m36132a(Lifecycle.State.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else if (this.f1010Z && !this.f1011a0) {
            activity.onConfigurationChanged(configuration);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* renamed from: e1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m40642e1(int r9, androidx.core.p018os.LocaleListCompat r10, boolean r11) {
        /*
            r8 = this;
            android.content.Context r1 = r8.f1030t
            r4 = 0
            r5 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            android.content.res.Configuration r0 = r0.m40638g0(r1, r2, r3, r4, r5)
            android.content.Context r1 = r8.f1030t
            int r1 = r8.m40617s0(r1)
            android.content.res.Configuration r2 = r8.f1012b0
            if (r2 != 0) goto L1f
            android.content.Context r2 = r8.f1030t
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L1f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            androidx.core.os.LocaleListCompat r2 = r8.m40612v0(r2)
            r5 = 0
            if (r10 != 0) goto L30
            r0 = r5
            goto L34
        L30:
            androidx.core.os.LocaleListCompat r0 = r8.m40612v0(r0)
        L34:
            r6 = 0
            if (r3 == r4) goto L3a
            r3 = 512(0x200, float:7.175E-43)
            goto L3b
        L3a:
            r3 = r6
        L3b:
            if (r0 == 0) goto L47
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L47
            r2 = r3 | 4
            r3 = r2 | 8192(0x2000, float:1.14794E-41)
        L47:
            int r2 = ~r1
            r2 = r2 & r3
            r7 = 1
            if (r2 == 0) goto L71
            if (r11 == 0) goto L71
            boolean r11 = r8.f1009Y
            if (r11 == 0) goto L71
            boolean r11 = androidx.appcompat.app.LayoutInflater$Factory2C0300f.f983v0
            if (r11 != 0) goto L5a
            boolean r11 = r8.f1010Z
            if (r11 == 0) goto L71
        L5a:
            java.lang.Object r11 = r8.f1029s
            boolean r2 = r11 instanceof android.app.Activity
            if (r2 == 0) goto L71
            android.app.Activity r11 = (android.app.Activity) r11
            boolean r11 = r11.isChild()
            if (r11 != 0) goto L71
            java.lang.Object r11 = r8.f1029s
            android.app.Activity r11 = (android.app.Activity) r11
            androidx.core.app.C0769b.m38672q(r11)
            r11 = r7
            goto L72
        L71:
            r11 = r6
        L72:
            if (r11 != 0) goto L7f
            if (r3 == 0) goto L7f
            r11 = r3 & r1
            if (r11 != r3) goto L7b
            r6 = r7
        L7b:
            r8.m40637g1(r4, r0, r6, r5)
            goto L80
        L7f:
            r7 = r11
        L80:
            if (r7 == 0) goto L9c
            java.lang.Object r11 = r8.f1029s
            boolean r1 = r11 instanceof androidx.appcompat.app.ActivityC0294b
            if (r1 == 0) goto L9c
            r1 = r3 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L91
            androidx.appcompat.app.b r11 = (androidx.appcompat.app.ActivityC0294b) r11
            r11.onNightModeChanged(r9)
        L91:
            r9 = r3 & 4
            if (r9 == 0) goto L9c
            java.lang.Object r9 = r8.f1029s
            androidx.appcompat.app.b r9 = (androidx.appcompat.app.ActivityC0294b) r9
            r9.onLocalesChanged(r10)
        L9c:
            if (r7 == 0) goto Lb1
            if (r0 == 0) goto Lb1
            android.content.Context r9 = r8.f1030t
            android.content.res.Resources r9 = r9.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            androidx.core.os.LocaleListCompat r9 = r8.m40612v0(r9)
            r8.m40659W0(r9)
        Lb1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0300f.m40642e1(int, androidx.core.os.LocaleListCompat, boolean):boolean");
    }

    /* renamed from: g0 */
    private Configuration m40638g0(Context context, int i, LocaleListCompat localeListCompat, Configuration configuration, boolean z) {
        int i2;
        if (i != 1) {
            if (i != 2) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i2 = 32;
            }
        } else {
            i2 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (localeListCompat != null) {
            m40661V0(configuration2, localeListCompat);
        }
        return configuration2;
    }

    /* renamed from: g1 */
    private void m40637g1(int i, LocaleListCompat localeListCompat, boolean z, Configuration configuration) {
        Resources resources = this.f1030t.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i | (resources.getConfiguration().uiMode & (-49));
        if (localeListCompat != null) {
            m40661V0(configuration2, localeListCompat);
        }
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            C0346w.m40532a(resources);
        }
        int i2 = this.f1014d0;
        if (i2 != 0) {
            this.f1030t.setTheme(i2);
            this.f1030t.getTheme().applyStyle(this.f1014d0, true);
        }
        if (z && (this.f1029s instanceof Activity)) {
            m40645d1(configuration2);
        }
    }

    /* renamed from: h0 */
    private ViewGroup m40636h0() {
        ViewGroup viewGroup;
        Context context;
        TypedArray obtainStyledAttributes = this.f1030t.obtainStyledAttributes(C5715j.f16466y0);
        int i = C5715j.f16239D0;
        if (obtainStyledAttributes.hasValue(i)) {
            if (obtainStyledAttributes.getBoolean(C5715j.f16284M0, false)) {
                mo40683J(1);
            } else if (obtainStyledAttributes.getBoolean(i, false)) {
                mo40683J(108);
            }
            if (obtainStyledAttributes.getBoolean(C5715j.f16244E0, false)) {
                mo40683J(109);
            }
            if (obtainStyledAttributes.getBoolean(C5715j.f16249F0, false)) {
                mo40683J(10);
            }
            this.f1003S = obtainStyledAttributes.getBoolean(C5715j.f16471z0, false);
            obtainStyledAttributes.recycle();
            m40624o0();
            this.f1031u.getDecorView();
            LayoutInflater from = LayoutInflater.from(this.f1030t);
            if (!this.f1004T) {
                if (this.f1003S) {
                    viewGroup = (ViewGroup) from.inflate(C5712g.f16190f, (ViewGroup) null);
                    this.f1001Q = false;
                    this.f1000P = false;
                } else if (this.f1000P) {
                    TypedValue typedValue = new TypedValue();
                    this.f1030t.getTheme().resolveAttribute(C5706a.f16052f, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        context = new C0359c(this.f1030t, typedValue.resourceId);
                    } else {
                        context = this.f1030t;
                    }
                    viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C5712g.f16200p, (ViewGroup) null);
                    InterfaceC0531j0 interfaceC0531j0 = (InterfaceC0531j0) viewGroup.findViewById(C5711f.f16175q);
                    this.f985A = interfaceC0531j0;
                    interfaceC0531j0.setWindowCallback(m40608y0());
                    if (this.f1001Q) {
                        this.f985A.mo39811h(109);
                    }
                    if (this.f998N) {
                        this.f985A.mo39811h(2);
                    }
                    if (this.f999O) {
                        this.f985A.mo39811h(5);
                    }
                } else {
                    viewGroup = null;
                }
            } else {
                viewGroup = this.f1002R ? (ViewGroup) from.inflate(C5712g.f16199o, (ViewGroup) null) : (ViewGroup) from.inflate(C5712g.f16198n, (ViewGroup) null);
            }
            if (viewGroup != null) {
                C1365w0.m37253D0(viewGroup, new C0302b());
                if (this.f985A == null) {
                    this.f996L = (TextView) viewGroup.findViewById(C5711f.f16155N);
                }
                C0616y1.m39571c(viewGroup);
                ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C5711f.f16160b);
                ViewGroup viewGroup2 = (ViewGroup) this.f1031u.findViewById(16908290);
                if (viewGroup2 != null) {
                    while (viewGroup2.getChildCount() > 0) {
                        View childAt = viewGroup2.getChildAt(0);
                        viewGroup2.removeViewAt(0);
                        contentFrameLayout.addView(childAt);
                    }
                    viewGroup2.setId(-1);
                    contentFrameLayout.setId(16908290);
                    if (viewGroup2 instanceof FrameLayout) {
                        ((FrameLayout) viewGroup2).setForeground(null);
                    }
                }
                this.f1031u.setContentView(viewGroup);
                contentFrameLayout.setAttachListener(new C0303c());
                return viewGroup;
            }
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f1000P + ", windowActionBarOverlay: " + this.f1001Q + ", android:windowIsFloating: " + this.f1003S + ", windowActionModeOverlay: " + this.f1002R + ", windowNoTitle: " + this.f1004T + " }");
        }
        obtainStyledAttributes.recycle();
        throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
    }

    /* renamed from: i1 */
    private void m40632i1(View view) {
        boolean z;
        int m38401c;
        if ((C1365w0.m37236M(view) & 8192) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m38401c = C0946a.m38401c(this.f1030t, C5708c.f16075b);
        } else {
            m38401c = C0946a.m38401c(this.f1030t, C5708c.f16074a);
        }
        view.setBackgroundColor(m38401c);
    }

    /* renamed from: n0 */
    private void m40625n0() {
        if (!this.f994J) {
            this.f995K = m40636h0();
            CharSequence m40609x0 = m40609x0();
            if (!TextUtils.isEmpty(m40609x0)) {
                InterfaceC0531j0 interfaceC0531j0 = this.f985A;
                if (interfaceC0531j0 != null) {
                    interfaceC0531j0.setWindowTitle(m40609x0);
                } else if (m40670Q0() != null) {
                    m40670Q0().mo40508x(m40609x0);
                } else {
                    TextView textView = this.f996L;
                    if (textView != null) {
                        textView.setText(m40609x0);
                    }
                }
            }
            m40658X();
            m40674O0(this.f995K);
            this.f994J = true;
            C0324u m40610w0 = m40610w0(0, false);
            if (!this.f1011a0) {
                if (m40610w0 == null || m40610w0.f1070j == null) {
                    m40692D0(108);
                }
            }
        }
    }

    /* renamed from: o0 */
    private void m40624o0() {
        if (this.f1031u == null) {
            Object obj = this.f1029s;
            if (obj instanceof Activity) {
                m40656Y(((Activity) obj).getWindow());
            }
        }
        if (this.f1031u != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    /* renamed from: q0 */
    private static Configuration m40620q0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f = configuration.fontScale;
            float f2 = configuration2.fontScale;
            if (f != f2) {
                configuration3.fontScale = f2;
            }
            int i = configuration.mcc;
            int i2 = configuration2.mcc;
            if (i != i2) {
                configuration3.mcc = i2;
            }
            int i3 = configuration.mnc;
            int i4 = configuration2.mnc;
            if (i3 != i4) {
                configuration3.mnc = i4;
            }
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 24) {
                C0314l.m40599a(configuration, configuration2, configuration3);
            } else if (!C1134c.m37835a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i6 = configuration.touchscreen;
            int i7 = configuration2.touchscreen;
            if (i6 != i7) {
                configuration3.touchscreen = i7;
            }
            int i8 = configuration.keyboard;
            int i9 = configuration2.keyboard;
            if (i8 != i9) {
                configuration3.keyboard = i9;
            }
            int i10 = configuration.keyboardHidden;
            int i11 = configuration2.keyboardHidden;
            if (i10 != i11) {
                configuration3.keyboardHidden = i11;
            }
            int i12 = configuration.navigation;
            int i13 = configuration2.navigation;
            if (i12 != i13) {
                configuration3.navigation = i13;
            }
            int i14 = configuration.navigationHidden;
            int i15 = configuration2.navigationHidden;
            if (i14 != i15) {
                configuration3.navigationHidden = i15;
            }
            int i16 = configuration.orientation;
            int i17 = configuration2.orientation;
            if (i16 != i17) {
                configuration3.orientation = i17;
            }
            int i18 = configuration.screenLayout & 15;
            int i19 = configuration2.screenLayout;
            if (i18 != (i19 & 15)) {
                configuration3.screenLayout |= i19 & 15;
            }
            int i20 = configuration.screenLayout & 192;
            int i21 = configuration2.screenLayout;
            if (i20 != (i21 & 192)) {
                configuration3.screenLayout |= i21 & 192;
            }
            int i22 = configuration.screenLayout & 48;
            int i23 = configuration2.screenLayout;
            if (i22 != (i23 & 48)) {
                configuration3.screenLayout |= i23 & 48;
            }
            int i24 = configuration.screenLayout & 768;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 768)) {
                configuration3.screenLayout |= i25 & 768;
            }
            if (i5 >= 26) {
                C0315m.m40595a(configuration, configuration2, configuration3);
            }
            int i26 = configuration.uiMode & 15;
            int i27 = configuration2.uiMode;
            if (i26 != (i27 & 15)) {
                configuration3.uiMode |= i27 & 15;
            }
            int i28 = configuration.uiMode & 48;
            int i29 = configuration2.uiMode;
            if (i28 != (i29 & 48)) {
                configuration3.uiMode |= i29 & 48;
            }
            int i30 = configuration.screenWidthDp;
            int i31 = configuration2.screenWidthDp;
            if (i30 != i31) {
                configuration3.screenWidthDp = i31;
            }
            int i32 = configuration.screenHeightDp;
            int i33 = configuration2.screenHeightDp;
            if (i32 != i33) {
                configuration3.screenHeightDp = i33;
            }
            int i34 = configuration.smallestScreenWidthDp;
            int i35 = configuration2.smallestScreenWidthDp;
            if (i34 != i35) {
                configuration3.smallestScreenWidthDp = i35;
            }
            C0312j.m40604b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    /* renamed from: s0 */
    private int m40617s0(Context context) {
        int i;
        if (!this.f1016f0 && (this.f1029s instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 29) {
                    i = 269221888;
                } else if (i2 >= 24) {
                    i = 786432;
                } else {
                    i = 0;
                }
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f1029s.getClass()), i);
                if (activityInfo != null) {
                    this.f1015e0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.f1015e0 = 0;
            }
        }
        this.f1016f0 = true;
        return this.f1015e0;
    }

    /* renamed from: t0 */
    private AbstractC0319q m40616t0(Context context) {
        if (this.f1018h0 == null) {
            this.f1018h0 = new C0318p(context);
        }
        return this.f1018h0;
    }

    /* renamed from: u0 */
    private AbstractC0319q m40614u0(Context context) {
        if (this.f1017g0 == null) {
            this.f1017g0 = new C0321r(C0355z.m40503a(context));
        }
        return this.f1017g0;
    }

    /* renamed from: z0 */
    private void m40606z0() {
        m40625n0();
        if (this.f1000P && this.f1034x == null) {
            Object obj = this.f1029s;
            if (obj instanceof Activity) {
                this.f1034x = new C0289a0((Activity) this.f1029s, this.f1001Q);
            } else if (obj instanceof Dialog) {
                this.f1034x = new C0289a0((Dialog) this.f1029s);
            }
            ActionBar actionBar = this.f1034x;
            if (actionBar != null) {
                actionBar.mo40514r(this.f1022l0);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: A */
    public void mo40699A(Bundle bundle) {
        String str;
        this.f1009Y = true;
        m40662V(false);
        m40624o0();
        Object obj = this.f1029s;
        if (obj instanceof Activity) {
            try {
                str = C0857n.m38553c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                ActionBar m40670Q0 = m40670Q0();
                if (m40670Q0 == null) {
                    this.f1022l0 = true;
                } else {
                    m40670Q0.mo40514r(true);
                }
            }
            AppCompatDelegate.m40740d(this);
        }
        this.f1012b0 = new Configuration(this.f1030t.getResources().getConfiguration());
        this.f1010Z = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo40697B() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f1029s
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.AppCompatDelegate.m40746H(r3)
        L9:
            boolean r0 = r3.f1019i0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f1031u
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f1021k0
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.f1011a0 = r0
            int r0 = r3.f1013c0
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f1029s
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.LayoutInflater$Factory2C0300f.f980s0
            java.lang.Object r1 = r3.f1029s
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f1013c0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            androidx.collection.SimpleArrayMap<java.lang.String, java.lang.Integer> r0 = androidx.appcompat.app.LayoutInflater$Factory2C0300f.f980s0
            java.lang.Object r1 = r3.f1029s
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.ActionBar r0 = r3.f1034x
            if (r0 == 0) goto L5b
            r0.mo40518n()
        L5b:
            r3.m40646d0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0300f.mo40697B():void");
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: C */
    public void mo40695C(Bundle bundle) {
        m40625n0();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: D */
    public void mo40693D() {
        ActionBar mo40615u = mo40615u();
        if (mo40615u != null) {
            mo40615u.mo40510v(true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: E */
    public void mo40691E(Bundle bundle) {
    }

    /* renamed from: E0 */
    public boolean m40690E0() {
        return this.f993I;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: F */
    public void mo40689F() {
        m40660W(true, false);
    }

    /* renamed from: F0 */
    int m40688F0(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        return m40616t0(context).mo40583c();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                return m40614u0(context).mo40583c();
            }
        }
        return i;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: G */
    public void mo40687G() {
        ActionBar mo40615u = mo40615u();
        if (mo40615u != null) {
            mo40615u.mo40510v(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: G0 */
    public boolean m40686G0() {
        boolean z = this.f1008X;
        this.f1008X = false;
        C0324u m40610w0 = m40610w0(0, false);
        if (m40610w0 != null && m40610w0.f1075o) {
            if (!z) {
                m40640f0(m40610w0, true);
            }
            return true;
        }
        androidx.appcompat.view.ActionMode actionMode = this.f988D;
        if (actionMode != null) {
            actionMode.mo40479c();
            return true;
        }
        ActionBar mo40615u = mo40615u();
        if (mo40615u == null || !mo40615u.mo40524h()) {
            return false;
        }
        return true;
    }

    /* renamed from: H0 */
    boolean m40685H0(int i, KeyEvent keyEvent) {
        boolean z = true;
        if (i != 4) {
            if (i == 82) {
                m40684I0(0, keyEvent);
                return true;
            }
        } else {
            if ((keyEvent.getFlags() & 128) == 0) {
                z = false;
            }
            this.f1008X = z;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: J */
    public boolean mo40683J(int i) {
        int m40663U0 = m40663U0(i);
        if (this.f1004T && m40663U0 == 108) {
            return false;
        }
        if (this.f1000P && m40663U0 == 1) {
            this.f1000P = false;
        }
        if (m40663U0 != 1) {
            if (m40663U0 != 2) {
                if (m40663U0 != 5) {
                    if (m40663U0 != 10) {
                        if (m40663U0 != 108) {
                            if (m40663U0 != 109) {
                                return this.f1031u.requestFeature(m40663U0);
                            }
                            m40649b1();
                            this.f1001Q = true;
                            return true;
                        }
                        m40649b1();
                        this.f1000P = true;
                        return true;
                    }
                    m40649b1();
                    this.f1002R = true;
                    return true;
                }
                m40649b1();
                this.f999O = true;
                return true;
            }
            m40649b1();
            this.f998N = true;
            return true;
        }
        m40649b1();
        this.f1004T = true;
        return true;
    }

    /* renamed from: J0 */
    boolean m40682J0(int i, KeyEvent keyEvent) {
        ActionBar mo40615u = mo40615u();
        if (mo40615u != null && mo40615u.mo40517o(i, keyEvent)) {
            return true;
        }
        C0324u c0324u = this.f1007W;
        if (c0324u != null && m40668R0(c0324u, keyEvent.getKeyCode(), keyEvent, 1)) {
            C0324u c0324u2 = this.f1007W;
            if (c0324u2 != null) {
                c0324u2.f1074n = true;
            }
            return true;
        }
        if (this.f1007W == null) {
            C0324u m40610w0 = m40610w0(0, true);
            m40666S0(m40610w0, keyEvent);
            boolean m40668R0 = m40668R0(m40610w0, keyEvent.getKeyCode(), keyEvent, 1);
            m40610w0.f1073m = false;
            if (m40668R0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: K0 */
    boolean m40681K0(int i, KeyEvent keyEvent) {
        if (i != 4) {
            if (i == 82) {
                m40679L0(0, keyEvent);
                return true;
            }
        } else if (m40686G0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: L */
    public void mo40680L(int i) {
        m40625n0();
        ViewGroup viewGroup = (ViewGroup) this.f995K.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f1030t).inflate(i, viewGroup);
        this.f1032v.m40590c(this.f1031u.getCallback());
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: M */
    public void mo40678M(View view) {
        m40625n0();
        ViewGroup viewGroup = (ViewGroup) this.f995K.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f1032v.m40590c(this.f1031u.getCallback());
    }

    /* renamed from: M0 */
    void m40677M0(int i) {
        ActionBar mo40615u;
        if (i == 108 && (mo40615u = mo40615u()) != null) {
            mo40615u.mo40523i(true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: N */
    public void mo40676N(View view, ViewGroup.LayoutParams layoutParams) {
        m40625n0();
        ViewGroup viewGroup = (ViewGroup) this.f995K.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f1032v.m40590c(this.f1031u.getCallback());
    }

    /* renamed from: N0 */
    void m40675N0(int i) {
        if (i == 108) {
            ActionBar mo40615u = mo40615u();
            if (mo40615u != null) {
                mo40615u.mo40523i(false);
            }
        } else if (i == 0) {
            C0324u m40610w0 = m40610w0(i, true);
            if (m40610w0.f1075o) {
                m40640f0(m40610w0, false);
            }
        }
    }

    /* renamed from: O0 */
    void m40674O0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: P */
    public void mo40673P(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.mo40673P(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f1027q0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f1028r0) != null) {
            C0316n.m40592c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f1028r0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f1029s;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                this.f1027q0 = C0316n.m40594a((Activity) this.f1029s);
                m40639f1();
            }
        }
        this.f1027q0 = onBackInvokedDispatcher;
        m40639f1();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: Q */
    public void mo40671Q(Toolbar toolbar) {
        if (!(this.f1029s instanceof Activity)) {
            return;
        }
        ActionBar mo40615u = mo40615u();
        if (!(mo40615u instanceof C0289a0)) {
            this.f1035y = null;
            if (mo40615u != null) {
                mo40615u.mo40518n();
            }
            this.f1034x = null;
            if (toolbar != null) {
                C0348x c0348x = new C0348x(toolbar, m40609x0(), this.f1032v);
                this.f1034x = c0348x;
                this.f1032v.m40588e(c0348x.f1114c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f1032v.m40588e(null);
            }
            mo40611w();
            return;
        }
        throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
    }

    /* renamed from: Q0 */
    final ActionBar m40670Q0() {
        return this.f1034x;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: R */
    public void mo40669R(int i) {
        this.f1014d0 = i;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: S */
    public final void mo40667S(CharSequence charSequence) {
        this.f1036z = charSequence;
        InterfaceC0531j0 interfaceC0531j0 = this.f985A;
        if (interfaceC0531j0 != null) {
            interfaceC0531j0.setWindowTitle(charSequence);
        } else if (m40670Q0() != null) {
            m40670Q0().mo40508x(charSequence);
        } else {
            TextView textView = this.f996L;
            if (textView != null) {
                textView.setText(charSequence);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: T */
    public androidx.appcompat.view.ActionMode mo40665T(ActionMode.Callback callback) {
        InterfaceC0297c interfaceC0297c;
        if (callback != null) {
            androidx.appcompat.view.ActionMode actionMode = this.f988D;
            if (actionMode != null) {
                actionMode.mo40479c();
            }
            C0310i c0310i = new C0310i(callback);
            ActionBar mo40615u = mo40615u();
            if (mo40615u != null) {
                androidx.appcompat.view.ActionMode mo40703y = mo40615u.mo40703y(c0310i);
                this.f988D = mo40703y;
                if (mo40703y != null && (interfaceC0297c = this.f1033w) != null) {
                    interfaceC0297c.onSupportActionModeStarted(mo40703y);
                }
            }
            if (this.f988D == null) {
                this.f988D = m40651a1(c0310i);
            }
            m40639f1();
            return this.f988D;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    /* renamed from: V0 */
    void m40661V0(Configuration configuration, LocaleListCompat localeListCompat) {
        if (Build.VERSION.SDK_INT >= 24) {
            C0314l.m40596d(configuration, localeListCompat);
            return;
        }
        C0312j.m40602d(configuration, localeListCompat.m38002d(0));
        C0312j.m40603c(configuration, localeListCompat.m38002d(0));
    }

    /* renamed from: W0 */
    void m40659W0(LocaleListCompat localeListCompat) {
        if (Build.VERSION.SDK_INT >= 24) {
            C0314l.m40597c(localeListCompat);
        } else {
            Locale.setDefault(localeListCompat.m38002d(0));
        }
    }

    /* renamed from: X0 */
    final boolean m40657X0() {
        ViewGroup viewGroup;
        return this.f994J && (viewGroup = this.f995K) != null && C1365w0.m37224U(viewGroup);
    }

    /* renamed from: Z */
    LocaleListCompat m40654Z(Context context) {
        LocaleListCompat m40732t;
        LocaleListCompat m38003c;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (m40732t = AppCompatDelegate.m40732t()) == null) {
            return null;
        }
        LocaleListCompat m40612v0 = m40612v0(context.getApplicationContext().getResources().getConfiguration());
        if (i >= 24) {
            m38003c = C0345v.m40533b(m40732t, m40612v0);
        } else if (m40732t.m38000f()) {
            m38003c = LocaleListCompat.m38001e();
        } else {
            m38003c = LocaleListCompat.m38003c(m40732t.m38002d(0).toString());
        }
        if (!m38003c.m38000f()) {
            return m38003c;
        }
        return m40612v0;
    }

    /* renamed from: Z0 */
    boolean m40653Z0() {
        if (this.f1027q0 == null) {
            return false;
        }
        C0324u m40610w0 = m40610w0(0, false);
        if ((m40610w0 == null || !m40610w0.f1075o) && this.f988D == null) {
            return false;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.C0389g.InterfaceC0390a
    /* renamed from: a */
    public boolean mo40035a(C0389g c0389g, MenuItem menuItem) {
        C0324u m40622p0;
        Window.Callback m40608y0 = m40608y0();
        if (m40608y0 != null && !this.f1011a0 && (m40622p0 = m40622p0(c0389g.mo40286D())) != null) {
            return m40608y0.onMenuItemSelected(m40622p0.f1061a, menuItem);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /* renamed from: a1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.appcompat.view.ActionMode m40651a1(androidx.appcompat.view.ActionMode.Callback r8) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.LayoutInflater$Factory2C0300f.m40651a1(androidx.appcompat.view.ActionMode$Callback):androidx.appcompat.view.ActionMode");
    }

    @Override // androidx.appcompat.view.menu.C0389g.InterfaceC0390a
    /* renamed from: b */
    public void mo40034b(C0389g c0389g) {
        m40664T0(true);
    }

    /* renamed from: b0 */
    void m40650b0(int i, C0324u c0324u, Menu menu) {
        if (menu == null) {
            if (c0324u == null && i >= 0) {
                C0324u[] c0324uArr = this.f1006V;
                if (i < c0324uArr.length) {
                    c0324u = c0324uArr[i];
                }
            }
            if (c0324u != null) {
                menu = c0324u.f1070j;
            }
        }
        if ((c0324u == null || c0324u.f1075o) && !this.f1011a0) {
            this.f1032v.m40589d(this.f1031u.getCallback(), i, menu);
        }
    }

    /* renamed from: c0 */
    void m40648c0(C0389g c0389g) {
        if (this.f1005U) {
            return;
        }
        this.f1005U = true;
        this.f985A.mo39810i();
        Window.Callback m40608y0 = m40608y0();
        if (m40608y0 != null && !this.f1011a0) {
            m40608y0.onPanelClosed(108, c0389g);
        }
        this.f1005U = false;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: e */
    public void mo40644e(View view, ViewGroup.LayoutParams layoutParams) {
        m40625n0();
        ((ViewGroup) this.f995K.findViewById(16908290)).addView(view, layoutParams);
        this.f1032v.m40590c(this.f1031u.getCallback());
    }

    /* renamed from: e0 */
    void m40643e0(int i) {
        m40640f0(m40610w0(i, true), true);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: f */
    public boolean mo40641f() {
        return m40662V(true);
    }

    /* renamed from: f0 */
    void m40640f0(C0324u c0324u, boolean z) {
        ViewGroup viewGroup;
        InterfaceC0531j0 interfaceC0531j0;
        if (z && c0324u.f1061a == 0 && (interfaceC0531j0 = this.f985A) != null && interfaceC0531j0.mo39814e()) {
            m40648c0(c0324u.f1070j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f1030t.getSystemService("window");
        if (windowManager != null && c0324u.f1075o && (viewGroup = c0324u.f1067g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                m40650b0(c0324u.f1061a, c0324u, null);
            }
        }
        c0324u.f1073m = false;
        c0324u.f1074n = false;
        c0324u.f1075o = false;
        c0324u.f1068h = null;
        c0324u.f1077q = true;
        if (this.f1007W == c0324u) {
            this.f1007W = null;
        }
        if (c0324u.f1061a == 0) {
            m40639f1();
        }
    }

    /* renamed from: f1 */
    void m40639f1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean m40653Z0 = m40653Z0();
            if (m40653Z0 && this.f1028r0 == null) {
                this.f1028r0 = C0316n.m40593b(this.f1027q0, this);
            } else if (!m40653Z0 && (onBackInvokedCallback = this.f1028r0) != null) {
                C0316n.m40592c(this.f1027q0, onBackInvokedCallback);
            }
        }
    }

    /* renamed from: h1 */
    final int m40635h1(WindowInsetsCompat windowInsetsCompat, Rect rect) {
        int i;
        boolean z;
        int m37734m;
        int m37733n;
        boolean z2;
        int i2 = 0;
        if (windowInsetsCompat != null) {
            i = windowInsetsCompat.m37732o();
        } else if (rect != null) {
            i = rect.top;
        } else {
            i = 0;
        }
        ActionBarContextView actionBarContextView = this.f989E;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f989E.getLayoutParams();
            boolean z3 = true;
            if (this.f989E.isShown()) {
                if (this.f1023m0 == null) {
                    this.f1023m0 = new Rect();
                    this.f1024n0 = new Rect();
                }
                Rect rect2 = this.f1023m0;
                Rect rect3 = this.f1024n0;
                if (windowInsetsCompat == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(windowInsetsCompat.m37734m(), windowInsetsCompat.m37732o(), windowInsetsCompat.m37733n(), windowInsetsCompat.m37735l());
                }
                C0616y1.m39573a(this.f995K, rect2, rect3);
                int i3 = rect2.top;
                int i4 = rect2.left;
                int i5 = rect2.right;
                WindowInsetsCompat m37244I = C1365w0.m37244I(this.f995K);
                if (m37244I == null) {
                    m37734m = 0;
                } else {
                    m37734m = m37244I.m37734m();
                }
                if (m37244I == null) {
                    m37733n = 0;
                } else {
                    m37733n = m37244I.m37733n();
                }
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z2 = true;
                }
                if (i3 > 0 && this.f997M == null) {
                    View view = new View(this.f1030t);
                    this.f997M = view;
                    view.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = m37734m;
                    layoutParams.rightMargin = m37733n;
                    this.f995K.addView(this.f997M, -1, layoutParams);
                } else {
                    View view2 = this.f997M;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != m37734m || marginLayoutParams2.rightMargin != m37733n) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = m37734m;
                            marginLayoutParams2.rightMargin = m37733n;
                            this.f997M.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = this.f997M;
                if (view3 == null) {
                    z3 = false;
                }
                if (z3 && view3.getVisibility() != 0) {
                    m40632i1(this.f997M);
                }
                if (!this.f1002R && z3) {
                    i = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.f989E.setLayoutParams(marginLayoutParams);
            }
        } else {
            z = false;
        }
        View view4 = this.f997M;
        if (view4 != null) {
            if (!z) {
                i2 = 8;
            }
            view4.setVisibility(i2);
        }
        return i;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: i */
    public Context mo40634i(Context context) {
        Configuration configuration;
        boolean z = true;
        this.f1009Y = true;
        int m40688F0 = m40688F0(context, m40652a0());
        if (AppCompatDelegate.m40731x(context)) {
            AppCompatDelegate.m40742U(context);
        }
        LocaleListCompat m40654Z = m40654Z(context);
        if (f984w0 && (context instanceof ContextThemeWrapper)) {
            try {
                C0322s.m40581a((ContextThemeWrapper) context, m40638g0(context, m40688F0, m40654Z, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C0359c) {
            try {
                ((C0359c) context).m40486a(m40638g0(context, m40688F0, m40654Z, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f983v0) {
            return super.mo40634i(context);
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = C0312j.m40605a(context, configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = m40620q0(configuration3, configuration4);
        } else {
            configuration = null;
        }
        Configuration m40638g0 = m40638g0(context, m40688F0, m40654Z, configuration, true);
        C0359c c0359c = new C0359c(context, C5714i.f16221c);
        c0359c.m40486a(m40638g0);
        boolean z2 = false;
        try {
            if (context.getTheme() == null) {
                z = false;
            }
            z2 = z;
        } catch (NullPointerException unused3) {
        }
        if (z2) {
            C0980h.C0986f.m38220a(c0359c.getTheme());
        }
        return super.mo40634i(c0359c);
    }

    /* renamed from: i0 */
    public View m40633i0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        boolean z2 = false;
        if (this.f1025o0 == null) {
            String string = this.f1030t.obtainStyledAttributes(C5715j.f16466y0).getString(C5715j.f16234C0);
            if (string == null) {
                this.f1025o0 = new C0336q();
            } else {
                try {
                    this.f1025o0 = (C0336q) this.f1030t.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th2) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th2);
                    this.f1025o0 = new C0336q();
                }
            }
        }
        boolean z3 = f981t0;
        if (z3) {
            if (this.f1026p0 == null) {
                this.f1026p0 = new C0344u();
            }
            if (this.f1026p0.m40538a(attributeSet)) {
                z = true;
                return this.f1025o0.m40552r(view, str, context, attributeSet, z, z3, true, C0613x1.m39576d());
            } else if (attributeSet instanceof XmlPullParser) {
                if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    z2 = true;
                }
            } else {
                z2 = m40655Y0((ViewParent) view);
            }
        }
        z = z2;
        return this.f1025o0.m40552r(view, str, context, attributeSet, z, z3, true, C0613x1.m39576d());
    }

    /* renamed from: j0 */
    void m40631j0() {
        C0389g c0389g;
        InterfaceC0531j0 interfaceC0531j0 = this.f985A;
        if (interfaceC0531j0 != null) {
            interfaceC0531j0.mo39810i();
        }
        if (this.f990F != null) {
            this.f1031u.getDecorView().removeCallbacks(this.f991G);
            if (this.f990F.isShowing()) {
                try {
                    this.f990F.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f990F = null;
        }
        m40627m0();
        C0324u m40610w0 = m40610w0(0, false);
        if (m40610w0 != null && (c0389g = m40610w0.f1070j) != null) {
            c0389g.close();
        }
    }

    /* renamed from: k0 */
    boolean m40630k0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f1029s;
        boolean z = true;
        if (((obj instanceof C1352u.InterfaceC1353a) || (obj instanceof DialogC0335p)) && (decorView = this.f1031u.getDecorView()) != null && C1352u.m37283d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f1032v.m40591b(this.f1031u.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0) {
            z = false;
        }
        if (z) {
            return m40685H0(keyCode, keyEvent);
        }
        return m40681K0(keyCode, keyEvent);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: l */
    public <T extends View> T mo40629l(int i) {
        m40625n0();
        return (T) this.f1031u.findViewById(i);
    }

    /* renamed from: l0 */
    void m40628l0(int i) {
        C0324u m40610w0;
        C0324u m40610w02 = m40610w0(i, true);
        if (m40610w02.f1070j != null) {
            Bundle bundle = new Bundle();
            m40610w02.f1070j.m40381Q(bundle);
            if (bundle.size() > 0) {
                m40610w02.f1079s = bundle;
            }
            m40610w02.f1070j.m40365d0();
            m40610w02.f1070j.clear();
        }
        m40610w02.f1078r = true;
        m40610w02.f1077q = true;
        if ((i == 108 || i == 0) && this.f985A != null && (m40610w0 = m40610w0(0, false)) != null) {
            m40610w0.f1073m = false;
            m40666S0(m40610w0, null);
        }
    }

    /* renamed from: m0 */
    void m40627m0() {
        C1304n2 c1304n2 = this.f992H;
        if (c1304n2 != null) {
            c1304n2.m37369c();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: n */
    public Context mo40626n() {
        return this.f1030t;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return m40633i0(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: p */
    public final ActionBarDrawerToggle$Delegate mo40623p() {
        return new C0307f();
    }

    /* renamed from: p0 */
    C0324u m40622p0(Menu menu) {
        int i;
        C0324u[] c0324uArr = this.f1006V;
        if (c0324uArr != null) {
            i = c0324uArr.length;
        } else {
            i = 0;
        }
        for (int i2 = 0; i2 < i; i2++) {
            C0324u c0324u = c0324uArr[i2];
            if (c0324u != null && c0324u.f1070j == menu) {
                return c0324u;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: q */
    public int mo40621q() {
        return this.f1013c0;
    }

    /* renamed from: r0 */
    final Context m40619r0() {
        Context context;
        ActionBar mo40615u = mo40615u();
        if (mo40615u != null) {
            context = mo40615u.mo40521k();
        } else {
            context = null;
        }
        if (context == null) {
            return this.f1030t;
        }
        return context;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: s */
    public MenuInflater mo40618s() {
        Context context;
        if (this.f1035y == null) {
            m40606z0();
            ActionBar actionBar = this.f1034x;
            if (actionBar != null) {
                context = actionBar.mo40521k();
            } else {
                context = this.f1030t;
            }
            this.f1035y = new C0364f(context);
        }
        return this.f1035y;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: u */
    public ActionBar mo40615u() {
        m40606z0();
        return this.f1034x;
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: v */
    public void mo40613v() {
        LayoutInflater from = LayoutInflater.from(this.f1030t);
        if (from.getFactory() == null) {
            C1358v.m37276a(from, this);
        } else if (!(from.getFactory2() instanceof LayoutInflater$Factory2C0300f)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    /* renamed from: v0 */
    LocaleListCompat m40612v0(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C0314l.m40598b(configuration);
        }
        return LocaleListCompat.m38003c(C0313k.m40600b(configuration.locale));
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: w */
    public void mo40611w() {
        if (m40670Q0() != null && !mo40615u().mo40520l()) {
            m40692D0(0);
        }
    }

    /* renamed from: w0 */
    protected C0324u m40610w0(int i, boolean z) {
        C0324u[] c0324uArr = this.f1006V;
        if (c0324uArr == null || c0324uArr.length <= i) {
            C0324u[] c0324uArr2 = new C0324u[i + 1];
            if (c0324uArr != null) {
                System.arraycopy(c0324uArr, 0, c0324uArr2, 0, c0324uArr.length);
            }
            this.f1006V = c0324uArr2;
            c0324uArr = c0324uArr2;
        }
        C0324u c0324u = c0324uArr[i];
        if (c0324u == null) {
            C0324u c0324u2 = new C0324u(i);
            c0324uArr[i] = c0324u2;
            return c0324u2;
        }
        return c0324u;
    }

    /* renamed from: x0 */
    final CharSequence m40609x0() {
        Object obj = this.f1029s;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.f1036z;
    }

    /* renamed from: y0 */
    final Window.Callback m40608y0() {
        return this.f1031u.getCallback();
    }

    @Override // androidx.appcompat.app.AppCompatDelegate
    /* renamed from: z */
    public void mo40607z(Configuration configuration) {
        ActionBar mo40615u;
        if (this.f1000P && this.f994J && (mo40615u = mo40615u()) != null) {
            mo40615u.mo40519m(configuration);
        }
        C0529j.m39839b().m39834g(this.f1030t);
        this.f1012b0 = new Configuration(this.f1030t.getResources().getConfiguration());
        m40660W(false, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater$Factory2C0300f(Dialog dialog, InterfaceC0297c interfaceC0297c) {
        this(dialog.getContext(), dialog.getWindow(), interfaceC0297c, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private LayoutInflater$Factory2C0300f(Context context, Window window, InterfaceC0297c interfaceC0297c, Object obj) {
        SimpleArrayMap<String, Integer> simpleArrayMap;
        Integer num;
        ActivityC0294b m40647c1;
        this.f992H = null;
        this.f993I = true;
        this.f1013c0 = -100;
        this.f1021k0 = new RunnableC0301a();
        this.f1030t = context;
        this.f1033w = interfaceC0297c;
        this.f1029s = obj;
        if (this.f1013c0 == -100 && (obj instanceof Dialog) && (m40647c1 = m40647c1()) != null) {
            this.f1013c0 = m40647c1.getDelegate().mo40621q();
        }
        if (this.f1013c0 == -100 && (num = (simpleArrayMap = f980s0).get(obj.getClass().getName())) != null) {
            this.f1013c0 = num.intValue();
            simpleArrayMap.remove(obj.getClass().getName());
        }
        if (window != null) {
            m40656Y(window);
        }
        C0529j.m39833h();
    }
}
