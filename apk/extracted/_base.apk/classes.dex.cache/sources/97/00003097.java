package p059d6;

import java.util.concurrent.Executor;
import p078e6.InterfaceC6117d;
import p097f6.InterfaceC6312b;
import p381v5.AbstractC13103o;

/* renamed from: d6.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5771v {

    /* renamed from: a */
    private final Executor f16591a;

    /* renamed from: b */
    private final InterfaceC6117d f16592b;

    /* renamed from: c */
    private final InterfaceC5773x f16593c;

    /* renamed from: d */
    private final InterfaceC6312b f16594d;

    public C5771v(Executor executor, InterfaceC6117d interfaceC6117d, InterfaceC5773x interfaceC5773x, InterfaceC6312b interfaceC6312b) {
        this.f16591a = executor;
        this.f16592b = interfaceC6117d;
        this.f16593c = interfaceC5773x;
        this.f16594d = interfaceC6312b;
    }

    /* renamed from: d */
    public /* synthetic */ Object m24529d() {
        for (AbstractC13103o abstractC13103o : this.f16592b.mo23435x()) {
            this.f16593c.mo24524a(abstractC13103o, 1);
        }
        return null;
    }

    /* renamed from: e */
    public /* synthetic */ void m24528e() {
        this.f16594d.mo22998a(new InterfaceC6312b.InterfaceC6313a() { // from class: d6.u
            @Override // p097f6.InterfaceC6312b.InterfaceC6313a
            public final Object execute() {
                Object m24529d;
                m24529d = C5771v.this.m24529d();
                return m24529d;
            }
        });
    }

    /* renamed from: c */
    public void m24530c() {
        this.f16591a.execute(new Runnable() { // from class: d6.t
            @Override // java.lang.Runnable
            public final void run() {
                C5771v.this.m24528e();
            }
        });
    }
}