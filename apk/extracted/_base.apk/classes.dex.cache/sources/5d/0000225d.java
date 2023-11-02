package com.facebook.imagepipeline.core;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import p314r4.InterfaceC12053e;
import p314r4.ThreadFactoryC12057i;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class DefaultExecutorSupplier implements InterfaceC12053e {

    /* renamed from: b */
    private final Executor f10310b;

    /* renamed from: c */
    private final Executor f10311c;

    /* renamed from: e */
    private final ScheduledExecutorService f10313e;

    /* renamed from: a */
    private final Executor f10309a = Executors.newFixedThreadPool(2, new ThreadFactoryC12057i(10, "FrescoIoBoundExecutor", true));

    /* renamed from: d */
    private final Executor f10312d = Executors.newFixedThreadPool(1, new ThreadFactoryC12057i(10, "FrescoLightWeightBackgroundExecutor", true));

    public DefaultExecutorSupplier(int i) {
        this.f10310b = Executors.newFixedThreadPool(i, new ThreadFactoryC12057i(10, "FrescoDecodeExecutor", true));
        this.f10311c = Executors.newFixedThreadPool(i, new ThreadFactoryC12057i(10, "FrescoBackgroundExecutor", true));
        this.f10313e = Executors.newScheduledThreadPool(i, new ThreadFactoryC12057i(10, "FrescoBackgroundExecutor", true));
    }

    @Override // p314r4.InterfaceC12053e
    /* renamed from: a */
    public Executor mo6459a() {
        return this.f10312d;
    }

    @Override // p314r4.InterfaceC12053e
    /* renamed from: b */
    public Executor mo6458b() {
        return this.f10309a;
    }

    @Override // p314r4.InterfaceC12053e
    /* renamed from: c */
    public ScheduledExecutorService mo6457c() {
        return this.f10313e;
    }

    @Override // p314r4.InterfaceC12053e
    /* renamed from: d */
    public Executor mo6456d() {
        return this.f10310b;
    }

    @Override // p314r4.InterfaceC12053e
    /* renamed from: e */
    public Executor mo6455e() {
        return this.f10311c;
    }

    @Override // p314r4.InterfaceC12053e
    /* renamed from: f */
    public Executor mo6454f() {
        return this.f10309a;
    }

    @Override // p314r4.InterfaceC12053e
    /* renamed from: g */
    public Executor mo6453g() {
        return this.f10309a;
    }
}