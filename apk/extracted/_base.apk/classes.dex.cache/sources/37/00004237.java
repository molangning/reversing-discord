package p216le;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, m14357d2 = {"Lle/a;", "Lcom/facebook/react/uimanager/events/Event;", "Lcom/facebook/react/bridge/WritableMap;", "a", "", "getEventName", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "", "dispatch", "", "I", "mPosition", "", "b", "F", "mOffset", "viewTag", "offset", "<init>", "(IIF)V", "c", "react-native-pager-view_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: le.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10133a extends Event<C10133a> {

    /* renamed from: c */
    public static final C10134a f26436c = new C10134a(null);

    /* renamed from: a */
    private final int f26437a;

    /* renamed from: b */
    private final float f26438b;

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lle/a$a;", "", "", "EVENT_NAME", "Ljava/lang/String;", "<init>", "()V", "react-native-pager-view_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: le.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10134a {
        private C10134a() {
        }

        public /* synthetic */ C10134a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C10133a(int i, int i2, float f) {
        super(i);
        this.f26437a = i2;
        this.f26438b = (Float.isInfinite(f) || Float.isNaN(f)) ? 0.0f : 0.0f;
    }

    /* renamed from: a */
    private final WritableMap m12189a() {
        WritableMap eventData = Arguments.createMap();
        eventData.putInt(ViewProps.POSITION, this.f26437a);
        eventData.putDouble("offset", this.f26438b);
        C9612q.m13918g(eventData, "eventData");
        return eventData;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        C9612q.m13917h(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(getViewTag(), getEventName(), m12189a());
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topPageScroll";
    }
}