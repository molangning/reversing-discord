package p279p5;

/* renamed from: p5.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
abstract class AbstractC11432i {

    /* renamed from: a */
    protected static AbstractC11432i f29742a;

    static {
        try {
            String property = System.getProperty("com.github.druk.dnssd.DNSSD");
            if (property == null) {
                property = "com.github.druk.dnssd.AppleDNSSD";
            }
            f29742a = (AbstractC11432i) Class.forName(property).newInstance();
        } catch (Exception e) {
            throw new InternalError("cannot instantiate DNSSD" + e);
        }
    }

    protected AbstractC11432i() {
    }

    /* renamed from: f */
    public static InterfaceC11430g m8066f(int i, int i2, String str, String str2, InterfaceC11431h interfaceC11431h) {
        return m8065g().m8070b(i, i2, str, str2, interfaceC11431h);
    }

    /* renamed from: g */
    protected static final AbstractC11432i m8065g() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new RuntimePermission("getDNSSDInstance"));
        }
        return f29742a;
    }

    /* renamed from: h */
    public static void m8064h(String str) {
        m8065g().m8071a(str);
    }

    /* renamed from: i */
    public static InterfaceC11430g m8063i(int i, int i2, String str, int i3, int i4, InterfaceC11436l interfaceC11436l) {
        return m8065g().m8069c(i, i2, str, i3, i4, interfaceC11436l);
    }

    /* renamed from: j */
    public static InterfaceC11429f m8062j(int i, int i2, String str, String str2, String str3, String str4, int i3, C11442r c11442r, InterfaceC11437m interfaceC11437m) {
        return m8065g().m8068d(i, i2, str, str2, str3, str4, i3, c11442r, interfaceC11437m);
    }

    /* renamed from: k */
    public static InterfaceC11430g m8061k(int i, int i2, String str, String str2, String str3, InterfaceC11438n interfaceC11438n) {
        return m8065g().m8067e(i, i2, str, str2, str3, interfaceC11438n);
    }

    /* renamed from: a */
    protected abstract void m8071a(String str);

    /* renamed from: b */
    protected abstract InterfaceC11430g m8070b(int i, int i2, String str, String str2, InterfaceC11431h interfaceC11431h);

    /* renamed from: c */
    protected abstract InterfaceC11430g m8069c(int i, int i2, String str, int i3, int i4, InterfaceC11436l interfaceC11436l);

    /* renamed from: d */
    protected abstract InterfaceC11429f m8068d(int i, int i2, String str, String str2, String str3, String str4, int i3, C11442r c11442r, InterfaceC11437m interfaceC11437m);

    /* renamed from: e */
    protected abstract InterfaceC11430g m8067e(int i, int i2, String str, String str2, String str3, InterfaceC11438n interfaceC11438n);
}
