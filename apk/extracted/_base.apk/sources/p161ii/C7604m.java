package p161ii;

import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7333v1;
import p142hi.C7235f;
import p142hi.C7244f1;
import p161ii.AbstractC7589f;
import th.C12766k;

/* renamed from: ii.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C7604m implements InterfaceC7602l {

    /* renamed from: c */
    private final AbstractC7592g f20903c;

    /* renamed from: d */
    private final AbstractC7589f f20904d;

    /* renamed from: e */
    private final C12766k f20905e;

    public C7604m(AbstractC7592g kotlinTypeRefiner, AbstractC7589f kotlinTypePreparator) {
        C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
        C9612q.m13917h(kotlinTypePreparator, "kotlinTypePreparator");
        this.f20903c = kotlinTypeRefiner;
        this.f20904d = kotlinTypePreparator;
        C12766k m4048m = C12766k.m4048m(mo20254d());
        C9612q.m13918g(m4048m, "createWithTypeRefiner(kotlinTypeRefiner)");
        this.f20905e = m4048m;
    }

    @Override // p161ii.InterfaceC7602l
    /* renamed from: a */
    public C12766k mo20257a() {
        return this.f20905e;
    }

    @Override // p161ii.InterfaceC7587e
    /* renamed from: b */
    public boolean mo20256b(AbstractC7264g0 subtype, AbstractC7264g0 supertype) {
        C9612q.m13917h(subtype, "subtype");
        C9612q.m13917h(supertype, "supertype");
        return m20251g(C7581a.m20361b(true, false, null, m20252f(), mo20254d(), 6, null), subtype.mo20916Q0(), supertype.mo20916Q0());
    }

    @Override // p161ii.InterfaceC7587e
    /* renamed from: c */
    public boolean mo20255c(AbstractC7264g0 a, AbstractC7264g0 b) {
        C9612q.m13917h(a, "a");
        C9612q.m13917h(b, "b");
        return m20253e(C7581a.m20361b(false, false, null, m20252f(), mo20254d(), 6, null), a.mo20916Q0(), b.mo20916Q0());
    }

    @Override // p161ii.InterfaceC7602l
    /* renamed from: d */
    public AbstractC7592g mo20254d() {
        return this.f20903c;
    }

    /* renamed from: e */
    public final boolean m20253e(C7244f1 c7244f1, AbstractC7333v1 a, AbstractC7333v1 b) {
        C9612q.m13917h(c7244f1, "<this>");
        C9612q.m13917h(a, "a");
        C9612q.m13917h(b, "b");
        return C7235f.f19632a.m21171k(c7244f1, a, b);
    }

    /* renamed from: f */
    public AbstractC7589f m20252f() {
        return this.f20904d;
    }

    /* renamed from: g */
    public final boolean m20251g(C7244f1 c7244f1, AbstractC7333v1 subType, AbstractC7333v1 superType) {
        C9612q.m13917h(c7244f1, "<this>");
        C9612q.m13917h(subType, "subType");
        C9612q.m13917h(superType, "superType");
        return C7235f.m21162t(C7235f.f19632a, c7244f1, subType, superType, false, 8, null);
    }

    public /* synthetic */ C7604m(AbstractC7592g abstractC7592g, AbstractC7589f abstractC7589f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC7592g, (i & 2) != 0 ? AbstractC7589f.C7590a.f20881a : abstractC7589f);
    }
}
