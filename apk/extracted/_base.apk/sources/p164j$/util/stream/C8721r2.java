package p164j$.util.stream;

import p164j$.util.Spliterator;
import p164j$.util.function.IntFunction;

/* renamed from: j$.util.stream.r2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8721r2 extends AbstractC8648d {

    /* renamed from: j */
    private final AbstractC8643c f22933j;

    /* renamed from: k */
    private final IntFunction f22934k;

    /* renamed from: l */
    private final long f22935l;

    /* renamed from: m */
    private final long f22936m;

    /* renamed from: n */
    private long f22937n;

    /* renamed from: o */
    private volatile boolean f22938o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8721r2(AbstractC8643c abstractC8643c, AbstractC8643c abstractC8643c2, Spliterator spliterator, IntFunction intFunction, long j, long j2) {
        super(abstractC8643c2, spliterator);
        this.f22933j = abstractC8643c;
        this.f22934k = intFunction;
        this.f22935l = j;
        this.f22936m = j2;
    }

    C8721r2(C8721r2 c8721r2, Spliterator spliterator) {
        super(c8721r2, spliterator);
        this.f22933j = c8721r2.f22933j;
        this.f22934k = c8721r2.f22934k;
        this.f22935l = c8721r2.f22935l;
        this.f22936m = c8721r2.f22936m;
    }

    /* renamed from: j */
    private long m17402j(long j) {
        if (this.f22938o) {
            return this.f22937n;
        }
        C8721r2 c8721r2 = (C8721r2) this.f22855d;
        C8721r2 c8721r22 = (C8721r2) this.f22856e;
        if (c8721r2 == null || c8721r22 == null) {
            return this.f22937n;
        }
        long m17402j = c8721r2.m17402j(j);
        return m17402j >= j ? m17402j : m17402j + c8721r22.m17402j(j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p164j$.util.stream.AbstractC8658f
    /* renamed from: a */
    public final Object mo17384a() {
        if (m17472c() == null) {
            InterfaceC8523A0 mo17330r1 = this.f22933j.mo17330r1(EnumC8616V2.SIZED.m17536e(this.f22933j.f22826j) ? this.f22933j.mo17351a1(this.f22853b) : -1L, this.f22934k);
            InterfaceC8671h2 mo17296K1 = this.f22933j.mo17296K1(this.f22852a.mo17345g1(), mo17330r1);
            AbstractC8744w0 abstractC8744w0 = this.f22852a;
            abstractC8744w0.mo17355W0(this.f22853b, abstractC8744w0.mo17319x1(mo17296K1));
            return mo17330r1.build();
        }
        AbstractC8744w0 abstractC8744w02 = this.f22852a;
        InterfaceC8523A0 mo17330r12 = abstractC8744w02.mo17330r1(-1L, this.f22934k);
        abstractC8744w02.mo17321w1(this.f22853b, mo17330r12);
        InterfaceC8548F0 build = mo17330r12.build();
        this.f22937n = build.count();
        this.f22938o = true;
        this.f22853b = null;
        return build;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p164j$.util.stream.AbstractC8658f
    /* renamed from: d */
    public final AbstractC8658f mo17383d(Spliterator spliterator) {
        return new C8721r2(this, spliterator);
    }

    @Override // p164j$.util.stream.AbstractC8648d
    /* renamed from: g */
    protected final void mo17403g() {
        this.f22838i = true;
        if (this.f22938o) {
            mo17471e(mo17382i());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p164j$.util.stream.AbstractC8648d
    /* renamed from: k */
    public final AbstractC8630Z0 mo17382i() {
        return AbstractC8744w0.m17352Z0(this.f22933j.mo17443D1());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    @Override // p164j$.util.stream.AbstractC8658f, java.util.concurrent.CountedCompleter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCompletion(java.util.concurrent.CountedCompleter r15) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p164j$.util.stream.C8721r2.onCompletion(java.util.concurrent.CountedCompleter):void");
    }
}
