package com.google.android.gms.internal.gtm;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class zzcp implements Parcelable {
    @Deprecated
    public static final Parcelable.Creator<zzcp> CREATOR = new zzco();
    private String zza;
    private String zzb;
    private String zzc;

    @Deprecated
    public zzcp() {
    }

    @Override // android.os.Parcelable
    @Deprecated
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    @Deprecated
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzc;
    }

    @Deprecated
    public zzcp(Parcel parcel) {
        this.zza = parcel.readString();
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
    }
}