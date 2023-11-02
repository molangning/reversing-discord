package p164j$.time;

import p164j$.time.temporal.AbstractC8342j;
import p164j$.time.temporal.C8348p;
import p164j$.time.temporal.C8349q;
import p164j$.time.temporal.EnumC8333a;
import p164j$.time.temporal.InterfaceC8343k;
import p164j$.time.temporal.InterfaceC8344l;
import p164j$.time.temporal.InterfaceC8346n;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.ZoneOffset */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class ZoneOffset extends AbstractC8329o implements InterfaceC8343k, Comparable<ZoneOffset> {

    /* renamed from: a */
    private final int f22288a;

    /* renamed from: b */
    private final transient String f22289b;

    /* renamed from: c */
    private static final ConcurrentHashMap f22284c = new ConcurrentHashMap(16, 0.75f, 4);

    /* renamed from: d */
    private static final ConcurrentHashMap f22285d = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = m17906h(0);

    /* renamed from: e */
    public static final ZoneOffset f22286e = m17906h(-64800);

    /* renamed from: f */
    public static final ZoneOffset f22287f = m17906h(64800);

    private ZoneOffset(int i) {
        String sb2;
        this.f22288a = i;
        if (i == 0) {
            sb2 = "Z";
        } else {
            int abs = Math.abs(i);
            StringBuilder sb3 = new StringBuilder();
            int i2 = abs / 3600;
            int i3 = (abs / 60) % 60;
            sb3.append(i < 0 ? "-" : "+");
            sb3.append(i2 < 10 ? "0" : "");
            sb3.append(i2);
            sb3.append(i3 < 10 ? ":0" : ":");
            sb3.append(i3);
            int i4 = abs % 60;
            if (i4 != 0) {
                sb3.append(i4 >= 10 ? ":" : ":0");
                sb3.append(i4);
            }
            sb2 = sb3.toString();
        }
        this.f22289b = sb2;
    }

    /* renamed from: h */
    public static ZoneOffset m17906h(int i) {
        if (i < -64800 || i > 64800) {
            throw new C8295d("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i % 900 == 0) {
            Integer valueOf = Integer.valueOf(i);
            ConcurrentHashMap concurrentHashMap = f22284c;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(valueOf);
            if (zoneOffset == null) {
                concurrentHashMap.putIfAbsent(valueOf, new ZoneOffset(i));
                ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(valueOf);
                f22285d.putIfAbsent(zoneOffset2.f22289b, zoneOffset2);
                return zoneOffset2;
            }
            return zoneOffset;
        }
        return new ZoneOffset(i);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: a */
    public final C8349q mo17805a(InterfaceC8344l interfaceC8344l) {
        return AbstractC8342j.m17813c(this, interfaceC8344l);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: b */
    public final boolean mo17804b(InterfaceC8344l interfaceC8344l) {
        return interfaceC8344l instanceof EnumC8333a ? interfaceC8344l == EnumC8333a.OFFSET_SECONDS : interfaceC8344l != null && interfaceC8344l.mo17800a(this);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: c */
    public final long mo17803c(InterfaceC8344l interfaceC8344l) {
        if (interfaceC8344l == EnumC8333a.OFFSET_SECONDS) {
            return this.f22288a;
        }
        if (interfaceC8344l instanceof EnumC8333a) {
            throw new C8348p("Unsupported field: " + interfaceC8344l);
        }
        return interfaceC8344l.mo17797d(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.f22288a - this.f22288a;
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: d */
    public final Object mo17802d(InterfaceC8346n interfaceC8346n) {
        return (interfaceC8346n == AbstractC8342j.m17809g() || interfaceC8346n == AbstractC8342j.m17807i()) ? this : AbstractC8342j.m17814b(this, interfaceC8346n);
    }

    @Override // p164j$.time.temporal.InterfaceC8343k
    /* renamed from: e */
    public final int mo17801e(EnumC8333a enumC8333a) {
        if (enumC8333a == EnumC8333a.OFFSET_SECONDS) {
            return this.f22288a;
        }
        if (enumC8333a instanceof EnumC8333a) {
            throw new C8348p("Unsupported field: " + enumC8333a);
        }
        return AbstractC8342j.m17813c(this, enumC8333a).m17795a(mo17803c(enumC8333a), enumC8333a);
    }

    @Override // p164j$.time.AbstractC8329o
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneOffset) {
            return this.f22288a == ((ZoneOffset) obj).f22288a;
        }
        return false;
    }

    @Override // p164j$.time.AbstractC8329o
    /* renamed from: f */
    public final String mo17831f() {
        return this.f22289b;
    }

    /* renamed from: g */
    public final int m17907g() {
        return this.f22288a;
    }

    @Override // p164j$.time.AbstractC8329o
    public final int hashCode() {
        return this.f22288a;
    }

    @Override // p164j$.time.AbstractC8329o
    public final String toString() {
        return this.f22289b;
    }
}