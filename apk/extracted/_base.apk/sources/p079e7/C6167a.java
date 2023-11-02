package p079e7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import p060d7.C5774a;
import p195k8.C9149a;

/* renamed from: e7.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6167a implements Metadata.InterfaceC4429b {
    public static final Parcelable.Creator<C6167a> CREATOR = new C6168a();

    /* renamed from: j */
    public final int f17446j;

    /* renamed from: k */
    public final String f17447k;

    /* renamed from: e7.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C6168a implements Parcelable.Creator<C6167a> {
        C6168a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C6167a createFromParcel(Parcel parcel) {
            return new C6167a(parcel.readInt(), (String) C9149a.m16448e(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C6167a[] newArray(int i) {
            return new C6167a[i];
        }
    }

    public C6167a(int i, String str) {
        this.f17446j = i;
        this.f17447k = str;
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

    @Override // com.google.android.exoplayer2.metadata.Metadata.InterfaceC4429b
    /* renamed from: g */
    public /* synthetic */ Format mo6156g() {
        return C5774a.m24521b(this);
    }

    public String toString() {
        return "Ait(controlCode=" + this.f17446j + ",url=" + this.f17447k + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17447k);
        parcel.writeInt(this.f17446j);
    }
}
