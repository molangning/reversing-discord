package p430xi;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;
import p371uf.C12967f;
import p409wi.EnumC13603e;

@Metadata(m14358d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J,\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, m14357d2 = {"Lxi/k;", "T", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lwi/e;", "onBufferOverflow", "a", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: xi.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public interface InterfaceC13820k<T> extends Flow<T> {

    @Metadata(m14356k = 3, m14355mv = {1, 6, 0}, m14353xi = 48)
    /* renamed from: xi.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C13821a {
        /* renamed from: a */
        public static /* synthetic */ Flow m1451a(InterfaceC13820k interfaceC13820k, CoroutineContext coroutineContext, int i, EnumC13603e enumC13603e, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    coroutineContext = C12967f.f33721j;
                }
                if ((i2 & 2) != 0) {
                    i = -3;
                }
                if ((i2 & 4) != 0) {
                    enumC13603e = EnumC13603e.SUSPEND;
                }
                return interfaceC13820k.mo1452a(coroutineContext, i, enumC13603e);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    /* renamed from: a */
    Flow<T> mo1452a(CoroutineContext coroutineContext, int i, EnumC13603e enumC13603e);
}
