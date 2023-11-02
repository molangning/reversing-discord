package p317r7;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p060d7.C5774a;

/* renamed from: r7.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C12099r implements Metadata.InterfaceC4429b {
    public static final Parcelable.Creator<C12099r> CREATOR = new C12100a();

    /* renamed from: j */
    public final String f31404j;

    /* renamed from: k */
    public final String f31405k;

    /* renamed from: l */
    public final List<C12101b> f31406l;

    /* renamed from: r7.r$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C12100a implements Parcelable.Creator<C12099r> {
        C12100a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C12099r createFromParcel(Parcel parcel) {
            return new C12099r(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C12099r[] newArray(int i) {
            return new C12099r[i];
        }
    }

    public C12099r(String str, String str2, List<C12101b> list) {
        this.f31404j = str;
        this.f31405k = str2;
        this.f31406l = Collections.unmodifiableList(new ArrayList(list));
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
        if (obj == null || C12099r.class != obj.getClass()) {
            return false;
        }
        C12099r c12099r = (C12099r) obj;
        if (TextUtils.equals(this.f31404j, c12099r.f31404j) && TextUtils.equals(this.f31405k, c12099r.f31405k) && this.f31406l.equals(c12099r.f31406l)) {
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
        String str = this.f31404j;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.f31405k;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((i3 + i2) * 31) + this.f31406l.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HlsTrackMetadataEntry");
        if (this.f31404j != null) {
            str = " [" + this.f31404j + ", " + this.f31405k + "]";
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f31404j);
        parcel.writeString(this.f31405k);
        int size = this.f31406l.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable(this.f31406l.get(i2), 0);
        }
    }

    C12099r(Parcel parcel) {
        this.f31404j = parcel.readString();
        this.f31405k = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add((C12101b) parcel.readParcelable(C12101b.class.getClassLoader()));
        }
        this.f31406l = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: r7.r$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C12101b implements Parcelable {
        public static final Parcelable.Creator<C12101b> CREATOR = new C12102a();

        /* renamed from: j */
        public final int f31407j;

        /* renamed from: k */
        public final int f31408k;

        /* renamed from: l */
        public final String f31409l;

        /* renamed from: m */
        public final String f31410m;

        /* renamed from: n */
        public final String f31411n;

        /* renamed from: o */
        public final String f31412o;

        /* renamed from: r7.r$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        class C12102a implements Parcelable.Creator<C12101b> {
            C12102a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C12101b createFromParcel(Parcel parcel) {
                return new C12101b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C12101b[] newArray(int i) {
                return new C12101b[i];
            }
        }

        public C12101b(int i, int i2, String str, String str2, String str3, String str4) {
            this.f31407j = i;
            this.f31408k = i2;
            this.f31409l = str;
            this.f31410m = str2;
            this.f31411n = str3;
            this.f31412o = str4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C12101b.class != obj.getClass()) {
                return false;
            }
            C12101b c12101b = (C12101b) obj;
            if (this.f31407j == c12101b.f31407j && this.f31408k == c12101b.f31408k && TextUtils.equals(this.f31409l, c12101b.f31409l) && TextUtils.equals(this.f31410m, c12101b.f31410m) && TextUtils.equals(this.f31411n, c12101b.f31411n) && TextUtils.equals(this.f31412o, c12101b.f31412o)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4 = ((this.f31407j * 31) + this.f31408k) * 31;
            String str = this.f31409l;
            int i5 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i6 = (i4 + i) * 31;
            String str2 = this.f31410m;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i7 = (i6 + i2) * 31;
            String str3 = this.f31411n;
            if (str3 != null) {
                i3 = str3.hashCode();
            } else {
                i3 = 0;
            }
            int i8 = (i7 + i3) * 31;
            String str4 = this.f31412o;
            if (str4 != null) {
                i5 = str4.hashCode();
            }
            return i8 + i5;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f31407j);
            parcel.writeInt(this.f31408k);
            parcel.writeString(this.f31409l);
            parcel.writeString(this.f31410m);
            parcel.writeString(this.f31411n);
            parcel.writeString(this.f31412o);
        }

        C12101b(Parcel parcel) {
            this.f31407j = parcel.readInt();
            this.f31408k = parcel.readInt();
            this.f31409l = parcel.readString();
            this.f31410m = parcel.readString();
            this.f31411n = parcel.readString();
            this.f31412o = parcel.readString();
        }
    }
}
