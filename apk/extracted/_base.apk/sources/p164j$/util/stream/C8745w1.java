package p164j$.util.stream;

import p164j$.util.function.BiConsumer;
import p164j$.util.function.BiFunction;
import p164j$.util.function.InterfaceC8420B0;
import p164j$.util.function.InterfaceC8426E0;
import p164j$.util.function.InterfaceC8438K0;
import p164j$.util.function.InterfaceC8467f;
import p164j$.util.function.InterfaceC8506y0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.stream.w1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8745w1 extends AbstractC8744w0 {

    /* renamed from: h */
    public final /* synthetic */ int f22980h;

    /* renamed from: i */
    final /* synthetic */ Object f22981i;

    /* renamed from: j */
    final /* synthetic */ Object f22982j;

    /* renamed from: k */
    final /* synthetic */ Object f22983k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8745w1(EnumC8620W2 enumC8620W2, Object obj, Object obj2, Object obj3, int i) {
        super(enumC8620W2);
        this.f22980h = i;
        this.f22981i = obj;
        this.f22983k = obj2;
        this.f22982j = obj3;
    }

    @Override // p164j$.util.stream.AbstractC8744w0
    /* renamed from: u1 */
    public final InterfaceC8592P1 mo17306u1() {
        int i = this.f22980h;
        Object obj = this.f22981i;
        Object obj2 = this.f22983k;
        Object obj3 = this.f22982j;
        switch (i) {
            case 0:
                return new C8750x1((InterfaceC8438K0) obj3, (InterfaceC8426E0) obj2, (InterfaceC8467f) obj);
            case 1:
                return new C8534C1((InterfaceC8438K0) obj3, (InterfaceC8506y0) obj2, (InterfaceC8467f) obj);
            case 2:
                return new C8539D1(obj3, (BiFunction) obj2, (InterfaceC8467f) obj);
            case 3:
                return new C8559H1((InterfaceC8438K0) obj3, (BiConsumer) obj2, (BiConsumer) obj);
            default:
                return new C8576L1((InterfaceC8438K0) obj3, (InterfaceC8420B0) obj2, (InterfaceC8467f) obj);
        }
    }
}
