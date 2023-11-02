package p098f7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p195k8.C9191p0;

/* renamed from: f7.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6314a implements Metadata.InterfaceC4429b {

    /* renamed from: j */
    public final String f17822j;

    /* renamed from: k */
    public final String f17823k;

    /* renamed from: l */
    public final long f17824l;

    /* renamed from: m */
    public final long f17825m;

    /* renamed from: n */
    public final byte[] f17826n;

    /* renamed from: o */
    private int f17827o;

    /* renamed from: p */
    private static final Format f17820p = new Format.C4362b().m29883e0("application/id3").m29914E();

    /* renamed from: q */
    private static final Format f17821q = new Format.C4362b().m29883e0("application/x-scte35").m29914E();
    public static final Parcelable.Creator<C6314a> CREATOR = new C6315a();

    /* renamed from: f7.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C6315a implements Parcelable.Creator<C6314a> {
        C6315a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C6314a createFromParcel(Parcel parcel) {
            return new C6314a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C6314a[] newArray(int i) {
            return new C6314a[i];
        }
    }

    public C6314a(String str, String str2, long j, long j2, byte[] bArr) {
        this.f17822j = str;
        this.f17823k = str2;
        this.f17824l = j;
        this.f17825m = j2;
        this.f17826n = bArr;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.InterfaceC4429b
    /* renamed from: R */
    public byte[] mo6157R() {
        if (mo6156g() != null) {
            return this.f17826n;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6314a.class != obj.getClass()) {
            return false;
        }
        C6314a c6314a = (C6314a) obj;
        if (this.f17824l == c6314a.f17824l && this.f17825m == c6314a.f17825m && C9191p0.m16257c(this.f17822j, c6314a.f17822j) && C9191p0.m16257c(this.f17823k, c6314a.f17823k) && Arrays.equals(this.f17826n, c6314a.f17826n)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.InterfaceC4429b
    /* renamed from: g */
    public Format mo6156g() {
        String str = this.f17822j;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return f17821q;
            case 1:
            case 2:
                return f17820p;
            default:
                return null;
        }
    }

    public int hashCode() {
        int i;
        if (this.f17827o == 0) {
            String str = this.f17822j;
            int i2 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i3 = (527 + i) * 31;
            String str2 = this.f17823k;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            long j = this.f17824l;
            long j2 = this.f17825m;
            this.f17827o = ((((((i3 + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.f17826n);
        }
        return this.f17827o;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f17822j + ", id=" + this.f17825m + ", durationMs=" + this.f17824l + ", value=" + this.f17823k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17822j);
        parcel.writeString(this.f17823k);
        parcel.writeLong(this.f17824l);
        parcel.writeLong(this.f17825m);
        parcel.writeByteArray(this.f17826n);
    }

    C6314a(Parcel parcel) {
        this.f17822j = (String) C9191p0.m16243j(parcel.readString());
        this.f17823k = (String) C9191p0.m16243j(parcel.readString());
        this.f17824l = parcel.readLong();
        this.f17825m = parcel.readLong();
        this.f17826n = (byte[]) C9191p0.m16243j(parcel.createByteArray());
    }
}
