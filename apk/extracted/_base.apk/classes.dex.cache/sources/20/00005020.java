package p389vh;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import ng.AbstractC10870h;
import p142hi.AbstractC7264g0;
import p305qg.InterfaceC11928h0;

/* renamed from: vh.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C13296b extends AbstractC13301g<List<? extends AbstractC13301g<?>>> {

    /* renamed from: b */
    private final Function1<InterfaceC11928h0, AbstractC7264g0> f34375b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C13296b(List<? extends AbstractC13301g<?>> value, Function1<? super InterfaceC11928h0, ? extends AbstractC7264g0> computeType) {
        super(value);
        C9612q.m13917h(value, "value");
        C9612q.m13917h(computeType, "computeType");
        this.f34375b = computeType;
    }

    @Override // p389vh.AbstractC13301g
    /* renamed from: a */
    public AbstractC7264g0 mo2775a(InterfaceC11928h0 module) {
        C9612q.m13917h(module, "module");
        AbstractC7264g0 invoke = this.f34375b.invoke(module);
        if (!AbstractC10870h.m9820c0(invoke) && !AbstractC10870h.m9795p0(invoke)) {
            AbstractC10870h.m9849C0(invoke);
        }
        return invoke;
    }
}