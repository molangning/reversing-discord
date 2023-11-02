package com.facebook.datasource;

import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface DataSource<T> {
    /* renamed from: a */
    boolean mo31712a();

    /* renamed from: b */
    boolean mo31663b();

    /* renamed from: c */
    Throwable mo31711c();

    boolean close();

    /* renamed from: d */
    void mo31710d(InterfaceC3577d<T> interfaceC3577d, Executor executor);

    /* renamed from: e */
    float mo31709e();

    /* renamed from: f */
    boolean mo31708f();

    /* renamed from: g */
    T mo31018g();

    Map<String, Object> getExtras();
}
