package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.ViewProps;
import p231m9.EnumC10370c;

/* renamed from: m9.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC10370c implements Parcelable {
    NONE(ViewProps.NONE),
    INDIRECT("indirect"),
    DIRECT("direct");
    
    public static final Parcelable.Creator<EnumC10370c> CREATOR = new Parcelable.Creator<EnumC10370c>() { // from class: m9.k0
        /* renamed from: a */
        private static EnumC10370c m11628a(Parcel parcel) {
            try {
                return EnumC10370c.m11652a(parcel.readString());
            } catch (EnumC10370c.C10371a e) {
                throw new RuntimeException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EnumC10370c createFromParcel(Parcel parcel) {
            return m11628a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EnumC10370c[] newArray(int i) {
            return new EnumC10370c[i];
        }
    };

    /* renamed from: j */
    private final String f27121j;

    /* renamed from: m9.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C10371a extends Exception {
        public C10371a(String str) {
            super(String.format("Attestation conveyance preference %s not supported", str));
        }
    }

    EnumC10370c(String str) {
        this.f27121j = str;
    }

    /* renamed from: a */
    public static EnumC10370c m11652a(String str) {
        EnumC10370c[] values;
        for (EnumC10370c enumC10370c : values()) {
            if (str.equals(enumC10370c.f27121j)) {
                return enumC10370c;
            }
        }
        throw new C10371a(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f27121j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27121j);
    }
}
