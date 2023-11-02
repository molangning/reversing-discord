package p164j$.util.stream;

import p164j$.util.Spliterator;
import p164j$.util.function.IntFunction;

/* renamed from: j$.util.stream.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public abstract class AbstractC8643c extends AbstractC8744w0 implements InterfaceC8673i {

    /* renamed from: h */
    private final AbstractC8643c f22824h;

    /* renamed from: i */
    private final AbstractC8643c f22825i;

    /* renamed from: j */
    protected final int f22826j;

    /* renamed from: k */
    private AbstractC8643c f22827k;

    /* renamed from: l */
    private int f22828l;

    /* renamed from: m */
    private int f22829m;

    /* renamed from: n */
    private Spliterator f22830n;

    /* renamed from: o */
    private boolean f22831o;

    /* renamed from: p */
    private boolean f22832p;

    /* renamed from: q */
    private Runnable f22833q;

    /* renamed from: r */
    private boolean f22834r;

    public AbstractC8643c(Spliterator spliterator, int i, boolean z) {
        this.f22825i = null;
        this.f22830n = spliterator;
        this.f22824h = this;
        int i2 = EnumC8616V2.f22777g & i;
        this.f22826j = i2;
        this.f22829m = (~(i2 << 1)) & EnumC8616V2.f22782l;
        this.f22828l = 0;
        this.f22834r = z;
    }

    public AbstractC8643c(AbstractC8643c abstractC8643c, int i) {
        if (abstractC8643c.f22831o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        abstractC8643c.f22831o = true;
        abstractC8643c.f22827k = this;
        this.f22825i = abstractC8643c;
        this.f22826j = EnumC8616V2.f22778h & i;
        this.f22829m = EnumC8616V2.m17540a(i, abstractC8643c.f22829m);
        AbstractC8643c abstractC8643c2 = abstractC8643c.f22824h;
        this.f22824h = abstractC8643c2;
        if (mo17456J1()) {
            abstractC8643c2.f22832p = true;
        }
        this.f22828l = abstractC8643c.f22828l + 1;
    }

    /* renamed from: L1 */
    private Spliterator m17499L1(int i) {
        int i2;
        int i3;
        AbstractC8643c abstractC8643c = this.f22824h;
        Spliterator spliterator = abstractC8643c.f22830n;
        if (spliterator != null) {
            abstractC8643c.f22830n = null;
            if (abstractC8643c.f22834r && abstractC8643c.f22832p) {
                AbstractC8643c abstractC8643c2 = abstractC8643c.f22827k;
                int i4 = 1;
                while (abstractC8643c != this) {
                    int i5 = abstractC8643c2.f22826j;
                    if (abstractC8643c2.mo17456J1()) {
                        if (EnumC8616V2.SHORT_CIRCUIT.m17537d(i5)) {
                            i5 &= ~EnumC8616V2.f22791u;
                        }
                        spliterator = abstractC8643c2.mo17406I1(abstractC8643c, spliterator);
                        if (spliterator.hasCharacteristics(64)) {
                            i2 = (~EnumC8616V2.f22790t) & i5;
                            i3 = EnumC8616V2.f22789s;
                        } else {
                            i2 = (~EnumC8616V2.f22789s) & i5;
                            i3 = EnumC8616V2.f22790t;
                        }
                        i5 = i3 | i2;
                        i4 = 0;
                    }
                    abstractC8643c2.f22828l = i4;
                    abstractC8643c2.f22829m = EnumC8616V2.m17540a(i5, abstractC8643c.f22829m);
                    i4++;
                    AbstractC8643c abstractC8643c3 = abstractC8643c2;
                    abstractC8643c2 = abstractC8643c2.f22827k;
                    abstractC8643c = abstractC8643c3;
                }
            }
            if (i != 0) {
                this.f22829m = EnumC8616V2.m17540a(i, this.f22829m);
            }
            return spliterator;
        }
        throw new IllegalStateException("source already consumed or closed");
    }

    /* renamed from: A1 */
    public final InterfaceC8548F0 m17503A1(IntFunction intFunction) {
        AbstractC8643c abstractC8643c;
        if (this.f22831o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f22831o = true;
        if (this.f22824h.f22834r && (abstractC8643c = this.f22825i) != null && mo17456J1()) {
            this.f22828l = 0;
            return mo17297H1(abstractC8643c.m17499L1(0), intFunction, abstractC8643c);
        }
        return m17496y1(m17499L1(0), true, intFunction);
    }

    /* renamed from: B1 */
    abstract InterfaceC8548F0 mo17445B1(AbstractC8744w0 abstractC8744w0, Spliterator spliterator, boolean z, IntFunction intFunction);

    /* renamed from: C1 */
    abstract void mo17444C1(Spliterator spliterator, InterfaceC8671h2 interfaceC8671h2);

    /* renamed from: D1 */
    public abstract EnumC8620W2 mo17443D1();

    /* renamed from: E1 */
    public final EnumC8620W2 m17502E1() {
        AbstractC8643c abstractC8643c = this;
        while (abstractC8643c.f22828l > 0) {
            abstractC8643c = abstractC8643c.f22825i;
        }
        return abstractC8643c.mo17443D1();
    }

    /* renamed from: F1 */
    public final boolean m17501F1() {
        return EnumC8616V2.ORDERED.m17537d(this.f22829m);
    }

    /* renamed from: G1 */
    public final /* synthetic */ Spliterator m17500G1() {
        return m17499L1(0);
    }

    /* renamed from: H1 */
    InterfaceC8548F0 mo17297H1(Spliterator spliterator, IntFunction intFunction, AbstractC8643c abstractC8643c) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    /* renamed from: I1 */
    Spliterator mo17406I1(AbstractC8643c abstractC8643c, Spliterator spliterator) {
        return mo17297H1(spliterator, new C8638b(0), abstractC8643c).spliterator();
    }

    /* renamed from: J1 */
    abstract boolean mo17456J1();

    /* renamed from: K1 */
    public abstract InterfaceC8671h2 mo17296K1(int i, InterfaceC8671h2 interfaceC8671h2);

    /* renamed from: M1 */
    public final Spliterator m17498M1() {
        AbstractC8643c abstractC8643c = this.f22824h;
        if (this == abstractC8643c) {
            if (this.f22831o) {
                throw new IllegalStateException("stream has already been operated upon or closed");
            }
            this.f22831o = true;
            Spliterator spliterator = abstractC8643c.f22830n;
            if (spliterator != null) {
                abstractC8643c.f22830n = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        throw new IllegalStateException();
    }

    /* renamed from: N1 */
    abstract Spliterator mo17442N1(AbstractC8744w0 abstractC8744w0, C8633a c8633a, boolean z);

    /* renamed from: O1 */
    public final Spliterator m17497O1(Spliterator spliterator) {
        return this.f22828l == 0 ? spliterator : mo17442N1(this, new C8633a(0, spliterator), this.f22824h.f22834r);
    }

    @Override // p164j$.util.stream.AbstractC8744w0
    /* renamed from: V0 */
    public final void mo17356V0(Spliterator spliterator, InterfaceC8671h2 interfaceC8671h2) {
        interfaceC8671h2.getClass();
        if (EnumC8616V2.SHORT_CIRCUIT.m17537d(this.f22829m)) {
            mo17355W0(spliterator, interfaceC8671h2);
            return;
        }
        interfaceC8671h2.mo17302g(spliterator.getExactSizeIfKnown());
        spliterator.forEachRemaining(interfaceC8671h2);
        interfaceC8671h2.end();
    }

    @Override // p164j$.util.stream.AbstractC8744w0
    /* renamed from: W0 */
    public final void mo17355W0(Spliterator spliterator, InterfaceC8671h2 interfaceC8671h2) {
        AbstractC8643c abstractC8643c = this;
        while (abstractC8643c.f22828l > 0) {
            abstractC8643c = abstractC8643c.f22825i;
        }
        interfaceC8671h2.mo17302g(spliterator.getExactSizeIfKnown());
        abstractC8643c.mo17444C1(spliterator, interfaceC8671h2);
        interfaceC8671h2.end();
    }

    @Override // p164j$.util.stream.AbstractC8744w0
    /* renamed from: a1 */
    public final long mo17351a1(Spliterator spliterator) {
        if (EnumC8616V2.SIZED.m17537d(this.f22829m)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // p164j$.util.stream.InterfaceC8673i, java.lang.AutoCloseable
    public final void close() {
        this.f22831o = true;
        this.f22830n = null;
        AbstractC8643c abstractC8643c = this.f22824h;
        Runnable runnable = abstractC8643c.f22833q;
        if (runnable != null) {
            abstractC8643c.f22833q = null;
            runnable.run();
        }
    }

    @Override // p164j$.util.stream.AbstractC8744w0
    /* renamed from: g1 */
    public final int mo17345g1() {
        return this.f22829m;
    }

    @Override // p164j$.util.stream.InterfaceC8673i
    public final boolean isParallel() {
        return this.f22824h.f22834r;
    }

    @Override // p164j$.util.stream.InterfaceC8673i
    public final InterfaceC8673i onClose(Runnable runnable) {
        AbstractC8643c abstractC8643c = this.f22824h;
        Runnable runnable2 = abstractC8643c.f22833q;
        if (runnable2 != null) {
            runnable = new RunnableC8541D3(runnable2, runnable);
        }
        abstractC8643c.f22833q = runnable;
        return this;
    }

    public final InterfaceC8673i parallel() {
        this.f22824h.f22834r = true;
        return this;
    }

    public final InterfaceC8673i sequential() {
        this.f22824h.f22834r = false;
        return this;
    }

    public Spliterator spliterator() {
        if (this.f22831o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f22831o = true;
        AbstractC8643c abstractC8643c = this.f22824h;
        if (this == abstractC8643c) {
            Spliterator spliterator = abstractC8643c.f22830n;
            if (spliterator != null) {
                abstractC8643c.f22830n = null;
                return spliterator;
            }
            throw new IllegalStateException("source already consumed or closed");
        }
        return mo17442N1(this, new C8633a(1, this), abstractC8643c.f22834r);
    }

    @Override // p164j$.util.stream.AbstractC8744w0
    /* renamed from: w1 */
    public final InterfaceC8671h2 mo17321w1(Spliterator spliterator, InterfaceC8671h2 interfaceC8671h2) {
        interfaceC8671h2.getClass();
        mo17356V0(spliterator, mo17319x1(interfaceC8671h2));
        return interfaceC8671h2;
    }

    @Override // p164j$.util.stream.AbstractC8744w0
    /* renamed from: x1 */
    public final InterfaceC8671h2 mo17319x1(InterfaceC8671h2 interfaceC8671h2) {
        interfaceC8671h2.getClass();
        AbstractC8643c abstractC8643c = this;
        while (abstractC8643c.f22828l > 0) {
            AbstractC8643c abstractC8643c2 = abstractC8643c.f22825i;
            interfaceC8671h2 = abstractC8643c.mo17296K1(abstractC8643c2.f22829m, interfaceC8671h2);
            abstractC8643c = abstractC8643c2;
        }
        return interfaceC8671h2;
    }

    /* renamed from: y1 */
    public final InterfaceC8548F0 m17496y1(Spliterator spliterator, boolean z, IntFunction intFunction) {
        if (this.f22824h.f22834r) {
            return mo17445B1(this, spliterator, z, intFunction);
        }
        InterfaceC8523A0 mo17330r1 = mo17330r1(mo17351a1(spliterator), intFunction);
        mo17321w1(spliterator, mo17330r1);
        return mo17330r1.build();
    }

    /* renamed from: z1 */
    public final Object m17495z1(InterfaceC8546E3 interfaceC8546E3) {
        if (this.f22831o) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.f22831o = true;
        return this.f22824h.f22834r ? interfaceC8546E3.mo17318y(this, m17499L1(interfaceC8546E3.mo17363P())) : interfaceC8546E3.mo17338n0(this, m17499L1(interfaceC8546E3.mo17363P()));
    }
}