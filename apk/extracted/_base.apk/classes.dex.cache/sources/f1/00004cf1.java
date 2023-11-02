package sh;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C9551p;
import kotlin.jvm.internal.C9612q;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11945l0;
import p305qg.InterfaceC11947m;
import ph.C11634d;
import ph.C11638f;
import th.C12758e;

/* renamed from: sh.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public interface InterfaceC12481b {

    /* renamed from: sh.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12482a implements InterfaceC12481b {

        /* renamed from: a */
        public static final C12482a f32432a = new C12482a();

        private C12482a() {
        }

        @Override // sh.InterfaceC12481b
        /* renamed from: a */
        public String mo5191a(InterfaceC11927h classifier, AbstractC12485c renderer) {
            C9612q.m13917h(classifier, "classifier");
            C9612q.m13917h(renderer, "renderer");
            if (classifier instanceof InterfaceC11920f1) {
                C11638f name = ((InterfaceC11920f1) classifier).getName();
                C9612q.m13918g(name, "classifier.name");
                return renderer.mo5047v(name, false);
            }
            C11634d m4099m = C12758e.m4099m(classifier);
            C9612q.m13918g(m4099m, "getFqName(classifier)");
            return renderer.mo5050u(m4099m);
        }
    }

    /* renamed from: sh.b$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12483b implements InterfaceC12481b {

        /* renamed from: a */
        public static final C12483b f32433a = new C12483b();

        private C12483b() {
        }

        @Override // sh.InterfaceC12481b
        /* renamed from: a */
        public String mo5191a(InterfaceC11927h classifier, AbstractC12485c renderer) {
            boolean z;
            List m14080G;
            C9612q.m13917h(classifier, "classifier");
            C9612q.m13917h(renderer, "renderer");
            if (classifier instanceof InterfaceC11920f1) {
                C11638f name = ((InterfaceC11920f1) classifier).getName();
                C9612q.m13918g(name, "classifier.name");
                return renderer.mo5047v(name, false);
            }
            ArrayList arrayList = new ArrayList();
            InterfaceC11927h interfaceC11927h = classifier;
            do {
                arrayList.add(interfaceC11927h.getName());
                InterfaceC11947m mo4163b = interfaceC11927h.mo4163b();
                z = mo4163b instanceof InterfaceC11914e;
                interfaceC11927h = mo4163b;
            } while (z);
            m14080G = C9551p.m14080G(arrayList);
            return C12527n.m4933c(m14080G);
        }
    }

    /* renamed from: sh.b$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C12484c implements InterfaceC12481b {

        /* renamed from: a */
        public static final C12484c f32434a = new C12484c();

        private C12484c() {
        }

        /* renamed from: b */
        private final String m5190b(InterfaceC11927h interfaceC11927h) {
            C11638f name = interfaceC11927h.getName();
            C9612q.m13918g(name, "descriptor.name");
            String m4934b = C12527n.m4934b(name);
            if (interfaceC11927h instanceof InterfaceC11920f1) {
                return m4934b;
            }
            InterfaceC11947m mo4163b = interfaceC11927h.mo4163b();
            C9612q.m13918g(mo4163b, "descriptor.containingDeclaration");
            String m5189c = m5189c(mo4163b);
            if (m5189c != null && !C9612q.m13922c(m5189c, "")) {
                return m5189c + '.' + m4934b;
            }
            return m4934b;
        }

        /* renamed from: c */
        private final String m5189c(InterfaceC11947m interfaceC11947m) {
            if (interfaceC11947m instanceof InterfaceC11914e) {
                return m5190b((InterfaceC11927h) interfaceC11947m);
            }
            if (interfaceC11947m instanceof InterfaceC11945l0) {
                C11634d m7450j = ((InterfaceC11945l0) interfaceC11947m).mo4161e().m7450j();
                C9612q.m13918g(m7450j, "descriptor.fqName.toUnsafe()");
                return C12527n.m4935a(m7450j);
            }
            return null;
        }

        @Override // sh.InterfaceC12481b
        /* renamed from: a */
        public String mo5191a(InterfaceC11927h classifier, AbstractC12485c renderer) {
            C9612q.m13917h(classifier, "classifier");
            C9612q.m13917h(renderer, "renderer");
            return m5190b(classifier);
        }
    }

    /* renamed from: a */
    String mo5191a(InterfaceC11927h interfaceC11927h, AbstractC12485c abstractC12485c);
}