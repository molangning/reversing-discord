package p164j$.util.function;

import p164j$.time.AbstractC8284a;

/* renamed from: j$.util.function.F0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8428F0 implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ int f22550a;

    /* renamed from: b */
    public final /* synthetic */ Predicate f22551b;

    /* renamed from: c */
    public final /* synthetic */ Predicate f22552c;

    public /* synthetic */ C8428F0(Predicate predicate, Predicate predicate2, int i) {
        this.f22550a = i;
        this.f22551b = predicate;
        this.f22552c = predicate2;
    }

    @Override // p164j$.util.function.Predicate
    /* renamed from: a */
    public final Predicate mo17547a(Predicate predicate) {
        switch (this.f22550a) {
            case 0:
                predicate.getClass();
                return new C8428F0(this, predicate, 0);
            default:
                predicate.getClass();
                return new C8428F0(this, predicate, 0);
        }
    }

    @Override // p164j$.util.function.Predicate
    /* renamed from: b */
    public final Predicate mo17546b(Predicate predicate) {
        switch (this.f22550a) {
            case 0:
                predicate.getClass();
                return new C8428F0(this, predicate, 1);
            default:
                predicate.getClass();
                return new C8428F0(this, predicate, 1);
        }
    }

    @Override // p164j$.util.function.Predicate
    public final Predicate negate() {
        switch (this.f22550a) {
            case 0:
                return new C8430G0(this);
            default:
                return new C8430G0(this);
        }
    }

    @Override // p164j$.util.function.Predicate
    public final boolean test(Object obj) {
        int i = this.f22550a;
        Predicate predicate = this.f22552c;
        Predicate predicate2 = this.f22551b;
        switch (i) {
            case 0:
                return AbstractC8284a.m17904b(predicate2, predicate, obj);
            default:
                return predicate2.test(obj) || predicate.test(obj);
        }
    }
}