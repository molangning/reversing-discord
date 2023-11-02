package tc;

import com.google.zxing.Result;
import lc.C10119a;
import p136hc.AbstractC7067m;

/* renamed from: tc.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C12652o {

    /* renamed from: c */
    private static final int[] f32784c = {1, 1, 2};

    /* renamed from: a */
    private final C12650m f32785a = new C12650m();

    /* renamed from: b */
    private final C12651n f32786b = new C12651n();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public Result m4617a(int i, C10119a c10119a, int i2) {
        int[] m4613m = AbstractC12653p.m4613m(c10119a, i2, false, f32784c);
        try {
            return this.f32786b.m4622b(i, c10119a, m4613m);
        } catch (AbstractC7067m unused) {
            return this.f32785a.m4625b(i, c10119a, m4613m);
        }
    }
}
