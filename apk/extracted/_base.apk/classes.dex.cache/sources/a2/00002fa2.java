package com.swmansion.reanimated;

import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.MessageQueueThreadImpl;
import com.facebook.react.bridge.queue.MessageQueueThreadPerfStats;
import com.facebook.react.bridge.queue.MessageQueueThreadSpec;
import com.facebook.react.bridge.queue.QueueThreadExceptionHandler;
import java.lang.reflect.Field;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import p077e5.InterfaceC6107a;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class ReanimatedMessageQueueThreadBase implements MessageQueueThread {
    protected final MessageQueueThreadImpl messageQueueThread = MessageQueueThreadImpl.create(MessageQueueThreadSpec.mainThreadSpec(), new QueueThreadExceptionHandler() { // from class: com.swmansion.reanimated.c
        @Override // com.facebook.react.bridge.queue.QueueThreadExceptionHandler
        public final void handleException(Exception exc) {
            ReanimatedMessageQueueThreadBase.lambda$new$0(exc);
        }
    });

    public static /* synthetic */ void lambda$new$0(Exception exc) {
        throw new RuntimeException(exc);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void assertIsOnThread() {
        this.messageQueueThread.assertIsOnThread();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public <T> Future<T> callOnQueue(Callable<T> callable) {
        return this.messageQueueThread.callOnQueue(callable);
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public MessageQueueThreadPerfStats getPerfStats() {
        return this.messageQueueThread.getPerfStats();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public boolean isOnThread() {
        return this.messageQueueThread.isOnThread();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void quitSynchronous() {
        try {
            Field declaredField = this.messageQueueThread.getClass().getDeclaredField("mIsFinished");
            declaredField.setAccessible(true);
            declaredField.set(this.messageQueueThread, Boolean.TRUE);
            declaredField.setAccessible(false);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void resetPerfStats() {
        this.messageQueueThread.resetPerfStats();
    }

    @Override // com.facebook.react.bridge.queue.MessageQueueThread
    public void assertIsOnThread(String str) {
        this.messageQueueThread.assertIsOnThread(str);
    }
}