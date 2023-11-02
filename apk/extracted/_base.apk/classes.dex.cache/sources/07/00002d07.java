package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.C4713b;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p119g9.C6587j;
import p134ha.InterfaceC7043a;

/* renamed from: com.google.firebase.messaging.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5096l {

    /* renamed from: c */
    private static final Object f14357c = new Object();

    /* renamed from: d */
    private static ServiceConnectionC5084f1 f14358d;

    /* renamed from: a */
    private final Context f14359a;

    /* renamed from: b */
    private final Executor f14360b = new ExecutorC5082f();

    public C5096l(Context context) {
        this.f14359a = context;
    }

    /* renamed from: e */
    private static Task<Integer> m26221e(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        return m26220f(context, "com.google.firebase.MESSAGING_EVENT").m26244c(intent).mo27976h(new ExecutorC5082f(), new InterfaceC7043a() { // from class: com.google.firebase.messaging.j
            @Override // p134ha.InterfaceC7043a
            /* renamed from: a */
            public final Object mo1573a(Task task) {
                Integer m26219g;
                m26219g = C5096l.m26219g(task);
                return m26219g;
            }
        });
    }

    /* renamed from: f */
    private static ServiceConnectionC5084f1 m26220f(Context context, String str) {
        ServiceConnectionC5084f1 serviceConnectionC5084f1;
        synchronized (f14357c) {
            if (f14358d == null) {
                f14358d = new ServiceConnectionC5084f1(context, str);
            }
            serviceConnectionC5084f1 = f14358d;
        }
        return serviceConnectionC5084f1;
    }

    /* renamed from: g */
    public static /* synthetic */ Integer m26219g(Task task) {
        return -1;
    }

    /* renamed from: h */
    public static /* synthetic */ Integer m26218h(Context context, Intent intent) {
        return Integer.valueOf(C5108q0.m26194b().m26189g(context, intent));
    }

    /* renamed from: i */
    public static /* synthetic */ Integer m26217i(Task task) {
        return 403;
    }

    /* renamed from: j */
    public static /* synthetic */ Task m26216j(Context context, Intent intent, Task task) {
        if (C6587j.m22360h() && ((Integer) task.mo27973k()).intValue() == 402) {
            return m26221e(context, intent).mo27976h(new ExecutorC5082f(), new InterfaceC7043a() { // from class: com.google.firebase.messaging.k
                @Override // p134ha.InterfaceC7043a
                /* renamed from: a */
                public final Object mo1573a(Task task2) {
                    Integer m26217i;
                    m26217i = C5096l.m26217i(task2);
                    return m26217i;
                }
            });
        }
        return task;
    }

    /* renamed from: k */
    public Task<Integer> m26215k(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return m26214l(this.f14359a, intent);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: l */
    public Task<Integer> m26214l(final Context context, final Intent intent) {
        boolean z;
        boolean z2 = true;
        if (C6587j.m22360h() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        } else {
            z = false;
        }
        if ((intent.getFlags() & 268435456) == 0) {
            z2 = false;
        }
        if (z && !z2) {
            return m26221e(context, intent);
        }
        return C4713b.m28006c(this.f14360b, new Callable() { // from class: com.google.firebase.messaging.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer m26218h;
                m26218h = C5096l.m26218h(context, intent);
                return m26218h;
            }
        }).mo27975i(this.f14360b, new InterfaceC7043a() { // from class: com.google.firebase.messaging.i
            @Override // p134ha.InterfaceC7043a
            /* renamed from: a */
            public final Object mo1573a(Task task) {
                Task m26216j;
                m26216j = C5096l.m26216j(context, intent, task);
                return m26216j;
            }
        });
    }
}