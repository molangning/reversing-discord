package p142hi;

import ai.InterfaceC0194h;
import kotlin.jvm.internal.C9612q;
import p161ii.InterfaceC7605n;

/* renamed from: hi.w0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7335w0 extends AbstractC7231e {

    /* renamed from: o */
    private final InterfaceC7265g1 f19770o;

    /* renamed from: p */
    private final InterfaceC0194h f19771p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7335w0(InterfaceC7605n originalTypeVariable, boolean z, InterfaceC7265g1 constructor) {
        super(originalTypeVariable, z);
        C9612q.m13917h(originalTypeVariable, "originalTypeVariable");
        C9612q.m13917h(constructor, "constructor");
        this.f19770o = constructor;
        this.f19771p = originalTypeVariable.mo2790n().m9810i().mo3553o();
    }

    @Override // p142hi.AbstractC7264g0
    /* renamed from: N0 */
    public InterfaceC7265g1 mo3564N0() {
        return this.f19770o;
    }

    @Override // p142hi.AbstractC7231e
    /* renamed from: X0 */
    public AbstractC7231e mo20937X0(boolean z) {
        return new C7335w0(m21187W0(), z, mo3564N0());
    }

    @Override // p142hi.AbstractC7231e, p142hi.AbstractC7264g0
    /* renamed from: o */
    public InterfaceC0194h mo3553o() {
        return this.f19771p;
    }

    @Override // p142hi.AbstractC7302o0
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Stub (BI): ");
        sb2.append(m21187W0());
        sb2.append(mo3563O0() ? "?" : "");
        return sb2.toString();
    }
}
