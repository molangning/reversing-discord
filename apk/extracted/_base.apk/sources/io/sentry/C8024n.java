package io.sentry;

import io.sentry.util.C8229o;

/* renamed from: io.sentry.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8024n implements InterfaceC8040o0 {

    /* renamed from: a */
    private final C8132r4 f21710a;

    /* renamed from: b */
    private final InterfaceC8040o0 f21711b;

    public C8024n(C8132r4 c8132r4, InterfaceC8040o0 interfaceC8040o0) {
        this.f21710a = (C8132r4) C8229o.m18169c(c8132r4, "SentryOptions is required.");
        this.f21711b = interfaceC8040o0;
    }

    @Override // io.sentry.InterfaceC8040o0
    /* renamed from: a */
    public void mo18137a(EnumC8021m4 enumC8021m4, Throwable th2, String str, Object... objArr) {
        if (this.f21711b != null && mo18134d(enumC8021m4)) {
            this.f21711b.mo18137a(enumC8021m4, th2, str, objArr);
        }
    }

    @Override // io.sentry.InterfaceC8040o0
    /* renamed from: b */
    public void mo18136b(EnumC8021m4 enumC8021m4, String str, Throwable th2) {
        if (this.f21711b != null && mo18134d(enumC8021m4)) {
            this.f21711b.mo18136b(enumC8021m4, str, th2);
        }
    }

    @Override // io.sentry.InterfaceC8040o0
    /* renamed from: c */
    public void mo18135c(EnumC8021m4 enumC8021m4, String str, Object... objArr) {
        if (this.f21711b != null && mo18134d(enumC8021m4)) {
            this.f21711b.mo18135c(enumC8021m4, str, objArr);
        }
    }

    @Override // io.sentry.InterfaceC8040o0
    /* renamed from: d */
    public boolean mo18134d(EnumC8021m4 enumC8021m4) {
        EnumC8021m4 diagnosticLevel = this.f21710a.getDiagnosticLevel();
        if (enumC8021m4 == null || !this.f21710a.isDebug() || enumC8021m4.ordinal() < diagnosticLevel.ordinal()) {
            return false;
        }
        return true;
    }
}
