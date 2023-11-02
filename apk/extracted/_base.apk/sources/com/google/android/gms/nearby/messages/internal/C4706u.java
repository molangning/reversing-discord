package com.google.android.gms.nearby.messages.internal;

import android.content.Context;
import ca.AbstractC2469b;
import ca.AbstractC2476h;
import ca.C2472e;
import ca.C2474g;
import ca.InterfaceC2471d;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4616d;
import com.google.android.gms.common.api.internal.C4620e;
import com.google.android.gms.common.api.internal.C4624g;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.SubscribeOptions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import p010a9.InterfaceC0107i;
import p029b9.C2158d;
import p029b9.C2198p;
import p063da.C5793f;
import p461z8.AbstractC14121e;
import p461z8.C14107a;

/* renamed from: com.google.android.gms.nearby.messages.internal.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4706u extends AbstractC14121e implements InterfaceC2471d {

    /* renamed from: l */
    private static final C14107a.C14117g f12903l;

    /* renamed from: m */
    private static final C14107a.AbstractC14108a f12904m;

    /* renamed from: n */
    private static final C14107a f12905n;

    /* renamed from: o */
    public static final /* synthetic */ int f12906o = 0;

    /* renamed from: k */
    private final int f12907k;

    static {
        C14107a.C14117g c14117g = new C14107a.C14117g();
        f12903l = c14117g;
        C4692k c4692k = new C4692k();
        f12904m = c4692k;
        f12905n = new C14107a("Nearby.MESSAGES_API", c4692k, c14117g);
    }

    public C4706u(Context context, C2472e c2472e) {
        super(context, f12905n, c2472e, AbstractC14121e.C14122a.f36316c);
        this.f12907k = C4674b.m28042l0(context);
    }

    /* renamed from: G */
    private final C4616d m28023G(Object obj) {
        if (obj == null) {
            return null;
        }
        return m614w(obj, obj.getClass().getName());
    }

    /* renamed from: H */
    private final C4616d m28022H(TaskCompletionSource taskCompletionSource) {
        return m614w(new C4698n(this, taskCompletionSource), Status.class.getName());
    }

    /* renamed from: I */
    private final Task m28021I(C4616d c4616d, final InterfaceC4701p interfaceC4701p, final InterfaceC4701p interfaceC4701p2, int i) {
        return m624m(C4624g.m28172a().m28167e(c4616d).m28170b(new InterfaceC0107i() { // from class: com.google.android.gms.nearby.messages.internal.f
            @Override // p010a9.InterfaceC0107i
            public final void accept(Object obj, Object obj2) {
                C4706u.this.m28025E(interfaceC4701p, (C4674b) obj, (TaskCompletionSource) obj2);
            }
        }).m28168d(new InterfaceC0107i() { // from class: com.google.android.gms.nearby.messages.internal.g
            @Override // p010a9.InterfaceC0107i
            public final void accept(Object obj, Object obj2) {
                C4706u.this.m28026D(interfaceC4701p2, (C4674b) obj, (TaskCompletionSource) obj2);
            }
        }).m28169c(i).m28171a());
    }

    /* renamed from: J */
    private final Task m28020J(Object obj, int i) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m622o(C4620e.m28179b(obj, obj.getClass().getName()), i).mo27982b(new C4700o(this, taskCompletionSource));
        return taskCompletionSource.m28013a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public final /* synthetic */ void m28027C(Message message, BinderC4703r binderC4703r, C2474g c2474g, C4674b c4674b, C4616d c4616d) {
        c4674b.m28040n0(c4616d, C5793f.m24504r(message), binderC4703r, c2474g, this.f12907k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: D */
    public final /* synthetic */ void m28026D(InterfaceC4701p interfaceC4701p, C4674b c4674b, TaskCompletionSource taskCompletionSource) {
        interfaceC4701p.mo28028a(c4674b, m28022H(taskCompletionSource));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E */
    public final /* synthetic */ void m28025E(InterfaceC4701p interfaceC4701p, C4674b c4674b, TaskCompletionSource taskCompletionSource) {
        interfaceC4701p.mo28028a(c4674b, m28022H(taskCompletionSource));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: F */
    public final /* synthetic */ void m28024F(C4616d c4616d, BinderC4705t binderC4705t, SubscribeOptions subscribeOptions, C4674b c4674b, C4616d c4616d2) {
        c4674b.m28038p0(c4616d2, c4616d, binderC4705t, subscribeOptions, null, this.f12907k);
    }

    @Override // ca.InterfaceC2471d
    /* renamed from: a */
    public final Task<Void> mo28019a(AbstractC2476h abstractC2476h) {
        C2198p.m33985j(abstractC2476h);
        return m28020J(abstractC2476h, 1271);
    }

    @Override // ca.InterfaceC2471d
    /* renamed from: b */
    public final Task<Void> mo28018b(final Message message) {
        final C2474g c2474g = C2474g.f6823c;
        C2198p.m33985j(message);
        C2198p.m33985j(c2474g);
        C4616d m28023G = m28023G(message);
        final BinderC4694l binderC4694l = new BinderC4694l(this, m28023G(c2474g.m33155a()), m28023G);
        return m28021I(m28023G, new InterfaceC4701p() { // from class: com.google.android.gms.nearby.messages.internal.j
            @Override // com.google.android.gms.nearby.messages.internal.InterfaceC4701p
            /* renamed from: a */
            public final void mo28028a(C4674b c4674b, C4616d c4616d) {
                C4706u.this.m28027C(message, binderC4694l, c2474g, c4674b, c4616d);
            }
        }, new InterfaceC4701p() { // from class: com.google.android.gms.nearby.messages.internal.c
            @Override // com.google.android.gms.nearby.messages.internal.InterfaceC4701p
            /* renamed from: a */
            public final void mo28028a(C4674b c4674b, C4616d c4616d) {
                Message message2 = Message.this;
                int i = C4706u.f12906o;
                c4674b.m28037q0(c4616d, C5793f.m24504r(message2));
            }
        }, 1291);
    }

    @Override // ca.InterfaceC2471d
    /* renamed from: c */
    public final Task<Void> mo28017c(Message message) {
        C2198p.m33985j(message);
        return m28020J(message, 1290);
    }

    @Override // ca.InterfaceC2471d
    /* renamed from: e */
    public final Task<Void> mo28016e(AbstractC2476h abstractC2476h) {
        C2198p.m33985j(abstractC2476h);
        final C4616d m28023G = m28023G(abstractC2476h);
        return m28021I(m28023G, new InterfaceC4701p() { // from class: com.google.android.gms.nearby.messages.internal.d
            @Override // com.google.android.gms.nearby.messages.internal.InterfaceC4701p
            /* renamed from: a */
            public final void mo28028a(C4674b c4674b, C4616d c4616d) {
                C4616d c4616d2 = C4616d.this;
                int i = C4706u.f12906o;
                c4674b.m28039o0(c4616d, c4616d2);
            }
        }, new InterfaceC4701p() { // from class: com.google.android.gms.nearby.messages.internal.e
            @Override // com.google.android.gms.nearby.messages.internal.InterfaceC4701p
            /* renamed from: a */
            public final void mo28028a(C4674b c4674b, C4616d c4616d) {
                C4616d c4616d2 = C4616d.this;
                int i = C4706u.f12906o;
                c4674b.m28036r0(c4616d, c4616d2);
            }
        }, 1270);
    }

    @Override // ca.InterfaceC2471d
    /* renamed from: f */
    public final Task<Void> mo28015f(AbstractC2469b abstractC2469b) {
        C2198p.m33985j(abstractC2469b);
        return m28020J(abstractC2469b, 1286);
    }

    @Override // ca.InterfaceC2471d
    /* renamed from: g */
    public final Task<Void> mo28014g(AbstractC2469b abstractC2469b, final SubscribeOptions subscribeOptions) {
        boolean z;
        C2198p.m33985j(abstractC2469b);
        C2198p.m33985j(subscribeOptions);
        if (subscribeOptions.m28050c().m33152r() == 0) {
            z = true;
        } else {
            z = false;
        }
        C2198p.m33993b(z, "Strategy.setBackgroundScanMode() is only supported by background subscribe (the version which takes a PendingIntent).");
        final C4616d m28023G = m28023G(abstractC2469b);
        C4616d m28023G2 = m28023G(subscribeOptions.m28052a());
        final BinderC4696m binderC4696m = new BinderC4696m(this, m28023G2, m28023G2);
        return m28021I(m28023G, new InterfaceC4701p() { // from class: com.google.android.gms.nearby.messages.internal.h
            @Override // com.google.android.gms.nearby.messages.internal.InterfaceC4701p
            /* renamed from: a */
            public final void mo28028a(C4674b c4674b, C4616d c4616d) {
                C4706u.this.m28024F(m28023G, binderC4696m, subscribeOptions, c4674b, c4616d);
            }
        }, new InterfaceC4701p() { // from class: com.google.android.gms.nearby.messages.internal.i
            @Override // com.google.android.gms.nearby.messages.internal.InterfaceC4701p
            /* renamed from: a */
            public final void mo28028a(C4674b c4674b, C4616d c4616d) {
                C4616d c4616d2 = C4616d.this;
                int i = C4706u.f12906o;
                c4674b.m28043k0(c4616d, c4616d2);
            }
        }, 1289);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p461z8.AbstractC14121e
    /* renamed from: i */
    public final C2158d.C2159a mo628i() {
        C2158d.C2159a mo628i = super.mo628i();
        if (m618s() != null) {
            String str = ((C2472e) m618s()).f6822l;
        }
        return mo628i;
    }
}
