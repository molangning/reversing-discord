package p152i7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p195k8.C9191p0;

/* renamed from: i7.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7416c extends AbstractC7428i {
    public static final Parcelable.Creator<C7416c> CREATOR = new C7417a();

    /* renamed from: k */
    public final String f19938k;

    /* renamed from: l */
    public final int f19939l;

    /* renamed from: m */
    public final int f19940m;

    /* renamed from: n */
    public final long f19941n;

    /* renamed from: o */
    public final long f19942o;

    /* renamed from: p */
    private final AbstractC7428i[] f19943p;

    /* renamed from: i7.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C7417a implements Parcelable.Creator<C7416c> {
        C7417a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C7416c createFromParcel(Parcel parcel) {
            return new C7416c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C7416c[] newArray(int i) {
            return new C7416c[i];
        }
    }

    public C7416c(String str, int i, int i2, long j, long j2, AbstractC7428i[] abstractC7428iArr) {
        super("CHAP");
        this.f19938k = str;
        this.f19939l = i;
        this.f19940m = i2;
        this.f19941n = j;
        this.f19942o = j2;
        this.f19943p = abstractC7428iArr;
    }

    @Override // p152i7.AbstractC7428i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7416c.class != obj.getClass()) {
            return false;
        }
        C7416c c7416c = (C7416c) obj;
        if (this.f19939l == c7416c.f19939l && this.f19940m == c7416c.f19940m && this.f19941n == c7416c.f19941n && this.f19942o == c7416c.f19942o && C9191p0.m16257c(this.f19938k, c7416c.f19938k) && Arrays.equals(this.f19943p, c7416c.f19943p)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2 = (((((((527 + this.f19939l) * 31) + this.f19940m) * 31) + ((int) this.f19941n)) * 31) + ((int) this.f19942o)) * 31;
        String str = this.f19938k;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f19938k);
        parcel.writeInt(this.f19939l);
        parcel.writeInt(this.f19940m);
        parcel.writeLong(this.f19941n);
        parcel.writeLong(this.f19942o);
        parcel.writeInt(this.f19943p.length);
        for (AbstractC7428i abstractC7428i : this.f19943p) {
            parcel.writeParcelable(abstractC7428i, 0);
        }
    }

    C7416c(Parcel parcel) {
        super("CHAP");
        this.f19938k = (String) C9191p0.m16243j(parcel.readString());
        this.f19939l = parcel.readInt();
        this.f19940m = parcel.readInt();
        this.f19941n = parcel.readLong();
        this.f19942o = parcel.readLong();
        int readInt = parcel.readInt();
        this.f19943p = new AbstractC7428i[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f19943p[i] = (AbstractC7428i) parcel.readParcelable(AbstractC7428i.class.getClassLoader());
        }
    }
}