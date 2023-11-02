package io.sentry.util;

import io.sentry.C7891d;
import io.sentry.C8051p2;
import io.sentry.C8132r4;
import io.sentry.InterfaceC8025n0;
import io.sentry.InterfaceC8164t2;
import io.sentry.Scope;

/* renamed from: io.sentry.util.w */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8241w {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m18142d(C8132r4 c8132r4, Scope scope, C8051p2 c8051p2) {
        C7891d m18874b = c8051p2.m18874b();
        if (m18874b == null) {
            m18874b = new C7891d(c8132r4.getLogger());
            c8051p2.m18869g(m18874b);
        }
        if (m18874b.m19438p()) {
            m18874b.m19456A(scope, c8132r4);
            m18874b.m19453a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m18141e(Scope scope, C8051p2 c8051p2) {
        scope.m20089A(new C8051p2());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m18140f(final Scope scope) {
        scope.m20084F(new Scope.InterfaceC7679a() { // from class: io.sentry.util.v
            @Override // io.sentry.Scope.InterfaceC7679a
            /* renamed from: a */
            public final void mo18146a(C8051p2 c8051p2) {
                C8241w.m18141e(Scope.this, c8051p2);
            }
        });
    }

    /* renamed from: g */
    public static C8051p2 m18139g(final Scope scope, final C8132r4 c8132r4) {
        return scope.m20084F(new Scope.InterfaceC7679a() { // from class: io.sentry.util.t
            @Override // io.sentry.Scope.InterfaceC7679a
            /* renamed from: a */
            public final void mo18146a(C8051p2 c8051p2) {
                C8241w.m18142d(C8132r4.this, scope, c8051p2);
            }
        });
    }

    /* renamed from: h */
    public static void m18138h(InterfaceC8025n0 interfaceC8025n0) {
        interfaceC8025n0.mo18265g(new InterfaceC8164t2() { // from class: io.sentry.util.u
            @Override // io.sentry.InterfaceC8164t2
            /* renamed from: a */
            public final void mo18044a(Scope scope) {
                C8241w.m18140f(scope);
            }
        });
    }
}
