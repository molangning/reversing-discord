package p364u7;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p195k8.C9149a;
import p195k8.C9187n0;
import p195k8.C9191p0;
import p212l7.C10059c;
import p212l7.InterfaceC10057a;
import p418x6.C13721p;

/* renamed from: u7.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12878a implements InterfaceC10057a<C12878a> {

    /* renamed from: a */
    public final int f33520a;

    /* renamed from: b */
    public final int f33521b;

    /* renamed from: c */
    public final int f33522c;

    /* renamed from: d */
    public final boolean f33523d;

    /* renamed from: e */
    public final C12879a f33524e;

    /* renamed from: f */
    public final C12880b[] f33525f;

    /* renamed from: g */
    public final long f33526g;

    /* renamed from: h */
    public final long f33527h;

    /* renamed from: u7.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C12879a {

        /* renamed from: a */
        public final UUID f33528a;

        /* renamed from: b */
        public final byte[] f33529b;

        /* renamed from: c */
        public final C13721p[] f33530c;

        public C12879a(UUID uuid, byte[] bArr, C13721p[] c13721pArr) {
            this.f33528a = uuid;
            this.f33529b = bArr;
            this.f33530c = c13721pArr;
        }
    }

    public C12878a(int i, int i2, long j, long j2, long j3, int i3, boolean z, C12879a c12879a, C12880b[] c12880bArr) {
        this(i, i2, j2 == 0 ? -9223372036854775807L : C9191p0.m16296I0(j2, 1000000L, j), j3 != 0 ? C9191p0.m16296I0(j3, 1000000L, j) : -9223372036854775807L, i3, z, c12879a, c12880bArr);
    }

    @Override // p212l7.InterfaceC10057a
    /* renamed from: b */
    public final C12878a mo3731a(List<C10059c> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        C12880b c12880b = null;
        int i = 0;
        while (i < arrayList.size()) {
            C10059c c10059c = (C10059c) arrayList.get(i);
            C12880b c12880b2 = this.f33525f[c10059c.f26155k];
            if (c12880b2 != c12880b && c12880b != null) {
                arrayList2.add(c12880b.m3728b((Format[]) arrayList3.toArray(new Format[0])));
                arrayList3.clear();
            }
            arrayList3.add(c12880b2.f33540j[c10059c.f26156l]);
            i++;
            c12880b = c12880b2;
        }
        if (c12880b != null) {
            arrayList2.add(c12880b.m3728b((Format[]) arrayList3.toArray(new Format[0])));
        }
        return new C12878a(this.f33520a, this.f33521b, this.f33526g, this.f33527h, this.f33522c, this.f33523d, this.f33524e, (C12880b[]) arrayList2.toArray(new C12880b[0]));
    }

    /* renamed from: u7.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C12880b {

        /* renamed from: a */
        public final int f33531a;

        /* renamed from: b */
        public final String f33532b;

        /* renamed from: c */
        public final long f33533c;

        /* renamed from: d */
        public final String f33534d;

        /* renamed from: e */
        public final int f33535e;

        /* renamed from: f */
        public final int f33536f;

        /* renamed from: g */
        public final int f33537g;

        /* renamed from: h */
        public final int f33538h;

        /* renamed from: i */
        public final String f33539i;

        /* renamed from: j */
        public final Format[] f33540j;

        /* renamed from: k */
        public final int f33541k;

        /* renamed from: l */
        private final String f33542l;

        /* renamed from: m */
        private final String f33543m;

        /* renamed from: n */
        private final List<Long> f33544n;

        /* renamed from: o */
        private final long[] f33545o;

        /* renamed from: p */
        private final long f33546p;

        public C12880b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, Format[] formatArr, List<Long> list, long j2) {
            this(str, str2, i, str3, j, str4, i2, i3, i4, i5, str5, formatArr, list, C9191p0.m16294J0(list, 1000000L, j), C9191p0.m16296I0(j2, 1000000L, j));
        }

        /* renamed from: a */
        public Uri m3729a(int i, int i2) {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (this.f33540j != null) {
                z = true;
            } else {
                z = false;
            }
            C9149a.m16447f(z);
            if (this.f33544n != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C9149a.m16447f(z2);
            if (i2 >= this.f33544n.size()) {
                z3 = false;
            }
            C9149a.m16447f(z3);
            String num = Integer.toString(this.f33540j[i].f11193q);
            String l = this.f33544n.get(i2).toString();
            return C9187n0.m16314d(this.f33542l, this.f33543m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l).replace("{start_time}", l));
        }

        /* renamed from: b */
        public C12880b m3728b(Format[] formatArr) {
            return new C12880b(this.f33542l, this.f33543m, this.f33531a, this.f33532b, this.f33533c, this.f33534d, this.f33535e, this.f33536f, this.f33537g, this.f33538h, this.f33539i, formatArr, this.f33544n, this.f33545o, this.f33546p);
        }

        /* renamed from: c */
        public long m3727c(int i) {
            if (i == this.f33541k - 1) {
                return this.f33546p;
            }
            long[] jArr = this.f33545o;
            return jArr[i + 1] - jArr[i];
        }

        /* renamed from: d */
        public int m3726d(long j) {
            return C9191p0.m16245i(this.f33545o, j, true, true);
        }

        /* renamed from: e */
        public long m3725e(int i) {
            return this.f33545o[i];
        }

        private C12880b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, Format[] formatArr, List<Long> list, long[] jArr, long j2) {
            this.f33542l = str;
            this.f33543m = str2;
            this.f33531a = i;
            this.f33532b = str3;
            this.f33533c = j;
            this.f33534d = str4;
            this.f33535e = i2;
            this.f33536f = i3;
            this.f33537g = i4;
            this.f33538h = i5;
            this.f33539i = str5;
            this.f33540j = formatArr;
            this.f33544n = list;
            this.f33545o = jArr;
            this.f33546p = j2;
            this.f33541k = list.size();
        }
    }

    private C12878a(int i, int i2, long j, long j2, int i3, boolean z, C12879a c12879a, C12880b[] c12880bArr) {
        this.f33520a = i;
        this.f33521b = i2;
        this.f33526g = j;
        this.f33527h = j2;
        this.f33522c = i3;
        this.f33523d = z;
        this.f33524e = c12879a;
        this.f33525f = c12880bArr;
    }
}
