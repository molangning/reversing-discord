package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.C0613x1;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.C0769b;
import androidx.core.app.C0857n;
import androidx.core.app.TaskStackBuilder;
import androidx.core.p018os.LocaleListCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C1689h0;
import androidx.lifecycle.C1691i0;
import androidx.savedstate.SavedStateRegistry;
import p237n0.C10481d;

/* renamed from: androidx.appcompat.app.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ActivityC0294b extends FragmentActivity implements InterfaceC0297c, TaskStackBuilder.InterfaceC0762a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private AppCompatDelegate mDelegate;
    private Resources mResources;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0295a implements SavedStateRegistry.InterfaceC1822c {
        C0295a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC1822c
        /* renamed from: a */
        public Bundle mo35308a() {
            Bundle bundle = new Bundle();
            ActivityC0294b.this.getDelegate().mo40691E(bundle);
            return bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C0296b implements OnContextAvailableListener {
        C0296b() {
        }

        @Override // androidx.activity.contextaware.OnContextAvailableListener
        /* renamed from: a */
        public void mo36535a(Context context) {
            AppCompatDelegate delegate = ActivityC0294b.this.getDelegate();
            delegate.mo40613v();
            delegate.mo40699A(ActivityC0294b.this.getSavedStateRegistry().m35317b(ActivityC0294b.DELEGATE_TAG));
        }
    }

    public ActivityC0294b() {
        initDelegate();
    }

    private void initDelegate() {
        getSavedStateRegistry().m35311h(DELEGATE_TAG, new C0295a());
        addOnContextAvailableListener(new C0296b());
    }

    private void initViewTreeOwners() {
        C1689h0.m36037a(getWindow().getDecorView(), this);
        C1691i0.m36036a(getWindow().getDecorView(), this);
        C10481d.m11422a(getWindow().getDecorView(), this);
        View.m40810a(getWindow().getDecorView(), this);
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(android.view.View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().mo40644e(view, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(getDelegate().mo40634i(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo40525g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        ActionBar supportActionBar = getSupportActionBar();
        if (keyCode == 82 && supportActionBar != null && supportActionBar.mo40516p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public <T extends android.view.View> T findViewById(int i) {
        return (T) getDelegate().mo40629l(i);
    }

    public AppCompatDelegate getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AppCompatDelegate.m40737j(this, this);
        }
        return this.mDelegate;
    }

    public ActionBarDrawerToggle$Delegate getDrawerToggleDelegate() {
        return getDelegate().mo40623p();
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return getDelegate().mo40618s();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.mResources == null && C0613x1.m39576d()) {
            this.mResources = new C0613x1(this, super.getResources());
        }
        Resources resources = this.mResources;
        if (resources == null) {
            return super.getResources();
        }
        return resources;
    }

    public ActionBar getSupportActionBar() {
        return getDelegate().mo40615u();
    }

    @Override // androidx.core.app.TaskStackBuilder.InterfaceC0762a
    public Intent getSupportParentActivityIntent() {
        return C0857n.m38555a(this);
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        getDelegate().mo40611w();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getDelegate().mo40607z(configuration);
        if (this.mResources != null) {
            this.mResources.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
        taskStackBuilder.m38687d(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getDelegate().mo40697B();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (performMenuItemShortcut(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onLocalesChanged(LocaleListCompat localeListCompat) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (menuItem.getItemId() == 16908332 && supportActionBar != null && (supportActionBar.mo40522j() & 4) != 0) {
            return onSupportNavigateUp();
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onNightModeChanged(int i) {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        getDelegate().mo40695C(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        getDelegate().mo40693D();
    }

    public void onPrepareSupportNavigateUpTaskStack(TaskStackBuilder taskStackBuilder) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        getDelegate().mo40689F();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        getDelegate().mo40687G();
    }

    @Override // androidx.appcompat.app.InterfaceC0297c
    public void onSupportActionModeFinished(ActionMode actionMode) {
    }

    @Override // androidx.appcompat.app.InterfaceC0297c
    public void onSupportActionModeStarted(ActionMode actionMode) {
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Intent supportParentActivityIntent = getSupportParentActivityIntent();
        if (supportParentActivityIntent != null) {
            if (supportShouldUpRecreateTask(supportParentActivityIntent)) {
                TaskStackBuilder m38685h = TaskStackBuilder.m38685h(this);
                onCreateSupportNavigateUpTaskStack(m38685h);
                onPrepareSupportNavigateUpTaskStack(m38685h);
                m38685h.m38684i();
                try {
                    C0769b.m38676m(this);
                    return true;
                } catch (IllegalStateException unused) {
                    finish();
                    return true;
                }
            }
            supportNavigateUpTo(supportParentActivityIntent);
            return true;
        }
        return false;
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        getDelegate().mo40667S(charSequence);
    }

    @Override // androidx.appcompat.app.InterfaceC0297c
    public ActionMode onWindowStartingSupportActionMode(ActionMode.Callback callback) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        ActionBar supportActionBar = getSupportActionBar();
        if (getWindow().hasFeature(0)) {
            if (supportActionBar == null || !supportActionBar.mo40515q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        initViewTreeOwners();
        getDelegate().mo40680L(i);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        getDelegate().mo40671Q(toolbar);
    }

    @Deprecated
    public void setSupportProgress(int i) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean z) {
    }

    @Deprecated
    public void setSupportProgressBarVisibility(boolean z) {
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        getDelegate().mo40669R(i);
    }

    public ActionMode startSupportActionMode(ActionMode.Callback callback) {
        return getDelegate().mo40665T(callback);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void supportInvalidateOptionsMenu() {
        getDelegate().mo40611w();
    }

    public void supportNavigateUpTo(Intent intent) {
        C0857n.m38551e(this, intent);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().mo40683J(i);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return C0857n.m38550f(this, intent);
    }

    public ActivityC0294b(int i) {
        super(i);
        initDelegate();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(android.view.View view) {
        initViewTreeOwners();
        getDelegate().mo40678M(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(android.view.View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        getDelegate().mo40676N(view, layoutParams);
    }
}
