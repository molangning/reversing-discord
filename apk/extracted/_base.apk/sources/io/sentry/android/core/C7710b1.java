package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.recyclerview.widget.RecyclerView;
import io.sentry.C7836b5;
import io.sentry.C7898d4;
import io.sentry.C7923f4;
import io.sentry.C7961i0;
import io.sentry.C7991j;
import io.sentry.C8020m3;
import io.sentry.C8132r4;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8025n0;
import io.sentry.InterfaceC8040o0;
import io.sentry.InterfaceC8164t2;
import io.sentry.InterfaceC8243v0;
import io.sentry.Scope;
import io.sentry.protocol.C8060a;
import io.sentry.protocol.C8062a0;
import io.sentry.protocol.C8100q;
import io.sentry.util.C8228n;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.sentry.android.core.b1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7710b1 {
    /* renamed from: c */
    public static C8100q m19925c(byte[] bArr) {
        C7961i0 m19149a = C7961i0.m19149a();
        C8132r4 mo18262j = m19149a.mo18262j();
        try {
            InterfaceC8243v0 serializer = mo18262j.getSerializer();
            C8020m3 mo18354a = mo18262j.getEnvelopeReader().mo18354a(new ByteArrayInputStream(bArr));
            if (mo18354a == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            C7836b5.EnumC7838b enumC7838b = null;
            for (C7898d4 c7898d4 : mo18354a.m18986c()) {
                arrayList.add(c7898d4);
                C7923f4 m19360x = c7898d4.m19360x(serializer);
                if (m19360x != null) {
                    if (m19360x.m19191v0()) {
                        enumC7838b = C7836b5.EnumC7838b.Crashed;
                    }
                    if (m19360x.m19191v0() || m19360x.m19190w0()) {
                        z = true;
                    }
                }
            }
            C7836b5 m19920h = m19920h(m19149a, mo18262j, enumC7838b, z);
            if (m19920h != null) {
                arrayList.add(C7898d4.m19363u(serializer, m19920h));
            }
            return m19149a.mo18258n(new C8020m3(mo18354a.m18987b(), arrayList));
        } catch (Throwable th2) {
            mo18262j.getLogger().mo18136b(EnumC8021m4.ERROR, "Failed to capture envelope", th2);
            return null;
        }
    }

    /* renamed from: d */
    public static Scope m19924d() {
        final AtomicReference atomicReference = new AtomicReference();
        C7961i0.m19149a().mo18265g(new InterfaceC8164t2() { // from class: io.sentry.android.core.a1
            @Override // io.sentry.InterfaceC8164t2
            /* renamed from: a */
            public final void mo18044a(Scope scope) {
                C7710b1.m19923e(atomicReference, scope);
            }
        });
        return (Scope) atomicReference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ void m19923e(AtomicReference atomicReference, Scope scope) {
        atomicReference.set(new Scope(scope));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ void m19922f(C7836b5.EnumC7838b enumC7838b, boolean z, AtomicReference atomicReference, C8132r4 c8132r4, Scope scope) {
        C7836b5 m20064r = scope.m20064r();
        if (m20064r != null) {
            if (m20064r.m19570q(enumC7838b, null, z, null)) {
                if (m20064r.m19575l() == C7836b5.EnumC7838b.Crashed) {
                    m20064r.m19584c();
                }
                atomicReference.set(m20064r);
                return;
            }
            return;
        }
        c8132r4.getLogger().mo18135c(EnumC8021m4.INFO, "Session is null on updateSession", new Object[0]);
    }

    /* renamed from: g */
    public static Map<String, Object> m19921g(Context context, SentryAndroidOptions sentryAndroidOptions, Scope scope) {
        HashMap hashMap = new HashMap();
        if (scope == null) {
            return hashMap;
        }
        try {
            InterfaceC8040o0 logger = sentryAndroidOptions.getLogger();
            C8228n c8228n = new C8228n(hashMap);
            C7813u0 m19644p = C7813u0.m19644p(context, sentryAndroidOptions);
            scope.m20071k().m18795i(m19644p.m19659a(true, true));
            scope.m20071k().m18793k(m19644p.m19642r());
            C8062a0 m20059w = scope.m20059w();
            if (m20059w == null) {
                m20059w = new C8062a0();
                scope.m20086D(m20059w);
            }
            if (m20059w.m18820l() == null) {
                try {
                    m20059w.m18814r(C7823y0.m19620a(context));
                } catch (RuntimeException e) {
                    logger.mo18136b(EnumC8021m4.ERROR, "Could not retrieve installation ID", e);
                }
            }
            if (scope.m20071k().m18802a() == null) {
                C8060a c8060a = new C8060a();
                c8060a.m18838m(C7803q0.m19698b(context, sentryAndroidOptions.getLogger()));
                c8060a.m18837n(C7991j.m19077n(C7792m0.m19723e().m19724d()));
                C7798o0 c7798o0 = new C7798o0(sentryAndroidOptions.getLogger());
                PackageInfo m19691i = C7803q0.m19691i(context, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT, sentryAndroidOptions.getLogger(), c7798o0);
                if (m19691i != null) {
                    C7803q0.m19685o(m19691i, c7798o0, c8060a);
                }
                scope.m20071k().m18797g(c8060a);
            }
            c8228n.mo18193e("user").mo18188j(logger, scope.m20059w());
            c8228n.mo18193e("contexts").mo18188j(logger, scope.m20071k());
            c8228n.mo18193e("tags").mo18188j(logger, scope.m20062t());
            c8228n.mo18193e("extras").mo18188j(logger, scope.m20069m());
            c8228n.mo18193e("fingerprint").mo18188j(logger, scope.m20068n());
            c8228n.mo18193e("level").mo18188j(logger, scope.m20067o());
            c8228n.mo18193e("breadcrumbs").mo18188j(logger, scope.m20072j());
            return hashMap;
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().mo18136b(EnumC8021m4.ERROR, "Could not serialize scope.", th2);
            return new HashMap();
        }
    }

    /* renamed from: h */
    private static C7836b5 m19920h(InterfaceC8025n0 interfaceC8025n0, final C8132r4 c8132r4, final C7836b5.EnumC7838b enumC7838b, final boolean z) {
        final AtomicReference atomicReference = new AtomicReference();
        interfaceC8025n0.mo18265g(new InterfaceC8164t2() { // from class: io.sentry.android.core.z0
            @Override // io.sentry.InterfaceC8164t2
            /* renamed from: a */
            public final void mo18044a(Scope scope) {
                C7710b1.m19922f(C7836b5.EnumC7838b.this, z, atomicReference, c8132r4, scope);
            }
        });
        return (C7836b5) atomicReference.get();
    }
}
