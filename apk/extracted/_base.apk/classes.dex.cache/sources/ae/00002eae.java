package com.reactnativecommunity.slider;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.ThemedReactContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.reactnativecommunity.slider.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5401d {
    /* renamed from: a */
    public static C5396a m25279a(ThemedReactContext themedReactContext) {
        C5396a c5396a = new C5396a(themedReactContext, null);
        c5396a.setSplitTrack(false);
        return c5396a;
    }

    /* renamed from: b */
    public static Map m25278b() {
        return MapBuilder.m30469of("topSlidingComplete", MapBuilder.m30470of("registrationName", "onRNCSliderSlidingComplete"), "topSlidingStart", MapBuilder.m30470of("registrationName", "onRNCSliderSlidingStart"));
    }

    /* renamed from: c */
    public static void m25277c(C5396a c5396a, ReadableArray readableArray) {
        ArrayList<Object> arrayList = readableArray.toArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Object> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) it.next());
        }
        c5396a.setAccessibilityIncrements(arrayList2);
    }

    /* renamed from: d */
    public static void m25276d(C5396a c5396a, String str) {
        c5396a.setAccessibilityUnits(str);
    }

    /* renamed from: e */
    public static void m25275e(C5396a c5396a, boolean z) {
        c5396a.setEnabled(!z);
    }

    /* renamed from: f */
    public static void m25274f(C5396a c5396a, boolean z) {
        if (z) {
            c5396a.setScaleX(-1.0f);
        } else {
            c5396a.setScaleX(1.0f);
        }
    }

    /* renamed from: g */
    public static void m25273g(C5396a c5396a, double d) {
        c5396a.setLowerLimit(d);
    }

    /* renamed from: h */
    public static void m25272h(C5396a c5396a, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) c5396a.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908288);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else if (Build.VERSION.SDK_INT > 28) {
            findDrawableByLayerId.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    /* renamed from: i */
    public static void m25271i(C5396a c5396a, float f) {
        c5396a.setMaxValue(f);
    }

    /* renamed from: j */
    public static void m25270j(C5396a c5396a, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) c5396a.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908301);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else if (Build.VERSION.SDK_INT > 28) {
            findDrawableByLayerId.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    /* renamed from: k */
    public static void m25269k(C5396a c5396a, float f) {
        c5396a.setMinValue(f);
    }

    /* renamed from: l */
    public static void m25268l(C5396a c5396a, float f) {
        c5396a.setStep(f);
    }

    /* renamed from: m */
    public static void m25267m(C5396a c5396a, ReadableMap readableMap) {
        String str;
        if (readableMap != null) {
            str = readableMap.getString("uri");
        } else {
            str = null;
        }
        c5396a.setThumbImage(str);
    }

    /* renamed from: n */
    public static void m25266n(C5396a c5396a, Integer num) {
        if (c5396a.getThumb() != null) {
            if (num == null) {
                c5396a.getThumb().clearColorFilter();
            } else {
                c5396a.getThumb().setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            }
        }
    }

    /* renamed from: o */
    public static void m25265o(C5396a c5396a, double d) {
        c5396a.setUpperLimit(d);
    }

    /* renamed from: p */
    public static void m25264p(C5396a c5396a, double d) {
        if (!c5396a.m25289d()) {
            c5396a.setValue(d);
            if (c5396a.isAccessibilityFocused() && Build.VERSION.SDK_INT > 29) {
                c5396a.setupAccessibility((int) d);
            }
        }
    }
}