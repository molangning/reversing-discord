package p389vh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import ng.AbstractC10870h;
import p142hi.AbstractC7264g0;
import p142hi.InterfaceC7265g1;
import p161ii.AbstractC7592g;
import p305qg.InterfaceC11920f1;
import p305qg.InterfaceC11927h;
import p305qg.InterfaceC11928h0;

/* renamed from: vh.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C13319p implements InterfaceC7265g1 {

    /* renamed from: a */
    private final long f34398a;

    /* renamed from: b */
    private final InterfaceC11928h0 f34399b;

    /* renamed from: c */
    private final ArrayList<AbstractC7264g0> f34400c;

    /* renamed from: c */
    public Void m2792c() {
        return null;
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
        return this.f34400c;
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: n */
    public AbstractC10870h mo2790n() {
        return this.f34399b.mo4194n();
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: o */
    public InterfaceC7265g1 mo2789o(AbstractC7592g kotlinTypeRefiner) {
        C9612q.m13917h(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: p */
    public /* bridge */ /* synthetic */ InterfaceC11927h mo2788p() {
        return (InterfaceC11927h) m2792c();
    }

    @Override // p142hi.InterfaceC7265g1
    /* renamed from: q */
    public boolean mo2787q() {
        return false;
    }

    public String toString() {
        return "IntegerValueType(" + this.f34398a + ')';
    }
}
