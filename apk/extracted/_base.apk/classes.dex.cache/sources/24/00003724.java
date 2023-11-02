package p153i8;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p153i8.InterfaceC7444e;
import p195k8.C9149a;

/* renamed from: i8.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public interface InterfaceC7444e {

    /* renamed from: i8.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC7445a {

        /* renamed from: i8.e$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public static final class C7446a {

            /* renamed from: a */
            private final CopyOnWriteArrayList<C7447a> f19987a = new CopyOnWriteArrayList<>();

            /* renamed from: i8.e$a$a$a */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
            public static final class C7447a {

                /* renamed from: a */
                private final Handler f19988a;

                /* renamed from: b */
                private final InterfaceC7445a f19989b;

                /* renamed from: c */
                private boolean f19990c;

                public C7447a(Handler handler, InterfaceC7445a interfaceC7445a) {
                    this.f19988a = handler;
                    this.f19989b = interfaceC7445a;
                }

                /* renamed from: d */
                public void m20655d() {
                    this.f19990c = true;
                }
            }

            /* renamed from: d */
            public static /* synthetic */ void m20660d(C7447a c7447a, int i, long j, long j2) {
                c7447a.f19989b.mo20664k(i, j, j2);
            }

            /* renamed from: b */
            public void m20662b(Handler handler, InterfaceC7445a interfaceC7445a) {
                C9149a.m16448e(handler);
                C9149a.m16448e(interfaceC7445a);
                m20659e(interfaceC7445a);
                this.f19987a.add(new C7447a(handler, interfaceC7445a));
            }

            /* renamed from: c */
            public void m20661c(final int i, final long j, final long j2) {
                Iterator<C7447a> it = this.f19987a.iterator();
                while (it.hasNext()) {
                    final C7447a next = it.next();
                    if (!next.f19990c) {
                        next.f19988a.post(new Runnable() { // from class: i8.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                InterfaceC7444e.InterfaceC7445a.C7446a.m20660d(InterfaceC7444e.InterfaceC7445a.C7446a.C7447a.this, i, j, j2);
                            }
                        });
                    }
                }
            }

            /* renamed from: e */
            public void m20659e(InterfaceC7445a interfaceC7445a) {
                Iterator<C7447a> it = this.f19987a.iterator();
                while (it.hasNext()) {
                    C7447a next = it.next();
                    if (next.f19989b == interfaceC7445a) {
                        next.m20655d();
                        this.f19987a.remove(next);
                    }
                }
            }
        }

        /* renamed from: k */
        void mo20664k(int i, long j, long j2);
    }

    /* renamed from: a */
    void mo20637a(InterfaceC7445a interfaceC7445a);

    /* renamed from: c */
    InterfaceC7472x mo20636c();

    /* renamed from: d */
    long mo20635d();

    /* renamed from: f */
    void mo20634f(Handler handler, InterfaceC7445a interfaceC7445a);
}