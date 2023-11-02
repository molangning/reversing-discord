package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import p134ha.InterfaceC7046d;

/* renamed from: com.google.android.gms.common.api.internal.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4634k implements InterfaceC7046d {

    /* renamed from: a */
    final /* synthetic */ TaskCompletionSource f12729a;

    /* renamed from: b */
    final /* synthetic */ C4636l f12730b;

    public C4634k(C4636l c4636l, TaskCompletionSource taskCompletionSource) {
        this.f12730b = c4636l;
        this.f12729a = taskCompletionSource;
    }

    @Override // p134ha.InterfaceC7046d
    /* renamed from: a */
    public final void mo1614a(Task task) {
        Map map;
        map = this.f12730b.f12734b;
        map.remove(this.f12729a);
    }
}