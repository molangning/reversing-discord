package vg;

import ai.C0180b;
import ai.InterfaceC0194h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9544i;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import p160ih.C7544h;
import p160ih.C7563q;
import p160ih.InterfaceC7564r;
import p164j$.util.concurrent.ConcurrentHashMap;
import p182jh.C8942a;
import p449yh.C14027d;
import ph.C11632b;
import ph.C11633c;
import tg.C12717m;

/* renamed from: vg.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C13278a {

    /* renamed from: a */
    private final C7544h f34356a;

    /* renamed from: b */
    private final C13285g f34357b;

    /* renamed from: c */
    private final ConcurrentHashMap<C11632b, InterfaceC0194h> f34358c;

    public C13278a(C7544h resolver, C13285g kotlinClassFinder) {
        C9612q.m13917h(resolver, "resolver");
        C9612q.m13917h(kotlinClassFinder, "kotlinClassFinder");
        this.f34356a = resolver;
        this.f34357b = kotlinClassFinder;
        this.f34358c = new ConcurrentHashMap<>();
    }

    /* renamed from: a */
    public final InterfaceC0194h m2868a(C13283f fileClass) {
        Collection<InterfaceC7564r> m14109d;
        List m14075C0;
        C9612q.m13917h(fileClass, "fileClass");
        ConcurrentHashMap<C11632b, InterfaceC0194h> concurrentHashMap = this.f34358c;
        C11632b mo2851n = fileClass.mo2851n();
        InterfaceC0194h interfaceC0194h = concurrentHashMap.get(mo2851n);
        if (interfaceC0194h == null) {
            C11633c m7465h = fileClass.mo2851n().m7465h();
            C9612q.m13918g(m7465h, "fileClass.classId.packageFqName");
            if (fileClass.mo2854c().m17013c() == C8942a.EnumC8943a.MULTIFILE_CLASS) {
                List<String> m17010f = fileClass.mo2854c().m17010f();
                m14109d = new ArrayList();
                for (String str : m17010f) {
                    C11632b m7460m = C11632b.m7460m(C14027d.m884d(str).m883e());
                    C9612q.m13918g(m7460m, "topLevel(JvmClassName.by…velClassMaybeWithDollars)");
                    InterfaceC7564r m20400b = C7563q.m20400b(this.f34357b, m7460m);
                    if (m20400b != null) {
                        m14109d.add(m20400b);
                    }
                }
            } else {
                m14109d = C9544i.m14109d(fileClass);
            }
            C12717m c12717m = new C12717m(this.f34356a.m20454d().m24116p(), m7465h);
            ArrayList arrayList = new ArrayList();
            for (InterfaceC7564r interfaceC7564r : m14109d) {
                InterfaceC0194h m20456b = this.f34356a.m20456b(c12717m, interfaceC7564r);
                if (m20456b != null) {
                    arrayList.add(m20456b);
                }
            }
            m14075C0 = C9553r.m14075C0(arrayList);
            C0180b.C0181a c0181a = C0180b.f602d;
            InterfaceC0194h m41008a = c0181a.m41008a("package " + m7465h + " (" + fileClass + ')', m14075C0);
            InterfaceC0194h putIfAbsent = concurrentHashMap.putIfAbsent(mo2851n, m41008a);
            if (putIfAbsent == null) {
                interfaceC0194h = m41008a;
            } else {
                interfaceC0194h = putIfAbsent;
            }
        }
        C9612q.m13918g(interfaceC0194h, "cache.getOrPut(fileClass…ileClass)\", scopes)\n    }");
        return interfaceC0194h;
    }
}
