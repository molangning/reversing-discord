package io.sentry;

import io.sentry.protocol.C8100q;
import io.sentry.protocol.C8114x;

/* renamed from: io.sentry.n0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC8025n0 {
    /* renamed from: b */
    void mo18270b(long j);

    /* renamed from: c */
    void mo18269c(C7901e c7901e);

    InterfaceC8025n0 clone();

    void close();

    /* renamed from: d */
    C8100q mo18268d(C8020m3 c8020m3, C7831b0 c7831b0);

    /* renamed from: e */
    C8100q mo18267e(C8114x c8114x, C8034n5 c8034n5, C7831b0 c7831b0);

    /* renamed from: f */
    void mo18266f(C7901e c7901e, C7831b0 c7831b0);

    /* renamed from: g */
    void mo18265g(InterfaceC8164t2 interfaceC8164t2);

    /* renamed from: h */
    InterfaceC8259w0 mo18264h(C8125q5 c8125q5, C7934h c7934h, boolean z);

    /* renamed from: i */
    void mo18263i(Throwable th2, ISpan iSpan, String str);

    boolean isEnabled();

    /* renamed from: j */
    C8132r4 mo18262j();

    /* renamed from: k */
    C8100q mo18261k(String str, EnumC8021m4 enumC8021m4);

    /* renamed from: l */
    InterfaceC8259w0 mo18260l(String str, String str2, C7934h c7934h);

    /* renamed from: m */
    void mo18259m();

    /* renamed from: n */
    C8100q mo18258n(C8020m3 c8020m3);

    /* renamed from: o */
    C8100q mo18257o(C7923f4 c7923f4, C7831b0 c7831b0);

    /* renamed from: p */
    InterfaceC8259w0 mo18256p(String str, String str2);

    /* renamed from: q */
    InterfaceC8259w0 mo18255q(C8125q5 c8125q5, C8160s5 c8160s5);

    /* renamed from: r */
    Boolean mo18254r();

    /* renamed from: s */
    void mo18253s(InterfaceC8164t2 interfaceC8164t2);

    /* renamed from: t */
    C8100q mo18252t(Throwable th2);

    /* renamed from: u */
    InterfaceC8259w0 mo18251u(String str, String str2, C7934h c7934h, boolean z);

    /* renamed from: v */
    C8100q mo18250v(Throwable th2, C7831b0 c7831b0);

    /* renamed from: w */
    C8100q mo18249w(C8114x c8114x, C8034n5 c8034n5, C7831b0 c7831b0, C8027n2 c8027n2);

    /* renamed from: x */
    void mo18248x();
}