package p173j7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import p060d7.C5774a;
import p177jb.C8893d;

/* renamed from: j7.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8856b implements Metadata.InterfaceC4429b {
    public static final Parcelable.Creator<C8856b> CREATOR = new C8857a();

    /* renamed from: j */
    public final long f23232j;

    /* renamed from: k */
    public final long f23233k;

    /* renamed from: l */
    public final long f23234l;

    /* renamed from: m */
    public final long f23235m;

    /* renamed from: n */
    public final long f23236n;

    /* renamed from: j7.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C8857a implements Parcelable.Creator<C8856b> {
        C8857a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C8856b createFromParcel(Parcel parcel) {
            return new C8856b(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C8856b[] newArray(int i) {
            return new C8856b[i];
        }
    }

    /* synthetic */ C8856b(Parcel parcel, C8857a c8857a) {
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
        if (obj == null || C8856b.class != obj.getClass()) {
            return false;
        }
        C8856b c8856b = (C8856b) obj;
        if (this.f23232j == c8856b.f23232j && this.f23233k == c8856b.f23233k && this.f23234l == c8856b.f23234l && this.f23235m == c8856b.f23235m && this.f23236n == c8856b.f23236n) {
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
        return ((((((((527 + C8893d.m17065b(this.f23232j)) * 31) + C8893d.m17065b(this.f23233k)) * 31) + C8893d.m17065b(this.f23234l)) * 31) + C8893d.m17065b(this.f23235m)) * 31) + C8893d.m17065b(this.f23236n);
    }

    public String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.f23232j + ", photoSize=" + this.f23233k + ", photoPresentationTimestampUs=" + this.f23234l + ", videoStartPosition=" + this.f23235m + ", videoSize=" + this.f23236n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f23232j);
        parcel.writeLong(this.f23233k);
        parcel.writeLong(this.f23234l);
        parcel.writeLong(this.f23235m);
        parcel.writeLong(this.f23236n);
    }

    public C8856b(long j, long j2, long j3, long j4, long j5) {
        this.f23232j = j;
        this.f23233k = j2;
        this.f23234l = j3;
        this.f23235m = j4;
        this.f23236n = j5;
    }

    private C8856b(Parcel parcel) {
        this.f23232j = parcel.readLong();
        this.f23233k = parcel.readLong();
        this.f23234l = parcel.readLong();
        this.f23235m = parcel.readLong();
        this.f23236n = parcel.readLong();
    }
}