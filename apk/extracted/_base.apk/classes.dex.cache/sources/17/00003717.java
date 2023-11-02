package p152i7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p195k8.C9191p0;

/* renamed from: i7.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7431k extends AbstractC7428i {
    public static final Parcelable.Creator<C7431k> CREATOR = new C7432a();

    /* renamed from: k */
    public final int f19965k;

    /* renamed from: l */
    public final int f19966l;

    /* renamed from: m */
    public final int f19967m;

    /* renamed from: n */
    public final int[] f19968n;

    /* renamed from: o */
    public final int[] f19969o;

    /* renamed from: i7.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C7432a implements Parcelable.Creator<C7431k> {
        C7432a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C7431k createFromParcel(Parcel parcel) {
            return new C7431k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C7431k[] newArray(int i) {
            return new C7431k[i];
        }
    }

    public C7431k(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f19965k = i;
        this.f19966l = i2;
        this.f19967m = i3;
        this.f19968n = iArr;
        this.f19969o = iArr2;
    }

    @Override // p152i7.AbstractC7428i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7431k.class != obj.getClass()) {
            return false;
        }
        C7431k c7431k = (C7431k) obj;
        if (this.f19965k == c7431k.f19965k && this.f19966l == c7431k.f19966l && this.f19967m == c7431k.f19967m && Arrays.equals(this.f19968n, c7431k.f19968n) && Arrays.equals(this.f19969o, c7431k.f19969o)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f19965k) * 31) + this.f19966l) * 31) + this.f19967m) * 31) + Arrays.hashCode(this.f19968n)) * 31) + Arrays.hashCode(this.f19969o);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f19965k);
        parcel.writeInt(this.f19966l);
        parcel.writeInt(this.f19967m);
        parcel.writeIntArray(this.f19968n);
        parcel.writeIntArray(this.f19969o);
    }

    C7431k(Parcel parcel) {
        super("MLLT");
        this.f19965k = parcel.readInt();
        this.f19966l = parcel.readInt();
        this.f19967m = parcel.readInt();
        this.f19968n = (int[]) C9191p0.m16243j(parcel.createIntArray());
        this.f19969o = (int[]) C9191p0.m16243j(parcel.createIntArray());
    }
}