package p152i7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p195k8.C9191p0;

/* renamed from: i7.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7422f extends AbstractC7428i {
    public static final Parcelable.Creator<C7422f> CREATOR = new C7423a();

    /* renamed from: k */
    public final String f19952k;

    /* renamed from: l */
    public final String f19953l;

    /* renamed from: m */
    public final String f19954m;

    /* renamed from: n */
    public final byte[] f19955n;

    /* renamed from: i7.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C7423a implements Parcelable.Creator<C7422f> {
        C7423a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C7422f createFromParcel(Parcel parcel) {
            return new C7422f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C7422f[] newArray(int i) {
            return new C7422f[i];
        }
    }

    public C7422f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f19952k = str;
        this.f19953l = str2;
        this.f19954m = str3;
        this.f19955n = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7422f.class != obj.getClass()) {
            return false;
        }
        C7422f c7422f = (C7422f) obj;
        if (C9191p0.m16257c(this.f19952k, c7422f.f19952k) && C9191p0.m16257c(this.f19953l, c7422f.f19953l) && C9191p0.m16257c(this.f19954m, c7422f.f19954m) && Arrays.equals(this.f19955n, c7422f.f19955n)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.f19952k;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (527 + i) * 31;
        String str2 = this.f19953l;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f19954m;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return ((i5 + i3) * 31) + Arrays.hashCode(this.f19955n);
    }

    @Override // p152i7.AbstractC7428i
    public String toString() {
        return this.f19961j + ": mimeType=" + this.f19952k + ", filename=" + this.f19953l + ", description=" + this.f19954m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19952k);
        parcel.writeString(this.f19953l);
        parcel.writeString(this.f19954m);
        parcel.writeByteArray(this.f19955n);
    }

    C7422f(Parcel parcel) {
        super("GEOB");
        this.f19952k = (String) C9191p0.m16243j(parcel.readString());
        this.f19953l = (String) C9191p0.m16243j(parcel.readString());
        this.f19954m = (String) C9191p0.m16243j(parcel.readString());
        this.f19955n = (byte[]) C9191p0.m16243j(parcel.createByteArray());
    }
}
