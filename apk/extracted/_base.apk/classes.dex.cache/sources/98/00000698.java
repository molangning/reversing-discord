package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.InterfaceC0269b;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.arch.core.util.Function;
import androidx.core.app.C0794e;
import androidx.core.app.SharedElementCallback;
import androidx.core.view.C1358v;
import androidx.lifecycle.C1677b0;
import androidx.lifecycle.C1686g;
import androidx.lifecycle.C1689h0;
import androidx.lifecycle.C1691i0;
import androidx.lifecycle.InterfaceC1687g0;
import androidx.lifecycle.InterfaceC1688h;
import androidx.lifecycle.InterfaceC1695l;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.loader.app.LoaderManager;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p237n0.C10481d;
import p237n0.InterfaceC10480c;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, LifecycleOwner, InterfaceC1687g0, InterfaceC1688h, InterfaceC10480c {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    AnimationInfo mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    private boolean mCalled;
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    ViewModelProvider.Factory mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    FragmentHostCallback<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    boolean mIsNewlyAdded;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    LifecycleRegistry mLifecycleRegistry;
    Lifecycle.State mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<OnPreAttachedListener> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    float mPostponedAlpha;
    Runnable mPostponedDurationRunnable;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    SavedStateRegistryController mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    FragmentViewLifecycleOwner mViewLifecycleOwner;
    MutableLiveData<LifecycleOwner> mViewLifecycleOwnerLiveData;
    String mWho;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class AnimationInfo {

        /* renamed from: a */
        View f3995a;

        /* renamed from: b */
        Animator f3996b;

        /* renamed from: c */
        boolean f3997c;

        /* renamed from: d */
        int f3998d;

        /* renamed from: e */
        int f3999e;

        /* renamed from: f */
        int f4000f;

        /* renamed from: g */
        int f4001g;

        /* renamed from: h */
        int f4002h;

        /* renamed from: i */
        ArrayList<String> f4003i;

        /* renamed from: j */
        ArrayList<String> f4004j;

        /* renamed from: k */
        Object f4005k = null;

        /* renamed from: l */
        Object f4006l;

        /* renamed from: m */
        Object f4007m;

        /* renamed from: n */
        Object f4008n;

        /* renamed from: o */
        Object f4009o;

        /* renamed from: p */
        Object f4010p;

        /* renamed from: q */
        Boolean f4011q;

        /* renamed from: r */
        Boolean f4012r;

        /* renamed from: s */
        SharedElementCallback f4013s;

        /* renamed from: t */
        SharedElementCallback f4014t;

        /* renamed from: u */
        float f4015u;

        /* renamed from: v */
        View f4016v;

        /* renamed from: w */
        boolean f4017w;

        /* renamed from: x */
        OnStartEnterTransitionListener f4018x;

        /* renamed from: y */
        boolean f4019y;

        AnimationInfo() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f4006l = obj;
            this.f4007m = null;
            this.f4008n = obj;
            this.f4009o = null;
            this.f4010p = obj;
            this.f4013s = null;
            this.f4014t = null;
            this.f4015u = 1.0f;
            this.f4016v = null;
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class OnPreAttachedListener {
        private OnPreAttachedListener() {
        }

        /* synthetic */ OnPreAttachedListener(RunnableC1543a runnableC1543a) {
            this();
        }

        /* renamed from: a */
        abstract void mo36538a();
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface OnStartEnterTransitionListener {
        /* renamed from: a */
        void mo36363a();

        /* renamed from: b */
        void mo36362b();
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1542a();

        /* renamed from: j */
        final Bundle f4020j;

        /* renamed from: androidx.fragment.app.Fragment$SavedState$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class C1542a implements Parcelable.ClassLoaderCreator<SavedState> {
            C1542a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f4020j = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f4020j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.Fragment$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1543a implements Runnable {
        RunnableC1543a() {
            Fragment.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1544b implements Runnable {
        RunnableC1544b() {
            Fragment.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC1545c implements Runnable {

        /* renamed from: j */
        final /* synthetic */ AbstractC1636s f4023j;

        RunnableC1545c(AbstractC1636s abstractC1636s) {
            Fragment.this = r1;
            this.f4023j = abstractC1636s;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4023j.m36163g();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1546d extends FragmentContainer {
        C1546d() {
            Fragment.this = r1;
        }

        @Override // androidx.fragment.app.FragmentContainer
        /* renamed from: c */
        public View mo36507c(int i) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.FragmentContainer
        /* renamed from: d */
        public boolean mo36506d() {
            return Fragment.this.mView != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1547e implements Function<Void, ActivityResultRegistry> {
        C1547e() {
            Fragment.this = r1;
        }

        @Override // androidx.arch.core.util.Function
        /* renamed from: a */
        public ActivityResultRegistry apply(Void r3) {
            Fragment fragment = Fragment.this;
            FragmentHostCallback<?> fragmentHostCallback = fragment.mHost;
            if (fragmentHostCallback instanceof InterfaceC0269b) {
                return ((InterfaceC0269b) fragmentHostCallback).getActivityResultRegistry();
            }
            return fragment.requireActivity().getActivityResultRegistry();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1548f implements Function<Void, ActivityResultRegistry> {

        /* renamed from: a */
        final /* synthetic */ ActivityResultRegistry f4027a;

        C1548f(ActivityResultRegistry activityResultRegistry) {
            Fragment.this = r1;
            this.f4027a = activityResultRegistry;
        }

        @Override // androidx.arch.core.util.Function
        /* renamed from: a */
        public ActivityResultRegistry apply(Void r1) {
            return this.f4027a;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1549g extends OnPreAttachedListener {

        /* renamed from: a */
        final /* synthetic */ Function f4029a;

        /* renamed from: b */
        final /* synthetic */ AtomicReference f4030b;

        /* renamed from: c */
        final /* synthetic */ ActivityResultContract f4031c;

        /* renamed from: d */
        final /* synthetic */ ActivityResultCallback f4032d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1549g(Function function, AtomicReference atomicReference, ActivityResultContract activityResultContract, ActivityResultCallback activityResultCallback) {
            super(null);
            Fragment.this = r1;
            this.f4029a = function;
            this.f4030b = atomicReference;
            this.f4031c = activityResultContract;
            this.f4032d = activityResultCallback;
        }

        @Override // androidx.fragment.app.Fragment.OnPreAttachedListener
        /* renamed from: a */
        void mo36538a() {
            this.f4030b.set(((ActivityResultRegistry) this.f4029a.apply(null)).m40799j(Fragment.this.generateActivityResultKey(), Fragment.this, this.f4031c, this.f4032d));
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1550h<I> extends ActivityResultLauncher<I> {

        /* renamed from: a */
        final /* synthetic */ AtomicReference f4034a;

        /* renamed from: b */
        final /* synthetic */ ActivityResultContract f4035b;

        C1550h(AtomicReference atomicReference, ActivityResultContract activityResultContract) {
            Fragment.this = r1;
            this.f4034a = atomicReference;
            this.f4035b = activityResultContract;
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        /* renamed from: b */
        public void mo36537b(I i, C0794e c0794e) {
            ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) this.f4034a.get();
            if (activityResultLauncher != null) {
                activityResultLauncher.mo36537b(i, c0794e);
                return;
            }
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }

        @Override // androidx.activity.result.ActivityResultLauncher
        /* renamed from: c */
        public void mo36536c() {
            ActivityResultLauncher activityResultLauncher = (ActivityResultLauncher) this.f4034a.getAndSet(null);
            if (activityResultLauncher != null) {
                activityResultLauncher.mo36536c();
            }
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1551i extends RuntimeException {
        public C1551i(String str, Exception exc) {
            super(str, exc);
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new C1604h();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new RunnableC1543a();
        this.mMaxState = Lifecycle.State.RESUMED;
        this.mViewLifecycleOwnerLiveData = new MutableLiveData<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        initLifecycle();
    }

    private AnimationInfo ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new AnimationInfo();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        Lifecycle.State state = this.mMaxState;
        if (state != Lifecycle.State.INITIALIZED && this.mParentFragment != null) {
            return Math.min(state.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
        }
        return state.ordinal();
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new LifecycleRegistry(this);
        this.mSavedStateRegistryController = SavedStateRegistryController.m35307a(this);
        this.mDefaultFactory = null;
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    private <I, O> ActivityResultLauncher<I> prepareCallInternal(ActivityResultContract<I, O> activityResultContract, Function<Void, ActivityResultRegistry> function, ActivityResultCallback<O> activityResultCallback) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new C1549g(function, atomicReference, activityResultContract, activityResultCallback));
            return new C1550h(atomicReference, activityResultContract);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void registerOnPreAttachListener(OnPreAttachedListener onPreAttachedListener) {
        if (this.mState >= 0) {
            onPreAttachedListener.mo36538a();
        } else {
            this.mOnPreAttachedListeners.add(onPreAttachedListener);
        }
    }

    void callStartTransitionListener(boolean z) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        AnimationInfo animationInfo = this.mAnimationInfo;
        OnStartEnterTransitionListener onStartEnterTransitionListener = null;
        if (animationInfo != null) {
            animationInfo.f4017w = false;
            OnStartEnterTransitionListener onStartEnterTransitionListener2 = animationInfo.f4018x;
            animationInfo.f4018x = null;
            onStartEnterTransitionListener = onStartEnterTransitionListener2;
        }
        if (onStartEnterTransitionListener != null) {
            onStartEnterTransitionListener.mo36362b();
        } else if (FragmentManager.f4051P && this.mView != null && (viewGroup = this.mContainer) != null && (fragmentManager = this.mFragmentManager) != null) {
            AbstractC1636s m36156n = AbstractC1636s.m36156n(viewGroup, fragmentManager);
            m36156n.m36154p();
            if (z) {
                this.mHost.m36503g().post(new RunnableC1545c(m36156n));
            } else {
                m36156n.m36163g();
            }
        }
    }

    public FragmentContainer createFragmentContainer() {
        return new C1546d();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            LoaderManager.m35993b(this).mo35992a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.m36450W(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        if (str.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.m36411k0(str);
    }

    String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final FragmentActivity getActivity() {
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback == null) {
            return null;
        }
        return (FragmentActivity) fragmentHostCallback.m36505e();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo != null && (bool = animationInfo.f4012r) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo != null && (bool = animationInfo.f4011q) != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public View getAnimatingAway() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.f3995a;
    }

    public Animator getAnimator() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.f3996b;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback == null) {
            return null;
        }
        return fragmentHostCallback.m36504f();
    }

    @Override // androidx.lifecycle.InterfaceC1688h
    public /* synthetic */ CreationExtras getDefaultViewModelCreationExtras() {
        return C1686g.m36038a(this);
    }

    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Context applicationContext = requireContext().getApplicationContext();
                while (true) {
                    if (applicationContext instanceof ContextWrapper) {
                        if (applicationContext instanceof Application) {
                            application = (Application) applicationContext;
                            break;
                        }
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    } else {
                        application = null;
                        break;
                    }
                }
                if (application == null && FragmentManager.m36479H0(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.mDefaultFactory = new C1677b0(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public int getEnterAnim() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return 0;
        }
        return animationInfo.f3998d;
    }

    public Object getEnterTransition() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.f4005k;
    }

    public SharedElementCallback getEnterTransitionCallback() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.f4013s;
    }

    public int getExitAnim() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return 0;
        }
        return animationInfo.f3999e;
    }

    public Object getExitTransition() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.f4007m;
    }

    public SharedElementCallback getExitTransitionCallback() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.f4014t;
    }

    public View getFocusedView() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.f4016v;
    }

    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback == null) {
            return null;
        }
        return fragmentHostCallback.mo36502h();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public LoaderManager getLoaderManager() {
        return LoaderManager.m35993b(this);
    }

    public int getNextTransition() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return 0;
        }
        return animationInfo.f4002h;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public boolean getPopDirection() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return false;
        }
        return animationInfo.f3997c;
    }

    public int getPopEnterAnim() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return 0;
        }
        return animationInfo.f4000f;
    }

    public int getPopExitAnim() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return 0;
        }
        return animationInfo.f4001g;
    }

    public float getPostOnViewCreatedAlpha() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return 1.0f;
        }
        return animationInfo.f4015u;
    }

    public Object getReenterTransition() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        Object obj = animationInfo.f4008n;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getExitTransition();
        }
        return obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        Object obj = animationInfo.f4006l;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getEnterTransition();
        }
        return obj;
    }

    @Override // p237n0.InterfaceC10480c
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.m35306b();
    }

    public Object getSharedElementEnterTransition() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        return animationInfo.f4009o;
    }

    public Object getSharedElementReturnTransition() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return null;
        }
        Object obj = animationInfo.f4010p;
        if (obj == USE_DEFAULT_TRANSITION) {
            return getSharedElementEnterTransition();
        }
        return obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo != null && (arrayList = animationInfo.f4003i) != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo != null && (arrayList = animationInfo.f4004j) != null) {
            return arrayList;
        }
        return new ArrayList<>();
    }

    public final String getString(int i) {
        return getResources().getString(i);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        String str;
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null && (str = this.mTargetWho) != null) {
            return fragmentManager.m36423g0(str);
        }
        return null;
    }

    @Deprecated
    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i) {
        return getResources().getText(i);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public LifecycleOwner getViewLifecycleOwner() {
        FragmentViewLifecycleOwner fragmentViewLifecycleOwner = this.mViewLifecycleOwner;
        if (fragmentViewLifecycleOwner != null) {
            return fragmentViewLifecycleOwner;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData<LifecycleOwner> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.InterfaceC1687g0
    public ViewModelStore getViewModelStore() {
        if (this.mFragmentManager != null) {
            if (getMinimumMaxLifecycleState() != Lifecycle.State.INITIALIZED.ordinal()) {
                return this.mFragmentManager.m36489C0(this);
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new C1604h();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    public boolean isHideReplaced() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return false;
        }
        return animationInfo.f4019y;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        FragmentManager fragmentManager;
        if (this.mMenuVisible && ((fragmentManager = this.mFragmentManager) == null || fragmentManager.m36475J0(this.mParentFragment))) {
            return true;
        }
        return false;
    }

    public boolean isPostponed() {
        AnimationInfo animationInfo = this.mAnimationInfo;
        if (animationInfo == null) {
            return false;
        }
        return animationInfo.f4017w;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isRemovingParent() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null && (parentFragment.isRemoving() || parentFragment.isRemovingParent())) {
            return true;
        }
        return false;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.m36469M0();
    }

    public final boolean isVisible() {
        View view;
        if (isAdded() && !isHidden() && (view = this.mView) != null && view.getWindowToken() != null && this.mView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.m36451V0();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (FragmentManager.m36479H0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        Activity m36505e = fragmentHostCallback == null ? null : fragmentHostCallback.m36505e();
        if (m36505e != null) {
            this.mCalled = false;
            onAttach(m36505e);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (!this.mChildFragmentManager.m36471L0(1)) {
            this.mChildFragmentManager.m36490C();
        }
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        return null;
    }

    public Animator onCreateAnimator(int i, boolean z, int i2) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.mContentLayoutId;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        Activity m36505e = fragmentHostCallback == null ? null : fragmentHostCallback.m36505e();
        if (m36505e != null) {
            this.mCalled = false;
            onInflate(m36505e, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.m36451V0();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            this.mChildFragmentManager.m36375y();
            return;
        }
        throw new C1646u("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public void performAttach() {
        Iterator<OnPreAttachedListener> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo36538a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.m36412k(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.m36504f());
        if (this.mCalled) {
            this.mFragmentManager.m36478I(this);
            this.mChildFragmentManager.m36373z();
            return;
        }
        throw new C1646u("Fragment " + this + " did not call through to super.onAttach()");
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.m36494A(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (onContextItemSelected(menuItem)) {
                return true;
            }
            return this.mChildFragmentManager.m36492B(menuItem);
        }
        return false;
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.m36451V0();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.mo36125a(new InterfaceC1695l() { // from class: androidx.fragment.app.Fragment.5
            @Override // androidx.lifecycle.InterfaceC1695l
            /* renamed from: a */
            public void mo11423a(LifecycleOwner lifecycleOwner, Lifecycle.EnumC1651b enumC1651b) {
                View view;
                if (enumC1651b == Lifecycle.EnumC1651b.ON_STOP && (view = Fragment.this.mView) != null) {
                    view.cancelPendingInputEvents();
                }
            }
        });
        this.mSavedStateRegistryController.m35304d(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.m36118h(Lifecycle.EnumC1651b.ON_CREATE);
            return;
        }
        throw new C1646u("Fragment " + this + " did not call through to super.onCreate()");
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z = true;
        }
        return z | this.mChildFragmentManager.m36488D(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.m36451V0();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new FragmentViewLifecycleOwner(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.m36345b();
            C1689h0.m36037a(this.mView, this.mViewLifecycleOwner);
            C1691i0.m36036a(this.mView, this.mViewLifecycleOwner);
            C10481d.m11422a(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.mo35985n(this.mViewLifecycleOwner);
        } else if (!this.mViewLifecycleOwner.m36344c()) {
            this.mViewLifecycleOwner = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public void performDestroy() {
        this.mChildFragmentManager.m36486E();
        this.mLifecycleRegistry.m36118h(Lifecycle.EnumC1651b.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new C1646u("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public void performDestroyView() {
        this.mChildFragmentManager.m36484F();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().mo36124b().m36132a(Lifecycle.State.CREATED)) {
            this.mViewLifecycleOwner.m36346a(Lifecycle.EnumC1651b.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            LoaderManager.m35993b(this).mo35990d();
            this.mPerformedCreateView = false;
            return;
        }
        throw new C1646u("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (!this.mChildFragmentManager.m36481G0()) {
                this.mChildFragmentManager.m36486E();
                this.mChildFragmentManager = new C1604h();
                return;
            }
            return;
        }
        throw new C1646u("Fragment " + this + " did not call through to super.onDetach()");
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.m36482G();
    }

    public void performMultiWindowModeChanged(boolean z) {
        onMultiWindowModeChanged(z);
        this.mChildFragmentManager.m36480H(z);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
                return true;
            }
            return this.mChildFragmentManager.m36476J(menuItem);
        }
        return false;
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.m36474K(menu);
        }
    }

    public void performPause() {
        this.mChildFragmentManager.m36470M();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m36346a(Lifecycle.EnumC1651b.ON_PAUSE);
        }
        this.mLifecycleRegistry.m36118h(Lifecycle.EnumC1651b.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new C1646u("Fragment " + this + " did not call through to super.onPause()");
    }

    public void performPictureInPictureModeChanged(boolean z) {
        onPictureInPictureModeChanged(z);
        this.mChildFragmentManager.m36468N(z);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z = true;
        }
        return z | this.mChildFragmentManager.m36466O(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean m36473K0 = this.mFragmentManager.m36473K0(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != m36473K0) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(m36473K0);
            onPrimaryNavigationFragmentChanged(m36473K0);
            this.mChildFragmentManager.m36464P();
        }
    }

    public void performResume() {
        this.mChildFragmentManager.m36451V0();
        this.mChildFragmentManager.m36441a0(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            LifecycleRegistry lifecycleRegistry = this.mLifecycleRegistry;
            Lifecycle.EnumC1651b enumC1651b = Lifecycle.EnumC1651b.ON_RESUME;
            lifecycleRegistry.m36118h(enumC1651b);
            if (this.mView != null) {
                this.mViewLifecycleOwner.m36346a(enumC1651b);
            }
            this.mChildFragmentManager.m36462Q();
            return;
        }
        throw new C1646u("Fragment " + this + " did not call through to super.onResume()");
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m35303e(bundle);
        Parcelable m36410k1 = this.mChildFragmentManager.m36410k1();
        if (m36410k1 != null) {
            bundle.putParcelable("android:support:fragments", m36410k1);
        }
    }

    public void performStart() {
        this.mChildFragmentManager.m36451V0();
        this.mChildFragmentManager.m36441a0(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            LifecycleRegistry lifecycleRegistry = this.mLifecycleRegistry;
            Lifecycle.EnumC1651b enumC1651b = Lifecycle.EnumC1651b.ON_START;
            lifecycleRegistry.m36118h(enumC1651b);
            if (this.mView != null) {
                this.mViewLifecycleOwner.m36346a(enumC1651b);
            }
            this.mChildFragmentManager.m36460R();
            return;
        }
        throw new C1646u("Fragment " + this + " did not call through to super.onStart()");
    }

    public void performStop() {
        this.mChildFragmentManager.m36456T();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m36346a(Lifecycle.EnumC1651b.ON_STOP);
        }
        this.mLifecycleRegistry.m36118h(Lifecycle.EnumC1651b.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new C1646u("Fragment " + this + " did not call through to super.onStop()");
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.m36454U();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f4017w = true;
    }

    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(ActivityResultContract<I, O> activityResultContract, ActivityResultCallback<O> activityResultCallback) {
        return prepareCallInternal(activityResultContract, new C1547e(), activityResultCallback);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i) {
        if (this.mHost != null) {
            getParentFragmentManager().m36467N0(this, strArr, i);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            if (getContext() == null) {
                throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
            }
            throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
        }
        return parentFragment;
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            this.mChildFragmentManager.m36416i1(parcelable);
            this.mChildFragmentManager.m36490C();
        }
    }

    final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.m36343d(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.m36346a(Lifecycle.EnumC1651b.ON_CREATE);
                return;
            }
            return;
        }
        throw new C1646u("Fragment " + this + " did not call through to super.onViewStateRestored()");
    }

    public void setAllowEnterTransitionOverlap(boolean z) {
        ensureAnimationInfo().f4012r = Boolean.valueOf(z);
    }

    public void setAllowReturnTransitionOverlap(boolean z) {
        ensureAnimationInfo().f4011q = Boolean.valueOf(z);
    }

    public void setAnimatingAway(View view) {
        ensureAnimationInfo().f3995a = view;
    }

    public void setAnimations(int i, int i2, int i3, int i4) {
        if (this.mAnimationInfo == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        ensureAnimationInfo().f3998d = i;
        ensureAnimationInfo().f3999e = i2;
        ensureAnimationInfo().f4000f = i3;
        ensureAnimationInfo().f4001g = i4;
    }

    public void setAnimator(Animator animator) {
        ensureAnimationInfo().f3996b = animator;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(SharedElementCallback sharedElementCallback) {
        ensureAnimationInfo().f4013s = sharedElementCallback;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f4005k = obj;
    }

    public void setExitSharedElementCallback(SharedElementCallback sharedElementCallback) {
        ensureAnimationInfo().f4014t = sharedElementCallback;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f4007m = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().f4016v = view;
    }

    public void setHasOptionsMenu(boolean z) {
        if (this.mHasMenu != z) {
            this.mHasMenu = z;
            if (isAdded() && !isHidden()) {
                this.mHost.mo36495o();
            }
        }
    }

    public void setHideReplaced(boolean z) {
        ensureAnimationInfo().f4019y = z;
    }

    public void setInitialSavedState(SavedState savedState) {
        if (this.mFragmentManager == null) {
            this.mSavedFragmentState = (savedState == null || (r2 = savedState.f4020j) == null) ? null : null;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z) {
        if (this.mMenuVisible != z) {
            this.mMenuVisible = z;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.mo36495o();
            }
        }
    }

    public void setNextTransition(int i) {
        if (this.mAnimationInfo == null && i == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f4002h = i;
    }

    public void setOnStartEnterTransitionListener(OnStartEnterTransitionListener onStartEnterTransitionListener) {
        ensureAnimationInfo();
        AnimationInfo animationInfo = this.mAnimationInfo;
        OnStartEnterTransitionListener onStartEnterTransitionListener2 = animationInfo.f4018x;
        if (onStartEnterTransitionListener == onStartEnterTransitionListener2) {
            return;
        }
        if (onStartEnterTransitionListener != null && onStartEnterTransitionListener2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (animationInfo.f4017w) {
            animationInfo.f4018x = onStartEnterTransitionListener;
        }
        if (onStartEnterTransitionListener != null) {
            onStartEnterTransitionListener.mo36363a();
        }
    }

    public void setPopDirection(boolean z) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f3997c = z;
    }

    public void setPostOnViewCreatedAlpha(float f) {
        ensureAnimationInfo().f4015u = f;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f4008n = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z) {
        this.mRetainInstance = z;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            if (z) {
                fragmentManager.m36418i(this);
                return;
            } else {
                fragmentManager.m36422g1(this);
                return;
            }
        }
        this.mRetainInstanceChangedWhileDetached = true;
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f4006l = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f4009o = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        AnimationInfo animationInfo = this.mAnimationInfo;
        animationInfo.f4003i = arrayList;
        animationInfo.f4004j = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f4010p = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i) {
        FragmentManager fragmentManager;
        FragmentManager fragmentManager2 = this.mFragmentManager;
        if (fragment != null) {
            fragmentManager = fragment.mFragmentManager;
        } else {
            fragmentManager = null;
        }
        if (fragmentManager2 != null && fragmentManager != null && fragmentManager2 != fragmentManager) {
            throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
        }
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getTargetFragment()) {
            if (fragment2.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager != null && fragment.mFragmentManager != null) {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        } else {
            this.mTargetWho = null;
            this.mTarget = fragment;
        }
        this.mTargetRequestCode = i;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z) {
        boolean z2;
        if (!this.mUserVisibleHint && z && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.m36447X0(fragmentManager.m36381v(this));
        }
        this.mUserVisibleHint = z;
        if (this.mState < 5 && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.mDeferStart = z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback != null) {
            return fragmentHostCallback.mo36498l(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityForResult(intent, i, null);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (this.mHost != null) {
            if (FragmentManager.m36479H0(2)) {
                Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
            }
            getParentFragmentManager().m36463P0(this, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null && ensureAnimationInfo().f4017w) {
            if (this.mHost == null) {
                ensureAnimationInfo().f4017w = false;
            } else if (Looper.myLooper() != this.mHost.m36503g().getLooper()) {
                this.mHost.m36503g().postAtFrontOfQueue(new RunnableC1544b());
            } else {
                callStartTransitionListener(true);
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = C1599e.m36291d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.setArguments(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e) {
            throw new C1551i("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (InstantiationException e2) {
            throw new C1551i("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new C1551i("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new C1551i("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e4);
        }
    }

    public final String getString(int i, Object... objArr) {
        return getResources().getString(i, objArr);
    }

    public final void postponeEnterTransition(long j, TimeUnit timeUnit) {
        Handler handler;
        ensureAnimationInfo().f4017w = true;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            handler = fragmentManager.m36380v0().m36503g();
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j));
    }

    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(ActivityResultContract<I, O> activityResultContract, ActivityResultRegistry activityResultRegistry, ActivityResultCallback<O> activityResultCallback) {
        return prepareCallInternal(activityResultContract, new C1548f(activityResultRegistry), activityResultCallback);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback != null) {
            fragmentHostCallback.m36497m(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().m36465O0(this, intent, i, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        FragmentHostCallback<?> fragmentHostCallback = this.mHost;
        if (fragmentHostCallback != null) {
            LayoutInflater mo36501i = fragmentHostCallback.mo36501i();
            C1358v.m37276a(mo36501i, this.mChildFragmentManager.m36378w0());
            return mo36501i;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    private void restoreViewState() {
        if (FragmentManager.m36479H0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    public Fragment(int i) {
        this();
        this.mContentLayoutId = i;
    }
}