package p389vh;

import kotlin.jvm.internal.C9612q;
import ng.C10884k;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p183ji.C8967k;
import p183ji.EnumC8966j;
import p305qg.C11994x;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11928h0;

/* renamed from: vh.x */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C13331x extends AbstractC13295a0<Integer> {
    public C13331x(int i) {
        super(Integer.valueOf(i));
    }

    @Override // p389vh.AbstractC13301g
    /* renamed from: a */
    public AbstractC7264g0 mo2775a(InterfaceC11928h0 module) {
        AbstractC7302o0 abstractC7302o0;
        C9612q.m13917h(module, "module");
        InterfaceC11914e m6652a = C11994x.m6652a(module, C10884k.C10885a.f28435A0);
        if (m6652a != null) {
            abstractC7302o0 = m6652a.mo4224p();
        } else {
            abstractC7302o0 = null;
        }
        if (abstractC7302o0 == null) {
            return C8967k.m16945d(EnumC8966j.NOT_FOUND_UNSIGNED_TYPE, "UInt");
        }
        return abstractC7302o0;
    }

    @Override // p389vh.AbstractC13301g
    public String toString() {
        return mo2813b().intValue() + ".toUInt()";
    }
}
