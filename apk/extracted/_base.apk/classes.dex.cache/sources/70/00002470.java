package com.facebook.react.bridge;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p077e5.InterfaceC6107a;
import p414x2.C13677a;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactSoftExceptionLogger {
    private static final List<ReactSoftExceptionListener> sListeners = new CopyOnWriteArrayList();

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface ReactSoftExceptionListener {
        void logSoftException(String str, Throwable th2);
    }

    @InterfaceC6107a
    public static void addListener(ReactSoftExceptionListener reactSoftExceptionListener) {
        List<ReactSoftExceptionListener> list = sListeners;
        if (!list.contains(reactSoftExceptionListener)) {
            list.add(reactSoftExceptionListener);
        }
    }

    @InterfaceC6107a
    public static void clearListeners() {
        sListeners.clear();
    }

    @InterfaceC6107a
    private static void logNoThrowSoftExceptionWithMessage(String str, String str2) {
        logSoftException(str, new ReactNoCrashSoftException(str2));
    }

    @InterfaceC6107a
    public static void logSoftException(String str, Throwable th2) {
        List<ReactSoftExceptionListener> list = sListeners;
        if (list.size() > 0) {
            for (ReactSoftExceptionListener reactSoftExceptionListener : list) {
                reactSoftExceptionListener.logSoftException(str, th2);
            }
            return;
        }
        C13677a.m1853k(str, "Unhandled SoftException", th2);
    }

    @InterfaceC6107a
    public static void logSoftExceptionVerbose(String str, Throwable th2) {
        logSoftException(str + "|" + th2.getClass().getSimpleName() + ":" + th2.getMessage(), th2);
    }

    @InterfaceC6107a
    public static void removeListener(ReactSoftExceptionListener reactSoftExceptionListener) {
        sListeners.remove(reactSoftExceptionListener);
    }
}