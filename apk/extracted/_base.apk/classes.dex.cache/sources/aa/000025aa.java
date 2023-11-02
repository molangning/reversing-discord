package com.facebook.react.jstasks;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class NoRetryPolicy implements HeadlessJsTaskRetryPolicy {
    public static final NoRetryPolicy INSTANCE = new NoRetryPolicy();

    private NoRetryPolicy() {
    }

    @Override // com.facebook.react.jstasks.HeadlessJsTaskRetryPolicy
    public boolean canRetry() {
        return false;
    }

    @Override // com.facebook.react.jstasks.HeadlessJsTaskRetryPolicy
    public HeadlessJsTaskRetryPolicy copy() {
        return this;
    }

    @Override // com.facebook.react.jstasks.HeadlessJsTaskRetryPolicy
    public int getDelay() {
        throw new IllegalStateException("Should not retrieve delay as canRetry is: " + canRetry());
    }

    @Override // com.facebook.react.jstasks.HeadlessJsTaskRetryPolicy
    public HeadlessJsTaskRetryPolicy update() {
        throw new IllegalStateException("Should not update as canRetry is: " + canRetry());
    }
}