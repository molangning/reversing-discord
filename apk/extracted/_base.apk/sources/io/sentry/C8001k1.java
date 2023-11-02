package io.sentry;

import io.sentry.util.C8224k;
import java.net.InetAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: io.sentry.k1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8001k1 {

    /* renamed from: a */
    public final C8018m1 f21683a;

    public C8001k1(int i) {
        this.f21683a = new C8018m1(i);
    }

    /* renamed from: b */
    private void m19037b(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0, Collection<?> collection) {
        interfaceC7919f2.mo18192f();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            m19038a(interfaceC7919f2, interfaceC8040o0, it.next());
        }
        interfaceC7919f2.mo18194d();
    }

    /* renamed from: c */
    private void m19036c(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0, Date date) {
        try {
            interfaceC7919f2.mo18191g(C7991j.m19084g(date));
        } catch (Exception e) {
            interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "Error when serializing Date", e);
            interfaceC7919f2.mo18186l();
        }
    }

    /* renamed from: d */
    private void m19035d(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0, Map<?, ?> map) {
        interfaceC7919f2.mo18195c();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                interfaceC7919f2.mo18193e((String) obj);
                m19038a(interfaceC7919f2, interfaceC8040o0, map.get(obj));
            }
        }
        interfaceC7919f2.mo18190h();
    }

    /* renamed from: e */
    private void m19034e(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0, TimeZone timeZone) {
        try {
            interfaceC7919f2.mo18191g(timeZone.getID());
        } catch (Exception e) {
            interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "Error when serializing TimeZone", e);
            interfaceC7919f2.mo18186l();
        }
    }

    /* renamed from: a */
    public void m19038a(InterfaceC7919f2 interfaceC7919f2, InterfaceC8040o0 interfaceC8040o0, Object obj) {
        if (obj == null) {
            interfaceC7919f2.mo18186l();
        } else if (obj instanceof Character) {
            interfaceC7919f2.mo18191g(Character.toString(((Character) obj).charValue()));
        } else if (obj instanceof String) {
            interfaceC7919f2.mo18191g((String) obj);
        } else if (obj instanceof Boolean) {
            interfaceC7919f2.mo18196b(((Boolean) obj).booleanValue());
        } else if (obj instanceof Number) {
            interfaceC7919f2.mo18189i((Number) obj);
        } else if (obj instanceof Date) {
            m19036c(interfaceC7919f2, interfaceC8040o0, (Date) obj);
        } else if (obj instanceof TimeZone) {
            m19034e(interfaceC7919f2, interfaceC8040o0, (TimeZone) obj);
        } else if (obj instanceof InterfaceC8026n1) {
            ((InterfaceC8026n1) obj).serialize(interfaceC7919f2, interfaceC8040o0);
        } else if (obj instanceof Collection) {
            m19037b(interfaceC7919f2, interfaceC8040o0, (Collection) obj);
        } else if (obj.getClass().isArray()) {
            m19037b(interfaceC7919f2, interfaceC8040o0, Arrays.asList((Object[]) obj));
        } else if (obj instanceof Map) {
            m19035d(interfaceC7919f2, interfaceC8040o0, (Map) obj);
        } else if (obj instanceof Locale) {
            interfaceC7919f2.mo18191g(obj.toString());
        } else if (obj instanceof AtomicIntegerArray) {
            m19037b(interfaceC7919f2, interfaceC8040o0, C8224k.m18207a((AtomicIntegerArray) obj));
        } else if (obj instanceof AtomicBoolean) {
            interfaceC7919f2.mo18196b(((AtomicBoolean) obj).get());
        } else if (obj instanceof URI) {
            interfaceC7919f2.mo18191g(obj.toString());
        } else if (obj instanceof InetAddress) {
            interfaceC7919f2.mo18191g(obj.toString());
        } else if (obj instanceof UUID) {
            interfaceC7919f2.mo18191g(obj.toString());
        } else if (obj instanceof Currency) {
            interfaceC7919f2.mo18191g(obj.toString());
        } else if (obj instanceof Calendar) {
            m19035d(interfaceC7919f2, interfaceC8040o0, C8224k.m18205c((Calendar) obj));
        } else if (obj.getClass().isEnum()) {
            interfaceC7919f2.mo18191g(obj.toString());
        } else {
            try {
                m19038a(interfaceC7919f2, interfaceC8040o0, this.f21683a.m18990d(obj, interfaceC8040o0));
            } catch (Exception e) {
                interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "Failed serializing unknown object.", e);
                interfaceC7919f2.mo18191g("[OBJECT]");
            }
        }
    }
}
