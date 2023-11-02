package p259o6;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p195k8.C9149a;
import p195k8.C9191p0;
import p229m7.InterfaceC10341s;
import p259o6.InterfaceC11045v;

/* renamed from: o6.v */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC11045v {

    /* renamed from: o6.v$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C11046a {

        /* renamed from: a */
        public final int f28909a;

        /* renamed from: b */
        public final InterfaceC10341s.C10342a f28910b;

        /* renamed from: c */
        private final CopyOnWriteArrayList<C11047a> f28911c;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o6.v$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public static final class C11047a {

            /* renamed from: a */
            public Handler f28912a;

            /* renamed from: b */
            public InterfaceC11045v f28913b;

            public C11047a(Handler handler, InterfaceC11045v interfaceC11045v) {
                this.f28912a = handler;
                this.f28913b = interfaceC11045v;
            }
        }

        public C11046a() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* renamed from: n */
        public /* synthetic */ void m9276n(InterfaceC11045v interfaceC11045v) {
            interfaceC11045v.mo9290z(this.f28909a, this.f28910b);
        }

        /* renamed from: o */
        public /* synthetic */ void m9275o(InterfaceC11045v interfaceC11045v) {
            interfaceC11045v.mo9291v(this.f28909a, this.f28910b);
        }

        /* renamed from: p */
        public /* synthetic */ void m9274p(InterfaceC11045v interfaceC11045v) {
            interfaceC11045v.mo9293t(this.f28909a, this.f28910b);
        }

        /* renamed from: q */
        public /* synthetic */ void m9273q(InterfaceC11045v interfaceC11045v) {
            interfaceC11045v.mo9292u(this.f28909a, this.f28910b);
        }

        /* renamed from: r */
        public /* synthetic */ void m9272r(InterfaceC11045v interfaceC11045v, Exception exc) {
            interfaceC11045v.mo9295D(this.f28909a, this.f28910b, exc);
        }

        /* renamed from: s */
        public /* synthetic */ void m9271s(InterfaceC11045v interfaceC11045v) {
            interfaceC11045v.mo9294e(this.f28909a, this.f28910b);
        }

        /* renamed from: g */
        public void m9283g(Handler handler, InterfaceC11045v interfaceC11045v) {
            C9149a.m16448e(handler);
            C9149a.m16448e(interfaceC11045v);
            this.f28911c.add(new C11047a(handler, interfaceC11045v));
        }

        /* renamed from: h */
        public void m9282h() {
            Iterator<C11047a> it = this.f28911c.iterator();
            while (it.hasNext()) {
                C11047a next = it.next();
                final InterfaceC11045v interfaceC11045v = next.f28913b;
                C9191p0.m16302F0(next.f28912a, new Runnable() { // from class: o6.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11045v.C11046a.this.m9276n(interfaceC11045v);
                    }
                });
            }
        }

        /* renamed from: i */
        public void m9281i() {
            Iterator<C11047a> it = this.f28911c.iterator();
            while (it.hasNext()) {
                C11047a next = it.next();
                final InterfaceC11045v interfaceC11045v = next.f28913b;
                C9191p0.m16302F0(next.f28912a, new Runnable() { // from class: o6.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11045v.C11046a.this.m9275o(interfaceC11045v);
                    }
                });
            }
        }

        /* renamed from: j */
        public void m9280j() {
            Iterator<C11047a> it = this.f28911c.iterator();
            while (it.hasNext()) {
                C11047a next = it.next();
                final InterfaceC11045v interfaceC11045v = next.f28913b;
                C9191p0.m16302F0(next.f28912a, new Runnable() { // from class: o6.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11045v.C11046a.this.m9274p(interfaceC11045v);
                    }
                });
            }
        }

        /* renamed from: k */
        public void m9279k() {
            Iterator<C11047a> it = this.f28911c.iterator();
            while (it.hasNext()) {
                C11047a next = it.next();
                final InterfaceC11045v interfaceC11045v = next.f28913b;
                C9191p0.m16302F0(next.f28912a, new Runnable() { // from class: o6.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11045v.C11046a.this.m9273q(interfaceC11045v);
                    }
                });
            }
        }

        /* renamed from: l */
        public void m9278l(final Exception exc) {
            Iterator<C11047a> it = this.f28911c.iterator();
            while (it.hasNext()) {
                C11047a next = it.next();
                final InterfaceC11045v interfaceC11045v = next.f28913b;
                C9191p0.m16302F0(next.f28912a, new Runnable() { // from class: o6.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11045v.C11046a.this.m9272r(interfaceC11045v, exc);
                    }
                });
            }
        }

        /* renamed from: m */
        public void m9277m() {
            Iterator<C11047a> it = this.f28911c.iterator();
            while (it.hasNext()) {
                C11047a next = it.next();
                final InterfaceC11045v interfaceC11045v = next.f28913b;
                C9191p0.m16302F0(next.f28912a, new Runnable() { // from class: o6.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        InterfaceC11045v.C11046a.this.m9271s(interfaceC11045v);
                    }
                });
            }
        }

        /* renamed from: t */
        public C11046a m9270t(int i, InterfaceC10341s.C10342a c10342a) {
            return new C11046a(this.f28911c, i, c10342a);
        }

        private C11046a(CopyOnWriteArrayList<C11047a> copyOnWriteArrayList, int i, InterfaceC10341s.C10342a c10342a) {
            this.f28911c = copyOnWriteArrayList;
            this.f28909a = i;
            this.f28910b = c10342a;
        }
    }

    /* renamed from: D */
    void mo9295D(int i, InterfaceC10341s.C10342a c10342a, Exception exc);

    /* renamed from: e */
    void mo9294e(int i, InterfaceC10341s.C10342a c10342a);

    /* renamed from: t */
    void mo9293t(int i, InterfaceC10341s.C10342a c10342a);

    /* renamed from: u */
    void mo9292u(int i, InterfaceC10341s.C10342a c10342a);

    /* renamed from: v */
    void mo9291v(int i, InterfaceC10341s.C10342a c10342a);

    /* renamed from: z */
    void mo9290z(int i, InterfaceC10341s.C10342a c10342a);
}