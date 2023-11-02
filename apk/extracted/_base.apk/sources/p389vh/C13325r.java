package p389vh;

import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7302o0;
import p305qg.InterfaceC11928h0;

/* renamed from: vh.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C13325r extends AbstractC13318o<Long> {
    public C13325r(long j) {
        super(Long.valueOf(j));
    }

    @Override // p389vh.AbstractC13301g
    /* renamed from: c */
    public AbstractC7302o0 mo2775a(InterfaceC11928h0 module) {
        C9612q.m13917h(module, "module");
        AbstractC7302o0 m9845F = module.mo4194n().m9845F();
        C9612q.m13918g(m9845F, "module.builtIns.longType");
        return m9845F;
    }

    @Override // p389vh.AbstractC13301g
    public String toString() {
        return mo2813b().longValue() + ".toLong()";
    }
}
