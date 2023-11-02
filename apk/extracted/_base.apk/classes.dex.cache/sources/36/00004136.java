package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000¨\u0006\u0004"}, m14357d2 = {"Lkotlinx/coroutines/Job;", "parent", "Lkotlinx/coroutines/z;", "a", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.t2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9897t2 {
    /* renamed from: a */
    public static final InterfaceC9919z m12991a(Job job) {
        return new C9853s2(job);
    }

    /* renamed from: b */
    public static /* synthetic */ InterfaceC9919z m12990b(Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return m12991a(job);
    }
}