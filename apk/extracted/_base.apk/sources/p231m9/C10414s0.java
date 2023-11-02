package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p029b9.C2190n;
import p029b9.C2198p;
import p042c9.AbstractC2461a;
import p042c9.C2464c;

/* renamed from: m9.s0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10414s0 extends AbstractC2461a {
    public static final Parcelable.Creator<C10414s0> CREATOR = new C10419u0();

    /* renamed from: j */
    private final long f27218j;

    /* renamed from: k */
    private final byte[] f27219k;

    /* renamed from: l */
    private final byte[] f27220l;

    /* renamed from: m */
    private final byte[] f27221m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10414s0(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f27218j = j;
        this.f27219k = (byte[]) C2198p.m33985j(bArr);
        this.f27220l = (byte[]) C2198p.m33985j(bArr2);
        this.f27221m = (byte[]) C2198p.m33985j(bArr3);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10414s0)) {
            return false;
        }
        C10414s0 c10414s0 = (C10414s0) obj;
        if (this.f27218j != c10414s0.f27218j || !Arrays.equals(this.f27219k, c10414s0.f27219k) || !Arrays.equals(this.f27220l, c10414s0.f27220l) || !Arrays.equals(this.f27221m, c10414s0.f27221m)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C2190n.m34003c(Long.valueOf(this.f27218j), this.f27219k, this.f27220l, this.f27221m);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33171m(parcel, 1, this.f27218j);
        C2464c.m33178f(parcel, 2, this.f27219k, false);
        C2464c.m33178f(parcel, 3, this.f27220l, false);
        C2464c.m33178f(parcel, 4, this.f27221m, false);
        C2464c.m33182b(parcel, m33183a);
    }
}
