package com.facebook.react.views.view;

import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m14357d2 = {"setPointerEventsInternal", "", "Lcom/facebook/react/views/view/ReactViewGroup;", ViewProps.POINTER_EVENTS, "Lcom/facebook/react/uimanager/PointerEvents;", "animatable_underlay_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ReactViewGroupExtensionsKt {
    public static final void setPointerEventsInternal(ReactViewGroup reactViewGroup, PointerEvents pointerEvents) {
        C9612q.m13917h(reactViewGroup, "<this>");
        C9612q.m13917h(pointerEvents, "pointerEvents");
        reactViewGroup.setPointerEvents(pointerEvents);
    }
}
