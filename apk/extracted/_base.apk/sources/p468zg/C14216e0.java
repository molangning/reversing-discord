package p468zg;

import gi.C6795f;
import gi.InterfaceC6814h;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import ph.C11633c;
import ph.C11636e;

/* renamed from: zg.e0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C14216e0<T> implements InterfaceC14212d0<T> {

    /* renamed from: b */
    private final Map<C11633c, T> f36582b;

    /* renamed from: c */
    private final C6795f f36583c;

    /* renamed from: d */
    private final InterfaceC6814h<C11633c, T> f36584d;

    /* renamed from: zg.e0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C14217a extends AbstractC9614s implements Function1<C11633c, T> {

        /* renamed from: j */
        final /* synthetic */ C14216e0<T> f36585j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C14217a(C14216e0<T> c14216e0) {
            super(1);
            this.f36585j = c14216e0;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final T invoke(C11633c it) {
            C9612q.m13918g(it, "it");
            return (T) C11636e.m7434a(it, this.f36585j.m408b());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C14216e0(Map<C11633c, ? extends T> states) {
        C9612q.m13917h(states, "states");
        this.f36582b = states;
        C6795f c6795f = new C6795f("Java nullability annotation states");
        this.f36583c = c6795f;
        InterfaceC6814h<C11633c, T> mo21863g = c6795f.mo21863g(new C14217a(this));
        C9612q.m13918g(mo21863g, "storageManager.createMem…cificFqname(states)\n    }");
        this.f36584d = mo21863g;
    }

    @Override // p468zg.InterfaceC14212d0
    /* renamed from: a */
    public T mo409a(C11633c fqName) {
        C9612q.m13917h(fqName, "fqName");
        return this.f36584d.invoke(fqName);
    }

    /* renamed from: b */
    public final Map<C11633c, T> m408b() {
        return this.f36582b;
    }
}
