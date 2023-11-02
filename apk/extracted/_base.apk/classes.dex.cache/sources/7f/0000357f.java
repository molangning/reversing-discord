package p131h7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import p060d7.C5774a;
import p195k8.C9149a;
import p195k8.C9191p0;

/* renamed from: h7.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7023b implements Metadata.InterfaceC4429b {
    public static final Parcelable.Creator<C7023b> CREATOR = new C7024a();

    /* renamed from: j */
    public final int f19213j;

    /* renamed from: k */
    public final String f19214k;

    /* renamed from: l */
    public final String f19215l;

    /* renamed from: m */
    public final String f19216m;

    /* renamed from: n */
    public final boolean f19217n;

    /* renamed from: o */
    public final int f19218o;

    /* renamed from: h7.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C7024a implements Parcelable.Creator<C7023b> {
        C7024a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C7023b createFromParcel(Parcel parcel) {
            return new C7023b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C7023b[] newArray(int i) {
            return new C7023b[i];
        }
    }

    public C7023b(int i, String str, String str2, String str3, boolean z, int i2) {
        C9149a.m16452a(i2 == -1 || i2 > 0);
        this.f19213j = i;
        this.f19214k = str;
        this.f19215l = str2;
        this.f19216m = str3;
        this.f19217n = z;
        this.f19218o = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00eb  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p131h7.C7023b m21525a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p131h7.C7023b.m21525a(java.util.Map):h7.b");
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
        if (obj == null || C7023b.class != obj.getClass()) {
            return false;
        }
        C7023b c7023b = (C7023b) obj;
        if (this.f19213j == c7023b.f19213j && C9191p0.m16257c(this.f19214k, c7023b.f19214k) && C9191p0.m16257c(this.f19215l, c7023b.f19215l) && C9191p0.m16257c(this.f19216m, c7023b.f19216m) && this.f19217n == c7023b.f19217n && this.f19218o == c7023b.f19218o) {
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
        int i;
        int i2;
        int i3 = (527 + this.f19213j) * 31;
        String str = this.f19214k;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = (i3 + i) * 31;
        String str2 = this.f19215l;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.f19216m;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return ((((i6 + i4) * 31) + (this.f19217n ? 1 : 0)) * 31) + this.f19218o;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f19215l + "\", genre=\"" + this.f19214k + "\", bitrate=" + this.f19213j + ", metadataInterval=" + this.f19218o;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f19213j);
        parcel.writeString(this.f19214k);
        parcel.writeString(this.f19215l);
        parcel.writeString(this.f19216m);
        C9191p0.m16262Z0(parcel, this.f19217n);
        parcel.writeInt(this.f19218o);
    }

    C7023b(Parcel parcel) {
        this.f19213j = parcel.readInt();
        this.f19214k = parcel.readString();
        this.f19215l = parcel.readString();
        this.f19216m = parcel.readString();
        this.f19217n = C9191p0.m16300G0(parcel);
        this.f19218o = parcel.readInt();
    }
}