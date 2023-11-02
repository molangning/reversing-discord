package p184jj;

import p162ij.InterfaceC7631c;

/* renamed from: jj.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
final class C9011q<A> implements InterfaceC7631c<A> {

    /* renamed from: a */
    private final String f23662a;

    /* renamed from: b */
    private final Class<A> f23663b;

    private C9011q(String str, Class<A> cls) {
        if (str != null) {
            if (cls != null) {
                this.f23662a = str;
                this.f23663b = cls;
                return;
            }
            throw new NullPointerException("Missing type of attribute.");
        }
        throw new NullPointerException("Missing name of attribute key.");
    }

    /* renamed from: a */
    public static <A> C9011q<A> m16861a(String str, Class<A> cls) {
        return new C9011q<>(str, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9011q)) {
            return false;
        }
        C9011q c9011q = (C9011q) obj;
        if (this.f23662a.equals(c9011q.f23662a) && this.f23663b.equals(c9011q.f23663b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f23662a.hashCode();
    }

    @Override // p162ij.InterfaceC7631c
    public String name() {
        return this.f23662a;
    }

    public String toString() {
        return this.f23663b.getName() + "@" + this.f23662a;
    }

    @Override // p162ij.InterfaceC7631c
    public Class<A> type() {
        return this.f23663b;
    }
}