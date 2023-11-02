package p326rh;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p326rh.AbstractC12188i;

/* renamed from: rh.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C12183g {

    /* renamed from: b */
    private static final C12183g f31718b = new C12183g(true);

    /* renamed from: a */
    private final Map<C12184a, AbstractC12188i.C12195f<?, ?>> f31719a;

    /* renamed from: rh.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    private static final class C12184a {

        /* renamed from: a */
        private final Object f31720a;

        /* renamed from: b */
        private final int f31721b;

        C12184a(Object obj, int i) {
            this.f31720a = obj;
            this.f31721b = i;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C12184a)) {
                return false;
            }
            C12184a c12184a = (C12184a) obj;
            if (this.f31720a != c12184a.f31720a || this.f31721b != c12184a.f31721b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (System.identityHashCode(this.f31720a) * 65535) + this.f31721b;
        }
    }

    C12183g() {
        this.f31719a = new HashMap();
    }

    /* renamed from: c */
    public static C12183g m5866c() {
        return f31718b;
    }

    /* renamed from: d */
    public static C12183g m5865d() {
        return new C12183g();
    }

    /* renamed from: a */
    public final void m5868a(AbstractC12188i.C12195f<?, ?> c12195f) {
        this.f31719a.put(new C12184a(c12195f.m5804b(), c12195f.m5802d()), c12195f);
    }

    /* renamed from: b */
    public <ContainingType extends InterfaceC12210q> AbstractC12188i.C12195f<ContainingType, ?> m5867b(ContainingType containingtype, int i) {
        return (AbstractC12188i.C12195f<ContainingType, ?>) this.f31719a.get(new C12184a(containingtype, i));
    }

    private C12183g(boolean z) {
        this.f31719a = Collections.emptyMap();
    }
}
