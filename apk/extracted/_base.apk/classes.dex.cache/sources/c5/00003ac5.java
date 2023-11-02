package p164j$.time.temporal;

import p164j$.time.C8297f;

/* renamed from: j$.time.temporal.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public enum EnumC8334b implements InterfaceC8347o {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");
    

    /* renamed from: a */
    private final String f22381a;

    static {
        C8297f.m17895b(1L);
        C8297f.m17895b(1000L);
        C8297f.m17895b(1000000L);
        C8297f.m17894c();
    }

    EnumC8334b(String str) {
        this.f22381a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f22381a;
    }
}