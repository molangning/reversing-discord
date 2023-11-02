package gb;

/* renamed from: gb.i0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6654i0 {
    /* renamed from: a */
    public static Object m22243a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i);
    }

    /* renamed from: b */
    public static Object[] m22242b(Object... objArr) {
        return m22241c(objArr, objArr.length);
    }

    /* renamed from: c */
    static Object[] m22241c(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            m22243a(objArr[i2], i2);
        }
        return objArr;
    }

    /* renamed from: d */
    public static <T> T[] m22240d(T[] tArr, int i) {
        return (T[]) C6666k0.m22191b(tArr, i);
    }
}