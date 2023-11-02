package p315r5;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Parcelable;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p414x2.C13677a;

@Metadata(m14358d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\t*\u0001\u000f\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B!\b\u0000\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, m14357d2 = {"Lr5/b;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "", "onHostResume", "onHostPause", "onHostDestroy", "Lcom/facebook/react/bridge/ReactContext;", "j", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "Lkotlin/Function0;", "Landroid/app/Activity;", "k", "Lkotlin/jvm/functions/Function0;", "onGetCurrentActivity", "r5/b$b", "l", "Lr5/b$b;", "receiver", "<init>", "(Lcom/facebook/react/bridge/ReactContext;Lkotlin/jvm/functions/Function0;)V", "m", "a", "react-native-orientation_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: r5.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12063b implements LifecycleEventListener {

    /* renamed from: m */
    public static final C12064a f31207m = new C12064a(null);

    /* renamed from: j */
    private final ReactContext f31208j;

    /* renamed from: k */
    private final Function0<Activity> f31209k;

    /* renamed from: l */
    private final C12065b f31210l;

    @Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0013"}, m14357d2 = {"Lr5/b$a;", "", "Landroid/app/Activity;", "activity", "Landroid/content/res/Configuration;", "newConfig", "", "a", "", "orientation", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "b", "", "INTENT_ACTION_CONFIG_CHANGED", "Ljava/lang/String;", "INTENT_VALUE_KEY", "<init>", "()V", "react-native-orientation_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: r5.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12064a {
        private C12064a() {
        }

        public /* synthetic */ C12064a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void m6349a(Activity activity, Configuration newConfig) {
            C9612q.m13917h(activity, "activity");
            C9612q.m13917h(newConfig, "newConfig");
            Intent intent = new Intent("onConfigurationChanged");
            intent.putExtra("newConfig", newConfig);
            activity.sendBroadcast(intent);
        }

        /* renamed from: b */
        public final void m6348b(int i, ReactContext reactContext) {
            String str;
            C9612q.m13917h(reactContext, "reactContext");
            if (reactContext.hasActiveReactInstance()) {
                if (i == 1) {
                    str = "PORTRAIT";
                } else {
                    str = "LANDSCAPE";
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putString("orientation", str);
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", createMap);
            }
        }
    }

    @Metadata(m14358d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, m14357d2 = {"r5/b$b", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "", "onReceive", "react-native-orientation_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: r5.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12065b extends BroadcastReceiver {
        C12065b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C9612q.m13917h(context, "context");
            C9612q.m13917h(intent, "intent");
            Parcelable parcelableExtra = intent.getParcelableExtra("newConfig");
            C9612q.m13920e(parcelableExtra);
            C12063b.f31207m.m6348b(((Configuration) parcelableExtra).orientation, C12063b.this.f31208j);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12063b(ReactContext reactContext, Function0<? extends Activity> onGetCurrentActivity) {
        C9612q.m13917h(reactContext, "reactContext");
        C9612q.m13917h(onGetCurrentActivity, "onGetCurrentActivity");
        this.f31208j = reactContext;
        this.f31209k = onGetCurrentActivity;
        this.f31210l = new C12065b();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        Activity invoke = this.f31209k.invoke();
        if (invoke != null) {
            try {
                invoke.unregisterReceiver(this.f31210l);
                return;
            } catch (IllegalArgumentException e) {
                C13677a.m1853k(ReactConstants.TAG, "receiver already unregistered", e);
                return;
            }
        }
        C13677a.m1854j(ReactConstants.TAG, "no activity to un-register receiver");
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        Activity invoke = this.f31209k.invoke();
        if (invoke != null) {
            invoke.registerReceiver(this.f31210l, new IntentFilter("onConfigurationChanged"));
        } else {
            C13677a.m1854j(ReactConstants.TAG, "no activity to register receiver");
        }
        f31207m.m6348b(this.f31208j.getResources().getConfiguration().orientation, this.f31208j);
    }
}
