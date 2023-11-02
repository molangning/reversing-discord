package net.time4j.p249tz;

import com.reactnativecommunity.webview.RNCWebViewManager;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import net.time4j.base.C10615b;
import net.time4j.base.C10616c;
import net.time4j.base.InterfaceC10614a;
import net.time4j.base.InterfaceC10620f;
import net.time4j.base.InterfaceC10621g;
import p164j$.util.DesugarTimeZone;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.tz.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C10805h extends AbstractC10809l {
    private static final long serialVersionUID = -8432968264242113551L;

    /* renamed from: E */
    private final transient C10835p f28218E;

    /* renamed from: id */
    private final InterfaceC10808k f28219id;
    private final boolean strict;

    /* renamed from: tz */
    private final TimeZone f28220tz;

    C10805h() {
        this.f28219id = null;
        this.f28220tz = null;
        this.strict = false;
        this.f28218E = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: R */
    public static TimeZone m10169R(String str) {
        if (str.equals("Z")) {
            return DesugarTimeZone.getTimeZone("GMT+00:00");
        }
        if (str.startsWith("UTC")) {
            return DesugarTimeZone.getTimeZone("GMT" + str.substring(3));
        } else if (str.startsWith("UT")) {
            return DesugarTimeZone.getTimeZone("GMT" + str.substring(2));
        } else {
            return DesugarTimeZone.getTimeZone(str);
        }
    }

    /* renamed from: S */
    private static C10835p m10168S(int i) {
        return C10835p.m10020q(C10616c.m11041a(i, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA));
    }

    private Object readResolve() {
        InterfaceC10808k interfaceC10808k = this.f28219id;
        if (interfaceC10808k == null) {
            return new C10805h();
        }
        return new C10805h(interfaceC10808k, this.f28220tz, this.strict);
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: A */
    public C10835p mo10162A(InterfaceC10614a interfaceC10614a, InterfaceC10621g interfaceC10621g) {
        int i;
        int i2;
        int i3;
        int i4;
        TimeZone timeZone;
        C10835p c10835p = this.f28218E;
        if (c10835p != null) {
            return c10835p;
        }
        int mo10482o = interfaceC10614a.mo10482o();
        int mo10481p = interfaceC10614a.mo10481p();
        int mo10480r = interfaceC10614a.mo10480r();
        if (interfaceC10621g.mo10479s() == 24) {
            long m11043l = C10615b.m11043l(C10616c.m11036f(C10615b.m11044k(interfaceC10614a), 1L));
            int m11046i = C10615b.m11046i(m11043l);
            int m11047h = C10615b.m11047h(m11043l);
            i = C10615b.m11048g(m11043l);
            mo10481p = m11047h;
            mo10482o = m11046i;
        } else {
            i = mo10480r;
        }
        int i5 = 0;
        if (mo10482o > 0) {
            i3 = mo10482o;
            i2 = 1;
        } else {
            i2 = 0;
            i3 = 1 - mo10482o;
        }
        int m11052c = C10615b.m11052c(mo10482o, mo10481p, i) + 1;
        if (m11052c == 8) {
            i4 = 1;
        } else {
            i4 = m11052c;
        }
        if (interfaceC10621g.mo10479s() != 24) {
            i5 = (((interfaceC10621g.mo10479s() * 3600) + (interfaceC10621g.mo10483m() * 60) + interfaceC10621g.mo10487h()) * RNCWebViewManager.COMMAND_CLEAR_FORM_DATA) + (interfaceC10621g.mo10495a() / 1000000);
        }
        int i6 = i5;
        if (this.f28219id == null) {
            timeZone = TimeZone.getDefault();
        } else {
            timeZone = this.f28220tz;
        }
        return m10168S(timeZone.getOffset(i2, i3, mo10481p - 1, i, i4, i6));
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: B */
    public C10835p mo10161B(InterfaceC10620f interfaceC10620f) {
        TimeZone timeZone;
        if (this.f28219id == null) {
            timeZone = TimeZone.getDefault();
        } else {
            C10835p c10835p = this.f28218E;
            if (c10835p != null) {
                return c10835p;
            }
            timeZone = this.f28220tz;
        }
        return m10168S(timeZone.getOffset(interfaceC10620f.mo10164k() * 1000));
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: E */
    public InterfaceC10834o mo10158E() {
        return this.strict ? AbstractC10809l.f28232n : AbstractC10809l.f28231m;
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: I */
    public boolean mo10154I(InterfaceC10620f interfaceC10620f) {
        TimeZone timeZone;
        if (this.f28218E != null) {
            return false;
        }
        if (this.f28219id == null) {
            timeZone = TimeZone.getDefault();
        } else {
            timeZone = this.f28220tz;
        }
        return timeZone.inDaylightTime(new Date(interfaceC10620f.mo10164k() * 1000));
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: J */
    public boolean mo10153J() {
        return this.f28218E != null;
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: K */
    public boolean mo10152K(InterfaceC10614a interfaceC10614a, InterfaceC10621g interfaceC10621g) {
        TimeZone timeZone;
        if (this.f28218E != null) {
            return false;
        }
        int mo10482o = interfaceC10614a.mo10482o();
        int mo10481p = interfaceC10614a.mo10481p();
        int mo10480r = interfaceC10614a.mo10480r();
        int mo10479s = interfaceC10621g.mo10479s();
        int mo10483m = interfaceC10621g.mo10483m();
        int mo10487h = interfaceC10621g.mo10487h();
        int mo10495a = interfaceC10621g.mo10495a() / 1000000;
        if (this.f28219id == null) {
            timeZone = TimeZone.getDefault();
        } else {
            timeZone = this.f28220tz;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        gregorianCalendar.set(14, mo10495a);
        gregorianCalendar.set(mo10482o, mo10481p - 1, mo10480r, mo10479s, mo10483m, mo10487h);
        if (gregorianCalendar.get(1) != mo10482o || gregorianCalendar.get(2) + 1 != mo10481p || gregorianCalendar.get(5) != mo10480r || gregorianCalendar.get(11) != mo10479s || gregorianCalendar.get(12) != mo10483m || gregorianCalendar.get(13) != mo10487h || gregorianCalendar.get(14) != mo10495a) {
            return true;
        }
        return false;
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: Q */
    public AbstractC10809l mo10146Q(InterfaceC10834o interfaceC10834o) {
        if (this.f28219id != null && mo10158E() != interfaceC10834o) {
            if (interfaceC10834o == AbstractC10809l.f28231m) {
                return new C10805h(this.f28219id, this.f28220tz, false);
            }
            if (interfaceC10834o == AbstractC10809l.f28232n) {
                return new C10805h(this.f28219id, this.f28220tz, true);
            }
            throw new UnsupportedOperationException(interfaceC10834o.toString());
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: T */
    public boolean m10167T() {
        TimeZone timeZone;
        if (this.f28219id == null) {
            timeZone = TimeZone.getDefault();
        } else {
            timeZone = this.f28220tz;
        }
        return timeZone.getID().equals("GMT");
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10805h) {
            C10805h c10805h = (C10805h) obj;
            if (this.f28219id == null) {
                if (c10805h.f28219id != null) {
                    return false;
                }
                return true;
            } else if (this.f28220tz.equals(c10805h.f28220tz) && this.strict == c10805h.strict) {
                C10835p c10835p = this.f28218E;
                if (c10835p == null) {
                    if (c10805h.f28218E != null) {
                        return false;
                    }
                    return true;
                }
                return c10835p.equals(c10805h.f28218E);
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f28219id == null) {
            return 0;
        }
        return this.f28220tz.hashCode();
    }

    public String toString() {
        TimeZone timeZone;
        if (this.f28219id == null) {
            timeZone = TimeZone.getDefault();
        } else {
            timeZone = this.f28220tz;
        }
        StringBuilder sb2 = new StringBuilder(256);
        sb2.append('[');
        sb2.append(C10805h.class.getName());
        sb2.append(':');
        sb2.append(timeZone);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: w */
    public String mo10128w(EnumC10801d enumC10801d, Locale locale) {
        TimeZone timeZone;
        if (this.f28219id == null) {
            timeZone = TimeZone.getDefault();
        } else {
            timeZone = this.f28220tz;
        }
        return timeZone.getDisplayName(enumC10801d.m10170b(), !enumC10801d.m10171a(), locale);
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: y */
    public InterfaceC10815m mo10126y() {
        C10835p c10835p = this.f28218E;
        if (c10835p == null) {
            return null;
        }
        return c10835p.m10025l();
    }

    @Override // net.time4j.p249tz.AbstractC10809l
    /* renamed from: z */
    public InterfaceC10808k mo10125z() {
        InterfaceC10808k interfaceC10808k = this.f28219id;
        if (interfaceC10808k == null) {
            return new C10802e(TimeZone.getDefault().getID());
        }
        return interfaceC10808k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10805h(InterfaceC10808k interfaceC10808k) {
        this(interfaceC10808k, TimeZone.getDefault(), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10805h(InterfaceC10808k interfaceC10808k, String str) {
        this(interfaceC10808k, m10169R(str), false);
    }

    private C10805h(InterfaceC10808k interfaceC10808k, TimeZone timeZone, boolean z) {
        this.f28219id = interfaceC10808k;
        TimeZone timeZone2 = (TimeZone) timeZone.clone();
        this.f28220tz = timeZone2;
        this.strict = z;
        if (timeZone2.useDaylightTime()) {
            this.f28218E = null;
            return;
        }
        String id2 = timeZone2.getID();
        if (id2.startsWith("GMT") || id2.startsWith("Etc/") || id2.equals("Greenwich") || id2.equals("UCT") || id2.equals("UTC") || id2.equals("Universal") || id2.equals("Zulu")) {
            this.f28218E = m10168S(timeZone2.getOffset(System.currentTimeMillis()));
        } else {
            this.f28218E = null;
        }
    }
}
