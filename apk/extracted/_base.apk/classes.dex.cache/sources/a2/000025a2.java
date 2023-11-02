package com.facebook.react.jstasks;

import com.facebook.react.bridge.WritableMap;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class HeadlessJsTaskConfig {
    private final boolean mAllowedInForeground;
    private final WritableMap mData;
    private final HeadlessJsTaskRetryPolicy mRetryPolicy;
    private final String mTaskKey;
    private final long mTimeout;

    public HeadlessJsTaskConfig(String str, WritableMap writableMap) {
        this(str, writableMap, 0L, false);
    }

    public WritableMap getData() {
        return this.mData;
    }

    public HeadlessJsTaskRetryPolicy getRetryPolicy() {
        return this.mRetryPolicy;
    }

    public String getTaskKey() {
        return this.mTaskKey;
    }

    public long getTimeout() {
        return this.mTimeout;
    }

    public boolean isAllowedInForeground() {
        return this.mAllowedInForeground;
    }

    public HeadlessJsTaskConfig(String str, WritableMap writableMap, long j) {
        this(str, writableMap, j, false);
    }

    public HeadlessJsTaskConfig(String str, WritableMap writableMap, long j, boolean z) {
        this(str, writableMap, j, z, NoRetryPolicy.INSTANCE);
    }

    public HeadlessJsTaskConfig(String str, WritableMap writableMap, long j, boolean z, HeadlessJsTaskRetryPolicy headlessJsTaskRetryPolicy) {
        this.mTaskKey = str;
        this.mData = writableMap;
        this.mTimeout = j;
        this.mAllowedInForeground = z;
        this.mRetryPolicy = headlessJsTaskRetryPolicy;
    }

    public HeadlessJsTaskConfig(HeadlessJsTaskConfig headlessJsTaskConfig) {
        this.mTaskKey = headlessJsTaskConfig.mTaskKey;
        this.mData = headlessJsTaskConfig.mData.copy();
        this.mTimeout = headlessJsTaskConfig.mTimeout;
        this.mAllowedInForeground = headlessJsTaskConfig.mAllowedInForeground;
        HeadlessJsTaskRetryPolicy headlessJsTaskRetryPolicy = headlessJsTaskConfig.mRetryPolicy;
        if (headlessJsTaskRetryPolicy != null) {
            this.mRetryPolicy = headlessJsTaskRetryPolicy.copy();
        } else {
            this.mRetryPolicy = null;
        }
    }
}