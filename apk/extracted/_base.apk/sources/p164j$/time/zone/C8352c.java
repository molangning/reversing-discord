package p164j$.time.zone;

import java.io.Serializable;
import java.util.Arrays;
import p164j$.time.AbstractC8284a;
import p164j$.time.C8323i;
import p164j$.time.Instant;
import p164j$.time.ZoneOffset;
import p164j$.util.AbstractC8516n;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.zone.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes2.dex */
public final class C8352c implements Serializable {

    /* renamed from: g */
    private static final long[] f22401g = new long[0];

    /* renamed from: h */
    private static final AbstractC8351b[] f22402h = new AbstractC8351b[0];

    /* renamed from: a */
    private final long[] f22403a;

    /* renamed from: b */
    private final ZoneOffset[] f22404b;

    /* renamed from: c */
    private final long[] f22405c;

    /* renamed from: d */
    private final ZoneOffset[] f22406d;

    /* renamed from: e */
    private final AbstractC8351b[] f22407e;

    /* renamed from: f */
    private final transient ConcurrentHashMap f22408f = new ConcurrentHashMap();

    private C8352c(ZoneOffset zoneOffset) {
        this.f22404b = r0;
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        long[] jArr = f22401g;
        this.f22403a = jArr;
        this.f22405c = jArr;
        this.f22406d = zoneOffsetArr;
        this.f22407e = f22402h;
    }

    /* renamed from: c */
    public static C8352c m17780c(ZoneOffset zoneOffset) {
        if (zoneOffset != null) {
            return new C8352c(zoneOffset);
        }
        throw new NullPointerException("offset");
    }

    /* renamed from: a */
    public final ZoneOffset m17782a(Instant instant) {
        long[] jArr = this.f22405c;
        if (jArr.length == 0) {
            return this.f22404b[0];
        }
        long epochSecond = instant.getEpochSecond();
        AbstractC8351b[] abstractC8351bArr = this.f22407e;
        int length = abstractC8351bArr.length;
        ZoneOffset[] zoneOffsetArr = this.f22406d;
        if (length <= 0 || epochSecond <= jArr[jArr.length - 1]) {
            int binarySearch = Arrays.binarySearch(jArr, epochSecond);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 2;
            }
            return zoneOffsetArr[binarySearch + 1];
        }
        int m17848l = C8323i.m17845o(AbstractC8284a.m17900f(zoneOffsetArr[zoneOffsetArr.length - 1].m17907g() + epochSecond, 86400L)).m17848l();
        Integer valueOf = Integer.valueOf(m17848l);
        ConcurrentHashMap concurrentHashMap = this.f22408f;
        AbstractC8350a[] abstractC8350aArr = (AbstractC8350a[]) concurrentHashMap.get(valueOf);
        AbstractC8350a abstractC8350a = null;
        if (abstractC8350aArr == null) {
            abstractC8350aArr = new AbstractC8350a[abstractC8351bArr.length];
            if (abstractC8351bArr.length > 0) {
                AbstractC8351b abstractC8351b = abstractC8351bArr[0];
                throw null;
            } else if (m17848l < 2100) {
                concurrentHashMap.putIfAbsent(valueOf, abstractC8350aArr);
            }
        }
        for (int i = 0; i < abstractC8350aArr.length; i++) {
            abstractC8350a = abstractC8350aArr[i];
            if (epochSecond < abstractC8350a.m17783c()) {
                return abstractC8350a.m17784b();
            }
        }
        return abstractC8350a.m17785a();
    }

    /* renamed from: b */
    public final boolean m17781b() {
        return this.f22405c.length == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C8352c) {
            C8352c c8352c = (C8352c) obj;
            c8352c.getClass();
            return AbstractC8516n.m17601o(null, null) && Arrays.equals(this.f22403a, c8352c.f22403a) && Arrays.equals(this.f22404b, c8352c.f22404b) && Arrays.equals(this.f22405c, c8352c.f22405c) && Arrays.equals(this.f22406d, c8352c.f22406d) && Arrays.equals(this.f22407e, c8352c.f22407e);
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f22403a) ^ 0) ^ Arrays.hashCode(this.f22404b)) ^ Arrays.hashCode(this.f22405c)) ^ Arrays.hashCode(this.f22406d)) ^ Arrays.hashCode(this.f22407e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ZoneRules[currentStandardOffset=");
        ZoneOffset[] zoneOffsetArr = this.f22404b;
        sb2.append(zoneOffsetArr[zoneOffsetArr.length - 1]);
        sb2.append("]");
        return sb2.toString();
    }
}
