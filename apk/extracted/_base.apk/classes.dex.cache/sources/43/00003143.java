package p070di;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7264g0;
import p305qg.InterfaceC11928h0;
import p389vh.AbstractC13301g;
import p389vh.C13296b;

/* renamed from: di.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C5943n extends C13296b {

    /* renamed from: c */
    private final AbstractC7264g0 f16943c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: di.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C5944a extends AbstractC9614s implements Function1<InterfaceC11928h0, AbstractC7264g0> {

        /* renamed from: j */
        final /* synthetic */ AbstractC7264g0 f16944j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5944a(AbstractC7264g0 abstractC7264g0) {
            super(1);
            this.f16944j = abstractC7264g0;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final AbstractC7264g0 invoke(InterfaceC11928h0 it) {
            C9612q.m13917h(it, "it");
            return this.f16944j;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5943n(List<? extends AbstractC13301g<?>> value, AbstractC7264g0 type) {
        super(value, new C5944a(type));
        C9612q.m13917h(value, "value");
        C9612q.m13917h(type, "type");
        this.f16943c = type;
    }

    /* renamed from: c */
    public final AbstractC7264g0 m24092c() {
        return this.f16943c;
    }
}