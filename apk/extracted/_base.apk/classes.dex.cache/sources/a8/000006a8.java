package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.InterfaceC0260k;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.InterfaceC0269b;
import androidx.core.app.C0769b;
import androidx.core.app.SharedElementCallback;
import androidx.lifecycle.InterfaceC1687g0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import androidx.loader.app.LoaderManager;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class FragmentActivity extends ComponentActivity implements C0769b.InterfaceC0775f {
    static final String FRAGMENTS_TAG = "android:support:fragments";
    boolean mCreated;
    final LifecycleRegistry mFragmentLifecycleRegistry;
    final FragmentController mFragments;
    boolean mResumed;
    boolean mStopped;

    /* renamed from: androidx.fragment.app.FragmentActivity$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1552a implements SavedStateRegistry.InterfaceC1822c {
        C1552a() {
            FragmentActivity.this = r1;
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC1822c
        /* renamed from: a */
        public Bundle mo35308a() {
            Bundle bundle = new Bundle();
            FragmentActivity.this.markFragmentsCreated();
            FragmentActivity.this.mFragmentLifecycleRegistry.m36118h(Lifecycle.EnumC1651b.ON_STOP);
            Parcelable m36508x = FragmentActivity.this.mFragments.m36508x();
            if (m36508x != null) {
                bundle.putParcelable(FragmentActivity.FRAGMENTS_TAG, m36508x);
            }
            return bundle;
        }
    }

    /* renamed from: androidx.fragment.app.FragmentActivity$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1553b implements OnContextAvailableListener {
        C1553b() {
            FragmentActivity.this = r1;
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        /* renamed from: a */
        public void mo36535a(Context context) {
            FragmentActivity.this.mFragments.m36531a(null);
            Bundle m35317b = FragmentActivity.this.getSavedStateRegistry().m35317b(FragmentActivity.FRAGMENTS_TAG);
            if (m35317b != null) {
                FragmentActivity.this.mFragments.m36509w(m35317b.getParcelable(FragmentActivity.FRAGMENTS_TAG));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.FragmentActivity$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1554c extends FragmentHostCallback<FragmentActivity> implements InterfaceC1687g0, InterfaceC0260k, InterfaceC0269b, InterfaceC1609k {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1554c() {
            super(r1);
            FragmentActivity.this = r1;
        }

        @Override // androidx.fragment.app.InterfaceC1609k
        /* renamed from: a */
        public void mo36263a(FragmentManager fragmentManager, Fragment fragment) {
            FragmentActivity.this.onAttachFragment(fragment);
        }

        @Override // androidx.fragment.app.FragmentHostCallback, androidx.fragment.app.FragmentContainer
        /* renamed from: c */
        public View mo36507c(int i) {
            return FragmentActivity.this.findViewById(i);
        }

        @Override // androidx.fragment.app.FragmentHostCallback, androidx.fragment.app.FragmentContainer
        /* renamed from: d */
        public boolean mo36506d() {
            Window window = FragmentActivity.this.getWindow();
            if (window != null && window.peekDecorView() != null) {
                return true;
            }
            return false;
        }

        @Override // androidx.activity.result.InterfaceC0269b
        public ActivityResultRegistry getActivityResultRegistry() {
            return FragmentActivity.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.LifecycleOwner
        public Lifecycle getLifecycle() {
            return FragmentActivity.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.InterfaceC0260k
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return FragmentActivity.this.getOnBackPressedDispatcher();
        }

        @Override // androidx.lifecycle.InterfaceC1687g0
        public ViewModelStore getViewModelStore() {
            return FragmentActivity.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        /* renamed from: i */
        public LayoutInflater mo36501i() {
            return FragmentActivity.this.getLayoutInflater().cloneInContext(FragmentActivity.this);
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        /* renamed from: k */
        public boolean mo36499k(Fragment fragment) {
            return !FragmentActivity.this.isFinishing();
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        /* renamed from: l */
        public boolean mo36498l(String str) {
            return C0769b.m38668u(FragmentActivity.this, str);
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        /* renamed from: o */
        public void mo36495o() {
            FragmentActivity.this.supportInvalidateOptionsMenu();
        }

        @Override // androidx.fragment.app.FragmentHostCallback
        /* renamed from: p */
        public FragmentActivity mo36502h() {
            return FragmentActivity.this;
        }
    }

    public FragmentActivity() {
        this.mFragments = FragmentController.m36530b(new C1554c());
        this.mFragmentLifecycleRegistry = new LifecycleRegistry(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().m35311h(FRAGMENTS_TAG, new C1552a());
        addOnContextAvailableListener(new C1553b());
    }

    private static boolean markState(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean z = false;
        for (Fragment fragment : fragmentManager.m36382u0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z |= markState(fragment.getChildFragmentManager(), state);
                }
                FragmentViewLifecycleOwner fragmentViewLifecycleOwner = fragment.mViewLifecycleOwner;
                if (fragmentViewLifecycleOwner != null && fragmentViewLifecycleOwner.getLifecycle().mo36124b().m36132a(Lifecycle.State.STARTED)) {
                    fragment.mViewLifecycleOwner.m36341f(state);
                    z = true;
                }
                if (fragment.mLifecycleRegistry.mo36124b().m36132a(Lifecycle.State.STARTED)) {
                    fragment.mLifecycleRegistry.m36111o(state);
                    z = true;
                }
            }
        }
        return z;
    }

    final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.m36510v(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            LoaderManager.m35993b(this).mo35992a(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.m36512t().m36450W(str, fileDescriptor, printWriter, strArr);
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.m36512t();
    }

    @Deprecated
    public LoaderManager getSupportLoaderManager() {
        return LoaderManager.m35993b(this);
    }

    void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), Lifecycle.State.CREATED));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        this.mFragments.m36511u();
        super.onActivityResult(i, i2, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mFragments.m36511u();
        super.onConfigurationChanged(configuration);
        this.mFragments.m36528d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.m36118h(Lifecycle.EnumC1651b.ON_CREATE);
        this.mFragments.m36526f();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i == 0) {
            return super.onCreatePanelMenu(i, menu) | this.mFragments.m36525g(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.m36524h();
        this.mFragmentLifecycleRegistry.m36118h(Lifecycle.EnumC1651b.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.m36523i();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            if (i != 6) {
                return false;
            }
            return this.mFragments.m36527e(menuItem);
        }
        return this.mFragments.m36521k(menuItem);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.mFragments.m36522j(z);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.mFragments.m36511u();
        super.onNewIntent(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.mFragments.m36520l(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.m36519m();
        this.mFragmentLifecycleRegistry.m36118h(Lifecycle.EnumC1651b.ON_PAUSE);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.mFragments.m36518n(z);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Deprecated
    protected boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i == 0) {
            return onPrepareOptionsPanel(view, menu) | this.mFragments.m36517o(menu);
        }
        return super.onPreparePanel(i, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.mFragments.m36511u();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.m36511u();
        super.onResume();
        this.mResumed = true;
        this.mFragments.m36513s();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.m36118h(Lifecycle.EnumC1651b.ON_RESUME);
        this.mFragments.m36516p();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.m36511u();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.m36529c();
        }
        this.mFragments.m36513s();
        this.mFragmentLifecycleRegistry.m36118h(Lifecycle.EnumC1651b.ON_START);
        this.mFragments.m36515q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.m36511u();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.m36514r();
        this.mFragmentLifecycleRegistry.m36118h(Lifecycle.EnumC1651b.ON_STOP);
    }

    public void setEnterSharedElementCallback(SharedElementCallback sharedElementCallback) {
        C0769b.m38670s(this, sharedElementCallback);
    }

    public void setExitSharedElementCallback(SharedElementCallback sharedElementCallback) {
        C0769b.m38669t(this, sharedElementCallback);
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        startActivityFromFragment(fragment, intent, i, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i == -1) {
            C0769b.m38666w(this, intentSender, i, intent, i2, i3, i4, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        C0769b.m38675n(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        C0769b.m38673p(this);
    }

    public void supportStartPostponedEnterTransition() {
        C0769b.m38665x(this);
    }

    @Override // androidx.core.app.C0769b.InterfaceC0775f
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i) {
    }

    public void startActivityFromFragment(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            C0769b.m38667v(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public FragmentActivity(int i) {
        super(i);
        this.mFragments = FragmentController.m36530b(new C1554c());
        this.mFragmentLifecycleRegistry = new LifecycleRegistry(this);
        this.mStopped = true;
        init();
    }
}