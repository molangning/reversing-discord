package io.sentry;

import io.sentry.vendor.gson.stream.C8254a;
import io.sentry.vendor.gson.stream.EnumC8255b;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import p164j$.util.DesugarTimeZone;

/* renamed from: io.sentry.j1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7993j1 extends C8254a {
    public C7993j1(Reader reader) {
        super(reader);
    }

    /* renamed from: H0 */
    public static Date m19073H0(String str, InterfaceC8040o0 interfaceC8040o0) {
        if (str == null) {
            return null;
        }
        try {
            return C7991j.m19086e(str);
        } catch (Exception e) {
            interfaceC8040o0.mo18136b(EnumC8021m4.DEBUG, "Error when deserializing UTC timestamp format, it might be millis timestamp format.", e);
            try {
                return C7991j.m19085f(str);
            } catch (Exception e2) {
                interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "Error when deserializing millis timestamp format.", e2);
                return null;
            }
        }
    }

    /* renamed from: I0 */
    public Boolean m19072I0() {
        if (m18098e0() == EnumC8255b.NULL) {
            m18103U();
            return null;
        }
        return Boolean.valueOf(m18113D());
    }

    /* renamed from: J0 */
    public Date m19071J0(InterfaceC8040o0 interfaceC8040o0) {
        if (m18098e0() == EnumC8255b.NULL) {
            m18103U();
            return null;
        }
        return m19073H0(m18101Y(), interfaceC8040o0);
    }

    /* renamed from: K0 */
    public Double m19070K0() {
        if (m18098e0() == EnumC8255b.NULL) {
            m18103U();
            return null;
        }
        return Double.valueOf(m18108H());
    }

    /* renamed from: L0 */
    public Float m19069L0() {
        return Float.valueOf((float) m18108H());
    }

    /* renamed from: M0 */
    public Float m19068M0() {
        if (m18098e0() == EnumC8255b.NULL) {
            m18103U();
            return null;
        }
        return m19069L0();
    }

    /* renamed from: N0 */
    public Integer m19067N0() {
        if (m18098e0() == EnumC8255b.NULL) {
            m18103U();
            return null;
        }
        return Integer.valueOf(m18107I());
    }

    /* renamed from: O0 */
    public <T> List<T> m19066O0(InterfaceC8040o0 interfaceC8040o0, InterfaceC7894d1<T> interfaceC7894d1) {
        if (m18098e0() == EnumC8255b.NULL) {
            m18103U();
            return null;
        }
        m18100a();
        ArrayList arrayList = new ArrayList();
        do {
            try {
                arrayList.add(interfaceC7894d1.mo18130a(this, interfaceC8040o0));
            } catch (Exception e) {
                interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "Failed to deserialize object in list.", e);
            }
        } while (m18098e0() == EnumC8255b.BEGIN_OBJECT);
        m18092o();
        return arrayList;
    }

    /* renamed from: P0 */
    public Long m19065P0() {
        if (m18098e0() == EnumC8255b.NULL) {
            m18103U();
            return null;
        }
        return Long.valueOf(m18106Q());
    }

    /* renamed from: Q0 */
    public <T> Map<String, T> m19064Q0(InterfaceC8040o0 interfaceC8040o0, InterfaceC7894d1<T> interfaceC7894d1) {
        if (m18098e0() == EnumC8255b.NULL) {
            m18103U();
            return null;
        }
        m18097h();
        HashMap hashMap = new HashMap();
        while (true) {
            try {
                hashMap.put(m18105R(), interfaceC7894d1.mo18130a(this, interfaceC8040o0));
            } catch (Exception e) {
                interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "Failed to deserialize object in map.", e);
            }
            if (m18098e0() != EnumC8255b.BEGIN_OBJECT && m18098e0() != EnumC8255b.NAME) {
                m18091q();
                return hashMap;
            }
        }
    }

    /* renamed from: R0 */
    public Object m19063R0() {
        return new C7962i1().m19144e(this);
    }

    /* renamed from: S0 */
    public <T> T m19062S0(InterfaceC8040o0 interfaceC8040o0, InterfaceC7894d1<T> interfaceC7894d1) {
        if (m18098e0() == EnumC8255b.NULL) {
            m18103U();
            return null;
        }
        return interfaceC7894d1.mo18130a(this, interfaceC8040o0);
    }

    /* renamed from: T0 */
    public String m19061T0() {
        if (m18098e0() == EnumC8255b.NULL) {
            m18103U();
            return null;
        }
        return m18101Y();
    }

    /* renamed from: U0 */
    public TimeZone m19060U0(InterfaceC8040o0 interfaceC8040o0) {
        if (m18098e0() == EnumC8255b.NULL) {
            m18103U();
            return null;
        }
        try {
            return DesugarTimeZone.getTimeZone(m18101Y());
        } catch (Exception e) {
            interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "Error when deserializing TimeZone", e);
            return null;
        }
    }

    /* renamed from: V0 */
    public void m19059V0(InterfaceC8040o0 interfaceC8040o0, Map<String, Object> map, String str) {
        try {
            map.put(str, m19063R0());
        } catch (Exception e) {
            interfaceC8040o0.mo18137a(EnumC8021m4.ERROR, e, "Error deserializing unknown key: %s", str);
        }
    }
}
