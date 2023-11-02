package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import p231m9.EnumC10398m;

/* renamed from: m9.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC10398m implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);
    
    public static final Parcelable.Creator<EnumC10398m> CREATOR = new Parcelable.Creator<EnumC10398m>() { // from class: m9.w0
        /* renamed from: a */
        private static EnumC10398m m11584a(Parcel parcel) {
            try {
                return EnumC10398m.m11626b(parcel.readInt());
            } catch (EnumC10398m.C10399a e) {
                throw new IllegalArgumentException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EnumC10398m createFromParcel(Parcel parcel) {
            return m11584a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EnumC10398m[] newArray(int i) {
            return new EnumC10398m[i];
        }
    };

    /* renamed from: j */
    private final int f27166j;

    /* renamed from: m9.m$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C10399a extends Exception {
        public C10399a(int i) {
            super(String.format(Locale.US, "Error code %d is not supported", Integer.valueOf(i)));
        }
    }

    EnumC10398m(int i) {
        this.f27166j = i;
    }

    /* renamed from: b */
    public static EnumC10398m m11626b(int i) {
        EnumC10398m[] values;
        for (EnumC10398m enumC10398m : values()) {
            if (i == enumC10398m.f27166j) {
                return enumC10398m;
            }
        }
        throw new C10399a(i);
    }

    /* renamed from: a */
    public final int m11627a() {
        return this.f27166j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f27166j);
    }
}
