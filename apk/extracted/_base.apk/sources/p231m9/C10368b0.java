package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import p029b9.C2190n;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: m9.b0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10368b0 extends AbstractC2461a {
    public static final Parcelable.Creator<C10368b0> CREATOR = new C10392j0();

    /* renamed from: j */
    private int f27114j;

    /* renamed from: k */
    private short f27115k;

    /* renamed from: l */
    private short f27116l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10368b0(int i, short s, short s2) {
        this.f27114j = i;
        this.f27115k = s;
        this.f27116l = s2;
    }

    /* renamed from: A */
    public int m11655A() {
        return this.f27114j;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10368b0)) {
            return false;
        }
        C10368b0 c10368b0 = (C10368b0) obj;
        if (this.f27114j != c10368b0.f27114j || this.f27115k != c10368b0.f27115k || this.f27116l != c10368b0.f27116l) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C2190n.m34003c(Integer.valueOf(this.f27114j), Short.valueOf(this.f27115k), Short.valueOf(this.f27116l));
    }

    /* renamed from: r */
    public short m11654r() {
        return this.f27115k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33174j(parcel, 1, m11655A());
        C2464c.m33169o(parcel, 2, m11654r());
        C2464c.m33169o(parcel, 3, m11653z());
        C2464c.m33182b(parcel, m33183a);
    }

    /* renamed from: z */
    public short m11653z() {
        return this.f27116l;
    }
}
