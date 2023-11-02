package p029b9;

import android.os.Parcel;
import android.os.Parcelable;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: b9.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2162e extends AbstractC2461a {
    public static final Parcelable.Creator<C2162e> CREATOR = new C2170g1();

    /* renamed from: j */
    private final C2204r f6108j;

    /* renamed from: k */
    private final boolean f6109k;

    /* renamed from: l */
    private final boolean f6110l;

    /* renamed from: m */
    private final int[] f6111m;

    /* renamed from: n */
    private final int f6112n;

    /* renamed from: o */
    private final int[] f6113o;

    public C2162e(C2204r c2204r, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.f6108j = c2204r;
        this.f6109k = z;
        this.f6110l = z2;
        this.f6111m = iArr;
        this.f6112n = i;
        this.f6113o = iArr2;
    }

    /* renamed from: A */
    public int[] m34057A() {
        return this.f6113o;
    }

    /* renamed from: G */
    public boolean m34056G() {
        return this.f6109k;
    }

    /* renamed from: H */
    public boolean m34055H() {
        return this.f6110l;
    }

    /* renamed from: J */
    public final C2204r m34054J() {
        return this.f6108j;
    }

    /* renamed from: r */
    public int m34053r() {
        return this.f6112n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33170n(parcel, 1, this.f6108j, i, false);
        C2464c.m33181c(parcel, 2, m34056G());
        C2464c.m33181c(parcel, 3, m34055H());
        C2464c.m33173k(parcel, 4, m34052z(), false);
        C2464c.m33174j(parcel, 5, m34053r());
        C2464c.m33173k(parcel, 6, m34057A(), false);
        C2464c.m33182b(parcel, m33183a);
    }

    /* renamed from: z */
    public int[] m34052z() {
        return this.f6111m;
    }
}