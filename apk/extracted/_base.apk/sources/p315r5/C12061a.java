package p315r5;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0002\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r¢\u0006\u0004\b\"\u0010#J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0016\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, m14357d2 = {"Lr5/a;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "r5/a$a", "c", "()Lr5/a$a;", "", "onHostResume", "onHostPause", "onHostDestroy", "Lcom/facebook/react/bridge/ReactContext;", "j", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "Lkotlin/Function1;", "", "k", "Lkotlin/jvm/functions/Function1;", "onAutoRotateEnabled", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "l", "Landroid/net/Uri;", "setting", "", "m", "Ljava/lang/String;", "autoRotateFlag", "Landroid/database/ContentObserver;", "n", "Landroid/database/ContentObserver;", "observer", "d", "()Z", "autoRotate", "<init>", "(Lcom/facebook/react/bridge/ReactContext;Lkotlin/jvm/functions/Function1;)V", "react-native-orientation_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: r5.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12061a implements LifecycleEventListener {

    /* renamed from: j */
    private final ReactContext f31201j;

    /* renamed from: k */
    private final Function1<Boolean, Unit> f31202k;

    /* renamed from: l */
    private final Uri f31203l;

    /* renamed from: m */
    private final String f31204m;

    /* renamed from: n */
    private ContentObserver f31205n;

    @Metadata(m14358d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, m14357d2 = {"r5/a$a", "Landroid/database/ContentObserver;", "", "selfChange", "", "onChange", "deliverSelfNotifications", "react-native-orientation_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: r5.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12062a extends ContentObserver {
        C12062a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z) {
            super.onChange(z);
            C12061a.this.f31202k.invoke(Boolean.valueOf(C12061a.this.m6351d()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12061a(ReactContext reactContext, Function1<? super Boolean, Unit> onAutoRotateEnabled) {
        C9612q.m13917h(reactContext, "reactContext");
        C9612q.m13917h(onAutoRotateEnabled, "onAutoRotateEnabled");
        this.f31201j = reactContext;
        this.f31202k = onAutoRotateEnabled;
        this.f31203l = Settings.System.getUriFor("accelerometer_rotation");
        this.f31204m = "accelerometer_rotation";
        onAutoRotateEnabled.invoke(Boolean.valueOf(m6351d()));
    }

    /* renamed from: c */
    private final C12062a m6352c() {
        Looper myLooper = Looper.myLooper();
        C9612q.m13920e(myLooper);
        return new C12062a(new Handler(myLooper));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final boolean m6351d() {
        return Settings.System.getInt(this.f31201j.getContentResolver(), this.f31204m, 0) == 1;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        ContentObserver contentObserver = this.f31205n;
        if (contentObserver != null) {
            this.f31201j.getContentResolver().unregisterContentObserver(contentObserver);
        }
        this.f31205n = null;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        C12062a m6352c = m6352c();
        this.f31205n = m6352c;
        if (m6352c != null) {
            this.f31201j.getContentResolver().registerContentObserver(this.f31203l, false, m6352c);
        }
        this.f31202k.invoke(Boolean.valueOf(m6351d()));
    }
}
