package p152i7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p195k8.C9191p0;

/* renamed from: i7.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7418d extends AbstractC7428i {
    public static final Parcelable.Creator<C7418d> CREATOR = new C7419a();

    /* renamed from: k */
    public final String f19944k;

    /* renamed from: l */
    public final boolean f19945l;

    /* renamed from: m */
    public final boolean f19946m;

    /* renamed from: n */
    public final String[] f19947n;

    /* renamed from: o */
    private final AbstractC7428i[] f19948o;

    /* renamed from: i7.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C7419a implements Parcelable.Creator<C7418d> {
        C7419a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C7418d createFromParcel(Parcel parcel) {
            return new C7418d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C7418d[] newArray(int i) {
            return new C7418d[i];
        }
    }

    public C7418d(String str, boolean z, boolean z2, String[] strArr, AbstractC7428i[] abstractC7428iArr) {
        super("CTOC");
        this.f19944k = str;
        this.f19945l = z;
        this.f19946m = z2;
        this.f19947n = strArr;
        this.f19948o = abstractC7428iArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7418d.class != obj.getClass()) {
            return false;
        }
        C7418d c7418d = (C7418d) obj;
        if (this.f19945l == c7418d.f19945l && this.f19946m == c7418d.f19946m && C9191p0.m16257c(this.f19944k, c7418d.f19944k) && Arrays.equals(this.f19947n, c7418d.f19947n) && Arrays.equals(this.f19948o, c7418d.f19948o)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = (((527 + (this.f19945l ? 1 : 0)) * 31) + (this.f19946m ? 1 : 0)) * 31;
        String str = this.f19944k;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19944k);
        parcel.writeByte(this.f19945l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f19946m ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f19947n);
        parcel.writeInt(this.f19948o.length);
        for (AbstractC7428i abstractC7428i : this.f19948o) {
            parcel.writeParcelable(abstractC7428i, 0);
        }
    }

    C7418d(Parcel parcel) {
        super("CTOC");
        this.f19944k = (String) C9191p0.m16243j(parcel.readString());
        this.f19945l = parcel.readByte() != 0;
        this.f19946m = parcel.readByte() != 0;
        this.f19947n = (String[]) C9191p0.m16243j(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f19948o = new AbstractC7428i[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f19948o[i] = (AbstractC7428i) parcel.readParcelable(AbstractC7428i.class.getClassLoader());
        }
    }
}
