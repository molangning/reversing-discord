package p212l7;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: l7.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10059c implements Comparable<C10059c>, Parcelable {
    public static final Parcelable.Creator<C10059c> CREATOR = new C10060a();

    /* renamed from: j */
    public final int f26154j;

    /* renamed from: k */
    public final int f26155k;

    /* renamed from: l */
    public final int f26156l;

    /* renamed from: l7.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C10060a implements Parcelable.Creator<C10059c> {
        C10060a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C10059c createFromParcel(Parcel parcel) {
            return new C10059c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C10059c[] newArray(int i) {
            return new C10059c[i];
        }
    }

    public C10059c(int i, int i2, int i3) {
        this.f26154j = i;
        this.f26155k = i2;
        this.f26156l = i3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C10059c c10059c) {
        int i = this.f26154j - c10059c.f26154j;
        if (i == 0) {
            int i2 = this.f26155k - c10059c.f26155k;
            if (i2 == 0) {
                return this.f26156l - c10059c.f26156l;
            }
            return i2;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10059c.class != obj.getClass()) {
            return false;
        }
        C10059c c10059c = (C10059c) obj;
        if (this.f26154j == c10059c.f26154j && this.f26155k == c10059c.f26155k && this.f26156l == c10059c.f26156l) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f26154j * 31) + this.f26155k) * 31) + this.f26156l;
    }

    public String toString() {
        return this.f26154j + "." + this.f26155k + "." + this.f26156l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f26154j);
        parcel.writeInt(this.f26155k);
        parcel.writeInt(this.f26156l);
    }

    C10059c(Parcel parcel) {
        this.f26154j = parcel.readInt();
        this.f26155k = parcel.readInt();
        this.f26156l = parcel.readInt();
    }
}
