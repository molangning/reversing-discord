package bi;

import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7264g0;
import p305qg.InterfaceC11897a;
import ph.C11638f;

/* renamed from: bi.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2311c extends AbstractC2309a implements InterfaceC2314f {

    /* renamed from: c */
    private final InterfaceC11897a f6419c;

    /* renamed from: d */
    private final C11638f f6420d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2311c(InterfaceC11897a declarationDescriptor, AbstractC7264g0 receiverType, C11638f c11638f, InterfaceC2315g interfaceC2315g) {
        super(receiverType, interfaceC2315g);
        C9612q.m13917h(declarationDescriptor, "declarationDescriptor");
        C9612q.m13917h(receiverType, "receiverType");
        this.f6419c = declarationDescriptor;
        this.f6420d = c11638f;
    }

    @Override // bi.InterfaceC2314f
    /* renamed from: a */
    public C11638f mo33659a() {
        return this.f6420d;
    }

    /* renamed from: d */
    public InterfaceC11897a m33662d() {
        return this.f6419c;
    }

    public String toString() {
        return "Cxt { " + m33662d() + " }";
    }
}
