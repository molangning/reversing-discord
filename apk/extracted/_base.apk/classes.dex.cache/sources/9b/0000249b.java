package com.facebook.react.bridge.queue;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface ReactQueueConfiguration {
    void destroy();

    MessageQueueThread getJSQueueThread();

    MessageQueueThread getNativeModulesQueueThread();

    MessageQueueThread getUIQueueThread();
}