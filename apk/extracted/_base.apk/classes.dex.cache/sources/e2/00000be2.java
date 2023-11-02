package com.airbnb.android.react.lottie;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¨\u0006\f"}, m14357d2 = {"Lcom/airbnb/android/react/lottie/l;", "Lcom/facebook/react/uimanager/events/Event;", "", "getEventName", "Lcom/facebook/react/bridge/WritableMap;", "getEventData", "", "surfaceId", "viewId", "<init>", "(II)V", "a", "lottie-react-native_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.airbnb.android.react.lottie.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C2712l extends Event<C2712l> {

    /* renamed from: a */
    public static final C2713a f7240a = new C2713a(null);

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lcom/airbnb/android/react/lottie/l$a;", "", "", "EVENT_NAME", "Ljava/lang/String;", "<init>", "()V", "lottie-react-native_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.airbnb.android.react.lottie.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C2713a {
        private C2713a() {
        }

        public /* synthetic */ C2713a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C2712l(int i, int i2) {
        super(i, i2);
    }

    @Override // com.facebook.react.uimanager.events.Event
    protected WritableMap getEventData() {
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topAnimationLoadedEvent";
    }
}