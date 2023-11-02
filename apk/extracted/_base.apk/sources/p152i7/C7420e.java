package p152i7;

import android.os.Parcel;
import android.os.Parcelable;
import p195k8.C9191p0;

/* renamed from: i7.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7420e extends AbstractC7428i {
    public static final Parcelable.Creator<C7420e> CREATOR = new C7421a();

    /* renamed from: k */
    public final String f19949k;

    /* renamed from: l */
    public final String f19950l;

    /* renamed from: m */
    public final String f19951m;

    /* renamed from: i7.e$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C7421a implements Parcelable.Creator<C7420e> {
        C7421a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C7420e createFromParcel(Parcel parcel) {
            return new C7420e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C7420e[] newArray(int i) {
            return new C7420e[i];
        }
    }

    public C7420e(String str, String str2, String str3) {
        super("COMM");
        this.f19949k = str;
        this.f19950l = str2;
        this.f19951m = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7420e.class != obj.getClass()) {
            return false;
        }
        C7420e c7420e = (C7420e) obj;
        if (C9191p0.m16257c(this.f19950l, c7420e.f19950l) && C9191p0.m16257c(this.f19949k, c7420e.f19949k) && C9191p0.m16257c(this.f19951m, c7420e.f19951m)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.f19949k;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (527 + i) * 31;
        String str2 = this.f19950l;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f19951m;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    @Override // p152i7.AbstractC7428i
    public String toString() {
        return this.f19961j + ": language=" + this.f19949k + ", description=" + this.f19950l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19961j);
        parcel.writeString(this.f19949k);
        parcel.writeString(this.f19951m);
    }

    C7420e(Parcel parcel) {
        super("COMM");
        this.f19949k = (String) C9191p0.m16243j(parcel.readString());
        this.f19950l = (String) C9191p0.m16243j(parcel.readString());
        this.f19951m = (String) C9191p0.m16243j(parcel.readString());
    }
}
