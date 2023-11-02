package com.facebook.react.bridge.queue;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import p077e5.InterfaceC6107a;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface MessageQueueThread {
    @InterfaceC6107a
    void assertIsOnThread();

    @InterfaceC6107a
    void assertIsOnThread(String str);

    @InterfaceC6107a
    <T> Future<T> callOnQueue(Callable<T> callable);

    @InterfaceC6107a
    MessageQueueThreadPerfStats getPerfStats();

    @InterfaceC6107a
    boolean isOnThread();

    @InterfaceC6107a
    void quitSynchronous();

    @InterfaceC6107a
    void resetPerfStats();

    @InterfaceC6107a
    boolean runOnQueue(Runnable runnable);
}
