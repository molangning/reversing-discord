package ch;

import gi.InterfaceC6821n;
import kotlin.Lazy;
import kotlin.jvm.internal.C9612q;
import p086eh.C6227d;
import p305qg.InterfaceC11928h0;
import p468zg.C14265y;

/* renamed from: ch.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C2548g {

    /* renamed from: a */
    private final C2540b f6981a;

    /* renamed from: b */
    private final InterfaceC2553k f6982b;

    /* renamed from: c */
    private final Lazy<C14265y> f6983c;

    /* renamed from: d */
    private final Lazy f6984d;

    /* renamed from: e */
    private final C6227d f6985e;

    public C2548g(C2540b components, InterfaceC2553k typeParameterResolver, Lazy<C14265y> delegateForDefaultTypeQualifiers) {
        C9612q.m13917h(components, "components");
        C9612q.m13917h(typeParameterResolver, "typeParameterResolver");
        C9612q.m13917h(delegateForDefaultTypeQualifiers, "delegateForDefaultTypeQualifiers");
        this.f6981a = components;
        this.f6982b = typeParameterResolver;
        this.f6983c = delegateForDefaultTypeQualifiers;
        this.f6984d = delegateForDefaultTypeQualifiers;
        this.f6985e = new C6227d(this, typeParameterResolver);
    }

    /* renamed from: a */
    public final C2540b m33014a() {
        return this.f6981a;
    }

    /* renamed from: b */
    public final C14265y m33013b() {
        return (C14265y) this.f6984d.getValue();
    }

    /* renamed from: c */
    public final Lazy<C14265y> m33012c() {
        return this.f6983c;
    }

    /* renamed from: d */
    public final InterfaceC11928h0 m33011d() {
        return this.f6981a.m33037m();
    }

    /* renamed from: e */
    public final InterfaceC6821n m33010e() {
        return this.f6981a.m33029u();
    }

    /* renamed from: f */
    public final InterfaceC2553k m33009f() {
        return this.f6982b;
    }

    /* renamed from: g */
    public final C6227d m33008g() {
        return this.f6985e;
    }
}