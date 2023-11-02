package tg;

import ai.InterfaceC0194h;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p142hi.AbstractC7297n1;
import p161ii.AbstractC7592g;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11947m;

/* renamed from: tg.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC12739t implements InterfaceC11914e {

    /* renamed from: j */
    public static final C12740a f33063j = new C12740a(null);

    /* renamed from: tg.t$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C12740a {
        private C12740a() {
        }

        public /* synthetic */ C12740a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final InterfaceC0194h m4219a(InterfaceC11914e interfaceC11914e, AbstractC7297n1 typeSubstitution, AbstractC7592g kotlinTypeRefiner) {
            AbstractC12739t abstractC12739t;
            InterfaceC0194h mo4220g0;
            C9612q.m13917h(interfaceC11914e, "<this>");
            C9612q.m13917h(typeSubstitution, "typeSubstitution");
            C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
            if (interfaceC11914e instanceof AbstractC12739t) {
                abstractC12739t = (AbstractC12739t) interfaceC11914e;
            } else {
                abstractC12739t = null;
            }
            if (abstractC12739t == null || (mo4220g0 = abstractC12739t.mo4220g0(typeSubstitution, kotlinTypeRefiner)) == null) {
                InterfaceC0194h mo4232K = interfaceC11914e.mo4232K(typeSubstitution);
                C9612q.m13918g(mo4232K, "this.getMemberScope(\n   …ubstitution\n            )");
                return mo4232K;
            }
            return mo4220g0;
        }

        /* renamed from: b */
        public final InterfaceC0194h m4218b(InterfaceC11914e interfaceC11914e, AbstractC7592g kotlinTypeRefiner) {
            AbstractC12739t abstractC12739t;
            InterfaceC0194h mo4166r0;
            C9612q.m13917h(interfaceC11914e, "<this>");
            C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
            if (interfaceC11914e instanceof AbstractC12739t) {
                abstractC12739t = (AbstractC12739t) interfaceC11914e;
            } else {
                abstractC12739t = null;
            }
            if (abstractC12739t == null || (mo4166r0 = abstractC12739t.mo4166r0(kotlinTypeRefiner)) == null) {
                InterfaceC0194h mo4227T = interfaceC11914e.mo4227T();
                C9612q.m13918g(mo4227T, "this.unsubstitutedMemberScope");
                return mo4227T;
            }
            return mo4166r0;
        }
    }

    @Override // p305qg.InterfaceC11914e, p305qg.InterfaceC11947m
    /* renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC11927h mo4221a() {
        return mo4221a();
    }

    /* renamed from: g0 */
    public abstract InterfaceC0194h mo4220g0(AbstractC7297n1 abstractC7297n1, AbstractC7592g abstractC7592g);

    /* renamed from: r0 */
    public abstract InterfaceC0194h mo4166r0(AbstractC7592g abstractC7592g);

    @Override // p305qg.InterfaceC11947m
    /* renamed from: a */
    public /* bridge */ /* synthetic */ InterfaceC11947m mo4221a() {
        return mo4221a();
    }
}