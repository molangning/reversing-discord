package p173j7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p060d7.C5774a;
import p195k8.C9191p0;

/* renamed from: j7.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8854a implements Metadata.InterfaceC4429b {
    public static final Parcelable.Creator<C8854a> CREATOR = new C8855a();

    /* renamed from: j */
    public final String f23228j;

    /* renamed from: k */
    public final byte[] f23229k;

    /* renamed from: l */
    public final int f23230l;

    /* renamed from: m */
    public final int f23231m;

    /* renamed from: j7.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C8855a implements Parcelable.Creator<C8854a> {
        C8855a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C8854a createFromParcel(Parcel parcel) {
            return new C8854a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C8854a[] newArray(int i) {
            return new C8854a[i];
        }
    }

    /* synthetic */ C8854a(Parcel parcel, C8855a c8855a) {
        this(parcel);
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
        if (obj == null || C8854a.class != obj.getClass()) {
            return false;
        }
        C8854a c8854a = (C8854a) obj;
        if (this.f23228j.equals(c8854a.f23228j) && Arrays.equals(this.f23229k, c8854a.f23229k) && this.f23230l == c8854a.f23230l && this.f23231m == c8854a.f23231m) {
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
        return ((((((527 + this.f23228j.hashCode()) * 31) + Arrays.hashCode(this.f23229k)) * 31) + this.f23230l) * 31) + this.f23231m;
    }

    public String toString() {
        return "mdta: key=" + this.f23228j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23228j);
        parcel.writeByteArray(this.f23229k);
        parcel.writeInt(this.f23230l);
        parcel.writeInt(this.f23231m);
    }

    public C8854a(String str, byte[] bArr, int i, int i2) {
        this.f23228j = str;
        this.f23229k = bArr;
        this.f23230l = i;
        this.f23231m = i2;
    }

    private C8854a(Parcel parcel) {
        this.f23228j = (String) C9191p0.m16243j(parcel.readString());
        this.f23229k = (byte[]) C9191p0.m16243j(parcel.createByteArray());
        this.f23230l = parcel.readInt();
        this.f23231m = parcel.readInt();
    }
}
