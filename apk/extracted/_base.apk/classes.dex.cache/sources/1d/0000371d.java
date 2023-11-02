package p152i7;

import android.os.Parcel;
import android.os.Parcelable;
import p195k8.C9191p0;

/* renamed from: i7.n */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7437n extends AbstractC7428i {
    public static final Parcelable.Creator<C7437n> CREATOR = new C7438a();

    /* renamed from: k */
    public final String f19974k;

    /* renamed from: l */
    public final String f19975l;

    /* renamed from: i7.n$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C7438a implements Parcelable.Creator<C7437n> {
        C7438a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C7437n createFromParcel(Parcel parcel) {
            return new C7437n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C7437n[] newArray(int i) {
            return new C7437n[i];
        }
    }

    public C7437n(String str, String str2, String str3) {
        super(str);
        this.f19974k = str2;
        this.f19975l = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7437n.class != obj.getClass()) {
            return false;
        }
        C7437n c7437n = (C7437n) obj;
        if (this.f19961j.equals(c7437n.f19961j) && C9191p0.m16257c(this.f19974k, c7437n.f19974k) && C9191p0.m16257c(this.f19975l, c7437n.f19975l)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int hashCode = (527 + this.f19961j.hashCode()) * 31;
        String str = this.f19974k;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.f19975l;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    @Override // p152i7.AbstractC7428i
    public String toString() {
        return this.f19961j + ": url=" + this.f19975l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19961j);
        parcel.writeString(this.f19974k);
        parcel.writeString(this.f19975l);
    }

    C7437n(Parcel parcel) {
        super((String) C9191p0.m16243j(parcel.readString()));
        this.f19974k = parcel.readString();
        this.f19975l = (String) C9191p0.m16243j(parcel.readString());
    }
}