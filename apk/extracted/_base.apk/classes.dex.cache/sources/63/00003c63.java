package p164j$.util.stream;

import p164j$.util.function.Predicate;

/* renamed from: j$.util.stream.o0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
final class C8704o0 extends AbstractC8724s0 {

    /* renamed from: c */
    final /* synthetic */ EnumC8729t0 f22903c;

    /* renamed from: d */
    final /* synthetic */ Predicate f22904d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8704o0(Predicate predicate, EnumC8729t0 enumC8729t0) {
        super(enumC8729t0);
        this.f22903c = enumC8729t0;
        this.f22904d = predicate;
    }

    @Override // p164j$.util.function.Consumer
    public final void accept(Object obj) {
        boolean z;
        boolean z2;
        if (this.f22941a) {
            return;
        }
        boolean test = this.f22904d.test(obj);
        EnumC8729t0 enumC8729t0 = this.f22903c;
        z = enumC8729t0.f22947a;
        if (test == z) {
            this.f22941a = true;
            z2 = enumC8729t0.f22948b;
            this.f22942b = z2;
        }
    }
}