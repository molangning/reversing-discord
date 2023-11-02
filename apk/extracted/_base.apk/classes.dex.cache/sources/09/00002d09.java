package com.google.firebase.messaging;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import p103fc.C6388b;
import p103fc.EnumC6391c;
import p133h9.ThreadFactoryC7041b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5098m {
    /* renamed from: a */
    public static ScheduledExecutorService m26210a() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC7041b("Firebase-Messaging-Init"));
    }

    /* renamed from: b */
    public static ExecutorService m26209b() {
        return C6388b.m22812a().mo22811a(new ThreadFactoryC7041b("Firebase-Messaging-Intent-Handle"), EnumC6391c.HIGH_SPEED);
    }

    /* renamed from: c */
    public static ExecutorService m26208c() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC7041b("Firebase-Messaging-Network-Io"));
    }

    /* renamed from: d */
    public static ExecutorService m26207d() {
        return Executors.newSingleThreadExecutor(new ThreadFactoryC7041b("Firebase-Messaging-Task"));
    }

    /* renamed from: e */
    public static ScheduledExecutorService m26206e() {
        return new ScheduledThreadPoolExecutor(1, new ThreadFactoryC7041b("Firebase-Messaging-Topics-Io"));
    }
}