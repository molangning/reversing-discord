package p325rg;

import cg.InterfaceC2533a;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C9543h;
import kotlin.jvm.internal.C9612q;
import ph.C11633c;

/* renamed from: rg.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public interface InterfaceC12155g extends Iterable<InterfaceC12149c>, InterfaceC2533a {

    /* renamed from: f */
    public static final C12156a f31603f = C12156a.f31604a;

    /* renamed from: rg.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C12156a {

        /* renamed from: a */
        static final /* synthetic */ C12156a f31604a = new C12156a();

        /* renamed from: b */
        private static final InterfaceC12155g f31605b = new C12157a();

        /* renamed from: rg.g$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
        public static final class C12157a implements InterfaceC12155g {
            C12157a() {
            }

            /* renamed from: a */
            public Void m6036a(C11633c fqName) {
                C9612q.m13917h(fqName, "fqName");
                return null;
            }

            @Override // p325rg.InterfaceC12155g
            /* renamed from: b */
            public /* bridge */ /* synthetic */ InterfaceC12149c mo6024b(C11633c c11633c) {
                return (InterfaceC12149c) m6036a(c11633c);
            }

            @Override // p325rg.InterfaceC12155g
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public Iterator<InterfaceC12149c> iterator() {
                return C9543h.m14145i().iterator();
            }

            @Override // p325rg.InterfaceC12155g
            /* renamed from: q */
            public boolean mo6023q(C11633c c11633c) {
                return C12158b.m6034b(this, c11633c);
            }

            public String toString() {
                return "EMPTY";
            }
        }

        private C12156a() {
        }

        /* renamed from: a */
        public final InterfaceC12155g m6038a(List<? extends InterfaceC12149c> annotations) {
            C9612q.m13917h(annotations, "annotations");
            if (annotations.isEmpty()) {
                return f31605b;
            }
            return new C12159h(annotations);
        }

        /* renamed from: b */
        public final InterfaceC12155g m6037b() {
            return f31605b;
        }
    }

    /* renamed from: rg.g$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C12158b {
        /* renamed from: a */
        public static InterfaceC12149c m6035a(InterfaceC12155g interfaceC12155g, C11633c fqName) {
            InterfaceC12149c interfaceC12149c;
            C9612q.m13917h(fqName, "fqName");
            Iterator<InterfaceC12149c> it = interfaceC12155g.iterator();
            while (true) {
                if (it.hasNext()) {
                    interfaceC12149c = it.next();
                    if (C9612q.m13922c(interfaceC12149c.mo6030e(), fqName)) {
                        break;
                    }
                } else {
                    interfaceC12149c = null;
                    break;
                }
            }
            return interfaceC12149c;
        }

        /* renamed from: b */
        public static boolean m6034b(InterfaceC12155g interfaceC12155g, C11633c fqName) {
            C9612q.m13917h(fqName, "fqName");
            if (interfaceC12155g.mo6024b(fqName) != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: b */
    InterfaceC12149c mo6024b(C11633c c11633c);

    boolean isEmpty();

    /* renamed from: q */
    boolean mo6023q(C11633c c11633c);
}
