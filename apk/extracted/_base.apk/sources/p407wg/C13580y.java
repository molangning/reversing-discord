package p407wg;

import gh.InterfaceC6786w;
import gh.InterfaceC6787x;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C9612q;

/* renamed from: wg.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C13580y extends AbstractC13575t implements InterfaceC6786w {

    /* renamed from: a */
    private final Object f34965a;

    public C13580y(Object recordComponent) {
        C9612q.m13917h(recordComponent, "recordComponent");
        this.f34965a = recordComponent;
    }

    @Override // p407wg.AbstractC13575t
    /* renamed from: Q */
    public Member mo2162Q() {
        Method m2271c = C13539a.f34907a.m2271c(this.f34965a);
        if (m2271c != null) {
            return m2271c;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // gh.InterfaceC6786w
    /* renamed from: a */
    public boolean mo2161a() {
        return false;
    }

    @Override // gh.InterfaceC6786w
    public InterfaceC6787x getType() {
        Class<?> m2270d = C13539a.f34907a.m2270d(this.f34965a);
        if (m2270d != null) {
            return new C13569n(m2270d);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
