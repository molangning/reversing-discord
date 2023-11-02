package fi;

import java.util.ArrayList;
import java.util.List;
import kh.C9439q;
import kh.C9450s;
import kotlin.collections.C9544i;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import mh.C10467f;
import p070di.C5919d0;
import p070di.C5942m;
import p142hi.AbstractC7264g0;
import p325rg.InterfaceC12149c;
import p429xh.C13801c;
import tg.AbstractC12682b;

/* renamed from: fi.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C6477m extends AbstractC12682b {

    /* renamed from: t */
    private final C5942m f18193t;

    /* renamed from: u */
    private final C9450s f18194u;

    /* renamed from: v */
    private final C6426a f18195v;

    /* renamed from: fi.m$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    static final class C6478a extends AbstractC9614s implements Function0<List<? extends InterfaceC12149c>> {
        C6478a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends InterfaceC12149c> invoke() {
            List<? extends InterfaceC12149c> m14075C0;
            m14075C0 = C9553r.m14075C0(C6477m.this.f18193t.m24101c().m24128d().mo20512h(C6477m.this.m22641O0(), C6477m.this.f18193t.m24097g()));
            return m14075C0;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C6477m(p070di.C5942m r12, kh.C9450s r13, int r14) {
        /*
            r11 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.C9612q.m13917h(r12, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.C9612q.m13917h(r13, r0)
            gi.n r2 = r12.m24096h()
            qg.m r3 = r12.m24099e()
            rg.g$a r0 = p325rg.InterfaceC12155g.f31603f
            rg.g r4 = r0.m6037b()
            mh.c r0 = r12.m24097g()
            int r1 = r13.m14854O()
            ph.f r5 = p070di.C5967x.m24061b(r0, r1)
            di.a0 r0 = p070di.C5910a0.f16858a
            kh.s$c r1 = r13.m14848U()
            java.lang.String r6 = "proto.variance"
            kotlin.jvm.internal.C9612q.m13918g(r1, r6)
            hi.w1 r6 = r0.m24184d(r1)
            boolean r7 = r13.m14853P()
            qg.a1 r9 = p305qg.InterfaceC11900a1.f30901a
            qg.d1$a r10 = p305qg.InterfaceC11912d1.C11913a.f30912a
            r1 = r11
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f18193t = r12
            r11.f18194u = r13
            fi.a r13 = new fi.a
            gi.n r12 = r12.m24096h()
            fi.m$a r14 = new fi.m$a
            r14.<init>()
            r13.<init>(r12, r14)
            r11.f18195v = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fi.C6477m.<init>(di.m, kh.s, int):void");
    }

    @Override // tg.AbstractC12692e
    /* renamed from: L0 */
    protected List<AbstractC7264g0> mo4405L0() {
        int m14093t;
        List<AbstractC7264g0> m14109d;
        List<C9439q> m11465s = C10467f.m11465s(this.f18194u, this.f18193t.m24094j());
        if (m11465s.isEmpty()) {
            m14109d = C9544i.m14109d(C13801c.m1505j(this).m9779y());
            return m14109d;
        }
        C5919d0 m24095i = this.f18193t.m24095i();
        m14093t = C9546k.m14093t(m11465s, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (C9439q c9439q : m11465s) {
            arrayList.add(m24095i.m24163q(c9439q));
        }
        return arrayList;
    }

    @Override // p325rg.C12148b, p325rg.InterfaceC12147a
    /* renamed from: N0 */
    public C6426a getAnnotations() {
        return this.f18195v;
    }

    /* renamed from: O0 */
    public final C9450s m22641O0() {
        return this.f18194u;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // tg.AbstractC12692e
    /* renamed from: P0 */
    public Void mo4406K0(AbstractC7264g0 type) {
        C9612q.m13917h(type, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
