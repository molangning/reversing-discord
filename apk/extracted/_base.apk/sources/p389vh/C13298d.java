package p389vh;

import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7302o0;
import p305qg.InterfaceC11928h0;

/* renamed from: vh.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C13298d extends AbstractC13318o<Byte> {
    public C13298d(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // p389vh.AbstractC13301g
    /* renamed from: c */
    public AbstractC7302o0 mo2775a(InterfaceC11928h0 module) {
        C9612q.m13917h(module, "module");
        AbstractC7302o0 m9788t = module.mo4194n().m9788t();
        C9612q.m13918g(m9788t, "module.builtIns.byteType");
        return m9788t;
    }

    @Override // p389vh.AbstractC13301g
    public String toString() {
        return mo2813b().intValue() + ".toByte()";
    }
}
