package net.time4j.p249tz.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: net.time4j.tz.model.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class EnumC10824i {

    /* renamed from: j */
    public static final EnumC10824i f28269j;

    /* renamed from: k */
    public static final EnumC10824i f28270k;

    /* renamed from: l */
    public static final EnumC10824i f28271l;

    /* renamed from: m */
    static final EnumC10824i[] f28272m;

    /* renamed from: n */
    private static final /* synthetic */ EnumC10824i[] f28273n;

    /* renamed from: net.time4j.tz.model.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    enum C10825a extends EnumC10824i {
        C10825a(String str, int i) {
            super(str, i, null);
        }
    }

    static {
        C10825a c10825a = new C10825a("UTC_TIME", 0);
        f28269j = c10825a;
        EnumC10824i enumC10824i = new EnumC10824i("STANDARD_TIME", 1) { // from class: net.time4j.tz.model.i.b
        };
        f28270k = enumC10824i;
        EnumC10824i enumC10824i2 = new EnumC10824i("WALL_TIME", 2) { // from class: net.time4j.tz.model.i.c
        };
        f28271l = enumC10824i2;
        f28273n = new EnumC10824i[]{c10825a, enumC10824i, enumC10824i2};
        f28272m = values();
    }

    private EnumC10824i(String str, int i) {
    }

    public static EnumC10824i valueOf(String str) {
        return (EnumC10824i) Enum.valueOf(EnumC10824i.class, str);
    }

    public static EnumC10824i[] values() {
        return (EnumC10824i[]) f28273n.clone();
    }

    /* synthetic */ EnumC10824i(String str, int i, C10825a c10825a) {
        this(str, i);
    }
}
