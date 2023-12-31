package com.discord.main;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.discord.external_pip.ExternalPipModule;
import com.discord.foreground_service.ForegroundServiceManager;
import com.discord.notifications.client.NotificationClient;
import com.discord.react_activities.ReactActivity;
import com.facebook.react.bridge.ReactContext;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0003J\f\u0010\u0005\u001a\u00060\u0006R\u00020\u0001H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0014¨\u0006\u0010"}, m14357d2 = {"Lcom/discord/main/MainActivity;", "Lcom/discord/react_activities/ReactActivity;", "()V", "currentReactContext", "Lcom/facebook/react/bridge/ReactContext;", "getActivityDelegate", "Lcom/discord/react_activities/ReactActivity$ActivityDelegate;", "getNameOfComponent", "", "onPictureInPictureModeChanged", "", "isInPictureInPictureMode", "", "newConfig", "Landroid/content/res/Configuration;", "onUserLeaveHint", "main_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class MainActivity extends ReactActivity {
    @SuppressLint({"VisibleForTests"})
    private final ReactContext currentReactContext() {
        return getReactInstanceManager().getCurrentReactContext();
    }

    @Override // com.discord.react_activities.ReactActivity
    public ReactActivity.ActivityDelegate getActivityDelegate() {
        return new ReactActivity.ActivityDelegate() { // from class: com.discord.main.MainActivity$getActivityDelegate$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(MainActivity.this, MainActivity.this);
            }

            private final void parseIntent(Intent intent) {
                NotificationClient companion = NotificationClient.Companion.getInstance();
                Context context = getContext();
                C9612q.m13918g(context, "context");
                companion.handleIntent(context, intent);
                ForegroundServiceManager companion2 = ForegroundServiceManager.Companion.getInstance();
                Context context2 = getContext();
                C9612q.m13918g(context2, "context");
                companion2.handleIntent(context2, intent);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.react.ReactActivityDelegate
            public void onCreate(Bundle bundle) {
                super.onCreate(bundle);
                Intent intent = MainActivity.this.getIntent();
                C9612q.m13918g(intent, "intent");
                parseIntent(intent);
            }

            @Override // com.facebook.react.ReactActivityDelegate
            public boolean onNewIntent(Intent intent) {
                C9612q.m13917h(intent, "intent");
                parseIntent(intent);
                return super.onNewIntent(intent);
            }
        };
    }

    @Override // com.discord.react_activities.ReactActivity
    public String getNameOfComponent() {
        return BuildConfig.MAIN_COMPONENT;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        super.onPictureInPictureModeChanged(z, configuration);
        ExternalPipModule.Companion.onPipModeChanged(currentReactContext(), z);
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        ExternalPipModule.Companion.onUserLeaveHint(currentReactContext());
    }
}