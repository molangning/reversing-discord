package p164j$.util.stream;

import java.util.concurrent.CountedCompleter;
import p164j$.util.Spliterator;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.util.stream.U */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8609U extends CountedCompleter {

    /* renamed from: h */
    public static final /* synthetic */ int f22760h = 0;

    /* renamed from: a */
    private final AbstractC8744w0 f22761a;

    /* renamed from: b */
    private Spliterator f22762b;

    /* renamed from: c */
    private final long f22763c;

    /* renamed from: d */
    private final ConcurrentHashMap f22764d;

    /* renamed from: e */
    private final InterfaceC8671h2 f22765e;

    /* renamed from: f */
    private final C8609U f22766f;

    /* renamed from: g */
    private InterfaceC8548F0 f22767g;

    C8609U(C8609U c8609u, Spliterator spliterator, C8609U c8609u2) {
        super(c8609u);
        this.f22761a = c8609u.f22761a;
        this.f22762b = spliterator;
        this.f22763c = c8609u.f22763c;
        this.f22764d = c8609u.f22764d;
        this.f22765e = c8609u.f22765e;
        this.f22766f = c8609u2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C8609U(AbstractC8744w0 abstractC8744w0, Spliterator spliterator, InterfaceC8671h2 interfaceC8671h2) {
        super(null);
        this.f22761a = abstractC8744w0;
        this.f22762b = spliterator;
        this.f22763c = AbstractC8658f.m17470f(spliterator.estimateSize());
        this.f22764d = new ConcurrentHashMap(Math.max(16, AbstractC8658f.f22851g << 1));
        this.f22765e = interfaceC8671h2;
        this.f22766f = null;
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        Spliterator trySplit;
        Spliterator spliterator = this.f22762b;
        long j = this.f22763c;
        boolean z = false;
        C8609U c8609u = this;
        while (spliterator.estimateSize() > j && (trySplit = spliterator.trySplit()) != null) {
            C8609U c8609u2 = new C8609U(c8609u, trySplit, c8609u.f22766f);
            C8609U c8609u3 = new C8609U(c8609u, spliterator, c8609u2);
            c8609u.addToPendingCount(1);
            c8609u3.addToPendingCount(1);
            c8609u.f22764d.put(c8609u2, c8609u3);
            if (c8609u.f22766f != null) {
                c8609u2.addToPendingCount(1);
                if (c8609u.f22764d.replace(c8609u.f22766f, c8609u, c8609u2)) {
                    c8609u.addToPendingCount(-1);
                } else {
                    c8609u2.addToPendingCount(-1);
                }
            }
            if (z) {
                spliterator = trySplit;
                c8609u = c8609u2;
                c8609u2 = c8609u3;
            } else {
                c8609u = c8609u3;
            }
            z = !z;
            c8609u2.fork();
        }
        if (c8609u.getPendingCount() > 0) {
            C8638b c8638b = new C8638b(14);
            AbstractC8744w0 abstractC8744w0 = c8609u.f22761a;
            InterfaceC8523A0 mo17330r1 = abstractC8744w0.mo17330r1(abstractC8744w0.mo17351a1(spliterator), c8638b);
            c8609u.f22761a.mo17321w1(spliterator, mo17330r1);
            c8609u.f22767g = mo17330r1.build();
            c8609u.f22762b = null;
        }
        c8609u.tryComplete();
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        InterfaceC8548F0 interfaceC8548F0 = this.f22767g;
        if (interfaceC8548F0 != null) {
            interfaceC8548F0.forEach(this.f22765e);
            this.f22767g = null;
        } else {
            Spliterator spliterator = this.f22762b;
            if (spliterator != null) {
                this.f22761a.mo17321w1(spliterator, this.f22765e);
                this.f22762b = null;
            }
        }
        C8609U c8609u = (C8609U) this.f22764d.remove(this);
        if (c8609u != null) {
            c8609u.tryComplete();
        }
    }
}
