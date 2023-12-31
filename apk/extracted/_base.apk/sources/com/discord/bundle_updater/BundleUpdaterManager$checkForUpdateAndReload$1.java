package com.discord.bundle_updater;

import android.app.Activity;
import android.app.Application;
import android.view.ViewGroup;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.bridge.ReactApplicationContext;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m14357d2 = {"<anonymous>", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class BundleUpdaterManager$checkForUpdateAndReload$1 extends AbstractC9614s implements Function0<Unit> {
    final /* synthetic */ BundleUpdaterManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(m14358d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, m14357d2 = {"<anonymous>", "", "Landroid/view/ViewGroup;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.discord.bundle_updater.BundleUpdaterManager$checkForUpdateAndReload$1$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C28981 extends AbstractC9614s implements Function1<ViewGroup, Unit> {
        final /* synthetic */ BundleUpdaterManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C28981(BundleUpdaterManager bundleUpdaterManager) {
            super(1);
            this.this$0 = bundleUpdaterManager;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ViewGroup viewGroup) {
            invoke2(viewGroup);
            return Unit.f25302a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(ViewGroup runOnActivity) {
            ReactApplicationContext reactApplicationContext;
            Application application;
            ReactNativeHost reactNativeHost;
            ReactInstanceManager reactInstanceManager;
            C9612q.m13917h(runOnActivity, "$this$runOnActivity");
            reactApplicationContext = this.this$0.reactContext;
            Activity currentActivity = reactApplicationContext.getCurrentActivity();
            if (currentActivity == null || (application = currentActivity.getApplication()) == null) {
                return;
            }
            if (!(application instanceof ReactApplication)) {
                application = null;
            }
            ReactApplication reactApplication = (ReactApplication) application;
            if (reactApplication == null || (reactNativeHost = reactApplication.getReactNativeHost()) == null || (reactInstanceManager = reactNativeHost.getReactInstanceManager()) == null) {
                return;
            }
            BundleUpdaterManager bundleUpdaterManager = this.this$0;
            File bundleLocation = BundleUpdater.Companion.instance().getBundleLocation();
            bundleUpdaterManager.setJSBundle(reactInstanceManager, bundleLocation != null ? bundleLocation.getAbsolutePath() : null);
            reactInstanceManager.recreateReactContextInBackground();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundleUpdaterManager$checkForUpdateAndReload$1(BundleUpdaterManager bundleUpdaterManager) {
        super(0);
        this.this$0 = bundleUpdaterManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.removeSpinnerView();
        BundleUpdaterManager bundleUpdaterManager = this.this$0;
        bundleUpdaterManager.runOnActivity(new C28981(bundleUpdaterManager));
    }
}
