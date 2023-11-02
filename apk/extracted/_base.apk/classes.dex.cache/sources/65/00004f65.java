package p381v5;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import p039c6.InterfaceC2402e;
import p059d6.C5767r;
import p059d6.C5771v;
import p116g6.InterfaceC6553a;
import p347t5.C12588b;
import p347t5.InterfaceC12593g;
import p347t5.InterfaceC12594h;

/* renamed from: v5.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13109t implements InterfaceC13108s {

    /* renamed from: e */
    private static volatile AbstractC13110u f33951e;

    /* renamed from: a */
    private final InterfaceC6553a f33952a;

    /* renamed from: b */
    private final InterfaceC6553a f33953b;

    /* renamed from: c */
    private final InterfaceC2402e f33954c;

    /* renamed from: d */
    private final C5767r f33955d;

    public C13109t(InterfaceC6553a interfaceC6553a, InterfaceC6553a interfaceC6553a2, InterfaceC2402e interfaceC2402e, C5767r c5767r, C5771v c5771v) {
        this.f33952a = interfaceC6553a;
        this.f33953b = interfaceC6553a2;
        this.f33954c = interfaceC2402e;
        this.f33955d = c5767r;
        c5771v.m24530c();
    }

    /* renamed from: b */
    private AbstractC13093i m3245b(AbstractC13101n abstractC13101n) {
        return AbstractC13093i.m3305a().mo3285i(this.f33952a.mo22402a()).mo3283k(this.f33953b.mo22402a()).mo3284j(abstractC13101n.mo3269g()).mo3286h(new C13092h(abstractC13101n.mo3274b(), abstractC13101n.m3272d())).mo3287g(abstractC13101n.mo3273c().mo4753a()).mo3290d();
    }

    /* renamed from: c */
    public static C13109t m3244c() {
        AbstractC13110u abstractC13110u = f33951e;
        if (abstractC13110u != null) {
            return abstractC13110u.mo3238h();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: d */
    private static Set<C12588b> m3243d(InterfaceC13090f interfaceC13090f) {
        if (interfaceC13090f instanceof InterfaceC13091g) {
            return Collections.unmodifiableSet(((InterfaceC13091g) interfaceC13090f).mo3308a());
        }
        return Collections.singleton(C12588b.m4754b("proto"));
    }

    /* renamed from: f */
    public static void m3241f(Context context) {
        if (f33951e == null) {
            synchronized (C13109t.class) {
                if (f33951e == null) {
                    f33951e = C13087e.m3311i().mo3237a(context).build();
                }
            }
        }
    }

    @Override // p381v5.InterfaceC13108s
    /* renamed from: a */
    public void mo3246a(AbstractC13101n abstractC13101n, InterfaceC12594h interfaceC12594h) {
        this.f33954c.mo33511a(abstractC13101n.mo3270f().m3257f(abstractC13101n.mo3273c().mo4751c()), m3245b(abstractC13101n), interfaceC12594h);
    }

    /* renamed from: e */
    public C5767r m3242e() {
        return this.f33955d;
    }

    /* renamed from: g */
    public InterfaceC12593g m3240g(InterfaceC13090f interfaceC13090f) {
        return new C13105p(m3243d(interfaceC13090f), AbstractC13103o.m3262a().mo3255b(interfaceC13090f.getName()).mo3254c(interfaceC13090f.getExtras()).mo3256a(), this);
    }
}