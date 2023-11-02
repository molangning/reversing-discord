package io.sentry.util;

import io.sentry.C7991j;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC7919f2;
import io.sentry.InterfaceC8026n1;
import io.sentry.InterfaceC8040o0;
import java.net.InetAddress;
import java.net.URI;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* renamed from: io.sentry.util.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8228n implements InterfaceC7919f2 {

    /* renamed from: a */
    final Map<String, Object> f22148a;

    /* renamed from: b */
    final ArrayDeque<Object> f22149b;

    public C8228n(Map<String, Object> map) {
        this.f22148a = map;
        ArrayDeque<Object> arrayDeque = new ArrayDeque<>();
        this.f22149b = arrayDeque;
        arrayDeque.addLast(map);
    }

    /* renamed from: s */
    private Map<String, Object> m18179s() {
        Object peekLast = this.f22149b.peekLast();
        if (peekLast != null) {
            if (peekLast instanceof Map) {
                return (Map) peekLast;
            }
            throw new IllegalStateException("Stack element is not a Map.");
        }
        throw new IllegalStateException("Stack is empty.");
    }

    /* renamed from: t */
    private void m18178t(Object obj) {
        Object peekLast = this.f22149b.peekLast();
        if (peekLast instanceof List) {
            ((List) peekLast).add(obj);
        } else if (peekLast instanceof String) {
            m18179s().put((String) this.f22149b.removeLast(), obj);
        } else {
            throw new IllegalStateException("Invalid stack state, expected array or string on top");
        }
    }

    /* renamed from: u */
    private void m18177u(InterfaceC8040o0 interfaceC8040o0, Collection<?> collection) {
        mo18192f();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            mo18188j(interfaceC8040o0, it.next());
        }
        mo18194d();
    }

    /* renamed from: v */
    private void m18176v(InterfaceC8040o0 interfaceC8040o0, Date date) {
        try {
            mo18191g(C7991j.m19084g(date));
        } catch (Exception e) {
            interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "Error when serializing Date", e);
            mo18186l();
        }
    }

    /* renamed from: w */
    private void m18175w(InterfaceC8040o0 interfaceC8040o0, Map<?, ?> map) {
        mo18195c();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                mo18193e((String) obj);
                mo18188j(interfaceC8040o0, map.get(obj));
            }
        }
        mo18190h();
    }

    /* renamed from: x */
    private void m18174x(InterfaceC8040o0 interfaceC8040o0, TimeZone timeZone) {
        try {
            mo18191g(timeZone.getID());
        } catch (Exception e) {
            interfaceC8040o0.mo18136b(EnumC8021m4.ERROR, "Error when serializing TimeZone", e);
            mo18186l();
        }
    }

    @Override // io.sentry.InterfaceC7919f2
    /* renamed from: A */
    public C8228n mo18187k(Boolean bool) {
        m18178t(bool);
        return this;
    }

    @Override // io.sentry.InterfaceC7919f2
    /* renamed from: B */
    public C8228n mo18189i(Number number) {
        m18178t(number);
        return this;
    }

    @Override // io.sentry.InterfaceC7919f2
    /* renamed from: C */
    public C8228n mo18191g(String str) {
        m18178t(str);
        return this;
    }

    @Override // io.sentry.InterfaceC7919f2
    /* renamed from: D */
    public C8228n mo18196b(boolean z) {
        m18178t(Boolean.valueOf(z));
        return this;
    }

    @Override // io.sentry.InterfaceC7919f2
    /* renamed from: m */
    public C8228n mo18192f() {
        this.f22149b.add(new ArrayList());
        return this;
    }

    @Override // io.sentry.InterfaceC7919f2
    /* renamed from: n */
    public C8228n mo18195c() {
        this.f22149b.addLast(new HashMap());
        return this;
    }

    @Override // io.sentry.InterfaceC7919f2
    /* renamed from: o */
    public C8228n mo18194d() {
        mo18190h();
        return this;
    }

    @Override // io.sentry.InterfaceC7919f2
    /* renamed from: p */
    public C8228n mo18190h() {
        m18178t(this.f22149b.removeLast());
        return this;
    }

    @Override // io.sentry.InterfaceC7919f2
    /* renamed from: q */
    public C8228n mo18193e(String str) {
        this.f22149b.add(str);
        return this;
    }

    @Override // io.sentry.InterfaceC7919f2
    /* renamed from: r */
    public C8228n mo18186l() {
        m18178t(null);
        return this;
    }

    @Override // io.sentry.InterfaceC7919f2
    /* renamed from: y */
    public C8228n mo18197a(long j) {
        m18178t(Long.valueOf(j));
        return this;
    }

    @Override // io.sentry.InterfaceC7919f2
    /* renamed from: z */
    public C8228n mo18188j(InterfaceC8040o0 interfaceC8040o0, Object obj) {
        if (obj == null) {
            mo18186l();
        } else if (obj instanceof Character) {
            mo18191g(Character.toString(((Character) obj).charValue()));
        } else if (obj instanceof String) {
            mo18191g((String) obj);
        } else if (obj instanceof Boolean) {
            mo18196b(((Boolean) obj).booleanValue());
        } else if (obj instanceof Number) {
            mo18189i((Number) obj);
        } else if (obj instanceof Date) {
            m18176v(interfaceC8040o0, (Date) obj);
        } else if (obj instanceof TimeZone) {
            m18174x(interfaceC8040o0, (TimeZone) obj);
        } else if (obj instanceof InterfaceC8026n1) {
            ((InterfaceC8026n1) obj).serialize(this, interfaceC8040o0);
        } else if (obj instanceof Collection) {
            m18177u(interfaceC8040o0, (Collection) obj);
        } else if (obj.getClass().isArray()) {
            m18177u(interfaceC8040o0, Arrays.asList((Object[]) obj));
        } else if (obj instanceof Map) {
            m18175w(interfaceC8040o0, (Map) obj);
        } else if (obj instanceof Locale) {
            mo18191g(obj.toString());
        } else if (obj instanceof AtomicIntegerArray) {
            m18177u(interfaceC8040o0, C8224k.m18207a((AtomicIntegerArray) obj));
        } else if (obj instanceof AtomicBoolean) {
            mo18196b(((AtomicBoolean) obj).get());
        } else if (obj instanceof URI) {
            mo18191g(obj.toString());
        } else if (obj instanceof InetAddress) {
            mo18191g(obj.toString());
        } else if (obj instanceof UUID) {
            mo18191g(obj.toString());
        } else if (obj instanceof Currency) {
            mo18191g(obj.toString());
        } else if (obj instanceof Calendar) {
            m18175w(interfaceC8040o0, C8224k.m18205c((Calendar) obj));
        } else if (obj.getClass().isEnum()) {
            mo18191g(obj.toString());
        } else {
            interfaceC8040o0.mo18135c(EnumC8021m4.WARNING, "Failed serializing unknown object.", obj);
        }
        return this;
    }
}
