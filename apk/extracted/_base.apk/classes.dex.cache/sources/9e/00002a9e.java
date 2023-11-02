package com.google.android.gms.fido.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.fido.common.Transport;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum Transport implements ReflectedParcelable {
    BLUETOOTH_CLASSIC("bt"),
    BLUETOOTH_LOW_ENERGY("ble"),
    NFC("nfc"),
    USB("usb"),
    INTERNAL("internal"),
    CABLE("cable");
    
    public static final Parcelable.Creator<Transport> CREATOR = new Parcelable.Creator<Transport>() { // from class: com.google.android.gms.fido.common.a
        /* renamed from: a */
        private static Transport m28056a(Parcel parcel) {
            try {
                return Transport.m28057a(parcel.readString());
            } catch (Transport.C4667a e) {
                throw new RuntimeException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Transport createFromParcel(Parcel parcel) {
            return m28056a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Transport[] newArray(int i) {
            return new Transport[i];
        }
    };

    /* renamed from: j */
    private final String f12805j;

    /* renamed from: com.google.android.gms.fido.common.Transport$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4667a extends Exception {
        public C4667a(String str) {
            super(str);
        }
    }

    Transport(String str) {
        this.f12805j = str;
    }

    /* renamed from: a */
    public static Transport m28057a(String str) {
        Transport[] values;
        for (Transport transport : values()) {
            if (str.equals(transport.f12805j)) {
                return transport;
            }
        }
        throw new C4667a(String.format("Transport %s not supported", str));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f12805j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12805j);
    }
}