package com.google.firebase.messaging;

import android.util.Log;
import androidx.collection.C0624a;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;
import p134ha.InterfaceC7043a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.o0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5103o0 {

    /* renamed from: a */
    private final Executor f14366a;

    /* renamed from: b */
    private final Map<String, Task<String>> f14367b = new C0624a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.messaging.o0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC5104a {
        Task<String> start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5103o0(Executor executor) {
        this.f14366a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ Task m26197c(String str, Task task) {
        synchronized (this) {
            this.f14367b.remove(str);
        }
        return task;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public synchronized Task<String> m26198b(final String str, InterfaceC5104a interfaceC5104a) {
        Task<String> task = this.f14367b.get(str);
        if (task != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return task;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        Task mo27975i = interfaceC5104a.start().mo27975i(this.f14366a, new InterfaceC7043a() { // from class: com.google.firebase.messaging.n0
            @Override // p134ha.InterfaceC7043a
            /* renamed from: a */
            public final Object mo1573a(Task task2) {
                Task m26197c;
                m26197c = C5103o0.this.m26197c(str, task2);
                return m26197c;
            }
        });
        this.f14367b.put(str, mo27975i);
        return mo27975i;
    }
}
