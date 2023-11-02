package ng;

import kotlin.jvm.internal.C9612q;
import ph.C11632b;
import ph.C11638f;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum l uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: ng.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class EnumC10887m {

    /* renamed from: l */
    public static final EnumC10887m f28523l;

    /* renamed from: m */
    public static final EnumC10887m f28524m;

    /* renamed from: n */
    public static final EnumC10887m f28525n;

    /* renamed from: o */
    public static final EnumC10887m f28526o;

    /* renamed from: p */
    private static final /* synthetic */ EnumC10887m[] f28527p;

    /* renamed from: j */
    private final C11632b f28528j;

    /* renamed from: k */
    private final C11638f f28529k;

    static {
        C11632b m7468e = C11632b.m7468e("kotlin/UByteArray");
        C9612q.m13918g(m7468e, "fromString(\"kotlin/UByteArray\")");
        f28523l = new EnumC10887m("UBYTEARRAY", 0, m7468e);
        C11632b m7468e2 = C11632b.m7468e("kotlin/UShortArray");
        C9612q.m13918g(m7468e2, "fromString(\"kotlin/UShortArray\")");
        f28524m = new EnumC10887m("USHORTARRAY", 1, m7468e2);
        C11632b m7468e3 = C11632b.m7468e("kotlin/UIntArray");
        C9612q.m13918g(m7468e3, "fromString(\"kotlin/UIntArray\")");
        f28525n = new EnumC10887m("UINTARRAY", 2, m7468e3);
        C11632b m7468e4 = C11632b.m7468e("kotlin/ULongArray");
        C9612q.m13918g(m7468e4, "fromString(\"kotlin/ULongArray\")");
        f28526o = new EnumC10887m("ULONGARRAY", 3, m7468e4);
        f28527p = m9744a();
    }

    private EnumC10887m(String str, int i, C11632b c11632b) {
        this.f28528j = c11632b;
        C11638f m7463j = c11632b.m7463j();
        C9612q.m13918g(m7463j, "classId.shortClassName");
        this.f28529k = m7463j;
    }

    /* renamed from: a */
    private static final /* synthetic */ EnumC10887m[] m9744a() {
        return new EnumC10887m[]{f28523l, f28524m, f28525n, f28526o};
    }

    public static EnumC10887m valueOf(String str) {
        return (EnumC10887m) Enum.valueOf(EnumC10887m.class, str);
    }

    public static EnumC10887m[] values() {
        return (EnumC10887m[]) f28527p.clone();
    }

    /* renamed from: b */
    public final C11638f m9743b() {
        return this.f28529k;
    }
}
