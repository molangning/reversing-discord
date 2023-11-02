package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¨\u0006\u0005"}, m14357d2 = {"T", "Lkotlinx/coroutines/Job;", "parent", "Lkotlinx/coroutines/CompletableDeferred;", "a", "kotlinx-coroutines-core"}, m14356k = 2, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C9915y {
    /* renamed from: a */
    public static final <T> CompletableDeferred<T> m12966a(Job job) {
        return new C9911x(job);
    }

    /* renamed from: b */
    public static /* synthetic */ CompletableDeferred m12965b(Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return m12966a(job);
    }
}