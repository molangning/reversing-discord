package net.time4j.p249tz;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import net.time4j.base.InterfaceC10614a;
import net.time4j.base.InterfaceC10620f;
import net.time4j.base.InterfaceC10621g;

/* renamed from: net.time4j.tz.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C10807j extends AbstractC10809l implements InterfaceC10815m {

    /* renamed from: E */
    private static final C10807j f28223E = new C10807j(C10835p.f28295t);
    private static final long serialVersionUID = 7807230388259573234L;
    private final C10835p offset;

    private C10807j(C10835p c10835p) {
        if (c10835p.m10027i() == 0) {
            this.offset = c10835p;
            return;
        }
        int m10026k = c10835p.m10026k();
        this.offset = C10835p.m10020q(c10835p.m10027i() < 0 ? m10026k - 1 : m10026k);
    }

    /* renamed from: R */
    public static C10807j m10163R(C10835p c10835p) {
        if (c10835p.m10026k() == 0 && c10835p.m10027i() == 0) {
            return f28223E;
        }
        return new C10807j(c10835p);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (this.offset.m10027i() == 0) {
            return;
        }
        throw new InvalidObjectException("Fractional offset is invalid.");
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: A */
    public C10835p mo10162A(InterfaceC10614a interfaceC10614a, InterfaceC10621g interfaceC10621g) {
        return this.offset;
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: B */
    public C10835p mo10161B(InterfaceC10620f interfaceC10620f) {
        return this.offset;
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: E */
    public InterfaceC10834o mo10158E() {
        return AbstractC10809l.f28231m;
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: I */
    public boolean mo10154I(InterfaceC10620f interfaceC10620f) {
        return false;
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: J */
    public boolean mo10153J() {
        return true;
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: K */
    public boolean mo10152K(InterfaceC10614a interfaceC10614a, InterfaceC10621g interfaceC10621g) {
        return false;
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: Q */
    public AbstractC10809l mo10146Q(InterfaceC10834o interfaceC10834o) {
        return this;
    }

    @Override // net.time4j.p249tz.InterfaceC10815m
    /* renamed from: a */
    public C10836q mo10063a(InterfaceC10614a interfaceC10614a, InterfaceC10621g interfaceC10621g) {
        return null;
    }

    @Override // net.time4j.p249tz.InterfaceC10815m
    /* renamed from: b */
    public C10836q mo10062b(InterfaceC10620f interfaceC10620f) {
        return null;
    }

    @Override // net.time4j.p249tz.InterfaceC10815m
    /* renamed from: c */
    public boolean mo10061c() {
        return false;
    }

    @Override // net.time4j.p249tz.InterfaceC10815m
    /* renamed from: d */
    public C10835p mo10060d() {
        return this.offset;
    }

    @Override // net.time4j.p249tz.InterfaceC10815m
    /* renamed from: e */
    public List<C10835p> mo10059e(InterfaceC10614a interfaceC10614a, InterfaceC10621g interfaceC10621g) {
        return Collections.singletonList(this.offset);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10807j) {
            return this.offset.equals(((C10807j) obj).offset);
        }
        return false;
    }

    public int hashCode() {
        return this.offset.hashCode();
    }

    @Override // net.time4j.p249tz.InterfaceC10815m
    public boolean isEmpty() {
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append('[');
        sb2.append(C10807j.class.getName());
        sb2.append(':');
        sb2.append(this.offset);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: w */
    public String mo10128w(EnumC10801d enumC10801d, Locale locale) {
        if (enumC10801d.m10171a()) {
            return this.offset.toString();
        }
        return this.offset.mo10035a();
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: y */
    public InterfaceC10815m mo10126y() {
        return this;
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: z */
    public InterfaceC10808k mo10125z() {
        return this.offset;
    }
}