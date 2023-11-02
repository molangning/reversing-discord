package com.google.android.gms.nearby.messages;

import ca.AbstractC2479j;
import ca.C2467a;
import ca.C2477i;
import ca.C2484o;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class SubscribeOptions {

    /* renamed from: f */
    public static final SubscribeOptions f12814f = new C4670a().m28049a();

    /* renamed from: a */
    private final C2477i f12815a;

    /* renamed from: b */
    private final C2467a f12816b;

    /* renamed from: c */
    private final AbstractC2479j f12817c;

    /* renamed from: d */
    public final boolean f12818d = false;

    /* renamed from: e */
    public final int f12819e = 0;

    /* renamed from: com.google.android.gms.nearby.messages.SubscribeOptions$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4670a {

        /* renamed from: a */
        private C2477i f12820a = C2477i.f6828r;

        /* renamed from: b */
        private C2467a f12821b = C2467a.f6808p;

        /* renamed from: c */
        private AbstractC2479j f12822c;

        /* renamed from: a */
        public SubscribeOptions m28049a() {
            return new SubscribeOptions(this.f12820a, this.f12821b, this.f12822c, false, 0, null);
        }

        /* renamed from: b */
        public C4670a m28048b(C2477i c2477i) {
            this.f12820a = c2477i;
            return this;
        }
    }

    /* synthetic */ SubscribeOptions(C2477i c2477i, C2467a c2467a, AbstractC2479j abstractC2479j, boolean z, int i, C2484o c2484o) {
        this.f12815a = c2477i;
        this.f12816b = c2467a;
        this.f12817c = abstractC2479j;
    }

    /* renamed from: a */
    public AbstractC2479j m28052a() {
        return this.f12817c;
    }

    /* renamed from: b */
    public C2467a m28051b() {
        return this.f12816b;
    }

    /* renamed from: c */
    public C2477i m28050c() {
        return this.f12815a;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f12815a);
        String valueOf2 = String.valueOf(this.f12816b);
        return "SubscribeOptions{strategy=" + valueOf + ", filter=" + valueOf2 + "}";
    }
}
