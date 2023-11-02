package tc;

import com.google.zxing.Result;
import java.util.EnumMap;
import java.util.Map;
import lc.C10119a;
import p136hc.C7064j;
import p136hc.C7069o;
import p136hc.EnumC7055a;
import p136hc.EnumC7068n;

/* renamed from: tc.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12650m {

    /* renamed from: a */
    private final int[] f32779a = new int[4];

    /* renamed from: b */
    private final StringBuilder f32780b = new StringBuilder();

    /* renamed from: a */
    private int m4626a(C10119a c10119a, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f32779a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int m12261j = c10119a.m12261j();
        int i = iArr[1];
        int i2 = 0;
        for (int i3 = 0; i3 < 2 && i < m12261j; i3++) {
            int m4615i = AbstractC12653p.m4615i(c10119a, iArr2, i, AbstractC12653p.f32791h);
            sb2.append((char) ((m4615i % 10) + 48));
            for (int i4 : iArr2) {
                i += i4;
            }
            if (m4615i >= 10) {
                i2 |= 1 << (1 - i3);
            }
            if (i3 != 1) {
                i = c10119a.m12262g(c10119a.m12263f(i));
            }
        }
        if (sb2.length() == 2) {
            if (Integer.parseInt(sb2.toString()) % 4 == i2) {
                return i;
            }
            throw C7064j.m21461a();
        }
        throw C7064j.m21461a();
    }

    /* renamed from: c */
    private static Map<EnumC7068n, Object> m4624c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(EnumC7068n.class);
        enumMap.put((EnumMap) EnumC7068n.ISSUE_NUMBER, (EnumC7068n) Integer.valueOf(str));
        return enumMap;
    }

    /* renamed from: b */
    public Result m4625b(int i, C10119a c10119a, int[] iArr) {
        StringBuilder sb2 = this.f32780b;
        sb2.setLength(0);
        int m4626a = m4626a(c10119a, iArr, sb2);
        String sb3 = sb2.toString();
        Map<EnumC7068n, Object> m4624c = m4624c(sb3);
        float f = i;
        Result result = new Result(sb3, null, new C7069o[]{new C7069o((iArr[0] + iArr[1]) / 2.0f, f), new C7069o(m4626a, f)}, EnumC7055a.UPC_EAN_EXTENSION);
        if (m4624c != null) {
            result.m26108g(m4624c);
        }
        return result;
    }
}