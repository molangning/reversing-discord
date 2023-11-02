package p458z5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p353tb.InterfaceC12629d;
import p381v5.AbstractC13098l;

/* renamed from: z5.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C14089a {

    /* renamed from: e */
    private static final C14089a f36246e = new C14090a().m695b();

    /* renamed from: a */
    private final C14100f f36247a;

    /* renamed from: b */
    private final List<C14096d> f36248b;

    /* renamed from: c */
    private final C14091b f36249c;

    /* renamed from: d */
    private final String f36250d;

    /* renamed from: z5.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C14090a {

        /* renamed from: a */
        private C14100f f36251a = null;

        /* renamed from: b */
        private List<C14096d> f36252b = new ArrayList();

        /* renamed from: c */
        private C14091b f36253c = null;

        /* renamed from: d */
        private String f36254d = "";

        C14090a() {
        }

        /* renamed from: a */
        public C14090a m696a(C14096d c14096d) {
            this.f36252b.add(c14096d);
            return this;
        }

        /* renamed from: b */
        public C14089a m695b() {
            return new C14089a(this.f36251a, Collections.unmodifiableList(this.f36252b), this.f36253c, this.f36254d);
        }

        /* renamed from: c */
        public C14090a m694c(String str) {
            this.f36254d = str;
            return this;
        }

        /* renamed from: d */
        public C14090a m693d(C14091b c14091b) {
            this.f36253c = c14091b;
            return this;
        }

        /* renamed from: e */
        public C14090a m692e(C14100f c14100f) {
            this.f36251a = c14100f;
            return this;
        }
    }

    C14089a(C14100f c14100f, List<C14096d> list, C14091b c14091b, String str) {
        this.f36247a = c14100f;
        this.f36248b = list;
        this.f36249c = c14091b;
        this.f36250d = str;
    }

    /* renamed from: e */
    public static C14090a m698e() {
        return new C14090a();
    }

    @InterfaceC12629d(tag = 4)
    /* renamed from: a */
    public String m702a() {
        return this.f36250d;
    }

    @InterfaceC12629d(tag = 3)
    /* renamed from: b */
    public C14091b m701b() {
        return this.f36249c;
    }

    @InterfaceC12629d(tag = 2)
    /* renamed from: c */
    public List<C14096d> m700c() {
        return this.f36248b;
    }

    @InterfaceC12629d(tag = 1)
    /* renamed from: d */
    public C14100f m699d() {
        return this.f36247a;
    }

    /* renamed from: f */
    public byte[] m697f() {
        return AbstractC13098l.m3277a(this);
    }
}