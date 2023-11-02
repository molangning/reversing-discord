package p210l5;

/* renamed from: l5.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC10047b {
    AUTO_CLOSE_TARGET(true),
    AUTO_CLOSE_JSON_CONTENT(true),
    FLUSH_PASSED_TO_STREAM(true),
    QUOTE_FIELD_NAMES(true),
    QUOTE_NON_NUMERIC_NUMBERS(true),
    ESCAPE_NON_ASCII(false),
    WRITE_NUMBERS_AS_STRINGS(false),
    WRITE_BIGDECIMAL_AS_PLAIN(false),
    STRICT_DUPLICATE_DETECTION(false),
    IGNORE_UNKNOWN(false);
    

    /* renamed from: j */
    private final boolean f26133j;

    /* renamed from: k */
    private final int f26134k = 1 << ordinal();

    EnumC10047b(boolean z) {
        this.f26133j = z;
    }

    /* renamed from: a */
    public static int m12485a() {
        EnumC10047b[] values;
        int i = 0;
        for (EnumC10047b enumC10047b : values()) {
            if (enumC10047b.m12484b()) {
                i |= enumC10047b.m12483c();
            }
        }
        return i;
    }

    /* renamed from: b */
    public boolean m12484b() {
        return this.f26133j;
    }

    /* renamed from: c */
    public int m12483c() {
        return this.f26134k;
    }
}