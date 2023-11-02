package p013ah;

import ch.C2548g;
import gh.InterfaceC6760a;
import gh.InterfaceC6762b;
import gh.InterfaceC6768e;
import gh.InterfaceC6776m;
import gi.C6820m;
import gi.InterfaceC6815i;
import java.util.List;
import java.util.Map;
import kotlin.collections.C9544i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9584c0;
import kotlin.jvm.internal.C9591f0;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KProperty;
import ng.C10884k;
import p304qf.C11888u;
import p304qf.C11889v;
import p389vh.AbstractC13301g;
import pf.C11591x;
import ph.C11638f;

/* renamed from: ah.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C0174i extends C0161b {

    /* renamed from: h */
    static final /* synthetic */ KProperty<Object>[] f592h = {C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C0174i.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g */
    private final InterfaceC6815i f593g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ah.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C0175a extends AbstractC9614s implements Function0<Map<C11638f, ? extends AbstractC13301g<? extends Object>>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0175a() {
            super(0);
            C0174i.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Map<C11638f, AbstractC13301g<Object>> invoke() {
            AbstractC13301g<?> abstractC13301g;
            List<? extends InterfaceC6762b> m14109d;
            Map<C11638f, AbstractC13301g<Object>> m6754h;
            InterfaceC6762b m41043b = C0174i.this.m41043b();
            Map<C11638f, AbstractC13301g<Object>> map = null;
            if (m41043b instanceof InterfaceC6768e) {
                abstractC13301g = C0164d.f580a.m41032c(((InterfaceC6768e) C0174i.this.m41043b()).mo2225c());
            } else if (m41043b instanceof InterfaceC6776m) {
                C0164d c0164d = C0164d.f580a;
                m14109d = C9544i.m14109d(C0174i.this.m41043b());
                abstractC13301g = c0164d.m41032c(m14109d);
            } else {
                abstractC13301g = null;
            }
            if (abstractC13301g != null) {
                map = C11888u.m6757e(C11591x.m7577a(C0163c.f575a.m41037d(), abstractC13301g));
            }
            if (map == null) {
                m6754h = C11889v.m6754h();
                return m6754h;
            }
            return map;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0174i(InterfaceC6760a annotation, C2548g c) {
        super(c, annotation, C10884k.C10885a.f28448H);
        C9612q.m13917h(annotation, "annotation");
        C9612q.m13917h(c, "c");
        this.f593g = c.m33010e().mo21867c(new C0175a());
    }

    @Override // p013ah.C0161b, p325rg.InterfaceC12149c
    /* renamed from: a */
    public Map<C11638f, AbstractC13301g<Object>> mo6032a() {
        return (Map) C6820m.m21871a(this.f593g, this, f592h[0]);
    }
}