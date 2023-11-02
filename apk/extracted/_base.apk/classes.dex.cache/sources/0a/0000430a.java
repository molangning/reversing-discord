package p229m7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import p195k8.C9149a;

/* renamed from: m7.s0 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10344s0 implements Parcelable {
    public static final Parcelable.Creator<C10344s0> CREATOR = new C10345a();

    /* renamed from: j */
    public final int f27056j;

    /* renamed from: k */
    private final Format[] f27057k;

    /* renamed from: l */
    private int f27058l;

    /* renamed from: m7.s0$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C10345a implements Parcelable.Creator<C10344s0> {
        C10345a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C10344s0 createFromParcel(Parcel parcel) {
            return new C10344s0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C10344s0[] newArray(int i) {
            return new C10344s0[i];
        }
    }

    public C10344s0(Format... formatArr) {
        C9149a.m16447f(formatArr.length > 0);
        this.f27057k = formatArr;
        this.f27056j = formatArr.length;
    }

    /* renamed from: a */
    public Format m11721a(int i) {
        return this.f27057k[i];
    }

    /* renamed from: b */
    public int m11720b(Format format) {
        int i = 0;
        while (true) {
            Format[] formatArr = this.f27057k;
            if (i < formatArr.length) {
                if (format == formatArr[i]) {
                    return i;
                }
                i++;
            } else {
                return -1;
            }
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10344s0.class != obj.getClass()) {
            return false;
        }
        C10344s0 c10344s0 = (C10344s0) obj;
        if (this.f27056j == c10344s0.f27056j && Arrays.equals(this.f27057k, c10344s0.f27057k)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (this.f27058l == 0) {
            this.f27058l = 527 + Arrays.hashCode(this.f27057k);
        }
        return this.f27058l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f27056j);
        for (int i2 = 0; i2 < this.f27056j; i2++) {
            parcel.writeParcelable(this.f27057k[i2], 0);
        }
    }

    C10344s0(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f27056j = readInt;
        this.f27057k = new Format[readInt];
        for (int i = 0; i < this.f27056j; i++) {
            this.f27057k[i] = (Format) parcel.readParcelable(Format.class.getClassLoader());
        }
    }
}