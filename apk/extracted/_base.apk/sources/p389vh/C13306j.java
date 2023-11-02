package p389vh;

import kotlin.Pair;
import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p183ji.C8967k;
import p183ji.EnumC8966j;
import p305qg.C11994x;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11928h0;
import pf.C11591x;
import ph.C11632b;
import ph.C11638f;
import th.C12758e;

/* renamed from: vh.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C13306j extends AbstractC13301g<Pair<? extends C11632b, ? extends C11638f>> {

    /* renamed from: b */
    private final C11632b f34382b;

    /* renamed from: c */
    private final C11638f f34383c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13306j(C11632b enumClassId, C11638f enumEntryName) {
        super(C11591x.m7577a(enumClassId, enumEntryName));
        C9612q.m13917h(enumClassId, "enumClassId");
        C9612q.m13917h(enumEntryName, "enumEntryName");
        this.f34382b = enumClassId;
        this.f34383c = enumEntryName;
    }

    @Override // p389vh.AbstractC13301g
    /* renamed from: a */
    public AbstractC7264g0 mo2775a(InterfaceC11928h0 module) {
        C9612q.m13917h(module, "module");
        InterfaceC11914e m6652a = C11994x.m6652a(module, this.f34382b);
        AbstractC7302o0 abstractC7302o0 = null;
        if (m6652a != null) {
            if (!C12758e.m4124A(m6652a)) {
                m6652a = null;
            }
            if (m6652a != null) {
                abstractC7302o0 = m6652a.mo4224p();
            }
        }
        if (abstractC7302o0 == null) {
            EnumC8966j enumC8966j = EnumC8966j.ERROR_ENUM_TYPE;
            String c11632b = this.f34382b.toString();
            C9612q.m13918g(c11632b, "enumClassId.toString()");
            String c11638f = this.f34383c.toString();
            C9612q.m13918g(c11638f, "enumEntryName.toString()");
            return C8967k.m16945d(enumC8966j, c11632b, c11638f);
        }
        return abstractC7302o0;
    }

    /* renamed from: c */
    public final C11638f m2814c() {
        return this.f34383c;
    }

    @Override // p389vh.AbstractC13301g
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f34382b.m7463j());
        sb2.append('.');
        sb2.append(this.f34383c);
        return sb2.toString();
    }
}
