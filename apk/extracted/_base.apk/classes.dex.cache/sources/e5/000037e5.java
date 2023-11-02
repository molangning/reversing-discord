package p162ij;

/* renamed from: ij.e0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C7636e0 extends C7666r {
    private static final long serialVersionUID = -5638437652574160520L;

    public C7636e0(C7672x<?> c7672x, InterfaceC7664p<?> interfaceC7664p) {
        super(m20203a(c7672x, interfaceC7664p));
    }

    /* renamed from: a */
    private static String m20203a(C7672x<?> c7672x, InterfaceC7664p<?> interfaceC7664p) {
        return "Cannot find any rule for chronological element \"" + interfaceC7664p.name() + "\" in: " + c7672x.m20113p().getName();
    }

    /* renamed from: b */
    private static String m20202b(C7672x<?> c7672x, Object obj) {
        return "Cannot find any rule for chronological unit \"" + m20201c(obj) + "\" in: " + c7672x.m20113p().getName();
    }

    /* renamed from: c */
    private static String m20201c(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) Enum.class.cast(obj)).name();
        }
        return obj.toString();
    }

    public C7636e0(String str) {
        super(str);
    }

    public C7636e0(C7672x<?> c7672x, Object obj) {
        super(m20202b(c7672x, obj));
    }
}