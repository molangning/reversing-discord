package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p303qe.C11831b;
import p303qe.C11835d;
import p303qe.C11837e;
import p303qe.C11839f;
import p303qe.C11841g;
import p303qe.C11843h;
import p303qe.C11845i;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\b\b\u0016\u0018\u0000 .2\u00020\u0001:\u0003FGHB\t\b\u0016¢\u0006\u0004\bD\u00103B\u0011\b\u0017\u0012\u0006\u0010E\u001a\u00020,¢\u0006\u0004\bD\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0016J&\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010\u0011\u001a\u00020\u0002J\u0016\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014J\u0012\u0010\u0019\u001a\u00020\u00022\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0017J\u0012\u0010\u001a\u001a\u00020\u00022\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0017J\u0006\u0010\u001b\u001a\u00020\u0002J\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u0002H\u0016J\b\u0010\u001e\u001a\u00020\u0002H\u0002J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001fH\u0002J\u0010\u0010\"\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0002J\b\u0010#\u001a\u00020\u0002H\u0002J\b\u0010$\u001a\u00020\u0002H\u0002J\b\u0010%\u001a\u00020\u0002H\u0002J\b\u0010&\u001a\u00020\u0002H\u0002J\u0018\u0010(\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u0000H\u0002J\u0010\u0010)\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0002J\u0010\u0010+\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0014H\u0002R(\u00104\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0004\b&\u0010-\u0012\u0004\b2\u00103\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u00107\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00106R\u0016\u00109\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u00108R\u0016\u0010;\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010:R\u0016\u0010<\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00108R\u0016\u0010>\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00108R\u0016\u0010@\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u00108R\u001b\u0010C\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170A8F¢\u0006\u0006\u001a\u0004\b?\u0010B¨\u0006I"}, m14357d2 = {"Lcom/swmansion/rnscreens/n;", "Landroidx/fragment/app/Fragment;", "", "onResume", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "r", "Landroid/app/Activity;", "y", "Lcom/facebook/react/bridge/ReactContext;", "z", "h", "", "alpha", "", "closing", "m", "Lcom/swmansion/rnscreens/l;", "screenContainer", "v", "A", "t", "s", "onDestroy", "B", "Lcom/swmansion/rnscreens/n$b;", "event", "e", "w", "k", "i", "l", "j", "fragment", "f", "g", "animationEnd", "n", "Lcom/swmansion/rnscreens/j;", "Lcom/swmansion/rnscreens/j;", "q", "()Lcom/swmansion/rnscreens/j;", "x", "(Lcom/swmansion/rnscreens/j;)V", "getScreen$annotations", "()V", "screen", "", "Ljava/util/List;", "mChildScreenContainers", "Z", "shouldUpdateOnResume", "F", "mProgress", "canDispatchWillAppear", "o", "canDispatchAppear", "p", "isTransitioning", "", "()Ljava/util/List;", "childScreenContainers", "<init>", "screenView", "a", "b", "c", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.swmansion.rnscreens.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5634n extends Fragment {

    /* renamed from: q */
    public static final C5635a f15730q = new C5635a(null);

    /* renamed from: j */
    public C5623j f15731j;

    /* renamed from: k */
    private final List<C5631l<?>> f15732k;

    /* renamed from: l */
    private boolean f15733l;

    /* renamed from: m */
    private float f15734m;

    /* renamed from: n */
    private boolean f15735n;

    /* renamed from: o */
    private boolean f15736o;

    /* renamed from: p */
    private boolean f15737p;

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0005¨\u0006\u0007"}, m14357d2 = {"Lcom/swmansion/rnscreens/n$a;", "", "Landroid/view/View;", "view", "a", "<init>", "()V", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5635a {
        private C5635a() {
        }

        public /* synthetic */ C5635a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        protected final View m24873a(View view) {
            C9612q.m13917h(view, "view");
            ViewParent parent = view.getParent();
            if (parent != null) {
                ViewGroup viewGroup = (ViewGroup) parent;
                viewGroup.endViewTransition(view);
                viewGroup.removeView(view);
            }
            view.setVisibility(0);
            return view;
        }
    }

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m14357d2 = {"Lcom/swmansion/rnscreens/n$b;", "", "<init>", "(Ljava/lang/String;I)V", "j", "k", "l", "m", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.n$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC5636b {
        Appear,
        WillAppear,
        Disappear,
        WillDisappear
    }

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m14357d2 = {"Lcom/swmansion/rnscreens/n$c;", "Landroid/widget/FrameLayout;", "", "clearFocus", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.n$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C5637c extends FrameLayout {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5637c(Context context) {
            super(context);
            C9612q.m13917h(context, "context");
        }

        @Override // android.view.ViewGroup, android.view.View
        public void clearFocus() {
            if (getVisibility() != 4) {
                super.clearFocus();
            }
        }
    }

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.swmansion.rnscreens.n$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public /* synthetic */ class C5638d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15743a;

        static {
            int[] iArr = new int[EnumC5636b.values().length];
            try {
                iArr[EnumC5636b.WillAppear.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5636b.Appear.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5636b.WillDisappear.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC5636b.Disappear.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f15743a = iArr;
        }
    }

    public C5634n() {
        this.f15732k = new ArrayList();
        this.f15734m = -1.0f;
        this.f15735n = true;
        this.f15736o = true;
        throw new IllegalStateException("Screen fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }

    /* renamed from: B */
    private final void m24895B() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            this.f15733l = true;
        } else {
            C5656x.f15810a.m24799v(m24881q(), activity, m24874z());
        }
    }

    /* renamed from: e */
    private final boolean m24893e(EnumC5636b enumC5636b) {
        int i = C5638d.f15743a[enumC5636b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (!this.f15736o) {
                            return true;
                        }
                    } else {
                        throw new C11581q();
                    }
                } else if (!this.f15735n) {
                    return true;
                }
                return false;
            }
            return this.f15736o;
        }
        return this.f15735n;
    }

    /* renamed from: f */
    private final void m24892f(EnumC5636b enumC5636b, C5634n c5634n) {
        Event c11843h;
        if ((c5634n instanceof C5644q) && c5634n.m24893e(enumC5636b)) {
            C5623j m24881q = c5634n.m24881q();
            c5634n.m24877w(enumC5636b);
            int i = C5638d.f15743a[enumC5636b.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            c11843h = new C11837e(m24881q.getId());
                        } else {
                            throw new C11581q();
                        }
                    } else {
                        c11843h = new C11845i(m24881q.getId());
                    }
                } else {
                    c11843h = new C11835d(m24881q.getId());
                }
            } else {
                c11843h = new C11843h(m24881q.getId());
            }
            Context context = m24881q().getContext();
            C9612q.m13919f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, m24881q().getId());
            if (eventDispatcherForReactTag != null) {
                eventDispatcherForReactTag.dispatchEvent(c11843h);
            }
            c5634n.m24891g(enumC5636b);
        }
    }

    /* renamed from: g */
    private final void m24891g(EnumC5636b enumC5636b) {
        C5634n fragment;
        boolean z;
        List<C5631l<?>> list = this.f15732k;
        ArrayList<C5631l> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C5631l) obj).getScreenCount() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        for (C5631l c5631l : arrayList) {
            C5623j topScreen = c5631l.getTopScreen();
            if (topScreen != null && (fragment = topScreen.getFragment()) != null) {
                m24892f(enumC5636b, fragment);
            }
        }
    }

    /* renamed from: i */
    private final void m24889i() {
        m24892f(EnumC5636b.Appear, this);
        m24885m(1.0f, false);
    }

    /* renamed from: j */
    private final void m24888j() {
        m24892f(EnumC5636b.Disappear, this);
        m24885m(1.0f, true);
    }

    /* renamed from: k */
    private final void m24887k() {
        m24892f(EnumC5636b.WillAppear, this);
        m24885m(0.0f, false);
    }

    /* renamed from: l */
    private final void m24886l() {
        m24892f(EnumC5636b.WillDisappear, this);
        m24885m(0.0f, true);
    }

    /* renamed from: n */
    private final void m24884n(final boolean z) {
        this.f15737p = !z;
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null || ((parentFragment instanceof C5634n) && !((C5634n) parentFragment).f15737p)) {
            if (isResumed()) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        C5634n.m24883o(z, this);
                    }
                });
            } else if (z) {
                m24888j();
            } else {
                m24886l();
            }
        }
    }

    /* renamed from: o */
    public static final void m24883o(boolean z, C5634n this$0) {
        C9612q.m13917h(this$0, "this$0");
        if (z) {
            this$0.m24889i();
        } else {
            this$0.m24887k();
        }
    }

    /* renamed from: u */
    public static final View m24879u(View view) {
        return f15730q.m24873a(view);
    }

    /* renamed from: w */
    private final void m24877w(EnumC5636b enumC5636b) {
        int i = C5638d.f15743a[enumC5636b.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        this.f15736o = true;
                        return;
                    }
                    return;
                }
                this.f15735n = true;
                return;
            }
            this.f15736o = false;
            return;
        }
        this.f15735n = false;
    }

    /* renamed from: A */
    public final void m24896A(C5631l<?> screenContainer) {
        C9612q.m13917h(screenContainer, "screenContainer");
        this.f15732k.remove(screenContainer);
    }

    /* renamed from: h */
    public final void m24890h() {
        Context context = m24881q().getContext();
        C9612q.m13919f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, m24881q().getId());
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new C11831b(m24881q().getId()));
        }
    }

    /* renamed from: m */
    public final void m24885m(float f, boolean z) {
        boolean z2;
        boolean z3;
        if (this instanceof C5644q) {
            int i = 1;
            boolean z4 = false;
            if (this.f15734m == f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                float max = Math.max(0.0f, Math.min(1.0f, f));
                this.f15734m = max;
                if (max == 0.0f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    if (max != 1.0f) {
                        i = 0;
                    }
                    if (i != 0) {
                        i = 2;
                    } else {
                        i = 3;
                    }
                }
                short s = (short) i;
                C5631l<?> container = m24881q().getContainer();
                if (container instanceof C5640p) {
                    z4 = ((C5640p) container).getGoingForward();
                }
                boolean z5 = z4;
                Context context = m24881q().getContext();
                C9612q.m13919f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, m24881q().getId());
                if (eventDispatcherForReactTag != null) {
                    eventDispatcherForReactTag.dispatchEvent(new C11841g(m24881q().getId(), this.f15734m, z, z5, s));
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C9612q.m13917h(inflater, "inflater");
        m24881q().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Context context = getContext();
        if (context != null) {
            C5637c c5637c = new C5637c(context);
            c5637c.addView(m24879u(m24881q()));
            return c5637c;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        EventDispatcher eventDispatcherForReactTag;
        super.onDestroy();
        C5631l<?> container = m24881q().getContainer();
        if (container == null || !container.mo24863k(this)) {
            Context context = m24881q().getContext();
            if ((context instanceof ReactContext) && (eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag((ReactContext) context, m24881q().getId())) != null) {
                eventDispatcherForReactTag.dispatchEvent(new C11839f(m24881q().getId()));
            }
        }
        this.f15732k.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.f15733l) {
            this.f15733l = false;
            C5656x.f15810a.m24799v(m24881q(), m24875y(), m24874z());
        }
    }

    /* renamed from: p */
    public final List<C5631l<?>> m24882p() {
        return this.f15732k;
    }

    /* renamed from: q */
    public final C5623j m24881q() {
        C5623j c5623j = this.f15731j;
        if (c5623j != null) {
            return c5623j;
        }
        C9612q.m13900y("screen");
        return null;
    }

    /* renamed from: r */
    public void mo24833r() {
        m24895B();
    }

    /* renamed from: s */
    public void mo24832s() {
        m24884n(true);
    }

    /* renamed from: t */
    public final void m24880t() {
        m24884n(false);
    }

    /* renamed from: v */
    public final void m24878v(C5631l<?> screenContainer) {
        C9612q.m13917h(screenContainer, "screenContainer");
        this.f15732k.add(screenContainer);
    }

    /* renamed from: x */
    public final void m24876x(C5623j c5623j) {
        C9612q.m13917h(c5623j, "<set-?>");
        this.f15731j = c5623j;
    }

    /* renamed from: y */
    public final Activity m24875y() {
        C5634n fragment;
        FragmentActivity activity;
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            return activity2;
        }
        Context context = m24881q().getContext();
        if (context instanceof ReactContext) {
            ReactContext reactContext = (ReactContext) context;
            if (reactContext.getCurrentActivity() != null) {
                return reactContext.getCurrentActivity();
            }
        }
        for (ViewParent container = m24881q().getContainer(); container != null; container = container.getParent()) {
            if ((container instanceof C5623j) && (fragment = ((C5623j) container).getFragment()) != null && (activity = fragment.getActivity()) != null) {
                return activity;
            }
        }
        return null;
    }

    /* renamed from: z */
    public final ReactContext m24874z() {
        if (getContext() instanceof ReactContext) {
            Context context = getContext();
            C9612q.m13919f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context;
        } else if (m24881q().getContext() instanceof ReactContext) {
            Context context2 = m24881q().getContext();
            C9612q.m13919f(context2, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
            return (ReactContext) context2;
        } else {
            for (ViewParent container = m24881q().getContainer(); container != null; container = container.getParent()) {
                if (container instanceof C5623j) {
                    C5623j c5623j = (C5623j) container;
                    if (c5623j.getContext() instanceof ReactContext) {
                        Context context3 = c5623j.getContext();
                        C9612q.m13919f(context3, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                        return (ReactContext) context3;
                    }
                }
            }
            return null;
        }
    }

    @SuppressLint({"ValidFragment"})
    public C5634n(C5623j screenView) {
        C9612q.m13917h(screenView, "screenView");
        this.f15732k = new ArrayList();
        this.f15734m = -1.0f;
        this.f15735n = true;
        this.f15736o = true;
        m24876x(screenView);
    }
}