package com.google.firebase.messaging;

import ec.C6196a;
import ec.C6201b;
import p300qb.C11816c;
import p300qb.InterfaceC11819d;
import p300qb.InterfaceC11820e;
import p321rb.InterfaceC12120a;
import p321rb.InterfaceC12121b;
import p353tb.C12625a;

/* renamed from: com.google.firebase.messaging.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5061a implements InterfaceC12120a {

    /* renamed from: a */
    public static final InterfaceC12120a f14289a = new C5061a();

    /* renamed from: com.google.firebase.messaging.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C5062a implements InterfaceC11819d<C6196a> {

        /* renamed from: a */
        static final C5062a f14290a = new C5062a();

        /* renamed from: b */
        private static final C11816c f14291b = C11816c.m6833a("projectNumber").m6828b(C12625a.m4698b().m4697c(1).m4699a()).m6829a();

        /* renamed from: c */
        private static final C11816c f14292c = C11816c.m6833a("messageId").m6828b(C12625a.m4698b().m4697c(2).m4699a()).m6829a();

        /* renamed from: d */
        private static final C11816c f14293d = C11816c.m6833a("instanceId").m6828b(C12625a.m4698b().m4697c(3).m4699a()).m6829a();

        /* renamed from: e */
        private static final C11816c f14294e = C11816c.m6833a("messageType").m6828b(C12625a.m4698b().m4697c(4).m4699a()).m6829a();

        /* renamed from: f */
        private static final C11816c f14295f = C11816c.m6833a("sdkPlatform").m6828b(C12625a.m4698b().m4697c(5).m4699a()).m6829a();

        /* renamed from: g */
        private static final C11816c f14296g = C11816c.m6833a("packageName").m6828b(C12625a.m4698b().m4697c(6).m4699a()).m6829a();

        /* renamed from: h */
        private static final C11816c f14297h = C11816c.m6833a("collapseKey").m6828b(C12625a.m4698b().m4697c(7).m4699a()).m6829a();

        /* renamed from: i */
        private static final C11816c f14298i = C11816c.m6833a("priority").m6828b(C12625a.m4698b().m4697c(8).m4699a()).m6829a();

        /* renamed from: j */
        private static final C11816c f14299j = C11816c.m6833a("ttl").m6828b(C12625a.m4698b().m4697c(9).m4699a()).m6829a();

        /* renamed from: k */
        private static final C11816c f14300k = C11816c.m6833a("topic").m6828b(C12625a.m4698b().m4697c(10).m4699a()).m6829a();

        /* renamed from: l */
        private static final C11816c f14301l = C11816c.m6833a("bulkId").m6828b(C12625a.m4698b().m4697c(11).m4699a()).m6829a();

        /* renamed from: m */
        private static final C11816c f14302m = C11816c.m6833a("event").m6828b(C12625a.m4698b().m4697c(12).m4699a()).m6829a();

        /* renamed from: n */
        private static final C11816c f14303n = C11816c.m6833a("analyticsLabel").m6828b(C12625a.m4698b().m4697c(13).m4699a()).m6829a();

        /* renamed from: o */
        private static final C11816c f14304o = C11816c.m6833a("campaignId").m6828b(C12625a.m4698b().m4697c(14).m4699a()).m6829a();

        /* renamed from: p */
        private static final C11816c f14305p = C11816c.m6833a("composerLabel").m6828b(C12625a.m4698b().m4697c(15).m4699a()).m6829a();

        private C5062a() {
        }

        @Override // p300qb.InterfaceC11819d
        /* renamed from: b */
        public void mo3313a(C6196a c6196a, InterfaceC11820e interfaceC11820e) {
            interfaceC11820e.mo4694b(f14291b, c6196a.m23306l());
            interfaceC11820e.mo4693c(f14292c, c6196a.m23310h());
            interfaceC11820e.mo4693c(f14293d, c6196a.m23311g());
            interfaceC11820e.mo4693c(f14294e, c6196a.m23309i());
            interfaceC11820e.mo4693c(f14295f, c6196a.m23305m());
            interfaceC11820e.mo4693c(f14296g, c6196a.m23308j());
            interfaceC11820e.mo4693c(f14297h, c6196a.m23314d());
            interfaceC11820e.mo4695a(f14298i, c6196a.m23307k());
            interfaceC11820e.mo4695a(f14299j, c6196a.m23303o());
            interfaceC11820e.mo4693c(f14300k, c6196a.m23304n());
            interfaceC11820e.mo4694b(f14301l, c6196a.m23316b());
            interfaceC11820e.mo4693c(f14302m, c6196a.m23312f());
            interfaceC11820e.mo4693c(f14303n, c6196a.m23317a());
            interfaceC11820e.mo4694b(f14304o, c6196a.m23315c());
            interfaceC11820e.mo4693c(f14305p, c6196a.m23313e());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C5063b implements InterfaceC11819d<C6201b> {

        /* renamed from: a */
        static final C5063b f14306a = new C5063b();

        /* renamed from: b */
        private static final C11816c f14307b = C11816c.m6833a("messagingClientEvent").m6828b(C12625a.m4698b().m4697c(1).m4699a()).m6829a();

        private C5063b() {
        }

        @Override // p300qb.InterfaceC11819d
        /* renamed from: b */
        public void mo3313a(C6201b c6201b, InterfaceC11820e interfaceC11820e) {
            interfaceC11820e.mo4693c(f14307b, c6201b.m23288a());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C5064c implements InterfaceC11819d<AbstractC5087g0> {

        /* renamed from: a */
        static final C5064c f14308a = new C5064c();

        /* renamed from: b */
        private static final C11816c f14309b = C11816c.m6830d("messagingClientEventExtension");

        private C5064c() {
        }

        @Override // p300qb.InterfaceC11819d
        /* renamed from: b */
        public void mo3313a(AbstractC5087g0 abstractC5087g0, InterfaceC11820e interfaceC11820e) {
            interfaceC11820e.mo4693c(f14309b, abstractC5087g0.m26234b());
        }
    }

    private C5061a() {
    }

    @Override // p321rb.InterfaceC12120a
    /* renamed from: a */
    public void mo3320a(InterfaceC12121b<?> interfaceC12121b) {
        interfaceC12121b.mo4670a(AbstractC5087g0.class, C5064c.f14308a);
        interfaceC12121b.mo4670a(C6201b.class, C5063b.f14306a);
        interfaceC12121b.mo4670a(C6196a.class, C5062a.f14290a);
    }
}