package p063da;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.messages.BleSignal;
import p029b9.C2190n;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: da.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5788a extends AbstractC2461a implements BleSignal {
    public static final Parcelable.Creator<C5788a> CREATOR = new C5796i();

    /* renamed from: j */
    final int f16616j;

    /* renamed from: k */
    final int f16617k;

    /* renamed from: l */
    final int f16618l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5788a(int i, int i2, int i3) {
        this.f16616j = i;
        this.f16617k = i2;
        this.f16618l = (i3 <= -169 || i3 >= 87) ? Integer.MIN_VALUE : i3;
    }

    @Override // com.google.android.gms.nearby.messages.BleSignal
    /* renamed from: a */
    public final int mo24507a() {
        return this.f16618l;
    }

    @Override // com.google.android.gms.nearby.messages.BleSignal
    /* renamed from: d */
    public final int mo24506d() {
        return this.f16617k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BleSignal)) {
            return false;
        }
        BleSignal bleSignal = (BleSignal) obj;
        if (this.f16617k == bleSignal.mo24506d() && this.f16618l == bleSignal.mo24507a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C2190n.m34003c(Integer.valueOf(this.f16617k), Integer.valueOf(this.f16618l));
    }

    public final String toString() {
        int i = this.f16617k;
        int i2 = this.f16618l;
        return "BleSignal{rssi=" + i + ", txPower=" + i2 + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, this.f16616j);
        C2464c.m33174j(parcel, 2, this.f16617k);
        C2464c.m33174j(parcel, 3, this.f16618l);
        C2464c.m33182b(parcel, m33183a);
    }
}
