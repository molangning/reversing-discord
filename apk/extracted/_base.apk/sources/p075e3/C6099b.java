package p075e3;

/* renamed from: e3.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6099b {
    /* renamed from: a */
    public static int m23581a(int i, int i2) {
        return ((i + 31) * 31) + i2;
    }

    /* renamed from: b */
    public static int m23580b(int i, int i2, int i3, int i4, int i5, int i6) {
        return ((((((((((i + 31) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + i5) * 31) + i6;
    }

    /* renamed from: c */
    public static int m23579c(Object obj, Object obj2) {
        return m23581a(obj == null ? 0 : obj.hashCode(), obj2 != null ? obj2.hashCode() : 0);
    }

    /* renamed from: d */
    public static int m23578d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        if (obj2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = obj2.hashCode();
        }
        if (obj3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = obj3.hashCode();
        }
        if (obj4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj4.hashCode();
        }
        if (obj5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = obj5.hashCode();
        }
        if (obj6 != null) {
            i = obj6.hashCode();
        }
        return m23580b(hashCode, hashCode2, hashCode3, hashCode4, hashCode5, i);
    }
}
