package p173j7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import gb.AbstractC6675n;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p060d7.C5774a;
import p102fb.C6377g;
import p173j7.C8858c;
import p195k8.C9149a;
import p195k8.C9191p0;

/* renamed from: j7.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8858c implements Metadata.InterfaceC4429b {
    public static final Parcelable.Creator<C8858c> CREATOR = new C8859a();

    /* renamed from: j */
    public final List<C8860b> f23237j;

    /* renamed from: j7.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C8859a implements Parcelable.Creator<C8858c> {
        C8859a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C8858c createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, C8860b.class.getClassLoader());
            return new C8858c(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C8858c[] newArray(int i) {
            return new C8858c[i];
        }
    }

    /* renamed from: j7.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C8860b implements Parcelable {

        /* renamed from: j */
        public final long f23239j;

        /* renamed from: k */
        public final long f23240k;

        /* renamed from: l */
        public final int f23241l;

        /* renamed from: m */
        public static final Comparator<C8860b> f23238m = new Comparator() { // from class: j7.d
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m17152b;
                m17152b = C8858c.C8860b.m17152b((C8858c.C8860b) obj, (C8858c.C8860b) obj2);
                return m17152b;
            }
        };
        public static final Parcelable.Creator<C8860b> CREATOR = new C8861a();

        /* renamed from: j7.c$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        class C8861a implements Parcelable.Creator<C8860b> {
            C8861a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C8860b createFromParcel(Parcel parcel) {
                return new C8860b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C8860b[] newArray(int i) {
                return new C8860b[i];
            }
        }

        public C8860b(long j, long j2, int i) {
            boolean z;
            if (j < j2) {
                z = true;
            } else {
                z = false;
            }
            C9149a.m16452a(z);
            this.f23239j = j;
            this.f23240k = j2;
            this.f23241l = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static /* synthetic */ int m17152b(C8860b c8860b, C8860b c8860b2) {
            return AbstractC6675n.m22167j().mo22164e(c8860b.f23239j, c8860b2.f23239j).mo22164e(c8860b.f23240k, c8860b2.f23240k).mo22165d(c8860b.f23241l, c8860b2.f23241l).mo22160i();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C8860b.class != obj.getClass()) {
                return false;
            }
            C8860b c8860b = (C8860b) obj;
            if (this.f23239j == c8860b.f23239j && this.f23240k == c8860b.f23240k && this.f23241l == c8860b.f23241l) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return C6377g.m22844b(Long.valueOf(this.f23239j), Long.valueOf(this.f23240k), Integer.valueOf(this.f23241l));
        }

        public String toString() {
            return C9191p0.m16307D("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f23239j), Long.valueOf(this.f23240k), Integer.valueOf(this.f23241l));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f23239j);
            parcel.writeLong(this.f23240k);
            parcel.writeInt(this.f23241l);
        }
    }

    public C8858c(List<C8860b> list) {
        this.f23237j = list;
        C9149a.m16452a(!m17156a(list));
    }

    /* renamed from: a */
    private static boolean m17156a(List<C8860b> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = list.get(0).f23240k;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).f23239j < j) {
                return true;
            }
            j = list.get(i).f23240k;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.InterfaceC4429b
    /* renamed from: R */
    public /* synthetic */ byte[] mo6157R() {
        return C5774a.m24522a(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C8858c.class == obj.getClass()) {
            return this.f23237j.equals(((C8858c) obj).f23237j);
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.InterfaceC4429b
    /* renamed from: g */
    public /* synthetic */ Format mo6156g() {
        return C5774a.m24521b(this);
    }

    public int hashCode() {
        return this.f23237j.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f23237j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f23237j);
    }
}
