package p468zg;

import kotlin.jvm.internal.C9612q;
import p069dh.C5843c;
import p305qg.InterfaceC11897a;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11989u0;
import th.InterfaceC12759f;

/* renamed from: zg.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C14245n implements InterfaceC12759f {
    @Override // th.InterfaceC12759f
    /* renamed from: a */
    public InterfaceC12759f.EnumC12760a mo305a() {
        return InterfaceC12759f.EnumC12760a.BOTH;
    }

    @Override // th.InterfaceC12759f
    /* renamed from: b */
    public InterfaceC12759f.EnumC12761b mo304b(InterfaceC11897a superDescriptor, InterfaceC11897a subDescriptor, InterfaceC11914e interfaceC11914e) {
        C9612q.m13917h(superDescriptor, "superDescriptor");
        C9612q.m13917h(subDescriptor, "subDescriptor");
        if ((subDescriptor instanceof InterfaceC11989u0) && (superDescriptor instanceof InterfaceC11989u0)) {
            InterfaceC11989u0 interfaceC11989u0 = (InterfaceC11989u0) subDescriptor;
            InterfaceC11989u0 interfaceC11989u02 = (InterfaceC11989u0) superDescriptor;
            if (!C9612q.m13922c(interfaceC11989u0.getName(), interfaceC11989u02.getName())) {
                return InterfaceC12759f.EnumC12761b.UNKNOWN;
            }
            if (C5843c.m24377a(interfaceC11989u0) && C5843c.m24377a(interfaceC11989u02)) {
                return InterfaceC12759f.EnumC12761b.OVERRIDABLE;
            }
            if (!C5843c.m24377a(interfaceC11989u0) && !C5843c.m24377a(interfaceC11989u02)) {
                return InterfaceC12759f.EnumC12761b.UNKNOWN;
            }
            return InterfaceC12759f.EnumC12761b.INCOMPATIBLE;
        }
        return InterfaceC12759f.EnumC12761b.UNKNOWN;
    }
}
