package com.facebook.react.views.view;

import android.graphics.Rect;
import androidx.core.view.C1365w0;
import com.balthazargronon.RCTZeroconf.ZeroconfModule;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bR\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020]J\u001c\u0010^\u001a\u00020W*\u00020[2\u0006\u0010X\u001a\u00020Y2\u0006\u0010_\u001a\u00020]H\u0002J\u001c\u0010`\u001a\u00020W*\u00020[2\u0006\u0010X\u001a\u00020Y2\u0006\u0010a\u001a\u00020]H\u0002J\u0014\u0010b\u001a\u00020W*\u00020Y2\u0006\u0010a\u001a\u00020\u0004H\u0002J\u001c\u0010c\u001a\u00020W*\u00020[2\u0006\u0010X\u001a\u00020Y2\u0006\u0010a\u001a\u00020]H\u0002J\u001c\u0010d\u001a\u00020W*\u00020[2\u0006\u0010X\u001a\u00020Y2\u0006\u0010a\u001a\u00020eH\u0002J\u001c\u0010f\u001a\u00020W*\u00020[2\u0006\u0010X\u001a\u00020Y2\u0006\u0010a\u001a\u00020\u0004H\u0002J\u001c\u0010g\u001a\u00020W*\u00020[2\u0006\u0010X\u001a\u00020Y2\u0006\u0010a\u001a\u00020\u0004H\u0002J\u001c\u0010h\u001a\u00020W*\u00020[2\u0006\u0010X\u001a\u00020Y2\u0006\u0010a\u001a\u00020]H\u0002J\u001c\u0010i\u001a\u00020W*\u00020[2\u0006\u0010X\u001a\u00020Y2\u0006\u0010a\u001a\u00020]H\u0002J\u001c\u0010j\u001a\u00020W*\u00020[2\u0006\u0010X\u001a\u00020Y2\u0006\u0010a\u001a\u00020\u0004H\u0002J\u001c\u0010k\u001a\u00020W*\u00020[2\u0006\u0010X\u001a\u00020Y2\u0006\u0010a\u001a\u00020]H\u0002J\u0014\u0010l\u001a\u00020W*\u00020Y2\u0006\u0010a\u001a\u00020]H\u0002J\u0014\u0010m\u001a\u00020W*\u00020Y2\u0006\u0010a\u001a\u00020\u0004H\u0002J\u001c\u0010n\u001a\u00020W*\u00020[2\u0006\u0010X\u001a\u00020Y2\u0006\u0010a\u001a\u00020]H\u0002J\u001c\u0010o\u001a\u00020W*\u00020[2\u0006\u0010X\u001a\u00020Y2\u0006\u0010a\u001a\u00020]H\u0002J\u001c\u0010p\u001a\u00020W*\u00020[2\u0006\u0010X\u001a\u00020Y2\u0006\u0010a\u001a\u00020\u0004H\u0002J\u0014\u0010q\u001a\u00020W*\u00020Y2\u0006\u0010a\u001a\u00020\u0004H\u0002J\u001c\u0010r\u001a\u00020W*\u00020[2\u0006\u0010X\u001a\u00020Y2\u0006\u0010a\u001a\u00020\u0004H\u0002J\u000e\u0010s\u001a\u0004\u0018\u00010t*\u00020]H\u0002J\u001c\u0010u\u001a\u00020W*\u00020[2\u0006\u0010X\u001a\u00020Y2\u0006\u0010a\u001a\u00020]H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006v"}, m14357d2 = {"Lcom/facebook/react/views/view/ReactMapBufferPropSetter;", "", "()V", "ACCESSIBILITY_ACTION_LABEL", "", "ACCESSIBILITY_ACTION_NAME", "ACCESSIBILITY_STATE_BUSY", "ACCESSIBILITY_STATE_CHECKED", "ACCESSIBILITY_STATE_DISABLED", "ACCESSIBILITY_STATE_EXPANDED", "ACCESSIBILITY_STATE_SELECTED", "CORNER_ALL", "CORNER_BOTTOM_END", "CORNER_BOTTOM_LEFT", "CORNER_BOTTOM_RIGHT", "CORNER_BOTTOM_START", "CORNER_END_END", "CORNER_END_START", "CORNER_START_END", "CORNER_START_START", "CORNER_TOP_END", "CORNER_TOP_LEFT", "CORNER_TOP_RIGHT", "CORNER_TOP_START", "EDGE_ALL", "EDGE_BLOCK", "EDGE_BLOCK_END", "EDGE_BLOCK_START", "EDGE_BOTTOM", "EDGE_END", "EDGE_LEFT", "EDGE_RIGHT", "EDGE_START", "EDGE_TOP", "NATIVE_DRAWABLE_ATTRIBUTE", "NATIVE_DRAWABLE_BORDERLESS", "NATIVE_DRAWABLE_COLOR", "NATIVE_DRAWABLE_KIND", "NATIVE_DRAWABLE_RIPPLE_RADIUS", "UNDEF_COLOR", "VP_ACCESSIBILITY_ACTIONS", "VP_ACCESSIBILITY_HINT", "VP_ACCESSIBILITY_LABEL", "VP_ACCESSIBILITY_LABELLED_BY", "VP_ACCESSIBILITY_LIVE_REGION", "VP_ACCESSIBILITY_ROLE", "VP_ACCESSIBILITY_STATE", "VP_ACCESSIBILITY_VALUE", "VP_ACCESSIBLE", "VP_BACKFACE_VISIBILITY", "VP_BG_COLOR", "VP_BORDER_COLOR", "VP_BORDER_CURVES", "VP_BORDER_RADII", "VP_BORDER_STYLE", "VP_COLLAPSABLE", "VP_ELEVATION", "VP_FG_COLOR", "VP_FOCUSABLE", "VP_HAS_TV_FOCUS", "VP_HIT_SLOP", "VP_IMPORTANT_FOR_ACCESSIBILITY", "VP_NATIVE_BACKGROUND", "VP_NATIVE_FOREGROUND", "VP_NATIVE_ID", "VP_OFFSCREEN_ALPHA_COMPOSITING", "VP_OPACITY", "VP_POINTER_ENTER", "VP_POINTER_ENTER_CAPTURE", "VP_POINTER_EVENTS", "VP_POINTER_LEAVE", "VP_POINTER_LEAVE_CAPTURE", "VP_POINTER_MOVE", "VP_POINTER_MOVE_CAPTURE", "VP_POINTER_OUT", "VP_POINTER_OUT_CAPTURE", "VP_POINTER_OVER", "VP_POINTER_OVER_CAPTURE", "VP_REMOVE_CLIPPED_SUBVIEW", "VP_RENDER_TO_HARDWARE_TEXTURE", "VP_SHADOW_COLOR", "VP_TEST_ID", "VP_TRANSFORM", "VP_ZINDEX", "YG_BORDER_WIDTH", "YG_OVERFLOW", "setProps", "", "view", "Lcom/facebook/react/views/view/ReactViewGroup;", "viewManager", "Lcom/facebook/react/views/view/ReactViewManager;", "props", "Lcom/facebook/react/common/mapbuffer/MapBuffer;", ViewProps.ACCESSIBILITY_ACTIONS, "mapBuffer", ViewProps.ACCESSIBILITY_LABELLED_BY, "value", ViewProps.ACCESSIBILITY_LIVE_REGION, ViewProps.ACCESSIBILITY_STATE, ViewProps.ACCESSIBILITY_VALUE, "", "backfaceVisibility", ViewProps.BACKGROUND_COLOR, ViewProps.BORDER_COLOR, "borderRadius", "borderStyle", ViewProps.BORDER_WIDTH, "hitSlop", ViewProps.IMPORTANT_FOR_ACCESSIBILITY, "nativeBackground", "nativeForeground", ViewProps.OVERFLOW, ViewProps.POINTER_EVENTS, ViewProps.SHADOW_COLOR, "toJsDrawableDescription", "Lcom/facebook/react/bridge/ReadableMap;", ViewProps.TRANSFORM, "ReactAndroid_release"}, m14356k = 1, m14355mv = {1, 7, 1}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ReactMapBufferPropSetter {
    private static final int ACCESSIBILITY_ACTION_LABEL = 1;
    private static final int ACCESSIBILITY_ACTION_NAME = 0;
    private static final int ACCESSIBILITY_STATE_BUSY = 0;
    private static final int ACCESSIBILITY_STATE_CHECKED = 4;
    private static final int ACCESSIBILITY_STATE_DISABLED = 1;
    private static final int ACCESSIBILITY_STATE_EXPANDED = 2;
    private static final int ACCESSIBILITY_STATE_SELECTED = 3;
    private static final int CORNER_ALL = 8;
    private static final int CORNER_BOTTOM_END = 6;
    private static final int CORNER_BOTTOM_LEFT = 3;
    private static final int CORNER_BOTTOM_RIGHT = 2;
    private static final int CORNER_BOTTOM_START = 7;
    private static final int CORNER_END_END = 9;
    private static final int CORNER_END_START = 10;
    private static final int CORNER_START_END = 11;
    private static final int CORNER_START_START = 12;
    private static final int CORNER_TOP_END = 5;
    private static final int CORNER_TOP_LEFT = 0;
    private static final int CORNER_TOP_RIGHT = 1;
    private static final int CORNER_TOP_START = 4;
    private static final int EDGE_ALL = 6;
    private static final int EDGE_BLOCK = 7;
    private static final int EDGE_BLOCK_END = 8;
    private static final int EDGE_BLOCK_START = 9;
    private static final int EDGE_BOTTOM = 3;
    private static final int EDGE_END = 5;
    private static final int EDGE_LEFT = 1;
    private static final int EDGE_RIGHT = 2;
    private static final int EDGE_START = 4;
    private static final int EDGE_TOP = 0;
    public static final ReactMapBufferPropSetter INSTANCE = new ReactMapBufferPropSetter();
    private static final int NATIVE_DRAWABLE_ATTRIBUTE = 1;
    private static final int NATIVE_DRAWABLE_BORDERLESS = 3;
    private static final int NATIVE_DRAWABLE_COLOR = 2;
    private static final int NATIVE_DRAWABLE_KIND = 0;
    private static final int NATIVE_DRAWABLE_RIPPLE_RADIUS = 4;
    private static final int UNDEF_COLOR = Integer.MAX_VALUE;
    private static final int VP_ACCESSIBILITY_ACTIONS = 0;
    private static final int VP_ACCESSIBILITY_HINT = 1;
    private static final int VP_ACCESSIBILITY_LABEL = 2;
    private static final int VP_ACCESSIBILITY_LABELLED_BY = 3;
    private static final int VP_ACCESSIBILITY_LIVE_REGION = 4;
    private static final int VP_ACCESSIBILITY_ROLE = 5;
    private static final int VP_ACCESSIBILITY_STATE = 6;
    private static final int VP_ACCESSIBILITY_VALUE = 7;
    private static final int VP_ACCESSIBLE = 8;
    private static final int VP_BACKFACE_VISIBILITY = 9;
    private static final int VP_BG_COLOR = 10;
    private static final int VP_BORDER_COLOR = 11;
    private static final int VP_BORDER_CURVES = 45;
    private static final int VP_BORDER_RADII = 12;
    private static final int VP_BORDER_STYLE = 13;
    private static final int VP_COLLAPSABLE = 14;
    private static final int VP_ELEVATION = 15;
    private static final int VP_FG_COLOR = 46;
    private static final int VP_FOCUSABLE = 16;
    private static final int VP_HAS_TV_FOCUS = 17;
    private static final int VP_HIT_SLOP = 18;
    private static final int VP_IMPORTANT_FOR_ACCESSIBILITY = 19;
    private static final int VP_NATIVE_BACKGROUND = 20;
    private static final int VP_NATIVE_FOREGROUND = 21;
    private static final int VP_NATIVE_ID = 22;
    private static final int VP_OFFSCREEN_ALPHA_COMPOSITING = 23;
    private static final int VP_OPACITY = 24;
    private static final int VP_POINTER_ENTER = 26;
    private static final int VP_POINTER_ENTER_CAPTURE = 38;
    private static final int VP_POINTER_EVENTS = 25;
    private static final int VP_POINTER_LEAVE = 27;
    private static final int VP_POINTER_LEAVE_CAPTURE = 39;
    private static final int VP_POINTER_MOVE = 28;
    private static final int VP_POINTER_MOVE_CAPTURE = 40;
    private static final int VP_POINTER_OUT = 41;
    private static final int VP_POINTER_OUT_CAPTURE = 42;
    private static final int VP_POINTER_OVER = 43;
    private static final int VP_POINTER_OVER_CAPTURE = 44;
    private static final int VP_REMOVE_CLIPPED_SUBVIEW = 29;
    private static final int VP_RENDER_TO_HARDWARE_TEXTURE = 30;
    private static final int VP_SHADOW_COLOR = 31;
    private static final int VP_TEST_ID = 32;
    private static final int VP_TRANSFORM = 33;
    private static final int VP_ZINDEX = 34;
    private static final int YG_BORDER_WIDTH = 100;
    private static final int YG_OVERFLOW = 101;

    private ReactMapBufferPropSetter() {
    }

    private final void accessibilityActions(ReactViewManager reactViewManager, ReactViewGroup reactViewGroup, MapBuffer mapBuffer) {
        ArrayList arrayList = new ArrayList();
        Iterator<MapBuffer.Entry> it = mapBuffer.iterator();
        while (it.hasNext()) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            MapBuffer mapBufferValue = it.next().getMapBufferValue();
            javaOnlyMap.putString(ZeroconfModule.KEY_SERVICE_NAME, mapBufferValue.getString(0));
            if (mapBufferValue.contains(1)) {
                javaOnlyMap.putString("label", mapBufferValue.getString(1));
            }
            arrayList.add(javaOnlyMap);
        }
        reactViewManager.setAccessibilityActions(reactViewGroup, JavaOnlyArray.from(arrayList));
    }

    private final void accessibilityLabelledBy(ReactViewManager reactViewManager, ReactViewGroup reactViewGroup, MapBuffer mapBuffer) {
        DynamicFromObject dynamicFromObject;
        if (mapBuffer.getCount() == 0) {
            dynamicFromObject = new DynamicFromObject(null);
        } else {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            Iterator<MapBuffer.Entry> it = mapBuffer.iterator();
            while (it.hasNext()) {
                javaOnlyArray.pushString(it.next().getStringValue());
            }
            dynamicFromObject = new DynamicFromObject(javaOnlyArray);
        }
        reactViewManager.setAccessibilityLabelledBy(reactViewGroup, dynamicFromObject);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0007, code lost:
        if (r4 != 2) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void accessibilityLiveRegion(com.facebook.react.views.view.ReactViewGroup r3, int r4) {
        /*
            r2 = this;
            r0 = 0
            if (r4 == 0) goto Lb
            r1 = 1
            if (r4 == r1) goto La
            r1 = 2
            if (r4 == r1) goto La
            goto Lb
        La:
            r0 = r1
        Lb:
            androidx.core.view.C1365w0.m37181s0(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.views.view.ReactMapBufferPropSetter.accessibilityLiveRegion(com.facebook.react.views.view.ReactViewGroup, int):void");
    }

    private final void accessibilityState(ReactViewManager reactViewManager, ReactViewGroup reactViewGroup, MapBuffer mapBuffer) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putBoolean("selected", mapBuffer.getBoolean(3));
        javaOnlyMap.putBoolean("busy", mapBuffer.getBoolean(0));
        javaOnlyMap.putBoolean("expanded", mapBuffer.getBoolean(2));
        javaOnlyMap.putBoolean("disabled", mapBuffer.getBoolean(1));
        int i = mapBuffer.getInt(4);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    javaOnlyMap.putString("checked", "mixed");
                }
            } else {
                javaOnlyMap.putBoolean("checked", true);
            }
        } else {
            javaOnlyMap.putBoolean("checked", false);
        }
        reactViewManager.setViewState(reactViewGroup, javaOnlyMap);
    }

    private final void accessibilityValue(ReactViewManager reactViewManager, ReactViewGroup reactViewGroup, String str) {
        boolean z;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            javaOnlyMap.putString("text", str);
        }
        reactViewManager.setAccessibilityValue(reactViewGroup, javaOnlyMap);
    }

    private final void backfaceVisibility(ReactViewManager reactViewManager, ReactViewGroup reactViewGroup, int i) {
        String str;
        if (i != 1) {
            if (i != 2) {
                str = "auto";
            } else {
                str = ViewProps.HIDDEN;
            }
        } else {
            str = ViewProps.VISIBLE;
        }
        reactViewManager.setBackfaceVisibility(reactViewGroup, str);
    }

    private final void backgroundColor(ReactViewManager reactViewManager, ReactViewGroup reactViewGroup, int i) {
        boolean z;
        Integer valueOf = Integer.valueOf(i);
        int i2 = 0;
        if (valueOf.intValue() != Integer.MAX_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            i2 = valueOf.intValue();
        }
        reactViewManager.setBackgroundColor(reactViewGroup, i2);
    }

    private final void borderColor(ReactViewManager reactViewManager, ReactViewGroup reactViewGroup, MapBuffer mapBuffer) {
        int i;
        for (MapBuffer.Entry entry : mapBuffer) {
            int key = entry.getKey();
            boolean z = false;
            switch (key) {
                case 0:
                    i = 3;
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 4;
                    break;
                case 4:
                    i = 5;
                    break;
                case 5:
                    i = 6;
                    break;
                case 6:
                    i = 0;
                    break;
                case 7:
                    i = 7;
                    break;
                case 8:
                    i = 8;
                    break;
                case 9:
                    i = 9;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown key for border color: " + key);
            }
            Integer valueOf = Integer.valueOf(entry.getIntValue());
            if (valueOf.intValue() != -1) {
                z = true;
            }
            if (!z) {
                valueOf = null;
            }
            reactViewManager.setBorderColor(reactViewGroup, i, valueOf);
        }
    }

    private final void borderRadius(ReactViewManager reactViewManager, ReactViewGroup reactViewGroup, MapBuffer mapBuffer) {
        int i;
        for (MapBuffer.Entry entry : mapBuffer) {
            int key = entry.getKey();
            switch (key) {
                case 0:
                    i = 1;
                    break;
                case 1:
                    i = 2;
                    break;
                case 2:
                    i = 3;
                    break;
                case 3:
                    i = 4;
                    break;
                case 4:
                    i = 5;
                    break;
                case 5:
                    i = 6;
                    break;
                case 6:
                    i = 8;
                    break;
                case 7:
                    i = 7;
                    break;
                case 8:
                    i = 0;
                    break;
                case 9:
                    i = 9;
                    break;
                case 10:
                    i = 10;
                    break;
                case 11:
                    i = 11;
                    break;
                case 12:
                    i = 12;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown key for border style: " + key);
            }
            double doubleValue = entry.getDoubleValue();
            if (!Double.isNaN(doubleValue)) {
                reactViewManager.setBorderRadius(reactViewGroup, i, (float) doubleValue);
            }
        }
    }

    private final void borderStyle(ReactViewManager reactViewManager, ReactViewGroup reactViewGroup, int i) {
        String str;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    str = null;
                } else {
                    str = "dashed";
                }
            } else {
                str = "dotted";
            }
        } else {
            str = "solid";
        }
        reactViewManager.setBorderStyle(reactViewGroup, str);
    }

    private final void borderWidth(ReactViewManager reactViewManager, ReactViewGroup reactViewGroup, MapBuffer mapBuffer) {
        int i;
        for (MapBuffer.Entry entry : mapBuffer) {
            int key = entry.getKey();
            switch (key) {
                case 0:
                    i = 3;
                    break;
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 4;
                    break;
                case 4:
                    i = 5;
                    break;
                case 5:
                    i = 6;
                    break;
                case 6:
                    i = 0;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown key for border width: " + key);
            }
            double doubleValue = entry.getDoubleValue();
            if (!Double.isNaN(doubleValue)) {
                reactViewManager.setBorderWidth(reactViewGroup, i, (float) doubleValue);
            }
        }
    }

    private final void hitSlop(ReactViewGroup reactViewGroup, MapBuffer mapBuffer) {
        reactViewGroup.setHitSlopRect(new Rect((int) PixelUtil.toPixelFromDIP(mapBuffer.getDouble(1)), (int) PixelUtil.toPixelFromDIP(mapBuffer.getDouble(0)), (int) PixelUtil.toPixelFromDIP(mapBuffer.getDouble(2)), (int) PixelUtil.toPixelFromDIP(mapBuffer.getDouble(3))));
    }

    private final void importantForAccessibility(ReactViewGroup reactViewGroup, int i) {
        int i2 = 0;
        if (i != 0) {
            int i3 = 1;
            if (i != 1) {
                i3 = 2;
                if (i != 2) {
                    if (i == 3) {
                        i2 = 4;
                    }
                }
            }
            i2 = i3;
        }
        C1365w0.m37259A0(reactViewGroup, i2);
    }

    private final void nativeBackground(ReactViewManager reactViewManager, ReactViewGroup reactViewGroup, MapBuffer mapBuffer) {
        reactViewManager.setNativeBackground(reactViewGroup, toJsDrawableDescription(mapBuffer));
    }

    private final void nativeForeground(ReactViewManager reactViewManager, ReactViewGroup reactViewGroup, MapBuffer mapBuffer) {
        reactViewManager.setNativeForeground(reactViewGroup, toJsDrawableDescription(mapBuffer));
    }

    private final void overflow(ReactViewManager reactViewManager, ReactViewGroup reactViewGroup, int i) {
        String str;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    str = ViewProps.SCROLL;
                } else {
                    throw new IllegalArgumentException("Unknown overflow value: " + i);
                }
            } else {
                str = ViewProps.HIDDEN;
            }
        } else {
            str = ViewProps.VISIBLE;
        }
        reactViewManager.setOverflow(reactViewGroup, str);
    }

    private final void pointerEvents(ReactViewGroup reactViewGroup, int i) {
        PointerEvents pointerEvents;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        pointerEvents = PointerEvents.BOX_ONLY;
                    } else {
                        throw new IllegalArgumentException("Unknown value for pointer events: " + i);
                    }
                } else {
                    pointerEvents = PointerEvents.BOX_NONE;
                }
            } else {
                pointerEvents = PointerEvents.NONE;
            }
        } else {
            pointerEvents = PointerEvents.AUTO;
        }
        reactViewGroup.setPointerEvents(pointerEvents);
    }

    private final void shadowColor(ReactViewManager reactViewManager, ReactViewGroup reactViewGroup, int i) {
        boolean z;
        int i2;
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() != Integer.MAX_VALUE) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            i2 = valueOf.intValue();
        } else {
            i2 = -16777216;
        }
        reactViewManager.setShadowColor(reactViewGroup, i2);
    }

    private final ReadableMap toJsDrawableDescription(MapBuffer mapBuffer) {
        if (mapBuffer.getCount() == 0) {
            return null;
        }
        int i = mapBuffer.getInt(0);
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (i != 0) {
            if (i == 1) {
                javaOnlyMap.putString("type", "RippleAndroid");
                if (mapBuffer.contains(2)) {
                    javaOnlyMap.putInt(ViewProps.COLOR, mapBuffer.getInt(2));
                }
                javaOnlyMap.putBoolean("borderless", mapBuffer.getBoolean(3));
                if (mapBuffer.contains(4)) {
                    javaOnlyMap.putDouble("rippleRadius", mapBuffer.getDouble(4));
                }
            } else {
                throw new IllegalArgumentException("Unknown native drawable: " + i);
            }
        } else {
            javaOnlyMap.putString("type", "ThemeAttrAndroid");
            javaOnlyMap.putString("attribute", mapBuffer.getString(1));
        }
        return javaOnlyMap;
    }

    private final void transform(ReactViewManager reactViewManager, ReactViewGroup reactViewGroup, MapBuffer mapBuffer) {
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        Iterator<MapBuffer.Entry> it = mapBuffer.iterator();
        while (it.hasNext()) {
            javaOnlyArray.pushDouble(it.next().getDoubleValue());
        }
        reactViewManager.setTransform(reactViewGroup, (ReadableArray) javaOnlyArray);
    }

    public final void setProps(ReactViewGroup view, ReactViewManager viewManager, MapBuffer props) {
        C9612q.m13917h(view, "view");
        C9612q.m13917h(viewManager, "viewManager");
        C9612q.m13917h(props, "props");
        for (MapBuffer.Entry entry : props) {
            int key = entry.getKey();
            if (key != 46) {
                if (key != 100) {
                    if (key != 101) {
                        String str = null;
                        boolean z = true;
                        switch (key) {
                            case 0:
                                accessibilityActions(viewManager, view, entry.getMapBufferValue());
                                continue;
                            case 1:
                                String stringValue = entry.getStringValue();
                                if (stringValue.length() <= 0) {
                                    z = false;
                                }
                                if (z) {
                                    str = stringValue;
                                }
                                viewManager.setAccessibilityHint(view, str);
                                continue;
                            case 2:
                                String stringValue2 = entry.getStringValue();
                                if (stringValue2.length() <= 0) {
                                    z = false;
                                }
                                if (z) {
                                    str = stringValue2;
                                }
                                viewManager.setAccessibilityLabel(view, str);
                                continue;
                            case 3:
                                accessibilityLabelledBy(viewManager, view, entry.getMapBufferValue());
                                continue;
                            case 4:
                                accessibilityLiveRegion(view, entry.getIntValue());
                                continue;
                            case 5:
                                String stringValue3 = entry.getStringValue();
                                if (stringValue3.length() <= 0) {
                                    z = false;
                                }
                                if (z) {
                                    str = stringValue3;
                                }
                                viewManager.setAccessibilityRole(view, str);
                                continue;
                            case 6:
                                accessibilityState(viewManager, view, entry.getMapBufferValue());
                                continue;
                            case 7:
                                accessibilityValue(viewManager, view, entry.getStringValue());
                                continue;
                            case 8:
                                viewManager.setAccessible(view, entry.getBooleanValue());
                                continue;
                            case 9:
                                backfaceVisibility(viewManager, view, entry.getIntValue());
                                continue;
                            case 10:
                                backgroundColor(viewManager, view, entry.getIntValue());
                                continue;
                            case 11:
                                borderColor(viewManager, view, entry.getMapBufferValue());
                                continue;
                            case 12:
                                borderRadius(viewManager, view, entry.getMapBufferValue());
                                continue;
                            case 13:
                                MapBuffer mapBufferValue = entry.getMapBufferValue();
                                if (mapBufferValue.contains(8)) {
                                    borderStyle(viewManager, view, (int) mapBufferValue.getDouble(8));
                                    break;
                                } else {
                                    continue;
                                }
                            default:
                                switch (key) {
                                    case 15:
                                        viewManager.setElevation(view, (float) entry.getDoubleValue());
                                        continue;
                                    case 16:
                                        viewManager.setFocusable(view, entry.getBooleanValue());
                                        continue;
                                    case 17:
                                        viewManager.setTVPreferredFocus(view, entry.getBooleanValue());
                                        continue;
                                    case 18:
                                        hitSlop(view, entry.getMapBufferValue());
                                        continue;
                                    case 19:
                                        importantForAccessibility(view, entry.getIntValue());
                                        continue;
                                    case 20:
                                        nativeBackground(viewManager, view, entry.getMapBufferValue());
                                        continue;
                                    case 21:
                                        nativeForeground(viewManager, view, entry.getMapBufferValue());
                                        continue;
                                    case 22:
                                        String stringValue4 = entry.getStringValue();
                                        if (stringValue4.length() <= 0) {
                                            z = false;
                                        }
                                        if (z) {
                                            str = stringValue4;
                                        }
                                        viewManager.setNativeId(view, str);
                                        continue;
                                    case 23:
                                        viewManager.setNeedsOffscreenAlphaCompositing(view, entry.getBooleanValue());
                                        continue;
                                    case 24:
                                        viewManager.setOpacity(view, (float) entry.getDoubleValue());
                                        continue;
                                    case 25:
                                        pointerEvents(view, entry.getIntValue());
                                        continue;
                                    case 26:
                                        viewManager.setPointerEnter(view, entry.getBooleanValue());
                                        continue;
                                    case 27:
                                        viewManager.setPointerLeave(view, entry.getBooleanValue());
                                        continue;
                                    case 28:
                                        viewManager.setPointerMove(view, entry.getBooleanValue());
                                        continue;
                                    case 29:
                                        viewManager.setRemoveClippedSubviews(view, entry.getBooleanValue());
                                        continue;
                                    case 30:
                                        viewManager.setRenderToHardwareTexture(view, entry.getBooleanValue());
                                        continue;
                                    case 31:
                                        shadowColor(viewManager, view, entry.getIntValue());
                                        continue;
                                    case 32:
                                        String stringValue5 = entry.getStringValue();
                                        if (stringValue5.length() <= 0) {
                                            z = false;
                                        }
                                        if (z) {
                                            str = stringValue5;
                                        }
                                        viewManager.setTestId(view, str);
                                        continue;
                                    case 33:
                                        transform(viewManager, view, entry.getMapBufferValue());
                                        continue;
                                    case 34:
                                        viewManager.setZIndex(view, entry.getIntValue());
                                        continue;
                                        continue;
                                    default:
                                        switch (key) {
                                            case 38:
                                                viewManager.setPointerEnterCapture(view, entry.getBooleanValue());
                                                continue;
                                            case 39:
                                                viewManager.setPointerLeaveCapture(view, entry.getBooleanValue());
                                                continue;
                                            case 40:
                                                viewManager.setPointerMoveCapture(view, entry.getBooleanValue());
                                                continue;
                                            case 41:
                                                viewManager.setPointerOut(view, entry.getBooleanValue());
                                                continue;
                                            case 42:
                                                viewManager.setPointerOutCapture(view, entry.getBooleanValue());
                                                continue;
                                            case 43:
                                                viewManager.setPointerOver(view, entry.getBooleanValue());
                                                continue;
                                            case 44:
                                                viewManager.setPointerOverCapture(view, entry.getBooleanValue());
                                                continue;
                                            default:
                                                continue;
                                        }
                                }
                        }
                    } else {
                        overflow(viewManager, view, entry.getIntValue());
                    }
                } else {
                    borderWidth(viewManager, view, entry.getMapBufferValue());
                }
            }
        }
    }
}