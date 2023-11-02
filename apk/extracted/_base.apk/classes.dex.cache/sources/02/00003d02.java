package p173j7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import p060d7.C5774a;
import p177jb.C8890b;

/* renamed from: j7.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8863e implements Metadata.InterfaceC4429b {
    public static final Parcelable.Creator<C8863e> CREATOR = new C8864a();

    /* renamed from: j */
    public final float f23242j;

    /* renamed from: k */
    public final int f23243k;

    /* renamed from: j7.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C8864a implements Parcelable.Creator<C8863e> {
        C8864a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C8863e createFromParcel(Parcel parcel) {
            return new C8863e(parcel, (C8864a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C8863e[] newArray(int i) {
            return new C8863e[i];
        }
    }

    /* synthetic */ C8863e(Parcel parcel, C8864a c8864a) {
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
        if (obj == null || C8863e.class != obj.getClass()) {
            return false;
        }
        C8863e c8863e = (C8863e) obj;
        if (this.f23242j == c8863e.f23242j && this.f23243k == c8863e.f23243k) {
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
        return ((527 + C8890b.m17081a(this.f23242j)) * 31) + this.f23243k;
    }

    public String toString() {
        return "smta: captureFrameRate=" + this.f23242j + ", svcTemporalLayerCount=" + this.f23243k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f23242j);
        parcel.writeInt(this.f23243k);
    }

    public C8863e(float f, int i) {
        this.f23242j = f;
        this.f23243k = i;
    }

    private C8863e(Parcel parcel) {
        this.f23242j = parcel.readFloat();
        this.f23243k = parcel.readInt();
    }
}