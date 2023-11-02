package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.InterfaceC1695l;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class MenuHostHelper {

    /* renamed from: a */
    private final Runnable f3528a;

    /* renamed from: b */
    private final CopyOnWriteArrayList<MenuProvider> f3529b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    private final Map<MenuProvider, C1150a> f3530c = new HashMap();

    /* renamed from: androidx.core.view.MenuHostHelper$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1150a {

        /* renamed from: a */
        final Lifecycle f3531a;

        /* renamed from: b */
        private InterfaceC1695l f3532b;

        C1150a(Lifecycle lifecycle, InterfaceC1695l interfaceC1695l) {
            this.f3531a = lifecycle;
            this.f3532b = interfaceC1695l;
            lifecycle.mo36125a(interfaceC1695l);
        }

        /* renamed from: a */
        void m37775a() {
            this.f3531a.mo36123c(this.f3532b);
            this.f3532b = null;
        }
    }

    public MenuHostHelper(Runnable runnable) {
        this.f3528a = runnable;
    }

    /* renamed from: f */
    public /* synthetic */ void m37782f(MenuProvider menuProvider, LifecycleOwner lifecycleOwner, Lifecycle.EnumC1651b enumC1651b) {
        if (enumC1651b == Lifecycle.EnumC1651b.ON_DESTROY) {
            m37776l(menuProvider);
        }
    }

    /* renamed from: g */
    public /* synthetic */ void m37781g(Lifecycle.State state, MenuProvider menuProvider, LifecycleOwner lifecycleOwner, Lifecycle.EnumC1651b enumC1651b) {
        if (enumC1651b == Lifecycle.EnumC1651b.m36128d(state)) {
            m37785c(menuProvider);
        } else if (enumC1651b == Lifecycle.EnumC1651b.ON_DESTROY) {
            m37776l(menuProvider);
        } else if (enumC1651b == Lifecycle.EnumC1651b.m36131a(state)) {
            this.f3529b.remove(menuProvider);
            this.f3528a.run();
        }
    }

    /* renamed from: c */
    public void m37785c(MenuProvider menuProvider) {
        this.f3529b.add(menuProvider);
        this.f3528a.run();
    }

    /* renamed from: d */
    public void m37784d(final MenuProvider menuProvider, LifecycleOwner lifecycleOwner) {
        m37785c(menuProvider);
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        C1150a remove = this.f3530c.remove(menuProvider);
        if (remove != null) {
            remove.m37775a();
        }
        this.f3530c.put(menuProvider, new C1150a(lifecycle, new InterfaceC1695l() { // from class: androidx.core.view.x
            @Override // androidx.lifecycle.InterfaceC1695l
            /* renamed from: a */
            public final void mo11423a(LifecycleOwner lifecycleOwner2, Lifecycle.EnumC1651b enumC1651b) {
                MenuHostHelper.this.m37782f(menuProvider, lifecycleOwner2, enumC1651b);
            }
        }));
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: e */
    public void m37783e(final MenuProvider menuProvider, LifecycleOwner lifecycleOwner, final Lifecycle.State state) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        C1150a remove = this.f3530c.remove(menuProvider);
        if (remove != null) {
            remove.m37775a();
        }
        this.f3530c.put(menuProvider, new C1150a(lifecycle, new InterfaceC1695l() { // from class: androidx.core.view.y
            @Override // androidx.lifecycle.InterfaceC1695l
            /* renamed from: a */
            public final void mo11423a(LifecycleOwner lifecycleOwner2, Lifecycle.EnumC1651b enumC1651b) {
                MenuHostHelper.this.m37781g(state, menuProvider, lifecycleOwner2, enumC1651b);
            }
        }));
    }

    /* renamed from: h */
    public void m37780h(Menu menu, MenuInflater menuInflater) {
        Iterator<MenuProvider> it = this.f3529b.iterator();
        while (it.hasNext()) {
            it.next().m37771d(menu, menuInflater);
        }
    }

    /* renamed from: i */
    public void m37779i(Menu menu) {
        Iterator<MenuProvider> it = this.f3529b.iterator();
        while (it.hasNext()) {
            it.next().m37774a(menu);
        }
    }

    /* renamed from: j */
    public boolean m37778j(MenuItem menuItem) {
        Iterator<MenuProvider> it = this.f3529b.iterator();
        while (it.hasNext()) {
            if (it.next().m37772c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public void m37777k(Menu menu) {
        Iterator<MenuProvider> it = this.f3529b.iterator();
        while (it.hasNext()) {
            it.next().m37773b(menu);
        }
    }

    /* renamed from: l */
    public void m37776l(MenuProvider menuProvider) {
        this.f3529b.remove(menuProvider);
        C1150a remove = this.f3530c.remove(menuProvider);
        if (remove != null) {
            remove.m37775a();
        }
        this.f3528a.run();
    }
}