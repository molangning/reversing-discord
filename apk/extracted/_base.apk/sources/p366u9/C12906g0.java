package p366u9;

import java.math.RoundingMode;
import java.util.Arrays;

/* renamed from: u9.g0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C12906g0 {

    /* renamed from: a */
    private final String f33592a;

    /* renamed from: b */
    private final char[] f33593b;

    /* renamed from: c */
    final int f33594c;

    /* renamed from: d */
    final int f33595d;

    /* renamed from: e */
    final int f33596e;

    /* renamed from: f */
    final int f33597f;

    /* renamed from: g */
    private final byte[] f33598g;

    /* renamed from: h */
    private final boolean[] f33599h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12906g0(String str, char[] cArr) {
        String str2;
        boolean z;
        boolean z2;
        this.f33592a = (String) C12919n.m3674b(str);
        this.f33593b = (char[]) C12919n.m3674b(cArr);
        try {
            int m3679b = C12914k0.m3679b(cArr.length, RoundingMode.UNNECESSARY);
            this.f33595d = m3679b;
            int min = Math.min(8, Integer.lowestOneBit(m3679b));
            try {
                this.f33596e = 8 / min;
                this.f33597f = m3679b / min;
                this.f33594c = cArr.length - 1;
                byte[] bArr = new byte[128];
                Arrays.fill(bArr, (byte) -1);
                for (int i = 0; i < cArr.length; i++) {
                    char c = cArr[i];
                    if (c < 128) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C12919n.m3670f(z, "Non-ASCII character: %s", c);
                    if (bArr[c] == -1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    C12919n.m3670f(z2, "Duplicate character: %s", c);
                    bArr[c] = (byte) i;
                }
                this.f33598g = bArr;
                boolean[] zArr = new boolean[this.f33596e];
                for (int i2 = 0; i2 < this.f33597f; i2++) {
                    zArr[C12914k0.m3680a(i2 << 3, this.f33595d, RoundingMode.CEILING)] = true;
                }
                this.f33599h = zArr;
            } catch (ArithmeticException e) {
                String str3 = new String(cArr);
                if (str3.length() != 0) {
                    str2 = "Illegal alphabet ".concat(str3);
                } else {
                    str2 = new String("Illegal alphabet ");
                }
                throw new IllegalArgumentException(str2, e);
            }
        } catch (ArithmeticException e2) {
            int length = cArr.length;
            StringBuilder sb2 = new StringBuilder(35);
            sb2.append("Illegal alphabet length ");
            sb2.append(length);
            throw new IllegalArgumentException(sb2.toString(), e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final char m3690a(int i) {
        return this.f33593b[i];
    }

    /* renamed from: b */
    public final boolean m3689b(char c) {
        byte[] bArr = this.f33598g;
        return c < bArr.length && bArr[c] != -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C12906g0) {
            return Arrays.equals(this.f33593b, ((C12906g0) obj).f33593b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f33593b);
    }

    public final String toString() {
        return this.f33592a;
    }
}
