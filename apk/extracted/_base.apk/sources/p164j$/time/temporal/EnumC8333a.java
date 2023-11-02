package p164j$.time.temporal;

/* renamed from: j$.time.temporal.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public enum EnumC8333a implements InterfaceC8344l {
    NANO_OF_SECOND("NanoOfSecond", C8349q.m17787i(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", C8349q.m17787i(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", C8349q.m17787i(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", C8349q.m17787i(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", C8349q.m17787i(0, 999)),
    MILLI_OF_DAY("MilliOfDay", C8349q.m17787i(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", C8349q.m17787i(0, 59), 0),
    SECOND_OF_DAY("SecondOfDay", C8349q.m17787i(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", C8349q.m17787i(0, 59), 0),
    MINUTE_OF_DAY("MinuteOfDay", C8349q.m17787i(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", C8349q.m17787i(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", C8349q.m17787i(1, 12)),
    HOUR_OF_DAY("HourOfDay", C8349q.m17787i(0, 23), 0),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", C8349q.m17787i(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", C8349q.m17787i(0, 1), 0),
    DAY_OF_WEEK("DayOfWeek", C8349q.m17787i(1, 7), 0),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", C8349q.m17787i(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", C8349q.m17787i(1, 7)),
    DAY_OF_MONTH("DayOfMonth", C8349q.m17786j(28, 31), 0),
    DAY_OF_YEAR("DayOfYear", C8349q.m17786j(365, 366)),
    EPOCH_DAY("EpochDay", C8349q.m17787i(-365249999634L, 365249999634L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", C8349q.m17786j(4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", C8349q.m17787i(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", C8349q.m17787i(1, 12), 0),
    PROLEPTIC_MONTH("ProlepticMonth", C8349q.m17787i(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", C8349q.m17786j(999999999, 1000000000)),
    YEAR("Year", C8349q.m17787i(-999999999, 999999999), 0),
    ERA("Era", C8349q.m17787i(0, 1), 0),
    INSTANT_SECONDS("InstantSeconds", C8349q.m17787i(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", C8349q.m17787i(-64800, 64800));
    

    /* renamed from: a */
    private final String f22378a;

    /* renamed from: b */
    private final C8349q f22379b;

    static {
        EnumC8334b enumC8334b = EnumC8334b.NANOS;
    }

    EnumC8333a(String str, C8349q c8349q) {
        this.f22378a = str;
        this.f22379b = c8349q;
    }

    EnumC8333a(String str, C8349q c8349q, int i) {
        this.f22378a = str;
        this.f22379b = c8349q;
    }

    @Override // p164j$.time.temporal.InterfaceC8344l
    /* renamed from: a */
    public final boolean mo17800a(InterfaceC8343k interfaceC8343k) {
        return interfaceC8343k.mo17804b(this);
    }

    @Override // p164j$.time.temporal.InterfaceC8344l
    /* renamed from: b */
    public final C8349q mo17799b(InterfaceC8343k interfaceC8343k) {
        return interfaceC8343k.mo17805a(this);
    }

    @Override // p164j$.time.temporal.InterfaceC8344l
    /* renamed from: c */
    public final C8349q mo17798c() {
        return this.f22379b;
    }

    @Override // p164j$.time.temporal.InterfaceC8344l
    /* renamed from: d */
    public final long mo17797d(InterfaceC8343k interfaceC8343k) {
        return interfaceC8343k.mo17803c(this);
    }

    /* renamed from: e */
    public final int m17824e(long j) {
        return this.f22379b.m17795a(j, this);
    }

    /* renamed from: f */
    public final void m17823f(long j) {
        this.f22379b.m17794b(j, this);
    }

    @Override // p164j$.time.temporal.InterfaceC8344l
    public final boolean isDateBased() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    @Override // p164j$.time.temporal.InterfaceC8344l
    public final boolean isTimeBased() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f22378a;
    }
}
