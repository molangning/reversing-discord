package bi;

import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7264g0;
import p305qg.InterfaceC11914e;
import ph.C11638f;

/* renamed from: bi.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2310b extends AbstractC2309a implements InterfaceC2314f {

    /* renamed from: c */
    private final InterfaceC11914e f6417c;

    /* renamed from: d */
    private final C11638f f6418d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2310b(InterfaceC11914e classDescriptor, AbstractC7264g0 receiverType, C11638f c11638f, InterfaceC2315g interfaceC2315g) {
        super(receiverType, interfaceC2315g);
        C9612q.m13917h(classDescriptor, "classDescriptor");
        C9612q.m13917h(receiverType, "receiverType");
        this.f6417c = classDescriptor;
        this.f6418d = c11638f;
    }

    @Override // bi.InterfaceC2314f
    /* renamed from: a */
    public C11638f mo33659a() {
        return this.f6418d;
    }

    public String toString() {
        return getType() + ": Ctx { " + this.f6417c + " }";
    }
}