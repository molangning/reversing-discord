package p244n7;

import android.net.Uri;
import java.util.Arrays;
import p195k8.C9149a;
import p195k8.C9191p0;

/* renamed from: n7.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10508a {

    /* renamed from: g */
    public static final C10508a f27481g = new C10508a(null, new long[0], null, 0, -9223372036854775807L);

    /* renamed from: a */
    public final Object f27482a;

    /* renamed from: b */
    public final int f27483b;

    /* renamed from: c */
    public final long[] f27484c;

    /* renamed from: d */
    public final C10509a[] f27485d;

    /* renamed from: e */
    public final long f27486e;

    /* renamed from: f */
    public final long f27487f;

    /* renamed from: n7.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C10509a {

        /* renamed from: a */
        public final int f27488a;

        /* renamed from: b */
        public final Uri[] f27489b;

        /* renamed from: c */
        public final int[] f27490c;

        /* renamed from: d */
        public final long[] f27491d;

        public C10509a() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        /* renamed from: a */
        public int m11334a() {
            return m11333b(-1);
        }

        /* renamed from: b */
        public int m11333b(int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.f27490c;
                if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        /* renamed from: c */
        public boolean m11332c() {
            return this.f27488a == -1 || m11334a() < this.f27488a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C10509a.class != obj.getClass()) {
                return false;
            }
            C10509a c10509a = (C10509a) obj;
            if (this.f27488a == c10509a.f27488a && Arrays.equals(this.f27489b, c10509a.f27489b) && Arrays.equals(this.f27490c, c10509a.f27490c) && Arrays.equals(this.f27491d, c10509a.f27491d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f27488a * 31) + Arrays.hashCode(this.f27489b)) * 31) + Arrays.hashCode(this.f27490c)) * 31) + Arrays.hashCode(this.f27491d);
        }

        private C10509a(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
            C9149a.m16452a(iArr.length == uriArr.length);
            this.f27488a = i;
            this.f27490c = iArr;
            this.f27489b = uriArr;
            this.f27491d = jArr;
        }
    }

    private C10508a(Object obj, long[] jArr, C10509a[] c10509aArr, long j, long j2) {
        this.f27482a = obj;
        this.f27484c = jArr;
        this.f27486e = j;
        this.f27487f = j2;
        int length = jArr.length;
        this.f27483b = length;
        if (c10509aArr == null) {
            c10509aArr = new C10509a[length];
            for (int i = 0; i < this.f27483b; i++) {
                c10509aArr[i] = new C10509a();
            }
        }
        this.f27485d = c10509aArr;
    }

    /* renamed from: c */
    private boolean m11335c(long j, long j2, int i) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        long j3 = this.f27484c[i];
        return j3 == Long.MIN_VALUE ? j2 == -9223372036854775807L || j < j2 : j < j3;
    }

    /* renamed from: a */
    public int m11337a(long j, long j2) {
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        int i = 0;
        while (true) {
            long[] jArr = this.f27484c;
            if (i >= jArr.length) {
                break;
            }
            long j3 = jArr[i];
            if (j3 == Long.MIN_VALUE || (j < j3 && this.f27485d[i].m11332c())) {
                break;
            }
            i++;
        }
        if (i >= this.f27484c.length) {
            return -1;
        }
        return i;
    }

    /* renamed from: b */
    public int m11336b(long j, long j2) {
        int length = this.f27484c.length - 1;
        while (length >= 0 && m11335c(j, j2, length)) {
            length--;
        }
        if (length < 0 || !this.f27485d[length].m11332c()) {
            return -1;
        }
        return length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10508a.class != obj.getClass()) {
            return false;
        }
        C10508a c10508a = (C10508a) obj;
        if (C9191p0.m16257c(this.f27482a, c10508a.f27482a) && this.f27483b == c10508a.f27483b && this.f27486e == c10508a.f27486e && this.f27487f == c10508a.f27487f && Arrays.equals(this.f27484c, c10508a.f27484c) && Arrays.equals(this.f27485d, c10508a.f27485d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i = this.f27483b * 31;
        Object obj = this.f27482a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return ((((((((i + hashCode) * 31) + ((int) this.f27486e)) * 31) + ((int) this.f27487f)) * 31) + Arrays.hashCode(this.f27484c)) * 31) + Arrays.hashCode(this.f27485d);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f27482a);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f27486e);
        sb2.append(", adGroups=[");
        for (int i = 0; i < this.f27485d.length; i++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f27484c[i]);
            sb2.append(", ads=[");
            for (int i2 = 0; i2 < this.f27485d[i].f27490c.length; i2++) {
                sb2.append("ad(state=");
                int i3 = this.f27485d[i].f27490c[i2];
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    sb2.append('?');
                                } else {
                                    sb2.append('!');
                                }
                            } else {
                                sb2.append('P');
                            }
                        } else {
                            sb2.append('S');
                        }
                    } else {
                        sb2.append('R');
                    }
                } else {
                    sb2.append('_');
                }
                sb2.append(", durationUs=");
                sb2.append(this.f27485d[i].f27491d[i2]);
                sb2.append(')');
                if (i2 < this.f27485d[i].f27490c.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i < this.f27485d.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }
}