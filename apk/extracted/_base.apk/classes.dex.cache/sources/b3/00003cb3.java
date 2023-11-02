package p167j1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: j1.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C8784e {

    /* renamed from: c */
    public static final C8784e f23053c = new C8784e("COMPOSITION");

    /* renamed from: a */
    private final List<String> f23054a;

    /* renamed from: b */
    private InterfaceC8785f f23055b;

    public C8784e(String... strArr) {
        this.f23054a = Arrays.asList(strArr);
    }

    /* renamed from: b */
    private boolean m17258b() {
        List<String> list = this.f23054a;
        return list.get(list.size() - 1).equals("**");
    }

    /* renamed from: f */
    private boolean m17254f(String str) {
        return "__container".equals(str);
    }

    /* renamed from: a */
    public C8784e m17259a(String str) {
        C8784e c8784e = new C8784e(this);
        c8784e.f23054a.add(str);
        return c8784e;
    }

    /* renamed from: c */
    public boolean m17257c(String str, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (i >= this.f23054a.size()) {
            return false;
        }
        if (i == this.f23054a.size() - 1) {
            z = true;
        } else {
            z = false;
        }
        String str2 = this.f23054a.get(i);
        if (!str2.equals("**")) {
            if (!str2.equals(str) && !str2.equals("*")) {
                z3 = false;
            } else {
                z3 = true;
            }
            if ((!z && (i != this.f23054a.size() - 2 || !m17258b())) || !z3) {
                return false;
            }
            return true;
        }
        if (!z && this.f23054a.get(i + 1).equals(str)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (i != this.f23054a.size() - 2 && (i != this.f23054a.size() - 3 || !m17258b())) {
                return false;
            }
            return true;
        } else if (z) {
            return true;
        } else {
            int i2 = i + 1;
            if (i2 < this.f23054a.size() - 1) {
                return false;
            }
            return this.f23054a.get(i2).equals(str);
        }
    }

    /* renamed from: d */
    public InterfaceC8785f m17256d() {
        return this.f23055b;
    }

    /* renamed from: e */
    public int m17255e(String str, int i) {
        if (m17254f(str)) {
            return 0;
        }
        if (!this.f23054a.get(i).equals("**")) {
            return 1;
        }
        if (i == this.f23054a.size() - 1 || !this.f23054a.get(i + 1).equals(str)) {
            return 0;
        }
        return 2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C8784e c8784e = (C8784e) obj;
        if (!this.f23054a.equals(c8784e.f23054a)) {
            return false;
        }
        InterfaceC8785f interfaceC8785f = this.f23055b;
        InterfaceC8785f interfaceC8785f2 = c8784e.f23055b;
        if (interfaceC8785f != null) {
            return interfaceC8785f.equals(interfaceC8785f2);
        }
        if (interfaceC8785f2 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m17253g(String str, int i) {
        if (m17254f(str)) {
            return true;
        }
        if (i >= this.f23054a.size()) {
            return false;
        }
        if (this.f23054a.get(i).equals(str) || this.f23054a.get(i).equals("**") || this.f23054a.get(i).equals("*")) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean m17252h(String str, int i) {
        if ("__container".equals(str) || i < this.f23054a.size() - 1 || this.f23054a.get(i).equals("**")) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = this.f23054a.hashCode() * 31;
        InterfaceC8785f interfaceC8785f = this.f23055b;
        if (interfaceC8785f != null) {
            i = interfaceC8785f.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    /* renamed from: i */
    public C8784e m17251i(InterfaceC8785f interfaceC8785f) {
        C8784e c8784e = new C8784e(this);
        c8784e.f23055b = interfaceC8785f;
        return c8784e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyPath{keys=");
        sb2.append(this.f23054a);
        sb2.append(",resolved=");
        sb2.append(this.f23055b != null);
        sb2.append('}');
        return sb2.toString();
    }

    private C8784e(C8784e c8784e) {
        this.f23054a = new ArrayList(c8784e.f23054a);
        this.f23055b = c8784e.f23055b;
    }
}