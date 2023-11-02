package p194k7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p195k8.C9208y;

/* renamed from: k7.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C9143f extends AbstractC9136b {
    public static final Parcelable.Creator<C9143f> CREATOR = new C9144a();

    /* renamed from: j */
    public final List<C9146c> f24085j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k7.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C9144a implements Parcelable.Creator<C9143f> {
        C9144a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C9143f createFromParcel(Parcel parcel) {
            return new C9143f(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C9143f[] newArray(int i) {
            return new C9143f[i];
        }
    }

    /* renamed from: k7.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9145b {

        /* renamed from: a */
        public final int f24086a;

        /* renamed from: b */
        public final long f24087b;

        /* synthetic */ C9145b(int i, long j, C9144a c9144a) {
            this(i, j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public static C9145b m16464c(Parcel parcel) {
            return new C9145b(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public void m16463d(Parcel parcel) {
            parcel.writeInt(this.f24086a);
            parcel.writeLong(this.f24087b);
        }

        private C9145b(int i, long j) {
            this.f24086a = i;
            this.f24087b = j;
        }
    }

    /* synthetic */ C9143f(Parcel parcel, C9144a c9144a) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C9143f m16469a(C9208y c9208y) {
        int m16111D = c9208y.m16111D();
        ArrayList arrayList = new ArrayList(m16111D);
        for (int i = 0; i < m16111D; i++) {
            arrayList.add(C9146c.m16458e(c9208y));
        }
        return new C9143f(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int size = this.f24085j.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f24085j.get(i2).m16457f(parcel);
        }
    }

    private C9143f(List<C9146c> list) {
        this.f24085j = Collections.unmodifiableList(list);
    }

    private C9143f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C9146c.m16459d(parcel));
        }
        this.f24085j = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: k7.f$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9146c {

        /* renamed from: a */
        public final long f24088a;

        /* renamed from: b */
        public final boolean f24089b;

        /* renamed from: c */
        public final boolean f24090c;

        /* renamed from: d */
        public final boolean f24091d;

        /* renamed from: e */
        public final long f24092e;

        /* renamed from: f */
        public final List<C9145b> f24093f;

        /* renamed from: g */
        public final boolean f24094g;

        /* renamed from: h */
        public final long f24095h;

        /* renamed from: i */
        public final int f24096i;

        /* renamed from: j */
        public final int f24097j;

        /* renamed from: k */
        public final int f24098k;

        private C9146c(long j, boolean z, boolean z2, boolean z3, List<C9145b> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f24088a = j;
            this.f24089b = z;
            this.f24090c = z2;
            this.f24091d = z3;
            this.f24093f = Collections.unmodifiableList(list);
            this.f24092e = j2;
            this.f24094g = z4;
            this.f24095h = j3;
            this.f24096i = i;
            this.f24097j = i2;
            this.f24098k = i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static C9146c m16459d(Parcel parcel) {
            return new C9146c(parcel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static C9146c m16458e(C9208y c9208y) {
            boolean z;
            ArrayList arrayList;
            boolean z2;
            long j;
            boolean z3;
            long j2;
            int i;
            int i2;
            int i3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            long j3;
            boolean z8;
            long j4;
            boolean z9;
            long m16109F = c9208y.m16109F();
            if ((c9208y.m16111D() & 128) != 0) {
                z = true;
            } else {
                z = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (!z) {
                int m16111D = c9208y.m16111D();
                if ((m16111D & 128) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if ((m16111D & 64) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if ((m16111D & 32) != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z6) {
                    j3 = c9208y.m16109F();
                } else {
                    j3 = -9223372036854775807L;
                }
                if (!z6) {
                    int m16111D2 = c9208y.m16111D();
                    ArrayList arrayList3 = new ArrayList(m16111D2);
                    for (int i4 = 0; i4 < m16111D2; i4++) {
                        arrayList3.add(new C9145b(c9208y.m16111D(), c9208y.m16109F(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z7) {
                    long m16111D3 = c9208y.m16111D();
                    if ((128 & m16111D3) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    j4 = ((((m16111D3 & 1) << 32) | c9208y.m16109F()) * 1000) / 90;
                    z8 = z9;
                } else {
                    z8 = false;
                    j4 = -9223372036854775807L;
                }
                int m16105J = c9208y.m16105J();
                int m16111D4 = c9208y.m16111D();
                z4 = z6;
                i3 = c9208y.m16111D();
                j2 = j4;
                arrayList = arrayList2;
                long j5 = j3;
                i = m16105J;
                i2 = m16111D4;
                j = j5;
                boolean z10 = z5;
                z3 = z8;
                z2 = z10;
            } else {
                arrayList = arrayList2;
                z2 = false;
                j = -9223372036854775807L;
                z3 = false;
                j2 = -9223372036854775807L;
                i = 0;
                i2 = 0;
                i3 = 0;
                z4 = false;
            }
            return new C9146c(m16109F, z, z2, z4, arrayList, j, z3, j2, i, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m16457f(Parcel parcel) {
            parcel.writeLong(this.f24088a);
            parcel.writeByte(this.f24089b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f24090c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f24091d ? (byte) 1 : (byte) 0);
            int size = this.f24093f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                this.f24093f.get(i).m16463d(parcel);
            }
            parcel.writeLong(this.f24092e);
            parcel.writeByte(this.f24094g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f24095h);
            parcel.writeInt(this.f24096i);
            parcel.writeInt(this.f24097j);
            parcel.writeInt(this.f24098k);
        }

        private C9146c(Parcel parcel) {
            this.f24088a = parcel.readLong();
            this.f24089b = parcel.readByte() == 1;
            this.f24090c = parcel.readByte() == 1;
            this.f24091d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(C9145b.m16464c(parcel));
            }
            this.f24093f = Collections.unmodifiableList(arrayList);
            this.f24092e = parcel.readLong();
            this.f24094g = parcel.readByte() == 1;
            this.f24095h = parcel.readLong();
            this.f24096i = parcel.readInt();
            this.f24097j = parcel.readInt();
            this.f24098k = parcel.readInt();
        }
    }
}
