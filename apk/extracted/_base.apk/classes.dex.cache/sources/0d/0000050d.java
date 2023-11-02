package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class WindowInsetsControllerCompat {

    /* renamed from: a */
    private final C1169e f3573a;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.WindowInsetsControllerCompat$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1165a extends C1169e {

        /* renamed from: a */
        protected final Window f3574a;

        /* renamed from: b */
        private final View f3575b;

        C1165a(Window window, View view) {
            this.f3574a = window;
            this.f3575b = view;
        }

        /* renamed from: g */
        private void m37666g(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 8) {
                        ((InputMethodManager) this.f3574a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f3574a.getDecorView().getWindowToken(), 0);
                        return;
                    }
                    return;
                }
                m37664i(2);
                return;
            }
            m37664i(4);
        }

        /* renamed from: h */
        public static /* synthetic */ void m37665h(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        /* renamed from: k */
        private void m37662k(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 8) {
                        final View view = this.f3575b;
                        if (!view.isInEditMode() && !view.onCheckIsTextEditor()) {
                            view = this.f3574a.getCurrentFocus();
                        } else {
                            view.requestFocus();
                        }
                        if (view == null) {
                            view = this.f3574a.findViewById(16908290);
                        }
                        if (view != null && view.hasWindowFocus()) {
                            view.post(new Runnable() { // from class: androidx.core.view.z3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    WindowInsetsControllerCompat.C1165a.m37665h(view);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    return;
                }
                m37661l(2);
                return;
            }
            m37661l(4);
            m37660m(1024);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C1169e
        /* renamed from: a */
        void mo37657a(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    m37666g(i2);
                }
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C1169e
        /* renamed from: d */
        void mo37654d(int i) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        m37661l(RecyclerView.ItemAnimator.FLAG_MOVED);
                        m37664i(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
                        return;
                    }
                    return;
                }
                m37661l(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
                m37664i(RecyclerView.ItemAnimator.FLAG_MOVED);
                return;
            }
            m37661l(6144);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C1169e
        /* renamed from: e */
        void mo37653e(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    m37662k(i2);
                }
            }
        }

        /* renamed from: i */
        protected void m37664i(int i) {
            View decorView = this.f3574a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* renamed from: j */
        protected void m37663j(int i) {
            this.f3574a.addFlags(i);
        }

        /* renamed from: l */
        protected void m37661l(int i) {
            View decorView = this.f3574a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        /* renamed from: m */
        protected void m37660m(int i) {
            this.f3574a.clearFlags(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.WindowInsetsControllerCompat$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1166b extends C1165a {
        C1166b(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C1169e
        /* renamed from: c */
        public void mo37655c(boolean z) {
            if (z) {
                m37660m(67108864);
                m37663j(Integer.MIN_VALUE);
                m37664i(8192);
                return;
            }
            m37661l(8192);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.WindowInsetsControllerCompat$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1167c extends C1166b {
        C1167c(Window window, View view) {
            super(window, view);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C1169e
        /* renamed from: b */
        public void mo37656b(boolean z) {
            if (z) {
                m37660m(134217728);
                m37663j(Integer.MIN_VALUE);
                m37664i(16);
                return;
            }
            m37661l(16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.WindowInsetsControllerCompat$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1169e {
        C1169e() {
        }

        /* renamed from: a */
        void mo37657a(int i) {
            throw null;
        }

        /* renamed from: b */
        public void mo37656b(boolean z) {
        }

        /* renamed from: c */
        public void mo37655c(boolean z) {
            throw null;
        }

        /* renamed from: d */
        void mo37654d(int i) {
            throw null;
        }

        /* renamed from: e */
        void mo37653e(int i) {
            throw null;
        }
    }

    @Deprecated
    private WindowInsetsControllerCompat(WindowInsetsController windowInsetsController) {
        this.f3573a = new C1168d(windowInsetsController, this);
    }

    @Deprecated
    /* renamed from: f */
    public static WindowInsetsControllerCompat m37668f(WindowInsetsController windowInsetsController) {
        return new WindowInsetsControllerCompat(windowInsetsController);
    }

    /* renamed from: a */
    public void m37673a(int i) {
        this.f3573a.mo37657a(i);
    }

    /* renamed from: b */
    public void m37672b(boolean z) {
        this.f3573a.mo37656b(z);
    }

    /* renamed from: c */
    public void m37671c(boolean z) {
        this.f3573a.mo37655c(z);
    }

    /* renamed from: d */
    public void m37670d(int i) {
        this.f3573a.mo37654d(i);
    }

    /* renamed from: e */
    public void m37669e(int i) {
        this.f3573a.mo37653e(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.view.WindowInsetsControllerCompat$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1168d extends C1169e {

        /* renamed from: a */
        final WindowInsetsControllerCompat f3576a;

        /* renamed from: b */
        final WindowInsetsController f3577b;

        /* renamed from: c */
        private final SimpleArrayMap<Object, WindowInsetsController.OnControllableInsetsChangedListener> f3578c;

        /* renamed from: d */
        protected Window f3579d;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        C1168d(android.view.Window r2, androidx.core.view.WindowInsetsControllerCompat r3) {
            /*
                r1 = this;
                android.view.WindowInsetsController r0 = androidx.core.view.C1247d4.m37465a(r2)
                r1.<init>(r0, r3)
                r1.f3579d = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.WindowInsetsControllerCompat.C1168d.<init>(android.view.Window, androidx.core.view.WindowInsetsControllerCompat):void");
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C1169e
        /* renamed from: a */
        void mo37657a(int i) {
            this.f3577b.hide(i);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C1169e
        /* renamed from: b */
        public void mo37656b(boolean z) {
            if (z) {
                if (this.f3579d != null) {
                    m37659f(16);
                }
                this.f3577b.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.f3579d != null) {
                m37658g(16);
            }
            this.f3577b.setSystemBarsAppearance(0, 16);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C1169e
        /* renamed from: c */
        public void mo37655c(boolean z) {
            if (z) {
                if (this.f3579d != null) {
                    m37659f(8192);
                }
                this.f3577b.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.f3579d != null) {
                m37658g(8192);
            }
            this.f3577b.setSystemBarsAppearance(0, 8);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C1169e
        /* renamed from: d */
        void mo37654d(int i) {
            this.f3577b.setSystemBarsBehavior(i);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.C1169e
        /* renamed from: e */
        void mo37653e(int i) {
            Window window = this.f3579d;
            if (window != null && (i & 8) != 0 && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) window.getContext().getSystemService("input_method")).isActive();
            }
            this.f3577b.show(i);
        }

        /* renamed from: f */
        protected void m37659f(int i) {
            View decorView = this.f3579d.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* renamed from: g */
        protected void m37658g(int i) {
            View decorView = this.f3579d.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        C1168d(WindowInsetsController windowInsetsController, WindowInsetsControllerCompat windowInsetsControllerCompat) {
            this.f3578c = new SimpleArrayMap<>();
            this.f3577b = windowInsetsController;
            this.f3576a = windowInsetsControllerCompat;
        }
    }

    public WindowInsetsControllerCompat(Window window, View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f3573a = new C1168d(window, this);
        } else if (i >= 26) {
            this.f3573a = new C1167c(window, view);
        } else {
            this.f3573a = new C1166b(window, view);
        }
    }
}