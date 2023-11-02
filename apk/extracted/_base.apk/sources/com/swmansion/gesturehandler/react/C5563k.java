package com.swmansion.gesturehandler.react;

import android.view.View;
import androidx.core.util.Pools$SynchronizedPool;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.TouchesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pe.C11504d;

@Metadata(m14358d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u0006\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, m14357d2 = {"Lcom/swmansion/gesturehandler/react/k;", "Lcom/facebook/react/uimanager/events/Event;", "Lpe/d;", "T", "handler", "", "c", "(Lpe/d;)V", "onDispose", "", "getEventName", "", "canCoalesce", "", "getCoalescingKey", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "dispatch", "Lcom/facebook/react/bridge/WritableMap;", "a", "Lcom/facebook/react/bridge/WritableMap;", "extraData", "b", "S", "coalescingKey", "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.swmansion.gesturehandler.react.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5563k extends Event<C5563k> {

    /* renamed from: c */
    public static final C5564a f15580c = new C5564a(null);

    /* renamed from: d */
    private static final Pools$SynchronizedPool<C5563k> f15581d = new Pools$SynchronizedPool<>(7);

    /* renamed from: a */
    private WritableMap f15582a;

    /* renamed from: b */
    private short f15583b;

    @Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u0006\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\t\u001a\u00020\b\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013¨\u0006\u001b"}, m14357d2 = {"Lcom/swmansion/gesturehandler/react/k$a;", "", "Lpe/d;", "T", "handler", "Lcom/swmansion/gesturehandler/react/k;", "b", "(Lpe/d;)Lcom/swmansion/gesturehandler/react/k;", "Lcom/facebook/react/bridge/WritableMap;", "a", "(Lpe/d;)Lcom/facebook/react/bridge/WritableMap;", "Landroidx/core/util/Pools$SynchronizedPool;", "EVENTS_POOL", "Landroidx/core/util/Pools$SynchronizedPool;", "", "EVENT_NAME", "Ljava/lang/String;", "", "EVENT_TOUCH_CANCELLED", "I", "EVENT_TOUCH_DOWN", "EVENT_TOUCH_MOVE", "EVENT_TOUCH_UP", "EVENT_UNDETERMINED", "TOUCH_EVENTS_POOL_SIZE", "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5564a {
        private C5564a() {
        }

        public /* synthetic */ C5564a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final <T extends C11504d<T>> WritableMap m25003a(T handler) {
            C9612q.m13917h(handler, "handler");
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("handlerTag", handler.m7942P());
            createMap.putInt("state", handler.m7943O());
            createMap.putInt("numberOfTouches", handler.m7940R());
            createMap.putInt("eventType", handler.m7941Q());
            WritableArray m7905r = handler.m7905r();
            if (m7905r != null) {
                createMap.putArray(TouchesHelper.CHANGED_TOUCHES_KEY, m7905r);
            }
            WritableArray m7907q = handler.m7907q();
            if (m7907q != null) {
                createMap.putArray("allTouches", m7907q);
            }
            if (handler.m7934X() && handler.m7943O() == 4) {
                createMap.putInt("state", 2);
            }
            C9612q.m13918g(createMap, "createMap().apply {\n    …TATE_BEGAN)\n      }\n    }");
            return createMap;
        }

        /* renamed from: b */
        public final <T extends C11504d<T>> C5563k m25002b(T handler) {
            C9612q.m13917h(handler, "handler");
            C5563k c5563k = (C5563k) C5563k.f15581d.acquire();
            if (c5563k == null) {
                c5563k = new C5563k(null);
            }
            c5563k.m25004c(handler);
            return c5563k;
        }
    }

    private C5563k() {
    }

    public /* synthetic */ C5563k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final <T extends C11504d<T>> void m25004c(T t) {
        View m7939S = t.m7939S();
        C9612q.m13920e(m7939S);
        super.init(m7939S.getId());
        this.f15582a = f15580c.m25003a(t);
        this.f15583b = t.m7957F();
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return true;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        C9612q.m13917h(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(getViewTag(), "onGestureHandlerEvent", this.f15582a);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return this.f15583b;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "onGestureHandlerEvent";
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        this.f15582a = null;
        f15581d.release(this);
    }
}
