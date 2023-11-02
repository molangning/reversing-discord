package io.sentry;

import io.sentry.InterfaceC8209u5;
import io.sentry.exception.C7913a;
import io.sentry.hints.AbstractC7947e;
import io.sentry.hints.EnumC7950h;
import io.sentry.hints.InterfaceC7954l;
import io.sentry.protocol.C8084i;
import io.sentry.protocol.C8100q;
import io.sentry.util.C8220j;
import io.sentry.util.C8229o;
import java.io.Closeable;
import java.lang.Thread;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class UncaughtExceptionHandlerIntegration implements Integration, Thread.UncaughtExceptionHandler, Closeable {

    /* renamed from: j */
    private Thread.UncaughtExceptionHandler f21011j;

    /* renamed from: k */
    private InterfaceC8025n0 f21012k;

    /* renamed from: l */
    private C8132r4 f21013l;

    /* renamed from: m */
    private boolean f21014m;

    /* renamed from: n */
    private final InterfaceC8209u5 f21015n;

    /* renamed from: io.sentry.UncaughtExceptionHandlerIntegration$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C7683a extends AbstractC7947e implements InterfaceC7954l {
        public C7683a(long j, InterfaceC8040o0 interfaceC8040o0) {
            super(j, interfaceC8040o0);
        }
    }

    public UncaughtExceptionHandlerIntegration() {
        this(InterfaceC8209u5.C8210a.m18241c());
    }

    /* renamed from: j */
    static Throwable m20049j(Thread thread, Throwable th2) {
        C8084i c8084i = new C8084i();
        c8084i.m18660i(Boolean.FALSE);
        c8084i.m18659j("UncaughtExceptionHandler");
        return new C7913a(c8084i, th2, thread);
    }

    @Override // io.sentry.Integration
    /* renamed from: a */
    public final void mo19952a(InterfaceC8025n0 interfaceC8025n0, C8132r4 c8132r4) {
        if (this.f21014m) {
            c8132r4.getLogger().mo18135c(EnumC8021m4.ERROR, "Attempt to register a UncaughtExceptionHandlerIntegration twice.", new Object[0]);
            return;
        }
        this.f21014m = true;
        this.f21012k = (InterfaceC8025n0) C8229o.m18169c(interfaceC8025n0, "Hub is required");
        C8132r4 c8132r42 = (C8132r4) C8229o.m18169c(c8132r4, "SentryOptions is required");
        this.f21013l = c8132r42;
        InterfaceC8040o0 logger = c8132r42.getLogger();
        EnumC8021m4 enumC8021m4 = EnumC8021m4.DEBUG;
        logger.mo18135c(enumC8021m4, "UncaughtExceptionHandlerIntegration enabled: %s", Boolean.valueOf(this.f21013l.isEnableUncaughtExceptionHandler()));
        if (this.f21013l.isEnableUncaughtExceptionHandler()) {
            Thread.UncaughtExceptionHandler mo18242b = this.f21015n.mo18242b();
            if (mo18242b != null) {
                InterfaceC8040o0 logger2 = this.f21013l.getLogger();
                logger2.mo18135c(enumC8021m4, "default UncaughtExceptionHandler class='" + mo18242b.getClass().getName() + "'", new Object[0]);
                this.f21011j = mo18242b;
            }
            this.f21015n.mo18243a(this);
            this.f21013l.getLogger().mo18135c(enumC8021m4, "UncaughtExceptionHandlerIntegration installed.", new Object[0]);
            m20050i();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this == this.f21015n.mo18242b()) {
            this.f21015n.mo18243a(this.f21011j);
            C8132r4 c8132r4 = this.f21013l;
            if (c8132r4 != null) {
                c8132r4.getLogger().mo18135c(EnumC8021m4.DEBUG, "UncaughtExceptionHandlerIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.InterfaceC7832b1
    /* renamed from: h */
    public /* synthetic */ String mo19588h() {
        return C7687a1.m20045b(this);
    }

    /* renamed from: i */
    public /* synthetic */ void m20050i() {
        C7687a1.m20046a(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        C8132r4 c8132r4 = this.f21013l;
        if (c8132r4 != null && this.f21012k != null) {
            c8132r4.getLogger().mo18135c(EnumC8021m4.INFO, "Uncaught exception received.", new Object[0]);
            try {
                C7683a c7683a = new C7683a(this.f21013l.getFlushTimeoutMillis(), this.f21013l.getLogger());
                C7923f4 c7923f4 = new C7923f4(m20049j(thread, th2));
                c7923f4.m19187z0(EnumC8021m4.FATAL);
                C7831b0 m18225e = C8220j.m18225e(c7683a);
                boolean equals = this.f21012k.mo18257o(c7923f4, m18225e).equals(C8100q.f21957k);
                EnumC7950h m18224f = C8220j.m18224f(m18225e);
                if ((!equals || EnumC7950h.MULTITHREADED_DEDUPLICATION.equals(m18224f)) && !c7683a.mo18899e()) {
                    this.f21013l.getLogger().mo18135c(EnumC8021m4.WARNING, "Timed out waiting to flush event to disk before crashing. Event: %s", c7923f4.m19266G());
                }
            } catch (Throwable th3) {
                this.f21013l.getLogger().mo18136b(EnumC8021m4.ERROR, "Error sending uncaught exception to Sentry.", th3);
            }
            if (this.f21011j != null) {
                this.f21013l.getLogger().mo18135c(EnumC8021m4.INFO, "Invoking inner uncaught exception handler.", new Object[0]);
                this.f21011j.uncaughtException(thread, th2);
            } else if (this.f21013l.isPrintUncaughtStackTrace()) {
                th2.printStackTrace();
            }
        }
    }

    UncaughtExceptionHandlerIntegration(InterfaceC8209u5 interfaceC8209u5) {
        this.f21014m = false;
        this.f21015n = (InterfaceC8209u5) C8229o.m18169c(interfaceC8209u5, "threadAdapter is required.");
    }
}
