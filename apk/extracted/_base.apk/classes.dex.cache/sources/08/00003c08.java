package p164j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p164j$.util.Spliterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.V */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8613V extends CountedCompleter {

    /* renamed from: a */
    private Spliterator f22770a;

    /* renamed from: b */
    private final InterfaceC8671h2 f22771b;

    /* renamed from: c */
    private final AbstractC8744w0 f22772c;

    /* renamed from: d */
    private long f22773d;

    C8613V(C8613V c8613v, Spliterator spliterator) {
        super(c8613v);
        this.f22770a = spliterator;
        this.f22771b = c8613v.f22771b;
        this.f22773d = c8613v.f22773d;
        this.f22772c = c8613v.f22772c;
    }

    public C8613V(AbstractC8744w0 abstractC8744w0, Spliterator spliterator, InterfaceC8671h2 interfaceC8671h2) {
        super(null);
        this.f22771b = interfaceC8671h2;
        this.f22772c = abstractC8744w0;
        this.f22770a = spliterator;
        this.f22773d = 0L;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f22770a;
        long estimateSize = spliterator.estimateSize();
        long j = this.f22773d;
        if (j == 0) {
            j = AbstractC8658f.m17470f(estimateSize);
            this.f22773d = j;
        }
        boolean m17537d = EnumC8616V2.SHORT_CIRCUIT.m17537d(this.f22772c.mo17345g1());
        InterfaceC8671h2 interfaceC8671h2 = this.f22771b;
        boolean z = false;
        C8613V c8613v = this;
        while (true) {
            if (m17537d && interfaceC8671h2.mo17301i()) {
                break;
            } else if (estimateSize <= j || (trySplit = spliterator.trySplit()) == null) {
                break;
            } else {
                C8613V c8613v2 = new C8613V(c8613v, trySplit);
                c8613v.addToPendingCount(1);
                if (z) {
                    spliterator = trySplit;
                } else {
                    C8613V c8613v3 = c8613v;
                    c8613v = c8613v2;
                    c8613v2 = c8613v3;
                }
                z = !z;
                c8613v.fork();
                c8613v = c8613v2;
                estimateSize = spliterator.estimateSize();
            }
        }
        c8613v.f22772c.mo17356V0(spliterator, interfaceC8671h2);
        c8613v.f22770a = null;
        c8613v.propagateCompletion();
    }
}