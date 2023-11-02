package p325rg;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.sequences.Sequence;
import ph.C11633c;
import si.C12552o;

/* renamed from: rg.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C12163k implements InterfaceC12155g {

    /* renamed from: j */
    private final List<InterfaceC12155g> f31612j;

    /* renamed from: rg.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C12164a extends AbstractC9614s implements Function1<InterfaceC12155g, InterfaceC12149c> {

        /* renamed from: j */
        final /* synthetic */ C11633c f31613j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12164a(C11633c c11633c) {
            super(1);
            this.f31613j = c11633c;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC12149c invoke(InterfaceC12155g it) {
            C9612q.m13917h(it, "it");
            return it.mo6024b(this.f31613j);
        }
    }

    /* renamed from: rg.k$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C12165b extends AbstractC9614s implements Function1<InterfaceC12155g, Sequence<? extends InterfaceC12149c>> {

        /* renamed from: j */
        public static final C12165b f31614j = new C12165b();

        C12165b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Sequence<InterfaceC12149c> invoke(InterfaceC12155g it) {
            Sequence<InterfaceC12149c> m14066K;
            C9612q.m13917h(it, "it");
            m14066K = C9553r.m14066K(it);
            return m14066K;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12163k(List<? extends InterfaceC12155g> delegates) {
        C9612q.m13917h(delegates, "delegates");
        this.f31612j = delegates;
    }

    @Override // p325rg.InterfaceC12155g
    /* renamed from: b */
    public InterfaceC12149c mo6024b(C11633c fqName) {
        Sequence m14066K;
        Sequence m4850z;
        Object m4857s;
        C9612q.m13917h(fqName, "fqName");
        m14066K = C9553r.m14066K(this.f31612j);
        m4850z = C12552o.m4850z(m14066K, new C12164a(fqName));
        m4857s = C12552o.m4857s(m4850z);
        return (InterfaceC12149c) m4857s;
    }

    @Override // p325rg.InterfaceC12155g
    public boolean isEmpty() {
        List<InterfaceC12155g> list = this.f31612j;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (InterfaceC12155g interfaceC12155g : list) {
            if (!interfaceC12155g.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC12149c> iterator() {
        Sequence m14066K;
        Sequence m4856t;
        m14066K = C9553r.m14066K(this.f31612j);
        m4856t = C12552o.m4856t(m14066K, C12165b.f31614j);
        return m4856t.iterator();
    }

    @Override // p325rg.InterfaceC12155g
    /* renamed from: q */
    public boolean mo6023q(C11633c fqName) {
        Sequence<InterfaceC12155g> m14066K;
        C9612q.m13917h(fqName, "fqName");
        m14066K = C9553r.m14066K(this.f31612j);
        for (InterfaceC12155g interfaceC12155g : m14066K) {
            if (interfaceC12155g.mo6023q(fqName)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C12163k(p325rg.InterfaceC12155g... r2) {
        /*
            r1 = this;
            java.lang.String r0 = "delegates"
            kotlin.jvm.internal.C9612q.m13917h(r2, r0)
            java.util.List r2 = kotlin.collections.C9533b.m14285u0(r2)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p325rg.C12163k.<init>(rg.g[]):void");
    }
}