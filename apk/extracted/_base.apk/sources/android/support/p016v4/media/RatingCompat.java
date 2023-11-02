package android.support.p016v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.RatingCompat */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C0221a();

    /* renamed from: j */
    private final int f696j;

    /* renamed from: k */
    private final float f697k;

    /* renamed from: android.support.v4.media.RatingCompat$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C0221a implements Parcelable.Creator<RatingCompat> {
        C0221a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    RatingCompat(int i, float f) {
        this.f696j = i;
        this.f697k = f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f696j;
    }

    public String toString() {
        String valueOf;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Rating:style=");
        sb2.append(this.f696j);
        sb2.append(" rating=");
        float f = this.f697k;
        if (f < 0.0f) {
            valueOf = "unrated";
        } else {
            valueOf = String.valueOf(f);
        }
        sb2.append(valueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f696j);
        parcel.writeFloat(this.f697k);
    }
}
