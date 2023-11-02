package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.C1365w0;
import androidx.fragment.app.AbstractC1636s;
import androidx.lifecycle.InterfaceC1687g0;
import androidx.lifecycle.Lifecycle;
import p124h0.C6859b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1612m {

    /* renamed from: a */
    private final C1602g f4262a;

    /* renamed from: b */
    private final C1615n f4263b;

    /* renamed from: c */
    private final Fragment f4264c;

    /* renamed from: d */
    private boolean f4265d = false;

    /* renamed from: e */
    private int f4266e = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.m$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class View$OnAttachStateChangeListenerC1613a implements View.OnAttachStateChangeListener {

        /* renamed from: j */
        final /* synthetic */ View f4267j;

        View$OnAttachStateChangeListenerC1613a(View view) {
            this.f4267j = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f4267j.removeOnAttachStateChangeListener(this);
            C1365w0.m37191n0(this.f4267j);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.m$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static /* synthetic */ class C1614b {

        /* renamed from: a */
        static final /* synthetic */ int[] f4269a;

        static {
            int[] iArr = new int[Lifecycle.State.values().length];
            f4269a = iArr;
            try {
                iArr[Lifecycle.State.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4269a[Lifecycle.State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4269a[Lifecycle.State.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4269a[Lifecycle.State.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1612m(C1602g c1602g, C1615n c1615n, Fragment fragment) {
        this.f4262a = c1602g;
        this.f4263b = c1615n;
        this.f4264c = fragment;
    }

    /* renamed from: l */
    private boolean m36249l(View view) {
        if (view == this.f4264c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f4264c.mView) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: q */
    private Bundle m36244q() {
        Bundle bundle = new Bundle();
        this.f4264c.performSaveInstanceState(bundle);
        this.f4262a.m36281j(this.f4264c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f4264c.mView != null) {
            m36242s();
        }
        if (this.f4264c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f4264c.mSavedViewState);
        }
        if (this.f4264c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f4264c.mSavedViewRegistryState);
        }
        if (!this.f4264c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f4264c.mUserVisibleHint);
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m36260a() {
        if (FragmentManager.m36479H0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f4264c);
        }
        Fragment fragment = this.f4264c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        C1602g c1602g = this.f4262a;
        Fragment fragment2 = this.f4264c;
        c1602g.m36290a(fragment2, fragment2.mSavedFragmentState, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m36259b() {
        int m36229j = this.f4263b.m36229j(this.f4264c);
        Fragment fragment = this.f4264c;
        fragment.mContainer.addView(fragment.mView, m36229j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m36258c() {
        if (FragmentManager.m36479H0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f4264c);
        }
        Fragment fragment = this.f4264c;
        Fragment fragment2 = fragment.mTarget;
        C1612m c1612m = null;
        if (fragment2 != null) {
            C1612m m36226m = this.f4263b.m36226m(fragment2.mWho);
            if (m36226m != null) {
                Fragment fragment3 = this.f4264c;
                fragment3.mTargetWho = fragment3.mTarget.mWho;
                fragment3.mTarget = null;
                c1612m = m36226m;
            } else {
                throw new IllegalStateException("Fragment " + this.f4264c + " declared target fragment " + this.f4264c.mTarget + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (c1612m = this.f4263b.m36226m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f4264c + " declared target fragment " + this.f4264c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (c1612m != null && (FragmentManager.f4051P || c1612m.m36250k().mState < 1)) {
            c1612m.m36248m();
        }
        Fragment fragment4 = this.f4264c;
        fragment4.mHost = fragment4.mFragmentManager.m36380v0();
        Fragment fragment5 = this.f4264c;
        fragment5.mParentFragment = fragment5.mFragmentManager.m36374y0();
        this.f4262a.m36284g(this.f4264c, false);
        this.f4264c.performAttach();
        this.f4262a.m36289b(this.f4264c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m36257d() {
        AbstractC1636s.C1641e.EnumC1643b enumC1643b;
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f4264c;
        if (fragment2.mFragmentManager == null) {
            return fragment2.mState;
        }
        int i = this.f4266e;
        int i2 = C1614b.f4269a[fragment2.mMaxState.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        i = Math.min(i, -1);
                    } else {
                        i = Math.min(i, 0);
                    }
                } else {
                    i = Math.min(i, 1);
                }
            } else {
                i = Math.min(i, 5);
            }
        }
        Fragment fragment3 = this.f4264c;
        if (fragment3.mFromLayout) {
            if (fragment3.mInLayout) {
                i = Math.max(this.f4266e, 2);
                View view = this.f4264c.mView;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.f4266e < 4 ? Math.min(i, fragment3.mState) : Math.min(i, 1);
            }
        }
        if (!this.f4264c.mAdded) {
            i = Math.min(i, 1);
        }
        if (FragmentManager.f4051P && (viewGroup = (fragment = this.f4264c).mContainer) != null) {
            enumC1643b = AbstractC1636s.m36156n(viewGroup, fragment.getParentFragmentManager()).m36158l(this);
        } else {
            enumC1643b = null;
        }
        if (enumC1643b == AbstractC1636s.C1641e.EnumC1643b.ADDING) {
            i = Math.min(i, 6);
        } else if (enumC1643b == AbstractC1636s.C1641e.EnumC1643b.REMOVING) {
            i = Math.max(i, 3);
        } else {
            Fragment fragment4 = this.f4264c;
            if (fragment4.mRemoving) {
                if (fragment4.isInBackStack()) {
                    i = Math.min(i, 1);
                } else {
                    i = Math.min(i, -1);
                }
            }
        }
        Fragment fragment5 = this.f4264c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            i = Math.min(i, 4);
        }
        if (FragmentManager.m36479H0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i + " for " + this.f4264c);
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m36256e() {
        if (FragmentManager.m36479H0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f4264c);
        }
        Fragment fragment = this.f4264c;
        if (!fragment.mIsCreated) {
            this.f4262a.m36283h(fragment, fragment.mSavedFragmentState, false);
            Fragment fragment2 = this.f4264c;
            fragment2.performCreate(fragment2.mSavedFragmentState);
            C1602g c1602g = this.f4262a;
            Fragment fragment3 = this.f4264c;
            c1602g.m36288c(fragment3, fragment3.mSavedFragmentState, false);
            return;
        }
        fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
        this.f4264c.mState = 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m36255f() {
        String str;
        if (this.f4264c.mFromLayout) {
            return;
        }
        if (FragmentManager.m36479H0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f4264c);
        }
        Fragment fragment = this.f4264c;
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        Fragment fragment2 = this.f4264c;
        ViewGroup viewGroup = fragment2.mContainer;
        if (viewGroup == null) {
            int i = fragment2.mContainerId;
            if (i != 0) {
                if (i != -1) {
                    viewGroup = (ViewGroup) fragment2.mFragmentManager.m36393q0().mo36507c(this.f4264c.mContainerId);
                    if (viewGroup == null) {
                        Fragment fragment3 = this.f4264c;
                        if (!fragment3.mRestored) {
                            try {
                                str = fragment3.getResources().getResourceName(this.f4264c.mContainerId);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f4264c.mContainerId) + " (" + str + ") for fragment " + this.f4264c);
                        }
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f4264c + " for a container view with no id");
                }
            } else {
                viewGroup = null;
            }
        }
        Fragment fragment4 = this.f4264c;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(performGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
        View view = this.f4264c.mView;
        if (view != null) {
            boolean z = false;
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f4264c;
            fragment5.mView.setTag(C6859b.f19098a, fragment5);
            if (viewGroup != null) {
                m36259b();
            }
            Fragment fragment6 = this.f4264c;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            if (C1365w0.m37225T(this.f4264c.mView)) {
                C1365w0.m37191n0(this.f4264c.mView);
            } else {
                View view2 = this.f4264c.mView;
                view2.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC1613a(view2));
            }
            this.f4264c.performViewCreated();
            C1602g c1602g = this.f4262a;
            Fragment fragment7 = this.f4264c;
            c1602g.m36278m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
            int visibility = this.f4264c.mView.getVisibility();
            float alpha = this.f4264c.mView.getAlpha();
            if (FragmentManager.f4051P) {
                this.f4264c.setPostOnViewCreatedAlpha(alpha);
                Fragment fragment8 = this.f4264c;
                if (fragment8.mContainer != null && visibility == 0) {
                    View findFocus = fragment8.mView.findFocus();
                    if (findFocus != null) {
                        this.f4264c.setFocusedView(findFocus);
                        if (FragmentManager.m36479H0(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f4264c);
                        }
                    }
                    this.f4264c.mView.setAlpha(0.0f);
                }
            } else {
                Fragment fragment9 = this.f4264c;
                if (visibility == 0 && fragment9.mContainer != null) {
                    z = true;
                }
                fragment9.mIsNewlyAdded = z;
            }
        }
        this.f4264c.mState = 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m36254g() {
        boolean z;
        boolean z2;
        Fragment m36233f;
        if (FragmentManager.m36479H0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f4264c);
        }
        Fragment fragment = this.f4264c;
        boolean z3 = true;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && !this.f4263b.m36224o().m36264p(this.f4264c)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            FragmentHostCallback<?> fragmentHostCallback = this.f4264c.mHost;
            if (fragmentHostCallback instanceof InterfaceC1687g0) {
                z3 = this.f4263b.m36224o().m36267m();
            } else if (fragmentHostCallback.m36504f() instanceof Activity) {
                z3 = true ^ ((Activity) fragmentHostCallback.m36504f()).isChangingConfigurations();
            }
            if (z || z3) {
                this.f4263b.m36224o().m36273g(this.f4264c);
            }
            this.f4264c.performDestroy();
            this.f4262a.m36287d(this.f4264c, false);
            for (C1612m c1612m : this.f4263b.m36228k()) {
                if (c1612m != null) {
                    Fragment m36250k = c1612m.m36250k();
                    if (this.f4264c.mWho.equals(m36250k.mTargetWho)) {
                        m36250k.mTarget = this.f4264c;
                        m36250k.mTargetWho = null;
                    }
                }
            }
            Fragment fragment2 = this.f4264c;
            String str = fragment2.mTargetWho;
            if (str != null) {
                fragment2.mTarget = this.f4263b.m36233f(str);
            }
            this.f4263b.m36222q(this);
            return;
        }
        String str2 = this.f4264c.mTargetWho;
        if (str2 != null && (m36233f = this.f4263b.m36233f(str2)) != null && m36233f.mRetainInstance) {
            this.f4264c.mTarget = m36233f;
        }
        this.f4264c.mState = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public void m36253h() {
        View view;
        if (FragmentManager.m36479H0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f4264c);
        }
        Fragment fragment = this.f4264c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f4264c.performDestroyView();
        this.f4262a.m36277n(this.f4264c, false);
        Fragment fragment2 = this.f4264c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.mo35985n(null);
        this.f4264c.mInLayout = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public void m36252i() {
        if (FragmentManager.m36479H0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f4264c);
        }
        this.f4264c.performDetach();
        boolean z = false;
        this.f4262a.m36286e(this.f4264c, false);
        Fragment fragment = this.f4264c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z = true;
        }
        if (z || this.f4263b.m36224o().m36264p(this.f4264c)) {
            if (FragmentManager.m36479H0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f4264c);
            }
            this.f4264c.initState();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public void m36251j() {
        Fragment fragment = this.f4264c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.m36479H0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f4264c);
            }
            Fragment fragment2 = this.f4264c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f4264c.mSavedFragmentState);
            View view = this.f4264c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f4264c;
                fragment3.mView.setTag(C6859b.f19098a, fragment3);
                Fragment fragment4 = this.f4264c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f4264c.performViewCreated();
                C1602g c1602g = this.f4262a;
                Fragment fragment5 = this.f4264c;
                c1602g.m36278m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f4264c.mState = 2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public Fragment m36250k() {
        return this.f4264c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m36248m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f4265d) {
            if (FragmentManager.m36479H0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + m36250k());
                return;
            }
            return;
        }
        try {
            this.f4265d = true;
            while (true) {
                int m36257d = m36257d();
                Fragment fragment = this.f4264c;
                int i = fragment.mState;
                if (m36257d != i) {
                    if (m36257d > i) {
                        switch (i + 1) {
                            case 0:
                                m36258c();
                                continue;
                            case 1:
                                m36256e();
                                continue;
                            case 2:
                                m36251j();
                                m36255f();
                                continue;
                            case 3:
                                m36260a();
                                continue;
                            case 4:
                                if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                    AbstractC1636s.m36156n(viewGroup2, fragment.getParentFragmentManager()).m36168b(AbstractC1636s.C1641e.EnumC1644c.m36138b(this.f4264c.mView.getVisibility()), this);
                                }
                                this.f4264c.mState = 4;
                                continue;
                            case 5:
                                m36240u();
                                continue;
                            case 6:
                                fragment.mState = 6;
                                continue;
                            case 7:
                                m36245p();
                                continue;
                            default:
                                continue;
                        }
                    } else {
                        switch (i - 1) {
                            case -1:
                                m36252i();
                                continue;
                            case 0:
                                m36254g();
                                continue;
                            case 1:
                                m36253h();
                                this.f4264c.mState = 1;
                                continue;
                            case 2:
                                fragment.mInLayout = false;
                                fragment.mState = 2;
                                continue;
                            case 3:
                                if (FragmentManager.m36479H0(3)) {
                                    Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f4264c);
                                }
                                Fragment fragment2 = this.f4264c;
                                if (fragment2.mView != null && fragment2.mSavedViewState == null) {
                                    m36242s();
                                }
                                Fragment fragment3 = this.f4264c;
                                if (fragment3.mView != null && (viewGroup3 = fragment3.mContainer) != null) {
                                    AbstractC1636s.m36156n(viewGroup3, fragment3.getParentFragmentManager()).m36166d(this);
                                }
                                this.f4264c.mState = 3;
                                continue;
                            case 4:
                                m36239v();
                                continue;
                            case 5:
                                fragment.mState = 5;
                                continue;
                            case 6:
                                m36247n();
                                continue;
                            default:
                                continue;
                        }
                    }
                } else {
                    if (FragmentManager.f4051P && fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            AbstractC1636s m36156n = AbstractC1636s.m36156n(viewGroup, fragment.getParentFragmentManager());
                            if (this.f4264c.mHidden) {
                                m36156n.m36167c(this);
                            } else {
                                m36156n.m36165e(this);
                            }
                        }
                        Fragment fragment4 = this.f4264c;
                        FragmentManager fragmentManager = fragment4.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.m36483F0(fragment4);
                        }
                        Fragment fragment5 = this.f4264c;
                        fragment5.mHiddenChanged = false;
                        fragment5.onHiddenChanged(fragment5.mHidden);
                    }
                    return;
                }
            }
        } finally {
            this.f4265d = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public void m36247n() {
        if (FragmentManager.m36479H0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f4264c);
        }
        this.f4264c.performPause();
        this.f4262a.m36285f(this.f4264c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m36246o(ClassLoader classLoader) {
        Bundle bundle = this.f4264c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f4264c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f4264c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f4264c;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
        Fragment fragment4 = this.f4264c;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f4264c;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.f4264c.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f4264c;
        if (!fragment6.mUserVisibleHint) {
            fragment6.mDeferStart = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m36245p() {
        String str;
        if (FragmentManager.m36479H0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f4264c);
        }
        View focusedView = this.f4264c.getFocusedView();
        if (focusedView != null && m36249l(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (FragmentManager.m36479H0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                if (requestFocus) {
                    str = "succeeded";
                } else {
                    str = "failed";
                }
                sb2.append(str);
                sb2.append(" on Fragment ");
                sb2.append(this.f4264c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f4264c.mView.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f4264c.setFocusedView(null);
        this.f4264c.performResume();
        this.f4262a.m36282i(this.f4264c, false);
        Fragment fragment = this.f4264c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public C1610l m36243r() {
        C1610l c1610l = new C1610l(this.f4264c);
        Fragment fragment = this.f4264c;
        if (fragment.mState > -1 && c1610l.f4261v == null) {
            Bundle m36244q = m36244q();
            c1610l.f4261v = m36244q;
            if (this.f4264c.mTargetWho != null) {
                if (m36244q == null) {
                    c1610l.f4261v = new Bundle();
                }
                c1610l.f4261v.putString("android:target_state", this.f4264c.mTargetWho);
                int i = this.f4264c.mTargetRequestCode;
                if (i != 0) {
                    c1610l.f4261v.putInt("android:target_req_state", i);
                }
            }
        } else {
            c1610l.f4261v = fragment.mSavedFragmentState;
        }
        return c1610l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m36242s() {
        if (this.f4264c.mView == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f4264c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f4264c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f4264c.mViewLifecycleOwner.m36342e(bundle);
        if (!bundle.isEmpty()) {
            this.f4264c.mSavedViewRegistryState = bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m36241t(int i) {
        this.f4266e = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m36240u() {
        if (FragmentManager.m36479H0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f4264c);
        }
        this.f4264c.performStart();
        this.f4262a.m36280k(this.f4264c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m36239v() {
        if (FragmentManager.m36479H0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f4264c);
        }
        this.f4264c.performStop();
        this.f4262a.m36279l(this.f4264c, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1612m(C1602g c1602g, C1615n c1615n, ClassLoader classLoader, C1599e c1599e, C1610l c1610l) {
        this.f4262a = c1602g;
        this.f4263b = c1615n;
        Fragment mo36294a = c1599e.mo36294a(classLoader, c1610l.f4249j);
        this.f4264c = mo36294a;
        Bundle bundle = c1610l.f4258s;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        mo36294a.setArguments(c1610l.f4258s);
        mo36294a.mWho = c1610l.f4250k;
        mo36294a.mFromLayout = c1610l.f4251l;
        mo36294a.mRestored = true;
        mo36294a.mFragmentId = c1610l.f4252m;
        mo36294a.mContainerId = c1610l.f4253n;
        mo36294a.mTag = c1610l.f4254o;
        mo36294a.mRetainInstance = c1610l.f4255p;
        mo36294a.mRemoving = c1610l.f4256q;
        mo36294a.mDetached = c1610l.f4257r;
        mo36294a.mHidden = c1610l.f4259t;
        mo36294a.mMaxState = Lifecycle.State.values()[c1610l.f4260u];
        Bundle bundle2 = c1610l.f4261v;
        if (bundle2 != null) {
            mo36294a.mSavedFragmentState = bundle2;
        } else {
            mo36294a.mSavedFragmentState = new Bundle();
        }
        if (FragmentManager.m36479H0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + mo36294a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1612m(C1602g c1602g, C1615n c1615n, Fragment fragment, C1610l c1610l) {
        this.f4262a = c1602g;
        this.f4263b = c1615n;
        this.f4264c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = c1610l.f4261v;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}
