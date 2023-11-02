package ch;

import gh.InterfaceC6760a;
import gh.InterfaceC6766d;
import gi.InterfaceC6814h;
import java.util.Iterator;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
import ng.C10884k;
import p013ah.C0163c;
import p325rg.InterfaceC12149c;
import p325rg.InterfaceC12155g;
import ph.C11633c;
import si.C12552o;

/* renamed from: ch.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C2543d implements InterfaceC12155g {

    /* renamed from: j */
    private final C2548g f6972j;

    /* renamed from: k */
    private final InterfaceC6766d f6973k;

    /* renamed from: l */
    private final boolean f6974l;

    /* renamed from: m */
    private final InterfaceC6814h<InterfaceC6760a, InterfaceC12149c> f6975m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ch.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    public static final class C2544a extends AbstractC9614s implements Function1<InterfaceC6760a, InterfaceC12149c> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2544a() {
            super(1);
            C2543d.this = r1;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC12149c invoke(InterfaceC6760a annotation) {
            C9612q.m13917h(annotation, "annotation");
            return C0163c.f575a.m41036e(annotation, C2543d.this.f6972j, C2543d.this.f6974l);
        }
    }

    public C2543d(C2548g c, InterfaceC6766d annotationOwner, boolean z) {
        C9612q.m13917h(c, "c");
        C9612q.m13917h(annotationOwner, "annotationOwner");
        this.f6972j = c;
        this.f6973k = annotationOwner;
        this.f6974l = z;
        this.f6975m = c.m33014a().m33029u().mo21863g(new C2544a());
    }

    @Override // p325rg.InterfaceC12155g
    /* renamed from: b */
    public InterfaceC12149c mo6024b(C11633c fqName) {
        InterfaceC12149c invoke;
        C9612q.m13917h(fqName, "fqName");
        InterfaceC6760a mo2159b = this.f6973k.mo2159b(fqName);
        if (mo2159b == null || (invoke = this.f6975m.invoke(mo2159b)) == null) {
            return C0163c.f575a.m41040a(fqName, this.f6973k, this.f6972j);
        }
        return invoke;
    }

    @Override // p325rg.InterfaceC12155g
    public boolean isEmpty() {
        return this.f6973k.getAnnotations().isEmpty() && !this.f6973k.mo2164D();
    }

    @Override // java.lang.Iterable
    public Iterator<InterfaceC12149c> iterator() {
        Sequence m14066K;
        Sequence m4851y;
        Sequence m4870B;
        Sequence m4858r;
        m14066K = C9553r.m14066K(this.f6973k.getAnnotations());
        m4851y = C12552o.m4851y(m14066K, this.f6975m);
        m4870B = C12552o.m4870B(m4851y, C0163c.f575a.m41040a(C10884k.C10885a.f28518y, this.f6973k, this.f6972j));
        m4858r = C12552o.m4858r(m4870B);
        return m4858r.iterator();
    }

    @Override // p325rg.InterfaceC12155g
    /* renamed from: q */
    public boolean mo6023q(C11633c c11633c) {
        return InterfaceC12155g.C12158b.m6034b(this, c11633c);
    }

    public /* synthetic */ C2543d(C2548g c2548g, InterfaceC6766d interfaceC6766d, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c2548g, interfaceC6766d, (i & 4) != 0 ? false : z);
    }
}