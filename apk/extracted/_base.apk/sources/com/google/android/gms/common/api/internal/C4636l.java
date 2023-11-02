package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p164j$.util.DesugarCollections;
import p461z8.C14118b;
import p461z8.InterfaceC14132k;

/* renamed from: com.google.android.gms.common.api.internal.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4636l {

    /* renamed from: a */
    private final Map<BasePendingResult<?>, Boolean> f12733a = DesugarCollections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    private final Map<TaskCompletionSource<?>, Boolean> f12734b = DesugarCollections.synchronizedMap(new WeakHashMap());

    /* renamed from: h */
    private final void m28134h(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f12733a) {
            hashMap = new HashMap(this.f12733a);
        }
        synchronized (this.f12734b) {
            hashMap2 = new HashMap(this.f12734b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).m28010d(new C14118b(status));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final void m28139c(BasePendingResult<? extends InterfaceC14132k> basePendingResult, boolean z) {
        this.f12733a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.addStatusListener(new C4632j(this, basePendingResult));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final <TResult> void m28138d(TaskCompletionSource<TResult> taskCompletionSource, boolean z) {
        this.f12734b.put(taskCompletionSource, Boolean.valueOf(z));
        taskCompletionSource.m28013a().mo27982b(new C4634k(this, taskCompletionSource));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m28137e(int i, String str) {
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        m28134h(true, new Status(20, sb2.toString()));
    }

    /* renamed from: f */
    public final void m28136f() {
        m28134h(false, C4614c.f12670A);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean m28135g() {
        return (this.f12733a.isEmpty() && this.f12734b.isEmpty()) ? false : true;
    }
}
