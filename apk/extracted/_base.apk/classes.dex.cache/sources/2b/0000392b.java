package io.sentry;

import io.sentry.util.C8229o;
import io.sentry.util.C8233s;
import java.util.UUID;

/* renamed from: io.sentry.g5 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7932g5 implements InterfaceC8026n1 {

    /* renamed from: k */
    public static final C7932g5 f21612k = new C7932g5(new UUID(0, 0));

    /* renamed from: j */
    private final String f21613j;

    /* renamed from: io.sentry.g5$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7933a implements InterfaceC7894d1<C7932g5> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C7932g5 mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            return new C7932g5(c7993j1.m18101Y());
        }
    }

    public C7932g5(String str) {
        this.f21613j = (String) C8229o.m18169c(str, "value is required");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7932g5.class == obj.getClass()) {
            return this.f21613j.equals(((C7932g5) obj).f21613j);
        }
        return false;
    }

    public int hashCode() {
        return this.f21613j.hashCode();
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18191g(this.f21613j);
    }

    public String toString() {
        return this.f21613j;
    }

    public C7932g5() {
        this(UUID.randomUUID());
    }

    private C7932g5(UUID uuid) {
        this(C8233s.m18156d(uuid.toString()).replace("-", "").substring(0, 16));
    }
}