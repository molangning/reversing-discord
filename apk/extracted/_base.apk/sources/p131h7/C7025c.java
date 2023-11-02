package p131h7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p060d7.C5774a;
import p195k8.C9149a;

/* renamed from: h7.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7025c implements Metadata.InterfaceC4429b {
    public static final Parcelable.Creator<C7025c> CREATOR = new C7026a();

    /* renamed from: j */
    public final byte[] f19219j;

    /* renamed from: k */
    public final String f19220k;

    /* renamed from: l */
    public final String f19221l;

    /* renamed from: h7.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C7026a implements Parcelable.Creator<C7025c> {
        C7026a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C7025c createFromParcel(Parcel parcel) {
            return new C7025c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C7025c[] newArray(int i) {
            return new C7025c[i];
        }
    }

    public C7025c(byte[] bArr, String str, String str2) {
        this.f19219j = bArr;
        this.f19220k = str;
        this.f19221l = str2;
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
        if (obj != null && C7025c.class == obj.getClass()) {
            return Arrays.equals(this.f19219j, ((C7025c) obj).f19219j);
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.InterfaceC4429b
    /* renamed from: g */
    public /* synthetic */ Format mo6156g() {
        return C5774a.m24521b(this);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f19219j);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f19220k, this.f19221l, Integer.valueOf(this.f19219j.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f19219j);
        parcel.writeString(this.f19220k);
        parcel.writeString(this.f19221l);
    }

    C7025c(Parcel parcel) {
        this.f19219j = (byte[]) C9149a.m16448e(parcel.createByteArray());
        this.f19220k = parcel.readString();
        this.f19221l = parcel.readString();
    }
}
