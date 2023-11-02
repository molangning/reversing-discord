package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C9612q;
import kotlinx.coroutines.Job;
import p371uf.C12967f;
import p430xi.C13814g;
import p430xi.InterfaceC13820k;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m14357d2 = {"T", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/coroutines/CoroutineContext;", "context", "b", "", "a", "(Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, m14356k = 5, m14355mv = {1, 6, 0}, m14352xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: kotlinx.coroutines.flow.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final /* synthetic */ class C9715g {
    /* renamed from: a */
    private static final void m13453a(CoroutineContext coroutineContext) {
        boolean z;
        if (coroutineContext.mo1458j(Job.f25404c) == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + coroutineContext).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final <T> Flow<T> m13452b(Flow<? extends T> flow, CoroutineContext coroutineContext) {
        m13453a(coroutineContext);
        if (!C9612q.m13922c(coroutineContext, C12967f.f33721j)) {
            if (flow instanceof InterfaceC13820k) {
                return InterfaceC13820k.C13821a.m1451a((InterfaceC13820k) flow, coroutineContext, 0, null, 6, null);
            }
            return new C13814g(flow, coroutineContext, 0, null, 12, null);
        }
        return flow;
    }
}