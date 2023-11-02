package p303qe;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB\u0019\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0013"}, m14357d2 = {"Lqe/o;", "Lcom/facebook/react/uimanager/events/Event;", "Lqe/d;", "", "getEventName", "", "getCoalescingKey", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "", "dispatch", "a", "Ljava/lang/String;", "text", "", "viewId", "<init>", "(ILjava/lang/String;)V", "b", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: qe.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11857o extends Event<C11835d> {

    /* renamed from: b */
    public static final C11858a f30851b = new C11858a(null);

    /* renamed from: a */
    private final String f30852a;

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lqe/o$a;", "", "", "EVENT_NAME", "Ljava/lang/String;", "<init>", "()V", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: qe.o$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11858a {
        private C11858a() {
        }

        public /* synthetic */ C11858a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C11857o(int i, String str) {
        super(i);
        this.f30852a = str;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        C9612q.m13917h(rctEventEmitter, "rctEventEmitter");
        WritableMap createMap = Arguments.createMap();
        createMap.putString("text", this.f30852a);
        rctEventEmitter.receiveEvent(getViewTag(), getEventName(), createMap);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topSearchButtonPress";
    }
}
