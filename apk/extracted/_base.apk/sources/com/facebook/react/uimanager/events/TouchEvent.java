package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import androidx.core.util.Pools$SynchronizedPool;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.SoftAssertions;
import p058d5.C5743a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class TouchEvent extends Event<TouchEvent> {
    private static final Pools$SynchronizedPool<TouchEvent> EVENTS_POOL = new Pools$SynchronizedPool<>(3);
    private static final String TAG = "TouchEvent";
    private static final int TOUCH_EVENTS_POOL_SIZE = 3;
    public static final long UNSET = Long.MIN_VALUE;
    private short mCoalescingKey;
    private MotionEvent mMotionEvent;
    private TouchEventType mTouchEventType;
    private float mViewX;
    private float mViewY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.react.uimanager.events.TouchEvent$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C42181 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$uimanager$events$TouchEventType;

        static {
            int[] iArr = new int[TouchEventType.values().length];
            $SwitchMap$com$facebook$react$uimanager$events$TouchEventType = iArr;
            try {
                iArr[TouchEventType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$events$TouchEventType[TouchEventType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$events$TouchEventType[TouchEventType.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$react$uimanager$events$TouchEventType[TouchEventType.MOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private TouchEvent() {
    }

    private void init(int i, int i2, TouchEventType touchEventType, MotionEvent motionEvent, long j, float f, float f2, TouchEventCoalescingKeyHelper touchEventCoalescingKeyHelper) {
        boolean z;
        super.init(i, i2, motionEvent.getEventTime());
        short s = 0;
        if (j != Long.MIN_VALUE) {
            z = true;
        } else {
            z = false;
        }
        SoftAssertions.assertCondition(z, "Gesture start time must be initialized");
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5 && action != 6) {
                            throw new RuntimeException("Unhandled MotionEvent action: " + action);
                        }
                        touchEventCoalescingKeyHelper.incrementCoalescingKey(j);
                    } else {
                        touchEventCoalescingKeyHelper.removeCoalescingKey(j);
                    }
                } else {
                    s = touchEventCoalescingKeyHelper.getCoalescingKey(j);
                }
            } else {
                touchEventCoalescingKeyHelper.removeCoalescingKey(j);
            }
        } else {
            touchEventCoalescingKeyHelper.addCoalescingKey(j);
        }
        this.mTouchEventType = touchEventType;
        this.mMotionEvent = MotionEvent.obtain(motionEvent);
        this.mCoalescingKey = s;
        this.mViewX = f;
        this.mViewY = f2;
    }

    @Deprecated
    public static TouchEvent obtain(int i, TouchEventType touchEventType, MotionEvent motionEvent, long j, float f, float f2, TouchEventCoalescingKeyHelper touchEventCoalescingKeyHelper) {
        return obtain(-1, i, touchEventType, (MotionEvent) C5743a.m24583c(motionEvent), j, f, f2, touchEventCoalescingKeyHelper);
    }

    private boolean verifyMotionEvent() {
        if (this.mMotionEvent == null) {
            ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
            return false;
        }
        return true;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public boolean canCoalesce() {
        int i = C42181.$SwitchMap$com$facebook$react$uimanager$events$TouchEventType[((TouchEventType) C5743a.m24583c(this.mTouchEventType)).ordinal()];
        if (i != 1 && i != 2 && i != 3) {
            if (i == 4) {
                return true;
            }
            throw new RuntimeException("Unknown touch event type: " + this.mTouchEventType);
        }
        return false;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        if (verifyMotionEvent()) {
            TouchesHelper.sendTouchesLegacy(rCTEventEmitter, this);
        }
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void dispatchModern(RCTModernEventEmitter rCTModernEventEmitter) {
        if (verifyMotionEvent()) {
            rCTModernEventEmitter.receiveTouches(this);
        }
    }

    @Override // com.facebook.react.uimanager.events.Event
    public short getCoalescingKey() {
        return this.mCoalescingKey;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.events.Event
    public int getEventCategory() {
        TouchEventType touchEventType = this.mTouchEventType;
        if (touchEventType == null) {
            return 2;
        }
        int i = C42181.$SwitchMap$com$facebook$react$uimanager$events$TouchEventType[touchEventType.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                return 1;
            }
            if (i == 4) {
                return 4;
            }
            return super.getEventCategory();
        }
        return 0;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public String getEventName() {
        return TouchEventType.getJSEventName((TouchEventType) C5743a.m24583c(this.mTouchEventType));
    }

    public MotionEvent getMotionEvent() {
        C5743a.m24583c(this.mMotionEvent);
        return this.mMotionEvent;
    }

    public TouchEventType getTouchEventType() {
        return (TouchEventType) C5743a.m24583c(this.mTouchEventType);
    }

    public float getViewX() {
        return this.mViewX;
    }

    public float getViewY() {
        return this.mViewY;
    }

    @Override // com.facebook.react.uimanager.events.Event
    public void onDispose() {
        MotionEvent motionEvent = this.mMotionEvent;
        this.mMotionEvent = null;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        try {
            EVENTS_POOL.release(this);
        } catch (IllegalStateException e) {
            ReactSoftExceptionLogger.logSoftException(TAG, e);
        }
    }

    public static TouchEvent obtain(int i, int i2, TouchEventType touchEventType, MotionEvent motionEvent, long j, float f, float f2, TouchEventCoalescingKeyHelper touchEventCoalescingKeyHelper) {
        TouchEvent acquire = EVENTS_POOL.acquire();
        if (acquire == null) {
            acquire = new TouchEvent();
        }
        acquire.init(i, i2, touchEventType, (MotionEvent) C5743a.m24583c(motionEvent), j, f, f2, touchEventCoalescingKeyHelper);
        return acquire;
    }
}
