package p152i7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p195k8.C9191p0;

/* renamed from: i7.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7433l extends AbstractC7428i {
    public static final Parcelable.Creator<C7433l> CREATOR = new C7434a();

    /* renamed from: k */
    public final String f19970k;

    /* renamed from: l */
    public final byte[] f19971l;

    /* renamed from: i7.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C7434a implements Parcelable.Creator<C7433l> {
        C7434a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C7433l createFromParcel(Parcel parcel) {
            return new C7433l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C7433l[] newArray(int i) {
            return new C7433l[i];
        }
    }

    public C7433l(String str, byte[] bArr) {
        super("PRIV");
        this.f19970k = str;
        this.f19971l = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7433l.class != obj.getClass()) {
            return false;
        }
        C7433l c7433l = (C7433l) obj;
        if (C9191p0.m16257c(this.f19970k, c7433l.f19970k) && Arrays.equals(this.f19971l, c7433l.f19971l)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        String str = this.f19970k;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return ((527 + i) * 31) + Arrays.hashCode(this.f19971l);
    }

    @Override // p152i7.AbstractC7428i
    public String toString() {
        return this.f19961j + ": owner=" + this.f19970k;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19970k);
        parcel.writeByteArray(this.f19971l);
    }

    C7433l(Parcel parcel) {
        super("PRIV");
        this.f19970k = (String) C9191p0.m16243j(parcel.readString());
        this.f19971l = (byte[]) C9191p0.m16243j(parcel.createByteArray());
    }
}
