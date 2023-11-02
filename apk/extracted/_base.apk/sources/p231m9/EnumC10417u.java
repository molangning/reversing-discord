package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import p231m9.EnumC10417u;

/* renamed from: m9.u */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC10417u implements Parcelable {
    PUBLIC_KEY("public-key");
    
    public static final Parcelable.Creator<EnumC10417u> CREATOR = new Parcelable.Creator<EnumC10417u>() { // from class: m9.e1
        /* renamed from: a */
        private static EnumC10417u m11647a(Parcel parcel) {
            try {
                return EnumC10417u.m11590a(parcel.readString());
            } catch (EnumC10417u.C10418a e) {
                throw new RuntimeException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EnumC10417u createFromParcel(Parcel parcel) {
            return m11647a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EnumC10417u[] newArray(int i) {
            return new EnumC10417u[i];
        }
    };

    /* renamed from: j */
    private final String f27228j;

    /* renamed from: m9.u$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C10418a extends Exception {
        public C10418a(String str) {
            super(str);
        }
    }

    EnumC10417u(String str) {
        this.f27228j = str;
    }

    /* renamed from: a */
    public static EnumC10417u m11590a(String str) {
        EnumC10417u[] values;
        for (EnumC10417u enumC10417u : values()) {
            if (str.equals(enumC10417u.f27228j)) {
                return enumC10417u;
            }
        }
        throw new C10418a(String.format("PublicKeyCredentialType %s not supported", str));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f27228j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27228j);
    }
}
