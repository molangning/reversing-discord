package io.sentry.protocol;

import java.util.Locale;

/* renamed from: io.sentry.protocol.z */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC8118z {
    CUSTOM,
    URL,
    ROUTE,
    VIEW,
    COMPONENT,
    TASK;

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}