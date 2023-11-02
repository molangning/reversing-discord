package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p029b9.C2190n;
import p029b9.C2198p;
import p042c9.C2464c;
import p366u9.AbstractC12900d0;
import p366u9.C12905g;

/* renamed from: m9.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10383g extends AbstractC10388i {
    public static final Parcelable.Creator<C10383g> CREATOR = new C10404o0();

    /* renamed from: j */
    private final byte[] f27131j;

    /* renamed from: k */
    private final byte[] f27132k;

    /* renamed from: l */
    private final byte[] f27133l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10383g(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f27131j = (byte[]) C2198p.m33985j(bArr);
        this.f27132k = (byte[]) C2198p.m33985j(bArr2);
        this.f27133l = (byte[]) C2198p.m33985j(bArr3);
    }

    /* renamed from: A */
    public byte[] m11641A() {
        return this.f27131j;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10383g)) {
            return false;
        }
        C10383g c10383g = (C10383g) obj;
        if (!Arrays.equals(this.f27131j, c10383g.f27131j) || !Arrays.equals(this.f27132k, c10383g.f27132k) || !Arrays.equals(this.f27133l, c10383g.f27133l)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C2190n.m34003c(Integer.valueOf(Arrays.hashCode(this.f27131j)), Integer.valueOf(Arrays.hashCode(this.f27132k)), Integer.valueOf(Arrays.hashCode(this.f27133l)));
    }

    @Override // p231m9.AbstractC10388i
    /* renamed from: r */
    public byte[] mo11635r() {
        return this.f27132k;
    }

    public String toString() {
        return C12905g.m3691a(this).m3684b("keyHandle", AbstractC12900d0.m3692d().m3694b(this.f27131j)).m3684b("clientDataJSON", AbstractC12900d0.m3692d().m3694b(this.f27132k)).m3684b("attestationObject", AbstractC12900d0.m3692d().m3694b(this.f27133l)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33178f(parcel, 2, m11641A(), false);
        C2464c.m33178f(parcel, 3, mo11635r(), false);
        C2464c.m33178f(parcel, 4, m11640z(), false);
        C2464c.m33182b(parcel, m33183a);
    }

    /* renamed from: z */
    public byte[] m11640z() {
        return this.f27133l;
    }
}
