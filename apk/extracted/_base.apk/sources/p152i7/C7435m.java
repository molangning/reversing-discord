package p152i7;

import android.os.Parcel;
import android.os.Parcelable;
import p195k8.C9191p0;

/* renamed from: i7.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7435m extends AbstractC7428i {
    public static final Parcelable.Creator<C7435m> CREATOR = new C7436a();

    /* renamed from: k */
    public final String f19972k;

    /* renamed from: l */
    public final String f19973l;

    /* renamed from: i7.m$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C7436a implements Parcelable.Creator<C7435m> {
        C7436a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C7435m createFromParcel(Parcel parcel) {
            return new C7435m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C7435m[] newArray(int i) {
            return new C7435m[i];
        }
    }

    public C7435m(String str, String str2, String str3) {
        super(str);
        this.f19972k = str2;
        this.f19973l = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7435m.class != obj.getClass()) {
            return false;
        }
        C7435m c7435m = (C7435m) obj;
        if (this.f19961j.equals(c7435m.f19961j) && C9191p0.m16257c(this.f19972k, c7435m.f19972k) && C9191p0.m16257c(this.f19973l, c7435m.f19973l)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (527 + this.f19961j.hashCode()) * 31;
        String str = this.f19972k;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.f19973l;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    @Override // p152i7.AbstractC7428i
    public String toString() {
        return this.f19961j + ": description=" + this.f19972k + ": value=" + this.f19973l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19961j);
        parcel.writeString(this.f19972k);
        parcel.writeString(this.f19973l);
    }

    C7435m(Parcel parcel) {
        super((String) C9191p0.m16243j(parcel.readString()));
        this.f19972k = parcel.readString();
        this.f19973l = (String) C9191p0.m16243j(parcel.readString());
    }
}
