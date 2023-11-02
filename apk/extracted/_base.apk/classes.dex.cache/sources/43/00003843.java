package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.C7687a1;
import io.sentry.C7830b;
import io.sentry.C7831b0;
import io.sentry.C7923f4;
import io.sentry.C8264x;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC7832b1;
import io.sentry.InterfaceC8040o0;
import io.sentry.InterfaceC8270y;
import io.sentry.android.core.internal.gestures.C7752j;
import io.sentry.android.core.internal.util.C7758a;
import io.sentry.android.core.internal.util.C7759b;
import io.sentry.android.core.internal.util.C7765g;
import io.sentry.internal.viewhierarchy.InterfaceC7990a;
import io.sentry.protocol.C8066b0;
import io.sentry.protocol.C8070c0;
import io.sentry.protocol.C8114x;
import io.sentry.util.C8220j;
import io.sentry.util.C8229o;
import io.sentry.util.thread.InterfaceC8236b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ViewHierarchyEventProcessor implements InterfaceC8270y, InterfaceC7832b1 {

    /* renamed from: j */
    private final SentryAndroidOptions f21123j;

    /* renamed from: k */
    private final C7765g f21124k = new C7765g(C7758a.m19779b(), 2000);

    public ViewHierarchyEventProcessor(SentryAndroidOptions sentryAndroidOptions) {
        this.f21123j = (SentryAndroidOptions) C8229o.m18169c(sentryAndroidOptions, "SentryAndroidOptions is required");
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            m19946d();
        }
    }

    /* renamed from: c */
    private static void m19947c(View view, C8070c0 c8070c0, List<InterfaceC7990a> list) {
        if (!(view instanceof ViewGroup)) {
            return;
        }
        for (InterfaceC7990a interfaceC7990a : list) {
            if (interfaceC7990a.m19091a(c8070c0, view)) {
                return;
            }
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        if (childCount == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(childCount);
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                C8070c0 m19941l = m19941l(childAt);
                arrayList.add(m19941l);
                m19947c(childAt, m19941l, list);
            }
        }
        c8070c0.m18775m(arrayList);
    }

    /* renamed from: e */
    public static /* synthetic */ void m19945e(AtomicReference atomicReference, View view, List list, CountDownLatch countDownLatch, InterfaceC8040o0 interfaceC8040o0) {
        try {
            atomicReference.set(m19942k(view, list));
            countDownLatch.countDown();
        } catch (Throwable th2) {
            interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "Failed to process view hierarchy.", th2);
        }
    }

    /* renamed from: f */
    public static C8066b0 m19944f(Activity activity, InterfaceC8040o0 interfaceC8040o0) {
        return m19943g(activity, new ArrayList(0), C7759b.m19778d(), interfaceC8040o0);
    }

    /* renamed from: g */
    public static C8066b0 m19943g(Activity activity, final List<InterfaceC7990a> list, InterfaceC8236b interfaceC8236b, final InterfaceC8040o0 interfaceC8040o0) {
        if (activity == null) {
            interfaceC8040o0.mo18135c(EnumC8021m4.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            interfaceC8040o0.mo18135c(EnumC8021m4.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        final View peekDecorView = window.peekDecorView();
        if (peekDecorView == null) {
            interfaceC8040o0.mo18135c(EnumC8021m4.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        try {
        } catch (Throwable th2) {
            interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "Failed to process view hierarchy.", th2);
        }
        if (interfaceC8236b.mo18150a()) {
            return m19942k(peekDecorView, list);
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicReference atomicReference = new AtomicReference(null);
        activity.runOnUiThread(new Runnable() { // from class: io.sentry.android.core.o1
            @Override // java.lang.Runnable
            public final void run() {
                ViewHierarchyEventProcessor.m19945e(atomicReference, peekDecorView, list, countDownLatch, interfaceC8040o0);
            }
        });
        if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
            return (C8066b0) atomicReference.get();
        }
        return null;
    }

    /* renamed from: k */
    public static C8066b0 m19942k(View view, List<InterfaceC7990a> list) {
        ArrayList arrayList = new ArrayList(1);
        C8066b0 c8066b0 = new C8066b0("android_view_system", arrayList);
        C8070c0 m19941l = m19941l(view);
        arrayList.add(m19941l);
        m19947c(view, m19941l, list);
        return c8066b0;
    }

    /* renamed from: l */
    private static C8070c0 m19941l(View view) {
        C8070c0 c8070c0 = new C8070c0();
        String canonicalName = view.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = view.getClass().getSimpleName();
        }
        c8070c0.m18772p(canonicalName);
        try {
            c8070c0.m18773o(C7752j.m19793b(view));
        } catch (Throwable unused) {
        }
        c8070c0.m18768t(Double.valueOf(view.getX()));
        c8070c0.m18767u(Double.valueOf(view.getY()));
        c8070c0.m18769s(Double.valueOf(view.getWidth()));
        c8070c0.m18774n(Double.valueOf(view.getHeight()));
        c8070c0.m18776l(Double.valueOf(view.getAlpha()));
        int visibility = view.getVisibility();
        if (visibility != 0) {
            if (visibility != 4) {
                if (visibility == 8) {
                    c8070c0.m18770r("gone");
                }
            } else {
                c8070c0.m18770r("invisible");
            }
        } else {
            c8070c0.m18770r(ViewProps.VISIBLE);
        }
        return c8070c0;
    }

    /* renamed from: d */
    public /* synthetic */ void m19946d() {
        C7687a1.m20046a(this);
    }

    @Override // io.sentry.InterfaceC7832b1
    /* renamed from: h */
    public /* synthetic */ String mo19588h() {
        return C7687a1.m20045b(this);
    }

    @Override // io.sentry.InterfaceC8270y
    /* renamed from: i */
    public C7923f4 mo18043i(C7923f4 c7923f4, C7831b0 c7831b0) {
        if (!c7923f4.m19190w0()) {
            return c7923f4;
        }
        if (!this.f21123j.isAttachViewHierarchy()) {
            this.f21123j.getLogger().mo18135c(EnumC8021m4.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
            return c7923f4;
        } else if (C8220j.m18221i(c7831b0)) {
            return c7923f4;
        } else {
            boolean m19764a = this.f21124k.m19764a();
            this.f21123j.getBeforeViewHierarchyCaptureCallback();
            if (m19764a) {
                return c7923f4;
            }
            C8066b0 m19943g = m19943g(C7806r0.m19680c().m19681b(), this.f21123j.getViewHierarchyExporters(), this.f21123j.getMainThreadChecker(), this.f21123j.getLogger());
            if (m19943g != null) {
                c7831b0.m19589m(C7830b.m19609c(m19943g));
            }
            return c7923f4;
        }
    }

    @Override // io.sentry.InterfaceC8270y
    /* renamed from: j */
    public /* synthetic */ C8114x mo18042j(C8114x c8114x, C7831b0 c7831b0) {
        return C8264x.m18050a(this, c8114x, c7831b0);
    }
}