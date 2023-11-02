package p141hh;

import bh.InterfaceC2307g;
import ch.C2548g;
import java.util.List;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import li.InterfaceC10200i;
import li.InterfaceC10206o;
import li.InterfaceC10210r;
import ng.AbstractC10870h;
import p069dh.C5846e;
import p069dh.C5907n;
import p142hi.AbstractC7264g0;
import p142hi.C7320s1;
import p142hi.C7329u1;
import p161ii.C7608q;
import p305qg.InterfaceC11914e;
import p305qg.InterfaceC11936j1;
import p325rg.InterfaceC12147a;
import p325rg.InterfaceC12149c;
import p325rg.InterfaceC12155g;
import p468zg.C14211d;
import p468zg.C14265y;
import p468zg.EnumC14207b;
import ph.C11634d;
import th.C12758e;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: hh.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C7209n extends AbstractC7154a<InterfaceC12149c> {

    /* renamed from: a */
    private final InterfaceC12147a f19599a;

    /* renamed from: b */
    private final boolean f19600b;

    /* renamed from: c */
    private final C2548g f19601c;

    /* renamed from: d */
    private final EnumC14207b f19602d;

    /* renamed from: e */
    private final boolean f19603e;

    public /* synthetic */ C7209n(InterfaceC12147a interfaceC12147a, boolean z, C2548g c2548g, EnumC14207b enumC14207b, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC12147a, z, c2548g, enumC14207b, (i & 16) != 0 ? false : z2);
    }

    @Override // p141hh.AbstractC7154a
    /* renamed from: A */
    public boolean mo21261A(InterfaceC10200i interfaceC10200i) {
        C9612q.m13917h(interfaceC10200i, "<this>");
        return ((AbstractC7264g0) interfaceC10200i).mo20916Q0() instanceof C7167g;
    }

    @Override // p141hh.AbstractC7154a
    /* renamed from: D */
    public C14211d mo21256h() {
        return this.f19601c.m33014a().m33049a();
    }

    @Override // p141hh.AbstractC7154a
    /* renamed from: E */
    public AbstractC7264g0 mo21249p(InterfaceC10200i interfaceC10200i) {
        C9612q.m13917h(interfaceC10200i, "<this>");
        return C7329u1.m20949a((AbstractC7264g0) interfaceC10200i);
    }

    @Override // p141hh.AbstractC7154a
    /* renamed from: F */
    public boolean mo21248r(InterfaceC12149c interfaceC12149c) {
        C9612q.m13917h(interfaceC12149c, "<this>");
        if (((interfaceC12149c instanceof InterfaceC2307g) && ((InterfaceC2307g) interfaceC12149c).mo24367f()) || ((interfaceC12149c instanceof C5846e) && !mo21250o() && (((C5846e) interfaceC12149c).m24362l() || mo21253l() == EnumC14207b.TYPE_PARAMETER_BOUNDS))) {
            return true;
        }
        return false;
    }

    @Override // p141hh.AbstractC7154a
    /* renamed from: G */
    public InterfaceC10210r mo21245v() {
        return C7608q.f20908a;
    }

    @Override // p141hh.AbstractC7154a
    /* renamed from: i */
    public Iterable<InterfaceC12149c> mo21255i(InterfaceC10200i interfaceC10200i) {
        C9612q.m13917h(interfaceC10200i, "<this>");
        return ((AbstractC7264g0) interfaceC10200i).getAnnotations();
    }

    @Override // p141hh.AbstractC7154a
    /* renamed from: k */
    public Iterable<InterfaceC12149c> mo21254k() {
        List m14104i;
        InterfaceC12155g annotations;
        InterfaceC12147a interfaceC12147a = this.f19599a;
        if (interfaceC12147a == null || (annotations = interfaceC12147a.getAnnotations()) == null) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        return annotations;
    }

    @Override // p141hh.AbstractC7154a
    /* renamed from: l */
    public EnumC14207b mo21253l() {
        return this.f19602d;
    }

    @Override // p141hh.AbstractC7154a
    /* renamed from: m */
    public C14265y mo21252m() {
        return this.f19601c.m33013b();
    }

    @Override // p141hh.AbstractC7154a
    /* renamed from: n */
    public boolean mo21251n() {
        InterfaceC12147a interfaceC12147a = this.f19599a;
        return (interfaceC12147a instanceof InterfaceC11936j1) && ((InterfaceC11936j1) interfaceC12147a).mo4373v0() != null;
    }

    @Override // p141hh.AbstractC7154a
    /* renamed from: o */
    public boolean mo21250o() {
        return this.f19601c.m33014a().m33033q().mo33023c();
    }

    @Override // p141hh.AbstractC7154a
    /* renamed from: s */
    public C11634d mo21247s(InterfaceC10200i interfaceC10200i) {
        C9612q.m13917h(interfaceC10200i, "<this>");
        InterfaceC11914e m20989f = C7320s1.m20989f((AbstractC7264g0) interfaceC10200i);
        if (m20989f != null) {
            return C12758e.m4099m(m20989f);
        }
        return null;
    }

    @Override // p141hh.AbstractC7154a
    /* renamed from: u */
    public boolean mo21246u() {
        return this.f19603e;
    }

    @Override // p141hh.AbstractC7154a
    /* renamed from: w */
    public boolean mo21244w(InterfaceC10200i interfaceC10200i) {
        C9612q.m13917h(interfaceC10200i, "<this>");
        return AbstractC10870h.m9818d0((AbstractC7264g0) interfaceC10200i);
    }

    @Override // p141hh.AbstractC7154a
    /* renamed from: x */
    public boolean mo21243x() {
        return this.f19600b;
    }

    @Override // p141hh.AbstractC7154a
    /* renamed from: y */
    public boolean mo21242y(InterfaceC10200i interfaceC10200i, InterfaceC10200i other) {
        C9612q.m13917h(interfaceC10200i, "<this>");
        C9612q.m13917h(other, "other");
        return this.f19601c.m33014a().m33039k().mo20255c((AbstractC7264g0) interfaceC10200i, (AbstractC7264g0) other);
    }

    @Override // p141hh.AbstractC7154a
    /* renamed from: z */
    public boolean mo21241z(InterfaceC10206o interfaceC10206o) {
        C9612q.m13917h(interfaceC10206o, "<this>");
        return interfaceC10206o instanceof C5907n;
    }

    public C7209n(InterfaceC12147a interfaceC12147a, boolean z, C2548g containerContext, EnumC14207b containerApplicabilityType, boolean z2) {
        C9612q.m13917h(containerContext, "containerContext");
        C9612q.m13917h(containerApplicabilityType, "containerApplicabilityType");
        this.f19599a = interfaceC12147a;
        this.f19600b = z;
        this.f19601c = containerContext;
        this.f19602d = containerApplicabilityType;
        this.f19603e = z2;
    }
}
