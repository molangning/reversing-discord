package p231m9;

import android.os.Parcel;
import android.os.Parcelable;
import p231m9.EnumC10366b;

/* renamed from: m9.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public enum EnumC10366b implements Parcelable {
    PLATFORM("platform"),
    CROSS_PLATFORM("cross-platform");
    
    public static final Parcelable.Creator<EnumC10366b> CREATOR = new Parcelable.Creator<EnumC10366b>() { // from class: m9.c0
        /* renamed from: a */
        private static EnumC10366b m11651a(Parcel parcel) {
            try {
                return EnumC10366b.m11656a(parcel.readString());
            } catch (EnumC10366b.C10367a e) {
                throw new RuntimeException(e);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EnumC10366b createFromParcel(Parcel parcel) {
            return m11651a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EnumC10366b[] newArray(int i) {
            return new EnumC10366b[i];
        }
    };

    /* renamed from: j */
    private final String f27113j;

    /* renamed from: m9.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C10367a extends Exception {
        public C10367a(String str) {
            super(String.format("Attachment %s not supported", str));
        }
    }

    EnumC10366b(String str) {
        this.f27113j = str;
    }

    /* renamed from: a */
    public static EnumC10366b m11656a(String str) {
        EnumC10366b[] values;
        for (EnumC10366b enumC10366b : values()) {
            if (str.equals(enumC10366b.f27113j)) {
                return enumC10366b;
            }
        }
        throw new C10367a(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f27113j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27113j);
    }
}
