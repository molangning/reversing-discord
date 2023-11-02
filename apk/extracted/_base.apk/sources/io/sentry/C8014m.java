package io.sentry;

import io.sentry.util.C8229o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8014m implements InterfaceC8167t5 {

    /* renamed from: d */
    private final List<InterfaceC7992j0> f21701d;

    /* renamed from: e */
    private final C8132r4 f21702e;

    /* renamed from: a */
    private final Object f21698a = new Object();

    /* renamed from: b */
    private volatile Timer f21699b = null;

    /* renamed from: c */
    private final Map<String, List<C8002k2>> f21700c = new ConcurrentHashMap();

    /* renamed from: f */
    private final AtomicBoolean f21703f = new AtomicBoolean(false);

    /* renamed from: io.sentry.m$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C8015a extends TimerTask {
        C8015a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            for (InterfaceC7992j0 interfaceC7992j0 : C8014m.this.f21701d) {
                interfaceC7992j0.mo19075a();
            }
        }
    }

    /* renamed from: io.sentry.m$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C8016b extends TimerTask {
        C8016b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C8002k2 c8002k2 = new C8002k2();
            for (InterfaceC7992j0 interfaceC7992j0 : C8014m.this.f21701d) {
                interfaceC7992j0.mo19074b(c8002k2);
            }
            for (List list : C8014m.this.f21700c.values()) {
                list.add(c8002k2);
            }
        }
    }

    public C8014m(C8132r4 c8132r4) {
        this.f21702e = (C8132r4) C8229o.m18169c(c8132r4, "The options object is required.");
        this.f21701d = c8132r4.getCollectors();
    }

    @Override // io.sentry.InterfaceC8167t5
    /* renamed from: a */
    public List<C8002k2> m19001f(InterfaceC8259w0 interfaceC8259w0) {
        List<C8002k2> remove = this.f21700c.remove(interfaceC8259w0.mo17947e().toString());
        this.f21702e.getLogger().mo18135c(EnumC8021m4.DEBUG, "stop collecting performance info for transactions %s (%s)", interfaceC8259w0.getName(), interfaceC8259w0.mo17936p().m19295k().toString());
        if (this.f21700c.isEmpty() && this.f21703f.getAndSet(false)) {
            synchronized (this.f21698a) {
                if (this.f21699b != null) {
                    this.f21699b.cancel();
                    this.f21699b = null;
                }
            }
        }
        return remove;
    }

    @Override // io.sentry.InterfaceC8167t5
    /* renamed from: b */
    public void mo18349b(final InterfaceC8259w0 interfaceC8259w0) {
        if (this.f21701d.isEmpty()) {
            this.f21702e.getLogger().mo18135c(EnumC8021m4.INFO, "No collector found. Performance stats will not be captured during transactions.", new Object[0]);
            return;
        }
        if (!this.f21700c.containsKey(interfaceC8259w0.mo17947e().toString())) {
            this.f21700c.put(interfaceC8259w0.mo17947e().toString(), new ArrayList());
            try {
                this.f21702e.getExecutorService().mo18039b(new Runnable() { // from class: io.sentry.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        C8014m.this.m19001f(interfaceC8259w0);
                    }
                }, 30000L);
            } catch (RejectedExecutionException e) {
                this.f21702e.getLogger().mo18136b(EnumC8021m4.ERROR, "Failed to call the executor. Performance collector will not be automatically finished. Did you call Sentry.close()?", e);
            }
        }
        if (!this.f21703f.getAndSet(true)) {
            synchronized (this.f21698a) {
                if (this.f21699b == null) {
                    this.f21699b = new Timer(true);
                }
                this.f21699b.schedule(new C8015a(), 0L);
                this.f21699b.scheduleAtFixedRate(new C8016b(), 100L, 100L);
            }
        }
    }

    @Override // io.sentry.InterfaceC8167t5
    public void close() {
        this.f21700c.clear();
        this.f21702e.getLogger().mo18135c(EnumC8021m4.DEBUG, "stop collecting all performance info for transactions", new Object[0]);
        if (this.f21703f.getAndSet(false)) {
            synchronized (this.f21698a) {
                if (this.f21699b != null) {
                    this.f21699b.cancel();
                    this.f21699b = null;
                }
            }
        }
    }
}
