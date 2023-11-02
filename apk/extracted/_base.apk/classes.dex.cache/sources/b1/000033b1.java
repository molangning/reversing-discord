package p117g7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p060d7.C5774a;
import p195k8.C9191p0;

/* renamed from: g7.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6561a implements Metadata.InterfaceC4429b {
    public static final Parcelable.Creator<C6561a> CREATOR = new C6562a();

    /* renamed from: j */
    public final int f18594j;

    /* renamed from: k */
    public final String f18595k;

    /* renamed from: l */
    public final String f18596l;

    /* renamed from: m */
    public final int f18597m;

    /* renamed from: n */
    public final int f18598n;

    /* renamed from: o */
    public final int f18599o;

    /* renamed from: p */
    public final int f18600p;

    /* renamed from: q */
    public final byte[] f18601q;

    /* renamed from: g7.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C6562a implements Parcelable.Creator<C6561a> {
        C6562a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C6561a createFromParcel(Parcel parcel) {
            return new C6561a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C6561a[] newArray(int i) {
            return new C6561a[i];
        }
    }

    public C6561a(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f18594j = i;
        this.f18595k = str;
        this.f18596l = str2;
        this.f18597m = i2;
        this.f18598n = i3;
        this.f18599o = i4;
        this.f18600p = i5;
        this.f18601q = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.InterfaceC4429b
    /* renamed from: R */
    public /* synthetic */ byte[] mo6157R() {
        return C5774a.m24522a(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6561a.class != obj.getClass()) {
            return false;
        }
        C6561a c6561a = (C6561a) obj;
        if (this.f18594j == c6561a.f18594j && this.f18595k.equals(c6561a.f18595k) && this.f18596l.equals(c6561a.f18596l) && this.f18597m == c6561a.f18597m && this.f18598n == c6561a.f18598n && this.f18599o == c6561a.f18599o && this.f18600p == c6561a.f18600p && Arrays.equals(this.f18601q, c6561a.f18601q)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.InterfaceC4429b
    /* renamed from: g */
    public /* synthetic */ Format mo6156g() {
        return C5774a.m24521b(this);
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f18594j) * 31) + this.f18595k.hashCode()) * 31) + this.f18596l.hashCode()) * 31) + this.f18597m) * 31) + this.f18598n) * 31) + this.f18599o) * 31) + this.f18600p) * 31) + Arrays.hashCode(this.f18601q);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f18595k + ", description=" + this.f18596l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f18594j);
        parcel.writeString(this.f18595k);
        parcel.writeString(this.f18596l);
        parcel.writeInt(this.f18597m);
        parcel.writeInt(this.f18598n);
        parcel.writeInt(this.f18599o);
        parcel.writeInt(this.f18600p);
        parcel.writeByteArray(this.f18601q);
    }

    C6561a(Parcel parcel) {
        this.f18594j = parcel.readInt();
        this.f18595k = (String) C9191p0.m16243j(parcel.readString());
        this.f18596l = (String) C9191p0.m16243j(parcel.readString());
        this.f18597m = parcel.readInt();
        this.f18598n = parcel.readInt();
        this.f18599o = parcel.readInt();
        this.f18600p = parcel.readInt();
        this.f18601q = (byte[]) C9191p0.m16243j(parcel.createByteArray());
    }
}