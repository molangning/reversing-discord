package com.th3rdwave.safeareacontext;

import android.content.Context;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¨\u0006\b"}, m14357d2 = {"Lcom/th3rdwave/safeareacontext/SafeAreaProvider;", "view", "Lcom/th3rdwave/safeareacontext/EdgeInsets;", "insets", "Lcom/th3rdwave/safeareacontext/Rect;", "frame", "", "b", "react-native-safe-area-context_release"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: com.th3rdwave.safeareacontext.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5670d {
    /* renamed from: b */
    public static final void m24780b(SafeAreaProvider safeAreaProvider, EdgeInsets edgeInsets, Rect rect) {
        Context context = safeAreaProvider.getContext();
        C9612q.m13919f(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        ReactContext reactContext = (ReactContext) context;
        int id2 = safeAreaProvider.getId();
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, id2);
        if (eventDispatcherForReactTag != null) {
            eventDispatcherForReactTag.dispatchEvent(new C5666a(C5682p.m24747b(reactContext), id2, edgeInsets, rect));
        }
    }
}