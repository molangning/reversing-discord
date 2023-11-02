package p194k7;

import android.os.Parcel;
import android.os.Parcelable;
import p195k8.C9183l0;
import p195k8.C9208y;

/* renamed from: k7.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9147g extends AbstractC9136b {
    public static final Parcelable.Creator<C9147g> CREATOR = new C9148a();

    /* renamed from: j */
    public final long f24099j;

    /* renamed from: k */
    public final long f24100k;

    /* renamed from: k7.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C9148a implements Parcelable.Creator<C9147g> {
        C9148a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C9147g createFromParcel(Parcel parcel) {
            return new C9147g(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C9147g[] newArray(int i) {
            return new C9147g[i];
        }
    }

    /* synthetic */ C9147g(long j, long j2, C9148a c9148a) {
        this(j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C9147g m16456a(C9208y c9208y, long j, C9183l0 c9183l0) {
        long m16455b = m16455b(c9208y, j);
        return new C9147g(m16455b, c9183l0.m16345b(m16455b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static long m16455b(C9208y c9208y, long j) {
        long m16111D = c9208y.m16111D();
        if ((128 & m16111D) != 0) {
            return 8589934591L & ((((m16111D & 1) << 32) | c9208y.m16109F()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f24099j);
        parcel.writeLong(this.f24100k);
    }

    private C9147g(long j, long j2) {
        this.f24099j = j;
        this.f24100k = j2;
    }
}
