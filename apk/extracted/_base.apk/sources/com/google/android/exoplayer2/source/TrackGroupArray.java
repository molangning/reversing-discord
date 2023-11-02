package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p229m7.C10344s0;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class TrackGroupArray implements Parcelable {

    /* renamed from: j */
    public final int f11764j;

    /* renamed from: k */
    private final C10344s0[] f11765k;

    /* renamed from: l */
    private int f11766l;

    /* renamed from: m */
    public static final TrackGroupArray f11763m = new TrackGroupArray(new C10344s0[0]);
    public static final Parcelable.Creator<TrackGroupArray> CREATOR = new C4449a();

    /* renamed from: com.google.android.exoplayer2.source.TrackGroupArray$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4449a implements Parcelable.Creator<TrackGroupArray> {
        C4449a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public TrackGroupArray createFromParcel(Parcel parcel) {
            return new TrackGroupArray(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public TrackGroupArray[] newArray(int i) {
            return new TrackGroupArray[i];
        }
    }

    public TrackGroupArray(C10344s0... c10344s0Arr) {
        this.f11765k = c10344s0Arr;
        this.f11764j = c10344s0Arr.length;
    }

    /* renamed from: a */
    public C10344s0 m29144a(int i) {
        return this.f11765k[i];
    }

    /* renamed from: b */
    public int m29143b(C10344s0 c10344s0) {
        for (int i = 0; i < this.f11764j; i++) {
            if (this.f11765k[i] == c10344s0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public boolean m29142d() {
        return this.f11764j == 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroupArray.class != obj.getClass()) {
            return false;
        }
        TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
        if (this.f11764j == trackGroupArray.f11764j && Arrays.equals(this.f11765k, trackGroupArray.f11765k)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f11766l == 0) {
            this.f11766l = Arrays.hashCode(this.f11765k);
        }
        return this.f11766l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11764j);
        for (int i2 = 0; i2 < this.f11764j; i2++) {
            parcel.writeParcelable(this.f11765k[i2], 0);
        }
    }

    TrackGroupArray(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f11764j = readInt;
        this.f11765k = new C10344s0[readInt];
        for (int i = 0; i < this.f11764j; i++) {
            this.f11765k[i] = (C10344s0) parcel.readParcelable(C10344s0.class.getClassLoader());
        }
    }
}
