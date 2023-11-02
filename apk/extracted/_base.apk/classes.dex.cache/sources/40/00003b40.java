package p164j$.util.function;

/* renamed from: j$.util.function.G0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8430G0 implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Predicate f22554a;

    public /* synthetic */ C8430G0(Predicate predicate) {
        this.f22554a = predicate;
    }

    @Override // p164j$.util.function.Predicate
    /* renamed from: a */
    public final Predicate mo17547a(Predicate predicate) {
        predicate.getClass();
        return new C8428F0(this, predicate, 0);
    }

    @Override // p164j$.util.function.Predicate
    /* renamed from: b */
    public final Predicate mo17546b(Predicate predicate) {
        predicate.getClass();
        return new C8428F0(this, predicate, 1);
    }

    @Override // p164j$.util.function.Predicate
    public final Predicate negate() {
        return new C8430G0(this);
    }

    @Override // p164j$.util.function.Predicate
    public final boolean test(Object obj) {
        return !this.f22554a.test(obj);
    }
}