package com.facebook.react.uimanager.events;

import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class BlackHoleEventDispatcher implements EventDispatcher {
    private static final EventDispatcher sEventDispatcher = new BlackHoleEventDispatcher();

    private BlackHoleEventDispatcher() {
    }

    public static EventDispatcher get() {
        return sEventDispatcher;
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void addBatchEventDispatchedListener(BatchEventDispatchedListener batchEventDispatchedListener) {
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void addListener(EventDispatcherListener eventDispatcherListener) {
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void dispatchAllEvents() {
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void dispatchEvent(Event event) {
        String simpleName = getClass().getSimpleName();
        C13677a.m1862b(simpleName, "Trying to emit event to JS, but the React instance isn't ready. Event: " + event.getEventName());
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void onCatalystInstanceDestroyed() {
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void registerEventEmitter(int i, RCTEventEmitter rCTEventEmitter) {
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void registerEventEmitter(int i, RCTModernEventEmitter rCTModernEventEmitter) {
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void removeBatchEventDispatchedListener(BatchEventDispatchedListener batchEventDispatchedListener) {
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void removeListener(EventDispatcherListener eventDispatcherListener) {
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void unregisterEventEmitter(int i) {
    }
}
