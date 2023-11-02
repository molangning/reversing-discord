package p449yh;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import ng.EnumC10876i;
import ph.C11633c;

/* renamed from: yh.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public enum EnumC14028e {
    BOOLEAN(EnumC10876i.BOOLEAN, "boolean", "Z", "java.lang.Boolean"),
    CHAR(EnumC10876i.CHAR, "char", "C", "java.lang.Character"),
    BYTE(EnumC10876i.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(EnumC10876i.SHORT, "short", "S", "java.lang.Short"),
    INT(EnumC10876i.INT, "int", "I", "java.lang.Integer"),
    FLOAT(EnumC10876i.FLOAT, "float", "F", "java.lang.Float"),
    LONG(EnumC10876i.LONG, "long", "J", "java.lang.Long"),
    DOUBLE(EnumC10876i.DOUBLE, "double", "D", "java.lang.Double");
    

    /* renamed from: v */
    private static final Set<C11633c> f36053v = new HashSet();

    /* renamed from: w */
    private static final Map<String, EnumC14028e> f36054w = new HashMap();

    /* renamed from: x */
    private static final Map<EnumC10876i, EnumC14028e> f36055x = new EnumMap(EnumC10876i.class);

    /* renamed from: y */
    private static final Map<String, EnumC14028e> f36056y = new HashMap();

    /* renamed from: j */
    private final EnumC10876i f36058j;

    /* renamed from: k */
    private final String f36059k;

    /* renamed from: l */
    private final String f36060l;

    /* renamed from: m */
    private final C11633c f36061m;

    static {
        EnumC14028e[] values;
        for (EnumC14028e enumC14028e : values()) {
            f36053v.add(enumC14028e.m874g());
            f36054w.put(enumC14028e.m876e(), enumC14028e);
            f36055x.put(enumC14028e.m875f(), enumC14028e);
            f36056y.put(enumC14028e.m877d(), enumC14028e);
        }
    }

    EnumC14028e(EnumC10876i enumC10876i, String str, String str2, String str3) {
        if (enumC10876i == null) {
            m880a(6);
        }
        if (str == null) {
            m880a(7);
        }
        if (str2 == null) {
            m880a(8);
        }
        if (str3 == null) {
            m880a(9);
        }
        this.f36058j = enumC10876i;
        this.f36059k = str;
        this.f36060l = str2;
        this.f36061m = new C11633c(str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0082  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void m880a(int r7) {
        /*
            r0 = 4
            r1 = 2
            if (r7 == r1) goto Lc
            if (r7 == r0) goto Lc
            switch(r7) {
                case 10: goto Lc;
                case 11: goto Lc;
                case 12: goto Lc;
                case 13: goto Lc;
                default: goto L9;
            }
        L9:
            java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r2 = "@NotNull method %s.%s must not return null"
        Le:
            if (r7 == r1) goto L17
            if (r7 == r0) goto L17
            switch(r7) {
                case 10: goto L17;
                case 11: goto L17;
                case 12: goto L17;
                case 13: goto L17;
                default: goto L15;
            }
        L15:
            r3 = 3
            goto L18
        L17:
            r3 = r1
        L18:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType"
            r5 = 0
            switch(r7) {
                case 1: goto L3c;
                case 2: goto L39;
                case 3: goto L34;
                case 4: goto L39;
                case 5: goto L2f;
                case 6: goto L2a;
                case 7: goto L3c;
                case 8: goto L2f;
                case 9: goto L25;
                case 10: goto L39;
                case 11: goto L39;
                case 12: goto L39;
                case 13: goto L39;
                default: goto L20;
            }
        L20:
            java.lang.String r6 = "className"
            r3[r5] = r6
            goto L40
        L25:
            java.lang.String r6 = "wrapperClassName"
            r3[r5] = r6
            goto L40
        L2a:
            java.lang.String r6 = "primitiveType"
            r3[r5] = r6
            goto L40
        L2f:
            java.lang.String r6 = "desc"
            r3[r5] = r6
            goto L40
        L34:
            java.lang.String r6 = "type"
            r3[r5] = r6
            goto L40
        L39:
            r3[r5] = r4
            goto L40
        L3c:
            java.lang.String r6 = "name"
            r3[r5] = r6
        L40:
            java.lang.String r5 = "get"
            r6 = 1
            if (r7 == r1) goto L61
            if (r7 == r0) goto L61
            switch(r7) {
                case 10: goto L5c;
                case 11: goto L57;
                case 12: goto L52;
                case 13: goto L4d;
                default: goto L4a;
            }
        L4a:
            r3[r6] = r4
            goto L63
        L4d:
            java.lang.String r4 = "getWrapperFqName"
            r3[r6] = r4
            goto L63
        L52:
            java.lang.String r4 = "getDesc"
            r3[r6] = r4
            goto L63
        L57:
            java.lang.String r4 = "getJavaKeywordName"
            r3[r6] = r4
            goto L63
        L5c:
            java.lang.String r4 = "getPrimitiveType"
            r3[r6] = r4
            goto L63
        L61:
            r3[r6] = r5
        L63:
            switch(r7) {
                case 1: goto L75;
                case 2: goto L77;
                case 3: goto L75;
                case 4: goto L77;
                case 5: goto L70;
                case 6: goto L6b;
                case 7: goto L6b;
                case 8: goto L6b;
                case 9: goto L6b;
                case 10: goto L77;
                case 11: goto L77;
                case 12: goto L77;
                case 13: goto L77;
                default: goto L66;
            }
        L66:
            java.lang.String r4 = "isWrapperClassName"
            r3[r1] = r4
            goto L77
        L6b:
            java.lang.String r4 = "<init>"
            r3[r1] = r4
            goto L77
        L70:
            java.lang.String r4 = "getByDesc"
            r3[r1] = r4
            goto L77
        L75:
            r3[r1] = r5
        L77:
            java.lang.String r2 = java.lang.String.format(r2, r3)
            if (r7 == r1) goto L88
            if (r7 == r0) goto L88
            switch(r7) {
                case 10: goto L88;
                case 11: goto L88;
                case 12: goto L88;
                case 13: goto L88;
                default: goto L82;
            }
        L82:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>(r2)
            goto L8d
        L88:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r2)
        L8d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p449yh.EnumC14028e.m880a(int):void");
    }

    /* renamed from: b */
    public static EnumC14028e m879b(String str) {
        if (str == null) {
            m880a(1);
        }
        EnumC14028e enumC14028e = f36054w.get(str);
        if (enumC14028e != null) {
            return enumC14028e;
        }
        throw new AssertionError("Non-primitive type name passed: " + str);
    }

    /* renamed from: c */
    public static EnumC14028e m878c(EnumC10876i enumC10876i) {
        if (enumC10876i == null) {
            m880a(3);
        }
        EnumC14028e enumC14028e = f36055x.get(enumC10876i);
        if (enumC14028e == null) {
            m880a(4);
        }
        return enumC14028e;
    }

    /* renamed from: d */
    public String m877d() {
        String str = this.f36060l;
        if (str == null) {
            m880a(12);
        }
        return str;
    }

    /* renamed from: e */
    public String m876e() {
        String str = this.f36059k;
        if (str == null) {
            m880a(11);
        }
        return str;
    }

    /* renamed from: f */
    public EnumC10876i m875f() {
        EnumC10876i enumC10876i = this.f36058j;
        if (enumC10876i == null) {
            m880a(10);
        }
        return enumC10876i;
    }

    /* renamed from: g */
    public C11633c m874g() {
        C11633c c11633c = this.f36061m;
        if (c11633c == null) {
            m880a(13);
        }
        return c11633c;
    }
}
