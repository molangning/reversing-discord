package p202kj;

import p162ij.InterfaceC7631c;
import p162ij.InterfaceC7633d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kj.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C9514p implements InterfaceC7633d {

    /* renamed from: a */
    private final InterfaceC7633d f25244a;

    /* renamed from: b */
    private final InterfaceC7633d f25245b;

    public C9514p(InterfaceC7633d interfaceC7633d, InterfaceC7633d interfaceC7633d2) {
        this.f25244a = interfaceC7633d;
        this.f25245b = interfaceC7633d2;
    }

    @Override // p162ij.InterfaceC7633d
    /* renamed from: a */
    public boolean mo14442a(InterfaceC7631c<?> interfaceC7631c) {
        return this.f25244a.mo14442a(interfaceC7631c) || this.f25245b.mo14442a(interfaceC7631c);
    }

    @Override // p162ij.InterfaceC7633d
    /* renamed from: b */
    public <A> A mo14441b(InterfaceC7631c<A> interfaceC7631c, A a) {
        if (this.f25244a.mo14442a(interfaceC7631c)) {
            return (A) this.f25244a.mo14440c(interfaceC7631c);
        }
        return (A) this.f25245b.mo14441b(interfaceC7631c, a);
    }

    @Override // p162ij.InterfaceC7633d
    /* renamed from: c */
    public <A> A mo14440c(InterfaceC7631c<A> interfaceC7631c) {
        if (this.f25244a.mo14442a(interfaceC7631c)) {
            return (A) this.f25244a.mo14440c(interfaceC7631c);
        }
        return (A) this.f25245b.mo14440c(interfaceC7631c);
    }
}