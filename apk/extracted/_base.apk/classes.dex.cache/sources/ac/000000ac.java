package p013ah;

import ch.C2548g;
import gh.InterfaceC6760a;
import gi.C6820m;
import gi.InterfaceC6815i;
import java.util.Map;
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

/* renamed from: ah.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C0172h extends C0161b {

    /* renamed from: h */
    static final /* synthetic */ KProperty<Object>[] f589h = {C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C0172h.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g */
    private final InterfaceC6815i f590g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ah.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C0173a extends AbstractC9614s implements Function0<Map<C11638f, ? extends AbstractC13301g<?>>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0173a() {
            super(0);
            C0172h.this = r1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Map<C11638f, AbstractC13301g<?>> invoke() {
            Map<C11638f, AbstractC13301g<?>> map;
            Map<C11638f, AbstractC13301g<?>> m6754h;
            AbstractC13301g<?> m41034a = C0164d.f580a.m41034a(C0172h.this.m41043b());
            if (m41034a != null) {
                map = C11888u.m6757e(C11591x.m7577a(C0163c.f575a.m41038c(), m41034a));
            } else {
                map = null;
            }
            if (map == null) {
                m6754h = C11889v.m6754h();
                return m6754h;
            }
            return map;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0172h(InterfaceC6760a annotation, C2548g c) {
        super(c, annotation, C10884k.C10885a.f28455L);
        C9612q.m13917h(annotation, "annotation");
        C9612q.m13917h(c, "c");
        this.f590g = c.m33010e().mo21867c(new C0173a());
    }

    @Override // p013ah.C0161b, p325rg.InterfaceC12149c
    /* renamed from: a */
    public Map<C11638f, AbstractC13301g<?>> mo6032a() {
        return (Map) C6820m.m21871a(this.f590g, this, f589h[0]);
    }
}