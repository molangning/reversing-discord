package io.sentry;

import io.sentry.vendor.gson.stream.C8256c;
import java.io.Writer;

/* renamed from: io.sentry.l1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8008l1 implements InterfaceC7919f2 {

    /* renamed from: a */
    private final C8256c f21693a;

    /* renamed from: b */
    private final C8001k1 f21694b;

    public C8008l1(Writer writer, int i) {
        this.f21693a = new C8256c(writer);
        this.f21694b = new C8001k1(i);
    }

    @Override // io.sentry.InterfaceC7919f2
    /* renamed from: m */
    public C8008l1 mo18192f() {
        this.f21693a.m18071i();
        return this;
    }

    @Override // io.sentry.InterfaceC7919f2
    /* renamed from: n */
    public C8008l1 mo18195c() {
        this.f21693a.m18070j();
        return this;
    }

    @Override // io.sentry.InterfaceC7919f2
    /* renamed from: o */
    public C8008l1 mo18194d() {
        this.f21693a.m18068o();
        return this;
    }

    @Override // io.sentry.InterfaceC7919f2
    /* renamed from: p */
    public C8008l1 mo18190h() {
        this.f21693a.m18067q();
        return this;
    }

    @Override // io.sentry.InterfaceC7919f2
    /* renamed from: q */
    public C8008l1 mo18193e(String str) {
        this.f21693a.m18066s(str);
        return this;
    }

    @Override // io.sentry.InterfaceC7919f2
    /* renamed from: r */
    public C8008l1 mo18186l() {
        this.f21693a.m18064v();
        return this;
    }

    /* renamed from: s */
    public void m19016s(String str) {
        this.f21693a.m18081Q(str);
    }

    @Override // io.sentry.InterfaceC7919f2
    /* renamed from: t */
    public C8008l1 mo18197a(long j) {
        this.f21693a.m18079S(j);
        return this;
    }

    @Override // io.sentry.InterfaceC7919f2
    /* renamed from: u */
    public C8008l1 mo18188j(InterfaceC8040o0 interfaceC8040o0, Object obj) {
        this.f21694b.m19038a(this, interfaceC8040o0, obj);
        return this;
    }

    @Override // io.sentry.InterfaceC7919f2
    /* renamed from: v */
    public C8008l1 mo18187k(Boolean bool) {
        this.f21693a.m18078U(bool);
        return this;
    }

    @Override // io.sentry.InterfaceC7919f2
    /* renamed from: w */
    public C8008l1 mo18189i(Number number) {
        this.f21693a.m18077V(number);
        return this;
    }

    @Override // io.sentry.InterfaceC7919f2
    /* renamed from: x */
    public C8008l1 mo18191g(String str) {
        this.f21693a.m18076Y(str);
        return this;
    }

    @Override // io.sentry.InterfaceC7919f2
    /* renamed from: y */
    public C8008l1 mo18196b(boolean z) {
        this.f21693a.m18074b0(z);
        return this;
    }
}