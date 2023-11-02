package p259o6;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import p151i6.C7390b;
import p195k8.C9149a;
import p195k8.C9191p0;

/* renamed from: o6.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C11028l implements Comparator<C11030b>, Parcelable {
    public static final Parcelable.Creator<C11028l> CREATOR = new C11029a();

    /* renamed from: j */
    private final C11030b[] f28886j;

    /* renamed from: k */
    private int f28887k;

    /* renamed from: l */
    public final String f28888l;

    /* renamed from: m */
    public final int f28889m;

    /* renamed from: o6.l$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C11029a implements Parcelable.Creator<C11028l> {
        C11029a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C11028l createFromParcel(Parcel parcel) {
            return new C11028l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C11028l[] newArray(int i) {
            return new C11028l[i];
        }
    }

    /* renamed from: o6.l$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C11030b implements Parcelable {
        public static final Parcelable.Creator<C11030b> CREATOR = new C11031a();

        /* renamed from: j */
        private int f28890j;

        /* renamed from: k */
        public final UUID f28891k;

        /* renamed from: l */
        public final String f28892l;

        /* renamed from: m */
        public final String f28893m;

        /* renamed from: n */
        public final byte[] f28894n;

        /* renamed from: o6.l$b$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        class C11031a implements Parcelable.Creator<C11030b> {
            C11031a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C11030b createFromParcel(Parcel parcel) {
                return new C11030b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C11030b[] newArray(int i) {
                return new C11030b[i];
            }
        }

        public C11030b(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        /* renamed from: a */
        public boolean m9313a(C11030b c11030b) {
            return m9311d() && !c11030b.m9311d() && m9310e(c11030b.f28891k);
        }

        /* renamed from: b */
        public C11030b m9312b(byte[] bArr) {
            return new C11030b(this.f28891k, this.f28892l, this.f28893m, bArr);
        }

        /* renamed from: d */
        public boolean m9311d() {
            return this.f28894n != null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public boolean m9310e(UUID uuid) {
            return C7390b.f19878a.equals(this.f28891k) || uuid.equals(this.f28891k);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C11030b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            C11030b c11030b = (C11030b) obj;
            if (!C9191p0.m16257c(this.f28892l, c11030b.f28892l) || !C9191p0.m16257c(this.f28893m, c11030b.f28893m) || !C9191p0.m16257c(this.f28891k, c11030b.f28891k) || !Arrays.equals(this.f28894n, c11030b.f28894n)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode;
            if (this.f28890j == 0) {
                int hashCode2 = this.f28891k.hashCode() * 31;
                String str = this.f28892l;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                this.f28890j = ((((hashCode2 + hashCode) * 31) + this.f28893m.hashCode()) * 31) + Arrays.hashCode(this.f28894n);
            }
            return this.f28890j;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f28891k.getMostSignificantBits());
            parcel.writeLong(this.f28891k.getLeastSignificantBits());
            parcel.writeString(this.f28892l);
            parcel.writeString(this.f28893m);
            parcel.writeByteArray(this.f28894n);
        }

        public C11030b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f28891k = (UUID) C9149a.m16448e(uuid);
            this.f28892l = str;
            this.f28893m = (String) C9149a.m16448e(str2);
            this.f28894n = bArr;
        }

        C11030b(Parcel parcel) {
            this.f28891k = new UUID(parcel.readLong(), parcel.readLong());
            this.f28892l = parcel.readString();
            this.f28893m = (String) C9191p0.m16243j(parcel.readString());
            this.f28894n = parcel.createByteArray();
        }
    }

    public C11028l(List<C11030b> list) {
        this(null, false, (C11030b[]) list.toArray(new C11030b[0]));
    }

    /* renamed from: j */
    private static boolean m9319j(ArrayList<C11030b> arrayList, int i, UUID uuid) {
        for (int i2 = 0; i2 < i; i2++) {
            if (arrayList.get(i2).f28891k.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: x */
    public static C11028l m9317x(C11028l c11028l, C11028l c11028l2) {
        String str;
        C11030b[] c11030bArr;
        C11030b[] c11030bArr2;
        ArrayList arrayList = new ArrayList();
        if (c11028l != null) {
            str = c11028l.f28888l;
            for (C11030b c11030b : c11028l.f28886j) {
                if (c11030b.m9311d()) {
                    arrayList.add(c11030b);
                }
            }
        } else {
            str = null;
        }
        if (c11028l2 != null) {
            if (str == null) {
                str = c11028l2.f28888l;
            }
            int size = arrayList.size();
            for (C11030b c11030b2 : c11028l2.f28886j) {
                if (c11030b2.m9311d() && !m9319j(arrayList, size, c11030b2.f28891k)) {
                    arrayList.add(c11030b2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new C11028l(str, arrayList);
    }

    /* renamed from: O */
    public C11028l m9321O(C11028l c11028l) {
        boolean z;
        String str;
        String str2 = this.f28888l;
        if (str2 != null && (str = c11028l.f28888l) != null && !TextUtils.equals(str2, str)) {
            z = false;
        } else {
            z = true;
        }
        C9149a.m16447f(z);
        String str3 = this.f28888l;
        if (str3 == null) {
            str3 = c11028l.f28888l;
        }
        return new C11028l(str3, (C11030b[]) C9191p0.m16312A0(this.f28886j, c11028l.f28886j));
    }

    @Override // java.util.Comparator
    /* renamed from: b */
    public int compare(C11030b c11030b, C11030b c11030b2) {
        UUID uuid = C7390b.f19878a;
        if (uuid.equals(c11030b.f28891k)) {
            if (uuid.equals(c11030b2.f28891k)) {
                return 0;
            }
            return 1;
        }
        return c11030b.f28891k.compareTo(c11030b2.f28891k);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C11028l.class != obj.getClass()) {
            return false;
        }
        C11028l c11028l = (C11028l) obj;
        if (C9191p0.m16257c(this.f28888l, c11028l.f28888l) && Arrays.equals(this.f28886j, c11028l.f28886j)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        if (this.f28887k == 0) {
            String str = this.f28888l;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f28887k = (hashCode * 31) + Arrays.hashCode(this.f28886j);
        }
        return this.f28887k;
    }

    /* renamed from: u */
    public C11028l m9318u(String str) {
        if (C9191p0.m16257c(this.f28888l, str)) {
            return this;
        }
        return new C11028l(str, false, this.f28886j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f28888l);
        parcel.writeTypedArray(this.f28886j, 0);
    }

    /* renamed from: y */
    public C11030b m9316y(int i) {
        return this.f28886j[i];
    }

    public C11028l(String str, List<C11030b> list) {
        this(str, false, (C11030b[]) list.toArray(new C11030b[0]));
    }

    public C11028l(C11030b... c11030bArr) {
        this((String) null, c11030bArr);
    }

    public C11028l(String str, C11030b... c11030bArr) {
        this(str, true, c11030bArr);
    }

    private C11028l(String str, boolean z, C11030b... c11030bArr) {
        this.f28888l = str;
        c11030bArr = z ? (C11030b[]) c11030bArr.clone() : c11030bArr;
        this.f28886j = c11030bArr;
        this.f28889m = c11030bArr.length;
        Arrays.sort(c11030bArr, this);
    }

    C11028l(Parcel parcel) {
        this.f28888l = parcel.readString();
        C11030b[] c11030bArr = (C11030b[]) C9191p0.m16243j((C11030b[]) parcel.createTypedArray(C11030b.CREATOR));
        this.f28886j = c11030bArr;
        this.f28889m = c11030bArr.length;
    }
}
