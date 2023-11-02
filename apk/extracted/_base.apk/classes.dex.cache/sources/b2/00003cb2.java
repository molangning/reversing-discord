package p167j1;

import java.util.List;
import p206l1.C10023p;

/* renamed from: j1.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C8783d {

    /* renamed from: a */
    private final List<C10023p> f23047a;

    /* renamed from: b */
    private final char f23048b;

    /* renamed from: c */
    private final double f23049c;

    /* renamed from: d */
    private final double f23050d;

    /* renamed from: e */
    private final String f23051e;

    /* renamed from: f */
    private final String f23052f;

    public C8783d(List<C10023p> list, char c, double d, double d2, String str, String str2) {
        this.f23047a = list;
        this.f23048b = c;
        this.f23049c = d;
        this.f23050d = d2;
        this.f23051e = str;
        this.f23052f = str2;
    }

    /* renamed from: c */
    public static int m17260c(char c, String str, String str2) {
        return (((c * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    /* renamed from: a */
    public List<C10023p> m17262a() {
        return this.f23047a;
    }

    /* renamed from: b */
    public double m17261b() {
        return this.f23050d;
    }

    public int hashCode() {
        return m17260c(this.f23048b, this.f23052f, this.f23051e);
    }
}