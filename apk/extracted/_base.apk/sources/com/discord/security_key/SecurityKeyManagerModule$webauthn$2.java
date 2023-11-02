package com.discord.security_key;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9609n;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public /* synthetic */ class SecurityKeyManagerModule$webauthn$2 extends C9609n implements Function1<String, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public SecurityKeyManagerModule$webauthn$2(Object obj) {
        super(1, obj, SecurityKeyManagerModule.class, "reject", "reject(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String p0) {
        C9612q.m13917h(p0, "p0");
        ((SecurityKeyManagerModule) this.receiver).reject(p0);
    }
}
