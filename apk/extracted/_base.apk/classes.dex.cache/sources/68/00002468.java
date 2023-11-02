package com.facebook.react.bridge;

import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p077e5.InterfaceC6107a;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactMarker {
    private static long sAppStartTime;
    private static final List<MarkerListener> sListeners = new CopyOnWriteArrayList();
    private static final List<FabricMarkerListener> sFabricMarkerListeners = new CopyOnWriteArrayList();

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface FabricMarkerListener {
        void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i, long j);
    }

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface MarkerListener {
        void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i);
    }

    @InterfaceC6107a
    public static void addFabricListener(FabricMarkerListener fabricMarkerListener) {
        List<FabricMarkerListener> list = sFabricMarkerListeners;
        if (!list.contains(fabricMarkerListener)) {
            list.add(fabricMarkerListener);
        }
    }

    @InterfaceC6107a
    public static void addListener(MarkerListener markerListener) {
        List<MarkerListener> list = sListeners;
        if (!list.contains(markerListener)) {
            list.add(markerListener);
        }
    }

    @InterfaceC6107a
    public static void clearFabricMarkerListeners() {
        sFabricMarkerListeners.clear();
    }

    @InterfaceC6107a
    public static void clearMarkerListeners() {
        sListeners.clear();
    }

    @InterfaceC6107a
    public static double getAppStartTime() {
        return sAppStartTime;
    }

    @InterfaceC6107a
    public static void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i, long j) {
        for (FabricMarkerListener fabricMarkerListener : sFabricMarkerListeners) {
            fabricMarkerListener.logFabricMarker(reactMarkerConstants, str, i, j);
        }
    }

    @InterfaceC6107a
    public static void logMarker(String str) {
        logMarker(str, (String) null);
    }

    @InterfaceC6107a
    public static void removeFabricListener(FabricMarkerListener fabricMarkerListener) {
        sFabricMarkerListeners.remove(fabricMarkerListener);
    }

    @InterfaceC6107a
    public static void removeListener(MarkerListener markerListener) {
        sListeners.remove(markerListener);
    }

    @InterfaceC6107a
    public static void setAppStartTime(long j) {
        sAppStartTime = j;
    }

    @InterfaceC6107a
    public static void logMarker(String str, int i) {
        logMarker(str, (String) null, i);
    }

    @InterfaceC6107a
    public static void logFabricMarker(ReactMarkerConstants reactMarkerConstants, String str, int i) {
        logFabricMarker(reactMarkerConstants, str, i, SystemClock.uptimeMillis());
    }

    @InterfaceC6107a
    public static void logMarker(String str, String str2) {
        logMarker(str, str2, 0);
    }

    @InterfaceC6107a
    public static void logMarker(String str, String str2, int i) {
        logMarker(ReactMarkerConstants.valueOf(str), str2, i);
    }

    @InterfaceC6107a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants) {
        logMarker(reactMarkerConstants, (String) null, 0);
    }

    @InterfaceC6107a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, int i) {
        logMarker(reactMarkerConstants, (String) null, i);
    }

    @InterfaceC6107a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, String str) {
        logMarker(reactMarkerConstants, str, 0);
    }

    @InterfaceC6107a
    public static void logMarker(ReactMarkerConstants reactMarkerConstants, String str, int i) {
        logFabricMarker(reactMarkerConstants, str, i);
        for (MarkerListener markerListener : sListeners) {
            markerListener.logMarker(reactMarkerConstants, str, i);
        }
    }
}