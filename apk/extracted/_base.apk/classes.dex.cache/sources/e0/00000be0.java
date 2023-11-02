package com.airbnb.android.react.lottie;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u001f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0012"}, m14357d2 = {"Lcom/airbnb/android/react/lottie/k;", "Lcom/facebook/react/uimanager/events/Event;", "", "getEventName", "", "getCoalescingKey", "Lcom/facebook/react/bridge/WritableMap;", "getEventData", "", "a", "Z", "isCancelled", "", "surfaceId", "viewId", "<init>", "(IIZ)V", "b", "lottie-react-native_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.airbnb.android.react.lottie.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C2710k extends Event<C2710k> {

    /* renamed from: b */
    public static final C2711a f7238b = new C2711a(null);

    /* renamed from: a */
    private final boolean f7239a;

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lcom/airbnb/android/react/lottie/k$a;", "", "", "EVENT_NAME", "Ljava/lang/String;", "<init>", "()V", "lottie-react-native_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.airbnb.android.react.lottie.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C2711a {
        private C2711a() {
        }

        public /* synthetic */ C2711a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C2710k(int i, int i2, boolean z) {
        super(i, i2);
        this.f7239a = z;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("isCancelled", this.f7239a);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topAnimationFinish";
    }
}