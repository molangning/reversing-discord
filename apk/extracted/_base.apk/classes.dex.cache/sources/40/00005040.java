package p389vh;

import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7302o0;
import p305qg.InterfaceC11928h0;

/* renamed from: vh.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C13328u extends AbstractC13318o<Short> {
    public C13328u(short s) {
        super(Short.valueOf(s));
    }

    @Override // p389vh.AbstractC13301g
    /* renamed from: c */
    public AbstractC7302o0 mo2775a(InterfaceC11928h0 module) {
        C9612q.m13917h(module, "module");
        AbstractC7302o0 m9832T = module.mo4194n().m9832T();
        C9612q.m13918g(m9832T, "module.builtIns.shortType");
        return m9832T;
    }

    @Override // p389vh.AbstractC13301g
    public String toString() {
        return mo2813b().intValue() + ".toShort()";
    }
}