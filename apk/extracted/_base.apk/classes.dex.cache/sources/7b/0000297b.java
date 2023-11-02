package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import java.util.List;
import p195k8.C9191p0;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new C4428a();

    /* renamed from: j */
    private final InterfaceC4429b[] f11658j;

    /* renamed from: com.google.android.exoplayer2.metadata.Metadata$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4428a implements Parcelable.Creator<Metadata> {
        C4428a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Metadata[] newArray(int i) {
            return new Metadata[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.Metadata$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4429b extends Parcelable {
        /* renamed from: R */
        byte[] mo6157R();

        /* renamed from: g */
        Format mo6156g();
    }

    public Metadata(InterfaceC4429b... interfaceC4429bArr) {
        this.f11658j = interfaceC4429bArr;
    }

    /* renamed from: a */
    public Metadata m29250a(InterfaceC4429b... interfaceC4429bArr) {
        if (interfaceC4429bArr.length == 0) {
            return this;
        }
        return new Metadata((InterfaceC4429b[]) C9191p0.m16312A0(this.f11658j, interfaceC4429bArr));
    }

    /* renamed from: b */
    public Metadata m29249b(Metadata metadata) {
        return metadata == null ? this : m29250a(metadata.f11658j);
    }

    /* renamed from: d */
    public InterfaceC4429b m29248d(int i) {
        return this.f11658j[i];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int m29247e() {
        return this.f11658j.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Metadata.class == obj.getClass()) {
            return Arrays.equals(this.f11658j, ((Metadata) obj).f11658j);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f11658j);
    }

    public String toString() {
        return "entries=" + Arrays.toString(this.f11658j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f11658j.length);
        for (InterfaceC4429b interfaceC4429b : this.f11658j) {
            parcel.writeParcelable(interfaceC4429b, 0);
        }
    }

    public Metadata(List<? extends InterfaceC4429b> list) {
        this.f11658j = (InterfaceC4429b[]) list.toArray(new InterfaceC4429b[0]);
    }

    Metadata(Parcel parcel) {
        this.f11658j = new InterfaceC4429b[parcel.readInt()];
        int i = 0;
        while (true) {
            InterfaceC4429b[] interfaceC4429bArr = this.f11658j;
            if (i >= interfaceC4429bArr.length) {
                return;
            }
            interfaceC4429bArr[i] = (InterfaceC4429b) parcel.readParcelable(InterfaceC4429b.class.getClassLoader());
            i++;
        }
    }
}