package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.C4616d;
import com.google.android.gms.tasks.TaskCompletionSource;
import p441y8.C13932c;
import p461z8.C14107a;
import p461z8.C14107a.InterfaceC14109b;

/* renamed from: com.google.android.gms.common.api.internal.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC4622f<A extends C14107a.InterfaceC14109b, L> {

    /* renamed from: a */
    private final C4616d<L> f12698a;

    /* renamed from: b */
    private final C13932c[] f12699b;

    /* renamed from: c */
    private final boolean f12700c;

    /* renamed from: d */
    private final int f12701d;

    /* JADX INFO: Access modifiers changed from: protected */
    public AbstractC4622f(C4616d<L> c4616d, C13932c[] c13932cArr, boolean z, int i) {
        this.f12698a = c4616d;
        this.f12699b = c13932cArr;
        this.f12700c = z;
        this.f12701d = i;
    }

    /* renamed from: a */
    public void m28178a() {
        this.f12698a.m28184a();
    }

    /* renamed from: b */
    public C4616d.C4617a<L> m28177b() {
        return this.f12698a.m28183b();
    }

    /* renamed from: c */
    public C13932c[] m28176c() {
        return this.f12699b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo28175d(A a, TaskCompletionSource<Void> taskCompletionSource);

    /* renamed from: e */
    public final int m28174e() {
        return this.f12701d;
    }

    /* renamed from: f */
    public final boolean m28173f() {
        return this.f12700c;
    }
}
