package io.sentry;

import io.sentry.protocol.C8100q;

/* renamed from: io.sentry.p2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8051p2 {

    /* renamed from: a */
    private C8100q f21792a;

    /* renamed from: b */
    private C7932g5 f21793b;

    /* renamed from: c */
    private C7932g5 f21794c;

    /* renamed from: d */
    private Boolean f21795d;

    /* renamed from: e */
    private C7891d f21796e;

    public C8051p2() {
        this(new C8100q(), new C7932g5(), null, null, null);
    }

    /* renamed from: a */
    private static C7891d m18875a(C7891d c7891d) {
        if (c7891d != null) {
            return new C7891d(c7891d);
        }
        return null;
    }

    /* renamed from: b */
    public C7891d m18874b() {
        return this.f21796e;
    }

    /* renamed from: c */
    public C7932g5 m18873c() {
        return this.f21794c;
    }

    /* renamed from: d */
    public C7932g5 m18872d() {
        return this.f21793b;
    }

    /* renamed from: e */
    public C8100q m18871e() {
        return this.f21792a;
    }

    /* renamed from: f */
    public Boolean m18870f() {
        return this.f21795d;
    }

    /* renamed from: g */
    public void m18869g(C7891d c7891d) {
        this.f21796e = c7891d;
    }

    /* renamed from: h */
    public C8034n5 m18868h() {
        C7891d c7891d = this.f21796e;
        if (c7891d != null) {
            return c7891d.m19454C();
        }
        return null;
    }

    public C8051p2(C8051p2 c8051p2) {
        this(c8051p2.m18871e(), c8051p2.m18872d(), c8051p2.m18873c(), m18875a(c8051p2.m18874b()), c8051p2.m18870f());
    }

    public C8051p2(C8100q c8100q, C7932g5 c7932g5, C7932g5 c7932g52, C7891d c7891d, Boolean bool) {
        this.f21792a = c8100q;
        this.f21793b = c7932g5;
        this.f21794c = c7932g52;
        this.f21796e = c7891d;
        this.f21795d = bool;
    }
}