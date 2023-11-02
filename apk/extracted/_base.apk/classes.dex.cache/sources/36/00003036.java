package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import p304qf.C11889v;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b\u001a\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\b¨\u0006\f"}, m14357d2 = {"Lcom/th3rdwave/safeareacontext/EdgeInsets;", "insets", "Lcom/facebook/react/bridge/WritableMap;", "b", "", "", "", "a", "Lcom/th3rdwave/safeareacontext/Rect;", "rect", "d", "c", "react-native-safe-area-context_release"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: com.th3rdwave.safeareacontext.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5681o {
    /* renamed from: a */
    public static final Map<String, Float> m24752a(EdgeInsets insets) {
        Map<String, Float> m6751k;
        C9612q.m13917h(insets, "insets");
        m6751k = C11889v.m6751k(C11591x.m7577a(ViewProps.TOP, Float.valueOf(PixelUtil.toDIPFromPixel(insets.m24790d()))), C11591x.m7577a(ViewProps.RIGHT, Float.valueOf(PixelUtil.toDIPFromPixel(insets.m24791c()))), C11591x.m7577a(ViewProps.BOTTOM, Float.valueOf(PixelUtil.toDIPFromPixel(insets.m24793a()))), C11591x.m7577a(ViewProps.LEFT, Float.valueOf(PixelUtil.toDIPFromPixel(insets.m24792b()))));
        return m6751k;
    }

    /* renamed from: b */
    public static final WritableMap m24751b(EdgeInsets insets) {
        C9612q.m13917h(insets, "insets");
        WritableMap insetsMap = Arguments.createMap();
        insetsMap.putDouble(ViewProps.TOP, PixelUtil.toDIPFromPixel(insets.m24790d()));
        insetsMap.putDouble(ViewProps.RIGHT, PixelUtil.toDIPFromPixel(insets.m24791c()));
        insetsMap.putDouble(ViewProps.BOTTOM, PixelUtil.toDIPFromPixel(insets.m24793a()));
        insetsMap.putDouble(ViewProps.LEFT, PixelUtil.toDIPFromPixel(insets.m24792b()));
        C9612q.m13918g(insetsMap, "insetsMap");
        return insetsMap;
    }

    /* renamed from: c */
    public static final Map<String, Float> m24750c(Rect rect) {
        Map<String, Float> m6751k;
        C9612q.m13917h(rect, "rect");
        m6751k = C11889v.m6751k(C11591x.m7577a("x", Float.valueOf(PixelUtil.toDIPFromPixel(rect.m24787c()))), C11591x.m7577a("y", Float.valueOf(PixelUtil.toDIPFromPixel(rect.m24786d()))), C11591x.m7577a("width", Float.valueOf(PixelUtil.toDIPFromPixel(rect.m24788b()))), C11591x.m7577a("height", Float.valueOf(PixelUtil.toDIPFromPixel(rect.m24789a()))));
        return m6751k;
    }

    /* renamed from: d */
    public static final WritableMap m24749d(Rect rect) {
        C9612q.m13917h(rect, "rect");
        WritableMap rectMap = Arguments.createMap();
        rectMap.putDouble("x", PixelUtil.toDIPFromPixel(rect.m24787c()));
        rectMap.putDouble("y", PixelUtil.toDIPFromPixel(rect.m24786d()));
        rectMap.putDouble("width", PixelUtil.toDIPFromPixel(rect.m24788b()));
        rectMap.putDouble("height", PixelUtil.toDIPFromPixel(rect.m24789a()));
        C9612q.m13918g(rectMap, "rectMap");
        return rectMap;
    }
}