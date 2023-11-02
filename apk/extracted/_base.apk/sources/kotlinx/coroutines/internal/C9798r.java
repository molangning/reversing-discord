package kotlinx.coroutines.internal;

import androidx.concurrent.futures.C0647b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m14357d2 = {"Lkotlinx/coroutines/internal/r;", "", "E", "", "b", "()V", "element", "", "a", "(Ljava/lang/Object;)Z", "d", "()Ljava/lang/Object;", "", "c", "()I", "size", "singleConsumer", "<init>", "(Z)V", "kotlinx-coroutines-core"}, m14356k = 1, m14355mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.internal.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C9798r<E> {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f25617a = AtomicReferenceFieldUpdater.newUpdater(C9798r.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur;

    public C9798r(boolean z) {
        this._cur = new C9799s(8, z);
    }

    /* renamed from: a */
    public final boolean m13229a(E e) {
        while (true) {
            C9799s c9799s = (C9799s) this._cur;
            int m13225a = c9799s.m13225a(e);
            if (m13225a == 0) {
                return true;
            }
            if (m13225a != 1) {
                if (m13225a == 2) {
                    return false;
                }
            } else {
                C0647b.m39437a(f25617a, this, c9799s, c9799s.m13217i());
            }
        }
    }

    /* renamed from: b */
    public final void m13228b() {
        while (true) {
            C9799s c9799s = (C9799s) this._cur;
            if (c9799s.m13222d()) {
                return;
            }
            C0647b.m39437a(f25617a, this, c9799s, c9799s.m13217i());
        }
    }

    /* renamed from: c */
    public final int m13227c() {
        return ((C9799s) this._cur).m13220f();
    }

    /* renamed from: d */
    public final E m13226d() {
        while (true) {
            C9799s c9799s = (C9799s) this._cur;
            E e = (E) c9799s.m13216j();
            if (e != C9799s.f25621h) {
                return e;
            }
            C0647b.m39437a(f25617a, this, c9799s, c9799s.m13217i());
        }
    }
}
