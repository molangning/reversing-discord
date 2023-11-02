package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.C4616d;
import com.google.android.gms.tasks.TaskCompletionSource;
import p010a9.C0092a0;
import p010a9.C0128z;
import p010a9.InterfaceC0107i;
import p029b9.C2198p;
import p441y8.C13932c;
import p461z8.C14107a;
import p461z8.C14107a.InterfaceC14109b;

/* renamed from: com.google.android.gms.common.api.internal.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4624g<A extends C14107a.InterfaceC14109b, L> {

    /* renamed from: a */
    public final AbstractC4622f<A, L> f12703a;

    /* renamed from: b */
    public final AbstractC4630i<A, L> f12704b;

    /* renamed from: c */
    public final Runnable f12705c;

    /* renamed from: com.google.android.gms.common.api.internal.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4625a<A extends C14107a.InterfaceC14109b, L> {

        /* renamed from: a */
        private InterfaceC0107i<A, TaskCompletionSource<Void>> f12706a;

        /* renamed from: b */
        private InterfaceC0107i<A, TaskCompletionSource<Boolean>> f12707b;

        /* renamed from: d */
        private C4616d<L> f12709d;

        /* renamed from: e */
        private C13932c[] f12710e;

        /* renamed from: g */
        private int f12712g;

        /* renamed from: c */
        private Runnable f12708c = new Runnable() { // from class: a9.y
            @Override // java.lang.Runnable
            public final void run() {
            }
        };

        /* renamed from: f */
        private boolean f12711f = true;

        /* synthetic */ C4625a(C0128z c0128z) {
        }

        /* renamed from: a */
        public C4624g<A, L> m28171a() {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (this.f12706a != null) {
                z = true;
            } else {
                z = false;
            }
            C2198p.m33993b(z, "Must set register function");
            if (this.f12707b != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C2198p.m33993b(z2, "Must set unregister function");
            if (this.f12709d == null) {
                z3 = false;
            }
            C2198p.m33993b(z3, "Must set holder");
            return new C4624g<>(new C4611a0(this, this.f12709d, this.f12710e, this.f12711f, this.f12712g), new C4613b0(this, (C4616d.C4617a) C2198p.m33984k(this.f12709d.m28183b(), "Key must not be null")), this.f12708c, null);
        }

        /* renamed from: b */
        public C4625a<A, L> m28170b(InterfaceC0107i<A, TaskCompletionSource<Void>> interfaceC0107i) {
            this.f12706a = interfaceC0107i;
            return this;
        }

        /* renamed from: c */
        public C4625a<A, L> m28169c(int i) {
            this.f12712g = i;
            return this;
        }

        /* renamed from: d */
        public C4625a<A, L> m28168d(InterfaceC0107i<A, TaskCompletionSource<Boolean>> interfaceC0107i) {
            this.f12707b = interfaceC0107i;
            return this;
        }

        /* renamed from: e */
        public C4625a<A, L> m28167e(C4616d<L> c4616d) {
            this.f12709d = c4616d;
            return this;
        }
    }

    /* synthetic */ C4624g(AbstractC4622f abstractC4622f, AbstractC4630i abstractC4630i, Runnable runnable, C0092a0 c0092a0) {
        this.f12703a = abstractC4622f;
        this.f12704b = abstractC4630i;
        this.f12705c = runnable;
    }

    /* renamed from: a */
    public static <A extends C14107a.InterfaceC14109b, L> C4625a<A, L> m28172a() {
        return new C4625a<>(null);
    }
}