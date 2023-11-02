package p385v9;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.Arrays;
import p029b9.C2190n;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: v9.p0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13206p0 extends AbstractC2461a {
    public static final Parcelable.Creator<C13206p0> CREATOR = new C13208q0();

    /* renamed from: j */
    private long f34229j;

    /* renamed from: k */
    private int f34230k;

    /* renamed from: l */
    private byte[] f34231l;

    /* renamed from: m */
    private ParcelFileDescriptor f34232m;

    /* renamed from: n */
    private String f34233n;

    /* renamed from: o */
    private long f34234o;

    /* renamed from: p */
    private ParcelFileDescriptor f34235p;

    /* renamed from: q */
    private Uri f34236q;

    /* renamed from: r */
    private long f34237r;

    /* renamed from: s */
    private boolean f34238s;

    /* renamed from: t */
    private C13200m0 f34239t;

    /* renamed from: u */
    private long f34240u;

    /* renamed from: v */
    private String f34241v;

    /* renamed from: w */
    private String f34242w;

    private C13206p0() {
        this.f34234o = -1L;
        this.f34237r = 0L;
        this.f34238s = false;
        this.f34240u = 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13206p0) {
            C13206p0 c13206p0 = (C13206p0) obj;
            if (C2190n.m34004b(Long.valueOf(this.f34229j), Long.valueOf(c13206p0.f34229j)) && C2190n.m34004b(Integer.valueOf(this.f34230k), Integer.valueOf(c13206p0.f34230k)) && Arrays.equals(this.f34231l, c13206p0.f34231l) && C2190n.m34004b(this.f34232m, c13206p0.f34232m) && C2190n.m34004b(this.f34233n, c13206p0.f34233n) && C2190n.m34004b(Long.valueOf(this.f34234o), Long.valueOf(c13206p0.f34234o)) && C2190n.m34004b(this.f34235p, c13206p0.f34235p) && C2190n.m34004b(this.f34236q, c13206p0.f34236q) && C2190n.m34004b(Long.valueOf(this.f34237r), Long.valueOf(c13206p0.f34237r)) && C2190n.m34004b(Boolean.valueOf(this.f34238s), Boolean.valueOf(c13206p0.f34238s)) && C2190n.m34004b(this.f34239t, c13206p0.f34239t) && C2190n.m34004b(Long.valueOf(this.f34240u), Long.valueOf(c13206p0.f34240u)) && C2190n.m34004b(this.f34241v, c13206p0.f34241v) && C2190n.m34004b(this.f34242w, c13206p0.f34242w)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C2190n.m34003c(Long.valueOf(this.f34229j), Integer.valueOf(this.f34230k), Integer.valueOf(Arrays.hashCode(this.f34231l)), this.f34232m, this.f34233n, Long.valueOf(this.f34234o), this.f34235p, this.f34236q, Long.valueOf(this.f34237r), Boolean.valueOf(this.f34238s), this.f34239t, Long.valueOf(this.f34240u), this.f34241v, this.f34242w);
    }

    /* renamed from: r */
    public final ParcelFileDescriptor m3030r() {
        return this.f34232m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33171m(parcel, 1, this.f34229j);
        C2464c.m33174j(parcel, 2, this.f34230k);
        C2464c.m33178f(parcel, 3, this.f34231l, false);
        C2464c.m33170n(parcel, 4, this.f34232m, i, false);
        C2464c.m33168p(parcel, 5, this.f34233n, false);
        C2464c.m33171m(parcel, 6, this.f34234o);
        C2464c.m33170n(parcel, 7, this.f34235p, i, false);
        C2464c.m33170n(parcel, 8, this.f34236q, i, false);
        C2464c.m33171m(parcel, 9, this.f34237r);
        C2464c.m33181c(parcel, 10, this.f34238s);
        C2464c.m33170n(parcel, 11, this.f34239t, i, false);
        C2464c.m33171m(parcel, 12, this.f34240u);
        C2464c.m33168p(parcel, 13, this.f34241v, false);
        C2464c.m33168p(parcel, 14, this.f34242w, false);
        C2464c.m33182b(parcel, m33183a);
    }

    /* renamed from: z */
    public final ParcelFileDescriptor m3029z() {
        return this.f34235p;
    }

    public C13206p0(long j, int i, byte[] bArr, ParcelFileDescriptor parcelFileDescriptor, String str, long j2, ParcelFileDescriptor parcelFileDescriptor2, Uri uri, long j3, boolean z, C13200m0 c13200m0, long j4, String str2, String str3) {
        this.f34229j = j;
        this.f34230k = i;
        this.f34231l = bArr;
        this.f34232m = parcelFileDescriptor;
        this.f34233n = str;
        this.f34234o = j2;
        this.f34235p = parcelFileDescriptor2;
        this.f34236q = uri;
        this.f34237r = j3;
        this.f34238s = z;
        this.f34239t = c13200m0;
        this.f34240u = j4;
        this.f34241v = str2;
        this.f34242w = str3;
    }
}