package p142hi;

/* renamed from: hi.l1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC7291l1 implements InterfaceC7288k1 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC7288k1)) {
            return false;
        }
        InterfaceC7288k1 interfaceC7288k1 = (InterfaceC7288k1) obj;
        if (mo20955a() == interfaceC7288k1.mo20955a() && mo20954b() == interfaceC7288k1.mo20954b() && getType().equals(interfaceC7288k1.getType())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = mo20954b().hashCode();
        if (C7320s1.m20972w(getType())) {
            return (hashCode2 * 31) + 19;
        }
        int i = hashCode2 * 31;
        if (mo20955a()) {
            hashCode = 17;
        } else {
            hashCode = getType().hashCode();
        }
        return i + hashCode;
    }

    public String toString() {
        if (mo20955a()) {
            return "*";
        }
        if (mo20954b() == EnumC7336w1.INVARIANT) {
            return getType().toString();
        }
        return mo20954b() + " " + getType();
    }
}