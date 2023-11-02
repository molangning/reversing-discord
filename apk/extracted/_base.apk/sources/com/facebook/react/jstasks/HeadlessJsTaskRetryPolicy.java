package com.facebook.react.jstasks;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface HeadlessJsTaskRetryPolicy {
    boolean canRetry();

    HeadlessJsTaskRetryPolicy copy();

    int getDelay();

    HeadlessJsTaskRetryPolicy update();
}
