package io.sentry.clientreport;

/* renamed from: io.sentry.clientreport.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC7875e {
    QUEUE_OVERFLOW("queue_overflow"),
    CACHE_OVERFLOW("cache_overflow"),
    RATELIMIT_BACKOFF("ratelimit_backoff"),
    NETWORK_ERROR("network_error"),
    SAMPLE_RATE("sample_rate"),
    BEFORE_SEND("before_send"),
    EVENT_PROCESSOR("event_processor");
    
    private final String reason;

    EnumC7875e(String str) {
        this.reason = str;
    }

    public String getReason() {
        return this.reason;
    }
}