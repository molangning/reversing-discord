package com.google.android.gms.common.api.internal;

import android.os.Looper;
import java.util.concurrent.Executor;
import p029b9.C2198p;
import p133h9.ExecutorC7040a;

/* renamed from: com.google.android.gms.common.api.internal.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4616d<L> {

    /* renamed from: a */
    private final Executor f12692a;

    /* renamed from: b */
    private volatile L f12693b;

    /* renamed from: c */
    private volatile C4617a<L> f12694c;

    /* renamed from: com.google.android.gms.common.api.internal.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C4617a<L> {

        /* renamed from: a */
        private final L f12695a;

        /* renamed from: b */
        private final String f12696b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C4617a(L l, String str) {
            this.f12695a = l;
            this.f12696b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C4617a)) {
                return false;
            }
            C4617a c4617a = (C4617a) obj;
            if (this.f12695a == c4617a.f12695a && this.f12696b.equals(c4617a.f12696b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f12695a) * 31) + this.f12696b.hashCode();
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4618b<L> {
        /* renamed from: a */
        void mo3008a(L l);

        /* renamed from: b */
        void mo3028b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4616d(Looper looper, L l, String str) {
        this.f12692a = new ExecutorC7040a(looper);
        this.f12693b = (L) C2198p.m33984k(l, "Listener must not be null");
        this.f12694c = new C4617a<>(l, C2198p.m33989f(str));
    }

    /* renamed from: a */
    public void m28184a() {
        this.f12693b = null;
        this.f12694c = null;
    }

    /* renamed from: b */
    public C4617a<L> m28183b() {
        return this.f12694c;
    }

    /* renamed from: c */
    public void m28182c(final InterfaceC4618b<? super L> interfaceC4618b) {
        C2198p.m33984k(interfaceC4618b, "Notifier must not be null");
        this.f12692a.execute(new Runnable() { // from class: com.google.android.gms.common.api.internal.x
            @Override // java.lang.Runnable
            public final void run() {
                C4616d.this.m28181d(interfaceC4618b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final void m28181d(InterfaceC4618b<? super L> interfaceC4618b) {
        Object obj = (L) this.f12693b;
        if (obj == null) {
            interfaceC4618b.mo3028b();
            return;
        }
        try {
            interfaceC4618b.mo3008a(obj);
        } catch (RuntimeException e) {
            interfaceC4618b.mo3028b();
            throw e;
        }
    }
}
