package p468zg;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.C9544i;
import kotlin.collections.C9545j;
import kotlin.collections.C9550o;
import kotlin.jvm.internal.C9612q;
import p305qg.InterfaceC11914e;
import p325rg.InterfaceC12149c;
import p325rg.InterfaceC12155g;
import p389vh.AbstractC13301g;
import p389vh.C13296b;
import p389vh.C13306j;
import p429xh.C13801c;
import ph.C11633c;
import ph.C11638f;

/* renamed from: zg.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C14211d extends AbstractC14203a<InterfaceC12149c> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14211d(C14262x javaTypeEnhancementState) {
        super(javaTypeEnhancementState);
        C9612q.m13917h(javaTypeEnhancementState, "javaTypeEnhancementState");
    }

    /* renamed from: y */
    private final List<String> m415y(AbstractC13301g<?> abstractC13301g) {
        List<String> m14104i;
        List<String> m14109d;
        if (abstractC13301g instanceof C13296b) {
            ArrayList arrayList = new ArrayList();
            for (AbstractC13301g<?> abstractC13301g2 : ((C13296b) abstractC13301g).mo2813b()) {
                C9550o.m14085y(arrayList, m415y(abstractC13301g2));
            }
            return arrayList;
        } else if (abstractC13301g instanceof C13306j) {
            m14109d = C9544i.m14109d(((C13306j) abstractC13301g).m2814c().m7424d());
            return m14109d;
        } else {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p468zg.AbstractC14203a
    /* renamed from: u */
    public Iterable<String> mo423b(InterfaceC12149c interfaceC12149c, boolean z) {
        List<String> m415y;
        C9612q.m13917h(interfaceC12149c, "<this>");
        Map<C11638f, AbstractC13301g<?>> mo6032a = interfaceC12149c.mo6032a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<C11638f, AbstractC13301g<?>> entry : mo6032a.entrySet()) {
            C11638f key = entry.getKey();
            AbstractC13301g<?> value = entry.getValue();
            if (z && !C9612q.m13922c(key, C14208b0.f36534c)) {
                m415y = C9545j.m14104i();
            } else {
                m415y = m415y(value);
            }
            C9550o.m14085y(arrayList, m415y);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p468zg.AbstractC14203a
    /* renamed from: v */
    public C11633c mo422i(InterfaceC12149c interfaceC12149c) {
        C9612q.m13917h(interfaceC12149c, "<this>");
        return interfaceC12149c.mo6030e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p468zg.AbstractC14203a
    /* renamed from: w */
    public Object mo421j(InterfaceC12149c interfaceC12149c) {
        C9612q.m13917h(interfaceC12149c, "<this>");
        InterfaceC11914e m1506i = C13801c.m1506i(interfaceC12149c);
        C9612q.m13920e(m1506i);
        return m1506i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p468zg.AbstractC14203a
    /* renamed from: x */
    public Iterable<InterfaceC12149c> mo420k(InterfaceC12149c interfaceC12149c) {
        List m14104i;
        InterfaceC12155g annotations;
        C9612q.m13917h(interfaceC12149c, "<this>");
        InterfaceC11914e m1506i = C13801c.m1506i(interfaceC12149c);
        if (m1506i == null || (annotations = m1506i.getAnnotations()) == null) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        return annotations;
    }
}
