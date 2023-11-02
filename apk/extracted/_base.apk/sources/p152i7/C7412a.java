package p152i7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p195k8.C9191p0;

/* renamed from: i7.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7412a extends AbstractC7428i {
    public static final Parcelable.Creator<C7412a> CREATOR = new C7413a();

    /* renamed from: k */
    public final String f19933k;

    /* renamed from: l */
    public final String f19934l;

    /* renamed from: m */
    public final int f19935m;

    /* renamed from: n */
    public final byte[] f19936n;

    /* renamed from: i7.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C7413a implements Parcelable.Creator<C7412a> {
        C7413a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C7412a createFromParcel(Parcel parcel) {
            return new C7412a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C7412a[] newArray(int i) {
            return new C7412a[i];
        }
    }

    public C7412a(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f19933k = str;
        this.f19934l = str2;
        this.f19935m = i;
        this.f19936n = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7412a.class != obj.getClass()) {
            return false;
        }
        C7412a c7412a = (C7412a) obj;
        if (this.f19935m == c7412a.f19935m && C9191p0.m16257c(this.f19933k, c7412a.f19933k) && C9191p0.m16257c(this.f19934l, c7412a.f19934l) && Arrays.equals(this.f19936n, c7412a.f19936n)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = (527 + this.f19935m) * 31;
        String str = this.f19933k;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        String str2 = this.f19934l;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return ((i4 + i3) * 31) + Arrays.hashCode(this.f19936n);
    }

    @Override // p152i7.AbstractC7428i
    public String toString() {
        return this.f19961j + ": mimeType=" + this.f19933k + ", description=" + this.f19934l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19933k);
        parcel.writeString(this.f19934l);
        parcel.writeInt(this.f19935m);
        parcel.writeByteArray(this.f19936n);
    }

    C7412a(Parcel parcel) {
        super("APIC");
        this.f19933k = (String) C9191p0.m16243j(parcel.readString());
        this.f19934l = parcel.readString();
        this.f19935m = parcel.readInt();
        this.f19936n = (byte[]) C9191p0.m16243j(parcel.createByteArray());
    }
}
