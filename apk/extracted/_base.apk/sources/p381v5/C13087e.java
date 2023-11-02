package p381v5;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import p039c6.C2400c;
import p039c6.C2401d;
import p039c6.C2404g;
import p039c6.C2406i;
import p059d6.AbstractC5751f;
import p059d6.C5767r;
import p059d6.C5768s;
import p059d6.C5771v;
import p059d6.C5772w;
import p059d6.InterfaceC5773x;
import p078e6.C6124g;
import p078e6.C6127h;
import p078e6.C6129i;
import p078e6.C6132j;
import p078e6.C6140m0;
import p078e6.C6146n0;
import p078e6.C6161u0;
import p078e6.InterfaceC6117d;
import p116g6.C6555c;
import p116g6.C6557d;
import p381v5.AbstractC13110u;
import p397w5.C13402j;
import p397w5.C13405l;
import p438y5.C13906a;
import p438y5.C13908c;
import p438y5.C13909d;
import p438y5.InterfaceC13907b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: v5.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13087e extends AbstractC13110u {

    /* renamed from: j */
    private Provider<Executor> f33923j;

    /* renamed from: k */
    private Provider<Context> f33924k;

    /* renamed from: l */
    private Provider f33925l;

    /* renamed from: m */
    private Provider f33926m;

    /* renamed from: n */
    private Provider f33927n;

    /* renamed from: o */
    private Provider<String> f33928o;

    /* renamed from: p */
    private Provider<C6140m0> f33929p;

    /* renamed from: q */
    private Provider<AbstractC5751f> f33930q;

    /* renamed from: r */
    private Provider<InterfaceC5773x> f33931r;

    /* renamed from: s */
    private Provider<C2400c> f33932s;

    /* renamed from: t */
    private Provider<C5767r> f33933t;

    /* renamed from: u */
    private Provider<C5771v> f33934u;

    /* renamed from: v */
    private Provider<C13109t> f33935v;

    /* renamed from: v5.e$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    private static final class C13089b implements AbstractC13110u.InterfaceC13111a {

        /* renamed from: a */
        private Context f33936a;

        private C13089b() {
        }

        @Override // p381v5.AbstractC13110u.InterfaceC13111a
        /* renamed from: b */
        public C13089b mo3237a(Context context) {
            this.f33936a = (Context) C13909d.m1220b(context);
            return this;
        }

        @Override // p381v5.AbstractC13110u.InterfaceC13111a
        public AbstractC13110u build() {
            C13909d.m1221a(this.f33936a, Context.class);
            return new C13087e(this.f33936a);
        }
    }

    /* renamed from: i */
    public static AbstractC13110u.InterfaceC13111a m3311i() {
        return new C13089b();
    }

    /* renamed from: j */
    private void m3310j(Context context) {
        this.f33923j = C13906a.m1224b(C13096k.m3281a());
        InterfaceC13907b m1222a = C13908c.m1222a(context);
        this.f33924k = m1222a;
        C13402j m2639a = C13402j.m2639a(m1222a, C6555c.m22410a(), C6557d.m22406a());
        this.f33925l = m2639a;
        this.f33926m = C13906a.m1224b(C13405l.m2631a(this.f33924k, m2639a));
        this.f33927n = C6161u0.m23415a(this.f33924k, C6124g.m23535a(), C6129i.m23528a());
        this.f33928o = C6127h.m23531a(this.f33924k);
        this.f33929p = C13906a.m1224b(C6146n0.m23432a(C6555c.m22410a(), C6557d.m22406a(), C6132j.m23524a(), this.f33927n, this.f33928o));
        C2404g m33508b = C2404g.m33508b(C6555c.m22410a());
        this.f33930q = m33508b;
        C2406i m33505a = C2406i.m33505a(this.f33924k, this.f33929p, m33508b, C6557d.m22406a());
        this.f33931r = m33505a;
        Provider<Executor> provider = this.f33923j;
        Provider provider2 = this.f33926m;
        Provider<C6140m0> provider3 = this.f33929p;
        this.f33932s = C2401d.m33514a(provider, provider2, m33505a, provider3, provider3);
        Provider<Context> provider4 = this.f33924k;
        Provider provider5 = this.f33926m;
        Provider<C6140m0> provider6 = this.f33929p;
        this.f33933t = C5768s.m24535a(provider4, provider5, provider6, this.f33931r, this.f33923j, provider6, C6555c.m22410a(), C6557d.m22406a(), this.f33929p);
        Provider<Executor> provider7 = this.f33923j;
        Provider<C6140m0> provider8 = this.f33929p;
        this.f33934u = C5772w.m24527a(provider7, provider8, this.f33931r, provider8);
        this.f33935v = C13906a.m1224b(C13112v.m3236a(C6555c.m22410a(), C6557d.m22406a(), this.f33932s, this.f33933t, this.f33934u));
    }

    @Override // p381v5.AbstractC13110u
    /* renamed from: a */
    InterfaceC6117d mo3239a() {
        return this.f33929p.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p381v5.AbstractC13110u
    /* renamed from: h */
    public C13109t mo3238h() {
        return this.f33935v.get();
    }

    private C13087e(Context context) {
        m3310j(context);
    }
}
