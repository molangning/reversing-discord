package p414x2;

import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: x2.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13678b implements InterfaceC13679c {

    /* renamed from: c */
    public static final C13678b f35198c = new C13678b();

    /* renamed from: a */
    private String f35199a = "unknown";

    /* renamed from: b */
    private int f35200b = 5;

    private C13678b() {
    }

    /* renamed from: k */
    public static C13678b m1837k() {
        return f35198c;
    }

    /* renamed from: l */
    private static String m1836l(String str, Throwable th2) {
        return str + '\n' + m1835m(th2);
    }

    /* renamed from: m */
    private static String m1835m(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: n */
    private String m1834n(String str) {
        if (this.f35199a != null) {
            return this.f35199a + ":" + str;
        }
        return str;
    }

    /* renamed from: o */
    private void m1833o(int i, String str, String str2) {
        Log.println(i, m1834n(str), str2);
    }

    /* renamed from: p */
    private void m1832p(int i, String str, String str2, Throwable th2) {
        Log.println(i, m1834n(str), m1836l(str2, th2));
    }

    @Override // p414x2.InterfaceC13679c
    /* renamed from: a */
    public void mo1831a(String str, String str2) {
        m1833o(5, str, str2);
    }

    @Override // p414x2.InterfaceC13679c
    /* renamed from: b */
    public void mo1830b(String str, String str2) {
        m1833o(6, str, str2);
    }

    @Override // p414x2.InterfaceC13679c
    /* renamed from: c */
    public void mo1829c(String str, String str2) {
        m1833o(2, str, str2);
    }

    @Override // p414x2.InterfaceC13679c
    /* renamed from: d */
    public void mo1828d(String str, String str2) {
        m1833o(6, str, str2);
    }

    @Override // p414x2.InterfaceC13679c
    /* renamed from: e */
    public void mo1827e(String str, String str2) {
        m1833o(3, str, str2);
    }

    @Override // p414x2.InterfaceC13679c
    /* renamed from: f */
    public void mo1825f(String str, String str2, Throwable th2) {
        m1832p(3, str, str2, th2);
    }

    @Override // p414x2.InterfaceC13679c
    /* renamed from: g */
    public void mo1824g(String str, String str2, Throwable th2) {
        m1832p(6, str, str2, th2);
    }

    @Override // p414x2.InterfaceC13679c
    /* renamed from: h */
    public void mo1823h(String str, String str2, Throwable th2) {
        m1832p(5, str, str2, th2);
    }

    @Override // p414x2.InterfaceC13679c
    /* renamed from: i */
    public boolean mo1822i(int i) {
        return this.f35200b <= i;
    }

    @Override // p414x2.InterfaceC13679c
    /* renamed from: j */
    public void mo1821j(String str, String str2) {
        m1833o(4, str, str2);
    }

    @Override // p414x2.InterfaceC13679c
    /* renamed from: e */
    public void mo1826e(String str, String str2, Throwable th2) {
        m1832p(6, str, str2, th2);
    }
}