package com.reactnativepagerview;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.C1936f;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.scroll.ReactScrollViewHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006J\u001e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ \u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\tJ\u000e\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0006J\u0016\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\tJ\u0016\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0006J\u0016\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\tJ\u0006\u0010\u0018\u001a\u00020\u000bJ\u0016\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000bJ\u0016\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001bJ\u0016\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\tJ\u0016\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001bJ\u0016\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\tJ\u0016\u0010 \u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001bJ\u0016\u0010\"\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\t¨\u0006%"}, m14357d2 = {"Lcom/reactnativepagerview/g;", "", "Landroid/view/View;", "view", "", "i", "Lcom/reactnativepagerview/a;", "Landroidx/viewpager2/widget/f;", "g", "", "selectedTab", "", "scrollSmooth", "n", ZeroconfModule.KEY_SERVICE_HOST, "child", "index", "d", "parent", "f", "e", "l", "k", "m", "h", "value", "w", "", "q", "o", "s", "r", "t", ViewProps.MARGIN, "u", "<init>", "()V", "react-native-pager-view_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.reactnativepagerview.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5490g {

    /* renamed from: a */
    public static final C5490g f15457a = new C5490g();

    private C5490g() {
    }

    /* renamed from: i */
    private final void m25142i(final View view) {
        view.post(new Runnable() { // from class: com.reactnativepagerview.f
            @Override // java.lang.Runnable
            public final void run() {
                C5490g.m25141j(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final void m25141j(View view) {
        C9612q.m13917h(view, "$view");
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 1073741824));
        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public static final void m25135p(C5484a host) {
        C9612q.m13917h(host, "$host");
        host.setDidSetInitialIndex(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public static final void m25129v(int i, C1936f pager, View page, float f) {
        C9612q.m13917h(pager, "$pager");
        C9612q.m13917h(page, "page");
        float f2 = i * f;
        if (pager.getOrientation() == 0) {
            boolean z = true;
            if (pager.getLayoutDirection() != 1) {
                z = false;
            }
            if (z) {
                f2 = -f2;
            }
            page.setTranslationX(f2);
            return;
        }
        page.setTranslationY(f2);
    }

    /* renamed from: d */
    public final void m25147d(C5484a host, View view, int i) {
        Integer initialIndex;
        C9612q.m13917h(host, "host");
        if (view == null) {
            return;
        }
        C1936f m25144g = m25144g(host);
        C5491h c5491h = (C5491h) m25144g.getAdapter();
        if (c5491h != null) {
            c5491h.m25127a(view, i);
        }
        if (m25144g.getCurrentItem() == i) {
            m25142i(m25144g);
        }
        if (!host.getDidSetInitialIndex() && (initialIndex = host.getInitialIndex()) != null && initialIndex.intValue() == i) {
            host.setDidSetInitialIndex(true);
            m25137n(m25144g, i, false);
        }
    }

    /* renamed from: e */
    public final View m25146e(C5484a parent, int i) {
        C9612q.m13917h(parent, "parent");
        C5491h c5491h = (C5491h) m25144g(parent).getAdapter();
        C9612q.m13920e(c5491h);
        return c5491h.m25126b(i);
    }

    /* renamed from: f */
    public final int m25145f(C5484a parent) {
        C9612q.m13917h(parent, "parent");
        RecyclerView.Adapter adapter = m25144g(parent).getAdapter();
        if (adapter != null) {
            return adapter.getItemCount();
        }
        return 0;
    }

    /* renamed from: g */
    public final C1936f m25144g(C5484a view) {
        C9612q.m13917h(view, "view");
        if (view.getChildAt(0) instanceof C1936f) {
            View childAt = view.getChildAt(0);
            C9612q.m13919f(childAt, "null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
            return (C1936f) childAt;
        }
        throw new ClassNotFoundException("Could not retrieve ViewPager2 instance");
    }

    /* renamed from: h */
    public final boolean m25143h() {
        return true;
    }

    /* renamed from: k */
    public final void m25140k(C5484a parent) {
        C9612q.m13917h(parent, "parent");
        C1936f m25144g = m25144g(parent);
        m25144g.setUserInputEnabled(false);
        C5491h c5491h = (C5491h) m25144g.getAdapter();
        if (c5491h != null) {
            c5491h.m25123e();
        }
    }

    /* renamed from: l */
    public final void m25139l(C5484a parent, View view) {
        C9612q.m13917h(parent, "parent");
        C9612q.m13917h(view, "view");
        C1936f m25144g = m25144g(parent);
        C5491h c5491h = (C5491h) m25144g.getAdapter();
        if (c5491h != null) {
            c5491h.m25122f(view);
        }
        m25142i(m25144g);
    }

    /* renamed from: m */
    public final void m25138m(C5484a parent, int i) {
        C9612q.m13917h(parent, "parent");
        C1936f m25144g = m25144g(parent);
        C5491h c5491h = (C5491h) m25144g.getAdapter();
        if (c5491h != null) {
            c5491h.m25121g(i);
        }
        m25142i(m25144g);
    }

    /* renamed from: n */
    public final void m25137n(C1936f view, int i, boolean z) {
        C9612q.m13917h(view, "view");
        m25142i(view);
        view.m34933j(i, z);
    }

    /* renamed from: o */
    public final void m25136o(final C5484a host, int i) {
        C9612q.m13917h(host, "host");
        C1936f m25144g = m25144g(host);
        if (host.getInitialIndex() == null) {
            host.setInitialIndex(Integer.valueOf(i));
            m25144g.post(new Runnable() { // from class: com.reactnativepagerview.d
                @Override // java.lang.Runnable
                public final void run() {
                    C5490g.m25135p(C5484a.this);
                }
            });
        }
    }

    /* renamed from: q */
    public final void m25134q(C5484a host, String value) {
        C9612q.m13917h(host, "host");
        C9612q.m13917h(value, "value");
        C1936f m25144g = m25144g(host);
        if (C9612q.m13922c(value, "rtl")) {
            m25144g.setLayoutDirection(1);
        } else {
            m25144g.setLayoutDirection(0);
        }
    }

    /* renamed from: r */
    public final void m25133r(C5484a host, int i) {
        C9612q.m13917h(host, "host");
        m25144g(host).setOffscreenPageLimit(i);
    }

    /* renamed from: s */
    public final void m25132s(C5484a host, String value) {
        C9612q.m13917h(host, "host");
        C9612q.m13917h(value, "value");
        m25144g(host).setOrientation(C9612q.m13922c(value, "vertical") ? 1 : 0);
    }

    /* renamed from: t */
    public final void m25131t(C5484a host, String value) {
        C9612q.m13917h(host, "host");
        C9612q.m13917h(value, "value");
        View childAt = m25144g(host).getChildAt(0);
        if (C9612q.m13922c(value, ReactScrollViewHelper.OVER_SCROLL_NEVER)) {
            childAt.setOverScrollMode(2);
        } else if (C9612q.m13922c(value, ReactScrollViewHelper.OVER_SCROLL_ALWAYS)) {
            childAt.setOverScrollMode(0);
        } else {
            childAt.setOverScrollMode(1);
        }
    }

    /* renamed from: u */
    public final void m25130u(C5484a host, int i) {
        C9612q.m13917h(host, "host");
        final C1936f m25144g = m25144g(host);
        final int pixelFromDIP = (int) PixelUtil.toPixelFromDIP(i);
        m25144g.setPageTransformer(new C1936f.InterfaceC1950k() { // from class: com.reactnativepagerview.e
            @Override // androidx.viewpager2.widget.C1936f.InterfaceC1950k
            /* renamed from: a */
            public final void mo25151a(View view, float f) {
                C5490g.m25129v(pixelFromDIP, m25144g, view, f);
            }
        });
    }

    /* renamed from: w */
    public final void m25128w(C5484a host, boolean z) {
        C9612q.m13917h(host, "host");
        m25144g(host).setUserInputEnabled(z);
    }
}
