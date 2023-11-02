package ec;

import com.google.firebase.messaging.AbstractC5087g0;
import p353tb.InterfaceC12629d;

/* renamed from: ec.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6201b {

    /* renamed from: b */
    private static final C6201b f17573b = new C6202a().m23285a();

    /* renamed from: a */
    private final C6196a f17574a;

    /* renamed from: ec.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C6202a {

        /* renamed from: a */
        private C6196a f17575a = null;

        C6202a() {
        }

        /* renamed from: a */
        public C6201b m23285a() {
            return new C6201b(this.f17575a);
        }

        /* renamed from: b */
        public C6202a m23284b(C6196a c6196a) {
            this.f17575a = c6196a;
            return this;
        }
    }

    C6201b(C6196a c6196a) {
        this.f17574a = c6196a;
    }

    /* renamed from: b */
    public static C6202a m23287b() {
        return new C6202a();
    }

    @InterfaceC12629d(tag = 1)
    /* renamed from: a */
    public C6196a m23288a() {
        return this.f17574a;
    }

    /* renamed from: c */
    public byte[] m23286c() {
        return AbstractC5087g0.m26235a(this);
    }
}
