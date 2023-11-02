package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p029b9.C2190n;
import p029b9.C2198p;
import p042c9.C2464c;
import p366u9.AbstractC12900d0;
import p366u9.C12905g;
import p366u9.C12909i;

/* renamed from: m9.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10380f extends AbstractC10388i {
    public static final Parcelable.Creator<C10380f> CREATOR = new C10402n0();

    /* renamed from: j */
    private final byte[] f27126j;

    /* renamed from: k */
    private final byte[] f27127k;

    /* renamed from: l */
    private final byte[] f27128l;

    /* renamed from: m */
    private final byte[] f27129m;

    /* renamed from: n */
    private final byte[] f27130n;

    public C10380f(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f27126j = (byte[]) C2198p.m33985j(bArr);
        this.f27127k = (byte[]) C2198p.m33985j(bArr2);
        this.f27128l = (byte[]) C2198p.m33985j(bArr3);
        this.f27129m = (byte[]) C2198p.m33985j(bArr4);
        this.f27130n = bArr5;
    }

    /* renamed from: A */
    public byte[] m11646A() {
        return this.f27126j;
    }

    /* renamed from: G */
    public byte[] m11645G() {
        return this.f27129m;
    }

    /* renamed from: H */
    public byte[] m11644H() {
        return this.f27130n;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10380f)) {
            return false;
        }
        C10380f c10380f = (C10380f) obj;
        if (!Arrays.equals(this.f27126j, c10380f.f27126j) || !Arrays.equals(this.f27127k, c10380f.f27127k) || !Arrays.equals(this.f27128l, c10380f.f27128l) || !Arrays.equals(this.f27129m, c10380f.f27129m) || !Arrays.equals(this.f27130n, c10380f.f27130n)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C2190n.m34003c(Integer.valueOf(Arrays.hashCode(this.f27126j)), Integer.valueOf(Arrays.hashCode(this.f27127k)), Integer.valueOf(Arrays.hashCode(this.f27128l)), Integer.valueOf(Arrays.hashCode(this.f27129m)), Integer.valueOf(Arrays.hashCode(this.f27130n)));
    }

    @Override // p231m9.AbstractC10388i
    /* renamed from: r */
    public byte[] mo11635r() {
        return this.f27127k;
    }

    public String toString() {
        C12909i m3684b = C12905g.m3691a(this).m3684b("keyHandle", AbstractC12900d0.m3692d().m3694b(this.f27126j)).m3684b("clientDataJSON", AbstractC12900d0.m3692d().m3694b(this.f27127k)).m3684b("authenticatorData", AbstractC12900d0.m3692d().m3694b(this.f27128l)).m3684b("signature", AbstractC12900d0.m3692d().m3694b(this.f27129m));
        if (this.f27130n != null) {
            m3684b.m3684b("userHandle", AbstractC12900d0.m3692d().m3694b(this.f27130n));
        }
        return m3684b.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int m33183a = C2464c.m33183a(parcel);
        C2464c.m33178f(parcel, 2, m11646A(), false);
        C2464c.m33178f(parcel, 3, mo11635r(), false);
        C2464c.m33178f(parcel, 4, m11643z(), false);
        C2464c.m33178f(parcel, 5, m11645G(), false);
        C2464c.m33178f(parcel, 6, m11644H(), false);
        C2464c.m33182b(parcel, m33183a);
    }

    /* renamed from: z */
    public byte[] m11643z() {
        return this.f27128l;
    }
}