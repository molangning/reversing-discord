package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p342t0.InterfaceC12569b;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C1925a();

    /* renamed from: j */
    private final InterfaceC12569b f5319j;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    static class C1925a implements Parcelable.Creator<ParcelImpl> {
        C1925a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    protected ParcelImpl(Parcel parcel) {
        this.f5319j = new C1927b(parcel).m34990u();
    }

    /* renamed from: a */
    public <T extends InterfaceC12569b> T m35013a() {
        return (T) this.f5319j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        new C1927b(parcel).m35004L(this.f5319j);
    }
}