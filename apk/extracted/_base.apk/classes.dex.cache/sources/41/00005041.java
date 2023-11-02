package p389vh;

import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7302o0;
import p305qg.InterfaceC11928h0;

/* renamed from: vh.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C13329v extends AbstractC13301g<String> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13329v(String value) {
        super(value);
        C9612q.m13917h(value, "value");
    }

    @Override // p389vh.AbstractC13301g
    /* renamed from: c */
    public AbstractC7302o0 mo2775a(InterfaceC11928h0 module) {
        C9612q.m13917h(module, "module");
        AbstractC7302o0 m9829W = module.mo4194n().m9829W();
        C9612q.m13918g(m9829W, "module.builtIns.stringType");
        return m9829W;
    }

    @Override // p389vh.AbstractC13301g
    public String toString() {
        return '\"' + mo2813b() + '\"';
    }
}