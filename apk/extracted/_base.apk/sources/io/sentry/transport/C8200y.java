package io.sentry.transport;

import io.sentry.C7831b0;
import io.sentry.C7898d4;
import io.sentry.C8020m3;
import io.sentry.C8132r4;
import io.sentry.EnumC7960i;
import io.sentry.EnumC8021m4;
import io.sentry.clientreport.EnumC7875e;
import io.sentry.hints.InterfaceC7953k;
import io.sentry.hints.InterfaceC7958p;
import io.sentry.util.C8220j;
import io.sentry.util.C8233s;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: io.sentry.transport.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8200y {

    /* renamed from: a */
    private final InterfaceC8189o f22130a;

    /* renamed from: b */
    private final C8132r4 f22131b;

    /* renamed from: c */
    private final Map<EnumC7960i, Date> f22132c;

    public C8200y(InterfaceC8189o interfaceC8189o, C8132r4 c8132r4) {
        this.f22132c = new ConcurrentHashMap();
        this.f22130a = interfaceC8189o;
        this.f22131b = c8132r4;
    }

    /* renamed from: c */
    private void m18290c(EnumC7960i enumC7960i, Date date) {
        Date date2 = this.f22132c.get(enumC7960i);
        if (date2 == null || date.after(date2)) {
            this.f22132c.put(enumC7960i, date);
        }
    }

    /* renamed from: e */
    private EnumC7960i m18288e(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1963501277:
                if (str.equals("attachment")) {
                    c = 0;
                    break;
                }
                break;
            case -309425751:
                if (str.equals("profile")) {
                    c = 1;
                    break;
                }
                break;
            case 96891546:
                if (str.equals("event")) {
                    c = 2;
                    break;
                }
                break;
            case 1984987798:
                if (str.equals("session")) {
                    c = 3;
                    break;
                }
                break;
            case 2141246174:
                if (str.equals("transaction")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return EnumC7960i.Attachment;
            case 1:
                return EnumC7960i.Profile;
            case 2:
                return EnumC7960i.Error;
            case 3:
                return EnumC7960i.Session;
            case 4:
                return EnumC7960i.Transaction;
            default:
                return EnumC7960i.Unknown;
        }
    }

    /* renamed from: f */
    private boolean m18287f(String str) {
        Date date;
        EnumC7960i m18288e = m18288e(str);
        Date date2 = new Date(this.f22130a.mo18303a());
        Date date3 = this.f22132c.get(EnumC7960i.All);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (EnumC7960i.Unknown.equals(m18288e) || (date = this.f22132c.get(m18288e)) == null) {
            return false;
        }
        return !date2.after(date);
    }

    /* renamed from: i */
    private static void m18284i(C7831b0 c7831b0, final boolean z) {
        C8220j.m18215o(c7831b0, InterfaceC7958p.class, new C8220j.InterfaceC8221a() { // from class: io.sentry.transport.w
            @Override // io.sentry.util.C8220j.InterfaceC8221a
            public final void accept(Object obj) {
                ((InterfaceC7958p) obj).mo18902b(false);
            }
        });
        C8220j.m18215o(c7831b0, InterfaceC7953k.class, new C8220j.InterfaceC8221a() { // from class: io.sentry.transport.x
            @Override // io.sentry.util.C8220j.InterfaceC8221a
            public final void accept(Object obj) {
                ((InterfaceC7953k) obj).mo18901c(z);
            }
        });
    }

    /* renamed from: j */
    private long m18283j(String str) {
        if (str != null) {
            try {
                return (long) (Double.parseDouble(str) * 1000.0d);
            } catch (NumberFormatException unused) {
            }
        }
        return 60000L;
    }

    /* renamed from: d */
    public C8020m3 m18289d(C8020m3 c8020m3, C7831b0 c7831b0) {
        ArrayList arrayList = null;
        for (C7898d4 c7898d4 : c8020m3.m18986c()) {
            if (m18287f(c7898d4.m19359y().m19309b().getItemType())) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c7898d4);
                this.f22131b.getClientReportRecorder().mo19472c(EnumC7875e.RATELIMIT_BACKOFF, c7898d4);
            }
        }
        if (arrayList != null) {
            this.f22131b.getLogger().mo18135c(EnumC8021m4.INFO, "%d items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
            ArrayList arrayList2 = new ArrayList();
            for (C7898d4 c7898d42 : c8020m3.m18986c()) {
                if (!arrayList.contains(c7898d42)) {
                    arrayList2.add(c7898d42);
                }
            }
            if (arrayList2.isEmpty()) {
                this.f22131b.getLogger().mo18135c(EnumC8021m4.INFO, "Envelope discarded due all items rate limited.", new Object[0]);
                m18284i(c7831b0, false);
                return null;
            }
            return new C8020m3(c8020m3.m18987b(), arrayList2);
        }
        return c8020m3;
    }

    /* renamed from: k */
    public void m18282k(String str, String str2, int i) {
        String[] split;
        if (str != null) {
            int i2 = -1;
            String[] split2 = str.split(",", -1);
            int length = split2.length;
            int i3 = 0;
            while (i3 < length) {
                String[] split3 = split2[i3].replace(" ", "").split(":", i2);
                if (split3.length > 0) {
                    long m18283j = m18283j(split3[0]);
                    if (split3.length > 1) {
                        String str3 = split3[1];
                        Date date = new Date(this.f22130a.mo18303a() + m18283j);
                        if (str3 != null && !str3.isEmpty()) {
                            for (String str4 : str3.split(";", i2)) {
                                EnumC7960i enumC7960i = EnumC7960i.Unknown;
                                try {
                                    String m18158b = C8233s.m18158b(str4);
                                    if (m18158b != null) {
                                        enumC7960i = EnumC7960i.valueOf(m18158b);
                                    } else {
                                        this.f22131b.getLogger().mo18135c(EnumC8021m4.ERROR, "Couldn't capitalize: %s", str4);
                                    }
                                } catch (IllegalArgumentException e) {
                                    this.f22131b.getLogger().mo18137a(EnumC8021m4.INFO, e, "Unknown category: %s", str4);
                                }
                                if (!EnumC7960i.Unknown.equals(enumC7960i)) {
                                    m18290c(enumC7960i, date);
                                }
                            }
                        } else {
                            m18290c(EnumC7960i.All, date);
                        }
                    }
                }
                i3++;
                i2 = -1;
            }
        } else if (i == 429) {
            m18290c(EnumC7960i.All, new Date(this.f22130a.mo18303a() + m18283j(str2)));
        }
    }

    public C8200y(C8132r4 c8132r4) {
        this(C8187m.m18313b(), c8132r4);
    }
}
