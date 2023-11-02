package p069dh;

import ch.C2548g;
import gh.InterfaceC6781r;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import p069dh.AbstractC5884j;
import p142hi.AbstractC7264g0;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11936j1;
import p305qg.InterfaceC11989u0;
import p305qg.InterfaceC11997x0;
import ph.C11638f;

/* renamed from: dh.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public abstract class AbstractC5906m extends AbstractC5884j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5906m(C2548g c) {
        super(c, null, 2, null);
        C9612q.m13917h(c, "c");
    }

    @Override // p069dh.AbstractC5884j
    /* renamed from: H */
    protected AbstractC5884j.C5885a mo24197H(InterfaceC6781r method, List<? extends InterfaceC11920f1> methodTypeParameters, AbstractC7264g0 returnType, List<? extends InterfaceC11936j1> valueParameters) {
        List m14104i;
        C9612q.m13917h(method, "method");
        C9612q.m13917h(methodTypeParameters, "methodTypeParameters");
        C9612q.m13917h(returnType, "returnType");
        C9612q.m13917h(valueParameters, "valueParameters");
        m14104i = C9545j.m14104i();
        return new AbstractC5884j.C5885a(returnType, null, valueParameters, methodTypeParameters, false, m14104i);
    }

    @Override // p069dh.AbstractC5884j
    /* renamed from: s */
    protected void mo24196s(C11638f name, Collection<InterfaceC11989u0> result) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(result, "result");
    }

    @Override // p069dh.AbstractC5884j
    /* renamed from: z */
    protected InterfaceC11997x0 mo24195z() {
        return null;
    }
}