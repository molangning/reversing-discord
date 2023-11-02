package io.sentry;

import io.sentry.protocol.C8100q;
import io.sentry.protocol.C8114x;

/* renamed from: io.sentry.u1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8205u1 implements InterfaceC8025n0 {

    /* renamed from: b */
    private static final C8205u1 f22136b = new C8205u1();

    /* renamed from: a */
    private final C8132r4 f22137a = C8132r4.empty();

    private C8205u1() {
    }

    /* renamed from: a */
    public static C8205u1 m18271a() {
        return f22136b;
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: b */
    public void mo18270b(long j) {
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: c */
    public /* synthetic */ void mo18269c(C7901e c7901e) {
        C8017m0.m19000a(this, c7901e);
    }

    @Override // io.sentry.InterfaceC8025n0
    public void close() {
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: d */
    public C8100q mo18268d(C8020m3 c8020m3, C7831b0 c7831b0) {
        return C8100q.f21957k;
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: e */
    public /* synthetic */ C8100q mo18267e(C8114x c8114x, C8034n5 c8034n5, C7831b0 c7831b0) {
        return C8017m0.m18997d(this, c8114x, c8034n5, c7831b0);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: f */
    public void mo18266f(C7901e c7901e, C7831b0 c7831b0) {
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: g */
    public void mo18265g(InterfaceC8164t2 interfaceC8164t2) {
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: h */
    public InterfaceC8259w0 mo18264h(C8125q5 c8125q5, C7934h c7934h, boolean z) {
        return C7833b2.m19587t();
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: i */
    public void mo18263i(Throwable th2, ISpan iSpan, String str) {
    }

    @Override // io.sentry.InterfaceC8025n0
    public boolean isEnabled() {
        return false;
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: j */
    public C8132r4 mo18262j() {
        return this.f22137a;
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: k */
    public C8100q mo18261k(String str, EnumC8021m4 enumC8021m4) {
        return C8100q.f21957k;
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: l */
    public /* synthetic */ InterfaceC8259w0 mo18260l(String str, String str2, C7934h c7934h) {
        return C8017m0.m18995f(this, str, str2, c7934h);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: m */
    public void mo18259m() {
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: n */
    public /* synthetic */ C8100q mo18258n(C8020m3 c8020m3) {
        return C8017m0.m18999b(this, c8020m3);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: o */
    public C8100q mo18257o(C7923f4 c7923f4, C7831b0 c7831b0) {
        return C8100q.f21957k;
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: p */
    public /* synthetic */ InterfaceC8259w0 mo18256p(String str, String str2) {
        return C8017m0.m18996e(this, str, str2);
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: q */
    public InterfaceC8259w0 mo18255q(C8125q5 c8125q5, C8160s5 c8160s5) {
        return C7833b2.m19587t();
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: r */
    public Boolean mo18254r() {
        return null;
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: s */
    public void mo18253s(InterfaceC8164t2 interfaceC8164t2) {
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
        return C8100q.f21957k;
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: w */
    public C8100q mo18249w(C8114x c8114x, C8034n5 c8034n5, C7831b0 c7831b0, C8027n2 c8027n2) {
        return C8100q.f21957k;
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: x */
    public void mo18248x() {
    }

    @Override // io.sentry.InterfaceC8025n0
    /* renamed from: clone */
    public InterfaceC8025n0 m42129clone() {
        return f22136b;
    }
}