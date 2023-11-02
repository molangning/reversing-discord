package io.sentry;

/* renamed from: io.sentry.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC7960i {
    All("__all__"),
    Default("default"),
    Error("error"),
    Session("session"),
    Attachment("attachment"),
    Profile("profile"),
    Transaction("transaction"),
    Security("security"),
    UserReport("user_report"),
    Unknown("unknown");
    
    private final String category;

    EnumC7960i(String str) {
        this.category = str;
    }

    public String getCategory() {
        return this.category;
    }
}