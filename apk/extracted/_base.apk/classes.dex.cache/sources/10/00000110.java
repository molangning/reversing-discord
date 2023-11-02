package androidx.activity;

import android.annotation.SuppressLint;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.core.p018os.C1049a;
import androidx.core.util.Consumer;
import androidx.lifecycle.InterfaceC1695l;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f762a;

    /* renamed from: b */
    final ArrayDeque<AbstractC0256g> f763b;

    /* renamed from: c */
    private Consumer<Boolean> f764c;

    /* renamed from: d */
    private OnBackInvokedCallback f765d;

    /* renamed from: e */
    private OnBackInvokedDispatcher f766e;

    /* renamed from: f */
    private boolean f767f;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class LifecycleOnBackPressedCancellable implements InterfaceC1695l, InterfaceC0250a {

        /* renamed from: j */
        private final Lifecycle f768j;

        /* renamed from: k */
        private final AbstractC0256g f769k;

        /* renamed from: l */
        private InterfaceC0250a f770l;

        LifecycleOnBackPressedCancellable(Lifecycle lifecycle, AbstractC0256g abstractC0256g) {
            OnBackPressedDispatcher.this = r1;
            this.f768j = lifecycle;
            this.f769k = abstractC0256g;
            lifecycle.mo36125a(this);
        }

        @Override // androidx.lifecycle.InterfaceC1695l
        /* renamed from: a */
        public void mo11423a(LifecycleOwner lifecycleOwner, Lifecycle.EnumC1651b enumC1651b) {
            if (enumC1651b == Lifecycle.EnumC1651b.ON_START) {
                this.f770l = OnBackPressedDispatcher.this.m40833c(this.f769k);
            } else if (enumC1651b == Lifecycle.EnumC1651b.ON_STOP) {
                InterfaceC0250a interfaceC0250a = this.f770l;
                if (interfaceC0250a != null) {
                    interfaceC0250a.cancel();
                }
            } else if (enumC1651b == Lifecycle.EnumC1651b.ON_DESTROY) {
                cancel();
            }
        }

        @Override // androidx.activity.InterfaceC0250a
        public void cancel() {
            this.f768j.mo36123c(this);
            this.f769k.m40813e(this);
            InterfaceC0250a interfaceC0250a = this.f770l;
            if (interfaceC0250a != null) {
                interfaceC0250a.cancel();
                this.f770l = null;
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0248a {
        /* renamed from: a */
        static OnBackInvokedCallback m40827a(Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new C0259j(runnable);
        }

        /* renamed from: b */
        static void m40826b(Object obj, int i, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
        }

        /* renamed from: c */
        static void m40825c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0249b implements InterfaceC0250a {

        /* renamed from: j */
        private final AbstractC0256g f772j;

        C0249b(AbstractC0256g abstractC0256g) {
            OnBackPressedDispatcher.this = r1;
            this.f772j = abstractC0256g;
        }

        @Override // androidx.activity.InterfaceC0250a
        public void cancel() {
            OnBackPressedDispatcher.this.f763b.remove(this.f772j);
            this.f772j.m40813e(this);
            if (C1049a.m37988c()) {
                this.f772j.m40811g(null);
                OnBackPressedDispatcher.this.m40828h();
            }
        }
    }

    public OnBackPressedDispatcher() {
        this(null);
    }

    /* renamed from: e */
    public /* synthetic */ void m40831e(Boolean bool) {
        if (C1049a.m37988c()) {
            m40828h();
        }
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: b */
    public void m40834b(LifecycleOwner lifecycleOwner, AbstractC0256g abstractC0256g) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.mo36124b() == Lifecycle.State.DESTROYED) {
            return;
        }
        abstractC0256g.m40816a(new LifecycleOnBackPressedCancellable(lifecycle, abstractC0256g));
        if (C1049a.m37988c()) {
            m40828h();
            abstractC0256g.m40811g(this.f764c);
        }
    }

    /* renamed from: c */
    InterfaceC0250a m40833c(AbstractC0256g abstractC0256g) {
        this.f763b.add(abstractC0256g);
        C0249b c0249b = new C0249b(abstractC0256g);
        abstractC0256g.m40816a(c0249b);
        if (C1049a.m37988c()) {
            m40828h();
            abstractC0256g.m40811g(this.f764c);
        }
        return c0249b;
    }

    /* renamed from: d */
    public boolean m40832d() {
        Iterator<AbstractC0256g> descendingIterator = this.f763b.descendingIterator();
        while (descendingIterator.hasNext()) {
            if (descendingIterator.next().m40815c()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public void m40830f() {
        Iterator<AbstractC0256g> descendingIterator = this.f763b.descendingIterator();
        while (descendingIterator.hasNext()) {
            AbstractC0256g next = descendingIterator.next();
            if (next.m40815c()) {
                next.mo24970b();
                return;
            }
        }
        Runnable runnable = this.f762a;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: g */
    public void m40829g(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        this.f766e = onBackInvokedDispatcher;
        m40828h();
    }

    /* renamed from: h */
    void m40828h() {
        boolean m40832d = m40832d();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f766e;
        if (onBackInvokedDispatcher != null) {
            if (m40832d && !this.f767f) {
                C0248a.m40826b(onBackInvokedDispatcher, 0, this.f765d);
                this.f767f = true;
            } else if (!m40832d && this.f767f) {
                C0248a.m40825c(onBackInvokedDispatcher, this.f765d);
                this.f767f = false;
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f763b = new ArrayDeque<>();
        this.f767f = false;
        this.f762a = runnable;
        if (C1049a.m37988c()) {
            this.f764c = new Consumer() { // from class: androidx.activity.h
                @Override // androidx.core.util.Consumer
                public final void accept(Object obj) {
                    OnBackPressedDispatcher.this.m40831e((Boolean) obj);
                }
            };
            this.f765d = C0248a.m40827a(new Runnable() { // from class: androidx.activity.i
                @Override // java.lang.Runnable
                public final void run() {
                    OnBackPressedDispatcher.this.m40830f();
                }
            });
        }
    }
}