package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.Event;
import com.facebook.soloader.SoLoader;
import com.swmansion.gesturehandler.react.C5553d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ne.InterfaceC10580a;
import p267oe.C11086b;
import p267oe.C11087c;
import p304qf.C11889v;
import pe.C11501b;
import pe.C11504d;
import pe.C11516k;
import pe.C11518l;
import pe.C11519m;
import pe.C11528p;
import pe.C11530q;
import pe.C11535t;
import pe.C11542w;
import pe.InterfaceC11526n;
import pf.C11591x;

@ReactModule(name = RNGestureHandlerModule.MODULE_NAME)
@Metadata(m14358d1 = {"\u0000¥\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f*\u0001:\b\u0007\u0018\u0000 R2\u00020\u00012\u00020\u0002:\nSTUVWXYZ[\\B\u0011\u0012\b\u0010O\u001a\u0004\u0018\u00010N¢\u0006\u0004\bP\u0010QJ\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0082 J\u0012\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J.\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002J'\u0010\u0010\u001a\u00020\u0005\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J7\u0010\u0014\u001a\u00020\u0005\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u0005\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0011J'\u0010\u0019\u001a\u00020\u0005\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u001bH\u0002J'\u0010\u001d\u001a\u00020\u0005\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00172\u0006\u0010\u0018\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001d\u0010\u001aJ\u0018\u0010\"\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0002J\b\u0010#\u001a\u00020\u001eH\u0016J0\u0010(\u001a\u00020\u0005\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&H\u0007J \u0010*\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007H\u0007J(\u0010+\u001a\u00020\u0005\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010%\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&H\u0007J\u0010\u0010,\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u0007H\u0007J\u0018\u0010/\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010.\u001a\u00020-H\u0007J\b\u00100\u001a\u00020\u0005H\u0007J\u0018\u00101\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0016J\b\u00102\u001a\u00020-H\u0007J\u0014\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020403H\u0016J\b\u00106\u001a\u00020\u0005H\u0016J\u000e\u00108\u001a\u00020\u00052\u0006\u00107\u001a\u00020\tJ\u000e\u00109\u001a\u00020\u00052\u0006\u00107\u001a\u00020\tR\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001e\u0010>\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0017\u0010A\u001a\u00020@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\t0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010L\u001a\u00020K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006]"}, m14357d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lne/a;", "", "jsiPtr", "", "decorateRuntime", "", "viewTag", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootHelper;", "findRootHelperForViewAncestor", "Lpe/d;", "T", "handler", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;", "findFactoryForHandler", "onHandlerUpdate", "(Lpe/d;)V", "newState", "oldState", "onStateChange", "(Lpe/d;II)V", "onTouchEvent", "Lcom/facebook/react/uimanager/events/Event;", "event", "sendEventForReanimated", "(Lcom/facebook/react/uimanager/events/Event;)V", "Lcom/swmansion/gesturehandler/react/d;", "sendEventForNativeAnimatedEvent", "sendEventForDirectEvent", "", "eventName", "Lcom/facebook/react/bridge/WritableMap;", "data", "sendEventForDeviceEvent", "getName", "handlerName", "handlerTag", "Lcom/facebook/react/bridge/ReadableMap;", "config", "createGestureHandler", "actionType", "attachGestureHandler", "updateGestureHandler", "dropGestureHandler", "", "blockNativeResponder", "handleSetJSResponder", "handleClearJSResponder", "setGestureHandlerState", "install", "", "", "getConstants", "onCatalystInstanceDestroy", "root", "registerRootHelper", "unregisterRootHelper", "com/swmansion/gesturehandler/react/RNGestureHandlerModule$k", "eventListener", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$k;", "", "handlerFactories", "[Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;", "Lcom/swmansion/gesturehandler/react/h;", "registry", "Lcom/swmansion/gesturehandler/react/h;", "getRegistry", "()Lcom/swmansion/gesturehandler/react/h;", "Lcom/swmansion/gesturehandler/react/f;", "interactionManager", "Lcom/swmansion/gesturehandler/react/f;", "", "roots", "Ljava/util/List;", "Loe/c;", "reanimatedEventDispatcher", "Loe/c;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Companion", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class RNGestureHandlerModule extends ReactContextBaseJavaModule implements InterfaceC10580a {
    public static final C5537a Companion = new C5537a(null);
    private static final String KEY_DIRECTION = "direction";
    private static final String KEY_ENABLED = "enabled";
    private static final String KEY_HIT_SLOP = "hitSlop";
    private static final String KEY_HIT_SLOP_BOTTOM = "bottom";
    private static final String KEY_HIT_SLOP_HEIGHT = "height";
    private static final String KEY_HIT_SLOP_HORIZONTAL = "horizontal";
    private static final String KEY_HIT_SLOP_LEFT = "left";
    private static final String KEY_HIT_SLOP_RIGHT = "right";
    private static final String KEY_HIT_SLOP_TOP = "top";
    private static final String KEY_HIT_SLOP_VERTICAL = "vertical";
    private static final String KEY_HIT_SLOP_WIDTH = "width";
    private static final String KEY_LONG_PRESS_MAX_DIST = "maxDist";
    private static final String KEY_LONG_PRESS_MIN_DURATION_MS = "minDurationMs";
    private static final String KEY_MANUAL_ACTIVATION = "manualActivation";
    private static final String KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION = "disallowInterruption";
    private static final String KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START = "shouldActivateOnStart";
    private static final String KEY_NEEDS_POINTER_DATA = "needsPointerData";
    private static final String KEY_NUMBER_OF_POINTERS = "numberOfPointers";
    private static final String KEY_PAN_ACTIVATE_AFTER_LONG_PRESS = "activateAfterLongPress";
    private static final String KEY_PAN_ACTIVE_OFFSET_X_END = "activeOffsetXEnd";
    private static final String KEY_PAN_ACTIVE_OFFSET_X_START = "activeOffsetXStart";
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_END = "activeOffsetYEnd";
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_START = "activeOffsetYStart";
    private static final String KEY_PAN_AVG_TOUCHES = "avgTouches";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_END = "failOffsetXEnd";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_START = "failOffsetXStart";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_END = "failOffsetYEnd";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_START = "failOffsetYStart";
    private static final String KEY_PAN_MAX_POINTERS = "maxPointers";
    private static final String KEY_PAN_MIN_DIST = "minDist";
    private static final String KEY_PAN_MIN_POINTERS = "minPointers";
    private static final String KEY_PAN_MIN_VELOCITY = "minVelocity";
    private static final String KEY_PAN_MIN_VELOCITY_X = "minVelocityX";
    private static final String KEY_PAN_MIN_VELOCITY_Y = "minVelocityY";
    private static final String KEY_SHOULD_CANCEL_WHEN_OUTSIDE = "shouldCancelWhenOutside";
    private static final String KEY_TAP_MAX_DELAY_MS = "maxDelayMs";
    private static final String KEY_TAP_MAX_DELTA_X = "maxDeltaX";
    private static final String KEY_TAP_MAX_DELTA_Y = "maxDeltaY";
    private static final String KEY_TAP_MAX_DIST = "maxDist";
    private static final String KEY_TAP_MAX_DURATION_MS = "maxDurationMs";
    private static final String KEY_TAP_MIN_POINTERS = "minPointers";
    private static final String KEY_TAP_NUMBER_OF_TAPS = "numberOfTaps";
    public static final String MODULE_NAME = "RNGestureHandlerModule";
    private final C5547k eventListener;
    private final AbstractC5539c<?>[] handlerFactories;
    private final C5556f interactionManager;
    private final C11087c reanimatedEventDispatcher;
    private final C5559h registry;
    private final List<RNGestureHandlerRootHelper> roots;

    @Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b/\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b5\u00106J\u001c\u0010\u0007\u001a\u00020\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0014\u0010\u0010\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0014\u0010\u0013\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\nR\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0014\u0010\u0016\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\nR\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\nR\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\nR\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\nR\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\nR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\nR\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\nR\u0014\u0010\u001e\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\nR\u0014\u0010\u001f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\nR\u0014\u0010 \u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\nR\u0014\u0010!\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\nR\u0014\u0010\"\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\nR\u0014\u0010#\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\nR\u0014\u0010$\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\nR\u0014\u0010%\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\nR\u0014\u0010&\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\nR\u0014\u0010'\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\nR\u0014\u0010(\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\nR\u0014\u0010)\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\nR\u0014\u0010*\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\nR\u0014\u0010+\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010\nR\u0014\u0010,\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010\nR\u0014\u0010-\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b-\u0010\nR\u0014\u0010.\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b.\u0010\nR\u0014\u0010/\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b/\u0010\nR\u0014\u00100\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b0\u0010\nR\u0014\u00101\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b1\u0010\nR\u0014\u00102\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b2\u0010\nR\u0014\u00103\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u0010\nR\u0014\u00104\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b4\u0010\n¨\u00067"}, m14357d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$a;", "", "Lpe/d;", "handler", "Lcom/facebook/react/bridge/ReadableMap;", "config", "", "b", "", "KEY_DIRECTION", "Ljava/lang/String;", "KEY_ENABLED", "KEY_HIT_SLOP", "KEY_HIT_SLOP_BOTTOM", "KEY_HIT_SLOP_HEIGHT", "KEY_HIT_SLOP_HORIZONTAL", "KEY_HIT_SLOP_LEFT", "KEY_HIT_SLOP_RIGHT", "KEY_HIT_SLOP_TOP", "KEY_HIT_SLOP_VERTICAL", "KEY_HIT_SLOP_WIDTH", "KEY_LONG_PRESS_MAX_DIST", "KEY_LONG_PRESS_MIN_DURATION_MS", "KEY_MANUAL_ACTIVATION", "KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION", "KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START", "KEY_NEEDS_POINTER_DATA", "KEY_NUMBER_OF_POINTERS", "KEY_PAN_ACTIVATE_AFTER_LONG_PRESS", "KEY_PAN_ACTIVE_OFFSET_X_END", "KEY_PAN_ACTIVE_OFFSET_X_START", "KEY_PAN_ACTIVE_OFFSET_Y_END", "KEY_PAN_ACTIVE_OFFSET_Y_START", "KEY_PAN_AVG_TOUCHES", "KEY_PAN_FAIL_OFFSET_RANGE_X_END", "KEY_PAN_FAIL_OFFSET_RANGE_X_START", "KEY_PAN_FAIL_OFFSET_RANGE_Y_END", "KEY_PAN_FAIL_OFFSET_RANGE_Y_START", "KEY_PAN_MAX_POINTERS", "KEY_PAN_MIN_DIST", "KEY_PAN_MIN_POINTERS", "KEY_PAN_MIN_VELOCITY", "KEY_PAN_MIN_VELOCITY_X", "KEY_PAN_MIN_VELOCITY_Y", "KEY_SHOULD_CANCEL_WHEN_OUTSIDE", "KEY_TAP_MAX_DELAY_MS", "KEY_TAP_MAX_DELTA_X", "KEY_TAP_MAX_DELTA_Y", "KEY_TAP_MAX_DIST", "KEY_TAP_MAX_DURATION_MS", "KEY_TAP_MIN_POINTERS", "KEY_TAP_NUMBER_OF_TAPS", "MODULE_NAME", "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5537a {
        private C5537a() {
        }

        public /* synthetic */ C5537a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final void m25072b(C11504d<?> c11504d, ReadableMap readableMap) {
            float f;
            float f2;
            float f3;
            if (readableMap.getType(RNGestureHandlerModule.KEY_HIT_SLOP) == ReadableType.Number) {
                float pixelFromDIP = PixelUtil.toPixelFromDIP(readableMap.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP));
                c11504d.m7901t0(pixelFromDIP, pixelFromDIP, pixelFromDIP, pixelFromDIP, Float.NaN, Float.NaN);
                return;
            }
            ReadableMap map = readableMap.getMap(RNGestureHandlerModule.KEY_HIT_SLOP);
            C9612q.m13920e(map);
            float f4 = Float.NaN;
            if (map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_HORIZONTAL)) {
                f = PixelUtil.toPixelFromDIP(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_HORIZONTAL));
            } else {
                f = Float.NaN;
            }
            float f5 = f;
            if (map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_VERTICAL)) {
                f2 = PixelUtil.toPixelFromDIP(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_VERTICAL));
            } else {
                f2 = Float.NaN;
            }
            float f6 = f2;
            if (map.hasKey("left")) {
                f = PixelUtil.toPixelFromDIP(map.getDouble("left"));
            }
            float f7 = f;
            if (map.hasKey("top")) {
                f2 = PixelUtil.toPixelFromDIP(map.getDouble("top"));
            }
            float f8 = f2;
            if (map.hasKey("right")) {
                f5 = PixelUtil.toPixelFromDIP(map.getDouble("right"));
            }
            float f9 = f5;
            if (map.hasKey("bottom")) {
                f6 = PixelUtil.toPixelFromDIP(map.getDouble("bottom"));
            }
            float f10 = f6;
            if (map.hasKey("width")) {
                f3 = PixelUtil.toPixelFromDIP(map.getDouble("width"));
            } else {
                f3 = Float.NaN;
            }
            if (map.hasKey("height")) {
                f4 = PixelUtil.toPixelFromDIP(map.getDouble("height"));
            }
            c11504d.m7901t0(f7, f8, f9, f10, f3, f4);
        }
    }

    @Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m14357d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$b;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;", "Lpe/b;", "Landroid/content/Context;", "context", "g", "handler", "Lcom/facebook/react/bridge/ReadableMap;", "config", "", "f", "Lcom/facebook/react/bridge/WritableMap;", "eventData", "h", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", ZeroconfModule.KEY_SERVICE_NAME, "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C5538b extends AbstractC5539c<C11501b> {

        /* renamed from: a */
        private final Class<C11501b> f15539a = C11501b.class;

        /* renamed from: b */
        private final String f15540b = "FlingGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c
        /* renamed from: d */
        public String mo25052d() {
            return this.f15540b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c
        /* renamed from: e */
        public Class<C11501b> mo25051e() {
            return this.f15539a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c
        /* renamed from: f */
        public void mo25054b(C11501b handler, ReadableMap config) {
            C9612q.m13917h(handler, "handler");
            C9612q.m13917h(config, "config");
            super.mo25054b(handler, config);
            if (config.hasKey(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS)) {
                handler.m7968O0(config.getInt(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_DIRECTION)) {
                handler.m7969N0(config.getInt(RNGestureHandlerModule.KEY_DIRECTION));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c
        /* renamed from: g */
        public C11501b mo25053c(Context context) {
            return new C11501b();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c, com.swmansion.gesturehandler.react.InterfaceC5555e
        /* renamed from: h */
        public void mo25026a(C11501b handler, WritableMap eventData) {
            C9612q.m13917h(handler, "handler");
            C9612q.m13917h(eventData, "eventData");
            super.mo25026a(handler, eventData);
            eventData.putDouble("x", PixelUtil.toDIPFromPixel(handler.m7951I()));
            eventData.putDouble("y", PixelUtil.toDIPFromPixel(handler.m7949J()));
            eventData.putDouble("absoluteX", PixelUtil.toDIPFromPixel(handler.m7955G()));
            eventData.putDouble("absoluteY", PixelUtil.toDIPFromPixel(handler.m7953H()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(m14358d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\"\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u0006\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m14357d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;", "Lpe/d;", "T", "Lcom/swmansion/gesturehandler/react/e;", "Landroid/content/Context;", "context", "c", "(Landroid/content/Context;)Lpe/d;", "handler", "Lcom/facebook/react/bridge/ReadableMap;", "config", "", "b", "(Lpe/d;Lcom/facebook/react/bridge/ReadableMap;)V", "Lcom/facebook/react/bridge/WritableMap;", "eventData", "a", "(Lpe/d;Lcom/facebook/react/bridge/WritableMap;)V", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "d", "()Ljava/lang/String;", ZeroconfModule.KEY_SERVICE_NAME, "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class AbstractC5539c<T extends C11504d<T>> implements InterfaceC5555e<T> {
        @Override // com.swmansion.gesturehandler.react.InterfaceC5555e
        /* renamed from: a */
        public void mo25026a(T handler, WritableMap eventData) {
            C9612q.m13917h(handler, "handler");
            C9612q.m13917h(eventData, "eventData");
            eventData.putDouble(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS, handler.m7946L());
        }

        /* renamed from: b */
        public void mo25054b(T handler, ReadableMap config) {
            C9612q.m13917h(handler, "handler");
            C9612q.m13917h(config, "config");
            handler.mo7711k0();
            if (config.hasKey(RNGestureHandlerModule.KEY_SHOULD_CANCEL_WHEN_OUTSIDE)) {
                handler.m7892y0(config.getBoolean(RNGestureHandlerModule.KEY_SHOULD_CANCEL_WHEN_OUTSIDE));
            }
            if (config.hasKey("enabled")) {
                handler.m7904r0(config.getBoolean("enabled"));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP)) {
                RNGestureHandlerModule.Companion.m25072b(handler, config);
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_NEEDS_POINTER_DATA)) {
                handler.m7896w0(config.getBoolean(RNGestureHandlerModule.KEY_NEEDS_POINTER_DATA));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_MANUAL_ACTIVATION)) {
                handler.m7898v0(config.getBoolean(RNGestureHandlerModule.KEY_MANUAL_ACTIVATION));
            }
        }

        /* renamed from: c */
        public abstract T mo25053c(Context context);

        /* renamed from: d */
        public abstract String mo25052d();

        /* renamed from: e */
        public abstract Class<T> mo25051e();
    }

    @Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m14357d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$d;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;", "Lpe/k;", "Landroid/content/Context;", "context", "g", "handler", "Lcom/facebook/react/bridge/ReadableMap;", "config", "", "f", "Lcom/facebook/react/bridge/WritableMap;", "eventData", "h", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", ZeroconfModule.KEY_SERVICE_NAME, "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C5540d extends AbstractC5539c<C11516k> {

        /* renamed from: a */
        private final Class<C11516k> f15541a = C11516k.class;

        /* renamed from: b */
        private final String f15542b = "LongPressGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c
        /* renamed from: d */
        public String mo25052d() {
            return this.f15542b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c
        /* renamed from: e */
        public Class<C11516k> mo25051e() {
            return this.f15541a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c
        /* renamed from: f */
        public void mo25054b(C11516k handler, ReadableMap config) {
            C9612q.m13917h(handler, "handler");
            C9612q.m13917h(config, "config");
            super.mo25054b(handler, config);
            if (config.hasKey(RNGestureHandlerModule.KEY_LONG_PRESS_MIN_DURATION_MS)) {
                handler.m7822O0(config.getInt(RNGestureHandlerModule.KEY_LONG_PRESS_MIN_DURATION_MS));
            }
            if (config.hasKey("maxDist")) {
                handler.m7823N0(PixelUtil.toPixelFromDIP(config.getDouble("maxDist")));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c
        /* renamed from: g */
        public C11516k mo25053c(Context context) {
            C9612q.m13920e(context);
            return new C11516k(context);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c, com.swmansion.gesturehandler.react.InterfaceC5555e
        /* renamed from: h */
        public void mo25026a(C11516k handler, WritableMap eventData) {
            C9612q.m13917h(handler, "handler");
            C9612q.m13917h(eventData, "eventData");
            super.mo25026a(handler, eventData);
            eventData.putDouble("x", PixelUtil.toDIPFromPixel(handler.m7951I()));
            eventData.putDouble("y", PixelUtil.toDIPFromPixel(handler.m7949J()));
            eventData.putDouble("absoluteX", PixelUtil.toDIPFromPixel(handler.m7955G()));
            eventData.putDouble("absoluteY", PixelUtil.toDIPFromPixel(handler.m7953H()));
            eventData.putInt("duration", handler.m7825L0());
        }
    }

    @Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0011\u001a\u00020\f8\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m14357d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$e;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;", "Lpe/l;", "Landroid/content/Context;", "context", "f", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", ZeroconfModule.KEY_SERVICE_NAME, "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C5541e extends AbstractC5539c<C11518l> {

        /* renamed from: a */
        private final Class<C11518l> f15543a = C11518l.class;

        /* renamed from: b */
        private final String f15544b = "ManualGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c
        /* renamed from: d */
        public String mo25052d() {
            return this.f15544b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c
        /* renamed from: e */
        public Class<C11518l> mo25051e() {
            return this.f15543a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c
        /* renamed from: f */
        public C11518l mo25053c(Context context) {
            return new C11518l();
        }
    }

    @Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m14357d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$f;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;", "Lpe/m;", "Landroid/content/Context;", "context", "g", "handler", "Lcom/facebook/react/bridge/ReadableMap;", "config", "", "f", "Lcom/facebook/react/bridge/WritableMap;", "eventData", "h", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", ZeroconfModule.KEY_SERVICE_NAME, "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C5542f extends AbstractC5539c<C11519m> {

        /* renamed from: a */
        private final Class<C11519m> f15545a = C11519m.class;

        /* renamed from: b */
        private final String f15546b = "NativeViewGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c
        /* renamed from: d */
        public String mo25052d() {
            return this.f15546b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c
        /* renamed from: e */
        public Class<C11519m> mo25051e() {
            return this.f15545a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c
        /* renamed from: f */
        public void mo25054b(C11519m handler, ReadableMap config) {
            C9612q.m13917h(handler, "handler");
            C9612q.m13917h(config, "config");
            super.mo25054b(handler, config);
            if (config.hasKey(RNGestureHandlerModule.KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START)) {
                handler.m7814M0(config.getBoolean(RNGestureHandlerModule.KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION)) {
                handler.m7815L0(config.getBoolean(RNGestureHandlerModule.KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c
        /* renamed from: g */
        public C11519m mo25053c(Context context) {
            return new C11519m();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c, com.swmansion.gesturehandler.react.InterfaceC5555e
        /* renamed from: h */
        public void mo25026a(C11519m handler, WritableMap eventData) {
            C9612q.m13917h(handler, "handler");
            C9612q.m13917h(eventData, "eventData");
            super.mo25026a(handler, eventData);
            eventData.putBoolean("pointerInside", handler.m7932Z());
        }
    }

    @Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m14357d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$g;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;", "Lpe/p;", "Landroid/content/Context;", "context", "g", "handler", "Lcom/facebook/react/bridge/ReadableMap;", "config", "", "f", "Lcom/facebook/react/bridge/WritableMap;", "eventData", "h", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", ZeroconfModule.KEY_SERVICE_NAME, "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C5543g extends AbstractC5539c<C11528p> {

        /* renamed from: a */
        private final Class<C11528p> f15547a = C11528p.class;

        /* renamed from: b */
        private final String f15548b = "PanGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c
        /* renamed from: d */
        public String mo25052d() {
            return this.f15548b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c
        /* renamed from: e */
        public Class<C11528p> mo25051e() {
            return this.f15547a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c
        /* renamed from: f */
        public void mo25054b(C11528p handler, ReadableMap config) {
            boolean z;
            C9612q.m13917h(handler, "handler");
            C9612q.m13917h(config, "config");
            super.mo25054b(handler, config);
            boolean z2 = true;
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_START)) {
                handler.m7787S0(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_START)));
                z = true;
            } else {
                z = false;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_END)) {
                handler.m7788R0(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_END)));
                z = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_START)) {
                handler.m7782X0(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_START)));
                z = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_END)) {
                handler.m7783W0(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_END)));
                z = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_START)) {
                handler.m7785U0(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_START)));
                z = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_END)) {
                handler.m7786T0(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_END)));
                z = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_START)) {
                handler.m7780Z0(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_START)));
                z = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_END)) {
                handler.m7781Y0(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_END)));
                z = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY)) {
                handler.m7776d1(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY)));
                z = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_X)) {
                handler.m7775e1(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_X)));
                z = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_Y)) {
                handler.m7774f1(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_Y)));
            } else {
                z2 = z;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_DIST)) {
                handler.m7778b1(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_DIST)));
            } else if (z2) {
                handler.m7778b1(Float.MAX_VALUE);
            }
            if (config.hasKey("minPointers")) {
                handler.m7777c1(config.getInt("minPointers"));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_MAX_POINTERS)) {
                handler.m7779a1(config.getInt(RNGestureHandlerModule.KEY_PAN_MAX_POINTERS));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_AVG_TOUCHES)) {
                handler.m7784V0(config.getBoolean(RNGestureHandlerModule.KEY_PAN_AVG_TOUCHES));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVATE_AFTER_LONG_PRESS)) {
                handler.m7789Q0(config.getInt(RNGestureHandlerModule.KEY_PAN_ACTIVATE_AFTER_LONG_PRESS));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c
        /* renamed from: g */
        public C11528p mo25053c(Context context) {
            return new C11528p(context);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c, com.swmansion.gesturehandler.react.InterfaceC5555e
        /* renamed from: h */
        public void mo25026a(C11528p handler, WritableMap eventData) {
            C9612q.m13917h(handler, "handler");
            C9612q.m13917h(eventData, "eventData");
            super.mo25026a(handler, eventData);
            eventData.putDouble("x", PixelUtil.toDIPFromPixel(handler.m7951I()));
            eventData.putDouble("y", PixelUtil.toDIPFromPixel(handler.m7949J()));
            eventData.putDouble("absoluteX", PixelUtil.toDIPFromPixel(handler.m7955G()));
            eventData.putDouble("absoluteY", PixelUtil.toDIPFromPixel(handler.m7953H()));
            eventData.putDouble("translationX", PixelUtil.toDIPFromPixel(handler.m7793M0()));
            eventData.putDouble("translationY", PixelUtil.toDIPFromPixel(handler.m7792N0()));
            eventData.putDouble("velocityX", PixelUtil.toDIPFromPixel(handler.m7791O0()));
            eventData.putDouble("velocityY", PixelUtil.toDIPFromPixel(handler.m7790P0()));
        }
    }

    @Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m14357d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$h;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;", "Lpe/q;", "Landroid/content/Context;", "context", "f", "handler", "Lcom/facebook/react/bridge/WritableMap;", "eventData", "", "g", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", ZeroconfModule.KEY_SERVICE_NAME, "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C5544h extends AbstractC5539c<C11530q> {

        /* renamed from: a */
        private final Class<C11530q> f15549a = C11530q.class;

        /* renamed from: b */
        private final String f15550b = "PinchGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c
        /* renamed from: d */
        public String mo25052d() {
            return this.f15550b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c
        /* renamed from: e */
        public Class<C11530q> mo25051e() {
            return this.f15549a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c
        /* renamed from: f */
        public C11530q mo25053c(Context context) {
            return new C11530q();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c, com.swmansion.gesturehandler.react.InterfaceC5555e
        /* renamed from: g */
        public void mo25026a(C11530q handler, WritableMap eventData) {
            C9612q.m13917h(handler, "handler");
            C9612q.m13917h(eventData, "eventData");
            super.mo25026a(handler, eventData);
            eventData.putDouble("scale", handler.m7762R0());
            eventData.putDouble("focalX", PixelUtil.toDIPFromPixel(handler.m7764P0()));
            eventData.putDouble("focalY", PixelUtil.toDIPFromPixel(handler.m7763Q0()));
            eventData.putDouble("velocity", handler.m7761S0());
        }
    }

    @Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m14357d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$i;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;", "Lpe/t;", "Landroid/content/Context;", "context", "f", "handler", "Lcom/facebook/react/bridge/WritableMap;", "eventData", "", "g", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", ZeroconfModule.KEY_SERVICE_NAME, "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C5545i extends AbstractC5539c<C11535t> {

        /* renamed from: a */
        private final Class<C11535t> f15551a = C11535t.class;

        /* renamed from: b */
        private final String f15552b = "RotationGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c
        /* renamed from: d */
        public String mo25052d() {
            return this.f15552b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c
        /* renamed from: e */
        public Class<C11535t> mo25051e() {
            return this.f15551a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c
        /* renamed from: f */
        public C11535t mo25053c(Context context) {
            return new C11535t();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c, com.swmansion.gesturehandler.react.InterfaceC5555e
        /* renamed from: g */
        public void mo25026a(C11535t handler, WritableMap eventData) {
            C9612q.m13917h(handler, "handler");
            C9612q.m13917h(eventData, "eventData");
            super.mo25026a(handler, eventData);
            eventData.putDouble(ViewProps.ROTATION, handler.m7748O0());
            eventData.putDouble("anchorX", PixelUtil.toDIPFromPixel(handler.m7750M0()));
            eventData.putDouble("anchorY", PixelUtil.toDIPFromPixel(handler.m7749N0()));
            eventData.putDouble("velocity", handler.m7747P0());
        }
    }

    @Metadata(m14358d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, m14357d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$j;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;", "Lpe/w;", "Landroid/content/Context;", "context", "g", "handler", "Lcom/facebook/react/bridge/ReadableMap;", "config", "", "f", "Lcom/facebook/react/bridge/WritableMap;", "eventData", "h", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "e", "()Ljava/lang/Class;", "type", "", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", ZeroconfModule.KEY_SERVICE_NAME, "<init>", "()V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C5546j extends AbstractC5539c<C11542w> {

        /* renamed from: a */
        private final Class<C11542w> f15553a = C11542w.class;

        /* renamed from: b */
        private final String f15554b = "TapGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c
        /* renamed from: d */
        public String mo25052d() {
            return this.f15554b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c
        /* renamed from: e */
        public Class<C11542w> mo25051e() {
            return this.f15553a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c
        /* renamed from: f */
        public void mo25054b(C11542w handler, ReadableMap config) {
            C9612q.m13917h(handler, "handler");
            C9612q.m13917h(config, "config");
            super.mo25054b(handler, config);
            if (config.hasKey(RNGestureHandlerModule.KEY_TAP_NUMBER_OF_TAPS)) {
                handler.m7718T0(config.getInt(RNGestureHandlerModule.KEY_TAP_NUMBER_OF_TAPS));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DURATION_MS)) {
                handler.m7722P0(config.getInt(RNGestureHandlerModule.KEY_TAP_MAX_DURATION_MS));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELAY_MS)) {
                handler.m7724N0(config.getInt(RNGestureHandlerModule.KEY_TAP_MAX_DELAY_MS));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_X)) {
                handler.m7721Q0(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_X)));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_Y)) {
                handler.m7720R0(PixelUtil.toPixelFromDIP(config.getDouble(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_Y)));
            }
            if (config.hasKey("maxDist")) {
                handler.m7723O0(PixelUtil.toPixelFromDIP(config.getDouble("maxDist")));
            }
            if (config.hasKey("minPointers")) {
                handler.m7719S0(config.getInt("minPointers"));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c
        /* renamed from: g */
        public C11542w mo25053c(Context context) {
            return new C11542w();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.AbstractC5539c, com.swmansion.gesturehandler.react.InterfaceC5555e
        /* renamed from: h */
        public void mo25026a(C11542w handler, WritableMap eventData) {
            C9612q.m13917h(handler, "handler");
            C9612q.m13917h(eventData, "eventData");
            super.mo25026a(handler, eventData);
            eventData.putDouble("x", PixelUtil.toDIPFromPixel(handler.m7951I()));
            eventData.putDouble("y", PixelUtil.toDIPFromPixel(handler.m7949J()));
            eventData.putDouble("absoluteX", PixelUtil.toDIPFromPixel(handler.m7955G()));
            eventData.putDouble("absoluteY", PixelUtil.toDIPFromPixel(handler.m7953H()));
        }
    }

    @Metadata(m14358d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J/\u0010\b\u001a\u00020\u0007\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ7\u0010\r\u001a\u00020\u0007\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\u0007\"\u000e\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m14357d2 = {"com/swmansion/gesturehandler/react/RNGestureHandlerModule$k", "Lpe/n;", "Lpe/d;", "T", "handler", "Landroid/view/MotionEvent;", "event", "", "b", "(Lpe/d;Landroid/view/MotionEvent;)V", "", "newState", "oldState", "a", "(Lpe/d;II)V", "c", "(Lpe/d;)V", "react-native-gesture-handler_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerModule$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5547k implements InterfaceC11526n {
        C5547k() {
        }

        @Override // pe.InterfaceC11526n
        /* renamed from: a */
        public <T extends C11504d<T>> void mo7798a(T handler, int i, int i2) {
            C9612q.m13917h(handler, "handler");
            RNGestureHandlerModule.this.onStateChange(handler, i, i2);
        }

        @Override // pe.InterfaceC11526n
        /* renamed from: b */
        public <T extends C11504d<T>> void mo7797b(T handler, MotionEvent event) {
            C9612q.m13917h(handler, "handler");
            C9612q.m13917h(event, "event");
            RNGestureHandlerModule.this.onHandlerUpdate(handler);
        }

        @Override // pe.InterfaceC11526n
        /* renamed from: c */
        public <T extends C11504d<T>> void mo7796c(T handler) {
            C9612q.m13917h(handler, "handler");
            RNGestureHandlerModule.this.onTouchEvent(handler);
        }
    }

    public RNGestureHandlerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.eventListener = new C5547k();
        this.handlerFactories = new AbstractC5539c[]{new C5542f(), new C5546j(), new C5540d(), new C5543g(), new C5544h(), new C5545i(), new C5538b(), new C5541e()};
        this.registry = new C5559h();
        this.interactionManager = new C5556f();
        this.roots = new ArrayList();
        this.reanimatedEventDispatcher = new C11087c();
    }

    private final native void decorateRuntime(long j);

    private final <T extends C11504d<T>> AbstractC5539c<T> findFactoryForHandler(C11504d<T> c11504d) {
        for (AbstractC5539c<?> abstractC5539c : this.handlerFactories) {
            AbstractC5539c<T> abstractC5539c2 = (AbstractC5539c<T>) abstractC5539c;
            if (C9612q.m13922c(abstractC5539c2.mo25051e(), c11504d.getClass())) {
                return abstractC5539c2;
            }
        }
        return null;
    }

    private final RNGestureHandlerRootHelper findRootHelperForViewAncestor(int i) {
        RNGestureHandlerRootHelper rNGestureHandlerRootHelper;
        boolean z;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        int resolveRootTagFromReactTag = C5550a.m25033b(reactApplicationContext).resolveRootTagFromReactTag(i);
        Object obj = null;
        if (resolveRootTagFromReactTag < 1) {
            return null;
        }
        synchronized (this.roots) {
            Iterator<T> it = this.roots.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                RNGestureHandlerRootHelper rNGestureHandlerRootHelper2 = (RNGestureHandlerRootHelper) next;
                if ((rNGestureHandlerRootHelper2.m25044d() instanceof ReactRootView) && ((ReactRootView) rNGestureHandlerRootHelper2.m25044d()).getRootViewTag() == resolveRootTagFromReactTag) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    obj = next;
                    break;
                }
            }
            rNGestureHandlerRootHelper = (RNGestureHandlerRootHelper) obj;
        }
        return rNGestureHandlerRootHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends C11504d<T>> void onHandlerUpdate(T t) {
        if (t.m7942P() >= 0 && t.m7943O() == 4) {
            AbstractC5539c<T> findFactoryForHandler = findFactoryForHandler(t);
            if (t.m7961D() == 1) {
                sendEventForReanimated(C5553d.C5554a.m25027c(C5553d.f15564d, t, findFactoryForHandler, false, 4, null));
            } else if (t.m7961D() == 2) {
                sendEventForNativeAnimatedEvent(C5553d.f15564d.m25028b(t, findFactoryForHandler, true));
            } else if (t.m7961D() == 3) {
                sendEventForDirectEvent(C5553d.C5554a.m25027c(C5553d.f15564d, t, findFactoryForHandler, false, 4, null));
            } else if (t.m7961D() == 4) {
                sendEventForDeviceEvent("onGestureHandlerEvent", C5553d.f15564d.m25029a(t, findFactoryForHandler));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends C11504d<T>> void onStateChange(T t, int i, int i2) {
        if (t.m7942P() < 0) {
            return;
        }
        AbstractC5539c<T> findFactoryForHandler = findFactoryForHandler(t);
        if (t.m7961D() == 1) {
            sendEventForReanimated(C5561j.f15577b.m25007b(t, i, i2, findFactoryForHandler));
        } else if (t.m7961D() != 2 && t.m7961D() != 3) {
            if (t.m7961D() == 4) {
                sendEventForDeviceEvent("onGestureHandlerStateChange", C5561j.f15577b.m25008a(t, findFactoryForHandler, i, i2));
            }
        } else {
            sendEventForDirectEvent(C5561j.f15577b.m25007b(t, i, i2, findFactoryForHandler));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends C11504d<T>> void onTouchEvent(T t) {
        if (t.m7942P() < 0) {
            return;
        }
        if (t.m7943O() == 2 || t.m7943O() == 4 || t.m7943O() == 0 || t.m7939S() != null) {
            if (t.m7961D() == 1) {
                sendEventForReanimated(C5563k.f15580c.m25002b(t));
            } else if (t.m7961D() == 4) {
                sendEventForDeviceEvent("onGestureHandlerEvent", C5563k.f15580c.m25003a(t));
            }
        }
    }

    private final void sendEventForDeviceEvent(String str, WritableMap writableMap) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        C5550a.m25034a(reactApplicationContext).emit(str, writableMap);
    }

    private final <T extends Event<T>> void sendEventForDirectEvent(T t) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        C11086b.m9188a(reactApplicationContext, t);
    }

    private final void sendEventForNativeAnimatedEvent(C5553d c5553d) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        C11086b.m9188a(reactApplicationContext, c5553d);
    }

    private final <T extends Event<T>> void sendEventForReanimated(T t) {
        sendEventForDirectEvent(t);
    }

    @ReactMethod
    public final void attachGestureHandler(int i, int i2, int i3) {
        if (this.registry.m25020c(i, i2, i3)) {
            return;
        }
        throw new JSApplicationIllegalArgumentException("Handler with tag " + i + " does not exists");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [pe.d] */
    @ReactMethod
    public final <T extends C11504d<T>> void createGestureHandler(String handlerName, int i, ReadableMap config) {
        AbstractC5539c<?>[] abstractC5539cArr;
        C9612q.m13917h(handlerName, "handlerName");
        C9612q.m13917h(config, "config");
        for (AbstractC5539c<?> abstractC5539c : this.handlerFactories) {
            if (C9612q.m13922c(abstractC5539c.mo25052d(), handlerName)) {
                ?? mo25053c = abstractC5539c.mo25053c(getReactApplicationContext());
                mo25053c.m7964A0(i);
                mo25053c.m7894x0(this.eventListener);
                this.registry.m25013j(mo25053c);
                this.interactionManager.m25025e(mo25053c, config);
                abstractC5539c.mo25054b(mo25053c, config);
                return;
            }
        }
        throw new JSApplicationIllegalArgumentException("Invalid handler name " + handlerName);
    }

    @ReactMethod
    public final void dropGestureHandler(int i) {
        this.interactionManager.m25023g(i);
        this.registry.m25016g(i);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        Map m6751k;
        Map m6751k2;
        Map<String, Object> m6751k3;
        m6751k = C11889v.m6751k(C11591x.m7577a("UNDETERMINED", 0), C11591x.m7577a("BEGAN", 2), C11591x.m7577a("ACTIVE", 4), C11591x.m7577a("CANCELLED", 3), C11591x.m7577a("FAILED", 1), C11591x.m7577a("END", 5));
        m6751k2 = C11889v.m6751k(C11591x.m7577a("RIGHT", 1), C11591x.m7577a("LEFT", 2), C11591x.m7577a("UP", 4), C11591x.m7577a("DOWN", 8));
        m6751k3 = C11889v.m6751k(C11591x.m7577a("State", m6751k), C11591x.m7577a("Direction", m6751k2));
        return m6751k3;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public final C5559h getRegistry() {
        return this.registry;
    }

    @ReactMethod
    public final void handleClearJSResponder() {
    }

    @ReactMethod
    public final void handleSetJSResponder(int i, boolean z) {
        RNGestureHandlerRootHelper findRootHelperForViewAncestor = findRootHelperForViewAncestor(i);
        if (findRootHelperForViewAncestor != null) {
            findRootHelperForViewAncestor.m25043e(i, z);
        }
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final boolean install() {
        try {
            SoLoader.m30164r("gesturehandler");
            decorateRuntime(getReactApplicationContext().getJavaScriptContextHolder().get());
            return true;
        } catch (Exception unused) {
            Log.w("[RNGestureHandler]", "Could not install JSI bindings.");
            return false;
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.registry.m25017f();
        this.interactionManager.m25022h();
        synchronized (this.roots) {
            while (!this.roots.isEmpty()) {
                int size = this.roots.size();
                this.roots.get(0).m25040h();
                if (this.roots.size() >= size) {
                    throw new IllegalStateException("Expected root helper to get unregistered while tearing down");
                }
            }
            Unit unit = Unit.f25302a;
        }
        super.onCatalystInstanceDestroy();
    }

    public final void registerRootHelper(RNGestureHandlerRootHelper root) {
        C9612q.m13917h(root, "root");
        synchronized (this.roots) {
            if (!this.roots.contains(root)) {
                this.roots.add(root);
            } else {
                throw new IllegalStateException("Root helper" + root + " already registered");
            }
        }
    }

    @Override // ne.InterfaceC10580a
    public void setGestureHandlerState(int i, int i2) {
        C11504d<?> m25015h = this.registry.m25015h(i);
        if (m25015h != null) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                m25015h.m7891z();
                                return;
                            }
                            return;
                        }
                        m25015h.mo7712j(true);
                        return;
                    }
                    m25015h.m7911o();
                    return;
                }
                m25015h.m7913n();
                return;
            }
            m25015h.m7963B();
        }
    }

    public final void unregisterRootHelper(RNGestureHandlerRootHelper root) {
        C9612q.m13917h(root, "root");
        synchronized (this.roots) {
            this.roots.remove(root);
        }
    }

    @ReactMethod
    public final <T extends C11504d<T>> void updateGestureHandler(int i, ReadableMap config) {
        AbstractC5539c<T> findFactoryForHandler;
        C9612q.m13917h(config, "config");
        C11504d<?> m25015h = this.registry.m25015h(i);
        if (m25015h != null && (findFactoryForHandler = findFactoryForHandler(m25015h)) != null) {
            this.interactionManager.m25023g(i);
            this.interactionManager.m25025e(m25015h, config);
            findFactoryForHandler.mo25054b(m25015h, config);
        }
    }
}
