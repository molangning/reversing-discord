package p152i7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p195k8.C9191p0;

/* renamed from: i7.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7414b extends AbstractC7428i {
    public static final Parcelable.Creator<C7414b> CREATOR = new C7415a();

    /* renamed from: k */
    public final byte[] f19937k;

    /* renamed from: i7.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C7415a implements Parcelable.Creator<C7414b> {
        C7415a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C7414b createFromParcel(Parcel parcel) {
            return new C7414b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C7414b[] newArray(int i) {
            return new C7414b[i];
        }
    }

    public C7414b(String str, byte[] bArr) {
        super(str);
        this.f19937k = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7414b.class != obj.getClass()) {
            return false;
        }
        C7414b c7414b = (C7414b) obj;
        if (this.f19961j.equals(c7414b.f19961j) && Arrays.equals(this.f19937k, c7414b.f19937k)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f19961j.hashCode()) * 31) + Arrays.hashCode(this.f19937k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19961j);
        parcel.writeByteArray(this.f19937k);
    }

    C7414b(Parcel parcel) {
        super((String) C9191p0.m16243j(parcel.readString()));
        this.f19937k = (byte[]) C9191p0.m16243j(parcel.createByteArray());
    }
}
