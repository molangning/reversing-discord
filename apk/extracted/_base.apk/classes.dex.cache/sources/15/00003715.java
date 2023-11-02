package p152i7;

import android.os.Parcel;
import android.os.Parcelable;
import p195k8.C9191p0;

/* renamed from: i7.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7429j extends AbstractC7428i {
    public static final Parcelable.Creator<C7429j> CREATOR = new C7430a();

    /* renamed from: k */
    public final String f19962k;

    /* renamed from: l */
    public final String f19963l;

    /* renamed from: m */
    public final String f19964m;

    /* renamed from: i7.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C7430a implements Parcelable.Creator<C7429j> {
        C7430a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C7429j createFromParcel(Parcel parcel) {
            return new C7429j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C7429j[] newArray(int i) {
            return new C7429j[i];
        }
    }

    public C7429j(String str, String str2, String str3) {
        super("----");
        this.f19962k = str;
        this.f19963l = str2;
        this.f19964m = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7429j.class != obj.getClass()) {
            return false;
        }
        C7429j c7429j = (C7429j) obj;
        if (C9191p0.m16257c(this.f19963l, c7429j.f19963l) && C9191p0.m16257c(this.f19962k, c7429j.f19962k) && C9191p0.m16257c(this.f19964m, c7429j.f19964m)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        String str = this.f19962k;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (527 + i) * 31;
        String str2 = this.f19963l;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f19964m;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    @Override // p152i7.AbstractC7428i
    public String toString() {
        return this.f19961j + ": domain=" + this.f19962k + ", description=" + this.f19963l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19961j);
        parcel.writeString(this.f19962k);
        parcel.writeString(this.f19964m);
    }

    C7429j(Parcel parcel) {
        super("----");
        this.f19962k = (String) C9191p0.m16243j(parcel.readString());
        this.f19963l = (String) C9191p0.m16243j(parcel.readString());
        this.f19964m = (String) C9191p0.m16243j(parcel.readString());
    }
}