package p372uh;

import java.util.Collection;
import java.util.List;
import kotlin.collections.C9544i;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import ng.AbstractC10870h;
import p142hi.AbstractC7264g0;
import p142hi.EnumC7336w1;
import p142hi.InterfaceC7288k1;
import p161ii.AbstractC7592g;
import p161ii.C7596j;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;

/* renamed from: uh.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C12975c implements InterfaceC12974b {

    /* renamed from: a */
    private final InterfaceC7288k1 f33732a;

    /* renamed from: b */
    private C7596j f33733b;

    public C12975c(InterfaceC7288k1 projection) {
        C9612q.m13917h(projection, "projection");
        this.f33732a = projection;
        mo3552b().mo20954b();
        EnumC7336w1 enumC7336w1 = EnumC7336w1.INVARIANT;
    }

    @Override // p372uh.InterfaceC12974b
    /* renamed from: b */
    public InterfaceC7288k1 mo3552b() {
        return this.f33732a;
    }

    /* renamed from: c */
    public Void m3551c() {
        return null;
    }

    /* renamed from: d */
    public final C7596j m3550d() {
        return this.f33733b;
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: e */
    public C12975c mo2789o(AbstractC7592g kotlinTypeRefiner) {
        C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
        InterfaceC7288k1 mo20951o = mo3552b().mo20951o(kotlinTypeRefiner);
        C9612q.m13918g(mo20951o, "projection.refine(kotlinTypeRefiner)");
        return new C12975c(mo20951o);
    }

    /* renamed from: f */
    public final void m3548f(C7596j c7596j) {
        this.f33733b = c7596j;
    }

    @Override // p142hi.InterfaceC7265g1
    public List<InterfaceC11920f1> getParameters() {
        List<InterfaceC11920f1> m14104i;
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: m */
    public Collection<AbstractC7264g0> mo2791m() {
        AbstractC7264g0 m9842I;
        List m14109d;
        if (mo3552b().mo20954b() == EnumC7336w1.OUT_VARIANCE) {
            m9842I = mo3552b().getType();
        } else {
            m9842I = mo2790n().m9842I();
        }
        C9612q.m13918g(m9842I, "if (projection.projectio… builtIns.nullableAnyType");
        m14109d = C9544i.m14109d(m9842I);
        return m14109d;
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: n */
    public AbstractC10870h mo2790n() {
        AbstractC10870h mo2790n = mo3552b().getType().mo3564N0().mo2790n();
        C9612q.m13918g(mo2790n, "projection.type.constructor.builtIns");
        return mo2790n;
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: p */
    public /* bridge */ /* synthetic */ InterfaceC11927h mo2788p() {
        return (InterfaceC11927h) m3551c();
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: q */
    public boolean mo2787q() {
        return false;
    }

    public String toString() {
        return "CapturedTypeConstructor(" + mo3552b() + ')';
    }
}