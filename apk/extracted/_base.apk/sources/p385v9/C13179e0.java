package p385v9;

import android.bluetooth.BluetoothDevice;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p029b9.C2190n;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: v9.e0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C13179e0 extends AbstractC2461a {
    public static final Parcelable.Creator<C13179e0> CREATOR = new C13182f0();

    /* renamed from: j */
    private String f34191j;

    /* renamed from: k */
    private String f34192k;

    /* renamed from: l */
    private String f34193l;

    /* renamed from: m */
    private BluetoothDevice f34194m;

    /* renamed from: n */
    private byte[] f34195n;

    private C13179e0() {
    }

    /* renamed from: A */
    public final String m3057A() {
        return this.f34193l;
    }

    /* renamed from: G */
    public final String m3056G() {
        return this.f34192k;
    }

    /* renamed from: H */
    public final byte[] m3055H() {
        return this.f34195n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13179e0) {
            C13179e0 c13179e0 = (C13179e0) obj;
            if (C2190n.m34004b(this.f34191j, c13179e0.f34191j) && C2190n.m34004b(this.f34192k, c13179e0.f34192k) && C2190n.m34004b(this.f34193l, c13179e0.f34193l) && C2190n.m34004b(this.f34194m, c13179e0.f34194m) && Arrays.equals(this.f34195n, c13179e0.f34195n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C2190n.m34003c(this.f34191j, this.f34192k, this.f34193l, this.f34194m, Integer.valueOf(Arrays.hashCode(this.f34195n)));
    }

    /* renamed from: r */
    public final BluetoothDevice m3054r() {
        return this.f34194m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33168p(parcel, 1, this.f34191j, false);
        C2464c.m33168p(parcel, 2, this.f34192k, false);
        C2464c.m33168p(parcel, 3, this.f34193l, false);
        C2464c.m33170n(parcel, 4, this.f34194m, i, false);
        C2464c.m33178f(parcel, 5, this.f34195n, false);
        C2464c.m33182b(parcel, m33183a);
    }

    /* renamed from: z */
    public final String m3053z() {
        return this.f34191j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13179e0(String str, String str2, String str3, BluetoothDevice bluetoothDevice, byte[] bArr) {
        this.f34191j = str;
        this.f34192k = str2;
        this.f34193l = str3;
        this.f34194m = bluetoothDevice;
        this.f34195n = bArr;
    }
}
