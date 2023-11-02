package si;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.sequences.Sequence;

@Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002R.\u0010\t\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000 \u0006*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00020\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\r"}, m14357d2 = {"Lsi/a;", "T", "Lkotlin/sequences/Sequence;", "", "iterator", "Ljava/util/concurrent/atomic/AtomicReference;", "kotlin.jvm.PlatformType", "a", "Ljava/util/concurrent/atomic/AtomicReference;", "sequenceRef", "sequence", "<init>", "(Lkotlin/sequences/Sequence;)V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: si.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12528a<T> implements Sequence<T> {

    /* renamed from: a */
    private final AtomicReference<Sequence<T>> f32561a;

    public C12528a(Sequence<? extends T> sequence) {
        C9612q.m13917h(sequence, "sequence");
        this.f32561a = new AtomicReference<>(sequence);
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<T> iterator() {
        Sequence<T> andSet = this.f32561a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
