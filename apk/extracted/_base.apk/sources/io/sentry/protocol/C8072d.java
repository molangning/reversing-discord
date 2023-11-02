package io.sentry.protocol;

import io.sentry.C7993j1;
import io.sentry.InterfaceC7894d1;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import io.sentry.protocol.C8094n;
import io.sentry.protocol.DebugImage;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.protocol.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8072d implements InterfaceC8026n1 {

    /* renamed from: j */
    private C8094n f21847j;

    /* renamed from: k */
    private List<DebugImage> f21848k;

    /* renamed from: l */
    private Map<String, Object> f21849l;

    /* renamed from: io.sentry.protocol.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8073a implements InterfaceC7894d1<C8072d> {
        @Override // io.sentry.InterfaceC7894d1
        /* renamed from: b */
        public C8072d mo18130a(C7993j1 c7993j1, InterfaceC8040o0 interfaceC8040o0) {
            C8072d c8072d = new C8072d();
            c7993j1.m18097h();
            HashMap hashMap = null;
            while (c7993j1.m18098e0() == EnumC8255b.NAME) {
                String m18105R = c7993j1.m18105R();
                m18105R.hashCode();
                if (!m18105R.equals("images")) {
                    if (!m18105R.equals("sdk_info")) {
                        if (hashMap == null) {
                            hashMap = new HashMap();
                        }
                        c7993j1.m19059V0(interfaceC8040o0, hashMap, m18105R);
                    } else {
                        c8072d.f21847j = (C8094n) c7993j1.m19062S0(interfaceC8040o0, new C8094n.C8095a());
                    }
                } else {
                    c8072d.f21848k = c7993j1.m19066O0(interfaceC8040o0, new DebugImage.C8059a());
                }
            }
            c7993j1.m18091q();
            c8072d.m18761e(hashMap);
            return c8072d;
        }
    }

    /* renamed from: c */
    public List<DebugImage> m18763c() {
        return this.f21848k;
    }

    /* renamed from: d */
    public void m18762d(List<DebugImage> list) {
        this.f21848k = list != null ? new ArrayList(list) : null;
    }

    /* renamed from: e */
    public void m18761e(Map<String, Object> map) {
        this.f21849l = map;
    }

    @Override // io.sentry.InterfaceC8026n1
    public void serialize(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0) {
        interfaceC7919f2.mo18195c();
        if (this.f21847j != null) {
            interfaceC7919f2.mo18193e("sdk_info").mo18188j(interfaceC8040o0, this.f21847j);
        }
        if (this.f21848k != null) {
            interfaceC7919f2.mo18193e("images").mo18188j(interfaceC8040o0, this.f21848k);
        }
        Map<String, Object> map = this.f21849l;
        if (map != null) {
            for (String str : map.keySet()) {
                interfaceC7919f2.mo18193e(str).mo18188j(interfaceC8040o0, this.f21849l.get(str));
            }
        }
        interfaceC7919f2.mo18190h();
    }
}
