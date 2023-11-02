package p164j$.util.stream;

import p164j$.util.function.InterfaceC8429G;
import p164j$.util.function.InterfaceC8460b0;
import p164j$.util.function.InterfaceC8467f;
import p164j$.util.function.InterfaceC8475j;

/* renamed from: j$.util.stream.A1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8524A1 extends AbstractC8744w0 {

    /* renamed from: h */
    public final /* synthetic */ int f22640h;

    /* renamed from: i */
    final /* synthetic */ Object f22641i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8524A1(EnumC8620W2 enumC8620W2, Object obj, int i) {
        super(enumC8620W2);
        this.f22640h = i;
        this.f22641i = obj;
    }

    @Override // p164j$.util.stream.AbstractC8744w0
    /* renamed from: u1 */
    public final InterfaceC8592P1 mo17306u1() {
        int i = this.f22640h;
        Object obj = this.f22641i;
        switch (i) {
            case 0:
                return new C8529B1((InterfaceC8475j) obj);
            case 1:
                return new C8544E1((InterfaceC8467f) obj);
            case 2:
                return new C8572K1((InterfaceC8429G) obj);
            default:
                return new C8588O1((InterfaceC8460b0) obj);
        }
    }
}