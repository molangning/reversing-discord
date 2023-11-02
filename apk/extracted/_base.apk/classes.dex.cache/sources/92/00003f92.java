package p202kj;

import java.text.ParsePosition;
import p162ij.AbstractC7665q;

/* renamed from: kj.s */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public class C9518s {

    /* renamed from: a */
    private ParsePosition f25262a;

    /* renamed from: b */
    private String f25263b;

    /* renamed from: c */
    private AbstractC7665q<?> f25264c;

    /* renamed from: d */
    private boolean f25265d;

    public C9518s() {
        this(0);
    }

    /* renamed from: a */
    public void m14435a() {
        this.f25262a.setErrorIndex(-1);
        this.f25263b = "";
    }

    /* renamed from: b */
    public void m14434b() {
        this.f25265d = false;
    }

    /* renamed from: c */
    public int m14433c() {
        return this.f25262a.getErrorIndex();
    }

    /* renamed from: d */
    public String m14432d() {
        return this.f25263b;
    }

    /* renamed from: e */
    public ParsePosition m14431e() {
        return this.f25262a;
    }

    /* renamed from: f */
    public int m14430f() {
        return this.f25262a.getIndex();
    }

    /* renamed from: g */
    public AbstractC7665q<?> m14429g() {
        if (this.f25264c == null) {
            this.f25264c = new C9521v(0, false);
        }
        return this.f25264c;
    }

    /* renamed from: h */
    public AbstractC7665q<?> m14428h() {
        return this.f25264c;
    }

    /* renamed from: i */
    public boolean m14427i() {
        return this.f25262a.getErrorIndex() != -1;
    }

    /* renamed from: j */
    public boolean m14426j() {
        return this.f25265d;
    }

    /* renamed from: k */
    public void m14425k(int i, String str) {
        if (i >= 0) {
            if (str == null || str.isEmpty()) {
                str = "Error occurred at position: " + i;
            }
            this.f25263b = str;
            this.f25262a.setErrorIndex(i);
            return;
        }
        throw new IllegalArgumentException("Undefined error index: " + i);
    }

    /* renamed from: l */
    public void m14424l(int i) {
        if (i >= 0) {
            this.f25262a.setIndex(i);
            return;
        }
        throw new IllegalArgumentException("Undefined position: " + i);
    }

    /* renamed from: m */
    public void m14423m(AbstractC7665q<?> abstractC7665q) {
        this.f25264c = abstractC7665q;
    }

    /* renamed from: n */
    public void m14422n() {
        if (!m14427i()) {
            this.f25263b = "Warning state active.";
            this.f25262a.setErrorIndex(m14430f());
        }
        this.f25265d = true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("[position=");
        sb2.append(m14430f());
        sb2.append(", error-index=");
        sb2.append(m14433c());
        sb2.append(", error-message=\"");
        sb2.append(this.f25263b);
        sb2.append('\"');
        if (this.f25265d) {
            sb2.append(", warning-active");
        }
        if (this.f25264c != null) {
            sb2.append(", raw-values=");
            sb2.append(this.f25264c);
        }
        sb2.append(']');
        return sb2.toString();
    }

    public C9518s(int i) {
        if (i >= 0) {
            this.f25262a = new ParsePosition(i);
            this.f25263b = "";
            this.f25264c = null;
            this.f25265d = false;
            return;
        }
        throw new IllegalArgumentException("Undefined: " + i);
    }
}