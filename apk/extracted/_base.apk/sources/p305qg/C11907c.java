package p305qg;

import gi.InterfaceC6821n;
import java.util.List;
import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7264g0;
import p142hi.AbstractC7302o0;
import p142hi.EnumC7336w1;
import p142hi.InterfaceC7265g1;
import p325rg.InterfaceC12155g;
import ph.C11638f;

/* renamed from: qg.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
final class C11907c implements InterfaceC11920f1 {

    /* renamed from: j */
    private final InterfaceC11920f1 f30909j;

    /* renamed from: k */
    private final InterfaceC11947m f30910k;

    /* renamed from: l */
    private final int f30911l;

    public C11907c(InterfaceC11920f1 originalDescriptor, InterfaceC11947m declarationDescriptor, int i) {
        C9612q.m13917h(originalDescriptor, "originalDescriptor");
        C9612q.m13917h(declarationDescriptor, "declarationDescriptor");
        this.f30909j = originalDescriptor;
        this.f30910k = declarationDescriptor;
        this.f30911l = i;
    }

    @Override // p305qg.InterfaceC11920f1
    /* renamed from: J */
    public InterfaceC6821n mo4467J() {
        return this.f30909j.mo4467J();
    }

    @Override // p305qg.InterfaceC11920f1
    /* renamed from: O */
    public boolean mo4466O() {
        return true;
    }

    @Override // p305qg.InterfaceC11959n, p305qg.InterfaceC11947m
    /* renamed from: b */
    public InterfaceC11947m mo4163b() {
        return this.f30910k;
    }

    @Override // p305qg.InterfaceC11947m
    /* renamed from: d0 */
    public <R, D> R mo4162d0(InterfaceC11964o<R, D> interfaceC11964o, D d) {
        return (R) this.f30909j.mo4162d0(interfaceC11964o, d);
    }

    @Override // p325rg.InterfaceC12147a
    public InterfaceC12155g getAnnotations() {
        return this.f30909j.getAnnotations();
    }

    @Override // p305qg.InterfaceC11920f1
    public int getIndex() {
        return this.f30911l + this.f30909j.getIndex();
    }

    @Override // p305qg.InterfaceC11935j0
    public C11638f getName() {
        return this.f30909j.getName();
    }

    @Override // p305qg.InterfaceC11920f1
    public List<AbstractC7264g0> getUpperBounds() {
        return this.f30909j.getUpperBounds();
    }

    @Override // p305qg.InterfaceC11966p
    /* renamed from: j */
    public InterfaceC11900a1 mo4160j() {
        return this.f30909j.mo4160j();
    }

    @Override // p305qg.InterfaceC11920f1, p305qg.InterfaceC11927h
    /* renamed from: k */
    public InterfaceC7265g1 mo4173k() {
        return this.f30909j.mo4173k();
    }

    @Override // p305qg.InterfaceC11920f1
    /* renamed from: m */
    public EnumC7336w1 mo4464m() {
        return this.f30909j.mo4464m();
    }

    @Override // p305qg.InterfaceC11927h
    /* renamed from: p */
    public AbstractC7302o0 mo4224p() {
        return this.f30909j.mo4224p();
    }

    public String toString() {
        return this.f30909j + "[inner-copy]";
    }

    @Override // p305qg.InterfaceC11920f1
    /* renamed from: x */
    public boolean mo4463x() {
        return this.f30909j.mo4463x();
    }

    @Override // p305qg.InterfaceC11947m
    /* renamed from: a */
    public InterfaceC11920f1 mo4221a() {
        InterfaceC11920f1 mo4221a = this.f30909j.mo4221a();
        C9612q.m13918g(mo4221a, "originalDescriptor.original");
        return mo4221a;
    }
}
