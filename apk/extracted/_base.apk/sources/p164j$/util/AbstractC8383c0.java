package p164j$.util;

import java.util.Iterator;

/* renamed from: j$.util.c0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public abstract class AbstractC8383c0 {

    /* renamed from: a */
    private static final Spliterator f22465a = new C8376Y();

    /* renamed from: b */
    private static final InterfaceC8359G f22466b = new C8374W();

    /* renamed from: c */
    private static final InterfaceC8362J f22467c = new C8375X();

    /* renamed from: d */
    private static final InterfaceC8356D f22468d = new C8373V();

    /* renamed from: a */
    private static void m17763a(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException(i2);
            }
            if (i3 > i) {
                throw new ArrayIndexOutOfBoundsException(i3);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i2 + ") > fence(" + i3 + ")");
    }

    /* renamed from: b */
    public static InterfaceC8356D m17762b() {
        return f22468d;
    }

    /* renamed from: c */
    public static InterfaceC8359G m17761c() {
        return f22466b;
    }

    /* renamed from: d */
    public static InterfaceC8362J m17760d() {
        return f22467c;
    }

    /* renamed from: e */
    public static Spliterator m17759e() {
        return f22465a;
    }

    /* renamed from: f */
    public static InterfaceC8519q m17758f(InterfaceC8356D interfaceC8356D) {
        interfaceC8356D.getClass();
        return new C8370S(interfaceC8356D);
    }

    /* renamed from: g */
    public static InterfaceC8764u m17757g(InterfaceC8359G interfaceC8359G) {
        interfaceC8359G.getClass();
        return new C8368P(interfaceC8359G);
    }

    /* renamed from: h */
    public static InterfaceC8768y m17756h(InterfaceC8362J interfaceC8362J) {
        interfaceC8362J.getClass();
        return new C8369Q(interfaceC8362J);
    }

    /* renamed from: i */
    public static Iterator m17755i(Spliterator spliterator) {
        spliterator.getClass();
        return new C8367O(spliterator);
    }

    /* renamed from: j */
    public static InterfaceC8356D m17754j(double[] dArr, int i, int i2) {
        dArr.getClass();
        m17763a(dArr.length, i, i2);
        return new C8372U(dArr, i, i2, 1040);
    }

    /* renamed from: k */
    public static InterfaceC8359G m17753k(int[] iArr, int i, int i2) {
        iArr.getClass();
        m17763a(iArr.length, i, i2);
        return new C8377Z(iArr, i, i2, 1040);
    }

    /* renamed from: l */
    public static InterfaceC8362J m17752l(long[] jArr, int i, int i2) {
        jArr.getClass();
        m17763a(jArr.length, i, i2);
        return new C8381b0(jArr, i, i2, 1040);
    }

    /* renamed from: m */
    public static Spliterator m17751m(Object[] objArr, int i, int i2) {
        objArr.getClass();
        m17763a(objArr.length, i, i2);
        return new C8371T(objArr, i, i2, 1040);
    }
}
