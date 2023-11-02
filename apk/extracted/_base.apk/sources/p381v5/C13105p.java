package p381v5;

import java.util.Set;
import p347t5.C12588b;
import p347t5.InterfaceC12591e;
import p347t5.InterfaceC12592f;
import p347t5.InterfaceC12593g;

/* renamed from: v5.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
final class C13105p implements InterfaceC12593g {

    /* renamed from: a */
    private final Set<C12588b> f33943a;

    /* renamed from: b */
    private final AbstractC13103o f33944b;

    /* renamed from: c */
    private final InterfaceC13108s f33945c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13105p(Set<C12588b> set, AbstractC13103o abstractC13103o, InterfaceC13108s interfaceC13108s) {
        this.f33943a = set;
        this.f33944b = abstractC13103o;
        this.f33945c = interfaceC13108s;
    }

    @Override // p347t5.InterfaceC12593g
    /* renamed from: a */
    public <T> InterfaceC12592f<T> mo3252a(String str, Class<T> cls, C12588b c12588b, InterfaceC12591e<T, byte[]> interfaceC12591e) {
        if (this.f33943a.contains(c12588b)) {
            return new C13107r(this.f33944b, str, c12588b, interfaceC12591e, this.f33945c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", c12588b, this.f33943a));
    }
}
