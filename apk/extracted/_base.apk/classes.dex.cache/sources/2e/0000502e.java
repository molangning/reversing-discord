package p389vh;

import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7302o0;
import p305qg.InterfaceC11928h0;

/* renamed from: vh.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C13310l extends AbstractC13301g<Float> {
    public C13310l(float f) {
        super(Float.valueOf(f));
    }

    @Override // p389vh.AbstractC13301g
    /* renamed from: c */
    public AbstractC7302o0 mo2775a(InterfaceC11928h0 module) {
        C9612q.m13917h(module, "module");
        AbstractC7302o0 m9852B = module.mo4194n().m9852B();
        C9612q.m13918g(m9852B, "module.builtIns.floatType");
        return m9852B;
    }

    @Override // p389vh.AbstractC13301g
    public String toString() {
        return mo2813b().floatValue() + ".toFloat()";
    }
}