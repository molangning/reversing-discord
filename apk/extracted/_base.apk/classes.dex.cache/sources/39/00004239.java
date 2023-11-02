package p216le;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003B\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\u0011"}, m14357d2 = {"Lle/b;", "Lcom/facebook/react/uimanager/events/Event;", "Lcom/facebook/react/bridge/WritableMap;", "a", "", "getEventName", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "", "dispatch", "Ljava/lang/String;", "mPageScrollState", "", "viewTag", "<init>", "(ILjava/lang/String;)V", "b", "react-native-pager-view_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: le.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10135b extends Event<C10135b> {

    /* renamed from: b */
    public static final C10136a f26439b = new C10136a(null);

    /* renamed from: a */
    private final String f26440a;

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lle/b$a;", "", "", "EVENT_NAME", "Ljava/lang/String;", "<init>", "()V", "react-native-pager-view_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: le.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10136a {
        private C10136a() {
        }

        public /* synthetic */ C10136a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10135b(int i, String mPageScrollState) {
        super(i);
        C9612q.m13917h(mPageScrollState, "mPageScrollState");
        this.f26440a = mPageScrollState;
    }

    /* renamed from: a */
    private final WritableMap m12188a() {
        WritableMap eventData = Arguments.createMap();
        eventData.putString("pageScrollState", this.f26440a);
        C9612q.m13918g(eventData, "eventData");
        return eventData;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        C9612q.m13917h(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(getViewTag(), getEventName(), m12188a());
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topPageScrollStateChanged";
    }
}