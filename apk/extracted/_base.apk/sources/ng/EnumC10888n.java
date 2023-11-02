package ng;

import kotlin.jvm.internal.C9612q;
import ph.C11632b;
import ph.C11633c;
import ph.C11638f;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum m uses external variables
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
/* renamed from: ng.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class EnumC10888n {

    /* renamed from: m */
    public static final EnumC10888n f28530m;

    /* renamed from: n */
    public static final EnumC10888n f28531n;

    /* renamed from: o */
    public static final EnumC10888n f28532o;

    /* renamed from: p */
    public static final EnumC10888n f28533p;

    /* renamed from: q */
    private static final /* synthetic */ EnumC10888n[] f28534q;

    /* renamed from: j */
    private final C11632b f28535j;

    /* renamed from: k */
    private final C11638f f28536k;

    /* renamed from: l */
    private final C11632b f28537l;

    static {
        C11632b m7468e = C11632b.m7468e("kotlin/UByte");
        C9612q.m13918g(m7468e, "fromString(\"kotlin/UByte\")");
        f28530m = new EnumC10888n("UBYTE", 0, m7468e);
        C11632b m7468e2 = C11632b.m7468e("kotlin/UShort");
        C9612q.m13918g(m7468e2, "fromString(\"kotlin/UShort\")");
        f28531n = new EnumC10888n("USHORT", 1, m7468e2);
        C11632b m7468e3 = C11632b.m7468e("kotlin/UInt");
        C9612q.m13918g(m7468e3, "fromString(\"kotlin/UInt\")");
        f28532o = new EnumC10888n("UINT", 2, m7468e3);
        C11632b m7468e4 = C11632b.m7468e("kotlin/ULong");
        C9612q.m13918g(m7468e4, "fromString(\"kotlin/ULong\")");
        f28533p = new EnumC10888n("ULONG", 3, m7468e4);
        f28534q = m9742a();
    }

    private EnumC10888n(String str, int i, C11632b c11632b) {
        this.f28535j = c11632b;
        C11638f m7463j = c11632b.m7463j();
        C9612q.m13918g(m7463j, "classId.shortClassName");
        this.f28536k = m7463j;
        C11633c m7465h = c11632b.m7465h();
        this.f28537l = new C11632b(m7465h, C11638f.m7422f(m7463j.m7426b() + "Array"));
    }

    /* renamed from: a */
    private static final /* synthetic */ EnumC10888n[] m9742a() {
        return new EnumC10888n[]{f28530m, f28531n, f28532o, f28533p};
    }

    public static EnumC10888n valueOf(String str) {
        return (EnumC10888n) Enum.valueOf(EnumC10888n.class, str);
    }

    public static EnumC10888n[] values() {
        return (EnumC10888n[]) f28534q.clone();
    }

    /* renamed from: b */
    public final C11632b m9741b() {
        return this.f28537l;
    }

    /* renamed from: c */
    public final C11632b m9740c() {
        return this.f28535j;
    }

    /* renamed from: d */
    public final C11638f m9739d() {
        return this.f28536k;
    }
}
