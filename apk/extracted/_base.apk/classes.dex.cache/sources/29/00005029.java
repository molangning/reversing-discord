package p389vh;

import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7302o0;
import p305qg.InterfaceC11928h0;

/* renamed from: vh.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C13305i extends AbstractC13301g<Double> {
    public C13305i(double d) {
        super(Double.valueOf(d));
    }

    @Override // p389vh.AbstractC13301g
    /* renamed from: c */
    public AbstractC7302o0 mo2775a(InterfaceC11928h0 module) {
        C9612q.m13917h(module, "module");
        AbstractC7302o0 m9777z = module.mo4194n().m9777z();
        C9612q.m13918g(m9777z, "module.builtIns.doubleType");
        return m9777z;
    }

    @Override // p389vh.AbstractC13301g
    public String toString() {
        return mo2813b().doubleValue() + ".toDouble()";
    }
}