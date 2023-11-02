package p210l5;

/* renamed from: l5.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC10048c {
    AUTO_CLOSE_SOURCE(true),
    ALLOW_COMMENTS(false),
    ALLOW_YAML_COMMENTS(false),
    ALLOW_UNQUOTED_FIELD_NAMES(false),
    ALLOW_SINGLE_QUOTES(false),
    ALLOW_UNQUOTED_CONTROL_CHARS(false),
    ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
    ALLOW_NUMERIC_LEADING_ZEROS(false),
    ALLOW_NON_NUMERIC_NUMBERS(false),
    ALLOW_MISSING_VALUES(false),
    ALLOW_TRAILING_COMMA(false),
    STRICT_DUPLICATE_DETECTION(false),
    IGNORE_UNDEFINED(false),
    INCLUDE_SOURCE_IN_LOCATION(true);
    

    /* renamed from: j */
    private final boolean f26150j;

    /* renamed from: k */
    private final int f26151k = 1 << ordinal();

    EnumC10048c(boolean z) {
        this.f26150j = z;
    }

    /* renamed from: a */
    public static int m12482a() {
        EnumC10048c[] values;
        int i = 0;
        for (EnumC10048c enumC10048c : values()) {
            if (enumC10048c.m12481b()) {
                i |= enumC10048c.m12480c();
            }
        }
        return i;
    }

    /* renamed from: b */
    public boolean m12481b() {
        return this.f26150j;
    }

    /* renamed from: c */
    public int m12480c() {
        return this.f26151k;
    }
}
