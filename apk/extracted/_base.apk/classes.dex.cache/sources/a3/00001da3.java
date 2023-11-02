package com.discord.react_activities;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import com.discord.bundle_updater.BundleUpdater;
import com.discord.crash_reporting.CrashReporting;
import com.discord.main.MainActivity;
import com.discord.safearea.extensions.ImmersiveMode;
import com.discord.scale.FontScaleUtilsKt;
import com.discord.share.ShareActivity;
import com.discord.theme.ThemeManager;
import com.discord.tti_manager.TTILoggingApplication;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p315r5.C12063b;

@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0019\u001aB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\f\u0010\r\u001a\u00060\u000eR\u00020\u0000H\u0004J\f\u0010\u000f\u001a\u00060\u000eR\u00020\u0000H&J\b\u0010\u0010\u001a\u00020\u0011H\u0004J\b\u0010\u0012\u001a\u00020\u0011H&J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014R\u001a\u0010\u0003\u001a\u00020\u0004X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u001b"}, m14357d2 = {"Lcom/discord/react_activities/ReactActivity;", "Lcom/facebook/react/ReactActivity;", "()V", "rootView", "Lcom/discord/react_activities/ReactRootView;", "getRootView$react_activity_release", "()Lcom/discord/react_activities/ReactRootView;", "setRootView$react_activity_release", "(Lcom/discord/react_activities/ReactRootView;)V", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "createReactActivityDelegate", "Lcom/discord/react_activities/ReactActivity$ActivityDelegate;", "getActivityDelegate", "getMainComponentName", "", "getNameOfComponent", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "ActivityDelegate", "Registry", "react_activity_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public abstract class ReactActivity extends com.facebook.react.ReactActivity {
    public static final Registry Registry = new Registry(null);
    private static final Class<?> mainActivity;
    private static final Class<?> shareActivity;
    public ReactRootView rootView;

    @Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0015\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0015\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, m14357d2 = {"Lcom/discord/react_activities/ReactActivity$Registry;", "", "()V", "mainActivity", "Ljava/lang/Class;", "getMainActivity", "()Ljava/lang/Class;", "shareActivity", "getShareActivity", "react_activity_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
    public static final class Registry {
        private Registry() {
        }

        public /* synthetic */ Registry(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Class<?> getMainActivity() {
            return ReactActivity.mainActivity;
        }

        public final Class<?> getShareActivity() {
            return ReactActivity.shareActivity;
        }
    }

    static {
        C9612q.m13918g(MainActivity.class, "forName(\"com.discord.main.MainActivity\")");
        mainActivity = MainActivity.class;
        C9612q.m13918g(ShareActivity.class, "forName(\"com.discord.share.ShareActivity\")");
        shareActivity = ShareActivity.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.ActivityC0294b, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context newBase) {
        C9612q.m13917h(newBase, "newBase");
        super.attachBaseContext(FontScaleUtilsKt.getFontScaledContext(newBase));
        Unit unit = Unit.f25302a;
        Context applicationContext = getApplicationContext();
        C9612q.m13918g(applicationContext, "applicationContext");
        FontScaleUtilsKt.setFontScaleDeprecated(applicationContext);
    }

    public abstract ActivityDelegate getActivityDelegate();

    @Override // com.facebook.react.ReactActivity
    protected final String getMainComponentName() {
        return getNameOfComponent();
    }

    public abstract String getNameOfComponent();

    public final ReactRootView getRootView$react_activity_release() {
        ReactRootView reactRootView = this.rootView;
        if (reactRootView != null) {
            return reactRootView;
        }
        C9612q.m13900y("rootView");
        return null;
    }

    @Override // com.facebook.react.ReactActivity, androidx.appcompat.app.ActivityC0294b, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        C9612q.m13917h(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        C12063b.f31207m.m6349a(this, newConfig);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.ReactActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(null);
        BundleUpdater.checkForUpdate$default(BundleUpdater.Companion.instance(), 10, null, 2, null);
        ImmersiveMode.INSTANCE.enableImmersiveMode(this);
        ThemeManager themeManager = ThemeManager.INSTANCE;
        themeManager.updateSystemUi(this);
        themeManager.updateWindowBackground(this, true);
    }

    public final void setRootView$react_activity_release(ReactRootView reactRootView) {
        C9612q.m13917h(reactRootView, "<set-?>");
        this.rootView = reactRootView;
    }

    @Override // com.facebook.react.ReactActivity
    public final ActivityDelegate createReactActivityDelegate() {
        return getActivityDelegate();
    }

    @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0096\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0014J\b\u0010\t\u001a\u00020\nH\u0014¨\u0006\u000b"}, m14357d2 = {"Lcom/discord/react_activities/ReactActivity$ActivityDelegate;", "Lcom/facebook/react/ReactActivityDelegate;", "activity", "Lcom/discord/react_activities/ReactActivity;", "(Lcom/discord/react_activities/ReactActivity;Lcom/discord/react_activities/ReactActivity;)V", "createRootView", "Lcom/facebook/react/ReactRootView;", "initialProps", "Landroid/os/Bundle;", "isFabricEnabled", "", "react_activity_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
    public class ActivityDelegate extends ReactActivityDelegate {
        final /* synthetic */ ReactActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityDelegate(ReactActivity reactActivity, ReactActivity activity) {
            super((com.facebook.react.ReactActivity) activity, reactActivity.getNameOfComponent());
            C9612q.m13917h(activity, "activity");
            this.this$0 = reactActivity;
            TTILoggingApplication.Companion.trackActivityDelegateInitialized();
            CrashReporting crashReporting = CrashReporting.INSTANCE;
            if (C9612q.m13922c(crashReporting.isCrashedLastRun(), Boolean.TRUE)) {
                CrashReporting.addBreadcrumb$default(crashReporting, "Checking for blocking OTA update", null, null, 6, null);
                BundleUpdater.checkForUpdate$default(BundleUpdater.Companion.instance(), 0, null, 2, null).get();
            }
        }

        @Override // com.facebook.react.ReactActivityDelegate
        protected com.facebook.react.ReactRootView createRootView() {
            Context context = getContext();
            C9612q.m13918g(context, "context");
            ReactRootView reactRootView = new ReactRootView(context);
            reactRootView.setIsFabric(DefaultNewArchitectureEntryPoint.getFabricEnabled());
            this.this$0.setRootView$react_activity_release(reactRootView);
            return reactRootView;
        }

        @Override // com.facebook.react.ReactActivityDelegate
        protected boolean isFabricEnabled() {
            return DefaultNewArchitectureEntryPoint.getFabricEnabled();
        }

        @Override // com.facebook.react.ReactActivityDelegate
        protected com.facebook.react.ReactRootView createRootView(Bundle bundle) {
            return createRootView();
        }
    }
}