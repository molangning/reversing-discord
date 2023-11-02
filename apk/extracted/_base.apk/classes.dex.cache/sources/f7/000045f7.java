package p267oe;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.Event;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001¨\u0006\u0005"}, m14357d2 = {"Lcom/facebook/react/bridge/ReactContext;", "Lcom/facebook/react/uimanager/events/Event;", "event", "", "a", "react-native-gesture-handler_release"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: oe.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11086b {
    /* renamed from: a */
    public static final void m9188a(ReactContext reactContext, Event<?> event) {
        C9612q.m13917h(reactContext, "<this>");
        C9612q.m13917h(event, "event");
        try {
            NativeModule nativeModule = reactContext.getNativeModule(UIManagerModule.class);
            C9612q.m13920e(nativeModule);
            ((UIManagerModule) nativeModule).getEventDispatcher().dispatchEvent(event);
        } catch (NullPointerException e) {
            throw new Exception("Couldn't get an instance of UIManagerModule. Gesture Handler is unable to send an event.", e);
        }
    }
}