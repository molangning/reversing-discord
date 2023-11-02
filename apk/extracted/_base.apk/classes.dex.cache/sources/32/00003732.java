package p153i8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.upstream.C4515a;
import com.google.android.exoplayer2.upstream.DataSource;
import gb.AbstractC6693s;
import gb.AbstractC6701u;
import gb.C6698t;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p153i8.C7458o;
import p153i8.InterfaceC7444e;
import p195k8.C9149a;
import p195k8.C9162f0;
import p195k8.C9191p0;
import p195k8.InterfaceC9155c;

/* renamed from: i8.o */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7458o implements InterfaceC7444e, InterfaceC7472x {

    /* renamed from: p */
    public static final C6698t<String, Integer> f20020p = m20632j();

    /* renamed from: q */
    public static final AbstractC6693s<Long> f20021q = AbstractC6693s.m22141A(6100000L, 3800000L, 2100000L, 1300000L, 590000L);

    /* renamed from: r */
    public static final AbstractC6693s<Long> f20022r = AbstractC6693s.m22141A(218000L, 159000L, 145000L, 130000L, 112000L);

    /* renamed from: s */
    public static final AbstractC6693s<Long> f20023s = AbstractC6693s.m22141A(2200000L, 1300000L, 930000L, 730000L, 530000L);

    /* renamed from: t */
    public static final AbstractC6693s<Long> f20024t = AbstractC6693s.m22141A(4800000L, 2700000L, 1800000L, 1200000L, 630000L);

    /* renamed from: u */
    public static final AbstractC6693s<Long> f20025u = AbstractC6693s.m22141A(12000000L, 8800000L, 5900000L, 3500000L, 1800000L);

    /* renamed from: v */
    private static C7458o f20026v;

    /* renamed from: a */
    private final Context f20027a;

    /* renamed from: b */
    private final AbstractC6701u<Integer, Long> f20028b;

    /* renamed from: c */
    private final InterfaceC7444e.InterfaceC7445a.C7446a f20029c;

    /* renamed from: d */
    private final C9162f0 f20030d;

    /* renamed from: e */
    private final InterfaceC9155c f20031e;

    /* renamed from: f */
    private int f20032f;

    /* renamed from: g */
    private long f20033g;

    /* renamed from: h */
    private long f20034h;

    /* renamed from: i */
    private int f20035i;

    /* renamed from: j */
    private long f20036j;

    /* renamed from: k */
    private long f20037k;

    /* renamed from: l */
    private long f20038l;

    /* renamed from: m */
    private long f20039m;

    /* renamed from: n */
    private boolean f20040n;

    /* renamed from: o */
    private int f20041o;

    /* renamed from: i8.o$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7460b {

        /* renamed from: a */
        private final Context f20042a;

        /* renamed from: b */
        private Map<Integer, Long> f20043b;

        /* renamed from: c */
        private int f20044c;

        /* renamed from: d */
        private InterfaceC9155c f20045d;

        /* renamed from: e */
        private boolean f20046e;

        public C7460b(Context context) {
            Context applicationContext;
            if (context == null) {
                applicationContext = null;
            } else {
                applicationContext = context.getApplicationContext();
            }
            this.f20042a = applicationContext;
            this.f20043b = m20624c(C9191p0.m16289M(context));
            this.f20044c = 2000;
            this.f20045d = InterfaceC9155c.f24108a;
            this.f20046e = true;
        }

        /* renamed from: b */
        private static AbstractC6693s<Integer> m20625b(String str) {
            AbstractC6693s<Integer> abstractC6693s = C7458o.f20020p.get(str);
            if (abstractC6693s.isEmpty()) {
                return AbstractC6693s.m22141A(2, 2, 2, 2, 2);
            }
            return abstractC6693s;
        }

        /* renamed from: c */
        private static Map<Integer, Long> m20624c(String str) {
            AbstractC6693s<Integer> m20625b = m20625b(str);
            HashMap hashMap = new HashMap(6);
            hashMap.put(0, 1000000L);
            AbstractC6693s<Long> abstractC6693s = C7458o.f20021q;
            hashMap.put(2, abstractC6693s.get(m20625b.get(0).intValue()));
            hashMap.put(3, C7458o.f20022r.get(m20625b.get(1).intValue()));
            hashMap.put(4, C7458o.f20023s.get(m20625b.get(2).intValue()));
            hashMap.put(5, C7458o.f20024t.get(m20625b.get(3).intValue()));
            hashMap.put(9, C7458o.f20025u.get(m20625b.get(4).intValue()));
            hashMap.put(7, abstractC6693s.get(m20625b.get(0).intValue()));
            return hashMap;
        }

        /* renamed from: a */
        public C7458o m20626a() {
            return new C7458o(this.f20042a, this.f20043b, this.f20044c, this.f20045d, this.f20046e);
        }
    }

    /* renamed from: i8.o$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C7461c extends BroadcastReceiver {

        /* renamed from: c */
        private static C7461c f20047c;

        /* renamed from: a */
        private final Handler f20048a = new Handler(Looper.getMainLooper());

        /* renamed from: b */
        private final ArrayList<WeakReference<C7458o>> f20049b = new ArrayList<>();

        private C7461c() {
        }

        /* renamed from: b */
        public static synchronized C7461c m20622b(Context context) {
            C7461c c7461c;
            synchronized (C7461c.class) {
                if (f20047c == null) {
                    f20047c = new C7461c();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    context.registerReceiver(f20047c, intentFilter);
                }
                c7461c = f20047c;
            }
            return c7461c;
        }

        /* renamed from: e */
        private void m20619e() {
            for (int size = this.f20049b.size() - 1; size >= 0; size--) {
                if (this.f20049b.get(size).get() == null) {
                    this.f20049b.remove(size);
                }
            }
        }

        /* renamed from: f */
        public void m20621c(C7458o c7458o) {
            c7458o.m20627o();
        }

        /* renamed from: d */
        public synchronized void m20620d(final C7458o c7458o) {
            m20619e();
            this.f20049b.add(new WeakReference<>(c7458o));
            this.f20048a.post(new Runnable() { // from class: i8.p
                @Override // java.lang.Runnable
                public final void run() {
                    C7458o.C7461c.this.m20621c(c7458o);
                }
            });
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            m20619e();
            for (int i = 0; i < this.f20049b.size(); i++) {
                C7458o c7458o = this.f20049b.get(i).get();
                if (c7458o != null) {
                    m20621c(c7458o);
                }
            }
        }
    }

    /* renamed from: j */
    private static C6698t<String, Integer> m20632j() {
        C6698t.C6699a m22121r = C6698t.m22121r();
        m22121r.m22115g("AD", 1, 2, 0, 0, 2);
        m22121r.m22115g("AE", 1, 4, 4, 4, 1);
        m22121r.m22115g("AF", 4, 4, 3, 4, 2);
        m22121r.m22115g("AG", 2, 2, 1, 1, 2);
        m22121r.m22115g("AI", 1, 2, 2, 2, 2);
        m22121r.m22115g("AL", 1, 1, 0, 1, 2);
        m22121r.m22115g("AM", 2, 2, 1, 2, 2);
        m22121r.m22115g("AO", 3, 4, 4, 2, 2);
        m22121r.m22115g("AR", 2, 4, 2, 2, 2);
        m22121r.m22115g("AS", 2, 2, 4, 3, 2);
        m22121r.m22115g("AT", 0, 3, 0, 0, 2);
        m22121r.m22115g("AU", 0, 2, 0, 1, 1);
        m22121r.m22115g("AW", 1, 2, 0, 4, 2);
        m22121r.m22115g("AX", 0, 2, 2, 2, 2);
        m22121r.m22115g("AZ", 3, 3, 3, 4, 2);
        m22121r.m22115g("BA", 1, 1, 0, 1, 2);
        m22121r.m22115g("BB", 0, 2, 0, 0, 2);
        m22121r.m22115g("BD", 2, 0, 3, 3, 2);
        m22121r.m22115g("BE", 0, 1, 2, 3, 2);
        m22121r.m22115g("BF", 4, 4, 4, 2, 2);
        m22121r.m22115g("BG", 0, 1, 0, 0, 2);
        m22121r.m22115g("BH", 1, 0, 2, 4, 2);
        m22121r.m22115g("BI", 4, 4, 4, 4, 2);
        m22121r.m22115g("BJ", 4, 4, 3, 4, 2);
        m22121r.m22115g("BL", 1, 2, 2, 2, 2);
        m22121r.m22115g("BM", 1, 2, 0, 0, 2);
        m22121r.m22115g("BN", 4, 0, 1, 1, 2);
        m22121r.m22115g("BO", 2, 3, 3, 2, 2);
        m22121r.m22115g("BQ", 1, 2, 1, 2, 2);
        m22121r.m22115g("BR", 2, 4, 2, 1, 2);
        m22121r.m22115g("BS", 3, 2, 2, 3, 2);
        m22121r.m22115g("BT", 3, 0, 3, 2, 2);
        m22121r.m22115g("BW", 3, 4, 2, 2, 2);
        m22121r.m22115g("BY", 1, 0, 2, 1, 2);
        m22121r.m22115g("BZ", 2, 2, 2, 1, 2);
        m22121r.m22115g("CA", 0, 3, 1, 2, 3);
        m22121r.m22115g("CD", 4, 3, 2, 2, 2);
        m22121r.m22115g("CF", 4, 2, 2, 2, 2);
        m22121r.m22115g("CG", 3, 4, 1, 1, 2);
        m22121r.m22115g("CH", 0, 1, 0, 0, 0);
        m22121r.m22115g("CI", 3, 3, 3, 3, 2);
        m22121r.m22115g("CK", 3, 2, 1, 0, 2);
        m22121r.m22115g("CL", 1, 1, 2, 3, 2);
        m22121r.m22115g("CM", 3, 4, 3, 2, 2);
        m22121r.m22115g("CN", 2, 2, 2, 1, 3);
        m22121r.m22115g("CO", 2, 4, 3, 2, 2);
        m22121r.m22115g("CR", 2, 3, 4, 4, 2);
        m22121r.m22115g("CU", 4, 4, 2, 1, 2);
        m22121r.m22115g("CV", 2, 3, 3, 3, 2);
        m22121r.m22115g("CW", 1, 2, 0, 0, 2);
        m22121r.m22115g("CY", 1, 2, 0, 0, 2);
        m22121r.m22115g("CZ", 0, 1, 0, 0, 2);
        m22121r.m22115g("DE", 0, 1, 1, 2, 0);
        m22121r.m22115g("DJ", 4, 1, 4, 4, 2);
        m22121r.m22115g("DK", 0, 0, 1, 0, 2);
        m22121r.m22115g("DM", 1, 2, 2, 2, 2);
        m22121r.m22115g("DO", 3, 4, 4, 4, 2);
        m22121r.m22115g("DZ", 3, 2, 4, 4, 2);
        m22121r.m22115g("EC", 2, 4, 3, 2, 2);
        m22121r.m22115g("EE", 0, 0, 0, 0, 2);
        m22121r.m22115g("EG", 3, 4, 2, 1, 2);
        m22121r.m22115g("EH", 2, 2, 2, 2, 2);
        m22121r.m22115g("ER", 4, 2, 2, 2, 2);
        m22121r.m22115g("ES", 0, 1, 2, 1, 2);
        m22121r.m22115g("ET", 4, 4, 4, 1, 2);
        m22121r.m22115g("FI", 0, 0, 1, 0, 0);
        m22121r.m22115g("FJ", 3, 0, 3, 3, 2);
        m22121r.m22115g("FK", 2, 2, 2, 2, 2);
        m22121r.m22115g("FM", 4, 2, 4, 3, 2);
        m22121r.m22115g("FO", 0, 2, 0, 0, 2);
        m22121r.m22115g("FR", 1, 0, 2, 1, 2);
        m22121r.m22115g("GA", 3, 3, 1, 0, 2);
        m22121r.m22115g("GB", 0, 0, 1, 2, 2);
        m22121r.m22115g("GD", 1, 2, 2, 2, 2);
        m22121r.m22115g("GE", 1, 0, 1, 3, 2);
        m22121r.m22115g("GF", 2, 2, 2, 4, 2);
        m22121r.m22115g("GG", 0, 2, 0, 0, 2);
        m22121r.m22115g("GH", 3, 2, 3, 2, 2);
        m22121r.m22115g("GI", 0, 2, 0, 0, 2);
        m22121r.m22115g("GL", 1, 2, 2, 1, 2);
        m22121r.m22115g("GM", 4, 3, 2, 4, 2);
        m22121r.m22115g("GN", 4, 3, 4, 2, 2);
        m22121r.m22115g("GP", 2, 2, 3, 4, 2);
        m22121r.m22115g("GQ", 4, 2, 3, 4, 2);
        m22121r.m22115g("GR", 1, 1, 0, 1, 2);
        m22121r.m22115g("GT", 3, 2, 3, 2, 2);
        m22121r.m22115g("GU", 1, 2, 4, 4, 2);
        m22121r.m22115g("GW", 3, 4, 4, 3, 2);
        m22121r.m22115g("GY", 3, 3, 1, 0, 2);
        m22121r.m22115g("HK", 0, 2, 3, 4, 2);
        m22121r.m22115g("HN", 3, 0, 3, 3, 2);
        m22121r.m22115g("HR", 1, 1, 0, 1, 2);
        m22121r.m22115g("HT", 4, 3, 4, 4, 2);
        m22121r.m22115g("HU", 0, 1, 0, 0, 2);
        m22121r.m22115g("ID", 3, 2, 2, 3, 2);
        m22121r.m22115g("IE", 0, 0, 1, 1, 2);
        m22121r.m22115g("IL", 1, 0, 2, 3, 2);
        m22121r.m22115g("IM", 0, 2, 0, 1, 2);
        m22121r.m22115g("IN", 2, 1, 3, 3, 2);
        m22121r.m22115g("IO", 4, 2, 2, 4, 2);
        m22121r.m22115g("IQ", 3, 2, 4, 3, 2);
        m22121r.m22115g("IR", 4, 2, 3, 4, 2);
        m22121r.m22115g("IS", 0, 2, 0, 0, 2);
        m22121r.m22115g("IT", 0, 0, 1, 1, 2);
        m22121r.m22115g("JE", 2, 2, 0, 2, 2);
        m22121r.m22115g("JM", 3, 3, 4, 4, 2);
        m22121r.m22115g("JO", 1, 2, 1, 1, 2);
        m22121r.m22115g("JP", 0, 2, 0, 1, 3);
        m22121r.m22115g("KE", 3, 4, 2, 2, 2);
        m22121r.m22115g("KG", 1, 0, 2, 2, 2);
        m22121r.m22115g("KH", 2, 0, 4, 3, 2);
        m22121r.m22115g("KI", 4, 2, 3, 1, 2);
        m22121r.m22115g("KM", 4, 2, 2, 3, 2);
        m22121r.m22115g("KN", 1, 2, 2, 2, 2);
        m22121r.m22115g("KP", 4, 2, 2, 2, 2);
        m22121r.m22115g("KR", 0, 2, 1, 1, 1);
        m22121r.m22115g("KW", 2, 3, 1, 1, 1);
        m22121r.m22115g("KY", 1, 2, 0, 0, 2);
        m22121r.m22115g("KZ", 1, 2, 2, 3, 2);
        m22121r.m22115g("LA", 2, 2, 1, 1, 2);
        m22121r.m22115g("LB", 3, 2, 0, 0, 2);
        m22121r.m22115g("LC", 1, 1, 0, 0, 2);
        m22121r.m22115g("LI", 0, 2, 2, 2, 2);
        m22121r.m22115g("LK", 2, 0, 2, 3, 2);
        m22121r.m22115g("LR", 3, 4, 3, 2, 2);
        m22121r.m22115g("LS", 3, 3, 2, 3, 2);
        m22121r.m22115g("LT", 0, 0, 0, 0, 2);
        m22121r.m22115g("LU", 0, 0, 0, 0, 2);
        m22121r.m22115g("LV", 0, 0, 0, 0, 2);
        m22121r.m22115g("LY", 4, 2, 4, 3, 2);
        m22121r.m22115g("MA", 2, 1, 2, 1, 2);
        m22121r.m22115g("MC", 0, 2, 2, 2, 2);
        m22121r.m22115g("MD", 1, 2, 0, 0, 2);
        m22121r.m22115g("ME", 1, 2, 1, 2, 2);
        m22121r.m22115g("MF", 1, 2, 1, 0, 2);
        m22121r.m22115g("MG", 3, 4, 3, 3, 2);
        m22121r.m22115g("MH", 4, 2, 2, 4, 2);
        m22121r.m22115g("MK", 1, 0, 0, 0, 2);
        m22121r.m22115g("ML", 4, 4, 1, 1, 2);
        m22121r.m22115g("MM", 2, 3, 2, 2, 2);
        m22121r.m22115g("MN", 2, 4, 1, 1, 2);
        m22121r.m22115g("MO", 0, 2, 4, 4, 2);
        m22121r.m22115g("MP", 0, 2, 2, 2, 2);
        m22121r.m22115g("MQ", 2, 2, 2, 3, 2);
        m22121r.m22115g("MR", 3, 0, 4, 2, 2);
        m22121r.m22115g("MS", 1, 2, 2, 2, 2);
        m22121r.m22115g("MT", 0, 2, 0, 1, 2);
        m22121r.m22115g("MU", 3, 1, 2, 3, 2);
        m22121r.m22115g("MV", 4, 3, 1, 4, 2);
        m22121r.m22115g("MW", 4, 1, 1, 0, 2);
        m22121r.m22115g("MX", 2, 4, 3, 3, 2);
        m22121r.m22115g("MY", 2, 0, 3, 3, 2);
        m22121r.m22115g("MZ", 3, 3, 2, 3, 2);
        m22121r.m22115g("NA", 4, 3, 2, 2, 2);
        m22121r.m22115g("NC", 2, 0, 4, 4, 2);
        m22121r.m22115g("NE", 4, 4, 4, 4, 2);
        m22121r.m22115g("NF", 2, 2, 2, 2, 2);
        m22121r.m22115g("NG", 3, 3, 2, 2, 2);
        m22121r.m22115g("NI", 3, 1, 4, 4, 2);
        m22121r.m22115g("NL", 0, 2, 4, 2, 0);
        m22121r.m22115g("NO", 0, 1, 1, 0, 2);
        m22121r.m22115g("NP", 2, 0, 4, 3, 2);
        m22121r.m22115g("NR", 4, 2, 3, 1, 2);
        m22121r.m22115g("NU", 4, 2, 2, 2, 2);
        m22121r.m22115g("NZ", 0, 2, 1, 2, 4);
        m22121r.m22115g("OM", 2, 2, 0, 2, 2);
        m22121r.m22115g("PA", 1, 3, 3, 4, 2);
        m22121r.m22115g("PE", 2, 4, 4, 4, 2);
        m22121r.m22115g("PF", 2, 2, 1, 1, 2);
        m22121r.m22115g("PG", 4, 3, 3, 2, 2);
        m22121r.m22115g("PH", 3, 0, 3, 4, 4);
        m22121r.m22115g("PK", 3, 2, 3, 3, 2);
        m22121r.m22115g("PL", 1, 0, 2, 2, 2);
        m22121r.m22115g("PM", 0, 2, 2, 2, 2);
        m22121r.m22115g("PR", 1, 2, 2, 3, 4);
        m22121r.m22115g("PS", 3, 3, 2, 2, 2);
        m22121r.m22115g("PT", 1, 1, 0, 0, 2);
        m22121r.m22115g("PW", 1, 2, 3, 0, 2);
        m22121r.m22115g("PY", 2, 0, 3, 3, 2);
        m22121r.m22115g("QA", 2, 3, 1, 2, 2);
        m22121r.m22115g("RE", 1, 0, 2, 1, 2);
        m22121r.m22115g("RO", 1, 1, 1, 2, 2);
        m22121r.m22115g("RS", 1, 2, 0, 0, 2);
        m22121r.m22115g("RU", 0, 1, 0, 1, 2);
        m22121r.m22115g("RW", 4, 3, 3, 4, 2);
        m22121r.m22115g("SA", 2, 2, 2, 1, 2);
        m22121r.m22115g("SB", 4, 2, 4, 2, 2);
        m22121r.m22115g("SC", 4, 2, 0, 1, 2);
        m22121r.m22115g("SD", 4, 4, 4, 3, 2);
        m22121r.m22115g("SE", 0, 0, 0, 0, 2);
        m22121r.m22115g("SG", 0, 0, 3, 3, 4);
        m22121r.m22115g("SH", 4, 2, 2, 2, 2);
        m22121r.m22115g("SI", 0, 1, 0, 0, 2);
        m22121r.m22115g("SJ", 2, 2, 2, 2, 2);
        m22121r.m22115g("SK", 0, 1, 0, 0, 2);
        m22121r.m22115g("SL", 4, 3, 3, 1, 2);
        m22121r.m22115g("SM", 0, 2, 2, 2, 2);
        m22121r.m22115g("SN", 4, 4, 4, 3, 2);
        m22121r.m22115g("SO", 3, 4, 4, 4, 2);
        m22121r.m22115g("SR", 3, 2, 3, 1, 2);
        m22121r.m22115g("SS", 4, 1, 4, 2, 2);
        m22121r.m22115g("ST", 2, 2, 1, 2, 2);
        m22121r.m22115g("SV", 2, 1, 4, 4, 2);
        m22121r.m22115g("SX", 2, 2, 1, 0, 2);
        m22121r.m22115g("SY", 4, 3, 2, 2, 2);
        m22121r.m22115g("SZ", 3, 4, 3, 4, 2);
        m22121r.m22115g("TC", 1, 2, 1, 0, 2);
        m22121r.m22115g("TD", 4, 4, 4, 4, 2);
        m22121r.m22115g("TG", 3, 2, 1, 0, 2);
        m22121r.m22115g("TH", 1, 3, 4, 3, 0);
        m22121r.m22115g("TJ", 4, 4, 4, 4, 2);
        m22121r.m22115g("TL", 4, 1, 4, 4, 2);
        m22121r.m22115g("TM", 4, 2, 1, 2, 2);
        m22121r.m22115g("TN", 2, 1, 1, 1, 2);
        m22121r.m22115g("TO", 3, 3, 4, 2, 2);
        m22121r.m22115g("TR", 1, 2, 1, 1, 2);
        m22121r.m22115g("TT", 1, 3, 1, 3, 2);
        m22121r.m22115g("TV", 3, 2, 2, 4, 2);
        m22121r.m22115g("TW", 0, 0, 0, 0, 1);
        m22121r.m22115g("TZ", 3, 3, 3, 2, 2);
        m22121r.m22115g("UA", 0, 3, 0, 0, 2);
        m22121r.m22115g("UG", 3, 2, 2, 3, 2);
        m22121r.m22115g("US", 0, 1, 3, 3, 3);
        m22121r.m22115g("UY", 2, 1, 1, 1, 2);
        m22121r.m22115g("UZ", 2, 0, 3, 2, 2);
        m22121r.m22115g("VC", 2, 2, 2, 2, 2);
        m22121r.m22115g("VE", 4, 4, 4, 4, 2);
        m22121r.m22115g("VG", 2, 2, 1, 2, 2);
        m22121r.m22115g("VI", 1, 2, 2, 4, 2);
        m22121r.m22115g("VN", 0, 1, 4, 4, 2);
        m22121r.m22115g("VU", 4, 1, 3, 1, 2);
        m22121r.m22115g("WS", 3, 1, 4, 2, 2);
        m22121r.m22115g("XK", 1, 1, 1, 0, 2);
        m22121r.m22115g("YE", 4, 4, 4, 4, 2);
        m22121r.m22115g("YT", 3, 2, 1, 3, 2);
        m22121r.m22115g("ZA", 2, 3, 2, 2, 2);
        m22121r.m22115g("ZM", 3, 2, 2, 3, 2);
        m22121r.m22115g("ZW", 3, 3, 3, 3, 2);
        return m22121r.m22117e();
    }

    /* renamed from: k */
    private long m20631k(int i) {
        Long l = this.f20028b.get(Integer.valueOf(i));
        if (l == null) {
            l = this.f20028b.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    /* renamed from: l */
    public static synchronized C7458o m20630l(Context context) {
        C7458o c7458o;
        synchronized (C7458o.class) {
            if (f20026v == null) {
                f20026v = new C7460b(context).m20626a();
            }
            c7458o = f20026v;
        }
        return c7458o;
    }

    /* renamed from: m */
    private static boolean m20629m(C4515a c4515a, boolean z) {
        return z && !c4515a.m28768d(8);
    }

    /* renamed from: n */
    private void m20628n(int i, long j, long j2) {
        if (i == 0 && j == 0 && j2 == this.f20039m) {
            return;
        }
        this.f20039m = j2;
        this.f20029c.m20661c(i, j, j2);
    }

    /* renamed from: o */
    public synchronized void m20627o() {
        int m16265Y;
        int i = 0;
        if (this.f20040n) {
            m16265Y = this.f20041o;
        } else {
            Context context = this.f20027a;
            if (context == null) {
                m16265Y = 0;
            } else {
                m16265Y = C9191p0.m16265Y(context);
            }
        }
        if (this.f20035i == m16265Y) {
            return;
        }
        this.f20035i = m16265Y;
        if (m16265Y != 1 && m16265Y != 0 && m16265Y != 8) {
            this.f20038l = m20631k(m16265Y);
            long mo16373b = this.f20031e.mo16373b();
            if (this.f20032f > 0) {
                i = (int) (mo16373b - this.f20033g);
            }
            m20628n(i, this.f20034h, this.f20038l);
            this.f20033g = mo16373b;
            this.f20034h = 0L;
            this.f20037k = 0L;
            this.f20036j = 0L;
            this.f20030d.m16407i();
        }
    }

    @Override // p153i8.InterfaceC7444e
    /* renamed from: a */
    public void mo20637a(InterfaceC7444e.InterfaceC7445a interfaceC7445a) {
        this.f20029c.m20659e(interfaceC7445a);
    }

    @Override // p153i8.InterfaceC7472x
    /* renamed from: b */
    public synchronized void mo20610b(DataSource dataSource, C4515a c4515a, boolean z) {
        boolean z2;
        if (!m20629m(c4515a, z)) {
            return;
        }
        if (this.f20032f > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C9149a.m16447f(z2);
        long mo16373b = this.f20031e.mo16373b();
        int i = (int) (mo16373b - this.f20033g);
        this.f20036j += i;
        long j = this.f20037k;
        long j2 = this.f20034h;
        this.f20037k = j + j2;
        if (i > 0) {
            this.f20030d.m16413c((int) Math.sqrt(j2), (((float) j2) * 8000.0f) / i);
            if (this.f20036j >= 2000 || this.f20037k >= 524288) {
                this.f20038l = this.f20030d.m16410f(0.5f);
            }
            m20628n(i, this.f20034h, this.f20038l);
            this.f20033g = mo16373b;
            this.f20034h = 0L;
        }
        this.f20032f--;
    }

    @Override // p153i8.InterfaceC7444e
    /* renamed from: c */
    public InterfaceC7472x mo20636c() {
        return this;
    }

    @Override // p153i8.InterfaceC7444e
    /* renamed from: d */
    public synchronized long mo20635d() {
        return this.f20038l;
    }

    @Override // p153i8.InterfaceC7472x
    /* renamed from: e */
    public synchronized void mo20609e(DataSource dataSource, C4515a c4515a, boolean z, int i) {
        if (!m20629m(c4515a, z)) {
            return;
        }
        this.f20034h += i;
    }

    @Override // p153i8.InterfaceC7444e
    /* renamed from: f */
    public void mo20634f(Handler handler, InterfaceC7444e.InterfaceC7445a interfaceC7445a) {
        C9149a.m16448e(handler);
        C9149a.m16448e(interfaceC7445a);
        this.f20029c.m20662b(handler, interfaceC7445a);
    }

    @Override // p153i8.InterfaceC7472x
    /* renamed from: g */
    public synchronized void mo20608g(DataSource dataSource, C4515a c4515a, boolean z) {
        if (!m20629m(c4515a, z)) {
            return;
        }
        if (this.f20032f == 0) {
            this.f20033g = this.f20031e.mo16373b();
        }
        this.f20032f++;
    }

    @Override // p153i8.InterfaceC7472x
    /* renamed from: h */
    public void mo20607h(DataSource dataSource, C4515a c4515a, boolean z) {
    }

    @Deprecated
    public C7458o() {
        this(null, AbstractC6701u.m22104k(), 2000, InterfaceC9155c.f24108a, false);
    }

    private C7458o(Context context, Map<Integer, Long> map, int i, InterfaceC9155c interfaceC9155c, boolean z) {
        this.f20027a = context == null ? null : context.getApplicationContext();
        this.f20028b = AbstractC6701u.m22111c(map);
        this.f20029c = new InterfaceC7444e.InterfaceC7445a.C7446a();
        this.f20030d = new C9162f0(i);
        this.f20031e = interfaceC9155c;
        int m16265Y = context == null ? 0 : C9191p0.m16265Y(context);
        this.f20035i = m16265Y;
        this.f20038l = m20631k(m16265Y);
        if (context == null || !z) {
            return;
        }
        C7461c.m20622b(context).m20620d(this);
    }
}