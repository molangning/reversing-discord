package net.time4j.p249tz;

/* renamed from: net.time4j.tz.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public enum EnumC10801d {
    SHORT_STANDARD_TIME,
    LONG_STANDARD_TIME,
    SHORT_DAYLIGHT_TIME,
    LONG_DAYLIGHT_TIME;

    /* renamed from: a */
    public boolean m10171a() {
        return this == SHORT_STANDARD_TIME || this == SHORT_DAYLIGHT_TIME;
    }

    /* renamed from: b */
    public boolean m10170b() {
        return this == SHORT_DAYLIGHT_TIME || this == LONG_DAYLIGHT_TIME;
    }
}
