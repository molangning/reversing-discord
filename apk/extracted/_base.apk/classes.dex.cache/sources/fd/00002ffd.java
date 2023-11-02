package com.swmansion.rnscreens;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.ChoreographerCompat;
import com.facebook.react.modules.core.ReactChoreographer;
import com.facebook.react.uimanager.ViewProps;
import com.swmansion.rnscreens.C5623j;
import com.swmansion.rnscreens.C5634n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0011\u0012\b\u0010K\u001a\u0004\u0018\u00010J¢\u0006\u0004\bL\u0010MJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0001H\u0002J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0001H\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\u0001H\u0002J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0004H\u0002J\b\u0010\u0015\u001a\u00020\u0006H\u0002J0\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018H\u0014J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\u0006H\u0016J\u0006\u0010\u0019\u001a\u00020\u0006J\u0017\u0010#\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b#\u0010$J\u0016\u0010&\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010%\u001a\u00020\u0018J\u0010\u0010'\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0018H\u0016J\b\u0010(\u001a\u00020\u0006H\u0016J\u000e\u0010)\u001a\u00020!2\u0006\u0010%\u001a\u00020\u0018J\b\u0010*\u001a\u00020\fH\u0004J\u0012\u0010+\u001a\u00020\u00162\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0016J\b\u0010,\u001a\u00020\u0006H\u0014J\b\u0010-\u001a\u00020\u0006H\u0014J\u0018\u00100\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u0018H\u0014J\b\u0010\u001a\u001a\u00020\u0006H\u0004J\u0006\u00101\u001a\u00020\u0006J\b\u00102\u001a\u00020\u0006H\u0016J\b\u00103\u001a\u00020\u0006H\u0014R$\u00107\u001a\u0012\u0012\u0004\u0012\u00028\u000004j\b\u0012\u0004\u0012\u00028\u0000`58\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b)\u00106R\u0018\u00109\u001a\u0004\u0018\u00010\u00048\u0004@\u0004X\u0085\u000e¢\u0006\u0006\n\u0004\b+\u00108R\u0016\u0010;\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010:R\u0016\u0010<\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010:R\u0016\u0010=\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010:R\u0014\u0010A\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010C\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010BR\u0011\u0010F\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0016\u0010I\u001a\u0004\u0018\u00010!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006N"}, m14357d2 = {"Lcom/swmansion/rnscreens/l;", "Lcom/swmansion/rnscreens/n;", "T", "Landroid/view/ViewGroup;", "Landroidx/fragment/app/FragmentManager;", "fm", "", "setFragmentManager", "Lcom/facebook/react/ReactRootView;", "rootView", "h", "v", "Landroidx/fragment/app/FragmentTransaction;", "transaction", "screenFragment", "e", "g", "Lcom/swmansion/rnscreens/j$a;", "i", "fragmentManager", "t", "n", "", "changed", "", "l", "r", "b", ViewProps.ON_LAYOUT, "Landroid/view/View;", "view", "removeView", "requestLayout", "Lcom/swmansion/rnscreens/j;", "screen", "c", "(Lcom/swmansion/rnscreens/j;)Lcom/swmansion/rnscreens/n;", "index", "d", "u", "s", "j", "f", "k", "onAttachedToWindow", "onDetachedFromWindow", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "q", "p", "m", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "mScreenFragments", "Landroidx/fragment/app/FragmentManager;", "mFragmentManager", "Z", "mIsAttached", "mNeedUpdate", "mLayoutEnqueued", "Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;", "o", "Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;", "mLayoutCallback", "Lcom/swmansion/rnscreens/n;", "mParentScreenFragment", "getScreenCount", "()I", "screenCount", "getTopScreen", "()Lcom/swmansion/rnscreens/j;", "topScreen", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.swmansion.rnscreens.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5631l<T extends C5634n> extends ViewGroup {

    /* renamed from: j */
    protected final ArrayList<T> f15720j;

    /* renamed from: k */
    protected FragmentManager f15721k;

    /* renamed from: l */
    private boolean f15722l;

    /* renamed from: m */
    private boolean f15723m;

    /* renamed from: n */
    private boolean f15724n;

    /* renamed from: o */
    private final ChoreographerCompat.FrameCallback f15725o;

    /* renamed from: p */
    private C5634n f15726p;

    @Metadata(m14358d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m14357d2 = {"com/swmansion/rnscreens/l$a", "Lcom/facebook/react/modules/core/ChoreographerCompat$FrameCallback;", "", "frameTimeNanos", "", "doFrame", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5632a extends ChoreographerCompat.FrameCallback {

        /* renamed from: a */
        final /* synthetic */ C5631l<T> f15727a;

        C5632a(C5631l<T> c5631l) {
            this.f15727a = c5631l;
        }

        @Override // com.facebook.react.modules.core.ChoreographerCompat.FrameCallback
        public void doFrame(long j) {
            ((C5631l) this.f15727a).f15724n = false;
            C5631l<T> c5631l = this.f15727a;
            c5631l.measure(View.MeasureSpec.makeMeasureSpec(c5631l.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f15727a.getHeight(), 1073741824));
            C5631l<T> c5631l2 = this.f15727a;
            c5631l2.layout(c5631l2.getLeft(), this.f15727a.getTop(), this.f15727a.getRight(), this.f15727a.getBottom());
        }
    }

    public C5631l(Context context) {
        super(context);
        this.f15720j = new ArrayList<>();
        this.f15725o = new C5632a(this);
    }

    /* renamed from: e */
    private final void m24909e(FragmentTransaction fragmentTransaction, C5634n c5634n) {
        fragmentTransaction.m36358b(getId(), c5634n);
    }

    /* renamed from: g */
    private final void m24907g(FragmentTransaction fragmentTransaction, C5634n c5634n) {
        fragmentTransaction.mo36326m(c5634n);
    }

    /* renamed from: h */
    private final FragmentManager m24906h(ReactRootView reactRootView) {
        boolean z;
        FragmentManager supportFragmentManager;
        Context context = reactRootView.getContext();
        while (true) {
            z = context instanceof FragmentActivity;
            if (z || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (z) {
            FragmentActivity fragmentActivity = (FragmentActivity) context;
            if (fragmentActivity.getSupportFragmentManager().m36382u0().isEmpty()) {
                FragmentManager supportFragmentManager2 = fragmentActivity.getSupportFragmentManager();
                C9612q.m13918g(supportFragmentManager2, "{\n            // We are …FragmentManager\n        }");
                return supportFragmentManager2;
            }
            try {
                supportFragmentManager = FragmentManager.m36420h0(reactRootView).getChildFragmentManager();
            } catch (IllegalStateException unused) {
                supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            }
            C9612q.m13918g(supportFragmentManager, "{\n            // We are …r\n            }\n        }");
            return supportFragmentManager;
        }
        throw new IllegalStateException("In order to use RNScreens components your app's activity need to extend ReactActivity".toString());
    }

    /* renamed from: i */
    private final C5623j.EnumC5624a m24905i(C5634n c5634n) {
        return c5634n.m24881q().getActivityState();
    }

    /* renamed from: n */
    private final void m24902n() {
        ReactContext reactContext;
        this.f15723m = true;
        Context context = getContext();
        if (context instanceof ReactContext) {
            reactContext = (ReactContext) context;
        } else {
            reactContext = null;
        }
        if (reactContext != null) {
            reactContext.runOnUiQueueThread(new Runnable() { // from class: com.swmansion.rnscreens.k
                @Override // java.lang.Runnable
                public final void run() {
                    C5631l.m24901o(C5631l.this);
                }
            });
        }
    }

    /* renamed from: o */
    public static final void m24901o(C5631l this$0) {
        C9612q.m13917h(this$0, "this$0");
        this$0.m24900q();
    }

    private final void setFragmentManager(FragmentManager fragmentManager) {
        this.f15721k = fragmentManager;
        m24899r();
    }

    /* renamed from: t */
    private final void m24898t(FragmentManager fragmentManager) {
        FragmentTransaction m36406m = fragmentManager.m36406m();
        C9612q.m13918g(m36406m, "fragmentManager.beginTransaction()");
        boolean z = false;
        for (Fragment fragment : fragmentManager.m36382u0()) {
            if ((fragment instanceof C5634n) && ((C5634n) fragment).m24881q().getContainer() == this) {
                m36406m.mo36326m(fragment);
                z = true;
            }
        }
        if (z) {
            m36406m.mo36328j();
        }
    }

    /* renamed from: v */
    private final void m24897v() {
        boolean z;
        Unit unit;
        ViewParent viewParent = this;
        while (true) {
            z = viewParent instanceof ReactRootView;
            if (z || (viewParent instanceof C5623j) || viewParent.getParent() == null) {
                break;
            }
            viewParent = viewParent.getParent();
            C9612q.m13918g(viewParent, "parent.parent");
        }
        if (viewParent instanceof C5623j) {
            C5634n fragment = ((C5623j) viewParent).getFragment();
            if (fragment != null) {
                this.f15726p = fragment;
                fragment.m24878v(this);
                FragmentManager childFragmentManager = fragment.getChildFragmentManager();
                C9612q.m13918g(childFragmentManager, "screenFragment.childFragmentManager");
                setFragmentManager(childFragmentManager);
                unit = Unit.f25302a;
            } else {
                unit = null;
            }
            if (unit == null) {
                throw new IllegalStateException("Parent Screen does not have its Fragment attached".toString());
            }
        } else if (z) {
            setFragmentManager(m24906h((ReactRootView) viewParent));
        } else {
            throw new IllegalStateException("ScreenContainer is not attached under ReactRootView".toString());
        }
    }

    /* renamed from: c */
    protected T mo24864c(C5623j screen) {
        C9612q.m13917h(screen, "screen");
        return (T) new C5634n(screen);
    }

    /* renamed from: d */
    public final void m24910d(C5623j screen, int i) {
        C9612q.m13917h(screen, "screen");
        T mo24864c = mo24864c(screen);
        screen.setFragment(mo24864c);
        this.f15720j.add(i, mo24864c);
        screen.setContainer(this);
        m24902n();
    }

    /* renamed from: f */
    public final FragmentTransaction m24908f() {
        FragmentManager fragmentManager = this.f15721k;
        if (fragmentManager != null) {
            FragmentTransaction m36347s = fragmentManager.m36406m().m36347s(true);
            C9612q.m13918g(m36347s, "requireNotNull(mFragment…etReorderingAllowed(true)");
            return m36347s;
        }
        throw new IllegalArgumentException("mFragmentManager is null when creating transaction".toString());
    }

    public final int getScreenCount() {
        return this.f15720j.size();
    }

    public C5623j getTopScreen() {
        Object obj;
        boolean z;
        Iterator<T> it = this.f15720j.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (m24905i((C5634n) obj) == C5623j.EnumC5624a.ON_TOP) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C5634n c5634n = (C5634n) obj;
        if (c5634n == null) {
            return null;
        }
        return c5634n.m24881q();
    }

    /* renamed from: j */
    public final C5623j m24904j(int i) {
        return this.f15720j.get(i).m24881q();
    }

    /* renamed from: k */
    public boolean mo24863k(C5634n c5634n) {
        boolean m14064L;
        m14064L = C9553r.m14064L(this.f15720j, c5634n);
        return m14064L;
    }

    /* renamed from: l */
    public final void m24903l() {
        m24899r();
    }

    /* renamed from: m */
    protected void mo24862m() {
        C5634n fragment;
        C5623j topScreen = getTopScreen();
        if (topScreen == null || (fragment = topScreen.getFragment()) == null) {
            return;
        }
        fragment.mo24833r();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15722l = true;
        m24897v();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        FragmentManager fragmentManager = this.f15721k;
        if (fragmentManager != null && !fragmentManager.m36481G0()) {
            m24898t(fragmentManager);
            fragmentManager.m36429e0();
        }
        C5634n c5634n = this.f15726p;
        if (c5634n != null) {
            c5634n.m24896A(this);
        }
        this.f15726p = null;
        super.onDetachedFromWindow();
        this.f15722l = false;
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                removeViewAt(childCount);
            } else {
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).layout(0, 0, getWidth(), getHeight());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).measure(i, i2);
        }
    }

    /* renamed from: p */
    public void mo24861p() {
        boolean z;
        Fragment[] fragmentArr;
        FragmentTransaction m24908f = m24908f();
        FragmentManager fragmentManager = this.f15721k;
        if (fragmentManager != null) {
            HashSet hashSet = new HashSet(fragmentManager.m36382u0());
            Iterator<T> it = this.f15720j.iterator();
            while (it.hasNext()) {
                T screenFragment = it.next();
                C9612q.m13918g(screenFragment, "screenFragment");
                if (m24905i(screenFragment) == C5623j.EnumC5624a.INACTIVE && screenFragment.isAdded()) {
                    m24907g(m24908f, screenFragment);
                }
                hashSet.remove(screenFragment);
            }
            boolean z2 = false;
            if (!hashSet.isEmpty()) {
                for (Fragment fragment : (Fragment[]) hashSet.toArray(new Fragment[0])) {
                    if (fragment instanceof C5634n) {
                        C5634n c5634n = (C5634n) fragment;
                        if (c5634n.m24881q().getContainer() == null) {
                            m24907g(m24908f, c5634n);
                        }
                    }
                }
            }
            if (getTopScreen() == null) {
                z = true;
            } else {
                z = false;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = this.f15720j.iterator();
            while (it2.hasNext()) {
                T screenFragment2 = it2.next();
                C9612q.m13918g(screenFragment2, "screenFragment");
                C5623j.EnumC5624a m24905i = m24905i(screenFragment2);
                C5623j.EnumC5624a enumC5624a = C5623j.EnumC5624a.INACTIVE;
                if (m24905i != enumC5624a && !screenFragment2.isAdded()) {
                    m24909e(m24908f, screenFragment2);
                    z2 = true;
                } else if (m24905i != enumC5624a && z2) {
                    m24907g(m24908f, screenFragment2);
                    arrayList.add(screenFragment2);
                }
                screenFragment2.m24881q().setTransitioning(z);
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C5634n screenFragment3 = (C5634n) it3.next();
                C9612q.m13918g(screenFragment3, "screenFragment");
                m24909e(m24908f, screenFragment3);
            }
            m24908f.mo36328j();
            return;
        }
        throw new IllegalArgumentException("mFragmentManager is null when performing update in ScreenContainer".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0014, code lost:
        if (r0.m36481G0() == true) goto L11;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m24900q() {
        /*
            r3 = this;
            boolean r0 = r3.f15723m
            if (r0 == 0) goto L23
            boolean r0 = r3.f15722l
            if (r0 == 0) goto L23
            androidx.fragment.app.FragmentManager r0 = r3.f15721k
            if (r0 == 0) goto L23
            r1 = 0
            if (r0 == 0) goto L17
            boolean r0 = r0.m36481G0()
            r2 = 1
            if (r0 != r2) goto L17
            goto L18
        L17:
            r2 = r1
        L18:
            if (r2 == 0) goto L1b
            goto L23
        L1b:
            r3.f15723m = r1
            r3.mo24861p()
            r3.mo24862m()
        L23:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.C5631l.m24900q():void");
    }

    /* renamed from: r */
    public final void m24899r() {
        this.f15723m = true;
        m24900q();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        C9612q.m13917h(view, "view");
        if (view == getFocusedChild()) {
            Object systemService = getContext().getSystemService("input_method");
            C9612q.m13919f(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 2);
        }
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (!this.f15724n && this.f15725o != null) {
            this.f15724n = true;
            ReactChoreographer.getInstance().postFrameCallback(ReactChoreographer.CallbackType.NATIVE_ANIMATED_MODULE, this.f15725o);
        }
    }

    /* renamed from: s */
    public void mo24860s() {
        Iterator<T> it = this.f15720j.iterator();
        while (it.hasNext()) {
            it.next().m24881q().setContainer(null);
        }
        this.f15720j.clear();
        m24902n();
    }

    /* renamed from: u */
    public void mo24859u(int i) {
        this.f15720j.get(i).m24881q().setContainer(null);
        this.f15720j.remove(i);
        m24902n();
    }
}