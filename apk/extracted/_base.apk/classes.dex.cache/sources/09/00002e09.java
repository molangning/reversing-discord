package com.linkedin.android.litr;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import p200kd.InterfaceC9216a;
import p215ld.C10131a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.linkedin.android.litr.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5264a {

    /* renamed from: e */
    private static final String f14961e = "a";

    /* renamed from: a */
    private final Map<String, Future<?>> f14962a;

    /* renamed from: b */
    private final InterfaceC9216a f14963b;

    /* renamed from: c */
    private Bundle f14964c = new Bundle();

    /* renamed from: d */
    private HandlerC5266b f14965d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.linkedin.android.litr.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class HandlerC5266b extends Handler {

        /* renamed from: a */
        private final InterfaceC9216a f14966a;

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            List<C10131a> list;
            Object obj = message.obj;
            if (obj == null) {
                list = null;
            } else {
                list = (List) obj;
            }
            Bundle data = message.getData();
            String string = data.getString("jobId");
            if (string != null) {
                int i = message.what;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    String str = C5264a.f14961e;
                                    Log.e(str, "Unknown event received: " + message.what);
                                    return;
                                }
                                this.f14966a.onCancelled(string, list);
                                return;
                            }
                            this.f14966a.onProgress(string, data.getFloat("progress"));
                            return;
                        }
                        this.f14966a.onError(string, (Throwable) data.getSerializable("throwable"), list);
                        return;
                    }
                    this.f14966a.onCompleted(string, list);
                    return;
                }
                this.f14966a.onStarted(string);
                return;
            }
            throw new IllegalArgumentException("Handler message doesn't contain an id!");
        }

        private HandlerC5266b(Looper looper, InterfaceC9216a interfaceC9216a) {
            super(looper);
            this.f14966a = interfaceC9216a;
        }
    }

    public C5264a(Map<String, Future<?>> map, InterfaceC9216a interfaceC9216a, Looper looper) {
        this.f14962a = map;
        this.f14963b = interfaceC9216a;
        if (looper != null) {
            this.f14965d = new HandlerC5266b(looper, interfaceC9216a);
        }
    }

    /* renamed from: b */
    public void m25575b(String str, List<C10131a> list) {
        this.f14962a.remove(str);
        HandlerC5266b handlerC5266b = this.f14965d;
        if (handlerC5266b == null) {
            this.f14963b.onCancelled(str, list);
            return;
        }
        Message obtain = Message.obtain(handlerC5266b, 4);
        obtain.obj = list;
        this.f14964c.putString("jobId", str);
        obtain.setData(this.f14964c);
        obtain.sendToTarget();
    }

    /* renamed from: c */
    public void m25574c(String str, List<C10131a> list) {
        this.f14962a.remove(str);
        HandlerC5266b handlerC5266b = this.f14965d;
        if (handlerC5266b == null) {
            this.f14963b.onCompleted(str, list);
            return;
        }
        Message obtain = Message.obtain(handlerC5266b, 1);
        obtain.obj = list;
        this.f14964c.putString("jobId", str);
        obtain.setData(this.f14964c);
        obtain.sendToTarget();
    }

    /* renamed from: d */
    public void m25573d(String str, Throwable th2, List<C10131a> list) {
        this.f14962a.remove(str);
        HandlerC5266b handlerC5266b = this.f14965d;
        if (handlerC5266b == null) {
            this.f14963b.onError(str, th2, list);
            return;
        }
        Message obtain = Message.obtain(handlerC5266b, 2);
        obtain.obj = list;
        this.f14964c.putString("jobId", str);
        this.f14964c.putSerializable("throwable", th2);
        obtain.setData(this.f14964c);
        obtain.sendToTarget();
    }

    /* renamed from: e */
    public void m25572e(String str, float f) {
        HandlerC5266b handlerC5266b = this.f14965d;
        if (handlerC5266b == null) {
            this.f14963b.onProgress(str, f);
            return;
        }
        Message obtain = Message.obtain(handlerC5266b, 3);
        obtain.obj = null;
        this.f14964c.putString("jobId", str);
        this.f14964c.putFloat("progress", f);
        obtain.setData(this.f14964c);
        obtain.sendToTarget();
    }

    /* renamed from: f */
    public void m25571f(String str) {
        HandlerC5266b handlerC5266b = this.f14965d;
        if (handlerC5266b == null) {
            this.f14963b.onStarted(str);
            return;
        }
        Message obtain = Message.obtain(handlerC5266b, 0);
        obtain.obj = null;
        this.f14964c.putString("jobId", str);
        obtain.setData(this.f14964c);
        obtain.sendToTarget();
    }
}