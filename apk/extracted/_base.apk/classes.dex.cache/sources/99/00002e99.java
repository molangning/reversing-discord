package com.reactnative.ivpusic.imagepicker;

import android.util.Log;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.reactnative.ivpusic.imagepicker.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5384g {

    /* renamed from: a */
    private Promise f15252a;

    /* renamed from: b */
    private int f15253b;

    /* renamed from: c */
    private boolean f15254c;

    /* renamed from: d */
    private AtomicInteger f15255d;

    /* renamed from: e */
    private WritableArray f15256e;

    /* renamed from: f */
    private boolean f15257f;

    /* renamed from: a */
    private synchronized boolean m25315a() {
        if (this.f15257f) {
            Log.w("image-crop-picker", "Skipping result, already sent...");
            return false;
        } else if (this.f15252a == null) {
            Log.w("image-crop-picker", "Trying to notify success but promise is not set");
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: b */
    public synchronized void m25314b(String str, String str2) {
        if (!m25315a()) {
            return;
        }
        Log.e("image-crop-picker", "Promise rejected. " + str2);
        this.f15252a.reject(str, str2);
        this.f15257f = true;
    }

    /* renamed from: c */
    public synchronized void m25313c(String str, Throwable th2) {
        if (!m25315a()) {
            return;
        }
        Log.e("image-crop-picker", "Promise rejected. " + th2.getMessage());
        this.f15252a.reject(str, th2);
        this.f15257f = true;
    }

    /* renamed from: d */
    public synchronized void m25312d(WritableMap writableMap) {
        if (!m25315a()) {
            return;
        }
        if (this.f15254c) {
            this.f15256e.pushMap(writableMap);
            if (this.f15255d.addAndGet(1) == this.f15253b) {
                this.f15252a.resolve(this.f15256e);
                this.f15257f = true;
            }
        } else {
            this.f15252a.resolve(writableMap);
            this.f15257f = true;
        }
    }

    /* renamed from: e */
    public synchronized void m25311e(int i) {
        this.f15253b = i;
        this.f15255d = new AtomicInteger(0);
    }

    /* renamed from: f */
    public synchronized void m25310f(Promise promise, boolean z) {
        this.f15252a = promise;
        this.f15254c = z;
        this.f15257f = false;
        this.f15253b = 0;
        this.f15255d = new AtomicInteger(0);
        if (z) {
            this.f15256e = new WritableNativeArray();
        }
    }
}