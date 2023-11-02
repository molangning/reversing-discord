package com.github.yamill.orientation;

import android.annotation.SuppressLint;
import android.app.Activity;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import p304qf.C11888u;
import p315r5.C12061a;
import p315r5.C12063b;
import p315r5.C12066c;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ(\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\u000bH\u0016J\u0016\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0004H\u0007J\b\u0010\u0015\u001a\u00020\u0007H\u0007J\b\u0010\u0016\u001a\u00020\u0007H\u0007J\b\u0010\u0017\u001a\u00020\u0007H\u0007J\b\u0010\u0018\u001a\u00020\u0007H\u0007J\b\u0010\u0019\u001a\u00020\u0007H\u0007R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001b¨\u0006!"}, m14357d2 = {"Lcom/github/yamill/orientation/OrientationModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/github/yamill/orientation/OrientationModule$d;", "lockState", "", "autoRotateEnabled", "autoRotateIgnored", "", "updateOrientation", "", "orientation", "", "getOrientationString", "getName", "", "", "getConstants", "Lcom/facebook/react/bridge/Callback;", "callback", "getOrientation", "ignoreAutoRotate", "lockToPortrait", "lockToLandscape", "lockToLandscapeLeft", "lockToLandscapeRight", "unlockAllOrientations", "Lcom/github/yamill/orientation/OrientationModule$d;", "Z", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "d", "react-native-orientation_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class OrientationModule extends ReactContextBaseJavaModule {
    private boolean autoRotateEnabled;
    private boolean autoRotateIgnored;
    private EnumC4349d lockState;

    @Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "autoRotateEnabled", "", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: com.github.yamill.orientation.OrientationModule$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C4346a extends AbstractC9614s implements Function1<Boolean, Unit> {
        C4346a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.f25302a;
        }

        public final void invoke(boolean z) {
            OrientationModule.updateOrientation$default(OrientationModule.this, null, z, false, 5, null);
        }
    }

    @Metadata(m14358d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m14357d2 = {"Landroid/app/Activity;", "a", "()Landroid/app/Activity;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: com.github.yamill.orientation.OrientationModule$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C4347b extends AbstractC9614s implements Function0<Activity> {
        C4347b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Activity invoke() {
            return OrientationModule.this.getCurrentActivity();
        }
    }

    @Metadata(m14358d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m14357d2 = {"Landroid/app/Activity;", "a", "()Landroid/app/Activity;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: com.github.yamill.orientation.OrientationModule$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C4348c extends AbstractC9614s implements Function0<Activity> {
        C4348c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Activity invoke() {
            return OrientationModule.this.getCurrentActivity();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000e\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m14357d2 = {"Lcom/github/yamill/orientation/OrientationModule$d;", "", "", "j", "I", "b", "()I", "orientationInt", "<init>", "(Ljava/lang/String;II)V", "k", "l", "m", "n", "o", "p", "react-native-orientation_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.github.yamill.orientation.OrientationModule$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC4349d {
        LOCKED_PORTRAIT(1),
        LOCKED_LANDSCAPE(6),
        LOCKED_LANDSCAPE_LEFT(0),
        LOCKED_LANDSCAPE_RIGHT(8),
        UNLOCKED(4),
        UNSPECIFIED(-1);
        

        /* renamed from: j */
        private final int f11128j;

        EnumC4349d(int i) {
            this.f11128j = i;
        }

        /* renamed from: b */
        public final int m29960b() {
            return this.f11128j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrientationModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
        reactContext.addLifecycleEventListener(new C12061a(reactContext, new C4346a()));
        reactContext.addLifecycleEventListener(new C12063b(reactContext, new C4347b()));
        reactContext.addLifecycleEventListener(new C12066c(reactContext, new C4348c()));
    }

    private final String getOrientationString(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return null;
                }
                return "LANDSCAPE";
            }
            return "PORTRAIT";
        }
        return "UNKNOWN";
    }

    private final void updateOrientation(EnumC4349d enumC4349d, boolean z, boolean z2) {
        boolean z3;
        EnumC4349d enumC4349d2;
        Activity currentActivity;
        Activity currentActivity2;
        if (this.lockState == enumC4349d && this.autoRotateEnabled == z && !z2) {
            return;
        }
        this.lockState = enumC4349d;
        this.autoRotateEnabled = z;
        this.autoRotateIgnored = z2;
        if (enumC4349d == null) {
            return;
        }
        boolean z4 = false;
        if (!z && !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3 && (currentActivity2 = getCurrentActivity()) != null) {
            currentActivity2.setRequestedOrientation(enumC4349d.m29960b());
        }
        if (!z && !z2) {
            z4 = true;
        }
        if (z4 && enumC4349d != (enumC4349d2 = EnumC4349d.UNSPECIFIED) && (currentActivity = getCurrentActivity()) != null) {
            currentActivity.setRequestedOrientation(enumC4349d2.m29960b());
        }
    }

    static /* synthetic */ void updateOrientation$default(OrientationModule orientationModule, EnumC4349d enumC4349d, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC4349d = orientationModule.lockState;
        }
        if ((i & 2) != 0) {
            z = orientationModule.autoRotateEnabled;
        }
        if ((i & 4) != 0) {
            z2 = orientationModule.autoRotateIgnored;
        }
        orientationModule.updateOrientation(enumC4349d, z, z2);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        Map<String, Object> m6757e;
        m6757e = C11888u.m6757e(C11591x.m7577a("initialOrientation", getOrientationString(getReactApplicationContext().getResources().getConfiguration().orientation)));
        return m6757e;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Orientation";
    }

    @ReactMethod
    public final void getOrientation(Callback callback) {
        C9612q.m13917h(callback, "callback");
        int i = getReactApplicationContext().getResources().getConfiguration().orientation;
        String orientationString = getOrientationString(i);
        if (orientationString == null) {
            callback.invoke(Integer.valueOf(i), null);
        } else {
            callback.invoke(null, orientationString);
        }
    }

    @ReactMethod
    public final void ignoreAutoRotate(boolean z) {
        updateOrientation$default(this, null, false, z, 3, null);
    }

    @ReactMethod
    public final void lockToLandscape() {
        updateOrientation$default(this, EnumC4349d.LOCKED_LANDSCAPE, false, false, 6, null);
    }

    @ReactMethod
    public final void lockToLandscapeLeft() {
        updateOrientation$default(this, EnumC4349d.LOCKED_LANDSCAPE_LEFT, false, false, 6, null);
    }

    @ReactMethod
    public final void lockToLandscapeRight() {
        updateOrientation$default(this, EnumC4349d.LOCKED_LANDSCAPE_RIGHT, false, false, 6, null);
    }

    @ReactMethod
    @SuppressLint({"SourceLockedOrientationActivity"})
    public final void lockToPortrait() {
        updateOrientation$default(this, EnumC4349d.LOCKED_PORTRAIT, false, false, 6, null);
    }

    @ReactMethod
    public final void unlockAllOrientations() {
        updateOrientation$default(this, EnumC4349d.UNLOCKED, false, false, 6, null);
    }
}
