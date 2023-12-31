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

@Metadata(m14358d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJG\u0010\u000b\u001a\u00020\n\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, m14357d2 = {"Lcom/swmansion/gesturehandler/react/j;", "Lcom/facebook/react/uimanager/events/Event;", "Lpe/d;", "T", "handler", "", "newState", "oldState", "Lcom/swmansion/gesturehandler/react/e;", "dataExtractor", "", "c", "(Lpe/d;IILcom/swmansion/gesturehandler/react/e;)V", "onDispose", "", "getEventName", "", "canCoalesce", "", "getCoalescingKey", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "dispatch", "Lcom/facebook/react/bridge/WritableMap;", "a", "Lcom/facebook/react/bridge/WritableMap;", "extraData", "<init>", "()V", "b", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.swmansion.gesturehandler.react.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5561j extends Event<C5561j> {

    /* renamed from: b */
    public static final C5562a f15577b = new C5562a(null);

    /* renamed from: c */
    private static final Pools$SynchronizedPool<C5561j> f15578c = new Pools$SynchronizedPool<>(7);

    /* renamed from: a */
    private WritableMap f15579a;

    @Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019JE\u0010\u000b\u001a\u00020\n\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJE\u0010\u000e\u001a\u00020\r\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m14357d2 = {"Lcom/swmansion/gesturehandler/react/j$a;", "", "Lpe/d;", "T", "handler", "", "newState", "oldState", "Lcom/swmansion/gesturehandler/react/e;", "dataExtractor", "Lcom/swmansion/gesturehandler/react/j;", "b", "(Lpe/d;IILcom/swmansion/gesturehandler/react/e;)Lcom/swmansion/gesturehandler/react/j;", "Lcom/facebook/react/bridge/WritableMap;", "a", "(Lpe/d;Lcom/swmansion/gesturehandler/react/e;II)Lcom/facebook/react/bridge/WritableMap;", "Landroidx/core/util/Pools$SynchronizedPool;", "EVENTS_POOL", "Landroidx/core/util/Pools$SynchronizedPool;", "", "EVENT_NAME", "Ljava/lang/String;", "TOUCH_EVENTS_POOL_SIZE", "I", "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5562a {
        private C5562a() {
        }

        public /* synthetic */ C5562a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final <T extends C11504d<T>> WritableMap m25008a(T handler, InterfaceC5555e<T> interfaceC5555e, int i, int i2) {
            C9612q.m13917h(handler, "handler");
            WritableMap createMap = Arguments.createMap();
            if (interfaceC5555e != null) {
                C9612q.m13918g(createMap, "this");
                interfaceC5555e.mo25026a(handler, createMap);
            }
            createMap.putInt("handlerTag", handler.m7942P());
            createMap.putInt("state", i);
            createMap.putInt("oldState", i2);
            C9612q.m13918g(createMap, "createMap().apply {\n    …ldState\", oldState)\n    }");
            return createMap;
        }

        /* renamed from: b */
        public final <T extends C11504d<T>> C5561j m25007b(T handler, int i, int i2, InterfaceC5555e<T> interfaceC5555e) {
            C9612q.m13917h(handler, "handler");
            C5561j c5561j = (C5561j) C5561j.f15578c.acquire();
            if (c5561j == null) {
                c5561j = new C5561j(null);
            }
            c5561j.m25009c(handler, i, i2, interfaceC5555e);
            return c5561j;
        }
    }

    private C5561j() {
    }

    public /* synthetic */ C5561j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final <T extends C11504d<T>> void m25009c(T t, int i, int i2, InterfaceC5555e<T> interfaceC5555e) {
        View m7939S = t.m7939S();
        C9612q.m13920e(m7939S);
        super.init(m7939S.getId());
        this.f15579a = f15577b.m25008a(t, interfaceC5555e, i, i2);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        C9612q.m13917h(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(getViewTag(), "onGestureHandlerStateChange", this.f15579a);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "onGestureHandlerStateChange";
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        this.f15579a = null;
        f15578c.release(this);
    }
}
