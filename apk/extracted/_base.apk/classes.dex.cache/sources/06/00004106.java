package kotlinx.coroutines;

import com.facebook.react.modules.appstate.AppStateModule;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

@Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0012\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¨\u0006\f"}, m14357d2 = {"Lkotlinx/coroutines/r2;", "Lkotlinx/coroutines/a;", "", "", "exception", "", "m0", "Lkotlin/coroutines/CoroutineContext;", "parentContext", AppStateModule.APP_STATE_ACTIVE, "<init>", "(Lkotlin/coroutines/CoroutineContext;Z)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.r2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C9849r2 extends AbstractC9670a<Unit> {
    public C9849r2(CoroutineContext coroutineContext, boolean z) {
        super(coroutineContext, true, z);
    }

    @Override // kotlinx.coroutines.C9696e2
    /* renamed from: m0 */
    protected boolean mo13101m0(Throwable th2) {
        C9815k0.m13185a(getContext(), th2);
        return true;
    }
}