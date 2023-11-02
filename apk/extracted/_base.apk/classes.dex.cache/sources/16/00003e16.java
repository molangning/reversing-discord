package p194k7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p195k8.C9183l0;
import p195k8.C9208y;

/* renamed from: k7.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9138d extends AbstractC9136b {
    public static final Parcelable.Creator<C9138d> CREATOR = new C9139a();

    /* renamed from: j */
    public final long f24069j;

    /* renamed from: k */
    public final boolean f24070k;

    /* renamed from: l */
    public final boolean f24071l;

    /* renamed from: m */
    public final boolean f24072m;

    /* renamed from: n */
    public final boolean f24073n;

    /* renamed from: o */
    public final long f24074o;

    /* renamed from: p */
    public final long f24075p;

    /* renamed from: q */
    public final List<C9140b> f24076q;

    /* renamed from: r */
    public final boolean f24077r;

    /* renamed from: s */
    public final long f24078s;

    /* renamed from: t */
    public final int f24079t;

    /* renamed from: u */
    public final int f24080u;

    /* renamed from: v */
    public final int f24081v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k7.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C9139a implements Parcelable.Creator<C9138d> {
        C9139a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C9138d createFromParcel(Parcel parcel) {
            return new C9138d(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C9138d[] newArray(int i) {
            return new C9138d[i];
        }
    }

    /* renamed from: k7.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9140b {

        /* renamed from: a */
        public final int f24082a;

        /* renamed from: b */
        public final long f24083b;

        /* renamed from: c */
        public final long f24084c;

        /* synthetic */ C9140b(int i, long j, long j2, C9139a c9139a) {
            this(i, j, j2);
        }

        /* renamed from: a */
        public static C9140b m16473a(Parcel parcel) {
            return new C9140b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        /* renamed from: b */
        public void m16472b(Parcel parcel) {
            parcel.writeInt(this.f24082a);
            parcel.writeLong(this.f24083b);
            parcel.writeLong(this.f24084c);
        }

        private C9140b(int i, long j, long j2) {
            this.f24082a = i;
            this.f24083b = j;
            this.f24084c = j2;
        }
    }

    /* synthetic */ C9138d(Parcel parcel, C9139a c9139a) {
        this(parcel);
    }

    /* renamed from: a */
    public static C9138d m16476a(C9208y c9208y, long j, C9183l0 c9183l0) {
        boolean z;
        List list;
        boolean z2;
        boolean z3;
        long j2;
        boolean z4;
        long j3;
        int i;
        int i2;
        int i3;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        long j4;
        boolean z10;
        long j5;
        boolean z11;
        long j6;
        long m16109F = c9208y.m16109F();
        if ((c9208y.m16111D() & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        List emptyList = Collections.emptyList();
        if (!z) {
            int m16111D = c9208y.m16111D();
            if ((m16111D & 128) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if ((m16111D & 64) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if ((m16111D & 32) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((m16111D & 16) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z7 && !z9) {
                j4 = C9147g.m16455b(c9208y, j);
            } else {
                j4 = -9223372036854775807L;
            }
            if (!z7) {
                int m16111D2 = c9208y.m16111D();
                ArrayList arrayList = new ArrayList(m16111D2);
                for (int i4 = 0; i4 < m16111D2; i4++) {
                    int m16111D3 = c9208y.m16111D();
                    if (!z9) {
                        j6 = C9147g.m16455b(c9208y, j);
                    } else {
                        j6 = -9223372036854775807L;
                    }
                    arrayList.add(new C9140b(m16111D3, j6, c9183l0.m16345b(j6), null));
                }
                emptyList = arrayList;
            }
            if (z8) {
                long m16111D4 = c9208y.m16111D();
                if ((128 & m16111D4) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j5 = ((((m16111D4 & 1) << 32) | c9208y.m16109F()) * 1000) / 90;
                z10 = z11;
            } else {
                z10 = false;
                j5 = -9223372036854775807L;
            }
            i = c9208y.m16105J();
            z5 = z7;
            i2 = c9208y.m16111D();
            i3 = c9208y.m16111D();
            list = emptyList;
            long j7 = j4;
            z4 = z10;
            j3 = j5;
            z3 = z9;
            z2 = z6;
            j2 = j7;
        } else {
            list = emptyList;
            z2 = false;
            z3 = false;
            j2 = -9223372036854775807L;
            z4 = false;
            j3 = -9223372036854775807L;
            i = 0;
            i2 = 0;
            i3 = 0;
            z5 = false;
        }
        return new C9138d(m16109F, z, z2, z5, z3, j2, c9183l0.m16345b(j2), list, z4, j3, i, i2, i3);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f24069j);
        parcel.writeByte(this.f24070k ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f24071l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f24072m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f24073n ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f24074o);
        parcel.writeLong(this.f24075p);
        int size = this.f24076q.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f24076q.get(i2).m16472b(parcel);
        }
        parcel.writeByte(this.f24077r ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f24078s);
        parcel.writeInt(this.f24079t);
        parcel.writeInt(this.f24080u);
        parcel.writeInt(this.f24081v);
    }

    private C9138d(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<C9140b> list, boolean z5, long j4, int i, int i2, int i3) {
        this.f24069j = j;
        this.f24070k = z;
        this.f24071l = z2;
        this.f24072m = z3;
        this.f24073n = z4;
        this.f24074o = j2;
        this.f24075p = j3;
        this.f24076q = Collections.unmodifiableList(list);
        this.f24077r = z5;
        this.f24078s = j4;
        this.f24079t = i;
        this.f24080u = i2;
        this.f24081v = i3;
    }

    private C9138d(Parcel parcel) {
        this.f24069j = parcel.readLong();
        this.f24070k = parcel.readByte() == 1;
        this.f24071l = parcel.readByte() == 1;
        this.f24072m = parcel.readByte() == 1;
        this.f24073n = parcel.readByte() == 1;
        this.f24074o = parcel.readLong();
        this.f24075p = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C9140b.m16473a(parcel));
        }
        this.f24076q = Collections.unmodifiableList(arrayList);
        this.f24077r = parcel.readByte() == 1;
        this.f24078s = parcel.readLong();
        this.f24079t = parcel.readInt();
        this.f24080u = parcel.readInt();
        this.f24081v = parcel.readInt();
    }
}