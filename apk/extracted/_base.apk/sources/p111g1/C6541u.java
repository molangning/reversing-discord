package p111g1;

import java.util.ArrayList;
import java.util.List;
import p125h1.AbstractC6861a;
import p206l1.C10029s;
import p223m1.AbstractC10231b;

/* renamed from: g1.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6541u implements InterfaceC6521c, AbstractC6861a.InterfaceC6863b {

    /* renamed from: a */
    private final String f18566a;

    /* renamed from: b */
    private final boolean f18567b;

    /* renamed from: c */
    private final List<AbstractC6861a.InterfaceC6863b> f18568c = new ArrayList();

    /* renamed from: d */
    private final C10029s.EnumC10030a f18569d;

    /* renamed from: e */
    private final AbstractC6861a<?, Float> f18570e;

    /* renamed from: f */
    private final AbstractC6861a<?, Float> f18571f;

    /* renamed from: g */
    private final AbstractC6861a<?, Float> f18572g;

    public C6541u(AbstractC10231b abstractC10231b, C10029s c10029s) {
        this.f18566a = c10029s.m12521c();
        this.f18567b = c10029s.m12517g();
        this.f18569d = c10029s.m12518f();
        AbstractC6861a<Float, Float> mo16817a = c10029s.m12519e().mo16817a();
        this.f18570e = mo16817a;
        AbstractC6861a<Float, Float> mo16817a2 = c10029s.m12522b().mo16817a();
        this.f18571f = mo16817a2;
        AbstractC6861a<Float, Float> mo16817a3 = c10029s.m12520d().mo16817a();
        this.f18572g = mo16817a3;
        abstractC10231b.m12102j(mo16817a);
        abstractC10231b.m12102j(mo16817a2);
        abstractC10231b.m12102j(mo16817a3);
        mo16817a.m21774a(this);
        mo16817a2.m21774a(this);
        mo16817a3.m21774a(this);
    }

    @Override // p125h1.AbstractC6861a.InterfaceC6863b
    /* renamed from: a */
    public void mo12107a() {
        for (int i = 0; i < this.f18568c.size(); i++) {
            this.f18568c.get(i).mo12107a();
        }
    }

    @Override // p111g1.InterfaceC6521c
    /* renamed from: b */
    public void mo12106b(List<InterfaceC6521c> list, List<InterfaceC6521c> list2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m22426d(AbstractC6861a.InterfaceC6863b interfaceC6863b) {
        this.f18568c.add(interfaceC6863b);
    }

    /* renamed from: f */
    public AbstractC6861a<?, Float> m22425f() {
        return this.f18571f;
    }

    /* renamed from: i */
    public AbstractC6861a<?, Float> m22424i() {
        return this.f18572g;
    }

    /* renamed from: j */
    public AbstractC6861a<?, Float> m22423j() {
        return this.f18570e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public C10029s.EnumC10030a m22422k() {
        return this.f18569d;
    }

    /* renamed from: l */
    public boolean m22421l() {
        return this.f18567b;
    }
}
