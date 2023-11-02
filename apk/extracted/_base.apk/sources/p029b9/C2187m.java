package p029b9;

import android.os.Parcel;
import android.os.Parcelable;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: b9.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2187m extends AbstractC2461a {
    public static final Parcelable.Creator<C2187m> CREATOR = new C2175i0();

    /* renamed from: j */
    private final int f6165j;

    /* renamed from: k */
    private final int f6166k;

    /* renamed from: l */
    private final int f6167l;

    /* renamed from: m */
    private final long f6168m;

    /* renamed from: n */
    private final long f6169n;

    /* renamed from: o */
    private final String f6170o;

    /* renamed from: p */
    private final String f6171p;

    /* renamed from: q */
    private final int f6172q;

    /* renamed from: r */
    private final int f6173r;

    public C2187m(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.f6165j = i;
        this.f6166k = i2;
        this.f6167l = i3;
        this.f6168m = j;
        this.f6169n = j2;
        this.f6170o = str;
        this.f6171p = str2;
        this.f6172q = i4;
        this.f6173r = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, this.f6165j);
        C2464c.m33174j(parcel, 2, this.f6166k);
        C2464c.m33174j(parcel, 3, this.f6167l);
        C2464c.m33171m(parcel, 4, this.f6168m);
        C2464c.m33171m(parcel, 5, this.f6169n);
        C2464c.m33168p(parcel, 6, this.f6170o, false);
        C2464c.m33168p(parcel, 7, this.f6171p, false);
        C2464c.m33174j(parcel, 8, this.f6172q);
        C2464c.m33174j(parcel, 9, this.f6173r);
        C2464c.m33182b(parcel, m33183a);
    }
}
