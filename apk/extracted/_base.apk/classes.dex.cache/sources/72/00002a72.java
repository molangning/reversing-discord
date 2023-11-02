package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;
import p010a9.C0102f0;
import p010a9.InterfaceC0107i;
import p029b9.C2198p;
import p441y8.C13932c;
import p461z8.C14107a;
import p461z8.C14107a.InterfaceC14109b;

/* renamed from: com.google.android.gms.common.api.internal.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC4627h<A extends C14107a.InterfaceC14109b, ResultT> {

    /* renamed from: a */
    private final C13932c[] f12714a;

    /* renamed from: b */
    private final boolean f12715b;

    /* renamed from: c */
    private final int f12716c;

    /* renamed from: com.google.android.gms.common.api.internal.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4628a<A extends C14107a.InterfaceC14109b, ResultT> {

        /* renamed from: a */
        private InterfaceC0107i<A, TaskCompletionSource<ResultT>> f12717a;

        /* renamed from: c */
        private C13932c[] f12719c;

        /* renamed from: b */
        private boolean f12718b = true;

        /* renamed from: d */
        private int f12720d = 0;

        /* synthetic */ C4628a(C0102f0 c0102f0) {
        }

        /* renamed from: a */
        public AbstractC4627h<A, ResultT> m28159a() {
            C2198p.m33993b(this.f12717a != null, "execute parameter required");
            return new C4615c0(this, this.f12719c, this.f12718b, this.f12720d);
        }

        /* renamed from: b */
        public C4628a<A, ResultT> m28158b(InterfaceC0107i<A, TaskCompletionSource<ResultT>> interfaceC0107i) {
            this.f12717a = interfaceC0107i;
            return this;
        }

        /* renamed from: c */
        public C4628a<A, ResultT> m28157c(boolean z) {
            this.f12718b = z;
            return this;
        }

        /* renamed from: d */
        public C4628a<A, ResultT> m28156d(C13932c... c13932cArr) {
            this.f12719c = c13932cArr;
            return this;
        }

        /* renamed from: e */
        public C4628a<A, ResultT> m28155e(int i) {
            this.f12720d = i;
            return this;
        }
    }

    public AbstractC4627h(C13932c[] c13932cArr, boolean z, int i) {
        this.f12714a = c13932cArr;
        boolean z2 = false;
        if (c13932cArr != null && z) {
            z2 = true;
        }
        this.f12715b = z2;
        this.f12716c = i;
    }

    /* renamed from: a */
    public static <A extends C14107a.InterfaceC14109b, ResultT> C4628a<A, ResultT> m28164a() {
        return new C4628a<>(null);
    }

    /* renamed from: b */
    public abstract void mo28163b(A a, TaskCompletionSource<ResultT> taskCompletionSource);

    /* renamed from: c */
    public boolean m28162c() {
        return this.f12715b;
    }

    /* renamed from: d */
    public final int m28161d() {
        return this.f12716c;
    }

    /* renamed from: e */
    public final C13932c[] m28160e() {
        return this.f12714a;
    }
}