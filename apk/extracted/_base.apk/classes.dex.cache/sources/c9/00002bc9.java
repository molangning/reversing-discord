package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.C4808a;
import java.util.Arrays;

/* renamed from: com.google.android.material.datepicker.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C4816f implements C4808a.InterfaceC4811c {
    public static final Parcelable.Creator<C4816f> CREATOR = new C4817a();

    /* renamed from: j */
    private final long f13426j;

    /* renamed from: com.google.android.material.datepicker.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4817a implements Parcelable.Creator<C4816f> {
        C4817a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4816f createFromParcel(Parcel parcel) {
            return new C4816f(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C4816f[] newArray(int i) {
            return new C4816f[i];
        }
    }

    /* synthetic */ C4816f(long j, C4817a c4817a) {
        this(j);
    }

    /* renamed from: a */
    public static C4816f m27321a(long j) {
        return new C4816f(j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C4816f) && this.f13426j == ((C4816f) obj).f13426j) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f13426j)});
    }

    @Override // com.google.android.material.datepicker.C4808a.InterfaceC4811c
    /* renamed from: p */
    public boolean mo27320p(long j) {
        return j >= this.f13426j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f13426j);
    }

    private C4816f(long j) {
        this.f13426j = j;
    }
}