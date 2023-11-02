package p117g7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import p060d7.C5774a;
import p195k8.C9191p0;

/* renamed from: g7.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6563b implements Metadata.InterfaceC4429b {
    public static final Parcelable.Creator<C6563b> CREATOR = new C6564a();

    /* renamed from: j */
    public final String f18602j;

    /* renamed from: k */
    public final String f18603k;

    /* renamed from: g7.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C6564a implements Parcelable.Creator<C6563b> {
        C6564a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C6563b createFromParcel(Parcel parcel) {
            return new C6563b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C6563b[] newArray(int i) {
            return new C6563b[i];
        }
    }

    public C6563b(String str, String str2) {
        this.f18602j = str;
        this.f18603k = str2;
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
        if (obj == null || C6563b.class != obj.getClass()) {
            return false;
        }
        C6563b c6563b = (C6563b) obj;
        if (this.f18602j.equals(c6563b.f18602j) && this.f18603k.equals(c6563b.f18603k)) {
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
        return ((527 + this.f18602j.hashCode()) * 31) + this.f18603k.hashCode();
    }

    public String toString() {
        return "VC: " + this.f18602j + "=" + this.f18603k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f18602j);
        parcel.writeString(this.f18603k);
    }

    C6563b(Parcel parcel) {
        this.f18602j = (String) C9191p0.m16243j(parcel.readString());
        this.f18603k = (String) C9191p0.m16243j(parcel.readString());
    }
}
