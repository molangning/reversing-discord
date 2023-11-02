package com.facebook.hermes.intl;

import p128h4.InterfaceC6895b;

/* renamed from: com.facebook.hermes.intl.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC3644a {

    /* renamed from: com.facebook.hermes.intl.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    static /* synthetic */ class C3645a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10081a;

        /* renamed from: b */
        static final /* synthetic */ int[] f10082b;

        /* renamed from: c */
        static final /* synthetic */ int[] f10083c;

        static {
            int[] iArr = new int[EnumC3646b.values().length];
            f10083c = iArr;
            try {
                iArr[EnumC3646b.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10083c[EnumC3646b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10083c[EnumC3646b.FALSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[EnumC3648d.values().length];
            f10082b = iArr2;
            try {
                iArr2[EnumC3648d.SORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10082b[EnumC3648d.SEARCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[EnumC3647c.values().length];
            f10081a = iArr3;
            try {
                iArr3[EnumC3647c.BASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10081a[EnumC3647c.ACCENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10081a[EnumC3647c.CASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10081a[EnumC3647c.VARIANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10081a[EnumC3647c.LOCALE.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* renamed from: com.facebook.hermes.intl.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC3646b {
        UPPER,
        LOWER,
        FALSE;

        @Override // java.lang.Enum
        public String toString() {
            int i = C3645a.f10083c[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return "false";
                    }
                    throw new IllegalArgumentException();
                }
                return "lower";
            }
            return "upper";
        }
    }

    /* renamed from: com.facebook.hermes.intl.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC3647c {
        BASE,
        ACCENT,
        CASE,
        VARIANT,
        LOCALE;

        @Override // java.lang.Enum
        public String toString() {
            int i = C3645a.f10081a[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return "";
                            }
                            throw new IllegalArgumentException();
                        }
                        return "variant";
                    }
                    return "case";
                }
                return "accent";
            }
            return "base";
        }
    }

    /* renamed from: com.facebook.hermes.intl.a$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC3648d {
        SORT,
        SEARCH;

        @Override // java.lang.Enum
        public String toString() {
            int i = C3645a.f10082b[ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return "search";
                }
                throw new IllegalArgumentException();
            }
            return "sort";
        }
    }

    /* renamed from: a */
    int mo31255a(String str, String str2);

    /* renamed from: b */
    EnumC3647c mo31254b();

    /* renamed from: c */
    InterfaceC3644a mo31253c(InterfaceC6895b<?> interfaceC6895b);

    /* renamed from: d */
    InterfaceC3644a mo31252d(boolean z);

    /* renamed from: e */
    InterfaceC3644a mo31251e(EnumC3646b enumC3646b);

    /* renamed from: f */
    InterfaceC3644a mo31250f(boolean z);

    /* renamed from: g */
    InterfaceC3644a mo31249g(EnumC3647c enumC3647c);
}
