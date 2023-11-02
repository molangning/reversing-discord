package com.discord.notifications.fcm;

import com.discord.notifications.client.NotificationClient;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9609n;
import kotlin.jvm.internal.C9612q;

@Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public /* synthetic */ class MessagingService$Companion$init$1 extends C9609n implements Function1<String, Unit> {
    public MessagingService$Companion$init$1(Object obj) {
        super(1, obj, NotificationClient.class, "setToken", "setToken(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(String p0) {
        C9612q.m13917h(p0, "p0");
        ((NotificationClient) this.receiver).setToken(p0);
    }
}