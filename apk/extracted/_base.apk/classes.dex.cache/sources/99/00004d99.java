package tc;

import com.google.zxing.Result;
import java.util.Map;
import lc.C10119a;
import p136hc.C7057c;
import p136hc.C7060f;
import p136hc.EnumC7055a;
import p136hc.EnumC7059e;

/* renamed from: tc.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12649l extends AbstractC12653p {

    /* renamed from: i */
    private final AbstractC12653p f32778i = new C12642e();

    /* renamed from: r */
    private static Result m4627r(Result result) {
        String m26109f = result.m26109f();
        if (m26109f.charAt(0) == '0') {
            Result result2 = new Result(m26109f.substring(1), null, result.m26110e(), EnumC7055a.UPC_A);
            if (result.m26111d() != null) {
                result2.m26108g(result.m26111d());
            }
            return result2;
        }
        throw C7060f.m21471a();
    }

    @Override // tc.AbstractC12648k, p136hc.InterfaceC7066l
    /* renamed from: a */
    public Result mo1567a(C7057c c7057c, Map<EnumC7059e, ?> map) {
        return m4627r(this.f32778i.mo1567a(c7057c, map));
    }

    @Override // tc.AbstractC12653p, tc.AbstractC12648k
    /* renamed from: b */
    public Result mo2954b(int i, C10119a c10119a, Map<EnumC7059e, ?> map) {
        return m4627r(this.f32778i.mo2954b(i, c10119a, map));
    }

    @Override // tc.AbstractC12653p
    /* renamed from: k */
    public int mo4607k(C10119a c10119a, int[] iArr, StringBuilder sb2) {
        return this.f32778i.mo4607k(c10119a, iArr, sb2);
    }

    @Override // tc.AbstractC12653p
    /* renamed from: l */
    public Result mo4614l(int i, C10119a c10119a, int[] iArr, Map<EnumC7059e, ?> map) {
        return m4627r(this.f32778i.mo4614l(i, c10119a, iArr, map));
    }

    @Override // tc.AbstractC12653p
    /* renamed from: p */
    EnumC7055a mo4606p() {
        return EnumC7055a.UPC_A;
    }
}