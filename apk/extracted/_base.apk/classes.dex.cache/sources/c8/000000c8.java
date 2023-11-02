package ai;

import java.util.Collection;
import kotlin.jvm.functions.Function1;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11947m;
import p448yg.InterfaceC14020b;
import ph.C11638f;

/* renamed from: ai.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public interface InterfaceC0200k {

    /* renamed from: ai.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C0201a {
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: a */
        public static /* synthetic */ Collection m40970a(InterfaceC0200k interfaceC0200k, C0185d c0185d, Function1 function1, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    c0185d = C0185d.f620o;
                }
                Function1<C11638f, Boolean> function12 = function1;
                if ((i & 2) != 0) {
                    function12 = InterfaceC0194h.f645a.m40973a();
                }
                return interfaceC0200k.mo4358e(c0185d, function12);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
        }
    }

    /* renamed from: e */
    Collection<InterfaceC11947m> mo4358e(C0185d c0185d, Function1<? super C11638f, Boolean> function1);

    /* renamed from: g */
    InterfaceC11927h mo16932g(C11638f c11638f, InterfaceC14020b interfaceC14020b);
}