package p347t5;

/* renamed from: t5.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12588b {

    /* renamed from: a */
    private final String f32660a;

    private C12588b(String str) {
        if (str != null) {
            this.f32660a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    /* renamed from: b */
    public static C12588b m4754b(String str) {
        return new C12588b(str);
    }

    /* renamed from: a */
    public String m4755a() {
        return this.f32660a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12588b)) {
            return false;
        }
        return this.f32660a.equals(((C12588b) obj).f32660a);
    }

    public int hashCode() {
        return this.f32660a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f32660a + "\"}";
    }
}