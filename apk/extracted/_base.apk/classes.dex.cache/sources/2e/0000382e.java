package io.sentry.android.core;

import io.sentry.C7687a1;
import io.sentry.C7994j2;
import io.sentry.C8132r4;
import io.sentry.EnumC8021m4;
import io.sentry.Integration;
import io.sentry.InterfaceC8025n0;
import io.sentry.InterfaceC8040o0;
import io.sentry.util.C8229o;
import java.io.Closeable;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class EnvelopeFileObserverIntegration implements Integration, Closeable {

    /* renamed from: j */
    private FileObserverC7818w0 f21067j;

    /* renamed from: k */
    private InterfaceC8040o0 f21068k;

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class OutboxEnvelopeFileObserverIntegration extends EnvelopeFileObserverIntegration {
        private OutboxEnvelopeFileObserverIntegration() {
        }

        @Override // io.sentry.android.core.EnvelopeFileObserverIntegration
        /* renamed from: j */
        protected String mo19975j(C8132r4 c8132r4) {
            return c8132r4.getOutboxPath();
        }
    }

    /* renamed from: i */
    public static EnvelopeFileObserverIntegration m19976i() {
        return new OutboxEnvelopeFileObserverIntegration();
    }

    @Override // io.sentry.Integration
    /* renamed from: a */
    public final void mo19952a(InterfaceC8025n0 interfaceC8025n0, C8132r4 c8132r4) {
        C8229o.m18169c(interfaceC8025n0, "Hub is required");
        C8229o.m18169c(c8132r4, "SentryOptions is required");
        this.f21068k = c8132r4.getLogger();
        String mo19975j = mo19975j(c8132r4);
        if (mo19975j == null) {
            this.f21068k.mo18135c(EnumC8021m4.WARNING, "Null given as a path to EnvelopeFileObserverIntegration. Nothing will be registered.", new Object[0]);
            return;
        }
        InterfaceC8040o0 interfaceC8040o0 = this.f21068k;
        EnumC8021m4 enumC8021m4 = EnumC8021m4.DEBUG;
        interfaceC8040o0.mo18135c(enumC8021m4, "Registering EnvelopeFileObserverIntegration for path: %s", mo19975j);
        FileObserverC7818w0 fileObserverC7818w0 = new FileObserverC7818w0(mo19975j, new C7994j2(interfaceC8025n0, c8132r4.getEnvelopeReader(), c8132r4.getSerializer(), this.f21068k, c8132r4.getFlushTimeoutMillis()), this.f21068k, c8132r4.getFlushTimeoutMillis());
        this.f21067j = fileObserverC7818w0;
        try {
            fileObserverC7818w0.startWatching();
            this.f21068k.mo18135c(enumC8021m4, "EnvelopeFileObserverIntegration installed.", new Object[0]);
        } catch (Throwable th2) {
            c8132r4.getLogger().mo18136b(EnumC8021m4.ERROR, "Failed to initialize EnvelopeFileObserverIntegration.", th2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        FileObserverC7818w0 fileObserverC7818w0 = this.f21067j;
        if (fileObserverC7818w0 != null) {
            fileObserverC7818w0.stopWatching();
            InterfaceC8040o0 interfaceC8040o0 = this.f21068k;
            if (interfaceC8040o0 != null) {
                interfaceC8040o0.mo18135c(EnumC8021m4.DEBUG, "EnvelopeFileObserverIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.InterfaceC7832b1
    /* renamed from: h */
    public /* synthetic */ String mo19588h() {
        return C7687a1.m20045b(this);
    }

    /* renamed from: j */
    abstract String mo19975j(C8132r4 c8132r4);
}