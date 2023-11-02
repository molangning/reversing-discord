package io.sentry.protocol;

import io.sentry.C7993j1;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.util.C8233s;
import java.util.UUID;

/* renamed from: io.sentry.protocol.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8100q implements InterfaceC8026n1 {

    /* renamed from: k */
    public static final C8100q f21957k = new C8100q(new UUID(0, 0));

    /* renamed from: j */
    private final UUID f21958j;

    /* renamed from: io.sentry.protocol.q$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8101a implements InterfaceC7894d1<C8100q> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8100q mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            return new C8100q(c7993j1.m18101Y());
        }
    }

    public C8100q() {
        this((UUID) null);
    }

    /* renamed from: a */
    private UUID m18577a(String str) {
        if (str.length() == 32) {
            str = new StringBuilder(str).insert(8, "-").insert(13, "-").insert(18, "-").insert(23, "-").toString();
        }
        if (str.length() == 36) {
            return UUID.fromString(str);
        }
        throw new IllegalArgumentException("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: " + str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8100q.class == obj.getClass() && this.f21958j.compareTo(((C8100q) obj).f21958j) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f21958j.hashCode();
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18191g(toString());
    }

    public String toString() {
        return C8233s.m18156d(this.f21958j.toString()).replace("-", "");
    }

    public C8100q(UUID uuid) {
        this.f21958j = uuid == null ? UUID.randomUUID() : uuid;
    }

    public C8100q(String str) {
        this.f21958j = m18577a(C8233s.m18156d(str));
    }
}
