package io.sentry;

import java.util.Locale;

/* renamed from: io.sentry.m4 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC8021m4 implements InterfaceC8026n1 {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    /* renamed from: io.sentry.m4$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static final class C8022a implements InterfaceC7894d1<EnumC8021m4> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public EnumC8021m4 mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            return EnumC8021m4.valueOf(c7993j1.m18101Y().toUpperCase(Locale.ROOT));
        }
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18191g(name().toLowerCase(Locale.ROOT));
    }
}
