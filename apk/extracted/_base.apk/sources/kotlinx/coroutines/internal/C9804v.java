package kotlinx.coroutines.internal;

import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.AbstractC9760i2;
import pf.C11568i;

@Metadata(m14358d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0006\u001a\u001a\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001H\u0007\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0003H\u0007\u001a \u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\u001a\b\u0010\u000e\u001a\u00020\rH\u0000\"\u001a\u0010\u0012\u001a\u00020\u00058\u0002X\u0082D¢\u0006\f\n\u0004\b\f\u0010\u000f\u0012\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, m14357d2 = {"Lkotlinx/coroutines/internal/t;", "", "factories", "Lkotlinx/coroutines/i2;", "e", "", "c", "", "cause", "", "errorHint", "Lkotlinx/coroutines/internal/w;", "a", "", "d", "Z", "getSUPPORT_MISSING$annotations", "()V", "SUPPORT_MISSING", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9804v {

    /* renamed from: a */
    private static final boolean f25630a = true;

    /* renamed from: a */
    private static final C9805w m13209a(Throwable th2, String str) {
        if (f25630a) {
            return new C9805w(th2, str);
        }
        if (th2 != null) {
            throw th2;
        }
        m13206d();
        throw new C11568i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ C9805w m13208b(Throwable th2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            th2 = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return m13209a(th2, str);
    }

    /* renamed from: c */
    public static final boolean m13207c(AbstractC9760i2 abstractC9760i2) {
        return abstractC9760i2.mo2767F0() instanceof C9805w;
    }

    /* renamed from: d */
    public static final Void m13206d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    /* renamed from: e */
    public static final AbstractC9760i2 m13205e(InterfaceC9802t interfaceC9802t, List<? extends InterfaceC9802t> list) {
        try {
            return interfaceC9802t.mo2773b(list);
        } catch (Throwable th2) {
            return m13209a(th2, interfaceC9802t.mo2774a());
        }
    }
}
