package kotlinx.coroutines;

import kotlin.Metadata;
import kotlinx.coroutines.internal.C9770e0;
import kotlinx.coroutines.internal.C9804v;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0002\"\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004\"\u001a\u0010\b\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0006\u001a\u0004\b\u0003\u0010\u0007¨\u0006\t"}, m14357d2 = {"Lkotlinx/coroutines/u0;", "b", "", "a", "Z", "defaultMainDelayOptIn", "Lkotlinx/coroutines/u0;", "()Lkotlinx/coroutines/u0;", "DefaultDelay", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.r0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9847r0 {

    /* renamed from: a */
    private static final boolean f25668a = C9770e0.m13323e("kotlinx.coroutines.main.delay", false);

    /* renamed from: b */
    private static final InterfaceC9899u0 f25669b = m13102b();

    /* renamed from: a */
    public static final InterfaceC9899u0 m13103a() {
        return f25669b;
    }

    /* renamed from: b */
    private static final InterfaceC9899u0 m13102b() {
        if (!f25668a) {
            return RunnableC9843q0.f25663q;
        }
        AbstractC9760i2 m13568c = C9677b1.m13568c();
        if (!C9804v.m13207c(m13568c) && (m13568c instanceof InterfaceC9899u0)) {
            return (InterfaceC9899u0) m13568c;
        }
        return RunnableC9843q0.f25663q;
    }
}