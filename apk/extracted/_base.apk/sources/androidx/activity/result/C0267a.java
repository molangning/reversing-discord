package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.activity.result.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C0267a implements Parcelable {
    public static final Parcelable.Creator<C0267a> CREATOR = new C0268a();

    /* renamed from: j */
    private final int f811j;

    /* renamed from: k */
    private final Intent f812k;

    /* renamed from: androidx.activity.result.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C0268a implements Parcelable.Creator<C0267a> {
        C0268a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C0267a createFromParcel(Parcel parcel) {
            return new C0267a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C0267a[] newArray(int i) {
            return new C0267a[i];
        }
    }

    public C0267a(int i, Intent intent) {
        this.f811j = i;
        this.f812k = intent;
    }

    /* renamed from: d */
    public static String m40792d(int i) {
        return i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK";
    }

    /* renamed from: a */
    public Intent m40794a() {
        return this.f812k;
    }

    /* renamed from: b */
    public int m40793b() {
        return this.f811j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + m40792d(this.f811j) + ", data=" + this.f812k + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeInt(this.f811j);
        if (this.f812k == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        parcel.writeInt(i2);
        Intent intent = this.f812k;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    C0267a(Parcel parcel) {
        this.f811j = parcel.readInt();
        this.f812k = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}
