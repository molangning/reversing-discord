package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.C3893R;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class PointerEventHelper {
    public static final String POINTER_CANCEL = "topPointerCancel";
    public static final String POINTER_DOWN = "topPointerDown";
    public static final String POINTER_ENTER = "topPointerEnter";
    public static final String POINTER_LEAVE = "topPointerLeave";
    public static final String POINTER_MOVE = "topPointerMove";
    public static final String POINTER_OUT = "topPointerOut";
    public static final String POINTER_OVER = "topPointerOver";
    public static final String POINTER_TYPE_MOUSE = "mouse";
    public static final String POINTER_TYPE_PEN = "pen";
    public static final String POINTER_TYPE_TOUCH = "touch";
    public static final String POINTER_TYPE_UNKNOWN = "";
    public static final String POINTER_UP = "topPointerUp";
    private static final int X_FLAG_SUPPORTS_HOVER = 16777216;

    /* renamed from: com.facebook.react.uimanager.events.PointerEventHelper$1 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static /* synthetic */ class C42171 {

        /* renamed from: $SwitchMap$com$facebook$react$uimanager$events$PointerEventHelper$EVENT */
        static final /* synthetic */ int[] f10921x82302621;

        static {
            int[] iArr = new int[EVENT.values().length];
            f10921x82302621 = iArr;
            try {
                iArr[EVENT.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10921x82302621[EVENT.DOWN_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10921x82302621[EVENT.UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10921x82302621[EVENT.UP_CAPTURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10921x82302621[EVENT.CANCEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10921x82302621[EVENT.CANCEL_CAPTURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EVENT {
        CANCEL,
        CANCEL_CAPTURE,
        DOWN,
        DOWN_CAPTURE,
        ENTER,
        ENTER_CAPTURE,
        LEAVE,
        LEAVE_CAPTURE,
        MOVE,
        MOVE_CAPTURE,
        UP,
        UP_CAPTURE,
        OUT,
        OUT_CAPTURE,
        OVER,
        OVER_CAPTURE
    }

    public static int getButtonChange(String str, int i, int i2) {
        int i3 = 0;
        if (POINTER_TYPE_TOUCH.equals(str)) {
            return 0;
        }
        int i4 = i2 ^ i;
        if (i4 == 0) {
            return -1;
        }
        if (i4 != 1) {
            i3 = 2;
            if (i4 != 2) {
                if (i4 == 4) {
                    return 1;
                }
                if (i4 != 8) {
                    if (i4 != 16) {
                        return -1;
                    }
                    return 4;
                }
                return 3;
            }
        }
        return i3;
    }

    public static int getButtons(String str, String str2, int i) {
        if (isExitEvent(str)) {
            return 0;
        }
        if (POINTER_TYPE_TOUCH.equals(str2)) {
            return 1;
        }
        return i;
    }

    public static int getEventCategory(String str) {
        if (str == null) {
            return 2;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1786514288:
                if (str.equals(POINTER_ENTER)) {
                    c = 0;
                    break;
                }
                break;
            case -1780335505:
                if (str.equals(POINTER_LEAVE)) {
                    c = 1;
                    break;
                }
                break;
            case -1304584214:
                if (str.equals(POINTER_DOWN)) {
                    c = 2;
                    break;
                }
                break;
            case -1304316135:
                if (str.equals(POINTER_MOVE)) {
                    c = 3;
                    break;
                }
                break;
            case -1304250340:
                if (str.equals(POINTER_OVER)) {
                    c = 4;
                    break;
                }
                break;
            case -1065042973:
                if (str.equals(POINTER_UP)) {
                    c = 5;
                    break;
                }
                break;
            case 383186882:
                if (str.equals(POINTER_CANCEL)) {
                    c = 6;
                    break;
                }
                break;
            case 1343400710:
                if (str.equals(POINTER_OUT)) {
                    c = 7;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 3:
            case 4:
            case 7:
                return 4;
            case 2:
            case 5:
            case 6:
                return 3;
            default:
                return 2;
        }
    }

    public static double getPressure(int i, String str) {
        if (isExitEvent(str)) {
            return 0.0d;
        }
        return i != 0 ? 0.5d : 0.0d;
    }

    public static String getW3CPointerType(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "" : POINTER_TYPE_MOUSE : POINTER_TYPE_PEN : POINTER_TYPE_TOUCH;
    }

    public static boolean isBubblingEvent(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1304584214:
                if (str.equals(POINTER_DOWN)) {
                    c = 0;
                    break;
                }
                break;
            case -1304316135:
                if (str.equals(POINTER_MOVE)) {
                    c = 1;
                    break;
                }
                break;
            case -1304250340:
                if (str.equals(POINTER_OVER)) {
                    c = 2;
                    break;
                }
                break;
            case -1065042973:
                if (str.equals(POINTER_UP)) {
                    c = 3;
                    break;
                }
                break;
            case 383186882:
                if (str.equals(POINTER_CANCEL)) {
                    c = 4;
                    break;
                }
                break;
            case 1343400710:
                if (str.equals(POINTER_OUT)) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
            default:
                return false;
        }
    }

    public static boolean isExitEvent(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1780335505:
                if (str.equals(POINTER_LEAVE)) {
                    c = 0;
                    break;
                }
                break;
            case -1065042973:
                if (str.equals(POINTER_UP)) {
                    c = 1;
                    break;
                }
                break;
            case 1343400710:
                if (str.equals(POINTER_OUT)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
                return true;
            default:
                return false;
        }
    }

    public static boolean isListening(View view, EVENT event) {
        if (view == null) {
            return true;
        }
        switch (C42171.f10921x82302621[event.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                Integer num = (Integer) view.getTag(C3893R.C3895id.pointer_events);
                if (num != null && (num.intValue() & (1 << event.ordinal())) != 0) {
                    return true;
                }
                return false;
        }
    }

    public static boolean supportsHover(MotionEvent motionEvent) {
        boolean z;
        if ((motionEvent.getFlags() & X_FLAG_SUPPORTS_HOVER) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return motionEvent.isFromSource(8194);
    }
}
