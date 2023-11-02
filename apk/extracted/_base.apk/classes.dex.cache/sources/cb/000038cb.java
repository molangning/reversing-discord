package io.sentry;

import io.sentry.protocol.C8062a0;
import io.sentry.util.C8233s;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.b5 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7836b5 implements InterfaceC8026n1 {

    /* renamed from: j */
    private final Date f21413j;

    /* renamed from: k */
    private Date f21414k;

    /* renamed from: l */
    private final AtomicInteger f21415l;

    /* renamed from: m */
    private final String f21416m;

    /* renamed from: n */
    private final UUID f21417n;

    /* renamed from: o */
    private Boolean f21418o;

    /* renamed from: p */
    private EnumC7838b f21419p;

    /* renamed from: q */
    private Long f21420q;

    /* renamed from: r */
    private Double f21421r;

    /* renamed from: s */
    private final String f21422s;

    /* renamed from: t */
    private String f21423t;

    /* renamed from: u */
    private final String f21424u;

    /* renamed from: v */
    private final String f21425v;

    /* renamed from: w */
    private String f21426w;

    /* renamed from: x */
    private final Object f21427x;

    /* renamed from: y */
    private Map<String, Object> f21428y;

    /* renamed from: io.sentry.b5$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7837a implements InterfaceC7894d1<C7836b5> {
        /* renamed from: c */
        private Exception m19568c(String str, InterfaceC8040o0 interfaceC8040o0) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C7836b5 mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            char c;
            String str;
            boolean z;
            c7993j1.m18097h();
            Integer num = null;
            EnumC7838b enumC7838b = null;
            Date date = null;
            Date date2 = null;
            ConcurrentHashMap concurrentHashMap = null;
            String str2 = null;
            UUID uuid = null;
            Boolean bool = null;
            Long l = null;
            Double d = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            while (true) {
                String str8 = str5;
                String str9 = str4;
                String str10 = str3;
                Double d2 = d;
                if (c7993j1.m18098e0() == EnumC8255b.NAME) {
                    String m18105R = c7993j1.m18105R();
                    m18105R.hashCode();
                    Long l2 = l;
                    switch (m18105R.hashCode()) {
                        case -1992012396:
                            if (m18105R.equals("duration")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1897185151:
                            if (m18105R.equals("started")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1294635157:
                            if (m18105R.equals("errors")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -892481550:
                            if (m18105R.equals("status")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 99455:
                            if (m18105R.equals("did")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 113759:
                            if (m18105R.equals("seq")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case 113870:
                            if (m18105R.equals("sid")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3237136:
                            if (m18105R.equals("init")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 55126294:
                            if (m18105R.equals("timestamp")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case 93152418:
                            if (m18105R.equals("attrs")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case 213717026:
                            if (m18105R.equals("abnormal_mechanism")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            d = c7993j1.m19070K0();
                            str5 = str8;
                            str4 = str9;
                            str3 = str10;
                            break;
                        case 1:
                            date = c7993j1.m19071J0(interfaceC8040o0);
                            str5 = str8;
                            str4 = str9;
                            str3 = str10;
                            d = d2;
                            break;
                        case 2:
                            num = c7993j1.m19067N0();
                            str5 = str8;
                            str4 = str9;
                            str3 = str10;
                            d = d2;
                            break;
                        case 3:
                            String m18158b = C8233s.m18158b(c7993j1.m19061T0());
                            if (m18158b != null) {
                                enumC7838b = EnumC7838b.valueOf(m18158b);
                            }
                            str5 = str8;
                            str4 = str9;
                            str3 = str10;
                            d = d2;
                            break;
                        case 4:
                            str2 = c7993j1.m19061T0();
                            str5 = str8;
                            str4 = str9;
                            str3 = str10;
                            d = d2;
                            break;
                        case 5:
                            l = c7993j1.m19065P0();
                            str5 = str8;
                            str4 = str9;
                            str3 = str10;
                            d = d2;
                            continue;
                        case 6:
                            try {
                                str = c7993j1.m19061T0();
                                try {
                                    uuid = UUID.fromString(str);
                                } catch (IllegalArgumentException unused) {
                                    interfaceC8040o0.mo18135c(EnumC8021m4.ERROR, "%s sid is not valid.", str);
                                    str5 = str8;
                                    str4 = str9;
                                    str3 = str10;
                                    d = d2;
                                    l = l2;
                                }
                            } catch (IllegalArgumentException unused2) {
                                str = null;
                            }
                            str5 = str8;
                            str4 = str9;
                            str3 = str10;
                            d = d2;
                        case 7:
                            bool = c7993j1.m19072I0();
                            str5 = str8;
                            str4 = str9;
                            str3 = str10;
                            d = d2;
                            break;
                        case '\b':
                            date2 = c7993j1.m19071J0(interfaceC8040o0);
                            str5 = str8;
                            str4 = str9;
                            str3 = str10;
                            d = d2;
                            break;
                        case '\t':
                            c7993j1.m18097h();
                            str4 = str9;
                            str3 = str10;
                            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                                String m18105R2 = c7993j1.m18105R();
                                m18105R2.hashCode();
                                switch (m18105R2.hashCode()) {
                                    case -85904877:
                                        if (m18105R2.equals("environment")) {
                                            z = false;
                                            break;
                                        }
                                        z = true;
                                        break;
                                    case 1090594823:
                                        if (m18105R2.equals("release")) {
                                            z = true;
                                            break;
                                        }
                                        z = true;
                                        break;
                                    case 1480014044:
                                        if (m18105R2.equals("ip_address")) {
                                            z = true;
                                            break;
                                        }
                                        z = true;
                                        break;
                                    case 1917799825:
                                        if (m18105R2.equals("user_agent")) {
                                            z = true;
                                            break;
                                        }
                                        z = true;
                                        break;
                                    default:
                                        z = true;
                                        break;
                                }
                                switch (z) {
                                    case false:
                                        str8 = c7993j1.m19061T0();
                                        break;
                                    case true:
                                        str6 = c7993j1.m19061T0();
                                        break;
                                    case true:
                                        str3 = c7993j1.m19061T0();
                                        break;
                                    case true:
                                        str4 = c7993j1.m19061T0();
                                        break;
                                    default:
                                        c7993j1.m18110F0();
                                        break;
                                }
                            }
                            c7993j1.m18091q();
                            str5 = str8;
                            d = d2;
                            break;
                        case '\n':
                            str7 = c7993j1.m19061T0();
                            str5 = str8;
                            str4 = str9;
                            str3 = str10;
                            d = d2;
                            break;
                        default:
                            if (concurrentHashMap == null) {
                                concurrentHashMap = new ConcurrentHashMap();
                            }
                            c7993j1.m19059V0(interfaceC8040o0, concurrentHashMap, m18105R);
                            str5 = str8;
                            str4 = str9;
                            str3 = str10;
                            d = d2;
                            break;
                    }
                    l = l2;
                } else {
                    Long l3 = l;
                    if (enumC7838b != null) {
                        if (date != null) {
                            if (num != null) {
                                if (str6 != null) {
                                    C7836b5 c7836b5 = new C7836b5(enumC7838b, date, date2, num.intValue(), str2, uuid, bool, l3, d2, str10, str9, str8, str6, str7);
                                    c7836b5.m19572o(concurrentHashMap);
                                    c7993j1.m18091q();
                                    return c7836b5;
                                }
                                throw m19568c("release", interfaceC8040o0);
                            }
                            throw m19568c("errors", interfaceC8040o0);
                        }
                        throw m19568c("started", interfaceC8040o0);
                    }
                    throw m19568c("status", interfaceC8040o0);
                }
            }
        }
    }

    /* renamed from: io.sentry.b5$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC7838b {
        Ok,
        Exited,
        Crashed,
        Abnormal
    }

    public C7836b5(EnumC7838b enumC7838b, Date date, Date date2, int i, String str, UUID uuid, Boolean bool, Long l, Double d, String str2, String str3, String str4, String str5, String str6) {
        this.f21427x = new Object();
        this.f21419p = enumC7838b;
        this.f21413j = date;
        this.f21414k = date2;
        this.f21415l = new AtomicInteger(i);
        this.f21416m = str;
        this.f21417n = uuid;
        this.f21418o = bool;
        this.f21420q = l;
        this.f21421r = d;
        this.f21422s = str2;
        this.f21423t = str3;
        this.f21424u = str4;
        this.f21425v = str5;
        this.f21426w = str6;
    }

    /* renamed from: a */
    private double m19586a(Date date) {
        return Math.abs(date.getTime() - this.f21413j.getTime()) / 1000.0d;
    }

    /* renamed from: i */
    private long m19578i(Date date) {
        long time = date.getTime();
        if (time < 0) {
            return Math.abs(time);
        }
        return time;
    }

    /* renamed from: b */
    public C7836b5 clone() {
        return new C7836b5(this.f21419p, this.f21413j, this.f21414k, this.f21415l.get(), this.f21416m, this.f21417n, this.f21418o, this.f21420q, this.f21421r, this.f21422s, this.f21423t, this.f21424u, this.f21425v, this.f21426w);
    }

    /* renamed from: c */
    public void m19584c() {
        m19583d(C7991j.m19088c());
    }

    /* renamed from: d */
    public void m19583d(Date date) {
        synchronized (this.f21427x) {
            this.f21418o = null;
            if (this.f21419p == EnumC7838b.Ok) {
                this.f21419p = EnumC7838b.Exited;
            }
            if (date != null) {
                this.f21414k = date;
            } else {
                this.f21414k = C7991j.m19088c();
            }
            Date date2 = this.f21414k;
            if (date2 != null) {
                this.f21421r = Double.valueOf(m19586a(date2));
                this.f21420q = Long.valueOf(m19578i(this.f21414k));
            }
        }
    }

    /* renamed from: e */
    public int m19582e() {
        return this.f21415l.get();
    }

    /* renamed from: f */
    public String m19581f() {
        return this.f21426w;
    }

    /* renamed from: g */
    public Boolean m19580g() {
        return this.f21418o;
    }

    /* renamed from: h */
    public String m19579h() {
        return this.f21425v;
    }

    /* renamed from: j */
    public UUID m19577j() {
        return this.f21417n;
    }

    /* renamed from: k */
    public Date m19576k() {
        Date date = this.f21413j;
        if (date == null) {
            return null;
        }
        return (Date) date.clone();
    }

    /* renamed from: l */
    public EnumC7838b m19575l() {
        return this.f21419p;
    }

    /* renamed from: m */
    public boolean m19574m() {
        return this.f21419p != EnumC7838b.Ok;
    }

    /* renamed from: n */
    public void m19573n() {
        this.f21418o = Boolean.TRUE;
    }

    /* renamed from: o */
    public void m19572o(Map<String, Object> map) {
        this.f21428y = map;
    }

    /* renamed from: p */
    public boolean m19571p(EnumC7838b enumC7838b, String str, boolean z) {
        return m19570q(enumC7838b, str, z, null);
    }

    /* renamed from: q */
    public boolean m19570q(EnumC7838b enumC7838b, String str, boolean z, String str2) {
        boolean z2;
        boolean z3;
        synchronized (this.f21427x) {
            z2 = true;
            if (enumC7838b != null) {
                try {
                    this.f21419p = enumC7838b;
                    z3 = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            } else {
                z3 = false;
            }
            if (str != null) {
                this.f21423t = str;
                z3 = true;
            }
            if (z) {
                this.f21415l.addAndGet(1);
                z3 = true;
            }
            if (str2 != null) {
                this.f21426w = str2;
            } else {
                z2 = z3;
            }
            if (z2) {
                this.f21418o = null;
                Date m19088c = C7991j.m19088c();
                this.f21414k = m19088c;
                if (m19088c != null) {
                    this.f21420q = Long.valueOf(m19578i(m19088c));
                }
            }
        }
        return z2;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        if (this.f21417n != null) {
            interfaceC7919f2.mo18193e("sid").mo18191g(this.f21417n.toString());
        }
        if (this.f21416m != null) {
            interfaceC7919f2.mo18193e("did").mo18191g(this.f21416m);
        }
        if (this.f21418o != null) {
            interfaceC7919f2.mo18193e("init").mo18187k(this.f21418o);
        }
        interfaceC7919f2.mo18193e("started").mo18188j(interfaceC8040o0, this.f21413j);
        interfaceC7919f2.mo18193e("status").mo18188j(interfaceC8040o0, this.f21419p.name().toLowerCase(Locale.ROOT));
        if (this.f21420q != null) {
            interfaceC7919f2.mo18193e("seq").mo18189i(this.f21420q);
        }
        interfaceC7919f2.mo18193e("errors").mo18197a(this.f21415l.intValue());
        if (this.f21421r != null) {
            interfaceC7919f2.mo18193e("duration").mo18189i(this.f21421r);
        }
        if (this.f21414k != null) {
            interfaceC7919f2.mo18193e("timestamp").mo18188j(interfaceC8040o0, this.f21414k);
        }
        if (this.f21426w != null) {
            interfaceC7919f2.mo18193e("abnormal_mechanism").mo18188j(interfaceC8040o0, this.f21426w);
        }
        interfaceC7919f2.mo18193e("attrs");
        interfaceC7919f2.mo18195c();
        interfaceC7919f2.mo18193e("release").mo18188j(interfaceC8040o0, this.f21425v);
        if (this.f21424u != null) {
            interfaceC7919f2.mo18193e("environment").mo18188j(interfaceC8040o0, this.f21424u);
        }
        if (this.f21422s != null) {
            interfaceC7919f2.mo18193e("ip_address").mo18188j(interfaceC8040o0, this.f21422s);
        }
        if (this.f21423t != null) {
            interfaceC7919f2.mo18193e("user_agent").mo18188j(interfaceC8040o0, this.f21423t);
        }
        interfaceC7919f2.mo18190h();
        Map<String, Object> map = this.f21428y;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f21428y.get(str);
                interfaceC7919f2.mo18193e(str);
                interfaceC7919f2.mo18188j(interfaceC8040o0, obj);
            }
        }
        interfaceC7919f2.mo18190h();
    }

    public C7836b5(String str, C8062a0 c8062a0, String str2, String str3) {
        this(EnumC7838b.Ok, C7991j.m19088c(), C7991j.m19088c(), 0, str, UUID.randomUUID(), Boolean.TRUE, null, null, c8062a0 != null ? c8062a0.m18819m() : null, null, str2, str3, null);
    }
}