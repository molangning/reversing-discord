package com.facebook.react.bridge;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface Promise {
    @Deprecated
    void reject(String str);

    void reject(String str, WritableMap writableMap);

    void reject(String str, String str2);

    void reject(String str, String str2, WritableMap writableMap);

    void reject(String str, String str2, Throwable th2);

    void reject(String str, String str2, Throwable th2, WritableMap writableMap);

    void reject(String str, Throwable th2);

    void reject(String str, Throwable th2, WritableMap writableMap);

    void reject(Throwable th2);

    void reject(Throwable th2, WritableMap writableMap);

    void resolve(Object obj);
}