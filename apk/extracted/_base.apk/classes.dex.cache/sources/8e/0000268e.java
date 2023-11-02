package com.facebook.react.uimanager;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.TouchTargetHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.events.PointerEvent;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p058d5.C5743a;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class JSPointerDispatcher {
    private static final float ONMOVE_EPSILON = 0.1f;
    private static final String TAG = "POINTER EVENTS";
    private static final int UNSET_POINTER_ID = -1;
    private Map<Integer, float[]> mLastEventCoordinatesByPointerId;
    private Map<Integer, List<TouchTargetHelper.ViewTarget>> mLastHitPathByPointerId;
    private final ViewGroup mRootViewGroup;
    private Set<Integer> mHoveringPointerIds = new HashSet();
    private int mChildHandlingNativeGesture = -1;
    private int mPrimaryPointerId = -1;
    private int mCoalescingKey = 0;
    private int mLastButtonState = 0;

    public JSPointerDispatcher(ViewGroup viewGroup) {
        this.mRootViewGroup = viewGroup;
    }

    private PointerEvent.PointerEventState createEventState(int i, MotionEvent motionEvent) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        for (int i2 = 0; i2 < motionEvent.getPointerCount(); i2++) {
            float[] fArr = new float[2];
            float y = motionEvent.getY(i2);
            float[] fArr2 = {motionEvent.getX(i2), y};
            List<TouchTargetHelper.ViewTarget> findTargetPathAndCoordinatesForTouch = TouchTargetHelper.findTargetPathAndCoordinatesForTouch(fArr2[0], y, this.mRootViewGroup, fArr);
            int pointerId = motionEvent.getPointerId(i2);
            hashMap.put(Integer.valueOf(pointerId), fArr);
            hashMap2.put(Integer.valueOf(pointerId), findTargetPathAndCoordinatesForTouch);
            hashMap3.put(Integer.valueOf(pointerId), fArr2);
        }
        return new PointerEvent.PointerEventState(this.mPrimaryPointerId, i, this.mLastButtonState, UIManagerHelper.getSurfaceId(this.mRootViewGroup), hashMap, hashMap2, hashMap3, this.mHoveringPointerIds);
    }

    private void debugPrintHitPath(List<TouchTargetHelper.ViewTarget> list) {
        StringBuilder sb2 = new StringBuilder("hitPath: ");
        Iterator<TouchTargetHelper.ViewTarget> it = list.iterator();
        while (it.hasNext()) {
            sb2.append(String.format("%d, ", Integer.valueOf(it.next().getViewId())));
        }
        C13677a.m1862b(TAG, sb2.toString());
    }

    private void dispatchCancelEvent(MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        C5743a.m24584b(this.mChildHandlingNativeGesture == -1, "Expected to not have already sent a cancel for this gesture");
        dispatchCancelEvent(createEventState(motionEvent.getPointerId(motionEvent.getActionIndex()), motionEvent), motionEvent, eventDispatcher);
    }

    private void dispatchEventForViewTargets(String str, PointerEvent.PointerEventState pointerEventState, MotionEvent motionEvent, List<TouchTargetHelper.ViewTarget> list, EventDispatcher eventDispatcher) {
        for (TouchTargetHelper.ViewTarget viewTarget : list) {
            eventDispatcher.dispatchEvent(PointerEvent.obtain(str, viewTarget.getViewId(), pointerEventState, motionEvent));
        }
    }

    private static List<TouchTargetHelper.ViewTarget> filterByShouldDispatch(List<TouchTargetHelper.ViewTarget> list, PointerEventHelper.EVENT event, PointerEventHelper.EVENT event2, boolean z) {
        ArrayList arrayList = new ArrayList(list);
        if (z) {
            return arrayList;
        }
        boolean z2 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            View view = list.get(size).getView();
            if (!z2 && !PointerEventHelper.isListening(view, event2) && !PointerEventHelper.isListening(view, event)) {
                arrayList.remove(size);
            } else if (!z2 && PointerEventHelper.isListening(view, event2)) {
                z2 = true;
            }
        }
        return arrayList;
    }

    private short getCoalescingKey() {
        return (short) (65535 & this.mCoalescingKey);
    }

    private void incrementCoalescingKey() {
        this.mCoalescingKey = (this.mCoalescingKey + 1) % ViewDefaults.NUMBER_OF_LINES;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x000a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean isAnyoneListeningForBubblingEvent(java.util.List<com.facebook.react.uimanager.TouchTargetHelper.ViewTarget> r2, com.facebook.react.uimanager.events.PointerEventHelper.EVENT r3, com.facebook.react.uimanager.events.PointerEventHelper.EVENT r4) {
        /*
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r2.next()
            com.facebook.react.uimanager.TouchTargetHelper$ViewTarget r0 = (com.facebook.react.uimanager.TouchTargetHelper.ViewTarget) r0
            android.view.View r1 = r0.getView()
            boolean r1 = com.facebook.react.uimanager.events.PointerEventHelper.isListening(r1, r3)
            if (r1 != 0) goto L24
            android.view.View r0 = r0.getView()
            boolean r0 = com.facebook.react.uimanager.events.PointerEventHelper.isListening(r0, r4)
            if (r0 == 0) goto L4
        L24:
            r2 = 1
            return r2
        L26:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.JSPointerDispatcher.isAnyoneListeningForBubblingEvent(java.util.List, com.facebook.react.uimanager.events.PointerEventHelper$EVENT, com.facebook.react.uimanager.events.PointerEventHelper$EVENT):boolean");
    }

    private void onDown(int i, PointerEvent.PointerEventState pointerEventState, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        List<TouchTargetHelper.ViewTarget> list = pointerEventState.getHitPathByPointerId().get(Integer.valueOf(pointerEventState.getActivePointerId()));
        incrementCoalescingKey();
        if (!this.mHoveringPointerIds.contains(Integer.valueOf(pointerEventState.getActivePointerId()))) {
            if (isAnyoneListeningForBubblingEvent(list, PointerEventHelper.EVENT.OVER, PointerEventHelper.EVENT.OVER_CAPTURE)) {
                eventDispatcher.dispatchEvent(PointerEvent.obtain(PointerEventHelper.POINTER_OVER, i, pointerEventState, motionEvent));
            }
            List<TouchTargetHelper.ViewTarget> filterByShouldDispatch = filterByShouldDispatch(list, PointerEventHelper.EVENT.ENTER, PointerEventHelper.EVENT.ENTER_CAPTURE, false);
            Collections.reverse(filterByShouldDispatch);
            dispatchEventForViewTargets(PointerEventHelper.POINTER_ENTER, pointerEventState, motionEvent, filterByShouldDispatch, eventDispatcher);
        }
        if (isAnyoneListeningForBubblingEvent(list, PointerEventHelper.EVENT.DOWN, PointerEventHelper.EVENT.DOWN_CAPTURE)) {
            eventDispatcher.dispatchEvent(PointerEvent.obtain(PointerEventHelper.POINTER_DOWN, i, pointerEventState, motionEvent));
        }
    }

    private void onMove(int i, PointerEvent.PointerEventState pointerEventState, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        List<TouchTargetHelper.ViewTarget> arrayList;
        boolean z;
        int activePointerId = pointerEventState.getActivePointerId();
        List<TouchTargetHelper.ViewTarget> list = pointerEventState.getHitPathByPointerId().get(Integer.valueOf(activePointerId));
        Map<Integer, List<TouchTargetHelper.ViewTarget>> map = this.mLastHitPathByPointerId;
        if (map != null && map.containsKey(Integer.valueOf(activePointerId))) {
            arrayList = this.mLastHitPathByPointerId.get(Integer.valueOf(activePointerId));
        } else {
            arrayList = new ArrayList<>();
        }
        boolean z2 = false;
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            z = true;
            if (i2 >= Math.min(list.size(), arrayList.size()) || !list.get((list.size() - 1) - i2).equals(arrayList.get((arrayList.size() - 1) - i2))) {
                break;
            }
            View view = list.get((list.size() - 1) - i2).getView();
            if (!z3 && PointerEventHelper.isListening(view, PointerEventHelper.EVENT.ENTER_CAPTURE)) {
                z3 = true;
            }
            if (!z2 && PointerEventHelper.isListening(view, PointerEventHelper.EVENT.LEAVE_CAPTURE)) {
                z2 = true;
            }
            i2++;
        }
        if (i2 >= Math.max(list.size(), arrayList.size())) {
            z = false;
        }
        if (z) {
            incrementCoalescingKey();
            if (arrayList.size() > 0) {
                int viewId = arrayList.get(0).getViewId();
                if (isAnyoneListeningForBubblingEvent(arrayList, PointerEventHelper.EVENT.OUT, PointerEventHelper.EVENT.OUT_CAPTURE)) {
                    eventDispatcher.dispatchEvent(PointerEvent.obtain(PointerEventHelper.POINTER_OUT, viewId, pointerEventState, motionEvent));
                }
                List<TouchTargetHelper.ViewTarget> filterByShouldDispatch = filterByShouldDispatch(arrayList.subList(0, arrayList.size() - i2), PointerEventHelper.EVENT.LEAVE, PointerEventHelper.EVENT.LEAVE_CAPTURE, z2);
                if (filterByShouldDispatch.size() > 0) {
                    dispatchEventForViewTargets(PointerEventHelper.POINTER_LEAVE, pointerEventState, motionEvent, filterByShouldDispatch, eventDispatcher);
                }
            }
            if (isAnyoneListeningForBubblingEvent(list, PointerEventHelper.EVENT.OVER, PointerEventHelper.EVENT.OVER_CAPTURE)) {
                eventDispatcher.dispatchEvent(PointerEvent.obtain(PointerEventHelper.POINTER_OVER, i, pointerEventState, motionEvent));
            }
            List<TouchTargetHelper.ViewTarget> filterByShouldDispatch2 = filterByShouldDispatch(list.subList(0, list.size() - i2), PointerEventHelper.EVENT.ENTER, PointerEventHelper.EVENT.ENTER_CAPTURE, z3);
            if (filterByShouldDispatch2.size() > 0) {
                Collections.reverse(filterByShouldDispatch2);
                dispatchEventForViewTargets(PointerEventHelper.POINTER_ENTER, pointerEventState, motionEvent, filterByShouldDispatch2, eventDispatcher);
            }
        }
        if (isAnyoneListeningForBubblingEvent(list, PointerEventHelper.EVENT.MOVE, PointerEventHelper.EVENT.MOVE_CAPTURE)) {
            eventDispatcher.dispatchEvent(PointerEvent.obtain(PointerEventHelper.POINTER_MOVE, i, pointerEventState, motionEvent, getCoalescingKey()));
        }
    }

    private void onUp(int i, PointerEvent.PointerEventState pointerEventState, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        int activePointerId = pointerEventState.getActivePointerId();
        List<TouchTargetHelper.ViewTarget> list = pointerEventState.getHitPathByPointerId().get(Integer.valueOf(activePointerId));
        if (isAnyoneListeningForBubblingEvent(list, PointerEventHelper.EVENT.UP, PointerEventHelper.EVENT.UP_CAPTURE)) {
            eventDispatcher.dispatchEvent(PointerEvent.obtain(PointerEventHelper.POINTER_UP, i, pointerEventState, motionEvent));
        }
        if (!this.mHoveringPointerIds.contains(Integer.valueOf(activePointerId))) {
            if (isAnyoneListeningForBubblingEvent(list, PointerEventHelper.EVENT.OUT, PointerEventHelper.EVENT.OUT_CAPTURE)) {
                eventDispatcher.dispatchEvent(PointerEvent.obtain(PointerEventHelper.POINTER_OUT, i, pointerEventState, motionEvent));
            }
            dispatchEventForViewTargets(PointerEventHelper.POINTER_LEAVE, pointerEventState, motionEvent, filterByShouldDispatch(list, PointerEventHelper.EVENT.LEAVE, PointerEventHelper.EVENT.LEAVE_CAPTURE, false), eventDispatcher);
        }
        if (motionEvent.getActionMasked() == 1) {
            this.mPrimaryPointerId = -1;
        }
        this.mHoveringPointerIds.remove(Integer.valueOf(activePointerId));
    }

    private boolean qualifiedMove(float[] fArr, float[] fArr2) {
        if (Math.abs(fArr2[0] - fArr[0]) <= ONMOVE_EPSILON && Math.abs(fArr2[1] - fArr[1]) <= ONMOVE_EPSILON) {
            return false;
        }
        return true;
    }

    public void handleMotionEvent(MotionEvent motionEvent, EventDispatcher eventDispatcher, boolean z) {
        boolean z2;
        int viewId;
        float[] fArr;
        List<TouchTargetHelper.ViewTarget> list;
        if (this.mChildHandlingNativeGesture != -1) {
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        if (actionMasked == 0) {
            this.mPrimaryPointerId = motionEvent.getPointerId(0);
        } else if (actionMasked == 7) {
            this.mHoveringPointerIds.add(Integer.valueOf(pointerId));
        }
        PointerEvent.PointerEventState createEventState = createEventState(pointerId, motionEvent);
        if (z && motionEvent.getActionMasked() == 10) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            Map<Integer, List<TouchTargetHelper.ViewTarget>> map = this.mLastHitPathByPointerId;
            if (map != null) {
                list = map.get(Integer.valueOf(createEventState.getActivePointerId()));
            } else {
                list = null;
            }
            if (list != null && !list.isEmpty()) {
                viewId = list.get(list.size() - 1).getViewId();
                createEventState.getHitPathByPointerId().put(Integer.valueOf(pointerId), new ArrayList());
            } else {
                return;
            }
        } else {
            List<TouchTargetHelper.ViewTarget> list2 = createEventState.getHitPathByPointerId().get(Integer.valueOf(pointerId));
            if (list2 != null && !list2.isEmpty()) {
                viewId = list2.get(0).getViewId();
            } else {
                return;
            }
        }
        switch (actionMasked) {
            case 0:
            case 5:
                onDown(viewId, createEventState, motionEvent, eventDispatcher);
                break;
            case 1:
            case 6:
                incrementCoalescingKey();
                onUp(viewId, createEventState, motionEvent, eventDispatcher);
                break;
            case 2:
                onMove(viewId, createEventState, motionEvent, eventDispatcher);
                break;
            case 3:
                dispatchCancelEvent(createEventState, motionEvent, eventDispatcher);
                break;
            case 4:
            case 8:
            default:
                C13677a.m1870H(ReactConstants.TAG, "Motion Event was ignored. Action=" + actionMasked + " Target=" + viewId);
                return;
            case 7:
                float[] fArr2 = createEventState.getEventCoordinatesByPointerId().get(Integer.valueOf(pointerId));
                Map<Integer, float[]> map2 = this.mLastEventCoordinatesByPointerId;
                if (map2 != null && map2.containsKey(Integer.valueOf(pointerId))) {
                    fArr = this.mLastEventCoordinatesByPointerId.get(Integer.valueOf(pointerId));
                } else {
                    fArr = new float[]{0.0f, 0.0f};
                }
                if (!qualifiedMove(fArr2, fArr)) {
                    return;
                }
                onMove(viewId, createEventState, motionEvent, eventDispatcher);
                break;
                break;
            case 9:
                return;
            case 10:
                if (z2) {
                    onMove(viewId, createEventState, motionEvent, eventDispatcher);
                    break;
                }
                break;
        }
        this.mLastHitPathByPointerId = createEventState.getHitPathByPointerId();
        this.mLastEventCoordinatesByPointerId = createEventState.getEventCoordinatesByPointerId();
        this.mLastButtonState = motionEvent.getButtonState();
        this.mHoveringPointerIds.retainAll(this.mLastEventCoordinatesByPointerId.keySet());
    }

    public void onChildEndedNativeGesture() {
        this.mChildHandlingNativeGesture = -1;
    }

    public void onChildStartedNativeGesture(View view, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        if (this.mChildHandlingNativeGesture == -1 && view != null) {
            dispatchCancelEvent(motionEvent, eventDispatcher);
            this.mChildHandlingNativeGesture = view.getId();
        }
    }

    private void dispatchCancelEvent(PointerEvent.PointerEventState pointerEventState, MotionEvent motionEvent, EventDispatcher eventDispatcher) {
        C5743a.m24584b(this.mChildHandlingNativeGesture == -1, "Expected to not have already sent a cancel for this gesture");
        int activePointerId = pointerEventState.getActivePointerId();
        List<TouchTargetHelper.ViewTarget> list = pointerEventState.getHitPathByPointerId().get(Integer.valueOf(activePointerId));
        if (list.isEmpty()) {
            return;
        }
        if (isAnyoneListeningForBubblingEvent(list, PointerEventHelper.EVENT.CANCEL, PointerEventHelper.EVENT.CANCEL_CAPTURE)) {
            ((EventDispatcher) C5743a.m24583c(eventDispatcher)).dispatchEvent(PointerEvent.obtain(PointerEventHelper.POINTER_CANCEL, list.get(0).getViewId(), pointerEventState, motionEvent));
        }
        dispatchEventForViewTargets(PointerEventHelper.POINTER_LEAVE, pointerEventState, motionEvent, filterByShouldDispatch(list, PointerEventHelper.EVENT.LEAVE, PointerEventHelper.EVENT.LEAVE_CAPTURE, false), eventDispatcher);
        incrementCoalescingKey();
        this.mHoveringPointerIds.remove(Integer.valueOf(this.mPrimaryPointerId));
        this.mHoveringPointerIds.remove(Integer.valueOf(activePointerId));
        this.mPrimaryPointerId = -1;
    }
}