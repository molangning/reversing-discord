package p213l8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p195k8.C9191p0;

/* renamed from: l8.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10064b implements Parcelable {
    public static final Parcelable.Creator<C10064b> CREATOR = new C10065a();

    /* renamed from: j */
    public final int f26165j;

    /* renamed from: k */
    public final int f26166k;

    /* renamed from: l */
    public final int f26167l;

    /* renamed from: m */
    public final byte[] f26168m;

    /* renamed from: n */
    private int f26169n;

    /* renamed from: l8.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C10065a implements Parcelable.Creator<C10064b> {
        C10065a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C10064b createFromParcel(Parcel parcel) {
            return new C10064b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C10064b[] newArray(int i) {
            return new C10064b[i];
        }
    }

    public C10064b(int i, int i2, int i3, byte[] bArr) {
        this.f26165j = i;
        this.f26166k = i2;
        this.f26167l = i3;
        this.f26168m = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10064b.class != obj.getClass()) {
            return false;
        }
        C10064b c10064b = (C10064b) obj;
        if (this.f26165j == c10064b.f26165j && this.f26166k == c10064b.f26166k && this.f26167l == c10064b.f26167l && Arrays.equals(this.f26168m, c10064b.f26168m)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f26169n == 0) {
            this.f26169n = ((((((527 + this.f26165j) * 31) + this.f26166k) * 31) + this.f26167l) * 31) + Arrays.hashCode(this.f26168m);
        }
        return this.f26169n;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(this.f26165j);
        sb2.append(", ");
        sb2.append(this.f26166k);
        sb2.append(", ");
        sb2.append(this.f26167l);
        sb2.append(", ");
        sb2.append(this.f26168m != null);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        boolean z;
        parcel.writeInt(this.f26165j);
        parcel.writeInt(this.f26166k);
        parcel.writeInt(this.f26167l);
        if (this.f26168m != null) {
            z = true;
        } else {
            z = false;
        }
        C9191p0.m16262Z0(parcel, z);
        byte[] bArr = this.f26168m;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    C10064b(Parcel parcel) {
        this.f26165j = parcel.readInt();
        this.f26166k = parcel.readInt();
        this.f26167l = parcel.readInt();
        this.f26168m = C9191p0.m16300G0(parcel) ? parcel.createByteArray() : null;
    }
}