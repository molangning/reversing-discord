package p164j$.time;

import com.reactnativecommunity.webview.RNCWebViewManager;
import java.io.Serializable;
import p164j$.time.format.DateTimeFormatter;
import p164j$.time.temporal.AbstractC8342j;
import p164j$.time.temporal.C8348p;
import p164j$.time.temporal.C8349q;
import p164j$.time.temporal.EnumC8333a;
import p164j$.time.temporal.EnumC8334b;
import p164j$.time.temporal.InterfaceC8343k;
import p164j$.time.temporal.InterfaceC8344l;
import p164j$.time.temporal.InterfaceC8346n;

/* renamed from: j$.time.Instant */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class Instant implements InterfaceC8343k, Comparable<Instant>, Serializable {

    /* renamed from: c */
    public static final Instant f22275c = new Instant(0, 0);

    /* renamed from: a */
    private final long f22276a;

    /* renamed from: b */
    private final int f22277b;

    static {
        m17918i(-31557014167219200L, 0L);
        m17918i(31556889864403199L, 999999999L);
    }

    private Instant(long j, int i) {
        this.f22276a = j;
        this.f22277b = i;
    }

    /* renamed from: g */
    private static Instant m17920g(long j, int i) {
        if ((i | j) == 0) {
            return f22275c;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new C8295d("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    /* renamed from: h */
    public static Instant m17919h(long j) {
        return m17920g(AbstractC8284a.m17900f(j, 1000L), ((int) AbstractC8284a.m17901e(j, 1000L)) * 1000000);
    }

    /* renamed from: i */
    public static Instant m17918i(long j, long j2) {
        return m17920g(AbstractC8284a.m17902d(j, AbstractC8284a.m17900f(j2, 1000000000L)), (int) AbstractC8284a.m17901e(j2, 1000000000L));
    }

    public static Instant now() {
        new C8285b(ZoneOffset.UTC);
        return m17919h(System.currentTimeMillis());
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: a */
    public final C8349q mo17805a(InterfaceC8344l interfaceC8344l) {
        return AbstractC8342j.m17813c(this, interfaceC8344l);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.m17908g(this, zoneOffset);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: b */
    public final boolean mo17804b(InterfaceC8344l interfaceC8344l) {
        return interfaceC8344l instanceof EnumC8333a ? interfaceC8344l == EnumC8333a.INSTANT_SECONDS || interfaceC8344l == EnumC8333a.NANO_OF_SECOND || interfaceC8344l == EnumC8333a.MICRO_OF_SECOND || interfaceC8344l == EnumC8333a.MILLI_OF_SECOND : interfaceC8344l != null && interfaceC8344l.mo17800a(this);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: c */
    public final long mo17803c(InterfaceC8344l interfaceC8344l) {
        int i;
        if (interfaceC8344l instanceof EnumC8333a) {
            int i2 = AbstractC8321g.f22351a[((EnumC8333a) interfaceC8344l).ordinal()];
            int i3 = this.f22277b;
            if (i2 != 1) {
                if (i2 == 2) {
                    i = i3 / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        return this.f22276a;
                    }
                    throw new C8348p("Unsupported field: " + interfaceC8344l);
                } else {
                    i = i3 / 1000000;
                }
                return i;
            }
            return i3;
        }
        return interfaceC8344l.mo17797d(this);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: d */
    public final Object mo17802d(InterfaceC8346n interfaceC8346n) {
        if (interfaceC8346n == AbstractC8342j.m17808h()) {
            return EnumC8334b.NANOS;
        }
        if (interfaceC8346n == AbstractC8342j.m17812d() || interfaceC8346n == AbstractC8342j.m17806j() || interfaceC8346n == AbstractC8342j.m17807i() || interfaceC8346n == AbstractC8342j.m17809g() || interfaceC8346n == AbstractC8342j.m17811e() || interfaceC8346n == AbstractC8342j.m17810f()) {
            return null;
        }
        return interfaceC8346n.mo17796a(this);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: e */
    public final int mo17801e(EnumC8333a enumC8333a) {
        if (enumC8333a instanceof EnumC8333a) {
            int i = AbstractC8321g.f22351a[enumC8333a.ordinal()];
            int i2 = this.f22277b;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            EnumC8333a.INSTANT_SECONDS.m17824e(this.f22276a);
                        }
                        throw new C8348p("Unsupported field: " + enumC8333a);
                    }
                    return i2 / 1000000;
                }
                return i2 / RNCWebViewManager.COMMAND_CLEAR_FORM_DATA;
            }
            return i2;
        }
        return AbstractC8342j.m17813c(this, enumC8333a).m17795a(mo17803c(enumC8333a), enumC8333a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            return this.f22276a == instant.f22276a && this.f22277b == instant.f22277b;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: f */
    public final int compareTo(Instant instant) {
        int compare = Long.compare(this.f22276a, instant.f22276a);
        return compare != 0 ? compare : this.f22277b - instant.f22277b;
    }

    public long getEpochSecond() {
        return this.f22276a;
    }

    public int getNano() {
        return this.f22277b;
    }

    public final int hashCode() {
        long j = this.f22276a;
        return (this.f22277b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return DateTimeFormatter.f22298f.m17893a(this);
    }
}
