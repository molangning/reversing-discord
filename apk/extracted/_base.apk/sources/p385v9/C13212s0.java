package p385v9;

import android.os.Parcel;
import android.os.ParcelUuid;
import android.os.Parcelable;
import java.util.Arrays;
import p029b9.C2190n;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: v9.s0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13212s0 extends AbstractC2461a {
    public static final Parcelable.Creator<C13212s0> CREATOR = new C13214t0();

    /* renamed from: j */
    private final int f34251j;

    /* renamed from: k */
    private final ParcelUuid f34252k;

    /* renamed from: l */
    private final ParcelUuid f34253l;

    /* renamed from: m */
    private final ParcelUuid f34254m;

    /* renamed from: n */
    private final byte[] f34255n;

    /* renamed from: o */
    private final byte[] f34256o;

    /* renamed from: p */
    private final int f34257p;

    /* renamed from: q */
    private final byte[] f34258q;

    /* renamed from: r */
    private final byte[] f34259r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13212s0(int i, ParcelUuid parcelUuid, ParcelUuid parcelUuid2, ParcelUuid parcelUuid3, byte[] bArr, byte[] bArr2, int i2, byte[] bArr3, byte[] bArr4) {
        this.f34251j = i;
        this.f34252k = parcelUuid;
        this.f34253l = parcelUuid2;
        this.f34254m = parcelUuid3;
        this.f34255n = bArr;
        this.f34256o = bArr2;
        this.f34257p = i2;
        this.f34258q = bArr3;
        this.f34259r = bArr4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C13212s0.class == obj.getClass()) {
            C13212s0 c13212s0 = (C13212s0) obj;
            if (this.f34257p == c13212s0.f34257p && Arrays.equals(this.f34258q, c13212s0.f34258q) && Arrays.equals(this.f34259r, c13212s0.f34259r) && C2190n.m34004b(this.f34254m, c13212s0.f34254m) && Arrays.equals(this.f34255n, c13212s0.f34255n) && Arrays.equals(this.f34256o, c13212s0.f34256o) && C2190n.m34004b(this.f34252k, c13212s0.f34252k) && C2190n.m34004b(this.f34253l, c13212s0.f34253l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C2190n.m34003c(Integer.valueOf(this.f34257p), Integer.valueOf(Arrays.hashCode(this.f34258q)), Integer.valueOf(Arrays.hashCode(this.f34259r)), this.f34254m, Integer.valueOf(Arrays.hashCode(this.f34255n)), Integer.valueOf(Arrays.hashCode(this.f34256o)), this.f34252k, this.f34253l);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, this.f34251j);
        C2464c.m33170n(parcel, 4, this.f34252k, i, false);
        C2464c.m33170n(parcel, 5, this.f34253l, i, false);
        C2464c.m33170n(parcel, 6, this.f34254m, i, false);
        C2464c.m33178f(parcel, 7, this.f34255n, false);
        C2464c.m33178f(parcel, 8, this.f34256o, false);
        C2464c.m33174j(parcel, 9, this.f34257p);
        C2464c.m33178f(parcel, 10, this.f34258q, false);
        C2464c.m33178f(parcel, 11, this.f34259r, false);
        C2464c.m33182b(parcel, m33183a);
    }
}
