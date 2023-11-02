package io.sentry;

import io.sentry.protocol.C8100q;

/* renamed from: io.sentry.a2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7688a2 implements ISpan {

    /* renamed from: a */
    private static final C7688a2 f21018a = new C7688a2();

    private C7688a2() {
    }

    /* renamed from: t */
    public static C7688a2 m20044t() {
        return f21018a;
    }

    @Override // io.sentry.ISpan
    /* renamed from: a */
    public boolean mo17951a() {
        return false;
    }

    @Override // io.sentry.ISpan
    /* renamed from: b */
    public EnumC7975i5 mo17950b() {
        return null;
    }

    @Override // io.sentry.ISpan
    /* renamed from: c */
    public void mo17949c() {
    }

    @Override // io.sentry.ISpan
    /* renamed from: d */
    public void mo17948d(String str) {
    }

    @Override // io.sentry.ISpan
    /* renamed from: f */
    public ISpan mo17946f(String str) {
        return m20044t();
    }

    @Override // io.sentry.ISpan
    public String getDescription() {
        return null;
    }

    @Override // io.sentry.ISpan
    /* renamed from: i */
    public boolean mo17943i(AbstractC8003k3 abstractC8003k3) {
        return false;
    }

    @Override // io.sentry.ISpan
    /* renamed from: j */
    public void mo17942j(EnumC7975i5 enumC7975i5) {
    }

    @Override // io.sentry.ISpan
    /* renamed from: m */
    public void mo17939m(String str, Number number, InterfaceC8128r1 interfaceC8128r1) {
    }

    @Override // io.sentry.ISpan
    /* renamed from: p */
    public C7911e5 mo17936p() {
        return new C7911e5(C8100q.f21957k, C7932g5.f21612k, "op", null, null);
    }

    @Override // io.sentry.ISpan
    /* renamed from: q */
    public AbstractC8003k3 mo17935q() {
        return new C8053p4();
    }

    @Override // io.sentry.ISpan
    /* renamed from: r */
    public void mo17934r(EnumC7975i5 enumC7975i5, AbstractC8003k3 abstractC8003k3) {
    }

    @Override // io.sentry.ISpan
    /* renamed from: s */
    public AbstractC8003k3 mo17933s() {
        return new C8053p4();
    }
}