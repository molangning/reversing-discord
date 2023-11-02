package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB'\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0016"}, m14357d2 = {"Lcom/th3rdwave/safeareacontext/a;", "Lcom/facebook/react/uimanager/events/Event;", "", "getEventName", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "", "dispatch", "Lcom/th3rdwave/safeareacontext/EdgeInsets;", "a", "Lcom/th3rdwave/safeareacontext/EdgeInsets;", "mInsets", "Lcom/th3rdwave/safeareacontext/Rect;", "b", "Lcom/th3rdwave/safeareacontext/Rect;", "mFrame", "", "surfaceId", "viewTag", "<init>", "(IILcom/th3rdwave/safeareacontext/EdgeInsets;Lcom/th3rdwave/safeareacontext/Rect;)V", "c", "react-native-safe-area-context_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.th3rdwave.safeareacontext.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5666a extends Event<C5666a> {

    /* renamed from: c */
    public static final C5667a f15834c = new C5667a(null);

    /* renamed from: a */
    private final EdgeInsets f15835a;

    /* renamed from: b */
    private final Rect f15836b;

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lcom/th3rdwave/safeareacontext/a$a;", "", "", "EVENT_NAME", "Ljava/lang/String;", "<init>", "()V", "react-native-safe-area-context_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.th3rdwave.safeareacontext.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5667a {
        private C5667a() {
        }

        public /* synthetic */ C5667a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5666a(int i, int i2, EdgeInsets mInsets, Rect mFrame) {
        super(i2);
        C9612q.m13917h(mInsets, "mInsets");
        C9612q.m13917h(mFrame, "mFrame");
        this.f15835a = mInsets;
        this.f15836b = mFrame;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        C9612q.m13917h(rctEventEmitter, "rctEventEmitter");
        WritableMap createMap = Arguments.createMap();
        createMap.putMap("insets", C5681o.m24751b(this.f15835a));
        createMap.putMap("frame", C5681o.m24749d(this.f15836b));
        rctEventEmitter.receiveEvent(getViewTag(), getEventName(), createMap);
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return "topInsetsChange";
    }
}