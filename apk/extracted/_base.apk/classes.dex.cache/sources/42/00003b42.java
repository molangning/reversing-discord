package p164j$.util.function;

import java.util.function.Predicate;
import p164j$.util.function.Predicate;

/* renamed from: j$.util.function.H0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final /* synthetic */ class C8432H0 implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Predicate f22557a;

    private /* synthetic */ C8432H0(Predicate predicate) {
        this.f22557a = predicate;
    }

    /* renamed from: a */
    public static /* synthetic */ Predicate m17707a(Predicate predicate) {
        if (predicate == null) {
            return null;
        }
        return predicate instanceof Predicate.VivifiedWrapper ? ((Predicate.VivifiedWrapper) predicate).f22571a : new C8432H0(predicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate and(java.util.function.Predicate predicate) {
        return m17707a(this.f22557a.mo17547a(Predicate.VivifiedWrapper.convert(predicate)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Predicate predicate = this.f22557a;
        if (obj instanceof C8432H0) {
            obj = ((C8432H0) obj).f22557a;
        }
        return predicate.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f22557a.hashCode();
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate negate() {
        return m17707a(this.f22557a.negate());
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ java.util.function.Predicate or(java.util.function.Predicate predicate) {
        return m17707a(this.f22557a.mo17546b(Predicate.VivifiedWrapper.convert(predicate)));
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ boolean test(Object obj) {
        return this.f22557a.test(obj);
    }
}