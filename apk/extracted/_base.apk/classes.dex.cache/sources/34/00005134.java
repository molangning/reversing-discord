package p407wg;

import gh.InterfaceC6776m;
import kotlin.jvm.internal.C9612q;
import ph.C11632b;
import ph.C11638f;

/* renamed from: wg.q */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C13572q extends AbstractC13552f implements InterfaceC6776m {

    /* renamed from: c */
    private final Enum<?> f34957c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13572q(C11638f c11638f, Enum<?> value) {
        super(c11638f, null);
        C9612q.m13917h(value, "value");
        this.f34957c = value;
    }

    @Override // gh.InterfaceC6776m
    /* renamed from: d */
    public C11632b mo2183d() {
        Class<?> enumClass = this.f34957c.getClass();
        if (!enumClass.isEnum()) {
            enumClass = enumClass.getEnclosingClass();
        }
        C9612q.m13918g(enumClass, "enumClass");
        return C13548d.m2246a(enumClass);
    }

    @Override // gh.InterfaceC6776m
    /* renamed from: e */
    public C11638f mo2182e() {
        return C11638f.m7422f(this.f34957c.name());
    }
}