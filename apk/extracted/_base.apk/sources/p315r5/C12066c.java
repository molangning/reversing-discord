package p315r5;

import android.app.Activity;
import android.view.OrientationEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.github.yamill.orientation.C4351b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C9609n;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C9844q1;
import p414x2.C13677a;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B!\b\u0000\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, m14357d2 = {"Lr5/c;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "", "onHostResume", "onHostPause", "onHostDestroy", "Lcom/facebook/react/bridge/ReactContext;", "j", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "Lkotlin/Function0;", "Landroid/app/Activity;", "k", "Lkotlin/jvm/functions/Function0;", "onGetCurrentActivity", "Landroid/view/OrientationEventListener;", "l", "Landroid/view/OrientationEventListener;", "orientationEventListener", "<init>", "(Lcom/facebook/react/bridge/ReactContext;Lkotlin/jvm/functions/Function0;)V", "m", "b", "react-native-orientation_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: r5.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12066c implements LifecycleEventListener {

    /* renamed from: m */
    public static final C12068b f31212m;

    /* renamed from: n */
    private static Integer f31213n;

    /* renamed from: o */
    private static final Function2<Integer, ReactContext, Unit> f31214o;

    /* renamed from: j */
    private final ReactContext f31215j;

    /* renamed from: k */
    private final Function0<Activity> f31216k;

    /* renamed from: l */
    private OrientationEventListener f31217l;

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* renamed from: r5.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    /* synthetic */ class C12067a extends C9609n implements Function2<Integer, ReactContext, Unit> {
        C12067a(Object obj) {
            super(2, obj, C12068b.class, "tryEmitOrientationDegreesChange", "tryEmitOrientationDegreesChange(ILcom/facebook/react/bridge/ReactContext;)V", 0);
        }

        /* renamed from: e */
        public final void m6343e(int i, ReactContext p1) {
            C9612q.m13917h(p1, "p1");
            ((C12068b) this.receiver).m6338e(i, p1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, ReactContext reactContext) {
            m6343e(num.intValue(), reactContext);
            return Unit.f25302a;
        }
    }

    @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR)\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, m14357d2 = {"Lr5/c$b;", "", "", "orientationDegrees", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "", "e", "lastEmittedOrientationDegrees", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "d", "(Ljava/lang/Integer;)V", "Lkotlin/Function2;", "onOrientationDegreesChange", "Lkotlin/jvm/functions/Function2;", "c", "()Lkotlin/jvm/functions/Function2;", "<init>", "()V", "react-native-orientation_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: r5.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12068b {
        private C12068b() {
        }

        public /* synthetic */ C12068b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public final void m6338e(int i, ReactContext reactContext) {
            if (reactContext.hasActiveReactInstance()) {
                WritableMap createMap = Arguments.createMap();
                Integer m6341b = m6341b();
                if (m6341b == null || i != m6341b.intValue()) {
                    createMap.putInt("orientationDegrees", i);
                    ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDegreesDidChange", createMap);
                    m6339d(Integer.valueOf(i));
                }
            }
        }

        /* renamed from: b */
        public final Integer m6341b() {
            return C12066c.f31213n;
        }

        /* renamed from: c */
        public final Function2<Integer, ReactContext, Unit> m6340c() {
            return C12066c.f31214o;
        }

        /* renamed from: d */
        public final void m6339d(Integer num) {
            C12066c.f31213n = num;
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, m14357d2 = {"r5/c$c", "Landroid/view/OrientationEventListener;", "", "orientationDegrees", "", "onOrientationChanged", "react-native-orientation_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: r5.c$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12069c extends OrientationEventListener {

        /* renamed from: a */
        final /* synthetic */ C12066c f31218a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12069c(Activity activity, C12066c c12066c) {
            super(activity);
            this.f31218a = c12066c;
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i) {
            C12066c.f31212m.m6340c().invoke(Integer.valueOf(i), this.f31218a.f31215j);
        }
    }

    static {
        C12068b c12068b = new C12068b(null);
        f31212m = c12068b;
        f31214o = C4351b.m29959a(1000L, C9844q1.f25665j, new C12067a(c12068b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12066c(ReactContext reactContext, Function0<? extends Activity> onGetCurrentActivity) {
        C9612q.m13917h(reactContext, "reactContext");
        C9612q.m13917h(onGetCurrentActivity, "onGetCurrentActivity");
        this.f31215j = reactContext;
        this.f31216k = onGetCurrentActivity;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        Activity invoke = this.f31216k.invoke();
        if (invoke != null && this.f31217l == null) {
            C12069c c12069c = new C12069c(invoke, this);
            this.f31217l = c12069c;
            if (c12069c.canDetectOrientation()) {
                OrientationEventListener orientationEventListener = this.f31217l;
                if (orientationEventListener == null) {
                    C9612q.m13900y("orientationEventListener");
                    orientationEventListener = null;
                }
                orientationEventListener.enable();
                return;
            }
            return;
        }
        C13677a.m1854j(ReactConstants.TAG, "no activity to register receiver");
    }
}
