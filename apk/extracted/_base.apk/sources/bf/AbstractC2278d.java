package bf;

import java.util.concurrent.atomic.AtomicReference;
import p106ff.C6421b;

/* renamed from: bf.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
abstract class AbstractC2278d<T> extends AtomicReference<T> implements InterfaceC2276b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2278d(T t) {
        super(C6421b.m22784c(t, "value is null"));
    }

    /* renamed from: a */
    protected abstract void mo33682a(T t);

    @Override // bf.InterfaceC2276b
    /* renamed from: b */
    public final boolean mo16034b() {
        return get() == null;
    }

    @Override // bf.InterfaceC2276b
    public final void dispose() {
        T andSet;
        if (get() != null && (andSet = getAndSet(null)) != null) {
            mo33682a(andSet);
        }
    }
}
