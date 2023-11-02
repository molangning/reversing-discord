package com.swmansion.gesturehandler.react;

import android.view.View;
import androidx.core.util.Pools$SynchronizedPool;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pe.C11504d;

@Metadata(m14358d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ?\u0010\n\u001a\u00020\t\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001c¨\u0006!"}, m14357d2 = {"Lcom/swmansion/gesturehandler/react/d;", "Lcom/facebook/react/uimanager/events/Event;", "Lpe/d;", "T", "handler", "Lcom/swmansion/gesturehandler/react/e;", "dataExtractor", "", "useNativeAnimatedName", "", "c", "(Lpe/d;Lcom/swmansion/gesturehandler/react/e;Z)V", "onDispose", "", "getEventName", "canCoalesce", "", "getCoalescingKey", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "dispatch", "Lcom/facebook/react/bridge/WritableMap;", "a", "Lcom/facebook/react/bridge/WritableMap;", "extraData", "b", "S", "coalescingKey", "Z", "useTopPrefixedName", "<init>", "()V", "d", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.swmansion.gesturehandler.react.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5553d extends Event<C5553d> {

    /* renamed from: d */
    public static final C5554a f15564d = new C5554a(null);

    /* renamed from: e */
    private static final Pools$SynchronizedPool<C5553d> f15565e = new Pools$SynchronizedPool<>(7);

    /* renamed from: a */
    private WritableMap f15566a;

    /* renamed from: b */
    private short f15567b;

    /* renamed from: c */
    private boolean f15568c;

    @Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ?\u0010\n\u001a\u00020\t\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\r\u001a\u00020\f\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, m14357d2 = {"Lcom/swmansion/gesturehandler/react/d$a;", "", "Lpe/d;", "T", "handler", "Lcom/swmansion/gesturehandler/react/e;", "dataExtractor", "", "useTopPrefixedName", "Lcom/swmansion/gesturehandler/react/d;", "b", "(Lpe/d;Lcom/swmansion/gesturehandler/react/e;Z)Lcom/swmansion/gesturehandler/react/d;", "Lcom/facebook/react/bridge/WritableMap;", "a", "(Lpe/d;Lcom/swmansion/gesturehandler/react/e;)Lcom/facebook/react/bridge/WritableMap;", "Landroidx/core/util/Pools$SynchronizedPool;", "EVENTS_POOL", "Landroidx/core/util/Pools$SynchronizedPool;", "", "EVENT_NAME", "Ljava/lang/String;", "NATIVE_ANIMATED_EVENT_NAME", "", "TOUCH_EVENTS_POOL_SIZE", "I", "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5554a {
        private C5554a() {
        }

        public /* synthetic */ C5554a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public static /* synthetic */ C5553d m25027c(C5554a c5554a, C11504d c11504d, InterfaceC5555e interfaceC5555e, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            return c5554a.m25028b(c11504d, interfaceC5555e, z);
        }

        /* renamed from: a */
        public final <T extends C11504d<T>> WritableMap m25029a(T handler, InterfaceC5555e<T> interfaceC5555e) {
            C9612q.m13917h(handler, "handler");
            WritableMap createMap = Arguments.createMap();
            if (interfaceC5555e != null) {
                C9612q.m13918g(createMap, "this");
                interfaceC5555e.mo25026a(handler, createMap);
            }
            createMap.putInt("handlerTag", handler.m7942P());
            createMap.putInt("state", handler.m7943O());
            C9612q.m13918g(createMap, "createMap().apply {\n    …te\", handler.state)\n    }");
            return createMap;
        }

        /* renamed from: b */
        public final <T extends C11504d<T>> C5553d m25028b(T handler, InterfaceC5555e<T> interfaceC5555e, boolean z) {
            C9612q.m13917h(handler, "handler");
            C5553d c5553d = (C5553d) C5553d.f15565e.acquire();
            if (c5553d == null) {
                c5553d = new C5553d(null);
            }
            c5553d.m25030c(handler, interfaceC5555e, z);
            return c5553d;
        }
    }

    private C5553d() {
    }

    public /* synthetic */ C5553d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: c */
    public final <T extends C11504d<T>> void m25030c(T t, InterfaceC5555e<T> interfaceC5555e, boolean z) {
        View m7939S = t.m7939S();
        C9612q.m13920e(m7939S);
        super.init(m7939S.getId());
        this.f15566a = f15564d.m25029a(t, interfaceC5555e);
        this.f15567b = t.m7957F();
        this.f15568c = z;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return true;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        C9612q.m13917h(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(getViewTag(), "onGestureHandlerEvent", this.f15566a);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return this.f15567b;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return this.f15568c ? "topGestureHandlerEvent" : "onGestureHandlerEvent";
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        this.f15566a = null;
        f15565e.release(this);
    }
}