package com.discord.analytics;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.C9573g;
import kotlinx.coroutines.C9838p;
import kotlinx.coroutines.CancellableContinuation;
import p358u1.InterfaceC12816a;
import p388vf.C13272c;
import p388vf.C13277d;
import pf.C11583s;
import pf.C11586t;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, m14357d2 = {"await", "", "Lcom/android/installreferrer/api/InstallReferrerClient;", "(Lcom/android/installreferrer/api/InstallReferrerClient;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "analytics_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class InstallReferrerModuleKt {
    public static final Object await(InstallReferrerClient installReferrerClient, Continuation<? super Integer> continuation) {
        Continuation m2870c;
        Object m7596b;
        Object m2869d;
        m2870c = C13272c.m2870c(continuation);
        final C9838p c9838p = new C9838p(m2870c, 1);
        c9838p.m13155C();
        InterfaceC12816a interfaceC12816a = new InterfaceC12816a() { // from class: com.discord.analytics.InstallReferrerModuleKt$await$2$listener$1
            @Override // p358u1.InterfaceC12816a
            public void onInstallReferrerServiceDisconnected() {
                if (c9838p.mo13140a()) {
                    CancellableContinuation.C9665a.m13597a(c9838p, null, 1, null);
                }
            }

            @Override // p358u1.InterfaceC12816a
            public void onInstallReferrerSetupFinished(int i) {
                c9838p.resumeWith(C11583s.m7596b(Integer.valueOf(i)));
            }
        };
        c9838p.mo13135l(new InstallReferrerModuleKt$await$2$1(installReferrerClient));
        try {
            C11583s.C11584a c11584a = C11583s.f30090k;
            installReferrerClient.mo32436d(interfaceC12816a);
            m7596b = C11583s.m7596b(Unit.f25302a);
        } catch (Throwable th2) {
            C11583s.C11584a c11584a2 = C11583s.f30090k;
            m7596b = C11583s.m7596b(C11586t.m7587a(th2));
        }
        Throwable m7593e = C11583s.m7593e(m7596b);
        if (m7593e != null) {
            c9838p.resumeWith(C11583s.m7596b(C11586t.m7587a(m7593e)));
        }
        Object m13122y = c9838p.m13122y();
        m2869d = C13277d.m2869d();
        if (m13122y == m2869d) {
            C9573g.m13976c(continuation);
        }
        return m13122y;
    }
}