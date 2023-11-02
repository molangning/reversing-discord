package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.material.timepicker.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C5034d implements Parcelable {
    public static final Parcelable.Creator<C5034d> CREATOR = new C5035a();

    /* renamed from: j */
    private final C5031b f14183j;

    /* renamed from: k */
    private final C5031b f14184k;

    /* renamed from: l */
    final int f14185l;

    /* renamed from: m */
    int f14186m;

    /* renamed from: n */
    int f14187n;

    /* renamed from: o */
    int f14188o;

    /* renamed from: p */
    int f14189p;

    /* renamed from: com.google.android.material.timepicker.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C5035a implements Parcelable.Creator<C5034d> {
        C5035a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5034d createFromParcel(Parcel parcel) {
            return new C5034d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C5034d[] newArray(int i) {
            return new C5034d[i];
        }
    }

    public C5034d() {
        this(0);
    }

    /* renamed from: a */
    public static String m26490a(Resources resources, CharSequence charSequence) {
        return m26489b(resources, charSequence, "%02d");
    }

    /* renamed from: b */
    public static String m26489b(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    /* renamed from: d */
    private static int m26488d(int i) {
        return i >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5034d)) {
            return false;
        }
        C5034d c5034d = (C5034d) obj;
        if (this.f14186m == c5034d.f14186m && this.f14187n == c5034d.f14187n && this.f14185l == c5034d.f14185l && this.f14188o == c5034d.f14188o) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14185l), Integer.valueOf(this.f14186m), Integer.valueOf(this.f14187n), Integer.valueOf(this.f14188o)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14186m);
        parcel.writeInt(this.f14187n);
        parcel.writeInt(this.f14188o);
        parcel.writeInt(this.f14185l);
    }

    public C5034d(int i) {
        this(0, 0, 10, i);
    }

    public C5034d(int i, int i2, int i3, int i4) {
        this.f14186m = i;
        this.f14187n = i2;
        this.f14188o = i3;
        this.f14185l = i4;
        this.f14189p = m26488d(i);
        this.f14183j = new C5031b(59);
        this.f14184k = new C5031b(i4 == 1 ? 24 : 12);
    }

    protected C5034d(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
