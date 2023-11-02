package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p029b9.C2198p;
import p319r9.HandlerC12118f;
import p461z8.AbstractC14124f;
import p461z8.AbstractC14127g;
import p461z8.InterfaceC14130i;
import p461z8.InterfaceC14132k;
import p461z8.InterfaceC14133l;

@KeepName
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class BasePendingResult<R extends InterfaceC14132k> extends AbstractC14127g<R> {
    static final ThreadLocal<Boolean> zaa = new C4643o0();
    @KeepName
    private C4645p0 mResultGuardian;
    protected final HandlerC4608a<R> zab;
    protected final WeakReference<AbstractC14124f> zac;
    private final Object zae;
    private final CountDownLatch zaf;
    private final ArrayList<AbstractC14127g.InterfaceC14128a> zag;
    private InterfaceC14133l<? super R> zah;
    private final AtomicReference<C4621e0> zai;
    private R zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private boolean zaq;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class HandlerC4608a<R extends InterfaceC14132k> extends HandlerC12118f {
        public HandlerC4608a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void m28235a(InterfaceC14133l<? super R> interfaceC14133l, R r) {
            ThreadLocal<Boolean> threadLocal = BasePendingResult.zaa;
            sendMessage(obtainMessage(1, new Pair((InterfaceC14133l) C2198p.m33985j(interfaceC14133l), r)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    StringBuilder sb2 = new StringBuilder(45);
                    sb2.append("Don't know how to handle message: ");
                    sb2.append(i);
                    Log.wtf("BasePendingResult", sb2.toString(), new Exception());
                    return;
                }
                ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f12651r);
                return;
            }
            Pair pair = (Pair) message.obj;
            InterfaceC14133l interfaceC14133l = (InterfaceC14133l) pair.first;
            InterfaceC14132k interfaceC14132k = (InterfaceC14132k) pair.second;
            try {
                interfaceC14133l.m595a(interfaceC14132k);
            } catch (RuntimeException e) {
                BasePendingResult.zal(interfaceC14132k);
                throw e;
            }
        }
    }

    @Deprecated
    BasePendingResult() {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList<>();
        this.zai = new AtomicReference<>();
        this.zaq = false;
        this.zab = new HandlerC4608a<>(Looper.getMainLooper());
        this.zac = new WeakReference<>(null);
    }

    private final R zaa() {
        R r;
        synchronized (this.zae) {
            C2198p.m33982m(!this.zal, "Result has already been consumed.");
            C2198p.m33982m(isReady(), "Result is not ready.");
            r = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        if (this.zai.getAndSet(null) == null) {
            return (R) C2198p.m33985j(r);
        }
        throw null;
    }

    private final void zab(R r) {
        this.zaj = r;
        this.zak = r.mo596b();
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            InterfaceC14133l<? super R> interfaceC14133l = this.zah;
            if (interfaceC14133l == null) {
                if (this.zaj instanceof InterfaceC14130i) {
                    this.mResultGuardian = new C4645p0(this, null);
                }
            } else {
                this.zab.removeMessages(2);
                this.zab.m28235a(interfaceC14133l, zaa());
            }
        }
        ArrayList<AbstractC14127g.InterfaceC14128a> arrayList = this.zag;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).mo601a(this.zak);
        }
        this.zag.clear();
    }

    public static void zal(InterfaceC14132k interfaceC14132k) {
        if (interfaceC14132k instanceof InterfaceC14130i) {
            try {
                ((InterfaceC14130i) interfaceC14132k).release();
            } catch (RuntimeException e) {
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(interfaceC14132k)), e);
            }
        }
    }

    @Override // p461z8.AbstractC14127g
    public final void addStatusListener(AbstractC14127g.InterfaceC14128a interfaceC14128a) {
        boolean z;
        if (interfaceC14128a != null) {
            z = true;
        } else {
            z = false;
        }
        C2198p.m33993b(z, "Callback cannot be null.");
        synchronized (this.zae) {
            if (isReady()) {
                interfaceC14128a.mo601a(this.zak);
            } else {
                this.zag.add(interfaceC14128a);
            }
        }
    }

    @Override // p461z8.AbstractC14127g
    public final R await(long j, TimeUnit timeUnit) {
        if (j > 0) {
            C2198p.m33986i("await must not be called on the UI thread when time is greater than zero.");
        }
        C2198p.m33982m(!this.zal, "Result has already been consumed.");
        C2198p.m33982m(true, "Cannot await if then() has been called.");
        try {
            if (!this.zaf.await(j, timeUnit)) {
                forceFailureUnlessReady(Status.f12651r);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f12649p);
        }
        C2198p.m33982m(isReady(), "Result is not ready.");
        return zaa();
    }

    public abstract R createFailedResult(Status status);

    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            if (!isReady()) {
                setResult(createFailedResult(status));
                this.zan = true;
            }
        }
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    public final void setResult(R r) {
        synchronized (this.zae) {
            if (!this.zan && !this.zam) {
                isReady();
                C2198p.m33982m(!isReady(), "Results have already been set");
                C2198p.m33982m(!this.zal, "Result has already been consumed");
                zab(r);
                return;
            }
            zal(r);
        }
    }

    public final void zak() {
        boolean z = true;
        if (!this.zaq && !zaa.get().booleanValue()) {
            z = false;
        }
        this.zaq = z;
    }

    public BasePendingResult(AbstractC14124f abstractC14124f) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList<>();
        this.zai = new AtomicReference<>();
        this.zaq = false;
        this.zab = new HandlerC4608a<>(abstractC14124f != null ? abstractC14124f.mo604d() : Looper.getMainLooper());
        this.zac = new WeakReference<>(abstractC14124f);
    }
}