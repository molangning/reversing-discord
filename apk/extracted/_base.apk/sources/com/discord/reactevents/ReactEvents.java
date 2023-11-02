package com.discord.reactevents;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;

@Metadata(m14358d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\u0018\u00002\u00020\u0001BA\u0012:\u0010\u0002\u001a\u001e\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u00040\u0003\"\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00060\u0004¢\u0006\u0002\u0010\bJ\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0007J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u0007J\u0016\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007J\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0017J\f\u0010\u0018\u001a\u00020\f*\u00020\u0007H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m14357d2 = {"Lcom/discord/reactevents/ReactEvents;", "", "events", "", "Lkotlin/Pair;", "", "Lkotlin/reflect/KClass;", "Lcom/discord/reactevents/ReactEvent;", "([Lkotlin/Pair;)V", "eventRegistry", "Lcom/discord/reactevents/ReactEventRegistry;", "emitEvent", "", "context", "Landroid/content/Context;", "event", "targetTag", "", "view", "Landroid/view/View;", "Lcom/facebook/react/bridge/ReactContext;", "emitModuleEvent", "exportEventConstants", "", "requireEventExporting", "react_events_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class ReactEvents {
    private final ReactEventRegistry eventRegistry;

    public ReactEvents(Pair<String, ? extends KClass<? extends ReactEvent>>... events) {
        C9612q.m13917h(events, "events");
        this.eventRegistry = new ReactEventRegistry();
        for (Pair<String, ? extends KClass<? extends ReactEvent>> pair : events) {
            this.eventRegistry.registerEvent(pair.m14351a(), pair.m14350b());
        }
    }

    private final void requireEventExporting(ReactEvent reactEvent) {
        if (this.eventRegistry.getDidExportEvents()) {
            return;
        }
        KClass m13969b = C9591f0.m13969b(reactEvent.getClass());
        throw new IllegalStateException("attempting to emit event: " + m13969b + " before exporting event constants. see usages of exportEventConstants");
    }

    public final void emitEvent(View view, ReactEvent event) {
        C9612q.m13917h(view, "view");
        C9612q.m13917h(event, "event");
        Context context = view.getContext();
        C9612q.m13918g(context, "view.context");
        emitEvent(context, event, view.getId());
    }

    public final void emitModuleEvent(Context context, ReactEvent event) {
        C9612q.m13917h(context, "context");
        C9612q.m13917h(event, "event");
        EventEmitterUtilsKt.emitReactNativeEvent(context, this.eventRegistry.getEventName(event), event.serialize());
    }

    public final Map<String, Object> exportEventConstants() {
        return this.eventRegistry.exportEventConstants();
    }

    public final void emitEvent(Context context, ReactEvent event, int i) {
        C9612q.m13917h(context, "context");
        C9612q.m13917h(event, "event");
        requireEventExporting(event);
        EventEmitterUtilsKt.emitReactNativeViewEvent(context, this.eventRegistry.getEventName(event), event.serialize(), i);
    }

    public final void emitEvent(ReactContext context, View view, ReactEvent event) {
        C9612q.m13917h(context, "context");
        C9612q.m13917h(view, "view");
        C9612q.m13917h(event, "event");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(context, view.getId());
        if (eventDispatcherForReactTag != null) {
            requireEventExporting(event);
            eventDispatcherForReactTag.dispatchEvent(new DispatchedEvent(UIManagerHelper.getSurfaceId(context), view.getId(), this.eventRegistry.getEventName(event), event));
        }
    }
}
