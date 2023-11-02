package p231m9;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: m9.g0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC10384g0 implements Parcelable {
    USER_VERIFICATION_REQUIRED("required"),
    USER_VERIFICATION_PREFERRED("preferred"),
    USER_VERIFICATION_DISCOURAGED("discouraged");
    
    public static final Parcelable.Creator<EnumC10384g0> CREATOR = new Parcelable.Creator<EnumC10384g0>() { // from class: m9.f0
        /* renamed from: a */
        private static EnumC10384g0 m11642a(Parcel parcel) {
            try {
                return EnumC10384g0.m11639a(parcel.readString());
            } catch (C10387h0 e) {
                throw new RuntimeException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EnumC10384g0 createFromParcel(Parcel parcel) {
            return m11642a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EnumC10384g0[] newArray(int i) {
            return new EnumC10384g0[i];
        }
    };

    /* renamed from: j */
    private final String f27138j;

    EnumC10384g0(String str) {
        this.f27138j = str;
    }

    /* renamed from: a */
    public static EnumC10384g0 m11639a(String str) {
        EnumC10384g0[] values;
        for (EnumC10384g0 enumC10384g0 : values()) {
            if (str.equals(enumC10384g0.f27138j)) {
                return enumC10384g0;
            }
        }
        throw new C10387h0(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f27138j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27138j);
    }
}
