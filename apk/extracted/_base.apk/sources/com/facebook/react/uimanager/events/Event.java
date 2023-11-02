package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.SystemClock;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.common.ViewUtil;
import com.facebook.react.uimanager.events.Event;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class Event<T extends Event> {
    private static int sUniqueID;
    private EventAnimationDriverMatchSpec mEventAnimationDriverMatchSpec;
    private boolean mInitialized;
    private int mSurfaceId;
    private long mTimestampMs;
    private int mUIManagerType;
    private int mUniqueID;
    private int mViewTag;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface EventAnimationDriverMatchSpec {
        boolean match(int i, String str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Event() {
        int i = sUniqueID;
        sUniqueID = i + 1;
        this.mUniqueID = i;
    }

    public boolean canCoalesce() {
        return true;
    }

    public T coalesce(T t) {
        return getTimestampMs() >= t.getTimestampMs() ? this : t;
    }

    @Deprecated
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        WritableMap eventData = getEventData();
        if (eventData != null) {
            rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), eventData);
            return;
        }
        throw new IllegalViewOperationException("Event: you must return a valid, non-null value from `getEventData`, or override `dispatch` and `dispatchModern`. Event: " + getEventName());
    }

    @Deprecated
    public void dispatchModern(RCTModernEventEmitter rCTModernEventEmitter) {
        WritableMap eventData;
        if (getSurfaceId() != -1 && (eventData = getEventData()) != null) {
            rCTModernEventEmitter.receiveEvent(getSurfaceId(), getViewTag(), getEventName(), canCoalesce(), getCoalescingKey(), eventData, getEventCategory());
        } else {
            dispatch(rCTModernEventEmitter);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void dispose() {
        this.mInitialized = false;
        onDispose();
    }

    public short getCoalescingKey() {
        return (short) 0;
    }

    public EventAnimationDriverMatchSpec getEventAnimationDriverMatchSpec() {
        if (this.mEventAnimationDriverMatchSpec == null) {
            this.mEventAnimationDriverMatchSpec = new EventAnimationDriverMatchSpec() { // from class: com.facebook.react.uimanager.events.Event.1
                @Override // com.facebook.react.uimanager.events.Event.EventAnimationDriverMatchSpec
                public boolean match(int i, String str) {
                    return i == Event.this.getViewTag() && str.equals(Event.this.getEventName());
                }
            };
        }
        return this.mEventAnimationDriverMatchSpec;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getEventCategory() {
        return 2;
    }

    protected WritableMap getEventData() {
        return null;
    }

    public abstract String getEventName();

    public final int getSurfaceId() {
        return this.mSurfaceId;
    }

    public final long getTimestampMs() {
        return this.mTimestampMs;
    }

    public final int getUIManagerType() {
        return this.mUIManagerType;
    }

    public int getUniqueID() {
        return this.mUniqueID;
    }

    public final int getViewTag() {
        return this.mViewTag;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public void init(int i) {
        init(-1, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isInitialized() {
        return this.mInitialized;
    }

    public void onDispose() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void init(int i, int i2) {
        init(i, i2, SystemClock.uptimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public Event(int i) {
        int i2 = sUniqueID;
        sUniqueID = i2 + 1;
        this.mUniqueID = i2;
        init(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void init(int i, int i2, long j) {
        this.mSurfaceId = i;
        this.mViewTag = i2;
        int i3 = i == -1 ? 1 : 2;
        if (i3 == 1 && !ViewUtil.isRootTag(i2)) {
            i3 = ViewUtil.getUIManagerType(i2);
        }
        this.mUIManagerType = i3;
        this.mTimestampMs = j;
        this.mInitialized = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Event(int i, int i2) {
        int i3 = sUniqueID;
        sUniqueID = i3 + 1;
        this.mUniqueID = i3;
        init(i, i2);
    }
}
