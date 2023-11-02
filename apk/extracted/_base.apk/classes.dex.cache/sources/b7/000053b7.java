package p468zg;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import ng.AbstractC10870h;
import p160ih.C7575w;
import p305qg.InterfaceC11902b;
import p305qg.InterfaceC12005z0;
import p429xh.C13801c;
import ph.C11638f;

/* renamed from: zg.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C14214e extends C14232i0 {

    /* renamed from: n */
    public static final C14214e f36580n = new C14214e();

    /* renamed from: zg.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C14215a extends AbstractC9614s implements Function1<InterfaceC11902b, Boolean> {

        /* renamed from: j */
        final /* synthetic */ InterfaceC12005z0 f36581j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14215a(InterfaceC12005z0 interfaceC12005z0) {
            super(1);
            this.f36581j = interfaceC12005z0;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(InterfaceC11902b it) {
            C9612q.m13917h(it, "it");
            return Boolean.valueOf(C14232i0.f36605a.m349j().containsKey(C7575w.m20384d(this.f36581j)));
        }
    }

    private C14214e() {
    }

    /* renamed from: i */
    public final C11638f m413i(InterfaceC12005z0 functionDescriptor) {
        C9612q.m13917h(functionDescriptor, "functionDescriptor");
        Map<String, C11638f> m349j = C14232i0.f36605a.m349j();
        String m20384d = C7575w.m20384d(functionDescriptor);
        if (m20384d == null) {
            return null;
        }
        return m349j.get(m20384d);
    }

    /* renamed from: j */
    public final boolean m412j(InterfaceC12005z0 functionDescriptor) {
        C9612q.m13917h(functionDescriptor, "functionDescriptor");
        if (!AbstractC10870h.m9814f0(functionDescriptor) || C13801c.m1509f(functionDescriptor, false, new C14215a(functionDescriptor), 1, null) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final boolean m411k(InterfaceC12005z0 interfaceC12005z0) {
        C9612q.m13917h(interfaceC12005z0, "<this>");
        if (C9612q.m13922c(interfaceC12005z0.getName().m7426b(), "removeAt") && C9612q.m13922c(C7575w.m20384d(interfaceC12005z0), C14232i0.f36605a.m351h().m344b())) {
            return true;
        }
        return false;
    }
}