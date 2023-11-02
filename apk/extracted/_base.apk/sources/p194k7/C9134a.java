package p194k7;

import android.os.Parcel;
import android.os.Parcelable;
import p195k8.C9191p0;
import p195k8.C9208y;

/* renamed from: k7.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9134a extends AbstractC9136b {
    public static final Parcelable.Creator<C9134a> CREATOR = new C9135a();

    /* renamed from: j */
    public final long f24063j;

    /* renamed from: k */
    public final long f24064k;

    /* renamed from: l */
    public final byte[] f24065l;

    /* renamed from: k7.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C9135a implements Parcelable.Creator<C9134a> {
        C9135a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C9134a createFromParcel(Parcel parcel) {
            return new C9134a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C9134a[] newArray(int i) {
            return new C9134a[i];
        }
    }

    /* synthetic */ C9134a(Parcel parcel, C9135a c9135a) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C9134a m16480a(C9208y c9208y, int i, long j) {
        long m16109F = c9208y.m16109F();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        c9208y.m16088j(bArr, 0, i2);
        return new C9134a(m16109F, bArr, j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f24063j);
        parcel.writeLong(this.f24064k);
        parcel.writeByteArray(this.f24065l);
    }

    private C9134a(long j, byte[] bArr, long j2) {
        this.f24063j = j2;
        this.f24064k = j;
        this.f24065l = bArr;
    }

    private C9134a(Parcel parcel) {
        this.f24063j = parcel.readLong();
        this.f24064k = parcel.readLong();
        this.f24065l = (byte[]) C9191p0.m16243j(parcel.createByteArray());
    }
}
