package io.sentry;

import io.sentry.protocol.C8100q;
import io.sentry.protocol.C8114x;

/* renamed from: io.sentry.i0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7961i0 implements InterfaceC8025n0 {

    /* renamed from: a */
    private static final C7961i0 f21634a = new C7961i0();

    private C7961i0() {
    }

    /* renamed from: a */
    public static C7961i0 m19149a() {
        return f21634a;
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: b */
    public void mo18270b(long j) {
        C7896d3.m19411n(j);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: c */
    public /* synthetic */ void mo18269c(C7901e c7901e) {
        C8017m0.m19000a(this, c7901e);
    }

    @Override // io.sentry.InterfaceC8025n0
    public void close() {
        C7896d3.m19415j();
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: d */
    public C8100q mo18268d(C8020m3 c8020m3, C7831b0 c7831b0) {
        return C7896d3.m19410o().mo18268d(c8020m3, c7831b0);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: e */
    public /* synthetic */ C8100q mo18267e(C8114x c8114x, C8034n5 c8034n5, C7831b0 c7831b0) {
        return C8017m0.m18997d(this, c8114x, c8034n5, c7831b0);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: f */
    public void mo18266f(C7901e c7901e, C7831b0 c7831b0) {
        C7896d3.m19421d(c7901e, c7831b0);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: g */
    public void mo18265g(InterfaceC8164t2 interfaceC8164t2) {
        C7896d3.m19414k(interfaceC8164t2);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: h */
    public InterfaceC8259w0 mo18264h(C8125q5 c8125q5, C7934h c7934h, boolean z) {
        return C7896d3.m19400y(c8125q5, c7934h, z);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: i */
    public void mo18263i(Throwable th2, ISpan iSpan, String str) {
        C7896d3.m19410o().mo18263i(th2, iSpan, str);
    }

    @Override // io.sentry.InterfaceC8025n0
    public boolean isEnabled() {
        return C7896d3.m19405t();
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: j */
    public C8132r4 mo18262j() {
        return C7896d3.m19410o().mo18262j();
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: k */
    public C8100q mo18261k(String str, EnumC8021m4 enumC8021m4) {
        return C7896d3.m19416i(str, enumC8021m4);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: l */
    public /* synthetic */ InterfaceC8259w0 mo18260l(String str, String str2, C7934h c7934h) {
        return C8017m0.m18995f(this, str, str2, c7934h);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: m */
    public void mo18259m() {
        C7896d3.m19413l();
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: n */
    public /* synthetic */ C8100q mo18258n(C8020m3 c8020m3) {
        return C8017m0.m18999b(this, c8020m3);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: o */
    public C8100q mo18257o(C7923f4 c7923f4, C7831b0 c7831b0) {
        return C7896d3.m19419f(c7923f4, c7831b0);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: p */
    public /* synthetic */ InterfaceC8259w0 mo18256p(String str, String str2) {
        return C8017m0.m18996e(this, str, str2);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: q */
    public InterfaceC8259w0 mo18255q(C8125q5 c8125q5, C8160s5 c8160s5) {
        return C7896d3.m19399z(c8125q5, c8160s5);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: r */
    public Boolean mo18254r() {
        return C7896d3.m19406s();
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: s */
    public void mo18253s(InterfaceC8164t2 interfaceC8164t2) {
        C7896d3.m19425B(interfaceC8164t2);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: t */
    public /* synthetic */ C8100q mo18252t(Throwable th2) {
        return C8017m0.m18998c(this, th2);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: u */
    public /* synthetic */ InterfaceC8259w0 mo18251u(String str, String str2, C7934h c7934h, boolean z) {
        return C8017m0.m18994g(this, str, str2, c7934h, z);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: v */
    public C8100q mo18250v(Throwable th2, C7831b0 c7831b0) {
        return C7896d3.m19417h(th2, c7831b0);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: w */
    public C8100q mo18249w(C8114x c8114x, C8034n5 c8034n5, C7831b0 c7831b0, C8027n2 c8027n2) {
        return C7896d3.m19410o().mo18249w(c8114x, c8034n5, c7831b0, c8027n2);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: x */
    public void mo18248x() {
        C7896d3.m19401x();
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: clone */
    public InterfaceC8025n0 m42128clone() {
        return C7896d3.m19410o().clone();
    }
}