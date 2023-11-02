package io.sentry.clientreport;

import io.sentry.C7991j;
import io.sentry.C7993j1;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.clientreport.C7876f;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.clientreport.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7871b implements InterfaceC8026n1 {

    /* renamed from: j */
    private final Date f21482j;

    /* renamed from: k */
    private final List<C7876f> f21483k;

    /* renamed from: l */
    private Map<String, Object> f21484l;

    /* renamed from: io.sentry.clientreport.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C7872a implements InterfaceC7894d1<C7871b> {
        /* renamed from: c */
        private Exception m19489c(String str, InterfaceC8040o0 interfaceC8040o0) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C7871b mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            ArrayList arrayList = new ArrayList();
            c7993j1.m18097h();
            Date date = null;
            HashMap hashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                if (!m18105R.equals("discarded_events")) {
                    if (!m18105R.equals("timestamp")) {
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        c7993j1.m19059V0(interfaceC8040o0, hashMap, m18105R);
                    } else {
                        date = c7993j1.m19071J0(interfaceC8040o0);
                    }
                } else {
                    arrayList.addAll(c7993j1.m19066O0(interfaceC8040o0, new C7876f.C7877a()));
                }
            }
            c7993j1.m18091q();
            if (date != null) {
                if (!arrayList.isEmpty()) {
                    C7871b c7871b = new C7871b(date, arrayList);
                    c7871b.m19491b(hashMap);
                    return c7871b;
                }
                throw m19489c("discarded_events", interfaceC8040o0);
            }
            throw m19489c("timestamp", interfaceC8040o0);
        }
    }

    public C7871b(Date date, List<C7876f> list) {
        this.f21482j = date;
        this.f21483k = list;
    }

    /* renamed from: a */
    public List<C7876f> m19492a() {
        return this.f21483k;
    }

    /* renamed from: b */
    public void m19491b(Map<String, Object> map) {
        this.f21484l = map;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        interfaceC7919f2.mo18193e("timestamp").mo18191g(C7991j.m19084g(this.f21482j));
        interfaceC7919f2.mo18193e("discarded_events").mo18188j(interfaceC8040o0, this.f21483k);
        Map<String, Object> map = this.f21484l;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC7919f2.mo18193e(str).mo18188j(interfaceC8040o0, this.f21484l.get(str));
            }
        }
        interfaceC7919f2.mo18190h();
    }
}
