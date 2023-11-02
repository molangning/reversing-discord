package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.contextaware.ContextAwareHelper;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.C0270c;
import androidx.activity.result.InterfaceC0269b;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.C0769b;
import androidx.core.app.C0794e;
import androidx.core.app.C0851m;
import androidx.core.app.C0869o4;
import androidx.core.p018os.C1049a;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.C1677b0;
import androidx.lifecycle.C1689h0;
import androidx.lifecycle.C1691i0;
import androidx.lifecycle.C1713y;
import androidx.lifecycle.FragmentC1705v;
import androidx.lifecycle.InterfaceC1687g0;
import androidx.lifecycle.InterfaceC1688h;
import androidx.lifecycle.InterfaceC1695l;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p187k0.C9034c;
import p237n0.C10481d;
import p237n0.InterfaceC10480c;
import p310r0.C12013a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements InterfaceC1687g0, InterfaceC1688h, InterfaceC10480c, InterfaceC0260k, InterfaceC0269b {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    final ContextAwareHelper mContextAwareHelper;
    private ViewModelProvider.Factory mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;
    private final LifecycleRegistry mLifecycleRegistry;
    private final MenuHostHelper mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<Consumer<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<Consumer<C0851m>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<Consumer<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<Consumer<C0869o4>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<Consumer<Integer>> mOnTrimMemoryListeners;
    final SavedStateRegistryController mSavedStateRegistryController;
    private ViewModelStore mViewModelStore;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.activity.ComponentActivity$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class RunnableC0241a implements Runnable {
        RunnableC0241a() {
            ComponentActivity.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e) {
                if (TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    return;
                }
                throw e;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.activity.ComponentActivity$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0242b extends ActivityResultRegistry {

        /* renamed from: androidx.activity.ComponentActivity$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class RunnableC0243a implements Runnable {

            /* renamed from: j */
            final /* synthetic */ int f749j;

            /* renamed from: k */
            final /* synthetic */ ActivityResultContract.C0273a f750k;

            RunnableC0243a(int i, ActivityResultContract.C0273a c0273a) {
                C0242b.this = r1;
                this.f749j = i;
                this.f750k = c0273a;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0242b.this.m40806c(this.f749j, this.f750k.m40780a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class RunnableC0244b implements Runnable {

            /* renamed from: j */
            final /* synthetic */ int f752j;

            /* renamed from: k */
            final /* synthetic */ IntentSender.SendIntentException f753k;

            RunnableC0244b(int i, IntentSender.SendIntentException sendIntentException) {
                C0242b.this = r1;
                this.f752j = i;
                this.f753k = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0242b.this.m40807b(this.f752j, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f753k));
            }
        }

        C0242b() {
            ComponentActivity.this = r1;
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        /* renamed from: f */
        public <I, O> void mo40803f(int i, ActivityResultContract<I, O> activityResultContract, I i2, C0794e c0794e) {
            Bundle bundle;
            Bundle bundle2;
            ComponentActivity componentActivity = ComponentActivity.this;
            ActivityResultContract.C0273a<O> mo33583b = activityResultContract.mo33583b(componentActivity, i2);
            if (mo33583b != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0243a(i, mo33583b));
                return;
            }
            Intent mo33578a = activityResultContract.mo33578a(componentActivity, i2);
            if (mo33578a.getExtras() != null && mo33578a.getExtras().getClassLoader() == null) {
                mo33578a.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (mo33578a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                Bundle bundleExtra = mo33578a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                mo33578a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                bundle2 = bundleExtra;
            } else {
                if (c0794e != null) {
                    bundle = c0794e.mo38631b();
                } else {
                    bundle = null;
                }
                bundle2 = bundle;
            }
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(mo33578a.getAction())) {
                String[] stringArrayExtra = mo33578a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                C0769b.m38671r(componentActivity, stringArrayExtra, i);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(mo33578a.getAction())) {
                C0270c c0270c = (C0270c) mo33578a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    C0769b.m38666w(componentActivity, c0270c.m40786e(), i, c0270c.m40789a(), c0270c.m40788b(), c0270c.m40787d(), 0, bundle2);
                } catch (IntentSender.SendIntentException e) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0244b(i, e));
                }
            } else {
                C0769b.m38667v(componentActivity, mo33578a, i, bundle2);
            }
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C0245c {
        /* renamed from: a */
        static void m40838a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C0246d {
        /* renamed from: a */
        static OnBackInvokedDispatcher m40837a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    /* renamed from: androidx.activity.ComponentActivity$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C0247e {

        /* renamed from: a */
        Object f755a;

        /* renamed from: b */
        ViewModelStore f756b;

        C0247e() {
        }
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new ContextAwareHelper();
        this.mMenuHostHelper = new MenuHostHelper(new Runnable() { // from class: androidx.activity.b
            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity.this.invalidateMenu();
            }
        });
        this.mLifecycleRegistry = new LifecycleRegistry(this);
        SavedStateRegistryController m35307a = SavedStateRegistryController.m35307a(this);
        this.mSavedStateRegistryController = m35307a;
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new RunnableC0241a());
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new C0242b();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() != null) {
            int i = Build.VERSION.SDK_INT;
            getLifecycle().mo36125a(new InterfaceC1695l() { // from class: androidx.activity.ComponentActivity.3
                @Override // androidx.lifecycle.InterfaceC1695l
                /* renamed from: a */
                public void mo11423a(LifecycleOwner lifecycleOwner, Lifecycle.EnumC1651b enumC1651b) {
                    View view;
                    if (enumC1651b == Lifecycle.EnumC1651b.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        if (window != null) {
                            view = window.peekDecorView();
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            C0245c.m40838a(view);
                        }
                    }
                }
            });
            getLifecycle().mo36125a(new InterfaceC1695l() { // from class: androidx.activity.ComponentActivity.4
                @Override // androidx.lifecycle.InterfaceC1695l
                /* renamed from: a */
                public void mo11423a(LifecycleOwner lifecycleOwner, Lifecycle.EnumC1651b enumC1651b) {
                    if (enumC1651b == Lifecycle.EnumC1651b.ON_DESTROY) {
                        ComponentActivity.this.mContextAwareHelper.m40823b();
                        if (!ComponentActivity.this.isChangingConfigurations()) {
                            ComponentActivity.this.getViewModelStore().m36071a();
                        }
                    }
                }
            });
            getLifecycle().mo36125a(new InterfaceC1695l() { // from class: androidx.activity.ComponentActivity.5
                @Override // androidx.lifecycle.InterfaceC1695l
                /* renamed from: a */
                public void mo11423a(LifecycleOwner lifecycleOwner, Lifecycle.EnumC1651b enumC1651b) {
                    ComponentActivity.this.ensureViewModelStore();
                    ComponentActivity.this.getLifecycle().mo36123c(this);
                }
            });
            m35307a.m35305c();
            C1713y.m36001c(this);
            if (i <= 23) {
                getLifecycle().mo36125a(new ImmLeaksCleaner(this));
            }
            getSavedStateRegistry().m35311h(ACTIVITY_RESULT_TAG, new SavedStateRegistry.InterfaceC1822c() { // from class: androidx.activity.c
                @Override // androidx.savedstate.SavedStateRegistry.InterfaceC1822c
                /* renamed from: a */
                public final Bundle mo35308a() {
                    Bundle lambda$new$0;
                    lambda$new$0 = ComponentActivity.this.lambda$new$0();
                    return lambda$new$0;
                }
            });
            addOnContextAvailableListener(new OnContextAvailableListener() { // from class: androidx.activity.d
                @Override // androidx.activity.contextaware.OnContextAvailableListener
                /* renamed from: a */
                public final void mo36535a(Context context) {
                    ComponentActivity.this.lambda$new$1(context);
                }
            });
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    private void initViewTreeOwners() {
        C1689h0.m36037a(getWindow().getDecorView(), this);
        C1691i0.m36036a(getWindow().getDecorView(), this);
        C10481d.m11422a(getWindow().getDecorView(), this);
        View.m40810a(getWindow().getDecorView(), this);
    }

    public /* synthetic */ Bundle lambda$new$0() {
        Bundle bundle = new Bundle();
        this.mActivityResultRegistry.m40801h(bundle);
        return bundle;
    }

    public /* synthetic */ void lambda$new$1(Context context) {
        Bundle m35317b = getSavedStateRegistry().m35317b(ACTIVITY_RESULT_TAG);
        if (m35317b != null) {
            this.mActivityResultRegistry.m40802g(m35317b);
        }
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(MenuProvider menuProvider) {
        this.mMenuHostHelper.m37785c(menuProvider);
    }

    public final void addOnConfigurationChangedListener(Consumer<Configuration> consumer) {
        this.mOnConfigurationChangedListeners.add(consumer);
    }

    public final void addOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener) {
        this.mContextAwareHelper.m40824a(onContextAvailableListener);
    }

    public final void addOnMultiWindowModeChangedListener(Consumer<C0851m> consumer) {
        this.mOnMultiWindowModeChangedListeners.add(consumer);
    }

    public final void addOnNewIntentListener(Consumer<Intent> consumer) {
        this.mOnNewIntentListeners.add(consumer);
    }

    public final void addOnPictureInPictureModeChangedListener(Consumer<C0869o4> consumer) {
        this.mOnPictureInPictureModeChangedListeners.add(consumer);
    }

    public final void addOnTrimMemoryListener(Consumer<Integer> consumer) {
        this.mOnTrimMemoryListeners.add(consumer);
    }

    void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            C0247e c0247e = (C0247e) getLastNonConfigurationInstance();
            if (c0247e != null) {
                this.mViewModelStore = c0247e.f756b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new ViewModelStore();
            }
        }
    }

    @Override // androidx.activity.result.InterfaceC0269b
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC1688h
    public CreationExtras getDefaultViewModelCreationExtras() {
        C9034c c9034c = new C9034c();
        if (getApplication() != null) {
            c9034c.m16835c(ViewModelProvider.C1664a.f4480g, getApplication());
        }
        c9034c.m16835c(C1713y.f4525a, this);
        c9034c.m16835c(C1713y.f4526b, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            c9034c.m16835c(C1713y.f4527c, getIntent().getExtras());
        }
        return c9034c;
    }

    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        Bundle bundle;
        if (this.mDefaultFactory == null) {
            Application application = getApplication();
            if (getIntent() != null) {
                bundle = getIntent().getExtras();
            } else {
                bundle = null;
            }
            this.mDefaultFactory = new C1677b0(application, this, bundle);
        }
        return this.mDefaultFactory;
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        C0247e c0247e = (C0247e) getLastNonConfigurationInstance();
        if (c0247e != null) {
            return c0247e.f755a;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.InterfaceC0260k
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // p237n0.InterfaceC10480c
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.m35306b();
    }

    @Override // androidx.lifecycle.InterfaceC1687g0
    public ViewModelStore getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.mActivityResultRegistry.m40807b(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.m40830f();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<Consumer<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.m35304d(bundle);
        this.mContextAwareHelper.m40822c(this);
        super.onCreate(bundle);
        FragmentC1705v.m36017g(this);
        if (C1049a.m37988c()) {
            this.mOnBackPressedDispatcher.m40829g(C0246d.m40837a(this));
        }
        int i = this.mContentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            super.onCreatePanelMenu(i, menu);
            this.mMenuHostHelper.m37780h(menu, getMenuInflater());
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.mMenuHostHelper.m37778j(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<Consumer<C0851m>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C0851m(z));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<Consumer<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        this.mMenuHostHelper.m37779i(menu);
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<Consumer<C0869o4>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new C0869o4(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            super.onPreparePanel(i, view, menu);
            this.mMenuHostHelper.m37777k(menu);
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!this.mActivityResultRegistry.m40807b(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0247e c0247e;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        ViewModelStore viewModelStore = this.mViewModelStore;
        if (viewModelStore == null && (c0247e = (C0247e) getLastNonConfigurationInstance()) != null) {
            viewModelStore = c0247e.f756b;
        }
        if (viewModelStore == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0247e c0247e2 = new C0247e();
        c0247e2.f755a = onRetainCustomNonConfigurationInstance;
        c0247e2.f756b = viewModelStore;
        return c0247e2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof LifecycleRegistry) {
            ((LifecycleRegistry) lifecycle).m36111o(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m35303e(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<Consumer<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.m40821d();
    }

    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(ActivityResultContract<I, O> activityResultContract, ActivityResultRegistry activityResultRegistry, ActivityResultCallback<O> activityResultCallback) {
        return activityResultRegistry.m40799j("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, activityResultContract, activityResultCallback);
    }

    public void removeMenuProvider(MenuProvider menuProvider) {
        this.mMenuHostHelper.m37776l(menuProvider);
    }

    public final void removeOnConfigurationChangedListener(Consumer<Configuration> consumer) {
        this.mOnConfigurationChangedListeners.remove(consumer);
    }

    public final void removeOnContextAvailableListener(OnContextAvailableListener onContextAvailableListener) {
        this.mContextAwareHelper.m40820e(onContextAvailableListener);
    }

    public final void removeOnMultiWindowModeChangedListener(Consumer<C0851m> consumer) {
        this.mOnMultiWindowModeChangedListeners.remove(consumer);
    }

    public final void removeOnNewIntentListener(Consumer<Intent> consumer) {
        this.mOnNewIntentListeners.remove(consumer);
    }

    public final void removeOnPictureInPictureModeChangedListener(Consumer<C0869o4> consumer) {
        this.mOnPictureInPictureModeChangedListeners.remove(consumer);
    }

    public final void removeOnTrimMemoryListener(Consumer<Integer> consumer) {
        this.mOnTrimMemoryListeners.remove(consumer);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (C12013a.m6599h()) {
                C12013a.m6604c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
        } finally {
            C12013a.m6601f();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initViewTreeOwners();
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public void addMenuProvider(MenuProvider menuProvider, LifecycleOwner lifecycleOwner) {
        this.mMenuHostHelper.m37784d(menuProvider, lifecycleOwner);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(MenuProvider menuProvider, LifecycleOwner lifecycleOwner, Lifecycle.State state) {
        this.mMenuHostHelper.m37783e(menuProvider, lifecycleOwner, state);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<Consumer<C0851m>> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new C0851m(z, configuration));
            }
        } catch (Throwable th2) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<Consumer<C0869o4>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new C0869o4(z, configuration));
            }
        } catch (Throwable th2) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(ActivityResultContract<I, O> activityResultContract, ActivityResultCallback<O> activityResultCallback) {
        return registerForActivityResult(activityResultContract, this.mActivityResultRegistry, activityResultCallback);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public ComponentActivity(int i) {
        this();
        this.mContentLayoutId = i;
    }
}