package io.sentry;

import io.sentry.util.C8229o;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.sentry.j5 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7997j5 {

    /* renamed from: a */
    private final Deque<C7998a> f21676a;

    /* renamed from: b */
    private final InterfaceC8040o0 f21677b;

    public C7997j5(InterfaceC8040o0 interfaceC8040o0, C7998a c7998a) {
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        this.f21676a = linkedBlockingDeque;
        this.f21677b = (InterfaceC8040o0) C8229o.m18169c(interfaceC8040o0, "logger is required");
        linkedBlockingDeque.push((C7998a) C8229o.m18169c(c7998a, "rootStackItem is required"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C7998a m19044a() {
        return this.f21676a.peek();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m19043b() {
        synchronized (this.f21676a) {
            if (this.f21676a.size() != 1) {
                this.f21676a.pop();
            } else {
                this.f21677b.mo18135c(EnumC8021m4.WARNING, "Attempt to pop the root scope.", new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m19042c(C7998a c7998a) {
        this.f21676a.push(c7998a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.sentry.j5$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7998a {

        /* renamed from: a */
        private final C8132r4 f21678a;

        /* renamed from: b */
        private volatile InterfaceC8162t0 f21679b;

        /* renamed from: c */
        private volatile Scope f21680c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C7998a(C8132r4 c8132r4, InterfaceC8162t0 interfaceC8162t0, Scope scope) {
            this.f21679b = (InterfaceC8162t0) C8229o.m18169c(interfaceC8162t0, "ISentryClient is required.");
            this.f21680c = (Scope) C8229o.m18169c(scope, "Scope is required.");
            this.f21678a = (C8132r4) C8229o.m18169c(c8132r4, "Options is required");
        }

        /* renamed from: a */
        public InterfaceC8162t0 m19041a() {
            return this.f21679b;
        }

        /* renamed from: b */
        public C8132r4 m19040b() {
            return this.f21678a;
        }

        /* renamed from: c */
        public Scope m19039c() {
            return this.f21680c;
        }

        C7998a(C7998a c7998a) {
            this.f21678a = c7998a.f21678a;
            this.f21679b = c7998a.f21679b;
            this.f21680c = new Scope(c7998a.f21680c);
        }
    }

    public C7997j5(C7997j5 c7997j5) {
        this(c7997j5.f21677b, new C7998a(c7997j5.f21676a.getLast()));
        Iterator<C7998a> descendingIterator = c7997j5.f21676a.descendingIterator();
        if (descendingIterator.hasNext()) {
            descendingIterator.next();
        }
        while (descendingIterator.hasNext()) {
            m19042c(new C7998a(descendingIterator.next()));
        }
    }
}
