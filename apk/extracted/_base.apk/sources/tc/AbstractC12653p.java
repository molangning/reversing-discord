package tc;

import com.google.zxing.Result;
import java.util.Arrays;
import java.util.Map;
import lc.C10119a;
import p136hc.AbstractC7067m;
import p136hc.C7058d;
import p136hc.C7060f;
import p136hc.C7064j;
import p136hc.C7069o;
import p136hc.EnumC7055a;
import p136hc.EnumC7059e;
import p136hc.EnumC7068n;
import p136hc.InterfaceC7070p;

/* renamed from: tc.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC12653p extends AbstractC12648k {

    /* renamed from: d */
    static final int[] f32787d = {1, 1, 1};

    /* renamed from: e */
    static final int[] f32788e = {1, 1, 1, 1, 1};

    /* renamed from: f */
    static final int[] f32789f = {1, 1, 1, 1, 1, 1};

    /* renamed from: g */
    static final int[][] f32790g;

    /* renamed from: h */
    static final int[][] f32791h;

    /* renamed from: a */
    private final StringBuilder f32792a = new StringBuilder(20);

    /* renamed from: b */
    private final C12652o f32793b = new C12652o();

    /* renamed from: c */
    private final C12644g f32794c = new C12644g();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f32790g = iArr;
        int[][] iArr2 = new int[20];
        f32791h = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i = 10; i < 20; i++) {
            int[] iArr3 = f32790g[i - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i2 = 0; i2 < iArr3.length; i2++) {
                iArr4[i2] = iArr3[(iArr3.length - i2) - 1];
            }
            f32791h[i] = iArr4;
        }
    }

    /* renamed from: h */
    static boolean m4616h(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i = length - 1;
        if (m4610q(charSequence.subSequence(0, i)) != Character.digit(charSequence.charAt(i), 10)) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static int m4615i(C10119a c10119a, int[] iArr, int i, int[][] iArr2) {
        AbstractC12648k.m4629e(c10119a, i, iArr);
        int length = iArr2.length;
        float f = 0.48f;
        int i2 = -1;
        for (int i3 = 0; i3 < length; i3++) {
            float m4630d = AbstractC12648k.m4630d(iArr, iArr2[i3], 0.7f);
            if (m4630d < f) {
                i2 = i3;
                f = m4630d;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        throw C7064j.m21461a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static int[] m4613m(C10119a c10119a, int i, boolean z, int[] iArr) {
        return m4612n(c10119a, i, z, iArr, new int[iArr.length]);
    }

    /* renamed from: n */
    private static int[] m4612n(C10119a c10119a, int i, boolean z, int[] iArr, int[] iArr2) {
        int m12263f;
        int m12261j = c10119a.m12261j();
        if (z) {
            m12263f = c10119a.m12262g(i);
        } else {
            m12263f = c10119a.m12263f(i);
        }
        int length = iArr.length;
        boolean z2 = z;
        int i2 = 0;
        int i3 = m12263f;
        while (m12263f < m12261j) {
            if (c10119a.m12265d(m12263f) != z2) {
                iArr2[i2] = iArr2[i2] + 1;
            } else {
                if (i2 == length - 1) {
                    if (AbstractC12648k.m4630d(iArr2, iArr, 0.7f) < 0.48f) {
                        return new int[]{i3, m12263f};
                    }
                    i3 += iArr2[0] + iArr2[1];
                    int i4 = i2 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i4);
                    iArr2[i4] = 0;
                    iArr2[i2] = 0;
                    i2--;
                } else {
                    i2++;
                }
                iArr2[i2] = 1;
                z2 = !z2;
            }
            m12263f++;
        }
        throw C7064j.m21461a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public static int[] m4611o(C10119a c10119a) {
        int[] iArr = new int[f32787d.length];
        int[] iArr2 = null;
        boolean z = false;
        int i = 0;
        while (!z) {
            int[] iArr3 = f32787d;
            Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = m4612n(c10119a, i, false, iArr3, iArr);
            int i2 = iArr2[0];
            int i3 = iArr2[1];
            int i4 = i2 - (i3 - i2);
            if (i4 >= 0) {
                z = c10119a.m12260k(i4, i2, false);
            }
            i = i3;
        }
        return iArr2;
    }

    /* renamed from: q */
    static int m4610q(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        for (int i2 = length - 1; i2 >= 0; i2 -= 2) {
            int charAt = charSequence.charAt(i2) - '0';
            if (charAt >= 0 && charAt <= 9) {
                i += charAt;
            } else {
                throw C7060f.m21471a();
            }
        }
        int i3 = i * 3;
        for (int i4 = length - 2; i4 >= 0; i4 -= 2) {
            int charAt2 = charSequence.charAt(i4) - '0';
            if (charAt2 >= 0 && charAt2 <= 9) {
                i3 += charAt2;
            } else {
                throw C7060f.m21471a();
            }
        }
        return (1000 - i3) % 10;
    }

    @Override // tc.AbstractC12648k
    /* renamed from: b */
    public Result mo2954b(int i, C10119a c10119a, Map<EnumC7059e, ?> map) {
        return mo4614l(i, c10119a, m4611o(c10119a), map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean mo4609g(String str) {
        return m4616h(str);
    }

    /* renamed from: j */
    int[] mo4608j(C10119a c10119a, int i) {
        return m4613m(c10119a, i, false, f32787d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public abstract int mo4607k(C10119a c10119a, int[] iArr, StringBuilder sb2);

    /* renamed from: l */
    public Result mo4614l(int i, C10119a c10119a, int[] iArr, Map<EnumC7059e, ?> map) {
        InterfaceC7070p interfaceC7070p;
        int i2;
        String m4639c;
        int[] iArr2 = null;
        if (map == null) {
            interfaceC7070p = null;
        } else {
            interfaceC7070p = (InterfaceC7070p) map.get(EnumC7059e.NEED_RESULT_POINT_CALLBACK);
        }
        boolean z = true;
        if (interfaceC7070p != null) {
            interfaceC7070p.m21452a(new C7069o((iArr[0] + iArr[1]) / 2.0f, i));
        }
        StringBuilder sb2 = this.f32792a;
        sb2.setLength(0);
        int mo4607k = mo4607k(c10119a, iArr, sb2);
        if (interfaceC7070p != null) {
            interfaceC7070p.m21452a(new C7069o(mo4607k, i));
        }
        int[] mo4608j = mo4608j(c10119a, mo4607k);
        if (interfaceC7070p != null) {
            interfaceC7070p.m21452a(new C7069o((mo4608j[0] + mo4608j[1]) / 2.0f, i));
        }
        int i3 = mo4608j[1];
        int i4 = (i3 - mo4608j[0]) + i3;
        if (i4 < c10119a.m12261j() && c10119a.m12260k(i3, i4, false)) {
            String sb3 = sb2.toString();
            if (sb3.length() >= 8) {
                if (mo4609g(sb3)) {
                    EnumC7055a mo4606p = mo4606p();
                    float f = i;
                    Result result = new Result(sb3, null, new C7069o[]{new C7069o((iArr[1] + iArr[0]) / 2.0f, f), new C7069o((mo4608j[1] + mo4608j[0]) / 2.0f, f)}, mo4606p);
                    try {
                        Result m4617a = this.f32793b.m4617a(i, c10119a, mo4608j[1]);
                        result.m26107h(EnumC7068n.UPC_EAN_EXTENSION, m4617a.m26109f());
                        result.m26108g(m4617a.m26111d());
                        result.m26114a(m4617a.m26110e());
                        i2 = m4617a.m26109f().length();
                    } catch (AbstractC7067m unused) {
                        i2 = 0;
                    }
                    if (map != null) {
                        iArr2 = (int[]) map.get(EnumC7059e.ALLOWED_EAN_EXTENSIONS);
                    }
                    if (iArr2 != null) {
                        int length = iArr2.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length) {
                                if (i2 == iArr2[i5]) {
                                    break;
                                }
                                i5++;
                            } else {
                                z = false;
                                break;
                            }
                        }
                        if (!z) {
                            throw C7064j.m21461a();
                        }
                    }
                    if ((mo4606p == EnumC7055a.EAN_13 || mo4606p == EnumC7055a.UPC_A) && (m4639c = this.f32794c.m4639c(sb3)) != null) {
                        result.m26107h(EnumC7068n.POSSIBLE_COUNTRY, m4639c);
                    }
                    return result;
                }
                throw C7058d.m21472a();
            }
            throw C7060f.m21471a();
        }
        throw C7064j.m21461a();
    }

    /* renamed from: p */
    abstract EnumC7055a mo4606p();
}
