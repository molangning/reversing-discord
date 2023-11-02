package p029b9;

import android.os.Parcel;
import android.os.Parcelable;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: b9.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C2204r extends AbstractC2461a {
    public static final Parcelable.Creator<C2204r> CREATOR = new C2220x0();

    /* renamed from: j */
    private final int f6202j;

    /* renamed from: k */
    private final boolean f6203k;

    /* renamed from: l */
    private final boolean f6204l;

    /* renamed from: m */
    private final int f6205m;

    /* renamed from: n */
    private final int f6206n;

    public C2204r(int i, boolean z, boolean z2, int i2, int i3) {
        this.f6202j = i;
        this.f6203k = z;
        this.f6204l = z2;
        this.f6205m = i2;
        this.f6206n = i3;
    }

    /* renamed from: A */
    public boolean m33971A() {
        return this.f6203k;
    }

    /* renamed from: G */
    public boolean m33970G() {
        return this.f6204l;
    }

    /* renamed from: H */
    public int m33969H() {
        return this.f6202j;
    }

    /* renamed from: r */
    public int m33968r() {
        return this.f6205m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, m33969H());
        C2464c.m33181c(parcel, 2, m33971A());
        C2464c.m33181c(parcel, 3, m33970G());
        C2464c.m33174j(parcel, 4, m33968r());
        C2464c.m33174j(parcel, 5, m33967z());
        C2464c.m33182b(parcel, m33183a);
    }

    /* renamed from: z */
    public int m33967z() {
        return this.f6206n;
    }
}