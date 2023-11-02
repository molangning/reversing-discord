package com.airbnb.android.react.lottie;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u001f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u0012"}, m14357d2 = {"Lcom/airbnb/android/react/lottie/j;", "Lcom/facebook/react/uimanager/events/Event;", "", "getEventName", "", "getCoalescingKey", "Lcom/facebook/react/bridge/WritableMap;", "getEventData", "", "a", "Ljava/lang/Throwable;", "error", "", "surfaceId", "viewId", "<init>", "(IILjava/lang/Throwable;)V", "b", "lottie-react-native_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.airbnb.android.react.lottie.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C2708j extends Event<C2708j> {

    /* renamed from: b */
    public static final C2709a f7236b = new C2709a(null);

    /* renamed from: a */
    private final Throwable f7237a;

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lcom/airbnb/android/react/lottie/j$a;", "", "", "EVENT_NAME", "Ljava/lang/String;", "<init>", "()V", "lottie-react-native_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.airbnb.android.react.lottie.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C2709a {
        private C2709a() {
        }

        public /* synthetic */ C2709a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2708j(int i, int i2, Throwable error) {
        super(i, i2);
        C9612q.m13917h(error, "error");
        this.f7237a = error;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("error", this.f7237a.getMessage());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topAnimationFailureEvent";
    }
}