package p059d6;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p007a6.C0030a;
import p078e6.AbstractC6135k;
import p078e6.InterfaceC6115c;
import p078e6.InterfaceC6117d;
import p097f6.C6311a;
import p097f6.InterfaceC6312b;
import p116g6.InterfaceC6553a;
import p347t5.C12588b;
import p381v5.AbstractC13093i;
import p381v5.AbstractC13103o;
import p381v5.C13092h;
import p397w5.AbstractC13396f;
import p397w5.AbstractC13398g;
import p397w5.InterfaceC13395e;
import p397w5.InterfaceC13406m;
import p458z5.C14089a;
import p458z5.C14093c;

/* renamed from: d6.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5767r {

    /* renamed from: a */
    private final Context f16571a;

    /* renamed from: b */
    private final InterfaceC13395e f16572b;

    /* renamed from: c */
    private final InterfaceC6117d f16573c;

    /* renamed from: d */
    private final InterfaceC5773x f16574d;

    /* renamed from: e */
    private final Executor f16575e;

    /* renamed from: f */
    private final InterfaceC6312b f16576f;

    /* renamed from: g */
    private final InterfaceC6553a f16577g;

    /* renamed from: h */
    private final InterfaceC6553a f16578h;

    /* renamed from: i */
    private final InterfaceC6115c f16579i;

    public C5767r(Context context, InterfaceC13395e interfaceC13395e, InterfaceC6117d interfaceC6117d, InterfaceC5773x interfaceC5773x, Executor executor, InterfaceC6312b interfaceC6312b, InterfaceC6553a interfaceC6553a, InterfaceC6553a interfaceC6553a2, InterfaceC6115c interfaceC6115c) {
        this.f16571a = context;
        this.f16572b = interfaceC13395e;
        this.f16573c = interfaceC6117d;
        this.f16574d = interfaceC5773x;
        this.f16575e = executor;
        this.f16576f = interfaceC6312b;
        this.f16577g = interfaceC6553a;
        this.f16578h = interfaceC6553a2;
        this.f16579i = interfaceC6115c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Boolean m24546l(AbstractC13103o abstractC13103o) {
        return Boolean.valueOf(this.f16573c.mo23447s0(abstractC13103o));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Iterable m24545m(AbstractC13103o abstractC13103o) {
        return this.f16573c.mo23467h0(abstractC13103o);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m24544n(Iterable iterable, AbstractC13103o abstractC13103o, long j) {
        this.f16573c.mo23480Z(iterable);
        this.f16573c.mo23442u(abstractC13103o, this.f16577g.mo22402a() + j);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object m24543o(Iterable iterable) {
        this.f16573c.mo23456n(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Object m24542p() {
        this.f16579i.mo23468h();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object m24541q(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f16579i.mo23465i(((Integer) entry.getValue()).intValue(), C14093c.EnumC14095b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ Object m24540r(AbstractC13103o abstractC13103o, long j) {
        this.f16573c.mo23442u(abstractC13103o, this.f16577g.mo22402a() + j);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ Object m24539s(AbstractC13103o abstractC13103o, int i) {
        this.f16574d.mo24524a(abstractC13103o, i + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m24538t(final AbstractC13103o abstractC13103o, final int i, Runnable runnable) {
        try {
            try {
                InterfaceC6312b interfaceC6312b = this.f16576f;
                final InterfaceC6117d interfaceC6117d = this.f16573c;
                Objects.requireNonNull(interfaceC6117d);
                interfaceC6312b.mo22998a(new InterfaceC6312b.InterfaceC6313a() { // from class: d6.i
                    @Override // p097f6.InterfaceC6312b.InterfaceC6313a
                    public final Object execute() {
                        return Integer.valueOf(InterfaceC6117d.this.mo23475c());
                    }
                });
                if (!m24547k()) {
                    this.f16576f.mo22998a(new InterfaceC6312b.InterfaceC6313a() { // from class: d6.j
                        @Override // p097f6.InterfaceC6312b.InterfaceC6313a
                        public final Object execute() {
                            Object m24539s;
                            m24539s = C5767r.this.m24539s(abstractC13103o, i);
                            return m24539s;
                        }
                    });
                } else {
                    m24537u(abstractC13103o, i);
                }
            } catch (C6311a unused) {
                this.f16574d.mo24524a(abstractC13103o, i + 1);
            }
        } finally {
            runnable.run();
        }
    }

    /* renamed from: j */
    public AbstractC13093i m24548j(InterfaceC13406m interfaceC13406m) {
        InterfaceC6312b interfaceC6312b = this.f16576f;
        final InterfaceC6115c interfaceC6115c = this.f16579i;
        Objects.requireNonNull(interfaceC6115c);
        return interfaceC13406m.mo2627b(AbstractC13093i.m3305a().mo3285i(this.f16577g.mo22402a()).mo3283k(this.f16578h.mo22402a()).mo3284j("GDT_CLIENT_METRICS").mo3286h(new C13092h(C12588b.m4754b("proto"), ((C14089a) interfaceC6312b.mo22998a(new InterfaceC6312b.InterfaceC6313a() { // from class: d6.h
            @Override // p097f6.InterfaceC6312b.InterfaceC6313a
            public final Object execute() {
                return InterfaceC6115c.this.mo23463j();
            }
        })).m697f())).mo3290d());
    }

    /* renamed from: k */
    boolean m24547k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f16571a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    void m24537u(final AbstractC13103o abstractC13103o, int i) {
        AbstractC13398g mo2628a;
        InterfaceC13406m mo2636a = this.f16572b.mo2636a(abstractC13103o.mo3261b());
        long j = 0;
        while (true) {
            final long j2 = j;
            while (((Boolean) this.f16576f.mo22998a(new InterfaceC6312b.InterfaceC6313a() { // from class: d6.k
                @Override // p097f6.InterfaceC6312b.InterfaceC6313a
                public final Object execute() {
                    Boolean m24546l;
                    m24546l = C5767r.this.m24546l(abstractC13103o);
                    return m24546l;
                }
            })).booleanValue()) {
                final Iterable<AbstractC6135k> iterable = (Iterable) this.f16576f.mo22998a(new InterfaceC6312b.InterfaceC6313a() { // from class: d6.l
                    @Override // p097f6.InterfaceC6312b.InterfaceC6313a
                    public final Object execute() {
                        Iterable m24545m;
                        m24545m = C5767r.this.m24545m(abstractC13103o);
                        return m24545m;
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return;
                }
                if (mo2636a == null) {
                    C0030a.m41372a("Uploader", "Unknown backend for %s, deleting event batch for it...", abstractC13103o);
                    mo2628a = AbstractC13398g.m2651a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (AbstractC6135k abstractC6135k : iterable) {
                        arrayList.add(abstractC6135k.mo23519b());
                    }
                    if (abstractC13103o.m3258e()) {
                        arrayList.add(m24548j(mo2636a));
                    }
                    mo2628a = mo2636a.mo2628a(AbstractC13396f.m2657a().mo2653b(arrayList).mo2652c(abstractC13103o.mo3260c()).mo2654a());
                }
                if (mo2628a.mo2649c() == AbstractC13398g.EnumC13399a.TRANSIENT_ERROR) {
                    this.f16576f.mo22998a(new InterfaceC6312b.InterfaceC6313a() { // from class: d6.m
                        @Override // p097f6.InterfaceC6312b.InterfaceC6313a
                        public final Object execute() {
                            Object m24544n;
                            m24544n = C5767r.this.m24544n(iterable, abstractC13103o, j2);
                            return m24544n;
                        }
                    });
                    this.f16574d.mo24523b(abstractC13103o, i + 1, true);
                    return;
                }
                this.f16576f.mo22998a(new InterfaceC6312b.InterfaceC6313a() { // from class: d6.n
                    @Override // p097f6.InterfaceC6312b.InterfaceC6313a
                    public final Object execute() {
                        Object m24543o;
                        m24543o = C5767r.this.m24543o(iterable);
                        return m24543o;
                    }
                });
                if (mo2628a.mo2649c() == AbstractC13398g.EnumC13399a.OK) {
                    j = Math.max(j2, mo2628a.mo2650b());
                    if (abstractC13103o.m3258e()) {
                        this.f16576f.mo22998a(new InterfaceC6312b.InterfaceC6313a() { // from class: d6.o
                            @Override // p097f6.InterfaceC6312b.InterfaceC6313a
                            public final Object execute() {
                                Object m24542p;
                                m24542p = C5767r.this.m24542p();
                                return m24542p;
                            }
                        });
                    }
                } else if (mo2628a.mo2649c() == AbstractC13398g.EnumC13399a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    for (AbstractC6135k abstractC6135k2 : iterable) {
                        String mo3296j = abstractC6135k2.mo23519b().mo3296j();
                        if (!hashMap.containsKey(mo3296j)) {
                            hashMap.put(mo3296j, 1);
                        } else {
                            hashMap.put(mo3296j, Integer.valueOf(((Integer) hashMap.get(mo3296j)).intValue() + 1));
                        }
                    }
                    this.f16576f.mo22998a(new InterfaceC6312b.InterfaceC6313a() { // from class: d6.p
                        @Override // p097f6.InterfaceC6312b.InterfaceC6313a
                        public final Object execute() {
                            Object m24541q;
                            m24541q = C5767r.this.m24541q(hashMap);
                            return m24541q;
                        }
                    });
                }
            }
            this.f16576f.mo22998a(new InterfaceC6312b.InterfaceC6313a() { // from class: d6.q
                @Override // p097f6.InterfaceC6312b.InterfaceC6313a
                public final Object execute() {
                    Object m24540r;
                    m24540r = C5767r.this.m24540r(abstractC13103o, j2);
                    return m24540r;
                }
            });
            return;
        }
    }

    /* renamed from: v */
    public void m24536v(final AbstractC13103o abstractC13103o, final int i, final Runnable runnable) {
        this.f16575e.execute(new Runnable() { // from class: d6.g
            @Override // java.lang.Runnable
            public final void run() {
                C5767r.this.m24538t(abstractC13103o, i, runnable);
            }
        });
    }
}
