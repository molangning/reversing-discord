package p170j4;

import p094f3.C6308c;
import p170j4.C8793c;
import p394w2.C13374h;
import p394w2.C13379j;

/* renamed from: j4.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C8791a implements C8793c.InterfaceC8794a {

    /* renamed from: c */
    private static final byte[] f23064c;

    /* renamed from: d */
    private static final int f23065d;

    /* renamed from: e */
    private static final byte[] f23066e;

    /* renamed from: f */
    private static final int f23067f;

    /* renamed from: g */
    private static final byte[] f23068g = C8796e.m17224a("GIF87a");

    /* renamed from: h */
    private static final byte[] f23069h = C8796e.m17224a("GIF89a");

    /* renamed from: i */
    private static final byte[] f23070i;

    /* renamed from: j */
    private static final int f23071j;

    /* renamed from: k */
    private static final byte[] f23072k;

    /* renamed from: l */
    private static final int f23073l;

    /* renamed from: m */
    private static final byte[] f23074m;

    /* renamed from: n */
    private static final byte[][] f23075n;

    /* renamed from: o */
    private static final byte[] f23076o;

    /* renamed from: p */
    private static final byte[] f23077p;

    /* renamed from: q */
    private static final int f23078q;

    /* renamed from: a */
    final int f23079a = C13374h.m2692a(21, 20, f23065d, f23067f, 6, f23071j, f23073l, 12);

    /* renamed from: b */
    private boolean f23080b = false;

    static {
        byte[] bArr = {-1, -40, -1};
        f23064c = bArr;
        f23065d = bArr.length;
        byte[] bArr2 = {-119, 80, 78, 71, 13, 10, 26, 10};
        f23066e = bArr2;
        f23067f = bArr2.length;
        byte[] m17224a = C8796e.m17224a("BM");
        f23070i = m17224a;
        f23071j = m17224a.length;
        byte[] bArr3 = {0, 0, 1, 0};
        f23072k = bArr3;
        f23073l = bArr3.length;
        f23074m = C8796e.m17224a("ftyp");
        f23075n = new byte[][]{C8796e.m17224a("heic"), C8796e.m17224a("heix"), C8796e.m17224a("hevc"), C8796e.m17224a("hevx"), C8796e.m17224a("mif1"), C8796e.m17224a("msf1")};
        byte[] bArr4 = {73, 73, 42, 0};
        f23076o = bArr4;
        f23077p = new byte[]{77, 77, 0, 42};
        f23078q = bArr4.length;
    }

    /* renamed from: c */
    private static C8793c m17243c(byte[] bArr, int i) {
        C13379j.m2682b(Boolean.valueOf(C6308c.m23002h(bArr, 0, i)));
        if (C6308c.m23003g(bArr, 0)) {
            return C8792b.f23086f;
        }
        if (C6308c.m23004f(bArr, 0)) {
            return C8792b.f23087g;
        }
        if (C6308c.m23007c(bArr, 0, i)) {
            if (C6308c.m23008b(bArr, 0)) {
                return C8792b.f23090j;
            }
            if (C6308c.m23006d(bArr, 0)) {
                return C8792b.f23089i;
            }
            return C8792b.f23088h;
        }
        return C8793c.f23093c;
    }

    /* renamed from: d */
    private static boolean m17242d(byte[] bArr, int i) {
        byte[] bArr2 = f23070i;
        if (i < bArr2.length) {
            return false;
        }
        return C8796e.m17222c(bArr, bArr2);
    }

    /* renamed from: e */
    private static boolean m17241e(byte[] bArr, int i) {
        if (i >= f23078q && (C8796e.m17222c(bArr, f23076o) || C8796e.m17222c(bArr, f23077p))) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static boolean m17240f(byte[] bArr, int i) {
        if (i < 6) {
            return false;
        }
        if (!C8796e.m17222c(bArr, f23068g) && !C8796e.m17222c(bArr, f23069h)) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static boolean m17239g(byte[] bArr, int i) {
        if (i < 12 || bArr[3] < 8 || !C8796e.m17223b(bArr, f23074m, 4)) {
            return false;
        }
        for (byte[] bArr2 : f23075n) {
            if (C8796e.m17223b(bArr, bArr2, 8)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private static boolean m17238h(byte[] bArr, int i) {
        byte[] bArr2 = f23072k;
        if (i < bArr2.length) {
            return false;
        }
        return C8796e.m17222c(bArr, bArr2);
    }

    /* renamed from: i */
    private static boolean m17237i(byte[] bArr, int i) {
        byte[] bArr2 = f23064c;
        if (i >= bArr2.length && C8796e.m17222c(bArr, bArr2)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private static boolean m17236j(byte[] bArr, int i) {
        byte[] bArr2 = f23066e;
        if (i >= bArr2.length && C8796e.m17222c(bArr, bArr2)) {
            return true;
        }
        return false;
    }

    @Override // p170j4.C8793c.InterfaceC8794a
    /* renamed from: a */
    public final C8793c mo17232a(byte[] bArr, int i) {
        C13379j.m2677g(bArr);
        if (!this.f23080b && C6308c.m23002h(bArr, 0, i)) {
            return m17243c(bArr, i);
        }
        if (m17237i(bArr, i)) {
            return C8792b.f23081a;
        }
        if (m17236j(bArr, i)) {
            return C8792b.f23082b;
        }
        if (this.f23080b && C6308c.m23002h(bArr, 0, i)) {
            return m17243c(bArr, i);
        }
        if (m17240f(bArr, i)) {
            return C8792b.f23083c;
        }
        if (m17242d(bArr, i)) {
            return C8792b.f23084d;
        }
        if (m17238h(bArr, i)) {
            return C8792b.f23085e;
        }
        if (m17239g(bArr, i)) {
            return C8792b.f23091k;
        }
        if (m17241e(bArr, i)) {
            return C8792b.f23092l;
        }
        return C8793c.f23093c;
    }

    @Override // p170j4.C8793c.InterfaceC8794a
    /* renamed from: b */
    public int mo17231b() {
        return this.f23079a;
    }
}
