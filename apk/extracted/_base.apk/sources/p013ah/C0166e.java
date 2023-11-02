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
import p389vh.AbstractC13301g;
import p389vh.C13329v;
import pf.C11591x;
import ph.C11638f;

/* renamed from: ah.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C0166e extends C0161b {

    /* renamed from: h */
    static final /* synthetic */ KProperty<Object>[] f584h = {C9591f0.m13964g(new C9584c0(C9591f0.m13969b(C0166e.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g */
    private final InterfaceC6815i f585g;

    /* renamed from: ah.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C0167a extends AbstractC9614s implements Function0<Map<C11638f, ? extends C13329v>> {

        /* renamed from: j */
        public static final C0167a f586j = new C0167a();

        C0167a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Map<C11638f, C13329v> invoke() {
            Map<C11638f, C13329v> m6757e;
            m6757e = C11888u.m6757e(C11591x.m7577a(C0163c.f575a.m41039b(), new C13329v("Deprecated in Java")));
            return m6757e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0166e(InterfaceC6760a interfaceC6760a, C2548g c) {
        super(c, interfaceC6760a, C10884k.C10885a.f28518y);
        C9612q.m13917h(c, "c");
        this.f585g = c.m33010e().mo21867c(C0167a.f586j);
    }

    @Override // p013ah.C0161b, p325rg.InterfaceC12149c
    /* renamed from: a */
    public Map<C11638f, AbstractC13301g<?>> mo6032a() {
        return (Map) C6820m.m21871a(this.f585g, this, f584h[0]);
    }
}
